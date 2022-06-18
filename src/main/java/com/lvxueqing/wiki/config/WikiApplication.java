package com.lvxueqing.wiki.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan("com.lvxueqing")
public class WikiApplication {
    /**
     * ComponentScan  不加这个注释的话 默认只会扫描当前包及其子包，其他包的就会404
     * @param args
     */


	public static void main(String[] args) {
		SpringApplication.run(WikiApplication.class, args);
		System.out.println();



	}

}
