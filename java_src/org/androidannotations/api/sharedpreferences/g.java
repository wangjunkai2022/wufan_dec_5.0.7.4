package org.androidannotations.api.sharedpreferences;

import android.content.SharedPreferences;
/* compiled from: FloatPrefField.java */
/* loaded from: classes7.dex */
public final class g extends b<Float> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public g(SharedPreferences sharedPreferences, String str, Float f5) {
        super(sharedPreferences, str, f5);
    }

    @Override // org.androidannotations.api.sharedpreferences.b
    /* renamed from: j */
    public Float e(Float f5) {
        try {
            return Float.valueOf(this.f72091b.getFloat(this.f72092c, f5.floatValue()));
        } catch (ClassCastException e5) {
            try {
                SharedPreferences sharedPreferences = this.f72091b;
                String str = this.f72092c;
                return Float.valueOf(Float.parseFloat(sharedPreferences.getString(str, "" + f5)));
            } catch (Exception unused) {
                throw e5;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.androidannotations.api.sharedpreferences.b
    /* renamed from: k */
    public void h(Float f5) {
        a(b().putFloat(this.f72092c, f5.floatValue()));
    }
}
