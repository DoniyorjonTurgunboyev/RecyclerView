package uz.gita.recyclerview.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

import uz.gita.recyclerview.R;
import uz.gita.recyclerview.adapters.ContactAdapter;
import uz.gita.recyclerview.data.Contact;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<Contact> contacts = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            Contact contact = new Contact("Husniddin " + i, "+9989450500" + i);
            contacts.add(contact);
        }
        RecyclerView rv = findViewById(R.id.rv);
        LinearLayoutManager layoutManager
                = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        RecyclerView.Adapter<ContactAdapter.ViewHolder> adapter = new ContactAdapter(contacts);
        rv.setLayoutManager(layoutManager);
        rv.setAdapter(adapter);
    }
}