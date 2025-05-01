package com.facebook.imagepipeline.animated.impl;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import com.facebook.imagepipeline.animated.base.AnimatedDrawableFrameInfo;
/* loaded from: classes2.dex */
public class AnimatedImageCompositor {

    /* renamed from: a  reason: collision with root package name */
    private final com.facebook.imagepipeline.animated.base.a f11582a;

    /* renamed from: b  reason: collision with root package name */
    private final b f11583b;

    /* renamed from: c  reason: collision with root package name */
    private final Paint f11584c;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public enum FrameNeededResult {
        REQUIRED,
        NOT_REQUIRED,
        SKIP,
        ABORT
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f11585a;

        static {
            int[] iArr = new int[FrameNeededResult.values().length];
            f11585a = iArr;
            try {
                iArr[FrameNeededResult.REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11585a[FrameNeededResult.NOT_REQUIRED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11585a[FrameNeededResult.ABORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11585a[FrameNeededResult.SKIP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes2.dex */
    public interface b {
        void a(int i4, Bitmap bitmap);

        com.facebook.common.references.a<Bitmap> b(int i4);
    }

    public AnimatedImageCompositor(com.facebook.imagepipeline.animated.base.a aVar, b bVar) {
        this.f11582a = aVar;
        this.f11583b = bVar;
        Paint paint = new Paint();
        this.f11584c = paint;
        paint.setColor(0);
        paint.setStyle(Paint.Style.FILL);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }

    private void a(Canvas canvas, AnimatedDrawableFrameInfo animatedDrawableFrameInfo) {
        int i4 = animatedDrawableFrameInfo.f11548b;
        int i5 = animatedDrawableFrameInfo.f11549c;
        canvas.drawRect(i4, i5, i4 + animatedDrawableFrameInfo.f11550d, i5 + animatedDrawableFrameInfo.f11551e, this.f11584c);
    }

    private FrameNeededResult b(int i4) {
        AnimatedDrawableFrameInfo e5 = this.f11582a.e(i4);
        AnimatedDrawableFrameInfo.DisposalMethod disposalMethod = e5.f11553g;
        if (disposalMethod == AnimatedDrawableFrameInfo.DisposalMethod.DISPOSE_DO_NOT) {
            return FrameNeededResult.REQUIRED;
        }
        if (disposalMethod == AnimatedDrawableFrameInfo.DisposalMethod.DISPOSE_TO_BACKGROUND) {
            if (c(e5)) {
                return FrameNeededResult.NOT_REQUIRED;
            }
            return FrameNeededResult.REQUIRED;
        } else if (disposalMethod == AnimatedDrawableFrameInfo.DisposalMethod.DISPOSE_TO_PREVIOUS) {
            return FrameNeededResult.SKIP;
        } else {
            return FrameNeededResult.ABORT;
        }
    }

    private boolean c(AnimatedDrawableFrameInfo animatedDrawableFrameInfo) {
        return animatedDrawableFrameInfo.f11548b == 0 && animatedDrawableFrameInfo.f11549c == 0 && animatedDrawableFrameInfo.f11550d == this.f11582a.o() && animatedDrawableFrameInfo.f11551e == this.f11582a.n();
    }

    private boolean d(int i4) {
        if (i4 == 0) {
            return true;
        }
        AnimatedDrawableFrameInfo e5 = this.f11582a.e(i4);
        AnimatedDrawableFrameInfo e6 = this.f11582a.e(i4 - 1);
        if (e5.f11552f == AnimatedDrawableFrameInfo.BlendOperation.NO_BLEND && c(e5)) {
            return true;
        }
        return e6.f11553g == AnimatedDrawableFrameInfo.DisposalMethod.DISPOSE_TO_BACKGROUND && c(e6);
    }

    private int e(int i4, Canvas canvas) {
        while (i4 >= 0) {
            int i5 = a.f11585a[b(i4).ordinal()];
            if (i5 == 1) {
                AnimatedDrawableFrameInfo e5 = this.f11582a.e(i4);
                com.facebook.common.references.a<Bitmap> b5 = this.f11583b.b(i4);
                if (b5 != null) {
                    try {
                        canvas.drawBitmap(b5.k(), 0.0f, 0.0f, (Paint) null);
                        if (e5.f11553g == AnimatedDrawableFrameInfo.DisposalMethod.DISPOSE_TO_BACKGROUND) {
                            a(canvas, e5);
                        }
                        return i4 + 1;
                    } finally {
                        b5.close();
                    }
                } else if (d(i4)) {
                    return i4;
                }
            } else if (i5 == 2) {
                return i4 + 1;
            } else {
                if (i5 == 3) {
                    return i4;
                }
            }
            i4--;
        }
        return 0;
    }

    public void f(int i4, Bitmap bitmap) {
        Canvas canvas = new Canvas(bitmap);
        canvas.drawColor(0, PorterDuff.Mode.SRC);
        for (int e5 = !d(i4) ? e(i4 - 1, canvas) : i4; e5 < i4; e5++) {
            AnimatedDrawableFrameInfo e6 = this.f11582a.e(e5);
            AnimatedDrawableFrameInfo.DisposalMethod disposalMethod = e6.f11553g;
            if (disposalMethod != AnimatedDrawableFrameInfo.DisposalMethod.DISPOSE_TO_PREVIOUS) {
                if (e6.f11552f == AnimatedDrawableFrameInfo.BlendOperation.NO_BLEND) {
                    a(canvas, e6);
                }
                this.f11582a.f(e5, canvas);
                this.f11583b.a(e5, bitmap);
                if (disposalMethod == AnimatedDrawableFrameInfo.DisposalMethod.DISPOSE_TO_BACKGROUND) {
                    a(canvas, e6);
                }
            }
        }
        AnimatedDrawableFrameInfo e7 = this.f11582a.e(i4);
        if (e7.f11552f == AnimatedDrawableFrameInfo.BlendOperation.NO_BLEND) {
            a(canvas, e7);
        }
        this.f11582a.f(i4, canvas);
    }
}
