package cn.sharesdk.framework.authorize;

import android.app.Activity;
/* compiled from: AuthorizeParams.java */
/* loaded from: classes2.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static volatile a f952a;

    /* renamed from: b  reason: collision with root package name */
    private Activity f953b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f954c;

    public static a c() {
        synchronized (a.class) {
            if (f952a == null) {
                synchronized (a.class) {
                    if (f952a == null) {
                        f952a = new a();
                    }
                }
            }
        }
        return f952a;
    }

    public boolean a() {
        return this.f954c;
    }

    public Activity b() {
        return this.f953b;
    }

    public void a(boolean z4) {
        this.f954c = z4;
    }

    public void a(Activity activity) {
        this.f953b = activity;
    }
}
