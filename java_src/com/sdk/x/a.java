package com.sdk.x;

import android.content.Context;
import com.sdk.p.f;
import org.json.JSONObject;
/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes5.dex */
public class a<T> implements com.sdk.e.a<T> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f60109a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d f60110b;

    public a(d dVar, int i4) {
        this.f60110b = dVar;
        this.f60109a = i4;
    }

    @Override // com.sdk.e.a
    public void a(int i4, int i5, String str) {
        this.f60110b.a(i4, i5, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.String] */
    @Override // com.sdk.e.a
    public void onSuccess(int i4, String str, int i5, T t4, String str2) {
        Context context;
        Context context2;
        Context unused;
        context = this.f60110b.f60116d;
        Long b5 = com.sdk.j.a.b(context, "access_limit_count");
        com.sdk.j.a.a(context, "access_limit_count", Long.valueOf(b5 == null ? 0L : b5.longValue() + 1));
        if (i4 == 0) {
            context2 = this.f60110b.f60116d;
            com.sdk.b.a.a(context2, this.f60109a, com.sdk.b.a.a(t4, str2), f.b.f60088b.a());
            try {
                unused = this.f60110b.f60116d;
                t4 = (T) com.sdk.u.a.a(String.valueOf((Object) t4));
                if (t4 == 0) {
                    this.f60110b.a(1, "SDK解密异常", 302001, t4, str2);
                    return;
                }
                JSONObject jSONObject = new JSONObject((String) t4);
                if (this.f60109a == 1) {
                    jSONObject.remove("fakeMobile");
                    t4 = (T) jSONObject.toString();
                }
            } catch (Exception unused2) {
            }
        }
        this.f60110b.a(i4, str, i5, t4, str2);
    }
}
