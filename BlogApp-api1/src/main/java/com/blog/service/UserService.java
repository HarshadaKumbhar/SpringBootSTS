package com.blog.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.blog.payloads.UserDto;


public interface UserService {

	public UserDto createUser(UserDto userDto);
	
	public UserDto updateUser(UserDto user, Integer userId);
	
	public UserDto getUserById(Integer userId);
	
	public List<UserDto> getAllUsers();
	
	public void deleteUser(Integer userId);
	
 }
