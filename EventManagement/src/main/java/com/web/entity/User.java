//package com.web.entity;
//
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.Table;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//
//
//@Data
//@NoArgsConstructor
//@Entity
//@Table(name="em_user")
//public class User {
//	
//	
//	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
//	private Integer id;
//	private String fullName;
//	private String email;
//	private String mobNumber;
//	private String password;
//	private String confirmPassword;
//	private String gender;
//	
//	
//	
//	public User() {}
//
//
//
//	public User(Integer id, String fullName, String email, String mobNumber, String password, String confirmPassword,
//			String gender) {
//		super();
//		this.id = id;
//		this.fullName = fullName;
//		this.email = email;
//		this.mobNumber = mobNumber;
//		this.password = password;
//		this.confirmPassword = confirmPassword;
//		this.gender = gender;
//	}
//
//
//
//	public Integer getId() {
//		return id;
//	}
//
//
//
//	public void setId(Integer id) {
//		this.id = id;
//	}
//
//
//
//	public String getFullName() {
//		return fullName;
//	}
//
//
//
//	public void setFullName(String fullName) {
//		this.fullName = fullName;
//	}
//
//
//
//	public String getEmail() {
//		return email;
//	}
//
//
//
//	public void setEmail(String email) {
//		this.email = email;
//	}
//
//
//
//	public String getMobNumber() {
//		return mobNumber;
//	}
//
//
//
//	public void setMobNumber(String mobNumber) {
//		this.mobNumber = mobNumber;
//	}
//
//
//
//	public String getPassword() {
//		return password;
//	}
//
//
//
//	public void setPassword(String password) {
//		this.password = password;
//	}
//
//
//
//	public String getConfirmPassword() {
//		return confirmPassword;
//	}
//
//
//
//	public void setConfirmPassword(String confirmPassword) {
//		this.confirmPassword = confirmPassword;
//	}
//
//
//
//	public String getGender() {
//		return gender;
//	}
//
//
//
//	public void setGender(String gender) {
//		this.gender = gender;
//	}
//	
//	
//	
//	
//
//}





package com.web.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    public User() {}

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

 
}
