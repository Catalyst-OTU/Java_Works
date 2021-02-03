package stream;

import java.io.*;

public class Stream1 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		//io
		// InputStream ---> ( SOURCE ) ---> ( Reader ) byte
		//OutputStream - ( SINK ) ---> ( Writer ) byte
		// Read & Write - Character oriented
		
		//read -> inputstream -> outputstream -> write
		
		//NIO
		//Buffer - for primitive type data
		//Character set encoders & decoders 
		//Pattern matching
		//a multiplexed, non-blocking i/o facility for writing scalable server
		
		//Buffers and Channels
		
		//Current position - index where the next read/write will take place
		//Limit - end of the buffer
		//Capacity - the number of element the buffer can hold
		
		//Channel - An open connection to an IO source or destination
		
		//Read - Getting message of file into a program for output.
		
		
		//   FILE INPUT STREAM
		
		try {
			
		FileInputStream input = new FileInputStream("mine.txt");
		
		
//		for(int i = input.read(); i != -1; i = input.read() ) {
//			
//		i = input.read();
//		
//		while(i != -1) {
//		
//			System.out.write(i);
//			
//			i = input.read();
//	}
//		}
		
		
		
//		int data =input.read();
//		
//		System.out.write(data);
		
		
		
		byte[] data = new byte[input.available()];
		//byte[] data = input.readAllBytes();
		input.read(data);
		for(int i=0; 1<data.length; i++) {
			
			System.out.write(data[i]);
			
		}
		
		
		
		System.out.flush();
		
		}catch(IOException io) {
			
			System.out.println("Exception " + io);
		}
		
	}

}
