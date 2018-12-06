package com.lms.learn.web;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * RestController注解:将自动返回json格式字符串到页面
 */
@Controller
public class FirstController {
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String welcome(){
        //return "hi welcome to study spring-boot";
        //监听器的使用:
        //SpringApplication app = new SpringApplication(LearnApplication.class);
        //关闭banner
        //app.setBannerMode(Banner.Mode.OFF);
        //注册监听器
        //app.addListeners(new MyListenerTwo());
        //System.out.println("热加载没有生效!");
        //System.out.println("------88888-------");
        //Repository
        return "index";
    }

    /**
     * Spring MVC可以通过查看请求路径并将它匹配到应用程序中定义的映射
     * （例如@GetMapping Controller方法上的注释），
     * 将传入的HTTP请求映射到处理程序
     * @return
     */
    @GetMapping("/user/msg.do")
    public String getUserInfo(){
        return "user/admin";
    }

    @RequestMapping("/info")
    public String personInfo(){
        String reload = reload();
        System.out.println(reload);
        checkMsg();
        check();
        return "user/admin";
    }
    public String reload(){
        System.out.println("判定是否重启!");
        return "1";
    }
    public void check(){
        System.out.println("----------");
    }

    public void checkMsg(){
        System.out.println("在测试下");
    }
}
