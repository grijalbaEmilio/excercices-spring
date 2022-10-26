package com.example.springpaltopsproject;

import com.example.springpaltopsproject.entities.Laptop;
import com.example.springpaltopsproject.reposirories.LaptopRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringPaltopsProjectApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringPaltopsProjectApplication.class, args);
		LaptopRepository repo = context.getBean(LaptopRepository.class);

		Laptop o1 = new Laptop(null, "HP", 12000);
		Laptop o2 = new Laptop(null, "Lenovo", 42000);
		Laptop o3 = new Laptop(null, "HP", 30000);
		Laptop o4 = new Laptop(null, "Asus", 12000);


		repo.save(o1);
		repo.save(o2);
		repo.save(o3);
		repo.save(o4);

		System.out.println(repo.findAll());
	}

}
