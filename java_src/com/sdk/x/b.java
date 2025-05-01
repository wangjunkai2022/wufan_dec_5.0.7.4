package com.sdk.x;
/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes5.dex */
public class b<T> implements com.sdk.e.a<T> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f60111a;

    public b(d dVar) {
        this.f60111a = dVar;
    }

    @Override // com.sdk.e.a
    public void a(int i4, int i5, String str) {
        this.f60111a.a(i4, i5, str);
    }

    @Override // com.sdk.e.a
    public void onSuccess(int i4, String str, int i5, T t4, String str2) {
        this.f60111a.a(i4, str, i5, t4, str2);
    }
}
