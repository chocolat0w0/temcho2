package com.chocolat0w0.temcho2;

import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Time;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class MainView implements OnTickListener {
	private static final String START = "start";
	private static final String STOP = "stop";

	private OnClickListener mListener;
	private JLabel mLabelTimer;
	private JButton mStartBtn;
	private JTextArea mTaskText;

	public MainView() {
		JFrame frame = new JFrame("タイトル");
		frame.setBounds(100, 100, 200, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		mTaskText = new JTextArea("task");
		panel.add(mTaskText);
		
		mLabelTimer = new JLabel("00:00");
		panel.add(mLabelTimer);
		mStartBtn = new JButton(START);
		mStartBtn.addMouseListener(new MouseListener() {
			
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
				onClickBtn();
			}
		});
		
		mStartBtn.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO 自動生成されたメソッド・スタブ
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					onClickBtn();
				}
			}
			
			@Override
			public void keyPressed(KeyEvent arg0) {
				// TODO 自動生成されたメソッド・スタブ
				
			}
		});
		panel.add(mStartBtn);
		
		panel.setVisible(true);
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		
		frame.setVisible(true);
	}
	
	private void onClickBtn() {
		if (mStartBtn.getText() == START) {
			mListener.onClickStart();
		} else {
			mListener.onClickStop();
		}
		toggleBtn();
	}
	
	private void toggleBtn() {
		mStartBtn.setText(mStartBtn.getText() == START ? STOP : START);  
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
