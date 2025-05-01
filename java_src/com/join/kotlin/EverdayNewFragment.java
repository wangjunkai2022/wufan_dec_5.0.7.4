package com.join.kotlin;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.common.utils.j;
import com.join.android.app.component.xrecyclerview.XRecyclerView;
import com.join.android.app.mgsim.wufun.R;
import com.join.android.app.mgsim.wufun.databinding.EverdayNewFragmentBinding;
import com.join.android.app.mgsim.wufun.databinding.EverdayTitleLayoutBinding;
import com.join.android.app.mgsim.wufun.databinding.ItemSimulatorDownloadViewBinding;
import com.join.kotlin.EverdayNewFragment;
import com.join.kotlin.ui.findgame.data.EverdayNewListItem;
import com.join.kotlin.ui.findgame.data.EverdayNewResultData;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.Util.d0;
import com.join.mgps.Util.y;
import com.join.mgps.activity.LocalGameActivity;
import com.join.mgps.activity.vipzone.bean.LuckHistoryrequest;
import com.join.mgps.business.CollectionBeanSubBusiness;
import com.join.mgps.customview.DownloadViewStroke;
import com.join.mgps.dto.CollectionBeanSub;
import com.join.mgps.dto.RequestModel;
import com.join.mgps.dto.ResponseModel;
import com.join.mgps.enums.ConstantIntEnum;
import com.join.mgps.event.n;
import com.join.mgps.rpc.impl.i;
import com.papa.sim.statistic.Data;
import com.papa.sim.statistic.Event;
import com.papa.sim.statistic.Ext;
import com.papa.sim.statistic.p;
import com.psk.kotlin.ext.CommonExtKt;
import com.psk.kotlin.util.BasDownLoadActivityPresenter;
import com.psk.kotlin.util.CommonListMainData;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
/* compiled from: EverdayNewFragment.kt */
@SourceDebugExtension({"SMAP\nEverdayNewFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EverdayNewFragment.kt\ncom/join/kotlin/EverdayNewFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,497:1\n1864#2,3:498\n*S KotlinDebug\n*F\n+ 1 EverdayNewFragment.kt\ncom/join/kotlin/EverdayNewFragment\n*L\n222#1:498,3\n*E\n"})
/* loaded from: classes.dex */
public final class EverdayNewFragment extends Fragment {
    public EverdayNewAdapter adapter;
    public EverdayNewFragmentBinding binding;
    private int firstVisiblePosition;
    private boolean fromHome;
    private boolean isExposuring;
    private int lastVisibleIndex;
    public LinearLayoutManager manager;
    public BasDownLoadActivityPresenter presenter;
    @NotNull
    private ArrayList<CommonListMainData> showDataList = new ArrayList<>();
    private int pageCount = 1;
    private int type = 1;
    @NotNull
    private String lastTimeDay = "0";

