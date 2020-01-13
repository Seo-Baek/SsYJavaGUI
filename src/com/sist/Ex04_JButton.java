package com.sist;

import java.awt.Color;

import javax.swing.ImageIcon;
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
		
		// 3-1. 이미지 아이콘을 만들어 보자.
		ImageIcon cherry =
				new ImageIcon("images\\cherry.jpg");
		
		// 3-2. 버튼이라는 컴포넌트를 만들어 보자.
		JButton jb = new JButton("버튼1");
		JButton jb2 = new JButton("버튼2");
		JButton jb3 = new JButton("버튼3");
		JButton jb4 = new JButton(cherry);
		
		
		
		// 4. 버튼이라는 컴포넌트를 컨테이너에 올리자.
		jp.add(jb); jp.add(jb2); jp.add(jb3);jp.add(jb4);
		
		jb3.setEnabled(false);	// 예매 등을 할 때 선택된 것은 비활성화시켜줄 수 있다
		
		// 5. 컨테이너를 프레임에 올리자.
		jf.add(jp);
		
		// 화면의 크기와 위치를 설정해주자.
		jf.setBounds(100, 100, 300, 300);
		
		jf.setVisible(true);
	}

}
