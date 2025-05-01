package com.xinzhu.haunted;

import javax.annotation.processing.Messager;
import javax.tools.Diagnostic;
/* compiled from: ALog.java */
/* loaded from: classes6.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static Messager f65680a;

    public static void a(String str) {
        e(str);
    }

    public static void b(String str) {
        Messager messager = f65680a;
        if (messager != null) {
            messager.printMessage(Diagnostic.Kind.ERROR, str);
        }
    }

    public static void c(String str) {
        e(str);
    }

    public static void d(Messager messager) {
        f65680a = messager;
    }

    public static void e(String str) {
        Messager messager = f65680a;
        if (messager != null) {
            messager.printMessage(Diagnostic.Kind.NOTE, str);
        }
    }

    public static void f(String str) {
        Messager messager = f65680a;
        if (messager != null) {
            messager.printMessage(Diagnostic.Kind.WARNING, str);
        }
    }
}
