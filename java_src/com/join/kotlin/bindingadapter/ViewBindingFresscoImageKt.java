package com.join.kotlin.bindingadapter;

import androidx.databinding.BindingAdapter;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* compiled from: ViewBindingFresscoImage.kt */
/* loaded from: classes3.dex */
public final class ViewBindingFresscoImageKt {
    @BindingAdapter(requireAll = false, value = {"loadImage"})
    public static final void simpleDraweeViewBinding(@NotNull SimpleDraweeView simpleDraweeView, @NotNull String imageUrl) {
        Intrinsics.checkNotNullParameter(simpleDraweeView, "simpleDraweeView");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        MyImageLoader.d(simpleDraweeView, R.drawable.main_normal_icon, imageUrl);
    }
}
