package com.join.android.app.component.album.lib;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.collection.LruCache;
import com.facebook.common.internal.k;
import com.facebook.imagepipeline.cache.q;
import com.facebook.imagepipeline.core.ImagePipelineConfig;
import com.join.mgps.Util.l0;
import java.lang.reflect.Field;
import java.util.LinkedList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
/* loaded from: classes.dex */
public class ImageLoader {

    /* renamed from: k  reason: collision with root package name */
    private static int f15086k = 10485760;

    /* renamed from: l  reason: collision with root package name */
    private static ImageLoader f15087l;

    /* renamed from: a  reason: collision with root package name */
    private LruCache<String, Bitmap> f15088a;

    /* renamed from: b  reason: collision with root package name */
    private ExecutorService f15089b;

    /* renamed from: e  reason: collision with root package name */
    private LinkedList<Runnable> f15092e;

    /* renamed from: f  reason: collision with root package name */
    private Thread f15093f;

    /* renamed from: g  reason: collision with root package name */
    private Handler f15094g;

    /* renamed from: h  reason: collision with root package name */
    private Handler f15095h;

    /* renamed from: j  reason: collision with root package name */
    private volatile Semaphore f15097j;

    /* renamed from: c  reason: collision with root package name */
    private int f15090c = 1;

    /* renamed from: d  reason: collision with root package name */
    private Type f15091d = Type.LIFO;

    /* renamed from: i  reason: collision with root package name */
    private volatile Semaphore f15096i = new Semaphore(0);

    /* loaded from: classes3.dex */
    public enum Type {
        FIFO,
        LIFO
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements k<q> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ q f15098a;

        a(q qVar) {
            this.f15098a = qVar;
        }

