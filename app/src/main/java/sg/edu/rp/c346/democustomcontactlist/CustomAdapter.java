package sg.edu.rp.c346.democustomcontactlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {

    Context context;
    int resource;
    ArrayList<Contact> objects;

    public CustomAdapter(Context context, int resource, ArrayList<Contact> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.objects = objects;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Obtain the LayoutInflater object
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        // "Inflate" the View for each row
        View rowView = inflater.inflate(resource, parent, false);

        // Obtain the UI components and do the necessary binding
        TextView tvName = rowView.findViewById(R.id.tvName);
        TextView tvCountryCode = rowView.findViewById(R.id.tvCountryCode);
        TextView tvPhoneNum = rowView.findViewById(R.id.tvPhoneNum);
        ImageView ivGender = rowView.findViewById(R.id.imageViewGender);

        // Obtain the Android Version information based on the position
        Contact contact = objects.get(position);

        // Set values to the TextView to display the corresponding information
        tvName.setText(contact.getName());
        tvCountryCode.setText("+" + contact.getCountryCode());
        tvPhoneNum.setText(contact.getPhoneNum() + "");
        if(contact.getGender() =='f') {
            ivGender.setImageResource(R.drawable.female);
        }
        else{
            ivGender.setImageResource(R.drawable.male);
        }

        return rowView;
    }


}
