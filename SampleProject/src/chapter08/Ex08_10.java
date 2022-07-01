package chapter08;

import java.io.*;

import java.io.IOException;
public class Ex08_10 {

	public static void main(String[] args) {
		File src = new File("d:\\dog.jpg");
		File dst = new File("d:\\dog_copy.jpg");
		FileInputStream fr=null;
		FileOutputStream fw=null;
		byte buf[] = new byte[1024*10];
		
		try {
			int c;
			fr = new FileInputStream(src);	
			fw = new FileOutputStream(dst);
			while(true) {
				c = fr.read(buf);
				fw.write(buf, 0, c);
				if(c < buf.length) break;
			}
			fr.close();
			fw.close();
		}
		catch(IOException e) {e.printStackTrace();}

	}

}
