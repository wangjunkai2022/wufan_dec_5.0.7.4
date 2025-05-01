package com.join.kotlin.ui.userrecom;

import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.mgsim.wufun.R;
import com.join.android.app.mgsim.wufun.databinding.ActivityUserrecomActivityBinding;
import com.join.kotlin.domain.adapter.BaseDataBindingAdapter;
import com.join.kotlin.ui.base.BaseHasDownloadActivity;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.business.CollectionBeanSubBusiness;
import com.join.mgps.dto.CollectionBeanSub;
import com.join.mgps.dto.RequestModel;
import com.join.mgps.dto.ResponseModel;
import com.join.mgps.event.n;
import com.join.mgps.pref.PrefDef_;
import com.papa.sim.statistic.Event;
import com.papa.sim.statistic.Ext;
import com.papa.sim.statistic.p;
import com.psk.kotlin.util.CommonListMainData;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: UserRecomendActivity.kt */
@SourceDebugExtension({"SMAP\nUserRecomendActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserRecomendActivity.kt\ncom/join/kotlin/ui/userrecom/UserRecomendActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,177:1\n1855#2,2:178\n*S KotlinDebug\n*F\n+ 1 UserRecomendActivity.kt\ncom/join/kotlin/ui/userrecom/UserRecomendActivity\n*L\n115#1:178,2\n*E\n"})
/* loaded from: classes3.dex */
public final class UserRecomendActivity extends BaseHasDownloadActivity implements View.OnClickListener {
    @Nullable
    private UserRecomendAdapter adapter;
    public GestureDetector gestureDetector;
    public LinearLayoutManager manager;
    public RecomViewModle viewModle;
    public ActivityUserrecomActivityBinding viewdataBinding;

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onCreate$lambda$0(UserRecomendActivity this$0, View view, MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.getGestureDetector().onTouchEvent(motionEvent);
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

    @Nullable
    public final UserRecomendAdapter getAdapter() {
        return this.adapter;
    }

    @NotNull
    public final GestureDetector getGestureDetector() {
        GestureDetector gestureDetector = this.gestureDetector;
        if (gestureDetector != null) {
            return gestureDetector;
        }
        Intrinsics.throwUninitializedPropertyAccessException("gestureDetector");
        return null;
    }

    @NotNull
    public final LinearLayoutManager getManager() {
        LinearLayoutManager linearLayoutManager = this.manager;
        if (linearLayoutManager != null) {
            return linearLayoutManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("manager");
        return null;
    }

    @NotNull
    public final RecomViewModle getViewModle() {
        RecomViewModle recomViewModle = this.viewModle;
        if (recomViewModle != null) {
            return recomViewModle;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModle");
        return null;
    }

    @NotNull
    public final ActivityUserrecomActivityBinding getViewdataBinding() {
        ActivityUserrecomActivityBinding activityUserrecomActivityBinding = this.viewdataBinding;
        if (activityUserrecomActivityBinding != null) {
            return activityUserrecomActivityBinding;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewdataBinding");
        return null;
    }

    public final void loadDatas() {
        Set<String> keySet;
        RequestModel<UserRecomRequestArgs> requestModel = new RequestModel<>();
        requestModel.setDefault(this);
        UserRecomRequestArgs userRecomRequestArgs = new UserRecomRequestArgs();
        HashMap<String, DownloadTask> value = getViewModle().getDownloadTasksMap().getValue();
        userRecomRequestArgs.downloadedGameIdList = (value == null || (keySet = value.keySet()) == null) ? null : CollectionsKt___CollectionsKt.toList(keySet);
        Long d5 = new PrefDef_(this).userLastStartAPP().d();
        Intrinsics.checkNotNullExpressionValue(d5, "PrefDef_(this).userLastStartAPP().get()");
        userRecomRequestArgs.duration = System.currentTimeMillis() - d5.longValue();
        userRecomRequestArgs.uid = AccountUtil_.getInstance_(this).getAccountData().getUid();
        requestModel.setArgs(userRecomRequestArgs);
        getViewModle().getRequest().getUserRecomDatas(requestModel);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@Nullable View view) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.join.kotlin.ui.base.BaseHasDownloadActivity, com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        ViewDataBinding contentView = DataBindingUtil.setContentView(this, R.layout.activity_userrecom_activity);
        Intrinsics.checkNotNullExpressionValue(contentView, "setContentView(this, R.l…ivity_userrecom_activity)");
        setViewdataBinding((ActivityUserrecomActivityBinding) contentView);
        setViewModle((RecomViewModle) new ViewModelProvider(this, new ViewModelProvider.NewInstanceFactory()).get(RecomViewModle.class));
        getViewdataBinding().f17219d.setOnTouchListener(new View.OnTouchListener() { // from class: com.join.kotlin.ui.userrecom.a
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean onCreate$lambda$0;
                onCreate$lambda$0 = UserRecomendActivity.onCreate$lambda$0(UserRecomendActivity.this, view, motionEvent);
                return onCreate$lambda$0;
            }
        });
        final int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.wdp30);
        setGestureDetector(new GestureDetector(this, new GestureDetector.SimpleOnGestureListener() { // from class: com.join.kotlin.ui.userrecom.UserRecomendActivity$onCreate$2
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onDown(@NotNull MotionEvent e5) {
                Intrinsics.checkNotNullParameter(e5, "e");
                return true;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onFling(@NotNull MotionEvent e12, @NotNull MotionEvent e22, float f5, float f6) {
                Intrinsics.checkNotNullParameter(e12, "e1");
                Intrinsics.checkNotNullParameter(e22, "e2");
                if (e12.getX() - e22.getX() <= dimensionPixelOffset && e22.getX() - e12.getX() <= dimensionPixelOffset && e12.getY() - e22.getY() <= dimensionPixelOffset) {
                    return e22.getY() - e12.getY() > ((float) dimensionPixelOffset);
                }
                this.finish();
                return true;
            }
        }));
        long longExtra = getIntent().getLongExtra("range", 1L);
        MutableLiveData<String> titleMessage = getViewModle().getTitleMessage();
        titleMessage.setValue(longExtra + "天不见，为你推荐以下游戏");
        this.adapter = new UserRecomendAdapter(this);
        getViewModle().getShowDataList().setValue(new ArrayList<>());
        getViewdataBinding().setVariable(36, getViewModle());
        getViewdataBinding().setVariable(1, this.adapter);
        getViewdataBinding().setVariable(7, this);
        MutableLiveData<ArrayList<CommonListMainData>> showDataList = getViewModle().getShowDataList();
        final Function1<ArrayList<CommonListMainData>, Unit> function1 = new Function1<ArrayList<CommonListMainData>, Unit>() { // from class: com.join.kotlin.ui.userrecom.UserRecomendActivity$onCreate$3
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ArrayList<CommonListMainData> arrayList) {
                invoke2(arrayList);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(ArrayList<CommonListMainData> arrayList) {
                UserRecomendAdapter adapter = UserRecomendActivity.this.getAdapter();
                if (adapter != null) {
                    adapter.notifyDataSetChanged();
                }
            }
        };
        showDataList.observe(this, new Observer() { // from class: com.join.kotlin.ui.userrecom.b
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                UserRecomendActivity.onCreate$lambda$1(Function1.this, obj);
            }
        });
        RecyclerView.LayoutManager layoutManager = getViewdataBinding().f17217b.getLayoutManager();
        Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        setManager((LinearLayoutManager) layoutManager);
        MutableLiveData<ResponseModel<List<CollectionBeanSub>>> resultData = getViewModle().getRequest().getResultData();
        final Function1<ResponseModel<List<? extends CollectionBeanSub>>, Unit> function12 = new Function1<ResponseModel<List<? extends CollectionBeanSub>>, Unit>() { // from class: com.join.kotlin.ui.userrecom.UserRecomendActivity$onCreate$4
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ResponseModel<List<? extends CollectionBeanSub>> responseModel) {
                invoke2((ResponseModel<List<CollectionBeanSub>>) responseModel);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(ResponseModel<List<CollectionBeanSub>> responseModel) {
                boolean z4 = false;
                if (responseModel != null && responseModel.getCode() == 200) {
                    z4 = true;
                }
                if (z4) {
                    List<CollectionBeanSub> data = responseModel.getData();
                    Intrinsics.checkNotNullExpressionValue(data, "it.data");
                    UserRecomendActivity userRecomendActivity = UserRecomendActivity.this;
                    for (CollectionBeanSub collectionBeanSub : data) {
                        CollectionBeanSubBusiness collectionBeanSubBusiness = new CollectionBeanSubBusiness(collectionBeanSub);
                        userRecomendActivity.getViewModle().updateDowState(collectionBeanSubBusiness);
                        ArrayList<CommonListMainData> value = userRecomendActivity.getViewModle().getShowDataList().getValue();
                        Intrinsics.checkNotNull(value);
                        value.add(new CommonListMainData(2, collectionBeanSubBusiness, null, null, 12, null));
                    }
                    UserRecomendAdapter adapter = UserRecomendActivity.this.getAdapter();
                    if (adapter != null) {
                        adapter.notifyDataSetChanged();
                    }
                }
            }
        };
        resultData.observe(this, new Observer() { // from class: com.join.kotlin.ui.userrecom.c
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                UserRecomendActivity.onCreate$lambda$2(Function1.this, obj);
            }
        });
        UserRecomendAdapter userRecomendAdapter = this.adapter;
        if (userRecomendAdapter != null) {
            userRecomendAdapter.setOnItemClickListener(new BaseDataBindingAdapter.OnItemClickListener<CommonListMainData>() { // from class: com.join.kotlin.ui.userrecom.UserRecomendActivity$onCreate$5
                @Override // com.join.kotlin.domain.adapter.BaseDataBindingAdapter.OnItemClickListener
                public void onItemClick(int i4, @NotNull CommonListMainData item, int i5) {
                    Intrinsics.checkNotNullParameter(item, "item");
                    IntentUtil intentUtil = IntentUtil.getInstance();
                    UserRecomendActivity userRecomendActivity = UserRecomendActivity.this;
                    Object any = item.getAny();
                    Intrinsics.checkNotNull(any, "null cannot be cast to non-null type com.join.mgps.business.CollectionBeanSubBusiness");
                    intentUtil.intentActivity(userRecomendActivity, ((CollectionBeanSubBusiness) any).getIntentDataBean());
                }
            });
        }
        updataList();
        p.l(this).O1(Event.recGamesOldUser, new Ext());
    }

