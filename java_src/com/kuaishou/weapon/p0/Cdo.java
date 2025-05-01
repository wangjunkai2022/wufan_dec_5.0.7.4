package com.kuaishou.weapon.p0;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.TextUtils;
import java.io.File;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
@SuppressLint({"LongLogTag"})
/* renamed from: com.kuaishou.weapon.p0.do  reason: invalid class name */
/* loaded from: classes5.dex */
public class Cdo {

    /* renamed from: com.kuaishou.weapon.p0.do$a */
    /* loaded from: classes5.dex */
    static final class a {
        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(ClassLoader classLoader, File file) {
            Object obj = dq.a(classLoader, "pathList").get(classLoader);
            Field a5 = dq.a(obj, "nativeLibraryDirectories");
            File[] fileArr = (File[]) a5.get(obj);
            ArrayList arrayList = new ArrayList();
            for (File file2 : fileArr) {
                if (!file.equals(file2)) {
                    arrayList.add(file2);
                }
            }
            arrayList.add(file);
            a5.set(obj, arrayList.toArray(new File[0]));
        }
    }

    /* renamed from: com.kuaishou.weapon.p0.do$b */
    /* loaded from: classes5.dex */
    static final class b {
        private b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(ClassLoader classLoader, File file) {
            Object obj = dq.a(classLoader, "pathList").get(classLoader);
            Field a5 = dq.a(obj, "nativeLibraryDirectories");
            Collection collection = (List) a5.get(obj);
            if (collection == null) {
                collection = new ArrayList(2);
            }
            ArrayList<File> arrayList = new ArrayList(collection);
            for (File file2 : arrayList) {
                if (file.equals(file2)) {
                    return;
                }
            }
            arrayList.add(file);
            a5.set(obj, arrayList);
            if (a5.get(obj) != arrayList) {
                dq.b(obj, "nativeLibraryDirectories").set(obj, arrayList);
            }
            List list = (List) dq.a(obj, "systemNativeLibraryDirectories").get(obj);
            if (list == null) {
                list = new ArrayList(2);
            }
            ArrayList arrayList2 = new ArrayList(arrayList.size() + list.size() + 1);
            arrayList2.addAll(arrayList);
            arrayList2.addAll(list);
            Object[] objArr = (Object[]) dq.a(obj, "makePathElements", List.class, File.class, List.class).invoke(obj, arrayList2, null, new ArrayList());
            Field a6 = dq.a(obj, "nativeLibraryPathElements");
            a6.set(obj, objArr);
            if (a6.get(obj) != objArr) {
                dq.b(obj, "nativeLibraryPathElements").set(obj, objArr);
            }
        }
    }

    /* renamed from: com.kuaishou.weapon.p0.do$c */
    /* loaded from: classes5.dex */
    static final class c {
        private c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(ClassLoader classLoader, File file) {
            Object obj = dq.a(classLoader, "pathList").get(classLoader);
            List<File> list = (List) dq.a(obj, "nativeLibraryDirectories").get(obj);
            if (list == null) {
                list = new ArrayList(2);
            }
            for (File file2 : list) {
                if (file.equals(file2)) {
                    return;
                }
            }
            list.add(file);
            List list2 = (List) dq.a(obj, "systemNativeLibraryDirectories").get(obj);
            if (list2 == null) {
                list2 = new ArrayList(2);
            }
            ArrayList arrayList = new ArrayList(list.size() + list2.size() + 1);
            arrayList.addAll(list);
            arrayList.addAll(list2);
            dq.a(obj, "nativeLibraryPathElements").set(obj, (Object[]) dq.a(obj, "makePathElements", List.class, File.class, List.class).invoke(obj, arrayList, null, new ArrayList()));
        }
    }

    /* renamed from: com.kuaishou.weapon.p0.do$d */
    /* loaded from: classes5.dex */
    static final class d {
        private d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(ClassLoader classLoader, File file) {
            Object obj = dq.a(classLoader, "pathList").get(classLoader);
            List<File> list = (List) dq.a(obj, "nativeLibraryDirectories").get(obj);
            if (list == null) {
                list = new ArrayList(2);
            }
            for (File file2 : list) {
                if (file.equals(file2)) {
                    return;
                }
            }
            list.add(file);
            List list2 = (List) dq.a(obj, "systemNativeLibraryDirectories").get(obj);
            if (list2 == null) {
                list2 = new ArrayList(2);
            }
            ArrayList arrayList = new ArrayList(list.size() + list2.size() + 1);
            arrayList.addAll(list);
            arrayList.addAll(list2);
            dq.a(obj, "nativeLibraryPathElements").set(obj, (Object[]) dq.a(obj, "makePathElements", List.class).invoke(obj, arrayList));
        }
    }

    /* renamed from: com.kuaishou.weapon.p0.do$e */
    /* loaded from: classes5.dex */
    static final class e {
        private e() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(ClassLoader classLoader, File file) {
            String path = file.getPath();
            Field a5 = dq.a(classLoader, "libPath");
            String valueOf = String.valueOf(a5.get(classLoader));
            a5.set(classLoader, TextUtils.isEmpty(valueOf) ? path : valueOf + ":" + path);
            Field a6 = dq.a(classLoader, "libraryPathElements");
            List<String> list = (List) a6.get(classLoader);
            for (String str : list) {
                if (path.equals(str)) {
                    return;
                }
            }
            list.add(path);
            a6.set(classLoader, list);
        }
    }

    public static synchronized void a(ClassLoader classLoader, File file) {
        synchronized (Cdo.class) {
            if (file != null) {
                if (file.exists()) {
                    int i4 = Build.VERSION.SDK_INT;
                    if ((i4 == 25 && Build.VERSION.PREVIEW_SDK_INT != 0) || i4 > 25) {
                        d.b(classLoader, file);
                    } else if (i4 == 24) {
                        c.b(classLoader, file);
                    } else if (i4 >= 23) {
                        b.b(classLoader, file);
                    } else if (i4 >= 14) {
                        a.b(classLoader, file);
                    } else {
                        e.b(classLoader, file);
                    }
                }
            }
        }
    }
}
