package com.oracle.threads;
import java.util.stream.IntStream;
public class MultipleThreadsEx1Main {
public static void main(String[] args) {
	System.out.println("Main Thread started running");
	Thread.currentThread().setPriority(10);
	FileDownloader downloader=new FileDownloader();
	Thread t1=new Thread(downloader);//NEW STATE
	t1.setName("child A");
	t1.setPriority(1);
	t1.start();//RUNNABLE STATE
	//CAN'T PREDICT 
	IntStream.rangeClosed(1, 5000).
	forEach(i->System.out.println(Thread.currentThread().getName()+i));
	System.out.println("Main Ends .....");
}
}
