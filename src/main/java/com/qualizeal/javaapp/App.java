package com.qualizeal.javaapp;

import com.qualizeal.javaapp.mathematics.Grading;

public class App 
{
    public static void main( String[] args )
    {
        Grading grading = new Grading();
		String result = grading.marks(-9);
		
		System.out.println(result);
    }
}
