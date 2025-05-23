package com.company.member;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
	
	@Bean public SecurityFilterChain sFC(HttpSecurity http) throws Exception {
		http.csrf().disable().authorizeHttpRequests(
				(authorizeHttpRequests) -> 	authorizeHttpRequests
				.requestMatchers(  new AntPathRequestMatcher("/**"))
				.permitAll()
				)
		.formLogin(form -> form
						.loginPage("/member/login")
						.loginProcessingUrl("/member/login")
						.usernameParameter("email")
						.passwordParameter("password")
						.defaultSuccessUrl("/board/list")
						.permitAll()
						)
		.logout((logout) -> logout
				.logoutUrl("/member/logout")
				.logoutSuccessUrl("/board/list")
				.invalidateHttpSession(true)
				);
		return http.build();
	}

		@Bean AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration) throws Exception{  
			return authenticationConfiguration.getAuthenticationManager();
		}
		@Bean  	PasswordEncoder  passwordEncoder() { return new  BCryptPasswordEncoder(); }
		public static void main(String[] args) {
		}
}