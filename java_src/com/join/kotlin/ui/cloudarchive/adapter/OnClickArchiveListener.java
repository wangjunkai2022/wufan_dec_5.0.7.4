package com.join.kotlin.ui.cloudarchive.adapter;

import android.view.View;
import com.join.kotlin.ui.cloudarchive.data.ArchiveData;
import com.join.mgps.dto.DomainInfoBean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ModArchiveAdapter.kt */
/* loaded from: classes3.dex */
public interface OnClickArchiveListener {
    void onClickDislike(@NotNull ArchiveData archiveData);

    void onClickDomain(@Nullable DomainInfoBean domainInfoBean);

    void onClickImage(@Nullable String str);

    void onClickMore(@NotNull View view, @NotNull ArchiveData archiveData);

    void onClickRun(@NotNull ArchiveData archiveData);

    void onPraise(@NotNull ArchiveData archiveData);

    void uploadCloud();
}
