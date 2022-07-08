package com.blog;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BlogAppApi1ApplicationTests {

	@Autowired
	private com.blog.repositories.UserRepo userRepo;
	@Test
	void contextLoads() {
	}

	@Test
	public void UserRepo()
	{
		String className = this.userRepo.getClass().getName();
		Package packageName =this.userRepo.getClass().getPackage();
		System.out.println(className);
		System.out.println(packageName);
	}
}
