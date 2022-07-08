package com.blog.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blog.payloads.ApiResponse;
import com.blog.payloads.UserDto;
import com.blog.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController 
{
	@Autowired
	private UserService userService;
	
	//Post User
	@PostMapping("/")
	public ResponseEntity<UserDto> createUser(@Valid @RequestBody UserDto userDto)
	{
		UserDto createUser = this.userService.createUser(userDto);
	    return new ResponseEntity<>(createUser,HttpStatus.CREATED);
	}
	
	
	//Put User
	@PutMapping("/{id}")
	public ResponseEntity<UserDto> updateUser( @PathVariable("id") Integer userId , @Valid @RequestBody UserDto userDto)
	{
		UserDto updateUser = this.userService.updateUser(userDto, userId);
		return ResponseEntity.ok(updateUser);
	}
	
	
	
	//Delete User
	@DeleteMapping("/{id}")
	public ResponseEntity<ApiResponse> deleteUser(@PathVariable("id") Integer uid)
	{
		this.userService.deleteUser(uid);
	   return new ResponseEntity<ApiResponse>(new ApiResponse("User deleted Successfully", true),HttpStatus.OK);
	}
	
	//Get AllUser
	@GetMapping("/")
	public ResponseEntity<List<UserDto>> getAllUsers()
	{
		return ResponseEntity.ok(this.userService.getAllUsers());
	}

	//Get single User
	@GetMapping("/{id}")
	public ResponseEntity<UserDto> getSingleUser(@PathVariable("id") Integer userId)
	{
		return ResponseEntity.ok(this.userService.getUserById(userId));
		
	}
	
	
}
