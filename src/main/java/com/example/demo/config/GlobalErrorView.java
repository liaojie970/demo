package com.example.demo.config;

import org.springframework.web.servlet.View;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * 错误页面的默认跳转(例如请求404的时候,默认走这个视图解析器)
 *
 * @author fengshuonan
 * @date 2017-05-21 11:34
 */
public class GlobalErrorView implements View {

    @Override
    public String getContentType() {
        return "text/html";
    }

    @Override
    public void render(Map<String, ?> map, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        httpServletResponse.setCharacterEncoding("utf-8");
        httpServletResponse.setContentType("application/json");
        httpServletResponse.getWriter().write("{code:404,message:'Not found !'}");
    }
}
