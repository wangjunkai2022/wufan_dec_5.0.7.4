package com.kwad.sdk.core.config.item;

import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public abstract class b<T> {
    private T auv;
    private T auw;
    private String mKey;

    public b(String str, T t4) {
        this(str, t4, t4);
    }

    public static String dt(String str) {
        return !TextUtils.isEmpty(str) ? com.kwad.sdk.core.a.c.dR(str) : str;
    }

    public static String du(String str) {
        return (TextUtils.isEmpty(str) || !com.kwad.sdk.core.a.c.dT(str)) ? str : com.kwad.sdk.core.a.c.dS(str);
    }

    public final T Dr() {
        return this.auv;
    }

    public abstract void a(SharedPreferences sharedPreferences);

    public abstract void b(SharedPreferences.Editor editor);

    public final String getKey() {
        return this.mKey;
    }

    @Nullable
    public T getValue() {
        return this.auw;
    }

    public abstract void k(JSONObject jSONObject);

    public void setValue(T t4) {
        this.auw = t4;
    }

    private b(String str, T t4, T t5) {
        this.mKey = str;
        this.auw = t4;
        this.auv = t5;
        com.kwad.sdk.core.config.b.a(this);
    }
}
