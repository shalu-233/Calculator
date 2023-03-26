package shazia;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JEditorPane;
import java.awt.SystemColor;

public class calcSwing extends JFrame {

	private JPanel contentPane;
	private JTextField t1;
	private JTextField t2;
	
	double first;
	double second;
	double result;
	String operation;
	String answer;
	float temp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calcSwing frame = new calcSwing();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public calcSwing() {
		setForeground(new Color(128, 128, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 275, 397);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 255));
		contentPane.setForeground(new Color(128, 128, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				t2.setText(t2.getText()+7);
			}
		});
		
		t1 = new JTextField();
		t1.setFont(new Font("Serif", Font.BOLD, 16));
		t1.setForeground(new Color(165, 42, 42));
		t1.setEditable(false);
		t1.setBorder(null);
		t1.setHorizontalAlignment(SwingConstants.TRAILING);
		t1.setColumns(10);
		t1.setBackground(new Color(255, 255, 255));
		t1.setBounds(10, 11, 241, 34);
		contentPane.add(t1);
		
		t2 = new JTextField();
		t2.setFont(new Font("Serif", Font.BOLD, 15));
		t2.setForeground(new Color(178, 34, 34));
		t2.setBorder(null);
		t2.setEditable(false);
		t2.setColumns(10);
		t2.setBackground(new Color(255, 255, 255));
		t2.setBounds(10, 49, 241, 34);
		contentPane.add(t2);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBackground(new Color(255, 255, 255));
		editorPane.setBounds(10, 11, 241, 63);
		contentPane.add(editorPane);
		btn7.setFont(new Font("Serif", Font.BOLD, 12));
		btn7.setBounds(24, 156, 47, 41);
		contentPane.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				t2.setText(t2.getText()+8);
			}
			
		});
		btn8.setFont(new Font("Serif", Font.BOLD, 12));
		btn8.setBounds(81, 156, 47, 41);
		contentPane.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				t2.setText(t2.getText()+9);
			}
			
		});
		btn9.setFont(new Font("Serif", Font.BOLD, 12));
		btn9.setBounds(138, 156, 47, 41);
		contentPane.add(btn9);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				t2.setText(t2.getText()+4);
			}
		});
		btn4.setFont(new Font("Serif", Font.BOLD, 12));
		btn4.setBounds(24, 207, 47, 41);
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				t2.setText(t2.getText()+5);
			}
		});
		btn5.setFont(new Font("Serif", Font.BOLD, 12));
		btn5.setBounds(81, 207, 47, 41);
		contentPane.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				t2.setText(t2.getText()+6);
			}
		});
		btn6.setFont(new Font("Serif", Font.BOLD, 12));
		btn6.setBounds(138, 207, 47, 41);
		contentPane.add(btn6);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				t2.setText(t2.getText()+1);
			}
		});
		btn1.setFont(new Font("Serif", Font.BOLD, 12));
		btn1.setBounds(24, 255, 47, 41);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				t2.setText(t2.getText()+2);
			}
		});
		btn2.setFont(new Font("Serif", Font.BOLD, 12));
		btn2.setBounds(81, 255, 47, 41);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				t2.setText(t2.getText()+3);
			}
		});
		btn3.setFont(new Font("Serif", Font.BOLD, 12));
		btn3.setBounds(138, 255, 47, 41);
		contentPane.add(btn3);
		
		JButton zero = new JButton("0");
		zero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				t2.setText(t2.getText()+0);
			}
		});
		zero.setFont(new Font("Serif", Font.BOLD, 12));
		zero.setBounds(81, 306, 47, 41);
		contentPane.add(zero);
		
		JButton equals = new JButton("=");
		equals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				second=Double.parseDouble(t2.getText());
				if(operation=="+")
				{
					result=first+second;
					answer=String.format("%.2f", result);
					t1.setText(answer);
					t2.setText(null);
				}
				else if(operation=="-")
				{
					result=first-second;
					answer=String.format("%.2f", result);
					t1.setText(answer);
					t2.setText(null);
				}
				else if(operation=="*")
				{
					result=first*second;
					answer=String.format("%.2f", result);
					t1.setText(answer);
					t2.setText(null);
				}
				else if(operation=="/")
				{
					result=first/second;
					answer=String.format("%.2f", result);
					t1.setText(answer);
					t2.setText(null);
				}
