package com.join.kotlin.bindingadapter;

import android.net.Uri;
import android.widget.ImageView;
import androidx.databinding.BindingAdapter;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ImageViewExt.kt */
/* loaded from: classes3.dex */
public final class ImageViewExtKt {
    @BindingAdapter(requireAll = false, value = {"loadUri"})
    public static final void loadUri(@NotNull ImageView imageView, @Nullable String str) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        imageView.setImageURI(Uri.parse(str));
    }
}
