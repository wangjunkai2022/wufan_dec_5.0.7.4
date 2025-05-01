package com.bytedance.pangle.activity;

import android.app.Activity;
import android.view.View;
import androidx.annotation.NonNull;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* loaded from: classes2.dex */
public final class a implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final Activity f8237a;

    /* renamed from: b  reason: collision with root package name */
    private final String f8238b;

    /* renamed from: c  reason: collision with root package name */
    private final int f8239c;

    /* renamed from: d  reason: collision with root package name */
    private Method f8240d;

    public a(@NonNull Activity activity, int i4, @NonNull String str) {
        this.f8237a = activity;
        this.f8238b = str;
        this.f8239c = i4;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@NonNull View view) {
        if (this.f8240d == null) {
            try {
                Method method = this.f8237a.getClass().getMethod(this.f8238b, View.class);
                if (method != null) {
                    this.f8240d = method;
                }
            } catch (NoSuchMethodException unused) {
            }
            throw new IllegalStateException("Could not find method " + this.f8238b + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.f8239c);
        }
        try {
            this.f8240d.invoke(this.f8237a, view);
        } catch (IllegalAccessException e5) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e5);
        } catch (InvocationTargetException e6) {
            throw new IllegalStateException("Could not execute method for android:onClick", e6);
        }
    }
}
