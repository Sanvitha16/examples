package com.qualizeal.javaapp.mathematics;

public class Grading {
	public String marks(int score) {
		if(score < 0){
			return "fail";
		}
		else if(score < 50){
			return "average";
		}
		else{
			return "excellent";
		}
		
	}
	
}