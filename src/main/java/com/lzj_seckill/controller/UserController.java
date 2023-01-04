package com.lzj_seckill.controller;


import com.lzj_seckill.pojo.User;
import com.lzj_seckill.vo.RespBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author feng
 * @since 2022-12-31
 */
@Controller
@RequestMapping("/user")
public class UserController {
    /**
     * 用户信息（测试）
     * @param user
     * @return
     */
    @RequestMapping("/info")
    @ResponseBody
    public RespBean info(User user){
        return RespBean.success();
    }
}
