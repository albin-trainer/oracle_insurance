package com.oracle.threads;
import java.util.stream.IntStream;
public class FileDownloader implements Runnable{
	public void run() {
		//B logic for file downloading ..
		System.out.println("Child Thread started running ..");
		IntStream.rangeClosed(1, 5000).
		forEach(i->System.out.println(Thread.currentThread().getName()+"  "+i));
		System.out.println("Child ends ..");
	}
	
}
