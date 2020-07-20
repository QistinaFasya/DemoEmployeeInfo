package sg.edu.rp.c346.id18015170.demoemployeeinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvToDo;
    ArrayList<EmployeeInfo> alToDo;
    CustomAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvToDo = findViewById(R.id.listViewInfo);
        alToDo = new ArrayList<>();
        EmployeeInfo employee1 = new EmployeeInfo("John", "Software Technical Leader", 3400 );
        EmployeeInfo employee2 = new EmployeeInfo("May", "Programmer", 2200 );

        alToDo.add(employee1);
        alToDo.add(employee2);

        adapter = new CustomAdapter(this, R.layout.row, alToDo);
        lvToDo.setAdapter(adapter);
    }
}
