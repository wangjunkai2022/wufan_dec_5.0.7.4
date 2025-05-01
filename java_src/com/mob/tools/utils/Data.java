package com.mob.tools.utils;

import android.text.TextUtils;
import android.util.Base64;
import com.mob.commons.l;
import com.mob.commons.v;
import com.mob.tools.MobLog;
import com.mob.tools.proguard.PublicMemberKeeper;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Security;
import java.util.zip.CRC32;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.spec.SecretKeySpec;
/* loaded from: classes5.dex */
public class Data implements PublicMemberKeeper {
    public static String AES128Decode(String str, byte[] bArr) throws Throwable {
        if (str == null || bArr == null) {
            return null;
        }
        return new String(AES128Decode(str.getBytes("UTF-8"), bArr), "UTF-8").trim();
    }

    public static byte[] AES128Encode(String str, String str2) throws Throwable {
        if (str == null || str2 == null) {
            return null;
        }
        byte[] bytes = str.getBytes("UTF-8");
        byte[] bArr = new byte[16];
        System.arraycopy(bytes, 0, bArr, 0, Math.min(bytes.length, 16));
        return AES128Encode(bArr, str2);
    }

    public static String AES128PaddingDecode(byte[] bArr, byte[] bArr2) throws Throwable {
        if (bArr == null || bArr2 == null) {
            return null;
        }
        byte[] bArr3 = new byte[16];
        System.arraycopy(bArr, 0, bArr3, 0, Math.min(bArr.length, 16));
        return new String(paddingDecode(bArr3, bArr2), "UTF-8").trim();
    }

    public static String Base64AES(String str, String str2) {
        try {
            String encodeToString = Base64.encodeToString(AES128Encode(str2, str), 0);
            return encodeToString.contains("\n") ? encodeToString.replace("\n", "") : encodeToString;
        } catch (Throwable th) {
            MobLog.getInstance().w(th);
            return null;
        }
    }

    public static String CRC32(byte[] bArr) throws Throwable {
        CRC32 crc32 = new CRC32();
        crc32.update(bArr);
        long value = crc32.getValue();
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%02x", Integer.valueOf(((byte) (value >>> 56)) & 255)));
        sb.append(String.format("%02x", Integer.valueOf(((byte) (value >>> 48)) & 255)));
        sb.append(String.format("%02x", Integer.valueOf(((byte) (value >>> 40)) & 255)));
        sb.append(String.format("%02x", Integer.valueOf(((byte) (value >>> 32)) & 255)));
        sb.append(String.format("%02x", Integer.valueOf(((byte) (value >>> 24)) & 255)));
        sb.append(String.format("%02x", Integer.valueOf(((byte) (value >>> 16)) & 255)));
        sb.append(String.format("%02x", Integer.valueOf(((byte) (value >>> 8)) & 255)));
        sb.append(String.format("%02x", Integer.valueOf(((byte) value) & 255)));
        while (sb.charAt(0) == '0') {
            sb = sb.deleteCharAt(0);
        }
        return sb.toString().toLowerCase();
    }

