package com.huaksj.vasdolly.common;

import com.huaksj.vasdolly.common.apk.SignatureNotFoundException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.Enumeration;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
/* loaded from: classes3.dex */
public class V1SchemeUtil {

    /* loaded from: classes3.dex */
    public static class ChannelExistException extends Exception {
        static final long serialVersionUID = -3387516993124229949L;

        public ChannelExistException() {
        }

        public ChannelExistException(String str) {
            super(str);
        }
    }

    public static boolean a(File file) throws IOException {
        RandomAccessFile randomAccessFile = null;
        try {
            RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "r");
            try {
                long length = randomAccessFile2.length();
                byte[] bArr = b.f14490d;
                byte[] bArr2 = new byte[bArr.length];
                randomAccessFile2.seek(length - bArr.length);
                randomAccessFile2.readFully(bArr2);
                boolean e5 = e(bArr2);
                randomAccessFile2.close();
                return e5;
            } catch (Throwable th) {
                th = th;
                randomAccessFile = randomAccessFile2;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static boolean b(File file) {
        try {
            JarFile jarFile = new JarFile(file);
            JarEntry jarEntry = jarFile.getJarEntry("META-INF/MANIFEST.MF");
            JarEntry jarEntry2 = null;
            Enumeration<JarEntry> entries = jarFile.entries();
            while (true) {
                if (!entries.hasMoreElements()) {
                    break;
                }
                JarEntry nextElement = entries.nextElement();
                if (nextElement.getName().matches("META-INF/\\w+\\.SF")) {
                    jarEntry2 = jarFile.getJarEntry(nextElement.getName());
                    break;
                }
            }
            jarFile.close();
            if (jarEntry == null || jarEntry2 == null) {
                jarFile.close();
                return false;
            }
            jarFile.close();
            return true;
        } catch (IOException e5) {
            e5.printStackTrace();
            return false;
        }
    }

    public static void c(File file, File file2) throws IOException {
        FileChannel fileChannel;
        FileChannel channel;
        if (!file2.exists()) {
            file2.createNewFile();
        }
        FileChannel fileChannel2 = null;
        try {
            channel = new FileInputStream(file).getChannel();
        } catch (Throwable th) {
            th = th;
            fileChannel = null;
        }
        try {
            fileChannel2 = new FileOutputStream(file2).getChannel();
            fileChannel2.transferFrom(channel, 0L, channel.size());
            channel.close();
            fileChannel2.close();
        } catch (Throwable th2) {
            th = th2;
            FileChannel fileChannel3 = fileChannel2;
            fileChannel2 = channel;
            fileChannel = fileChannel3;
            if (fileChannel2 != null) {
                fileChannel2.close();
            }
            if (fileChannel != null) {
                fileChannel.close();
            }
            throw th;
        }
    }

    public static c<ByteBuffer, Long> d(File file) throws IOException, SignatureNotFoundException {
        RandomAccessFile randomAccessFile = null;
        if (file == null || !file.exists() || !file.isFile()) {
            return null;
        }
        try {
            RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "r");
            try {
                c<ByteBuffer, Long> g4 = com.huaksj.vasdolly.common.apk.a.g(randomAccessFile2);
                if (!com.huaksj.vasdolly.common.apk.c.i(randomAccessFile2, g4.c().longValue())) {
                    randomAccessFile2.close();
                    return g4;
                }
                throw new SignatureNotFoundException("ZIP64 APK not supported");
            } catch (Throwable th) {
                th = th;
                randomAccessFile = randomAccessFile2;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static boolean e(byte[] bArr) {
        if (bArr.length != b.f14490d.length) {
            return false;
        }
        int i4 = 0;
        while (true) {
            byte[] bArr2 = b.f14490d;
            if (i4 >= bArr2.length) {
                return true;
            }
            if (bArr[i4] != bArr2[i4]) {
                return false;
            }
            i4++;
        }
    }

    public static String f(File file) throws Exception {
        RandomAccessFile randomAccessFile = null;
        try {
            RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "r");
            try {
                long length = randomAccessFile2.length();
                byte[] bArr = b.f14490d;
                byte[] bArr2 = new byte[bArr.length];
                long length2 = length - bArr.length;
                randomAccessFile2.seek(length2);
                randomAccessFile2.readFully(bArr2);
                if (e(bArr2)) {
                    long j4 = length2 - 2;
                    randomAccessFile2.seek(j4);
                    int g4 = g(randomAccessFile2);
                    if (g4 > 0) {
                        randomAccessFile2.seek(j4 - g4);
                        byte[] bArr3 = new byte[g4];
                        randomAccessFile2.readFully(bArr3);
                        String trim = new String(bArr3, "UTF-8").trim();
                        randomAccessFile2.close();
                        return trim;
                    }
                    throw new Exception("zip channel info not found");
                }
                throw new Exception("zip v1 magic not found");
            } catch (Throwable th) {
                th = th;
                randomAccessFile = randomAccessFile2;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static short g(DataInput dataInput) throws IOException {
        byte[] bArr = new byte[2];
        dataInput.readFully(bArr);
        return ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).getShort(0);
    }

    public static void h(File file) throws Exception {
        if (file != null && file.exists() && file.isFile()) {
            RandomAccessFile randomAccessFile = null;
            c<ByteBuffer, Long> d5 = d(file);
            if (d5.b().remaining() == 22) {
                PrintStream printStream = System.out;
                printStream.println("file : " + file.getName() + " , has no comment");
                return;
            }
            PrintStream printStream2 = System.out;
            printStream2.println("file : " + file.getName() + " , has comment");
            int e5 = com.huaksj.vasdolly.common.apk.c.e(d5.b(), 20);
            try {
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, net.lingala.zip4j.util.e.f71861e0);
                try {
                    randomAccessFile2.seek((d5.c().longValue() + 22) - 2);
                    j(0, randomAccessFile2);
                    randomAccessFile2.setLength(file.length() - e5);
                    PrintStream printStream3 = System.out;
                    printStream3.println("file : " + file.getName() + " , remove comment success");
                    randomAccessFile2.close();
                } catch (Throwable th) {
                    th = th;
                    randomAccessFile = randomAccessFile2;
                    if (randomAccessFile != null) {
                        randomAccessFile.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            throw new Exception("param error , file : " + file);
        }
    }

    public static void i(File file, String str) throws Exception {
        if (file != null && file.exists() && file.isFile() && str != null && !str.isEmpty()) {
            RandomAccessFile randomAccessFile = null;
            byte[] bytes = str.getBytes("UTF-8");
            c<ByteBuffer, Long> d5 = d(file);
            if (d5.b().remaining() == 22) {
                PrintStream printStream = System.out;
                printStream.println("file : " + file.getAbsolutePath() + " , has no comment");
                try {
                    RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, net.lingala.zip4j.util.e.f71861e0);
                    try {
                        randomAccessFile2.seek(file.length() - 2);
                        byte[] bArr = b.f14490d;
                        j(bytes.length + 2 + bArr.length, randomAccessFile2);
                        randomAccessFile2.write(bytes);
                        j(bytes.length, randomAccessFile2);
                        randomAccessFile2.write(bArr);
                        randomAccessFile2.close();
                    } catch (Throwable th) {
                        th = th;
                        randomAccessFile = randomAccessFile2;
                        if (randomAccessFile != null) {
                            randomAccessFile.close();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } else {
                PrintStream printStream2 = System.out;
                printStream2.println("file : " + file.getAbsolutePath() + " , has comment");
                if (a(file)) {
                    try {
                        String f5 = f(file);
                        if (f5 != null) {
                            file.delete();
                            throw new ChannelExistException("file : " + file.getAbsolutePath() + " has a channel : " + f5 + ", only ignore");
                        }
                    } catch (Exception e5) {
                        e5.printStackTrace();
                    }
                }
                int e6 = com.huaksj.vasdolly.common.apk.c.e(d5.b(), 20);
                byte[] bArr2 = b.f14490d;
                int length = bytes.length + e6 + 2 + bArr2.length;
                try {
                    RandomAccessFile randomAccessFile3 = new RandomAccessFile(file, net.lingala.zip4j.util.e.f71861e0);
                    try {
                        randomAccessFile3.seek((d5.c().longValue() + 22) - 2);
                        j(length, randomAccessFile3);
                        randomAccessFile3.seek(d5.c().longValue() + 22 + e6);
                        randomAccessFile3.write(bytes);
                        j(bytes.length, randomAccessFile3);
                        randomAccessFile3.write(bArr2);
                        randomAccessFile3.close();
                    } catch (Throwable th3) {
                        th = th3;
                        randomAccessFile = randomAccessFile3;
                        if (randomAccessFile != null) {
                            randomAccessFile.close();
                        }
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        } else {
            throw new Exception("param error , file : " + file + " , channel : " + str);
        }
    }

    private static void j(int i4, DataOutput dataOutput) throws IOException {
        ByteBuffer order = ByteBuffer.allocate(2).order(ByteOrder.LITTLE_ENDIAN);
        order.putShort((short) i4);
        dataOutput.write(order.array());
    }
}
