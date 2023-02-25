package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class color {
			@GetMapping("/color")
			public String getName()
			{
				String name="Light Blue";
				return "My favorite color is "+name+"!";
			}

}