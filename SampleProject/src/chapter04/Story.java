package chapter04;

public class Story {

	public static void main(String[] args) {
		Book littlePrince = new Book("�����", "�����㺣��");
        Book loveStory = new Book("������");
        
        System.out.println(littlePrince.title);
        System.out.println(littlePrince.author);
        System.out.println(loveStory.title);
        System.out.println(loveStory.author);
        littlePrince.printContent("�����");
        System.out.println(loveStory.title);
        System.out.println(loveStory.author);
        loveStory.printContent("������");
	}

}
