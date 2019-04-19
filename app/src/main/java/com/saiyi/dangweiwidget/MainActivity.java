package com.saiyi.dangweiwidget;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity  {
	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		IndicatorSeekBar seekBar = findViewById(R.id.seekBar1);
		seekBar.setOnSeekChangeListener(new OnSeekChangeListener() {
			@Override
			public void onSeeking(SeekParams seekParams) {
				Log.e("ZZZ","position:" + seekParams.thumbPosition);

			}

			@Override
			public void onStartTrackingTouch(IndicatorSeekBar seekBar) {

			}

			@Override
			public void onStopTrackingTouch(IndicatorSeekBar seekBar) {

			}
		});
	}
}