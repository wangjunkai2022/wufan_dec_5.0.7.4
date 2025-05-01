package com.aggmoread.sdk.z.c.a.a.e;

import android.content.Context;
import android.os.Build;
import com.aggmoread.sdk.z.c.a.a.d.b.d;
import com.xinzhu.overmind.client.frameworks.accounts.GrantCredentialsPermissionActivity;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes2.dex */
public class d {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f3485b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Map f3486c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ c f3487d;

        a(String str, Map map, c cVar) {
            this.f3485b = str;
            this.f3486c = map;
            this.f3487d = cVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v8, types: [com.aggmoread.sdk.z.c.a.a.d.b.i] */
        /* JADX WARN: Type inference failed for: r3v9 */
        @Override // java.lang.Runnable
        public void run() {
            com.aggmoread.sdk.z.c.a.a.d.b.i iVar;
            byte[] bArr;
            byte[] bArr2 = null;
            int i4 = -1;
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f3485b).openConnection();
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setDoOutput(false);
                httpURLConnection.setUseCaches(false);
                Map map = this.f3486c;
                if (map != null) {
                    for (String str : map.keySet()) {
                        httpURLConnection.setRequestProperty(str, (String) this.f3486c.get(str));
                    }
                }
                httpURLConnection.connect();
                i4 = httpURLConnection.getResponseCode();
                if (i4 == 200) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    byte[] bArr3 = new byte[1024];
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(httpURLConnection.getInputStream());
                    while (true) {
                        int read = bufferedInputStream.read(bArr3, 0, 1024);
                        if (read <= 0) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr3, 0, read);
                    }
                    bArr = byteArrayOutputStream.toByteArray();
                } else {
                    bArr = null;
                    bArr2 = new com.aggmoread.sdk.z.c.a.a.d.b.i(1001002001, "HTTP error，statusCode=" + i4);
                }
                iVar = bArr2;
                bArr2 = bArr;
            } catch (UnsupportedEncodingException e5) {
                iVar = new com.aggmoread.sdk.z.c.a.a.d.b.i(1001002002, "HTTP error, response encoding error.", e5);
            } catch (MalformedURLException e6) {
                iVar = new com.aggmoread.sdk.z.c.a.a.d.b.i(1001002004, "HTTP errror, url parse error.", e6);
            } catch (IOException e7) {
                iVar = new com.aggmoread.sdk.z.c.a.a.d.b.i(1001002005, "HTTP error, network error.", e7);
            } catch (Exception e8) {
                iVar = new com.aggmoread.sdk.z.c.a.a.d.b.i(1001002007, "HTTP error,other error.", e8);
            }
            this.f3487d.a(i4, bArr2, iVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f3488b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Map f3489c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ byte[] f3490d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f3491e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ c f3492f;

        b(String str, Map map, byte[] bArr, boolean z4, c cVar) {
            this.f3488b = str;
            this.f3489c = map;
            this.f3490d = bArr;
            this.f3491e = z4;
            this.f3492f = cVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            com.aggmoread.sdk.z.c.a.a.d.b.i iVar;
            byte[] bArr;
            com.aggmoread.sdk.z.c.a.a.d.b.i iVar2 = null;
            int i4 = -1;
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f3488b).openConnection();
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setUseCaches(false);
                Map map = this.f3489c;
                if (map != null) {
                    for (String str : map.keySet()) {
                        httpURLConnection.setRequestProperty(str, (String) this.f3489c.get(str));
                    }
                }
                httpURLConnection.setRequestProperty("Content-length", Integer.toString(this.f3490d.length));
                httpURLConnection.connect();
                httpURLConnection.getOutputStream().write(this.f3490d);
                i4 = httpURLConnection.getResponseCode();
                if (i4 == 200) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    byte[] bArr2 = new byte[1024];
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(httpURLConnection.getInputStream());
                    while (true) {
                        int read = bufferedInputStream.read(bArr2, 0, 1024);
                        if (read <= 0) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr2, 0, read);
                    }
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    try {
                        StringBuilder sb = new StringBuilder();
                        sb.append(GrantCredentialsPermissionActivity.f67537i);
                        sb.append(this.f3491e ? "-ads2" : "");
                        e.a(byteArray, sb.toString());
                        bArr = byteArray;
                    } catch (UnsupportedEncodingException e5) {
                        e = e5;
                        iVar2 = byteArray;
                        iVar = new com.aggmoread.sdk.z.c.a.a.d.b.i(1001002002, "HTTP error, response encoding error.", e);
                        bArr = iVar2;
                        iVar2 = iVar;
                        this.f3492f.a(i4, bArr, iVar2);
                    } catch (MalformedURLException e6) {
                        e = e6;
                        iVar2 = byteArray;
                        iVar = new com.aggmoread.sdk.z.c.a.a.d.b.i(1001002004, "HTTP errror, url parse error.", e);
                        bArr = iVar2;
                        iVar2 = iVar;
                        this.f3492f.a(i4, bArr, iVar2);
                    } catch (IOException e7) {
                        e = e7;
                        iVar2 = byteArray;
                        iVar = new com.aggmoread.sdk.z.c.a.a.d.b.i(1001002005, "HTTP error, network error.", e);
                        bArr = iVar2;
                        iVar2 = iVar;
                        this.f3492f.a(i4, bArr, iVar2);
                    } catch (Exception e8) {
                        e = e8;
                        iVar2 = byteArray;
                        iVar = new com.aggmoread.sdk.z.c.a.a.d.b.i(1001002007, "HTTP error,other error.", e);
                        bArr = iVar2;
                        iVar2 = iVar;
                        this.f3492f.a(i4, bArr, iVar2);
                    }
                } else {
                    bArr = 0;
                    iVar2 = new com.aggmoread.sdk.z.c.a.a.d.b.i(1001002001, "HTTP error，statusCode=" + i4);
                }
            } catch (UnsupportedEncodingException e9) {
                e = e9;
            } catch (MalformedURLException e10) {
                e = e10;
            } catch (IOException e11) {
                e = e11;
            } catch (Exception e12) {
                e = e12;
            }
            this.f3492f.a(i4, bArr, iVar2);
        }
    }

    /* loaded from: classes2.dex */
    public interface c {
        void a(int i4, byte[] bArr, com.aggmoread.sdk.z.c.a.a.d.b.i iVar);
    }

    public static String a(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("sha1");
            messageDigest.update(str.getBytes("UTF-8"));
            return a(messageDigest.digest());
        } catch (Exception e5) {
            e.b("AMHTTAG", "Exception " + e5.getMessage());
            return null;
        }
    }

    public static String a(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b5 : bArr) {
            int i4 = b5 & 255;
            if (i4 < 15) {
                stringBuffer.append("0");
            }
            stringBuffer.append(Integer.toHexString(i4));
        }
        return stringBuffer.toString().toUpperCase();
    }

    public static Map<Object, Object> a(Map<Object, Object> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        f fVar = new f(map);
        try {
            fVar.b(d.c.f3287a, com.aggmoread.sdk.z.c.a.a.d.b.j.f3429q.getPackageName());
            fVar.b(d.c.f3288b, com.aggmoread.sdk.z.c.a.a.e.c.e());
            fVar.b(d.c.f3289c, com.aggmoread.sdk.z.c.a.a.e.c.q());
            fVar.b(d.c.f3291e, com.aggmoread.sdk.z.c.a.a.e.c.g());
        } catch (Exception e5) {
            e.b("AMHTTAG", "e = " + e5.getMessage());
        }
        return fVar.f3494a;
    }

    public static void a(Context context) {
    }

    public static void a(String str, Map<String, String> map, c cVar) {
        if (n.b(new a(str, map, cVar))) {
            return;
        }
        cVar.a(-1, null, new com.aggmoread.sdk.z.c.a.a.d.b.i(1001002007, "thread err."));
    }

    public static void a(String str, byte[] bArr, Map<String, String> map, c cVar) {
        e.b("AMHTTAG", str);
        boolean contains = str.contains("qd/r");
        StringBuilder sb = new StringBuilder();
        sb.append("request");
        sb.append(contains ? "-ads2" : "");
        e.a(bArr, sb.toString());
        e.b("AMHTTAG", "vo false");
        if (n.b(new b(str, map, bArr, contains, cVar))) {
            return;
        }
        cVar.a(-1, null, new com.aggmoread.sdk.z.c.a.a.d.b.i(1001002007, "thread err."));
    }

    public static Map<Object, Object> b(Map<Object, Object> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        f fVar = new f(map);
        try {
            fVar.b(d.C0143d.f3299e, com.aggmoread.sdk.z.c.a.a.d.b.j.f3429q.getPackageName());
            fVar.b(d.C0143d.f3297c, com.aggmoread.sdk.z.c.a.a.e.c.e());
            fVar.b(d.C0143d.f3305k, com.aggmoread.sdk.z.c.a.a.e.c.q());
            fVar.b(d.C0143d.f3300f, com.aggmoread.sdk.z.c.a.a.e.c.g());
            fVar.b(d.C0143d.f3301g, Build.BRAND);
            fVar.b(d.C0143d.f3302h, Build.MODEL);
            fVar.b(d.C0143d.f3303i, com.aggmoread.sdk.z.c.a.a.e.c.p());
            fVar.b(d.C0143d.f3304j, com.aggmoread.sdk.z.c.a.a.e.c.B());
        } catch (Exception e5) {
            e.b("AMHTTAG", "e = " + e5.getMessage());
        }
        return fVar.f3494a;
    }
}
