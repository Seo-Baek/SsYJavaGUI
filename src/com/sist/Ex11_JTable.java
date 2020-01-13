package com.sist;

import javax.swing.*;

public class Ex11_JTable {

	public static void main(String[] args) {
		
		JFrame jf = new JFrame();
		
		jf.setTitle("JTable 예제");
		
		// 1. 컴포넌트를 만들어 보자.
		String[] header = {"학생이름", "국어점수", "영어점수", "수학점수"};
		
		String[][] contents = {
				
								{"홍길동", "94", "88", "90"},
								{"이순신", "90", "72", "89"},
								{"유관순", "91", "71", "90"},
								{"김유신", "88", "67", "78"},
								{"김연아", "97", "98", "90"},
								{"강감찬", "71", "70", "66"},
								{"을지문덕", "64", "77", "75"},
								{"백종원", "89", "85", "97"},
								{"유재석", "84", "80", "83"},
								{"강호동", "80", "80", "80"}
						};
		JTable table = new JTable(contents, header);
		
		// 1-1. 스크롤 기능을 추가해 주자.
		JScrollPane jsp = new JScrollPane(
				table,			// 스크롤 바가 보여질 컴포넌트
				ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,		// 수직으로 스크롤 바를 설치할 여부 확인
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		// 2. 컴포넌트를 프레임에 올려야 한다.
		jf.add(jsp);
		jf.setBounds(100,100,200,200);
		jf.setResizable(false);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
	}

}
