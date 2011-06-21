package de.dhbwmannheim.android;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SubActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.subactivity);
		
		Intent absicht = getIntent();
		
		String text = absicht.getExtras().getString("Nachricht");
		
		Toast.makeText(this,text,Toast.LENGTH_SHORT).show();
		
		TextView tf_feld = (TextView)findViewById(R.id.tf_text);
		tf_feld.setText(text);
	}

}
