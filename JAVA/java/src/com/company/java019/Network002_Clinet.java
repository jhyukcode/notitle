package com.company.java019;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Network002_Clinet {
	public static void main(String[] args) {
		// 2. 고객이 통신사에 연락 #2 실행 client
		Socket socket=null;
		
		try { 
			socket = new Socket("127.0.0.1", 7703); 
			System.out.println("[CLIENT] 2. AS[CONNECTING] ");
			
			Thread sender = new Sender(socket); sender.start();
			Thread receiver = new Receiver(socket); receiver.start();
			
		} catch (UnknownHostException e)  {e.printStackTrace();
		} catch (IOException e) {e.printStackTrace();}
		
		// 4. 데이터 주고 받기
	}
}
