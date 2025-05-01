package com.join.kotlin.discount;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.utils.JsonMapper;
import com.join.android.app.component.photoviewer.ImagePagerActivity;
import com.join.android.app.mgsim.wufun.R;
import com.join.android.app.mgsim.wufun.databinding.FragmentDiscountGameDetailV2Binding;
import com.join.android.app.mgsim.wufun.databinding.ItemDetailBannerIndicatorBinding;
import com.join.kotlin.base.ext.BaseViewModelExtKt;
import com.join.kotlin.base.ext.CustomViewExtKt;
import com.join.kotlin.base.fragment.BaseVmDbFragment;
import com.join.kotlin.base.net.AppException;
import com.join.kotlin.base.net.stateCallback.ListDataUiState;
import com.join.kotlin.base.state.ResultState;
import com.join.kotlin.base.widget.recycleview.XQuickRecyclerView;
import com.join.kotlin.discount.adapter.GameDetailBannerAdapter;
import com.join.kotlin.discount.adapter.GameDetailCommentAdapter;
import com.join.kotlin.discount.adapter.GameDetailInfoAdapter;
import com.join.kotlin.discount.adapter.GameDetailReleaseWelfareAdapter;
import com.join.kotlin.discount.adapter.GameDetailSimilarGameAdapter;
import com.join.kotlin.discount.model.bean.CommentDetailBean;
import com.join.kotlin.discount.model.bean.CommentStatisticDataBean;
import com.join.kotlin.discount.model.bean.CommonComponentBean;
import com.join.kotlin.discount.model.bean.GameDetailBannerEntityBean;
import com.join.kotlin.discount.model.bean.GameDetailBasicInfoBean;
import com.join.kotlin.discount.model.bean.GameDetailBean;
import com.join.kotlin.discount.model.bean.GameDetailBookingInfoBean;
import com.join.kotlin.discount.model.bean.GameDetailDataBean;
import com.join.kotlin.discount.model.bean.GameDetailDialogInfoBean;
import com.join.kotlin.discount.model.bean.GameDetailInfoItemBean;
import com.join.kotlin.discount.model.bean.GameDetailNoticeBean;
import com.join.kotlin.discount.proxy.GameDetailFragmentClickProxy;
import com.join.kotlin.discount.proxy.ItemGameDetailCommentListClickProxy;
import com.join.kotlin.discount.viewmodel.GameDetailFragmentViewModel;
import com.join.mgps.Util.IntentDateBean;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.Util.d0;
import com.join.mgps.Util.l2;
import com.join.mgps.activity.ShareWebActivity_;
import com.join.mgps.activity.gamedetail.GamedetailVideoMainActivity;
import com.join.mgps.base.decoration.UniversalItemDecoration;
import com.join.mgps.dto.CollectionBeanSub;
import com.join.mgps.dto.CommonGameInfoBean;
import com.join.mgps.dto.ExtBean;
import com.papa.sim.statistic.Data;
import com.papa.sim.statistic.Event;
import com.papa.sim.statistic.Ext;
import com.papa91.arc.ext.ToastManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: GameDetailFragment.kt */
@SourceDebugExtension({"SMAP\nGameDetailFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameDetailFragment.kt\ncom/join/kotlin/discount/GameDetailFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,1080:1\n1#2:1081\n766#3:1082\n857#3,2:1083\n1549#3:1085\n1620#3,3:1086\n766#3:1091\n857#3,2:1092\n1855#3:1094\n800#3,11:1095\n1855#3,2:1106\n1856#3:1108\n37#4,2:1089\n37#4,2:1109\n*S KotlinDebug\n*F\n+ 1 GameDetailFragment.kt\ncom/join/kotlin/discount/GameDetailFragment\n*L\n868#1:1082\n868#1:1083,2\n870#1:1085\n870#1:1086,3\n977#1:1091\n977#1:1092,2\n979#1:1094\n981#1:1095,11\n981#1:1106,2\n979#1:1108\n876#1:1089,2\n989#1:1109,2\n*E\n"})
/* loaded from: classes.dex */
public final class GameDetailFragment extends BaseVmDbFragment<GameDetailFragmentViewModel, FragmentDiscountGameDetailV2Binding> implements GameDetailFragmentClickProxy, ItemGameDetailCommentListClickProxy {
    @NotNull
    private final Lazy bannerAdapter$delegate;
    @NotNull
    private final Lazy commentAdapter$delegate;
    private int currentIndicatorPosition;
    @Nullable
    private ExtBean ext;
    private int firstCompletelyVisibleWhenIndicatorShowLast;
    @Nullable
    private final Handler handler;
    private boolean hasDestroyed;
    @NotNull
    private final Lazy infoAdapter$delegate;
    private boolean isPause;
    private boolean isReleaseWelfareExpand;
    private int lastRvRelaseWelfareHeight;
    private com.kingja.loadsir.core.b<Object> loadSir;
    @NotNull
    private final Lazy releaseWelfareAdapter$delegate;
    private boolean showNewServer;
    @NotNull
    private final Lazy similarAdapter$delegate;
    @NotNull
    private String topBgColor;
    @Nullable
    private com.join.android.app.component.video.g videoHelper;

