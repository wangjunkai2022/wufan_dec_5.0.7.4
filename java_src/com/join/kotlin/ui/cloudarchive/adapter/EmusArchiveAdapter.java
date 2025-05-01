package com.join.kotlin.ui.cloudarchive.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.Display;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.join.android.app.mgsim.wufun.R;
import com.join.android.app.mgsim.wufun.databinding.EmusArchiveGameDetailListItemBinding;
import com.join.kotlin.domain.adapter.BaseDataBindingAdapter;
import com.join.mgps.dto.CloudListDataBean;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: EmusArchiveAdapter.kt */
/* loaded from: classes3.dex */
public final class EmusArchiveAdapter extends BaseDataBindingAdapter<CloudListDataBean, ViewDataBinding> {
    @NotNull
    private Context context;
    private final Display defaultDisplay;
    private final int height;
    @NotNull
    private OnEmusClickArchiveListener listener;
    private final float ratio;
    private final int width;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmusArchiveAdapter(@NotNull Context context, @NotNull OnEmusClickArchiveListener listener) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.context = context;
        this.listener = listener;
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.app.Activity");
        Display defaultDisplay = ((Activity) context).getWindowManager().getDefaultDisplay();
        this.defaultDisplay = defaultDisplay;
        int width = defaultDisplay.getWidth();
        this.width = width;
        int height = defaultDisplay.getHeight();
        this.height = height;
        this.ratio = width > height ? width / height : height / width;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    public final Display getDefaultDisplay() {
        return this.defaultDisplay;
    }

    public final int getHeight() {
        return this.height;
    }

    @Override // com.join.kotlin.domain.adapter.BaseDataBindingAdapter
    protected int getLayoutResId(int i4) {
        return R.layout.emus_archive_game_detail_list_item;
    }

    @NotNull
    public final OnEmusClickArchiveListener getListener() {
        return this.listener;
    }

    public final float getRatio() {
        return this.ratio;
    }

    public final int getWidth() {
        return this.width;
    }

    public final void setContext(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.context = context;
    }

    public final void setListener(@NotNull OnEmusClickArchiveListener onEmusClickArchiveListener) {
        Intrinsics.checkNotNullParameter(onEmusClickArchiveListener, "<set-?>");
        this.listener = onEmusClickArchiveListener;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.join.kotlin.domain.adapter.BaseDataBindingAdapter
    public void onBindItem(@NotNull ViewDataBinding binding, @NotNull CloudListDataBean item, @Nullable RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(item, "item");
        if (binding instanceof EmusArchiveGameDetailListItemBinding) {
            EmusArchiveGameDetailListItemBinding emusArchiveGameDetailListItemBinding = (EmusArchiveGameDetailListItemBinding) binding;
            emusArchiveGameDetailListItemBinding.h(item);
            emusArchiveGameDetailListItemBinding.g(this.listener);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.join.kotlin.domain.adapter.BaseDataBindingAdapter
    public void onBindItemPayloads(@NotNull ViewDataBinding binding, @NotNull CloudListDataBean item, @Nullable RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(item, "item");
        if (binding instanceof EmusArchiveGameDetailListItemBinding) {
            EmusArchiveGameDetailListItemBinding emusArchiveGameDetailListItemBinding = (EmusArchiveGameDetailListItemBinding) binding;
            emusArchiveGameDetailListItemBinding.h(item);
            emusArchiveGameDetailListItemBinding.g(this.listener);
        }
    }
}
