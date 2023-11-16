package lk.rush.firebasestorage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.storage.FirebaseStorage;

import java.util.ArrayList;

import lk.rush.firebasestorage.model.Item;

public class ItemViewActivity extends AppCompatActivity {

    private FirebaseFirestore firestore;
    private FirebaseStorage storage;
    private ArrayList<Item> items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_view);

        firestore = FirebaseFirestore.getInstance();
        storage = FirebaseStorage.getInstance();

        items = new ArrayList<>();

        RecyclerView itemView = findViewById(R.id.itemView);



    }
}