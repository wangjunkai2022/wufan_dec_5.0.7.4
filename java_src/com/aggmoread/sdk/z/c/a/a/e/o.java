package com.aggmoread.sdk.z.c.a.a.e;

import com.kuaishou.weapon.p0.bi;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes2.dex */
public class o {

    /* renamed from: e  reason: collision with root package name */
    private static Map<String, WeakReference<o>> f3518e = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    private String f3519a;

    /* renamed from: b  reason: collision with root package name */
    private byte[] f3520b = new byte[0];

    /* renamed from: c  reason: collision with root package name */
    private int f3521c;

    /* renamed from: d  reason: collision with root package name */
    private long f3522d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            File e5;
            synchronized (o.this.f3519a) {
                try {
                    e5 = o.this.e();
                } catch (FileNotFoundException e6) {
                    e6.printStackTrace();
                } catch (IOException e7) {
                    e7.printStackTrace();
                }
                if (e5.exists()) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    FileInputStream fileInputStream = new FileInputStream(e5);
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = fileInputStream.read(bArr, 0, 1024);
                        if (read <= 0) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, read);
                    }
                    o.this.f3520b = byteArrayOutputStream.toByteArray();
                    o oVar = o.this;
                    oVar.f3521c = oVar.f3520b.length / 8;
                    fileInputStream.close();
                    o.this.d();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            File e5;
            synchronized (o.this.f3519a) {
                try {
                    try {
                        e5 = o.this.e();
                    } catch (IOException e6) {
                        e6.printStackTrace();
                    }
                } catch (FileNotFoundException e7) {
                    e7.printStackTrace();
                }
                if (e5.exists() || e5.createNewFile()) {
                    new FileOutputStream(o.this.e()).write(o.this.f3520b);
                }
            }
        }
    }

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* loaded from: classes2.dex */
    public static final class c {

        /* renamed from: d  reason: collision with root package name */
        public static final c f3525d = new c("REQUEST_DAILY", 0, 86400000, 0);

        /* renamed from: e  reason: collision with root package name */
        public static final c f3526e = new c("REQUEST_HOURLY", 1, bi.f55326s, 1);

        /* renamed from: f  reason: collision with root package name */
        public static final c f3527f = new c("EXPOSURE_DAILY", 2, 86400000, 2);

        /* renamed from: g  reason: collision with root package name */
        public static final c f3528g = new c("EXPOSURE_HOURLY", 3, bi.f55326s, 3);

        /* renamed from: h  reason: collision with root package name */
        public static final c f3529h = new c("CLICK_DAILY", 4, 86400000, 4);

        /* renamed from: i  reason: collision with root package name */
        public static final c f3530i = new c("CLICK_HOURLY", 5, bi.f55326s, 5);

        /* renamed from: b  reason: collision with root package name */
        public long f3531b;

        /* renamed from: c  reason: collision with root package name */
        public int f3532c;

        private c(String str, int i4, long j4, int i5) {
            this.f3531b = j4;
            this.f3532c = i5;
        }
    }

    protected o(String str, long j4) {
        new ArrayList();
        this.f3521c = 0;
        this.f3519a = str;
        this.f3522d = j4;
        b();
    }

    public static o a(String str, c cVar) {
        String format = String.format("%s_%d", str, Integer.valueOf(cVar.f3532c));
        WeakReference<o> weakReference = f3518e.get(format);
        o oVar = weakReference != null ? weakReference.get() : null;
        if (oVar == null) {
            synchronized (o.class) {
                WeakReference<o> weakReference2 = f3518e.get(format);
                if (weakReference2 != null) {
                    oVar = weakReference2.get();
                }
                if (oVar == null) {
                    oVar = new o(format, cVar.f3531b);
                    f3518e.put(format, new WeakReference<>(oVar));
                }
            }
        }
        return oVar;
    }

    public void a() {
        synchronized (this) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byteArrayOutputStream.write(this.f3520b);
                new DataOutputStream(byteArrayOutputStream).writeLong(System.currentTimeMillis());
                this.f3520b = byteArrayOutputStream.toByteArray();
                this.f3521c++;
            } catch (IOException e5) {
                e5.printStackTrace();
                return;
            }
        }
        c();
    }

    public void b() {
        n.b(new a());
    }

    public void c() {
        n.b(new b());
    }

    public int d() {
        synchronized (this) {
            if (this.f3520b.length == 0) {
                return 0;
            }
            int i4 = 0;
            while (new DataInputStream(new ByteArrayInputStream(this.f3520b)).readLong() < System.currentTimeMillis() - this.f3522d) {
                try {
                    this.f3521c--;
                    i4++;
                } catch (IOException unused) {
                }
            }
            if (i4 > 0) {
                int i5 = i4 * 8;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = this.f3520b;
                byteArrayOutputStream.write(bArr, i5, bArr.length - i5);
                this.f3520b = byteArrayOutputStream.toByteArray();
            }
            if (i4 > 0) {
                c();
            }
            if (this.f3521c < 0) {
                this.f3521c = 0;
            }
            return this.f3521c;
        }
    }

    protected File e() {
        String str = com.aggmoread.sdk.z.c.a.a.d.b.j.f3429q.getApplicationInfo().dataDir;
        return new File(str, com.aggmoread.sdk.z.c.a.a.e.c.l() + this.f3519a);
    }

    public String toString() {
        return String.format("{tsname= %s,tsc= %s,span= %s}", this.f3519a, Integer.valueOf(this.f3521c), Long.valueOf(this.f3522d));
    }
}
