package com.company.java019;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.text.SimpleDateFormat;

public class Network002_Server {
	public static void main(String[] args) {
		// 1. 서버소켓 - [ , , , ] #1 실행 ascenter
		ServerSocket ascenter=null;
		Socket socket;
		
		try {
			ascenter = new ServerSocket(7703);
			System.out.println("[SERVER] 1. SERVER READY A/S OPEN");
		} catch (IOException e) {e.printStackTrace();}
		
		// 3. 클라이언트 요청 > 상담사(Socket)와 연결
		try {
			socket = ascenter.accept();	// socket은 고객의 정보를 가지고 있음
			System.out.println("[CONNECTING] 3. CLIENT↔SERVER");
			
			Thread sender = new Sender(socket); sender.start();
			Thread receiver = new Receiver(socket); receiver.start();

		} catch (IOException e) {e.printStackTrace();}
		
		// 4. 데이터 주고 받기

	}
}
// Thread - 1) extends 상속	2) run 구현	3) start 작업수행클래스 실행
// 말하기 기능 클래스		InputStream	> [프로그램] > OutputStream #
class Sender extends Thread{
	Socket socket; DataOutputStream out; String who; SimpleDateFormat sdf;
	public Sender() {}
	public Sender(Socket socket) {
		this.socket = socket;
		try {
			out = new DataOutputStream(socket.getOutputStream());
			out.writeUTF("[CONNECTED] CHAT START > ");
			this.who="["+(socket.getPort()==7703?"Clinet":"Server")+"] ";
			this.sdf=new SimpleDateFormat("(hh:mm:ss) ");
			} catch(IOException e) {e.printStackTrace();}
		}
	
	@Override
	public void run() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
		while(out!=null) { 
			String data = br.readLine();
			String time=sdf.format(System.currentTimeMillis());
			out.writeUTF(who+time+data); 
			}
		} catch(Exception e) {
//			e.printStackTrace();
			System.out.println("[DISCONNECTED] "+socket);
		} finally {
			try {
			if(out!=null) {out.close();}
			if(br!=null) {br.close();}
			if(!socket.isClosed()) {socket.close();}
			} catch (Exception e) {e.printStackTrace();}
		}
	}
}

// 듣기 기능 클래스		InputStream # > [프로그램] > OutputStream
class Receiver extends Thread{
	Socket socket; DataInputStream in;
	public Receiver () {}
	public Receiver(Socket socket) {
		this.socket = socket;
		try {in=new DataInputStream(socket.getInputStream());}
		catch(IOException e) { e.printStackTrace(); }
	}
	@Override
	public void run() {
		try {
			while(in!=null) { System.out.println(in.readUTF()); }
		} catch(Exception e) 
		{System.out.println("[DISCONNECTED] "+socket);
		} finally {
			try {
				if(in!=null) { in.close(); }
				if(!socket.isClosed()) {socket.close();}
		} catch (Exception e) {e.printStackTrace();}
	}
	}
}