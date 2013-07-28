package com.chocolat0w0.temcho2;

import javax.swing.JFrame;

public class MainView {
	public MainView() {
		JFrame frame = new JFrame("タイトル");
		frame.setBounds(100, 100, 200, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
