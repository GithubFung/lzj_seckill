package com.lzj_seckill.controller;

import com.lzj_seckill.pojo.User;
import com.lzj_seckill.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 小冯 on 2022/12/31 18:52
 */
@Controller
@RequestMapping("/goods")
public class GoodsController {
    @Autowired
    private IUserService userService;


    /**
     * 跳转商品列表页
     *
     * @param request
     * @param response
     * @param model
     * @param ticket
     * @return
     */
    @RequestMapping("/toList")
    public String toList(Model model, User user) {
        // if (StringUtils.isEmpty(ticket)) {
        //     return "login";
        // }
        // // User user = (User) session.getAttribute(ticket);
        // User user = userService.getUserByCookie(ticket, request, response);
        // if (null == user) {
        //     return "login";
        // }
        model.addAttribute("user", user);
        return "goodsList";
    }
}
