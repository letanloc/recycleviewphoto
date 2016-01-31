package com.example.loc.demo;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by loc on 31/01/2016.
 */
public class Text extends TextView {
    public Text(Context context) {
        super(context);
        Text text = new Text(context);
//        text.f
    }

    public Text(Context context, AttributeSet attrs) {
        super(context, attrs);

    }

    public Text(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
