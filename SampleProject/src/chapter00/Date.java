package chapter00;

public class Date {
int year;
int month;
int day;
public Date(int year, int month, int day) {
	super();
	this.year = year;
	this.month = month;
	this.day = day;
}
public Date(int year) {
	super();
	this.year = year;
}
public Date() {
	
}
void PrintYear() {
	System.out.println("현재는 " + year + " 년입니다.");
}
public static void main(String[] args) {
	Date date = new Date(2022);
	date.PrintYear();
}

}
