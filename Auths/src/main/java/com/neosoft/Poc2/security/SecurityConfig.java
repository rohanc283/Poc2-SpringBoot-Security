package com.neosoft.Poc2.security;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;


@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	
	@Autowired
	TestUserService testUserService;
	//2 users for authentication
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		auth.inMemoryAuthentication().withUser("rohan").password("{noop}rohan").
//		roles("USER").and().withUser("admin").password("{noop}admin").roles("USER","ADMIN");
       
		
		//with database
		
		auth.userDetailsService(testUserService).passwordEncoder(NoOpPasswordEncoder.getInstance());
	}
	//authorize
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.httpBasic().and().
		authorizeRequests().
		antMatchers(HttpMethod.GET,"/**").hasAnyRole("ADMIN").
		antMatchers(HttpMethod.POST,"/**").hasAnyRole("ADMIN","USER").and().csrf().disable();
	}
}
