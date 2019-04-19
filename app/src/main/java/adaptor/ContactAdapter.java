package adaptor;

import android.content.Context;
import android.content.Intent;
import android.location.Address;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.e.recyclerview.DetailActivity;
import com.e.recyclerview.R;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;
import model.Contacts;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ContactViewHolder>
{
    Context mContext;
    List<Contacts>contactsList;


    public ContactAdapter(Context mContext,List<Contacts>contactsList){
        this.mContext=mContext;
        this.contactsList=contactsList;
    }
    @NonNull
    @Override
    public ContactViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
       View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.contacts,viewGroup,false);


        return new ContactViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ContactViewHolder contactViewHolder, int i) {

        final Contacts contacts=contactsList.get(i);
        contactViewHolder.Profile.setImageResource(contacts.getImageId());
        contactViewHolder.Name.setText(contacts.getName());
        contactViewHolder.Phone.setText(contacts.getPhoneNo());




   contactViewHolder.Profile.setOnClickListener(new View.OnClickListener() {
       @Override
       public void onClick(View v) {


           Intent intent = new Intent(mContext, DetailActivity.class);
           intent.putExtra("image", contacts.getImageId());
           intent.putExtra("name", contacts.getName());
           intent.putExtra("phone", contacts.getPhoneNo());
           intent.putExtra("address",contacts.getAddress());
           intent.putExtra("email",contacts.getEmail());

           mContext.startActivity(intent);




       }
   });
    }





    @Override
    public int getItemCount() {
        return contactsList.size();
    }

    public class ContactViewHolder extends RecyclerView.ViewHolder{

        CircleImageView Profile;
        TextView Name,Phone;

        public ContactViewHolder(@NonNull View itemView) {

            super(itemView);
            Profile=itemView.findViewById(R.id.imageProfile);
            Name=itemView.findViewById(R.id.tvName);
            Phone=itemView.findViewById(R.id.tvPhone);
        }
    }
}
