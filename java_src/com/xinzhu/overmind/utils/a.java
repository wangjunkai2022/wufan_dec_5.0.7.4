package com.xinzhu.overmind.utils;

import com.xinzhu.overmind.Overmind;
import java.io.File;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
/* compiled from: AbiUtils.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: b  reason: collision with root package name */
    private static Map<File, a> f68299b = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    private HashSet<String> f68300a = new HashSet<>();

    public a(File file) {
        ZipFile zipFile;
        File[] fileArr;
        ZipFile zipFile2;
        ZipFile zipFile3 = null;
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            Objects.requireNonNull(listFiles);
            for (File file2 : listFiles) {
                if (file2.getName().endsWith(".apk")) {
                    try {
                        zipFile2 = new ZipFile(file2);
                        try {
                            try {
                                Enumeration<? extends ZipEntry> entries = zipFile2.entries();
                                while (entries.hasMoreElements()) {
                                    String name = entries.nextElement().getName();
                                    if (name.startsWith("lib/arm64-v8a")) {
                                        this.f68300a.add("arm64-v8a");
                                    } else if (name.startsWith("lib/armeabi-v7a")) {
                                        this.f68300a.add("armeabi-v7a");
                                    } else if (name.startsWith("lib/armeabi")) {
                                        this.f68300a.add(com.join.mgps.mod.utils.d.f53621d);
                                    }
                                }
                                m.a(zipFile2);
                            } catch (Throwable th) {
                                th = th;
                                zipFile3 = zipFile2;
                                m.a(zipFile3);
                                throw th;
                            }
                        } catch (Exception e5) {
                            e = e5;
                            e.printStackTrace();
                            m.a(zipFile2);
                        }
                    } catch (Exception e6) {
                        e = e6;
                        zipFile2 = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            }
            return;
        }
        try {
            try {
                zipFile = new ZipFile(file);
            } catch (Exception e7) {
                e = e7;
            }
        } catch (Throwable th3) {
            th = th3;
        }
        try {
            Enumeration<? extends ZipEntry> entries2 = zipFile.entries();
            while (entries2.hasMoreElements()) {
                String name2 = entries2.nextElement().getName();
                if (name2.startsWith("lib/arm64-v8a")) {
                    this.f68300a.add("arm64-v8a");
                } else if (name2.startsWith("lib/armeabi-v7a")) {
                    this.f68300a.add("armeabi-v7a");
                } else if (name2.startsWith("lib/armeabi")) {
                    this.f68300a.add(com.join.mgps.mod.utils.d.f53621d);
                }
            }
            m.a(zipFile);
        } catch (Exception e8) {
            e = e8;
            zipFile3 = zipFile;
            e.printStackTrace();
            m.a(zipFile3);
        } catch (Throwable th4) {
            th = th4;
            zipFile3 = zipFile;
            m.a(zipFile3);
            throw th;
        }
    }

    public static HashSet<String> a(File file) {
        a aVar = f68299b.get(file);
        if (aVar == null) {
            aVar = new a(file);
            f68299b.put(file, aVar);
        }
        return aVar.f68300a;
    }

    public static boolean e(File file) {
        a aVar = f68299b.get(file);
        if (aVar == null) {
            aVar = new a(file);
            f68299b.put(file, aVar);
        }
        if (aVar.d() || Overmind.isPluginPkgInstalled()) {
            return true;
        }
        if (Overmind.is64Bit()) {
            return aVar.c();
        }
        return aVar.b();
    }

    public boolean b() {
        return this.f68300a.contains(com.join.mgps.mod.utils.d.f53621d) || this.f68300a.contains("armeabi-v7a");
    }

    public boolean c() {
        return this.f68300a.contains("arm64-v8a");
    }

    public boolean d() {
        return this.f68300a.isEmpty();
    }
}
