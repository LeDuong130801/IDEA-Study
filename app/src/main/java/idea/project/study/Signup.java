package idea.project.study;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Signup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
    }
    EditText et;
    TextView tv;
    Button button;
    void EventClickButton(){
        button = findViewById(R.id.btn_signup);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et = findViewById(R.id.enter_username);
                String username = et.getText().toString();
                et = findViewById(R.id.enter_password);
                String password = et.getText().toString();
                et = findViewById(R.id.enter_email);
                String email = et.getText().toString();
                et = findViewById(R.id.enter_phonenumber);
                String phoneNumber = et.getText().toString();

            }
        });
    }
    //true: có lỗi
    boolean KiemTraLoiNhap(String username, String password, String email, String phone){
        boolean coLoi = false;
        
        return coLoi;
    }
}