package tw.edu.pu.cs.wrist_band;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class resetpw extends AppCompatActivity {
    Intent intent;
    Button back1;
    private Button.OnClickListener myListener = new
            Button.OnClickListener() {
                @Override
                public void onClick(View v) {
                    switch (v.getId()) {
                        case R.id.button10: {
                            intent = new Intent(resetpw.this, MANAGEMENT.class);
                            startActivity(intent);
                            finish();
                            break;
                        }

                    }
                }
            };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("密碼重設");
        setContentView(R.layout.activity_resetpw);
        back1 = findViewById(R.id.button10);
        back1.setOnClickListener(myListener);
    }
}
