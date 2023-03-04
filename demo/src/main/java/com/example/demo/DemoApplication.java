package com.example.demo;

import com.example.demo.Entities.Laptop;
import com.example.demo.Repositories.LaptopRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDate;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		LaptopRepository repository = context.getBean(LaptopRepository.class);
		Laptop laptop = new Laptop(null, "vaio", 128, 18050.95,
				LocalDate.of(2015, 5, 18));
		Laptop laptop2 = new Laptop(null, "lenovo", 240, 24050.95,
				LocalDate.of(2013, 8, 2));
		Laptop laptop3 = new Laptop(null, "acer", 90, 9050.95,
				LocalDate.of(2018, 11, 25));

		System.out.println("1" + repository.save(laptop) + "2" + repository.save(laptop2)
				+ "3" + repository.save(laptop3));


	}

}
