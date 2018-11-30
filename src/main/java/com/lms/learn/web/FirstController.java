package com.lms.learn.web;

import com.lms.learn.LearnApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * RestController注解:将自动返回json格式字符串到页面
 */
@Controller
public class FirstController {
    @RequestMapping("/")
    public String welcome(){
        //return "hi welcome to study spring-boot";
        //监听器的使用:
        //SpringApplication app = new SpringApplication(LearnApplication.class);
        //关闭banner
        //app.setBannerMode(Banner.Mode.OFF);
        //注册监听器
        //app.addListeners(new MyListenerTwo());

        return "index";
    }

    @RequestMapping("/info")
    public String personInfo(){
        return "user/admin";
    }
}
