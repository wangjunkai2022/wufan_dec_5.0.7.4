package com.join.mgps.ptr.header;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Transformation;
import com.facebook.common.statfs.StatFsHelper;
import com.join.mgps.ptr.PtrFrameLayout;
import com.join.mgps.ptr.PtrUIHeader;
import java.util.ArrayList;
/* loaded from: classes4.dex */
public class StoreHouseHeader extends PtrUIHeader {

    /* renamed from: b  reason: collision with root package name */
    public ArrayList<c> f53748b;

    /* renamed from: c  reason: collision with root package name */
    private int f53749c;

    /* renamed from: d  reason: collision with root package name */
    private float f53750d;

    /* renamed from: e  reason: collision with root package name */
    private int f53751e;

    /* renamed from: f  reason: collision with root package name */
    private float f53752f;

    /* renamed from: g  reason: collision with root package name */
    private int f53753g;

    /* renamed from: h  reason: collision with root package name */
    private float f53754h;

    /* renamed from: i  reason: collision with root package name */
    private int f53755i;

    /* renamed from: j  reason: collision with root package name */
    private int f53756j;

    /* renamed from: k  reason: collision with root package name */
    private int f53757k;

    /* renamed from: l  reason: collision with root package name */
    private int f53758l;

    /* renamed from: m  reason: collision with root package name */
    private float f53759m;

    /* renamed from: n  reason: collision with root package name */
    private float f53760n;

    /* renamed from: o  reason: collision with root package name */
    private float f53761o;

    /* renamed from: p  reason: collision with root package name */
    private int f53762p;

    /* renamed from: q  reason: collision with root package name */
    private int f53763q;

    /* renamed from: r  reason: collision with root package name */
    private int f53764r;

    /* renamed from: s  reason: collision with root package name */
    private Transformation f53765s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f53766t;

    /* renamed from: u  reason: collision with root package name */
    private b f53767u;

    /* renamed from: v  reason: collision with root package name */
    private int f53768v;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        private int f53769b;

        /* renamed from: c  reason: collision with root package name */
        private int f53770c;

        /* renamed from: d  reason: collision with root package name */
        private int f53771d;

        /* renamed from: e  reason: collision with root package name */
        private int f53772e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f53773f;

