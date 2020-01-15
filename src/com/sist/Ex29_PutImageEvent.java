package com.sist;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Ex29_PutImageEvent {

	public static void main(String[] args) {
		
		JFrame jf = new JFrame();
		JPanel jp = new JPanel();
		
		jf.setTitle("라디오 버튼 이벤트 예제");
		
		jp.setBackground(Color.GRAY);
		
		// 1. 컴포넌트를 만들어 보자.
		JRadioButton[] fruits = new JRadioButton[3]; // 라디오버튼 배열
		String[] text = {"사과", "배", "키위"}; // 라디오버튼의 문자열 배열
		ImageIcon appleImage = new ImageIcon("images\\apple.jpg");
		ImageIcon pearImage = new ImageIcon("images\\pear.jpg");
		ImageIcon kiwiImage = new ImageIcon("images\\kiwi.jpg");
		
		JLabel imageLabel = new JLabel(); // 이미지가 출력될 레이블
		
		ButtonGroup bg = new ButtonGroup();
		
		for(int i = 0; i < fruits.length; i++) {
			fruits[i] = new JRadioButton(text[i]);
			bg.add(fruits[i]);
			jp.add(fruits[i]);
			// 이벤트 처리
			fruits[i].addItemListener(new ItemListener() {
				
				@Override
				public void itemStateChanged(ItemEvent e) {
					if(fruits[0].isSelected()) {	// 사과가 선택된 경우
						imageLabel.setIcon(appleImage);
					} else if(fruits[1].isSelected()) {	// 배가 선택될 경우
						imageLabel.setIcon(pearImage);
					} else if(fruits[2].isSelected()) {	// 키위가 선택될 경우
						imageLabel.setIcon(kiwiImage);
					}
					
				}
			});
		}// for end 
		
		jf.add(jp, BorderLayout.NORTH);
		jf.add(imageLabel, BorderLayout.CENTER);
		
		// 이미지를 중앙에 정렬하는 방법
		imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		jf.setBounds(100, 100, 250, 250);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
		
	}

}
