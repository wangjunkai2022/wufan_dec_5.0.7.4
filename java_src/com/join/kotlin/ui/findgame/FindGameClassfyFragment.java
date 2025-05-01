package com.join.kotlin.ui.findgame;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.join.android.app.common.utils.JsonMapper;
import com.join.android.app.component.xrecyclerview.XRecyclerView;
import com.join.android.app.mgsim.wufun.R;
import com.join.android.app.mgsim.wufun.databinding.FindgameClassfyCategoryItemBinding;
import com.join.android.app.mgsim.wufun.databinding.FindgameClassfyFragmentLayoutBinding;
import com.join.kotlin.presenter.FindModlePrensenter;
import com.join.kotlin.presenter.view.FindHomeView;
import com.join.kotlin.ui.findgame.FindGameClassfyFragment;
import com.join.kotlin.ui.findgame.adapter.FindClassifyAdapter;
import com.join.kotlin.ui.findgame.adapter.FindTypeListAdapter;
import com.join.kotlin.ui.findgame.data.FindChoiceBannerData;
import com.join.kotlin.ui.findgame.data.FindChoiceResultData;
import com.join.kotlin.ui.findgame.data.FindClassifyResultData;
import com.join.kotlin.ui.findgame.data.GameSubTypeData;
import com.join.kotlin.ui.findgame.data.GameTypeData;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.Util.d0;
import com.join.mgps.activity.vipzone.bean.LuckHistoryrequest;
import com.join.mgps.business.CollectionBeanSubBusiness;
import com.join.mgps.dto.CommonGameInfoBean;
import com.join.mgps.event.n;
import com.join.mgps.pref.PrefDef_;
import com.psk.kotlin.ext.CommonExtKt;
import com.psk.kotlin.util.BasDownLoadActivityPresenter;
import com.psk.kotlin.util.CommonListMainData;
import com.psk.kotlin.util.GridSpacingItemDecoration;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: FindGameClassfyFragment.kt */
@SourceDebugExtension({"SMAP\nFindGameClassfyFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FindGameClassfyFragment.kt\ncom/join/kotlin/ui/findgame/FindGameClassfyFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,385:1\n1855#2,2:386\n766#2:388\n857#2,2:389\n1360#2:391\n1446#2,5:392\n1855#2,2:397\n766#2:399\n857#2,2:400\n1360#2:402\n1446#2,5:403\n1855#2,2:408\n766#2:410\n857#2,2:411\n1360#2:413\n1446#2,5:414\n1855#2,2:419\n*S KotlinDebug\n*F\n+ 1 FindGameClassfyFragment.kt\ncom/join/kotlin/ui/findgame/FindGameClassfyFragment\n*L\n215#1:386,2\n305#1:388\n305#1:389,2\n305#1:391\n305#1:392,5\n306#1:397,2\n325#1:399\n325#1:400,2\n325#1:402\n325#1:403,5\n326#1:408,2\n345#1:410\n345#1:411,2\n345#1:413\n345#1:414,5\n346#1:419,2\n*E\n"})
/* loaded from: classes.dex */
public final class FindGameClassfyFragment extends Fragment implements FindHomeView {
    public FindgameClassfyFragmentLayoutBinding binding;
    public BasDownLoadActivityPresenter downloadprensenter;
    public FindClassifyAdapter findClassifyAdapter;
    public FindTypeListAdapter findTypeAdapter;
    public List<GameTypeData> gameTypeList;
    public TabRecycleAdapter leftTypeAdapter;
    public FindModlePrensenter presenter;
    public LuckHistoryrequest requestArgs;
    private int selectedType;
    @NotNull
    private List<CommonListMainData> choiceListData = new ArrayList();
    @NotNull
    private List<CommonListMainData> datas = new ArrayList();
    private int page = 1;

    /* compiled from: FindGameClassfyFragment.kt */
    /* loaded from: classes3.dex */
    public interface OnSelectedTabListener {
        void onSelected(int i4);
    }

    /* compiled from: FindGameClassfyFragment.kt */
    /* loaded from: classes3.dex */
    public static final class TabRecycleAdapter extends RecyclerView.Adapter<TabViewHolder> {
        @NotNull
        private Context context;
        @NotNull
        private List<GameTypeData> gameTypeList;
        @NotNull
        private OnSelectedTabListener listener;

