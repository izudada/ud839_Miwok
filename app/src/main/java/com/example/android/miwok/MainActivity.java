/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
// import android.support.v7.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        //  Get all text views
        TextView numberTextView = (TextView) findViewById(R.id.numbers);
        TextView familyTextView = (TextView) findViewById(R.id.family);
        TextView colorTextView = (TextView) findViewById(R.id.colors);
        TextView phraseTextView = (TextView) findViewById(R.id.phrases);

        // Onclick listener on numbers text view
        numberTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numberActivity = new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(numberActivity);
            }
        });

        // Onclick listener on family text view
        familyTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent familyActivity = new Intent(MainActivity.this, FamilyMembersActivity.class);
                startActivity(familyActivity);
            }
        });

        // Onclick listener on color text view
        colorTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent colorActivity = new Intent(MainActivity.this, ColorsActivity.class);
                startActivity(colorActivity);
            }
        });

        // Onclick listener on phrases text view
        phraseTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent phraseActivity = new Intent(MainActivity.this, PhrasesActivity.class);
                startActivity(phraseActivity);
            }
        });
    }
}
