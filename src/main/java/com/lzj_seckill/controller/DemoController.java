package com.lzj_seckill.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 测试
 * Created by 小冯 on 2022/12/30 21:14
 */
@Controller
@RequestMapping("/demo")
public class DemoController {
    /**
     * 测试页面跳转
     * @param model
     * @return
     */
    @RequestMapping("/hello")
    public String hello(Model model){
        model.addAttribute("name", "xxxx");
        return "hello";
    }
}
