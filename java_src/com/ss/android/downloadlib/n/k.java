package com.ss.android.downloadlib.n;

import android.text.TextUtils;
import com.ss.android.downloadlib.activity.TTDelegateActivity;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes5.dex */
public class k {
    private static Map<String, vv> vv = Collections.synchronizedMap(new HashMap());

    /* loaded from: classes5.dex */
    public interface vv {
        void vv();

        void vv(String str);
    }

    public static boolean m(String str) {
        return com.ss.android.downloadlib.addownload.b.o().vv(com.ss.android.downloadlib.addownload.b.getContext(), str);
    }

    private static vv p(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return vv.remove(str);
    }

    public static void vv(String[] strArr, vv vvVar) {
        if (strArr == null || strArr.length <= 0) {
            return;
        }
        String valueOf = String.valueOf(System.currentTimeMillis());
        vv(valueOf, vvVar);
        TTDelegateActivity.vv(valueOf, strArr);
    }

    public static void vv(String str) {
        vv p4;
        if (TextUtils.isEmpty(str) || (p4 = p(str)) == null) {
            return;
        }
        p4.vv();
    }

    public static void vv(String str, String str2) {
        vv p4;
        if (TextUtils.isEmpty(str) || (p4 = p(str)) == null) {
            return;
        }
        p4.vv(str2);
    }

    private static void vv(String str, vv vvVar) {
        if (TextUtils.isEmpty(str) || vvVar == null) {
            return;
        }
        vv.put(str, vvVar);
    }
}
