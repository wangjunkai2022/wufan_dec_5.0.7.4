package com.kuaishou.weapon.p0;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
/* loaded from: classes5.dex */
public class da {

    /* renamed from: b  reason: collision with root package name */
    private static volatile da f55502b;

    /* renamed from: a  reason: collision with root package name */
    private Context f55503a;

    /* renamed from: c  reason: collision with root package name */
    private Application.ActivityLifecycleCallbacks f55504c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f55505d;

    private da(Context context) {
        this.f55503a = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        try {
            Context context = this.f55503a;
            if (context == null) {
                return;
            }
            h a5 = h.a(context, "re_po_rt");
            if (a5.b(df.f55550w, 0) == 0) {
                return;
            }
            final int[] iArr = {0};
            final int[] iArr2 = {a5.b(df.f55538k, 1)};
            if (this.f55503a instanceof Application) {
                Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = new Application.ActivityLifecycleCallbacks() { // from class: com.kuaishou.weapon.p0.da.2
                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityCreated(Activity activity, Bundle bundle) {
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityDestroyed(Activity activity) {
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityPaused(Activity activity) {
                        try {
                            int[] iArr3 = iArr;
                            iArr3[0] = iArr3[0] + 1;
                            n.a().a(new Runnable() { // from class: com.kuaishou.weapon.p0.da.2.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                    if (iArr[0] < 20 && iArr2[0] <= 0) {
                                        ((Application) da.this.f55503a).unregisterActivityLifecycleCallbacks(da.this.f55504c);
                                        return;
                                    }
                                    int[] iArr4 = iArr2;
                                    iArr4[0] = iArr4[0] - 1;
                                    cx.a(da.this.f55503a).a(106);
                                    dd.a(da.this.f55503a).a(106);
                                    db.a(da.this.f55503a).a(106, 0);
                                    cy.a(da.this.f55503a).a(106);
                                    cz.a(da.this.f55503a).a(106);
                                    de.a(da.this.f55503a).a(106);
                                }
                            });
                        } catch (Throwable unused) {
                        }
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityResumed(Activity activity) {
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityStarted(Activity activity) {
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityStopped(Activity activity) {
                    }
                };
                this.f55504c = activityLifecycleCallbacks;
                ((Application) this.f55503a).registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
            }
        } catch (Throwable unused) {
        }
    }

    public static da a(Context context) {
        if (f55502b == null) {
            synchronized (da.class) {
                if (f55502b == null) {
                    f55502b = new da(context);
                }
            }
        }
        return f55502b;
    }

    public void a() {
        try {
            n.a().a(new Runnable() { // from class: com.kuaishou.weapon.p0.da.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        h a5 = h.a(da.this.f55503a, "re_po_rt");
                        boolean e5 = a5.e("a1_p_s_p_s");
                        boolean e6 = a5.e("a1_p_s_p_s_c_b");
                        if ((e5 || e6) && !da.this.f55505d) {
                            da.this.f55505d = true;
                            da.this.b();
                        }
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }
}
