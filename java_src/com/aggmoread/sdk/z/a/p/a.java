package com.aggmoread.sdk.z.a.p;

import com.aggmoread.sdk.z.a.h.b;
import com.aggmoread.sdk.z.a.m.m;
import io.netty.handler.codec.http.HttpHeaders;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import tv.danmaku.ijk.media.player.IMediaPlayer;
/* loaded from: classes2.dex */
public class a {

    /* renamed from: com.aggmoread.sdk.z.a.p.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    static class C0067a implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f2370a;

        C0067a(f fVar) {
            this.f2370a = fVar;
        }

        @Override // com.aggmoread.sdk.z.a.p.a.g
        public void a(int i4, byte[] bArr, com.aggmoread.sdk.z.a.g.e eVar) {
            JSONObject jSONObject = null;
            if (eVar == null) {
                if (bArr == null) {
                    return;
                }
                try {
                    jSONObject = new JSONObject(new String(bArr, "UTF-8"));
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
            this.f2370a.a(i4, jSONObject, eVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f2371b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Map f2372c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ byte[] f2373d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ g f2374e;

        b(String str, Map map, byte[] bArr, g gVar) {
            this.f2371b = str;
            this.f2372c = map;
            this.f2373d = bArr;
            this.f2374e = gVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [com.aggmoread.sdk.z.a.p.a$g] */
        /* JADX WARN: Type inference failed for: r3v6, types: [com.aggmoread.sdk.z.a.g.e] */
        /* JADX WARN: Type inference failed for: r4v1, types: [com.aggmoread.sdk.z.a.g.e] */
        /* JADX WARN: Type inference failed for: r4v8 */
        @Override // java.lang.Runnable
        public void run() {
            com.aggmoread.sdk.z.a.g.e eVar;
            byte[] bArr;
            byte[] bArr2 = null;
            int i4 = -1;
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f2371b).openConnection();
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setUseCaches(false);
                Map map = this.f2372c;
                if (map != null) {
                    for (String str : map.keySet()) {
                        httpURLConnection.setRequestProperty(str, (String) this.f2372c.get(str));
                    }
                }
                httpURLConnection.setRequestProperty("Content-length", Integer.toString(this.f2373d.length));
                httpURLConnection.connect();
                httpURLConnection.getOutputStream().write(this.f2373d);
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
                    String str2 = new String(byteArrayOutputStream.toByteArray(), "UTF-8");
                    com.aggmoread.sdk.z.a.d.d(str2, "api response");
                    bArr = str2.getBytes();
                } else {
                    bArr = null;
                    bArr2 = new com.aggmoread.sdk.z.a.g.e(IMediaPlayer.MEDIA_INFO_OPEN_INPUT, "HTTP error，statusCode=" + i4);
                }
                eVar = bArr2;
                bArr2 = bArr;
            } catch (Exception e5) {
                eVar = new com.aggmoread.sdk.z.a.g.e(IMediaPlayer.MEDIA_INFO_OPEN_INPUT, "HTTP error, response encoding error." + e5.getMessage());
            }
            this.f2374e.a(i4, bArr2, eVar);
        }
    }

    /* loaded from: classes2.dex */
    static class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f2375b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Map f2376c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ g f2377d;

        c(String str, Map map, g gVar) {
            this.f2375b = str;
            this.f2376c = map;
            this.f2377d = gVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [com.aggmoread.sdk.z.a.p.a$g] */
        /* JADX WARN: Type inference failed for: r3v6, types: [com.aggmoread.sdk.z.a.g.e] */
        /* JADX WARN: Type inference failed for: r4v1, types: [com.aggmoread.sdk.z.a.g.e] */
        /* JADX WARN: Type inference failed for: r4v7 */
        @Override // java.lang.Runnable
        public void run() {
            com.aggmoread.sdk.z.a.g.e eVar;
            byte[] bArr;
            byte[] bArr2 = null;
            int i4 = -1;
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f2375b).openConnection();
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setDoOutput(false);
                httpURLConnection.setUseCaches(false);
                Map map = this.f2376c;
                if (map != null) {
                    for (String str : map.keySet()) {
                        httpURLConnection.setRequestProperty(str, (String) this.f2376c.get(str));
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
                    bArr2 = new com.aggmoread.sdk.z.a.g.e(IMediaPlayer.MEDIA_INFO_OPEN_INPUT, "HTTP error，statusCode=" + i4);
                }
                eVar = bArr2;
                bArr2 = bArr;
            } catch (Exception e5) {
                eVar = new com.aggmoread.sdk.z.a.g.e(IMediaPlayer.MEDIA_INFO_OPEN_INPUT, "HTTP error, response encoding error." + e5.getMessage());
            }
            this.f2377d.a(i4, bArr2, eVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class d implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f2378b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ JSONObject f2379c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Map f2380d;

        /* renamed from: com.aggmoread.sdk.z.a.p.a$d$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        class C0068a implements b.a {
            C0068a(d dVar) {
            }
        }

        d(String str, JSONObject jSONObject, Map map, f fVar) {
            this.f2378b = str;
            this.f2379c = jSONObject;
            this.f2380d = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.aggmoread.sdk.z.a.h.a.d().c().a(this.f2378b, this.f2379c, this.f2380d, new C0068a(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class e implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f2381b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Map f2382c;

        /* renamed from: com.aggmoread.sdk.z.a.p.a$e$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        class C0069a implements b.a {
            C0069a(e eVar) {
            }
        }

        e(String str, Map map, g gVar) {
            this.f2381b = str;
            this.f2382c = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.aggmoread.sdk.z.a.h.a.d().c().a(this.f2381b, this.f2382c, new C0069a(this));
        }
    }

    /* loaded from: classes2.dex */
    public interface f {
        void a(int i4, JSONObject jSONObject, com.aggmoread.sdk.z.a.g.e eVar);
    }

    /* loaded from: classes2.dex */
    public interface g {
        void a(int i4, byte[] bArr, com.aggmoread.sdk.z.a.g.e eVar);
    }

    public static void a(String str, Map<String, String> map, g gVar) {
        if (!com.aggmoread.sdk.z.a.h.a.d().f() || com.aggmoread.sdk.z.a.h.a.d().c() == null) {
            m.a(new c(str, map, gVar));
        } else {
            b(str, map, gVar);
        }
    }

    public static void a(String str, JSONObject jSONObject, Map<String, String> map, f fVar) {
        if (com.aggmoread.sdk.z.a.h.a.d().f() && com.aggmoread.sdk.z.a.h.a.d().c() != null) {
            b(str, jSONObject, map, fVar);
            return;
        }
        try {
            byte[] bytes = jSONObject.toString().getBytes("UTF-8");
            if (map == null) {
                map = new HashMap<>();
            }
            map.put("Content-type", HttpHeaders.Values.APPLICATION_JSON);
            a(str, bytes, map, new C0067a(fVar));
        } catch (UnsupportedEncodingException unused) {
        }
    }

    public static void a(String str, byte[] bArr, Map<String, String> map, g gVar) {
        m.a(new b(str, map, bArr, gVar));
    }

    private static void b(String str, Map<String, String> map, g gVar) {
        m.a(new e(str, map, gVar));
    }

    private static void b(String str, JSONObject jSONObject, Map<String, String> map, f fVar) {
        m.a(new d(str, jSONObject, map, fVar));
    }
}
