package com.constructorandinstance.level1;

public class Book {
	public int ISBN;
	protected String title;
	private String author;
	
	public void setAuthor(String a) {
		author = a;
	}
	public String getAuthor() {
		return author;
	}
	 static class  EBook extends Book{
		void display() {
			System.out.println("ISBN : " +ISBN );
			System.out.println("Title : " +title );
			System.out.println("Author : " +getAuthor() );
		}
		 
	}
	public static void main(String[] args) {
		EBook eb = new EBook();
		eb.ISBN = 978;
		eb.title = "The Hobbit";
		eb.setAuthor("J.R.R. Tolkien"); 
		eb.display();
	}

}
