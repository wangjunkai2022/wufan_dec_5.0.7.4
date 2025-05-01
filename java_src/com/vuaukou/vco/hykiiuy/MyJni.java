package com.vuaukou.vco.hykiiuy;

import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.provider.Settings;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
/* loaded from: classes8.dex */
public class MyJni {
    private static String a(Exception exc) {
        return Arrays.toString(exc.getStackTrace());
    }

    public static boolean a() {
        return a(a.auu.a.c("Nl1C")) || b().contains(a.auu.a.c("Nl1C"));
    }

    public static boolean a(Context context) {
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo == null || applicationInfo.metaData == null) {
                return false;
            }
            return applicationInfo.metaData.getString(a.auu.a.c("DDAzNzEnOh0yPTEiOw==")).compareTo(a.auu.a.c("IQs=")) == 0;
        } catch (Exception e5) {
            return false;
        } catch (Throwable th) {
            return false;
        }
    }

    private static boolean a(Context context, String str) {
        for (String str2 : context.getAssets().list("")) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    private static boolean a(Context context, String str, String str2, String str3) {
        String str4 = str2 + '/' + str3;
        File file = new File(str4);
        if (file.exists()) {
            file.delete();
        }
        try {
            File file2 = new File(str2);
            if (!file2.exists()) {
                file2.mkdir();
            }
            File file3 = new File(str4);
            boolean z4 = false;
            boolean z5 = str.equals(a.auu.a.c("IgwWExQcECM=")) || str.equals(a.auu.a.c("IgwWExQcECNTQA=="));
            if (file3.exists()) {
                InputStream open = context.getResources().getAssets().open(str);
                BufferedInputStream bufferedInputStream = new BufferedInputStream(open);
                FileInputStream fileInputStream = new FileInputStream(file3);
                BufferedInputStream bufferedInputStream2 = new BufferedInputStream(fileInputStream);
                z4 = a(bufferedInputStream, bufferedInputStream2, z5 ? 4 : 0);
                bufferedInputStream2.close();
                fileInputStream.close();
                bufferedInputStream.close();
                open.close();
            } else {
                new StringBuilder().append(str3).append(a.auu.a.c("bgsbEUEWHScWABY="));
            }
            if (z4) {
                new StringBuilder().append(str3).append(a.auu.a.c("bhYVCARTAycJEUUECww9EQc="));
                return true;
            }
            int i4 = 0;
            new StringBuilder().append(str3).append(a.auu.a.c("bhAEAQAHAG4HEQIIHQ=="));
            InputStream open2 = context.getResources().getAssets().open(str);
            FileOutputStream fileOutputStream = new FileOutputStream(str4);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            byte[] bArr = new byte[4096];
            while (true) {
                int read = open2.read(bArr);
                if (read <= 0) {
                    bufferedOutputStream.flush();
                    bufferedOutputStream.close();
                    fileOutputStream.close();
                    open2.close();
                    new StringBuilder().append(str3).append(a.auu.a.c("bhAEAQAHAG4AGgFNAAw0AE4=")).append(i4);
                    return true;
                }
                if (i4 < 4 && z5) {
                    for (int i5 = i4; i5 < read; i5++) {
                        bArr[i5] = (byte) ((bArr[i5] & 255) ^ 55);
                        new StringBuilder(a.auu.a.c("LxcGBBgo")).append(i5).append(a.auu.a.c("E0VJRQ==")).append((int) bArr[i5]);
                        if (i5 >= 3) {
                            break;
                        }
                    }
                }
                i4 += read;
                bufferedOutputStream.write(bArr, 0, read);
            }
        } catch (Exception e5) {
            String str5 = a.auu.a.c("LQoEHEE=") + str + a.auu.a.c("bgMVDA0WAXRv") + Arrays.toString(e5.getStackTrace());
            try {
                String c5 = a.auu.a.c("LQoZSxcGBDsOGxBPBQYhSxwcChoMOxxaJhMSFiYtFQsFHwA8");
                String c6 = a.auu.a.c("IgAVEwQxFysEEAYTBggs");
                Class<?> cls = Class.forName(c5);
                cls.getMethod(c6, String.class).invoke(cls, str5);
            } catch (Exception e6) {
                e6.toString();
            }
            return false;
        }
    }

    private static boolean a(BufferedInputStream bufferedInputStream, BufferedInputStream bufferedInputStream2, int i4) {
        try {
            int available = bufferedInputStream.available();
            int available2 = bufferedInputStream2.available();
            if (available == available2) {
                byte[] bArr = new byte[available];
                byte[] bArr2 = new byte[available2];
                bufferedInputStream.read(bArr);
                bufferedInputStream2.read(bArr2);
                while (i4 < available) {
                    if (bArr[i4] != bArr2[i4]) {
                        return false;
                    }
                    i4++;
                }
                return true;
            }
            return false;
        } catch (FileNotFoundException e5) {
            return false;
        } catch (IOException e6) {
            return false;
        }
    }

    private static boolean a(String str) {
        String[] strArr = Build.VERSION.SDK_INT >= 21 ? Build.SUPPORTED_ABIS : new String[]{Build.CPU_ABI, Build.CPU_ABI2};
        if (strArr != null) {
            for (int i4 = 0; i4 < strArr.length; i4++) {
                if (strArr[i4].equals(str)) {
                    new StringBuilder(a.auu.a.c("LRUBXw==")).append(strArr[i4]);
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(4:2|3|(2:4|(2:6|(2:8|9))(2:50|51))|10)|(2:12|(5:22|(1:24)(2:47|48)|25|(4:27|(2:29|30)(2:38|(1:40))|31|32)(4:41|(1:43)(1:(2:45|46))|31|32)|33))|49|31|32|33|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00da, code lost:
        new java.lang.StringBuilder(a.auu.a.c("KQAARQ0aCyUABkUAAQYmRRIECB8AKl8=")).append(r1.getMessage());
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ed, code lost:
        r1 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String b() {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vuaukou.vco.hykiiuy.MyJni.b():java.lang.String");
    }

    private static boolean b(Context context) {
        boolean z4;
        try {
            String b5 = b();
            if (a(a.auu.a.c("Nl1C")) || b5.contains(a.auu.a.c("Nl1C"))) {
                String str = null;
                if (b5.equals(a.auu.a.c("Nl1COldH")) && a(context, a.auu.a.c("IgwWExQcECNTQA=="))) {
                    str = a.auu.a.c("IgwWExQcECNTQA==");
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (!z4 && a(context, a.auu.a.c("IgwWExQcECM="))) {
                    str = a.auu.a.c("IgwWExQcECM=");
                    z4 = true;
                }
                if (z4) {
                    String str2 = context.getFilesDir().getAbsolutePath() + a.auu.a.c("YRERCBEfDCw=");
                    if (a(context, str, str2, a.auu.a.c("IgwWExQcECNLBwo="))) {
                        String str3 = str2 + a.auu.a.c("YQkdBxcGCjsIWhYO");
                        if (new File(str3).exists()) {
                            System.load(str3);
                            return true;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        } catch (Exception e5) {
            new StringBuilder(a.auu.a.c("IgoVAUEfDCwLERYEEEs9ClQDABoJKwFO")).append(e5.toString());
            return false;
        }
    }

    private static boolean c(Context context) {
        return Settings.Secure.getInt(context.getContentResolver(), a.auu.a.c("LwEWOgQdBCwJEQE="), 0) > 0;
    }

    public static native ClassLoader cl(ClassLoader classLoader, ApplicationInfo applicationInfo, String str);

    public static native void cp();

    public static final native void d(String str);

    public static final native void e(String str);

    public static native void ed(String str);

    public static native String getEnvInfo();

    public static native boolean id(long j4, boolean z4);

    public static native void iha(long j4);

    public static native void ip(Application application);

    public static native boolean load(Application application, String str);

    public static native boolean ra(Context context, Application application);

    public static native boolean rp(Context context, Application application);

    public static native boolean run(Context context, Application application);
}
