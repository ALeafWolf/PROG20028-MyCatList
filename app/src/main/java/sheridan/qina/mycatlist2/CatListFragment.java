package sheridan.qina.mycatlist2;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import sheridan.qina.mycatlist2.databinding.CatlistItemBinding;

import java.util.ArrayList;
import java.util.List;

public class CatListFragment extends Fragment {

    private ArrayList<Cat> mCats = new ArrayList<Cat>();
    private CatListRecyclerViewAdapter myCatListRecyclerViewAdapter = new CatListRecyclerViewAdapter(mCats);
    private RecyclerView mRecyclerView;

    public CatListFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_catlist, container, false);
        mRecyclerView = view.findViewById(R.id.list);

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState){
        super.onViewCreated(view, savedInstanceState);
        Context context = view.getContext();
        mRecyclerView.setLayoutManager(new LinearLayoutManager(context));
        mRecyclerView.setAdapter(myCatListRecyclerViewAdapter);
    }

    public void setCats(List<Cat> cats){
        for (Cat cat: cats){
            if(!mCats.contains(cat)){
                mCats.add(cat);

            }
        }
    }
}
