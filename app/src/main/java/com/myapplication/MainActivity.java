package com.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycleView);

        List<Telegram> telegramList = new ArrayList<>();

        telegramList.add(new Telegram("Martial design","You: Aw, come on. Seriously",R.drawable.old_man,"21:00"));
        telegramList.add(new Telegram("Valerie","What's the matter with you?",R.drawable.malee,"20:58"));
        telegramList.add(new Telegram("Vladimir","Now you want dialectical design?",R.drawable.user_male_icon,"20:57"));
        telegramList.add(new Telegram("Julian","Got any new materials?",R.drawable.women,"20:54"));
        telegramList.add(new Telegram("Pierre Gassendi","Ha! I told you materaralism was",R.drawable.download,"21:00"));
        telegramList.add(new Telegram("Martial design","You: Nono! It's ma-te-tial",R.drawable.user,"21:00"));
        telegramList.add(new Telegram("Madonna","Hey about the cold hard cash",R.drawable.malee,"21:00"));


        MessageAdapter messageAdapter = new MessageAdapter(this, telegramList);
        recyclerView.setAdapter(messageAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));


    }
}
