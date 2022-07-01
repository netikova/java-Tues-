package chapter00;

public class ColorTV extends TV{
	String color;




	public ColorTV(int channel, int volume, boolean onOff, String color) {
		super(channel, volume, onOff);
		this.color = color;
	}
	
	@Override
	public String toString() {
		return "ColorTV [channel=" + channel + ", volume=" + volume + ", onOff=" + onOff + ", color=" + color + "]";
	}	
	public static void main(String[] args) {
		TV tv = new TV(5, 20, true);
		System.out.println(tv.toString());
		ColorTV colortv = new ColorTV(3, 20, false, "RED");
		System.out.println(colortv.toString());
	}
}
class TV{
	int channel;
	int volume;
	boolean onOff;
    public TV() {
		
	}
	public TV(int channel, int volume, boolean onOff) {
		super();
		this.channel = channel;
		this.volume = volume;
		this.onOff = onOff;
	}	
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public boolean isOnOff() {
		return onOff;
	}
	public void setOnOff(boolean onOff) {
		this.onOff = onOff;
	}
	@Override
	public String toString() {
		return "tv [channel=" + channel + ", volume=" + volume + ", onOff=" + onOff + "]";
	}	
}


