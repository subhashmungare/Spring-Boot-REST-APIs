package com.project.blog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.blog.entities.Blog;
import com.project.blog.service.BlogService;

@RestController
@RequestMapping("/api/blog")
public class BlogController {

	@Autowired
	BlogService blogservice;

	@GetMapping("/getblog/{blogId}")
	public Blog getblog(@PathVariable Integer blogId) {		
		Blog blog=this.blogservice.getblog(blogId);
		return blog;		
	}
	
	@GetMapping("/getallblog")
	public List<Blog> getallblog() {		
		List<Blog> blogList=this.blogservice.getallblog();
		return blogList;		
	}
	
	@PostMapping("/createblog")
	public Blog createBlog(@RequestBody Blog blog) {
		Blog newBlog=this.blogservice.createBlog(blog);
		return newBlog;
	}
	@DeleteMapping("deleteblog/{Id}")
	 public String deleteBlog(@PathVariable int Id) {
		this.blogservice.deleteblogId(Id);
		return "Blog "+Id+" deleted successfully";
	}
	
	@PutMapping("/updateblog/{Id}")
	public Blog updateblog(@PathVariable int Id, @RequestBody Blog blog) {
		Blog newblog = this.blogservice.updateblog(Id ,blog);
		return newblog;
	}
	
	
	
	
	
	
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	

