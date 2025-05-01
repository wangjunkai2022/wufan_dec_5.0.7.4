package com.facebook.common.media;

import android.webkit.MimeTypeMap;
import com.facebook.common.internal.ImmutableMap;
import java.util.Map;
/* compiled from: MimeTypeMapWrapper.java */
/* loaded from: classes2.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private static final MimeTypeMap f10871a = MimeTypeMap.getSingleton();

    /* renamed from: b  reason: collision with root package name */
    private static final Map<String, String> f10872b = ImmutableMap.of("image/heif", "heif", "image/heic", "heic");

    /* renamed from: c  reason: collision with root package name */
    private static final Map<String, String> f10873c = ImmutableMap.of("heif", "image/heif", "heic", "image/heic");

    public static String a(String str) {
        String str2 = f10872b.get(str);
        return str2 != null ? str2 : f10871a.getExtensionFromMimeType(str);
    }

    public static String b(String str) {
        String str2 = f10873c.get(str);
        return str2 != null ? str2 : f10871a.getMimeTypeFromExtension(str);
    }

    public static boolean c(String str) {
        return f10873c.containsKey(str) || f10871a.hasExtension(str);
    }

    public static boolean d(String str) {
        return f10872b.containsKey(str) || f10871a.hasMimeType(str);
    }
}
