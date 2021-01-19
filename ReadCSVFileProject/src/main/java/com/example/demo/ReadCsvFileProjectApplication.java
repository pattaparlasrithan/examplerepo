package com.example.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.modal.Product;
import com.example.demo.service.ReadCSV;

@SpringBootApplication
public class ReadCsvFileProjectApplication {

	public static void main(String[] args) throws Exception {
		ConfigurableApplicationContext context = SpringApplication.run(ReadCsvFileProjectApplication.class, args);
//		context.getBean(ReadCSV.class);
		ReadCSV rCSV = context.getBean(ReadCSV.class);
		List<Product> lt = rCSV.readfromcsv();
		
		/* for(Product p : lt) { System.out.println(p.getProductprice()); } */
		 
		lt.forEach(System.out::println);
		//	context.getBean(ReadCSV.class);
	}

}
