package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import spring.Client;
import spring.Client2;

@Configuration
public class AppCtx {

	@Bean
	public Client client() {
		Client client = new Client();
		client.setHost("host");
		return client;
	}
	
	@Bean(initMethod = "connect", destroyMethod = "close")//빈 객체가 생성되면서 밑의 초기화 자동으로 실행한다. 소멸할 때도
	public Client2 client2() {
		Client2 client = new Client2();
		client.setHost("host");
		return client;
	}
}
