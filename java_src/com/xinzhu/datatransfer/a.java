package com.xinzhu.datatransfer;

import android.util.ArrayMap;
import com.xinzhu.overmind.utils.c;
import com.xinzhu.overmind.utils.k;
import java.io.File;
import java.io.IOException;
import java.util.Map;
/* compiled from: DataTransferHelper.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public static String f65634a = "a";

    /* renamed from: b  reason: collision with root package name */
    static ArrayMap<File, File> f65635b = new ArrayMap<>();

    /* renamed from: c  reason: collision with root package name */
    static c<File> f65636c = new c<>();

    static {
        f65635b.put(b.d(), com.xinzhu.overmind.a.E());
        f65636c.add(b.b());
        f65636c.add(b.a());
        f65636c.add(b.d());
    }

    public static void a() {
        if (b.a().exists()) {
            com.xinzhu.overmind.b.l(f65634a, "Need Data Transfer, do it.");
            for (Map.Entry<File, File> entry : f65635b.entrySet()) {
                File key = entry.getKey();
                File value = entry.getValue();
                if (key.exists()) {
                    try {
                        k.g(key, value);
                        k.j(key);
                    } catch (IOException e5) {
                        e5.printStackTrace();
                    }
                }
            }
            d3.b.a(false);
            d3.a.a();
            k.j(b.a());
        }
    }

    public static void b() {
        if (b.a().exists()) {
            com.xinzhu.overmind.b.l(f65634a, "Need Data Transfer for main package, do it.");
            for (Map.Entry<File, File> entry : f65635b.entrySet()) {
                File key = entry.getKey();
                File value = entry.getValue();
                if (key.exists()) {
                    try {
                        k.g(key, value);
                        k.j(key);
                    } catch (IOException e5) {
                        e5.printStackTrace();
                    }
                }
            }
            d3.b.a(true);
        }
    }
}
