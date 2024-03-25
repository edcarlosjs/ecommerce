package com.techchallenge.ecommerce.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

/*
 * Nesta classe vamos consentrar as configurações de segurança
 * Adionar as anotações @Configurations e @EnableWebSecurity -- Anotação que indica o spring que vamos personalizar as configurações de seguirança
 * 1º Configurar o processo de autenticação de stentfull para stentman 
 */

@Configuration
@EnableWebSecurity 
public class SecurityConfigurations {

	   //Objeto do Spring usado para configurar autenticação
	   //Metodo que altera a o processo de autenticação
	   // Dentro do parentese receber a classe HttpSecurity 
 //Expoe o retorno deste objeto@Bean
@Bean
public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
		http.csrf(csrf -> csrf.disable())
		.authorizeHttpRequests((requests) -> requests
				.requestMatchers(HttpMethod.POST,"usuario/**").permitAll()
				.anyRequest()
				.authenticated());
		return http.build();
	     
	   }

}
