package org.repackage.com.meizu.flyme.openidsdk;
/* loaded from: classes7.dex */
class a {

    /* renamed from: a  reason: collision with root package name */
    long f72976a;

    /* renamed from: b  reason: collision with root package name */
    String f72977b;

    /* renamed from: c  reason: collision with root package name */
    String f72978c;

    /* renamed from: d  reason: collision with root package name */
    int f72979d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(String str) {
        this.f72978c = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i4) {
        this.f72979d = i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(long j4) {
        this.f72976a = j4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(String str) {
        this.f72977b = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean d() {
        return this.f72976a > System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e() {
        this.f72976a = 0L;
    }
}
