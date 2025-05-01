package com.heepay.plugin.c;

import android.content.Context;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.UUID;
/* loaded from: classes3.dex */
public class j {

    /* renamed from: a  reason: collision with root package name */
    private static volatile j f14393a;

    /* renamed from: b  reason: collision with root package name */
    private final String f14394b = "HyID";

    private j() {
    }

    public static j a() {
        if (f14393a == null) {
            synchronized (j.class) {
                if (f14393a == null) {
                    f14393a = new j();
                }
            }
        }
        return f14393a;
    }

    private String a(File file) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        byte[] bArr = new byte[(int) randomAccessFile.length()];
        randomAccessFile.readFully(bArr);
        randomAccessFile.close();
        return new String(bArr);
    }

    private void b(File file) {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        fileOutputStream.write(UUID.randomUUID().toString().getBytes());
        fileOutputStream.close();
    }

    public String a(Context context) {
        try {
            File file = new File(context.getFilesDir(), "HyID");
            if (!file.exists()) {
                b(file);
            }
            return a(file);
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }
}
