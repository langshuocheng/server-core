package com.mexlang.server.core.controller;
import javax.websocket.server.PathParam;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



/***
 * 爬虫入口
 * @author mexlang
 *
 */

@Controller
@RequestMapping("/search")
public class SpriderController {
	
	    @RequestMapping("/baidu")
	    public String index(String SKey) {
			
			//1.拿到关键词，拼接搜索URL
			//2.发送请求
		    //3.解析返回，放入结果对象ResultEntity中
	    	//4.结果返回页面展示

	    	System.out.println("value : " + SKey);
	        return "index";
	    }
}
