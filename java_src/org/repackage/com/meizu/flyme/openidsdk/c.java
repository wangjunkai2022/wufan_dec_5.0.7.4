package org.repackage.com.meizu.flyme.openidsdk;

import android.text.TextUtils;
/* loaded from: classes7.dex */
class c {

    /* renamed from: a  reason: collision with root package name */
    String f72982a;

    /* renamed from: b  reason: collision with root package name */
    Boolean f72983b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(boolean z4) {
        this.f72983b = Boolean.valueOf(z4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b() {
        return this.f72983b != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean c(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return TextUtils.equals(this.f72982a, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(String str) {
        this.f72982a = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean e() {
        Boolean bool = this.f72983b;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }
}
