package adaptor;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

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
    public void onBindViewHolder(@NonNull ContactViewHolder contactViewHolder, int i) {

        Contacts contacts=contactsList.get(i);

        contactViewHolder.imageProfile.setImageResource(contacts.getImageId());
    contactViewHolder.tvName.setText(contacts.getName());
    contactViewHolder.tvPhone.setText(contacts.getPhoneNo());
    }


    @Override
    public int getItemCount() {
        return contactsList.size();
    }

    public class ContactViewHolder extends RecyclerView.ViewHolder{

        CircleImageView imageProfile;
        TextView tvName,tvPhone;

        public ContactViewHolder(@NonNull View itemView) {

            super(itemView);
            imageProfile=itemView.findViewById(R.id.imageProfile);
            tvName=itemView.findViewById(R.id.tvName);
            tvPhone=itemView.findViewById(R.id.tvPhone);
        }
    }
}
