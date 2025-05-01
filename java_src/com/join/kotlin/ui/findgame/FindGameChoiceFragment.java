package com.join.kotlin.ui.findgame;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.join.android.app.component.xrecyclerview.XRecyclerView;
import com.join.android.app.mgsim.wufun.databinding.FindgameAllfragemntLayoutBinding;
import com.join.kotlin.presenter.FindModlePrensenter;
import com.join.kotlin.presenter.view.FindHomeView;
import com.join.kotlin.ui.findgame.adapter.FindHomeChoiceAdapter;
import com.join.kotlin.ui.findgame.data.FindChoiceBannerData;
import com.join.kotlin.ui.findgame.data.FindChoiceColloctionListData;
import com.join.kotlin.ui.findgame.data.FindChoiceResultData;
import com.join.kotlin.ui.findgame.data.FindClassifyResultData;
import com.join.kotlin.ui.findgame.data.TagData;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.Util.d0;
import com.join.mgps.activity.vipzone.bean.LuckHistoryrequest;
import com.join.mgps.business.CollectionBeanSubBusiness;
import com.join.mgps.dto.CollectionBeanSub;
import com.join.mgps.event.n;
import com.psk.kotlin.ext.CommonExtKt;
import com.psk.kotlin.util.BasDownLoadActivityPresenter;
import com.psk.kotlin.util.CommonListMainData;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: FindGameChoiceFragment.kt */
@SourceDebugExtension({"SMAP\nFindGameChoiceFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FindGameChoiceFragment.kt\ncom/join/kotlin/ui/findgame/FindGameChoiceFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,175:1\n1855#2,2:176\n*S KotlinDebug\n*F\n+ 1 FindGameChoiceFragment.kt\ncom/join/kotlin/ui/findgame/FindGameChoiceFragment\n*L\n110#1:176,2\n*E\n"})
/* loaded from: classes.dex */
public final class FindGameChoiceFragment extends Fragment implements FindHomeView {
    public FindHomeChoiceAdapter adapter;
    public FindgameAllfragemntLayoutBinding binding;
    public BasDownLoadActivityPresenter downloadprensenter;
    private int page = 1;
    public FindModlePrensenter prensenter;
    public LuckHistoryrequest requestArgs;
    public List<CommonListMainData> showDatalist;

    @NotNull
    public final FindHomeChoiceAdapter getAdapter() {
        FindHomeChoiceAdapter findHomeChoiceAdapter = this.adapter;
        if (findHomeChoiceAdapter != null) {
            return findHomeChoiceAdapter;
        }
        Intrinsics.throwUninitializedPropertyAccessException("adapter");
        return null;
    }

