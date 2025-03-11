package com.company.java014_ex;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
//	1. 클래스는 부품개체 (멤버변수 / 멤버함수)
//	2. 조립
class MyView2{
	JFrame frame; JButton button;
	public MyView2() {
		frame = new JFrame("BOX");
		button = new JButton("BUTTON");
	}
	public void create() {
		frame.add(button);
		frame.setSize(300,300);
		frame.setVisible(true);
//		2-1. frame.add
//		2-2. frame.setSize(width,height)
//		2-3. frame.setVisible
		button.addActionListener(new ActionListener() {
			@Override public void actionPerformed(ActionEvent e) { JOptionPane.showMessageDialog(null, "click!"); } }); 
		// 이벤트대상.이벤트(핸들러)
}}
public class NoNameClassEx002_2 {
	public static void main(String[] args) {
		new MyView2().create();
	}
}
