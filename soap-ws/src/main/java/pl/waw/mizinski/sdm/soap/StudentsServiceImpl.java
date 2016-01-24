package pl.waw.mizinski.sdm.soap;

import java.util.Arrays;

import javax.jws.WebService;

import pl.waw.mizinski.sdm.model.Course;
import pl.waw.mizinski.sdm.model.Student;

@WebService(endpointInterface = "pl.waw.mizinski.sdm.soap.StudentService")
public class StudentsServiceImpl implements StudentService {

	@Override
	public Student getStudent(Long id) {
		return new Student(id, "Jan", "Kowalski", 
				Arrays.asList(new Course("Analiza", 2.0), new Course("Algebra", 3.5)));
	}

}
