package com.aggmoread.sdk.z.a.j;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.NonNull;
import java.io.File;
/* loaded from: classes2.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private static String f2203a = "com.aggmoread.sdk.a.adcomm.amsdk.AMFilesProvider";

    public static Uri a(@NonNull Context context, @NonNull String str, @NonNull File file) {
        try {
            Class<?> cls = Class.forName(f2203a);
            return (Uri) cls.getMethod("getUriForFile", Context.class, String.class, File.class).invoke(cls, context, str, file);
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }
}
