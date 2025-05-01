package m1;

import com.huaksj.vasdolly.common.apk.SignatureNotFoundException;
import com.huaksj.vasdolly.common.d;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Map;
/* compiled from: IdValueReader.java */
/* loaded from: classes3.dex */
public class b {
    public static Map<Integer, ByteBuffer> a(File file) {
        if (file != null && file.exists() && file.isFile()) {
            try {
                return d.e(d.g(file));
            } catch (SignatureNotFoundException unused) {
                PrintStream printStream = System.out;
                printStream.println("APK : " + file.getAbsolutePath() + " not have apk signature block");
            } catch (IOException e5) {
                e5.printStackTrace();
            }
        }
        return null;
    }

    public static ByteBuffer b(File file, int i4) {
        if (file != null && file.exists() && file.isFile()) {
            Map<Integer, ByteBuffer> a5 = a(file);
            PrintStream printStream = System.out;
            printStream.println("getByteBufferValueById , destApk " + file.getAbsolutePath() + " IdValueMap = " + a5);
            if (a5 != null) {
                return a5.get(Integer.valueOf(i4));
            }
        }
        return null;
    }

    public static byte[] c(File file, int i4) {
        if (file != null && file.exists() && file.isFile()) {
            ByteBuffer b5 = b(file, i4);
            PrintStream printStream = System.out;
            printStream.println("getByteValueById , id = " + i4 + " , value = " + b5);
            if (b5 != null) {
                return Arrays.copyOfRange(b5.array(), b5.arrayOffset() + b5.position(), b5.arrayOffset() + b5.limit());
            }
        }
        return null;
    }

    public static String d(File file, int i4) {
        byte[] c5;
        if (file != null && file.exists() && file.isFile() && (c5 = c(file, i4)) != null) {
            try {
                if (c5.length > 0) {
                    return new String(c5, "UTF-8").trim();
                }
            } catch (UnsupportedEncodingException e5) {
                e5.printStackTrace();
            }
        }
        return "";
    }
}
