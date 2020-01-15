package practice;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Exam03_Exam01Event {

	public static void main(String[] args) {
		JFrame jf = new JFrame();
		JPanel jp1 = new JPanel(new BorderLayout());
		JPanel jp2 = new JPanel();
		JPanel jp3 = new JPanel();
		JPanel jp4 = new JPanel();
		JPanel jp5 = new JPanel();
		
		JLabel jl1 = new JLabel("이름 : ");
		JLabel jl2 = new JLabel("국어 : ");
		JLabel jl3 = new JLabel("영어 : ");
		JLabel jl4 = new JLabel("수학 : ");
		
		JTextField name = new JTextField(10);
		JTextField kor = new JTextField(4);
		JTextField eng = new JTextField(4);
		JTextField mat = new JTextField(4);
		
		JTextArea area = new JTextArea(10, 30);
		JScrollPane jsp = new JScrollPane(
				area, 
				ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, 
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		area.setLineWrap(true);
		
		JButton cal = new JButton("계산");
		JButton end = new JButton("종료");
		JButton can = new JButton("취소");
		
		
		jp2.add(jl1); jp2.add(name);
		
		jp3.add(jl2); jp3.add(kor);
		jp3.add(jl3); jp3.add(eng);
		jp3.add(jl4); jp3.add(mat);
		
		jp1.add(jp2, BorderLayout.NORTH);
		jp1.add(jp3, BorderLayout.SOUTH);
		
		jp4.add(jsp);
		
		jp5.add(cal); jp5.add(end); jp5.add(can);
		
		jf.add(jp1, BorderLayout.NORTH);
		jf.add(jp4, BorderLayout.CENTER);
		jf.add(jp5, BorderLayout.SOUTH);
		
		// setLocationRelativeTo()
		// 프레임의 위치를 컴포넌트에 따라 상대적인 위치를 지정하는 메소드
		// 인자에 null을 입력하면 중앙에 프레임이 위치하게 된다.
//		jf.setLocationRelativeTo(null);
//		jf.setSize(350, 250);
		jf.setBounds(100, 100, 400, 300);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
		
		// event처리
		cal.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				area.append("이      름 : " + name.getText() + "\n"); 
				area.append( "국어점수 : " + kor.getText() + "\n");
				area.append("영어점수 : " + eng.getText() + "\n"); 
				area.append("수학점수 : " + mat.getText() + "\n");
				
				int tot = 
						(Integer.parseInt(kor.getText()) + 
						Integer.parseInt(eng.getText()) + 
						Integer.parseInt(mat.getText()));
				float avg = tot / 3.0f;
				String grade = null;
				if(avg >= 90) {
					grade = "A학점";
				} else if(avg >= 80) {
					grade = "B학점";
				} else if(avg >= 70) {
					grade = "C학점";
				} else if(avg >= 60) {
					grade = "D학점";
				} else if(avg >= 0) {
					grade = "F학점";
				}
				
				String num = String.format("%.2f점\n", avg);
				area.append("총      점 : " + tot + "점" + "\n");
				area.append("평      균 : " + num);
				// Math.round(avg*100)/100.0 방법으로도 가능
				area.append("학      점 : " + grade);
				
				
			}
		});
		
		end.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		can.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 화면에 입력된 내용을 모두 초기화 시키는 버튼
				area.setText(null);
				name.setText(null);
				kor.setText(null);
				eng.setText(null);
				mat.setText(null);
				name.requestFocus(); // 커서를 su1 컴포넌트로 이동시키는 메소드
			}
		});
	}

}
