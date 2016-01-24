package pl.waw.mizinski.sdm.soap_client;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import pl.waw.mizinski.sdm.soap.Student;
import pl.waw.mizinski.sdm.soap.StudentService;

public class ClientMain {

	public static void main(String[] args) {
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setServiceClass(StudentService.class);
		factory.setAddress("http://localhost:8080/service");
		StudentService service = (StudentService) factory.create();
		Student student = service.getStudent(10L);
		System.out.println(student.getName() + " "  + student.getSurname());
	}
	
}
