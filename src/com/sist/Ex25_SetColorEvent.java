package com.sist;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Ex25_SetColorEvent {

	public static void main(String[] args) {
		
		JFrame jf = new JFrame();
		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		
		jf.setTitle("이벤트처리");
		
		// 1. 컴포넌트를 만들어 보자.
		JButton red = new JButton("RED");
		JButton yellow = new JButton("YELLOW");
		JButton blue = new JButton("BLUE");
		
		// 2. 컴포넌트를 컨테이너에 올려야 한다.
		jp1.add(red); jp1.add(yellow); jp1.add(blue);
		
		// 3. 컨테이너를 프레임에 올려주어야 한다.
		jf.add(jp2, BorderLayout.CENTER);
		jf.add(jp1, BorderLayout.SOUTH);
		
		jf.setBounds(100,100,300,300);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
		
		// 4. 이벤트 처리
		red.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jp2.setBackground(Color.RED);
			}
		});

		yellow.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jp2.setBackground(Color.YELLOW);	
			}
		});
		
		blue.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jp2.setBackground(Color.BLUE);
			}
		});
		
	}

}
