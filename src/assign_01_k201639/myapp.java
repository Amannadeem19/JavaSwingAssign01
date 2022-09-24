package assign_01_k201639;

import java.awt.EventQueue;


import javax.swing.JFrame;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
public class myapp {

	private JFrame frame;
	public int likecount[] = new int [3];
	public int dislikecount1[] = new int [3];
	public JLabel lblNewLabel, lblNewLabel_1;

	public int  current;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					myapp window = new myapp();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public myapp() {
		initialize();
		int i = 0;
		while(i < 3) {
			likecount[i] = 0;
			dislikecount1[i] = 0;
			i++;
		}

		 lblNewLabel = new JLabel();
		 lblNewLabel_1 = new JLabel();
		lblNewLabel.setBounds(213, 297, 46, 14);
		lblNewLabel_1.setBounds(311, 297, 46, 14);
		current =1;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		CardLayout card = new CardLayout();
		
		frame = new JFrame();
		frame.setBounds(100, 100, 596, 350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane();
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 580, 261);
		frame.getContentPane().add(panel);
		panel.setLayout(card);
		
		JPanel pic1 = new JPanel();
		JPanel pic2 = new JPanel();
		JPanel pic3 = new JPanel();
		
		Icon icon =  new ImageIcon("img/image1.png");
		JLabel label1 = new JLabel(icon);
		pic1.add(label1);
		
		Icon icon2 =  new ImageIcon("img/image2.png");
		JLabel label2 = new JLabel(icon2);
		pic2.add(label2);
		
		
		Icon icon3 =  new ImageIcon("img/image3.png");
		JLabel label3 = new JLabel(icon3);
		pic3.add(label3);
		
		

		panel.add(pic1 , "1");
		panel.add(pic2 , "2");
		panel.add(pic3 , "3");
		
		
		JButton btnNewButton = new JButton("Previous");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(current > 1) {
					current -= 1;
					String str = Integer.toString(current);
					card.show(panel, str);
			
					
					
				}
				
			}
		});
		btnNewButton.setBounds(0, 277, 152, 23);
		frame.getContentPane().add(btnNewButton);
		
		
		JButton btnNewButton_1 = new JButton("Next");
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(current  < 3) {
					current = current + 1;
					String str = Integer.toString(current);
					
					card.show(panel, str);
					
				}

			}
		});
		btnNewButton_1.setBounds(440, 277, 140, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Like");
		btnNewButton_2.addActionListener(new ActionListener() {
			String s;
			
			public void actionPerformed(ActionEvent e) {
				if(current == 1) {
					likecount[current-1] += 1;
					s = Integer.toString(likecount[current-1]);
						
				}
				else if(current == 2)
				{
					likecount[current-1] += 1;
					s = Integer.toString(likecount[current-1]);
				}
				
				else if(current == 3) {
					likecount[current-1] += 1;
					s = Integer.toString(likecount[current-1]);
				}
				lblNewLabel.setVisible(true);

				
				lblNewLabel.setText(s);
				lblNewLabel.setFont(new Font ("Arial", Font.PLAIN, 20));
				frame.getContentPane().add(lblNewLabel);
				
			}
		});
		
		btnNewButton_2.setBounds(187, 272, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		
		
		
		
		
		JButton btnNewButton_3 = new JButton("Dislike");
		btnNewButton_3.addActionListener(new ActionListener() {
			String s;
			public void actionPerformed(ActionEvent e) {
				
				if(current == 1) {
					dislikecount1[current-1] += 1;
					s = Integer.toString(dislikecount1[current-1]);
						
				}
				else if(current == 2)
				{
					dislikecount1[current-1] += 1;
					s = Integer.toString(dislikecount1[current-1]);
				}
				
				else if(current == 3) {
					dislikecount1[current-1] += 1;
					s = Integer.toString(dislikecount1[current-1]);
				}
				lblNewLabel_1.setVisible(true);

				
				lblNewLabel_1.setText(s);
				lblNewLabel_1.setFont(new Font ("Arial", Font.PLAIN, 20));
				frame.getContentPane().add(lblNewLabel_1);
				
			}
		});
		btnNewButton_3.setBounds(291, 272, 89, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		
		

		
	
		
		
		

		
		
		
		
	}
}
