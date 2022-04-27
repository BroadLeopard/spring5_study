package chap02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main2 {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(AppContext.class);
		Greeter g = ctx.getBean("greeter", Greeter.class);//빈 객체 이름, 빈 객체 타입
		String msg = g.greet("spring");
		System.out.println(msg);
		ctx.close();
	}
}
