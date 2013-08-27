package com.chocolat0w0.temcho2;

import java.sql.Time;
import java.util.Timer;
import java.util.TimerTask;

public class TimerController implements OnClickListener {
	Time mTime = null;
	Timer mTimer = null;
	MyTimerTask mTask = null;
	private OnTickListener mListener;
	
	TimerController() {
		this.mTime = new Time(0);
		this.mTimer = new Timer(true);
	}
	
	void setOnTickListener(OnTickListener listener) {
		this.mListener = listener;
	}

	@Override
	public void onClickStart() {
		mTask = new MyTimerTask();
		mTimer.schedule(mTask, 0, 1000);
	}

	@Override
	public void onClickStop() {
		mTask.cancel();
	}
	
	class MyTimerTask extends TimerTask {

		@Override
		public void run() {
			mTime.setTime(mTime.getTime() + 1000);
			java.lang.System.out.println("time:" + mTime.getTime());
			mListener.onTick(mTime);
		}
		
	}
	
}
