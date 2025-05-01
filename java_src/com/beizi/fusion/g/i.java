package com.beizi.fusion.g;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.text.TextUtils;
import android.widget.ImageView;
import androidx.collection.LruCache;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* compiled from: BeiZiImageUtils.java */
/* loaded from: classes2.dex */
public class i {

    /* renamed from: a  reason: collision with root package name */
    private static Context f6964a;

    /* renamed from: e  reason: collision with root package name */
    private static i f6965e;

    /* renamed from: b  reason: collision with root package name */
    private ExecutorService f6966b = Executors.newFixedThreadPool(4);

    /* renamed from: c  reason: collision with root package name */
    private LruCache<String, Bitmap> f6967c = new LruCache<>(4194304);

    /* renamed from: d  reason: collision with root package name */
    private Handler f6968d = new Handler();

    /* compiled from: BeiZiImageUtils.java */
    /* loaded from: classes2.dex */
    public interface a {
        void a();

        void a(Bitmap bitmap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String c(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes());
            return a(messageDigest.digest());
        } catch (NoSuchAlgorithmException unused) {
            return "";
        }
    }

    public static i a(Context context) {
        if (context == null) {
            av.b("Illegal Argument: context is null");
        } else {
            f6964a = context;
        }
        return b();
    }

    private static i b() {
        if (f6965e == null) {
            synchronized (i.class) {
                if (f6965e == null) {
                    f6965e = new i();
                }
            }
        }
        return f6965e;
    }

    public b a(String str) {
        return new b(str);
    }

