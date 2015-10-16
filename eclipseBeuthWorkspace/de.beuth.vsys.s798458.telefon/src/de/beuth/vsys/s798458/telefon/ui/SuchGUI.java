package de.beuth.vsys.telefon.ui;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public abstract class SuchGUI {
	private static final Dimension DEFAULT_DIMENSION = new Dimension(50, 30);
	JFrame parameterFrame = new JFrame();
	private JTextField t_name;
	private JTextField t_number;
	
	public SuchGUI (){
		parameterFrame.setLayout(new GridBagLayout());
		final GridBagConstraints c = new GridBagConstraints();
		c.insets = new Insets(5, 5, 5, 5);
		c.gridx = 0;
		c.gridy = 0;

		JLabel l_name = new JLabel("Name:");
		l_name.setPreferredSize(DEFAULT_DIMENSION);
		parameterFrame.add(l_name, c);

		c.gridx++;
		t_name = new JTextField("Enter name here");
		t_name.setPreferredSize(DEFAULT_DIMENSION);
		parameterFrame.add(t_name, c);
		

		c.gridx = 0;
		c.gridy++;
		JLabel l_number = new JLabel("Nummer:");
		l_number.setPreferredSize(DEFAULT_DIMENSION);
		parameterFrame.add(l_number, c);

		c.gridx++;
		t_number = new JTextField("Enter number here");
		t_number.setPreferredSize(DEFAULT_DIMENSION);
		parameterFrame.add(	t_number, c);

		c.gridx = 0;
		c.gridy++;
		JButton b_search = new JButton("Search");
		b_search.setPreferredSize(DEFAULT_DIMENSION);
		
		b_search.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					onButton(t_name.getText(), t_number.getText());
				} catch (NumberFormatException e1) {
					e1.printStackTrace();
				}
				
			}
		});
		parameterFrame.add(b_search, c);

		parameterFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		parameterFrame.pack();
		parameterFrame.setVisible(true);
	}

	public abstract void onButton(String name, String number);
	
	
}
