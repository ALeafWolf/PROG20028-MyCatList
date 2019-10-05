package sheridan.qina.mycatlist2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final String TAG_LIST_FRAGMENT = "TAG_LIST_FRAGMENT";
    CatListFragment mCatListFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fm = getSupportFragmentManager();

        //for saving the data while the screen was rolled
        if(savedInstanceState == null){
            FragmentTransaction ft = fm.beginTransaction();
            mCatListFragment = new CatListFragment();
            ft.add(R.id.main_activity_frame, mCatListFragment, TAG_LIST_FRAGMENT);
            ft.commitNow();
        }else{
            mCatListFragment = (CatListFragment)fm.findFragmentByTag(TAG_LIST_FRAGMENT);
        }

        //fake data
        List<Cat> cats = new ArrayList<Cat>(0);
        cats.add(new Cat("Cat A", "British Shorthair", "male", 3));
        cats.add(new Cat("Cat B", "American Shorthair", "male", 7));
        cats.add(new Cat("Cat C", "Savannah cat", "female", 1));
        cats.add(new Cat("Cat D", "Norwegian Forest cat", "female", 4));
        cats.add(new Cat("Cat E", "Bombay cat", "male", 10));
        mCatListFragment.setCats(cats);
    }
}
