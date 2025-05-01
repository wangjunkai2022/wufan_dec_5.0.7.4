package g2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
/* compiled from: FileUtil.java */
/* loaded from: classes5.dex */
public class a {
    public static String a(String str) {
        String str2 = "";
        BufferedReader bufferedReader = null;
        try {
            try {
                try {
                } catch (IOException e5) {
                    e = e5;
                }
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e6) {
            e6.printStackTrace();
        }
        if (new File(str).exists()) {
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new FileInputStream(str), "UTF-8"));
            while (true) {
                try {
                    String readLine = bufferedReader2.readLine();
                    if (readLine == null) {
                        break;
                    }
                    str2 = str2 + readLine;
                } catch (IOException e7) {
                    e = e7;
                    bufferedReader = bufferedReader2;
                    e.printStackTrace();
                    if (bufferedReader != null) {
                        bufferedReader.close();
                    }
                    return str2;
                } catch (Throwable th2) {
                    th = th2;
                    bufferedReader = bufferedReader2;
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e8) {
                            e8.printStackTrace();
                        }
                    }
                    throw th;
                }
            }
            bufferedReader2.close();
            bufferedReader2.close();
            return str2;
        }
        return "";
    }
}
