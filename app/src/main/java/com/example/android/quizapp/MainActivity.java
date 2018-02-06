package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculateScore(View v) {

/** Receives the name entered by the user and stores it in a variable. */
        EditText nameText = (EditText) findViewById(R.id.name_input_view);
        String name = nameText.getText().toString();

/** Checks if the agreement on the Condition is checked. */
        CheckBox conditionBox = findViewById(R.id.condition);
        boolean clickedCondition = conditionBox.isChecked();

        if (!clickedCondition) {
            /** If the agreement on the Condition is not checked, shows just the toast message,
             * and does not anything else.
             */

            Toast.makeText(this, getText(R.string.conditionReminder), Toast.LENGTH_LONG).show();
        } else {
/** Checks the state of those buttons and checkboxes which have non-zero values associated. */
            RadioButton radioButton11 = findViewById(R.id.radioButton11);
            boolean clicked11 = radioButton11.isChecked();
            RadioButton radioButton12 = findViewById(R.id.radioButton12);
            boolean clicked12 = radioButton12.isChecked();
            RadioButton radioButton13 = findViewById(R.id.radioButton13);
            boolean clicked13 = radioButton13.isChecked();
            RadioButton radioButton14 = findViewById(R.id.radioButton14);
            boolean clicked14 = radioButton14.isChecked();
            RadioButton radioButton15 = findViewById(R.id.radioButton15);
            boolean clicked15 = radioButton15.isChecked();
            RadioButton radioButton22 = findViewById(R.id.radioButton22);
            boolean clicked22 = radioButton22.isChecked();
            RadioButton radioButton42 = findViewById(R.id.radioButton42);
            boolean clicked42 = radioButton42.isChecked();
            RadioButton radioButton53 = findViewById(R.id.radioButton53);
            boolean clicked53 = radioButton53.isChecked();
            RadioButton radioButton63 = findViewById(R.id.radioButton63);
            boolean clicked63 = radioButton63.isChecked();
            CheckBox checkBox31 = findViewById(R.id.checkBox31);
            boolean clicked31 = checkBox31.isChecked();
            CheckBox checkBox32 = findViewById(R.id.checkBox32);
            boolean clicked32 = checkBox32.isChecked();
            CheckBox checkBox33 = findViewById(R.id.checkBox33);
            boolean clicked33 = checkBox33.isChecked();
            CheckBox checkBox34 = findViewById(R.id.checkBox34);
            boolean clicked34 = checkBox34.isChecked();
/** Counts up the result depending on the states of the non-zero elements. */
            if (clicked11) {
                score += 3;
            }
            if (clicked12) {
                score += 4;
            }
            if (clicked13) {
                score += 4;
            }
            if (clicked14) {
                score += 2;
            }
            if (clicked15) {
                score += 3;
            }
            if (clicked22) {
                score += 3;
            }
            if (clicked42) {
                score += 3;
            }
            if (clicked53) {
                score += 4;
            }
            if (clicked63) {
                score += 3;
            }
            if (clicked31) {
                score -= 1;
            }
            if (clicked32) {
                score += 2;
            }
            if (clicked33) {
                score -= 1;
            }
            if (clicked34) {
                score += 2;
            }


            String announcement = getText(R.string.finalAnnouncementI) + " " + name +
                    getText(R.string.finalAnnouncementII) + " " + score + " " +
                    getText(R.string.finalAnnouncementIII);

            /** Decides on which comment to show depending on the result. */
            CharSequence comment;
            if (score > 20) {
                comment = getText(R.string.finalCommentA);
            } else {
                if (score > 17) {
                    comment = getText(R.string.finalCommentB);
                } else {
                    if (score > 10) {
                        comment = getText(R.string.finalCommentC);
                    } else {
                        comment = getText(R.string.finalCommentD);
                    }
                }
            }

/** Displays the sequence of two toasts - the result and comment on it. */
            Toast.makeText(this, announcement, Toast.LENGTH_LONG).show();
            Toast.makeText(this, comment, Toast.LENGTH_LONG).show();

            score = 0;
        }
    }

}
