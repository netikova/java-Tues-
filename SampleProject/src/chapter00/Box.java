package chapter00;

class Box{
	int width;
	int length;
	int height;
	int volume; 

	public Box(int width, int length, int height) {		
		this.width = width;
		this.length = length;
		this.height = height;	
		
	}
	int getVolumn()
	{
		volume = width * length * height;
		return volume;
	}
	@Override
	public String toString() {
		return "Box2 [width=" + width + ", length=" + length + ", height=" + height + ", volume=" + volume + "]";
	}
	
	public static void main(String[] args) {
		Box box = new Box(3,2,6);
		System.out.println(box.getVolumn());
		System.out.println(box.toString());

	}
}


