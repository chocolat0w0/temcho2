package com.chocolat0w0.temcho2;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class MainView {
	public MainView() {
		JFrame frame = new JFrame("タイトル");
		frame.setBounds(100, 100, 200, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		
		JLabel labelTimer = new JLabel("00:00");
		panel.add(labelTimer);
		panel.setVisible(true);
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		
		frame.setVisible(true);
		
	}
}
