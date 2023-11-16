package lk.rush.firebasestorage.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.storage.FirebaseStorage;

import java.util.ArrayList;

import lk.rush.firebasestorage.R;
import lk.rush.firebasestorage.model.Item;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.viewHolder> {
    private FirebaseStorage storage;
    private ArrayList<Item> items;
    private Context context;

    public ItemAdapter(ArrayList<Item> items, Context context) {
        this.items = items;
        this.context = context;
        this.storage = FirebaseStorage.getInstance();
    }

    @NonNull
    @Override
    public ItemAdapter.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemAdapter.viewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        TextView textName, textDesc, textPrice;
        ImageView image;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textName = itemView.findViewById(R.id.itemText1);
            textDesc = itemView.findViewById(R.id.itemText2);
            textPrice = itemView.findViewById(R.id.itemText3);

            //41:10 stopped
        }
    }
}
