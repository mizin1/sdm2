package pl.waw.mizinsjki.sdm.rest;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.HEAD;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

import pl.waw.mizinski.sdm.model.Course;
import pl.waw.mizinski.sdm.model.Student;

@Path("/student")
public class StudentRestService {
	
	private List<Student> students = new LinkedList<Student>();
	
	{
		students.add(new Student(1L, "Jan", "Kowalski", 
				Arrays.asList(new Course("Analiza", 2.0), new Course("Algebra", 3.5))));
	}
	
	@GET
	@HEAD
	@Path("/{id}")
	@Produces("text/xml")
	public Student getStudent(@PathParam("id") Long id) {
		for (Student student : students) {
			if (student.getId().equals(id)) {
				return student;
			}
		}
		throw new WebApplicationException(Response.status(Response.Status.NOT_FOUND).header("reason", "deleted").build());
	}
	
	@PUT
	public Response addStudent(Student student) {
		students.add(student);
		return Response.status(Response.Status.CREATED).build();
	}
	
	@DELETE
	@Path("/{id}")
	public void deleteStudent(@PathParam("id")Long id) {
		for (Student student : students) {
			if (student.getId().equals(id)) {
				students.remove(student);
				return;
			}
		}
		throw new WebApplicationException(Response.status(Response.Status.NOT_FOUND).header("reason", "not-yest-added").build());
	}
	
	@POST
	@Produces("text/xml")
	public void updateStudent(Student student) {
		deleteStudent(student.getId());
		addStudent(student);
	}

}
