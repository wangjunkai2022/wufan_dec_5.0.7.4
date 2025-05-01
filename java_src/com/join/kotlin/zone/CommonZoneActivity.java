package com.join.kotlin.zone;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.layoutmanager.QuickGridLayoutManager;
import com.join.android.app.component.video.g;
import com.join.android.app.mgsim.wufun.R;
import com.join.android.app.mgsim.wufun.databinding.ActivityCommonZoneBinding;
import com.join.kotlin.base.activity.BaseVmDbActivity;
import com.join.kotlin.base.ext.BaseViewModelExtKt;
import com.join.kotlin.base.ext.CustomViewExtKt;
import com.join.kotlin.base.net.AppException;
import com.join.kotlin.base.state.ResultState;
import com.join.kotlin.base.widget.recycleview.XQuickRecyclerView;
import com.join.kotlin.domain.common.LoadBindClickProxy;
import com.join.kotlin.domain.common.LoadBindindData;
import com.join.kotlin.ui.notice.ClickProxy;
import com.join.kotlin.zone.adapter.CommonZoneAdapter;
import com.join.kotlin.zone.model.bean.GameZoneDataBean;
import com.join.kotlin.zone.model.bean.ZoneComponentsBean;
import com.join.kotlin.zone.model.bean.ZoneMultiEntry;
import com.join.kotlin.zone.viewmodel.CommonZoneViewModel;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.Util.g2;
import com.join.mgps.base.decoration.GridDecoration;
import com.join.mgps.dto.BTActivityBean;
import com.join.mgps.dto.CommonGameInfoBean;
import com.join.mgps.dto.ExtBean;
import com.join.mgps.event.n;
import com.papa.sim.statistic.Event;
import com.papa.sim.statistic.Ext;
import com.papa.sim.statistic.p;
import com.papa91.arc.ext.ToastManager;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.d1;
import kotlinx.coroutines.k;
import kotlinx.coroutines.s1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: CommonZoneActivity.kt */
/* loaded from: classes3.dex */
public final class CommonZoneActivity extends BaseVmDbActivity<CommonZoneViewModel, ActivityCommonZoneBinding> implements ClickProxy, LoadBindClickProxy {
    @NotNull
    private final Lazy commonZoneAdapter$delegate;
    @Nullable
    private ExtBean extBean;
    @Nullable
    private g videoHelper;
    @Nullable
    private String zoneId;

    public CommonZoneActivity() {
        Lazy lazy;
        lazy = LazyKt__LazyJVMKt.lazy(new Function0<CommonZoneAdapter>() { // from class: com.join.kotlin.zone.CommonZoneActivity$commonZoneAdapter$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final CommonZoneAdapter invoke() {
                return new CommonZoneAdapter(CommonZoneActivity.this.getVideoHelper());
            }
        });
        this.commonZoneAdapter$delegate = lazy;
        this.zoneId = "461506587";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createObserver$lambda$6$lambda$5(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$3$lambda$2(CommonZoneActivity this$0, BaseQuickAdapter adapter, View view, int i4) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(view, "<anonymous parameter 1>");
        ZoneMultiEntry zoneMultiEntry = (ZoneMultiEntry) adapter.getItem(i4);
        Object data = zoneMultiEntry != null ? zoneMultiEntry.getData() : null;
        if (data instanceof CommonGameInfoBean) {
            boolean z4 = true;
            if ((zoneMultiEntry == null || zoneMultiEntry.getViewType() != 1) ? false : false) {
                p.l(this$0).O1(Event.clickAD, new Ext().setFrom("1"));
            }
            IntentUtil.getInstance().intentActivity(this$0, ((CommonGameInfoBean) data).getIntentDataBean());
        }
    }

    public final void autoPlay() {
        k.f(s1.f71252b, d1.c(), null, new CommonZoneActivity$autoPlay$1(this, null), 2, null);
    }

