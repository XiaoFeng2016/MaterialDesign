package im.vinci.materialdesign;

import android.app.Application;

/**
 * Created by mengxiaofeng on 16/7/6.
 */
public class App extends Application{
    private static App sInstance;

    public static App getInstance() {
        return sInstance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        sInstance = this;
    }
}
