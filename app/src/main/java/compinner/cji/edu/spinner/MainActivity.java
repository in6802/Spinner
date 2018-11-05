package compinner.cji.edu.spinner;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;
import android.view.View;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner = findViewById(R.id.spinner);

        List<String> list = new ArrayList<>();
        list.add("Select!!");
        list.add("Apple");
        list.add("Mango");
        list.add("Banana");

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, list);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(dataAdapter);

        spinner.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
        String seleted = ((TextView)view).getText().toString();
        String text = adapterView.getItemAtPosition(position).toString();

        Toast.makeText(this, seleted + text, Toast.LENGTH_SHORT).show();

        Intent intent;
        // Intend
        switch((int)id) {
            case 1:
                intent = new Intent(this, Spinner_sub1.class);
                startActivityForResult(intent, Activity.RESULT_FIRST_USER);
            break;
            case 2:
                intent = new Intent(this, Spinner_sub1.class);
                startActivityForResult(intent, Activity.RESULT_FIRST_USER);
                break;
            case 3:
                intent = new Intent(this, Spinner_sub1.class);
                startActivityForResult(intent, Activity.RESULT_FIRST_USER);
                break;
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
