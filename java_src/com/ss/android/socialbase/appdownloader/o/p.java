package com.ss.android.socialbase.appdownloader.o;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import com.ss.android.socialbase.downloader.network.wv;
import com.ss.android.socialbase.downloader.wv.u;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.Map;
/* loaded from: classes5.dex */
public class p {

    /* renamed from: m  reason: collision with root package name */
    private static volatile p f60833m = null;
    private static int vv = 8;

    /* renamed from: p  reason: collision with root package name */
    private vv<Integer, Bitmap> f60834p;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class vv<K, T> extends LinkedHashMap<K, T> {
        final int vv;

        public vv(int i4, int i5) {
            super(i5, 0.75f, true);
            this.vv = i4;
        }

        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(Map.Entry<K, T> entry) {
            return size() > this.vv;
        }
    }

    private p() {
        this.f60834p = null;
        int i4 = vv;
        this.f60834p = new vv<>(i4, i4 / 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ByteArrayOutputStream m(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read >= 0) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                byteArrayOutputStream.flush();
                return byteArrayOutputStream;
            }
        }
    }

    public static p vv() {
        if (f60833m == null) {
            synchronized (p.class) {
                if (f60833m == null) {
                    f60833m = new p();
                }
            }
        }
        return f60833m;
    }

    public Bitmap vv(int i4) {
        return this.f60834p.get(Integer.valueOf(i4));
    }

    public void vv(final int i4, final String str) {
        if (TextUtils.isEmpty(str) || vv(i4) != null) {
            return;
        }
        com.ss.android.socialbase.downloader.downloader.p.r().submit(new Runnable() { // from class: com.ss.android.socialbase.appdownloader.o.p.1
            @Override // java.lang.Runnable
            public void run() {
                ByteArrayOutputStream byteArrayOutputStream;
                ByteArrayInputStream byteArrayInputStream;
                Closeable closeable;
                Throwable th;
                InputStream inputStream;
                ByteArrayInputStream byteArrayInputStream2;
                Exception e5;
                try {
                    try {
                        wv vv2 = com.ss.android.socialbase.downloader.downloader.p.vv(true, 0, str, null);
                        if (vv2 == null) {
                            u.vv(null, null, null, null);
                            return;
                        }
                        inputStream = vv2.vv();
                        try {
                            byteArrayOutputStream = p.m(inputStream);
                            try {
                                byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
                                try {
                                    byteArrayInputStream2 = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
                                    try {
                                        BitmapFactory.Options options = new BitmapFactory.Options();
                                        options.inJustDecodeBounds = true;
                                        BitmapFactory.decodeStream(byteArrayInputStream, null, options);
                                        int vv3 = com.ss.android.socialbase.appdownloader.p.vv(com.ss.android.socialbase.downloader.downloader.p.ky(), 44.0f);
                                        options.inSampleSize = p.vv(vv3, vv3, options);
                                        options.inJustDecodeBounds = false;
                                        p.this.f60834p.put(Integer.valueOf(i4), BitmapFactory.decodeStream(byteArrayInputStream2, null, options));
                                        u.vv(inputStream, byteArrayOutputStream, byteArrayInputStream, byteArrayInputStream2);
                                    } catch (Exception e6) {
                                        e5 = e6;
                                        e5.printStackTrace();
                                        u.vv(inputStream, byteArrayOutputStream, byteArrayInputStream, byteArrayInputStream2);
                                    }
                                } catch (Exception e7) {
                                    byteArrayInputStream2 = null;
                                    e5 = e7;
                                } catch (Throwable th2) {
                                    closeable = null;
                                    th = th2;
                                    u.vv(inputStream, byteArrayOutputStream, byteArrayInputStream, closeable);
                                    throw th;
                                }
                            } catch (Exception e8) {
                                byteArrayInputStream2 = null;
                                e5 = e8;
                                byteArrayInputStream = null;
                            } catch (Throwable th3) {
                                closeable = null;
                                th = th3;
                                byteArrayInputStream = null;
                            }
                        } catch (Exception e9) {
                            byteArrayInputStream = null;
                            byteArrayInputStream2 = null;
                            e5 = e9;
                            byteArrayOutputStream = null;
                        } catch (Throwable th4) {
                            byteArrayInputStream = null;
                            closeable = null;
                            th = th4;
                            byteArrayOutputStream = null;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                    }
                } catch (Exception e10) {
                    byteArrayOutputStream = null;
                    byteArrayInputStream = null;
                    byteArrayInputStream2 = null;
                    e5 = e10;
                    inputStream = null;
                } catch (Throwable th6) {
                    byteArrayOutputStream = null;
                    byteArrayInputStream = null;
                    closeable = null;
                    th = th6;
                    inputStream = null;
                }
            }
        });
    }

    public static int vv(int i4, int i5, BitmapFactory.Options options) {
        int i6 = options.outWidth;
        if (i6 > i4 || options.outHeight > i5) {
            return Math.min(Math.round(i6 / i4), Math.round(options.outHeight / i5));
        }
        return 1;
    }
}
