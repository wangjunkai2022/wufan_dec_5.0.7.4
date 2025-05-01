package com.join.kotlin.ui.modleregin;

import android.os.Bundle;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.component.video.c;
import com.join.android.app.component.xrecyclerview.XRecyclerView;
import com.join.android.app.mgsim.wufun.R;
import com.join.android.app.mgsim.wufun.databinding.BtReginActivityBinding;
import com.join.kotlin.domain.common.LoadBindClickProxy;
import com.join.kotlin.ui.base.BaseHasDownloadActivity;
import com.join.kotlin.ui.modleregin.adapter.BtReginAdapter;
import com.join.kotlin.ui.modleregin.modle.BtGameListItem;
import com.join.kotlin.ui.modleregin.modle.BtTagSelecterBean;
import com.join.kotlin.ui.modleregin.modle.MustplayItemBean;
import com.join.kotlin.ui.modleregin.viewModle.BtReginModle;
import com.join.kotlin.ui.notice.ClickProxy;
import com.join.mgps.Util.IntentDateBean;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.dto.BTActivityBean;
import com.join.mgps.dto.ExtBean;
import com.join.mgps.event.n;
import com.psk.kotlin.util.CommonListMainData;
import java.util.HashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.d1;
import kotlinx.coroutines.k;
import kotlinx.coroutines.s1;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: BtReginActivity.kt */
/* loaded from: classes.dex */
public final class BtReginActivity extends BaseHasDownloadActivity implements ClickProxy, LoadBindClickProxy, XRecyclerView.f {
    @NotNull
    private final Lazy adapter$delegate;
    @NotNull
    private final Lazy dataBinding$delegate;
    @NotNull
    private final Lazy videoHelper$delegate;
    @NotNull
    private final Lazy viewModel$delegate;

