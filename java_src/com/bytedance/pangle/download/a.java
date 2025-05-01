package com.bytedance.pangle.download;

import android.app.Activity;
import com.bytedance.pangle.Zeus;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes2.dex */
public class a {

    /* renamed from: b  reason: collision with root package name */
    private static volatile a f8308b;

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f8309a = new CopyOnWriteArrayList();

    public a() {
        Zeus.getAppApplication().registerActivityLifecycleCallbacks(new com.bytedance.pangle.a() { // from class: com.bytedance.pangle.download.a.1
            @Override // com.bytedance.pangle.a, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityResumed(Activity activity) {
                Iterator it2 = a.this.f8309a.iterator();
                while (it2.hasNext()) {
                    it2.next();
                    b.a();
                }
            }
        });
    }

    public static a a() {
        if (f8308b == null) {
            synchronized (a.class) {
                if (f8308b == null) {
                    f8308b = new a();
                }
            }
        }
        return f8308b;
    }
}
