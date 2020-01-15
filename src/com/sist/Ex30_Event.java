package com.sist;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Ex30_Event {

	public static void main(String[] args) {
		
		JFrame jf = new JFrame();
		JMenuBar bar = new JMenuBar();
		
		JLabel label = new JLabel("Hello");
		label.setFont(new Font("Ravie", Font.ITALIC, 30));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		
		JMenu jm = new JMenu("Text");
		
		JMenuItem jmi = new JMenuItem("Color");
		
		jm.add(jmi);
		
		bar.add(jm);
		
		jf.setJMenuBar(bar);
		jf.add(label, BorderLayout.CENTER);
		
		jf.setBounds(100, 100, 250, 200);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
		
		// 이벤트 처리
		jmi.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Color selectedColor = 
						JColorChooser.showDialog(null, "색상", Color.YELLOW);
				if(selectedColor != null) {
					label.setForeground(selectedColor);
				}
			
				
			}
		});
	}

}
