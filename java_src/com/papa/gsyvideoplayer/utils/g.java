package com.papa.gsyvideoplayer.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.ThumbnailUtils;
import com.papa.gsyvideoplayer.video.StandardGSYVideoPlayer;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
/* compiled from: GifCreateHelper.java */
/* loaded from: classes5.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    private boolean f58447a;

    /* renamed from: b  reason: collision with root package name */
    private StandardGSYVideoPlayer f58448b;

    /* renamed from: c  reason: collision with root package name */
    private c f58449c;

    /* renamed from: d  reason: collision with root package name */
    private Timer f58450d;

    /* renamed from: e  reason: collision with root package name */
    private List<String> f58451e;

    /* renamed from: f  reason: collision with root package name */
    private File f58452f;

    /* renamed from: g  reason: collision with root package name */
    private s2.c f58453g;

    /* renamed from: h  reason: collision with root package name */
    private int f58454h;

    /* renamed from: i  reason: collision with root package name */
    private int f58455i;

    /* renamed from: j  reason: collision with root package name */
    private int f58456j;

    /* renamed from: k  reason: collision with root package name */
    private int f58457k;

    /* compiled from: GifCreateHelper.java */
    /* loaded from: classes5.dex */
    class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ File f58458b;

        a(File file) {
            this.f58458b = file;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (g.this.f58451e.size() <= 2) {
                g.this.f58453g.a(false, null);
                return;
            }
            g gVar = g.this;
            gVar.j(this.f58458b, gVar.f58451e, g.this.f58454h, g.this.f58455i, g.this.f58456j, g.this.f58453g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GifCreateHelper.java */
    /* loaded from: classes5.dex */
    public class b implements s2.f {
        b() {
        }

        @Override // s2.f
        public void a(boolean z4, File file) {
            g.this.f58447a = true;
            if (z4) {
                com.papa.gsyvideoplayer.utils.c.e(" SUCCESS CREATE FILE " + file.getAbsolutePath());
                g.this.f58451e.add(file.getAbsolutePath());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: GifCreateHelper.java */
    /* loaded from: classes5.dex */
    public class c extends TimerTask {
        private c() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            if (g.this.f58447a) {
                g.this.f58447a = false;
                g.this.l();
            }
        }

        /* synthetic */ c(g gVar, a aVar) {
            this();
        }
    }

    public g(StandardGSYVideoPlayer standardGSYVideoPlayer, s2.c cVar) {
        this(standardGSYVideoPlayer, cVar, 0, 1, 5, 50);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        File file = this.f58452f;
        this.f58448b.saveFrame(new File(file, "GSY-TMP-FRAME" + System.currentTimeMillis() + ".tmp"), new b());
    }

    public void i() {
        c cVar = this.f58449c;
        if (cVar != null) {
            cVar.cancel();
            this.f58449c = null;
        }
    }

    public void j(File file, List<String> list, int i4, int i5, int i6, s2.c cVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        com.papa.gsyvideoplayer.utils.a aVar = new com.papa.gsyvideoplayer.utils.a();
        aVar.o(byteArrayOutputStream);
        aVar.l(0);
        aVar.g(i4);
        int i7 = 0;
        while (i7 < list.size()) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inSampleSize = i5;
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(list.get(i7), options);
            double d5 = options.outWidth;
            double d6 = i6;
            Double.isNaN(d5);
            Double.isNaN(d6);
            int i8 = i7;
            double d7 = options.outHeight;
            Double.isNaN(d7);
            Double.isNaN(d6);
            options.inJustDecodeBounds = false;
            Bitmap decodeFile = BitmapFactory.decodeFile(list.get(i8), options);
            Bitmap extractThumbnail = ThumbnailUtils.extractThumbnail(decodeFile, (int) (d5 / d6), (int) (d7 / d6));
            aVar.a(extractThumbnail);
            decodeFile.recycle();
            extractThumbnail.recycle();
            i7 = i8 + 1;
            cVar.b(i7, list.size());
        }
        aVar.d();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file.getPath());
            byteArrayOutputStream.writeTo(fileOutputStream);
            byteArrayOutputStream.flush();
            fileOutputStream.flush();
            byteArrayOutputStream.close();
            fileOutputStream.close();
            cVar.a(true, file);
        } catch (IOException e5) {
            e5.printStackTrace();
            cVar.a(false, file);
        }
    }

    public void k(File file) {
        this.f58452f = file;
        i();
        this.f58451e.clear();
        c cVar = new c(this, null);
        this.f58449c = cVar;
        this.f58450d.schedule(cVar, 0L, this.f58457k);
    }

    public void m(File file) {
        i();
        this.f58447a = true;
        new Thread(new a(file)).start();
    }

    public g(StandardGSYVideoPlayer standardGSYVideoPlayer, s2.c cVar, int i4, int i5, int i6, int i7) {
        this.f58447a = true;
        this.f58450d = new Timer();
        this.f58451e = new ArrayList();
        this.f58454h = 0;
        this.f58455i = 1;
        this.f58456j = 5;
        this.f58457k = 50;
        this.f58448b = standardGSYVideoPlayer;
        this.f58453g = cVar;
        this.f58454h = i4;
        this.f58455i = i5;
        this.f58456j = i6;
        this.f58457k = i7;
    }
}