//				else if(operation=="%")
//				{
//					result=first/100;
//					answer=String.format("%.2f", result);
//					t1.setText(answer);
//					t2.setText(null);
//				}
//				else if(operation=="-/+")
//				{
//					result=-first;
//					answer=String.format("%.2f", result);
//					t1.setText(answer);
//					t2.setText(null);
//				}
//				else if(operation==".")
//				{
//					t2.setText(t2.getText()+".");
//				}
			}
		});
		equals.setFont(new Font("Serif", Font.BOLD, 12));
		equals.setBounds(138, 306, 47, 41);
		equals.setForeground(new Color(255, 255, 255));
		equals.setBackground(new Color(0, 0, 128));
		contentPane.add(equals);
		
		JButton minus = new JButton("-");
		minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				first=Double.parseDouble(t2.getText());
				t1.setText(t2.getText());
				t2.setText("");
				operation="-";
			}
		});
		minus.setFont(new Font("Serif", Font.BOLD, 12));
		minus.setForeground(new Color(255, 255, 255));
		minus.setBounds(195, 156, 47, 41);
		minus.setBackground(new Color(0, 0, 128));
		contentPane.add(minus);
		
		JButton plus = new JButton("+");
		plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				first=Double.parseDouble(t2.getText());
				t1.setText(t2.getText());
				t2.setText("");
				operation="+";
			}
		});
		plus.setFont(new Font("Serif", Font.BOLD, 12));
		plus.setForeground(new Color(255, 255, 255));
		plus.setBounds(195, 207, 47, 41);
		plus.setBackground(new Color(0, 0, 128));
		contentPane.add(plus);
		
		JButton multi = new JButton("*");
		multi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				first=Double.parseDouble(t2.getText());
				t1.setText(t2.getText());
				t2.setText("");
				operation="*";
			}
		});
		multi.setFont(new Font("Serif", Font.BOLD, 12));
		multi.setForeground(new Color(255, 255, 255));
		multi.setBounds(195, 255, 47, 41);
		multi.setBackground(new Color(0, 0, 128));
		contentPane.add(multi);
		
		JButton div = new JButton("/");
		div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				first=Double.parseDouble(t2.getText());
				t1.setText(t2.getText());
				t2.setText("");
				operation="/";
			}
		});
		div.setFont(new Font("Serif", Font.BOLD, 12));
		div.setForeground(new Color(255, 255, 255));
		div.setBounds(195, 306, 47, 41);
		div.setBackground(new Color(0, 0, 128));
		contentPane.add(div);
		
		JButton clear = new JButton("Clear");
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				t2.setText(null);
				t1.setText(null);
			}
		});
		clear.setForeground(Color.WHITE);
		clear.setFont(new Font("Serif", Font.BOLD, 12));
		clear.setBackground(new Color(0, 0, 128));
		clear.setBounds(138, 105, 104, 41);
		contentPane.add(clear);
		
		JButton percent = new JButton("%");
		percent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				first=Double.parseDouble(t2.getText());
				t1.setText(t2.getText());
				t2.setText("");
				operation="%";
				
				result=first/100;
				answer=String.format("%.2f", result);
				t1.setText(answer);
				t2.setText(null);
			}
		});
		percent.setForeground(Color.WHITE);
		percent.setFont(new Font("Serif", Font.BOLD, 12));
		percent.setBackground(new Color(0, 0, 128));
		percent.setBounds(24, 105, 47, 41);
		contentPane.add(percent);
		
		JButton negative = new JButton("-/+");
		negative.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				first=Double.parseDouble(t2.getText());
				t1.setText(t2.getText());
				t2.setText("");
				operation="-/+";
				
				result=-first;
				answer=String.format("%.2f", result);
				t2.setText(answer);
				
			}
		});
		negative.setForeground(Color.WHITE);
		negative.setFont(new Font("Serif", Font.BOLD, 10));
		negative.setBackground(new Color(0, 0, 128));
		negative.setBounds(81, 105, 47, 41);
		contentPane.add(negative);
		
		JButton equals_3 = new JButton(".");
		equals_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				first=Double.parseDouble(t2.getText());
				//t1.setText(t2.getText());
				//t2.setText("");
				operation=".";
				t2.setText(t2.getText()+".");
			}
		});
		equals_3.setForeground(Color.WHITE);
		equals_3.setFont(new Font("Serif", Font.BOLD, 12));
		equals_3.setBackground(new Color(0, 0, 128));
		equals_3.setBounds(24, 306, 47, 41);
		contentPane.add(equals_3);
	}
}
