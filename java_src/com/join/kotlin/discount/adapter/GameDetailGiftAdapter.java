package com.join.kotlin.discount.adapter;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseMultiItemAdapter;
import com.chad.library.adapter.base.viewholder.DataBindingHolder;
import com.join.android.app.mgsim.wufun.R;
import com.join.android.app.mgsim.wufun.databinding.ItemDiscountGiftContentBinding;
import com.join.android.app.mgsim.wufun.databinding.ItemDiscountGiftTitleBinding;
import com.join.kotlin.discount.model.bean.GameDetailGiftEntityBean;
import com.join.kotlin.discount.model.bean.GiftItemBean;
import com.join.kotlin.discount.proxy.GameDetailGiftClickProxy;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: GameDetailGiftAdapter.kt */
@SourceDebugExtension({"SMAP\nGameDetailGiftAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameDetailGiftAdapter.kt\ncom/join/kotlin/discount/adapter/GameDetailGiftAdapter\n+ 2 BaseMultiItemAdapter.kt\ncom/chad/library/adapter/base/BaseMultiItemAdapter\n*L\n1#1,74:1\n54#2:75\n54#2:76\n*S KotlinDebug\n*F\n+ 1 GameDetailGiftAdapter.kt\ncom/join/kotlin/discount/adapter/GameDetailGiftAdapter\n*L\n22#1:75\n44#1:76\n*E\n"})
/* loaded from: classes3.dex */
public final class GameDetailGiftAdapter extends BaseMultiItemAdapter<GameDetailGiftEntityBean> {
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int TYPE_GIFT_CONTENT = 2;
    public static final int TYPE_GIFT_TITLE = 1;
    @Nullable
    private GameDetailGiftClickProxy click;

