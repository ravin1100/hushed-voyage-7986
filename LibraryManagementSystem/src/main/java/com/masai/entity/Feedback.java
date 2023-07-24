package com.masai.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Feedback")
public class Feedback {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;

    @Column(name = "rating")
    private double rating;

    @Column(name = "comment")
    private String comment;

    // Constructors, getters, setters, and other methods

    // Default constructor
    public Feedback() {
    }

    // Parameterized constructor
    public Feedback(Student student, Book book, double rating, String comment) {
        this.student = student;
        this.book = book;
        this.rating = rating;
        this.comment = comment;
    }

    // Getters and setters
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

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@Override
	public String toString() {
		return "Feedback [id=" + id + ", student=" + student + ", book=" + book + ", rating=" + rating + ", comment="
				+ comment + "]";
	}
}

