package com.join.kotlin.ui.coupon;

import android.os.Bundle;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.BaseAppCompatActivity;
import com.join.android.app.common.utils.j;
import com.join.android.app.mgsim.wufun.R;
import com.join.android.app.mgsim.wufun.databinding.ActivityCouponlistActivityBinding;
import com.join.kotlin.domain.common.LoadBindClickProxy;
import com.join.kotlin.domain.common.LoadBindindData;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.Util.l2;
import com.join.mgps.dialog.b;
import com.join.mgps.dto.BTGameCouponBean;
import com.join.mgps.dto.RequestModel;
import com.join.mgps.dto.ResponseModel;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: CouponListActivity.kt */
/* loaded from: classes3.dex */
public final class CouponListActivity extends BaseAppCompatActivity implements ClickProxy, LoadBindClickProxy {
    public CouponViewModle couponViewModle;
    public ArrayList<BTGameCouponBean> datas;
    @NotNull
    private String gameId = "";
    public ActivityCouponlistActivityBinding viewdataBinding;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @NotNull
    public final CouponViewModle getCouponViewModle() {
        CouponViewModle couponViewModle = this.couponViewModle;
        if (couponViewModle != null) {
            return couponViewModle;
        }
        Intrinsics.throwUninitializedPropertyAccessException("couponViewModle");
        return null;
    }

    @NotNull
    public final ArrayList<BTGameCouponBean> getDatas() {
        ArrayList<BTGameCouponBean> arrayList = this.datas;
        if (arrayList != null) {
            return arrayList;
        }
        Intrinsics.throwUninitializedPropertyAccessException("datas");
        return null;
    }

    @NotNull
    public final String getGameId() {
        return this.gameId;
    }

