package chapter04;

public class Story {

	public static void main(String[] args) {
		Book littlePrince = new Book("¾î¸°¿ÕÀÚ", "»ıÅØÁãº£¸®");
        Book loveStory = new Book("ÃáÇâÀü");
        
        System.out.println(littlePrince.title);
        System.out.println(littlePrince.author);
        System.out.println(loveStory.title);
        System.out.println(loveStory.author);
        littlePrince.printContent("¾î¸°¿ÕÀÚ");
        System.out.println(loveStory.title);
        System.out.println(loveStory.author);
        loveStory.printContent("ÃáÇâÀÌ");
	}

}
