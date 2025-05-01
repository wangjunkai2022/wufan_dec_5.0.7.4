package com.join.kotlin.discount.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.DataBindingHolder;
import com.join.android.app.mgsim.wufun.R;
import com.join.android.app.mgsim.wufun.databinding.ItemGameDetailCommentLayoutBinding;
import com.join.kotlin.discount.model.bean.CommentDetailBean;
import com.join.kotlin.discount.model.bean.CommentTagBean;
import com.join.kotlin.discount.proxy.ItemGameDetailCommentListClickProxy;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: GameDetailCommentAdapter.kt */
@SourceDebugExtension({"SMAP\nGameDetailCommentAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameDetailCommentAdapter.kt\ncom/join/kotlin/discount/adapter/GameDetailCommentAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,67:1\n1#2:68\n*E\n"})
/* loaded from: classes3.dex */
public final class GameDetailCommentAdapter extends BaseQuickAdapter<CommentDetailBean, DataBindingHolder<ItemGameDetailCommentLayoutBinding>> {
    @Nullable
    private ItemGameDetailCommentListClickProxy click;

    public GameDetailCommentAdapter() {
        super(null, 1, null);
    }

    @Nullable
    public final ItemGameDetailCommentListClickProxy getClick() {
        return this.click;
    }

    public final void setClick(@Nullable ItemGameDetailCommentListClickProxy itemGameDetailCommentListClickProxy) {
        this.click = itemGameDetailCommentListClickProxy;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void onBindViewHolder(@NotNull DataBindingHolder<ItemGameDetailCommentLayoutBinding> holder, int i4, @Nullable CommentDetailBean commentDetailBean) {
        View view;
        ImageView imageView;
        CommentTagBean commentTagBean;
        List<CommentTagBean> tags;
        Object obj;
        boolean z4;
        Integer type;
        ImageView imageView2;
        CommentTagBean commentTagBean2;
        List<CommentTagBean> tags2;
        Object obj2;
        boolean z5;
        Integer type2;
        TextView textView;
        CommentTagBean commentTagBean3;
        List<CommentTagBean> tags3;
        Object obj3;
        boolean z6;
        Integer type3;
        Intrinsics.checkNotNullParameter(holder, "holder");
        ItemGameDetailCommentLayoutBinding a5 = holder.a();
        if (a5 != null) {
            a5.h(commentDetailBean);
        }
        ItemGameDetailCommentLayoutBinding a6 = holder.a();
        if (a6 != null) {
            a6.g(this.click);
        }
        ItemGameDetailCommentLayoutBinding a7 = holder.a();
        if (a7 != null && (textView = a7.f22220i) != null) {
            if (commentDetailBean == null || (tags3 = commentDetailBean.getTags()) == null) {
                commentTagBean3 = null;
            } else {
                Iterator<T> it2 = tags3.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj3 = null;
                        break;
                    }
                    obj3 = it2.next();
                    CommentTagBean commentTagBean4 = (CommentTagBean) obj3;
                    if (commentTagBean4 == null || (type3 = commentTagBean4.getType()) == null || type3.intValue() != 1) {
                        z6 = false;
                        continue;
                    } else {
                        z6 = true;
                        continue;
                    }
                    if (z6) {
                        break;
                    }
                }
                commentTagBean3 = (CommentTagBean) obj3;
            }
            if (commentTagBean3 != null) {
                textView.setText(commentTagBean3.getText());
                textView.setVisibility(0);
            } else {
                textView.setVisibility(8);
            }
        }
        ItemGameDetailCommentLayoutBinding a8 = holder.a();
        if (a8 != null && (imageView2 = a8.f22218g) != null) {
            if (commentDetailBean == null || (tags2 = commentDetailBean.getTags()) == null) {
                commentTagBean2 = null;
            } else {
                Iterator<T> it3 = tags2.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it3.next();
                    CommentTagBean commentTagBean5 = (CommentTagBean) obj2;
                    if (commentTagBean5 == null || (type2 = commentTagBean5.getType()) == null || type2.intValue() != 2) {
                        z5 = false;
                        continue;
                    } else {
                        z5 = true;
                        continue;
                    }
                    if (z5) {
                        break;
                    }
                }
                commentTagBean2 = (CommentTagBean) obj2;
            }
            if (commentTagBean2 != null) {
                imageView2.setVisibility(0);
            } else {
                imageView2.setVisibility(8);
            }
        }
        ItemGameDetailCommentLayoutBinding a9 = holder.a();
        if (a9 != null && (imageView = a9.f22219h) != null) {
            if (commentDetailBean == null || (tags = commentDetailBean.getTags()) == null) {
                commentTagBean = null;
            } else {
                Iterator<T> it4 = tags.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it4.next();
                    CommentTagBean commentTagBean6 = (CommentTagBean) obj;
                    if (commentTagBean6 == null || (type = commentTagBean6.getType()) == null || type.intValue() != 3) {
                        z4 = false;
                        continue;
                    } else {
                        z4 = true;
                        continue;
                    }
                    if (z4) {
                        break;
                    }
                }
                commentTagBean = (CommentTagBean) obj;
            }
            if (commentTagBean != null) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(8);
            }
        }
        if (holder.getLayoutPosition() >= getItemCount() - 1) {
            ItemGameDetailCommentLayoutBinding a10 = holder.a();
            view = a10 != null ? a10.f22215d : null;
            if (view == null) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        ItemGameDetailCommentLayoutBinding a11 = holder.a();
        view = a11 != null ? a11.f22215d : null;
        if (view == null) {
            return;
        }
        view.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    @NotNull
    public DataBindingHolder<ItemGameDetailCommentLayoutBinding> onCreateViewHolder(@NotNull Context context, @NotNull ViewGroup parent, int i4) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new DataBindingHolder<>(R.layout.item_game_detail_comment_layout, parent);
    }
}
