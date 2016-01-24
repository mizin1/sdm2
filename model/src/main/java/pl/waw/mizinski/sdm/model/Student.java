package pl.waw.mizinski.sdm.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="student")
@XmlAccessorType(XmlAccessType.FIELD)
public class Student {

	@XmlElement(required = true)
	private Long id;
	
	@XmlElement(required = true)
	private String name;
	
	@XmlElement(required = true)
	private String surname;

	@XmlElementWrapper
	@XmlElement(name = "course")
	private List<Course> courses;
	
	public Student() {
	}

	public Student(Long id, String name, String surname, List<Course> courses) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.courses = courses;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	
}
