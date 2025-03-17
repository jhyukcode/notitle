package com.company.java019;

//	공유자원
class Rank{
	int num=0;
	public void plusnum() {
		int rank=num;
		try {Thread.sleep(1000);}catch(InterruptedException e) {e.printStackTrace();}
		num=rank+1;
	}
}
class User extends Thread{
	Rank rank;
	public User(Rank rank) {this.rank=rank;}
	@Override
	public void run() {
		rank.plusnum();
		System.out.println(rank.num+"등 >> "+getName());
	}
}

public class Thread005_synchronized {
	public static void main(String[] args) {
		Rank rank = new Rank();
		
		Thread user1 = new User(rank); user1.setName("sally"); user1.start();
		try {Thread.sleep(1000);}catch(InterruptedException e) {e.printStackTrace();}
		Thread user2 = new User(rank); user2.setName("alpha"); user2.start();
	}
}
