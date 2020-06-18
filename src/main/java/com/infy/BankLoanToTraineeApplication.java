package com.infy;

import java.util.Random;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class BankLoanToTraineeApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankLoanToTraineeApplication.class, args);
		
		
		Random r = new Random();
		System.out.println(r.nextInt((100 - 1) + 1) + 1);
		//System.out.println(getRandomNumberInRange(16, 20));
	}
	
	
	@Bean
	public Docket swaggerConfiguration()
	{
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.paths(PathSelectors.any())
				.apis(RequestHandlerSelectors.basePackage("com.infy.api"))
				.build();
	}
	

}
