import java.awt.event.*; 
import javax.swing.*; 
import java.awt.*; 
class calc_swing extends JFrame implements ActionListener { 
	
	static JFrame f; 
	static JTextField l; 
	String s0, s1, s2; 
	calc_swing() 
	{ 
		s0 = s1 = s2 = ""; 
	} 

	
	@SuppressWarnings("deprecation")
	public static void main(String args[]) 
	{ 
		f = new JFrame("calc_swing"); 
		try { 
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); 
		} 
		catch (Exception e) { 
			System.err.println(e.getMessage()); 
		} 

		
		calc_swing c = new calc_swing(); 

		 
		l = new JTextField(16); 

		
		l.setEditable(false); 

		
		JButton button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, buttona, buttons, buttond, buttonm, buttone, buttoneq, buttoneq1; 

		
		button0 = new JButton("0"); 
		button1 = new JButton("1"); 
		button2 = new JButton("2"); 
		button3 = new JButton("3"); 
		button4 = new JButton("4"); 
		button5 = new JButton("5"); 
		button6 = new JButton("6"); 
		button7 = new JButton("7"); 
		button8 = new JButton("8"); 
		button9 = new JButton("9"); 

		 
		buttoneq1 = new JButton("="); 

		
		buttona = new JButton("+"); 
		buttons = new JButton("-"); 
		buttond = new JButton("/"); 
		buttonm = new JButton("*"); 
		buttoneq = new JButton("C"); 

		
		buttone = new JButton("."); 

		
		JPanel p = new JPanel(); 

		
		buttonm.addActionListener(c); 
		buttond.addActionListener(c); 
		buttons.addActionListener(c); 
		buttona.addActionListener(c); 
		button9.addActionListener(c); 
		button8.addActionListener(c); 
		button7.addActionListener(c); 
		button6.addActionListener(c); 
		button5.addActionListener(c); 
		button4.addActionListener(c); 
		button3.addActionListener(c); 
		button2.addActionListener(c); 
		button1.addActionListener(c); 
		button0.addActionListener(c); 
		buttone.addActionListener(c); 
		buttoneq.addActionListener(c); 
		buttoneq1.addActionListener(c); 

		
		p.add(l); 
		p.add(buttona); 
		p.add(button1); 
		p.add(button2); 
		p.add(button3); 
		p.add(buttons); 
		p.add(button4); 
		p.add(button5); 
		p.add(button6); 
		p.add(buttonm); 
		p.add(button7); 
		p.add(button8); 
		p.add(button9); 
		p.add(buttond); 
		p.add(buttone); 
		p.add(button0); 
		p.add(buttoneq); 
		p.add(buttoneq1); 

		
		p.setBackground(Color.blue);

		
		f.add(p); 

		f.setSize(200, 220); 
		f.show(); 
	} 
	public void actionPerformed(ActionEvent e) 
	{ 
		String s = e.getActionCommand(); 

		 
		if ((s.charAt(0) >= '0' && s.charAt(0) <= '9') || s.charAt(0) == '.') { 
			 
			if (!s1.equals("")) 
				s2 = s2 + s; 
			else
				s0 = s0 + s; 

			 
			l.setText(s0 + s1 + s2); 
		} 
		else if (s.charAt(0) == 'C') { 
			
			s0 = s1 = s2 = ""; 

			
			l.setText(s0 + s1 + s2); 
		} 
		else if (s.charAt(0) == '=') { 

			double txt_out; 

			
			if (s1.equals("+")) 
				txt_out = (Double.parseDouble(s0) + Double.parseDouble(s2)); 
			else if (s1.equals("-")) 
				txt_out = (Double.parseDouble(s0) - Double.parseDouble(s2)); 
			else if (s1.equals("/")) 
				txt_out = (Double.parseDouble(s0) / Double.parseDouble(s2)); 
			else
				txt_out = (Double.parseDouble(s0) * Double.parseDouble(s2)); 

			l.setText(s0 + s1 + s2 + "=" + txt_out); 

			
			s0 = Double.toString(txt_out); 

			s1 = s2 = ""; 
		} 
		else { 
			
			if (s1.equals("") || s2.equals("")) 
				s1 = s; 
			 
			else { 
				double txt_out; 

				 
				if (s1.equals("+")) 
					txt_out = (Double.parseDouble(s0) + Double.parseDouble(s2)); 
				else if (s1.equals("-")) 
					txt_out = (Double.parseDouble(s0) - Double.parseDouble(s2)); 
				else if (s1.equals("/")) 
					txt_out = (Double.parseDouble(s0) / Double.parseDouble(s2)); 
				else
					txt_out = (Double.parseDouble(s0) * Double.parseDouble(s2)); 

				
				s0 = Double.toString(txt_out); 

				 
				s1 = s; 

				 
				s2 = ""; 
			} 

			 
			l.setText(s0 + s1 + s2); 
		} 
	} 
} 
