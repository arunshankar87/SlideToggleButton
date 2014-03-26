package com.arunshankar87.widget.slidetogglebutton;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.arunshankar87.widget.R;

public class SlideToggleButton extends RelativeLayout {

	private Button offToggleButton;
	private Button onToggleButton;

	OnSwipeTouchListener onSwipeTouchListener;

	public SlideToggleButton(Context context) {
		super(context);
		init(context);
		// TODO Auto-generated constructor stub

	}

	private void init(final Context context) {
		// TODO Auto-generated method stub
		LayoutInflater inflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View view = inflater.inflate(R.layout.slide_toggle_button, this);
		offToggleButton =(Button) view.findViewById(R.id.offToggleButton);
		onToggleButton = (Button) view.findViewById(R.id.onToggleButton);

		offToggleButton.setOnTouchListener(new OnSwipeTouchListener(context) {
			public void onSwipeTop() {
			}

			public void onSwipeRight() {
			}

			public void onSwipeLeft() {
				onToggleButton.setVisibility(View.VISIBLE);
				offToggleButton.setVisibility(View.GONE);
			}

			public void onSwipeBottom() {
			}

			public boolean onTouch(View v, MotionEvent event) {
				return getGestureDetector().onTouchEvent(event);
			}
		});

		onToggleButton.setOnTouchListener(new OnSwipeTouchListener(context) {
			public void onSwipeTop() {
			}

			public void onSwipeRight() {
				offToggleButton.setVisibility(View.VISIBLE);
				onToggleButton.setVisibility(View.GONE);
			}

			public void onSwipeLeft() {
			}

			public void onSwipeBottom() {
			}

			public boolean onTouch(View v, MotionEvent event) {
				return getGestureDetector().onTouchEvent(event);
			}
		});

	}

	public SlideToggleButton(Context context, AttributeSet attrs) {
		super(context, attrs);
		init(context);
	}

	public SlideToggleButton(Context context, AttributeSet attrs,
			int defStyleAttr) {
		super(context, attrs, defStyleAttr);
		init(context);
	}

}
