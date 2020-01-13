package com.sist;

import javax.swing.*;

public class Ex07_ImagedJCheckBox {
	
	public static void main(String[] args) {
		
		JFrame jf = new JFrame();
		JPanel jp = new JPanel();
		jf.setTitle("과일 체크박스 예제");
		
		// 1-1. 이미지 아이콘을 만들자.
		ImageIcon apple =
				new ImageIcon("images\\apple.jpg");
		ImageIcon banana =
				new ImageIcon("images\\banana.jpg");
		ImageIcon cherry =
				new ImageIcon("images\\cherry.jpg");
		
		// 1-2. 컴포넌트를 만들어보자.
		JCheckBoxMenuItem jcb1 = new JCheckBoxMenuItem(apple);
		JCheckBoxMenuItem jcb2 = new JCheckBoxMenuItem(banana);
		JCheckBoxMenuItem jcb3 = new JCheckBoxMenuItem(cherry);
		
//		JCheckBox jcb1 = new JCheckBox(apple);
//		JCheckBox jcb2 = new JCheckBox(banana);
//		JCheckBox jcb3 = new JCheckBox(cherry);
//		
		
		
		// 2. 컴포넌트를 컨테이너에 올려야 한다.
		jp.add(jcb1);jp.add(jcb2);jp.add(jcb3);
		
		// 3. 컨테이너를 프레임에 올려야 한다.
		jf.add(jp);
		
		jf.setBounds(100, 100, 500, 500);
		
		jf.setVisible(true);
		
	}

}
