package com.xinzhu.overmind.utils;

import java.io.Closeable;
/* compiled from: IoUtils.java */
/* loaded from: classes.dex */
public class m {
    private m() {
    }

    public static void a(Closeable... closeableArr) {
        if (closeableArr == null || closeableArr.length == 0) {
            return;
        }
        for (Closeable closeable : closeableArr) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (Exception unused) {
                }
            }
        }
    }

    public static void b(AutoCloseable autoCloseable) {
        try {
            autoCloseable.close();
        } catch (Exception unused) {
        }
    }
}
