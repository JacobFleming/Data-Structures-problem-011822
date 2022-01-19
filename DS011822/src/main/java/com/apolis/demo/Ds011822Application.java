package com.apolis.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.apolis.demo.ds1.TreeCompare;
import com.apolis.demo.ds1.TreeSearch;

@SpringBootApplication
public class Ds011822Application {
//using spring boot to practice creating on IDE
	public static void main(String[] args) {
		SpringApplication.run(Ds011822Application.class, args);
		TreeCompare.runner();
		TreeSearch.runner();
	}

}
