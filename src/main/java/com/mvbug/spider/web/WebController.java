package com.mvbug.spider.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.mvbug.spider.project.wordpress.wpPosts.service.IWpPostsService;

import javax.servlet.http.HttpServletResponse;

@Controller
public class WebController {

	
	@Autowired
	private IWpPostsService iwpPostsService;
	
	
	
    @RequestMapping("/")
    @ResponseBody
    public void index(HttpServletResponse response,String name)  throws Exception {
        
//    	System.out.println(JSON.toJSON(iwpPostsService.selectWpPostsById(19L)));
    	
    	response.sendRedirect("https://www.google.com");
        
        
    }

}
