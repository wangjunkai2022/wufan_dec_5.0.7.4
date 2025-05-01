package com.cmic.sso.sdk.c.b;

import android.util.Base64;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: GetPrePhoneScripParameter.java */
/* loaded from: classes2.dex */
public class e extends g {

    /* renamed from: a  reason: collision with root package name */
    private a f9249a;

    /* renamed from: b  reason: collision with root package name */
    private byte[] f9250b;

    /* renamed from: c  reason: collision with root package name */
    private String f9251c;

    /* renamed from: d  reason: collision with root package name */
    private byte[] f9252d;

    /* renamed from: e  reason: collision with root package name */
    private String f9253e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f9254f = false;

    @Override // com.cmic.sso.sdk.c.b.g
    protected String a(String str) {
        return null;
    }

    public void a(boolean z4) {
        this.f9254f = z4;
    }

    public void b(String str) {
        this.f9253e = str;
    }

    public void c(String str) {
        this.f9251c = str;
    }

    public void a(byte[] bArr) {
        this.f9250b = bArr;
    }

    public void b(byte[] bArr) {
        this.f9252d = bArr;
    }

    public a c() {
        return this.f9249a;
    }

    public void a(a aVar) {
        this.f9249a = aVar;
    }

    @Override // com.cmic.sso.sdk.c.b.g
    public JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        if (this.f9254f) {
            try {
                jSONObject.put("encrypted", this.f9251c);
                jSONObject.put("encryptedIV", Base64.encodeToString(this.f9252d, 0));
                jSONObject.put("reqdata", com.cmic.sso.sdk.e.a.a(this.f9250b, this.f9249a.toString(), this.f9252d));
                jSONObject.put("securityreinforce", this.f9253e);
            } catch (JSONException e5) {
                e5.printStackTrace();
            }
        }
        return jSONObject;
    }

    @Override // com.cmic.sso.sdk.c.b.g
    public String a() {
        return this.f9249a.a();
    }
}
