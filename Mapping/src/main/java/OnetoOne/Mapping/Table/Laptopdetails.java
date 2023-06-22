package OnetoOne.Mapping.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Laptop")
public class Laptopdetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String Laptopmodel;
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Student_id")
    @JsonBackReference
    private Student Student;

	
	public int getId() {
		return id;
	}


	
	public void setId(int id) {
		this.id = id;
	}


	public String getLaptopmodel() {
		return Laptopmodel;
	}


	public void setLaptopmodel(String laptopmodel) {
		Laptopmodel = laptopmodel;
	}


	public Student getStudent() {
		return Student;
	}

	
	public void setStudent(Student student) {
		this.Student = student;
	}



}
