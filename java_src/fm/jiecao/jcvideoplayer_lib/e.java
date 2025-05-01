package fm.jiecao.jcvideoplayer_lib;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.ContextThemeWrapper;
import com.kwad.sdk.core.response.model.SdkConfigData;
import java.util.Formatter;
import java.util.LinkedHashMap;
import java.util.Locale;
/* compiled from: JCUtils.java */
/* loaded from: classes6.dex */
public class e {
    public static void a(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            context.getSharedPreferences("JCVD_PROGRESS", 0).edit().clear().apply();
        } else {
            context.getSharedPreferences("JCVD_PROGRESS", 0).edit().putInt(str, 0).apply();
        }
    }

    public static int b(Context context, float f5) {
        return (int) ((f5 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static AppCompatActivity c(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof AppCompatActivity) {
            return (AppCompatActivity) context;
        }
        if (context instanceof ContextThemeWrapper) {
            return c(((ContextThemeWrapper) context).getBaseContext());
        }
        return null;
    }

    public static String d(LinkedHashMap<String, String> linkedHashMap, int i4) {
        if (linkedHashMap.size() == 1) {
            return g(linkedHashMap, i4);
        }
        return g(linkedHashMap, i4);
    }

    public static String e(LinkedHashMap<String, String> linkedHashMap, int i4) {
        int i5 = 0;
        for (String str : linkedHashMap.keySet()) {
            if (i5 == i4) {
                return str.toString();
            }
            i5++;
        }
        return null;
    }

    public static int f(Context context, String str) {
        if (JCVideoPlayer.O) {
            return context.getSharedPreferences("JCVD_PROGRESS", 0).getInt(str, 0);
        }
        return 0;
    }

    public static String g(LinkedHashMap<String, String> linkedHashMap, int i4) {
        int i5 = 0;
        for (String str : linkedHashMap.keySet()) {
            if (i5 == i4) {
                return linkedHashMap.get(str);
            }
            i5++;
        }
        return null;
    }

    public static boolean h(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.getType() == 1;
    }

    public static void i(Context context, String str, int i4) {
        if (JCVideoPlayer.O) {
            SharedPreferences.Editor edit = context.getSharedPreferences("JCVD_PROGRESS", 0).edit();
            edit.putInt(str, i4);
            edit.apply();
        }
    }

    public static Activity j(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return j(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static String k(int i4) {
        if (i4 <= 0 || i4 >= 86400000) {
            return "00:00";
        }
        int i5 = i4 / 1000;
        int i6 = i5 % 60;
        int i7 = (i5 / 60) % 60;
        int i8 = i5 / SdkConfigData.DEFAULT_REQUEST_INTERVAL;
        Formatter formatter = new Formatter(new StringBuilder(), Locale.getDefault());
        return i8 > 0 ? formatter.format("%d:%02d:%02d", Integer.valueOf(i8), Integer.valueOf(i7), Integer.valueOf(i6)).toString() : formatter.format("%02d:%02d", Integer.valueOf(i7), Integer.valueOf(i6)).toString();
    }
}
