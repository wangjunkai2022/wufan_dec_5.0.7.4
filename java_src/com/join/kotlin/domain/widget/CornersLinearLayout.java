package com.join.kotlin.domain.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Region;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.join.android.app.mgsim.wufun.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: CornersLinearLayout.kt */
/* loaded from: classes3.dex */
public final class CornersLinearLayout extends LinearLayout {
    private int conner_bottom_left;
    private int conner_bottom_right;
    private int conner_top_left;
    private int conner_top_right;
    @NotNull
    private Paint paint;
    @NotNull
    private RectF rect;
    @NotNull
    private Paint srcpaint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CornersLinearLayout(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.paint = new Paint();
        this.srcpaint = new Paint();
        this.rect = new RectF();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(@Nullable Canvas canvas) {
        Path path = new Path();
        path.addRoundRect(this.rect, this.conner_top_left, this.conner_top_right, Path.Direction.CW);
        RectF rectF = this.rect;
        float f5 = rectF.bottom;
        path.addRect(new RectF(0.0f, f5 / 2, rectF.right, f5), Path.Direction.CW);
        if (canvas != null) {
            canvas.clipPath(path, Region.Op.INTERSECT);
        }
        super.dispatchDraw(canvas);
    }

    public final int getConner_bottom_left() {
        return this.conner_bottom_left;
    }

    public final int getConner_bottom_right() {
        return this.conner_bottom_right;
    }

    public final int getConner_top_left() {
        return this.conner_top_left;
    }

    public final int getConner_top_right() {
        return this.conner_top_right;
    }

    @NotNull
    public final Paint getPaint() {
        return this.paint;
    }

    @NotNull
    public final RectF getRect() {
        return this.rect;
    }

    @NotNull
    public final Paint getSrcpaint() {
        return this.srcpaint;
    }

    public final void init(@NotNull Context context, @NotNull AttributeSet attrs) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, R.styleable.CornersLinearLayout);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.obtainStyledAttr…able.CornersLinearLayout)");
        this.conner_top_left = obtainStyledAttributes.getDimensionPixelOffset(2, 0);
        this.conner_top_right = obtainStyledAttributes.getDimensionPixelOffset(3, 0);
        this.conner_bottom_left = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        this.conner_bottom_right = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        obtainStyledAttributes.recycle();
        this.paint.setAntiAlias(true);
        this.paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        this.srcpaint.setAntiAlias(true);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        super.onLayout(z4, i4, i5, i6, i7);
        this.rect.set(0.0f, 0.0f, getWidth(), getHeight());
    }

    public final void setConner_bottom_left(int i4) {
        this.conner_bottom_left = i4;
    }

    public final void setConner_bottom_right(int i4) {
        this.conner_bottom_right = i4;
    }

    public final void setConner_top_left(int i4) {
        this.conner_top_left = i4;
    }

    public final void setConner_top_right(int i4) {
        this.conner_top_right = i4;
    }

    public final void setPaint(@NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "<set-?>");
        this.paint = paint;
    }

    public final void setRect(@NotNull RectF rectF) {
        Intrinsics.checkNotNullParameter(rectF, "<set-?>");
        this.rect = rectF;
    }

    public final void setSrcpaint(@NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "<set-?>");
        this.srcpaint = paint;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CornersLinearLayout(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.paint = new Paint();
        this.srcpaint = new Paint();
        this.rect = new RectF();
        init(context, attrs);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CornersLinearLayout(@NotNull Context context, @NotNull AttributeSet attrs, int i4) {
        super(context, attrs, i4);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.paint = new Paint();
        this.srcpaint = new Paint();
        this.rect = new RectF();
        init(context, attrs);
    }
}
