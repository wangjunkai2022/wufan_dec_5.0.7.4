package com.netease.nis.quicklogin.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Movie;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.widget.ImageView;
import com.netease.nis.basesdk.Logger;
@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes5.dex */
public class GifView extends ImageView {

    /* renamed from: a  reason: collision with root package name */
    private Movie f57646a;

    /* renamed from: b  reason: collision with root package name */
    private Canvas f57647b;

    /* renamed from: c  reason: collision with root package name */
    private Bitmap f57648c;

    /* renamed from: d  reason: collision with root package name */
    private BitmapDrawable f57649d;

    /* renamed from: e  reason: collision with root package name */
    private long f57650e;

    public GifView(Context context) {
        super(context);
        this.f57650e = 0L;
    }

    private void a() {
        if (this.f57646a != null) {
            this.f57647b.save();
            long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
            if (this.f57650e == 0) {
                this.f57650e = currentThreadTimeMillis;
            }
            this.f57646a.setTime((int) ((currentThreadTimeMillis - this.f57650e) % this.f57646a.duration()));
            this.f57646a.draw(this.f57647b, 0.0f, 0.0f);
            if (Build.VERSION.SDK_INT >= 16) {
                setBackground(this.f57649d);
            } else {
                setBackgroundDrawable(this.f57649d);
            }
            this.f57647b.restore();
            invalidate();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        a();
    }

    public void setGifDrawable(Drawable drawable) {
        Movie movie;
        if (drawable == null || (movie = this.f57646a) == null) {
            return;
        }
        this.f57648c = Bitmap.createBitmap(movie.width(), this.f57646a.height(), Bitmap.Config.RGB_565);
        this.f57647b = new Canvas(this.f57648c);
        this.f57649d = new BitmapDrawable(this.f57648c);
    }

    public void setGifResId(int i4) {
        if (i4 == 0) {
            Logger.e("[GifView#setGifResId] 0 is not a valid resource id,please check your gif resource name");
            return;
        }
        Movie decodeStream = Movie.decodeStream(getResources().openRawResource(i4));
        this.f57646a = decodeStream;
        this.f57648c = Bitmap.createBitmap(decodeStream.width(), this.f57646a.height(), Bitmap.Config.RGB_565);
        this.f57647b = new Canvas(this.f57648c);
        this.f57649d = new BitmapDrawable(this.f57648c);
    }
}
