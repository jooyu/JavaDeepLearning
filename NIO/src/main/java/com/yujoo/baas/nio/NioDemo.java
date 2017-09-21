package com.yujoo.baas.nio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * java nio 
 * @author eaves.zhu
 *NIO的三个核心：channels，buffers,Selectors
 *允许单个线程处理多个channel
 *
 */
public class NioDemo {

	public static void main(String[] args) {
		RandomAccessFile aFile = null;
		try {
			aFile = new RandomAccessFile("data/nio-data.txt", "rw");
		} catch (FileNotFoundException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
	
		FileChannel inChannel = aFile.getChannel();
		ByteBuffer buf = ByteBuffer.allocate(48);
		
		int bytesRead = 0;
		try {
			bytesRead = inChannel.read(buf);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
       while(bytesRead!=-1)
       {
    	   System.out.println("read:"+bytesRead);
       }
		String data="hello";
		ByteBuffer buf1 = ByteBuffer.allocate(48);
		buf1.clear();
		buf1.put(data.getBytes());
		buf1.flip();
		while(buf1.hasRemaining())
		{
			try {
				inChannel.write(buf1);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	
	}
}
