package com.sist;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.*;

/*
 * 간단한 계산기 화면 구성 예제
 * 연산자는 라디오 버튼으로 구성하여 화면을 만들어 보세요.
 */
public class Ex20_Layout {

	public static void main(String[] args) {
		
		JFrame jf = new JFrame();
		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		JPanel jp3 = new JPanel();
		JPanel jp4 = new JPanel();
		JPanel jp5 = new JPanel();
		
		jf.setTitle("간단한 계산기 예제1");
		
		// North 컴포넌트
		JLabel jl1 = new JLabel("수 1 : ");
		JLabel jl2 = new JLabel("수 2 : ");
		JLabel jl3 = new JLabel("연산자");
		
		JTextField su1 = new JTextField(5);
		JTextField su2 = new JTextField(5);
		
		JRadioButton op1 = new JRadioButton("+");
		JRadioButton op2 = new JRadioButton("-");
		JRadioButton op3 = new JRadioButton("*");
		JRadioButton op4 = new JRadioButton("/");
		
		ButtonGroup op = new ButtonGroup();
		op.add(op1); op.add(op2); op.add(op3); op.add(op4);
		
		// Center 컴포넌트
		JTextArea area = new JTextArea(10, 20);
		JScrollPane jsp = new JScrollPane(
				area, 
				ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, 
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		area.setLineWrap(true);
		
		// South 컴포넌트
		JButton jb1 = new JButton("계산");
		JButton jb2 = new JButton("종료");
		JButton jb3 = new JButton("취소");
		
		
		jp1.setLayout(new BorderLayout());
		jp4.add(jl1); jp4.add(su1);
		jp4.add(jl2); jp4.add(su2);
		jp1.add(jp4, BorderLayout.NORTH);
		jp5.add(jl3);
		jp5.add(op1);jp5.add(op2);
		jp5.add(op3);jp5.add(op4);
		jp1.add(jp5, BorderLayout.SOUTH);
//		jp1.setLayout(new GridLayout(2, 1));
//		jp1.add(jp4); jp1.add(jp5);
		
		jp2.add(jsp);
		
		jp3.add(jb1);jp3.add(jb2);jp3.add(jb3);
		
		
		
		jf.add(jp1, BorderLayout.NORTH);
		jf.add(jp2, BorderLayout.CENTER);
		jf.add(jp3, BorderLayout.SOUTH);
		
		jf.setBounds(100, 100, 300, 300);
		jf.setResizable(false);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
		 
	}

}
