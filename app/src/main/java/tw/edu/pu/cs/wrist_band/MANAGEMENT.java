package tw.edu.pu.cs.wrist_band;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;

public class MANAGEMENT extends AppCompatActivity {
    Intent intent;
    Button addcount, delcount, reset, revise;
    private Button.OnClickListener myListener = new
            Button.OnClickListener() {
                @Override
                public void onClick(View v) {
                    switch (v.getId()) {
                        case R.id.button2: {
                            intent = new Intent(MANAGEMENT.this, addaccount.class);
                            startActivity(intent);
                            break;
                        }
                        case R.id.button3: {
                            intent = new Intent(MANAGEMENT.this, delaccount.class);
                            startActivity(intent);
                            break;
                        }
                        case R.id.button4: {
                            intent = new Intent(MANAGEMENT.this, resetPasswd.class);
                            startActivity(intent);
                            break;
                        }
                        case R.id.button5: {
                            intent = new Intent(MANAGEMENT.this, reviseaccount.class);
                            startActivity(intent);
                            break;
                        }
                    }
                }
            };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("功能選單");
        setContentView(R.layout.activity_management);
        addcount = findViewById(R.id.button2);
        delcount = findViewById(R.id.button3);
        reset = findViewById(R.id.button4);
        revise = findViewById(R.id.button5);
        addcount.setOnClickListener(myListener);
        delcount.setOnClickListener(myListener);
        reset.setOnClickListener(myListener);
        revise.setOnClickListener(myListener);
    }

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
