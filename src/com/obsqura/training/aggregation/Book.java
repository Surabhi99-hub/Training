package com.obsqura.training.aggregation;

public class Book {
	String name;
	long price;
	Author ar;
	public Book(String name, long price, Author ar) {
		super();
		this.name = name;
		this.price = price;
		this.ar = ar;
	}
	public void display() {
		System.out.println("BOOK DETAILS");
		System.out.println("Book Name: "+name);
		System.out.println("Price: $"+price);
		System.out.println("AUTHOR DETAILS:");
		System.out.println("Author Name: "+ar.name);
		System.out.println("Age: "+ar.age);
		System.out.println("Place: "+ar.place);
	}

	public static void main(String[] args) {
		Author ar=new Author("J.K.Rowling",58,"British");
		Book b=new Book("HARRY POTTER",300,ar);
		b.display();
	}

}