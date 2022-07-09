package com.docmall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;

@Log4j
@RequestMapping("/member/*")
@Controller
public class MemberController {

	//회원가입 폼
	@GetMapping("/join")
	public void join() {
		
	}
=======
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;

@Log4j
@RequestMapping("/member/*")
@Controller
public class MemberController {

	//회원가입 폼
	@GetMapping("/join")
	public void join() {
		
	}
	
	@PostMapping("/join_ok")
	public void join_ok() {
		
	}
	
>>>>>>> refs/remotes/origin/master
}
