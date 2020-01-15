package com.sist;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Ex23_MkJOPEvent {

	public static void main(String[] args) {
		
		JFrame jf = new JFrame();
		JPanel jp = new JPanel();
		
		// 1. 컴포넌트를 만들어 보자.
		JButton jb1 = new JButton("입력");
		JButton jb2 = new JButton("종료");
		
		// 2. 컴포넌트를 컨테이너에 올려야 한다.
		jp.add(jb1); jp.add(jb2);
		
		// 3. 컨테이너를 프레임에 올려야 한다.
		jf.add(jp, BorderLayout.SOUTH);
		jf.setBounds(100,100,300,300);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
		
		// 4. 이벤트 처리
		// 입력(jb1) 버튼을 클릭했을 떄 이벤트 처리
		jb1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("입력 버튼 클릭");
				JOptionPane.showMessageDialog(jb1, "입력 버튼 클릭.");
				// 입력버튼을 눌렀을 떄 메세지가 나와야하므로
				// 다이얼로그의 부모컴포넌트는 버튼이 된다.
				// 버튼 위에 생성되었다!
			}
		});
		
		// 종료(jb2) 버튼을 클릭했을 때 이벤트 처리
		jb2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 시스템을 종료시키는 명령어
				System.exit(0);
			}
		});
		
	}
}