    @Override // com.join.kotlin.ui.base.BaseHasDownloadActivity
    public void onDownloadStatusEventReceved(@NotNull n downloadTaskEvent) {
        Intrinsics.checkNotNullParameter(downloadTaskEvent, "downloadTaskEvent");
        RecomViewModle viewModle = getViewModle();
        if (viewModle != null) {
            viewModle.onEventMainThread(downloadTaskEvent);
        }
        if (downloadTaskEvent.c() == 8) {
            RecomViewModle viewModle2 = getViewModle();
            Intrinsics.checkNotNull(viewModle2);
            HashMap<String, DownloadTask> value = viewModle2.getDownloadTasksMap().getValue();
            Intrinsics.checkNotNull(value);
            if (!value.isEmpty()) {
                updateProgressPartly();
                return;
            }
            return;
        }
        UserRecomendAdapter userRecomendAdapter = this.adapter;
        if (userRecomendAdapter != null) {
            userRecomendAdapter.notifyDataSetChanged();
        }
    }

    public final void setAdapter(@Nullable UserRecomendAdapter userRecomendAdapter) {
        this.adapter = userRecomendAdapter;
    }

    public final void setGestureDetector(@NotNull GestureDetector gestureDetector) {
        Intrinsics.checkNotNullParameter(gestureDetector, "<set-?>");
        this.gestureDetector = gestureDetector;
    }

