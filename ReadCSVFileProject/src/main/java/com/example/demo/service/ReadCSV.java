package com.example.demo.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.demo.modal.Product;
@Component
public class ReadCSV {
	private IReadfile ifile;
	@Autowired
	public ReadCSV(IReadfile ifile) {
		this.ifile = ifile;
	}
		
	public List readfromcsv() throws Exception{
		List al = new ArrayList();
		FileReader fr = new FileReader(new File("Readcsv.csv"));
		BufferedReader br = new BufferedReader(fr);
		String lineread = br.readLine();
		while(lineread != null) {
			String lines[] = lineread.split(",");
			Product pr = new Product();
//			pr.setProductID(Integer.parseInt(lines[0]));
//			pr.setProductname(lines[1]);
			pr.setProductprice(Double.parseDouble(lines[2]));
			al.add(pr);
			lineread = br.readLine();
			
			
		}
		br.close();
		return ifile.filterProduct(al);
	}

}
