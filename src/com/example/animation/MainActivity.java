package com.example.animation;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.ScaleAnimation;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends Activity implements OnClickListener{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button scale =(Button) findViewById(R.id.scale);
		Button aloha =(Button) findViewById(R.id.aloha);
		Button rotate =(Button) findViewById(R.id.rotate);
		Button trans =(Button) findViewById(R.id.trans);
		Button con1 =(Button) findViewById(R.id.con1);
		Button con2 =(Button) findViewById(R.id.con2);
		Button flash =(Button) findViewById(R.id.flash);
		Button shake =(Button) findViewById(R.id.shake);
		Button change =(Button) findViewById(R.id.change);
		Button layout =(Button) findViewById(R.id.layout);
		Button frame =(Button) findViewById(R.id.frame);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Animation loadAnimation;
		switch (v.getId()) {
		case R.id.scale:
			
			break;
		case R.id.aloha:
			loadAnimation = AnimationUtils.loadAnimation(this, R.anim.alpha);
			Image.startAnimation(loadAnimation);
			break;
		case R.id.rotate:
	
			break;
		case R.id.trans:
	
			break;
		case R.id.con1:
	
			break;
		case R.id.con2:
	
			break;
		case R.id.flash:
	
			break;
		case R.id.shake:
	
			break;
		case R.id.change:
	
			break;
		case R.id.layout:
	
			break;
		case R.id.frame:
	
			break;
	
		
		}
	}
}
