package l1;

import android.text.TextUtils;
import com.huaksj.vasdolly.common.apk.SignatureNotFoundException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ChannelWriterUtil.java */
/* loaded from: classes3.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private static final String f71472a = "V1";

    /* renamed from: b  reason: collision with root package name */
    private static final String f71473b = "V2";

    /* renamed from: c  reason: collision with root package name */
    private static final String f71474c = "V1_V2";

    /* renamed from: d  reason: collision with root package name */
    public static final int f71475d = 0;

    /* renamed from: e  reason: collision with root package name */
    public static final int f71476e = 1;

    /* renamed from: f  reason: collision with root package name */
    public static final int f71477f = 2;

    /* renamed from: g  reason: collision with root package name */
    public static final int f71478g = 3;

    private static void a(File file, File file2) {
        try {
            Runtime.getRuntime().exec("cp " + file.getAbsolutePath() + " " + file2.getAbsolutePath());
        } catch (IOException e5) {
            e5.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(java.io.File r18, java.io.File r19) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l1.b.b(java.io.File, java.io.File):void");
    }

    public static void c(File file, File file2) throws IOException {
        FileOutputStream fileOutputStream;
        File parentFile = file2.getParentFile();
        if (parentFile != null && !parentFile.exists()) {
            parentFile.mkdirs();
        }
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                fileOutputStream = new FileOutputStream(file2, false);
                try {
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int read = fileInputStream2.read(bArr);
                        if (read > 0) {
                            fileOutputStream.write(bArr, 0, read);
                        } else {
                            fileInputStream2.close();
                            fileOutputStream.close();
                            return;
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = null;
            }
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
        }
    }

    private static void d(File file, String str, Map<String, String> map) throws SignatureNotFoundException, IOException {
        String name = file.getName();
        long currentTimeMillis = System.currentTimeMillis();
        PrintStream printStream = System.out;
        printStream.println("------ File " + name + " generate channel apk  , begin ------");
        com.huaksj.vasdolly.common.a g4 = n1.b.g(file, false);
        PrintStream printStream2 = System.out;
        printStream2.println("generatedChannelApk , channel = " + map + " , apkChannelName = " + file.getName());
        n1.a.c(g4, file, g(file, str, map));
        g4.d();
        PrintStream printStream3 = System.out;
        printStream3.println("------ File " + name + " generate channel apk , end ------");
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        PrintStream printStream4 = System.out;
        printStream4.println("------ total " + map.size() + " channel apk , cost : " + currentTimeMillis2 + " ------");
    }

    private static void e(File file, String str, Map<String, String> map) {
        if (!m1.a.a(file)) {
            PrintStream printStream = System.out;
            printStream.println("File " + file.getName() + " not signed by v1 , please check your signingConfig , if not have v1 signature , you can't install Apk below 7.0");
            return;
        }
        String name = file.getName();
        String d5 = m1.a.d(file);
        if (!TextUtils.isEmpty(d5)) {
            PrintStream printStream2 = System.out;
            printStream2.println("baseApk : " + file.getAbsolutePath() + " has a channel : " + d5 + ", only ignore");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        PrintStream printStream3 = System.out;
        printStream3.println("------ File " + name + " generate v1 channel apk  , begin ------");
        try {
            n1.a.b(file, g(file, str, map));
        } catch (Exception e5) {
            System.out.println("generateV1ChannelApk error , please check it and fix it ，and that you should generate all V1 Channel Apk again!");
            e5.printStackTrace();
        }
        PrintStream printStream4 = System.out;
        printStream4.println("------ File " + name + " generate v1 channel apk , end ------");
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        PrintStream printStream5 = System.out;
        printStream5.println("------ total " + map.size() + " channel apk , cost : " + currentTimeMillis2 + " ------");
    }

    public static String f(String str, String str2) {
        if (str.contains("base")) {
            return str.replace("base", str2);
        }
        return str2 + "-" + str;
    }

    private static String g(File file, String str, Map<String, String> map) {
        HashMap hashMap = new HashMap();
        Map<String, String> g4 = a.g(file);
        if (g4 != null) {
            hashMap.putAll(g4);
        }
        if (map != null) {
            map.remove(m1.a.f71513a);
            hashMap.putAll(map);
        }
        if (str != null && str.length() > 0) {
            hashMap.put(m1.a.f71513a, str);
        }
        return new JSONObject(hashMap).toString();
    }

    private static File h(File file, String str, String str2) {
        return file.getAbsolutePath().endsWith(".apk") ? file : new File(file, f(str, str2));
    }

    private static int i(File file) throws Exception {
        return 0;
    }

    public static String j(File file) {
        String e5 = m1.a.e(file);
        return e5 == null ? m1.a.d(file) : e5;
    }

    public static List<String> k(File file) {
        ArrayList arrayList = new ArrayList();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    String[] split = readLine.split("#");
                    if (split != null && split.length > 0 && split[0] != null && split[0].trim().length() > 0) {
                        arrayList.add(split[0].trim());
                    } else {
                        PrintStream printStream = System.out;
                        printStream.println("skip invalid channel line : " + readLine);
                    }
                } else {
                    bufferedReader.close();
                    return arrayList;
                }
            }
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    public static boolean l(File file) {
        try {
            n1.a.g(file, true);
            return true;
        } catch (Exception e5) {
            try {
                e5.printStackTrace();
                try {
                    n1.a.f(file);
                    return true;
                } catch (Exception e6) {
                    e6.printStackTrace();
                    return false;
                }
            } catch (Exception e7) {
                System.out.println(e7.getMessage());
                e7.printStackTrace();
                return false;
            }
        }
    }

    public static void m(File file, String str, Map<String, String> map) {
        if (map.isEmpty()) {
            System.out.println("channel list is empty , please set channel list");
            return;
        }
        try {
            d(file, str, map);
        } catch (Exception e5) {
            System.out.println(e5.getMessage());
            e5.printStackTrace();
            try {
                e(file, str, map);
            } catch (Exception e6) {
                e6.printStackTrace();
            }
        }
    }
}
