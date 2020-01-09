package com.sist;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex04_JButton {

	public static void main(String[] args) {
		
		// 1. 프레임을 만들자.
		JFrame jf = new JFrame();
		
		// 2. 컨테이너를 만들자
		JPanel jp = new JPanel();
		
		jp.setBackground(Color.ORANGE);
		
		// 3. 버튼이라는 컴포넌트를 만들어 보자.
		JButton jb = new JButton("버튼1");
		JButton jb2 = new JButton("버튼2");
		JButton jb3 = new JButton("버튼3");
		
		// 4. 버튼이라는 컴포넌트를 컨테이너에 올리자.
		jp.add(jb); jp.add(jb2); jp.add(jb3);
		
		// 5. 컨테이너를 프레임에 올리자.
		jf.add(jp);
		
		// 화면의 크기와 위치를 설정해주자.
		jf.setBounds(100, 100, 400, 400);
		
		jf.setVisible(true);
	}

}
