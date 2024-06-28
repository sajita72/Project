package np.com.practice2;
import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


public class login extends AppCompatActivity {

    protected Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);


        button=findViewById(R.id.btbutton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(login.this, resturant.class);
                startActivity(intent);


            }
        });

        }
    }
