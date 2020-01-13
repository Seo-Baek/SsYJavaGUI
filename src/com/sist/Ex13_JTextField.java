package com.sist;

import javax.swing.*;

public class Ex13_JTextField {

	public static void main(String[] args) {
	
		JFrame jf = new JFrame();
		JPanel jp = new JPanel();
		
		jf.setTitle("JTextField 예제");
		
		// 1. 컴포넌트를 만들어 보자.
		JLabel jl1 = new JLabel("이름");
		JTextField jtf1 = new JTextField(20);
		
		JLabel jl2 = new JLabel("학과");
		JTextField jtf2 = new JTextField(20);
		
		JLabel jl3 = new JLabel("주소");
		JTextField jtf3 = new JTextField(20);
		
		// 2. 컴포넌트를 컨테이너에 올려야 한다.
		jp.add(jl1); jp.add(jtf1);
		jp.add(jl2); jp.add(jtf2);
		jp.add(jl3); jp.add(jtf3);
		
		// 3. 컨테이너를 프레임에 올려야 한다.
		jf.add(jp);
		
		jf.setBounds(100, 100, 280, 200);
		jf.setResizable(false);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
	}

}
