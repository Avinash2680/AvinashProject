package OnetoOne.Mapping.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Student")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Studentid;
	private String name;
	private String Email;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "Student")
    @JsonManagedReference
    private Laptopdetails laptopdetails;
	
    public Laptopdetails getLaptopdetails() {
    	
      return laptopdetails;
}
    public void  setLaptopdetails(Laptopdetails laptopdetails) {
    	this.laptopdetails=laptopdetails;
    	
    }
    public int getStudentId() {
		return Studentid;
	}

	public void setStudentId(int Studentid) {
		this.Studentid = Studentid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		this.Email = email;
	}

}
