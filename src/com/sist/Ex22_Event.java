package com.sist;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Ex22_Event {

	public static void main(String[] args) {

		JFrame jf = new JFrame();
		JPanel jp = new JPanel();
		
		jf.setTitle("버튼 이벤트 처리");
		JButton button = new JButton("Action");
		
		// 이벤트 관련 클래스를 객체 생성
		//MyButton listener = new MyButton();
		
		// 이벤트 리스너가 작동하기 위해서는 MyButton의 객체를
		// 생성하여 이벤트를 처리할 버튼 컴포넌트에 등록을 해야 함.
		//button.addActionListener(listener);
		
		jp.add(button);
		jf.add(jp);
		jf.setBounds(100, 100, 300, 300);
		jf.setResizable(false);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
		
		// 2. 무명클래스로 이벤트 리스너 작성
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(button.getText().equals("Action")) {
					button.setText("액션");
				} else {
					button.setText("Action");
				}
				
			}
		});

	}

}
