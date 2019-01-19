package com.mvbug.spider.web;


import com.mvbug.spider.project.wordpress.service.WpTermsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;

@Controller
public class WebController {

    @RequestMapping("/")
    @ResponseBody
    public void index(HttpServletResponse response,String name)  throws Exception {
        response.sendRedirect("https://www.google.com");
    }

}
