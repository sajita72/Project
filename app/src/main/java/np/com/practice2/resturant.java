package np.com.practice2;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class resturant extends AppCompatActivity {



    ListView listView;

    ArrayList<String> arrResturant = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_resturant);




            listView = findViewById(R.id.listview);

            arrResturant.add("MOMO HUT");
            arrResturant.add("Tashi Delek");
            arrResturant.add("Gully MOMO");
            arrResturant.add("Bhumi Restro");
            arrResturant.add("The Third Eye");
            arrResturant.add("Fire and Ice");
            arrResturant.add("Chilly Restro");
            arrResturant.add("MOMO HUT");
            arrResturant.add("MOMO HUT");
            arrResturant.add("MOMO HUT");
            arrResturant.add("MOMO HUT");
            arrResturant.add("MOMO HUT");
            arrResturant.add("MOMO HUT");
            arrResturant.add("MOMO HUT");
            arrResturant.add("MOMO HUT");

ArrayAdapter<String> adapter = new ArrayAdapter<>(getApplicationContext(),android.R.layout.simple_list_item_1,arrResturant);
listView.setAdapter(adapter);




        };











    }
