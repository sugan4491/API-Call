package extopoint.suganya.apicall;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MyActivity extends AppCompatActivity {

    private Button list;
    private Button second;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        list=(Button)findViewById(R.id.butnlist);
        second=(Button)findViewById(R.id.btnsecond);

        list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MyActivity.this,ListViewActivity.class);
                startActivity(i);
            }
        });

        second.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i=new Intent(MyActivity.this,CustomListViewActivity.class);
                startActivity(i);
            }
        });
    }


}
