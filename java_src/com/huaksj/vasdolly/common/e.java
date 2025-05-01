package com.huaksj.vasdolly.common;

import com.huaksj.vasdolly.common.apk.SignatureNotFoundException;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
/* compiled from: V3SchemeUtil.java */
/* loaded from: classes3.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    public static final int f14494a = -262969152;

    public static boolean a(File file) {
        try {
            return d.e(d.g(file)).containsKey(Integer.valueOf((int) f14494a));
        } catch (SignatureNotFoundException unused) {
            PrintStream printStream = System.out;
            printStream.println("APK : " + file.getAbsolutePath() + " not have apk v3 signature block");
            return false;
        } catch (IOException e5) {
            e5.printStackTrace();
            return false;
        }
    }
}
