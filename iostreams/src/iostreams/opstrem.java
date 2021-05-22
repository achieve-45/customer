package iostreams;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class opstrem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis=new FileInputStream("C:\\Users\\Achieve Pattanaik\\Desktop\\achieve\\pupu.jpg");
			fos=new FileOutputStream("C:\\Users\\Achieve Pattanaik\\Desktop\\achieve\\pupu2.jpg");
			int data;
			while((data = fis.read())!=-1) {
				fos.write(data);
			}
			System.out.println("copied");
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fis.close();
				fos.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

}
