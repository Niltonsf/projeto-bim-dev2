package br.com.up.projetobimestral;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

import br.com.up.projetobimestral.model.Message;

public class CreateMessage extends AppCompatActivity {

    Message message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);

        TextInputEditText usuario = findViewById(R.id.usuario_input);
        TextInputEditText mensagem = findViewById(R.id.mensagem_input);
        Button save = findViewById(R.id.save_button);
    }
}