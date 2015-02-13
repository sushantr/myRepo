package edu.gatech.seclass.calculator;

import android.app.Activity;
import android.os.Bundle;

import android.view.View;

import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends Activity {
	//Define Global Variable to Display result
	//I have tested this with Genymotion in class VM over Windows 7 on DELL Latitude
	TextView myDisp;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		//Initialize the Result screen or Display of Calculator
		myDisp=(TextView) findViewById(R.id.textView2);
        myDisp.setText("0");
	}

	//This block deals with only numeric buttons and limited 9 digits to display
	static boolean isEmpty=true;
    public void num_Clicked(View sender){
            Button myBt=(Button)sender;
            if(myDisp.getText().length()>9) return;
            if (isEmpty){
                    myDisp.setText(myBt.getText());
                    isEmpty=false;
            }else{
                    myDisp.append(myBt.getText());                  
            }
    }
    
	//This block deals with only Operation buttons (such as '+' '-' '*' '=' 'C')
    //It performs each operation at a time with '=' to show the result
    //Kept it very basic without performing complex operation such as looping  
    //Example: 8 + 4 = Result will be shown on the display
    //Clean: It is recommended to 'C' clear the display before doing another operation, otherwise it will work too
    static Integer myRes=0, curNum=0;
    String sign_flag="";
    public void op_Clicked(View sender){
    	Button opBt=(Button)sender;
    	
    	if(opBt.getText().toString().equals("*")) {
    		curNum=Integer.parseInt(myDisp.getText().toString());
    		if(sign_flag.toString().equals("*")){
        		myRes= myRes * curNum;
    		}else{
    			myRes=curNum;
    		}
    		myDisp.setText(Integer.toString(myRes));
            sign_flag="*";
    	}
    	if(opBt.getText().toString().equals("+")) {
    		curNum=Integer.parseInt(myDisp.getText().toString());
    		myRes+=curNum;
    		myDisp.setText(Integer.toString(myRes));
            sign_flag="+";
    	}
    	if(opBt.getText().toString().equals("-")) {
    		curNum=Integer.parseInt(myDisp.getText().toString());
    		if(sign_flag.toString().equals("-")){
        		myRes= myRes - curNum;
    		}else{
    			myRes=curNum;
    		}
    		myDisp.setText(Integer.toString(curNum));
            sign_flag="-";
    	}
    	if(opBt.getText().toString().equals("=")) {
    		if (sign_flag.equals("+")) {
    			myRes+=Integer.parseInt(myDisp.getText().toString());
    			sign_flag="+";
    		}
    		if (sign_flag.toString().equals("-")) {
    			myRes = myRes - Integer.parseInt(myDisp.getText().toString());
    			sign_flag="-";
    		}
    		if (sign_flag.equals("*")) {
    			curNum = Integer.parseInt(myDisp.getText().toString());
    			if(sign_flag.toString().equals("*")){
            		myRes = myRes * curNum;
        		}
    			sign_flag="*";
    		}
    		myDisp.setText(Integer.toString(myRes));
    		myRes=0;
            curNum=0;
            sign_flag="";
    	}
    	
    	if(opBt.getText().toString().equals("C")) {
            myDisp.setText("0");
            myRes=0;
            curNum=0;
            sign_flag="";
    	}
    	isEmpty=true;
    }

}
