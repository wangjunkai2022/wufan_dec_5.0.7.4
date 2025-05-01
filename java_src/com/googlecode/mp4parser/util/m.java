package com.googlecode.mp4parser.util;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: Path.java */
/* loaded from: classes3.dex */
public class m {

    /* renamed from: a  reason: collision with root package name */
    static Pattern f14247a = Pattern.compile("(....|\\.\\.)(\\[(.*)\\])?");

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ boolean f14248b = false;

    private m() {
    }

    public static String a(com.coremedia.iso.boxes.d dVar) {
        return b(dVar, "");
    }

    private static String b(com.coremedia.iso.boxes.d dVar, String str) {
        com.coremedia.iso.boxes.j parent = dVar.getParent();
        int i4 = 0;
        for (com.coremedia.iso.boxes.d dVar2 : parent.t()) {
            if (dVar2.getType().equals(dVar.getType())) {
                if (dVar2 == dVar) {
                    break;
                }
                i4++;
            }
        }
        String str2 = String.valueOf(String.format("/%s[%d]", dVar.getType(), Integer.valueOf(i4))) + str;
        return parent instanceof com.coremedia.iso.boxes.d ? b((com.coremedia.iso.boxes.d) parent, str2) : str2;
    }

    public static <T extends com.coremedia.iso.boxes.d> T c(com.coremedia.iso.boxes.d dVar, String str) {
        List g4 = g(dVar, str, true);
        if (g4.isEmpty()) {
            return null;
        }
        return (T) g4.get(0);
    }

    public static <T extends com.coremedia.iso.boxes.d> T d(com.coremedia.iso.boxes.j jVar, String str) {
        List i4 = i(jVar, str, true);
        if (i4.isEmpty()) {
            return null;
        }
        return (T) i4.get(0);
    }

    public static <T extends com.coremedia.iso.boxes.d> T e(com.googlecode.mp4parser.b bVar, String str) {
        List j4 = j(bVar, str, true);
        if (j4.isEmpty()) {
            return null;
        }
        return (T) j4.get(0);
    }

    public static <T extends com.coremedia.iso.boxes.d> List<T> f(com.coremedia.iso.boxes.d dVar, String str) {
        return g(dVar, str, false);
    }

    private static <T extends com.coremedia.iso.boxes.d> List<T> g(com.coremedia.iso.boxes.d dVar, String str, boolean z4) {
        return k(dVar, str, z4);
    }

    public static <T extends com.coremedia.iso.boxes.d> List<T> h(com.coremedia.iso.boxes.j jVar, String str) {
        return i(jVar, str, false);
    }

    private static <T extends com.coremedia.iso.boxes.d> List<T> i(com.coremedia.iso.boxes.j jVar, String str, boolean z4) {
        return k(jVar, str, z4);
    }

    private static <T extends com.coremedia.iso.boxes.d> List<T> j(com.googlecode.mp4parser.b bVar, String str, boolean z4) {
        return k(bVar, str, z4);
    }

    private static <T extends com.coremedia.iso.boxes.d> List<T> k(Object obj, String str, boolean z4) {
        String str2;
        if (str.startsWith(net.lingala.zip4j.util.e.F0)) {
            String substring = str.substring(1);
            while (obj instanceof com.coremedia.iso.boxes.d) {
                obj = ((com.coremedia.iso.boxes.d) obj).getParent();
            }
            str = substring;
        }
        if (str.length() == 0) {
            if (obj instanceof com.coremedia.iso.boxes.d) {
                return Collections.singletonList((com.coremedia.iso.boxes.d) obj);
            }
            throw new RuntimeException("Result of path expression seems to be the root container. This is not allowed!");
        }
        int i4 = 0;
        if (str.contains(net.lingala.zip4j.util.e.F0)) {
            str2 = str.substring(str.indexOf(47) + 1);
            str = str.substring(0, str.indexOf(47));
        } else {
            str2 = "";
        }
        Matcher matcher = f14247a.matcher(str);
        if (matcher.matches()) {
            String group = matcher.group(1);
            if ("..".equals(group)) {
                if (obj instanceof com.coremedia.iso.boxes.d) {
                    return i(((com.coremedia.iso.boxes.d) obj).getParent(), str2, z4);
                }
                return Collections.emptyList();
            } else if (obj instanceof com.coremedia.iso.boxes.j) {
                int parseInt = matcher.group(2) != null ? Integer.parseInt(matcher.group(3)) : -1;
                LinkedList linkedList = new LinkedList();
                for (com.coremedia.iso.boxes.d dVar : ((com.coremedia.iso.boxes.j) obj).t()) {
                    if (dVar.getType().matches(group)) {
                        if (parseInt == -1 || parseInt == i4) {
                            linkedList.addAll(g(dVar, str2, z4));
                        }
                        i4++;
                    }
                    if (z4 || parseInt >= 0) {
                        if (!linkedList.isEmpty()) {
                            return linkedList;
                        }
                    }
                }
                return linkedList;
            } else {
                return Collections.emptyList();
            }
        }
        throw new RuntimeException(String.valueOf(str) + " is invalid path.");
    }

    public static boolean l(com.coremedia.iso.boxes.d dVar, String str) {
        return f(dVar, str).contains(dVar);
    }
}
