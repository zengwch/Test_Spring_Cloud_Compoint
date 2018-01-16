package com.test.eureka.client.test.service;

import com.test.eureka.client.test.dto.Member;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * ======================
 * Created By User: RXK
 * Date: 2018/1/14
 * Time: 12:54
 * Version: V1.0
 * Description: client 段对外开放的调用接口
 * ======================
 */
@RestController
@RequestMapping("/api/user")
public interface MemberClientService
{
	 static final  String BASE_URL = "/rpc/user";

	@RequestMapping("/info")
	Member getById(String id);

	@RequestMapping("/list")
	List<Member> list();

	@RequestMapping("/add")
	void addMem(@RequestBody Member member);

	@RequestMapping("/del")
	void deleteMem(String id);

	@RequestMapping("/update")
	void updateMem(@RequestBody Member member);
}