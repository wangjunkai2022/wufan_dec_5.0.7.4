package com.kwad.sdk.utils;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
/* loaded from: classes5.dex */
public final class af {
    private static String aQw;
    private static boolean aQx;

    public static String cu(Context context) {
        if (TextUtils.isEmpty(aQw) && !aQx && au.MQ()) {
            Cursor cursor = null;
            try {
                cursor = context.getContentResolver().query(Uri.parse("content://com.xiaomi.market.provider.DirectMailProvider"), null, null, null, null);
                aQw = k(cursor);
            } catch (Throwable unused) {
            }
            com.kwad.sdk.crash.utils.b.closeQuietly(cursor);
            aQx = TextUtils.isEmpty(aQw);
            return aQw;
        }
        return aQw;
    }

    public static boolean cv(Context context) {
        boolean z4 = false;
        if (au.MQ()) {
            Cursor cursor = null;
            try {
                try {
                    cursor = context.getContentResolver().query(Uri.parse("content://com.xiaomi.market.provider.DirectMailProvider"), null, null, null, null);
                    z4 = l(cursor);
                } catch (Throwable unused) {
                    com.kwad.sdk.core.e.c.e("MiMarketHelper", "isSupportMiMarket2 failed");
                }
                if (!z4 && au.MQ()) {
                    com.kwad.sdk.core.e.c.i("MiMarketHelper", "is Miui but not support MiMarket2.0");
                }
                return z4;
            } finally {
                com.kwad.sdk.crash.utils.b.closeQuietly(cursor);
            }
        }
        return false;
    }

    public static boolean gJ(String str) {
        return str.startsWith("market://details") || str.startsWith("mimarket://details");
    }

    private static String k(Cursor cursor) {
        int columnIndex;
        if (cursor != null && !cursor.isClosed()) {
            cursor.moveToFirst();
            int columnIndex2 = cursor.getColumnIndex("support");
            return ((columnIndex2 <= 0 || cursor.getInt(columnIndex2) != 0) && (columnIndex = cursor.getColumnIndex("detailStyle")) > 0) ? cursor.getString(columnIndex) : "";
        }
        com.kwad.sdk.core.e.c.i("MiMarketHelper", "cursor is null");
        return "";
    }

    private static boolean l(Cursor cursor) {
        if (cursor != null && !cursor.isClosed()) {
            cursor.moveToFirst();
            int columnIndex = cursor.getColumnIndex("support");
            if (columnIndex >= 0) {
                return cursor.getString(columnIndex).equals("true");
            }
            return false;
        }
        com.kwad.sdk.core.e.c.i("MiMarketHelper", "isSupportMiMarket2: cursor is null");
        return false;
    }
}
