package com.blog.payloads;


import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserDto {
//used for transfering data
	
	private int id;
	@NotEmpty
	@Email(message="Email address is not valid!!")
	private String email;
	
	@NotEmpty
	@Size(min=3,message="Username must be min of 3 characters")
	private String name;
	
	@NotEmpty
	@Size(min=3,max=10, message="Password must be min of 3 chars and max of 10 chars")
	private String password;
	
	@NotEmpty
	private String about;
}
