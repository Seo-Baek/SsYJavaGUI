package com.sist;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Ex24_TextEvent {

	public static void main(String[] args) {
		
		// text field에 입력하면 text area에 출력
		
		JFrame jf = new JFrame();
		JPanel jp = new JPanel();
		
		jf.setTitle("텍스트 영역 이벤트 처리");
		
		// 1. 컴포넌트를 만들어 보자.
		JLabel j1 = new JLabel("입력 후 <Enter> 키를 입력하세요.");
		JTextField jtf = new JTextField(20);
		JTextArea jta = new JTextArea(7, 20);
		JScrollPane jsp = new JScrollPane(
				jta,
				ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,	 
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		jta.setLineWrap(true);
		
		// 2. 컴포넌트를 컨테이너에 올려야 한다.
		jp.add(j1); jp.add(jtf); jp.add(jsp);
		
		// 3. 컨테이너에 프레임을 올려야 한다.
		jf.add(jp);
		jf.setBounds(100, 100, 300, 250);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
		
		// 4. 이벤트 처리
		// 텍스트필드(jtf)에 입력 후 <Enter> 키를 입력 시
		// 컴포넌트에 이벤트가 발생 후 이벤트 처리
		jtf.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 텍스트필드에 입력된 내용을 얻어야 함.
				jta.append(jtf.getText() + "\n");
				jtf.setText(null);  // jtf.settext("");
			}
		});
		
		
	}
}