    /* compiled from: EverdayNewFragment.kt */
    /* loaded from: classes3.dex */
    public static final class ViewHolderGame extends RecyclerView.ViewHolder {
        @NotNull
        private TextView appSize;
        @NotNull
        private TextView describe;
        @NotNull
        private DownloadViewStroke downloadViewStroke;
        @NotNull
        private ImageView giftPackageSwich;
        @NotNull
        private SimpleDraweeView icon;
        @NotNull
        private View line;
        @NotNull
        private LinearLayout linearLayout2;
        @NotNull
        private TextView lodingInfo;
        @NotNull
        private TextView name;
        @NotNull
        private LinearLayout openTest;
        @NotNull
        private ProgressBar progressBar;
        @NotNull
        private ProgressBar progressBarZip;
        @NotNull
        private RelativeLayout relateLayoutApp;
        @NotNull
        private TextView testTime;
        @NotNull
        private TextView testType;
        @NotNull
        private LinearLayout tipsLayout;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolderGame(@NotNull ItemSimulatorDownloadViewBinding convertView) {
            super(convertView.getRoot());
            Intrinsics.checkNotNullParameter(convertView, "convertView");
            SimpleDraweeView simpleDraweeView = convertView.f22785l;
            Intrinsics.checkNotNullExpressionValue(simpleDraweeView, "convertView.mgListviewItemIcon");
            this.icon = simpleDraweeView;
            ImageView imageView = convertView.f22778e;
            Intrinsics.checkNotNullExpressionValue(imageView, "convertView.giftPackageSwich");
            this.giftPackageSwich = imageView;
            TextView textView = convertView.f22783j;
            Intrinsics.checkNotNullExpressionValue(textView, "convertView.mgListviewItemAppname");
            this.name = textView;
            DownloadViewStroke downloadViewStroke = convertView.f22777d;
            Intrinsics.checkNotNullExpressionValue(downloadViewStroke, "convertView.downloadView");
            this.downloadViewStroke = downloadViewStroke;
            RelativeLayout relativeLayout = convertView.f22789p;
            Intrinsics.checkNotNullExpressionValue(relativeLayout, "convertView.relateLayoutApp");
            this.relateLayoutApp = relativeLayout;
            View view = convertView.f22779f;
            Intrinsics.checkNotNullExpressionValue(view, "convertView.line");
            this.line = view;
            TextView textView2 = convertView.f22784k;
            Intrinsics.checkNotNullExpressionValue(textView2, "convertView.mgListviewItemDescribe");
            this.describe = textView2;
            LinearLayout linearLayout = convertView.f22781h;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "convertView.linearLayout2");
            this.linearLayout2 = linearLayout;
            LinearLayout linearLayout2 = convertView.f22792s;
            Intrinsics.checkNotNullExpressionValue(linearLayout2, "convertView.tipsLayout");
            this.tipsLayout = linearLayout2;
            TextView textView3 = convertView.f22776c;
            Intrinsics.checkNotNullExpressionValue(textView3, "convertView.appSize");
            this.appSize = textView3;
            TextView textView4 = convertView.f22782i;
            Intrinsics.checkNotNullExpressionValue(textView4, "convertView.lodingInfo");
            this.lodingInfo = textView4;
            ProgressBar progressBar = convertView.f22787n;
            Intrinsics.checkNotNullExpressionValue(progressBar, "convertView.progressBar");
            this.progressBar = progressBar;
            ProgressBar progressBar2 = convertView.f22788o;
            Intrinsics.checkNotNullExpressionValue(progressBar2, "convertView.progressBarZip");
            this.progressBarZip = progressBar2;
            LinearLayout linearLayout3 = convertView.f22786m;
            Intrinsics.checkNotNullExpressionValue(linearLayout3, "convertView.openTest");
            this.openTest = linearLayout3;
            TextView textView5 = convertView.f22790q;
            Intrinsics.checkNotNullExpressionValue(textView5, "convertView.testTime");
            this.testTime = textView5;
            TextView textView6 = convertView.f22791r;
            Intrinsics.checkNotNullExpressionValue(textView6, "convertView.testType");
            this.testType = textView6;
        }

        @NotNull
        public final TextView getAppSize() {
            return this.appSize;
        }

        @NotNull
        public final TextView getDescribe() {
            return this.describe;
        }

        @NotNull
        public final DownloadViewStroke getDownloadViewStroke() {
            return this.downloadViewStroke;
        }

        @NotNull
        public final ImageView getGiftPackageSwich() {
            return this.giftPackageSwich;
        }

        @NotNull
        public final SimpleDraweeView getIcon() {
            return this.icon;
        }

        @NotNull
        public final View getLine() {
            return this.line;
        }

        @NotNull
        public final LinearLayout getLinearLayout2() {
            return this.linearLayout2;
        }

        @NotNull
        public final TextView getLodingInfo() {
            return this.lodingInfo;
        }

        @NotNull
        public final TextView getName() {
            return this.name;
        }

        @NotNull
        public final LinearLayout getOpenTest() {
            return this.openTest;
        }

        @NotNull
        public final ProgressBar getProgressBar() {
            return this.progressBar;
        }

        @NotNull
        public final ProgressBar getProgressBarZip() {
            return this.progressBarZip;
        }

        @NotNull
        public final RelativeLayout getRelateLayoutApp() {
            return this.relateLayoutApp;
        }

        @NotNull
        public final TextView getTestTime() {
            return this.testTime;
        }

        @NotNull
        public final TextView getTestType() {
            return this.testType;
        }

        @NotNull
        public final LinearLayout getTipsLayout() {
            return this.tipsLayout;
        }

        public final void setAppSize(@NotNull TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.appSize = textView;
        }

        public final void setDescribe(@NotNull TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.describe = textView;
        }

        public final void setDownloadViewStroke(@NotNull DownloadViewStroke downloadViewStroke) {
            Intrinsics.checkNotNullParameter(downloadViewStroke, "<set-?>");
            this.downloadViewStroke = downloadViewStroke;
        }

        public final void setGiftPackageSwich(@NotNull ImageView imageView) {
            Intrinsics.checkNotNullParameter(imageView, "<set-?>");
            this.giftPackageSwich = imageView;
        }

        public final void setIcon(@NotNull SimpleDraweeView simpleDraweeView) {
            Intrinsics.checkNotNullParameter(simpleDraweeView, "<set-?>");
            this.icon = simpleDraweeView;
        }

