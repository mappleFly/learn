package com.lms.learn.util;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.ServletContextRequestLoggingFilter;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * springMVC配置
 */
@Configuration
public class SpringWebConfigure extends WebMvcConfigurerAdapter {

    /**
     * 手动指定映射路径mvc
     * @Bean注册监听器
     * @return
     */
    @Bean
    public InternalResourceViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/");
        viewResolver.setSuffix(".jsp");
        //System.out.println("cccc");
        return viewResolver;
    }

    /**
     * mvc拦截器设置
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //过滤拦截 参数一:拦截所有请求，参数二:排除拦截的请求
        registry.addInterceptor(new ToolInterceptor()).addPathPatterns("/**").excludePathPatterns("/login");
        super.addInterceptors(registry);
    }
    /**
     * 静态资源
     * @param registry
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // addResourceHandler指的是访问路径，addResourceLocations指的是文件放置的目录
        registry.addResourceHandler("/**").addResourceLocations("classpath:/static/");
        super.addResourceHandlers(registry);
    }

    //拦截器注册
    @SuppressWarnings({"rawtypes","unchecked"})
    @Bean
    public FilterRegistrationBean filterRegist(){
        FilterRegistrationBean frBean = new FilterRegistrationBean();
        frBean.setFilter(new CustomFilter());
        frBean.addUrlPatterns("/*");
        System.out.println("拦截器被加载");
        return frBean;
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    @Bean
    public ServletListenerRegistrationBean servletRegist(){
        ServletListenerRegistrationBean  srBean = new ServletListenerRegistrationBean ();
        srBean.setListener(new CustomListener());
        System.out.println("Servlet监听器被执行");
        return srBean;
    }

    @Bean
    public void showMsg(){
        System.out.println("========自定义初始化执行==========");
    }

}
