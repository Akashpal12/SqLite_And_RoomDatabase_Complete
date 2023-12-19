package in.vibrant.com.sqliteandroomdatabasecomplete.Util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

public class intent {

    public static void startActivity(Context context, Class<?> cls) {
        Intent intent = new Intent(context, cls);
        context.startActivity(intent);
    }
    public static void startActivityFinish(Context context, Class<?> c) {
        Intent intent = new Intent(context, c);
        context.startActivity(intent);
        if (context instanceof Activity) {
            ((Activity) context).finish();
        }
    }
}
