package com.greenfox.pkrisz0.pkrisz0chatapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.greenfox.pkrisz0.pkrisz0chatapp.adapter.MessageAdapter;
import com.greenfox.pkrisz0.pkrisz0chatapp.model.Message;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button sendButton = (Button) findViewById(R.id.button);
        ListView listView = (ListView) findViewById(R.id.list);
        final EditText editText = (EditText) findViewById(R.id.editText);

        Message test = new Message("kriszti","Hello World!");
        Message test2 = new Message("kriszti","Hello Mars!");

        final MessageAdapter messageAdapter = new MessageAdapter(getApplicationContext());

        messageAdapter.addAll(test, test2);

        listView.setAdapter(messageAdapter);

        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                messageAdapter.add(new Message("kriszti", editText.getText().toString()));
            }
        });
    }
}
