package pl.waw.mizinsjki.sdm.rest;

import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;
import org.apache.cxf.jaxrs.lifecycle.SingletonResourceProvider;

public class RestMain {
	
	
	public static void main(String[] args) {
		StudentRestService service = new StudentRestService();
		JAXRSServerFactoryBean factoryBean = new JAXRSServerFactoryBean();
		factoryBean.setResourceClasses(StudentRestService.class);
		factoryBean.setResourceProvider(StudentRestService.class, new SingletonResourceProvider(service));
		factoryBean.setAddress("http://localhost:8081/service");
		factoryBean.create();
	}
}