    @NotNull
    public final FindgameAllfragemntLayoutBinding getBinding() {
        FindgameAllfragemntLayoutBinding findgameAllfragemntLayoutBinding = this.binding;
        if (findgameAllfragemntLayoutBinding != null) {
            return findgameAllfragemntLayoutBinding;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
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

    public final int getPage() {
        return this.page;
    }

    @NotNull
    public final FindModlePrensenter getPrensenter() {
        FindModlePrensenter findModlePrensenter = this.prensenter;
        if (findModlePrensenter != null) {
            return findModlePrensenter;
        }
        Intrinsics.throwUninitializedPropertyAccessException("prensenter");
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

    @NotNull
    public final List<CommonListMainData> getShowDatalist() {
        List<CommonListMainData> list = this.showDatalist;
        if (list != null) {
            return list;
        }
        Intrinsics.throwUninitializedPropertyAccessException("showDatalist");
        return null;
    }

    @Override // com.psk.kotlin.base.presenter.view.BaseView
    public void hidLoading() {
        getBinding().f19499f.loadMoreComplete();
        getBinding().f19498e.f23562d.setVisibility(8);
        getBinding().f19496c.f19364e.setVisibility(8);
        getBinding().f19499f.setVisibility(0);
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [T, com.join.mgps.activity.vipzone.bean.LuckHistoryrequest] */
    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        FindgameAllfragemntLayoutBinding inflate = FindgameAllfragemntLayoutBinding.inflate(inflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(inflater, container, false)");
        setBinding(inflate);
        setPrensenter(new FindModlePrensenter(this));
        d0.a().d(this);
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ?? luckHistoryrequest = new LuckHistoryrequest();
        objectRef.element = luckHistoryrequest;
        ((LuckHistoryrequest) luckHistoryrequest).setPage(1);
        ((LuckHistoryrequest) objectRef.element).setUid(AccountUtil_.getInstance_(getActivity()).getAccountData().getUid());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        getBinding().f19499f.setLayoutManager(linearLayoutManager);
        setShowDatalist(new ArrayList());
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
        setAdapter(new FindHomeChoiceAdapter(requireActivity, getShowDatalist()));
        getBinding().f19499f.setAdapter(getAdapter());
        XRecyclerView xRecyclerView = getBinding().f19499f;
        Intrinsics.checkNotNullExpressionValue(xRecyclerView, "binding.recycleView");
        setDownloadprensenter(new BasDownLoadActivityPresenter(linearLayoutManager, xRecyclerView, getShowDatalist()));
        getDownloadprensenter().initData(getAdapter());
        FindModlePrensenter prensenter = getPrensenter();
        FragmentActivity requireActivity2 = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity2, "requireActivity()");
        prensenter.loadFindChoiceData(requireActivity2, (LuckHistoryrequest) objectRef.element);
        getBinding().f19499f.setPullRefreshEnabled(true);
        getBinding().f19499f.setLoadingMoreEnabled(true);
        getBinding().f19499f.setPreLoadCount(10);
        Button button = getBinding().f19496c.f19366g;
        Intrinsics.checkNotNullExpressionValue(button, "binding.failedLayoutMain.setNetwork");
        CommonExtKt.onClick(button, new Function0<Unit>() { // from class: com.join.kotlin.ui.findgame.FindGameChoiceFragment$onCreateView$1
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
                UtilsMy.w3(FindGameChoiceFragment.this.getContext());
            }
        });
        ImageView imageView = getBinding().f19496c.f19365f;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.failedLayoutMain.relodingimag");
        CommonExtKt.onClick(imageView, new Function0<Unit>() { // from class: com.join.kotlin.ui.findgame.FindGameChoiceFragment$onCreateView$2
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
                FindModlePrensenter prensenter2 = FindGameChoiceFragment.this.getPrensenter();
                FragmentActivity requireActivity3 = FindGameChoiceFragment.this.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity3, "requireActivity()");
                prensenter2.loadFindChoiceData(requireActivity3, objectRef.element);
            }
        });
        getBinding().f19499f.setLoadingListener(new XRecyclerView.f() { // from class: com.join.kotlin.ui.findgame.FindGameChoiceFragment$onCreateView$3
            @Override // com.join.android.app.component.xrecyclerview.XRecyclerView.f
            public void onLoadMore() {
                objectRef.element.setPage(FindGameChoiceFragment.this.getPage());
                FindModlePrensenter prensenter2 = FindGameChoiceFragment.this.getPrensenter();
                FragmentActivity activity = FindGameChoiceFragment.this.getActivity();
                Intrinsics.checkNotNull(activity);
                prensenter2.loadFindChoiceData(activity, objectRef.element);
            }

            @Override // com.join.android.app.component.xrecyclerview.XRecyclerView.f
            public void onRefresh() {
                FindGameChoiceFragment.this.setPage(1);
                FindGameChoiceFragment.this.getBinding().f19499f.reset();
                objectRef.element.setPage(FindGameChoiceFragment.this.getPage());
                FindModlePrensenter prensenter2 = FindGameChoiceFragment.this.getPrensenter();
                FragmentActivity activity = FindGameChoiceFragment.this.getActivity();
                Intrinsics.checkNotNull(activity);
                prensenter2.loadFindChoiceData(activity, objectRef.element);
            }
        });
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
        getBinding().f19499f.loadMoreComplete();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            CommonExtKt.toast(activity, message);
        }
        List<CommonListMainData> showDatalist = getShowDatalist();
        if ((showDatalist == null || showDatalist.isEmpty()) || getShowDatalist().size() <= 0) {
            getBinding().f19498e.f23562d.setVisibility(8);
            getBinding().f19496c.f19364e.setVisibility(0);
            getBinding().f19499f.setVisibility(8);
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull n downloadTaskEvent) {
        Intrinsics.checkNotNullParameter(downloadTaskEvent, "downloadTaskEvent");
        getDownloadprensenter().onEventMainThread(downloadTaskEvent);
    }

