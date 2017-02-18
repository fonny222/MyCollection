package christopher_fontana.mycollection;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Snes extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_snes);

        String[] snesOptions = {"Super NES","My Games","Buy Games"};
        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_main, R.id.systems, snesOptions));    }


    protected void onListItemClick(ListView l, View v, int position, long id){
        switch(position){
            case 0:
                startActivity(new Intent(Snes.this, SnesSystem.class));
                break;
            case 1:
                startActivity(new Intent(Snes.this, SnesGames.class));
                break;
            case 2:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.dkoldies.com/super-nintendo/")));
                break;
        }
    }
}
