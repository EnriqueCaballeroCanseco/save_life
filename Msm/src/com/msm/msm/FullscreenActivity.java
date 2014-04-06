package com.msm.msm;

import android.app.Activity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;



public class FullscreenActivity extends Activity {
		
Button btnSendSMS;

public void onCreate(Bundle savedInstanceState){
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_fullscreen);
btnSendSMS=(Button)findViewById(R.id.btnSendSMS);


btnSendSMS=(Button)findViewById(R.id.btnSendSMS);
btnSendSMS.setOnClickListener(new View.OnClickListener(){
public void onClick(View v){
sendSMS("9512221621","ALERTA:ENRIQUE CABALLERO CANSECO A TENIDO UN ACCIDENTE AUTOMOVILISTICO");
}
});
}
private void sendSMS (String phoneNumber, String message){
SmsManager sms=SmsManager.getDefault();
sms.sendTextMessage(phoneNumber,null,message,null,null);}}

