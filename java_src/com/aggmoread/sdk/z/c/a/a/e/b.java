package com.aggmoread.sdk.z.c.a.a.e;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes2.dex */
public class b {

    /* renamed from: e  reason: collision with root package name */
    private static Map<String, WeakReference<b>> f3468e = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    private static h f3469f = new h("cc_default");

    /* renamed from: a  reason: collision with root package name */
    private String f3470a;

    /* renamed from: b  reason: collision with root package name */
    private long f3471b;

    /* renamed from: c  reason: collision with root package name */
    private byte[] f3472c;

    /* renamed from: d  reason: collision with root package name */
    private String f3473d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ byte[] f3474b;

        a(byte[] bArr) {
            this.f3474b = bArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (b.this) {
                File file = new File(com.aggmoread.sdk.z.c.a.a.d.b.j.f3429q.getApplicationInfo().dataDir, String.format("%s_%s_m", com.aggmoread.sdk.z.c.a.a.e.c.l(), b.this.f3470a));
                if (this.f3474b == null) {
                    if (file.exists()) {
                        file.delete();
                    }
                    return;
                }
                try {
                    if (!file.exists()) {
                        file.createNewFile();
                    }
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    fileOutputStream.write(this.f3474b);
                    fileOutputStream.close();
                } catch (FileNotFoundException e5) {
                    e5.printStackTrace();
                } catch (IOException e6) {
                    e6.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.aggmoread.sdk.z.c.a.a.e.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class RunnableC0149b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f3476b;

        RunnableC0149b(c cVar) {
            this.f3476b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (b.this) {
                File file = new File(com.aggmoread.sdk.z.c.a.a.d.b.j.f3429q.getApplicationInfo().dataDir, String.format("%s_%s_m", com.aggmoread.sdk.z.c.a.a.e.c.l(), b.this.f3470a));
                if (file.exists()) {
                    try {
                        try {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            FileInputStream fileInputStream = new FileInputStream(file);
                            byte[] bArr = new byte[1024];
                            while (true) {
                                int read = fileInputStream.read(bArr, 0, 1024);
                                if (read <= 0) {
                                    break;
                                }
                                byteArrayOutputStream.write(bArr, 0, read);
                            }
                            b.this.f3472c = byteArrayOutputStream.toByteArray();
                            b.this.f3471b = b.f3469f.a(b.this.f3470a, 0L);
                            b bVar = b.this;
                            h hVar = b.f3469f;
                            bVar.f3473d = hVar.a(b.this.f3470a + "_v", (String) null);
                            fileInputStream.close();
                        } catch (FileNotFoundException e5) {
                            e5.printStackTrace();
                        }
                    } catch (IOException e6) {
                        e6.printStackTrace();
                    }
                }
            }
            this.f3476b.a(b.this);
        }
    }

    /* loaded from: classes2.dex */
    public interface c {
        void a(b bVar);
    }

    protected b(String str) {
        this.f3470a = str;
    }

    public static b a(String str) {
        WeakReference<b> weakReference = f3468e.get(str);
        b bVar = weakReference != null ? weakReference.get() : null;
        if (bVar == null) {
            synchronized (b.class) {
                WeakReference<b> weakReference2 = f3468e.get(str);
                if (weakReference2 != null) {
                    bVar = weakReference2.get();
                }
                if (bVar == null) {
                    bVar = new b(str);
                    f3468e.put(str, new WeakReference<>(bVar));
                }
            }
        }
        return bVar;
    }

    public void a(c cVar) {
        n.b(new RunnableC0149b(cVar));
    }

    public void a(byte[] bArr) {
        this.f3472c = bArr;
        this.f3471b = System.currentTimeMillis();
        if (bArr == null) {
            this.f3471b = 0L;
        }
        f3469f.b(this.f3470a, this.f3471b);
        h hVar = f3469f;
        hVar.b(this.f3470a + "_v", "20080717");
        n.b(new a(bArr));
    }

    public byte[] b() {
        return this.f3472c;
    }

    public long c() {
        return this.f3471b;
    }

    public String d() {
        return this.f3473d;
    }
}