    public final void setManager(@NotNull LinearLayoutManager linearLayoutManager) {
        Intrinsics.checkNotNullParameter(linearLayoutManager, "<set-?>");
        this.manager = linearLayoutManager;
    }

    public final void setViewModle(@NotNull RecomViewModle recomViewModle) {
        Intrinsics.checkNotNullParameter(recomViewModle, "<set-?>");
        this.viewModle = recomViewModle;
    }

    public final void setViewdataBinding(@NotNull ActivityUserrecomActivityBinding activityUserrecomActivityBinding) {
        Intrinsics.checkNotNullParameter(activityUserrecomActivityBinding, "<set-?>");
        this.viewdataBinding = activityUserrecomActivityBinding;
    }

    public final void updataList() {
        Serializable serializableExtra = getIntent().getSerializableExtra("listDatas");
        if (serializableExtra == null) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.wdp162);
        int k4 = ((com.join.android.app.common.utils.n.n(this).k(this) - getResources().getDimensionPixelOffset(R.dimen.wdp262)) - com.join.android.app.common.utils.n.t(this)) - com.join.android.app.common.utils.n.v(this);
        List list = (List) serializableExtra;
        ViewGroup.LayoutParams layoutParams = getViewdataBinding().f17217b.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        if (list.size() * dimensionPixelSize > k4) {
            layoutParams2.height = k4;
        } else {
            layoutParams2.height = dimensionPixelSize * list.size();
        }
        getViewdataBinding().f17217b.setLayoutParams(layoutParams2);
        for (CollectionBeanSub collectionBeanSub : (Iterable) serializableExtra) {
            CollectionBeanSubBusiness collectionBeanSubBusiness = new CollectionBeanSubBusiness(collectionBeanSub);
            collectionBeanSubBusiness.set_from(144);
            collectionBeanSubBusiness.set_from_type(144);
            collectionBeanSubBusiness.setRecPosition(String.valueOf(collectionBeanSubBusiness.getIndex()));
            getViewModle().updateDowState(collectionBeanSubBusiness);
            ArrayList<CommonListMainData> value = getViewModle().getShowDataList().getValue();
            Intrinsics.checkNotNull(value);
            value.add(new CommonListMainData(2, collectionBeanSubBusiness, null, null, 12, null));
        }
        UserRecomendAdapter userRecomendAdapter = this.adapter;
        if (userRecomendAdapter != null) {
            userRecomendAdapter.notifyDataSetChanged();
        }
    }

    public final void updateProgressPartly() {
        UserRecomendAdapter userRecomendAdapter;
        try {
            int findFirstVisibleItemPosition = getManager().findFirstVisibleItemPosition();
            int findLastVisibleItemPosition = getManager().findLastVisibleItemPosition();
            if (findFirstVisibleItemPosition > findLastVisibleItemPosition) {
                return;
            }
            while (true) {
                RecomViewModle viewModle = getViewModle();
                Intrinsics.checkNotNull(viewModle);
                ArrayList<CommonListMainData> value = viewModle.getShowDataList().getValue();
                Intrinsics.checkNotNull(value);
                if (findFirstVisibleItemPosition >= value.size()) {
                    return;
                }
                RecomViewModle viewModle2 = getViewModle();
                Intrinsics.checkNotNull(viewModle2);
                ArrayList<CommonListMainData> value2 = viewModle2.getShowDataList().getValue();
                Intrinsics.checkNotNull(value2);
                CommonListMainData commonListMainData = value2.get(findFirstVisibleItemPosition);
                Intrinsics.checkNotNullExpressionValue(commonListMainData, "viewModle!!.showDataList.value!![index]");
                CommonListMainData commonListMainData2 = commonListMainData;
                if (commonListMainData2.getType() == 2) {
                    Object any = commonListMainData2.getAny();
                    Intrinsics.checkNotNull(any, "null cannot be cast to non-null type com.join.mgps.business.CollectionBeanSubBusiness");
                    DownloadTask downloadTask = ((CollectionBeanSubBusiness) any).getDownloadTask();
                    if (downloadTask != null && ((downloadTask.getStatus() == 2 || downloadTask.getStatus() == 12) && (userRecomendAdapter = this.adapter) != null)) {
                        userRecomendAdapter.notifyItemChanged(findFirstVisibleItemPosition, "progress");
                    }
                }
                if (findFirstVisibleItemPosition == findLastVisibleItemPosition) {
                    return;
                }
                findFirstVisibleItemPosition++;
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }
}
