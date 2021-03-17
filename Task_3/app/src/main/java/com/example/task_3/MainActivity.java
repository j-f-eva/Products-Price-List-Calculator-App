package com.example.task_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private CheckBox riceCheckBox,sugarCheckBox,milkCheckBox,onionCheckBox,potatoCheckBox;
    private Button place_my_order_Button;
    private TextView result_TextView,show_Payment_TextView,show_Delivery_Charge_TextView,show_total_priceResult_Textview;
    private RadioGroup radioGroup;
    private RadioButton payment_Method_Button;
    private Switch home_delivery_switch;
    private SeekBar rice_Seekbar,sugar_Seekbar,milk_Seekbar,onion_Seekbar,potato_Seekbar;
    private TextView rice_Seekbar_TextView,sugar_Seekbar_TextView,milk_Seekbar_TextView,onion_Seekbar_TextView,potato_Seekbar_TextView;
    int total_money, rice_Quantity,sugar_Quantity,milk_Quantity,onion_Quantity,potato_Quantity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        riceCheckBox =  findViewById(R.id.rice_checkbox);
        sugarCheckBox =  findViewById(R.id.sugar_checkbox);
        milkCheckBox =  findViewById(R.id.milk_checkbox);
        onionCheckBox =  findViewById(R.id.onion_checkbox);
        potatoCheckBox =  findViewById(R.id.potato_checkbox);

        radioGroup = findViewById(R.id.radio_Group_ID);

        home_delivery_switch = findViewById(R.id.home_delivery_switch);

        place_my_order_Button = findViewById(R.id.place_My_Order_Button);

        result_TextView = findViewById(R.id.show_Product_Result);
        show_Delivery_Charge_TextView = findViewById(R.id.show_DeliverCharge_Result_TextView);
        show_total_priceResult_Textview = findViewById(R.id.show_Total_Price_Result);
        show_Payment_TextView = findViewById(R.id.show_Payment_Result);

        rice_Seekbar = findViewById(R.id.rice_seekbar_ID);
        sugar_Seekbar = findViewById(R.id.sugar_seekbar_ID);
        milk_Seekbar = findViewById(R.id.milk_seekbar_ID);
        onion_Seekbar = findViewById(R.id.onion_seekbar_ID);
        potato_Seekbar = findViewById(R.id.potato_seekbar_ID);

        rice_Seekbar_TextView = findViewById(R.id.rice_seekbar_TextView_ID);
        sugar_Seekbar_TextView = findViewById(R.id.sugar_seekbar_TextView_ID);
        milk_Seekbar_TextView = findViewById(R.id.milk_seekbar_TextView_ID);
        onion_Seekbar_TextView = findViewById(R.id.onion_seekbar_TextView_ID);
        potato_Seekbar_TextView = findViewById(R.id.potato_seekbar_TextView_ID);


        //seekbar disable
        rice_Seekbar.setEnabled(false);
        sugar_Seekbar.setEnabled(false);
        milk_Seekbar.setEnabled(false);
        onion_Seekbar.setEnabled(false);
        potato_Seekbar.setEnabled(false);




        //rice
        rice_Seekbar_TextView.setText("Volume : "+rice_Seekbar.getProgress()+"/"+rice_Seekbar.getMax());
        rice_Seekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser)
            {
                rice_Seekbar_TextView.setText("Volume : "+progress+"/"+rice_Seekbar.getMax());
                rice_Quantity = progress;

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        //sugar
        sugar_Seekbar_TextView.setText("Volume : "+ sugar_Seekbar.getProgress()+"/"+ sugar_Seekbar.getMax());
        sugar_Seekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser)
            {
                sugar_Seekbar_TextView.setText("Volume : "+progress+"/"+ sugar_Seekbar.getMax());
                sugar_Quantity = progress;

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


        //milk
        milk_Seekbar_TextView.setText("Volume : "+ milk_Seekbar.getProgress()+"/"+ milk_Seekbar.getMax());
        milk_Seekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser)
            {
                milk_Seekbar_TextView.setText("Volume : "+progress+"/"+ milk_Seekbar.getMax());
                milk_Quantity = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        // onion

        onion_Seekbar_TextView.setText("Volume : "+ onion_Seekbar.getProgress()+"/"+ onion_Seekbar.getMax());
        onion_Seekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser)
            {
                onion_Seekbar_TextView.setText("Volume : "+progress+"/"+ onion_Seekbar.getMax());
                onion_Quantity = progress;

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


        //potato
        potato_Seekbar_TextView.setText("Volume : "+ potato_Seekbar.getProgress()+"/"+potato_Seekbar.getMax());
        potato_Seekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser)
            {
                potato_Seekbar_TextView.setText("Volume : "+progress+"/"+ potato_Seekbar.getMax());
                potato_Quantity = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


        //add listener in checkbox

        //for rice
        riceCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                if(riceCheckBox.isChecked())
                {
                    rice_Seekbar.setEnabled(true);
                    rice_Seekbar.setProgress(1);
                }

                else
                {
                    rice_Seekbar.setEnabled(false);
                    rice_Seekbar.setProgress(0);
                }
            }
        });


        //for sugar checkbox
        sugarCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                if(sugarCheckBox.isChecked())
                {
                   sugar_Seekbar.setEnabled(true);
                   sugar_Seekbar.setProgress(1);
                }

                else
                {
                    sugar_Seekbar.setEnabled(false);
                    sugar_Seekbar.setProgress(0);
                }
            }
        });

        //for milk checkbox
        milkCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                if(milkCheckBox.isChecked())
                {
                    milk_Seekbar.setEnabled(true);
                    milk_Seekbar.setProgress(1);
                }

                else
                {
                    milk_Seekbar.setEnabled(false);
                    milk_Seekbar.setProgress(0);
                }
            }
        });

        //for onion checkbox
        onionCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                if(onionCheckBox.isChecked())
                {
                    onion_Seekbar.setEnabled(true);
                    onion_Seekbar.setProgress(1);
                }

                else
                {
                    onion_Seekbar.setEnabled(false);
                    onion_Seekbar.setProgress(0);
                }
            }
        });

        //for potato checkbox
        potatoCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                if(potatoCheckBox.isChecked())
                {
                    potato_Seekbar.setEnabled(true);
                    potato_Seekbar.setProgress(1);
                }

                else
                {
                    potato_Seekbar.setEnabled(false);
                    potato_Seekbar.setProgress(0);
                }
            }
        });






        place_my_order_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
               StringBuilder stringBuilder = new StringBuilder();

               if( riceCheckBox.isChecked())
               {
                   String rice_Value =  riceCheckBox.getText().toString();
                   stringBuilder.append(rice_Value +" " );

               }

                if( sugarCheckBox.isChecked())
                {
                    String sugar_Value =  sugarCheckBox.getText().toString();
                    stringBuilder.append(sugar_Value +" " );

                }

                if( milkCheckBox.isChecked())
                {
                    String milk_Value =  milkCheckBox.getText().toString();
                    stringBuilder.append(milk_Value +" " );

                }

                if( onionCheckBox.isChecked())
                {
                    String onion_Value =  onionCheckBox.getText().toString();
                    stringBuilder.append(onion_Value +" " );

                }

                if( potatoCheckBox.isChecked())
                {
                    String potato_Value =  potatoCheckBox.getText().toString();
                    stringBuilder.append(potato_Value +" " );

                }

                result_TextView.setText("Products: " +stringBuilder);

                int select_radio_ID = radioGroup.getCheckedRadioButtonId();
                payment_Method_Button = findViewById(select_radio_ID);
                String radio_Button_value =  payment_Method_Button.getText().toString() ;
                show_Payment_TextView.setText("Payment: " +radio_Button_value);


                //add switch
                if (home_delivery_switch.isChecked())
                {
                    show_Delivery_Charge_TextView.setText("Delivery Charge: 50 BDT");

                }

                else
                {
                    show_Delivery_Charge_TextView.setText("Delivery Charge: N/A");

                }


                //calculation
                // delivery charge
                if(home_delivery_switch.isChecked())
                {
                    total_money =( (rice_Quantity*65) + (sugar_Quantity*35) + (milk_Quantity*60) + (onion_Quantity*80) + (potato_Quantity*50) + 50);
                    show_total_priceResult_Textview.setText("Total Price: "+total_money);
                }

                //without delivery charge
                else
                {
                    total_money = (rice_Quantity*65) + (sugar_Quantity*35) + (milk_Quantity*60) + (onion_Quantity*80) + (potato_Quantity*50) ;
                    show_total_priceResult_Textview.setText("Total Price: "+total_money);
                }

            }
        });

    }
}