    public GameDetailFragment() {
        Lazy lazy;
        Lazy lazy2;
        Lazy lazy3;
        Lazy lazy4;
        Lazy lazy5;
        lazy = LazyKt__LazyJVMKt.lazy(new Function0<GameDetailBannerAdapter>() { // from class: com.join.kotlin.discount.GameDetailFragment$bannerAdapter$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final GameDetailBannerAdapter invoke() {
                return new GameDetailBannerAdapter();
            }
        });
        this.bannerAdapter$delegate = lazy;
        lazy2 = LazyKt__LazyJVMKt.lazy(new Function0<GameDetailInfoAdapter>() { // from class: com.join.kotlin.discount.GameDetailFragment$infoAdapter$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final GameDetailInfoAdapter invoke() {
                return new GameDetailInfoAdapter();
            }
        });
        this.infoAdapter$delegate = lazy2;
        lazy3 = LazyKt__LazyJVMKt.lazy(new Function0<GameDetailReleaseWelfareAdapter>() { // from class: com.join.kotlin.discount.GameDetailFragment$releaseWelfareAdapter$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final GameDetailReleaseWelfareAdapter invoke() {
                return new GameDetailReleaseWelfareAdapter();
            }
        });
        this.releaseWelfareAdapter$delegate = lazy3;
        lazy4 = LazyKt__LazyJVMKt.lazy(new Function0<GameDetailCommentAdapter>() { // from class: com.join.kotlin.discount.GameDetailFragment$commentAdapter$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final GameDetailCommentAdapter invoke() {
                return new GameDetailCommentAdapter();
            }
        });
        this.commentAdapter$delegate = lazy4;
        lazy5 = LazyKt__LazyJVMKt.lazy(new Function0<GameDetailSimilarGameAdapter>() { // from class: com.join.kotlin.discount.GameDetailFragment$similarAdapter$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final GameDetailSimilarGameAdapter invoke() {
                return new GameDetailSimilarGameAdapter();
            }
        });
        this.similarAdapter$delegate = lazy5;
        this.firstCompletelyVisibleWhenIndicatorShowLast = -1;
        this.topBgColor = "#503835";
        this.handler = new Handler();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createObserver$lambda$14$lambda$10(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createObserver$lambda$14$lambda$11(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createObserver$lambda$14$lambda$12(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createObserver$lambda$14$lambda$13(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final GameDetailBannerAdapter getBannerAdapter() {
        return (GameDetailBannerAdapter) this.bannerAdapter$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final GameDetailCommentAdapter getCommentAdapter() {
        return (GameDetailCommentAdapter) this.commentAdapter$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final GameDetailInfoAdapter getInfoAdapter() {
        return (GameDetailInfoAdapter) this.infoAdapter$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final GameDetailReleaseWelfareAdapter getReleaseWelfareAdapter() {
        return (GameDetailReleaseWelfareAdapter) this.releaseWelfareAdapter$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final GameDetailSimilarGameAdapter getSimilarAdapter() {
        return (GameDetailSimilarGameAdapter) this.similarAdapter$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$1(GameDetailFragment this$0, BaseQuickAdapter adapter, View view, int i4) {
        GameDetailBasicInfoBean basic_info;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(view, "<anonymous parameter 1>");
        String title = ((GameDetailInfoItemBean) adapter.getItems().get(i4)).getTitle();
        if (title != null) {
            int hashCode = title.hashCode();
            if (hashCode == 825162971) {
                if (title.equals("权限信息")) {
                    GameDetailBean value = ((GameDetailFragmentViewModel) this$0.getMViewModel()).getGameInfo().getValue();
                    List<GameDetailDialogInfoBean> permissions = (value == null || (basic_info = value.getBasic_info()) == null) ? null : basic_info.getPermissions();
                    Intent intent = new Intent(this$0.requireContext(), GameDetailInfoBottomDialogActivity.class);
                    intent.putExtra("title", "权限信息");
                    intent.putExtra("content", JsonMapper.getInstance().toJson(permissions));
                    intent.putExtra("btnText", "我知道了");
                    this$0.startActivity(intent);
                }
            } else if (hashCode != 1119738454) {
                if (hashCode == 1179052776 && title.equals("隐私政策")) {
                    Intent intent2 = new Intent(this$0.requireContext(), CommonBottomDialogActivity.class);
                    intent2.putExtra("title", "隐私政策");
                    intent2.putExtra("content", "请进入游戏中自行查看");
                    intent2.putExtra("btnText", "我知道了");
                    this$0.startActivity(intent2);
                }
            } else if (title.equals("适合年龄")) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new GameDetailDialogInfoBean("8岁以上", "适合8周岁以上的未成年人使用的游戏，玩法简单、单局耗时短、如简单的休闲益智类、解密类、模拟养成/经营类、音乐舞蹈类和塔防类游戏等。"));
                arrayList.add(new GameDetailDialogInfoBean("12岁以上", "适合12周岁以上的未成年人使用的游戏。玩法相对复杂，需投入一定的时间精力。如跑酷竞速类、角色扮演类、沙盒类、音乐舞蹈类、体育类、策略类和动作冒险类游戏。"));
                arrayList.add(new GameDetailDialogInfoBean("16岁以上", "适合16周岁以上的未成年人使用的游戏。玩法复杂，投入精力较多，游戏流程耗时较长。如内容操作复杂的角色扮演类、动作冒险类、射击竞技类和体育竞技类等游戏。"));
                arrayList.add(new GameDetailDialogInfoBean("18岁以上", "适合18周岁以上的成年人使用的游戏。为维护未成年人健康上网环境，18+类型游戏暂不支持实名认证18岁以下的用户登录体验。"));
                Intent intent3 = new Intent(this$0.requireContext(), GameDetailInfoBottomDialogActivity.class);
                intent3.putExtra("title", "年龄分级");
                intent3.putExtra("content", JsonMapper.getInstance().toJson(arrayList));
                intent3.putExtra("btnText", "我知道了");
                this$0.startActivity(intent3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$4(GameDetailFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.lastRvRelaseWelfareHeight == this$0.getMDatabind().C.getHeight() || this$0.isReleaseWelfareExpand) {
            return;
        }
        this$0.lastRvRelaseWelfareHeight = this$0.getMDatabind().C.getHeight();
        if (this$0.getMDatabind().C.getHeight() <= this$0.getResources().getDimension(R.dimen.wdp440)) {
            this$0.getMDatabind().f19715w.setVisibility(8);
            FrameLayout frameLayout = this$0.getMDatabind().f19699g;
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            layoutParams.height = -2;
            frameLayout.setLayoutParams(layoutParams);
            return;
        }
        this$0.getMDatabind().f19715w.setVisibility(0);
        FrameLayout frameLayout2 = this$0.getMDatabind().f19699g;
        ViewGroup.LayoutParams layoutParams2 = frameLayout2.getLayoutParams();
        layoutParams2.height = (int) frameLayout2.getResources().getDimension(R.dimen.wdp478);
        frameLayout2.setLayoutParams(layoutParams2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$5(GameDetailFragment this$0, BaseQuickAdapter baseQuickAdapter, View view, int i4) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(baseQuickAdapter, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(view, "<anonymous parameter 1>");
        IntentUtil intentUtil = IntentUtil.getInstance();
        Context requireContext = this$0.requireContext();
        CollectionBeanSub collectionBeanSub = this$0.getSimilarAdapter().getItems().get(i4);
        intentUtil.goGameDetialActivity(requireContext, collectionBeanSub != null ? collectionBeanSub.getGame_id() : null, 217);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void playVideo$lambda$8(GameDetailFragment this$0) {
        com.join.android.app.component.video.g gVar;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.hasDestroyed || !(com.join.android.app.common.utils.n.w() instanceof GamedetailVideoMainActivity) || (gVar = this$0.videoHelper) == null) {
            return;
        }
        gVar.g(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setTopMask() {
        try {
            String notLightColor = getNotLightColor(this.topBgColor);
            this.topBgColor = notLightColor == null ? "#503835" : notLightColor;
            ViewGroup.LayoutParams layoutParams = getMDatabind().L.getLayoutParams();
            FragmentActivity activity = getActivity();
            GamedetailVideoMainActivity gamedetailVideoMainActivity = activity instanceof GamedetailVideoMainActivity ? (GamedetailVideoMainActivity) activity : null;
            layoutParams.height = gamedetailVideoMainActivity != null ? gamedetailVideoMainActivity.getTabBottom() : 0;
            getMDatabind().L.setLayoutParams(layoutParams);
            getMDatabind().L.setBackgroundColor(Color.parseColor(notLightColor));
            getMDatabind().f19697e.setBackgroundColor(Color.parseColor(notLightColor));
            getMDatabind().f19694b.setBackgroundColor(Color.parseColor(notLightColor));
            String replace$default = notLightColor != null ? StringsKt__StringsJVMKt.replace$default(notLightColor, "#", "", false, 4, (Object) null) : null;
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
            gradientDrawable.setColors(new int[]{Color.parseColor("#FF" + replace$default), Color.parseColor("#00" + replace$default)});
            gradientDrawable.setGradientType(0);
            getMDatabind().f19714v.setBackground(gradientDrawable);
            getMDatabind().f19713u.setBackground(gradientDrawable);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private final void showDownDialog() {
    }

    private final void volcanoCheck(String str) {
    }

    @Override // com.join.kotlin.discount.proxy.GameDetailFragmentClickProxy
    public void admireBigR() {
    }

    @Override // com.join.kotlin.discount.proxy.GameDetailFragmentClickProxy
    public void bookGame() {
    }

    @Override // com.join.kotlin.discount.proxy.GameDetailFragmentClickProxy
    public void clickGameInfoTitle() {
        if (Intrinsics.areEqual(((GameDetailFragmentViewModel) getMViewModel()).getShowGameInfo().getValue(), Boolean.FALSE)) {
            ((GameDetailFragmentViewModel) getMViewModel()).getShowGameInfo().setValue(Boolean.valueOf(!Intrinsics.areEqual(((GameDetailFragmentViewModel) getMViewModel()).getShowGameInfo().getValue(), Boolean.TRUE)));
        }
    }

    @Override // com.join.kotlin.discount.proxy.GameDetailFragmentClickProxy
    public void clickGoodRate() {
    }

    @Override // com.join.kotlin.base.fragment.BaseVmFragment
    public void createObserver() {
        GameDetailFragmentViewModel gameDetailFragmentViewModel = (GameDetailFragmentViewModel) getMViewModel();
        MutableLiveData<ResultState<GameDetailDataBean>> gameResult = gameDetailFragmentViewModel.getGameResult();
        final Function1<ResultState<? extends GameDetailDataBean>, Unit> function1 = new Function1<ResultState<? extends GameDetailDataBean>, Unit>() { // from class: com.join.kotlin.discount.GameDetailFragment$createObserver$1$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ResultState<? extends GameDetailDataBean> resultState) {
                invoke2((ResultState<GameDetailDataBean>) resultState);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(@Nullable ResultState<GameDetailDataBean> resultState) {
                com.kingja.loadsir.core.b bVar;
                if (resultState == null) {
                    bVar = GameDetailFragment.this.loadSir;
                    if (bVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("loadSir");
                        bVar = null;
                    }
                    CustomViewExtKt.showError$default(bVar, null, 1, null);
                    GameDetailFragment.this.getMDatabind().f19706n.setVisibility(8);
                    l2.a(GameDetailFragment.this.requireContext()).b("游戏已下架");
                    FragmentActivity activity = GameDetailFragment.this.getActivity();
                    if (activity != null) {
                        activity.finish();
                        return;
                    }
                    return;
                }
                GameDetailFragment.this.getMDatabind().f19700h.setVisibility(0);
                final GameDetailFragment gameDetailFragment = GameDetailFragment.this;
                Function1<GameDetailDataBean, Unit> function12 = new Function1<GameDetailDataBean, Unit>() { // from class: com.join.kotlin.discount.GameDetailFragment$createObserver$1$1.1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(GameDetailDataBean gameDetailDataBean) {
                        invoke2(gameDetailDataBean);
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:76:0x0164, code lost:
                        if ((r1 != null && r1.getStatus() == 6) != false) goto L112;
                     */
                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void invoke2(@org.jetbrains.annotations.Nullable com.join.kotlin.discount.model.bean.GameDetailDataBean r11) {
                        /*
                            Method dump skipped, instructions count: 783
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.join.kotlin.discount.GameDetailFragment$createObserver$1$1.AnonymousClass1.invoke2(com.join.kotlin.discount.model.bean.GameDetailDataBean):void");
                    }
                };
                final GameDetailFragment gameDetailFragment2 = GameDetailFragment.this;
                BaseViewModelExtKt.parseState$default(gameDetailFragment, resultState, function12, new Function1<AppException, Unit>() { // from class: com.join.kotlin.discount.GameDetailFragment$createObserver$1$1.2
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
                        com.kingja.loadsir.core.b bVar2;
                        Intrinsics.checkNotNullParameter(it2, "it");
                        ToastManager.show(it2.getErrorMsg());
                        bVar2 = GameDetailFragment.this.loadSir;
                        if (bVar2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("loadSir");
                            bVar2 = null;
                        }
                        CustomViewExtKt.showError$default(bVar2, null, 1, null);
                        GameDetailFragment.this.getMDatabind().f19706n.setVisibility(8);
                        GameDetailFragment.this.setTopMask();
                    }
                }, (Function0) null, 8, (Object) null);
            }
        };
        gameResult.observe(this, new Observer() { // from class: com.join.kotlin.discount.h
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                GameDetailFragment.createObserver$lambda$14$lambda$10(Function1.this, obj);
            }
        });
        MutableLiveData<ListDataUiState<CommentDetailBean>> commentListData = gameDetailFragmentViewModel.getCommentListData();
        final Function1<ListDataUiState<CommentDetailBean>, Unit> function12 = new Function1<ListDataUiState<CommentDetailBean>, Unit>() { // from class: com.join.kotlin.discount.GameDetailFragment$createObserver$1$2
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
            public final void invoke2(ListDataUiState<CommentDetailBean> listDataUiState) {
                GameDetailCommentAdapter commentAdapter;
                if (listDataUiState != null) {
                    if (!listDataUiState.getListData().isEmpty()) {
                        ((GameDetailFragmentViewModel) GameDetailFragment.this.getMViewModel()).getShowComment().setValue(Boolean.TRUE);
                        commentAdapter = GameDetailFragment.this.getCommentAdapter();
                        commentAdapter.submitList(listDataUiState.getListData());
                        return;
                    }
                    ((GameDetailFragmentViewModel) GameDetailFragment.this.getMViewModel()).getShowComment().setValue(Boolean.FALSE);
                    return;
                }
                ((GameDetailFragmentViewModel) GameDetailFragment.this.getMViewModel()).getShowComment().setValue(Boolean.FALSE);
            }
        };
        commentListData.observe(this, new Observer() { // from class: com.join.kotlin.discount.g
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                GameDetailFragment.createObserver$lambda$14$lambda$11(Function1.this, obj);
            }
        });
        MutableLiveData<CommentStatisticDataBean> commentStatistic = gameDetailFragmentViewModel.getCommentStatistic();
        final Function1<CommentStatisticDataBean, Unit> function13 = new Function1<CommentStatisticDataBean, Unit>() { // from class: com.join.kotlin.discount.GameDetailFragment$createObserver$1$3
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(CommentStatisticDataBean commentStatisticDataBean) {
                invoke2(commentStatisticDataBean);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(@Nullable CommentStatisticDataBean commentStatisticDataBean) {
                MutableLiveData<Boolean> showAvgDuration = ((GameDetailFragmentViewModel) GameDetailFragment.this.getMViewModel()).getShowAvgDuration();
                String avg_duration = commentStatisticDataBean != null ? commentStatisticDataBean.getAvg_duration() : null;
                showAvgDuration.setValue(Boolean.valueOf(!(avg_duration == null || avg_duration.length() == 0)));
                ((GameDetailFragmentViewModel) GameDetailFragment.this.getMViewModel()).getGoodRate().setValue((commentStatisticDataBean == null || (r4 = commentStatisticDataBean.getGood_rate()) == null) ? "100%" : "100%");
            }
        };
        commentStatistic.observe(this, new Observer() { // from class: com.join.kotlin.discount.i
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                GameDetailFragment.createObserver$lambda$14$lambda$12(Function1.this, obj);
            }
        });
        MutableLiveData<ListDataUiState<CollectionBeanSub>> similarListData = gameDetailFragmentViewModel.getSimilarListData();
        final Function1<ListDataUiState<CollectionBeanSub>, Unit> function14 = new Function1<ListDataUiState<CollectionBeanSub>, Unit>() { // from class: com.join.kotlin.discount.GameDetailFragment$createObserver$1$4
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ListDataUiState<CollectionBeanSub> listDataUiState) {
                invoke2(listDataUiState);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(ListDataUiState<CollectionBeanSub> listDataUiState) {
                GameDetailSimilarGameAdapter similarAdapter;
                GameDetailSimilarGameAdapter similarAdapter2;
                if (listDataUiState.isRefresh()) {
                    similarAdapter2 = GameDetailFragment.this.getSimilarAdapter();
                    similarAdapter2.submitList(listDataUiState.getListData());
                } else {
                    similarAdapter = GameDetailFragment.this.getSimilarAdapter();
                    similarAdapter.addAll(listDataUiState.getListData());
                }
                GameDetailFragment.this.getMDatabind().D.loadMoreComplete();
                ArrayList<CollectionBeanSub> listData = listDataUiState.getListData();
                if (listData == null || listData.isEmpty()) {
                    GameDetailFragment.this.getMDatabind().D.setNoMore();
                }
            }
        };
        similarListData.observe(this, new Observer() { // from class: com.join.kotlin.discount.f
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                GameDetailFragment.createObserver$lambda$14$lambda$13(Function1.this, obj);
            }
        });
    }

    @Override // com.join.kotlin.base.fragment.BaseVmFragment
    public void dismissLoading() {
    }

    @Override // com.join.kotlin.discount.proxy.GameDetailFragmentClickProxy
    public void downBtnClick() {
        String gameId;
        GameDetailBookingInfoBean booking_info;
        Integer game_status;
        GameDetailBasicInfoBean basic_info;
        Integer on_off;
        GameDetailBean value = ((GameDetailFragmentViewModel) getMViewModel()).getGameInfo().getValue();
        boolean z4 = true;
        if ((value == null || (basic_info = value.getBasic_info()) == null || (on_off = basic_info.getOn_off()) == null || on_off.intValue() != 0) ? false : true) {
            return;
        }
        GameDetailBean value2 = ((GameDetailFragmentViewModel) getMViewModel()).getGameInfo().getValue();
        if (((value2 == null || (booking_info = value2.getBooking_info()) == null || (game_status = booking_info.getGame_status()) == null || game_status.intValue() != 2) ? false : false) || (gameId = ((GameDetailFragmentViewModel) getMViewModel()).getGameId()) == null) {
            return;
        }
        DownloadTask value3 = ((GameDetailFragmentViewModel) getMViewModel()).getDownloadTask().getValue();
        if (value3 == null) {
            UtilsMy.V0(requireContext(), ((GameDetailFragmentViewModel) getMViewModel()).getGameInfo().getValue());
            ((GameDetailFragmentViewModel) getMViewModel()).getBtnText().setValue("0%");
            ((GameDetailFragmentViewModel) getMViewModel()).getProgress().setValue(0);
            showDownDialog();
            volcanoCheck(gameId);
            return;
        }
        int status = value3.getStatus();
        if (status != 0) {
            if (status != 42) {
                if (status != 2) {
                    if (status == 3) {
                        com.php25.PDownload.d.c(value3, requireContext());
                        return;
                    } else if (status == 5) {
                        UtilsMy.T3(requireContext(), value3);
                        return;
                    } else if (status != 6 && status != 7) {
                        switch (status) {
                            case 9:
                                break;
                            case 10:
                                break;
                            case 11:
                                UtilsMy.a4(value3, requireContext());
                                return;
                            default:
                                return;
                        }
                    }
                }
                com.php25.PDownload.d.i(value3);
                return;
            }
            UtilsMy.V0(requireContext(), ((GameDetailFragmentViewModel) getMViewModel()).getGameInfo().getValue());
            return;
        }
        UtilsMy.V0(requireContext(), ((GameDetailFragmentViewModel) getMViewModel()).getGameInfo().getValue());
        showDownDialog();
        volcanoCheck(gameId);
    }

    @Override // com.join.kotlin.discount.proxy.GameDetailFragmentClickProxy
    public void expandReleaseWelfare() {
        this.isReleaseWelfareExpand = true;
        getMDatabind().f19715w.setVisibility(8);
        FrameLayout frameLayout = getMDatabind().f19699g;
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        layoutParams.height = -2;
        frameLayout.setLayoutParams(layoutParams);
    }

    public final int getCanRecycleAccountCount() {
        Integer recycle_number;
        GameDetailBean value = ((GameDetailFragmentViewModel) getMViewModel()).getGameInfo().getValue();
        if (value == null || (recycle_number = value.getRecycle_number()) == null) {
            return 0;
        }
        return recycle_number.intValue();
    }

    public final int getCanSellAcountCount() {
        Integer sell_number;
        GameDetailBean value = ((GameDetailFragmentViewModel) getMViewModel()).getGameInfo().getValue();
        if (value == null || (sell_number = value.getSell_number()) == null) {
            return 0;
        }
        return sell_number.intValue();
    }

    @Nullable
    public final ExtBean getExt() {
        return this.ext;
    }

    @NotNull
    public final String getGoodRate() {
        String value = ((GameDetailFragmentViewModel) getMViewModel()).getGoodRate().getValue();
        return value == null ? "100%" : value;
    }

    @Nullable
    public final String getNotLightColor(@Nullable String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return "#503835";
            }
            int parseColor = Color.parseColor(str);
            int red = Color.red(parseColor);
            int green = Color.green(parseColor);
            int blue = Color.blue(parseColor);
            double d5 = red;
            Double.isNaN(d5);
            double d6 = green;
            Double.isNaN(d6);
            double d7 = blue;
            Double.isNaN(d7);
            if ((d5 * 0.299d) + (d6 * 0.587d) + (d7 * 0.114d) >= 192.0d) {
                str = "#503835";
            }
            return str;
        } catch (Exception e5) {
            e5.printStackTrace();
            return "#503835";
        }
    }

    @Override // com.join.kotlin.discount.proxy.GameDetailFragmentClickProxy
    public void goComment() {
        FragmentActivity activity = getActivity();
        GamedetailVideoMainActivity gamedetailVideoMainActivity = activity instanceof GamedetailVideoMainActivity ? (GamedetailVideoMainActivity) activity : null;
        if (gamedetailVideoMainActivity != null) {
            gamedetailVideoMainActivity.selectTab(1);
        }
    }

    @Override // com.join.kotlin.discount.proxy.GameDetailFragmentClickProxy
    public void goCoupon() {
        GameDetailBasicInfoBean basic_info;
        CommonComponentBean coupon_info;
        Integer show;
        GameDetailBean value = ((GameDetailFragmentViewModel) getMViewModel()).getGameInfo().getValue();
        boolean z4 = false;
        if (value != null && (coupon_info = value.getCoupon_info()) != null && (show = coupon_info.getShow()) != null && show.intValue() == 0) {
            z4 = true;
        }
        if (z4) {
            l2.a(requireContext()).b("暂无代金券信息");
            return;
        }
        Intent intent = new Intent(getActivity(), GameDetailCouponActivity.class);
        intent.putExtra("gameId", ((GameDetailFragmentViewModel) getMViewModel()).getGameId());
        GameDetailBean value2 = ((GameDetailFragmentViewModel) getMViewModel()).getGameInfo().getValue();
        intent.putExtra("gamePkg", (value2 == null || (basic_info = value2.getBasic_info()) == null) ? null : basic_info.getPackage_name());
        startActivity(intent);
    }

    @Override // com.join.kotlin.discount.proxy.GameDetailFragmentClickProxy
    public void goEvent() {
        GameDetailNoticeBean game_notice_info;
        GameDetailBean value = ((GameDetailFragmentViewModel) getMViewModel()).getGameInfo().getValue();
        boolean z4 = true;
        if ((value == null || !value.showEvent()) ? false : false) {
            IntentDateBean intentDateBean = new IntentDateBean();
            intentDateBean.setLink_type(4);
            GameDetailBean value2 = ((GameDetailFragmentViewModel) getMViewModel()).getGameInfo().getValue();
            intentDateBean.setLink_type_val((value2 == null || (game_notice_info = value2.getGame_notice_info()) == null) ? null : game_notice_info.getJumpListUrl());
            ShareWebActivity_.t2(getContext()).b(intentDateBean).c(false).start();
            return;
        }
        l2.a(requireContext()).b("暂无返利信息");
    }

    @Override // com.join.kotlin.discount.proxy.GameDetailFragmentClickProxy
    public void goGift() {
        CommonComponentBean gift_info;
        Integer show;
        GameDetailBean value = ((GameDetailFragmentViewModel) getMViewModel()).getGameInfo().getValue();
        boolean z4 = false;
        if (value != null && (gift_info = value.getGift_info()) != null && (show = gift_info.getShow()) != null && show.intValue() == 0) {
            z4 = true;
        }
        if (z4) {
            l2.a(requireContext()).b("暂无礼包信息");
            return;
        }
        Intent intent = new Intent(getActivity(), GameDetailGiftActivity.class);
        intent.putExtra("gameId", ((GameDetailFragmentViewModel) getMViewModel()).getGameId());
        startActivity(intent);
    }

    @Override // com.join.kotlin.discount.proxy.GameDetailFragmentClickProxy
    public void goServer() {
        Intent intent = new Intent(getActivity(), GameDetailServerBookDialogActivity.class);
        intent.putExtra("gameId", ((GameDetailFragmentViewModel) getMViewModel()).getGameId());
        startActivity(intent);
    }

    @Override // com.join.kotlin.discount.proxy.GameDetailFragmentClickProxy
    public void goTrade() {
    }

    @Override // com.join.kotlin.discount.proxy.GameDetailFragmentClickProxy
    public void horizontalPicClick(@Nullable String str) {
        int collectionSizeOrDefault;
        int indexOf;
        try {
            ArrayList arrayList = new ArrayList();
            List<GameDetailBannerEntityBean> items = getBannerAdapter().getItems();
            ArrayList<GameDetailBannerEntityBean> arrayList2 = new ArrayList();
            Iterator<T> it2 = items.iterator();
            while (true) {
                boolean z4 = false;
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                GameDetailBannerEntityBean gameDetailBannerEntityBean = (GameDetailBannerEntityBean) next;
                if ((gameDetailBannerEntityBean.getViewType() == 2 || gameDetailBannerEntityBean.getViewType() == 4) ? true : true) {
                    arrayList2.add(next);
                }
            }
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10);
            ArrayList arrayList3 = new ArrayList(collectionSizeOrDefault);
            for (GameDetailBannerEntityBean gameDetailBannerEntityBean2 : arrayList2) {
                Object data = gameDetailBannerEntityBean2.getData();
                Intrinsics.checkNotNull(data, "null cannot be cast to non-null type kotlin.String");
                arrayList3.add((String) data);
            }
            arrayList.addAll(arrayList3);
            Intent intent = new Intent(requireContext(), ImagePagerActivity.class);
            intent.putExtra("image_urls", (String[]) arrayList.toArray(new String[0]));
            indexOf = CollectionsKt___CollectionsKt.indexOf((List<? extends Object>) ((List) arrayList), (Object) str);
            intent.putExtra("image_index", indexOf);
            startActivity(intent);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.join.kotlin.base.fragment.BaseVmFragment
    public void initView(@Nullable Bundle bundle) {
        d0 a5 = d0.a();
        if (!a5.b(this)) {
            a5.d(this);
        }
        getMDatabind().h((GameDetailFragmentViewModel) getMViewModel());
        getMDatabind().g(this);
        NestedScrollView nestedScrollView = getMDatabind().f19717y;
        Intrinsics.checkNotNullExpressionValue(nestedScrollView, "mDatabind.nes");
        this.loadSir = CustomViewExtKt.loadServiceInit(nestedScrollView, new Function0<Unit>() { // from class: com.join.kotlin.discount.GameDetailFragment$initView$2
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
                com.kingja.loadsir.core.b bVar;
                bVar = GameDetailFragment.this.loadSir;
                if (bVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("loadSir");
                    bVar = null;
                }
                CustomViewExtKt.showLoading(bVar);
                GameDetailFragment.this.loadData(true);
            }
        });
        GameDetailFragmentViewModel gameDetailFragmentViewModel = (GameDetailFragmentViewModel) getMViewModel();
        Bundle arguments = getArguments();
        com.kingja.loadsir.core.b<Object> bVar = null;
        gameDetailFragmentViewModel.setGameId(arguments != null ? arguments.getString("gameId") : null);
        GameDetailFragmentViewModel gameDetailFragmentViewModel2 = (GameDetailFragmentViewModel) getMViewModel();
        Bundle arguments2 = getArguments();
        gameDetailFragmentViewModel2.setDefaultBtnImage(arguments2 != null ? arguments2.getString("defaultBtnImage") : null);
        GameDetailFragmentViewModel gameDetailFragmentViewModel3 = (GameDetailFragmentViewModel) getMViewModel();
        Bundle arguments3 = getArguments();
        gameDetailFragmentViewModel3.setAutoDownload(arguments3 != null ? arguments3.getBoolean("autoDownload", false) : false);
        Bundle arguments4 = getArguments();
        this.showNewServer = arguments4 != null ? arguments4.getBoolean("showNewServer", false) : false;
        JsonMapper jsonMapper = JsonMapper.getInstance();
        Bundle arguments5 = getArguments();
        this.ext = (ExtBean) jsonMapper.fromJson(arguments5 != null ? arguments5.getString("ext") : null, ExtBean.class);
        ViewGroup.LayoutParams layoutParams = getMDatabind().L.getLayoutParams();
        layoutParams.height = com.join.android.app.common.utils.n.v(requireContext()) + ((int) getResources().getDimension(R.dimen.wdp97));
        getMDatabind().L.setLayoutParams(layoutParams);
        this.videoHelper = new com.join.android.app.component.video.g(getMDatabind().f19694b, "detailBanner");
        getMDatabind().f19694b.setLayoutManager(new LinearLayoutManager(requireContext(), 0, false));
        getMDatabind().f19694b.setAdapter(getBannerAdapter());
        new LinearSnapHelper().attachToRecyclerView(getMDatabind().f19694b);
        getMDatabind().f19694b.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.join.kotlin.discount.GameDetailFragment$initView$3
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(@NotNull RecyclerView recyclerView, int i4) {
                int i5;
                int i6;
                GameDetailBannerAdapter bannerAdapter;
                int i7;
                GameDetailBannerAdapter bannerAdapter2;
                int i8;
                GameDetailBannerAdapter bannerAdapter3;
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                super.onScrollStateChanged(recyclerView, i4);
                if (i4 == 0) {
                    GameDetailFragment.this.playVideo();
                    try {
                        RecyclerView.LayoutManager layoutManager = GameDetailFragment.this.getMDatabind().f19694b.getLayoutManager();
                        Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                        int findFirstCompletelyVisibleItemPosition = ((LinearLayoutManager) layoutManager).findFirstCompletelyVisibleItemPosition();
                        RecyclerView.LayoutManager layoutManager2 = GameDetailFragment.this.getMDatabind().f19694b.getLayoutManager();
                        Intrinsics.checkNotNull(layoutManager2, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                        int findFirstVisibleItemPosition = ((LinearLayoutManager) layoutManager2).findFirstVisibleItemPosition();
                        RecyclerView.LayoutManager layoutManager3 = GameDetailFragment.this.getMDatabind().f19694b.getLayoutManager();
                        Intrinsics.checkNotNull(layoutManager3, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                        int findLastCompletelyVisibleItemPosition = ((LinearLayoutManager) layoutManager3).findLastCompletelyVisibleItemPosition();
                        if (findFirstCompletelyVisibleItemPosition >= 0) {
                            i5 = GameDetailFragment.this.currentIndicatorPosition;
                            if (findFirstCompletelyVisibleItemPosition == i5) {
                                bannerAdapter3 = GameDetailFragment.this.getBannerAdapter();
                                if (findLastCompletelyVisibleItemPosition != bannerAdapter3.getItemCount() - 1) {
                                    return;
                                }
                            }
                            i6 = GameDetailFragment.this.currentIndicatorPosition;
                            if (i6 == GameDetailFragment.this.getMDatabind().f19716x.getChildCount() - 1) {
                                i8 = GameDetailFragment.this.firstCompletelyVisibleWhenIndicatorShowLast;
                                if (findFirstCompletelyVisibleItemPosition == i8) {
                                    return;
                                }
                            }
                            int childCount = GameDetailFragment.this.getMDatabind().f19716x.getChildCount();
                            int i9 = 0;
                            while (i9 < childCount) {
                                ItemDetailBannerIndicatorBinding itemDetailBannerIndicatorBinding = (ItemDetailBannerIndicatorBinding) DataBindingUtil.getBinding(GameDetailFragment.this.getMDatabind().f19716x.getChildAt(i9));
                                if (itemDetailBannerIndicatorBinding != null) {
                                    bannerAdapter = GameDetailFragment.this.getBannerAdapter();
                                    if (findLastCompletelyVisibleItemPosition == bannerAdapter.getItemCount() - 1) {
                                        i7 = GameDetailFragment.this.getMDatabind().f19716x.getChildCount() - 1;
                                    } else {
                                        i7 = (findFirstCompletelyVisibleItemPosition == 0 && findFirstVisibleItemPosition == 0) ? 0 : (findFirstCompletelyVisibleItemPosition == 1 && findFirstVisibleItemPosition == 0) ? 1 : findFirstCompletelyVisibleItemPosition;
                                    }
                                    itemDetailBannerIndicatorBinding.f(Boolean.valueOf(i9 == i7));
                                }
                                if (itemDetailBannerIndicatorBinding != null ? Intrinsics.areEqual(itemDetailBannerIndicatorBinding.c(), Boolean.TRUE) : false) {
                                    GameDetailFragment.this.currentIndicatorPosition = i9;
                                    bannerAdapter2 = GameDetailFragment.this.getBannerAdapter();
                                    if (findLastCompletelyVisibleItemPosition == bannerAdapter2.getItemCount() - 1) {
                                        GameDetailFragment.this.firstCompletelyVisibleWhenIndicatorShowLast = findFirstCompletelyVisibleItemPosition;
                                    } else {
                                        GameDetailFragment.this.firstCompletelyVisibleWhenIndicatorShowLast = -1;
                                    }
                                }
                                i9++;
                            }
                        }
                    } catch (Exception e5) {
                        e5.printStackTrace();
                    }
                }
            }
        });
        RecyclerView recyclerView = getMDatabind().B;
        final FragmentActivity activity = getActivity();
        recyclerView.setLayoutManager(new LinearLayoutManager(activity) { // from class: com.join.kotlin.discount.GameDetailFragment$initView$4
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public boolean canScrollVertically() {
                return false;
            }
        });
        getMDatabind().B.setAdapter(getInfoAdapter());
        getInfoAdapter().setOnItemClickListener(new BaseQuickAdapter.d() { // from class: com.join.kotlin.discount.j
            @Override // com.chad.library.adapter.base.BaseQuickAdapter.d
            public final void a(BaseQuickAdapter baseQuickAdapter, View view, int i4) {
                GameDetailFragment.initView$lambda$1(GameDetailFragment.this, baseQuickAdapter, view, i4);
            }
        });
        RecyclerView recyclerView2 = getMDatabind().C;
        final Context requireContext = requireContext();
        recyclerView2.setLayoutManager(new LinearLayoutManager(requireContext) { // from class: com.join.kotlin.discount.GameDetailFragment$initView$6
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public boolean canScrollVertically() {
                return false;
            }
        });
        getMDatabind().C.setAdapter(getReleaseWelfareAdapter());
        getMDatabind().C.addItemDecoration(new UniversalItemDecoration() { // from class: com.join.kotlin.discount.GameDetailFragment$initView$7
            @Override // com.join.mgps.base.decoration.UniversalItemDecoration
            @NotNull
            public UniversalItemDecoration.b getItemOffsets(int i4) {
                UniversalItemDecoration.a aVar = new UniversalItemDecoration.a();
                aVar.f46233f = 0;
                if (i4 == 0) {
                    aVar.f46236c = 0;
                } else {
                    aVar.f46236c = (int) GameDetailFragment.this.getResources().getDimension(R.dimen.wdp15);
                }
                return aVar;
            }
        });
        ViewTreeObserver viewTreeObserver = getMDatabind().C.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.join.kotlin.discount.e
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    GameDetailFragment.initView$lambda$4(GameDetailFragment.this);
                }
            });
        }
        RecyclerView recyclerView3 = getMDatabind().A;
        final Context requireContext2 = requireContext();
        recyclerView3.setLayoutManager(new LinearLayoutManager(requireContext2) { // from class: com.join.kotlin.discount.GameDetailFragment$initView$9
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public boolean canScrollVertically() {
                return false;
            }
        });
        getCommentAdapter().setClick(this);
        getMDatabind().A.setAdapter(getCommentAdapter());
        RecyclerView.ItemAnimator itemAnimator = getMDatabind().A.getItemAnimator();
        Intrinsics.checkNotNull(itemAnimator, "null cannot be cast to non-null type androidx.recyclerview.widget.SimpleItemAnimator");
        ((SimpleItemAnimator) itemAnimator).setSupportsChangeAnimations(false);
        XQuickRecyclerView xQuickRecyclerView = getMDatabind().D;
        final Context requireContext3 = requireContext();
        xQuickRecyclerView.setLayoutManager(new GridLayoutManager(requireContext3) { // from class: com.join.kotlin.discount.GameDetailFragment$initView$10
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public boolean canScrollVertically() {
                return false;
            }
        });
        getSimilarAdapter().setOnItemClickListener(new BaseQuickAdapter.d() { // from class: com.join.kotlin.discount.k
            @Override // com.chad.library.adapter.base.BaseQuickAdapter.d
            public final void a(BaseQuickAdapter baseQuickAdapter, View view, int i4) {
                GameDetailFragment.initView$lambda$5(GameDetailFragment.this, baseQuickAdapter, view, i4);
            }
        });
        getMDatabind().D.setAdapter(getSimilarAdapter());
        getMDatabind().f19717y.setOnScrollChangeListener(new NestedScrollView.OnScrollChangeListener() { // from class: com.join.kotlin.discount.GameDetailFragment$initView$12
            @Override // androidx.core.widget.NestedScrollView.OnScrollChangeListener
            public void onScrollChange(@NotNull NestedScrollView v2, int i4, int i5, int i6, int i7) {
                boolean z4;
                GamedetailVideoMainActivity gamedetailVideoMainActivity;
                String str;
                boolean z5;
                com.join.android.app.component.video.g gVar;
                Intrinsics.checkNotNullParameter(v2, "v");
                int[] iArr = {0, 0};
                GameDetailFragment.this.getMDatabind().f19695c.getLocationInWindow(iArr);
                if (iArr[1] < 0) {
                    z5 = GameDetailFragment.this.isPause;
                    if (!z5) {
                        gVar = GameDetailFragment.this.videoHelper;
                        if (gVar != null) {
                            gVar.u();
                        }
                        FragmentActivity activity2 = GameDetailFragment.this.getActivity();
                        gamedetailVideoMainActivity = activity2 instanceof GamedetailVideoMainActivity ? (GamedetailVideoMainActivity) activity2 : null;
                        if (gamedetailVideoMainActivity != null) {
                            gamedetailVideoMainActivity.setTabIsDarkColor(true);
                        }
                        GameDetailFragment.this.getMDatabind().L.setBackgroundColor(Color.parseColor("#ffffff"));
                        GameDetailFragment.this.isPause = true;
                    }
                } else {
                    z4 = GameDetailFragment.this.isPause;
                    if (z4) {
                        GameDetailFragment.this.playVideo();
                        FragmentActivity activity3 = GameDetailFragment.this.getActivity();
                        gamedetailVideoMainActivity = activity3 instanceof GamedetailVideoMainActivity ? (GamedetailVideoMainActivity) activity3 : null;
                        if (gamedetailVideoMainActivity != null) {
                            gamedetailVideoMainActivity.setTabIsDarkColor(false);
                        }
                        View view = GameDetailFragment.this.getMDatabind().L;
                        str = GameDetailFragment.this.topBgColor;
                        view.setBackgroundColor(Color.parseColor(str));
                        GameDetailFragment.this.isPause = false;
                    }
                }
                if (i5 != v2.getChildAt(0).getMeasuredHeight() - v2.getMeasuredHeight() || GameDetailFragment.this.getMDatabind().D.getNoMore()) {
                    return;
                }
                GameDetailFragment.this.loadSimilarGame(false);
            }
        });
        try {
            Ext ext = new Ext();
            ext.setResultCode("discount_game");
            ext.setScenesCode(GameDetailFragment.class.getSimpleName());
            Data data = new Data();
            String gameId = ((GameDetailFragmentViewModel) getMViewModel()).getGameId();
            data.setGameId(gameId != null ? Long.parseLong(gameId) : 0L);
            com.papa.sim.statistic.p.l(getContext()).Y(Event.expGameAdPage, ext, data);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        com.kingja.loadsir.core.b<Object> bVar2 = this.loadSir;
        if (bVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loadSir");
        } else {
            bVar = bVar2;
        }
        CustomViewExtKt.showLoading(bVar);
    }

    @Override // com.join.kotlin.base.fragment.BaseVmFragment
    public void lazyLoadData() {
        com.kingja.loadsir.core.b<Object> bVar = this.loadSir;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loadSir");
            bVar = null;
        }
        CustomViewExtKt.showLoading(bVar);
        loadDbData();
    }

    @Override // com.join.kotlin.discount.proxy.ItemGameDetailCommentListClickProxy
    public void like(@Nullable CommentDetailBean commentDetailBean) {
    }

    public final void loadData(boolean z4) {
        ((GameDetailFragmentViewModel) getMViewModel()).getGameDetail();
        if (z4) {
            ((GameDetailFragmentViewModel) getMViewModel()).getCommentList();
            ((GameDetailFragmentViewModel) getMViewModel()).getCommentStatisticData();
            loadSimilarGame(true);
        }
    }

    public final void loadDbData() {
        loadData(true);
        ((GameDetailFragmentViewModel) getMViewModel()).getCommentList();
        ((GameDetailFragmentViewModel) getMViewModel()).getCommentStatisticData();
    }

    public final void loadSimilarGame(boolean z4) {
        ((GameDetailFragmentViewModel) getMViewModel()).getSimilarGames(z4);
    }

    @Override // com.join.kotlin.discount.proxy.GameDetailFragmentClickProxy
    public void onAdClick() {
        List<CommonGameInfoBean> ad;
        GameDetailBean value = ((GameDetailFragmentViewModel) getMViewModel()).getGameInfo().getValue();
        if (value == null || (ad = value.getAd()) == null || !(!ad.isEmpty())) {
            return;
        }
        IntentUtil intentUtil = IntentUtil.getInstance();
        Context requireContext = requireContext();
        CommonGameInfoBean commonGameInfoBean = ad.get(0);
        intentUtil.intentActivity(requireContext, commonGameInfoBean != null ? commonGameInfoBean.getIntentDataBean() : null);
    }

    @Override // com.join.kotlin.base.fragment.BaseVmDbFragment, com.join.kotlin.base.fragment.BaseVmFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        this.hasDestroyed = true;
        d0 a5 = d0.a();
        if (a5.b(this)) {
            a5.e(this);
        }
        Handler handler = this.handler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        com.join.android.app.component.video.g gVar = this.videoHelper;
        if (gVar != null) {
            gVar.t();
        }
        this.videoHelper = null;
        super.onDestroy();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0097, code lost:
        if (((r0 == null || r0.getStatus() != 48) ? false : false) != false) goto L25;
     */
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onEventMainThread(@org.jetbrains.annotations.NotNull com.join.mgps.event.n r5) {
        /*
            r4 = this;
            java.lang.String r0 = "downloadTaskEvent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            p1.f r5 = p1.f.K()
            com.join.kotlin.base.viewmodel.BaseViewModel r0 = r4.getMViewModel()
            com.join.kotlin.discount.viewmodel.GameDetailFragmentViewModel r0 = (com.join.kotlin.discount.viewmodel.GameDetailFragmentViewModel) r0
            java.lang.String r0 = r0.getGameId()
            com.github.snowdream.android.app.downloader.DownloadTask r5 = r5.F(r0)
            if (r5 == 0) goto Lbd
            com.join.kotlin.base.viewmodel.BaseViewModel r0 = r4.getMViewModel()
            com.join.kotlin.discount.viewmodel.GameDetailFragmentViewModel r0 = (com.join.kotlin.discount.viewmodel.GameDetailFragmentViewModel) r0
            androidx.lifecycle.MutableLiveData r0 = r0.getDownloadTask()
            r0.setValue(r5)
            com.join.kotlin.base.viewmodel.BaseViewModel r0 = r4.getMViewModel()
            com.join.kotlin.discount.viewmodel.GameDetailFragmentViewModel r0 = (com.join.kotlin.discount.viewmodel.GameDetailFragmentViewModel) r0
            androidx.lifecycle.MutableLiveData r0 = r0.getProgress()
            long r1 = r5.getProgress()
            int r2 = (int) r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r0.setValue(r1)
            com.join.kotlin.base.viewmodel.BaseViewModel r0 = r4.getMViewModel()
            com.join.kotlin.discount.viewmodel.GameDetailFragmentViewModel r0 = (com.join.kotlin.discount.viewmodel.GameDetailFragmentViewModel) r0
            androidx.lifecycle.MutableLiveData r0 = r0.getDownloadTask()
            java.lang.Object r0 = r0.getValue()
            com.github.snowdream.android.app.downloader.DownloadTask r0 = (com.github.snowdream.android.app.downloader.DownloadTask) r0
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L59
            int r0 = r0.getStatus()
            r3 = 5
            if (r0 != r3) goto L59
            r0 = 1
            goto L5a
        L59:
            r0 = 0
        L5a:
            if (r0 != 0) goto L99
            com.join.kotlin.base.viewmodel.BaseViewModel r0 = r4.getMViewModel()
            com.join.kotlin.discount.viewmodel.GameDetailFragmentViewModel r0 = (com.join.kotlin.discount.viewmodel.GameDetailFragmentViewModel) r0
            androidx.lifecycle.MutableLiveData r0 = r0.getDownloadTask()
            java.lang.Object r0 = r0.getValue()
            com.github.snowdream.android.app.downloader.DownloadTask r0 = (com.github.snowdream.android.app.downloader.DownloadTask) r0
            if (r0 == 0) goto L78
            int r0 = r0.getStatus()
            r3 = 11
            if (r0 != r3) goto L78
            r0 = 1
            goto L79
        L78:
            r0 = 0
        L79:
            if (r0 != 0) goto L99
            com.join.kotlin.base.viewmodel.BaseViewModel r0 = r4.getMViewModel()
            com.join.kotlin.discount.viewmodel.GameDetailFragmentViewModel r0 = (com.join.kotlin.discount.viewmodel.GameDetailFragmentViewModel) r0
            androidx.lifecycle.MutableLiveData r0 = r0.getDownloadTask()
            java.lang.Object r0 = r0.getValue()
            com.github.snowdream.android.app.downloader.DownloadTask r0 = (com.github.snowdream.android.app.downloader.DownloadTask) r0
            if (r0 == 0) goto L96
            int r0 = r0.getStatus()
            r3 = 48
            if (r0 != r3) goto L96
            goto L97
        L96:
            r1 = 0
        L97:
            if (r1 == 0) goto Lac
        L99:
            com.join.kotlin.base.viewmodel.BaseViewModel r0 = r4.getMViewModel()
            com.join.kotlin.discount.viewmodel.GameDetailFragmentViewModel r0 = (com.join.kotlin.discount.viewmodel.GameDetailFragmentViewModel) r0
            androidx.lifecycle.MutableLiveData r0 = r0.getProgress()
            r1 = 100
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.setValue(r1)
        Lac:
            com.join.kotlin.base.viewmodel.BaseViewModel r0 = r4.getMViewModel()
            com.join.kotlin.discount.viewmodel.GameDetailFragmentViewModel r0 = (com.join.kotlin.discount.viewmodel.GameDetailFragmentViewModel) r0
            androidx.lifecycle.MutableLiveData r0 = r0.getBtnText()
            java.lang.String r5 = com.join.mgps.Util.UtilsMy.K1(r5)
            r0.setValue(r5)
        Lbd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.kotlin.discount.GameDetailFragment.onEventMainThread(com.join.mgps.event.n):void");
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        com.join.android.app.component.video.g gVar = this.videoHelper;
        if (gVar != null) {
            gVar.u();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0139, code lost:
        if (((r1 == null || r1.getStatus() != 48) ? false : false) != false) goto L60;
     */
    @Override // com.join.kotlin.base.fragment.BaseVmFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() {
        /*
            Method dump skipped, instructions count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.kotlin.discount.GameDetailFragment.onResume():void");
    }

    public final void playVideo() {
        Handler handler = this.handler;
        if (handler != null) {
            handler.postDelayed(new Runnable() { // from class: com.join.kotlin.discount.l
                @Override // java.lang.Runnable
                public final void run() {
                    GameDetailFragment.playVideo$lambda$8(GameDetailFragment.this);
                }
            }, 200L);
        }
    }

    public final void setExt(@Nullable ExtBean extBean) {
        this.ext = extBean;
    }

    @Override // com.join.kotlin.discount.proxy.GameDetailFragmentClickProxy
    public void showBigRRule() {
    }

    @Override // com.join.kotlin.discount.proxy.GameDetailFragmentClickProxy
    public void showCommentStatistic(int i4) {
        Intent intent = new Intent(requireContext(), GameDetailCommentDataActivity.class);
        intent.putExtra("commentData", JsonMapper.getInstance().toJson(((GameDetailFragmentViewModel) getMViewModel()).getCommentStatistic().getValue()));
        intent.putExtra("defaultIndex", i4);
        startActivity(intent);
    }

    @Override // com.join.kotlin.base.fragment.BaseVmFragment
    public void showLoading(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
    }

    @Override // com.join.kotlin.discount.proxy.GameDetailFragmentClickProxy
    public void supportBigR() {
    }

    @Nullable
    public final GameDetailBean supportGameInfo() {
        return ((GameDetailFragmentViewModel) getMViewModel()).getGameInfo().getValue();
    }

    @Override // com.join.kotlin.discount.proxy.GameDetailFragmentClickProxy
    public void toMoreSubAccount() {
    }

    @Override // com.join.kotlin.discount.proxy.GameDetailFragmentClickProxy
    public void toRefundDetail() {
    }

    @Override // com.join.kotlin.discount.proxy.GameDetailFragmentClickProxy
    public void verticalPicClick(@Nullable String str) {
        int indexOf;
        try {
            ArrayList arrayList = new ArrayList();
            List<GameDetailBannerEntityBean> items = getBannerAdapter().getItems();
            ArrayList<GameDetailBannerEntityBean> arrayList2 = new ArrayList();
            Iterator<T> it2 = items.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (((GameDetailBannerEntityBean) next).getViewType() == 3) {
                    arrayList2.add(next);
                }
            }
            for (GameDetailBannerEntityBean gameDetailBannerEntityBean : arrayList2) {
                if (gameDetailBannerEntityBean.getData() instanceof List) {
                    Object data = gameDetailBannerEntityBean.getData();
                    Intrinsics.checkNotNull(data, "null cannot be cast to non-null type kotlin.collections.List<*>");
                    ArrayList<String> arrayList3 = new ArrayList();
                    for (Object obj : (List) data) {
                        if (obj instanceof String) {
                            arrayList3.add(obj);
                        }
                    }
                    for (String str2 : arrayList3) {
                        arrayList.add(str2);
                    }
                }
            }
            Intent intent = new Intent(requireContext(), ImagePagerActivity.class);
            intent.putExtra("image_urls", (String[]) arrayList.toArray(new String[0]));
            indexOf = CollectionsKt___CollectionsKt.indexOf((List<? extends Object>) ((List) arrayList), (Object) str);
            intent.putExtra("image_index", indexOf);
            startActivity(intent);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }
}