    @Override // com.join.kotlin.base.activity.BaseVmActivity
    public void createObserver() {
        final CommonZoneViewModel commonZoneViewModel = (CommonZoneViewModel) getMViewModel();
        MutableLiveData<ResultState<GameZoneDataBean>> zoneData = commonZoneViewModel.getZoneData();
        final Function1<ResultState<? extends GameZoneDataBean>, Unit> function1 = new Function1<ResultState<? extends GameZoneDataBean>, Unit>() { // from class: com.join.kotlin.zone.CommonZoneActivity$createObserver$1$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ResultState<? extends GameZoneDataBean> resultState) {
                invoke2((ResultState<GameZoneDataBean>) resultState);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(@Nullable ResultState<GameZoneDataBean> resultState) {
                if (resultState == null) {
                    CommonZoneViewModel.this.getLoadBindData().setValue(new LoadBindindData(3));
                    return;
                }
                final CommonZoneActivity commonZoneActivity = this;
                final CommonZoneViewModel commonZoneViewModel2 = CommonZoneViewModel.this;
                Function1<GameZoneDataBean, Unit> function12 = new Function1<GameZoneDataBean, Unit>() { // from class: com.join.kotlin.zone.CommonZoneActivity$createObserver$1$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(GameZoneDataBean gameZoneDataBean) {
                        invoke2(gameZoneDataBean);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2(@Nullable GameZoneDataBean gameZoneDataBean) {
                        ArrayList arrayList = new ArrayList();
                        if (gameZoneDataBean == null) {
                            CommonZoneViewModel.this.getLoadBindData().setValue(new LoadBindindData(3));
                        } else {
                            CommonZoneViewModel.this.getLoadBindData().setValue(new LoadBindindData(1));
                        }
                        if (gameZoneDataBean != null) {
                            CommonZoneActivity commonZoneActivity2 = commonZoneActivity;
                            ((CommonZoneViewModel) commonZoneActivity2.getMViewModel()).getTitle().setValue(gameZoneDataBean.getTitle());
                            CommonGameInfoBean headAdInfo = gameZoneDataBean.getHeadAdInfo();
                            if (headAdInfo != null) {
                                gameZoneDataBean.getHeadAdInfo();
                                headAdInfo.set_from_type(159);
                                headAdInfo.set_from(159);
                                arrayList.add(new ZoneMultiEntry(1, null, gameZoneDataBean.getHeadAdInfo(), 2, null));
                            }
                            if (gameZoneDataBean.getRecGameInfo() != null) {
                                CommonGameInfoBean recGameInfo = gameZoneDataBean.getRecGameInfo();
                                if (recGameInfo != null) {
                                    recGameInfo.set_from_type(159);
                                    recGameInfo.set_from(159);
                                }
                                CommonGameInfoBean recGameInfo2 = gameZoneDataBean.getRecGameInfo();
                                arrayList.add(new ZoneMultiEntry(g2.i(recGameInfo2 != null ? recGameInfo2.getV_url() : null) ? 6 : 3, null, gameZoneDataBean.getRecGameInfo(), 2, null));
                            }
                            List<ZoneComponentsBean> components = gameZoneDataBean.getComponents();
                            if (components != null) {
                                for (ZoneComponentsBean zoneComponentsBean : components) {
                                    String title = zoneComponentsBean.getTitle();
                                    boolean z4 = false;
                                    if (title != null) {
                                        if (title.length() > 0) {
                                            z4 = true;
                                        }
                                    }
                                    if (z4) {
                                        arrayList.add(new ZoneMultiEntry(2, null, zoneComponentsBean.getTitle(), 2, null));
                                    }
                                    if (zoneComponentsBean.getGameInfoList() != null) {
                                        for (CommonGameInfoBean commonGameInfoBean : zoneComponentsBean.getGameInfoList()) {
                                            if (commonGameInfoBean != null) {
                                                commonGameInfoBean.set_from_type(159);
                                                commonGameInfoBean.set_from(159);
                                            }
                                            arrayList.add(new ZoneMultiEntry(commonGameInfoBean.getTpl_type() == 1 ? 4 : 5, null, commonGameInfoBean, 2, null));
                                        }
                                    }
                                }
                            }
                            ((CommonZoneViewModel) commonZoneActivity2.getMViewModel()).setShowData(arrayList);
                            commonZoneActivity2.getCommonZoneAdapter().submitList(((CommonZoneViewModel) commonZoneActivity2.getMViewModel()).getShowData());
                            commonZoneActivity2.getMDatabind().f15811d.loadMoreComplete();
                            commonZoneActivity2.autoPlay();
                        }
                    }
                };
                final CommonZoneViewModel commonZoneViewModel3 = CommonZoneViewModel.this;
                BaseViewModelExtKt.parseState$default(commonZoneActivity, resultState, function12, new Function1<AppException, Unit>() { // from class: com.join.kotlin.zone.CommonZoneActivity$createObserver$1$1.2
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(AppException appException) {
                        invoke2(appException);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull AppException it2) {
                        Intrinsics.checkNotNullParameter(it2, "it");
                        ToastManager.show(it2.getErrorMsg());
                        CommonZoneViewModel.this.getLoadBindData().setValue(new LoadBindindData(3));
                    }
                }, (Function0) null, 8, (Object) null);
            }
        };
        zoneData.observe(this, new Observer() { // from class: com.join.kotlin.zone.a
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                CommonZoneActivity.createObserver$lambda$6$lambda$5(Function1.this, obj);
            }
        });
    }

    @NotNull
    public final CommonZoneAdapter getCommonZoneAdapter() {
        return (CommonZoneAdapter) this.commonZoneAdapter$delegate.getValue();
    }

    @Nullable
    public final ExtBean getExtBean() {
        return this.extBean;
    }

    @Nullable
    public final g getVideoHelper() {
        return this.videoHelper;
    }

    @Nullable
    public final String getZoneId() {
        return this.zoneId;
    }

    @Override // com.join.kotlin.base.activity.BaseVmActivity
    public void initView(@Nullable Bundle bundle) {
        Intent intent = getIntent();
        if (intent != null) {
            Serializable serializableExtra = intent.getSerializableExtra("extBean");
            Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.join.mgps.dto.ExtBean");
            ExtBean extBean = (ExtBean) serializableExtra;
            this.extBean = extBean;
            if (extBean != null) {
                p l4 = p.l(this);
                Event event = Event.visitPCPageZone;
                Ext ext = new Ext();
                ExtBean extBean2 = this.extBean;
                Intrinsics.checkNotNull(extBean2);
                l4.O1(event, ext.setFrom(extBean2.getFrom()));
            }
            this.zoneId = intent.getStringExtra("zoneId");
        }
        if (g2.h(this.zoneId)) {
            finish();
            ToastManager.show("数据异常[zoneId==null]，请重试");
        } else {
            String str = this.zoneId;
            Intrinsics.checkNotNull(str);
            ((CommonZoneViewModel) getMViewModel()).getGameZone(str);
        }
        getMDatabind().j((CommonZoneViewModel) getMViewModel());
        getMDatabind().i(this);
        getMDatabind().h(this);
        this.videoHelper = new g(getMDatabind().f15811d, "CommonZoneActivityVideoHelper");
        XQuickRecyclerView xQuickRecyclerView = getMDatabind().f15811d;
        Intrinsics.checkNotNullExpressionValue(xQuickRecyclerView, "mDatabind.xrvList");
        final XQuickRecyclerView init$default = CustomViewExtKt.init$default(xQuickRecyclerView, (RecyclerView.LayoutManager) new QuickGridLayoutManager(this, 2), (RecyclerView.Adapter) getCommonZoneAdapter(), false, 4, (Object) null);
        init$default.setPullRefreshEnabled(false);
        init$default.setLoadingMoreEnabled(false);
        init$default.addItemDecoration(new GridDecoration() { // from class: com.join.kotlin.zone.CommonZoneActivity$initView$2$1
            @Override // com.join.mgps.base.decoration.GridDecoration
            @NotNull
            public GridDecoration.b getItemOffsets(int i4) {
                GridDecoration.a aVar;
                CommonZoneAdapter commonZoneAdapter = CommonZoneActivity.this.getCommonZoneAdapter();
                XQuickRecyclerView xQuickRecyclerView2 = init$default;
                int itemViewType = commonZoneAdapter.getItemViewType(i4);
                if (itemViewType != 1 && itemViewType != 2 && itemViewType != 3 && itemViewType != 4 && itemViewType != 6) {
                    aVar = new GridDecoration.a(1);
                    if (isLeft(i4)) {
                        aVar.f46228c = (int) xQuickRecyclerView2.getResources().getDimension(R.dimen.wdp20);
                        aVar.f46229d = (int) xQuickRecyclerView2.getResources().getDimension(R.dimen.wdp10);
                    } else if (isRight(i4, 1)) {
                        aVar.f46228c = (int) xQuickRecyclerView2.getResources().getDimension(R.dimen.wdp10);
                        aVar.f46229d = (int) xQuickRecyclerView2.getResources().getDimension(R.dimen.wdp20);
                    } else {
                        aVar.f46228c = (int) xQuickRecyclerView2.getResources().getDimension(R.dimen.wdp10);
                        aVar.f46229d = (int) xQuickRecyclerView2.getResources().getDimension(R.dimen.wdp10);
                    }
                } else {
                    aVar = new GridDecoration.a(2);
                    aVar.f46228c = (int) xQuickRecyclerView2.getResources().getDimension(R.dimen.wdp20);
                    aVar.f46229d = (int) xQuickRecyclerView2.getResources().getDimension(R.dimen.wdp20);
                }
                aVar.f46225h = 0;
                if (i4 == 0) {
                    aVar.f46230e = (int) init$default.getResources().getDimension(R.dimen.wdp20);
                } else {
                    aVar.f46230e = (int) init$default.getResources().getDimension(R.dimen.wdp12);
                }
                aVar.f46231f = (int) init$default.getResources().getDimension(R.dimen.wdp12);
                return aVar;
            }
        });
        getCommonZoneAdapter().setOnItemClickListener(new BaseQuickAdapter.d() { // from class: com.join.kotlin.zone.b
            @Override // com.chad.library.adapter.base.BaseQuickAdapter.d
            public final void a(BaseQuickAdapter baseQuickAdapter, View view, int i4) {
                CommonZoneActivity.initView$lambda$3$lambda$2(CommonZoneActivity.this, baseQuickAdapter, view, i4);
            }
        });
        getMDatabind().f15811d.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.join.kotlin.zone.CommonZoneActivity$initView$4
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(@NotNull RecyclerView recyclerView, int i4) {
                g videoHelper;
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                super.onScrollStateChanged(recyclerView, i4);
                if (i4 != 0 || (videoHelper = CommonZoneActivity.this.getVideoHelper()) == null) {
                    return;
                }
                videoHelper.g(1);
            }
        });
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
        if (this.zoneId != null) {
            String str = this.zoneId;
            Intrinsics.checkNotNull(str);
            ((CommonZoneViewModel) getMViewModel()).getGameZone(str);
        }
    }

    @Override // com.join.kotlin.domain.common.LoadBindClickProxy
    public void onClickSetNetWork() {
        UtilsMy.w3(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.join.kotlin.base.activity.BaseDownloadActivity, com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        g gVar = this.videoHelper;
        if (gVar != null) {
            gVar.t();
        }
        super.onDestroy();
    }

    @Override // com.join.kotlin.base.activity.BaseDownloadActivity
    public void onDownloadStatusChanged(@NotNull n event) {
        Intrinsics.checkNotNullParameter(event, "event");
        super.onDownloadStatusChanged(event);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        g gVar = this.videoHelper;
        if (gVar != null) {
            gVar.u();
        }
        super.onPause();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        g gVar = this.videoHelper;
        if (gVar != null) {
            gVar.A();
        }
        super.onResume();
        UtilsMy.q4(this);
    }

    public final void setExtBean(@Nullable ExtBean extBean) {
        this.extBean = extBean;
    }

    public final void setVideoHelper(@Nullable g gVar) {
        this.videoHelper = gVar;
    }

    public final void setZoneId(@Nullable String str) {
        this.zoneId = str;
    }
}
