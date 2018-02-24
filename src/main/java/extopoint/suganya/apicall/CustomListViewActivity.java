package extopoint.suganya.apicall;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class CustomListViewActivity extends AppCompatActivity {

    String[] mobileArray = {"Android","IPhone","jhdfjkhsdjk"};
    int[] imageList = {R.drawable.one,R.drawable.one,R.drawable.one};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list_view);

        ListView listView = (ListView) findViewById(R.id.listview);
        CustomAdapter adapter=new CustomAdapter(CustomListViewActivity.this,mobileArray,imageList);
            listView.setAdapter(adapter);
    }
}
