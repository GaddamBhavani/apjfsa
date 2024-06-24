package com.collections;

import java.util.LinkedHashMap;

public class DemoLinkedHashMap {

	public static void main(String[] args) {
LinkedHashMap<String,Integer> countryCodes=new LinkedHashMap<String,Integer>();
	countryCodes.put("US",1);
	
	countryCodes.put("India",91);
	countryCodes.put("Russia",7);
	countryCodes.put("Astralia",61);
	countryCodes.put("China",86);
	countryCodes.put("Pakistan",92);
	countryCodes.put(null,0);
	countryCodes.put("Italy",92);

System.out.println(countryCodes);

System.out.println(countryCodes.values());
System.out.println(countryCodes.size());
System.out.println(countryCodes.replace("China",86));
System.out.println("country names:");
System.out.println(countryCodes.keySet());

	}
	}


	