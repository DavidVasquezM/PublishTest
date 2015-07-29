package com.edesarrollos.PublishTest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.edesarrollos.PublishTest.db.User;

public class MainActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Intent Init = null;
        /*if (User.get(this) == null) {
            Init = new Intent(this, LoginActivity.class);
        } else {*/
            Init = new Intent(this, NavigatorActivity.class);
        //}
        startActivity(Init);
        finish();
    }
}
