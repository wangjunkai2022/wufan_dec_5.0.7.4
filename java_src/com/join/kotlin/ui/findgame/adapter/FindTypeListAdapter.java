package com.join.kotlin.ui.findgame.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.databinding.ClassfyTypeImageLayoutBinding;
import com.join.android.app.mgsim.wufun.databinding.ClassfyTypeTextLayoutBinding;
import com.join.kotlin.ui.findgame.data.GameSubTypeData;
import com.psk.kotlin.ext.CommonExtKt;
import com.psk.kotlin.util.CommonListMainData;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
/* compiled from: FindTypeListAdapter.kt */
/* loaded from: classes3.dex */
public final class FindTypeListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    @NotNull
    private Context context;
    @NotNull
    private OnItenSelected listener;
    @NotNull
    private List<CommonListMainData> showdatas;
    private int typeId;

    /* compiled from: FindTypeListAdapter.kt */
    /* loaded from: classes3.dex */
    public static final class FindClassifyType {
        @NotNull
        public static final Companion Companion = new Companion(null);
        public static final int GAMETEXTTYPE = 7;
        public static final int TYPEIMAGE = 3;

        /* compiled from: FindTypeListAdapter.kt */
        /* loaded from: classes3.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    /* compiled from: FindTypeListAdapter.kt */
    /* loaded from: classes3.dex */
    public interface OnItenSelected {
        void onItemselected(@NotNull GameSubTypeData gameSubTypeData);
    }

    /* compiled from: FindTypeListAdapter.kt */
    /* loaded from: classes3.dex */
    public static final class ViewTypeImage extends RecyclerView.ViewHolder {
        @NotNull
        private ClassfyTypeImageLayoutBinding binding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewTypeImage(@NotNull ClassfyTypeImageLayoutBinding itemView) {
            super(itemView.getRoot());
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.binding = itemView;
        }

        @NotNull
        public final ClassfyTypeImageLayoutBinding getBinding() {
            return this.binding;
        }

        public final void setBinding(@NotNull ClassfyTypeImageLayoutBinding classfyTypeImageLayoutBinding) {
            Intrinsics.checkNotNullParameter(classfyTypeImageLayoutBinding, "<set-?>");
            this.binding = classfyTypeImageLayoutBinding;
        }
    }

    /* compiled from: FindTypeListAdapter.kt */
    /* loaded from: classes3.dex */
    public static final class ViewTypeText extends RecyclerView.ViewHolder {
        @NotNull
        private ClassfyTypeTextLayoutBinding binding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewTypeText(@NotNull ClassfyTypeTextLayoutBinding itemView) {
            super(itemView.getRoot());
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.binding = itemView;
        }

        @NotNull
        public final ClassfyTypeTextLayoutBinding getBinding() {
            return this.binding;
        }

        public final void setBinding(@NotNull ClassfyTypeTextLayoutBinding classfyTypeTextLayoutBinding) {
            Intrinsics.checkNotNullParameter(classfyTypeTextLayoutBinding, "<set-?>");
            this.binding = classfyTypeTextLayoutBinding;
        }
    }

    public FindTypeListAdapter(@NotNull Context context, int i4, @NotNull List<CommonListMainData> showdatas, @NotNull OnItenSelected listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(showdatas, "showdatas");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.context = context;
        this.typeId = i4;
        this.showdatas = showdatas;
        this.listener = listener;
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
    public final OnItenSelected getListener() {
        return this.listener;
    }

    @NotNull
    public final List<CommonListMainData> getShowdatas() {
        return this.showdatas;
    }

    public final int getTypeId() {
        return this.typeId;
    }

    /* JADX WARN: Type inference failed for: r6v17, types: [T, com.join.kotlin.ui.findgame.data.GameSubTypeData] */
    /* JADX WARN: Type inference failed for: r6v4, types: [T, com.join.kotlin.ui.findgame.data.GameSubTypeData] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, int i4) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        int itemViewType = getItemViewType(i4);
        if (itemViewType == 3) {
            ViewTypeImage viewTypeImage = (ViewTypeImage) viewHolder;
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            Object any = this.showdatas.get(i4).getAny();
            Intrinsics.checkNotNull(any, "null cannot be cast to non-null type com.join.kotlin.ui.findgame.data.GameSubTypeData");
            objectRef.element = (GameSubTypeData) any;
            viewTypeImage.getBinding().getRoot().setSelected(((GameSubTypeData) objectRef.element).isSelected());
            viewTypeImage.getBinding().f17847d.setSelected(((GameSubTypeData) objectRef.element).isSelected());
            MyImageLoader.h(viewTypeImage.getBinding().f17846c, ((GameSubTypeData) objectRef.element).getPic());
            viewTypeImage.getBinding().f17847d.setText(((GameSubTypeData) objectRef.element).getTitle());
            LinearLayout root = viewTypeImage.getBinding().getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "holder.binding.root");
            CommonExtKt.onClick(root, new Function0<Unit>() { // from class: com.join.kotlin.ui.findgame.adapter.FindTypeListAdapter$onBindViewHolder$1
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
                    FindTypeListAdapter.this.getListener().onItemselected(objectRef.element);
                }
            });
        } else if (itemViewType != 7) {
        } else {
            ViewTypeText viewTypeText = (ViewTypeText) viewHolder;
            final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            Object any2 = this.showdatas.get(i4).getAny();
            Intrinsics.checkNotNull(any2, "null cannot be cast to non-null type com.join.kotlin.ui.findgame.data.GameSubTypeData");
            objectRef2.element = (GameSubTypeData) any2;
            viewTypeText.getBinding().f17849c.setText(((GameSubTypeData) objectRef2.element).getTitle());
            viewTypeText.getBinding().getRoot().setSelected(((GameSubTypeData) objectRef2.element).isSelected());
            viewTypeText.getBinding().f17849c.setSelected(((GameSubTypeData) objectRef2.element).isSelected());
            LinearLayout root2 = viewTypeText.getBinding().getRoot();
            Intrinsics.checkNotNullExpressionValue(root2, "holder.binding.root");
            CommonExtKt.onClick(root2, new Function0<Unit>() { // from class: com.join.kotlin.ui.findgame.adapter.FindTypeListAdapter$onBindViewHolder$2
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
                    FindTypeListAdapter.this.getListener().onItemselected(objectRef2.element);
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup viewgroup, int i4) {
        Intrinsics.checkNotNullParameter(viewgroup, "viewgroup");
        if (i4 == 3) {
            ClassfyTypeImageLayoutBinding inflate = ClassfyTypeImageLayoutBinding.inflate(LayoutInflater.from(this.context), viewgroup, false);
            Intrinsics.checkNotNullExpressionValue(inflate, "inflate(LayoutInflater.f…ntext), viewgroup, false)");
            return new ViewTypeImage(inflate);
        } else if (i4 != 7) {
            ClassfyTypeTextLayoutBinding inflate2 = ClassfyTypeTextLayoutBinding.inflate(LayoutInflater.from(this.context), viewgroup, false);
            Intrinsics.checkNotNullExpressionValue(inflate2, "inflate(LayoutInflater.f…ntext), viewgroup, false)");
            return new ViewTypeText(inflate2);
        } else {
            ClassfyTypeTextLayoutBinding inflate3 = ClassfyTypeTextLayoutBinding.inflate(LayoutInflater.from(this.context), viewgroup, false);
            Intrinsics.checkNotNullExpressionValue(inflate3, "inflate(LayoutInflater.f…ntext), viewgroup, false)");
            return new ViewTypeText(inflate3);
        }
    }

    public final void setContext(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.context = context;
    }

    public final void setListener(@NotNull OnItenSelected onItenSelected) {
        Intrinsics.checkNotNullParameter(onItenSelected, "<set-?>");
        this.listener = onItenSelected;
    }

    public final void setShowdatas(@NotNull List<CommonListMainData> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.showdatas = list;
    }

    public final void setTypeId(int i4) {
        this.typeId = i4;
    }

    public final void updateDatas(int i4) {
        this.typeId = i4;
        notifyDataSetChanged();
    }
}
