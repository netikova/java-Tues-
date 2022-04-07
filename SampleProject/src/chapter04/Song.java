package chapter04;

import java.util.Scanner;

public class Song {
 
	//속성
	String title;
	String artist;
	int year;
	String country;
	//생성자 2개
	Song() {}
	
	public Song(String title, String artist, int year, String country) {
		super();
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
	}

	//메소드
	void show() 
	{
		System.out.println(this.year +", ");
		System.out.println(this.country +", ");
		System.out.println(this.artist +", ");
		System.out.println(this.title);
	}
//	Song(String title, String artist, int year, String country){
//		
//	}
	
	
	public static void main(String[] args) {
//     Scanner scan = new Scanner(System.in);
//     String title = scan.nextLine();
//     String artist = scan.nextLine();
//     int year = scan.nextInt();
//     String country = scan.nextLine();		
     
     Song song[] = new Song[3];
     Scanner scan = new Scanner(System.in);
     //사용자에게 title, artist, year, country를 입력받아서
     //Song를 3개 초기화 시킨다.
     
     for(int i = 0; i<song.length; i++) {
    	 
       System.out.println("타이틀, 가수, 년도, 국가 순 입력 >>> ");	 
       String title = scan.next();
       String artist = scan.next();
       int year = scan.nextInt();
       String country = scan.next();
       song[i] = new Song(title, artist, year, country);
       
     }
     
       for(Song s : song) s.show();
       

	}
	

}
