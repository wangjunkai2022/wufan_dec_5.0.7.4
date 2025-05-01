package com.join.kotlin.ui.modleregin;

import android.os.Bundle;
import android.view.View;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.join.android.app.component.video.c;
import com.join.android.app.component.xrecyclerview.XRecyclerView;
import com.join.android.app.mgsim.wufun.R;
import com.join.android.app.mgsim.wufun.databinding.MustplayReginActivityBinding;
import com.join.kotlin.domain.common.LoadBindClickProxy;
import com.join.kotlin.ui.base.BaseHasDownloadActivity;
import com.join.kotlin.ui.modleregin.adapter.MustpalyAdapter;
import com.join.kotlin.ui.modleregin.modle.MustplayItemBean;
import com.join.kotlin.ui.modleregin.viewModle.MustPlayViewModle;
import com.join.kotlin.ui.notice.ClickProxy;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.dto.BTActivityBean;
import com.join.mgps.event.n;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.NotImplementedError;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.d1;
import kotlinx.coroutines.k;
import kotlinx.coroutines.s1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: MustPalyReginActivity.kt */
/* loaded from: classes3.dex */
public final class MustPalyReginActivity extends BaseHasDownloadActivity implements ClickProxy, LoadBindClickProxy, XRecyclerView.f {
    @NotNull
    private final Lazy adapter$delegate;
    @NotNull
    private final Lazy dataBinding$delegate;
    @NotNull
    private final Lazy videoHelper$delegate;
    @NotNull
    private final Lazy viewModel$delegate;

