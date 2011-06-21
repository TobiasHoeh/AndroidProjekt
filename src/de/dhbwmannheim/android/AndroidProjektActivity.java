package de.dhbwmannheim.android;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AndroidProjektActivity extends Activity {
	/** Called when the activity is first created. */
	private final String TAG = AndroidProjektActivity.class.getSimpleName();

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		Log.d(TAG, "Anwendungen gestartet!");
	}

	public void clickSubActivity(final View view) {
		switch (view.getId()) {
		case R.id.sf_subactivity:
			Intent absicht = new Intent(this, SubActivity.class);
			EditText ed_feld = (EditText) findViewById(R.id.ed_feld);
			String text = ed_feld.getText().toString();

			absicht.putExtra("Nachricht", text);
			startActivity(absicht);
			break;

		case R.id.sf_neuerButton:
			Toast.makeText(this, "Neuer Button geklickt!", Toast.LENGTH_SHORT)
					.show();

		default:
			break;
		}

	}

	@Override
	protected void onDestroy() {
		Log.d(TAG, "onDestroy()");
		super.onDestroy();
	}

	@Override
	protected void onRestart() {
		Log.d(TAG, "onRestart()");
		super.onRestart();
	}

	@Override
	protected void onResume() {
		Log.d(TAG, "onResume()");
		super.onResume();
	}

	@Override
	protected void onStart() {
		Log.d(TAG, "onStart()");
		super.onStart();
	}

	@Override
	protected void onStop() {
		Log.d(TAG, "onStop()");
		super.onStop();
	}
	
}