    /* compiled from: GameDetailGiftAdapter.kt */
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public GameDetailGiftAdapter() {
        super(null, 1, null);
        addItemType(1, DataBindingHolder.class, new BaseMultiItemAdapter.b<GameDetailGiftEntityBean, DataBindingHolder<ItemDiscountGiftTitleBinding>>() { // from class: com.join.kotlin.discount.adapter.GameDetailGiftAdapter.1
            @Override // com.chad.library.adapter.base.BaseMultiItemAdapter.b
            public boolean isFullSpanItem(int i4) {
                return BaseMultiItemAdapter.b.a.a(this, i4);
            }

            @Override // com.chad.library.adapter.base.BaseMultiItemAdapter.b
            public boolean onFailedToRecycleView(@NotNull RecyclerView.ViewHolder viewHolder) {
                return BaseMultiItemAdapter.b.a.c(this, viewHolder);
            }

            @Override // com.chad.library.adapter.base.BaseMultiItemAdapter.b
            public void onViewAttachedToWindow(@NotNull RecyclerView.ViewHolder viewHolder) {
                BaseMultiItemAdapter.b.a.d(this, viewHolder);
            }

            @Override // com.chad.library.adapter.base.BaseMultiItemAdapter.b
            public void onViewDetachedFromWindow(@NotNull RecyclerView.ViewHolder viewHolder) {
                BaseMultiItemAdapter.b.a.e(this, viewHolder);
            }

            @Override // com.chad.library.adapter.base.BaseMultiItemAdapter.b
            public void onViewRecycled(@NotNull RecyclerView.ViewHolder viewHolder) {
                BaseMultiItemAdapter.b.a.f(this, viewHolder);
            }

            @Override // com.chad.library.adapter.base.BaseMultiItemAdapter.b
            public /* bridge */ /* synthetic */ void onBind(DataBindingHolder<ItemDiscountGiftTitleBinding> dataBindingHolder, int i4, GameDetailGiftEntityBean gameDetailGiftEntityBean, List list) {
                onBind2(dataBindingHolder, i4, gameDetailGiftEntityBean, (List<? extends Object>) list);
            }

            @Override // com.chad.library.adapter.base.BaseMultiItemAdapter.b
            @NotNull
            public DataBindingHolder<ItemDiscountGiftTitleBinding> onCreate(@NotNull Context context, @NotNull ViewGroup parent, int i4) {
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(parent, "parent");
                return new DataBindingHolder<>(R.layout.item_discount_gift_title, parent);
            }

            /* renamed from: onBind  reason: avoid collision after fix types in other method */
            public void onBind2(@NotNull DataBindingHolder<ItemDiscountGiftTitleBinding> dataBindingHolder, int i4, @Nullable GameDetailGiftEntityBean gameDetailGiftEntityBean, @NotNull List<? extends Object> list) {
                BaseMultiItemAdapter.b.a.b(this, dataBindingHolder, i4, gameDetailGiftEntityBean, list);
            }

            @Override // com.chad.library.adapter.base.BaseMultiItemAdapter.b
            public void onBind(@NotNull DataBindingHolder<ItemDiscountGiftTitleBinding> holder, int i4, @Nullable GameDetailGiftEntityBean gameDetailGiftEntityBean) {
                Object data;
                ItemDiscountGiftTitleBinding a5;
                Intrinsics.checkNotNullParameter(holder, "holder");
                if (gameDetailGiftEntityBean == null || (data = gameDetailGiftEntityBean.getData()) == null || (a5 = holder.a()) == null) {
                    return;
                }
                a5.e((String) data);
            }
        });
        addItemType(2, DataBindingHolder.class, new BaseMultiItemAdapter.b<GameDetailGiftEntityBean, DataBindingHolder<ItemDiscountGiftContentBinding>>() { // from class: com.join.kotlin.discount.adapter.GameDetailGiftAdapter.2
            @Override // com.chad.library.adapter.base.BaseMultiItemAdapter.b
            public boolean isFullSpanItem(int i4) {
                return BaseMultiItemAdapter.b.a.a(this, i4);
            }

            @Override // com.chad.library.adapter.base.BaseMultiItemAdapter.b
            public boolean onFailedToRecycleView(@NotNull RecyclerView.ViewHolder viewHolder) {
                return BaseMultiItemAdapter.b.a.c(this, viewHolder);
            }

            @Override // com.chad.library.adapter.base.BaseMultiItemAdapter.b
            public void onViewAttachedToWindow(@NotNull RecyclerView.ViewHolder viewHolder) {
                BaseMultiItemAdapter.b.a.d(this, viewHolder);
            }

            @Override // com.chad.library.adapter.base.BaseMultiItemAdapter.b
            public void onViewDetachedFromWindow(@NotNull RecyclerView.ViewHolder viewHolder) {
                BaseMultiItemAdapter.b.a.e(this, viewHolder);
            }

            @Override // com.chad.library.adapter.base.BaseMultiItemAdapter.b
            public void onViewRecycled(@NotNull RecyclerView.ViewHolder viewHolder) {
                BaseMultiItemAdapter.b.a.f(this, viewHolder);
            }

            @Override // com.chad.library.adapter.base.BaseMultiItemAdapter.b
            public /* bridge */ /* synthetic */ void onBind(DataBindingHolder<ItemDiscountGiftContentBinding> dataBindingHolder, int i4, GameDetailGiftEntityBean gameDetailGiftEntityBean, List list) {
                onBind2(dataBindingHolder, i4, gameDetailGiftEntityBean, (List<? extends Object>) list);
            }

            @Override // com.chad.library.adapter.base.BaseMultiItemAdapter.b
            @NotNull
            public DataBindingHolder<ItemDiscountGiftContentBinding> onCreate(@NotNull Context context, @NotNull ViewGroup parent, int i4) {
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(parent, "parent");
                return new DataBindingHolder<>(R.layout.item_discount_gift_content, parent);
            }

            /* renamed from: onBind  reason: avoid collision after fix types in other method */
            public void onBind2(@NotNull DataBindingHolder<ItemDiscountGiftContentBinding> dataBindingHolder, int i4, @Nullable GameDetailGiftEntityBean gameDetailGiftEntityBean, @NotNull List<? extends Object> list) {
                BaseMultiItemAdapter.b.a.b(this, dataBindingHolder, i4, gameDetailGiftEntityBean, list);
            }

            @Override // com.chad.library.adapter.base.BaseMultiItemAdapter.b
            public void onBind(@NotNull DataBindingHolder<ItemDiscountGiftContentBinding> holder, int i4, @Nullable GameDetailGiftEntityBean gameDetailGiftEntityBean) {
                Intrinsics.checkNotNullParameter(holder, "holder");
                ItemDiscountGiftContentBinding a5 = holder.a();
                if (a5 != null) {
                    Object data = gameDetailGiftEntityBean != null ? gameDetailGiftEntityBean.getData() : null;
                    Intrinsics.checkNotNull(data, "null cannot be cast to non-null type com.join.kotlin.discount.model.bean.GiftItemBean");
                    a5.h((GiftItemBean) data);
                }
                ItemDiscountGiftContentBinding a6 = holder.a();
                if (a6 == null) {
                    return;
                }
                a6.g(GameDetailGiftAdapter.this.getClick());
            }
        });
        onItemViewType(new BaseMultiItemAdapter.a<GameDetailGiftEntityBean>() { // from class: com.join.kotlin.discount.adapter.GameDetailGiftAdapter.3
            @Override // com.chad.library.adapter.base.BaseMultiItemAdapter.a
            public int onItemViewType(int i4, @NotNull List<? extends GameDetailGiftEntityBean> list) {
                Intrinsics.checkNotNullParameter(list, "list");
                return (i4 < 0 || i4 >= list.size()) ? i4 : list.get(i4).getViewType();
            }
        });
    }

    @Nullable
    public final GameDetailGiftClickProxy getClick() {
        return this.click;
    }

    public final void setClick(@Nullable GameDetailGiftClickProxy gameDetailGiftClickProxy) {
        this.click = gameDetailGiftClickProxy;
    }
}
