package org.androidannotations.api.sharedpreferences;

import android.content.SharedPreferences;
/* compiled from: AbstractPrefField.java */
/* loaded from: classes.dex */
public abstract class b<T> {

    /* renamed from: a  reason: collision with root package name */
    protected final T f72090a;

    /* renamed from: b  reason: collision with root package name */
    protected final SharedPreferences f72091b;

    /* renamed from: c  reason: collision with root package name */
    protected final String f72092c;

    public b(SharedPreferences sharedPreferences, String str, T t4) {
        this.f72091b = sharedPreferences;
        this.f72092c = str;
        this.f72090a = t4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(SharedPreferences.Editor editor) {
        m.a(editor);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public SharedPreferences.Editor b() {
        return this.f72091b.edit();
    }

    public final boolean c() {
        return this.f72091b.contains(this.f72092c);
    }

    public final T d() {
        return e(this.f72090a);
    }

    public abstract T e(T t4);

    public String f() {
        return this.f72092c;
    }

    public final void g(T t4) {
        if (t4 == null) {
            t4 = this.f72090a;
        }
        h(t4);
    }

    protected abstract void h(T t4);

    public final void i() {
        a(b().remove(this.f72092c));
    }
}
