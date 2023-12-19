
package in.vibrant.com.sqliteandroomdatabasecomplete.Util;

import android.app.Activity;
import android.content.pm.PackageManager;

import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

/**
 * This class is Made By Akash Pal (6387040456).
 * This class Provide Public To access anywhere Permissions.
 */
public class PermissionManager {
    public static int REQUEST_CODE = 1001; // Change the value as needed

    /**
     * This Method is Check if an array of permissions is granted..
     */
    public static boolean isPermissionsGranted(Activity activity, String[] permissions) {
        for (String permission : permissions) {
            int result = ContextCompat.checkSelfPermission(activity, permission);
            if (result != PackageManager.PERMISSION_GRANTED) {
                return false;
            }
        }
        return true;
    }

    /**
     * This Method is Request permissions.
     */

    public static void requestPermissions(Activity activity, String[] permissions, int requestCode) {
        ActivityCompat.requestPermissions(activity, permissions, requestCode);
    }
    /**
     * This Method is Handle the permission request result.
     */

    public static void onRequestPermissionsResult(Activity activity, int requestCode, String[] permissions, int[] grantResults) {
        if (requestCode == REQUEST_CODE) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                // Permission granted, you can perform the necessary action here
            } else {
                // Permission denied, handle it as needed (e.g., show a message)
            }
        }
    }
}