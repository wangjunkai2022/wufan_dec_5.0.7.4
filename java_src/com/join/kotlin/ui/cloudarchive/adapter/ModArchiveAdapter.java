package com.join.kotlin.ui.cloudarchive.adapter;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Animatable;
import android.text.Html;
import android.text.Layout;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.join.android.app.mgsim.wufun.R;
import com.join.android.app.mgsim.wufun.databinding.ModarchiveGameDetailListItemBinding;
import com.join.android.app.mgsim.wufun.databinding.ModarchiveListDomain2Binding;
import com.join.android.app.mgsim.wufun.databinding.ModarchiveListDomainBinding;
import com.join.android.app.mgsim.wufun.databinding.ModarchiveListItem2Binding;
import com.join.android.app.mgsim.wufun.databinding.ModarchiveListItemBinding;
import com.join.android.app.mgsim.wufun.databinding.ModarchiveListLocalItem2Binding;
import com.join.android.app.mgsim.wufun.databinding.ModarchiveListLocalItemBinding;
import com.join.kotlin.domain.adapter.BaseDataBindingAdapter;
import com.join.kotlin.ui.cloudarchive.data.ArchiveData;
import com.join.mgps.dto.DomainInfoBean;
import com.psk.kotlin.util.CommonListMainData;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ModArchiveAdapter.kt */
/* loaded from: classes3.dex */
public final class ModArchiveAdapter extends BaseDataBindingAdapter<CommonListMainData, ViewDataBinding> {
    @NotNull
    private Context context;
    private final Display defaultDisplay;
    private final int height;
    private boolean isChoice;
    @NotNull
    private OnClickArchiveListener listener;
    private final float ratio;
    private final int width;

    /* compiled from: ModArchiveAdapter.kt */
    /* loaded from: classes3.dex */
    public static final class ModArchiveType {
        public static final int ARCHIVELOCAL = 4;
        public static final int ARCHIVESHOP = 3;
        public static final int ARCHIVE_DETAIL = 5;
        public static final int ARCHIVE_DOMAIN = 6;
        @NotNull
        public static final Companion Companion = new Companion(null);

