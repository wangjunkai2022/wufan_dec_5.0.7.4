package com.join.kotlin.quark.proxy;

import com.join.kotlin.quark.model.bean.SourceListItemBean;
import org.jetbrains.annotations.Nullable;
/* compiled from: SourceHopeItemClickProxy.kt */
/* loaded from: classes3.dex */
public interface SourceHopeItemClickProxy {
    void onUploadSourceClick(@Nullable SourceListItemBean sourceListItemBean);

    void onViewSourceClick(@Nullable SourceListItemBean sourceListItemBean);

    void onWantClick(@Nullable SourceListItemBean sourceListItemBean);
}
