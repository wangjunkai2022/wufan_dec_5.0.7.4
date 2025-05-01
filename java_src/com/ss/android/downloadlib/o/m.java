package com.ss.android.downloadlib.o;

import android.text.TextUtils;
import androidx.annotation.NonNull;
/* loaded from: classes5.dex */
public class m {

    /* loaded from: classes5.dex */
    public interface vv<T> {
        T m();
    }

    public static <T> T vv(boolean z4, String str, @NonNull vv<T> vvVar) {
        try {
            return vvVar.m();
        } catch (Throwable th) {
            if (!(th instanceof com.ss.android.downloadlib.o.vv)) {
                p.vv().vv(z4, th, str);
                if (TextUtils.isEmpty(str)) {
                    throw th;
                }
                return null;
            }
            throw th;
        }
    }

    public static <T> T vv(vv<T> vvVar) {
        return (T) vv(true, null, vvVar);
    }

    public static void vv(final Runnable runnable) {
        vv(new vv<Void>() { // from class: com.ss.android.downloadlib.o.m.1
            @Override // com.ss.android.downloadlib.o.m.vv
            /* renamed from: vv */
            public Void m() {
                runnable.run();
                return null;
            }
        });
    }
}
