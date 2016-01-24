package pl.waw.mizinski.sdm.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType
@XmlAccessorType(XmlAccessType.FIELD)
public class Course {

	@XmlElement(required = true)
	private String name;
	
	@XmlElement(required = true)
	private Double degree;

	public Course() {
	}

	public Course(String name, Double degree) {
		this.name = name;
		this.degree = degree;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getDegree() {
		return degree;
	}

	public void setDegree(Double degree) {
		this.degree = degree;
	}
	
	
}
