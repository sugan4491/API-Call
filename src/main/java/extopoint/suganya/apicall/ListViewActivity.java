package extopoint.suganya.apicall;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListViewActivity extends AppCompatActivity {

    String[] mobileArray = {"Android","IPhone","WindowsMobile","Blackberry",
            "WebOS","Ubuntu","Windows7","Max OS X","dfgddfgd","jlkl","Max OS X","dfgddfgd","jlkl"
    ,"Max OS X","dfgddfgd","jlkl"
    ,"Max OS X","dfgddfgd","jlkl","Max OS X","dfgddfgd","jlkl","Max OS X","dfgddfgd","jlkl"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        ArrayAdapter adapter = new ArrayAdapter<String>(ListViewActivity.this,
                R.layout.each_row, mobileArray);

        ListView listView = (ListView) findViewById(R.id.listview);
        listView.setAdapter(adapter);
    }
}