        public TabRecycleAdapter(@NotNull Context context, @NotNull OnSelectedTabListener listener, @NotNull List<GameTypeData> gameTypeList) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(listener, "listener");
            Intrinsics.checkNotNullParameter(gameTypeList, "gameTypeList");
            this.context = context;
            this.listener = listener;
            this.gameTypeList = gameTypeList;
        }

        @NotNull
        public final Context getContext() {
            return this.context;
        }

        @NotNull
        public final List<GameTypeData> getGameTypeList() {
            return this.gameTypeList;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.gameTypeList.size();
        }

        @NotNull
        public final OnSelectedTabListener getListener() {
            return this.listener;
        }

        public final void setContext(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "<set-?>");
            this.context = context;
        }

        public final void setGameTypeList(@NotNull List<GameTypeData> list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.gameTypeList = list;
        }

        public final void setListener(@NotNull OnSelectedTabListener onSelectedTabListener) {
            Intrinsics.checkNotNullParameter(onSelectedTabListener, "<set-?>");
            this.listener = onSelectedTabListener;
        }

        /* JADX WARN: Type inference failed for: r4v1, types: [T, java.lang.Object] */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(@NotNull TabViewHolder p02, int i4) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = this.gameTypeList.get(i4);
            p02.getBinding().f19501c.setText(((GameTypeData) objectRef.element).getTitle());
            p02.getBinding().f19501c.setSelected(((GameTypeData) objectRef.element).isSelected());
            TextView textView = p02.getBinding().f19501c;
            Intrinsics.checkNotNullExpressionValue(textView, "p0.binding.mTopCategoryNameTv");
            CommonExtKt.onClick(textView, new Function0<Unit>() { // from class: com.join.kotlin.ui.findgame.FindGameClassfyFragment$TabRecycleAdapter$onBindViewHolder$1
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
                    for (GameTypeData gameTypeData : FindGameClassfyFragment.TabRecycleAdapter.this.getGameTypeList()) {
                        gameTypeData.setSelected(objectRef.element.getType() == gameTypeData.getType());
                    }
                    FindGameClassfyFragment.TabRecycleAdapter.this.notifyDataSetChanged();
                    FindGameClassfyFragment.TabRecycleAdapter.this.getListener().onSelected(objectRef.element.getType());
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NotNull
        public TabViewHolder onCreateViewHolder(@NotNull ViewGroup p02, int i4) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            FindgameClassfyCategoryItemBinding inflate = FindgameClassfyCategoryItemBinding.inflate(LayoutInflater.from(this.context), p02, false);
            Intrinsics.checkNotNullExpressionValue(inflate, "inflate(\n               …, false\n                )");
            return new TabViewHolder(inflate);
        }
    }

    /* compiled from: FindGameClassfyFragment.kt */
    /* loaded from: classes3.dex */
    public static final class TabViewHolder extends RecyclerView.ViewHolder {
        @NotNull
        private FindgameClassfyCategoryItemBinding binding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TabViewHolder(@NotNull FindgameClassfyCategoryItemBinding bindingx) {
            super(bindingx.getRoot());
            Intrinsics.checkNotNullParameter(bindingx, "bindingx");
            this.binding = bindingx;
        }

        @NotNull
        public final FindgameClassfyCategoryItemBinding getBinding() {
            return this.binding;
        }

        public final void setBinding(@NotNull FindgameClassfyCategoryItemBinding findgameClassfyCategoryItemBinding) {
            Intrinsics.checkNotNullParameter(findgameClassfyCategoryItemBinding, "<set-?>");
            this.binding = findgameClassfyCategoryItemBinding;
        }
    }

    @NotNull
    public final FindgameClassfyFragmentLayoutBinding getBinding() {
        FindgameClassfyFragmentLayoutBinding findgameClassfyFragmentLayoutBinding = this.binding;
        if (findgameClassfyFragmentLayoutBinding != null) {
            return findgameClassfyFragmentLayoutBinding;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    @NotNull
    public final List<CommonListMainData> getChoiceListData() {
        return this.choiceListData;
    }

    @NotNull
    public final List<CommonListMainData> getDatas() {
        return this.datas;
    }

    @NotNull
    public final BasDownLoadActivityPresenter getDownloadprensenter() {
        BasDownLoadActivityPresenter basDownLoadActivityPresenter = this.downloadprensenter;
        if (basDownLoadActivityPresenter != null) {
            return basDownLoadActivityPresenter;
        }
        Intrinsics.throwUninitializedPropertyAccessException("downloadprensenter");
        return null;
    }

    @NotNull
    public final FindClassifyAdapter getFindClassifyAdapter() {
        FindClassifyAdapter findClassifyAdapter = this.findClassifyAdapter;
        if (findClassifyAdapter != null) {
            return findClassifyAdapter;
        }
        Intrinsics.throwUninitializedPropertyAccessException("findClassifyAdapter");
        return null;
    }

    @NotNull
    public final FindTypeListAdapter getFindTypeAdapter() {
        FindTypeListAdapter findTypeListAdapter = this.findTypeAdapter;
        if (findTypeListAdapter != null) {
            return findTypeListAdapter;
        }
        Intrinsics.throwUninitializedPropertyAccessException("findTypeAdapter");
        return null;
    }

    @NotNull
    public final List<GameTypeData> getGameTypeList() {
        List<GameTypeData> list = this.gameTypeList;
        if (list != null) {
            return list;
        }
        Intrinsics.throwUninitializedPropertyAccessException("gameTypeList");
        return null;
    }

    @NotNull
    public final TabRecycleAdapter getLeftTypeAdapter() {
        TabRecycleAdapter tabRecycleAdapter = this.leftTypeAdapter;
        if (tabRecycleAdapter != null) {
            return tabRecycleAdapter;
        }
        Intrinsics.throwUninitializedPropertyAccessException("leftTypeAdapter");
        return null;
    }

    public final int getPage() {
        return this.page;
    }

    @NotNull
    public final FindModlePrensenter getPresenter() {
        FindModlePrensenter findModlePrensenter = this.presenter;
        if (findModlePrensenter != null) {
            return findModlePrensenter;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @NotNull
    public final LuckHistoryrequest getRequestArgs() {
        LuckHistoryrequest luckHistoryrequest = this.requestArgs;
        if (luckHistoryrequest != null) {
            return luckHistoryrequest;
        }
        Intrinsics.throwUninitializedPropertyAccessException("requestArgs");
        return null;
    }

    public final int getSelectedType() {
        return this.selectedType;
    }

    @Override // com.psk.kotlin.base.presenter.view.BaseView
    public void hidLoading() {
        getBinding().f19506f.f23562d.setVisibility(8);
        getBinding().f19504d.f19364e.setVisibility(8);
        getBinding().f19505e.setVisibility(0);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        FindgameClassfyFragmentLayoutBinding inflate = FindgameClassfyFragmentLayoutBinding.inflate(inflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(inflater, container, false)");
        setBinding(inflate);
        d0.a().d(this);
        getBinding().f19507g.setLayoutManager(new LinearLayoutManager(getContext()));
        setGameTypeList(new ArrayList());
        String d5 = new PrefDef_(getContext()).gameTypeList().d();
        if (!(d5 == null || d5.length() == 0)) {
            Object readValue = new ObjectMapper().readValue(d5, JsonMapper.getInstance().createCollectionType(List.class, GameTypeData.class));
            Intrinsics.checkNotNullExpressionValue(readValue, "ObjectMapper().readValue…class.java)\n            )");
            setGameTypeList((List) readValue);
        }
        if (getGameTypeList().size() == 0) {
            getGameTypeList().add(new GameTypeData(0, "精选", 0, null, true));
            getGameTypeList().add(new GameTypeData(1, "模拟器", 1, null, false));
            getGameTypeList().add(new GameTypeData(2, "安卓", 2, null, false));
            getGameTypeList().add(new GameTypeData(3, "分类", 3, null, false));
            getGameTypeList().add(new GameTypeData(4, "题材", 4, null, false));
            getGameTypeList().add(new GameTypeData(5, "玩法", 5, null, false));
            getGameTypeList().add(new GameTypeData(6, "特色", 6, null, false));
        }
        FragmentActivity activity = getActivity();
        Intrinsics.checkNotNull(activity);
        setLeftTypeAdapter(new TabRecycleAdapter(activity, new OnSelectedTabListener() { // from class: com.join.kotlin.ui.findgame.FindGameClassfyFragment$onCreateView$1
            @Override // com.join.kotlin.ui.findgame.FindGameClassfyFragment.OnSelectedTabListener
            public void onSelected(int i4) {
                FindGameClassfyFragment.this.setSelectedType(i4);
                List<CommonListMainData> choiceListData = FindGameClassfyFragment.this.getChoiceListData();
                if (choiceListData == null || choiceListData.isEmpty()) {
                    return;
                }
                FindGameClassfyFragment.this.showTypeList(i4);
            }
        }, getGameTypeList()));
        getBinding().f19507g.setAdapter(getLeftTypeAdapter());
        getLeftTypeAdapter().notifyDataSetChanged();
        Button button = getBinding().f19504d.f19366g;
        Intrinsics.checkNotNullExpressionValue(button, "binding.failedLayoutMain.setNetwork");
        CommonExtKt.onClick(button, new Function0<Unit>() { // from class: com.join.kotlin.ui.findgame.FindGameClassfyFragment$onCreateView$2
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
                UtilsMy.w3(FindGameClassfyFragment.this.getContext());
            }
        });
        ImageView imageView = getBinding().f19504d.f19365f;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.failedLayoutMain.relodingimag");
        CommonExtKt.onClick(imageView, new Function0<Unit>() { // from class: com.join.kotlin.ui.findgame.FindGameClassfyFragment$onCreateView$3
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
                FindModlePrensenter presenter = FindGameClassfyFragment.this.getPresenter();
                FragmentActivity activity2 = FindGameClassfyFragment.this.getActivity();
                Intrinsics.checkNotNull(activity2);
                presenter.loadClassfyDatas(activity2, FindGameClassfyFragment.this.getRequestArgs());
            }
        });
        setPresenter(new FindModlePrensenter(this));
        FragmentActivity activity2 = getActivity();
        Intrinsics.checkNotNull(activity2);
        setFindClassifyAdapter(new FindClassifyAdapter(activity2, this.choiceListData));
        getBinding().f19503c.setAdapter(getFindClassifyAdapter());
        getBinding().f19508h.setLoadingMoreEnabled(false);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 6);
        gridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() { // from class: com.join.kotlin.ui.findgame.FindGameClassfyFragment$onCreateView$4
            @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
            public int getSpanSize(int i4) {
                if (i4 >= FindGameClassfyFragment.this.getChoiceListData().size() || FindGameClassfyFragment.this.getChoiceListData().get(i4).getType() == 3 || FindGameClassfyFragment.this.getChoiceListData().get(i4).getType() == 1) {
                    return 6;
                }
                return FindGameClassfyFragment.this.getChoiceListData().get(i4).getType() == 7 ? 3 : 2;
            }
        });
        getBinding().f19503c.setLayoutManager(gridLayoutManager);
        XRecyclerView xRecyclerView = getBinding().f19503c;
        Intrinsics.checkNotNullExpressionValue(xRecyclerView, "binding.dataList");
        setDownloadprensenter(new BasDownLoadActivityPresenter(gridLayoutManager, xRecyclerView, this.choiceListData));
        getDownloadprensenter().initData(getFindClassifyAdapter());
        FragmentActivity activity3 = getActivity();
        Intrinsics.checkNotNull(activity3);
        setFindTypeAdapter(new FindTypeListAdapter(activity3, getId(), this.datas, new FindTypeListAdapter.OnItenSelected() { // from class: com.join.kotlin.ui.findgame.FindGameClassfyFragment$onCreateView$5
            @Override // com.join.kotlin.ui.findgame.adapter.FindTypeListAdapter.OnItenSelected
            public void onItemselected(@NotNull GameSubTypeData type) {
                Intrinsics.checkNotNullParameter(type, "type");
                Intent intent = new Intent(FindGameClassfyFragment.this.getContext(), CategoryDetailListActivity.class);
                intent.putExtra("typeId", FindGameClassfyFragment.this.getSelectedType());
                intent.putExtra("tagId", type.getId());
                intent.putExtra("tagName", type.getTitle());
                Context context = FindGameClassfyFragment.this.getContext();
                if (context != null) {
                    context.startActivity(intent);
                }
            }
        }));
        getBinding().f19508h.setAdapter(getFindTypeAdapter());
        return getBinding().getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        d0.a().e(this);
    }

    @Override // com.psk.kotlin.base.presenter.view.BaseView
    public void onError(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        FragmentActivity activity = getActivity();
        if (activity != null) {
            CommonExtKt.toast(activity, message);
        }
        List<CommonListMainData> list = this.choiceListData;
        if ((list == null || list.isEmpty()) || this.choiceListData.size() <= 0) {
            getBinding().f19506f.f23562d.setVisibility(8);
            getBinding().f19504d.f19364e.setVisibility(0);
            getBinding().f19505e.setVisibility(8);
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull n downloadTaskEvent) {
        Intrinsics.checkNotNullParameter(downloadTaskEvent, "downloadTaskEvent");
        getDownloadprensenter().onEventMainThread(downloadTaskEvent);
    }

    @Override // com.join.kotlin.presenter.view.FindHomeView
    public void onLoadDataSuccess(int i4, @NotNull FindChoiceResultData findChoiceResultData) {
        FindHomeView.DefaultImpls.onLoadDataSuccess(this, i4, findChoiceResultData);
    }

    @Override // com.join.kotlin.presenter.view.FindHomeView
    public void onLoadDataSuccessV9(int i4, @NotNull FindClassifyResultData result) {
        List<CommonGameInfoBean> collection_list;
        Intrinsics.checkNotNullParameter(result, "result");
        if (i4 == 1 || i4 == this.page) {
            if (i4 == 1) {
                this.page = 1;
                getBinding().f19503c.refreshComplete();
                this.choiceListData.clear();
                List<GameTypeData> game_type = result.getGame_type();
                Intrinsics.checkNotNullExpressionValue(game_type, "result.game_type");
                setGameTypeList(game_type);
                getGameTypeList().add(0, new GameTypeData(0, "精选", 0, null, true));
                try {
                    new PrefDef_(requireContext()).gameTypeList().g(JsonMapper.getInstance().toJson(getGameTypeList()));
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
                getLeftTypeAdapter().notifyDataSetChanged();
                List<FindChoiceBannerData> banner = result.getBanner();
                if (!(banner == null || banner.isEmpty())) {
                    FindChoiceBannerData findChoiceBannerData = result.getBanner().get(0);
                    findChoiceBannerData.getGame_info().set_from(143);
                    findChoiceBannerData.getGame_info().set_from_type(143);
                    BasDownLoadActivityPresenter downloadprensenter = getDownloadprensenter();
                    CollectionBeanSubBusiness game_info = findChoiceBannerData.getGame_info();
                    Intrinsics.checkNotNullExpressionValue(game_info, "choiceBannerData.game_info");
                    downloadprensenter.updateDowState(game_info);
                    List<CommonListMainData> list = this.choiceListData;
                    FindChoiceBannerData findChoiceBannerData2 = result.getBanner().get(0);
                    Intrinsics.checkNotNullExpressionValue(findChoiceBannerData2, "result.banner[0]");
                    list.add(new CommonListMainData(3, findChoiceBannerData2, null, null, 12, null));
                }
            }
            Intrinsics.checkNotNullExpressionValue(result.getCollection_list(), "result.collection_list");
            if (!collection_list.isEmpty()) {
                getBinding().f19503c.loadMoreComplete();
                this.page++;
            } else {
                getBinding().f19503c.setNoMore();
            }
            List<CommonGameInfoBean> collection_list2 = result.getCollection_list();
            if (collection_list2 != null) {
                for (CommonGameInfoBean itx : collection_list2) {
                    List<CommonListMainData> list2 = this.choiceListData;
                    Intrinsics.checkNotNullExpressionValue(itx, "itx");
                    list2.add(new CommonListMainData(7, itx, null, null, 12, null));
                }
            }
            getFindClassifyAdapter().notifyDataSetChanged();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        setRequestArgs(new LuckHistoryrequest());
        getRequestArgs().setPage(1);
        getRequestArgs().setUid(AccountUtil_.getInstance_(getActivity()).getAccountData().getUid());
        FindModlePrensenter presenter = getPresenter();
        FragmentActivity activity = getActivity();
        Intrinsics.checkNotNull(activity);
        presenter.loadClassfyDatas(activity, getRequestArgs());
        getBinding().f19503c.setPullRefreshEnabled(true);
        getBinding().f19503c.setLoadingMoreEnabled(true);
        getBinding().f19503c.setPreLoadCount(10);
        getBinding().f19503c.setLoadingListener(new XRecyclerView.f() { // from class: com.join.kotlin.ui.findgame.FindGameClassfyFragment$onViewCreated$1
            @Override // com.join.android.app.component.xrecyclerview.XRecyclerView.f
            public void onLoadMore() {
                FindGameClassfyFragment.this.getRequestArgs().setPage(FindGameClassfyFragment.this.getPage());
                FindModlePrensenter presenter2 = FindGameClassfyFragment.this.getPresenter();
                FragmentActivity activity2 = FindGameClassfyFragment.this.getActivity();
                Intrinsics.checkNotNull(activity2);
                presenter2.loadClassfyDatas(activity2, FindGameClassfyFragment.this.getRequestArgs());
            }

            @Override // com.join.android.app.component.xrecyclerview.XRecyclerView.f
            public void onRefresh() {
                FindGameClassfyFragment.this.getBinding().f19503c.reset();
                FindGameClassfyFragment.this.setPage(1);
                FindGameClassfyFragment.this.getRequestArgs().setPage(FindGameClassfyFragment.this.getPage());
                FindModlePrensenter presenter2 = FindGameClassfyFragment.this.getPresenter();
                FragmentActivity activity2 = FindGameClassfyFragment.this.getActivity();
                Intrinsics.checkNotNull(activity2);
                presenter2.loadClassfyDatas(activity2, FindGameClassfyFragment.this.getRequestArgs());
            }
        });
    }

    public final void setBinding(@NotNull FindgameClassfyFragmentLayoutBinding findgameClassfyFragmentLayoutBinding) {
        Intrinsics.checkNotNullParameter(findgameClassfyFragmentLayoutBinding, "<set-?>");
        this.binding = findgameClassfyFragmentLayoutBinding;
    }

    public final void setChoiceListData(@NotNull List<CommonListMainData> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.choiceListData = list;
    }

    public final void setDatas(@NotNull List<CommonListMainData> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.datas = list;
    }

    public final void setDownloadprensenter(@NotNull BasDownLoadActivityPresenter basDownLoadActivityPresenter) {
        Intrinsics.checkNotNullParameter(basDownLoadActivityPresenter, "<set-?>");
        this.downloadprensenter = basDownLoadActivityPresenter;
    }

    public final void setFindClassifyAdapter(@NotNull FindClassifyAdapter findClassifyAdapter) {
        Intrinsics.checkNotNullParameter(findClassifyAdapter, "<set-?>");
        this.findClassifyAdapter = findClassifyAdapter;
    }

    public final void setFindTypeAdapter(@NotNull FindTypeListAdapter findTypeListAdapter) {
        Intrinsics.checkNotNullParameter(findTypeListAdapter, "<set-?>");
        this.findTypeAdapter = findTypeListAdapter;
    }

    public final void setGameTypeList(@NotNull List<GameTypeData> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.gameTypeList = list;
    }

    public final void setLeftTypeAdapter(@NotNull TabRecycleAdapter tabRecycleAdapter) {
        Intrinsics.checkNotNullParameter(tabRecycleAdapter, "<set-?>");
        this.leftTypeAdapter = tabRecycleAdapter;
    }

    public final void setPage(int i4) {
        this.page = i4;
    }

    public final void setPresenter(@NotNull FindModlePrensenter findModlePrensenter) {
        Intrinsics.checkNotNullParameter(findModlePrensenter, "<set-?>");
        this.presenter = findModlePrensenter;
    }

    public final void setRequestArgs(@NotNull LuckHistoryrequest luckHistoryrequest) {
        Intrinsics.checkNotNullParameter(luckHistoryrequest, "<set-?>");
        this.requestArgs = luckHistoryrequest;
    }

    public final void setSelectedType(int i4) {
        this.selectedType = i4;
    }

    @Override // com.psk.kotlin.base.presenter.view.BaseView
    public void showLoding() {
        getBinding().f19506f.f23562d.setVisibility(0);
        getBinding().f19504d.f19364e.setVisibility(8);
        getBinding().f19505e.setVisibility(8);
    }

    public final void showTypeList(int i4) {
        try {
            if (i4 == 0) {
                getBinding().f19505e.setVisibility(0);
                getBinding().f19508h.setVisibility(8);
                getFindClassifyAdapter();
                return;
            }
            getBinding().f19505e.setVisibility(8);
            getBinding().f19508h.setVisibility(0);
            this.datas.clear();
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.wdp16);
            switch (i4) {
                case 1:
                    getBinding().f19508h.setLayoutManager(new GridLayoutManager(getContext(), 2));
                    while (getBinding().f19508h.getItemDecorationCount() > 0) {
                        getBinding().f19508h.removeItemDecorationAt(0);
                    }
                    getBinding().f19508h.addItemDecoration(new GridSpacingItemDecoration(2, dimensionPixelOffset, false));
                    List<GameTypeData> gameTypeList = getGameTypeList();
                    ArrayList<GameTypeData> arrayList = new ArrayList();
                    for (Object obj : gameTypeList) {
                        if (((GameTypeData) obj).getType() == i4) {
                            arrayList.add(obj);
                        }
                    }
                    ArrayList<GameSubTypeData> arrayList2 = new ArrayList();
                    for (GameTypeData gameTypeData : arrayList) {
                        List<GameSubTypeData> sub_game_type = gameTypeData.getSub_game_type();
                        Intrinsics.checkNotNull(sub_game_type);
                        CollectionsKt__MutableCollectionsKt.addAll(arrayList2, sub_game_type);
                    }
                    for (GameSubTypeData e5 : arrayList2) {
                        List<CommonListMainData> list = this.datas;
                        Intrinsics.checkNotNullExpressionValue(e5, "e");
                        list.add(new CommonListMainData(3, e5, null, null, 12, null));
                    }
                    break;
                case 2:
                case 3:
                    getBinding().f19508h.setLayoutManager(new GridLayoutManager(getContext(), 1));
                    while (getBinding().f19508h.getItemDecorationCount() > 0) {
                        getBinding().f19508h.removeItemDecorationAt(0);
                    }
                    getBinding().f19508h.addItemDecoration(new GridSpacingItemDecoration(1, dimensionPixelOffset, false));
                    List<GameTypeData> gameTypeList2 = getGameTypeList();
                    ArrayList<GameTypeData> arrayList3 = new ArrayList();
                    for (Object obj2 : gameTypeList2) {
                        if (((GameTypeData) obj2).getType() == i4) {
                            arrayList3.add(obj2);
                        }
                    }
                    ArrayList<GameSubTypeData> arrayList4 = new ArrayList();
                    for (GameTypeData gameTypeData2 : arrayList3) {
                        List<GameSubTypeData> sub_game_type2 = gameTypeData2.getSub_game_type();
                        Intrinsics.checkNotNull(sub_game_type2);
                        CollectionsKt__MutableCollectionsKt.addAll(arrayList4, sub_game_type2);
                    }
                    for (GameSubTypeData e6 : arrayList4) {
                        List<CommonListMainData> list2 = this.datas;
                        Intrinsics.checkNotNullExpressionValue(e6, "e");
                        list2.add(new CommonListMainData(3, e6, null, null, 12, null));
                    }
                    break;
                case 4:
                case 5:
                case 6:
                    getBinding().f19508h.setLayoutManager(new GridLayoutManager(getContext(), 3));
                    while (getBinding().f19508h.getItemDecorationCount() > 0) {
                        getBinding().f19508h.removeItemDecorationAt(0);
                    }
                    getBinding().f19508h.addItemDecoration(new GridSpacingItemDecoration(3, dimensionPixelOffset, false));
                    List<GameTypeData> gameTypeList3 = getGameTypeList();
                    ArrayList<GameTypeData> arrayList5 = new ArrayList();
                    for (Object obj3 : gameTypeList3) {
                        if (((GameTypeData) obj3).getType() == i4) {
                            arrayList5.add(obj3);
                        }
                    }
                    ArrayList<GameSubTypeData> arrayList6 = new ArrayList();
                    for (GameTypeData gameTypeData3 : arrayList5) {
                        List<GameSubTypeData> sub_game_type3 = gameTypeData3.getSub_game_type();
                        Intrinsics.checkNotNull(sub_game_type3);
                        CollectionsKt__MutableCollectionsKt.addAll(arrayList6, sub_game_type3);
                    }
                    for (GameSubTypeData e7 : arrayList6) {
                        List<CommonListMainData> list3 = this.datas;
                        Intrinsics.checkNotNullExpressionValue(e7, "e");
                        list3.add(new CommonListMainData(7, e7, null, null, 12, null));
                    }
                    break;
            }
            getFindTypeAdapter().updateDatas(i4);
        } catch (Exception unused) {
        }
    }
}
