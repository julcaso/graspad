package com.example.smaltics.graspad;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText mEtTitle, mEtContent;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEtTitle = (EditText) findViewById(R.id.note_et_title);
        mEtContent = (EditText) findViewById(R.id.note_et_content);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        Note note = new Note(System.currentTimeMillis(),mEtTitle.getText().toString()
                ,mEtContent.getText().toString());

        switch(item.getItemId()){

            case R.id.action_main_new_note:
                Toast.makeText(this,"New note started", Toast.LENGTH_SHORT).show();
                blankScreen();
                break;

            case R.id.action_main_save_note:
                saveNote(note);
                break;

            case R.id.action_main_delete_note:
                Toast.makeText(this,"Is not working yet :)", Toast.LENGTH_SHORT).show();
                break;
        }

        return true;
    }

    private void saveNote(Note objectNote){

        if (Utilities.saveNote(this,objectNote)){
            Toast.makeText(this,"Your note is saved!", Toast.LENGTH_SHORT).show();
        } else{
            Toast.makeText(this,"Can not save the note. Please check your drive space",
                    Toast.LENGTH_SHORT).show();
        }
    }

    private void blankScreen(){
        mEtTitle.setText("");
        mEtContent.setText("");
    }

}
