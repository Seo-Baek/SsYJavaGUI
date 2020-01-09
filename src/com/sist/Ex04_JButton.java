package com.sist;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ex04_JButton {

	public static void main(String[] args) {
		
		//1. 프레임을 만들자.
		JFrame jf = new JFrame();
		
		Container container = jf.getContentPane();
		
		container.setBackground(Color.ORANGE);//프레임의 배경색을 오렌지색으로 설정
		
		// 2. 버튼이라는 컴포넌트를 만들어 보자.
		JButton jb = new JButton("버튼1");
		
		// 3. 버튼이라는 컴포넌트를 컨테이너에 올리자.
		container.add(jb);
		
		// 4. 컨테이너를 프레임에 올리자.
		jf.add(container);
	}

}
