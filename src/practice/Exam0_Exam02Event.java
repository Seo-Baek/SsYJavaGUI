package practice;

import java.awt.BorderLayout;
import java.awt.event.*;
import javax.swing.*;

public class Exam0_Exam02Event {

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
		
		// event 처리
		jb1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				int price = 0;
				
				if(pro1.isSelected()) {
					area.append("커피종류 : 아메리카노" + "\n");
					area.append("커피단가 : 2500원" + "\n");
					price = 2500;
				} else if(pro2.isSelected()) {
					area.append("커피종류 : 카페모카" + "\n");
					area.append("커피단가 : 3500원" + "\n");
					price = 3500;
				} else if(pro3.isSelected()) {
					area.append("커피종류 : 에스프레소" + "\n");
					area.append("커피단가 : 2500원" + "\n");
					price = 2500;
				} else if(pro2.isSelected()) {
					area.append("커피종류 : 카페라떼" + "\n");
					area.append("커피단가 : 4000원" + "\n");
					price = 4000;
				}
				
				int qua = Integer.parseInt(cf.getText());
				area.append("수  량 : " + qua + "\n");
				
				int mul = price * qua;
				int vat = mul / 10;
				int tot = mul + vat;
				
				area.append("공급가액 : " + mul + "원\n");
				area.append("공급가액 : " + vat + "원\n");
				area.append("총 금 액 :" + tot + "원\n");
				if(Integer.parseInt(mf.getText()) < tot) {
					area.append("입 금 액 : " + mf.getText() + "원\n");
					area.append("금액이 부족합니다.");
					JOptionPane.showMessageDialog(area, "금액이 부족합니다.");
				} else {
				area.append("입 금 액 : " + mf.getText() + "원\n");
				area.append("거스름돈 : " + 
						(Integer.parseInt(mf.getText()) - tot) + "원");
				}
				
			}
		});
		jb2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		jb3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 화면에 입력된 내용을 모두 초기화 시키는 버튼
				area.setText(null);
				cf.setText(null);
				mf.setText(null);
				bg.clearSelection();
			}
		});
	}

}
