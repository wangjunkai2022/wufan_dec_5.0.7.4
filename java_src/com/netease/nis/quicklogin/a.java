package com.netease.nis.quicklogin;

import android.content.Context;
import com.netease.nis.basesdk.Logger;
import com.netease.nis.quicklogin.helper.b;
import com.netease.nis.quicklogin.helper.c;
import com.netease.nis.quicklogin.helper.d;
import com.netease.nis.quicklogin.listener.QuickLoginPreMobileListener;
import com.netease.nis.quicklogin.listener.QuickLoginTokenListener;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: QuickLoginHelper.java */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final Context f57413a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f57414b;

    /* renamed from: c  reason: collision with root package name */
    private final String f57415c;

    /* renamed from: d  reason: collision with root package name */
    private final String f57416d;

    /* renamed from: e  reason: collision with root package name */
    private final String f57417e;

    /* renamed from: f  reason: collision with root package name */
    private final int f57418f;

    /* renamed from: g  reason: collision with root package name */
    private com.netease.nis.quicklogin.helper.a f57419g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: QuickLoginHelper.java */
    /* renamed from: com.netease.nis.quicklogin.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C0569a {

        /* renamed from: a  reason: collision with root package name */
        private String f57420a;

        /* renamed from: b  reason: collision with root package name */
        private String f57421b;

        /* renamed from: c  reason: collision with root package name */
        private String f57422c;

        /* renamed from: d  reason: collision with root package name */
        private int f57423d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f57424e;

        public C0569a a(String str) {
            this.f57421b = str;
            return this;
        }

        public C0569a b(String str) {
            this.f57420a = str;
            return this;
        }

        public C0569a c(String str) {
            this.f57422c = str;
            return this;
        }

        public C0569a a(int i4) {
            this.f57423d = i4;
            return this;
        }

        public C0569a a(boolean z4) {
            this.f57424e = z4;
            return this;
        }

        public a a(Context context) {
            return new a(context, this);
        }
    }

    public a(Context context, C0569a c0569a) {
        this.f57413a = context;
        this.f57414b = c0569a.f57424e;
        this.f57415c = c0569a.f57422c;
        this.f57416d = c0569a.f57420a;
        this.f57417e = c0569a.f57421b;
        this.f57418f = c0569a.f57423d;
    }

    public void a(String str, QuickLoginPreMobileListener quickLoginPreMobileListener) {
        try {
            a().a(str, quickLoginPreMobileListener);
        } catch (Exception e5) {
            e5.printStackTrace();
            quickLoginPreMobileListener.onGetMobileNumberError(str, e5.toString());
        }
    }

    public void a(QuickLoginTokenListener quickLoginTokenListener) {
        try {
            Logger.d("onePass [timeStart]" + System.currentTimeMillis());
            a().a(this.f57415c, quickLoginTokenListener);
        } catch (Exception e5) {
            e5.printStackTrace();
            quickLoginTokenListener.onGetTokenError(this.f57415c, e5.toString());
        }
    }

    public void a(String str, QuickLoginTokenListener quickLoginTokenListener) {
        try {
            a().a(this.f57413a, str, this.f57415c, quickLoginTokenListener);
        } catch (Exception e5) {
            e5.printStackTrace();
            quickLoginTokenListener.onGetTokenError(this.f57415c, e5.toString());
        }
    }

    private com.netease.nis.quicklogin.helper.a a() {
        com.netease.nis.quicklogin.helper.a aVar = this.f57419g;
        if (aVar != null) {
            return aVar;
        }
        int i4 = this.f57418f;
        if (i4 == 2) {
            this.f57419g = new b(this.f57413a, this.f57416d, this.f57417e);
        } else if (i4 == 1) {
            this.f57419g = new c(this.f57413a, this.f57417e, this.f57416d, this.f57414b);
        } else if (i4 == 3) {
            this.f57419g = new d(this.f57413a, this.f57416d, this.f57417e);
        }
        return this.f57419g;
    }
}
