package pl.waw.mizinski.sdm.soap;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import pl.waw.mizinski.sdm.model.Student;

@WebService
public interface StudentService {
	
	@WebResult(name = "student")
	Student getStudent(@WebParam(name = "id")Long id);
	
}
