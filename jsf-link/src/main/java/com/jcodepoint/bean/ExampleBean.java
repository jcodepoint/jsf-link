package com.jcodepoint.bean;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named("exampleBean")
@RequestScoped
public class ExampleBean {

	private String name;
	
	@PostConstruct
	public void init() {
		this.name = "Carlos";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
