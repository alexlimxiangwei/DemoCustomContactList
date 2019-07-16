package sg.edu.rp.c346.democustomcontactlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lvContact;
        ArrayList<Contact> alContact;
        CustomAdapter caContact;

        lvContact = findViewById(R.id.lvContacts);
        alContact = new ArrayList<>();
        alContact.add(new Contact ("Mary", 65,65442334,'f'));
        alContact.add(new Contact ("Ken",65,97442437,'m'));

        caContact = new CustomAdapter(this,R.layout.row,alContact);
        lvContact.setAdapter(caContact);

    }
}