package chapter07;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;

class Student{
	private String name;
	private String sub;
	private String id;
	private double avg;
	Student(String name,String sub,String id,double avg) {
	this.name = name;
	this.sub = sub;
	this.id = id;
	this.avg = avg;
	}
	public String getName() {
		return name;
	}	
	public String getSub() {
		return sub;
	}	
	public String getId() {
		return id;
	}	
	public double getAvg() {
		return avg;
	}	
	@Override
	public String toString() {
		return "Student [name=" + name + ", sub=" + sub + ", id=" + id + ", avg=" + avg + "]";
	}
	
}



public class Ex07_05 {	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringTokenizer st;
		
		//Student student;
		ArrayList<Student> al = new ArrayList<>();
		
		System.out.println("학생이름, 학과, 학번, 학점평균을 입력하세요 : ");
		for(int i =0; i<4; i++) {
			System.out.println(">>");
			String query = scan.nextLine();
			st = new StringTokenizer(query, ",");
			String name = st.nextToken().trim();
			String sub = st.nextToken().trim();
			String id = st.nextToken().trim();
			double avg = Integer.parseInt(st.nextToken().trim());
			
			Student student = new Student(name,sub,id,avg);
			al.add(student);
		}
		   System.out.println("-------------------------------");
		   
		    Iterator<Student> it = al.iterator();
			while(it.hasNext()) {
				Student student = it.next();
				System.out.println("이름 : " + student.getName());
				System.out.println("학과 : " + student.getSub());
				System.out.println("학번 : " + student.getId());
				System.out.println("학점평균 : " + student.getAvg());
			    System.out.println("-------------------------------");
			}
			
			while(true) {
				System.out.println("학생이름 >> ");
				String s = scan.next();
				
				if(s.equals("그만")) {
					break;
				}
				
				for(int i=0; i<al.size();i++) {
					Student stuList = al.get(i);
					
					if(stuList.getName().equals(s)) {
						System.out.println(stuList.getName() + ", " + stuList.getSub() + ", " + stuList.getId() + ", " + stuList.getAvg());
						break;
					}
				}
			}
			
		}
		
	}

