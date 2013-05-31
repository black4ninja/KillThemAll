package com.edu4java.android.killthemall;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

public class Main extends Activity {
    /**
     * Called when the activity is first created.
     */

    //http://www.edu4java.com/androidgame.html
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(new GameView(this));
    }

}
