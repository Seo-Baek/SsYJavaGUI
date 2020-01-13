package com.sist;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Ex15_JMenu {

	public static void main(String[] args) {
		
		JFrame jf = new JFrame();
		JMenuBar bar = new JMenuBar();
		
		// 1. 메뉴를 만들어보자.
		JMenu jm1 = new JMenu("파일");
		JMenu jm2 = new JMenu("글자");
		JMenu jm3 = new JMenu("도움말");
		JMenu jm4 = new JMenu("글자체");
		JMenu jm5 = new JMenu("바탕색");
		jm2.add(jm4); jm2.add(jm5);
		
		// 2. 메뉴 아이템을 만들어보자.
		// 2-1. "파일" 메뉴에 들어갈 메뉴아이템 설정
		JMenuItem jmi1 = new JMenuItem("새파일");
		JMenuItem jmi2 = new JMenuItem("열기");
		JMenuItem jmi3 = new JMenuItem("저장");
		JMenuItem jmi4 = new JMenuItem("종료");
		
		// 2-2. "글자" -> "글자체" 메뉴에 들어갈 메뉴아이템 설정
		JMenuItem jmi5 = new JMenuItem("굴림, 기본, 10");
		JMenuItem jmi6 = new JMenuItem("궁서, 굵게, 30");
		JMenuItem jmi7 = new JMenuItem("돋움, 기울기, 20");
		
		// 2-3. "글자" -> "바탕색" 메뉴에 들어갈 메뉴아이템 설정
		JMenuItem jmi8 = new JMenuItem("노란색");
		JMenuItem jmi9 = new JMenuItem("초록색");
		JMenuItem jmi10 = new JMenuItem("파란색");
		
		// 2-4. "도움말" 메뉴에 들어갈 메뉴아이템 설정
		JMenuItem jmi11 = new JMenuItem("도움말");
		JMenuItem jmi12 = new JMenuItem("메모장 정보");
		
		// 3. 메뉴아이템(JMenuItem)을 메뉴(JMenu)에 올려야 한다.
		// 3-1. "파일" 메뉴에 들어갈 메뉴아이템을 올리자.
		jm1.add(jmi1);jm1.add(jmi2);jm1.add(jmi3);
		jm1.addSeparator();
		jm1.add(jmi4);
		
		// 3-2. "글자" 메뉴에 "글자체" 메뉴를 올리자.
		jm4.add(jmi5);jm4.add(jmi6);jm4.add(jmi7);
		jm2.add(jm4);
		
		jm5.add(jmi8);jm5.add(jmi9);jm5.add(jmi10);
		jm2.add(jm5);
		
		// 3-3. "도움말" 메뉴에 메뉴아이템을 올리자.
		jm3.add(jmi11);jm3.add(jmi12);
		
		// 4. 메뉴를 메뉴바에 올려야 한다.
		bar.add(jm1); bar.add(jm2); bar.add(jm3);
		
		// 5. 메뉴바를 프레임에 올려야 한다.
		jf.setJMenuBar(bar);
		
		jf.setBounds(100,100,300,300);
		jf.setResizable(false);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
		
		
		
	}

}
