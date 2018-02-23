package extopoint.suganya.apicall;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONObject;
import org.json.JSONException;

public class MainActivity extends AppCompatActivity {
    private Button b1;
    private RequestQueue mRequestQueue;
    private StringRequest mStringRequest;

    private String url = "http://www.mocky.io/v2/597c41390f0000d002f4dbd1";


    private String jsonO="{ \"Name\":\"Krish\", \"Age\":17, \"Class\":12 }\n";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button) findViewById(R.id.button1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {

                Toast.makeText(MainActivity.this, "JSON Object.... Button 1 toast action", Toast.LENGTH_SHORT).show();

                sendAndRequestResponse();

                try {

                    JSONObject jso = new JSONObject(jsonO);
                    Log.d("Json", "JSONObject Length is" + jso.length());
                    for (int i = 0; i <= jso.length(); i++) {
                        Log.d("JSON",""+jso.getString("Name")+""+jso.getString("Age")+""+jso.getString("Class"));

                    }


                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        });
    }




    private void sendAndRequestResponse() {
//RequestQueue initialized
        mRequestQueue = Volley.newRequestQueue(this);
//String Request initialized
        mStringRequest = new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {
            @Override

            public void onResponse(String response) {

            Toast.makeText(getApplicationContext(), "Response :" + response.toString(), Toast.LENGTH_LONG).show();//display the response on screen
            }
            }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
            Log.i("Volley", "Error :" + error.toString());
            }
            });
             mRequestQueue.add(mStringRequest);
            }}



