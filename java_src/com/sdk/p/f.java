package com.sdk.p;

import android.content.Context;
import java.util.ArrayList;
/* loaded from: classes5.dex */
public class f extends com.sdk.i.a {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes5.dex */
    public static abstract class a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f60083a;

        /* renamed from: b  reason: collision with root package name */
        public static final a f60084b;

        /* renamed from: c  reason: collision with root package name */
        public static final a f60085c;

        /* renamed from: d  reason: collision with root package name */
        public static final /* synthetic */ a[] f60086d;

        static {
            c cVar = new c("WIFI", 0);
            f60083a = cVar;
            d dVar = new d("NET", 1);
            f60084b = dVar;
            e eVar = new e("UNKNOW", 2);
            f60085c = eVar;
            f60086d = new a[]{cVar, dVar, eVar};
        }

        public /* synthetic */ a(String str, int i4, com.sdk.p.b bVar) {
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f60086d.clone();
        }

        public abstract int a();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes5.dex */
    public static abstract class b {

        /* renamed from: a  reason: collision with root package name */
        public static final b f60087a;

        /* renamed from: b  reason: collision with root package name */
        public static final b f60088b;

        /* renamed from: c  reason: collision with root package name */
        public static final b f60089c;

        /* renamed from: d  reason: collision with root package name */
        public static final /* synthetic */ b[] f60090d;

        static {
            g gVar = new g("CMCC", 0);
            f60087a = gVar;
            h hVar = new h("CUCC", 1);
            f60088b = hVar;
            i iVar = new i("CTC", 2);
            f60089c = iVar;
            f60090d = new b[]{gVar, hVar, iVar};
        }

        public /* synthetic */ b(String str, int i4, com.sdk.p.b bVar) {
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f60090d.clone();
        }

        public abstract String a();
    }

    static {
        boolean z4 = com.sdk.f.g.f60051b;
    }

    public static a a(Context context, ArrayList<String> arrayList) {
        a aVar = a.f60085c;
        return com.sdk.p.a.a(context);
    }
}
