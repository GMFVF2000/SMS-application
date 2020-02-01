package com.example.sms;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {


    //proprietes
    private EditText phone;
    private EditText message;
    private Button envoi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initActivity();
    }

         /**

        *initializations
        */
private void initActivity() {
    //recuperation objects graphiques
    phone = (EditText)findViewById(R.id.TxtPhone);
    message = (EditText) findViewById(R.id.TxtMessage);
    envoi = (Button) findViewById(R.id.btnEnvoi);
    //gestion de l'evenement clic sur bouton envoi
    createOnClickEnvoiButton();
}


    /**
     * clic sur bouton envoi : envoi de sms
     *
     */
private void createOnClickEnvoiButton(){
    envoi.setOnClickListener(new Button.OnClickListener() {
        public void onClick(View v) {
            SmsManager.getDefault().sendTextMessage(phone.getText().toString(),null,
                message.getText().toString(),null, null);

        }
    }) ;

}


}
