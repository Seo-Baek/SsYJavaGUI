package com.sist;

import javax.swing.*;

public class Ex14_Exam {

	public static void main(String[] args) {
		
		JFrame jf = new JFrame();
		JPanel jp = new JPanel();
		
		jf.setTitle("종합 예제");
		
		// 1. 컴포넌트를 만들어 보자.
		JLabel jl1 = new JLabel("아이디 : ");
		JTextField id = new JTextField(10);
		
		JLabel jl2 = new JLabel("비밀번호 : ");
		JPasswordField pwd = new JPasswordField(10);
		
		JLabel jl3 = new JLabel("하고 싶은 말");
		JTextArea jta = new JTextArea(5, 30);
		
		JScrollPane jsp = new JScrollPane(
				jta, 	// 스크롤 바가 나타날 컴포넌트
				ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				// 수직 스크롤 사용
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
				// 수평 스크롤 미사용
		
		// 2. 컴포넌트를 컨테이너에 올려야 한다.
		jp.add(jl1); jp.add(id);
		jp.add(jl2); jp.add(pwd);
		jp.add(jl3); jp.add(jsp);
		
		// 3. 컨테이너를 프레임에 올려야 한다.
		jf.add(jp);
		jf.setBounds(100, 100, 400, 200);
		jf.setResizable(false);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
		
		
	}
}
