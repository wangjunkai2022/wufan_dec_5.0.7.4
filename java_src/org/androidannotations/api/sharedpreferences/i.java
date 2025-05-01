package org.androidannotations.api.sharedpreferences;

import android.content.SharedPreferences;
/* compiled from: IntPrefField.java */
/* loaded from: classes7.dex */
public final class i extends b<Integer> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public i(SharedPreferences sharedPreferences, String str, Integer num) {
        super(sharedPreferences, str, num);
    }

    @Override // org.androidannotations.api.sharedpreferences.b
    /* renamed from: j */
    public Integer e(Integer num) {
        try {
            return Integer.valueOf(this.f72091b.getInt(this.f72092c, num.intValue()));
        } catch (ClassCastException e5) {
            try {
                SharedPreferences sharedPreferences = this.f72091b;
                String str = this.f72092c;
                return Integer.valueOf(Integer.parseInt(sharedPreferences.getString(str, "" + num)));
            } catch (Exception unused) {
                throw e5;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.androidannotations.api.sharedpreferences.b
    /* renamed from: k */
    public void h(Integer num) {
        a(b().putInt(this.f72092c, num.intValue()));
    }
}
