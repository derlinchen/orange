package com.orange.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.orange.bean.User;

@RestController
public class OrangeController {
	
	/**
	 * 正常匹配
	 * @param id
	 */
	@GetMapping("/get/{id}")
	public void get(@PathVariable("id") String id){
		System.out.println(id);
	}
	
	/**
	 * 匹配符合正则表达式的
	 * @param id
	 */
	@GetMapping("/getmatch/{id:\\d+}")
    public void getmatch(@PathVariable("id") String id){
		System.out.println(id);
    }
	
	
	@PutMapping("/put")
    public void put(@RequestBody User user){
        System.out.println(user.getId());
    }
	
	@PostMapping("/post")
	public void post(@RequestBody User user){
		System.out.println(user.getId());
	}
	
	@DeleteMapping("/delete")
	public void delete(@RequestBody User user) {
		System.out.println(user.getId());
	}
	
}
