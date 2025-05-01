package org.androidannotations.api.sharedpreferences;

import org.androidannotations.api.sharedpreferences.e;
/* compiled from: BooleanPrefEditorField.java */
/* loaded from: classes7.dex */
public final class c<T extends e<T>> extends a<T> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public c(T t4, String str) {
        super(t4, str);
    }

    public T b(boolean z4) {
        this.f72088a.f().putBoolean(this.f72089b, z4);
        return this.f72088a;
    }
}