        private b() {
            this.f53769b = 0;
            this.f53770c = 0;
            this.f53771d = 0;
            this.f53772e = 0;
            this.f53773f = true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c() {
            this.f53773f = true;
            this.f53769b = 0;
            this.f53772e = StoreHouseHeader.this.f53762p / StoreHouseHeader.this.f53748b.size();
            this.f53770c = StoreHouseHeader.this.f53763q / this.f53772e;
            this.f53771d = (StoreHouseHeader.this.f53748b.size() / this.f53770c) + 1;
            run();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d() {
            this.f53773f = false;
            StoreHouseHeader.this.removeCallbacks(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            int i4 = this.f53769b % this.f53770c;
            for (int i5 = 0; i5 < this.f53771d; i5++) {
                int i6 = (this.f53770c * i5) + i4;
                if (i6 <= this.f53769b) {
                    c cVar = StoreHouseHeader.this.f53748b.get(i6 % StoreHouseHeader.this.f53748b.size());
                    cVar.setFillAfter(false);
                    cVar.setFillEnabled(true);
                    cVar.setFillBefore(false);
                    cVar.setDuration(StoreHouseHeader.this.f53764r);
                    cVar.f(StoreHouseHeader.this.f53760n, StoreHouseHeader.this.f53761o);
                }
            }
            this.f53769b++;
            if (this.f53773f) {
                StoreHouseHeader.this.postDelayed(this, this.f53772e);
            }
        }
    }

    public StoreHouseHeader(Context context) {
        super(context);
        this.f53748b = new ArrayList<>();
        this.f53749c = -1;
        this.f53750d = 1.0f;
        this.f53751e = -1;
        this.f53752f = 0.7f;
        this.f53753g = -1;
        this.f53754h = 0.0f;
        this.f53755i = 0;
        this.f53756j = 0;
        this.f53757k = 0;
        this.f53758l = 0;
        this.f53759m = 0.4f;
        this.f53760n = 1.0f;
        this.f53761o = 0.4f;
        this.f53762p = 1000;
        this.f53763q = 1000;
        this.f53764r = StatFsHelper.f10899h;
        this.f53765s = new Transformation();
        this.f53766t = false;
        this.f53767u = new b();
        this.f53768v = -1;
        l();
    }

    private int getBottomOffset() {
        return getPaddingBottom() + com.join.mgps.ptr.util.b.b(10.0f);
    }

    private int getTopOffset() {
        return getPaddingTop() + com.join.mgps.ptr.util.b.b(10.0f);
    }

    private void k() {
        this.f53766t = true;
        this.f53767u.c();
        invalidate();
    }

    private void l() {
        com.join.mgps.ptr.util.b.c(getContext());
        this.f53749c = com.join.mgps.ptr.util.b.b(1.0f);
        this.f53751e = com.join.mgps.ptr.util.b.b(40.0f);
        this.f53753g = com.join.mgps.ptr.util.b.f53900a / 2;
    }

    private void q() {
        this.f53766t = false;
        this.f53767u.d();
    }

    private void setProgress(float f5) {
        this.f53754h = f5;
    }

    @Override // com.join.mgps.ptr.PtrUIHeader, com.join.mgps.ptr.c
    public void a(PtrFrameLayout ptrFrameLayout) {
        q();
    }

    @Override // com.join.mgps.ptr.PtrUIHeader, com.join.mgps.ptr.c
    public void b(PtrFrameLayout ptrFrameLayout, boolean z4, byte b5, com.join.mgps.ptr.indicator.a aVar) {
        setProgress(Math.min(1.0f, aVar.c()));
        invalidate();
    }

    @Override // com.join.mgps.ptr.PtrUIHeader, com.join.mgps.ptr.c
    public void c(PtrFrameLayout ptrFrameLayout) {
        q();
        for (int i4 = 0; i4 < this.f53748b.size(); i4++) {
            this.f53748b.get(i4).b(this.f53753g);
        }
    }

    @Override // com.join.mgps.ptr.PtrUIHeader, com.join.mgps.ptr.c
    public void d(PtrFrameLayout ptrFrameLayout) {
    }

    @Override // com.join.mgps.ptr.PtrUIHeader, com.join.mgps.ptr.c
    public void e(PtrFrameLayout ptrFrameLayout) {
        k();
    }

    public int getLoadingAniDuration() {
        return this.f53762p;
    }

    public float getScale() {
        return this.f53750d;
    }

    public void m(ArrayList<float[]> arrayList) {
        boolean z4 = this.f53748b.size() > 0;
        this.f53748b.clear();
        float f5 = 0.0f;
        float f6 = 0.0f;
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            float[] fArr = arrayList.get(i4);
            PointF pointF = new PointF(com.join.mgps.ptr.util.b.b(fArr[0]) * this.f53750d, com.join.mgps.ptr.util.b.b(fArr[1]) * this.f53750d);
            PointF pointF2 = new PointF(com.join.mgps.ptr.util.b.b(fArr[2]) * this.f53750d, com.join.mgps.ptr.util.b.b(fArr[3]) * this.f53750d);
            f5 = Math.max(Math.max(f5, pointF.x), pointF2.x);
            f6 = Math.max(Math.max(f6, pointF.y), pointF2.y);
            c cVar = new c(i4, pointF, pointF2, this.f53768v, this.f53749c);
            cVar.b(this.f53753g);
            this.f53748b.add(cVar);
        }
        this.f53755i = (int) Math.ceil(f5);
        this.f53756j = (int) Math.ceil(f6);
        if (z4) {
            requestLayout();
        }
    }

    public void n(String str) {
        o(str, 25);
    }

    public void o(String str, int i4) {
        m(d.c(str, i4 * 0.01f, 14));
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f5 = this.f53754h;
        int save = canvas.save();
        int size = this.f53748b.size();
        for (int i4 = 0; i4 < size; i4++) {
            canvas.save();
            c cVar = this.f53748b.get(i4);
            PointF pointF = cVar.f53863b;
            float f6 = this.f53757k + pointF.x;
            float f7 = this.f53758l + pointF.y;
            if (this.f53766t) {
                cVar.getTransformation(getDrawingTime(), this.f53765s);
                canvas.translate(f6, f7);
            } else if (f5 == 0.0f) {
                cVar.b(this.f53753g);
            } else {
                float f8 = this.f53752f;
                float f9 = ((1.0f - f8) * i4) / size;
                float f10 = (1.0f - f8) - f9;
                if (f5 != 1.0f && f5 < 1.0f - f10) {
                    float min = f5 > f9 ? Math.min(1.0f, (f5 - f9) / f8) : 0.0f;
                    float f11 = 1.0f - min;
                    float f12 = f6 + (cVar.f53864c * f11);
                    float f13 = f7 + ((-this.f53751e) * f11);
                    Matrix matrix = new Matrix();
                    matrix.postRotate(360.0f * min);
                    matrix.postScale(min, min);
                    matrix.postTranslate(f12, f13);
                    cVar.c(this.f53759m * min);
                    canvas.concat(matrix);
                } else {
                    canvas.translate(f6, f7);
                    cVar.c(this.f53759m);
                }
            }
            cVar.a(canvas);
            canvas.restore();
        }
        if (this.f53766t) {
            invalidate();
        }
        canvas.restoreToCount(save);
    }

    @Override // android.view.View
    protected void onMeasure(int i4, int i5) {
        super.onMeasure(i4, View.MeasureSpec.makeMeasureSpec(getTopOffset() + this.f53756j + getBottomOffset(), 1073741824));
        this.f53757k = (getMeasuredWidth() - this.f53755i) / 2;
        this.f53758l = getTopOffset();
        this.f53751e = getTopOffset();
    }

    public void p(int i4) {
        String[] stringArray = getResources().getStringArray(i4);
        ArrayList<float[]> arrayList = new ArrayList<>();
        for (String str : stringArray) {
            String[] split = str.split(",");
            float[] fArr = new float[4];
            for (int i5 = 0; i5 < 4; i5++) {
                fArr[i5] = Float.parseFloat(split[i5]);
            }
            arrayList.add(fArr);
        }
        m(arrayList);
    }

    public StoreHouseHeader r(int i4) {
        this.f53751e = i4;
        return this;
    }

    public StoreHouseHeader s(int i4) {
        this.f53749c = i4;
        for (int i5 = 0; i5 < this.f53748b.size(); i5++) {
            this.f53748b.get(i5).e(i4);
        }
        return this;
    }

    public void setLoadingAniDuration(int i4) {
        this.f53762p = i4;
        this.f53763q = i4;
    }

    public void setScale(float f5) {
        this.f53750d = f5;
    }

    public StoreHouseHeader t(int i4) {
        this.f53768v = i4;
        for (int i5 = 0; i5 < this.f53748b.size(); i5++) {
            this.f53748b.get(i5).d(i4);
        }
        return this;
    }

    public StoreHouseHeader(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f53748b = new ArrayList<>();
        this.f53749c = -1;
        this.f53750d = 1.0f;
        this.f53751e = -1;
        this.f53752f = 0.7f;
        this.f53753g = -1;
        this.f53754h = 0.0f;
        this.f53755i = 0;
        this.f53756j = 0;
        this.f53757k = 0;
        this.f53758l = 0;
        this.f53759m = 0.4f;
        this.f53760n = 1.0f;
        this.f53761o = 0.4f;
        this.f53762p = 1000;
        this.f53763q = 1000;
        this.f53764r = StatFsHelper.f10899h;
        this.f53765s = new Transformation();
        this.f53766t = false;
        this.f53767u = new b();
        this.f53768v = -1;
        l();
    }

    public StoreHouseHeader(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f53748b = new ArrayList<>();
        this.f53749c = -1;
        this.f53750d = 1.0f;
        this.f53751e = -1;
        this.f53752f = 0.7f;
        this.f53753g = -1;
        this.f53754h = 0.0f;
        this.f53755i = 0;
        this.f53756j = 0;
        this.f53757k = 0;
        this.f53758l = 0;
        this.f53759m = 0.4f;
        this.f53760n = 1.0f;
        this.f53761o = 0.4f;
        this.f53762p = 1000;
        this.f53763q = 1000;
        this.f53764r = StatFsHelper.f10899h;
        this.f53765s = new Transformation();
        this.f53766t = false;
        this.f53767u = new b();
        this.f53768v = -1;
        l();
    }
}
