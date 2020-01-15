package practice;

import java.awt.BorderLayout;

import javax.swing.*;

public class Exam02 {

	public static void main(String[] args) {
		
		JFrame jf = new JFrame();
		JPanel jp1 = new JPanel(new BorderLayout());
		JPanel menu = new JPanel();
		JPanel calc = new JPanel();
		JPanel jp3 = new JPanel();
		JPanel jp4 = new JPanel();
		
		JLabel title = new JLabel("원하는 커피 선택");
		JLabel count = new JLabel("수량 : ");
		JLabel money = new JLabel("입금액 : ");
		JRadioButton pro1 = new JRadioButton("아메리카노(2500)");
		JRadioButton pro2 = new JRadioButton("카페모카(3500)");
		JRadioButton pro3 = new JRadioButton("에스프레소(2500)");
		JRadioButton pro4 = new JRadioButton("카페라떼(4000)");
		ButtonGroup bg = new ButtonGroup();
		bg.add(pro1); bg.add(pro2); bg.add(pro3); bg.add(pro4);
		
		JTextField cf = new JTextField(10);
		JTextField mf = new JTextField(10);
		
		JTextArea area = new JTextArea(10, 50);
		JScrollPane jsp = new JScrollPane(
				area,
				ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		area.setLineWrap(true);
		
		JButton jb1 = new JButton("계산");
		JButton jb2 = new JButton("종료");
		JButton jb3 = new JButton("취소");
		
		jp4.add(title);
		menu.add(pro1);menu.add(pro2);menu.add(pro3);menu.add(pro4);
		calc.add(count); calc.add(cf); calc.add(money); calc.add(mf);
		
		jp1.add(jp4, BorderLayout.NORTH);
		jp1.add(menu, BorderLayout.CENTER);
		jp1.add(calc, BorderLayout.SOUTH);
		
		
		jp3.add(jb1);jp3.add(jb2);jp3.add(jb3);
		
		jf.add(jp1, BorderLayout.NORTH);
		jf.add(jsp, BorderLayout.CENTER);
		// 패널을 쓰지 않는 대신 area가 프레임을 늘리는 만큼 끝없이..ㅋㅋ
		jf.add(jp3, BorderLayout.SOUTH);
		
		//jf.setBounds(100, 100, 300, 500);
		
		jf.pack();
		
		jf.setResizable(false);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
				
		
	}

}
