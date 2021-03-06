package tw.edu.pu.cs.wrist_band;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class socialfun extends AppCompatActivity {
    Intent intent;
    ImageButton coll, upload;
    ImageButton addcount, rawdata;
    private Button.OnClickListener myListener = new
            Button.OnClickListener() {
                @Override
                public void onClick(View v) {
                    switch (v.getId()) {
                        case R.id.button2: {
                            intent = new Intent(socialfun.this, addaccount.class);
                            startActivity(intent);
                            break;
                        }
                        case R.id.button3: {
                            intent = new Intent(socialfun.this, getRawDatainput.class);
                            startActivity(intent);
                            break;
                        }
                        case R.id.blecoll: {
                            intent = new Intent(socialfun.this, ScanActivity.class);
                            startActivity(intent);
//                            finish();
                            break;
                        }
                        case R.id.uploadd: {
                            intent = new Intent(socialfun.this, UPLOADDATA.class);
                            startActivity(intent);
//                            finish();
                            break;
                        }
                    }
                }
    /*public void blecollect(View view){
        Intent intent = new Intent(this, blecollectmain.class);
        startActivity(intent);
        finish();
    }
    public  void uploaddata(View view){
        Intent intent = new Intent(this, socialfun.class);
        startActivity(intent);
        finish();
    }*/
            };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("功能選單");
        setContentView(R.layout.activity_socialfun);
        addcount = findViewById(R.id.button2);
        rawdata = findViewById(R.id.button3);
        coll = findViewById(R.id.blecoll);
        upload = findViewById(R.id.uploadd);
        addcount.setOnClickListener(myListener);
        rawdata.setOnClickListener(myListener);
        coll.setOnClickListener(myListener);
        upload.setOnClickListener(myListener);
        getSupportActionBar().hide();
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
