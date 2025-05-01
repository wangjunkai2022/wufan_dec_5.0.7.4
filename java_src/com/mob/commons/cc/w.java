package com.mob.commons.cc;

import com.swift.sandhook.annotation.MethodReflectParams;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes5.dex */
public class w {

    /* renamed from: a  reason: collision with root package name */
    static final HashMap<String, Class<?>> f56288a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private final ArrayList<y> f56289b;

    /* renamed from: c  reason: collision with root package name */
    private final ArrayList<Object> f56290c;

    public w(ArrayList<y> arrayList, ArrayList<Object> arrayList2) {
        this.f56289b = arrayList;
        this.f56290c = arrayList2;
    }

    public void a(HashMap<String, Object> hashMap, u uVar) throws Throwable {
        s sVar = new s(hashMap, uVar);
        a(sVar);
        a(0, this.f56289b.size(), sVar, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
        r0.f56323d = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(int r4, int r5, com.mob.commons.cc.s r6, java.util.List<java.lang.Object> r7) throws java.lang.Throwable {
        /*
            r3 = this;
            com.mob.commons.cc.y$a r0 = new com.mob.commons.cc.y$a
            r0.<init>()
            r0.f56320a = r4
            r0.f56321b = r6
            r0.f56322c = r7
            java.util.ArrayList<com.mob.commons.cc.y> r4 = r3.f56289b
            r0.f56325f = r4
            java.util.ArrayList<java.lang.Object> r4 = r3.f56290c
            r0.f56326g = r4
        L13:
            int r4 = r0.f56320a     // Catch: java.lang.Throwable -> L4d
            if (r4 >= r5) goto L39
            boolean r4 = r6.f()     // Catch: java.lang.Throwable -> L4d
            r1 = 1
            if (r4 == 0) goto L21
            r0.f56323d = r1     // Catch: java.lang.Throwable -> L4d
            goto L39
        L21:
            java.util.ArrayList<com.mob.commons.cc.y> r4 = r3.f56289b     // Catch: java.lang.Throwable -> L4d
            int r2 = r0.f56320a     // Catch: java.lang.Throwable -> L4d
            java.lang.Object r4 = r4.get(r2)     // Catch: java.lang.Throwable -> L4d
            com.mob.commons.cc.y r4 = (com.mob.commons.cc.y) r4     // Catch: java.lang.Throwable -> L4d
            r4.a(r0)     // Catch: java.lang.Throwable -> L4d
            boolean r4 = r0.f56324e     // Catch: java.lang.Throwable -> L4d
            if (r4 == 0) goto L33
            goto L39
        L33:
            int r4 = r0.f56320a     // Catch: java.lang.Throwable -> L4d
            int r4 = r4 + r1
            r0.f56320a = r4     // Catch: java.lang.Throwable -> L4d
            goto L13
        L39:
            boolean r4 = r0.f56323d
            if (r4 != 0) goto L4c
            int r4 = r6.d()
            if (r4 <= 0) goto L4c
            if (r7 == 0) goto L4c
            java.lang.Object r4 = r6.a()     // Catch: java.lang.Throwable -> L4c
            r7.add(r4)     // Catch: java.lang.Throwable -> L4c
        L4c:
            return
        L4d:
            r4 = move-exception
            boolean r5 = r4 instanceof com.mob.commons.cc.v
            if (r5 == 0) goto L6a
            java.lang.String r5 = r4.getMessage()
            if (r5 != 0) goto L61
            java.lang.Class r5 = r4.getClass()
            java.lang.String r5 = r5.getSimpleName()
            goto L65
        L61:
            java.lang.String r5 = r4.getMessage()
        L65:
            java.lang.Throwable r4 = r4.getCause()
            goto L8e
        L6a:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Suba Runtime Error: "
            r5.append(r6)
            java.lang.String r6 = r4.getMessage()
            if (r6 != 0) goto L83
            java.lang.Class r6 = r4.getClass()
            java.lang.String r6 = r6.getSimpleName()
            goto L87
        L83:
            java.lang.String r6 = r4.getMessage()
        L87:
            r5.append(r6)
            java.lang.String r5 = r5.toString()
        L8e:
            java.util.ArrayList<com.mob.commons.cc.y> r6 = r3.f56289b
            int r7 = r0.f56320a
            java.lang.Object r6 = r6.get(r7)
            com.mob.commons.cc.y r6 = (com.mob.commons.cc.y) r6
            java.lang.String r6 = r6.f56302b
            java.util.ArrayList<com.mob.commons.cc.y> r7 = r3.f56289b
            int r0 = r0.f56320a
            java.lang.Object r7 = r7.get(r0)
            com.mob.commons.cc.y r7 = (com.mob.commons.cc.y) r7
            int r7 = r7.f56303c
            com.mob.commons.cc.v r0 = new com.mob.commons.cc.v
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r5)
            java.lang.String r5 = "\r\n\tat "
            r1.append(r5)
            r1.append(r6)
            java.lang.String r5 = " ("
            r1.append(r5)
            r1.append(r7)
            java.lang.String r5 = ")"
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5, r4)
            goto Lce
        Lcd:
            throw r0
        Lce:
            goto Lcd
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mob.commons.cc.w.a(int, int, com.mob.commons.cc.s, java.util.List):void");
    }

    private void a(s sVar) {
        sVar.a("Object", Object.class);
        sVar.a("Class", Class.class);
        sVar.a("Method", Method.class);
        sVar.a("String", String.class);
        sVar.a("Thread", Thread.class);
        sVar.a(com.mob.commons.s.a("008^gjdgPeedHffAgf"), Runnable.class);
        sVar.a(com.mob.commons.s.a("006Melecfi%if8df"), System.class);
        sVar.a("File", File.class);
        sVar.a("URL", URL.class);
        sVar.a("Double", Double.class);
        sVar.a("Float", Float.class);
        sVar.a("Long", Long.class);
        sVar.a("Integer", Integer.class);
        sVar.a(com.mob.commons.s.a("005Eel2h:dkdj5i"), Short.class);
        sVar.a("Byte", Byte.class);
        sVar.a("Number", Number.class);
        sVar.a(com.mob.commons.s.a("009TedYhd^djVdcifUdj"), Character.class);
        sVar.a("Boolean", Boolean.class);
        sVar.a(com.mob.commons.s.a("006=dcdkdgffGgf"), Double.TYPE);
        sVar.a(com.mob.commons.s.a("005+efHgXdk+di"), Float.TYPE);
        sVar.a(MethodReflectParams.LONG, Long.TYPE);
        sVar.a(com.mob.commons.s.a("0036diFei"), Integer.TYPE);
        sVar.a(MethodReflectParams.SHORT, Short.TYPE);
        sVar.a(MethodReflectParams.BYTE, Byte.TYPE);
        sVar.a(com.mob.commons.s.a("004chdUdj"), Character.TYPE);
        sVar.a("boolean", Boolean.TYPE);
        sVar.a("bigInt", BigInteger.class);
        sVar.a("BigInteger", BigInteger.class);
        sVar.a("bigDec", BigDecimal.class);
        sVar.a("BigDecimal", BigDecimal.class);
        sVar.a("List", List.class);
        sVar.a("Map", Map.class);
        sVar.a("Function", z.class);
        sVar.a("fun", z.class);
        sVar.a("Range", aa.class);
        sVar.a("Array", Array.class);
        sVar.a("Suba", x.class);
        sVar.a("VM", x.class);
        for (Map.Entry<String, Class<?>> entry : f56288a.entrySet()) {
            sVar.a(entry.getKey(), entry.getValue());
        }
    }

    public ArrayList<y> a() {
        return this.f56289b;
    }
}
