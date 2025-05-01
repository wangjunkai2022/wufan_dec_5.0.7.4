package com.join.kotlin.ui.modleregin.adapter;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.join.android.app.component.video.c;
import com.join.android.app.mgsim.wufun.R;
import com.join.android.app.mgsim.wufun.databinding.MustplayItemLayoutBinding;
import com.join.kotlin.domain.adapter.BaseDataBindingAdapter;
import com.join.kotlin.ui.modleregin.modle.MustplayItemBean;
import com.join.kotlin.ui.modleregin.modle.VideoModle;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: MustpalyAdapter.kt */
/* loaded from: classes3.dex */
public final class MustpalyAdapter extends BaseDataBindingAdapter<MustplayItemBean, MustplayItemLayoutBinding> {
    @NotNull
    private final c videoHelper;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MustpalyAdapter(@NotNull Context context, @NotNull c videoHelper) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(videoHelper, "videoHelper");
        this.videoHelper = videoHelper;
    }

    @Override // com.join.kotlin.domain.adapter.BaseDataBindingAdapter
    protected int getLayoutResId(int i4) {
        return R.layout.mustplay_item_layout;
    }

    @NotNull
    public final c getVideoHelper() {
        return this.videoHelper;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.join.kotlin.domain.adapter.BaseDataBindingAdapter
    public void onBindItem(@NotNull MustplayItemLayoutBinding binding, @NotNull MustplayItemBean item, @Nullable RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(item, "item");
        binding.h(item);
        binding.i(new VideoModle(item.getPosition(), item.getVideoUrl(), item.getGameinfo().getIntentDataBean(), item.getVideoCover()));
        binding.j(this.videoHelper);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.join.kotlin.domain.adapter.BaseDataBindingAdapter
    public void onBindItemPayloads(@NotNull MustplayItemLayoutBinding binding, @NotNull MustplayItemBean item, @Nullable RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(item, "item");
        binding.h(item);
        binding.j(this.videoHelper);
        binding.i(new VideoModle(item.getPosition(), item.getVideoUrl(), item.getGameinfo().getIntentDataBean(), item.getVideoCover()));
    }
}
