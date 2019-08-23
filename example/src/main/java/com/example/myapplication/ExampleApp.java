package com.example.myapplication;

import android.app.Application;

import com.example.latte.ec.Icon.FontEcModule;
import com.example.latte_core.app.Latte;
import com.joanzapata.iconify.fonts.FontAwesomeModule;

public class ExampleApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Latte.init(this)
        .withIcon(new FontAwesomeModule())
        .withIcon(new FontEcModule())
        .withApiHost("https://127.0.0.1/")
        .configure();
    }
}
