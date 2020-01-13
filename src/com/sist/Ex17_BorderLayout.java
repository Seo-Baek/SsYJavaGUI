package com.sist;

import java.awt.BorderLayout;

import javax.swing.*;

/*
 *  2. BorderLayout 배치관리자
 *  	- 배치 : 동, 서, 남, 북, 중앙
 */

public class Ex17_BorderLayout {

	public static void main(String[] args) {
		
		JFrame jf = new JFrame();
		//JPanel jp = new JPanel();
		
		jf.setTitle("BorderLayout 예제");
		
		// 1. 컴포넌트를 만들어 보자.
		JButton jb1 = new JButton("버튼1");
		JButton jb2 = new JButton("버튼2");
		JButton jb3 = new JButton("버튼3");
		JButton jb4 = new JButton("버튼4");
		JButton jb5 = new JButton("버튼5");
		
		// 2. 컴포넌트를 프레임에 올려보자.
		jf.add(jb1, BorderLayout.NORTH);	// 북쪽(상단)에 배치
		jf.add(jb2, BorderLayout.SOUTH);	// 서쪽(왼쪽)에 배치	
		jf.add(jb3, BorderLayout.EAST);		// 동쪽(오른쪽)에 배치
		jf.add(jb4, BorderLayout.WEST);		// 남쪽(하단)에 배치
		jf.add(jb5, BorderLayout.CENTER);	// 중앙(중앙)에 배치
		
		jf.setBounds(100, 100, 300, 300);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
		
		
	}

}
