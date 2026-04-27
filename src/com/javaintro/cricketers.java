package com.javaintro;

public class cricketers {
	int id;
	String name;
	static int number;
	static String country;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("id:"+id);
		//System.out.println("name:"+name);
		System.out.println("number:"+number);
		System.out.println("country:"+country);
		cricketers dhoni=new cricketers();
		
		dhoni.id=7;
		dhoni.name="dhoni";
		System.out.println("number:"+number);
		System.out.println("country:"+country);
		System.out.println(dhoni.id);
		System.out.println(dhoni.name);
		
		cricketers virat=new cricketers();
		virat.id=18;
		virat.name="virat";
		System.out.println("number:"+number);
		System.out.println("country:"+country);
		System.out.println(virat.id);
		System.out.println(virat.name);
		
		cricketers rohit=new cricketers();
		System.out.println("number:"+number);
		System.out.println("country:"+country);
		rohit.id=45;
		rohit.name="rohit";
        System.out.println(rohit.id);
        System.out.println(rohit.name);
         
        
        cricketers pant=new cricketers();
        System.out.println("number:"+number);
		System.out.println("country:"+country);
		pant.id=45;
		pant.name="pant";
        System.out.println(pant.id);
        System.out.println(pant.name);
        
        cricketers kl=new cricketers();
         number = 92;
		country = "Bharath";
		System.out.println("Country: " + country);
		System.out.println("number : " + number);
		System.out.println(" id : " + kl.id);
		System.out.println("Name : " + kl.name);
        
        
	}

}
