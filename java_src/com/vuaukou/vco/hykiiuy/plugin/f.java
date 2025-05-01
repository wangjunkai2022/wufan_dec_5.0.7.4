package com.vuaukou.vco.hykiiuy.plugin;

import android.content.Context;
import android.os.Build;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import kotlin.jvm.internal.ByteCompanionObject;
/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    static String f64878a = a.auu.a.c("PQoRHRUBBC0RGxc=");

    private static Boolean a(String str) {
        if (str.contains(a.auu.a.c("YQkdB04SFyNTQA=="))) {
            return true;
        }
        File file = new File(str);
        if (file.exists()) {
            File[] listFiles = file.listFiles();
            for (File file2 : listFiles) {
                try {
                    byte[] bArr = new byte[5];
                    if (new BufferedInputStream(new FileInputStream(file2)).read(bArr, 0, 5) == 5 && bArr[0] == Byte.MAX_VALUE && bArr[1] == 69 && bArr[2] == 76 && bArr[3] == 70) {
                        return bArr[4] == 2;
                    }
                } catch (Exception e5) {
                    e5.toString();
                }
            }
            return false;
        }
        return null;
    }

    public static void a(Context context) {
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        try {
            String str = context.getFilesDir() + a.auu.a.c("YRERCBEfDCxKGAwDAEs0DAQ=");
            String str2 = context.getFilesDir() + a.auu.a.c("YRERCBEfDCw=");
            String str3 = context.getApplicationInfo().nativeLibraryDir;
            File file = new File(str2);
            if (!file.exists()) {
                file.mkdirs();
            }
            a(context.getClassLoader(), file);
            if (!a(context, a.auu.a.c("YAsRFgQQOj4EAAYJ"), str2, str, str3)) {
                return;
            }
        } catch (Exception e5) {
            e5.toString();
        }
        new StringBuilder(a.auu.a.c("KwsQRQ4VRRUADBETEgY6KR0HPFMRJwgRXw==")).append(String.valueOf(System.currentTimeMillis() - valueOf.longValue()));
    }

    public static void a(ClassLoader classLoader, File file) {
        if (!file.exists()) {
            new StringBuilder(a.auu.a.c("JwsHEQAfCQAEAAwXFiknBwYEEwo1LxEcSUEVCiIBERdBVhZuDAdFCB8JKwIVCUE=")).append(file.getAbsolutePath());
        } else if (Build.VERSION.SDK_INT >= 25) {
            try {
                i.a(classLoader, file);
            } catch (Throwable th) {
                String.format(a.auu.a.c("JwsHEQAfCQAEAAwXFiknBwYEEwo1LxEcSUEFV3tFEgQIH0luFhAOW1NAKklUABMBCjxfVEASX0U6Fw1FFRxFKAQYCQMSBiVFAApBJVd9"), Integer.valueOf(Build.VERSION.SDK_INT), th);
                h.a(classLoader, file);
            }
        } else if (Build.VERSION.SDK_INT < 23) {
            if (Build.VERSION.SDK_INT >= 14) {
                g.a(classLoader, file);
            } else {
                j.a(classLoader, file);
            }
        } else {
            try {
                h.a(classLoader, file);
            } catch (Throwable th2) {
                String.format(a.auu.a.c("JwsHEQAfCQAEAAwXFiknBwYEEwo1LxEcSUEFV31FEgQIH0luFhAOW1NAKklUABMBCjxfVEASX0U6Fw1FFRxFKAQYCQMSBiVFAApBJVR6"), Integer.valueOf(Build.VERSION.SDK_INT), th2);
                g.a(classLoader, file);
            }
        }
    }

    private static boolean a(Context context, String str, String str2, String str3) {
        InputStream open = context.getAssets().open(str);
        if (open == null) {
            return false;
        }
        File file = new File(str2);
        if (!file.exists()) {
            file.mkdir();
        }
        FileOutputStream fileOutputStream = new FileOutputStream(new File(str3));
        byte[] bArr = new byte[1024];
        while (true) {
            int read = open.read(bArr);
            if (read == -1) {
                fileOutputStream.flush();
                fileOutputStream.close();
                open.close();
                return true;
            }
            for (int i4 = 0; i4 < read; i4++) {
                bArr[i4] = (byte) (bArr[i4] ^ ByteCompanionObject.MAX_VALUE);
            }
            fileOutputStream.write(bArr, 0, read);
        }
    }

    private static boolean a(Context context, String str, String str2, String str3, String str4) {
        File[] listFiles;
        String str5 = context.getFilesDir() + a.auu.a.c("YRERCBEfDCw=");
        File file = new File(str5 + a.auu.a.c("YQ==") + new File(context.getPackageCodePath()).lastModified());
        if (file.exists()) {
            return false;
        }
        for (File file2 : new File(str5).listFiles()) {
            if (file2.isFile()) {
                file2.delete();
            }
        }
        try {
            if (a(context, str, str2, str3)) {
                int i4 = 3;
                while (true) {
                    if (i4 <= 0) {
                        break;
                    } else if (a(str3, str2, str4)) {
                        file.createNewFile();
                        break;
                    } else {
                        i4--;
                    }
                }
                new File(str3).delete();
            }
        } catch (Exception e5) {
            e5.toString();
        }
        return true;
    }

    public static boolean a(String str, String str2, String str3) {
        File file = new File(str2);
        if (!file.exists()) {
            file.mkdirs();
        }
        try {
            ZipFile zipFile = new ZipFile(str);
            Boolean a5 = a(str3);
            String[] c5 = c(b(str3));
            for (int i4 = 0; i4 < c5.length; i4++) {
                if (!str3.contains(a.auu.a.c("Nl1C")) && a5 != null && !a5.booleanValue() && c5[i4].contains(a.auu.a.c("LxcZU1U="))) {
                    new StringBuilder(a.auu.a.c("JwIaChMWRToNEUU=")).append(c5[i4]).append(a.auu.a.c("bgMbF0EHDStFGgQVGhMrKR0HExIXN0UdFkEdCjpFQlFBEQw6"));
                } else if (str3.contains(a.auu.a.c("Nl1C")) || a5 == null || !a5.booleanValue() || c5[i4].contains(a.auu.a.c("LxcZU1U="))) {
                    new StringBuilder(a.auu.a.c("OwsODBFTFiFF")).append(c5[i4]);
                    if (a(zipFile, c5[i4], str2)) {
                        break;
                    }
                } else {
                    new StringBuilder(a.auu.a.c("JwIaChMWRToNEUU=")).append(c5[i4]).append(a.auu.a.c("bgMbF0EHDStFGgQVGhMrKR0HExIXN0UdFkFFUW4HHRE="));
                }
            }
            zipFile.close();
            return true;
        } catch (Exception e5) {
            e5.toString();
            return false;
        }
    }

    private static boolean a(ZipFile zipFile, String str, String str2) {
        Exception exc;
        boolean z4;
        boolean z5 = false;
        try {
            byte[] bArr = new byte[1024];
            Enumeration<? extends ZipEntry> entries = zipFile.entries();
            Method method = Class.forName(a.auu.a.c("JAQCBE8GEScJWh8IA0sUDAQgDwcXNw==")).getMethod(a.auu.a.c("KQAAKwAeAA=="), new Class[0]);
            while (entries.hasMoreElements()) {
                ZipEntry nextElement = entries.nextElement();
                String str3 = (String) method.invoke(nextElement, new Object[0]);
                if (str3.contains(str + a.auu.a.c("YQ=="))) {
                    try {
                        if (str3.contains("../")) {
                            z5 = true;
                        } else {
                            InputStream inputStream = zipFile.getInputStream(nextElement);
                            File file = new File(str2 + File.separator + str3.split(a.auu.a.c("YQ=="))[1]);
                            new File(file.getParent()).mkdirs();
                            FileOutputStream fileOutputStream = new FileOutputStream(file);
                            while (true) {
                                int read = inputStream.read(bArr);
                                if (read <= 0) {
                                    break;
                                }
                                fileOutputStream.write(bArr, 0, read);
                            }
                            fileOutputStream.close();
                            inputStream.close();
                            z5 = true;
                        }
                    } catch (Exception e5) {
                        exc = e5;
                        z4 = true;
                        exc.toString();
                        return z4;
                    }
                }
            }
        } catch (Exception e6) {
            exc = e6;
            z4 = z5;
        }
        if (z5) {
            return z5;
        }
        z4 = z5;
        return z4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static String b(String str) {
        if (new File(str).exists()) {
            File file = new File(str + a.auu.a.c("YQkdBxcGCjsIWhYO"));
            byte[] bArr = new byte[24];
            String c5 = a.auu.a.c("OwsfCw4ECw==");
            try {
                new BufferedInputStream(new FileInputStream(file)).read(bArr, 0, 24);
                int i4 = bArr[18] < 0 ? (bArr[18] & 127) + 128 : bArr[18];
                return bArr[4] == 2 ? i4 == 183 ? a.auu.a.c("LxcZU1VeE3YE") : i4 == 62 ? a.auu.a.c("Nl1COldH") : c5 : i4 == 40 ? a.auu.a.c("LxcZAAARDA==") : i4 == 3 ? a.auu.a.c("Nl1C") : c5;
            } catch (Exception e5) {
                e5.toString();
                return c5;
            }
        }
        return a.auu.a.c("OwsfCw4ECw==");
    }

    private static void b(Context context) {
        try {
            a(context, a.auu.a.c("IAAHAAIsFS8RFw1T"), context.getFilesDir() + a.auu.a.c("YRERCBEfDCw="), context.getFilesDir() + a.auu.a.c("YRERCBEfDCxKGAwDBRAhEBlLEhw="));
        } catch (Exception e5) {
            e5.toString();
        }
    }

    private static String[] c(String str) {
        ArrayList arrayList = new ArrayList();
        if (str.equals(a.auu.a.c("LxcZAAARDA=="))) {
            arrayList.add(a.auu.a.c("LxcZAAARDGMTQwQ="));
            arrayList.add(a.auu.a.c("LxcZAAARDA=="));
        } else if (!str.equals(a.auu.a.c("OwsfCw4ECw=="))) {
            arrayList.add(str);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            for (int i4 = 0; i4 < Build.SUPPORTED_ABIS.length; i4++) {
                arrayList.add(Build.SUPPORTED_ABIS[i4]);
            }
        } else {
            String str2 = Build.CPU_ABI;
            String str3 = Build.CPU_ABI2;
            if (!str2.equals(a.auu.a.c("OwsfCw4ECw=="))) {
                arrayList.add(str2);
            }
            if (!str3.equals(a.auu.a.c("OwsfCw4ECw=="))) {
                arrayList.add(str3);
            }
            if (!((String) arrayList.get(arrayList.size() - 1)).equals(a.auu.a.c("LxcZAAARDA=="))) {
                arrayList.add(a.auu.a.c("LxcZAAARDA=="));
            }
        }
        new StringBuilder(a.auu.a.c("OgQGAgQHRQ8nPRZb")).append(arrayList.toString());
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }
}
