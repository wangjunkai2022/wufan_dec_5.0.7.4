package com.sdk.g;

import com.sdk.a.i;
import com.sdk.o.c;
import io.netty.handler.codec.rtsp.RtspHeaders;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class a extends com.sdk.e.b<String> {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ b f60058b;

    public a(b bVar) {
        this.f60058b = bVar;
    }

    @Override // com.sdk.e.b
    public void a(i<String> iVar, String str) {
        int i4;
        try {
            JSONObject jSONObject = new JSONObject(iVar == null ? "" : iVar.f59985b);
            int optInt = jSONObject.optInt("code");
            try {
                String optString = jSONObject.optString("msg");
                int optInt2 = jSONObject.optInt("status");
                String optString2 = jSONObject.optString("obj");
                String optString3 = jSONObject.optString(RtspHeaders.Values.SEQ);
                if (!com.sdk.o.b.a(optString).booleanValue() || !com.sdk.o.b.a(optString3).booleanValue() || !com.sdk.o.b.a(optString2).booleanValue()) {
                    this.f60058b.a(optInt, optString, optInt2, optString2, optString3);
                    return;
                }
                this.f60058b.a(1, "服务端数据格式出错", 302003, null, c.a().f60043c);
                com.sdk.o.b.a(b.f60059a, "返回数据为空", Boolean.valueOf(b.f60060b));
            } catch (Throwable th) {
                th = th;
                i4 = optInt;
                c.d(th.toString());
                this.f60058b.a(i4, "服务端数据格式出错", 302003, null, c.a().f60043c);
                String str2 = b.f60059a;
                com.sdk.o.b.a(str2, "返回数据解析异常：" + th.toString(), Boolean.valueOf(b.f60060b));
            }
        } catch (Throwable th2) {
            th = th2;
            i4 = 1;
        }
    }
}
