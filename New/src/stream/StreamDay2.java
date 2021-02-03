package stream;

import java.io.*;

public class StreamDay2 {

	public StreamDay2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileInputStream input = null;
		
		try {
			
			input = new FileInputStream("mine.txt");
			byte[] data = input.readAllBytes();
			
			for(int i: data) {
				
				System.out.write(i);
			}
			
			System.out.flush();
			
		}catch(IOException io) {
			
			System.out.println(io);
			
		}finally {
			
			try {
				if(input != null) {
					
					input.close();
				}
				
				System.out.flush();
				
			}catch(IOException io) {
				
				System.out.println(io);
			}
		}

	}

}
