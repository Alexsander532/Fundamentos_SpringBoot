package com.alexsander.fundamentos_springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication
@ComponentScan(basePackages = "com.alexsander.fundamentos_springboot") //Permite que o Spring Boot escaneie os componentes no pacote especificado
public class FundamentosSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(FundamentosSpringbootApplication.class, args);
	}

}
