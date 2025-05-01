package com.join.kotlin.ui.findgame.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.drawee.drawable.r;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.android.app.mgsim.wufun.databinding.ChoiceGamePicListLayoutBinding;
import com.join.android.app.mgsim.wufun.databinding.ChoiceGamelistLayoutBinding;
import com.join.android.app.mgsim.wufun.databinding.ChoiceMainadLayoutBinding;
import com.join.android.app.mgsim.wufun.databinding.ChoiceTagItemLayoutBinding;
import com.join.android.app.mgsim.wufun.databinding.ChoiceTagLayoutBinding;
import com.join.android.app.mgsim.wufun.databinding.ChoiceTitleLayoutBinding;
import com.join.android.app.mgsim.wufun.databinding.GamedetailPicItemBinding;
import com.join.android.app.mgsim.wufun.databinding.GamedetailRecomItemBinding;
import com.join.kotlin.ui.findgame.CategoryDetailListActivity;
import com.join.kotlin.ui.findgame.adapter.FindHomeChoiceAdapter;
import com.join.kotlin.ui.findgame.data.FindChoiceBannerData;
import com.join.kotlin.ui.findgame.data.FindChoiceColloctionListData;
import com.join.kotlin.ui.findgame.data.TagData;
import com.join.mgps.Util.IntentDateBean;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.g2;
import com.join.mgps.business.CollectionBeanSubBusiness;
import com.join.mgps.dto.CollectionBeanSub;
import com.join.mgps.dto.ExtBean;
import com.psk.kotlin.ext.CommonExtKt;
import com.psk.kotlin.util.CommonListMainData;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;
import x1.b;
/* compiled from: FindHomeChoiceAdapter.kt */
/* loaded from: classes3.dex */
public final class FindHomeChoiceAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    @NotNull
    private Context context;
    @NotNull
    private List<CommonListMainData> showdatas;

    /* compiled from: FindHomeChoiceAdapter.kt */
    /* loaded from: classes3.dex */
    public static final class ChoiceAdHolder extends RecyclerView.ViewHolder {
        @NotNull
        private ChoiceMainadLayoutBinding binding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChoiceAdHolder(@NotNull ChoiceMainadLayoutBinding bindingi) {
            super(bindingi.getRoot());
            Intrinsics.checkNotNullParameter(bindingi, "bindingi");
            this.binding = bindingi;
        }

        @NotNull
        public final ChoiceMainadLayoutBinding getBinding() {
            return this.binding;
        }

        public final void setBinding(@NotNull ChoiceMainadLayoutBinding choiceMainadLayoutBinding) {
            Intrinsics.checkNotNullParameter(choiceMainadLayoutBinding, "<set-?>");
            this.binding = choiceMainadLayoutBinding;
        }
    }

    /* compiled from: FindHomeChoiceAdapter.kt */
    /* loaded from: classes3.dex */
    public static final class ChoiceGameItemPicViewHolder extends RecyclerView.ViewHolder {
        @NotNull
        private GamedetailPicItemBinding binding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChoiceGameItemPicViewHolder(@NotNull GamedetailPicItemBinding itemView) {
            super(itemView.getRoot());
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.binding = itemView;
        }

        @NotNull
        public final GamedetailPicItemBinding getBinding() {
            return this.binding;
        }

        public final void setBinding(@NotNull GamedetailPicItemBinding gamedetailPicItemBinding) {
            Intrinsics.checkNotNullParameter(gamedetailPicItemBinding, "<set-?>");
            this.binding = gamedetailPicItemBinding;
        }
    }

    /* compiled from: FindHomeChoiceAdapter.kt */
    /* loaded from: classes3.dex */
    public static final class ChoiceGameItemViewHolder extends RecyclerView.ViewHolder {
        @NotNull
        private GamedetailRecomItemBinding binding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChoiceGameItemViewHolder(@NotNull GamedetailRecomItemBinding itemView) {
            super(itemView.getRoot());
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.binding = itemView;
        }

        @NotNull
        public final GamedetailRecomItemBinding getBinding() {
            return this.binding;
        }

        public final void setBinding(@NotNull GamedetailRecomItemBinding gamedetailRecomItemBinding) {
            Intrinsics.checkNotNullParameter(gamedetailRecomItemBinding, "<set-?>");
            this.binding = gamedetailRecomItemBinding;
        }
    }

    /* compiled from: FindHomeChoiceAdapter.kt */
    /* loaded from: classes3.dex */
    public static final class ChoiceGameListAdapter extends RecyclerView.Adapter<ChoiceGameItemViewHolder> {
        @NotNull
        private Context context;
        @NotNull
        private List<CollectionBeanSub> tagList;

        public ChoiceGameListAdapter(@NotNull Context context, @NotNull List<CollectionBeanSub> tagList) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(tagList, "tagList");
            this.context = context;
            this.tagList = tagList;
        }

        @NotNull
        public final Context getContext() {
            return this.context;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.tagList.size();
        }

        @NotNull
        public final List<CollectionBeanSub> getTagList() {
            return this.tagList;
        }

        public final void setContext(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "<set-?>");
            this.context = context;
        }

        public final void setTagList(@NotNull List<CollectionBeanSub> list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.tagList = list;
        }

        /* JADX WARN: Type inference failed for: r4v1, types: [T, java.lang.Object] */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(@NotNull ChoiceGameItemViewHolder p02, int i4) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = this.tagList.get(i4);
            MyImageLoader.h(p02.getBinding().f20813c, ((CollectionBeanSub) objectRef.element).getIco_remote());
            p02.getBinding().f20814d.setText(((CollectionBeanSub) objectRef.element).getGame_name());
            LinearLayout root = p02.getBinding().getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "p0.binding.root");
            CommonExtKt.onClick(root, new Function0<Unit>() { // from class: com.join.kotlin.ui.findgame.adapter.FindHomeChoiceAdapter$ChoiceGameListAdapter$onBindViewHolder$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    IntentUtil.getInstance().goGameDetialActivity(FindHomeChoiceAdapter.ChoiceGameListAdapter.this.getContext(), objectRef.element.getGame_id(), objectRef.element.get_from_type());
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NotNull
        public ChoiceGameItemViewHolder onCreateViewHolder(@NotNull ViewGroup p02, int i4) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            GamedetailRecomItemBinding inflate = GamedetailRecomItemBinding.inflate(LayoutInflater.from(this.context), p02, false);
            Intrinsics.checkNotNullExpressionValue(inflate, "inflate(\n               …, false\n                )");
            return new ChoiceGameItemViewHolder(inflate);
        }
    }

    /* compiled from: FindHomeChoiceAdapter.kt */
    /* loaded from: classes3.dex */
    public static final class ChoiceGamePicListAdapter extends RecyclerView.Adapter<ChoiceGameItemPicViewHolder> {
        @NotNull
        private Context context;
        @NotNull
        private List<CollectionBeanSub> tagList;

        public ChoiceGamePicListAdapter(@NotNull Context context, @NotNull List<CollectionBeanSub> tagList) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(tagList, "tagList");
            this.context = context;
            this.tagList = tagList;
        }

        @NotNull
        public final Context getContext() {
            return this.context;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.tagList.size();
        }

        @NotNull
        public final List<CollectionBeanSub> getTagList() {
            return this.tagList;
        }

        public final void setContext(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "<set-?>");
            this.context = context;
        }

        public final void setTagList(@NotNull List<CollectionBeanSub> list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.tagList = list;
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(@NotNull ChoiceGameItemPicViewHolder p02, int i4) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            ?? r12 = this.tagList.get(i4);
            objectRef.element = r12;
            if (g2.i(((CollectionBeanSub) r12).getGame_info_top_pic())) {
                MyImageLoader.h(p02.getBinding().f20810c, ((CollectionBeanSub) objectRef.element).getGame_info_top_pic());
            } else if (((CollectionBeanSub) objectRef.element).getPic_info() != null && ((CollectionBeanSub) objectRef.element).getPic_info().size() > 0) {
                MyImageLoader.h(p02.getBinding().f20810c, ((CollectionBeanSub) objectRef.element).getPic_info().get(0).getRemote().getPath());
            }
            p02.getBinding().f20811d.setText(((CollectionBeanSub) objectRef.element).getGame_name());
            LinearLayout root = p02.getBinding().getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "p0.binding.root");
            CommonExtKt.onClick(root, new Function0<Unit>() { // from class: com.join.kotlin.ui.findgame.adapter.FindHomeChoiceAdapter$ChoiceGamePicListAdapter$onBindViewHolder$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    IntentUtil.getInstance().goGameDetialActivity(FindHomeChoiceAdapter.ChoiceGamePicListAdapter.this.getContext(), objectRef.element.getGame_id(), objectRef.element.get_from_type());
                }
            });
            ViewGroup.LayoutParams layoutParams = p02.getBinding().f20810c.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            if (i4 == getItemCount() - 1) {
                layoutParams2.rightMargin = (int) this.context.getResources().getDimension(R.dimen.wdp17);
            } else {
                layoutParams2.rightMargin = 0;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NotNull
        public ChoiceGameItemPicViewHolder onCreateViewHolder(@NotNull ViewGroup p02, int i4) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            GamedetailPicItemBinding inflate = GamedetailPicItemBinding.inflate(LayoutInflater.from(this.context), p02, false);
            Intrinsics.checkNotNullExpressionValue(inflate, "inflate(\n               …, false\n                )");
            return new ChoiceGameItemPicViewHolder(inflate);
        }
    }

    /* compiled from: FindHomeChoiceAdapter.kt */
    /* loaded from: classes3.dex */
    public static final class ChoiceGamePicListViewHolder extends RecyclerView.ViewHolder {
        @NotNull
        private ChoiceGamePicListLayoutBinding binding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChoiceGamePicListViewHolder(@NotNull ChoiceGamePicListLayoutBinding itemView) {
            super(itemView.getRoot());
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.binding = itemView;
        }

        @NotNull
        public final ChoiceGamePicListLayoutBinding getBinding() {
            return this.binding;
        }

        public final void setBinding(@NotNull ChoiceGamePicListLayoutBinding choiceGamePicListLayoutBinding) {
            Intrinsics.checkNotNullParameter(choiceGamePicListLayoutBinding, "<set-?>");
            this.binding = choiceGamePicListLayoutBinding;
        }
    }

    /* compiled from: FindHomeChoiceAdapter.kt */
    /* loaded from: classes3.dex */
    public static final class ChoiceGamelistHolder extends RecyclerView.ViewHolder {
        @NotNull
        private ChoiceGamelistLayoutBinding binding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChoiceGamelistHolder(@NotNull ChoiceGamelistLayoutBinding bindingi) {
            super(bindingi.getRoot());
            Intrinsics.checkNotNullParameter(bindingi, "bindingi");
            this.binding = bindingi;
        }

        @NotNull
        public final ChoiceGamelistLayoutBinding getBinding() {
            return this.binding;
        }

        public final void setBinding(@NotNull ChoiceGamelistLayoutBinding choiceGamelistLayoutBinding) {
            Intrinsics.checkNotNullParameter(choiceGamelistLayoutBinding, "<set-?>");
            this.binding = choiceGamelistLayoutBinding;
        }
    }

    /* compiled from: FindHomeChoiceAdapter.kt */
    /* loaded from: classes3.dex */
    public static final class ChoiceTagHolder extends RecyclerView.ViewHolder {
        @NotNull
        private ChoiceTagLayoutBinding binding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChoiceTagHolder(@NotNull ChoiceTagLayoutBinding bindingi) {
            super(bindingi.getRoot());
            Intrinsics.checkNotNullParameter(bindingi, "bindingi");
            this.binding = bindingi;
        }

        @NotNull
        public final ChoiceTagLayoutBinding getBinding() {
            return this.binding;
        }

        public final void setBinding(@NotNull ChoiceTagLayoutBinding choiceTagLayoutBinding) {
            Intrinsics.checkNotNullParameter(choiceTagLayoutBinding, "<set-?>");
            this.binding = choiceTagLayoutBinding;
        }
    }

    /* compiled from: FindHomeChoiceAdapter.kt */
    /* loaded from: classes3.dex */
    public static final class ChoiceTitleHolder extends RecyclerView.ViewHolder {
        @NotNull
        private ChoiceTitleLayoutBinding binding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChoiceTitleHolder(@NotNull ChoiceTitleLayoutBinding bindingi) {
            super(bindingi.getRoot());
            Intrinsics.checkNotNullParameter(bindingi, "bindingi");
            this.binding = bindingi;
        }

        @NotNull
        public final ChoiceTitleLayoutBinding getBinding() {
            return this.binding;
        }

        public final void setBinding(@NotNull ChoiceTitleLayoutBinding choiceTitleLayoutBinding) {
            Intrinsics.checkNotNullParameter(choiceTitleLayoutBinding, "<set-?>");
            this.binding = choiceTitleLayoutBinding;
        }
    }

    /* compiled from: FindHomeChoiceAdapter.kt */
    /* loaded from: classes3.dex */
    public static final class FindChoiceType {
        public static final int AD = 3;
        @NotNull
        public static final Companion Companion = new Companion(null);
        public static final int GAMEICONLIST = 5;
        public static final int GAME_PIC_LIST = 6;
        public static final int TAG = 4;

        /* compiled from: FindHomeChoiceAdapter.kt */
        /* loaded from: classes3.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    public FindHomeChoiceAdapter(@NotNull Context context, @NotNull List<CommonListMainData> showdatas) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(showdatas, "showdatas");
        this.context = context;
        this.showdatas = showdatas;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.showdatas.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i4) {
        return this.showdatas.get(i4).getType();
    }

    @NotNull
    public final List<CommonListMainData> getShowdatas() {
        return this.showdatas;
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [com.join.mgps.business.CollectionBeanSubBusiness, T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v5, types: [T, com.join.kotlin.ui.findgame.data.FindChoiceColloctionListData] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, int i4) {
        String str;
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        int itemViewType = getItemViewType(i4);
        if (itemViewType == 1) {
            ChoiceTitleHolder choiceTitleHolder = (ChoiceTitleHolder) viewHolder;
            if (this.showdatas.get(i4).getAny() instanceof String) {
                Object any = this.showdatas.get(i4).getAny();
                Intrinsics.checkNotNull(any, "null cannot be cast to non-null type kotlin.String");
                str = (String) any;
                choiceTitleHolder.getBinding().f17833c.setVisibility(8);
            } else if (this.showdatas.get(i4).getAny() instanceof FindChoiceColloctionListData) {
                choiceTitleHolder.getBinding().f17833c.setVisibility(0);
                final Ref.ObjectRef objectRef = new Ref.ObjectRef();
                Object any2 = this.showdatas.get(i4).getAny();
                Intrinsics.checkNotNull(any2, "null cannot be cast to non-null type com.join.kotlin.ui.findgame.data.FindChoiceColloctionListData");
                ?? r8 = (FindChoiceColloctionListData) any2;
                objectRef.element = r8;
                str = ((FindChoiceColloctionListData) r8).getTitle();
                Intrinsics.checkNotNullExpressionValue(str, "da.title");
                TextView textView = choiceTitleHolder.getBinding().f17833c;
                Intrinsics.checkNotNullExpressionValue(textView, "viewHolder.binding.more");
                CommonExtKt.onClick(textView, new Function0<Unit>() { // from class: com.join.kotlin.ui.findgame.adapter.FindHomeChoiceAdapter$onBindViewHolder$3
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        if ("461506587".equals(objectRef.element.getComponent_id())) {
                            IntentDateBean intentDateBean = new IntentDateBean();
                            intentDateBean.setLink_type(29);
                            intentDateBean.setCrc_link_type_val(objectRef.element.getComponent_id());
                            ExtBean extBean = new ExtBean();
                            extBean.setFrom("3");
                            intentDateBean.setExtBean(extBean);
                            IntentUtil.getInstance().intentActivity(this.getContext(), intentDateBean);
                            return;
                        }
                        IntentUtil.getInstance().goColloctionList(this.getContext(), objectRef.element.getTpl_type(), objectRef.element.getComponent_id());
                    }
                });
            } else {
                str = "";
            }
            choiceTitleHolder.getBinding().f17834d.setText(str);
        } else if (itemViewType == 3) {
            Object any3 = this.showdatas.get(i4).getAny();
            Intrinsics.checkNotNull(any3, "null cannot be cast to non-null type com.join.kotlin.ui.findgame.data.FindChoiceBannerData");
            FindChoiceBannerData findChoiceBannerData = (FindChoiceBannerData) any3;
            ChoiceAdHolder choiceAdHolder = (ChoiceAdHolder) viewHolder;
            final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            ?? game_info = findChoiceBannerData.getGame_info();
            Intrinsics.checkNotNullExpressionValue(game_info, "showData.game_info");
            objectRef2.element = game_info;
            choiceAdHolder.getBinding().f17825d.setDownloadNormalCallback(new b(this.context, ((CollectionBeanSubBusiness) objectRef2.element).getDownloadTask(), (CollectionBeanSub) objectRef2.element));
            MyImageLoader.q(choiceAdHolder.getBinding().f17824c, findChoiceBannerData.getPic(), r.c.f11300g, R.drawable.banner_normal_icon);
            choiceAdHolder.getBinding().f17826e.setText(((CollectionBeanSubBusiness) objectRef2.element).getInfo());
            choiceAdHolder.getBinding().f17827f.setText(((CollectionBeanSubBusiness) objectRef2.element).getGame_name());
            RelativeLayout root = choiceAdHolder.getBinding().getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "viewHolder.binding.root");
            CommonExtKt.onClick(root, new Function0<Unit>() { // from class: com.join.kotlin.ui.findgame.adapter.FindHomeChoiceAdapter$onBindViewHolder$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    IntentUtil.getInstance().goGameDetialActivity(FindHomeChoiceAdapter.this.getContext(), objectRef2.element.getGame_id(), objectRef2.element.get_from_type());
                }
            });
        } else if (itemViewType == 4) {
            Object any4 = this.showdatas.get(i4).getAny();
            Intrinsics.checkNotNull(any4, "null cannot be cast to non-null type kotlin.collections.MutableList<com.join.kotlin.ui.findgame.data.TagData>");
            List<TagData> asMutableList = TypeIntrinsics.asMutableList(any4);
            ChoiceTagHolder choiceTagHolder = (ChoiceTagHolder) viewHolder;
            choiceTagHolder.getBinding().f17831c.removeAllViews();
            for (final TagData tagData : asMutableList) {
                ChoiceTagItemLayoutBinding inflate = ChoiceTagItemLayoutBinding.inflate(LayoutInflater.from(this.context));
                Intrinsics.checkNotNullExpressionValue(inflate, "inflate(LayoutInflater.from(context))");
                choiceTagHolder.getBinding().f17831c.addView(inflate.getRoot());
                LinearLayout root2 = inflate.getRoot();
                Intrinsics.checkNotNullExpressionValue(root2, "v.root");
                CommonExtKt.onClick(root2, new Function0<Unit>() { // from class: com.join.kotlin.ui.findgame.adapter.FindHomeChoiceAdapter$onBindViewHolder$2
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        Intent intent = new Intent(FindHomeChoiceAdapter.this.getContext(), CategoryDetailListActivity.class);
                        intent.putExtra("typeId", tagData.getType());
                        intent.putExtra("tagId", tagData.getId());
                        intent.putExtra("tagName", tagData.getTitle());
                        Context context = FindHomeChoiceAdapter.this.getContext();
                        if (context != null) {
                            context.startActivity(intent);
                        }
                    }
                });
                inflate.f17829c.setText(tagData.getTitle());
            }
        } else if (itemViewType == 5) {
            Object any5 = this.showdatas.get(i4).getAny();
            Intrinsics.checkNotNull(any5, "null cannot be cast to non-null type kotlin.collections.MutableList<com.join.mgps.dto.CollectionBeanSub>");
            List asMutableList2 = TypeIntrinsics.asMutableList(any5);
            RecyclerView recyclerView = ((ChoiceGamelistHolder) viewHolder).getBinding().f17812c;
            Intrinsics.checkNotNullExpressionValue(recyclerView, "viewHolder.binding.recycleView");
            recyclerView.setLayoutManager(new LinearLayoutManager(this.context, 0, false));
            recyclerView.setAdapter(new ChoiceGameListAdapter(this.context, asMutableList2));
        } else if (itemViewType == 6) {
            Object any6 = this.showdatas.get(i4).getAny();
            Intrinsics.checkNotNull(any6, "null cannot be cast to non-null type kotlin.collections.MutableList<com.join.mgps.dto.CollectionBeanSub>");
            List asMutableList3 = TypeIntrinsics.asMutableList(any6);
            RecyclerView recyclerView2 = ((ChoiceGamePicListViewHolder) viewHolder).getBinding().f17810c;
            Intrinsics.checkNotNullExpressionValue(recyclerView2, "viewHolder.binding.recycleView");
            recyclerView2.setLayoutManager(new LinearLayoutManager(this.context, 0, false));
            recyclerView2.setAdapter(new ChoiceGamePicListAdapter(this.context, asMutableList3));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup viewGroup, int i4) {
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        if (i4 == 1) {
            ChoiceTitleLayoutBinding inflate = ChoiceTitleLayoutBinding.inflate(LayoutInflater.from(this.context), viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(inflate, "inflate(\n               …lse\n                    )");
            return new ChoiceTitleHolder(inflate);
        } else if (i4 == 3) {
            ChoiceMainadLayoutBinding inflate2 = ChoiceMainadLayoutBinding.inflate(LayoutInflater.from(this.context), viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(inflate2, "inflate(\n               …lse\n                    )");
            return new ChoiceAdHolder(inflate2);
        } else if (i4 == 4) {
            ChoiceTagLayoutBinding inflate3 = ChoiceTagLayoutBinding.inflate(LayoutInflater.from(this.context), viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(inflate3, "inflate(\n               …lse\n                    )");
            return new ChoiceTagHolder(inflate3);
        } else if (i4 == 5) {
            ChoiceGamelistLayoutBinding inflate4 = ChoiceGamelistLayoutBinding.inflate(LayoutInflater.from(this.context), viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(inflate4, "inflate(\n               …lse\n                    )");
            return new ChoiceGamelistHolder(inflate4);
        } else if (i4 != 6) {
            ChoiceMainadLayoutBinding inflate5 = ChoiceMainadLayoutBinding.inflate(LayoutInflater.from(this.context), viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(inflate5, "inflate(\n               …      false\n            )");
            return new ChoiceAdHolder(inflate5);
        } else {
            ChoiceGamePicListLayoutBinding inflate6 = ChoiceGamePicListLayoutBinding.inflate(LayoutInflater.from(this.context), viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(inflate6, "inflate(\n               …lse\n                    )");
            return new ChoiceGamePicListViewHolder(inflate6);
        }
    }

    public final void setContext(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.context = context;
    }

    public final void setShowdatas(@NotNull List<CommonListMainData> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.showdatas = list;
    }
}
