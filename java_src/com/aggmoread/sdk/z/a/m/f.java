package com.aggmoread.sdk.z.a.m;

import android.content.Context;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
/* loaded from: classes2.dex */
public class f implements k {

    /* renamed from: b  reason: collision with root package name */
    static final String f2314b = "f";

    /* renamed from: c  reason: collision with root package name */
    static k f2315c;

    /* renamed from: a  reason: collision with root package name */
    private b f2316a;

    /* loaded from: classes2.dex */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        private final AtomicLong f2317a;

        /* renamed from: b  reason: collision with root package name */
        private final AtomicInteger f2318b;

        /* renamed from: c  reason: collision with root package name */
        private final long f2319c;

        /* renamed from: d  reason: collision with root package name */
        private final int f2320d;

        /* renamed from: e  reason: collision with root package name */
        private final Map<File, Long> f2321e;

        /* renamed from: f  reason: collision with root package name */
        protected File f2322f;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes2.dex */
        public class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                File[] listFiles = b.this.f2322f.listFiles();
                if (listFiles != null) {
                    int i4 = 0;
                    int i5 = 0;
                    for (File file : listFiles) {
                        i4 = (int) (i4 + b.this.a(file));
                        i5++;
                        b.this.f2321e.put(file, Long.valueOf(file.lastModified()));
                    }
                    b.this.f2317a.set(i4);
                    b.this.f2318b.set(i5);
                }
            }
        }

        private b(f fVar, File file, long j4, int i4) {
            this.f2321e = Collections.synchronizedMap(new HashMap());
            this.f2322f = file;
            this.f2319c = j4;
            this.f2320d = i4;
            this.f2317a = new AtomicLong();
            this.f2318b = new AtomicInteger();
            a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long a(File file) {
            return file.length();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public File a(String str) {
            File b5 = b(str);
            Long valueOf = Long.valueOf(System.currentTimeMillis());
            b5.setLastModified(valueOf.longValue());
            this.f2321e.put(b5, valueOf);
            return b5;
        }

        private void a() {
            new Thread(new a()).start();
        }

        private long b() {
            File file;
            if (this.f2321e.isEmpty()) {
                return 0L;
            }
            Set<Map.Entry<File, Long>> entrySet = this.f2321e.entrySet();
            synchronized (this.f2321e) {
                file = null;
                Long l4 = null;
                for (Map.Entry<File, Long> entry : entrySet) {
                    if (file == null) {
                        file = entry.getKey();
                        l4 = entry.getValue();
                    } else {
                        Long value = entry.getValue();
                        if (value.longValue() < l4.longValue()) {
                            file = entry.getKey();
                            l4 = value;
                        }
                    }
                }
            }
            long a5 = a(file);
            if (file.delete()) {
                this.f2321e.remove(file);
            }
            return a5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public File b(String str) {
            File file = this.f2322f;
            return new File(file, str + "_" + str.hashCode() + "");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(File file) {
            int i4 = this.f2318b.get();
            while (i4 + 1 > this.f2320d) {
                this.f2317a.addAndGet(-b());
                i4 = this.f2318b.addAndGet(-1);
            }
            this.f2318b.addAndGet(1);
            long a5 = a(file);
            long j4 = this.f2317a.get();
            while (j4 + a5 > this.f2319c) {
                j4 = this.f2317a.addAndGet(-b());
            }
            this.f2317a.addAndGet(a5);
            Long valueOf = Long.valueOf(System.currentTimeMillis());
            file.setLastModified(valueOf.longValue());
            this.f2321e.put(file, valueOf);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean c(String str) {
            return a(str).delete();
        }
    }

    /* loaded from: classes2.dex */
    private static class c {
        private static int a(byte[] bArr, char c5) {
            for (int i4 = 0; i4 < bArr.length; i4++) {
                if (bArr[i4] == c5) {
                    return i4;
                }
            }
            return -1;
        }

        private static byte[] a(byte[] bArr, int i4, int i5) {
            int i6 = i5 - i4;
            if (i6 >= 0) {
                byte[] bArr2 = new byte[i6];
                System.arraycopy(bArr, i4, bArr2, 0, Math.min(bArr.length - i4, i6));
                return bArr2;
            }
            throw new IllegalArgumentException(i4 + " > " + i5);
        }

        private static String[] a(byte[] bArr) {
            if (b(bArr)) {
                return new String[]{new String(a(bArr, 0, 13)), new String(a(bArr, 14, a(bArr, ' ')))};
            }
            return null;
        }

        private static boolean b(byte[] bArr) {
            return bArr != null && bArr.length > 15 && bArr[13] == 45 && a(bArr, ' ') > 14;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static String c(String str) {
            return (str == null || !b(str.getBytes())) ? str : str.substring(str.indexOf(32) + 1, str.length());
        }

        private static boolean c(byte[] bArr) {
            String[] a5 = a(bArr);
            if (a5 != null && a5.length == 2) {
                String str = a5[0];
                while (str.startsWith("0")) {
                    str = str.substring(1, str.length());
                }
                if (System.currentTimeMillis() > Long.valueOf(str).longValue() + (Long.valueOf(a5[1]).longValue() * 1000)) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean d(String str) {
            return c(str.getBytes());
        }
    }

    public f(File file, long j4, int i4) {
        if (file.exists() || file.mkdirs()) {
            this.f2316a = new b(file, j4, i4);
            return;
        }
        throw new RuntimeException("can't make dirs in " + file.getAbsolutePath());
    }

    static f a(File file, long j4, int i4) {
        return new f(file, j4, i4);
    }

    public static k a() {
        return f2315c;
    }

    public static void a(Context context) {
        File filesDir = context.getFilesDir();
        String str = f2314b;
        File file = new File(filesDir, str);
        File[] fileArr = {file, new File(context.getCacheDir(), str)};
        for (int i4 = 0; i4 < 2; i4++) {
            File file2 = fileArr[i4];
            if (file2.exists() || file2.mkdirs()) {
                try {
                    f a5 = a(file2, 50000000L, Integer.MAX_VALUE);
                    String str2 = f2314b;
                    com.aggmoread.sdk.z.a.d.c(str2, "init , cache dir = " + file2.getAbsolutePath() + " , cacheHelper = " + a5);
                    f2315c = a5;
                    break;
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
        }
        if (f2315c == null) {
            f2315c = new g(context);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [boolean] */
    @Override // com.aggmoread.sdk.z.a.m.k
    public String a(String str) {
        BufferedReader bufferedReader;
        File a5 = this.f2316a.a(str);
        ?? exists = a5.exists();
        BufferedReader bufferedReader2 = null;
        try {
            if (exists == 0) {
                return null;
            }
            try {
                bufferedReader = new BufferedReader(new FileReader(a5));
                String str2 = "";
                while (true) {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        str2 = str2 + readLine;
                    } catch (IOException e5) {
                        e = e5;
                        e.printStackTrace();
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException e6) {
                                e6.printStackTrace();
                            }
                        }
                        return null;
                    }
                }
                if (c.d(str2)) {
                    try {
                        bufferedReader.close();
                    } catch (IOException e7) {
                        e7.printStackTrace();
                    }
                    b(str);
                    return null;
                }
                String c5 = c.c(str2);
                try {
                    bufferedReader.close();
                } catch (IOException e8) {
                    e8.printStackTrace();
                }
                return c5;
            } catch (IOException e9) {
                e = e9;
                bufferedReader = null;
            } catch (Throwable th) {
                th = th;
                if (bufferedReader2 != null) {
                    try {
                        bufferedReader2.close();
                    } catch (IOException e10) {
                        e10.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            bufferedReader2 = exists;
        }
    }

    @Override // com.aggmoread.sdk.z.a.m.k
    public void a(String str, String str2) {
        BufferedWriter bufferedWriter;
        File b5 = this.f2316a.b(str);
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                try {
                    bufferedWriter = new BufferedWriter(new FileWriter(b5), 1024);
                } catch (Throwable th) {
                    th = th;
                }
            } catch (IOException e5) {
                e = e5;
            }
        } catch (IOException e6) {
            e6.printStackTrace();
        }
        try {
            bufferedWriter.write(str2);
            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (IOException e7) {
            e = e7;
            bufferedWriter2 = bufferedWriter;
            e.printStackTrace();
            if (bufferedWriter2 != null) {
                bufferedWriter2.flush();
                bufferedWriter2.close();
            }
            this.f2316a.b(b5);
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter2 = bufferedWriter;
            if (bufferedWriter2 != null) {
                try {
                    bufferedWriter2.flush();
                    bufferedWriter2.close();
                } catch (IOException e8) {
                    e8.printStackTrace();
                }
            }
            this.f2316a.b(b5);
            throw th;
        }
        this.f2316a.b(b5);
    }

    public boolean b(String str) {
        return this.f2316a.c(str);
    }
}
