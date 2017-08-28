package com.chatbot.business;

import org.codehaus.jackson.map.ObjectMapper;

import com.chatbot.model.JavaModel;

public class ApiAi
{
	public JavaModel jsonToJava(String json) {
		JavaModel response = null;
		try {
			ObjectMapper mapper=new ObjectMapper();
			response = mapper.readValue(json, JavaModel.class);
			
			System.out.println(response);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return response;
	}

}
