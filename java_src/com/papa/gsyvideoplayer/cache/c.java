package com.papa.gsyvideoplayer.cache;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.danikula.videocache.file.f;
import com.danikula.videocache.i;
import com.papa.gsyvideoplayer.cache.b;
import com.papa.gsyvideoplayer.utils.q;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import tv.danmaku.ijk.media.player.IMediaPlayer;
/* compiled from: ProxyCacheManager.java */
/* loaded from: classes5.dex */
public class c implements b, com.danikula.videocache.d {

    /* renamed from: g  reason: collision with root package name */
    public static int f58239g = 536870912;

    /* renamed from: h  reason: collision with root package name */
    private static c f58240h;

    /* renamed from: i  reason: collision with root package name */
    private static com.danikula.videocache.file.c f58241i;

    /* renamed from: b  reason: collision with root package name */
    protected i f58242b;

    /* renamed from: c  reason: collision with root package name */
    protected File f58243c;

    /* renamed from: d  reason: collision with root package name */
    protected boolean f58244d;

    /* renamed from: e  reason: collision with root package name */
    private b.a f58245e;

    /* renamed from: f  reason: collision with root package name */
    protected d f58246f = new d();

    public static void b() {
        f58241i = null;
    }

    protected static i c(Context context) {
        i iVar = j().f58242b;
        if (iVar == null) {
            c j4 = j();
            i k4 = j().k(context);
            j4.f58242b = k4;
            return k4;
        }
        return iVar;
    }

    public static i d(Context context, File file) {
        if (file == null) {
            return c(context);
        }
        if (j().f58243c != null && !j().f58243c.getAbsolutePath().equals(file.getAbsolutePath())) {
            i iVar = j().f58242b;
            if (iVar != null) {
                iVar.r();
            }
            c j4 = j();
            i l4 = j().l(context, file);
            j4.f58242b = l4;
            return l4;
        }
        i iVar2 = j().f58242b;
        if (iVar2 == null) {
            c j5 = j();
            i l5 = j().l(context, file);
            j5.f58242b = l5;
            return l5;
        }
        return iVar2;
    }

    public static synchronized c j() {
        c cVar;
        synchronized (c.class) {
            if (f58240h == null) {
                f58240h = new c();
            }
            cVar = f58240h;
        }
        return cVar;
    }

    public static void m(com.danikula.videocache.file.c cVar) {
        f58241i = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.danikula.videocache.file.c] */
    @Override // com.papa.gsyvideoplayer.cache.b
    public void a(Context context, File file, String str) {
        if (TextUtils.isEmpty(str)) {
            com.papa.gsyvideoplayer.utils.d.a(new File(q.c(context.getApplicationContext()).getAbsolutePath()));
            return;
        }
        f fVar = new f();
        ?? r12 = f58241i;
        if (r12 != 0) {
            fVar = r12;
        }
        String generate = fVar.generate(str);
        if (file != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(file.getAbsolutePath());
            String str2 = File.separator;
            sb.append(str2);
            sb.append(generate);
            sb.append(".download");
            com.papa.gsyvideoplayer.utils.b.a(sb.toString());
            com.papa.gsyvideoplayer.utils.b.a(file.getAbsolutePath() + str2 + generate);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(q.c(context.getApplicationContext()).getAbsolutePath());
        String str3 = File.separator;
        sb2.append(str3);
        sb2.append(generate);
        sb2.append(".download");
        com.papa.gsyvideoplayer.utils.b.a(sb2.toString());
        com.papa.gsyvideoplayer.utils.b.a(q.c(context.getApplicationContext()).getAbsolutePath() + str3 + generate);
    }

    @Override // com.papa.gsyvideoplayer.cache.b
    public boolean e(Context context, File file, String str) {
        i d5 = d(context.getApplicationContext(), file);
        if (d5 != null) {
            str = d5.j(str);
        }
        return !str.startsWith(com.facebook.common.util.f.f10923a);
    }

    @Override // com.papa.gsyvideoplayer.cache.b
    public boolean f() {
        return this.f58244d;
    }

    @Override // com.danikula.videocache.d
    public void g(File file, String str, int i4) {
        b.a aVar = this.f58245e;
        if (aVar != null) {
            aVar.g(file, str, i4);
        }
    }

    @Override // com.papa.gsyvideoplayer.cache.b
    public void h(Context context, IMediaPlayer iMediaPlayer, String str, Map<String, String> map, File file) {
        Map<String, String> map2 = d.f58247a;
        map2.clear();
        if (map != null) {
            map2.putAll(map);
        }
        if (str.startsWith(com.facebook.common.util.f.f10923a) && !str.contains("127.0.0.1") && !str.contains(".m3u8")) {
            i d5 = d(context.getApplicationContext(), file);
            if (d5 != null) {
                String j4 = d5.j(str);
                boolean z4 = !j4.startsWith(com.facebook.common.util.f.f10923a);
                this.f58244d = z4;
                if (!z4) {
                    d5.p(this, str);
                }
                str = j4;
            }
        } else if (!str.startsWith(com.facebook.common.util.f.f10923a) && !str.startsWith("rtmp") && !str.startsWith("rtsp") && !str.contains(".m3u8")) {
            this.f58244d = true;
        }
        try {
            iMediaPlayer.setDataSource(context, Uri.parse(str), map);
        } catch (IOException e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.papa.gsyvideoplayer.cache.b
    public void i(b.a aVar) {
        this.f58245e = aVar;
    }

    public i k(Context context) {
        return new i.b(context.getApplicationContext()).g(this.f58246f).b();
    }

    public i l(Context context, File file) {
        if (!file.exists()) {
            file.mkdirs();
        }
        i.b bVar = new i.b(context);
        bVar.d(file);
        bVar.i(f58239g);
        bVar.g(this.f58246f);
        com.danikula.videocache.file.c cVar = f58241i;
        if (cVar != null) {
            bVar.f(cVar);
        }
        this.f58243c = file;
        return bVar.b();
    }

    public void n(i iVar) {
        this.f58242b = iVar;
    }

    @Override // com.papa.gsyvideoplayer.cache.b
    public void release() {
        i iVar = this.f58242b;
        if (iVar != null) {
            try {
                iVar.u(this);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }
}
