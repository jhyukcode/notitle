package com.company.java019;

import java.net.InetAddress;

public class Network001_InetAddress {
	public static void main(String[] args) {
		try {
		InetAddress local = InetAddress.getLocalHost();
		System.out.println("1. ip HostName : "+local.getHostName());
		System.out.println("2. ip HostAddress : "+local.getHostAddress());
		
		local = InetAddress.getByName("www.naver.com");
		System.out.println("3. naver : "+local);
		
		} catch (Exception e) {e.printStackTrace();}
	}
}
