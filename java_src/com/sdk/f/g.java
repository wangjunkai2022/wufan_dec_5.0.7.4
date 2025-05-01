package com.sdk.f;

import java.util.HashMap;
/* loaded from: classes5.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    public static String f60050a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f60051b;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f60052c;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f60053d;

    /* renamed from: e  reason: collision with root package name */
    public static boolean f60054e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes5.dex */
    public static abstract class a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f60055a;

        /* renamed from: b  reason: collision with root package name */
        public static final a f60056b;

        /* renamed from: c  reason: collision with root package name */
        public static final /* synthetic */ a[] f60057c;

        static {
            e eVar = new e("PRODUCE_STATISTICAL", 0);
            f60055a = eVar;
            f fVar = new f("PRODUCE_DZH", 1);
            f60056b = fVar;
            f60057c = new a[]{eVar, fVar};
        }

        public /* synthetic */ a(String str, int i4, d dVar) {
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f60057c.clone();
        }

        public abstract String a();
    }

    static {
        new HashMap();
        f60050a = "installTime";
        f60051b = false;
        f60052c = true;
        f60053d = false;
        f60054e = false;
    }
}
