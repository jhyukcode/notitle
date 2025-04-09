package com.company.boot004.member;

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

@Configuration			// 스프링부트 환경설정파
@EnableWebSecurity		// url 스프링시큐리티 제어 - SecurityFilterChain
public class SecurityConfig {
	// 1 url
	@Bean
	SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
		// 1-0 http.authorizeHttpRequests().forLogin().logout();
		// 1-1 로그인을 안하더라도 모든 페이지 접근 가능
		// /admin/** , /user/**,,,
		http.authorizeHttpRequests(
				(authorizeHttpRequests) -> authorizeHttpRequests
												// admin만 접근
//												.requestMatchers(new AntPathRequestMatcher("/admin/**"))
//												.hasRole("ROLE_ADMIN")		// ADMIN역할
												
												// member만 접근
//												.requestMatchers(new AntPathRequestMatcher("/member/**"))
//												.hasRole("ROLE_MEMBER")		// MEMBER역할
												
												// 전체접근
												.requestMatchers(new AntPathRequestMatcher("/**"))
												.permitAll()			// 모든 사용자 
				).formLogin(	// 1-2 form 만든폼 - login
					(formLogin)->formLogin
									.loginPage("/member/login")
									.defaultSuccessUrl("/member/member")
						
				).logout(	// 1-3 logout
					(logout)-> logout
								.logoutRequestMatcher(new AntPathRequestMatcher("/member/logout"))
								.logoutSuccessUrl("/member/login")
								.invalidateHttpSession(true)
								);
		return http.build();
	}
	
	
	
	// 2 manage
	@Bean
	AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration) throws Exception{
		return authenticationConfiguration.getAuthenticationManager();
	}
	
	
	// 3 PasswordEncoder 비밀번호 암호화
	@Bean PasswordEncoder passwordEncoer() {
		return new BCryptPasswordEncoder();
	}
}
