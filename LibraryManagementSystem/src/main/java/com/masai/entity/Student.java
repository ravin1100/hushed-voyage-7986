package com.masai.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Student")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "fullName")
	private String fullName;

	@Column(name = "username", unique = true, nullable = false)
	private String username;

	@Column(name = "password", nullable = false)
	private String password;

	@Column(name = "email", nullable = false)
	private String email;

	@Column(name = "address")
	private String address;

	@Column(name = "phoneNumber")
	private String phoneNumber;

	@OneToMany(mappedBy = "student", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Book> rentedBooks = new ArrayList<>();

	// Default constructor
	public Student() {
	}

	// Parameterized constructor
	public Student(String fullName, String username, String password, String email, String address,
			String phoneNumber) {
		this.fullName = fullName;
		this.username = username;
		this.password = password;
		this.email = email;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}

	// Getters and setters for all fields
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public List<Book> getRentedBooks() {
		return rentedBooks;
	}

	public void setRentedBooks(List<Book> rentedBooks) {
		this.rentedBooks = rentedBooks;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", fullName=" + fullName + ", username=" + username + ", password=" + password
				+ ", email=" + email + ", address=" + address + ", phoneNumber=" + phoneNumber + ", rentedBooks="
				+ rentedBooks + "]";
	}
	
	

//    public List<Book> getRentedBooks() {
//        return rentedBooks;
//    }
//
//    public void setRentedBooks(List<Book> rentedBooks) {
//        this.rentedBooks = rentedBooks;
//    }
//
//    // Helper methods to add and remove rented books
//    public void addRentedBook(Book book) {
//        rentedBooks.add(book);
//        book.setStudent(this);
//    }
//
//    public void removeRentedBook(Book book) {
//        rentedBooks.remove(book);
//        book.setStudent(null);
//    }
}