    public void a(final String str, final a aVar) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Bitmap bitmap = this.f6967c.get(str);
        Bitmap bitmap2 = null;
        if (bitmap != null) {
            aVar.a(bitmap);
            return;
        }
        File file = new File(j.b(f6964a), c(str.substring(str.lastIndexOf(net.lingala.zip4j.util.e.F0) + 1)));
        if (file.exists() && file.length() > 0) {
            bitmap2 = BitmapFactory.decodeFile(file.getAbsolutePath());
        }
        if (bitmap2 != null) {
            this.f6967c.put(str, bitmap2);
            aVar.a(bitmap2);
            return;
        }
        this.f6966b.submit(new Runnable() { // from class: com.beizi.fusion.g.i.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                    httpURLConnection.setRequestMethod("GET");
                    httpURLConnection.setConnectTimeout(5000);
                    httpURLConnection.setReadTimeout(5000);
                    if (httpURLConnection.getResponseCode() == 200) {
                        final Bitmap decodeStream = BitmapFactory.decodeStream(httpURLConnection.getInputStream());
                        httpURLConnection.disconnect();
                        i.this.f6968d.post(new Runnable() { // from class: com.beizi.fusion.g.i.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                aVar.a(decodeStream);
                            }
                        });
                        i.this.f6967c.put(str, decodeStream);
                        String str2 = str;
                        decodeStream.compress(Bitmap.CompressFormat.PNG, 100, new FileOutputStream(new File(j.b(i.f6964a), i.c(str2.substring(str2.lastIndexOf(net.lingala.zip4j.util.e.F0) + 1)))));
                    }
                } catch (Exception unused) {
                    i.this.f6968d.post(new Runnable() { // from class: com.beizi.fusion.g.i.1.2
                        @Override // java.lang.Runnable
                        public void run() {
                            aVar.a();
                        }
                    });
                }
            }
        });
    }

    /* compiled from: BeiZiImageUtils.java */
    /* loaded from: classes2.dex */
    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        String f6979a;

        /* renamed from: b  reason: collision with root package name */
        ImageView f6980b;

        public b(String str) {
            this.f6979a = str;
        }

        private void b() {
            i.this.f6968d.post(new Runnable() { // from class: com.beizi.fusion.g.i.b.2
                @Override // java.lang.Runnable
                public void run() {
                }
            });
        }

        public void a(ImageView imageView) {
            this.f6980b = imageView;
            if (TextUtils.isEmpty(this.f6979a)) {
                return;
            }
            Bitmap bitmap = (Bitmap) i.this.f6967c.get(this.f6979a);
            if (bitmap != null) {
                imageView.setImageBitmap(bitmap);
                return;
            }
            Bitmap a5 = a();
            if (a5 == null) {
                i.this.f6966b.submit(this);
                return;
            }
            imageView.setImageBitmap(a5);
            i.this.f6967c.put(this.f6979a, a5);
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f6979a).openConnection();
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setConnectTimeout(5000);
                httpURLConnection.setReadTimeout(5000);
                if (httpURLConnection.getResponseCode() == 200) {
                    final Bitmap decodeStream = BitmapFactory.decodeStream(httpURLConnection.getInputStream());
                    i.this.f6968d.post(new Runnable() { // from class: com.beizi.fusion.g.i.b.1
                        @Override // java.lang.Runnable
                        public void run() {
                            b.this.f6980b.setImageBitmap(decodeStream);
                        }
                    });
                    i.this.f6967c.put(this.f6979a, decodeStream);
                    String str = this.f6979a;
                    File file = new File(j.b(i.f6964a), i.c(str.substring(str.lastIndexOf(net.lingala.zip4j.util.e.F0) + 1)));
                    af.a("BeiZis", "BeiZiImageUtils run file == " + file);
                    decodeStream.compress(Bitmap.CompressFormat.PNG, 100, new FileOutputStream(file));
                } else {
                    b();
                }
            } catch (FileNotFoundException unused) {
            } catch (Exception e5) {
                e5.printStackTrace();
                b();
            }
        }

        private Bitmap a() {
            String str = this.f6979a;
            File file = new File(j.b(i.f6964a), i.c(str.substring(str.lastIndexOf(net.lingala.zip4j.util.e.F0) + 1)));
            af.a("BeiZis", "BeiZiImageUtils getBitmapFile file == " + file);
            if (!file.exists() || file.length() <= 0) {
                return null;
            }
            return BitmapFactory.decodeFile(file.getAbsolutePath());
        }
    }

    public void b(final String str, final a aVar) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Bitmap bitmap = this.f6967c.get(str);
        Bitmap bitmap2 = null;
        if (bitmap != null) {
            aVar.a(bitmap);
            return;
        }
        File file = new File(j.b(f6964a), c(str.substring(str.lastIndexOf(net.lingala.zip4j.util.e.F0) + 1)));
        if (file.exists() && file.length() > 0) {
            bitmap2 = BitmapFactory.decodeFile(file.getAbsolutePath());
        }
        if (bitmap2 != null) {
            this.f6967c.put(str, bitmap2);
            aVar.a(bitmap2);
            return;
        }
        this.f6966b.submit(new Runnable() { // from class: com.beizi.fusion.g.i.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                    httpURLConnection.setRequestMethod("GET");
                    httpURLConnection.setConnectTimeout(5000);
                    httpURLConnection.setReadTimeout(5000);
                    if (httpURLConnection.getResponseCode() == 200) {
                        Bitmap decodeStream = BitmapFactory.decodeStream(httpURLConnection.getInputStream());
                        httpURLConnection.disconnect();
                        i.this.f6967c.put(str, decodeStream);
                        String str2 = str;
                        decodeStream.compress(Bitmap.CompressFormat.PNG, 100, new FileOutputStream(new File(j.b(i.f6964a), i.c(str2.substring(str2.lastIndexOf(net.lingala.zip4j.util.e.F0) + 1)))));
                    }
                } catch (Exception unused) {
                    i.this.f6968d.post(new Runnable() { // from class: com.beizi.fusion.g.i.2.1
                        @Override // java.lang.Runnable
                        public void run() {
                            aVar.a();
                        }
                    });
                }
            }
        });
    }

    private static String a(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b5 : bArr) {
            int i4 = (b5 >>> 4) & 15;
            int i5 = 0;
            while (true) {
                sb.append((char) ((i4 < 0 || i4 > 9) ? (i4 - 10) + 97 : i4 + 48));
                i4 = b5 & 15;
                int i6 = i5 + 1;
                if (i5 >= 1) {
                    break;
                }
                i5 = i6;
            }
        }
        return sb.toString();
    }
}
