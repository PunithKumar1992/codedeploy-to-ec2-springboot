package com.bsol.ec2.pipeline.controller;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
		@GetMapping(value = "/user")
	   public String test() {
			String json =null;
			try {
		        JSONParser parser = new JSONParser();
		        final File file = ResourceUtils.getFile("classpath:user.json");
		        //Use JSONObject for simple JSON and JSONArray for array of JSON.
		        JSONObject data = (JSONObject) parser.parse(
		              new FileReader(file));//path to the JSON file.

		        json = data.toJSONString();
		    } catch (IOException | ParseException e) {
		        e.printStackTrace();
		    }
			return json;
	   }


			@GetMapping(value = "/test")
			public String hello(){
			
			   return "Hello World Program!!!!! Message !!!!";
			}
}
