package christopher_fontana.mycollection;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        String[] collection = {"Please Choose a System","Atari 2600","Sega Genesis","Nintendo Entertainment System","Super Nintendo"};
        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_main, R.id.systems, collection));
    }

    protected void onListItemClick(ListView l, View v, int position, long id){
        switch(position){
            case 1:
                startActivity(new Intent(MainActivity.this, Work.class));
                break;
            case 2:
                startActivity(new Intent(MainActivity.this, Genesis.class));
                break;
            case 3:
                startActivity(new Intent(MainActivity.this, Nintendo.class));
                break;
            case 4:
                startActivity(new Intent(MainActivity.this,Snes.class));
                break;
        }
    }
}
