package fanpeihua.jikepraise;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edNum;
    ThumbUpView newThumbUpView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edNum = findViewById(R.id.ed_num);
        newThumbUpView = findViewById(R.id.newThumbUpView);


        newThumbUpView.setThumbUpClickListener(new ThumbView.ThumbUpClickListener() {
            @Override
            public void thumbUpFinish() {
                Log.d("MainActivity", "New点赞成功");
            }

            @Override
            public void thumbDownFinish() {
                Log.d("MainActivity", "New取消点赞成功");
            }
        });
    }

    public void setNum(View v) {
        try {
            int num = Integer.valueOf(edNum.getText().toString().trim());
            newThumbUpView.setCount(num).setThumbUp(false);
        } catch (Exception e) {
            e.printStackTrace();
            Toast.makeText(this, "只能输入整数", Toast.LENGTH_LONG).show();
        }
    }

    public void showToast(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}