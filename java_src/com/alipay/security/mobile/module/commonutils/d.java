package com.alipay.security.mobile.module.commonutils;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private static String f5010a = "";

    /* renamed from: b  reason: collision with root package name */
    private static String f5011b = "";

    /* renamed from: c  reason: collision with root package name */
    private static String f5012c = "";

    public static synchronized void a(String str) {
        synchronized (d.class) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            d(arrayList);
        }
    }

    public static synchronized void b(String str, String str2, String str3) {
        synchronized (d.class) {
            f5010a = str;
            f5011b = str2;
            f5012c = str3;
        }
    }

    public static synchronized void c(Throwable th) {
        synchronized (d.class) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(e(th));
            d(arrayList);
        }
    }

    private static synchronized void d(List<String> list) {
        synchronized (d.class) {
            if (!a.b(f5011b) && !a.b(f5012c)) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(f5012c);
                Iterator<String> it2 = list.iterator();
                while (it2.hasNext()) {
                    stringBuffer.append(", " + it2.next());
                }
                stringBuffer.append("\n");
                try {
                    File file = new File(f5010a);
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                    File file2 = new File(f5010a, f5011b);
                    if (!file2.exists()) {
                        file2.createNewFile();
                    }
                    FileWriter fileWriter = ((long) stringBuffer.length()) + file2.length() <= 51200 ? new FileWriter(file2, true) : new FileWriter(file2);
                    fileWriter.write(stringBuffer.toString());
                    fileWriter.flush();
                    fileWriter.close();
                } catch (Exception e5) {
                    e5.toString();
                }
            }
        }
    }

    public static String e(Throwable th) {
        if (th != null) {
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            return stringWriter.toString();
        }
        return "";
    }
}
