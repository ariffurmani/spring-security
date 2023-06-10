package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception {
		authenticationManagerBuilder.inMemoryAuthentication()
							.withUser("admin")
							.password("admin12345")
							.roles("ADMIN")
							.and()
							.withUser("user")
							.password("user12345")
							.roles("USER");
	}
	
	@Bean
	public PasswordEncoder getPasswordEncoder() {
		// This is just for test purpose and not recommended
		return NoOpPasswordEncoder.getInstance();
	}
}
