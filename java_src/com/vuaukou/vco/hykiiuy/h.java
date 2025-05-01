package com.vuaukou.vco.hykiiuy;

import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
/* loaded from: classes8.dex */
public final class h {
    public static String a() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(a.auu.a.c("YRUGCgJc") + Process.myPid() + a.auu.a.c("YQYZAQ0aCys="))));
            String trim = bufferedReader.readLine().trim();
            bufferedReader.close();
            return trim;
        } catch (Exception e5) {
            e5.toString();
            return null;
        }
    }

    private static boolean a(Context context) {
        String a5 = a();
        return !TextUtils.isEmpty(a5) && a5.equals(context.getPackageName());
    }
}
