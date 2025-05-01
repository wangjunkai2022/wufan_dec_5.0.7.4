package com.beizi.ad.lance;

import android.content.Context;
import com.beizi.ad.lance.a.l;
/* compiled from: OnLineState.java */
/* loaded from: classes2.dex */
public class b {

    /* renamed from: c  reason: collision with root package name */
    private static b f6466c;

    /* renamed from: a  reason: collision with root package name */
    public c f6467a;

    /* renamed from: b  reason: collision with root package name */
    private String f6468b = "OnLineState";

    private b(Context context) {
        if (context == null) {
            l.c("OnLineState", "OnLineState init failed,because context cann't be null ");
            return;
        }
        c cVar = new c();
        this.f6467a = cVar;
        cVar.a(context);
    }

    public static b a(Context context) {
        if (f6466c == null) {
            synchronized (b.class) {
                if (f6466c == null) {
                    f6466c = new b(context);
                }
            }
        }
        return f6466c;
    }

    public void a(a aVar) {
        c cVar = this.f6467a;
        if (cVar != null) {
            cVar.a(aVar);
        } else {
            l.a(this.f6468b, "please init OnLineState first ,you can init it with 'OnLineState.init(context);' in you BaseApplication ");
        }
    }
}
