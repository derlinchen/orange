package com.orange.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.orange.bean.User;

@RestController
public class OrangeController {
	
	/**
	 * 通过requestparam获取请求值
	 * @param id
	 */
	@GetMapping("/get")
	public void get(@RequestParam(value="id") String id){
		System.out.println(id);
	}
	
	/**
	 * 通过url匹配传递值，正常匹配
	 * @param id
	 */
	@GetMapping("/path/{id}")
	public void user(@PathVariable("id") String id){
		System.out.println(id);
	}
	
	/**
	 * 匹配符合正则表达式的
	 * @param id
	 */
	@GetMapping("/pathmatch/{id:\\d+}")
    public void usermatch(@PathVariable("id") String id){
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
