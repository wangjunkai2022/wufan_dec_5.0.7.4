package com.aggmoread.sdk.z.a.m;

import android.content.Context;
import android.content.SharedPreferences;
/* loaded from: classes2.dex */
public class i extends h {

    /* renamed from: b  reason: collision with root package name */
    private Context f2327b;

    /* renamed from: a  reason: collision with root package name */
    private String f2326a = "devyok.DATA_PROVIDER";

    /* renamed from: c  reason: collision with root package name */
    private int f2328c = 1;

    public i(Context context) {
        this.f2327b = context;
    }

    private void a(SharedPreferences.Editor editor) {
        int i4 = this.f2328c;
        if (i4 != 1 && i4 == 2) {
            editor.apply();
        } else {
            editor.commit();
        }
    }

    SharedPreferences a() {
        return this.f2327b.getSharedPreferences(this.f2326a, 0);
    }

    @Override // com.aggmoread.sdk.z.a.m.h
    public String a(String str, String str2) {
        return a().getString(str, str2);
    }

    @Override // com.aggmoread.sdk.z.a.m.h
    public boolean a(String str) {
        return a().edit().remove(str).commit();
    }

    @Override // com.aggmoread.sdk.z.a.m.h
    public void b(String str, String str2) {
        SharedPreferences.Editor edit = a().edit();
        edit.putString(str, str2);
        a(edit);
    }

    @Override // com.aggmoread.sdk.z.a.m.h
    public boolean b(String str) {
        return a().contains(str);
    }

    @Override // com.aggmoread.sdk.z.a.m.h
    public void c(String str) {
        this.f2326a = str;
    }
}
