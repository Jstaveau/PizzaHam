package com.springProjet.pizzaHam;

import com.github.javafaker.Faker;
import com.springProjet.pizzaHam.models.User;
import com.springProjet.pizzaHam.repositories.PizzaRepository;
import com.springProjet.pizzaHam.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PizzaHamApplication {

	public static void main(String[] args) {
		SpringApplication.run(PizzaHamApplication.class, args);
	}

//	@Bean
	public CommandLineRunner commandLineRunner(PizzaRepository pizzaRepository, UserRepository userRepository) {
		return args -> {
//			for (int i = 0; i < 17; i++){
//				Faker faker = new Faker();
//				Pizza pizza = Pizza.builder()
//						.name(faker.name().firstName())
//						.size(faker.lorem().word())
//						.price(faker.number().numberBetween(10,25))
//						.timeToCook(faker.number().numberBetween(10,25))
//						.ingredients(faker.lorem().sentence())
//						.build();
//				pizzaRepository.save(pizza);
//			}
			for (int i = 0; i < 7; i++){
				Faker faker = new Faker();
				User user = User.builder()
						.name(faker.name().firstName() + " " + faker.name().lastName())
						.email(faker.internet().emailAddress())
						.address(faker.address().streetAddress())
						.telephone(faker.phoneNumber().phoneNumber())
						.build();
				userRepository.save(user);
			}
		};
	}

}
