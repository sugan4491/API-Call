package extopoint.suganya.apicall;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Satyam Kumar Naik on 2/24/2018.
 */

public class CustomAdapter extends BaseAdapter{
    private CustomListViewActivity customListViewActivity;
    private String[] myArray;
    private LayoutInflater inflater;
    private int[] imageList;

    public CustomAdapter(CustomListViewActivity customListViewActivity, String[] mobileArray, int[] imageList) {
        this.customListViewActivity = customListViewActivity;
        myArray=mobileArray;
        this.imageList=imageList;
        inflater = (LayoutInflater) customListViewActivity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public int getCount() {
        return myArray.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View vi = convertView;
        if (convertView == null)
            vi = inflater.inflate(R.layout.custom_list_row, null);
        TextView title = (TextView) vi.findViewById(R.id.text); // title
        ImageView imageView = (ImageView) vi.findViewById(R.id.image);

        title.setText(myArray[position]);
        imageView.setBackgroundResource(imageList[position]);

        return vi;
    }
}
