package com.codeagain.esathi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import ai.api.android.AIConfiguration;
import ai.api.android.AIService;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final AIConfiguration config = new AIConfiguration("a55c7d585f8c4b9d9fe85a0c481dc7ad ",
                AIConfiguration.SupportedLanguages.English,
                AIConfiguration.RecognitionEngine.System);
        AIService aiService = AIService.getService(getApplicationContext(), config);
        AIImplement listener = new AIImplement();
        aiService.setListener(listener);



    }
}
