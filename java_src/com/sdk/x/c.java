package com.sdk.x;

import android.content.Context;
/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes5.dex */
public class c<T> implements com.sdk.e.a<T> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f60112a;

    public c(d dVar) {
        this.f60112a = dVar;
    }

    @Override // com.sdk.e.a
    public void a(int i4, int i5, String str) {
        this.f60112a.a(i4, i5, str);
    }

    @Override // com.sdk.e.a
    public void onSuccess(int i4, String str, int i5, T t4, String str2) {
        Object obj;
        Context unused;
        if (i4 == 0) {
            unused = this.f60112a.f60116d;
            Object a5 = com.sdk.u.a.a(String.valueOf(t4));
            if (a5 == null) {
                this.f60112a.a(1, "SDK解密异常", 302001, a5, str2);
                return;
            }
            obj = a5;
        } else {
            obj = t4;
        }
        this.f60112a.a(i4, str, i5, obj, str2);
    }
}
