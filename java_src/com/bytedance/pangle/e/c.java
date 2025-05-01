package com.bytedance.pangle.e;

import androidx.annotation.NonNull;
import com.bytedance.pangle.e.f;
import com.bytedance.pangle.log.ZeusLogger;
import dalvik.system.DexFile;
import java.io.File;
import java.io.IOException;
/* loaded from: classes2.dex */
public final class c implements f.a {
    @Override // com.bytedance.pangle.e.f.a
    public final boolean a(String str, int i4) {
        String a5 = g.a(str, i4);
        String c5 = com.bytedance.pangle.d.c.c(str, i4);
        String[] split = a5.split(":");
        ZeusLogger.i(ZeusLogger.TAG_INSTALL, "full DexOpt start:".concat(a5));
        long currentTimeMillis = System.currentTimeMillis();
        int length = split.length;
        boolean z4 = false;
        int i5 = 0;
        boolean z5 = false;
        while (true) {
            if (i5 >= length) {
                z4 = z5;
                break;
            }
            String str2 = split[i5];
            if (!a(str2, c5 + File.separator + b.a(str2))) {
                break;
            }
            ZeusLogger.i(ZeusLogger.TAG_INSTALL, "full DexOpt result:true");
            i5++;
            z5 = true;
        }
        ZeusLogger.d(ZeusLogger.TAG_LOAD, "compile cost:" + (System.currentTimeMillis() - currentTimeMillis) + " result:" + z4);
        return z4;
    }

    private static boolean a(@NonNull String str, @NonNull String str2) {
        try {
            DexFile.loadDex(str, str2, 0);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }
}
