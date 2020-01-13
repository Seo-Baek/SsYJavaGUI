package com.sist;

import javax.swing.*;

public class Ex06_JRadioButton {

	public static void main(String[] args) {
		
		JFrame jf = new JFrame();
		
		JPanel jp = new JPanel();
		
		jf.setTitle("JRadioButton 예제");
		
		// 1. 컴포넌트를 만들어 보자.
		JRadioButton jrb1 = new JRadioButton("게임");
		JRadioButton jrb2 = new JRadioButton("영화 감상");
		JRadioButton jrb3 = new JRadioButton("잠자기", true);
		JRadioButton jrb4 = new JRadioButton("사진");
		JRadioButton jrb5 = new JRadioButton("운동");
		
		// 1-1. 라디오버튼을 ButtonGroup에 추가해 주어야 한다.
		ButtonGroup bg = new ButtonGroup();
		bg.add(jrb1);bg.add(jrb2);
		bg.add(jrb3);bg.add(jrb4);bg.add(jrb5);
		
		// 2. 컴포넌트를 컨테이너에 올려야 한다.
		jp.add(jrb1);jp.add(jrb2);
		jp.add(jrb3);jp.add(jrb4);jp.add(jrb5);
		
		// 3. 컨테이너를 프레임에 올려야 한다.
		jf.add(jp);
		
		jf.setBounds(100, 100, 300, 300);
		
		jf.setVisible(true);
		
	}

}
