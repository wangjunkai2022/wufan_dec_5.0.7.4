package com.googlecode.mp4parser;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.util.logging.Logger;
/* compiled from: Version.java */
/* loaded from: classes3.dex */
public class k {

    /* renamed from: a  reason: collision with root package name */
    private static final Logger f14212a = Logger.getLogger(k.class.getName());

    /* renamed from: b  reason: collision with root package name */
    public static final String f14213b;

    static {
        String str;
        try {
            str = new LineNumberReader(new InputStreamReader(k.class.getResourceAsStream("/version.txt"))).readLine();
        } catch (IOException e5) {
            f14212a.warning(e5.getMessage());
            str = "unknown";
        }
        f14213b = str;
    }
}
