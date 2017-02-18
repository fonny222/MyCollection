package christopher_fontana.mycollection;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

// this class is for Atari I mistakenly labled it Work not realizing what I did and I coded it into it
// it was too late to change it
public class Work extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_work);
        String[] atariOptions = {"Atari System","My Games","Buy Games"};

        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_main, R.id.systems, atariOptions));
    }



    protected void onListItemClick(ListView l, View v, int position, long id){
        switch(position){
            case 0:
                startActivity(new Intent(Work.this, AtariSystem.class));
                break;
            case 1:
                startActivity(new Intent(Work.this, GamesAtari.class));
                break;
            case 2:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://atariage.com/store/index.php?l=product_list&c=21")));
                break;
        }
    }
}
