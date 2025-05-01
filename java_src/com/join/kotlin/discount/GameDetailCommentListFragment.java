package com.join.kotlin.discount;

import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.join.android.app.mgsim.wufun.R;
import com.join.android.app.mgsim.wufun.databinding.FragmentGameDetailCommentListBinding;
import com.join.kotlin.base.ext.CustomViewExtKt;
import com.join.kotlin.base.fragment.BaseVmDbFragment;
import com.join.kotlin.base.net.stateCallback.ListDataUiState;
import com.join.kotlin.base.widget.recycleview.XQuickRecyclerView;
import com.join.kotlin.discount.adapter.CommentSpinnerAdapter;
import com.join.kotlin.discount.adapter.GameDetailCommentAdapter;
import com.join.kotlin.discount.model.bean.CommentDetailBean;
import com.join.kotlin.discount.proxy.GameDetailCommentListClickProxy;
import com.join.kotlin.discount.proxy.ItemGameDetailCommentListClickProxy;
import com.join.kotlin.discount.viewmodel.GameDetailCommentListViewModel;
import com.join.mgps.activity.gamedetail.GamedetailVideoMainActivity;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: GameDetailCommentListFragment.kt */
@SourceDebugExtension({"SMAP\nGameDetailCommentListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameDetailCommentListFragment.kt\ncom/join/kotlin/discount/GameDetailCommentListFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,187:1\n1855#2,2:188\n*S KotlinDebug\n*F\n+ 1 GameDetailCommentListFragment.kt\ncom/join/kotlin/discount/GameDetailCommentListFragment\n*L\n85#1:188,2\n*E\n"})
/* loaded from: classes3.dex */
public final class GameDetailCommentListFragment extends BaseVmDbFragment<GameDetailCommentListViewModel, FragmentGameDetailCommentListBinding> implements GameDetailCommentListClickProxy, ItemGameDetailCommentListClickProxy {
    private boolean isLoginFromGoComment;
    private com.kingja.loadsir.core.b<Object> loadSir;
    @NotNull
    private final Lazy mAdapter$delegate;
    @Nullable
    private PopupWindow popupWindow;
    private RecyclerView rvSpinner;
    @NotNull
    private final Lazy spinnerAdapter$delegate;

