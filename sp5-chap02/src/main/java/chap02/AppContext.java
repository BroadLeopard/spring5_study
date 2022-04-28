package chap02;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppContext {

	@Bean
	public Greeter greeter() {//스프링에서 관리할 객체를 반환한다. 이름은 greeter
		Greeter g = new Greeter();
		g.setFormat("%s, hello!");
		return g;
	}

}
