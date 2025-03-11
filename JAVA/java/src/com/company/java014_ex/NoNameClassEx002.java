package com.company.java014_ex;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
//	1. 클래스는 부품개체 (멤버변수 / 멤버함수)
//	2. 조립

class myView implements ActionListener{
	JFrame frame; JButton button;
	
	public myView() {
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
		button.addActionListener(this);	// 이벤트대상.이벤트(핸들러)
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "click!");
	}
}

public class NoNameClassEx002 {
	public static void main(String[] args) {
		new myView().create();
	}
}
