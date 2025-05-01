package com.join.kotlin.ui.modleregin.adapter;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.mgsim.wufun.R;
import com.join.android.app.mgsim.wufun.databinding.BtListitemBinding;
import com.join.kotlin.domain.adapter.BaseDataBindingAdapter;
import com.join.kotlin.domain.common.AppListItemShowBean;
import com.join.kotlin.ui.modleregin.modle.BtGameListItem;
import com.psk.kotlin.util.CommonListMainData;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: GamelistAdapter.kt */
@SourceDebugExtension({"SMAP\nGamelistAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GamelistAdapter.kt\ncom/join/kotlin/ui/modleregin/adapter/GamelistAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,50:1\n1#2:51\n*E\n"})
/* loaded from: classes3.dex */
public final class GamelistAdapter extends BaseDataBindingAdapter<CommonListMainData, BtListitemBinding> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GamelistAdapter(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.join.kotlin.domain.adapter.BaseDataBindingAdapter
    protected int getLayoutResId(int i4) {
        return R.layout.bt_listitem;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.join.kotlin.domain.adapter.BaseDataBindingAdapter
    public void onBindItem(@NotNull BtListitemBinding binding, @NotNull CommonListMainData item, @Nullable RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(item, "item");
        Object any = item.getAny();
        Intrinsics.checkNotNull(any, "null cannot be cast to non-null type com.join.kotlin.ui.modleregin.modle.BtGameListItem");
        BtGameListItem btGameListItem = (BtGameListItem) any;
        binding.setVariable(3, btGameListItem);
        if (btGameListItem.getAppitemShow() == null) {
            btGameListItem.setAppitemShow(new AppListItemShowBean(btGameListItem.getGameInfo(), false));
            Unit unit = Unit.INSTANCE;
        }
        AppListItemShowBean appitemShow = btGameListItem.getAppitemShow();
        if (appitemShow != null) {
            appitemShow.updateItemNormal(btGameListItem.getGameInfo());
        }
        binding.setVariable(19, btGameListItem.getAppitemShow());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.join.kotlin.domain.adapter.BaseDataBindingAdapter
    public void onBindItemPayloads(@NotNull BtListitemBinding binding, @NotNull CommonListMainData item, @Nullable RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(item, "item");
        Object any = item.getAny();
        Intrinsics.checkNotNull(any, "null cannot be cast to non-null type com.join.kotlin.ui.modleregin.modle.BtGameListItem");
        BtGameListItem btGameListItem = (BtGameListItem) any;
        binding.setVariable(3, btGameListItem);
        if (btGameListItem.getAppitemShow() == null) {
            btGameListItem.setAppitemShow(new AppListItemShowBean(btGameListItem.getGameInfo(), true));
            Unit unit = Unit.INSTANCE;
        }
        AppListItemShowBean appitemShow = btGameListItem.getAppitemShow();
        if (appitemShow != null) {
            DownloadTask downloadTask = btGameListItem.getGameInfo().getDownloadTask();
            Intrinsics.checkNotNullExpressionValue(downloadTask, "data.gameInfo.downloadTask");
            appitemShow.updateItemProgress(downloadTask);
        }
        binding.setVariable(19, btGameListItem.getAppitemShow());
    }
}