        @Override // com.facebook.common.internal.k
        /* renamed from: a */
        public q get() {
            return this.f15098a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b extends Thread {

        /* loaded from: classes3.dex */
        class a extends Handler {
            a() {
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                ImageLoader.this.f15089b.execute(ImageLoader.this.s());
                try {
                    ImageLoader.this.f15097j.acquire();
                } catch (InterruptedException unused) {
                }
            }
        }

        b() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Looper.prepare();
            ImageLoader.this.f15094g = new a();
            ImageLoader.this.f15096i.release();
            Looper.loop();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class c extends LruCache<String, Bitmap> {
        c(int i4) {
            super(i4);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.collection.LruCache
        /* renamed from: a */
        public int sizeOf(String str, Bitmap bitmap) {
            return bitmap.getRowBytes() * bitmap.getHeight();
        }
    }

    /* loaded from: classes3.dex */
    class d extends Handler {
        d() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            g gVar = (g) message.obj;
            ImageView imageView = gVar.f15110b;
            Bitmap bitmap = gVar.f15109a;
            if (imageView.getTag().toString().equals(gVar.f15111c)) {
                imageView.setImageBitmap(bitmap);
            }
        }
    }

    /* loaded from: classes3.dex */
    class e implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ImageView f15103b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f15104c;

        e(ImageView imageView, String str) {
            this.f15103b = imageView;
            this.f15104c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            f p4 = ImageLoader.this.p(this.f15103b);
            ImageLoader.this.i(this.f15104c, ImageLoader.this.l(this.f15104c, p4.f15106a, p4.f15107b));
            g gVar = new g(ImageLoader.this, null);
            gVar.f15109a = ImageLoader.this.m(this.f15104c);
            gVar.f15110b = this.f15103b;
            gVar.f15111c = this.f15104c;
            Message obtain = Message.obtain();
            obtain.obj = gVar;
            ImageLoader.this.f15095h.sendMessage(obtain);
            ImageLoader.this.f15097j.release();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class f {

        /* renamed from: a  reason: collision with root package name */
        int f15106a;

        /* renamed from: b  reason: collision with root package name */
        int f15107b;

        private f() {
        }

        /* synthetic */ f(ImageLoader imageLoader, a aVar) {
            this();
        }
    }

    /* loaded from: classes3.dex */
    private class g {

        /* renamed from: a  reason: collision with root package name */
        Bitmap f15109a;

        /* renamed from: b  reason: collision with root package name */
        ImageView f15110b;

        /* renamed from: c  reason: collision with root package name */
        String f15111c;

        private g() {
        }

        /* synthetic */ g(ImageLoader imageLoader, a aVar) {
            this();
        }
    }

    public ImageLoader(int i4, Type type) {
        t(i4, type);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(String str, Bitmap bitmap) {
        if (m(str) != null || bitmap == null) {
            return;
        }
        this.f15088a.put(str, bitmap);
    }

    private synchronized void j(Runnable runnable) {
        try {
            if (this.f15094g == null) {
                this.f15096i.acquire();
            }
        } catch (InterruptedException unused) {
        }
        this.f15092e.add(runnable);
        this.f15094g.sendEmptyMessage(272);
    }

    private static ImagePipelineConfig n(Context context) {
        int i4 = f15086k;
        a aVar = new a(new q(i4, Integer.MAX_VALUE, i4, Integer.MAX_VALUE, Integer.MAX_VALUE));
        ImagePipelineConfig.Builder newBuilder = ImagePipelineConfig.newBuilder(context);
        newBuilder.setBitmapMemoryCacheParamsSupplier(aVar);
        return newBuilder.build();
    }

    private static int o(Object obj, String str) {
        try {
            Field declaredField = ImageView.class.getDeclaredField(str);
            declaredField.setAccessible(true);
            int intValue = ((Integer) declaredField.get(obj)).intValue();
            if (intValue <= 0 || intValue >= Integer.MAX_VALUE) {
                return 0;
            }
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(intValue);
                sb.append("");
            } catch (Exception unused) {
            }
            return intValue;
        } catch (Exception unused2) {
            return 0;
        }
    }

    public static ImageLoader q() {
        if (f15087l == null) {
            synchronized (ImageLoader.class) {
                if (f15087l == null) {
                    f15087l = new ImageLoader(1, Type.LIFO);
                }
            }
        }
        return f15087l;
    }

    public static ImageLoader r(int i4, Type type) {
        if (f15087l == null) {
            synchronized (ImageLoader.class) {
                if (f15087l == null) {
                    f15087l = new ImageLoader(i4, type);
                }
            }
        }
        return f15087l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized Runnable s() {
        Type type = this.f15091d;
        if (type == Type.FIFO) {
            return this.f15092e.removeFirst();
        } else if (type == Type.LIFO) {
            return this.f15092e.removeLast();
        } else {
            return null;
        }
    }

    private void t(int i4, Type type) {
        b bVar = new b();
        this.f15093f = bVar;
        bVar.start();
        this.f15088a = new c(((int) Runtime.getRuntime().maxMemory()) / 8);
        this.f15089b = Executors.newFixedThreadPool(i4);
        this.f15097j = new Semaphore(i4);
        this.f15092e = new LinkedList<>();
        if (type == null) {
            type = Type.LIFO;
        }
        this.f15091d = type;
    }

    public static void u(Context context) {
        l0.m(context, 40);
    }

    public void h(String str, Bitmap bitmap) {
        i(str, bitmap);
    }

    public int k(BitmapFactory.Options options, int i4, int i5) {
        int i6 = options.outWidth;
        int i7 = options.outHeight;
        if (i6 <= i4 || i7 <= i5) {
            return 1;
        }
        float f5 = i6 / i4;
        return Math.max(Math.round(f5), Math.round(f5));
    }

    public Bitmap l(String str, int i4, int i5) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        options.inSampleSize = k(options, i4, i5);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeFile(str, options);
    }

    public Bitmap m(String str) {
        return this.f15088a.get(str);
    }

    public f p(ImageView imageView) {
        f fVar = new f(this, null);
        DisplayMetrics displayMetrics = imageView.getContext().getResources().getDisplayMetrics();
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        int width = layoutParams.width == -2 ? 0 : imageView.getWidth();
        if (width <= 0) {
            width = layoutParams.width;
        }
        if (width <= 0) {
            width = o(imageView, "mMaxWidth");
        }
        if (width <= 0) {
            width = displayMetrics.widthPixels;
        }
        int height = layoutParams.height != -2 ? imageView.getHeight() : 0;
        if (height <= 0) {
            height = layoutParams.height;
        }
        if (height <= 0) {
            height = o(imageView, "mMaxHeight");
        }
        if (height <= 0) {
            height = displayMetrics.heightPixels;
        }
        fVar.f15106a = width;
        fVar.f15107b = height;
        return fVar;
    }

    public void v(String str, ImageView imageView) {
        imageView.setTag(str);
        if (this.f15095h == null) {
            this.f15095h = new d();
        }
        Bitmap m4 = m(str);
        if (m4 != null) {
            g gVar = new g(this, null);
            gVar.f15109a = m4;
            gVar.f15110b = imageView;
            gVar.f15111c = str;
            Message obtain = Message.obtain();
            obtain.obj = gVar;
            this.f15095h.sendMessage(obtain);
            return;
        }
        j(new e(imageView, str));
    }

    public void w(String str) {
        this.f15088a.remove(str);
    }
}
