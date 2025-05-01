package com.heepay.plugin.c;

import android.content.Context;
import android.widget.Toast;
/* loaded from: classes3.dex */
public class i {

    /* renamed from: b  reason: collision with root package name */
    private static i f14391b = new i();

    /* renamed from: a  reason: collision with root package name */
    private Toast f14392a;

    public static i a() {
        return f14391b;
    }

    public void a(Context context, CharSequence charSequence) {
        Toast toast = this.f14392a;
        if (toast == null) {
            this.f14392a = Toast.makeText(context, charSequence, 1);
        } else {
            toast.setText(charSequence);
        }
        this.f14392a.show();
    }
}