        /* compiled from: ModArchiveAdapter.kt */
        /* loaded from: classes3.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModArchiveAdapter(@NotNull Context context, @NotNull OnClickArchiveListener listener, boolean z4) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.context = context;
        this.listener = listener;
        this.isChoice = z4;
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.app.Activity");
        Display defaultDisplay = ((Activity) context).getWindowManager().getDefaultDisplay();
        this.defaultDisplay = defaultDisplay;
        int width = defaultDisplay.getWidth();
        this.width = width;
        int height = defaultDisplay.getHeight();
        this.height = height;
        this.ratio = width > height ? width / height : height / width;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindItem$lambda$0(Ref.ObjectRef itemDatax, ViewDataBinding binding) {
        Intrinsics.checkNotNullParameter(itemDatax, "$itemDatax");
        Intrinsics.checkNotNullParameter(binding, "$binding");
        if (((ArchiveData) itemDatax.element).getShowMoreStatus() != 0) {
            return;
        }
        ModarchiveListItemBinding modarchiveListItemBinding = (ModarchiveListItemBinding) binding;
        Layout layout = modarchiveListItemBinding.f25067b.getLayout();
        if (layout != null) {
            int lineCount = layout.getLineCount();
            if (lineCount > 1) {
                modarchiveListItemBinding.f25071f.setVisibility(0);
                ((ArchiveData) itemDatax.element).setShowMoreStatus(2);
                return;
            } else if (lineCount > 0) {
                if (layout.getEllipsisCount(lineCount - 1) > 0) {
                    modarchiveListItemBinding.f25071f.setVisibility(0);
                    ((ArchiveData) itemDatax.element).setShowMoreStatus(2);
                    return;
                }
                modarchiveListItemBinding.f25071f.setVisibility(8);
                ((ArchiveData) itemDatax.element).setShowMoreStatus(1);
                return;
            } else {
                return;
            }
        }
        modarchiveListItemBinding.f25071f.setVisibility(8);
        ((ArchiveData) itemDatax.element).setShowMoreStatus(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindItem$lambda$1(ViewDataBinding binding, Ref.ObjectRef itemDatax, View view) {
        Intrinsics.checkNotNullParameter(binding, "$binding");
        Intrinsics.checkNotNullParameter(itemDatax, "$itemDatax");
        ModarchiveListItemBinding modarchiveListItemBinding = (ModarchiveListItemBinding) binding;
        if (Intrinsics.areEqual(modarchiveListItemBinding.f25071f.getText(), "展开")) {
            ((ArchiveData) itemDatax.element).setShowMoreStatus(3);
            modarchiveListItemBinding.f25067b.setMaxLines(4);
            modarchiveListItemBinding.f25071f.setText("收起");
            return;
        }
        modarchiveListItemBinding.f25071f.setText("展开");
        ((ArchiveData) itemDatax.element).setShowMoreStatus(2);
        modarchiveListItemBinding.f25067b.setMaxLines(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindItem$lambda$2(Ref.ObjectRef itemDatax, ViewDataBinding binding) {
        Intrinsics.checkNotNullParameter(itemDatax, "$itemDatax");
        Intrinsics.checkNotNullParameter(binding, "$binding");
        if (((ArchiveData) itemDatax.element).getShowMoreStatus() != 0) {
            return;
        }
        ModarchiveListItem2Binding modarchiveListItem2Binding = (ModarchiveListItem2Binding) binding;
        Layout layout = modarchiveListItem2Binding.f25042b.getLayout();
        if (layout != null) {
            int lineCount = layout.getLineCount();
            if (lineCount > 1) {
                modarchiveListItem2Binding.f25046f.setVisibility(0);
                ((ArchiveData) itemDatax.element).setShowMoreStatus(2);
                return;
            } else if (lineCount > 0) {
                if (layout.getEllipsisCount(lineCount - 1) > 0) {
                    modarchiveListItem2Binding.f25046f.setVisibility(0);
                    ((ArchiveData) itemDatax.element).setShowMoreStatus(2);
                    return;
                }
                modarchiveListItem2Binding.f25046f.setVisibility(8);
                ((ArchiveData) itemDatax.element).setShowMoreStatus(1);
                return;
            } else {
                return;
            }
        }
        modarchiveListItem2Binding.f25046f.setVisibility(8);
        ((ArchiveData) itemDatax.element).setShowMoreStatus(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindItem$lambda$3(ViewDataBinding binding, Ref.ObjectRef itemDatax, View view) {
        Intrinsics.checkNotNullParameter(binding, "$binding");
        Intrinsics.checkNotNullParameter(itemDatax, "$itemDatax");
        ModarchiveListItem2Binding modarchiveListItem2Binding = (ModarchiveListItem2Binding) binding;
        if (Intrinsics.areEqual(modarchiveListItem2Binding.f25046f.getText(), "展开")) {
            ((ArchiveData) itemDatax.element).setShowMoreStatus(3);
            modarchiveListItem2Binding.f25042b.setMaxLines(4);
            modarchiveListItem2Binding.f25046f.setText("收起");
            return;
        }
        modarchiveListItem2Binding.f25046f.setText("展开");
        ((ArchiveData) itemDatax.element).setShowMoreStatus(2);
        modarchiveListItem2Binding.f25042b.setMaxLines(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindItem$lambda$4(Ref.ObjectRef itemDatax, ViewDataBinding binding) {
        Intrinsics.checkNotNullParameter(itemDatax, "$itemDatax");
        Intrinsics.checkNotNullParameter(binding, "$binding");
        if (((ArchiveData) itemDatax.element).getShowMoreStatus() != 0) {
            return;
        }
        ModarchiveListLocalItemBinding modarchiveListLocalItemBinding = (ModarchiveListLocalItemBinding) binding;
        Layout layout = modarchiveListLocalItemBinding.f25117b.getLayout();
        if (layout != null) {
            int lineCount = layout.getLineCount();
            if (lineCount > 1) {
                modarchiveListLocalItemBinding.f25123h.setVisibility(0);
                ((ArchiveData) itemDatax.element).setShowMoreStatus(2);
                return;
            } else if (lineCount > 0) {
                if (layout.getEllipsisCount(lineCount - 1) > 0) {
                    modarchiveListLocalItemBinding.f25123h.setVisibility(0);
                    ((ArchiveData) itemDatax.element).setShowMoreStatus(2);
                    return;
                }
                modarchiveListLocalItemBinding.f25123h.setVisibility(8);
                ((ArchiveData) itemDatax.element).setShowMoreStatus(1);
                return;
            } else {
                return;
            }
        }
        modarchiveListLocalItemBinding.f25123h.setVisibility(8);
        ((ArchiveData) itemDatax.element).setShowMoreStatus(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindItem$lambda$5(ViewDataBinding binding, Ref.ObjectRef itemDatax, View view) {
        Intrinsics.checkNotNullParameter(binding, "$binding");
        Intrinsics.checkNotNullParameter(itemDatax, "$itemDatax");
        ModarchiveListLocalItemBinding modarchiveListLocalItemBinding = (ModarchiveListLocalItemBinding) binding;
        if (Intrinsics.areEqual(modarchiveListLocalItemBinding.f25123h.getText(), "展开")) {
            ((ArchiveData) itemDatax.element).setShowMoreStatus(3);
            modarchiveListLocalItemBinding.f25117b.setMaxLines(4);
            modarchiveListLocalItemBinding.f25123h.setText("收起");
            return;
        }
        modarchiveListLocalItemBinding.f25123h.setText("展开");
        ((ArchiveData) itemDatax.element).setShowMoreStatus(2);
        modarchiveListLocalItemBinding.f25117b.setMaxLines(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindItem$lambda$6(Ref.ObjectRef itemDatax, ViewDataBinding binding) {
        Intrinsics.checkNotNullParameter(itemDatax, "$itemDatax");
        Intrinsics.checkNotNullParameter(binding, "$binding");
        if (((ArchiveData) itemDatax.element).getShowMoreStatus() != 0) {
            return;
        }
        ModarchiveListLocalItem2Binding modarchiveListLocalItem2Binding = (ModarchiveListLocalItem2Binding) binding;
        Layout layout = modarchiveListLocalItem2Binding.f25092b.getLayout();
        if (layout != null) {
            int lineCount = layout.getLineCount();
            if (lineCount > 1) {
                modarchiveListLocalItem2Binding.f25098h.setVisibility(0);
                ((ArchiveData) itemDatax.element).setShowMoreStatus(2);
                return;
            } else if (lineCount > 0) {
                if (layout.getEllipsisCount(lineCount - 1) > 0) {
                    modarchiveListLocalItem2Binding.f25098h.setVisibility(0);
                    ((ArchiveData) itemDatax.element).setShowMoreStatus(2);
                    return;
                }
                modarchiveListLocalItem2Binding.f25098h.setVisibility(8);
                ((ArchiveData) itemDatax.element).setShowMoreStatus(1);
                return;
            } else {
                return;
            }
        }
        modarchiveListLocalItem2Binding.f25098h.setVisibility(8);
        ((ArchiveData) itemDatax.element).setShowMoreStatus(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindItem$lambda$7(ViewDataBinding binding, Ref.ObjectRef itemDatax, View view) {
        Intrinsics.checkNotNullParameter(binding, "$binding");
        Intrinsics.checkNotNullParameter(itemDatax, "$itemDatax");
        ModarchiveListLocalItem2Binding modarchiveListLocalItem2Binding = (ModarchiveListLocalItem2Binding) binding;
        if (Intrinsics.areEqual(modarchiveListLocalItem2Binding.f25098h.getText(), "展开")) {
            ((ArchiveData) itemDatax.element).setShowMoreStatus(3);
            modarchiveListLocalItem2Binding.f25092b.setMaxLines(4);
            modarchiveListLocalItem2Binding.f25098h.setText("收起");
            return;
        }
        modarchiveListLocalItem2Binding.f25098h.setText("展开");
        ((ArchiveData) itemDatax.element).setShowMoreStatus(2);
        modarchiveListLocalItem2Binding.f25092b.setMaxLines(1);
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

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i4) {
        List<CommonListMainData> listDatas = getListDatas();
        Intrinsics.checkNotNull(listDatas);
        return listDatas.get(i4).getType();
    }

    @Override // com.join.kotlin.domain.adapter.BaseDataBindingAdapter
    protected int getLayoutResId(int i4) {
        return i4 != 3 ? i4 != 4 ? i4 != 5 ? i4 != 6 ? R.layout.modarchive_list_item : this.ratio >= 2.1f ? R.layout.modarchive_list_domain : R.layout.modarchive_list_domain2 : R.layout.modarchive_game_detail_list_item : this.ratio >= 2.1f ? R.layout.modarchive_list_local_item : R.layout.modarchive_list_local_item2 : this.ratio >= 2.1f ? R.layout.modarchive_list_item : R.layout.modarchive_list_item2;
    }

    @NotNull
    public final OnClickArchiveListener getListener() {
        return this.listener;
    }

    public final float getRatio() {
        return this.ratio;
    }

    public final int getWidth() {
        return this.width;
    }

    public final boolean isChoice() {
        return this.isChoice;
    }

    public final void setChoice(boolean z4) {
        this.isChoice = z4;
    }

    public final void setContext(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.context = context;
    }

    public final void setListener(@NotNull OnClickArchiveListener onClickArchiveListener) {
        Intrinsics.checkNotNullParameter(onClickArchiveListener, "<set-?>");
        this.listener = onClickArchiveListener;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r9v15, types: [com.join.kotlin.ui.cloudarchive.data.ArchiveData, T] */
    /* JADX WARN: Type inference failed for: r9v31, types: [com.join.kotlin.ui.cloudarchive.data.ArchiveData, T] */
    /* JADX WARN: Type inference failed for: r9v47, types: [com.join.kotlin.ui.cloudarchive.data.ArchiveData, T] */
    /* JADX WARN: Type inference failed for: r9v56, types: [com.join.kotlin.ui.cloudarchive.data.ArchiveData, T] */
    @Override // com.join.kotlin.domain.adapter.BaseDataBindingAdapter
    public void onBindItem(@NotNull final ViewDataBinding binding, @NotNull CommonListMainData item, @Nullable RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(item, "item");
        if (binding instanceof ModarchiveListItemBinding) {
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            Object any = item.getAny();
            Intrinsics.checkNotNull(any, "null cannot be cast to non-null type com.join.kotlin.ui.cloudarchive.data.ArchiveData");
            ?? r9 = (ArchiveData) any;
            objectRef.element = r9;
            ((ArchiveData) r9).setAvatar(Html.fromHtml(((ArchiveData) r9).getAvatar()).toString());
            ModarchiveListItemBinding modarchiveListItemBinding = (ModarchiveListItemBinding) binding;
            modarchiveListItemBinding.l((ArchiveData) objectRef.element);
            modarchiveListItemBinding.i(this.listener);
            if (((ArchiveData) objectRef.element).getShowMoreStatus() != 2 && ((ArchiveData) objectRef.element).getShowMoreStatus() != 3) {
                modarchiveListItemBinding.f25071f.setVisibility(8);
            } else {
                modarchiveListItemBinding.f25071f.setText("展开");
                modarchiveListItemBinding.f25067b.setMaxLines(1);
                modarchiveListItemBinding.f25071f.setVisibility(0);
            }
            TextView textView = modarchiveListItemBinding.f25067b;
            if (textView != null) {
                textView.post(new Runnable() { // from class: com.join.kotlin.ui.cloudarchive.adapter.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        ModArchiveAdapter.onBindItem$lambda$0(Ref.ObjectRef.this, binding);
                    }
                });
            }
            modarchiveListItemBinding.f25071f.setOnClickListener(new View.OnClickListener() { // from class: com.join.kotlin.ui.cloudarchive.adapter.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ModArchiveAdapter.onBindItem$lambda$1(ViewDataBinding.this, objectRef, view);
                }
            });
        } else if (binding instanceof ModarchiveListItem2Binding) {
            final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            Object any2 = item.getAny();
            Intrinsics.checkNotNull(any2, "null cannot be cast to non-null type com.join.kotlin.ui.cloudarchive.data.ArchiveData");
            ?? r92 = (ArchiveData) any2;
            objectRef2.element = r92;
            ((ArchiveData) r92).setAvatar(Html.fromHtml(((ArchiveData) r92).getAvatar()).toString());
            ModarchiveListItem2Binding modarchiveListItem2Binding = (ModarchiveListItem2Binding) binding;
            modarchiveListItem2Binding.j((ArchiveData) objectRef2.element);
            modarchiveListItem2Binding.h(this.listener);
            modarchiveListItem2Binding.i(Boolean.valueOf(this.isChoice));
            if (((ArchiveData) objectRef2.element).getShowMoreStatus() != 2 && ((ArchiveData) objectRef2.element).getShowMoreStatus() != 3) {
                modarchiveListItem2Binding.f25046f.setVisibility(8);
            } else {
                modarchiveListItem2Binding.f25046f.setText("展开");
                modarchiveListItem2Binding.f25042b.setMaxLines(1);
                modarchiveListItem2Binding.f25046f.setVisibility(0);
            }
            TextView textView2 = modarchiveListItem2Binding.f25042b;
            if (textView2 != null) {
                textView2.post(new Runnable() { // from class: com.join.kotlin.ui.cloudarchive.adapter.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        ModArchiveAdapter.onBindItem$lambda$2(Ref.ObjectRef.this, binding);
                    }
                });
            }
            modarchiveListItem2Binding.f25046f.setOnClickListener(new View.OnClickListener() { // from class: com.join.kotlin.ui.cloudarchive.adapter.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ModArchiveAdapter.onBindItem$lambda$3(ViewDataBinding.this, objectRef2, view);
                }
            });
        } else if (binding instanceof ModarchiveListLocalItemBinding) {
            final Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
            Object any3 = item.getAny();
            Intrinsics.checkNotNull(any3, "null cannot be cast to non-null type com.join.kotlin.ui.cloudarchive.data.ArchiveData");
            ?? r93 = (ArchiveData) any3;
            objectRef3.element = r93;
            ModarchiveListLocalItemBinding modarchiveListLocalItemBinding = (ModarchiveListLocalItemBinding) binding;
            modarchiveListLocalItemBinding.h((ArchiveData) r93);
            modarchiveListLocalItemBinding.g(this.listener);
            if (((ArchiveData) objectRef3.element).getShowMoreStatus() != 2 && ((ArchiveData) objectRef3.element).getShowMoreStatus() != 3) {
                modarchiveListLocalItemBinding.f25123h.setVisibility(8);
            } else {
                modarchiveListLocalItemBinding.f25123h.setText("展开");
                modarchiveListLocalItemBinding.f25117b.setMaxLines(1);
                modarchiveListLocalItemBinding.f25123h.setVisibility(0);
            }
            TextView textView3 = modarchiveListLocalItemBinding.f25117b;
            if (textView3 != null) {
                textView3.post(new Runnable() { // from class: com.join.kotlin.ui.cloudarchive.adapter.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        ModArchiveAdapter.onBindItem$lambda$4(Ref.ObjectRef.this, binding);
                    }
                });
            }
            modarchiveListLocalItemBinding.f25123h.setOnClickListener(new View.OnClickListener() { // from class: com.join.kotlin.ui.cloudarchive.adapter.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ModArchiveAdapter.onBindItem$lambda$5(ViewDataBinding.this, objectRef3, view);
                }
            });
        } else if (binding instanceof ModarchiveListLocalItem2Binding) {
            final Ref.ObjectRef objectRef4 = new Ref.ObjectRef();
            Object any4 = item.getAny();
            Intrinsics.checkNotNull(any4, "null cannot be cast to non-null type com.join.kotlin.ui.cloudarchive.data.ArchiveData");
            ?? r94 = (ArchiveData) any4;
            objectRef4.element = r94;
            ModarchiveListLocalItem2Binding modarchiveListLocalItem2Binding = (ModarchiveListLocalItem2Binding) binding;
            modarchiveListLocalItem2Binding.h((ArchiveData) r94);
            modarchiveListLocalItem2Binding.g(this.listener);
            if (((ArchiveData) objectRef4.element).getShowMoreStatus() != 2 && ((ArchiveData) objectRef4.element).getShowMoreStatus() != 3) {
                modarchiveListLocalItem2Binding.f25098h.setVisibility(8);
            } else {
                modarchiveListLocalItem2Binding.f25098h.setText("展开");
                modarchiveListLocalItem2Binding.f25092b.setMaxLines(1);
                modarchiveListLocalItem2Binding.f25098h.setVisibility(0);
            }
            TextView textView4 = modarchiveListLocalItem2Binding.f25092b;
            if (textView4 != null) {
                textView4.post(new Runnable() { // from class: com.join.kotlin.ui.cloudarchive.adapter.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        ModArchiveAdapter.onBindItem$lambda$6(Ref.ObjectRef.this, binding);
                    }
                });
            }
            modarchiveListLocalItem2Binding.f25098h.setOnClickListener(new View.OnClickListener() { // from class: com.join.kotlin.ui.cloudarchive.adapter.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ModArchiveAdapter.onBindItem$lambda$7(ViewDataBinding.this, objectRef4, view);
                }
            });
        } else if (binding instanceof ModarchiveGameDetailListItemBinding) {
            Object any5 = item.getAny();
            Intrinsics.checkNotNull(any5, "null cannot be cast to non-null type com.join.kotlin.ui.cloudarchive.data.ArchiveData");
            ArchiveData archiveData = (ArchiveData) any5;
            archiveData.setAvatar(Html.fromHtml(archiveData.getAvatar()).toString());
            ModarchiveGameDetailListItemBinding modarchiveGameDetailListItemBinding = (ModarchiveGameDetailListItemBinding) binding;
            modarchiveGameDetailListItemBinding.j(archiveData);
            modarchiveGameDetailListItemBinding.h(this.listener);
            modarchiveGameDetailListItemBinding.i(Boolean.valueOf(this.isChoice));
        } else if (binding instanceof ModarchiveListDomainBinding) {
            Object any6 = item.getAny();
            Intrinsics.checkNotNull(any6, "null cannot be cast to non-null type com.join.mgps.dto.DomainInfoBean");
            DomainInfoBean domainInfoBean = (DomainInfoBean) any6;
            ModarchiveListDomainBinding modarchiveListDomainBinding = (ModarchiveListDomainBinding) binding;
            modarchiveListDomainBinding.h(domainInfoBean);
            modarchiveListDomainBinding.g(this.listener);
            com.facebook.drawee.controller.a build = Fresco.newDraweeControllerBuilder().c(modarchiveListDomainBinding.f25032b.getController()).H(new com.facebook.drawee.controller.c<com.facebook.imagepipeline.image.f>() { // from class: com.join.kotlin.ui.cloudarchive.adapter.ModArchiveAdapter$onBindItem$controller$1
                @Override // com.facebook.drawee.controller.c
                public void onFailure(@Nullable String str, @Nullable Throwable th) {
                }

                @Override // com.facebook.drawee.controller.c
                public void onIntermediateImageFailed(@Nullable String str, @Nullable Throwable th) {
                }

                @Override // com.facebook.drawee.controller.c
                public void onIntermediateImageSet(@Nullable String str, @Nullable com.facebook.imagepipeline.image.f fVar) {
                }

                @Override // com.facebook.drawee.controller.c
                public void onRelease(@Nullable String str) {
                }

                @Override // com.facebook.drawee.controller.c
                public void onSubmit(@Nullable String str, @Nullable Object obj) {
                }

                @Override // com.facebook.drawee.controller.c
                public void onFinalImageSet(@Nullable String str, @Nullable com.facebook.imagepipeline.image.f fVar, @Nullable Animatable animatable) {
                    if (fVar != null) {
                        ViewGroup.LayoutParams layoutParams = ((ModarchiveListDomainBinding) ViewDataBinding.this).f25032b.getLayoutParams();
                        int dimension = (int) this.getContext().getResources().getDimension(R.dimen.wdp219);
                        layoutParams.height = dimension;
                        layoutParams.width = (dimension * fVar.getWidth()) / fVar.getHeight();
                        ((ModarchiveListDomainBinding) ViewDataBinding.this).f25032b.setLayoutParams(layoutParams);
                    }
                }
            }).setUri(domainInfoBean.getPic()).build();
            Intrinsics.checkNotNullExpressionValue(build, "override fun onBindItem(…troller)\n\n        }\n    }");
            modarchiveListDomainBinding.f25032b.setController(build);
        } else if (binding instanceof ModarchiveListDomain2Binding) {
            Object any7 = item.getAny();
            Intrinsics.checkNotNull(any7, "null cannot be cast to non-null type com.join.mgps.dto.DomainInfoBean");
            DomainInfoBean domainInfoBean2 = (DomainInfoBean) any7;
            ModarchiveListDomain2Binding modarchiveListDomain2Binding = (ModarchiveListDomain2Binding) binding;
            modarchiveListDomain2Binding.h(domainInfoBean2);
            modarchiveListDomain2Binding.g(this.listener);
            com.facebook.drawee.controller.a build2 = Fresco.newDraweeControllerBuilder().c(modarchiveListDomain2Binding.f25022b.getController()).H(new com.facebook.drawee.controller.c<com.facebook.imagepipeline.image.f>() { // from class: com.join.kotlin.ui.cloudarchive.adapter.ModArchiveAdapter$onBindItem$controller$2
                @Override // com.facebook.drawee.controller.c
                public void onFailure(@Nullable String str, @Nullable Throwable th) {
                }

                @Override // com.facebook.drawee.controller.c
                public void onIntermediateImageFailed(@Nullable String str, @Nullable Throwable th) {
                }

                @Override // com.facebook.drawee.controller.c
                public void onIntermediateImageSet(@Nullable String str, @Nullable com.facebook.imagepipeline.image.f fVar) {
                }

                @Override // com.facebook.drawee.controller.c
                public void onRelease(@Nullable String str) {
                }

                @Override // com.facebook.drawee.controller.c
                public void onSubmit(@Nullable String str, @Nullable Object obj) {
                }

                @Override // com.facebook.drawee.controller.c
                public void onFinalImageSet(@Nullable String str, @Nullable com.facebook.imagepipeline.image.f fVar, @Nullable Animatable animatable) {
                    if (fVar != null) {
                        ViewGroup.LayoutParams layoutParams = ((ModarchiveListDomain2Binding) ViewDataBinding.this).f25022b.getLayoutParams();
                        int dimension = (int) this.getContext().getResources().getDimension(R.dimen.wdp219);
                        layoutParams.height = dimension;
                        layoutParams.width = (dimension * fVar.getWidth()) / fVar.getHeight();
                        ((ModarchiveListDomain2Binding) ViewDataBinding.this).f25022b.setLayoutParams(layoutParams);
                    }
                }
            }).setUri(domainInfoBean2.getPic()).build();
            Intrinsics.checkNotNullExpressionValue(build2, "override fun onBindItem(…troller)\n\n        }\n    }");
            modarchiveListDomain2Binding.f25022b.setController(build2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.join.kotlin.domain.adapter.BaseDataBindingAdapter
    public void onBindItemPayloads(@NotNull ViewDataBinding binding, @NotNull CommonListMainData item, @Nullable RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(item, "item");
        if (binding instanceof ModarchiveListItemBinding) {
            ModarchiveListItemBinding modarchiveListItemBinding = (ModarchiveListItemBinding) binding;
            Object any = item.getAny();
            Intrinsics.checkNotNull(any, "null cannot be cast to non-null type com.join.kotlin.ui.cloudarchive.data.ArchiveData");
            modarchiveListItemBinding.l((ArchiveData) any);
            modarchiveListItemBinding.i(this.listener);
        } else if (binding instanceof ModarchiveListLocalItemBinding) {
            ModarchiveListLocalItemBinding modarchiveListLocalItemBinding = (ModarchiveListLocalItemBinding) binding;
            Object any2 = item.getAny();
            Intrinsics.checkNotNull(any2, "null cannot be cast to non-null type com.join.kotlin.ui.cloudarchive.data.ArchiveData");
            modarchiveListLocalItemBinding.h((ArchiveData) any2);
            modarchiveListLocalItemBinding.g(this.listener);
        }
    }
}
