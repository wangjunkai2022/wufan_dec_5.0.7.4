package com.facebook.common.media;

import com.facebook.common.internal.ImmutableMap;
import java.util.Locale;
import java.util.Map;
import javax.annotation.Nullable;
/* compiled from: MediaUtils.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, String> f10870a = ImmutableMap.of("mkv", "video/x-matroska", "glb", "model/gltf-binary");

    @Nullable
    private static String a(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf < 0 || lastIndexOf == str.length() - 1) {
            return null;
        }
        return str.substring(lastIndexOf + 1);
    }

    @Nullable
    public static String b(String str) {
        String a5 = a(str);
        if (a5 == null) {
            return null;
        }
        String lowerCase = a5.toLowerCase(Locale.US);
        String b5 = b.b(lowerCase);
        return b5 == null ? f10870a.get(lowerCase) : b5;
    }

    public static boolean c(String str) {
        return f10870a.containsValue(str);
    }

    public static boolean d(@Nullable String str) {
        return str != null && str.startsWith("image/");
    }

    public static boolean e(@Nullable String str) {
        return str != null && str.equals("model/gltf-binary");
    }

    public static boolean f(@Nullable String str) {
        return str != null && str.startsWith("video/");
    }
}
