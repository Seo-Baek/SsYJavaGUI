package com.sist;

import javax.swing.*;

public class Ex10_JList {

	public static void main(String[] args) {
		
		JFrame jf = new JFrame();
		
		JPanel jp = new JPanel();
		
		jf.setTitle("JList 예제");
		
		// 1. 컴포넌트를 만들어 보자.
		String[] job = {"회사원", "공무원", "학생", "주부", "기타"};
		JList<String> list = new JList<String>(job);
		
		list.setSelectedIndex(2);
		
		// 2. 컴포넌트를 컨테이너에 올리자.
		jp.add(list);
		
		// 3. 컨테이너를 프레임에 올리자.
		jf.add(jp);
		
		jf.setBounds(100, 100, 300, 300);
		
		// 화면 프레임의 크기를 변동시키지 않는 방법
		jf.setResizable(false);
		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jf.setVisible(true);
	}

}