    public MustPalyReginActivity() {
        Lazy lazy;
        Lazy lazy2;
        Lazy lazy3;
        Lazy lazy4;
        lazy = LazyKt__LazyJVMKt.lazy(new Function0<MustPlayViewModle>() { // from class: com.join.kotlin.ui.modleregin.MustPalyReginActivity$viewModel$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final MustPlayViewModle invoke() {
                return (MustPlayViewModle) new ViewModelProvider(MustPalyReginActivity.this, new ViewModelProvider.NewInstanceFactory()).get(MustPlayViewModle.class);
            }
        });
        this.viewModel$delegate = lazy;
        lazy2 = LazyKt__LazyJVMKt.lazy(new Function0<c>() { // from class: com.join.kotlin.ui.modleregin.MustPalyReginActivity$videoHelper$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final c invoke() {
                return new c(MustPalyReginActivity.this, "MustPalyReginActivity", true);
            }
        });
        this.videoHelper$delegate = lazy2;
        lazy3 = LazyKt__LazyJVMKt.lazy(new Function0<MustplayReginActivityBinding>() { // from class: com.join.kotlin.ui.modleregin.MustPalyReginActivity$dataBinding$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final MustplayReginActivityBinding invoke() {
                return (MustplayReginActivityBinding) DataBindingUtil.setContentView(MustPalyReginActivity.this, R.layout.mustplay_regin_activity);
            }
        });
        this.dataBinding$delegate = lazy3;
        lazy4 = LazyKt__LazyJVMKt.lazy(new Function0<MustpalyAdapter>() { // from class: com.join.kotlin.ui.modleregin.MustPalyReginActivity$adapter$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final MustpalyAdapter invoke() {
                MustPalyReginActivity mustPalyReginActivity = MustPalyReginActivity.this;
                return new MustpalyAdapter(mustPalyReginActivity, mustPalyReginActivity.getVideoHelper());
            }
        });
        this.adapter$delegate = lazy4;
    }

    @NotNull
    public final MustpalyAdapter getAdapter() {
        return (MustpalyAdapter) this.adapter$delegate.getValue();
    }

    @NotNull
    public final MustplayReginActivityBinding getDataBinding() {
        Object value = this.dataBinding$delegate.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-dataBinding>(...)");
        return (MustplayReginActivityBinding) value;
    }

    @NotNull
    public final c getVideoHelper() {
        return (c) this.videoHelper$delegate.getValue();
    }

    @NotNull
    public final MustPlayViewModle getViewModel() {
        return (MustPlayViewModle) this.viewModel$delegate.getValue();
    }

    public final void notifyAdapter(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        getAdapter().notifyDataSetChanged();
    }

    @Override // com.join.kotlin.ui.notice.ClickProxy
    public void onClickBack() {
        finish();
    }

    @Override // com.join.kotlin.ui.notice.ClickProxy
    public void onClickItem(@NotNull BTActivityBean data) {
        Intrinsics.checkNotNullParameter(data, "data");
    }

    @Override // com.join.kotlin.domain.common.LoadBindClickProxy
    public void onClickReload() {
        getViewModel().loadDatas(this, 1);
    }

    @Override // com.join.kotlin.domain.common.LoadBindClickProxy
    public void onClickSetNetWork() {
        UtilsMy.w3(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.join.kotlin.ui.base.BaseHasDownloadActivity, com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        getDataBinding().setVariable(1, getAdapter());
        getDataBinding().setVariable(34, getViewModel());
        getDataBinding().setVariable(21, this);
        getDataBinding().setVariable(7, this);
        getDataBinding().setVariable(29, this);
        getDataBinding().setLifecycleOwner(this);
        getViewModel().loadDatas(this, 1);
        getVideoHelper().M(1);
        getVideoHelper().o(getDataBinding().f25198c);
        getDataBinding().f25198c.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.join.kotlin.ui.modleregin.MustPalyReginActivity$onCreate$1
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(@NotNull RecyclerView recyclerView, int i4) {
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                super.onScrollStateChanged(recyclerView, i4);
                MustPalyReginActivity.this.getVideoHelper().k(recyclerView, i4);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(@NotNull RecyclerView recyclerView, int i4, int i5) {
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                super.onScrolled(recyclerView, i4, i5);
                try {
                    RecyclerView.LayoutManager layoutManager = MustPalyReginActivity.this.getDataBinding().f25198c.getLayoutManager();
                    Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                    LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                    int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
                    int findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
                    List<MustplayItemBean> value = MustPalyReginActivity.this.getViewModel().getShowDatas().getValue();
                    Intrinsics.checkNotNull(value);
                    MustPalyReginActivity.this.getVideoHelper().g(recyclerView, findFirstVisibleItemPosition, findLastVisibleItemPosition - findFirstVisibleItemPosition, value.size());
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
        });
        getAdapter().setOnItemClickListener(new Function3<Integer, MustplayItemBean, Integer, Unit>() { // from class: com.join.kotlin.ui.modleregin.MustPalyReginActivity$onCreate$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(Integer num, MustplayItemBean mustplayItemBean, Integer num2) {
                invoke(num.intValue(), mustplayItemBean, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(int i4, @NotNull MustplayItemBean item, int i5) {
                Intrinsics.checkNotNullParameter(item, "item");
                IntentUtil.getInstance().goGameDetialActivity(MustPalyReginActivity.this, item.getGameinfo().getGame_id(), item.getGameinfo().get_from_type());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.join.kotlin.ui.base.BaseHasDownloadActivity, com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        if (getVideoHelper() != null) {
            getVideoHelper().G();
        }
        super.onDestroy();
    }

    @Override // com.join.kotlin.ui.base.BaseHasDownloadActivity
    public void onDownloadStatusEventReceved(@NotNull n downloadTaskEvent) {
        Intrinsics.checkNotNullParameter(downloadTaskEvent, "downloadTaskEvent");
        getViewModel().onEventMainThread(downloadTaskEvent);
        if (downloadTaskEvent.c() != 8) {
            getAdapter().notifyDataSetChanged();
        }
    }

    @Override // com.join.android.app.component.xrecyclerview.XRecyclerView.f
    public void onLoadMore() {
        getViewModel().loadDatas(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        if (getVideoHelper() != null) {
            getVideoHelper().H();
        }
        super.onPause();
    }

    @Override // com.join.android.app.component.xrecyclerview.XRecyclerView.f
    public void onRefresh() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        if (getVideoHelper() != null) {
            getVideoHelper().I();
        }
        k.f(s1.f71252b, d1.c(), null, new MustPalyReginActivity$onResume$1(this, null), 2, null);
        super.onResume();
    }
}
