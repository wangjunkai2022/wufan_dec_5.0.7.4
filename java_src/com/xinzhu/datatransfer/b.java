package com.xinzhu.datatransfer;

import com.xinzhu.overmind.Overmind;
import java.io.File;
/* compiled from: TransferEnvironment.java */
/* loaded from: classes6.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private static File f65637a = new File(Overmind.getContext().getExternalFilesDir(""), "Android_va");

    public static File a() {
        return new File(com.xinzhu.overmind.a.a0(), "data/app/system");
    }

    public static File b() {
        return new File(com.xinzhu.overmind.a.a0(), "data/system");
    }

    public static File c() {
        return new File(a(), "device-config.ini");
    }

    public static File d() {
        return f65637a;
    }

    public static File e(String str) {
        return new File(com.xinzhu.overmind.a.d(str), "package.ini");
    }

    public static File f() {
        return new File(a(), "packages.ini");
    }

    public static File g(String str) {
        return new File(com.xinzhu.overmind.a.d(str), "signature.ini");
    }

    public static File h() {
        return new File(a(), "uid-list.ini");
    }
}
