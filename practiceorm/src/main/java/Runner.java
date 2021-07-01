import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cs.dao.StudentDao;
import com.cs.entities.Student;

public class Runner {
public static void main(String[] args) {
	ApplicationContext con=new ClassPathXmlApplicationContext("ormconfig.xml");
	StudentDao sd=con.getBean("sdao",StudentDao.class);
	/*
	 * Student st=new Student(101,"csm","bbs"); int res=sd.insert(st);
	 * System.out.println(res);
	 */
	BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
	boolean flag=true;
	while(flag) {
	System.out.println("press 1 to add student ");
	System.out.println("press 2 to display all students ");
	System.out.println("press 3 to get detail of single student ");
	System.out.println("press 4 to delete student ");
	System.out.println("press 5 to exit ");
	try {
		int input =Integer.parseInt(br.readLine());
		
		switch(input) {
		case 1: 
			System.out.println("enter id of student");
			int id=Integer.parseInt(br.readLine());
			System.out.println("enter name of student");
			String name=br.readLine();
			System.out.println("enter city of student");
			String city=br.readLine();
			Student s=new Student(id,name,city);
			int r=sd.insert(s);
			System.out.println(r);
			System.out.println("***************************************");
			
			break;
		case 2:
			List<Student> allStudent = sd.getAllStudent();
			for(Student st:allStudent)
			{
				System.out.println(st.getId());
				System.out.println(st.getName());
				System.out.println(st.getCity());
			}
			break;
		case 3:
			System.out.println("enter id of student");
			int uid=Integer.parseInt(br.readLine());
			Student st2=sd.getStudent(uid);
			System.out.println(st2.getId());
			System.out.println(st2.getName());
			System.out.println(st2.getCity());
			break;
		case 4:
			System.out.println("enter id of student");
			int uid2=Integer.parseInt(br.readLine());
			sd.deleteStudent(uid2);
			System.out.println("Student with id "+uid2+" deleted");
			break;
		case 5:flag=false;
		break;
	}
		}catch(Exception e) {
		System.out.println("Invalid input ");
		System.out.println(e.getMessage());
		
	}
	}System.out.println("Thank you for using the application");
}
}

