package n1;

import com.huaksj.vasdolly.common.V1SchemeUtil;
import com.huaksj.vasdolly.common.apk.SignatureNotFoundException;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
/* compiled from: ChannelWriter.java */
/* loaded from: classes3.dex */
public class a {
    public static void a(File file, File file2, String str) throws Exception {
        V1SchemeUtil.c(file, file2);
        b(file2, str);
    }

    public static void b(File file, String str) throws Exception {
        V1SchemeUtil.i(file, str);
    }

    public static void c(com.huaksj.vasdolly.common.a aVar, File file, String str) throws IOException, SignatureNotFoundException {
        if (file != null && str != null && str.length() > 0) {
            if (aVar.c()) {
                if (!file.exists() || !file.isFile() || file.length() <= 0) {
                    throw new RuntimeException("addChannelByV2 , destApk invalid in the lowMemory mode");
                }
            } else if (!file.getParentFile().exists()) {
                file.getParentFile().mkdirs();
            }
            ByteBuffer wrap = ByteBuffer.wrap(str.getBytes("UTF-8"));
            wrap.order(ByteOrder.LITTLE_ENDIAN);
            b.a(aVar, file, com.huaksj.vasdolly.common.b.f14487a, wrap);
            return;
        }
        throw new RuntimeException("addChannelByV2 , param invalid, channel = " + str + " , destApk = " + file);
    }

    public static void d(File file, File file2, String str, boolean z4) throws IOException, SignatureNotFoundException {
        c(b.g(file, z4), file2, str);
    }

    public static void e(File file, String str, boolean z4) throws IOException, SignatureNotFoundException {
        d(file, file, str, z4);
    }

    public static void f(File file) throws Exception {
        V1SchemeUtil.h(file);
    }

    public static void g(File file, boolean z4) throws IOException, SignatureNotFoundException {
        if (file != null && file.isFile() && file.exists()) {
            com.huaksj.vasdolly.common.a g4 = b.g(file, z4);
            ArrayList arrayList = new ArrayList();
            arrayList.add(Integer.valueOf((int) com.huaksj.vasdolly.common.b.f14487a));
            b.h(g4, file, arrayList);
            g4.b();
        }
    }
}
