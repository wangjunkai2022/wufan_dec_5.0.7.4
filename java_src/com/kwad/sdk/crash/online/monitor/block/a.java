package com.kwad.sdk.crash.online.monitor.block;

import android.os.Looper;
import android.util.Printer;
import com.kwad.sdk.utils.s;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes5.dex */
public final class a {
    private static volatile boolean aHH;
    private static String aHI;
    private static List<String> aHJ;
    private static List<String> aHK;
    private static volatile boolean aHL;
    private static volatile boolean aHM;

    public static boolean IA() {
        if (aHM) {
            return aHL;
        }
        try {
            String str = new String(com.kwad.sdk.core.a.c.Ee().decode("Y29tLnRlbmNlbnQubWF0cml4Lk1hdHJpeA=="));
            com.kwad.sdk.core.e.c.d("perfMonitor.MonitorDetector", "hasMatrix after:" + str);
            Class.forName(str);
            return true;
        } catch (ClassNotFoundException unused) {
            aHL = false;
            aHM = true;
            return aHL;
        }
    }

    public static boolean Iz() {
        if (aHH) {
            return false;
        }
        try {
            return ((Printer) s.getField(Looper.getMainLooper(), "mLogging")) != null;
        } catch (Exception e5) {
            com.kwad.sdk.core.e.c.e("perfMonitor.MonitorDetector", "hasBlockMonitor ", e5);
            aHH = true;
            return false;
        }
    }

    public static void a(com.kwad.sdk.crash.online.monitor.a.a aVar) {
        aHJ = aVar.aIf;
        aHK = aVar.aIg;
    }

    public static boolean bA(boolean z4) {
        List<String> list = aHJ;
        if (list != null && !list.isEmpty()) {
            return a(aHJ, true);
        }
        return g("Y29tLnRlbmNlbnQubWF0cml4LnRyYWNlLmNvcmUuTG9vcGVyTW9uaXRvcg==", true);
    }

    public static boolean bB(boolean z4) {
        List<String> list = aHK;
        if (list == null || list.isEmpty()) {
            return false;
        }
        return a(aHK, false);
    }

    private static boolean g(String str, boolean z4) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        return a(arrayList, z4);
    }

    private static boolean a(List<String> list, boolean z4) {
        if (aHH) {
            return false;
        }
        try {
            Printer printer = (Printer) s.getField(Looper.getMainLooper(), "mLogging");
            if (printer != null) {
                aHI = printer.getClass().getName();
                com.kwad.sdk.core.e.c.d("perfMonitor.MonitorDetector", "originPrinter name:" + printer.getClass().getName());
                if (z4) {
                    f.fK(aHI);
                }
                for (String str : list) {
                    String str2 = new String(com.kwad.sdk.core.a.c.Ee().decode(str));
                    com.kwad.sdk.core.e.c.d("perfMonitor.MonitorDetector", "printer after:" + str2);
                    if (printer.getClass().getName().contains(str2)) {
                        com.kwad.sdk.core.e.c.d("perfMonitor.MonitorDetector", "printer monitor");
                        return true;
                    }
                }
            } else {
                com.kwad.sdk.core.e.c.d("perfMonitor.MonitorDetector", "printer not hook");
            }
        } catch (Exception e5) {
            com.kwad.sdk.core.e.c.e("perfMonitor.MonitorDetector", "hasBlockMonitor ", e5);
            aHH = true;
        }
        return false;
    }
}
