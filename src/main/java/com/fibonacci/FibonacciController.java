package com.fibonacci;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app/v1/")
public class FibonacciController {
	
	@RequestMapping("/getFib")
	public String returnFibonnaci(@RequestParam String number) {
		Integer numberInt = null ;
		if(number == null || number.length() == 0) {
			return "Number not present";
		}
		try {
			 numberInt = Integer.parseInt(number);
		} catch (Exception ex) {
			return "Enter a valid number";
		}
		if(numberInt<0) {
			return "Enter a positive number";
		}
		List<Integer> numberList = getFibList(numberInt);
		String fibString = numberList.stream().map(Object::toString).collect(Collectors.joining(","));
		return fibString;
	}

	public List<Integer> getFibList(Integer numberInt) {
		List<Integer> numList = new ArrayList<Integer>();
		numList.add(0);
		numList.add(1);
		int n1=0,n2=1,n3,i,count=numberInt;
		 for(i=2;i<count;++i)   
		 {    
		  n3=n1+n2;    
		  numList.add(n3);    
		  n1=n2;    
		  n2=n3;    
		 }    
		 
		 return numList;
	}

}
