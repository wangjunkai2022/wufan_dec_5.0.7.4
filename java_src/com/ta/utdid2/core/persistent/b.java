package com.ta.utdid2.core.persistent;

import java.util.Map;
/* loaded from: classes5.dex */
public interface b {

    /* loaded from: classes5.dex */
    public interface a {
        a clear();

        boolean commit();

        a putBoolean(String str, boolean z4);

        a putFloat(String str, float f5);

        a putInt(String str, int i4);

        a putLong(String str, long j4);

        a putString(String str, String str2);

        a remove(String str);
    }

    /* renamed from: com.ta.utdid2.core.persistent.b$b  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public interface InterfaceC0656b {
        void a(b bVar, String str);
    }

    boolean a();

    void b(InterfaceC0656b interfaceC0656b);

    void c(InterfaceC0656b interfaceC0656b);

    boolean contains(String str);

    a edit();

    Map<String, ?> getAll();

    boolean getBoolean(String str, boolean z4);

    float getFloat(String str, float f5);

    int getInt(String str, int i4);

    long getLong(String str, long j4);

    String getString(String str, String str2);
}
