package com.join.mgps.joystick.map;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.join.mgps.Util.t1;
import com.join.mgps.Util.u;
import com.join.mgps.Util.v;
import com.join.mgps.joystick.KeyMapActions;
import com.join.mgps.joystick.map.KeyMap;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.lingala.zip4j.util.e;
/* compiled from: KeyMapManager.java */
/* loaded from: classes3.dex */
public class d {

    /* renamed from: d  reason: collision with root package name */
    public static KeyMap.EmuMap f53535d;

    /* renamed from: f  reason: collision with root package name */
    private static Context f53537f;

    /* renamed from: a  reason: collision with root package name */
    int[] f53538a = {0, 0, 0, 0};

    /* renamed from: b  reason: collision with root package name */
    private static String f53533b = Environment.getExternalStorageDirectory().getPath() + "/MG/config";

    /* renamed from: c  reason: collision with root package name */
    private static final String f53534c = d.class.getSimpleName();

    /* renamed from: e  reason: collision with root package name */
    static u[] f53536e = new u[4];

    public d(KeyMap.EmuMap emuMap) {
        f53533b = v.f28104d + "/MG/config";
        f(emuMap);
    }

    public static c b(int i4, KeyEvent keyEvent) {
        String str;
        String str2;
        if (f53535d == null) {
            return null;
        }
        c cVar = new c();
        if (f53536e[i4] == null) {
            return cVar;
        }
        cVar.h(keyEvent);
        u.c b5 = f53536e[i4].b(KeyMap.keySection);
        Iterator<String> it2 = b5.d().iterator();
        while (true) {
            str = "null";
            if (!it2.hasNext()) {
                str2 = "null";
                break;
            }
            str2 = it2.next();
            if (Integer.parseInt(b5.c(str2)) == keyEvent.getKeyCode()) {
                break;
            }
        }
        cVar.e(str2);
        u.c b6 = f53536e[i4].b(f53535d.section);
        Iterator<String> it3 = b6.d().iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            String next = it3.next();
            String c5 = b6.c(next);
            if (!TextUtils.isEmpty(c5) && c5.equals(str2)) {
                str = next;
                break;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("keyCode=");
        sb.append(str2);
        sb.append(" val=");
        sb.append(str);
        cVar.f(str);
        cVar.g(-1);
        return cVar;
    }

    public static Map c(String str) {
        HashMap hashMap = new HashMap();
        f(f53535d);
        u uVar = f53536e[0];
        u.c b5 = uVar.b(str);
        if (b5 != null && !e(b5)) {
            uVar.i(str);
            b5 = null;
        }
        if (b5 != null) {
            for (String str2 : b5.d()) {
                hashMap.put(str2, b5.c(str2));
            }
        }
        return hashMap;
    }

    private static File d(int i4) {
        String[] strArr = KeyMap.inifiles;
        if (strArr[i4] == null || strArr[i4].equals("")) {
            return null;
        }
        return new File(f53533b + e.F0 + strArr[i4]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x007b, code lost:
        if (r3.equals(r1.section) != false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean e(com.join.mgps.Util.u.c r3) {
        /*
            java.lang.String r3 = r3.f28094a
            java.lang.String r0 = "KEY"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto Lc
            goto L82
        Lc:
            java.lang.String r0 = "EMU_KEY_MAP"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L16
            goto L82
        L16:
            com.join.mgps.joystick.map.KeyMap$EmuMap r0 = com.join.mgps.joystick.map.KeyMap.EmuMap.getEmuMap(r3)
            com.join.mgps.joystick.map.KeyMap$EmuMap r1 = com.join.mgps.joystick.map.KeyMap.EmuMap.FBA
            java.lang.String r2 = r1.section
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L26
        L24:
            r0 = r1
            goto L7e
        L26:
            com.join.mgps.joystick.map.KeyMap$EmuMap r1 = com.join.mgps.joystick.map.KeyMap.EmuMap.FC
            java.lang.String r2 = r1.section
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L31
            goto L24
        L31:
            com.join.mgps.joystick.map.KeyMap$EmuMap r1 = com.join.mgps.joystick.map.KeyMap.EmuMap.SFC
            java.lang.String r2 = r1.section
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L3c
            goto L24
        L3c:
            com.join.mgps.joystick.map.KeyMap$EmuMap r1 = com.join.mgps.joystick.map.KeyMap.EmuMap.PSP
            java.lang.String r2 = r1.section
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L47
            goto L24
        L47:
            com.join.mgps.joystick.map.KeyMap$EmuMap r1 = com.join.mgps.joystick.map.KeyMap.EmuMap.GBA
            java.lang.String r2 = r1.section
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L52
            goto L24
        L52:
            com.join.mgps.joystick.map.KeyMap$EmuMap r1 = com.join.mgps.joystick.map.KeyMap.EmuMap.MD
            java.lang.String r2 = r1.section
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L5d
            goto L24
        L5d:
            com.join.mgps.joystick.map.KeyMap$EmuMap r1 = com.join.mgps.joystick.map.KeyMap.EmuMap.PS
            java.lang.String r2 = r1.section
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L68
            goto L24
        L68:
            com.join.mgps.joystick.map.KeyMap$EmuMap r1 = com.join.mgps.joystick.map.KeyMap.EmuMap.WSC
            java.lang.String r2 = r1.section
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L73
            goto L24
        L73:
            com.join.mgps.joystick.map.KeyMap$EmuMap r1 = com.join.mgps.joystick.map.KeyMap.EmuMap.GBC
            java.lang.String r2 = r1.section
            boolean r3 = r3.equals(r2)
            if (r3 == 0) goto L7e
            goto L24
        L7e:
            if (r0 != 0) goto L82
            r3 = 0
            return r3
        L82:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.joystick.map.d.e(com.join.mgps.Util.u$c):boolean");
    }

    public static synchronized void f(KeyMap.EmuMap emuMap) {
        synchronized (d.class) {
            f53533b = v.f28104d + "/MG/config";
            f53535d = emuMap;
            for (int i4 = 0; i4 < f53536e.length; i4++) {
                File d5 = d(i4);
                if (d5 != null) {
                    String absolutePath = d5.getAbsolutePath();
                    try {
                        if (!d5.getParentFile().exists()) {
                            d5.getParentFile().mkdirs();
                        }
                        if (d5.exists() && d5.isDirectory()) {
                            d5.delete();
                        }
                        if (!d5.exists()) {
                            d5.setReadable(true);
                            d5.setWritable(true);
                            d5.createNewFile();
                        }
                    } catch (IOException e5) {
                        e5.printStackTrace();
                    }
                    f53536e[i4] = new u(absolutePath);
                    h(i4);
                }
            }
        }
    }

    public static synchronized void g(int i4, String str, String str2, String str3) {
        synchronized (d.class) {
            u uVar = f53536e[i4];
            uVar.g(str, str2, str3);
            uVar.j();
        }
    }

    private static void h(int i4) {
        u uVar = f53536e[i4];
        int i5 = 0;
        while (true) {
            String[] strArr = KeyMap.sections;
            if (i5 >= strArr.length) {
                return;
            }
            String str = strArr[i5];
            u.c b5 = uVar.b(str);
            if (b5 != null && !e(b5)) {
                uVar.i(str);
                b5 = null;
            }
            if (b5 == null) {
                u.c cVar = new u.c(str);
                uVar.f(cVar);
                i(cVar);
            }
            i5++;
        }
    }

    private static void i(u.c cVar) {
        String str = cVar.f28094a;
        int i4 = 0;
        if (str.equals(KeyMap.keySection)) {
            while (true) {
                String[] strArr = KeyMap.keysKey;
                if (i4 >= strArr.length) {
                    return;
                }
                cVar.e(strArr[i4], String.valueOf(KeyMap.defJoystickKeys[i4]));
                i4++;
            }
        } else if (!str.equals(KeyMap.emuKeyMapSection)) {
            KeyMap.EmuMap emuMap = KeyMap.EmuMap.getEmuMap(str);
            if (emuMap == null) {
                return;
            }
            for (Map.Entry<String, String> entry : emuMap.map.entrySet()) {
                cVar.e(entry.getKey(), entry.getValue());
            }
        } else {
            while (true) {
                String[] strArr2 = KeyMap.emuKeysKey;
                if (i4 >= strArr2.length) {
                    return;
                }
                cVar.e(strArr2[i4], String.valueOf(KeyMap.emuDefKeysValue[i4]));
                i4++;
            }
        }
    }

    public static synchronized void j() {
        synchronized (d.class) {
            int i4 = 0;
            while (true) {
                u[] uVarArr = f53536e;
                if (i4 < uVarArr.length) {
                    if (uVarArr[i4] != null) {
                        uVarArr[i4].j();
                        try {
                            k(f53537f, f53535d, d(i4).getAbsolutePath());
                        } catch (Exception e5) {
                            e5.printStackTrace();
                        }
                    }
                    i4++;
                }
            }
        }
    }

    private static void k(Context context, KeyMap.EmuMap emuMap, String str) throws Exception {
        try {
            KeyMapActions.class.getDeclaredMethod("saveStat", Context.class, KeyMap.EmuMap.class, String.class).invoke(null, context, emuMap, str);
        } catch (ClassNotFoundException e5) {
            e5.printStackTrace();
        }
    }

    public static boolean l(int i4, Boolean... boolArr) {
        f(f53535d);
        u uVar = f53536e[i4];
        String[] strArr = KeyMap.emuKeysKey;
        boolean c5 = t1.c(uVar.c(KeyMap.emuKeyMapSection, strArr[0]), true);
        if (boolArr == null || boolArr.length == 0) {
            return c5;
        }
        boolean booleanValue = boolArr[0].booleanValue();
        g(i4, KeyMap.emuKeyMapSection, strArr[0], String.valueOf(booleanValue));
        return booleanValue;
    }

    public static void m(Context context, KeyMap.EmuMap emuMap, Map<String, String> map) {
        f53537f = context;
        f53535d = emuMap;
        if (emuMap != null) {
            n(emuMap.section, map);
        }
    }

    public static void n(String str, Map<String, String> map) {
        KeyMap.EmuMap emuMap = f53535d;
        if (emuMap != null) {
            f(emuMap);
        } else {
            f(null);
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String str2 = map.get(key);
            u[] uVarArr = f53536e;
            if (uVarArr[0] != null) {
                uVarArr[0].g(str, key, str2);
            }
        }
        j();
    }

    public static void o(Context context, KeyMap.EmuMap emuMap, Map<String, String> map) {
        f53537f = context;
        f53535d = emuMap;
        if (emuMap != null) {
            p(emuMap.section, map);
        }
    }

    public static void p(String str, Map<String, String> map) {
        KeyMap.EmuMap emuMap = f53535d;
        if (emuMap != null) {
            f(emuMap);
        } else {
            f(null);
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String str2 = map.get(key);
            u[] uVarArr = f53536e;
            if (uVarArr[0] != null) {
                uVarArr[0].g(str, str2, key);
            }
        }
        j();
    }

    public Map a() {
        KeyMap.EmuMap emuMap = f53535d;
        return emuMap == null ? new HashMap() : c(emuMap.section);
    }
}
