package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:

    TextView mStoryText;
    Button mTop;
    Button mBottom;
    int mStoryIndex = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:

        mStoryText = findViewById(R.id.storyTextView);
        mTop = findViewById(R.id.buttonTop);
        mBottom = findViewById(R.id.buttonBottom);



        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:

        mBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(mStoryIndex == 1)
                {
                    updateStory(R.string.T2_Story,R.string.T2_Ans1,R.string.T2_Ans2);
                    mStoryIndex = 2;
                }
                else if(mStoryIndex == 2)
                {
                    mStoryText.setText(R.string.T4_End);
                    mTop.setVisibility(View.GONE);
                    mBottom.setVisibility(View.GONE);
                }
                else if(mStoryIndex == 3)
                {
                    mStoryText.setText(R.string.T5_End);
                    mTop.setVisibility(View.GONE);
                    mBottom.setVisibility(View.GONE);
                }

                else if(mStoryIndex == 4)
                {
                    mStoryText.setText(R.string.T5_End);
                    mTop.setVisibility(View.GONE);
                    mBottom.setVisibility(View.GONE);
                }


            }
        });

        mTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(mStoryIndex == 1)
                {
                    updateStory(R.string.T3_Story,R.string.T3_Ans1,R.string.T3_Ans2);
                    mStoryIndex = 3;
                }
                else if(mStoryIndex == 2)
                {
                    updateStory(R.string.T3_Story,R.string.T3_Ans1,R.string.T3_Ans2);
                    mStoryIndex = 4;
                }
                else if(mStoryIndex == 3)
                {
                    mStoryText.setText(R.string.T6_End);
                    mTop.setVisibility(View.GONE);
                    mBottom.setVisibility(View.GONE);
                }
                else if(mStoryIndex == 4)
                {
                    mStoryText.setText(R.string.T6_End);
                    mTop.setVisibility(View.GONE);
                    mBottom.setVisibility(View.GONE);
                }

            }
        });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:

    }

    private void updateStory(int mStoryId, int Ans1Id, int Ans2Id)
    {
        mStoryText.setText(mStoryId);
        mTop.setText(Ans1Id);
        mBottom.setText(Ans2Id);

    }
}

