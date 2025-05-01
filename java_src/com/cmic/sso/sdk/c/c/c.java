package com.cmic.sso.sdk.c.c;

import android.net.Network;
import com.cmic.sso.sdk.c.b.g;
import com.cmic.sso.sdk.e.e;
import com.qq.e.comm.pi.ACTD;
import io.netty.handler.codec.http.HttpHeaders;
import java.util.HashMap;
import java.util.Map;
/* compiled from: HttpRequest.java */
/* loaded from: classes2.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    String f9272a;

    /* renamed from: b  reason: collision with root package name */
    private final String f9273b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, String> f9274c;

    /* renamed from: d  reason: collision with root package name */
    private final String f9275d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f9276e;

    /* renamed from: f  reason: collision with root package name */
    private final String f9277f;

    /* renamed from: g  reason: collision with root package name */
    private Network f9278g;

    /* renamed from: h  reason: collision with root package name */
    private long f9279h;

    /* renamed from: i  reason: collision with root package name */
    private final String f9280i;

    /* renamed from: j  reason: collision with root package name */
    private int f9281j;

    /* renamed from: k  reason: collision with root package name */
    private final g f9282k;

    private c(String str, Map<String, String> map, g gVar, String str2, String str3) {
        this.f9276e = false;
        this.f9273b = str;
        this.f9282k = gVar;
        this.f9274c = map == null ? new HashMap<>() : map;
        this.f9272a = gVar == null ? "" : gVar.b().toString();
        this.f9275d = str2;
        this.f9277f = str3;
        this.f9280i = gVar != null ? gVar.a() : "";
        l();
    }

    private void l() {
        this.f9274c.put("sdkVersion", com.cmic.sso.sdk.auth.c.SDK_VERSION);
        this.f9274c.put("Content-Type", HttpHeaders.Values.APPLICATION_JSON);
        this.f9274c.put("CMCC-EncryptType", "STD");
        this.f9274c.put("traceId", this.f9277f);
        this.f9274c.put(ACTD.APPID_KEY, this.f9280i);
        this.f9274c.put("Connection", "close");
    }

    public void a(String str, String str2) {
        this.f9274c.put(str, str2);
    }

    public boolean b() {
        return this.f9276e;
    }

    public Map<String, String> c() {
        return this.f9274c;
    }

    public String d() {
        return this.f9272a;
    }

    public String e() {
        return this.f9275d;
    }

    public String f() {
        return this.f9277f;
    }

    public boolean g() {
        return !e.a(this.f9277f) || this.f9273b.contains("logReport") || this.f9273b.contains("uniConfig");
    }

    public Network h() {
        return this.f9278g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long i() {
        return this.f9279h;
    }

    public boolean j() {
        int i4 = this.f9281j;
        this.f9281j = i4 + 1;
        return i4 < 2;
    }

    public g k() {
        return this.f9282k;
    }

    public String a() {
        return this.f9273b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(boolean z4) {
        this.f9276e = z4;
    }

    public void a(Network network) {
        this.f9278g = network;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(long j4) {
        this.f9279h = j4;
    }

    public c(String str, g gVar, String str2, String str3) {
        this(str, null, gVar, str2, str3);
    }
}
