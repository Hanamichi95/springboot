/**
 * 
 */
package com.jr.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author jyh
 *
 */
@Controller
public class IndexController {

	/**
	 * @param args
	 */	
	@GetMapping("/")
	public String index() {
		return "index";
	}
}
