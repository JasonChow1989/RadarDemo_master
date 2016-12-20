package com.www.jason.radardemo_master;

import android.app.Activity;
import android.os.Bundle;

import com.www.jason.radardemo_master.view.RadarView;


public class MainActivity extends Activity {

	private RadarView mRadarView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mRadarView = (RadarView) findViewById(R.id.radar_view);
		mRadarView.setSearching(true);
		mRadarView.addPoint();
		mRadarView.addPoint();
	}

}