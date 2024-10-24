package Springboot_Custom_Annonation_example;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity(name = "employee")
public class Employee 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int eid;
	@NotNull
	String ename;
	@AddressValidation(message = "put a valid city")
	String address;
	@Min(value = 20)
	int age;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public @NotNull String getEname() {
		return ename;
	}

	public void setEname(@NotNull String ename) {
		this.ename = ename;
	}

	@Min(value = 20)
	public int getAge() {
		return age;
	}

	public void setAge(@Min(value = 20) int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
