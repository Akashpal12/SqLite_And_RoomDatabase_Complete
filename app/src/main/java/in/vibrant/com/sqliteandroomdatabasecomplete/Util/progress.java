package in.vibrant.com.sqliteandroomdatabasecomplete.Util;

import android.app.ProgressDialog;
import android.content.Context;

public class progress {
    private static ProgressDialog progressDialog;

    public static void show(Context context, String message) {
        progressDialog = new ProgressDialog(context);
        progressDialog.setMessage(message);
        progressDialog.setCancelable(false);
        progressDialog.show();
    }

    public static void dismiss() {
        if (progressDialog != null && progressDialog.isShowing()) {
            progressDialog.dismiss();
        }
    }
}
