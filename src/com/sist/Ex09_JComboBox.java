package com.sist;

import javax.swing.*;

public class Ex09_JComboBox {

	public static void main(String[] args) {
		
		JFrame jf = new JFrame();
		JPanel jp = new JPanel();
		
		jf.setTitle("JComboBox 예제");
		
		// 1. 컴포넌트를 만들어 보자.
		String[] job = {"회사원", "공무원", "학생", "주부", "기타"};
		JComboBox<String> jcb = new JComboBox<String>(job);
		// jcb.setSelectedIndex(2);		콤보박스가 생성될 때 파라미터 인덱스가 디폴트로 나온다.
		jcb.setSelectedItem("주부");	  //콤보박스가 생성될 때 파라미터 오브젝트가 디폴트로 나온다.
		
		
		// 2. 컴포넌트를 컨테이너에 올려야 한다.
		jp.add(jcb);
		
		// 3. 컨테이너를 프레임에 올려야 한다.
		jf.add(jp);
		
		jf.setBounds(100,100,300,300);
		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jf.setVisible(true);
	}

}
