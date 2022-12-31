package com.lzj_seckill.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lzj_seckill.exception.GlobalException;
import com.lzj_seckill.mapper.UserMapper;
import com.lzj_seckill.pojo.User;
import com.lzj_seckill.service.IUserService;
import com.lzj_seckill.util.CookieUtil;
import com.lzj_seckill.util.MD5Util;
import com.lzj_seckill.util.UUIDUtil;
import com.lzj_seckill.vo.LoginVo;
import com.lzj_seckill.vo.RespBean;
import com.lzj_seckill.vo.RespBeanEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author feng
 * @since 2022-12-31
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
    @Autowired
    private UserMapper userMapper;

    /**
     * 登录
     *
     * @param loginVo
     * @param request
     * @param response
     * @return
     */
    @Override
    public RespBean doLogin(LoginVo loginVo, HttpServletRequest request, HttpServletResponse response) {
        String mobile = loginVo.getMobile();
        String password = loginVo.getPassword();

        // //参数校验
        // if (StringUtils.isEmpty(mobile) || StringUtils.isEmpty(password)) {
        //     return RespBean.error(RespBeanEnum.LOGIN_ERROR);
        // }
        // if (!ValidatorUtil.isMobile(mobile)) {
        //     return RespBean.error(RespBeanEnum.MOBILE_ERROR);
        // }

        //根据手机号获取用户
        User user = userMapper.selectById(mobile);
        if (user == null) {
            // return RespBean.error(RespBeanEnum.LOGIN_ERROR);
            throw new GlobalException(RespBeanEnum.LOGIN_ERROR);
        }
        //校验密码
        if (!MD5Util.formPassToDBPass(password, user.getSalt()).equals(user.getPassword())) {
            // return RespBean.error(RespBeanEnum.LOGIN_ERROR);
            throw new GlobalException(RespBeanEnum.LOGIN_ERROR);
        }
        //生成cookie
        String ticket = UUIDUtil.uuid();
        request.getSession().setAttribute(ticket, user);
        CookieUtil.setCookie(request, response, "userTicket", ticket);
        return RespBean.success(RespBeanEnum.SUCCESS);
    }
}
