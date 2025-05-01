package com.facebook.cache.disk;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: DiskStorage.java */
/* loaded from: classes2.dex */
public interface c {

    /* compiled from: DiskStorage.java */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public List<b> f10762a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        public Map<String, Integer> f10763b = new HashMap();
    }

    /* compiled from: DiskStorage.java */
    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f10764a;

        /* renamed from: b  reason: collision with root package name */
        public final String f10765b;

        /* renamed from: c  reason: collision with root package name */
        public final float f10766c;

        /* renamed from: d  reason: collision with root package name */
        public final String f10767d;

        /* JADX INFO: Access modifiers changed from: protected */
        public b(String str, String str2, float f5, String str3) {
            this.f10764a = str;
            this.f10765b = str2;
            this.f10766c = f5;
            this.f10767d = str3;
        }
    }

    /* compiled from: DiskStorage.java */
    /* renamed from: com.facebook.cache.disk.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0251c {
        e0.a a();

        String getId();

        long getSize();

        long getTimestamp();
    }

    /* compiled from: DiskStorage.java */
    /* loaded from: classes2.dex */
    public interface d {
        boolean a();

        void b(com.facebook.cache.common.j jVar, Object obj) throws IOException;

        e0.a c(Object obj) throws IOException;
    }

    a a() throws IOException;

    void b();

    boolean c(String str, Object obj) throws IOException;

    void clearAll() throws IOException;

    long d(InterfaceC0251c interfaceC0251c) throws IOException;

    boolean e(String str, Object obj) throws IOException;

    e0.a f(String str, Object obj) throws IOException;

    String g();

    Collection<InterfaceC0251c> getEntries() throws IOException;

    d insert(String str, Object obj) throws IOException;

    boolean isEnabled();

    boolean isExternal();

    long remove(String str) throws IOException;
}
