package com.itheima;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 张立业
 * @version 1.0
 */
@WebServlet(urlPatterns = "/request")
public class RequestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1.获取请求方式
        String method = req.getMethod();
        System.out.println("method = " + method);
        //2.获取请求路径
        String requestURI = req.getRequestURI();
        StringBuffer requestURL = req.getRequestURL();
        System.out.println("requestURI = " + requestURI);
        System.out.println("requestURL = " + requestURL);
        //3.获取协议
        String scheme = req.getScheme();
        System.out.println("scheme = " + scheme);
        //4.获取请求头（Host）
        String header = req.getHeader("Host");
        System.out.println("header = " + header);
        //5.获取请求参数
        String parameter = req.getParameter("name");
        System.out.println("parameter = " + parameter);
        //6.获取所有的查询参数
        String queryString = req.getQueryString();
        System.out.println("queryString = " + queryString);
    }
}
