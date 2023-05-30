package at.ea.endless.aisle.ProductDetailsPagePage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {



        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Get intent, action and MIME type
        Intent intent = getIntent();
        String action = intent.getAction();
        String type = intent.getType();
        String sku = intent.getStringExtra("sku");

        Log.d("Intent", "INTENT FROM OTHER APP"+ String.valueOf(sku));
        final TextView mTextView = (TextView) findViewById(R.id.textView);
        mTextView.setText(sku);

        Toast toast =  Toast.makeText(getApplicationContext(),"INTENT GET",Toast.LENGTH_SHORT);
        toast.show();
    }
}