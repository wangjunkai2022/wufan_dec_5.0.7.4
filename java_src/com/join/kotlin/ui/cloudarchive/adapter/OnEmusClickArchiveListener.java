package com.join.kotlin.ui.cloudarchive.adapter;

import android.view.View;
import com.join.mgps.dto.CloudListDataBean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: EmusArchiveAdapter.kt */
/* loaded from: classes3.dex */
public interface OnEmusClickArchiveListener {
    void onClickDislike(@NotNull CloudListDataBean cloudListDataBean);

    void onClickImage(@Nullable String str);

    void onClickMore(@NotNull View view, @NotNull CloudListDataBean cloudListDataBean);

    void onClickRun(@NotNull CloudListDataBean cloudListDataBean);

    void onPraise(@NotNull CloudListDataBean cloudListDataBean);

    void uploadCloud();
}
