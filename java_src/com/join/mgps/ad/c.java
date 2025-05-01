package com.join.mgps.ad;

import android.content.Context;
import android.content.Intent;
import com.join.mgps.service.CommonService_;
import java.util.List;
/* compiled from: BaseInfoStreamVideo.java */
/* loaded from: classes4.dex */
public abstract class c<T> extends o<T> {

    /* renamed from: f  reason: collision with root package name */
    protected static boolean f39670f;

    /* renamed from: a  reason: collision with root package name */
    protected Context f39671a;

    /* renamed from: b  reason: collision with root package name */
    protected String f39672b;

    /* renamed from: c  reason: collision with root package name */
    protected String f39673c;

    /* renamed from: d  reason: collision with root package name */
    protected String f39674d;

    /* renamed from: e  reason: collision with root package name */
    protected a<T> f39675e;

    /* compiled from: BaseInfoStreamVideo.java */
    /* loaded from: classes4.dex */
    public interface a<T> {
        void a(T t4);

        void onADLoaded(List<T> list);

        void onAdClick();

        void onAdShow();
    }

    static {
        f39670f = com.join.android.app.common.http.c.f14632c;
    }

    public c(String str, Context context, String str2, String str3) {
        this.f39674d = str + "InfoStreamVideo";
        this.f39671a = context;
        this.f39672b = str2;
        this.f39673c = str3;
    }

    public abstract void a();

    public abstract void b(int i4, int i5, int i6);

    public abstract void c();

    public void d(String str) {
        Intent intent = new Intent("com.join.android.app.mgsim.wufun.broadcast.emu.commonpoint");
        intent.putExtra(CommonService_.b0.f54290b, str);
        this.f39671a.sendBroadcast(intent);
    }

    public void e(a<T> aVar) {
        this.f39675e = aVar;
    }
}
