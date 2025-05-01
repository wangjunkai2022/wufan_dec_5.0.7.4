package com.facebook.common.util;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import android.provider.MediaStore;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.annotation.Nullable;
/* compiled from: UriUtil.java */
/* loaded from: classes.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    public static final String f10923a = "http";

    /* renamed from: b  reason: collision with root package name */
    public static final String f10924b = "https";

    /* renamed from: c  reason: collision with root package name */
    public static final String f10925c = "file";

    /* renamed from: d  reason: collision with root package name */
    public static final String f10926d = "content";

    /* renamed from: e  reason: collision with root package name */
    private static final Uri f10927e = Uri.withAppendedPath(ContactsContract.AUTHORITY_URI, "display_photo");

    /* renamed from: f  reason: collision with root package name */
    public static final String f10928f = "asset";

    /* renamed from: g  reason: collision with root package name */
    public static final String f10929g = "res";

    /* renamed from: h  reason: collision with root package name */
    public static final String f10930h = "android.resource";

    /* renamed from: i  reason: collision with root package name */
    public static final String f10931i = "data";

    @Nullable
    public static String a(ContentResolver contentResolver, Uri uri) {
        int columnIndex;
        Cursor cursor = null;
        r1 = null;
        r1 = null;
        String string = null;
        if (j(uri)) {
            try {
                Cursor query = contentResolver.query(uri, null, null, null, null);
                if (query != null) {
                    try {
                        if (query.moveToFirst() && (columnIndex = query.getColumnIndex("_data")) != -1) {
                            string = query.getString(columnIndex);
                        }
                    } catch (Throwable th) {
                        th = th;
                        cursor = query;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                if (query != null) {
                    query.close();
                    return string;
                }
                return string;
            } catch (Throwable th2) {
                th = th2;
            }
        } else if (k(uri)) {
            return uri.getPath();
        } else {
            return null;
        }
    }

    @Nullable
    public static String b(@Nullable Uri uri) {
        if (uri == null) {
            return null;
        }
        return uri.getScheme();
    }

    public static Uri c(File file) {
        return Uri.fromFile(file);
    }

    public static Uri d(String str, int i4) {
        return new Uri.Builder().scheme(f10930h).authority(str).path(String.valueOf(i4)).build();
    }

    public static Uri e(int i4) {
        return new Uri.Builder().scheme(f10929g).path(String.valueOf(i4)).build();
    }

    public static boolean f(@Nullable Uri uri) {
        return "data".equals(b(uri));
    }

    public static boolean g(@Nullable Uri uri) {
        return f10928f.equals(b(uri));
    }

    public static boolean h(Uri uri) {
        String uri2 = uri.toString();
        return uri2.startsWith(MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString()) || uri2.startsWith(MediaStore.Images.Media.INTERNAL_CONTENT_URI.toString());
    }

    public static boolean i(Uri uri) {
        return j(uri) && "com.android.contacts".equals(uri.getAuthority()) && !uri.getPath().startsWith(f10927e.getPath());
    }

    public static boolean j(@Nullable Uri uri) {
        return "content".equals(b(uri));
    }

    public static boolean k(@Nullable Uri uri) {
        return f10925c.equals(b(uri));
    }

    public static boolean l(@Nullable Uri uri) {
        return f10929g.equals(b(uri));
    }

    public static boolean m(@Nullable Uri uri) {
        String b5 = b(uri);
        return "https".equals(b5) || f10923a.equals(b5);
    }

    public static boolean n(@Nullable Uri uri) {
        return f10930h.equals(b(uri));
    }

    @Nullable
    public static Uri o(@Nullable String str) {
        if (str != null) {
            return Uri.parse(str);
        }
        return null;
    }

    @Nullable
    public static URL p(@Nullable Uri uri) {
        if (uri == null) {
            return null;
        }
        try {
            return new URL(uri.toString());
        } catch (MalformedURLException e5) {
            throw new RuntimeException(e5);
        }
    }
}