    @Override // com.join.kotlin.presenter.view.FindHomeView
    public void onLoadDataSuccess(int i4, @NotNull FindChoiceResultData result) {
        Intrinsics.checkNotNullParameter(result, "result");
        if (i4 != this.page) {
            return;
        }
        if (i4 == 1) {
            getShowDatalist().clear();
            getBinding().f19499f.refreshComplete();
            List<FindChoiceBannerData> banner = result.getBanner();
            boolean z4 = false;
            if (!(banner == null || banner.isEmpty())) {
                FindChoiceBannerData choiceBannerData = result.getBanner().get(0);
                choiceBannerData.getGame_info().set_from(142);
                choiceBannerData.getGame_info().set_from_type(142);
                BasDownLoadActivityPresenter downloadprensenter = getDownloadprensenter();
                CollectionBeanSubBusiness game_info = choiceBannerData.getGame_info();
                Intrinsics.checkNotNullExpressionValue(game_info, "choiceBannerData.game_info");
                downloadprensenter.updateDowState(game_info);
                List<CommonListMainData> showDatalist = getShowDatalist();
                Intrinsics.checkNotNullExpressionValue(choiceBannerData, "choiceBannerData");
                showDatalist.add(new CommonListMainData(3, choiceBannerData, null, null, 12, null));
            }
            List<TagData> guess_you_like = result.getGuess_you_like();
            if (!((guess_you_like == null || guess_you_like.isEmpty()) ? true : true)) {
                getShowDatalist().add(new CommonListMainData(1, "猜你喜欢", null, null, 12, null));
                List<CommonListMainData> showDatalist2 = getShowDatalist();
                List<TagData> guess_you_like2 = result.getGuess_you_like();
                Intrinsics.checkNotNullExpressionValue(guess_you_like2, "result.guess_you_like");
                showDatalist2.add(new CommonListMainData(4, guess_you_like2, null, null, 12, null));
            }
        }
        for (FindChoiceColloctionListData item : result.getCollection_list()) {
            List<CommonListMainData> showDatalist3 = getShowDatalist();
            Intrinsics.checkNotNullExpressionValue(item, "item");
            showDatalist3.add(new CommonListMainData(1, item, null, null, 12, null));
            List<CollectionBeanSub> game_list = item.getGame_list();
            Intrinsics.checkNotNullExpressionValue(game_list, "item.game_list");
            for (CollectionBeanSub collectionBeanSub : game_list) {
                collectionBeanSub.set_from(140);
                collectionBeanSub.set_from_type(140);
            }
            if (item.getView_type() == 1) {
                List<CommonListMainData> showDatalist4 = getShowDatalist();
                List<CollectionBeanSub> game_list2 = item.getGame_list();
                Intrinsics.checkNotNullExpressionValue(game_list2, "item.game_list");
                showDatalist4.add(new CommonListMainData(6, game_list2, null, null, 12, null));
            } else {
                List<CommonListMainData> showDatalist5 = getShowDatalist();
                List<CollectionBeanSub> game_list3 = item.getGame_list();
                Intrinsics.checkNotNullExpressionValue(game_list3, "item.game_list");
                showDatalist5.add(new CommonListMainData(5, game_list3, null, null, 12, null));
            }
        }
        if (result.getCollection_list().size() > 0) {
            this.page++;
            getBinding().f19499f.loadMoreComplete();
        } else {
            getBinding().f19499f.setNoMore();
        }
        getAdapter().notifyDataSetChanged();
    }

    @Override // com.join.kotlin.presenter.view.FindHomeView
    public void onLoadDataSuccessV9(int i4, @NotNull FindClassifyResultData findClassifyResultData) {
        FindHomeView.DefaultImpls.onLoadDataSuccessV9(this, i4, findClassifyResultData);
    }

    public final void setAdapter(@NotNull FindHomeChoiceAdapter findHomeChoiceAdapter) {
        Intrinsics.checkNotNullParameter(findHomeChoiceAdapter, "<set-?>");
        this.adapter = findHomeChoiceAdapter;
    }

    public final void setBinding(@NotNull FindgameAllfragemntLayoutBinding findgameAllfragemntLayoutBinding) {
        Intrinsics.checkNotNullParameter(findgameAllfragemntLayoutBinding, "<set-?>");
        this.binding = findgameAllfragemntLayoutBinding;
    }

    public final void setDownloadprensenter(@NotNull BasDownLoadActivityPresenter basDownLoadActivityPresenter) {
        Intrinsics.checkNotNullParameter(basDownLoadActivityPresenter, "<set-?>");
        this.downloadprensenter = basDownLoadActivityPresenter;
    }

    public final void setPage(int i4) {
        this.page = i4;
    }

    public final void setPrensenter(@NotNull FindModlePrensenter findModlePrensenter) {
        Intrinsics.checkNotNullParameter(findModlePrensenter, "<set-?>");
        this.prensenter = findModlePrensenter;
    }

    public final void setRequestArgs(@NotNull LuckHistoryrequest luckHistoryrequest) {
        Intrinsics.checkNotNullParameter(luckHistoryrequest, "<set-?>");
        this.requestArgs = luckHistoryrequest;
    }

    public final void setShowDatalist(@NotNull List<CommonListMainData> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.showDatalist = list;
    }

    @Override // com.psk.kotlin.base.presenter.view.BaseView
    public void showLoding() {
        getBinding().f19498e.f23562d.setVisibility(0);
        getBinding().f19496c.f19364e.setVisibility(8);
        getBinding().f19499f.setVisibility(8);
    }
}