        public final void setLine(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "<set-?>");
            this.line = view;
        }

        public final void setLinearLayout2(@NotNull LinearLayout linearLayout) {
            Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
            this.linearLayout2 = linearLayout;
        }

        public final void setLodingInfo(@NotNull TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.lodingInfo = textView;
        }

        public final void setName(@NotNull TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.name = textView;
        }

        public final void setOpenTest(@NotNull LinearLayout linearLayout) {
            Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
            this.openTest = linearLayout;
        }

        public final void setProgressBar(@NotNull ProgressBar progressBar) {
            Intrinsics.checkNotNullParameter(progressBar, "<set-?>");
            this.progressBar = progressBar;
        }

        public final void setProgressBarZip(@NotNull ProgressBar progressBar) {
            Intrinsics.checkNotNullParameter(progressBar, "<set-?>");
            this.progressBarZip = progressBar;
        }

        public final void setRelateLayoutApp(@NotNull RelativeLayout relativeLayout) {
            Intrinsics.checkNotNullParameter(relativeLayout, "<set-?>");
            this.relateLayoutApp = relativeLayout;
        }

        public final void setTestTime(@NotNull TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.testTime = textView;
        }

        public final void setTestType(@NotNull TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.testType = textView;
        }

        public final void setTipsLayout(@NotNull LinearLayout linearLayout) {
            Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
            this.tipsLayout = linearLayout;
        }
    }

    /* compiled from: EverdayNewFragment.kt */
    /* loaded from: classes3.dex */
    public static final class ViewHolderTitle extends RecyclerView.ViewHolder {
        @NotNull
        private TextView title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolderTitle(@NotNull EverdayTitleLayoutBinding itemView) {
            super(itemView.getRoot());
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            TextView textView = itemView.f19332c;
            Intrinsics.checkNotNullExpressionValue(textView, "itemView.title");
            this.title = textView;
        }

        @NotNull
        public final TextView getTitle() {
            return this.title;
        }

        public final void setTitle(@NotNull TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.title = textView;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void expDiscountGame() {
        try {
            try {
                if (isAdded() && !this.isExposuring) {
                    this.isExposuring = true;
                    int lastVisiblePosition = getBinding().f19330e.getLastVisiblePosition();
                    int i4 = 0;
                    for (Object obj : this.showDataList) {
                        int i5 = i4 + 1;
                        if (i4 < 0) {
                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                        }
                        CommonListMainData commonListMainData = (CommonListMainData) obj;
                        if (i4 <= lastVisiblePosition && !commonListMainData.getHasExposured()) {
                            commonListMainData.setHasExposured(true);
                            if (commonListMainData.getType() == 2) {
                                Object any = commonListMainData.getAny();
                                Intrinsics.checkNotNull(any, "null cannot be cast to non-null type com.join.mgps.dto.CollectionBeanSub");
                                CollectionBeanSub collectionBeanSub = (CollectionBeanSub) any;
                                if (UtilsMy.f2(collectionBeanSub)) {
                                    try {
                                        Ext ext = new Ext();
                                        ext.setResultCode("discount_game");
                                        ext.setScenesCode(EverdayNewFragment.class.getSimpleName());
                                        Data data = new Data();
                                        String game_id = collectionBeanSub.getGame_id();
                                        Intrinsics.checkNotNullExpressionValue(game_id, "sub.game_id");
                                        data.setGameId(Long.parseLong(game_id));
                                        p.l(getContext()).Y(Event.expGameAdPage, ext, data);
                                    } catch (Exception e5) {
                                        e5.printStackTrace();
                                    }
                                }
                            }
                        }
                        i4 = i5;
                    }
                }
            } finally {
                this.isExposuring = false;
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int loadFinish$lambda$0(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Number) tmp0.invoke(obj, obj2)).intValue();
    }

    @NotNull
    public final EverdayNewAdapter getAdapter() {
        EverdayNewAdapter everdayNewAdapter = this.adapter;
        if (everdayNewAdapter != null) {
            return everdayNewAdapter;
        }
        Intrinsics.throwUninitializedPropertyAccessException("adapter");
        return null;
    }

    @NotNull
    public final EverdayNewFragmentBinding getBinding() {
        EverdayNewFragmentBinding everdayNewFragmentBinding = this.binding;
        if (everdayNewFragmentBinding != null) {
            return everdayNewFragmentBinding;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    public final int getFirstVisiblePosition() {
        return this.firstVisiblePosition;
    }

    public final boolean getFromHome() {
        return this.fromHome;
    }

    @NotNull
    public final String getLastTimeDay() {
        return this.lastTimeDay;
    }

    public final int getLastVisibleIndex() {
        return this.lastVisibleIndex;
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

    public final int getPageCount() {
        return this.pageCount;
    }

    @NotNull
    public final BasDownLoadActivityPresenter getPresenter() {
        BasDownLoadActivityPresenter basDownLoadActivityPresenter = this.presenter;
        if (basDownLoadActivityPresenter != null) {
            return basDownLoadActivityPresenter;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @NotNull
    public final ArrayList<CommonListMainData> getShowDataList() {
        return this.showDataList;
    }

    public final int getType() {
        return this.type;
    }

    public final void hidLoading() {
        getBinding().f19329d.f23562d.setVisibility(8);
        getBinding().f19328c.f19364e.setVisibility(8);
        getBinding().f19330e.setVisibility(0);
    }

    public final void loadData(final int i4) {
        if (j.j(getContext())) {
            try {
                RequestModel requestModel = new RequestModel(getContext());
                LuckHistoryrequest luckHistoryrequest = new LuckHistoryrequest();
                luckHistoryrequest.setPage(i4);
                luckHistoryrequest.setUid(AccountUtil_.getInstance_(getContext()).getAccountData().getUid());
                luckHistoryrequest.setType(this.type);
                requestModel.setArgs(luckHistoryrequest);
                i.D0().B0().x1(requestModel.makeSign()).enqueue(new Callback<ResponseModel<EverdayNewResultData>>() { // from class: com.join.kotlin.EverdayNewFragment$loadData$1
                    @Override // retrofit2.Callback
                    public void onFailure(@NotNull Call<ResponseModel<EverdayNewResultData>> call, @NotNull Throwable t4) {
                        Intrinsics.checkNotNullParameter(call, "call");
                        Intrinsics.checkNotNullParameter(t4, "t");
                        t4.printStackTrace();
                    }

                    @Override // retrofit2.Callback
                    public void onResponse(@NotNull Call<ResponseModel<EverdayNewResultData>> call, @NotNull Response<ResponseModel<EverdayNewResultData>> responsex) {
                        Intrinsics.checkNotNullParameter(call, "call");
                        Intrinsics.checkNotNullParameter(responsex, "responsex");
                        if (responsex.body() != null) {
                            ResponseModel<EverdayNewResultData> body = responsex.body();
                            Intrinsics.checkNotNull(body);
                            ResponseModel<EverdayNewResultData> responseModel = body;
                            if (responseModel.getCode() == 200) {
                                EverdayNewResultData data = responseModel.getData();
                                EverdayNewFragment.this.hidLoading();
                                if (data != null && data.getGame_list() != null && data.getGame_list().size() > 0) {
                                    EverdayNewFragment everdayNewFragment = EverdayNewFragment.this;
                                    int i5 = i4;
                                    List<EverdayNewListItem> game_list = data.getGame_list();
                                    Intrinsics.checkNotNullExpressionValue(game_list, "data.game_list");
                                    everdayNewFragment.loadFinish(i5, game_list);
                                    EverdayNewFragment.this.getBinding().f19330e.loadMoreComplete();
                                    return;
                                }
                                EverdayNewFragment.this.getBinding().f19330e.setNoMore();
                                return;
                            }
                            EverdayNewFragment.this.getBinding().f19330e.loadMoreComplete();
                        }
                        EverdayNewFragment.this.hidLoading();
                    }
                });
                return;
            } catch (Exception e5) {
                e5.printStackTrace();
                onError("");
                return;
            }
        }
        String string = getString(R.string.net_connect_failed);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.net_connect_failed)");
        onError(string);
    }

    public final void loadFinish(int i4, @NotNull List<? extends EverdayNewListItem> datas) {
        Intrinsics.checkNotNullParameter(datas, "datas");
        if (i4 == this.pageCount && (!datas.isEmpty())) {
            this.pageCount++;
        }
        final EverdayNewFragment$loadFinish$1 everdayNewFragment$loadFinish$1 = new Function2<EverdayNewListItem, EverdayNewListItem, Integer>() { // from class: com.join.kotlin.EverdayNewFragment$loadFinish$1
            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final Integer invoke(EverdayNewListItem everdayNewListItem, EverdayNewListItem everdayNewListItem2) {
                int i5 = -1;
                if (everdayNewListItem.getTime() <= everdayNewListItem2.getTime()) {
                    if (everdayNewListItem.getTime() >= everdayNewListItem2.getTime()) {
                        if (!UtilsMy.f2(everdayNewListItem.getList())) {
                            if (!UtilsMy.f2(everdayNewListItem2.getList())) {
                                i5 = 0;
                            }
                        }
                    }
                    return Integer.valueOf(i5);
                }
                i5 = 1;
                return Integer.valueOf(i5);
            }
        };
        CollectionsKt___CollectionsKt.sortedWith(datas, new Comparator() { // from class: com.join.kotlin.a
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int loadFinish$lambda$0;
                loadFinish$lambda$0 = EverdayNewFragment.loadFinish$lambda$0(Function2.this, obj, obj2);
                return loadFinish$lambda$0;
            }
        });
        for (EverdayNewListItem everdayNewListItem : datas) {
            long j4 = 1000;
            if (!Intrinsics.areEqual(this.lastTimeDay, y.z(everdayNewListItem.getTime() * j4))) {
                ArrayList<CommonListMainData> arrayList = this.showDataList;
                String D = y.D(everdayNewListItem.getTime() * j4);
                Intrinsics.checkNotNullExpressionValue(D, "longToStrTimeYMD(data.time * 1000)");
                arrayList.add(new CommonListMainData(1, D, null, null, 12, null));
                String z4 = y.z(everdayNewListItem.getTime() * j4);
                Intrinsics.checkNotNullExpressionValue(z4, "longToStrTimeDD(data.time * 1000)");
                this.lastTimeDay = z4;
            }
            CollectionBeanSubBusiness collectionBeanSubBusiness = new CollectionBeanSubBusiness(everdayNewListItem.getList());
            int i5 = 209;
            collectionBeanSubBusiness.set_from_type(this.fromHome ? 209 : 129);
            if (!this.fromHome) {
                i5 = 129;
            }
            collectionBeanSubBusiness.set_from(i5);
            getPresenter().updateDowState(collectionBeanSubBusiness);
            this.showDataList.add(new CommonListMainData(2, collectionBeanSubBusiness, null, null, 12, null));
        }
        getAdapter().notifyDataSetChanged();
        if (i4 == 1) {
            expDiscountGame();
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        EverdayNewFragmentBinding inflate = EverdayNewFragmentBinding.inflate(inflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(inflater, container, false)");
        setBinding(inflate);
        d0.a().d(this);
        return getBinding().getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        d0.a().e(this);
    }

    public final void onError(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        Context context = getContext();
        if (context != null) {
            CommonExtKt.toast(context, message);
        }
        ArrayList<CommonListMainData> arrayList = this.showDataList;
        if ((arrayList == null || arrayList.isEmpty()) || this.showDataList.size() <= 0) {
            getBinding().f19329d.f23562d.setVisibility(8);
            getBinding().f19328c.f19364e.setVisibility(0);
            getBinding().f19330e.setVisibility(8);
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull n downloadTaskEvent) {
        Intrinsics.checkNotNullParameter(downloadTaskEvent, "downloadTaskEvent");
        getPresenter().onEventMainThread(downloadTaskEvent);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        setManager(new LinearLayoutManager(getContext()));
        getBinding().f19330e.setLayoutManager(getManager());
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        setAdapter(new EverdayNewAdapter(requireContext, this.showDataList));
        getBinding().f19330e.setAdapter(getAdapter());
        ImageView imageView = getBinding().f19328c.f19365f;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.failedLayoutMain.relodingimag");
        CommonExtKt.onClick(imageView, new Function0<Unit>() { // from class: com.join.kotlin.EverdayNewFragment$onViewCreated$1
            /* JADX INFO: Access modifiers changed from: package-private */
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
                EverdayNewFragment everdayNewFragment = EverdayNewFragment.this;
                everdayNewFragment.loadData(everdayNewFragment.getPageCount());
            }
        });
        getBinding().f19330e.setPullRefreshEnabled(true);
        getBinding().f19330e.setLoadingListener(new XRecyclerView.f() { // from class: com.join.kotlin.EverdayNewFragment$onViewCreated$2
            @Override // com.join.android.app.component.xrecyclerview.XRecyclerView.f
            public void onLoadMore() {
                EverdayNewFragment everdayNewFragment = EverdayNewFragment.this;
                everdayNewFragment.loadData(everdayNewFragment.getPageCount());
            }

            @Override // com.join.android.app.component.xrecyclerview.XRecyclerView.f
            public void onRefresh() {
            }
        });
        getBinding().f19330e.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.join.kotlin.EverdayNewFragment$onViewCreated$3
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(@NotNull RecyclerView recyclerView, int i4) {
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                super.onScrollStateChanged(recyclerView, i4);
                if (i4 == 0) {
                    EverdayNewFragment.this.expDiscountGame();
                }
            }
        });
        this.pageCount = 1;
        LinearLayoutManager manager = getManager();
        XRecyclerView xRecyclerView = getBinding().f19330e;
        Intrinsics.checkNotNullExpressionValue(xRecyclerView, "binding.recycleView");
        setPresenter(new BasDownLoadActivityPresenter(manager, xRecyclerView, this.showDataList));
        getPresenter().initData(getAdapter());
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("title") : null;
        Bundle arguments2 = getArguments();
        this.fromHome = arguments2 != null ? arguments2.getBoolean("_from_home") : false;
        if (string != null) {
            switch (string.hashCode()) {
                case 683136:
                    if (string.equals(LocalGameActivity.f34225s)) {
                        this.type = 1;
                        break;
                    }
                    break;
                case 687749:
                    if (string.equals("单机")) {
                        this.type = 3;
                        break;
                    }
                    break;
                case 1038599:
                    if (string.equals("网游")) {
                        this.type = 2;
                        break;
                    }
                    break;
                case 26916170:
                    if (string.equals("模拟器")) {
                        this.type = 5;
                        break;
                    }
                    break;
            }
        }
        loadData(this.pageCount);
    }

    public final void setAdapter(@NotNull EverdayNewAdapter everdayNewAdapter) {
        Intrinsics.checkNotNullParameter(everdayNewAdapter, "<set-?>");
        this.adapter = everdayNewAdapter;
    }

    public final void setBinding(@NotNull EverdayNewFragmentBinding everdayNewFragmentBinding) {
        Intrinsics.checkNotNullParameter(everdayNewFragmentBinding, "<set-?>");
        this.binding = everdayNewFragmentBinding;
    }

    public final void setFirstVisiblePosition(int i4) {
        this.firstVisiblePosition = i4;
    }

    public final void setFromHome(boolean z4) {
        this.fromHome = z4;
    }

    public final void setLastTimeDay(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.lastTimeDay = str;
    }

    public final void setLastVisibleIndex(int i4) {
        this.lastVisibleIndex = i4;
    }

    public final void setManager(@NotNull LinearLayoutManager linearLayoutManager) {
        Intrinsics.checkNotNullParameter(linearLayoutManager, "<set-?>");
        this.manager = linearLayoutManager;
    }

    public final void setPageCount(int i4) {
        this.pageCount = i4;
    }

    public final void setPresenter(@NotNull BasDownLoadActivityPresenter basDownLoadActivityPresenter) {
        Intrinsics.checkNotNullParameter(basDownLoadActivityPresenter, "<set-?>");
        this.presenter = basDownLoadActivityPresenter;
    }

    public final void setShowDataList(@NotNull ArrayList<CommonListMainData> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.showDataList = arrayList;
    }

    public final void setType(int i4) {
        this.type = i4;
    }

    public final void showLoding() {
        getBinding().f19329d.f23562d.setVisibility(0);
        getBinding().f19328c.f19364e.setVisibility(8);
        getBinding().f19330e.setVisibility(8);
    }

    /* compiled from: EverdayNewFragment.kt */
    /* loaded from: classes3.dex */
    public static final class EverdayNewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
        @NotNull
        private Context context;
        @NotNull
        private List<CommonListMainData> showDataList;

        public EverdayNewAdapter(@NotNull Context context, @NotNull List<CommonListMainData> showDataList) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(showDataList, "showDataList");
            this.context = context;
            this.showDataList = showDataList;
        }

        @NotNull
        public final Context getContext() {
            return this.context;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.showDataList.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i4) {
            return this.showDataList.get(i4).getType();
        }

        @NotNull
        public final List<CommonListMainData> getShowDataList() {
            return this.showDataList;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(@NotNull RecyclerView.ViewHolder holder, int i4, @NotNull List<Object> payloads) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            Intrinsics.checkNotNullParameter(payloads, "payloads");
            if (payloads.isEmpty()) {
                super.onBindViewHolder(holder, i4, payloads);
                return;
            }
            Object any = this.showDataList.get(i4).getAny();
            Intrinsics.checkNotNull(any, "null cannot be cast to non-null type com.join.mgps.business.CollectionBeanSubBusiness");
            ViewHolderGame viewHolderGame = (ViewHolderGame) holder;
            DownloadTask downloadTask = ((CollectionBeanSubBusiness) any).getDownloadTask();
            if (downloadTask != null) {
                int status = downloadTask.getStatus();
                if (status == 2 || status == 12) {
                    updateProgress(downloadTask, viewHolderGame);
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NotNull
        public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup viewGroup, int i4) {
            Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
            if (i4 == 1) {
                EverdayTitleLayoutBinding inflate = EverdayTitleLayoutBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
                Intrinsics.checkNotNullExpressionValue(inflate, "inflate(LayoutInflater.f…ntext), viewGroup, false)");
                return new ViewHolderTitle(inflate);
            } else if (i4 != 2) {
                EverdayTitleLayoutBinding inflate2 = EverdayTitleLayoutBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
                Intrinsics.checkNotNullExpressionValue(inflate2, "inflate(LayoutInflater.f…ntext), viewGroup, false)");
                return new ViewHolderTitle(inflate2);
            } else {
                ItemSimulatorDownloadViewBinding inflate3 = ItemSimulatorDownloadViewBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
                Intrinsics.checkNotNullExpressionValue(inflate3, "inflate(LayoutInflater.f…ntext), viewGroup, false)");
                return new ViewHolderGame(inflate3);
            }
        }

        public final void setContext(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "<set-?>");
            this.context = context;
        }

        public final void setShowDataList(@NotNull List<CommonListMainData> list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.showDataList = list;
        }

        public final void updateProgress(@NotNull DownloadTask downloadTaski, @NotNull ViewHolderGame viewHolderGame) {
            DownloadTask f5;
            Intrinsics.checkNotNullParameter(downloadTaski, "downloadTaski");
            Intrinsics.checkNotNullParameter(viewHolderGame, "viewHolderGame");
            if ((downloadTaski.getStatus() == 2 || downloadTaski.getStatus() == 12) && (f5 = com.join.android.app.common.servcie.i.e().f(downloadTaski.getCrc_link_type_val())) != null) {
                String showSize = f5.getShowSize();
                Intrinsics.checkNotNullExpressionValue(showSize, "downloadTask.showSize");
                double parseDouble = Double.parseDouble(showSize);
                double d5 = 1024;
                Double.isNaN(d5);
                Double.isNaN(d5);
                viewHolderGame.getAppSize().setText(UtilsMy.a(f5.getCurrentSize()) + '/' + UtilsMy.a((long) (parseDouble * d5 * d5)));
                if (f5.getStatus() == 12) {
                    viewHolderGame.getProgressBarZip().setProgress((int) f5.getProgress());
                } else {
                    viewHolderGame.getProgressBar().setProgress((int) f5.getProgress());
                }
                if (f5.getStatus() == 2) {
                    viewHolderGame.getLodingInfo().setText(f5.getSpeed() + "/S");
                }
            }
        }

        public final void updateUi(@NotNull ViewHolderGame holder, boolean z4, boolean z5) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            if (z4) {
                holder.getLinearLayout2().setVisibility(8);
                holder.getProgressBar().setVisibility(8);
                holder.getProgressBarZip().setVisibility(8);
                holder.getTipsLayout().setVisibility(0);
                holder.getDescribe().setVisibility(0);
                return;
            }
            holder.getLinearLayout2().setVisibility(0);
            if (z5) {
                holder.getProgressBar().setVisibility(8);
                holder.getProgressBarZip().setVisibility(0);
            } else {
                holder.getProgressBarZip().setVisibility(8);
                holder.getProgressBar().setVisibility(0);
            }
            holder.getTipsLayout().setVisibility(8);
            holder.getDescribe().setVisibility(8);
        }

        /* JADX WARN: Type inference failed for: r14v8, types: [com.join.mgps.business.CollectionBeanSubBusiness, T] */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(@NotNull RecyclerView.ViewHolder p02, int i4) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            int itemViewType = getItemViewType(i4);
            if (itemViewType == 1) {
                Object any = this.showDataList.get(i4).getAny();
                Intrinsics.checkNotNull(any, "null cannot be cast to non-null type kotlin.String");
                ((ViewHolderTitle) p02).getTitle().setText((String) any);
            } else if (itemViewType != 2) {
            } else {
                final Ref.ObjectRef objectRef = new Ref.ObjectRef();
                Object any2 = this.showDataList.get(i4).getAny();
                Intrinsics.checkNotNull(any2, "null cannot be cast to non-null type com.join.mgps.business.CollectionBeanSubBusiness");
                ?? r14 = (CollectionBeanSubBusiness) any2;
                objectRef.element = r14;
                ViewHolderGame viewHolderGame = (ViewHolderGame) p02;
                DownloadTask downloadTask = ((CollectionBeanSubBusiness) r14).getDownloadTask();
                MyImageLoader.o(viewHolderGame.getIcon(), ((CollectionBeanSubBusiness) objectRef.element).getIco_remote(), R.drawable.main_normal_icon);
                viewHolderGame.getOpenTest().setVisibility(8);
                viewHolderGame.getTestTime().setText("");
                viewHolderGame.getTestType().setText("");
                viewHolderGame.getDownloadViewStroke().a(((CollectionBeanSubBusiness) objectRef.element).getDownloadTask(), (CollectionBeanSub) objectRef.element);
                UtilsMy.I(((CollectionBeanSubBusiness) objectRef.element).getScore(), ((CollectionBeanSubBusiness) objectRef.element).getDown_count(), ((CollectionBeanSubBusiness) objectRef.element).getSize(), ((CollectionBeanSubBusiness) objectRef.element).getSp_tag_info(), ((CollectionBeanSubBusiness) objectRef.element).getTag_info(), viewHolderGame.getTipsLayout(), this.context);
                viewHolderGame.getName().setText(((CollectionBeanSubBusiness) objectRef.element).getGame_name());
                viewHolderGame.getDescribe().setText(((CollectionBeanSubBusiness) objectRef.element).getInfo());
                CommonExtKt.onClick(viewHolderGame.getRelateLayoutApp(), new Function0<Unit>() { // from class: com.join.kotlin.EverdayNewFragment$EverdayNewAdapter$onBindViewHolder$1
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
                        IntentUtil.getInstance().goGameDetialActivity(EverdayNewFragment.EverdayNewAdapter.this.getContext(), objectRef.element.getGame_id(), objectRef.element.getGame_info_tpl_type(), 0, objectRef.element.get_from_type());
                    }
                });
                if (((CollectionBeanSubBusiness) objectRef.element).getGift_package_switch() == 1) {
                    viewHolderGame.getGiftPackageSwich().setVisibility(0);
                } else {
                    viewHolderGame.getGiftPackageSwich().setVisibility(8);
                }
                if (Intrinsics.areEqual(((CollectionBeanSubBusiness) objectRef.element).getPlugin_num(), String.valueOf(ConstantIntEnum.H5.value()))) {
                    viewHolderGame.getTipsLayout().setVisibility(8);
                    viewHolderGame.getGiftPackageSwich().setVisibility(8);
                } else if (downloadTask == null) {
                    updateUi(viewHolderGame, true, false);
                } else {
                    String size = ((CollectionBeanSubBusiness) objectRef.element).getSize();
                    Intrinsics.checkNotNullExpressionValue(size, "gameData.getSize()");
                    double parseDouble = Double.parseDouble(size);
                    double d5 = 1024;
                    Double.isNaN(d5);
                    Double.isNaN(d5);
                    long j4 = (long) (parseDouble * d5 * d5);
                    int status = downloadTask.getStatus();
                    if (status != 0) {
                        if (status != 42) {
                            if (status != 48) {
                                if (status != 2) {
                                    if (status != 3) {
                                        if (status != 5) {
                                            if (status != 6) {
                                                if (status != 7) {
                                                    switch (status) {
                                                        case 9:
                                                        case 11:
                                                            break;
                                                        case 10:
                                                            updateUi(viewHolderGame, false, false);
                                                            viewHolderGame.getAppSize().setText(UtilsMy.a(downloadTask.getCurrentSize()) + '/' + UtilsMy.a(j4));
                                                            viewHolderGame.getProgressBar().setProgress((int) downloadTask.getProgress());
                                                            viewHolderGame.getLodingInfo().setText("等待中");
                                                            return;
                                                        case 12:
                                                            updateUi(viewHolderGame, false, true);
                                                            viewHolderGame.getAppSize().setText(UtilsMy.a(j4) + '/' + UtilsMy.a(j4));
                                                            viewHolderGame.getProgressBarZip().setProgress((int) downloadTask.getProgress());
                                                            viewHolderGame.getLodingInfo().setText("解压中");
                                                            return;
                                                        case 13:
                                                            updateUi(viewHolderGame, false, true);
                                                            viewHolderGame.getAppSize().setText(UtilsMy.a(j4) + '/' + UtilsMy.a(j4));
                                                            viewHolderGame.getProgressBarZip().setProgress((int) downloadTask.getProgress());
                                                            viewHolderGame.getLodingInfo().setText("点击重新解压");
                                                            return;
                                                        default:
                                                            return;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    updateUi(viewHolderGame, false, false);
                                    try {
                                        if (downloadTask.getSize() == 0) {
                                            viewHolderGame.getAppSize().setText(UtilsMy.a(downloadTask.getCurrentSize()) + '/' + UtilsMy.a(j4));
                                        } else {
                                            viewHolderGame.getAppSize().setText(UtilsMy.a(downloadTask.getCurrentSize()) + '/' + UtilsMy.a(j4));
                                        }
                                        viewHolderGame.getProgressBar().setProgress((int) downloadTask.getProgress());
                                    } catch (Exception e5) {
                                        e5.printStackTrace();
                                    }
                                    viewHolderGame.getLodingInfo().setText("暂停中");
                                    return;
                                }
                                updateUi(viewHolderGame, false, false);
                                viewHolderGame.getAppSize().setText(UtilsMy.a(downloadTask.getCurrentSize()) + '/' + UtilsMy.a(j4));
                                viewHolderGame.getProgressBar().setProgress((int) downloadTask.getProgress());
                                viewHolderGame.getLodingInfo().setText(downloadTask.getSpeed() + "/S");
                                return;
                            }
                        }
                        updateUi(viewHolderGame, true, true);
                        return;
                    }
                    updateUi(viewHolderGame, true, false);
                }
            }
        }
    }
}
