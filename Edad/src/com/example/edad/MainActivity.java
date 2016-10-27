package com.example.edad;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends ActionBarActivity {
	EditText edad,fecha,signo,dias;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		fecha=(EditText) findViewById(R.id.txtfecha);
		edad=(EditText) findViewById(R.id.txtedad);
		signo=(EditText) findViewById(R.id.txtsigno);
		dias=(EditText) findViewById(R.id.txtdias);
		
	}
	
	public void analizar(View vis){
		
		int anioactual=2016;
		int mesactual=5;
		int diaactual=9;
		int x;
		String a=fecha.getText().toString();
		String fechaArray[] = a.split("/");
		int anioingresado=Integer.parseInt(fechaArray[0]);
		int mesingresado=Integer.parseInt(fechaArray[1]);
		int diaingresado=Integer.parseInt(fechaArray[2]);
		//algoritmo para calcular la edad
		if( mesingresado>=mesactual){
			
			x=((anioactual-anioingresado)-1);
			edad.setText(String.valueOf(x));
		}else{
			x=((anioactual-anioingresado));
			edad.setText(String.valueOf(x));
			
		}
		//algoritmo para calcular el signo
		String ar="aries";
		String pi="piscis";
		String ac="acuadio";
		String ca="capricornio";
		String sa="sagitario";
		String can="cancer";
		String ge="geminis";
		String vi="virgo";
		String ta="tauro";
		String li="libra";
		String es="escorpion";
		String leo="leo";
		
		
		
		if(((diaingresado>21) && (mesingresado==3)) ||((diaingresado<=20)&&( mesingresado == 4))){
			
			signo.setText(String.valueOf(ar));
			
		}
		if(((diaingresado>24) && (mesingresado==9)) ||((diaingresado<=23)&&( mesingresado == 10))){
			
			signo.setText(String.valueOf(li));
			
		}
		if(((diaingresado>21) && (mesingresado==4)) ||((diaingresado<=21)&&( mesingresado == 5))){
			
			signo.setText(String.valueOf(ta));
			
		}
		if(((diaingresado>24) && (mesingresado==10)) ||((diaingresado<=22)&&( mesingresado == 11))){
			
			signo.setText(String.valueOf(es));
			
		}
		if(((diaingresado>22) && (mesingresado==5)) ||((diaingresado<=21)&&( mesingresado == 6))){
			
			signo.setText(String.valueOf(ge));
			
		}	
		if(((diaingresado>23) && (mesingresado==11)) ||((diaingresado<=21)&&( mesingresado == 12))){
			
			signo.setText(String.valueOf(sa));
			
		}
		if(((diaingresado>21) && (mesingresado==6)) ||((diaingresado<=23)&&( mesingresado == 7))){
			
			signo.setText(String.valueOf(can));
			
		}	
		if(((diaingresado>22) && (mesingresado==12)) ||((diaingresado<=20)&&( mesingresado == 1))){
			
			signo.setText(String.valueOf(ca));
			
		}	
		if(((diaingresado>24) && (mesingresado==7)) ||((diaingresado<=23)&&( mesingresado == 8))){
			
			signo.setText(String.valueOf(leo));
			
		}	
		if(((diaingresado>21) && (mesingresado==1)) ||((diaingresado<=19)&&( mesingresado == 2))){
			
			signo.setText(String.valueOf(ac));
			
		}	
		if(((diaingresado>24) && (mesingresado==8)) ||((diaingresado<=23)&&( mesingresado == 9))){
			
			signo.setText(String.valueOf(vi));
			
		}	
		if(((diaingresado>20) && (mesingresado==2)) ||((diaingresado<=20)&&( mesingresado == 3))){
	
			signo.setText(String.valueOf(pi));
	
		}	
		
		
		//algoritmo para determinar el tiempo restante para el proximo cumpleaños
		
		int resp=0;
		if((mesingresado>=mesactual)&& (diaingresado>=diaactual)){
			resp=((mesingresado-mesactual)*30)+(diaingresado-diaactual);
			
			dias.setText(String.valueOf(resp));
			
			
			
		}
		
		if((mesingresado<=mesactual)&& (diaingresado>=diaactual)){
			resp=(((mesingresado+12)-mesactual)*30)+(diaingresado-diaactual);
			
			dias.setText(String.valueOf(resp));
			
			
			
		}
		if((mesingresado<=mesactual)&& (diaingresado<=diaactual)){
			resp=(((mesingresado)-mesactual)*30)+(diaingresado);
			
			dias.setText(String.valueOf(resp));
			
			
			
		}
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
