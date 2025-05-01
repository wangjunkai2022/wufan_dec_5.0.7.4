package com.php25.PDownload;

import android.content.Context;
/* compiled from: DownloadFileDao_.java */
/* loaded from: classes.dex */
public final class b extends a {

    /* renamed from: d  reason: collision with root package name */
    private static b f59639d;

    /* renamed from: b  reason: collision with root package name */
    private Context f59640b;

    /* renamed from: c  reason: collision with root package name */
    private Object f59641c;

    private b(Context context) {
        super(context);
        this.f59640b = context;
    }

    public static b i(Context context) {
        if (f59639d == null) {
            a4.c c5 = a4.c.c(null);
            b bVar = new b(context.getApplicationContext());
            f59639d = bVar;
            bVar.j();
            a4.c.c(c5);
        }
        return f59639d;
    }

    private void j() {
    }

    private b(Context context, Object obj) {
        super(context);
        this.f59640b = context;
        this.f59641c = obj;
    }
}
