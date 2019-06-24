package com.app.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.model.Product;
import com.app.repo.ProductRepository;


@Component
public class ConsoleRunner implements CommandLineRunner {

	@Autowired
	private ProductRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		
		repo.deleteAll();
		
		repo.save(new Product(10,"A",2.2));
		repo.save(new Product(11,"B",3.3));
		repo.save(new Product(12,"C",4.4));
		
		System.out.println("---------------------");
		
	List<Product> list =repo.findAll();
		System.out.println(list);
		
	}

}
