package tw.edu.pu.cs.wrist_band;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;

public class ELDER extends AppCompatActivity {
    Intent intent;
    Button searchre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle("功能選單");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elder);
        searchre =findViewById(R.id.datasearch);
        searchre.setOnClickListener(myListener);
    }
    private Button.OnClickListener myListener = new
            Button.OnClickListener() {
                @Override
                public void onClick(View v) {
                    switch (v.getId()) {
                        case R.id.datasearch: {
                            intent = new Intent(ELDER.this, healthreport.class);
                            startActivity(intent);
                            break;
                        }

                    }
                }
            };

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            new AlertDialog.Builder(this)
                    .setTitle(R.string.message)
                    .setMessage(R.string.logout_msg)
                    .setPositiveButton(R.string.dialog_positive_button, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                        }
                    })
                    .setNegativeButton(R.string.dialog_negative_button, null)
                    .show();
        }
        return super.onKeyDown(keyCode, event);
    }
}
