package org.aspectj.lang;

import org.aspectj.lang.reflect.z;
/* compiled from: JoinPoint.java */
/* loaded from: classes7.dex */
public interface c {

    /* renamed from: a  reason: collision with root package name */
    public static final String f72200a = "method-execution";

    /* renamed from: b  reason: collision with root package name */
    public static final String f72201b = "method-call";

    /* renamed from: c  reason: collision with root package name */
    public static final String f72202c = "constructor-execution";

    /* renamed from: d  reason: collision with root package name */
    public static final String f72203d = "constructor-call";

    /* renamed from: e  reason: collision with root package name */
    public static final String f72204e = "field-get";

    /* renamed from: f  reason: collision with root package name */
    public static final String f72205f = "field-set";

    /* renamed from: g  reason: collision with root package name */
    public static final String f72206g = "staticinitialization";

    /* renamed from: h  reason: collision with root package name */
    public static final String f72207h = "preinitialization";

    /* renamed from: i  reason: collision with root package name */
    public static final String f72208i = "initialization";

    /* renamed from: j  reason: collision with root package name */
    public static final String f72209j = "exception-handler";

    /* renamed from: k  reason: collision with root package name */
    public static final String f72210k = "lock";

    /* renamed from: l  reason: collision with root package name */
    public static final String f72211l = "unlock";

    /* renamed from: m  reason: collision with root package name */
    public static final String f72212m = "adviceexecution";

    /* compiled from: JoinPoint.java */
    /* loaded from: classes7.dex */
    public interface a extends b {
    }

    /* compiled from: JoinPoint.java */
    /* loaded from: classes7.dex */
    public interface b {
        String b();

        String f();

        z g();

        int getId();

        String getKind();

        e h();

        String toString();
    }

    Object[] J();

    b a();

    String b();

    Object c();

    String f();

    z g();

    String getKind();

    e h();

    Object i();

    String toString();
}
