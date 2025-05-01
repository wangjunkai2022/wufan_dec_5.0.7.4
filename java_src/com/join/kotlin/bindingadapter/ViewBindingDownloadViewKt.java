package com.join.kotlin.bindingadapter;

import androidx.databinding.BindingAdapter;
import com.join.mgps.business.CollectionBeanSubBusiness;
import com.join.mgps.customview.DownloadViewNormal;
import com.join.mgps.customview.DownloadViewStroke;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* compiled from: ViewBindingDownloadView.kt */
/* loaded from: classes3.dex */
public final class ViewBindingDownloadViewKt {
    @BindingAdapter(requireAll = false, value = {"initData", "listStatus"})
    public static final void downloadVIewBinding(@NotNull DownloadViewStroke downloadView, @NotNull CollectionBeanSubBusiness collectionBeanSubBusiness, int i4) {
        Intrinsics.checkNotNullParameter(downloadView, "downloadView");
        Intrinsics.checkNotNullParameter(collectionBeanSubBusiness, "collectionBeanSubBusiness");
        downloadView.a(collectionBeanSubBusiness.getDownloadTask(), collectionBeanSubBusiness);
    }

    @BindingAdapter(requireAll = false, value = {"initData", "listStatus"})
    public static final void downloadVIewBinding(@NotNull DownloadViewNormal downloadView, @NotNull CollectionBeanSubBusiness collectionBeanSubBusiness, int i4) {
        Intrinsics.checkNotNullParameter(downloadView, "downloadView");
        Intrinsics.checkNotNullParameter(collectionBeanSubBusiness, "collectionBeanSubBusiness");
        downloadView.a(collectionBeanSubBusiness.getDownloadTask(), collectionBeanSubBusiness);
    }
}
