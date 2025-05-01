package net.lingala.zip4j.util;

import com.join.mgps.Util.h0;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;
import net.lingala.zip4j.exception.ZipException;
import w3.o;
/* compiled from: Zip4jUtil.java */
/* loaded from: classes7.dex */
public class h {
    public static boolean A(String str) {
        return str != null && str.trim().length() > 0;
    }

    public static boolean B(String str) throws ZipException {
        if (A(str)) {
            try {
                new String("a".getBytes(), str);
                return true;
            } catch (UnsupportedEncodingException unused) {
                return false;
            } catch (Exception e5) {
                throw new ZipException(e5);
            }
        }
        throw new ZipException("charset is null or empty, cannot check if it is supported");
    }

    public static boolean C() {
        return System.getProperty("os.name").toLowerCase().indexOf("win") >= 0;
    }

    public static long D(long j4) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j4);
        int i4 = calendar.get(1);
        if (i4 < 1980) {
            return 2162688L;
        }
        return (calendar.get(13) >> 1) | ((i4 - 1980) << 25) | ((calendar.get(2) + 1) << 21) | (calendar.get(5) << 16) | (calendar.get(11) << 11) | (calendar.get(12) << 5);
    }

    public static void E(File file) throws ZipException {
    }

    public static void F(File file) throws ZipException {
    }

    public static void G(File file) throws ZipException {
        if (file != null) {
            if (file.exists()) {
                file.setReadOnly();
                return;
            }
            return;
        }
        throw new ZipException("input file is null. cannot set read only file attribute");
    }

    public static void H(File file) throws ZipException {
    }

    public static boolean a(ArrayList arrayList, int i4) throws ZipException {
        if (arrayList != null) {
            if (arrayList.size() <= 0) {
                return true;
            }
            boolean z4 = false;
            if (i4 == 1) {
                for (int i5 = 0; i5 < arrayList.size(); i5++) {
                    if (!(arrayList.get(i5) instanceof File)) {
                        z4 = true;
                        break;
                    }
                }
                return !z4;
            }
            if (i4 == 2) {
                for (int i6 = 0; i6 < arrayList.size(); i6++) {
                    if (!(arrayList.get(i6) instanceof String)) {
                        z4 = true;
                        break;
                    }
                }
            }
            return !z4;
        }
        throw new ZipException("input arraylist is null, cannot check types");
    }

    public static boolean b(File file) throws ZipException {
        if (file != null) {
            return file.exists();
        }
        throw new ZipException("cannot check if file exists: input file is null");
    }

    public static boolean c(String str) throws ZipException {
        if (A(str)) {
            return b(new File(str));
        }
        throw new ZipException("path is null");
    }

    public static boolean d(String str) throws ZipException {
        if (A(str)) {
            if (c(str)) {
                try {
                    return new File(str).canRead();
                } catch (Exception unused) {
                    throw new ZipException("cannot read zip file");
                }
            }
            StringBuffer stringBuffer = new StringBuffer("file does not exist: ");
            stringBuffer.append(str);
            throw new ZipException(stringBuffer.toString());
        }
        throw new ZipException("path is null");
    }

    public static boolean e(String str) throws ZipException {
        if (A(str)) {
            if (c(str)) {
                try {
                    return new File(str).canWrite();
                } catch (Exception unused) {
                    throw new ZipException("cannot read zip file");
                }
            }
            StringBuffer stringBuffer = new StringBuffer("file does not exist: ");
            stringBuffer.append(str);
            throw new ZipException(stringBuffer.toString());
        }
        throw new ZipException("path is null");
    }

    public static boolean f(String str) throws ZipException {
        if (A(str)) {
            File file = new File(str);
            if (file.exists()) {
                if (file.isDirectory()) {
                    if (file.canWrite()) {
                        return true;
                    }
                    throw new ZipException("no write access to output folder");
                }
                throw new ZipException("output folder is not valid");
            }
            try {
                file.mkdirs();
                if (file.isDirectory()) {
                    if (file.canWrite()) {
                        return true;
                    }
                    throw new ZipException("no write access to destination folder");
                }
                throw new ZipException("output folder is not valid");
            } catch (Exception unused) {
                throw new ZipException("Cannot create destination folder");
            }
        }
        throw new ZipException(new NullPointerException("output path is null"));
    }

    public static byte[] g(String str) throws ZipException {
        try {
            String i4 = i(str);
            if (i4.equals(e.B0)) {
                return str.getBytes(e.B0);
            }
            if (i4.equals(e.A0)) {
                return str.getBytes(e.A0);
            }
            return str.getBytes();
        } catch (UnsupportedEncodingException unused) {
            return str.getBytes();
        } catch (Exception e5) {
            throw new ZipException(e5);
        }
    }

    public static String h(byte[] bArr, boolean z4) {
        if (z4) {
            try {
                return new String(bArr, e.A0);
            } catch (UnsupportedEncodingException unused) {
                return new String(bArr);
            }
        }
        return m(bArr);
    }

    public static String i(String str) throws ZipException {
        if (str != null) {
            try {
                return str.equals(new String(str.getBytes(e.B0), e.B0)) ? e.B0 : str.equals(new String(str.getBytes(e.A0), e.A0)) ? e.A0 : e.D0;
            } catch (UnsupportedEncodingException unused) {
                return e.D0;
            } catch (Exception unused2) {
                return e.D0;
            }
        }
        throw new ZipException("input string is null, cannot detect charset");
    }

    public static long j(int i4) {
        int i5 = (i4 & 31) * 2;
        int i6 = (i4 >> 5) & 63;
        int i7 = (i4 >> 11) & 31;
        int i8 = (i4 >> 16) & 31;
        int i9 = ((i4 >> 25) & 127) + 1980;
        Calendar calendar = Calendar.getInstance();
        calendar.set(i9, ((i4 >> 21) & 15) - 1, i8, i7, i6, i5);
        calendar.set(14, 0);
        return calendar.getTime().getTime();
    }

    public static String k(String str) throws ZipException {
        if (A(str)) {
            return new File(str).getAbsolutePath();
        }
        throw new ZipException("filePath is null or empty, cannot get absolute file path");
    }

    public static long[] l() {
        return new long[]{e.f71852a, 134695760, e.f71856c, e.f71858d, e.f71860e, e.f71862f, 134695760, e.f71866h, e.f71868i, 1, 39169};
    }

    public static String m(byte[] bArr) {
        try {
            return new String(bArr, e.B0);
        } catch (UnsupportedEncodingException unused) {
            return new String(bArr);
        }
    }

    public static int n(String str) throws ZipException {
        if (A(str)) {
            return o(str, i(str));
        }
        throw new ZipException("input string is null, cannot calculate encoded String length");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.nio.ByteBuffer] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.nio.ByteBuffer] */
    public static int o(String str, String str2) throws ZipException {
        if (A(str)) {
            if (A(str2)) {
                try {
                    if (str2.equals(e.B0)) {
                        str = ByteBuffer.wrap(str.getBytes(e.B0));
                    } else if (str2.equals(e.A0)) {
                        str = ByteBuffer.wrap(str.getBytes(e.A0));
                    } else {
                        str = ByteBuffer.wrap(str.getBytes(str2));
                    }
                } catch (UnsupportedEncodingException unused) {
                    str = ByteBuffer.wrap(str.getBytes());
                } catch (Exception e5) {
                    throw new ZipException(e5);
                }
                return str.limit();
            }
            throw new ZipException("encoding is not defined, cannot calculate string length");
        }
        throw new ZipException("input string is null, cannot calculate encoded String length");
    }

    public static w3.h p(o oVar, String str) throws ZipException {
        if (oVar != null) {
            if (A(str)) {
                w3.h q4 = q(oVar, str);
                if (q4 == null) {
                    String replaceAll = str.replaceAll("\\\\", e.F0);
                    w3.h q5 = q(oVar, replaceAll);
                    return q5 == null ? q(oVar, replaceAll.replaceAll(e.F0, "\\\\")) : q5;
                }
                return q4;
            }
            StringBuffer stringBuffer = new StringBuffer("file name is null, cannot determine file header for fileName: ");
            stringBuffer.append(str);
            throw new ZipException(stringBuffer.toString());
        }
        StringBuffer stringBuffer2 = new StringBuffer("zip model is null, cannot determine file header for fileName: ");
        stringBuffer2.append(str);
        throw new ZipException(stringBuffer2.toString());
    }

    public static w3.h q(o oVar, String str) throws ZipException {
        if (oVar != null) {
            if (A(str)) {
                if (oVar.b() != null) {
                    if (oVar.b().b() != null) {
                        if (oVar.b().b().size() <= 0) {
                            return null;
                        }
                        ArrayList b5 = oVar.b().b();
                        for (int i4 = 0; i4 < b5.size(); i4++) {
                            w3.h hVar = (w3.h) b5.get(i4);
                            String p4 = hVar.p();
                            if (A(p4) && str.equalsIgnoreCase(p4)) {
                                return hVar;
                            }
                        }
                        return null;
                    }
                    StringBuffer stringBuffer = new StringBuffer("file Headers are null, cannot determine file header with exact match for fileName: ");
                    stringBuffer.append(str);
                    throw new ZipException(stringBuffer.toString());
                }
                StringBuffer stringBuffer2 = new StringBuffer("central directory is null, cannot determine file header with exact match for fileName: ");
                stringBuffer2.append(str);
                throw new ZipException(stringBuffer2.toString());
            }
            StringBuffer stringBuffer3 = new StringBuffer("file name is null, cannot determine file header with exact match for fileName: ");
            stringBuffer3.append(str);
            throw new ZipException(stringBuffer3.toString());
        }
        StringBuffer stringBuffer4 = new StringBuffer("zip model is null, cannot determine file header with exact match for fileName: ");
        stringBuffer4.append(str);
        throw new ZipException(stringBuffer4.toString());
    }

    public static long r(File file) throws ZipException {
        if (file != null) {
            if (file.isDirectory()) {
                return -1L;
            }
            return file.length();
        }
        throw new ZipException("input file is null, cannot calculate file length");
    }

    public static long s(String str) throws ZipException {
        if (A(str)) {
            return r(new File(str));
        }
        throw new ZipException("invalid file name");
    }

    public static String t(File file) throws ZipException {
        if (file != null) {
            if (file.isDirectory()) {
                return null;
            }
            return file.getName();
        }
        throw new ZipException("input file is null, cannot get file name");
    }

    public static ArrayList u(File file, boolean z4) throws ZipException {
        if (file != null) {
            ArrayList arrayList = new ArrayList();
            List asList = Arrays.asList(file.listFiles());
            if (file.canRead()) {
                for (int i4 = 0; i4 < asList.size(); i4++) {
                    File file2 = (File) asList.get(i4);
                    if (file2.isHidden() && !z4) {
                        return arrayList;
                    }
                    arrayList.add(file2);
                    if (file2.isDirectory()) {
                        arrayList.addAll(u(file2, z4));
                    }
                }
                return arrayList;
            }
            return arrayList;
        }
        throw new ZipException("input path is null, cannot read files in the directory");
    }

    public static int v(o oVar, w3.h hVar) throws ZipException {
        if (oVar != null && hVar != null) {
            if (oVar.b() != null) {
                if (oVar.b().b() != null) {
                    if (oVar.b().b().size() <= 0) {
                        return -1;
                    }
                    String p4 = hVar.p();
                    if (A(p4)) {
                        ArrayList b5 = oVar.b().b();
                        for (int i4 = 0; i4 < b5.size(); i4++) {
                            String p5 = ((w3.h) b5.get(i4)).p();
                            if (A(p5) && p4.equalsIgnoreCase(p5)) {
                                return i4;
                            }
                        }
                        return -1;
                    }
                    throw new ZipException("file name in file header is empty or null, cannot determine index of file header");
                }
                throw new ZipException("file Headers are null, cannot determine index of file header");
            }
            throw new ZipException("central directory is null, ccannot determine index of file header");
        }
        throw new ZipException("input parameters is null, cannot determine index of file header");
    }

    public static long w(File file, TimeZone timeZone) throws ZipException {
        if (file != null) {
            if (file.exists()) {
                return file.lastModified();
            }
            throw new ZipException("input file does not exist, cannot read last modified file time");
        }
        throw new ZipException("input file is null, cannot read last modified file time");
    }

    public static String x(String str, String str2, String str3) throws ZipException {
        String t4;
        if (A(str)) {
            if (A(str3)) {
                String path = new File(str3).getPath();
                String str4 = e.E0;
                if (!path.endsWith(str4)) {
                    StringBuffer stringBuffer = new StringBuffer(path);
                    stringBuffer.append(str4);
                    path = stringBuffer.toString();
                }
                String substring = str.substring(path.length());
                if (substring.startsWith(System.getProperty("file.separator"))) {
                    substring = substring.substring(1);
                }
                File file = new File(str);
                if (file.isDirectory()) {
                    StringBuffer stringBuffer2 = new StringBuffer(String.valueOf(substring.replaceAll("\\\\", e.F0)));
                    stringBuffer2.append(e.F0);
                    t4 = stringBuffer2.toString();
                } else {
                    StringBuffer stringBuffer3 = new StringBuffer(String.valueOf(substring.substring(0, substring.lastIndexOf(file.getName())).replaceAll("\\\\", e.F0)));
                    stringBuffer3.append(file.getName());
                    t4 = stringBuffer3.toString();
                }
            } else {
                File file2 = new File(str);
                if (file2.isDirectory()) {
                    StringBuffer stringBuffer4 = new StringBuffer(String.valueOf(file2.getName()));
                    stringBuffer4.append(e.F0);
                    t4 = stringBuffer4.toString();
                } else {
                    t4 = t(new File(str));
                }
            }
            if (A(str2)) {
                StringBuffer stringBuffer5 = new StringBuffer(String.valueOf(str2));
                stringBuffer5.append(t4);
                t4 = stringBuffer5.toString();
            }
            if (A(t4)) {
                return t4;
            }
            throw new ZipException("Error determining file name");
        }
        throw new ZipException("input file path/name is empty, cannot calculate relative file name");
    }

    public static ArrayList y(o oVar) throws ZipException {
        if (oVar != null) {
            if (oVar.e() == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            String l4 = oVar.l();
            String name = new File(l4).getName();
            if (A(l4)) {
                if (!oVar.n()) {
                    arrayList.add(l4);
                    return arrayList;
                }
                int d5 = oVar.e().d();
                if (d5 == 0) {
                    arrayList.add(l4);
                    return arrayList;
                }
                int i4 = 0;
                while (i4 <= d5) {
                    if (i4 == d5) {
                        arrayList.add(oVar.l());
                    } else {
                        String str = i4 > 9 ? ".z" : ".z0";
                        StringBuffer stringBuffer = new StringBuffer(String.valueOf(name.indexOf(h0.f27805a) >= 0 ? l4.substring(0, l4.lastIndexOf(h0.f27805a)) : l4));
                        stringBuffer.append(str);
                        stringBuffer.append(i4 + 1);
                        arrayList.add(stringBuffer.toString());
                    }
                    i4++;
                }
                return arrayList;
            }
            throw new ZipException("cannot get split zip files: zipfile is null");
        }
        throw new ZipException("cannot get split zip files: zipmodel is null");
    }

    public static String z(String str) throws ZipException {
        if (A(str)) {
            if (str.indexOf(System.getProperty("file.separator")) >= 0) {
                str = str.substring(str.lastIndexOf(System.getProperty("file.separator")));
            }
            return str.indexOf(h0.f27805a) > 0 ? str.substring(0, str.lastIndexOf(h0.f27805a)) : str;
        }
        throw new ZipException("zip file name is empty or null, cannot determine zip file name");
    }
}
