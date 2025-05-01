package com.join.kotlin.quark;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.join.android.app.mgsim.wufun.R;
import com.join.android.app.mgsim.wufun.databinding.ActivityQuarkSearchResultBinding;
import com.join.kotlin.base.activity.BaseVmDbActivity;
import com.join.kotlin.base.ext.CustomViewExtKt;
import com.join.kotlin.base.net.stateCallback.ListDataUiState;
import com.join.kotlin.base.widget.recycleview.XQuickRecyclerView;
import com.join.kotlin.quark.adapter.SearchResultAdapter;
import com.join.kotlin.quark.loadCallBack.EmptyQuarkSourceCallback;
import com.join.kotlin.quark.model.bean.SourceListItemBean;
import com.join.kotlin.quark.proxy.QuarkSearchClickProxy;
import com.join.kotlin.quark.viewmodel.QuarkSearchViewModel;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.dto.ExtBean;
import java.io.Serializable;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: QuarkSearchResultActivity.kt */
/* loaded from: classes3.dex */
public final class QuarkSearchResultActivity extends BaseVmDbActivity<QuarkSearchViewModel, ActivityQuarkSearchResultBinding> implements QuarkSearchClickProxy {
    @NotNull
    private final Lazy adapter$delegate;
    @Nullable
    private ExtBean extBean;
    private com.kingja.loadsir.core.b<Object> loadSir;

    public QuarkSearchResultActivity() {
        Lazy lazy;
        lazy = LazyKt__LazyJVMKt.lazy(new Function0<SearchResultAdapter>() { // from class: com.join.kotlin.quark.QuarkSearchResultActivity$adapter$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final SearchResultAdapter invoke() {
                return new SearchResultAdapter();
            }
        });
        this.adapter$delegate = lazy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createObserver$lambda$9$lambda$8(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$3$lambda$2(SearchResultAdapter this_apply, QuarkSearchResultActivity this$0, BaseQuickAdapter adapter, View view, int i4) {
        Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(view, "<anonymous parameter 1>");
        Intent intent = new Intent(this_apply.getContext(), SourceShareDetailActivity.class);
        intent.putExtra("itemBean", (Serializable) adapter.getItem(i4));
        intent.putExtra("qkPosition", "ss");
        this$0.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$7$lambda$6(final QuarkSearchResultActivity this$0, Context context, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        TextView textView = (TextView) view.findViewById(R.id.tv_hope_add);
        if (textView != null) {
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.join.kotlin.quark.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    QuarkSearchResultActivity.initView$lambda$7$lambda$6$lambda$5$lambda$4(QuarkSearchResultActivity.this, view2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$7$lambda$6$lambda$5$lambda$4(QuarkSearchResultActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, QuarkSourceHopeListActivity.class);
        intent.putExtra("_keyword", ((QuarkSearchViewModel) this$0.getMViewModel()).getKeyword());
        this$0.startActivity(intent);
    }

    @Override // com.join.kotlin.base.activity.BaseVmActivity
    public void createObserver() {
        MutableLiveData<ListDataUiState<SourceListItemBean>> listData = ((QuarkSearchViewModel) getMViewModel()).getListData();
        final Function1<ListDataUiState<SourceListItemBean>, Unit> function1 = new Function1<ListDataUiState<SourceListItemBean>, Unit>() { // from class: com.join.kotlin.quark.QuarkSearchResultActivity$createObserver$1$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ListDataUiState<SourceListItemBean> listDataUiState) {
                invoke2(listDataUiState);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(ListDataUiState<SourceListItemBean> it2) {
                com.kingja.loadsir.core.b bVar;
                Intrinsics.checkNotNullExpressionValue(it2, "it");
                SearchResultAdapter adapter = QuarkSearchResultActivity.this.getAdapter();
                bVar = QuarkSearchResultActivity.this.loadSir;
                if (bVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("loadSir");
                    bVar = null;
                }
                XQuickRecyclerView xQuickRecyclerView = QuarkSearchResultActivity.this.getMDatabind().f16897d;
                Intrinsics.checkNotNullExpressionValue(xQuickRecyclerView, "mDatabind.xrvList");
                final QuarkSearchResultActivity quarkSearchResultActivity = QuarkSearchResultActivity.this;
                CustomViewExtKt.loadListData(it2, adapter, bVar, xQuickRecyclerView, new Function0<Unit>() { // from class: com.join.kotlin.quark.QuarkSearchResultActivity$createObserver$1$1.1
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
                        com.kingja.loadsir.core.b bVar2;
                        bVar2 = QuarkSearchResultActivity.this.loadSir;
                        if (bVar2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("loadSir");
                            bVar2 = null;
                        }
                        bVar2.g(EmptyQuarkSourceCallback.class);
                    }
                });
            }
        };
        listData.observe(this, new Observer() { // from class: com.join.kotlin.quark.g
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                QuarkSearchResultActivity.createObserver$lambda$9$lambda$8(Function1.this, obj);
            }
        });
    }

    @NotNull
    public final SearchResultAdapter getAdapter() {
        return (SearchResultAdapter) this.adapter$delegate.getValue();
    }

    @Nullable
    public final ExtBean getExtBean() {
        return this.extBean;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0052  */
    @Override // com.join.kotlin.base.activity.BaseVmActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void initView(@org.jetbrains.annotations.Nullable android.os.Bundle r9) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.kotlin.quark.QuarkSearchResultActivity.initView(android.os.Bundle):void");
    }

    public final void loadData(boolean z4) {
        ((QuarkSearchViewModel) getMViewModel()).getResourceSearch(z4);
    }

    @Override // com.join.kotlin.quark.proxy.QuarkSearchClickProxy
    public void onBackClick() {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        UtilsMy.q4(this);
    }

    public final void setExtBean(@Nullable ExtBean extBean) {
        this.extBean = extBean;
    }
}
