package com.join.kotlin.discount;

import com.join.android.app.mgsim.wufun.databinding.FragmentCommentStatisticDataBinding;
import com.join.kotlin.base.fragment.BaseVmDbFragment;
import com.join.kotlin.discount.adapter.CommentStatisticDataAdapter;
import com.join.kotlin.discount.viewmodel.CommentStatisticDataViewModel;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
/* compiled from: CommentStatisticDataFragment.kt */
@SourceDebugExtension({"SMAP\nCommentStatisticDataFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommentStatisticDataFragment.kt\ncom/join/kotlin/discount/CommentStatisticDataFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,99:1\n1864#2,2:100\n1866#2:103\n1864#2,3:104\n1#3:102\n*S KotlinDebug\n*F\n+ 1 CommentStatisticDataFragment.kt\ncom/join/kotlin/discount/CommentStatisticDataFragment\n*L\n38#1:100,2\n38#1:103\n59#1:104,3\n*E\n"})
/* loaded from: classes3.dex */
public final class CommentStatisticDataFragment extends BaseVmDbFragment<CommentStatisticDataViewModel, FragmentCommentStatisticDataBinding> {
    @NotNull
    private final Lazy mAdapter$delegate;

    public CommentStatisticDataFragment() {
        Lazy lazy;
        lazy = LazyKt__LazyJVMKt.lazy(new Function0<CommentStatisticDataAdapter>() { // from class: com.join.kotlin.discount.CommentStatisticDataFragment$mAdapter$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final CommentStatisticDataAdapter invoke() {
                return new CommentStatisticDataAdapter();
            }
        });
        this.mAdapter$delegate = lazy;
    }

    private final CommentStatisticDataAdapter getMAdapter() {
        return (CommentStatisticDataAdapter) this.mAdapter$delegate.getValue();
    }

    @Override // com.join.kotlin.base.fragment.BaseVmFragment
    public void createObserver() {
    }

    @Override // com.join.kotlin.base.fragment.BaseVmFragment
    public void dismissLoading() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0077, code lost:
        r0 = kotlin.collections.CollectionsKt___CollectionsKt.filterNotNull(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0090, code lost:
        r3 = kotlin.collections.CollectionsKt___CollectionsKt.filterNotNull(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x012c, code lost:
        r0 = kotlin.collections.CollectionsKt___CollectionsKt.filterNotNull(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0145, code lost:
        r3 = kotlin.collections.CollectionsKt___CollectionsKt.filterNotNull(r3);
     */
    @Override // com.join.kotlin.base.fragment.BaseVmFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void initView(@org.jetbrains.annotations.Nullable android.os.Bundle r18) {
        /*
            Method dump skipped, instructions count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.kotlin.discount.CommentStatisticDataFragment.initView(android.os.Bundle):void");
    }

    @Override // com.join.kotlin.base.fragment.BaseVmFragment
    public void lazyLoadData() {
        loadData(true);
    }

    public final void loadData(boolean z4) {
    }

    @Override // com.join.kotlin.base.fragment.BaseVmFragment
    public void showLoading(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
    }
}
