package lubimybzykac.pl.monika_lubimybzykac;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.davemorrissey.labs.subscaleview.ImageSource;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;

import static android.R.attr.id;

public class activity_daveimage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daveimage);

        Intent i = getIntent();
        int position = i.getExtras().getInt("id");
        MyAdapter adapter = new MyAdapter(this);
        SubsamplingScaleImageView imageView = (SubsamplingScaleImageView)findViewById(R.id.imageView3);
        imageView.setImage(ImageSource.resource(adapter.images[position]));

    }
}
