package com.tencent.mm.opensdk.utils;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes6.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static Context f62800a;

    /* renamed from: b  reason: collision with root package name */
    private static final int f62801b;

    /* renamed from: c  reason: collision with root package name */
    private static final int f62802c;

    /* renamed from: d  reason: collision with root package name */
    private static final int f62803d;

    /* renamed from: e  reason: collision with root package name */
    public static ThreadPoolExecutor f62804e;

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        f62801b = availableProcessors;
        int i4 = availableProcessors + 1;
        f62802c = i4;
        int i5 = (availableProcessors * 2) + 1;
        f62803d = i5;
        f62804e = new ThreadPoolExecutor(i4, i5, 1L, TimeUnit.SECONDS, new LinkedBlockingDeque());
    }

    public static int a(ContentResolver contentResolver, Uri uri) {
        Log.i("MicroMsg.SDK.Util", "getFileSize with content url");
        if (contentResolver == null || uri == null) {
            Log.w("MicroMsg.SDK.Util", "getFileSize fail, resolver or uri is null");
            return 0;
        }
        InputStream inputStream = null;
        try {
            try {
                InputStream openInputStream = contentResolver.openInputStream(uri);
                if (openInputStream == null) {
                    if (openInputStream != null) {
                        try {
                            openInputStream.close();
                        } catch (IOException unused) {
                        }
                    }
                    return 0;
                }
                int available = openInputStream.available();
                try {
                    openInputStream.close();
                } catch (IOException unused2) {
                }
                return available;
            } catch (Throwable th) {
                if (0 != 0) {
                    try {
                        inputStream.close();
                    } catch (IOException unused3) {
                    }
                }
                throw th;
            }
        } catch (Exception e5) {
            Log.w("MicroMsg.SDK.Util", "getFileSize fail, " + e5.getMessage());
            if (0 != 0) {
                try {
                    inputStream.close();
                } catch (IOException unused4) {
                }
            }
            return 0;
        }
    }

    public static int a(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        File file = new File(str);
        if (file.exists()) {
            return (int) file.length();
        }
        if (f62800a != null && str.startsWith("content")) {
            try {
                return a(f62800a.getContentResolver(), Uri.parse(str));
            } catch (Exception unused) {
            }
        }
        return 0;
    }

    public static int a(String str, int i4) {
        if (str != null) {
            try {
                return str.length() <= 0 ? i4 : Integer.parseInt(str);
            } catch (Exception unused) {
                return i4;
            }
        }
        return i4;
    }

    public static boolean a(int i4) {
        return i4 == 36 || i4 == 46;
    }

    public static boolean b(String str) {
        return str == null || str.length() <= 0;
    }
}
