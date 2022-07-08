package com.blog.service;

import java.util.List;

import com.blog.payloads.CategoryDto;

public interface CategoryService {
	// create
	public CategoryDto createCategory(CategoryDto categoryDto);
	
	// update
	public CategoryDto updateCategory(CategoryDto categoryDto,Integer categoryId);
	
	// delete
	public void deleteCategory(Integer categoryId);
	
	// getById
	public CategoryDto getCategory(Integer categoryId);
	
	
	// getAll
	List<CategoryDto> getAllCategories();
	
	
	
}
