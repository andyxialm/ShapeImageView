package cn.refactor.shapeimageview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

public class SampleListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample_list);

        ListView lv = (ListView) findViewById(R.id.lv);
        lv.setAdapter(new SampleAdapter(this));
    }

}
