package com.example.transactionactivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class TransactionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_transaction);

    }
    @Override
    protected void onResume() {
        super.onResume();
        ListView trans;
        trans = findViewById(R.id.transactions);

        ArrayList<Transaction> listTrans = new ArrayList<Transaction>();
        listTrans.add(new
                Transaction(R.drawable.icontrans,"transaction1","295","12/12/21","97876534","R1234567",10000));
        listTrans.add(new
                Transaction(R.drawable.icontrans,"transaction2","455","13/12/21","97876534","R1234568",14000));
        listTrans.add(new
                Transaction(R.drawable.icontrans,"transaction3","2450","22/12/21","9787653","R1234569",20000));
        listTrans.add(new
                Transaction(R.drawable.icontrans,"transaction4","2150","29/12/21","97876534","R1234560",17000));
        listTrans.add(new
                Transaction(R.drawable.icontrans,"transaction5","695","01/12/21","97876534","R1234564",10900));
        TransactionAdapter adapter = new
                TransactionAdapter(this,R.layout.cellule,listTrans);
        trans.setFocusable(true);
        trans.setAdapter(adapter);
        trans.setEnabled(true);
        trans.setItemsCanFocus(false);
        trans.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int
            position, long id) {
                Toast.makeText(getApplicationContext(),"itemclicked",Toast.LENGTH_LONG);
            }
        });
    }
}