    public BtReginActivity() {
        Lazy lazy;
        Lazy lazy2;
        Lazy lazy3;
        Lazy lazy4;
        lazy = LazyKt__LazyJVMKt.lazy(new Function0<BtReginModle>() { // from class: com.join.kotlin.ui.modleregin.BtReginActivity$viewModel$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final BtReginModle invoke() {
                return (BtReginModle) new ViewModelProvider(BtReginActivity.this, new ViewModelProvider.NewInstanceFactory()).get(BtReginModle.class);
            }
        });
        this.viewModel$delegate = lazy;
        lazy2 = LazyKt__LazyJVMKt.lazy(new Function0<BtReginActivityBinding>() { // from class: com.join.kotlin.ui.modleregin.BtReginActivity$dataBinding$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final BtReginActivityBinding invoke() {
                return (BtReginActivityBinding) DataBindingUtil.setContentView(BtReginActivity.this, R.layout.bt_regin_activity);
            }
        });
        this.dataBinding$delegate = lazy2;
        lazy3 = LazyKt__LazyJVMKt.lazy(new Function0<c>() { // from class: com.join.kotlin.ui.modleregin.BtReginActivity$videoHelper$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final c invoke() {
                return new c(BtReginActivity.this, "BtReginActivity", true);
            }
        });
        this.videoHelper$delegate = lazy3;
        lazy4 = LazyKt__LazyJVMKt.lazy(new Function0<BtReginAdapter>() { // from class: com.join.kotlin.ui.modleregin.BtReginActivity$adapter$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final BtReginAdapter invoke() {
                BtReginActivity btReginActivity = BtReginActivity.this;
                return new BtReginAdapter(btReginActivity, btReginActivity.getVideoHelper());
            }
        });
        this.adapter$delegate = lazy4;
    }

    @NotNull
    public final BtReginAdapter getAdapter() {
        return (BtReginAdapter) this.adapter$delegate.getValue();
    }

    @NotNull
    public final BtReginActivityBinding getDataBinding() {
        Object value = this.dataBinding$delegate.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-dataBinding>(...)");
        return (BtReginActivityBinding) value;
    }

    @NotNull
    public final c getVideoHelper() {
        return (c) this.videoHelper$delegate.getValue();
    }

    @NotNull
    public final BtReginModle getViewModel() {
        return (BtReginModle) this.viewModel$delegate.getValue();
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
        BtReginModle viewModel = getViewModel();
        String stringExtra = getIntent().getStringExtra("title");
        if (stringExtra == null) {
            stringExtra = "";
        }
        viewModel.setTitle(stringExtra);
        getViewModel().loadDatas(this);
        getVideoHelper().M(1);
        getVideoHelper().o(getDataBinding().f17611c);
        getAdapter().setOnItemClickListener(new Function3<Integer, CommonListMainData, Integer, Unit>() { // from class: com.join.kotlin.ui.modleregin.BtReginActivity$onCreate$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(Integer num, CommonListMainData commonListMainData, Integer num2) {
                invoke(num.intValue(), commonListMainData, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(int i4, @NotNull CommonListMainData item, int i5) {
                Intrinsics.checkNotNullParameter(item, "item");
                int type = item.getType();
                if (type == 2) {
                    Object any = item.getAny();
                    Intrinsics.checkNotNull(any, "null cannot be cast to non-null type com.join.kotlin.ui.modleregin.modle.BtGameListItem");
                    BtGameListItem btGameListItem = (BtGameListItem) any;
                    IntentDateBean intentDataBean = btGameListItem.getGameInfo().getIntentDataBean();
                    ExtBean extBean = intentDataBean.getExtBean();
                    extBean.setReMarks(item.getReMarks());
                    intentDataBean.setExtBean(extBean);
                    IntentUtil.getInstance().intentActivity(BtReginActivity.this, btGameListItem.getGameInfo().getIntentDataBean());
                } else if (type != 4) {
                } else {
                    Object any2 = item.getAny();
                    Intrinsics.checkNotNull(any2, "null cannot be cast to non-null type com.join.kotlin.ui.modleregin.modle.MustplayItemBean");
                    MustplayItemBean mustplayItemBean = (MustplayItemBean) any2;
                    IntentDateBean intentDataBean2 = mustplayItemBean.getGameinfo().getIntentDataBean();
                    ExtBean extBean2 = intentDataBean2.getExtBean();
                    extBean2.setReMarks(item.getReMarks());
                    intentDataBean2.setExtBean(extBean2);
                    IntentUtil.getInstance().intentActivity(BtReginActivity.this, mustplayItemBean.getGameinfo().getIntentDataBean());
                }
            }
        });
        getDataBinding().f17611c.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.join.kotlin.ui.modleregin.BtReginActivity$onCreate$2
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(@NotNull RecyclerView recyclerView, int i4) {
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                super.onScrollStateChanged(recyclerView, i4);
                BtReginActivity.this.getVideoHelper().k(recyclerView, i4);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(@NotNull RecyclerView recyclerView, int i4, int i5) {
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                super.onScrolled(recyclerView, i4, i5);
                try {
                    RecyclerView.LayoutManager layoutManager = BtReginActivity.this.getDataBinding().f17611c.getLayoutManager();
                    Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                    LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                    int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
                    int findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
                    List<CommonListMainData> value = BtReginActivity.this.getViewModel().getShowDatas().getValue();
                    Intrinsics.checkNotNull(value);
                    BtReginActivity.this.getVideoHelper().g(recyclerView, findFirstVisibleItemPosition, findLastVisibleItemPosition - findFirstVisibleItemPosition, value.size());
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
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
        if (downloadTaskEvent.c() == 8) {
            BtReginModle viewModel = getViewModel();
            Intrinsics.checkNotNull(viewModel);
            HashMap<String, DownloadTask> value = viewModel.getDownloadTasksMap().getValue();
            Intrinsics.checkNotNull(value);
            if (!value.isEmpty()) {
                if (getViewModel().getAdapter() == null) {
                    getViewModel().setAdapter(getAdapter());
                }
                if (getViewModel().getManager() == null) {
                    BtReginModle viewModel2 = getViewModel();
                    RecyclerView.LayoutManager layoutManager = getDataBinding().f17611c.getLayoutManager();
                    Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                    viewModel2.setManager((LinearLayoutManager) layoutManager);
                    return;
                }
                return;
            }
            return;
        }
        getAdapter().notifyDataSetChanged();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEventTagChangeThread(@NotNull BtTagSelecterBean event) {
        Intrinsics.checkNotNullParameter(event, "event");
        getViewModel().updateTitles(event);
        getAdapter().notifyDataSetChanged();
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
        getViewModel().loadDatas(this, 1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        if (getVideoHelper() != null) {
            getVideoHelper().I();
        }
        k.f(s1.f71252b, d1.c(), null, new BtReginActivity$onResume$1(this, null), 2, null);
        super.onResume();
        UtilsMy.q4(this);
    }
}
