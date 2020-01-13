package com.sist;

import java.awt.GridLayout;

import javax.swing.*;

/*
 * 3. GridLayout 배치관리자
 * 		- 격자 모양의 배치 관리자.
 * 		- 행과 열로 화면이 구성이 됨.
 *        기준 : 무조건 행이 기준이 됨.
 */

public class Ex18_GridLayout {

	public static void main(String[] args) {
		
		JFrame jf = new JFrame();
		JPanel jp = new JPanel();
		
		jf.setTitle("GridLayout 예제");
		
		// 1. 컴포넌트를 만들어 보자.
		JButton jb1 = new JButton("버튼1");
		JButton jb2 = new JButton("버튼2");
		JButton jb3 = new JButton("버튼3");
		JButton jb4 = new JButton("버튼4");
		JButton jb5 = new JButton("버튼5");
		JButton jb6 = new JButton("버튼6");
		
		jp.setLayout(new GridLayout(2,3));	// 2행3열 GridLayout 생성
		// 미리 레이아웃을 잡아주지 않고 컴포넌트를 올리면 FlowLayout로 지정
		
		// 2. 컴포넌트를 컨테이너에 올려주어야 한다.
		jp.add(jb1); jp.add(jb2); jp.add(jb3);
		jp.add(jb4); jp.add(jb5); jp.add(jb6);
		
		// 3. 컨테이너를 프레임에 올려주어야 한다.
		jf.add(jp);
		jf.setBounds(100, 100, 300, 300);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
	}

}
