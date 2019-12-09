package com.myapplication;

import android.content.Context;
import android.content.Intent;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.textclassifier.ConversationActions;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class MessageAdapter extends RecyclerView.Adapter<MessageAdapter.MessageViewHolder>{


    Context mContext;
    List<Telegram> telegramList;

    //Constructor to receive data from the activity
    public MessageAdapter(Context mContext, List<Telegram> telegramList){
        this.mContext = mContext;
        this.telegramList = telegramList;
    }

    @NonNull
    @Override
    public MessageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.message_view,parent, false);
        return new MessageViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MessageViewHolder holder, int position) {
        final Telegram telegram = telegramList.get(position);
        holder.imgProfile.setImageResource(telegram.getImageId());
        holder.tvName.setText(telegram.getName());
        holder.tvMessage.setText(telegram.getMessage());
        holder.tvTime.setText(telegram.getTime());

        holder.imgProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, full_description.class);

                intent.putExtra("image", telegram.getImageId());
                intent.putExtra("name", telegram.getName());
                intent.putExtra("message", telegram.getMessage());
                intent.putExtra("time", telegram.getTime());

                mContext.startActivity(intent);
            }
        });


    }

    @Override
    public int getItemCount()
    {
        return telegramList.size();
    }



    public class MessageViewHolder extends RecyclerView.ViewHolder{

        CircleImageView imgProfile;
        TextView tvName, tvMessage, tvTime;


        public MessageViewHolder(@NonNull View itemView) {
            super(itemView);

            imgProfile = itemView.findViewById(R.id.imageView);
            tvName = itemView.findViewById(R.id.tvName);
            tvMessage = itemView.findViewById(R.id.tvMessage);
            tvTime = itemView.findViewById(R.id.tvTime);
        }
    }
}
