package org.androidannotations.api.sharedpreferences;

import org.androidannotations.api.sharedpreferences.e;
/* compiled from: AbstractPrefEditorField.java */
/* loaded from: classes7.dex */
public abstract class a<T extends e<T>> {

    /* renamed from: a  reason: collision with root package name */
    protected final T f72088a;

    /* renamed from: b  reason: collision with root package name */
    protected final String f72089b;

    public a(T t4, String str) {
        this.f72088a = t4;
        this.f72089b = str;
    }

    public final T a() {
        this.f72088a.f().remove(this.f72089b);
        return this.f72088a;
    }
}
