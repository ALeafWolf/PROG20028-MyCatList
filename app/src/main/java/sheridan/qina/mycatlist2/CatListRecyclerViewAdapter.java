package sheridan.qina.mycatlist2;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import sheridan.qina.mycatlist2.databinding.CatlistItemBinding;
import java.util.List;


public class CatListRecyclerViewAdapter extends RecyclerView.Adapter<CatListRecyclerViewAdapter.ViewHolder> {

    private final List<Cat> mCats;

    public CatListRecyclerViewAdapter(List<Cat> items) {
        mCats = items;
    }

    @Override
    @NonNull
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        CatlistItemBinding binding = CatlistItemBinding.inflate(
                LayoutInflater.from(parent.getContext()), parent, false
        );
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        Cat cat = mCats.get(position);
        holder.binding.setCat(cat);
        holder.binding.executePendingBindings();
    }

    @Override
    public int getItemCount() {
        return mCats.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final CatlistItemBinding binding;

        public ViewHolder(CatlistItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

    }
}
