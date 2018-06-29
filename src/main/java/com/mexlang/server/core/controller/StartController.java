package com.mexlang.server.core.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



/***
 * 
 * @author mexlang
 *
 */

@Controller
@RequestMapping("/index")
public class StartController {
	
	    @RequestMapping("/")
	    public String index() {
	        return "index";
	    }
}
