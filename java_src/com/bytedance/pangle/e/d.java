package com.bytedance.pangle.e;

import android.os.Build;
import androidx.annotation.NonNull;
import com.bytedance.pangle.e.f;
import com.bytedance.pangle.log.ZeusLogger;
import java.io.File;
/* loaded from: classes2.dex */
public final class d implements f.a {
    @Override // com.bytedance.pangle.e.f.a
    public final boolean a(String str, int i4) {
        String b5 = com.bytedance.pangle.d.c.b(str, i4);
        ZeusLogger.d(ZeusLogger.TAG_INSTALL, "full DexOpt:".concat(String.valueOf(b5)));
        String c5 = com.bytedance.pangle.d.c.c(str, i4);
        StringBuilder sb = new StringBuilder();
        sb.append(c5);
        String str2 = File.separator;
        sb.append(str2);
        sb.append("compFully");
        sb.append(b.b(b5));
        String sb2 = sb.toString();
        String str3 = c5 + str2 + b.a(b5);
        if (a(b5, sb2)) {
            File file = new File(sb2);
            if (file.exists()) {
                file.renameTo(new File(str3));
            }
            String str4 = Build.VERSION.SDK_INT >= 26 ? ".odex" : ".dex";
            File file2 = new File(sb2.replace(str4, ".vdex"));
            if (file2.exists()) {
                file2.renameTo(new File(str3.replace(str4, ".vdex")));
            }
            boolean a5 = b.a(str3);
            ZeusLogger.i(ZeusLogger.TAG_INSTALL, "full DexOpt result:".concat(String.valueOf(a5)));
            return a5;
        }
        return false;
    }

    private static boolean a(@NonNull String str, @NonNull String str2) {
        try {
            return a.a(b.a(str, str2, b.f8322b));
        } catch (Exception unused) {
            return false;
        }
    }
}
