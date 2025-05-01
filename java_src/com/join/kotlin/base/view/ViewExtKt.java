package com.join.kotlin.base.view;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import kotlin.Deprecated;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ViewExt.kt */
/* loaded from: classes.dex */
public final class ViewExtKt {
    private static long lastClickTime;

    public static final void clickNoRepeat(@NotNull View view, final long j4, @NotNull final Function1<? super View, Unit> action) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        view.setOnClickListener(new View.OnClickListener() { // from class: com.join.kotlin.base.view.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ViewExtKt.clickNoRepeat$lambda$1(j4, action, view2);
            }
        });
    }

    public static /* synthetic */ void clickNoRepeat$default(View view, long j4, Function1 function1, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            j4 = 500;
        }
        clickNoRepeat(view, j4, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void clickNoRepeat$lambda$1(long j4, Function1 action, View it2) {
        Intrinsics.checkNotNullParameter(action, "$action");
        long currentTimeMillis = System.currentTimeMillis();
        long j5 = lastClickTime;
        if (j5 == 0 || currentTimeMillis - j5 >= j4) {
            lastClickTime = currentTimeMillis;
            Intrinsics.checkNotNullExpressionValue(it2, "it");
            action.invoke(it2);
        }
    }

    @Nullable
    public static final Bitmap createBitmapSafely(int i4, int i5, @NotNull Bitmap.Config config, int i6) {
        Intrinsics.checkNotNullParameter(config, "config");
        try {
            return Bitmap.createBitmap(i4, i5, config);
        } catch (OutOfMemoryError e5) {
            e5.printStackTrace();
            if (i6 > 0) {
                System.gc();
                return createBitmapSafely(i4, i5, config, i6 - 1);
            }
            return null;
        }
    }

    public static final long getLastClickTime() {
        return lastClickTime;
    }

    public static final void gone(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setVisibility(8);
    }

    public static final void invisible(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setVisibility(4);
    }

    public static final void notNull(@Nullable Object obj, @NotNull Function1<Object, Unit> notNullAction, @NotNull Function0<Unit> nullAction1) {
        Intrinsics.checkNotNullParameter(notNullAction, "notNullAction");
        Intrinsics.checkNotNullParameter(nullAction1, "nullAction1");
        if (obj != null) {
            notNullAction.invoke(obj);
        } else {
            nullAction1.invoke();
        }
    }

    public static final void setLastClickTime(long j4) {
        lastClickTime = j4;
    }

    @Deprecated(message = "use View.drawToBitmap()")
    @Nullable
    public static final Bitmap toBitmap(@NotNull View view, float f5, @NotNull Bitmap.Config config) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(config, "config");
        if (view instanceof ImageView) {
            ImageView imageView = (ImageView) view;
            if (imageView.getDrawable() instanceof BitmapDrawable) {
                Drawable drawable = imageView.getDrawable();
                Intrinsics.checkNotNull(drawable, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
                return ((BitmapDrawable) drawable).getBitmap();
            }
        }
        view.clearFocus();
        Bitmap createBitmapSafely = createBitmapSafely((int) (view.getWidth() * f5), (int) (view.getHeight() * f5), config, 1);
        if (createBitmapSafely != null) {
            Canvas canvas = new Canvas();
            canvas.setBitmap(createBitmapSafely);
            canvas.save();
            canvas.drawColor(-1);
            canvas.scale(f5, f5);
            view.draw(canvas);
            canvas.restore();
            canvas.setBitmap(null);
        }
        return createBitmapSafely;
    }

    public static /* synthetic */ Bitmap toBitmap$default(View view, float f5, Bitmap.Config config, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            f5 = 1.0f;
        }
        if ((i4 & 2) != 0) {
            config = Bitmap.Config.ARGB_8888;
        }
        return toBitmap(view, f5, config);
    }

    public static final void visible(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setVisibility(0);
    }

    public static final void visibleOrGone(@NotNull View view, boolean z4) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setVisibility(z4 ? 0 : 8);
    }

    public static final void visibleOrInvisible(@NotNull View view, boolean z4) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setVisibility(z4 ? 0 : 4);
    }
}
