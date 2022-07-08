package com.blog.service;

import java.util.List;

import com.blog.entities.Post;
import com.blog.payloads.PostDto;

public interface PostService {
   //create
	public PostDto createPost(PostDto postDto,Integer userId,Integer categoryId);
	
	//update
	public Post updatePost(PostDto postDto,Integer postId);
	
	//delete
	public void deletePost(Integer postId);
	
	//get all post
	public List<Post> getAllPost();
	
	//get single post
	public Post getPostById(Integer postId);
	
	//get all post by category
	public List<PostDto> getPostByCategory(Integer categoryId);
	
	//get all post by user
	public List<PostDto> getPostByUser(Integer userId);
	
	//search post
	List<Post> searchPost(String keyword);
	
	
	
}
