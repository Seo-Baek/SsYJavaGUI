package com.sist;

import java.awt.Color;

import javax.swing.*;

public class Ex12_JTabbedPane {

	public static void main(String[] args) {
		
		JFrame jf = new JFrame();
		jf.setTitle("탭 예제");
		JTabbedPane tab = new JTabbedPane();
		
		// 1. 컨테이너를 탭의 갯수만큼 만들어 주어야 한다.
		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		JPanel jp3 = new JPanel();
		
		// 2-1-1. 첫번째 탭에 올라갈 컴포넌트를 만들어 보자.
		JButton jb1 = new JButton("버튼1");
		JButton jb2 = new JButton("버튼2");
		JButton jb3 = new JButton("버튼3");
		
		
		// 2-1-2. 첫번째 탭의 컴포넌트를 컨테이너에 올려야 한다.
		jp1.add(jb1);jp1.add(jb2);jp1.add(jb3);
		
		// 2-2-1. 두번째 탭에 올라갈 컴포넌트를 만들어 보자.
		JCheckBox jcb1 = new JCheckBox("여행");
		JCheckBox jcb2 = new JCheckBox("운동");
		JCheckBox jcb3 = new JCheckBox("잠자기");
		JCheckBox jcb4 = new JCheckBox("게임");
		
		// 2-2-2. 두번째 탭의 컴포넌트를 컨테이너에 올려야 한다.
		jp2.add(jcb1);jp2.add(jcb2);
		jp2.add(jcb3);jp2.add(jcb4);
		
		// 2-3-1. 세번쨰 탭의 컴포넌트를 만들어 보자.
		JToggleButton jtb1 = new JToggleButton("토글1");
		JToggleButton jtb2 = new JToggleButton("토글2");
		JToggleButton jtb3 = new JToggleButton("토글3");
		
		// 2-3-2. 세번째 탭의 컴포넌트를 컨테이너에 올려야 한다.
		jp3.add(jtb1);jp3.add(jtb2);jp3.add(jtb3);
		
		jp1.setBackground(Color.ORANGE);
		jp2.setBackground(Color.CYAN);
		jp3.setBackground(Color.PINK);
		// 3. 각각의 컨테이너를 tab에 올려야 한다.
		tab.add("버튼",jp1);tab.add("체크박스",jp2);tab.add("토글",jp3);
		
		// 4. 각각의 tab을 프레임에 올려야 한다.
		jf.add(tab);
		
		// 탭의 위치를 변경하는 방법
		//tab.setTabPlacement(JTabbedPane.BOTTOM);
		tab.setTabPlacement(JTabbedPane.LEFT);
		
		jf.setBounds(100, 100, 300, 300);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setResizable(false);
		jf.setVisible(true);
		
		
		
	}

}
