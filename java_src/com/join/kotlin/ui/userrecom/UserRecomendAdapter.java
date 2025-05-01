package com.join.kotlin.ui.userrecom;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.join.android.app.mgsim.wufun.R;
import com.join.android.app.mgsim.wufun.databinding.UserRecomendListitemBinding;
import com.join.kotlin.domain.adapter.BaseDataBindingAdapter;
import com.join.kotlin.domain.common.AppListItemShowBean;
import com.join.mgps.business.CollectionBeanSubBusiness;
import com.psk.kotlin.util.CommonListMainData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: UserRecomendAdapter.kt */
/* loaded from: classes3.dex */
public final class UserRecomendAdapter extends BaseDataBindingAdapter<CommonListMainData, UserRecomendListitemBinding> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserRecomendAdapter(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.join.kotlin.domain.adapter.BaseDataBindingAdapter
    protected int getLayoutResId(int i4) {
        return R.layout.user_recomend_listitem;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.join.kotlin.domain.adapter.BaseDataBindingAdapter
    public void onBindItem(@NotNull UserRecomendListitemBinding binding, @NotNull CommonListMainData item, @Nullable RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(item, "item");
        Object any = item.getAny();
        Intrinsics.checkNotNull(any, "null cannot be cast to non-null type com.join.mgps.business.CollectionBeanSubBusiness");
        binding.g((CollectionBeanSubBusiness) any);
        binding.h(new AppListItemShowBean((CollectionBeanSubBusiness) item.getAny(), false));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.join.kotlin.domain.adapter.BaseDataBindingAdapter
    public void onBindItemPayloads(@NotNull UserRecomendListitemBinding binding, @NotNull CommonListMainData item, @Nullable RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(item, "item");
        Object any = item.getAny();
        Intrinsics.checkNotNull(any, "null cannot be cast to non-null type com.join.mgps.business.CollectionBeanSubBusiness");
        binding.g((CollectionBeanSubBusiness) any);
        binding.h(new AppListItemShowBean((CollectionBeanSubBusiness) item.getAny(), true));
    }
}
