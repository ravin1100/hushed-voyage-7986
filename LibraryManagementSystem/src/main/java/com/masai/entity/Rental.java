package com.masai.entity;


import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Rental")
public class Rental {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;

    @Column(name = "rental_date")
    private Date rentalDate;

    @Column(name = "return_date")
    private Date returnDate;


    // Default constructor
    public Rental() {
    }

    // Parameterized constructor
    public Rental(Student student, Book book, Date rentalDate, Date returnDate) {
        this.student = student;
        this.book = book;
        this.rentalDate = rentalDate;
        this.returnDate = returnDate;
    }

 // Getters and setters for all fields
    
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public Date getRentalDate() {
		return rentalDate;
	}

	public void setRentalDate(Date rentalDate) {
		this.rentalDate = rentalDate;
	}

	public Date getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}

	@Override
	public String toString() {
		return "Rental [id=" + id + ", student=" + student + ", book=" + book + ", rentalDate=" + rentalDate
				+ ", returnDate=" + returnDate + "]";
	}

}
