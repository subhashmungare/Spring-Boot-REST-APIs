package com.project.blog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.blog.entities.Blog;
import com.project.blog.repositories.BlogRepo;
@Service
public class BlogService {

	@Autowired
	private BlogRepo blogRepo;
	
	public Blog getblog(Integer blogId) {

		Blog blog= this.blogRepo.findById(blogId).orElseThrow();
		return blog;
	}

	
	public Blog createBlog(Blog blog) {
		Blog newBlog=this.blogRepo.save(blog);
		return newBlog;
		
	}

	
	public List<Blog> getallblog() {
		List<Blog> blogList=this.blogRepo.findAll();
		return blogList;
	}

	
	public void deleteblogId(int id) {
		 this.blogRepo.deleteById(id);
		
	}

	
	public Blog updateblog(int Id,Blog newBlog) {
		

		Blog blog= this.blogRepo.findById(Id).orElseThrow();
		blog.title=newBlog.title;
		blog.description=newBlog.description;
		
		this.blogRepo.save(blog);
		return blog;
	}

	

	
	
	
	
	
}


