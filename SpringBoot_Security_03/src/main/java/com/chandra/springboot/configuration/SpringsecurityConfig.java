package com.chandra.springboot.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SpringsecurityConfig extends WebSecurityConfigurerAdapter {

	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
				.passwordEncoder(org.springframework.security.crypto.password.NoOpPasswordEncoder.getInstance())
				.withUser("chandra").password("chandra").roles("USER").and().withUser("admin").password("admin")
				.roles("USER", "ADMIN");
	}

	protected void configure(HttpSecurity http) throws Exception {
		http.httpBasic().and().authorizeRequests().antMatchers("/userlogin").hasAnyRole("USER")
				.antMatchers("/adminlogin").hasAnyRole("ADMIN").and().csrf().disable().headers().frameOptions()
				.disable();
	}

}
