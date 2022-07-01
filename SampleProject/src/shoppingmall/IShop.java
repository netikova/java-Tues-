package shoppingmall;

public interface IShop {
    public abstract void setTitle(String title); //쇼핑몰 이름 설정
    public abstract void genUser();              //예제 사용자 생성
    public abstract void genProduct();           //예제 상품 생성
    public abstract void start();                //쇼핑몰 시작 메서드
}

