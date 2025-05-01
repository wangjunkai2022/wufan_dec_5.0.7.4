package com.aggmoread.sdk.z.c.a.a.e;

import android.content.SharedPreferences;
/* loaded from: classes2.dex */
public class h {

    /* renamed from: b  reason: collision with root package name */
    private static h f3495b;

    /* renamed from: a  reason: collision with root package name */
    private String f3496a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f3497a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f3498b;

        a(h hVar, String str, String str2) {
            this.f3497a = str;
            this.f3498b = str2;
        }

        @Override // com.aggmoread.sdk.z.c.a.a.e.h.e
        public boolean a(SharedPreferences.Editor editor) {
            editor.putString(this.f3497a, this.f3498b);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b implements e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f3499a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f3500b;

        b(h hVar, String str, long j4) {
            this.f3499a = str;
            this.f3500b = j4;
        }

        @Override // com.aggmoread.sdk.z.c.a.a.e.h.e
        public boolean a(SharedPreferences.Editor editor) {
            editor.putLong(this.f3499a, this.f3500b);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class c implements e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f3501a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f3502b;

        c(h hVar, String str, boolean z4) {
            this.f3501a = str;
            this.f3502b = z4;
        }

        @Override // com.aggmoread.sdk.z.c.a.a.e.h.e
        public boolean a(SharedPreferences.Editor editor) {
            editor.putBoolean(this.f3501a, this.f3502b);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class d implements e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f3503a;

        d(h hVar, String str) {
            this.f3503a = str;
        }

        @Override // com.aggmoread.sdk.z.c.a.a.e.h.e
        public boolean a(SharedPreferences.Editor editor) {
            editor.remove(this.f3503a);
            return false;
        }
    }

    /* loaded from: classes2.dex */
    public interface e {
        boolean a(SharedPreferences.Editor editor);
    }

    public h(String str) {
        this.f3496a = com.aggmoread.sdk.z.c.a.a.e.c.l() + "_" + str;
    }

    public static h a() {
        if (f3495b == null) {
            synchronized (h.class) {
                if (f3495b == null) {
                    f3495b = new h("default");
                }
            }
        }
        return f3495b;
    }

    public int a(String str, int i4) {
        return b().getInt(str, i4);
    }

    public long a(String str, long j4) {
        return b().getLong(str, j4);
    }

    public String a(String str, String str2) {
        return b().getString(str, str2);
    }

    public void a(e eVar) {
        SharedPreferences.Editor edit = b().edit();
        if (eVar.a(edit)) {
            edit.commit();
        } else {
            edit.apply();
        }
    }

    public void a(String str) {
        a(new d(this, str));
    }

    public boolean a(String str, boolean z4) {
        return b().getBoolean(str, z4);
    }

    protected SharedPreferences b() {
        return com.aggmoread.sdk.z.c.a.a.d.b.j.f3429q.getSharedPreferences(this.f3496a, 0);
    }

    public void b(String str, long j4) {
        a(new b(this, str, j4));
    }

    public void b(String str, String str2) {
        a(new a(this, str, str2));
    }

    public void b(String str, boolean z4) {
        a(new c(this, str, z4));
    }
}
