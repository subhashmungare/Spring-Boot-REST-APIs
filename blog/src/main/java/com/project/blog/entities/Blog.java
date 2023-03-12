package com.project.blog.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Data
public class Blog {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int id;
	
	public String title;
	
	public String description;
	
	

}
