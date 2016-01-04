package cn.refactor.shapeimageview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toShapesListAct(View v) {
        startActivity(new Intent(this, SampleListActivity.class));
    }

    public void toShapeSampleAct(View v) {
        startActivity(new Intent(this, SampleActivity.class));
    }
}
