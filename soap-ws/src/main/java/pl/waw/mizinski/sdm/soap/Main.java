package pl.waw.mizinski.sdm.soap;

import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

public class Main {
	 public static void main(String[] args) {
	        StudentService studentService = new StudentsServiceImpl();
	        JaxWsServerFactoryBean factoryBean = new JaxWsServerFactoryBean();
	        factoryBean.setServiceClass(StudentService.class);
	        factoryBean.setServiceBean(studentService);
	        factoryBean.setAddress("http://localhost:8080/service");
	        factoryBean.create();
	    }
}
