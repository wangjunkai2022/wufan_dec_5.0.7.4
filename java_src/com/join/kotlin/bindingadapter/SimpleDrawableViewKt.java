package com.join.kotlin.bindingadapter;

import androidx.databinding.BindingAdapter;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.common.utils.MyImageLoader;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: SimpleDrawableView.kt */
/* loaded from: classes3.dex */
public final class SimpleDrawableViewKt {
    @BindingAdapter(requireAll = false, value = {"loadResId"})
    public static final void loadResId(@NotNull SimpleDraweeView simpleDraweeView, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(simpleDraweeView, "simpleDraweeView");
        if (num != null) {
            num.intValue();
            if (num.intValue() != 0) {
                simpleDraweeView.setActualImageResource(num.intValue());
            }
        }
    }

    @BindingAdapter(requireAll = false, value = {"loadUrl", "loadGif", "defaultId"})
    public static final void loadUrl(@NotNull SimpleDraweeView simpleDraweeView, @Nullable String str, @Nullable String str2, int i4) {
        Intrinsics.checkNotNullParameter(simpleDraweeView, "simpleDraweeView");
        if (!(str2 == null || str2.length() == 0)) {
            MyImageLoader.n(simpleDraweeView, str2);
        } else if (i4 == 0) {
            MyImageLoader.i(simpleDraweeView, str, simpleDraweeView.getHierarchy().l());
        } else {
            MyImageLoader.e(simpleDraweeView, i4, str, simpleDraweeView.getHierarchy().l());
        }
    }
}
