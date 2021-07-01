import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		Student st1=(Student) context.getBean("s1");
		//Student st2=(Student) context.getBean("s2");
		//Student st3=(Student) context.getBean("s3");
		System.out.println(st1);
		//System.out.println(st2);
		//System.out.println(st3);
	}

}
