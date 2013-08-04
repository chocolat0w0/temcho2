package com.chocolat0w0.temcho2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.Console;
import java.sql.Time;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class MainView implements OnTickListener {
	private OnClickListener mListener;
	private JLabel mLabelTimer;

	public MainView() {
		JFrame frame = new JFrame("タイトル");
		frame.setBounds(100, 100, 200, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		
		mLabelTimer = new JLabel("00:00");
		panel.add(mLabelTimer);
		JButton startBtn = new JButton("start");
		startBtn.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO 自動生成されたメソッド・スタブ
				
			}
			
			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO 自動生成されたメソッド・スタブ
				
			}
			
			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO 自動生成されたメソッド・スタブ
				
			}
			
			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO 自動生成されたメソッド・スタブ
				
			}
			
			@Override
			public void mouseClicked(MouseEvent arg0) {
				mListener.onClick();
			}
		});
		panel.add(startBtn);
		
		panel.setVisible(true);
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		
		frame.setVisible(true);
	}
	
	void setOnClickListener(OnClickListener listener) {
		this.mListener = listener;
	}

	@Override
	public void onTick(Time time) {
		mLabelTimer.setText(formatTime(time));
	}
	
	private String formatTime(Time time) {
		long sec = time.getTime() / 1000;
		
		return formatZero(sec / 60) + ":" + formatZero(sec % 60);
	}
	
	private String formatZero(long orig) {
		if (orig < 10) {
			return "0" + Long.toString(orig);
		}
		return Long.toString(orig);
	}

}
