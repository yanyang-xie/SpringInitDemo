package dev.fnt.springapp;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Main {
	@Autowired
	private PropMessage dp;
	
	public static void main(String[] args) {
		try(ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("springApplicationContext.xml")){
			Main p = applicationContext.getBean(Main.class);
			p.start(args);	
		};
		
    }

	private void start(String[] args) {
		dp.printMessage();
	}
}