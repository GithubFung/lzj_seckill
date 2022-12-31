package com.lzj_seckill.controller;

import com.lzj_seckill.service.IUserService;
import com.lzj_seckill.vo.LoginVo;
import com.lzj_seckill.vo.RespBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

/**
 * 登录
 * Created by 小冯 on 2022/12/31 15:21
 */
@Controller
@RequestMapping("/login")
//专门输出日志
@Slf4j
public class LoginController {

    @Autowired
    private IUserService userService;
    /**
     * 跳转登录页面
     *
     * @return
     */
    @RequestMapping("/toLogin")
    public String toLogin() {
        return "login";
    }

    /**
     * 登录功能
     *
     * @param loginVo
     * @return
     */
    @RequestMapping("/doLogin")
    @ResponseBody
    //加上@Valid，入参会进行校验
    public RespBean doLogin(@Valid LoginVo loginVo, HttpServletRequest request, HttpServletResponse response) {
        return userService.doLogin(loginVo,request,response);
    }
}