    @NotNull
    public final ActivityCouponlistActivityBinding getViewdataBinding() {
        ActivityCouponlistActivityBinding activityCouponlistActivityBinding = this.viewdataBinding;
        if (activityCouponlistActivityBinding != null) {
            return activityCouponlistActivityBinding;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewdataBinding");
        return null;
    }

    public final void loadData(int i4) {
        if (i4 == 1) {
            getCouponViewModle().getLoadDataBinding().setValue(new LoadBindindData(2));
        }
        RequestModel<CouponRequest> requestModel = new RequestModel<>();
        requestModel.setDefault(this);
        CouponRequest couponRequest = new CouponRequest();
        couponRequest.gameId = getIntent().getStringExtra("gameId");
        couponRequest.uid = AccountUtil_.getInstance_(this).getUid();
        requestModel.setArgs(couponRequest);
        if (j.j(this)) {
            getCouponViewModle().getRequest().requestCouponListData(requestModel);
        } else {
            getCouponViewModle().updateShowLoadUI(false);
        }
    }

    @Override // com.join.kotlin.ui.coupon.ClickProxy
    public void onClickBack() {
        finish();
    }

    @Override // com.join.kotlin.ui.coupon.ClickProxy
    public void onClickGet(@NotNull BTGameCouponBean data) {
        Intrinsics.checkNotNullParameter(data, "data");
        new com.join.mgps.dialog.b(this, R.style.MyDialog).e(8).k("提示").g("请激活游戏，在游戏内领取").j("知道了").i(new b.c() { // from class: com.join.kotlin.ui.coupon.CouponListActivity$onClickGet$1
            @Override // com.join.mgps.dialog.b.c
            public void ClickCancleButn(@Nullable com.join.mgps.dialog.b bVar) {
            }

            @Override // com.join.mgps.dialog.b.c
            public void ClickOKButn(@Nullable com.join.mgps.dialog.b bVar) {
                if (bVar != null) {
                    bVar.dismiss();
                }
            }
        }).show();
    }

    @Override // com.join.kotlin.ui.coupon.ClickProxy
    public void onClickMore(@NotNull BTGameCouponBean data) {
        Intrinsics.checkNotNullParameter(data, "data");
        data.setShowDetial(!data.isShowDetial());
        RecyclerView.Adapter adapter = getViewdataBinding().f15822c.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }

    @Override // com.join.kotlin.domain.common.LoadBindClickProxy
    public void onClickReload() {
        loadData(1);
    }

    @Override // com.join.kotlin.domain.common.LoadBindClickProxy
    public void onClickSetNetWork() {
        UtilsMy.w3(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        ViewDataBinding contentView = DataBindingUtil.setContentView(this, R.layout.activity_couponlist_activity);
        Intrinsics.checkNotNullExpressionValue(contentView, "setContentView<ActivityC…onlist_activity\n        )");
        setViewdataBinding((ActivityCouponlistActivityBinding) contentView);
        setCouponViewModle((CouponViewModle) new ViewModelProvider(this, new ViewModelProvider.NewInstanceFactory()).get(CouponViewModle.class));
        getViewdataBinding().setVariable(36, getCouponViewModle());
        getViewdataBinding().setVariable(7, this);
        getViewdataBinding().setVariable(1, new CouponAdapterv2(this, this));
        ActivityCouponlistActivityBinding viewdataBinding = getViewdataBinding();
        if (viewdataBinding != null) {
            viewdataBinding.setVariable(21, this);
        }
        getViewdataBinding().setLifecycleOwner(this);
        String stringExtra = getIntent().getStringExtra("gameId");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.gameId = stringExtra;
        MutableLiveData<ArrayList<BTGameCouponBean>> datas = getCouponViewModle().getDatas();
        final Function1<ArrayList<BTGameCouponBean>, Unit> function1 = new Function1<ArrayList<BTGameCouponBean>, Unit>() { // from class: com.join.kotlin.ui.coupon.CouponListActivity$onCreate$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ArrayList<BTGameCouponBean> arrayList) {
                invoke2(arrayList);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(ArrayList<BTGameCouponBean> arrayList) {
                RecyclerView.Adapter adapter = CouponListActivity.this.getViewdataBinding().f15822c.getAdapter();
                if (adapter != null) {
                    adapter.notifyDataSetChanged();
                }
            }
        };
        datas.observe(this, new Observer() { // from class: com.join.kotlin.ui.coupon.a
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                CouponListActivity.onCreate$lambda$0(Function1.this, obj);
            }
        });
        setDatas(new ArrayList<>());
        getCouponViewModle().getDatas().setValue(getDatas());
        MutableLiveData<ResponseModel<Object>> resultData = getCouponViewModle().getRequest().getResultData();
        final Function1<ResponseModel<Object>, Unit> function12 = new Function1<ResponseModel<Object>, Unit>() { // from class: com.join.kotlin.ui.coupon.CouponListActivity$onCreate$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ResponseModel<Object> responseModel) {
                invoke2(responseModel);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(ResponseModel<Object> responseModel) {
                if (responseModel != null && responseModel.getCode() == 200) {
                    Object data = responseModel.getData();
                    Intrinsics.checkNotNull(data, "null cannot be cast to non-null type com.join.kotlin.ui.coupon.CouponRequest");
                    CouponRequest couponRequest = (CouponRequest) data;
                    ArrayList<BTGameCouponBean> datas2 = CouponListActivity.this.getDatas();
                    ArrayList<BTGameCouponBean> arrayList = new ArrayList();
                    for (Object obj : datas2) {
                        if (Intrinsics.areEqual(((BTGameCouponBean) obj).getCoupon_id(), couponRequest.couponId)) {
                            arrayList.add(obj);
                        }
                    }
                    for (BTGameCouponBean bTGameCouponBean : arrayList) {
                        bTGameCouponBean.setReceivable(false);
                    }
                    RecyclerView.Adapter adapter = CouponListActivity.this.getViewdataBinding().f15822c.getAdapter();
                    if (adapter != null) {
                        adapter.notifyDataSetChanged();
                        return;
                    }
                    return;
                }
                l2.a(CouponListActivity.this).b(responseModel != null ? responseModel.getMessage() : null);
            }
        };
        resultData.observe(this, new Observer() { // from class: com.join.kotlin.ui.coupon.b
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                CouponListActivity.onCreate$lambda$1(Function1.this, obj);
            }
        });
        MutableLiveData<ResponseModel<CouponListMainData>> resultCouponListData = getCouponViewModle().getRequest().getResultCouponListData();
        final Function1<ResponseModel<CouponListMainData>, Unit> function13 = new Function1<ResponseModel<CouponListMainData>, Unit>() { // from class: com.join.kotlin.ui.coupon.CouponListActivity$onCreate$3
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ResponseModel<CouponListMainData> responseModel) {
                invoke2(responseModel);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(ResponseModel<CouponListMainData> responseModel) {
                if (responseModel != null && responseModel.getCode() == 200) {
                    ArrayList<BTGameCouponBean> value = CouponListActivity.this.getCouponViewModle().getDatas().getValue();
                    if (value != null) {
                        value.addAll(responseModel.getData().getGame_coupon_for_bt_game());
                    }
                    RecyclerView.Adapter adapter = CouponListActivity.this.getViewdataBinding().f15822c.getAdapter();
                    if (adapter != null) {
                        adapter.notifyDataSetChanged();
                    }
                } else {
                    l2.a(CouponListActivity.this).b(responseModel != null ? responseModel.getMessage() : null);
                }
                CouponListActivity.this.getCouponViewModle().updateShowLoadUI(false);
            }
        };
        resultCouponListData.observe(this, new Observer() { // from class: com.join.kotlin.ui.coupon.c
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                CouponListActivity.onCreate$lambda$2(Function1.this, obj);
            }
        });
        loadData(1);
    }

    public final void setCouponViewModle(@NotNull CouponViewModle couponViewModle) {
        Intrinsics.checkNotNullParameter(couponViewModle, "<set-?>");
        this.couponViewModle = couponViewModle;
    }

    public final void setDatas(@NotNull ArrayList<BTGameCouponBean> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.datas = arrayList;
    }

    public final void setGameId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.gameId = str;
    }

    public final void setViewdataBinding(@NotNull ActivityCouponlistActivityBinding activityCouponlistActivityBinding) {
        Intrinsics.checkNotNullParameter(activityCouponlistActivityBinding, "<set-?>");
        this.viewdataBinding = activityCouponlistActivityBinding;
    }
}
