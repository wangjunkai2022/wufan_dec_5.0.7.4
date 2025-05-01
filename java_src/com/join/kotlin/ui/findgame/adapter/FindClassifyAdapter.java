package com.join.kotlin.ui.findgame.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.drawee.drawable.r;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.databinding.ChoiceTitleLayoutBinding;
import com.join.android.app.mgsim.wufun.databinding.ClassifyDiscountTypeLayoutBinding;
import com.join.android.app.mgsim.wufun.databinding.ClassifyGameiconItemBinding;
import com.join.android.app.mgsim.wufun.databinding.ClassifyMainadLayoutBinding;
import com.join.kotlin.ui.findgame.data.FindChoiceBannerData;
import com.join.kotlin.ui.findgame.data.FindChoiceColloctionListData;
import com.join.mgps.Util.IntentDateBean;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.business.CollectionBeanSubBusiness;
import com.join.mgps.dto.CollectionBeanSub;
import com.join.mgps.dto.CommonGameInfoBean;
import com.join.mgps.dto.ExtBean;
import com.psk.kotlin.ext.CommonExtKt;
import com.psk.kotlin.util.CommonListMainData;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
/* compiled from: FindClassifyAdapter.kt */
/* loaded from: classes3.dex */
public final class FindClassifyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    @NotNull
    private Context context;
    @NotNull
    private List<CommonListMainData> showdatas;

    /* compiled from: FindClassifyAdapter.kt */
    /* loaded from: classes3.dex */
    public static final class ChoiceAdHolder extends RecyclerView.ViewHolder {
        @NotNull
        private ClassifyMainadLayoutBinding binding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChoiceAdHolder(@NotNull ClassifyMainadLayoutBinding bindingi) {
            super(bindingi.getRoot());
            Intrinsics.checkNotNullParameter(bindingi, "bindingi");
            this.binding = bindingi;
        }

        @NotNull
        public final ClassifyMainadLayoutBinding getBinding() {
            return this.binding;
        }

        public final void setBinding(@NotNull ClassifyMainadLayoutBinding classifyMainadLayoutBinding) {
            Intrinsics.checkNotNullParameter(classifyMainadLayoutBinding, "<set-?>");
            this.binding = classifyMainadLayoutBinding;
        }
    }

    /* compiled from: FindClassifyAdapter.kt */
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

    /* compiled from: FindClassifyAdapter.kt */
    /* loaded from: classes3.dex */
    public static final class ClassifyGameItemViewHolder extends RecyclerView.ViewHolder {
        @NotNull
        private ClassifyGameiconItemBinding binding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ClassifyGameItemViewHolder(@NotNull ClassifyGameiconItemBinding itemView) {
            super(itemView.getRoot());
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.binding = itemView;
        }

        @NotNull
        public final ClassifyGameiconItemBinding getBinding() {
            return this.binding;
        }

        public final void setBinding(@NotNull ClassifyGameiconItemBinding classifyGameiconItemBinding) {
            Intrinsics.checkNotNullParameter(classifyGameiconItemBinding, "<set-?>");
            this.binding = classifyGameiconItemBinding;
        }
    }

    /* compiled from: FindClassifyAdapter.kt */
    /* loaded from: classes3.dex */
    public static final class DiscountTypeHolder extends RecyclerView.ViewHolder {
        @NotNull
        private ClassifyDiscountTypeLayoutBinding binding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DiscountTypeHolder(@NotNull ClassifyDiscountTypeLayoutBinding bindingi) {
            super(bindingi.getRoot());
            Intrinsics.checkNotNullParameter(bindingi, "bindingi");
            this.binding = bindingi;
        }

        @NotNull
        public final ClassifyDiscountTypeLayoutBinding getBinding() {
            return this.binding;
        }

        public final void setBinding(@NotNull ClassifyDiscountTypeLayoutBinding classifyDiscountTypeLayoutBinding) {
            Intrinsics.checkNotNullParameter(classifyDiscountTypeLayoutBinding, "<set-?>");
            this.binding = classifyDiscountTypeLayoutBinding;
        }
    }

    /* compiled from: FindClassifyAdapter.kt */
    /* loaded from: classes3.dex */
    public static final class FindClassifyType {
        public static final int AD = 3;
        @NotNull
        public static final Companion Companion = new Companion(null);
        public static final int DISCOUNT_TYPE = 7;
        public static final int GAMEICONLIST = 5;
        public static final int GAMETEXTTYPE = 7;
        public static final int GAMETYPE = 6;

        /* compiled from: FindClassifyAdapter.kt */
        /* loaded from: classes3.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    public FindClassifyAdapter(@NotNull Context context, @NotNull List<CommonListMainData> showdatas) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(showdatas, "showdatas");
        this.context = context;
        this.showdatas = showdatas;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$2(FindClassifyAdapter this$0, CommonGameInfoBean commonGameInfoBean, View view) {
        IntentDateBean intentDateBean;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IntentUtil intentUtil = IntentUtil.getInstance();
        Context context = this$0.context;
        if (commonGameInfoBean == null || (intentDateBean = commonGameInfoBean.getIntentDataBean()) == null) {
            intentDateBean = null;
        } else {
            ExtBean extBean = intentDateBean.getExtBean();
            extBean.setKeepOrginFrom(true);
            extBean.setOrginFrom("208");
            Unit unit = Unit.INSTANCE;
        }
        intentUtil.intentActivity(context, intentDateBean);
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
    /* JADX WARN: Type inference failed for: r7v28, types: [T, com.join.mgps.dto.CollectionBeanSub] */
    /* JADX WARN: Type inference failed for: r7v5, types: [T, com.join.kotlin.ui.findgame.data.FindChoiceColloctionListData] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolderx, int i4) {
        String str;
        Intrinsics.checkNotNullParameter(viewHolderx, "viewHolderx");
        int itemViewType = getItemViewType(i4);
        if (itemViewType == 1) {
            ChoiceTitleHolder choiceTitleHolder = (ChoiceTitleHolder) viewHolderx;
            if (this.showdatas.get(i4).getAny() instanceof String) {
                Object any = this.showdatas.get(i4).getAny();
                Intrinsics.checkNotNull(any, "null cannot be cast to non-null type kotlin.String");
                str = (String) any;
                choiceTitleHolder.getBinding().f17833c.setVisibility(8);
            } else if (this.showdatas.get(i4).getAny() instanceof FindChoiceColloctionListData) {
                final Ref.ObjectRef objectRef = new Ref.ObjectRef();
                Object any2 = this.showdatas.get(i4).getAny();
                Intrinsics.checkNotNull(any2, "null cannot be cast to non-null type com.join.kotlin.ui.findgame.data.FindChoiceColloctionListData");
                ?? r7 = (FindChoiceColloctionListData) any2;
                objectRef.element = r7;
                str = ((FindChoiceColloctionListData) r7).getTitle();
                Intrinsics.checkNotNullExpressionValue(str, "da.title");
                TextView textView = choiceTitleHolder.getBinding().f17833c;
                Intrinsics.checkNotNullExpressionValue(textView, "viewHolder.binding.more");
                CommonExtKt.onClick(textView, new Function0<Unit>() { // from class: com.join.kotlin.ui.findgame.adapter.FindClassifyAdapter$onBindViewHolder$3
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
                        IntentUtil.getInstance().goColloctionList(FindClassifyAdapter.this.getContext(), objectRef.element.getTpl_type(), objectRef.element.getComponent_id());
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
            ChoiceAdHolder choiceAdHolder = (ChoiceAdHolder) viewHolderx;
            final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            ?? game_info = findChoiceBannerData.getGame_info();
            Intrinsics.checkNotNullExpressionValue(game_info, "showData.game_info");
            objectRef2.element = game_info;
            choiceAdHolder.getBinding().f17898d.a(((CollectionBeanSubBusiness) objectRef2.element).getDownloadTask(), (CollectionBeanSub) objectRef2.element);
            MyImageLoader.p(choiceAdHolder.getBinding().f17897c, findChoiceBannerData.getPic(), r.c.f11300g);
            MyImageLoader.h(choiceAdHolder.getBinding().f17899e, ((CollectionBeanSubBusiness) objectRef2.element).getIco_remote());
            choiceAdHolder.getBinding().f17900f.setText(((CollectionBeanSubBusiness) objectRef2.element).getInfo());
            choiceAdHolder.getBinding().f17901g.setText(((CollectionBeanSubBusiness) objectRef2.element).getGame_name());
            RelativeLayout root = choiceAdHolder.getBinding().getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "viewHolder.binding.root");
            CommonExtKt.onClick(root, new Function0<Unit>() { // from class: com.join.kotlin.ui.findgame.adapter.FindClassifyAdapter$onBindViewHolder$1
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
                    IntentUtil.getInstance().goGameDetialActivity(FindClassifyAdapter.this.getContext(), objectRef2.element.getGame_id(), objectRef2.element.get_from_type());
                }
            });
        } else if (itemViewType != 5) {
            if (itemViewType != 7) {
                return;
            }
            final CommonGameInfoBean commonGameInfoBean = (CommonGameInfoBean) this.showdatas.get(i4).getAny();
            DiscountTypeHolder discountTypeHolder = (DiscountTypeHolder) viewHolderx;
            MyImageLoader.n(discountTypeHolder.getBinding().f17853c, commonGameInfoBean != null ? commonGameInfoBean.getBig_pic() : null);
            discountTypeHolder.getBinding().f17854d.setText(commonGameInfoBean != null ? commonGameInfoBean.getTitle() : null);
            discountTypeHolder.getBinding().getRoot().setOnClickListener(new View.OnClickListener() { // from class: com.join.kotlin.ui.findgame.adapter.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FindClassifyAdapter.onBindViewHolder$lambda$2(FindClassifyAdapter.this, commonGameInfoBean, view);
                }
            });
        } else {
            final Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
            Object any4 = this.showdatas.get(i4).getAny();
            Intrinsics.checkNotNull(any4, "null cannot be cast to non-null type com.join.mgps.dto.CollectionBeanSub");
            objectRef3.element = (CollectionBeanSub) any4;
            ClassifyGameItemViewHolder classifyGameItemViewHolder = (ClassifyGameItemViewHolder) viewHolderx;
            MyImageLoader.h(classifyGameItemViewHolder.getBinding().f17856c, ((CollectionBeanSub) objectRef3.element).getIco_remote());
            classifyGameItemViewHolder.getBinding().f17857d.setText(((CollectionBeanSub) objectRef3.element).getGame_name());
            LinearLayout root2 = classifyGameItemViewHolder.getBinding().getRoot();
            Intrinsics.checkNotNullExpressionValue(root2, "viewHolder.binding.root");
            CommonExtKt.onClick(root2, new Function0<Unit>() { // from class: com.join.kotlin.ui.findgame.adapter.FindClassifyAdapter$onBindViewHolder$2
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
                    IntentUtil.getInstance().goGameDetialActivity(FindClassifyAdapter.this.getContext(), objectRef3.element.getGame_id(), objectRef3.element.get_from_type());
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup viewGroup, int i4) {
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        if (i4 == 1) {
            ChoiceTitleLayoutBinding inflate = ChoiceTitleLayoutBinding.inflate(LayoutInflater.from(this.context), viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(inflate, "inflate(LayoutInflater.f…ntext), viewGroup, false)");
            return new ChoiceTitleHolder(inflate);
        } else if (i4 == 3) {
            ClassifyMainadLayoutBinding inflate2 = ClassifyMainadLayoutBinding.inflate(LayoutInflater.from(this.context), viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(inflate2, "inflate(LayoutInflater.f…ntext), viewGroup, false)");
            return new ChoiceAdHolder(inflate2);
        } else if (i4 == 5) {
            ClassifyGameiconItemBinding inflate3 = ClassifyGameiconItemBinding.inflate(LayoutInflater.from(this.context), viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(inflate3, "inflate(LayoutInflater.f…ntext), viewGroup, false)");
            return new ClassifyGameItemViewHolder(inflate3);
        } else if (i4 != 7) {
            ChoiceTitleLayoutBinding inflate4 = ChoiceTitleLayoutBinding.inflate(LayoutInflater.from(this.context), viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(inflate4, "inflate(LayoutInflater.f…ntext), viewGroup, false)");
            return new ChoiceTitleHolder(inflate4);
        } else {
            ClassifyDiscountTypeLayoutBinding inflate5 = ClassifyDiscountTypeLayoutBinding.inflate(LayoutInflater.from(this.context), viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(inflate5, "inflate(LayoutInflater.f…context),viewGroup,false)");
            return new DiscountTypeHolder(inflate5);
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
