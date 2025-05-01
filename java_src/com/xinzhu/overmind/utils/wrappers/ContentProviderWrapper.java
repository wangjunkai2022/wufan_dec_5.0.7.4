package com.xinzhu.overmind.utils.wrappers;

import android.content.ContentProviderClient;
import android.net.Uri;
import android.os.Bundle;
import com.xinzhu.overmind.Overmind;
import com.xinzhu.overmind.utils.e;
/* loaded from: classes.dex */
public class ContentProviderWrapper {
    private static final int RETRY_COUNT_LIMIT = 5;

    public static Bundle acquire(String str, String str2, String str3, Bundle bundle) {
        Uri parse = Uri.parse("content://" + str);
        ContentProviderClient acquireContentProviderClient = acquireContentProviderClient(parse);
        if (acquireContentProviderClient != null) {
            try {
                return acquireContentProviderClient.call(str2, str3, bundle);
            } finally {
            }
        } else {
            throw new RuntimeException("ContentProviderWrapper get null content provider " + parse);
        }
    }

    private static ContentProviderClient acquireContentProviderClient(Uri uri) {
        ContentProviderClient acquireContentProviderClientNoRetry;
        int i4 = 0;
        while (true) {
            acquireContentProviderClientNoRetry = acquireContentProviderClientNoRetry(uri);
            if (acquireContentProviderClientNoRetry == null && (i4 = i4 + 1) <= 5) {
                try {
                    Thread.sleep(50L);
                } catch (InterruptedException e5) {
                    e5.printStackTrace();
                }
            }
        }
        return acquireContentProviderClientNoRetry;
    }

    private static ContentProviderClient acquireContentProviderClientNoRetry(Uri uri) {
        return Overmind.getContext().getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    private static void closeOrRelease(ContentProviderClient contentProviderClient) {
        try {
            if (e.d()) {
                contentProviderClient.close();
            } else {
                contentProviderClient.release();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
