package com.aggmoread.sdk.z.c.a.a.d.b;
/* loaded from: classes2.dex */
public class i implements com.aggmoread.sdk.z.c.a.a.c.d {

    /* renamed from: a  reason: collision with root package name */
    public int f3410a;

    /* renamed from: b  reason: collision with root package name */
    public String f3411b;

    /* renamed from: c  reason: collision with root package name */
    public Exception f3412c;

    public i(int i4, String str) {
        this.f3410a = i4;
        this.f3411b = str;
    }

    public i(int i4, String str, Exception exc) {
        this.f3410a = i4;
        this.f3411b = str;
        this.f3412c = exc;
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.d
    public int a() {
        return this.f3410a;
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.d
    public String b() {
        return this.f3411b;
    }

    public String toString() {
        return String.format("{ErrorCode= %s,ErrMsg= %s,ErrExcep= %s}", Integer.valueOf(this.f3410a), this.f3411b, this.f3412c);
    }
}
