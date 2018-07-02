package com.mexlang.server.core.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



/***
 * 
 * @author mexlang
 *
 */

@Controller
public class StartController {
	
		@RequestMapping("/index")
	    public String index() {
	        return "Search";
	    }
}
