package com.copart.springlearningdemo;
import java.lang.String;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//spring only scans the components or subpackages of springlearningdemo if we have other packages out side it then it will throw an erro
//we should expicitly mention outer packages which we want spring to scan

@SpringBootApplication(scanBasePackages={"model"})
public class SpringlearningdemoApplication{

	public static void main(String[] args){
		SpringApplication.run(SpringlearningdemoApplication.class, args);
	}
}
