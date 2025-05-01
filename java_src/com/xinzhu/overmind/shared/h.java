package com.xinzhu.overmind.shared;

import android.content.ContentProviderClient;
import android.net.Uri;
import android.os.Bundle;
import com.xinzhu.overmind.Overmind;
/* compiled from: WfContentProviderWrapper.java */
/* loaded from: classes.dex */
public class h {

    /* renamed from: a  reason: collision with root package name */
    private static final int f68298a = 5;

    public static Bundle a(String str, String str2, String str3, Bundle bundle) {
        Uri parse = Uri.parse("content://" + str);
        ContentProviderClient b5 = b(parse);
        if (b5 != null) {
            try {
                return b5.call(str2, str3, bundle);
            } finally {
            }
        } else {
            throw new RuntimeException("ContentProviderWrapper get null content provider " + parse);
        }
    }

    private static ContentProviderClient b(Uri uri) {
        ContentProviderClient c5;
        int i4 = 0;
        while (true) {
            c5 = c(uri);
            if (c5 == null && (i4 = i4 + 1) <= 5) {
                try {
                    Thread.sleep(50L);
                } catch (InterruptedException e5) {
                    e5.printStackTrace();
                }
            }
        }
        return c5;
    }

    private static ContentProviderClient c(Uri uri) {
        return Overmind.getContext().getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    private static void d(ContentProviderClient contentProviderClient) {
        try {
            if (com.xinzhu.overmind.utils.e.d()) {
                contentProviderClient.close();
            } else {
                contentProviderClient.release();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
