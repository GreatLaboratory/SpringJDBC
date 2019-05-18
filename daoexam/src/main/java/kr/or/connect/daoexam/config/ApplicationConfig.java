package kr.or.connect.daoexam.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({DBConfig.class})
@ComponentScan(basePackages = {"kr.or.connect.daoexam.dao"})  // dao패키지에 있는 component나 repository 어노테이션 붙어있는 곳에 가서 빈설정해줌
public class ApplicationConfig {
	
}
