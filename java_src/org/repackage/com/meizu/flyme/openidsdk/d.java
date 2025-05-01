package org.repackage.com.meizu.flyme.openidsdk;
/* loaded from: classes7.dex */
class d {

    /* renamed from: a  reason: collision with root package name */
    public String f72984a;

    /* renamed from: b  reason: collision with root package name */
    public int f72985b;

    /* renamed from: c  reason: collision with root package name */
    public long f72986c = System.currentTimeMillis() + 86400000;

    public d(String str, int i4) {
        this.f72984a = str;
        this.f72985b = i4;
    }

    public String toString() {
        return "ValueData{value='" + this.f72984a + "', code=" + this.f72985b + ", expired=" + this.f72986c + '}';
    }
}