    public static byte[] EncodeNoPadding(String str, String str2) throws Throwable {
        if (str == null || str2 == null) {
            return null;
        }
        byte[] bytes = str.getBytes("UTF-8");
        byte[] bArr = new byte[16];
        System.arraycopy(bytes, 0, bArr, 0, Math.min(bytes.length, 16));
        int length = 16 - (str2.length() % 16);
        StringBuilder sb = new StringBuilder(str2);
        for (int i4 = 0; i4 < length; i4++) {
            sb.append(" ");
        }
        byte[] bytes2 = sb.toString().getBytes("UTF-8");
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, l.a("003Ohfikgn"));
        Cipher cipher = getCipher(l.a("003Fhfikgn") + l.a("003n!ikgf") + l.a("005BhlQn?gifmin") + l.a("006fQfefefk>gRgl"), l.a("0022hlgf"));
        cipher.init(1, secretKeySpec);
        return cipher.doFinal(bytes2);
    }

    public static String MD5(String str) {
        byte[] rawMD5;
        if (str == null || (rawMD5 = rawMD5(str)) == null) {
            return null;
        }
        return bytesToHexFaster(rawMD5);
    }

    public static byte[] SHA1(String str) throws Throwable {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return SHA1(str.getBytes("utf-8"));
    }

    public static String byteToHex(byte[] bArr) {
        return byteToHex(bArr, 0, bArr.length);
    }

    public static String bytesToHexFaster(byte[] bArr) {
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        char[] cArr2 = new char[bArr.length * 2];
        int i4 = 0;
        for (byte b5 : bArr) {
            cArr2[i4] = cArr[(b5 >>> 4) & 15];
            int i5 = i4 + 1;
            cArr2[i5] = cArr[b5 & 15];
            i4 = i5 + 1;
        }
        return new String(cArr2);
    }

    public static Cipher getCipher(String str, String str2) throws Throwable {
        Cipher cipher = null;
        if (!TextUtils.isEmpty(str2)) {
            try {
                Provider provider = Security.getProvider(str2);
                if (provider != null) {
                    cipher = Cipher.getInstance(str, provider);
                }
            } catch (Throwable unused) {
            }
        }
        return cipher == null ? Cipher.getInstance(str, str2) : cipher;
    }

    public static byte[] paddingDecode(byte[] bArr, byte[] bArr2) throws Throwable {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, l.a("0031hfikgn"));
        Cipher cipher = getCipher(l.a("003?hfikgn") + l.a("003nLikgf") + l.a("008,hl0nJinkegfgnkmin") + l.a("006fHfefefk]gDgl"), l.a("002Qhlgf"));
        cipher.init(2, secretKeySpec);
        return cipher.doFinal(bArr2);
    }

    public static byte[] rawMD5(String str) {
        if (str == null) {
            return null;
        }
        try {
            return rawMD5(str.getBytes("utf-8"));
        } catch (Throwable th) {
            MobLog.getInstance().w(th);
            return null;
        }
    }

    public static String urlEncode(String str) {
        try {
            return urlEncode(str, "utf-8");
        } catch (Throwable th) {
            MobLog.getInstance().w(th);
            return null;
        }
    }

    public static String byteToHex(byte[] bArr, int i4, int i5) {
        StringBuffer stringBuffer = new StringBuffer();
        if (bArr == null) {
            return stringBuffer.toString();
        }
        while (i4 < i5) {
            stringBuffer.append(String.format("%02x", Byte.valueOf(bArr[i4])));
            i4++;
        }
        return stringBuffer.toString();
    }

    public static String MD5(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return MD5(bArr, 0, bArr.length);
    }

    public static byte[] rawMD5(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return rawMD5(bArr, 0, bArr.length);
    }

    public static String urlEncode(String str, String str2) throws Throwable {
        String encode = TextUtils.isEmpty(str) ? "" : URLEncoder.encode(str, str2);
        return TextUtils.isEmpty(encode) ? encode : encode.replace("+", "%20");
    }

    public static byte[] AES128Decode(byte[] bArr, byte[] bArr2) throws Throwable {
        if (bArr == null || bArr2 == null) {
            return null;
        }
        byte[] bArr3 = new byte[16];
        System.arraycopy(bArr, 0, bArr3, 0, Math.min(bArr.length, 16));
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr3, l.a("003'hfikgn"));
        Cipher cipher = getCipher(l.a("0032hfikgn") + l.a("003n_ikgf") + l.a("005-hl?n$gifmin") + l.a("006f fefefkSg_gl"), l.a("002_hlgf"));
        cipher.init(2, secretKeySpec);
        byte[] bArr4 = new byte[cipher.getOutputSize(bArr2.length)];
        cipher.doFinal(bArr4, cipher.update(bArr2, 0, bArr2.length, bArr4, 0));
        return bArr4;
    }

    public static byte[] AES128Encode(byte[] bArr, String str) throws Throwable {
        if (bArr == null || str == null) {
            return null;
        }
        return AES128Encode(bArr, str.getBytes("UTF-8"));
    }

    public static String MD5(byte[] bArr, int i4, int i5) {
        byte[] rawMD5;
        if (bArr == null || (rawMD5 = rawMD5(bArr, i4, i5)) == null) {
            return null;
        }
        return bytesToHexFaster(rawMD5);
    }

    public static byte[] SHA1(byte[] bArr) throws Throwable {
        MessageDigest messageDigest = MessageDigest.getInstance(l.a("005-gnhmhfjmjh"));
        messageDigest.update(bArr);
        return messageDigest.digest();
    }

    public static byte[] rawMD5(byte[] bArr, int i4, int i5) {
        ByteArrayInputStream byteArrayInputStream;
        byte[] bArr2 = null;
        if (bArr == null) {
            return null;
        }
        try {
            byteArrayInputStream = new ByteArrayInputStream(bArr, i4, i5);
            try {
                bArr2 = rawMD5(byteArrayInputStream);
                v.a(byteArrayInputStream);
            } catch (Throwable th) {
                th = th;
                try {
                    MobLog.getInstance().w(th);
                    v.a(byteArrayInputStream);
                    return bArr2;
                } catch (Throwable th2) {
                    v.a(byteArrayInputStream);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            byteArrayInputStream = null;
        }
        return bArr2;
    }

    public static byte[] AES128Encode(byte[] bArr, byte[] bArr2) throws Throwable {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, l.a("003[hfikgn"));
        Cipher cipher = getCipher(l.a("003Khfikgn") + l.a("003nHikgf") + l.a("008=hlLnYinkegfgnkmin") + l.a("006f1fefefk<g8gl"), l.a("002Rhlgf"));
        cipher.init(1, secretKeySpec);
        byte[] bArr3 = new byte[cipher.getOutputSize(bArr2.length)];
        cipher.doFinal(bArr3, cipher.update(bArr2, 0, bArr2.length, bArr3, 0));
        return bArr3;
    }

    public static String MD5(File file) {
        FileInputStream fileInputStream;
        if (file == null || !file.exists()) {
            return null;
        }
        try {
            fileInputStream = new FileInputStream(file);
            try {
                byte[] rawMD5 = rawMD5(fileInputStream);
                v.a(fileInputStream);
                if (rawMD5 == null) {
                    return null;
                }
                return bytesToHexFaster(rawMD5);
            } catch (Throwable th) {
                th = th;
                try {
                    MobLog.getInstance().w(th);
                    v.a(fileInputStream);
                    return null;
                } catch (Throwable th2) {
                    v.a(fileInputStream);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            fileInputStream = null;
        }
    }

    public static byte[] rawMD5(InputStream inputStream) {
        if (inputStream == null) {
            return null;
        }
        try {
            byte[] bArr = new byte[1024];
            MessageDigest messageDigest = MessageDigest.getInstance(l.a("003$jehnjk"));
            int read = inputStream.read(bArr);
            while (read != -1) {
                messageDigest.update(bArr, 0, read);
                read = inputStream.read(bArr);
            }
            return messageDigest.digest();
        } catch (Throwable th) {
            MobLog.getInstance().w(th);
            return null;
        }
    }

    public static void AES128Decode(String str, InputStream inputStream, OutputStream outputStream) throws Throwable {
        if (str == null) {
            return;
        }
        AES128Decode(str.getBytes("UTF-8"), inputStream, outputStream);
    }

    public static void AES128Decode(byte[] bArr, InputStream inputStream, OutputStream outputStream) throws Throwable {
        CipherInputStream cipherInputStream;
        Throwable th;
        if (bArr == null || inputStream == null || outputStream == null) {
            return;
        }
        byte[] bArr2 = new byte[16];
        System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, 16));
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, l.a("003>hfikgn"));
        Cipher cipher = getCipher(l.a("003^hfikgn") + l.a("003n>ikgf") + l.a("008*hl+n)inkegfgnkmin") + l.a("006fFfefefk]gTgl"), l.a("002Bhlgf"));
        cipher.init(2, secretKeySpec);
        try {
            cipherInputStream = new CipherInputStream(inputStream, cipher);
            try {
                byte[] bArr3 = new byte[1024];
                for (int read = cipherInputStream.read(bArr3); read != -1; read = cipherInputStream.read(bArr3)) {
                    outputStream.write(bArr3, 0, read);
                }
                outputStream.flush();
                v.a(cipherInputStream);
            } catch (Throwable th2) {
                th = th2;
                v.a(cipherInputStream);
                throw th;
            }
        } catch (Throwable th3) {
            cipherInputStream = null;
            th = th3;
        }
    }
}
