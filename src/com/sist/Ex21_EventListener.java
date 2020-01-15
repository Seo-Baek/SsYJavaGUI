package com.sist;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/*
 * Event Handler(이벤트 핸들러)
 * 	- 각 컴포넌트에 대하여 특정 행위를 하였을 때 그것에 대한
 *    작업을 처리할 수 있도록 하는 것.
 *	- 이벤트를 처리하는 자바 프로그램 코드로서 클래스를 만듬.
 *    이벤트 리스너 인터페이스를 제공하며, 개발자는 이 인터페이스를
 *    상속을 받고 추상 메소드를 구현하여 이벤트 리스너를 작성한다.
 *	- 현재 발생한 이벤트에 관한 정보를 가진 객체. 이벤트 리스너에게 전달됨.
 *    => 예를 든다면 버튼을 눌렀다던지, 리스트 메뉴를 선택하였을 때 등등
 *	- 이벤트 발생 : ActionEvent 클래스 => ActionListener
 *	- 이벤트 리스너는 모두가 다 인터페이스임(xxxListener)
 *	- 이벤트 리스너 작성 과정
 *     1. 이벤트와 이벤트 리스너 선택 - 목적에 적합한 이벤트와 리스너 인터페이스 선택
 *     2. 이벤트 리스너 클래스 작성 - 리스너 인터페이스를 상속받은 클래스를 작성하고
 *                            추상메소드를 모두 구현.
 *     3. 이벤트 리스너 등록 - 이벤트를 받을 스윙 컴포넌트에 이벤트 리스너 등록
 */

public class Ex21_EventListener {

	public static void main(String[] args) {
		
		JFrame jf = new JFrame();
		JPanel jp = new JPanel();
		
		jf.setTitle("버튼 이벤트 처리");
		JButton button = new JButton("Action");
		
		// 이벤트 관련 클래스를 객체 생성
		MyButton listener = new MyButton();
		
		// 이벤트 리스너가 작동하기 위해서는 MyButton의 객체를
		// 생성하여 이벤트를 처리할 버튼 컴포넌트에 등록을 해야 함.
		button.addActionListener(listener);
		
		jp.add(button);
		jf.add(jp);
		jf.setBounds(100, 100, 300, 300);
		jf.setResizable(false);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
		
	}

}

class MyButton implements ActionListener {
	
	// 이벤트가 발생했을 때 처리할 내용
	@Override
	public void actionPerformed(ActionEvent e) {
		// getSource() : 메소드를 통해서 이벤트 리스너를 등록한 무엇인가를
		//               실행할 때 그 이벤트가 실행되는 특정 컴포넌트의
		//               속성을 가져올 수 있음.
		JButton btn = (JButton)e.getSource();
		
		if(btn.getText().equals("Action")) {
			btn.setText("액션"); // setText() : 버튼의 문자열을 바꾸는 메소드.
		} else {
			btn.setText("Action");
		}
		
	}
}
