package com.join.mgps.customview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.RelativeLayout;
/* loaded from: classes4.dex */
public class ClipImageLayout extends RelativeLayout {

    /* renamed from: b  reason: collision with root package name */
    private ClipZoomImageView f46554b;

    /* renamed from: c  reason: collision with root package name */
    private ClipImageBorderView f46555c;

    /* renamed from: d  reason: collision with root package name */
    private int f46556d;

    public ClipImageLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f46556d = 2;
        this.f46554b = new ClipZoomImageView(context);
        this.f46555c = new ClipImageBorderView(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        addView(this.f46554b, layoutParams);
        addView(this.f46555c, layoutParams);
        int applyDimension = (int) TypedValue.applyDimension(1, this.f46556d, getResources().getDisplayMetrics());
        this.f46556d = applyDimension;
        this.f46554b.setHorizontalPadding(applyDimension);
        this.f46555c.setHorizontalPadding(this.f46556d);
    }

    private BitmapFactory.Options b(int i4) {
        System.gc();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPurgeable = true;
        options.inSampleSize = i4;
        return options;
    }

    public Bitmap a() {
        return this.f46554b.h();
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x00e9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.graphics.Bitmap c(android.content.Context r8, java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.customview.ClipImageLayout.c(android.content.Context, java.lang.String):android.graphics.Bitmap");
    }

    public ClipImageBorderView getmClipImageView() {
        return this.f46555c;
    }

    public ClipZoomImageView getmZoomImageView() {
        return this.f46554b;
    }

    public void setHorizontalPadding(int i4) {
        this.f46556d = i4;
    }

    public void setmClipImageView(ClipImageBorderView clipImageBorderView) {
        this.f46555c = clipImageBorderView;
    }

    public void setmZoomImageView(String str) {
        this.f46554b.setImageBitmap(BitmapFactory.decodeFile(str, b(2)));
    }
}
