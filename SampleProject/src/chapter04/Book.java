package chapter04;

public class Book {
	//�ʵ�
	String title;  
	String author;

	//������ �����ε�
	public Book() {}
	public Book(String title) {
		this.title = title;
		this.author = "���ڹ̻�";		
	}
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	public void printContent(String title)
	{
		System.out.println("����������"+ title + "��ҽ��ϴ�.");
	}
	
	
}
