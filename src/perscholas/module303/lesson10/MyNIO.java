package perscholas.module303.lesson10;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;

public class MyNIO {

	public static String locationFile1 = "C:\\Users\\zachg\\Documents\\file1.txt";
	public static String locationFile2 = "C:\\Users\\zachg\\Documents\\file2.txt";
	
	public static void main(String[] args) throws IOException {
		//exampleOne();
		exampleTwo();
	}
	
	public static void exampleOne() throws IOException {
		
		String[] inputFiles = {locationFile1, locationFile2};
		String outputFile = "C:\\Users\\zachg\\Documents\\nioOutput.txt";
		
		FileOutputStream fos = new FileOutputStream(outputFile);
		FileChannel targetChannel = fos.getChannel();
		
		for(int i = 0; i < inputFiles.length; i++) {
			FileInputStream fis = new FileInputStream(inputFiles[i]);
			FileChannel inputChannel = fis.getChannel();
			long size = inputChannel.size();
			ByteBuffer buf = ByteBuffer.allocate((int)size);
			//System.out.println((char)buf.get());
			while(inputChannel.read(buf) > 0) {
				buf.flip();
				while (buf.hasRemaining()) {
					//System.out.println((char) buf.get());
					targetChannel.write(buf);
				}
			}
		}
		System.out.println("Contents outputted to \"nioOutput\" on location machine");
	}
	
	public static void exampleTwo() throws IOException {
		String[] inputFiles = {locationFile1, locationFile2};
		String outputFile = "C:\\Users\\zachg\\Documents\\OutputExampleTwo.txt";
		
		FileOutputStream fos = new FileOutputStream(outputFile);
		WritableByteChannel targetChannel = fos.getChannel();
		for (int i = 0; i < inputFiles.length; i++) {
			FileInputStream fis = new FileInputStream(inputFiles[i]);
			FileChannel inputChannel = fis.getChannel();
			inputChannel.transferTo(0, inputChannel.size(), targetChannel);
			inputChannel.close();
			fis.close();
		}
		targetChannel.close();
		fos.close();
		System.out.println("Created \"OutputExampleTwo\" in local machine");
	}
}