    public GameDetailCommentListFragment() {
        Lazy lazy;
        Lazy lazy2;
        lazy = LazyKt__LazyJVMKt.lazy(new Function0<GameDetailCommentAdapter>() { // from class: com.join.kotlin.discount.GameDetailCommentListFragment$mAdapter$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final GameDetailCommentAdapter invoke() {
                return new GameDetailCommentAdapter();
            }
        });
        this.mAdapter$delegate = lazy;
        lazy2 = LazyKt__LazyJVMKt.lazy(new Function0<CommentSpinnerAdapter>() { // from class: com.join.kotlin.discount.GameDetailCommentListFragment$spinnerAdapter$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final CommentSpinnerAdapter invoke() {
                return new CommentSpinnerAdapter();
            }
        });
        this.spinnerAdapter$delegate = lazy2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createObserver$lambda$6$lambda$5(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    private final void getGoodRate() {
        List<Fragment> fragments = getParentFragmentManager().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "parentFragmentManager.fragments");
        for (Fragment fragment : fragments) {
            if (fragment instanceof GameDetailFragment) {
                GameDetailFragment gameDetailFragment = (GameDetailFragment) fragment;
                ((GameDetailCommentListViewModel) getMViewModel()).getGoodRate().setValue(gameDetailFragment.getGoodRate());
                ((GameDetailCommentListViewModel) getMViewModel()).getShowGoodRate().setValue(Boolean.valueOf(gameDetailFragment.getGoodRate().length() > 0));
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final GameDetailCommentAdapter getMAdapter() {
        return (GameDetailCommentAdapter) this.mAdapter$delegate.getValue();
    }

    private final CommentSpinnerAdapter getSpinnerAdapter() {
        return (CommentSpinnerAdapter) this.spinnerAdapter$delegate.getValue();
    }

    private final void initSpinner() {
        ArrayList arrayListOf;
        RecyclerView recyclerView = new RecyclerView(requireContext());
        recyclerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        recyclerView.setBackgroundResource(R.drawable.bg_game_comment_spinner);
        recyclerView.setAdapter(getSpinnerAdapter());
        recyclerView.setPadding(0, (int) recyclerView.getResources().getDimension(R.dimen.wdp12), 0, 0);
        this.rvSpinner = recyclerView;
        CommentSpinnerAdapter spinnerAdapter = getSpinnerAdapter();
        spinnerAdapter.setOnItemClickListener(new BaseQuickAdapter.d() { // from class: com.join.kotlin.discount.c
            @Override // com.chad.library.adapter.base.BaseQuickAdapter.d
            public final void a(BaseQuickAdapter baseQuickAdapter, View view, int i4) {
                GameDetailCommentListFragment.initSpinner$lambda$4$lambda$3(GameDetailCommentListFragment.this, baseQuickAdapter, view, i4);
            }
        });
        arrayListOf = CollectionsKt__CollectionsKt.arrayListOf("最热", "最新");
        spinnerAdapter.submitList(arrayListOf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initSpinner$lambda$4$lambda$3(GameDetailCommentListFragment this$0, BaseQuickAdapter baseQuickAdapter, View view, int i4) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(baseQuickAdapter, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(view, "<anonymous parameter 1>");
        this$0.getSpinnerAdapter().setSelectedIndex(i4);
        int i5 = 2 - i4;
        if (((GameDetailCommentListViewModel) this$0.getMViewModel()).getSortType() != i5) {
            ((GameDetailCommentListViewModel) this$0.getMViewModel()).setSortType(i5);
            MutableLiveData<String> sortText = ((GameDetailCommentListViewModel) this$0.getMViewModel()).getSortText();
            String item = this$0.getSpinnerAdapter().getItem(i4);
            if (item == null) {
                item = "最热";
            }
            sortText.setValue(item);
            com.kingja.loadsir.core.b<Object> bVar = this$0.loadSir;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("loadSir");
                bVar = null;
            }
            CustomViewExtKt.showLoading(bVar);
            this$0.loadData(true);
        }
        this$0.getSpinnerAdapter().notifyDataSetChanged();
        PopupWindow popupWindow = this$0.popupWindow;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    @Override // com.join.kotlin.discount.proxy.GameDetailCommentListClickProxy
    public void clickSpinner() {
        RecyclerView recyclerView = this.rvSpinner;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rvSpinner");
            recyclerView = null;
        }
        PopupWindow popupWindow = new PopupWindow(recyclerView, (int) getResources().getDimension(R.dimen.wdp120), (int) getResources().getDimension(R.dimen.wdp140));
        this.popupWindow = popupWindow;
        popupWindow.setOutsideTouchable(true);
        PopupWindow popupWindow2 = this.popupWindow;
        if (popupWindow2 != null) {
            popupWindow2.setBackgroundDrawable(new BitmapDrawable());
        }
        PopupWindow popupWindow3 = this.popupWindow;
        if (popupWindow3 != null) {
            popupWindow3.setFocusable(true);
        }
        PopupWindow popupWindow4 = this.popupWindow;
        if (popupWindow4 != null) {
            popupWindow4.showAsDropDown(getMDatabind().f19841c, 0, -((int) getResources().getDimension(R.dimen.wdp10)));
        }
    }

    @Override // com.join.kotlin.base.fragment.BaseVmFragment
    public void createObserver() {
        MutableLiveData<ListDataUiState<CommentDetailBean>> listData = ((GameDetailCommentListViewModel) getMViewModel()).getListData();
        final Function1<ListDataUiState<CommentDetailBean>, Unit> function1 = new Function1<ListDataUiState<CommentDetailBean>, Unit>() { // from class: com.join.kotlin.discount.GameDetailCommentListFragment$createObserver$1$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ListDataUiState<CommentDetailBean> listDataUiState) {
                invoke2(listDataUiState);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(ListDataUiState<CommentDetailBean> it2) {
                GameDetailCommentAdapter mAdapter;
                com.kingja.loadsir.core.b bVar;
                Intrinsics.checkNotNullExpressionValue(it2, "it");
                mAdapter = GameDetailCommentListFragment.this.getMAdapter();
                bVar = GameDetailCommentListFragment.this.loadSir;
                if (bVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("loadSir");
                    bVar = null;
                }
                XQuickRecyclerView xQuickRecyclerView = GameDetailCommentListFragment.this.getMDatabind().f19843e;
                Intrinsics.checkNotNullExpressionValue(xQuickRecyclerView, "mDatabind.rvList");
                CustomViewExtKt.loadListData$default(it2, mAdapter, bVar, xQuickRecyclerView, null, 16, null);
            }
        };
        listData.observe(this, new Observer() { // from class: com.join.kotlin.discount.b
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                GameDetailCommentListFragment.createObserver$lambda$6$lambda$5(Function1.this, obj);
            }
        });
    }

    @Override // com.join.kotlin.base.fragment.BaseVmFragment
    public void dismissLoading() {
    }

    @Override // com.join.kotlin.base.fragment.BaseVmFragment
    public void initView(@Nullable Bundle bundle) {
        getMDatabind().h((GameDetailCommentListViewModel) getMViewModel());
        getMDatabind().g(this);
        GameDetailCommentListViewModel gameDetailCommentListViewModel = (GameDetailCommentListViewModel) getMViewModel();
        Bundle arguments = getArguments();
        com.kingja.loadsir.core.b<Object> bVar = null;
        gameDetailCommentListViewModel.setGameId(arguments != null ? arguments.getString("gameId") : null);
        XQuickRecyclerView xQuickRecyclerView = getMDatabind().f19843e;
        Intrinsics.checkNotNullExpressionValue(xQuickRecyclerView, "mDatabind.rvList");
        com.kingja.loadsir.core.b<Object> loadServiceInit = CustomViewExtKt.loadServiceInit(xQuickRecyclerView, new Function0<Unit>() { // from class: com.join.kotlin.discount.GameDetailCommentListFragment$initView$1
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
                com.kingja.loadsir.core.b bVar2;
                bVar2 = GameDetailCommentListFragment.this.loadSir;
                if (bVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("loadSir");
                    bVar2 = null;
                }
                CustomViewExtKt.showLoading(bVar2);
                GameDetailCommentListFragment.this.loadData(true);
            }
        });
        this.loadSir = loadServiceInit;
        if (loadServiceInit == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loadSir");
        } else {
            bVar = loadServiceInit;
        }
        CustomViewExtKt.showLoading(bVar);
        getMAdapter().setClick(this);
        XQuickRecyclerView xQuickRecyclerView2 = getMDatabind().f19843e;
        xQuickRecyclerView2.setLayoutManager(new LinearLayoutManager(requireContext()));
        xQuickRecyclerView2.setAdapter(getMAdapter());
        RecyclerView.ItemAnimator itemAnimator = getMDatabind().f19843e.getItemAnimator();
        Intrinsics.checkNotNull(itemAnimator, "null cannot be cast to non-null type androidx.recyclerview.widget.SimpleItemAnimator");
        ((SimpleItemAnimator) itemAnimator).setSupportsChangeAnimations(false);
        getMDatabind().f19843e.setLoadingListener(new XQuickRecyclerView.LoadingListener() { // from class: com.join.kotlin.discount.GameDetailCommentListFragment$initView$3
            @Override // com.join.kotlin.base.widget.recycleview.XQuickRecyclerView.LoadingListener
            public void onLoadMore() {
                GameDetailCommentListFragment.this.loadData(false);
            }

            @Override // com.join.kotlin.base.widget.recycleview.XQuickRecyclerView.LoadingListener
            public void onRefresh() {
                com.kingja.loadsir.core.b bVar2;
                bVar2 = GameDetailCommentListFragment.this.loadSir;
                if (bVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("loadSir");
                    bVar2 = null;
                }
                CustomViewExtKt.showLoading(bVar2);
                GameDetailCommentListFragment.this.loadData(true);
            }
        });
        initSpinner();
        getGoodRate();
        setTopPadding();
    }

    public final boolean isLoginFromGoComment() {
        return this.isLoginFromGoComment;
    }

    @Override // com.join.kotlin.base.fragment.BaseVmFragment
    public void lazyLoadData() {
        com.kingja.loadsir.core.b<Object> bVar = this.loadSir;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loadSir");
            bVar = null;
        }
        CustomViewExtKt.showLoading(bVar);
        loadData(true);
    }

    @Override // com.join.kotlin.discount.proxy.ItemGameDetailCommentListClickProxy
    public void like(@Nullable CommentDetailBean commentDetailBean) {
    }

    public final void loadData(boolean z4) {
        ((GameDetailCommentListViewModel) getMViewModel()).getCommentList(z4);
    }

    @Override // com.join.kotlin.base.fragment.BaseVmFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
    }

    public final void setLoginFromGoComment(boolean z4) {
        this.isLoginFromGoComment = z4;
    }

    public final void setTopPadding() {
        ConstraintLayout constraintLayout = getMDatabind().f19840b;
        FragmentActivity activity = getActivity();
        GamedetailVideoMainActivity gamedetailVideoMainActivity = activity instanceof GamedetailVideoMainActivity ? (GamedetailVideoMainActivity) activity : null;
        constraintLayout.setPadding(0, gamedetailVideoMainActivity != null ? gamedetailVideoMainActivity.getTabBottom() : 0, 0, 0);
    }

    @Override // com.join.kotlin.base.fragment.BaseVmFragment
    public void showLoading(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
    }

    @Override // com.join.kotlin.discount.proxy.GameDetailCommentListClickProxy
    public void toCommentEdit() {
    }
}
