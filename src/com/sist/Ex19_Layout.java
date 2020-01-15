package com.sist;

import java.awt.BorderLayout;

//간단한 계산기 화면 구성 예제

import javax.swing.*;

public class Ex19_Layout {

	public static void main(String[] args) {
		
		JFrame jf = new JFrame();
		
		JPanel jp1 = new JPanel();	// North (상단)
		JPanel jp2 = new JPanel();	// Center(중앙)
		JPanel jp3 = new JPanel();	// South(하단)
		
		jf.setTitle("간단한 계산기 예제");
		
		// 1. 컴포넌트를 만들어 보자.
		// 1-1. North(상단)에 들어갈 컴포넌트
		JLabel jl1 = new JLabel("수1 : ");
		JTextField su1 = new JTextField(5);
		JLabel jl2 = new JLabel("수2 : ");
		JTextField su2 = new JTextField(5);
		JLabel jl3 = new JLabel("연산자 : ");
		JTextField op = new JTextField(5);

		// 1-2. Center(중앙)에 들어갈 컴포넌트
		JTextArea jta = new JTextArea(8,30);
		JScrollPane jsp = new JScrollPane(
				jta, 
				ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, 
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		// 자동으로 줄바꿈 기능을 제공하는 메소드
		jta.setLineWrap(true);
				
		// 1-3. South(하단)에 들어갈 컴포넌트
		JButton jb1 = new JButton("계산");
		JButton jb2 = new JButton("종료");
		JButton jb3 = new JButton("취소");
		
		// 2. 컴포넌트를 컨테이너에 올려주어야 한다.
		// 2-1. jp1(NOUTRH) 컨테이너에 1-1 컴포넌트들을 올려주자.
		jp1.add(jl1); jp1.add(su1);
		jp1.add(jl2); jp1.add(su2);
		jp1.add(jl3); jp1.add(op);
		
		// 2-2. jp2(CENTER) 컨테이너에 1-2 컴포넌트들을 올려주자.
		jp2.add(jsp);
		
		// 2-3. jp3(SOUTH) 컨테이너에 1-3 컴포넌트들을 올려주자.
		jp3.add(jb1);jp3.add(jb2);jp3.add(jb3);
		
		// 3. 3개의 컨테이너들을 프레임에 올려주어야 한다.
		jf.add(jp1, BorderLayout.NORTH);
		jf.add(jp2, BorderLayout.CENTER);
		jf.add(jp3, BorderLayout.SOUTH);
		
		jf.setBounds(100, 100, 350, 300);
		jf.setResizable(false);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
		
	}

}
