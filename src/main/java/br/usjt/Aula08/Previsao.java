package br.usjt.Aula08;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class Previsao implements WebMvcConfigurer {
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		
		registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/**").
			excludePathPatterns("/login", "/" , "/fazerLogin" , "/webjars/**", "/bootstrap/**" );
	}

}
