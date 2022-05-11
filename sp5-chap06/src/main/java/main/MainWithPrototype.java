package main;

import java.io.IOException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import config.AppCtxWithPrototype;
import spring.Client;

public class MainWithPrototype {

	public static void main(String[] args) throws IOException {
		AbstractApplicationContext ctx = 
				new AnnotationConfigApplicationContext(AppCtxWithPrototype.class);

		Client client1 = ctx.getBean(Client.class);//프로토타입이기 때문에 매번 새로운 객체를 생성함. 같은 객체 아님
		Client client2 = ctx.getBean(Client.class);
		System.out.println("client1 == client2 : " + (client1 == client2));

		ctx.close();
	}

}