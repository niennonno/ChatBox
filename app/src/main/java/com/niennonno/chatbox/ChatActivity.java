package com.niennonno.chatbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ChatActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        ListView listView = (ListView)findViewById(R.id.messages_list);
        listView.setAdapter(new MessagesAdapter(new ArrayList<Message>()));
    }

    private class MessagesAdapter extends ArrayAdapter<com.niennonno.chatbox.Message> {
        MessagesAdapter(ArrayList<com.niennonno.chatbox.Message> messages) {
            super(ChatActivity.this, R.layout.messages_list_item, R.id.message, messages);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            convertView = super.getView(position, convertView, parent);
            Message message = getItem(position);
            TextView nameView = (TextView) convertView.findViewById(R.id.message);
            nameView.setText(message.getmText());
            return convertView;
        }

    }
}
