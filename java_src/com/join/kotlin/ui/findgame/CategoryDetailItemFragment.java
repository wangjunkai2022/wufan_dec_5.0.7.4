package com.join.kotlin.ui.findgame;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.join.android.app.common.utils.JsonMapper;
import com.join.android.app.component.xrecyclerview.XRecyclerView;
import com.join.android.app.mgsim.wufun.databinding.CategroyDetialItemFragmentBinding;
import com.join.kotlin.EverdayNewFragment;
import com.join.kotlin.presenter.CategoryPrensenter;
import com.join.kotlin.presenter.view.CategoryView;
import com.join.kotlin.ui.findgame.data.CategoryListMain;
import com.join.kotlin.ui.findgame.data.CategoryRequest;
import com.join.kotlin.ui.findgame.data.CategroyIntentItemData;
import com.join.kotlin.ui.findgame.data.GameSubTypeData;
import com.join.kotlin.ui.findgame.data.GameTypeData;
import com.join.kotlin.ui.findgame.data.TagData;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.Util.d0;
import com.join.mgps.business.CollectionBeanSubBusiness;
import com.join.mgps.dto.CollectionBeanSub;
import com.join.mgps.event.n;
import com.join.mgps.fragment.BaseFragment;
import com.join.mgps.pref.PrefDef_;
import com.papa.sim.statistic.Data;
import com.papa.sim.statistic.Event;
import com.papa.sim.statistic.Ext;
import com.papa.sim.statistic.p;
import com.psk.kotlin.ext.CommonExtKt;
import com.psk.kotlin.util.BasDownLoadActivityPresenter;
import com.psk.kotlin.util.CommonListMainData;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: CategoryDetailItemFragment.kt */
@SourceDebugExtension({"SMAP\nCategoryDetailItemFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CategoryDetailItemFragment.kt\ncom/join/kotlin/ui/findgame/CategoryDetailItemFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,326:1\n766#2:327\n857#2,2:328\n766#2:330\n857#2,2:331\n1855#2:333\n766#2:334\n857#2,2:335\n1856#2:337\n1864#2,3:339\n1#3:338\n*S KotlinDebug\n*F\n+ 1 CategoryDetailItemFragment.kt\ncom/join/kotlin/ui/findgame/CategoryDetailItemFragment\n*L\n121#1:327\n121#1:328,2\n125#1:330\n125#1:331,2\n130#1:333\n131#1:334\n131#1:335,2\n130#1:337\n240#1:339,3\n*E\n"})
/* loaded from: classes.dex */
public final class CategoryDetailItemFragment extends BaseFragment implements CategoryView, View.OnClickListener {
    @NotNull
    public static final Companion Companion = new Companion(null);
    public EverdayNewFragment.EverdayNewAdapter adapter;
    public BasDownLoadActivityPresenter basDownloadPresenter;
    public CategroyDetialItemFragmentBinding binding;
    public CategoryPrensenter categoryPrensenter;
    private int from;
    public List<GameTypeData> gameTypeList;
    private boolean isExposuring;
    public List<CommonListMainData> showDatalist;
    @NotNull
    private CategoryRequest requestArgs = new CategoryRequest();
    private int page = 1;
    @NotNull
    private GameSubTypeData featureType = new GameSubTypeData();
    @NotNull
    private TagData gameSortType = new TagData(1, 1, "综合");
    @NotNull
    private GameSubTypeData gameType = new GameSubTypeData();
    @NotNull
    private GameSubTypeData modelType = new GameSubTypeData();
    @NotNull
    private GameSubTypeData playType = new GameSubTypeData();
    @NotNull
    private GameSubTypeData themeType = new GameSubTypeData();
    @NotNull
    private Handler handler = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.join.kotlin.ui.findgame.a
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            boolean handler$lambda$9;
            handler$lambda$9 = CategoryDetailItemFragment.handler$lambda$9(CategoryDetailItemFragment.this, message);
            return handler$lambda$9;
        }
    });

    /* compiled from: CategoryDetailItemFragment.kt */
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final CategoryDetailItemFragment newInstance(int i4, @NotNull CategroyIntentItemData data, int i5) {
            Intrinsics.checkNotNullParameter(data, "data");
            CategoryDetailItemFragment categoryDetailItemFragment = new CategoryDetailItemFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("type", i4);
            bundle.putSerializable("data", data);
            bundle.putInt("from", i5);
            categoryDetailItemFragment.setArguments(bundle);
            return categoryDetailItemFragment;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void expDiscountGame() {
        try {
            try {
                if (isAdded() && !this.isExposuring) {
                    this.isExposuring = true;
                    int lastVisiblePosition = getBinding().f17684f.getLastVisiblePosition();
                    int i4 = 0;
                    for (Object obj : getShowDatalist()) {
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
                                        ext.setScenesCode(CategoryDetailItemFragment.class.getSimpleName());
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
    public static final boolean handler$lambda$9(CategoryDetailItemFragment this$0, Message it2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it2, "it");
        if (this$0.getContext() != null) {
            CategoryPrensenter categoryPrensenter = this$0.getCategoryPrensenter();
            Context context = this$0.getContext();
            Intrinsics.checkNotNull(context);
            categoryPrensenter.loadCategoryData(context, this$0.requestArgs);
            return false;
        }
        return false;
    }

    private final void initView() {
        TextView textView = getBinding().f17683e.f25506g;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.noData.setAll");
        CommonExtKt.onClick(textView, new Function0<Unit>() { // from class: com.join.kotlin.ui.findgame.CategoryDetailItemFragment$initView$1
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
                if (CategoryDetailItemFragment.this.getActivity() instanceof CategoryDetailListActivity) {
                    FragmentActivity activity = CategoryDetailItemFragment.this.getActivity();
                    Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.join.kotlin.ui.findgame.CategoryDetailListActivity");
                    ((CategoryDetailListActivity) activity).reLoadDatas();
                }
            }
        });
        getBinding().f17684f.setLoadingListener(new XRecyclerView.f() { // from class: com.join.kotlin.ui.findgame.CategoryDetailItemFragment$initView$2
            @Override // com.join.android.app.component.xrecyclerview.XRecyclerView.f
            public void onLoadMore() {
                CategoryDetailItemFragment.this.getRequestArgs().setPage(CategoryDetailItemFragment.this.getPage());
                Context context = CategoryDetailItemFragment.this.getContext();
                if (context != null) {
                    CategoryDetailItemFragment categoryDetailItemFragment = CategoryDetailItemFragment.this;
                    categoryDetailItemFragment.getCategoryPrensenter().loadCategoryData(context, categoryDetailItemFragment.getRequestArgs());
                }
            }

            @Override // com.join.android.app.component.xrecyclerview.XRecyclerView.f
            public void onRefresh() {
            }
        });
        getBinding().f17684f.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.join.kotlin.ui.findgame.CategoryDetailItemFragment$initView$3
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(@NotNull RecyclerView recyclerView, int i4) {
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                super.onScrollStateChanged(recyclerView, i4);
                if (i4 == 0) {
                    CategoryDetailItemFragment.this.expDiscountGame();
                }
            }
        });
        Context context = getContext();
        if (context != null) {
            setAdapter(new EverdayNewFragment.EverdayNewAdapter(context, getShowDatalist()));
        }
        getBinding().f17684f.setAdapter(getAdapter());
        this.requestArgs.setUid(AccountUtil_.getInstance_(getContext()).getAccountData().getUid());
        LinearLayout linearLayout = getBinding().f17681c.f19364e;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.failedLayoutMain.lodingFaile");
        CommonExtKt.onClick(linearLayout, new Function0<Unit>() { // from class: com.join.kotlin.ui.findgame.CategoryDetailItemFragment$initView$5
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
                Context context2 = CategoryDetailItemFragment.this.getContext();
                if (context2 != null) {
                    CategoryDetailItemFragment categoryDetailItemFragment = CategoryDetailItemFragment.this;
                    categoryDetailItemFragment.getCategoryPrensenter().loadCategoryData(context2, categoryDetailItemFragment.getRequestArgs());
                }
            }
        });
    }

    private final void updateRequestArgs() {
        this.page = 1;
        this.requestArgs.setPage(1);
        this.requestArgs.resetData();
        this.requestArgs.setUid(AccountUtil_.getInstance_(getContext()).getAccountData().getUid());
        this.requestArgs.setModelType(this.modelType.getId());
        this.requestArgs.setGameType(this.gameType.getId());
        this.requestArgs.setThemeType(this.themeType.getId());
        this.requestArgs.setPlayType(this.playType.getId());
        this.requestArgs.setFeatureType(this.featureType.getId());
        this.requestArgs.setGameSortType(this.gameSortType.getId());
    }

    @NotNull
    public final EverdayNewFragment.EverdayNewAdapter getAdapter() {
        EverdayNewFragment.EverdayNewAdapter everdayNewAdapter = this.adapter;
        if (everdayNewAdapter != null) {
            return everdayNewAdapter;
        }
        Intrinsics.throwUninitializedPropertyAccessException("adapter");
        return null;
    }

    @NotNull
    public final BasDownLoadActivityPresenter getBasDownloadPresenter() {
        BasDownLoadActivityPresenter basDownLoadActivityPresenter = this.basDownloadPresenter;
        if (basDownLoadActivityPresenter != null) {
            return basDownLoadActivityPresenter;
        }
        Intrinsics.throwUninitializedPropertyAccessException("basDownloadPresenter");
        return null;
    }

    @NotNull
    public final CategroyDetialItemFragmentBinding getBinding() {
        CategroyDetialItemFragmentBinding categroyDetialItemFragmentBinding = this.binding;
        if (categroyDetialItemFragmentBinding != null) {
            return categroyDetialItemFragmentBinding;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    @NotNull
    public final CategoryPrensenter getCategoryPrensenter() {
        CategoryPrensenter categoryPrensenter = this.categoryPrensenter;
        if (categoryPrensenter != null) {
            return categoryPrensenter;
        }
        Intrinsics.throwUninitializedPropertyAccessException("categoryPrensenter");
        return null;
    }

    @NotNull
    public final GameSubTypeData getFeatureType() {
        return this.featureType;
    }

    public final int getFrom() {
        return this.from;
    }

    @NotNull
    public final TagData getGameSortType() {
        return this.gameSortType;
    }

    @NotNull
    public final GameSubTypeData getGameType() {
        return this.gameType;
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
    public final Handler getHandler() {
        return this.handler;
    }

    @NotNull
    public final GameSubTypeData getModelType() {
        return this.modelType;
    }

    public final int getPage() {
        return this.page;
    }

    @NotNull
    public final GameSubTypeData getPlayType() {
        return this.playType;
    }

    @NotNull
    public final CategoryRequest getRequestArgs() {
        return this.requestArgs;
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

    @NotNull
    public final GameSubTypeData getThemeType() {
        return this.themeType;
    }

    @Override // com.psk.kotlin.base.presenter.view.BaseView
    public void hidLoading() {
        getBinding().f17682d.f23562d.setVisibility(8);
        getBinding().f17683e.f25502c.setVisibility(8);
        getBinding().f17681c.f19364e.setVisibility(8);
        getBinding().f17684f.setVisibility(0);
    }

    @Override // com.join.mgps.fragment.BaseFragment
    protected void lazyLoad() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            getCategoryPrensenter().loadCategoryData(activity, this.requestArgs);
        } else {
            this.handler.sendEmptyMessageDelayed(1, 500L);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@Nullable View view) {
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        List<GameSubTypeData> reversed;
        List mutableList;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        CategroyDetialItemFragmentBinding inflate = CategroyDetialItemFragmentBinding.inflate(inflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(inflater, container, false)");
        setBinding(inflate);
        setShowDatalist(new ArrayList());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        getBinding().f17684f.setLayoutManager(linearLayoutManager);
        setCategoryPrensenter(new CategoryPrensenter(this));
        setShowDatalist(new ArrayList());
        XRecyclerView xRecyclerView = getBinding().f17684f;
        Intrinsics.checkNotNullExpressionValue(xRecyclerView, "binding.recycleView");
        setBasDownloadPresenter(new BasDownLoadActivityPresenter(linearLayoutManager, xRecyclerView, getShowDatalist()));
        Bundle arguments = getArguments();
        Object obj = arguments != null ? arguments.get("type") : null;
        Bundle arguments2 = getArguments();
        Object obj2 = arguments2 != null ? arguments2.get("from") : null;
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Int");
        this.from = ((Integer) obj2).intValue();
        Bundle arguments3 = getArguments();
        Serializable serializable = arguments3 != null ? arguments3.getSerializable("data") : null;
        Intrinsics.checkNotNull(serializable, "null cannot be cast to non-null type com.join.kotlin.ui.findgame.data.CategroyIntentItemData");
        CategroyIntentItemData categroyIntentItemData = (CategroyIntentItemData) serializable;
        GameSubTypeData featureType = categroyIntentItemData.getFeatureType();
        Intrinsics.checkNotNullExpressionValue(featureType, "initData.featureType");
        this.featureType = featureType;
        GameSubTypeData gameType = categroyIntentItemData.getGameType();
        Intrinsics.checkNotNullExpressionValue(gameType, "initData.gameType");
        this.gameType = gameType;
        GameSubTypeData modelType = categroyIntentItemData.getModelType();
        Intrinsics.checkNotNullExpressionValue(modelType, "initData.modelType");
        this.modelType = modelType;
        GameSubTypeData playType = categroyIntentItemData.getPlayType();
        Intrinsics.checkNotNullExpressionValue(playType, "initData.playType");
        this.playType = playType;
        GameSubTypeData themeType = categroyIntentItemData.getThemeType();
        Intrinsics.checkNotNullExpressionValue(themeType, "initData.themeType");
        this.themeType = themeType;
        Button button = getBinding().f17681c.f19366g;
        Intrinsics.checkNotNullExpressionValue(button, "binding.failedLayoutMain.setNetwork");
        CommonExtKt.onClick(button, new Function0<Unit>() { // from class: com.join.kotlin.ui.findgame.CategoryDetailItemFragment$onCreateView$1
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
                UtilsMy.w3(CategoryDetailItemFragment.this.getContext());
            }
        });
        ImageView imageView = getBinding().f17681c.f19365f;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.failedLayoutMain.relodingimag");
        CommonExtKt.onClick(imageView, new Function0<Unit>() { // from class: com.join.kotlin.ui.findgame.CategoryDetailItemFragment$onCreateView$2
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
                CategoryPrensenter categoryPrensenter = CategoryDetailItemFragment.this.getCategoryPrensenter();
                FragmentActivity activity = CategoryDetailItemFragment.this.getActivity();
                Intrinsics.checkNotNull(activity);
                categoryPrensenter.loadCategoryData(activity, CategoryDetailItemFragment.this.getRequestArgs());
            }
        });
        TagData tagData = this.gameSortType;
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Int");
        tagData.setId(((Integer) obj).intValue());
        this.gameSortType.setType(((Number) obj).intValue());
        String d5 = new PrefDef_(getContext()).gameTypeList().d();
        if (d5 == null || d5.length() == 0) {
            d5 = "[{\"id\":1,\"title\":\"模拟器\",\"type\":1,\"sub_game_type\":[{\"id\":31,\"pic\":\"http://ctimg2018.myyx618.com/upload/images/game_tag_type_icon/fba_icon.png\",\"title\":\"街机\"},{\"id\":33,\"pic\":\"http://ctimg2018.myyx618.com/upload/images/game_tag_type_icon/gba_icon.png\",\"title\":\"GBA\"},{\"id\":34,\"pic\":\"http://ctimg2018.myyx618.com/upload/images/game_tag_type_icon/psp_icon.png\",\"title\":\"PSP\"},{\"id\":35,\"pic\":\"http://ctimg2018.myyx618.com/upload/images/game_tag_type_icon/fc_icon.png\",\"title\":\"FC\"},{\"id\":43,\"pic\":\"http://ctimg2018.myyx618.com/upload/images/game_tag_type_icon/sfc_icon.png\",\"title\":\"SFC\"},{\"id\":53,\"pic\":\"http://ctimg2018.myyx618.com/upload/images/game_tag_type_icon/ps_icon.png\",\"title\":\"PS\"},{\"id\":51,\"pic\":\"http://ctimg2018.myyx618.com/upload/images/game_tag_type_icon/md_icon.png\",\"title\":\"MD\"},{\"id\":54,\"pic\":\"http://ctimg2018.myyx618.com/upload/images/game_tag_type_icon/wsc_icon.png\",\"title\":\"WSC\"},{\"id\":57,\"pic\":\"http://ctimg2018.myyx618.com/upload/images/game_tag_type_icon/n64_icon.png\",\"title\":\"N64\"},{\"id\":58,\"pic\":\"http://ctimg2018.myyx618.com/upload/images/game_tag_type_icon/on_icon.png\",\"title\":\"ONS\"},{\"id\":32,\"pic\":\"http://ctimg2018.myyx618.com/upload/images/game_tag_type_icon/nd_icon.png\",\"title\":\"NDS\"},{\"id\":56,\"pic\":\"http://ctimg2018.myyx618.com/upload/images/game_tag_type_icon/gbc_icon.png\",\"title\":\"GBC\"},{\"id\":60,\"pic\":\"http://ctimg2018.myyx618.com/upload/images/game_tag_type_icon/dc_icon.png\",\"title\":\"DC\"},{\"id\":102,\"pic\":\"\",\"title\":\"H5\"}]},{\"id\":2,\"title\":\"安卓\",\"type\":2,\"sub_game_type\":[{\"id\":10001,\"pic\":\"http://ctimg2018.myyx618.com/upload/images/game_tag_type_icon/onlin_icon.png\",\"title\":\"网游\"},{\"id\":10002,\"pic\":\"http://ctimg2018.myyx618.com/upload/images/game_tag_type_icon/single_icon.png\",\"title\":\"单机\"},{\"id\":10003,\"pic\":\"http://ctimg2018.myyx618.com/upload/images/game_tag_type_icon/single_icon.png\",\"title\":\"mod\"}]},{\"id\":3,\"title\":\"分类\",\"type\":3,\"sub_game_type\":[{\"id\":24,\"pic\":\"http://ctimg2018.myyx618.com/upload/images/f3/ae/f3ae58e30ae7e432d7571a5ab08e31a2.png\",\"title\":\"动作冒险\"},{\"id\":23,\"pic\":\"http://ctimg2018.myyx618.com/upload/images/2d/31/2d31f269379aee69d2e283478a1b9aa5.png\",\"title\":\"休闲益智\"},{\"id\":20,\"pic\":\"http://ctimg2018.myyx618.com/upload/images/e3/62/e36255c965b63e80d901f7ea04ae5aa1.png\",\"title\":\"角色扮演\"},{\"id\":25,\"pic\":\"http://ctimg2018.myyx618.com/upload/images/f4/44/f4444b37064a2cb88401db74dc5e3f75.png\",\"title\":\"射击飞行\"},{\"id\":19,\"pic\":\"http://ctimg2018.myyx618.com/upload/images/e1/d1/e1d1edd8076f1d92425cef93feef1cf2.png\",\"title\":\"策略战棋\"},{\"id\":17,\"pic\":\"http://ctimg2018.myyx618.com/upload/images/3f/c8/3fc873bf10d151215d5b977178c4afe6.png\",\"title\":\"模拟游戏\"},{\"id\":22,\"pic\":\"http://ctimg2018.myyx618.com/upload/images/3c/05/3c054708b2a888461eb338d34412a3f0.png\",\"title\":\"体育游戏\"},{\"id\":39,\"pic\":\"http://ctimg2018.myyx618.com/upload/images/8e/de/8ede16897f71fdba1389d625b1c9ccfa.png\",\"title\":\"竞速游戏\"},{\"id\":18,\"pic\":\"http://ctimg2018.myyx618.com/upload/images/fc/9c/fc9c346e32b8f48fe6348b8b72e970ce.png\",\"title\":\"格斗竞技\"},{\"id\":38,\"pic\":\"http://ctimg2018.myyx618.com/upload/images/ef/8d/ef8d5060aa6c85a58bff921302bcc73a.png\",\"title\":\"经营游戏\"},{\"id\":13,\"pic\":\"http://ctimg2018.myyx618.com/upload/images/c9/49/c949ce67d0ccf31a5dbe6cde1d6c213e.png\",\"title\":\"AVG恋爱\"},{\"id\":15,\"pic\":\"http://ctimg2018.myyx618.com/upload/images/db/0f/db0f26037fee0b193fa9d77094238d9a.png\",\"title\":\"生存游戏\"},{\"id\":16,\"pic\":\"http://ctimg2018.myyx618.com/upload/images/88/ff/88ff59f4c24e0d14aed861500a9b85e9.png\",\"title\":\"恐怖游戏\"},{\"id\":12,\"pic\":\"http://ctimg2018.myyx618.com/upload/images/eb/be/ebbe18e8be70b2ff811e32f5bdd8eee3.png\",\"title\":\"塔防游戏\"},{\"id\":41,\"pic\":\"http://ctimg2018.myyx618.com/upload/images/fb/5f/fb5f0f3569e9d40babd7d8c10da7195e.png\",\"title\":\"音乐节奏\"},{\"id\":21,\"pic\":\"http://ctimg2018.myyx618.com/upload/images/a4/4c/a44c5c9440c9433dd8c90065790a72ab.png\",\"title\":\"放置挂机\"}]},{\"id\":4,\"title\":\"题材\",\"type\":4,\"sub_game_type\":[{\"id\":248,\"pic\":\"\",\"title\":\"二次元\"},{\"id\":249,\"pic\":\"\",\"title\":\"拟人\"},{\"id\":250,\"pic\":\"\",\"title\":\"枪战\"},{\"id\":251,\"pic\":\"\",\"title\":\"山海经\"},{\"id\":252,\"pic\":\"\",\"title\":\"动漫IP\"},{\"id\":253,\"pic\":\"\",\"title\":\"冒险\"},{\"id\":254,\"pic\":\"\",\"title\":\"地牢迷宫\"},{\"id\":255,\"pic\":\"\",\"title\":\"魔幻\"},{\"id\":256,\"pic\":\"\",\"title\":\"科幻\"},{\"id\":257,\"pic\":\"\",\"title\":\"末日\"},{\"id\":258,\"pic\":\"\",\"title\":\"火影忍者\"},{\"id\":259,\"pic\":\"\",\"title\":\"日漫\"},{\"id\":260,\"pic\":\"\",\"title\":\"海战\"},{\"id\":261,\"pic\":\"\",\"title\":\"武侠\"},{\"id\":262,\"pic\":\"\",\"title\":\"童话\"},{\"id\":263,\"pic\":\"\",\"title\":\"史莱姆\"},{\"id\":264,\"pic\":\"\",\"title\":\"美食\"},{\"id\":265,\"pic\":\"\",\"title\":\"忍者\"},{\"id\":266,\"pic\":\"\",\"title\":\"火柴人\"},{\"id\":267,\"pic\":\"\",\"title\":\"枪娘\"},{\"id\":268,\"pic\":\"\",\"title\":\"魔物娘\"},{\"id\":269,\"pic\":\"\",\"title\":\"机甲\"},{\"id\":270,\"pic\":\"\",\"title\":\"恋爱\"},{\"id\":271,\"pic\":\"\",\"title\":\"三国\"},{\"id\":272,\"pic\":\"\",\"title\":\"战争\"},{\"id\":273,\"pic\":\"\",\"title\":\"狩猎\"},{\"id\":274,\"pic\":\"\",\"title\":\"修仙\"},{\"id\":275,\"pic\":\"\",\"title\":\"初音未来\"},{\"id\":276,\"pic\":\"\",\"title\":\"人生\"},{\"id\":277,\"pic\":\"\",\"title\":\"坦克\"},{\"id\":278,\"pic\":\"\",\"title\":\"二战\"},{\"id\":279,\"pic\":\"\",\"title\":\"战舰\"},{\"id\":280,\"pic\":\"\",\"title\":\"神话\"},{\"id\":281,\"pic\":\"\",\"title\":\"僵尸\"},{\"id\":282,\"pic\":\"\",\"title\":\"植物\"},{\"id\":283,\"pic\":\"\",\"title\":\"恐怖\"},{\"id\":284,\"pic\":\"\",\"title\":\"动物\"},{\"id\":285,\"pic\":\"\",\"title\":\"盗墓\"},{\"id\":286,\"pic\":\"\",\"title\":\"舰娘\"},{\"id\":287,\"pic\":\"\",\"title\":\"狼人杀\"},{\"id\":288,\"pic\":\"\",\"title\":\"2048\"},{\"id\":289,\"pic\":\"\",\"title\":\"仙侠\"},{\"id\":290,\"pic\":\"\",\"title\":\"西游\"},{\"id\":291,\"pic\":\"\",\"title\":\"农场\"},{\"id\":292,\"pic\":\"\",\"title\":\"电竞\"},{\"id\":293,\"pic\":\"\",\"title\":\"赛车\"},{\"id\":294,\"pic\":\"\",\"title\":\"开罗\"},{\"id\":295,\"pic\":\"\",\"title\":\"足球\"},{\"id\":296,\"pic\":\"\",\"title\":\"篮球\"},{\"id\":297,\"pic\":\"\",\"title\":\"妖怪\"},{\"id\":298,\"pic\":\"\",\"title\":\"太空\"},{\"id\":299,\"pic\":\"\",\"title\":\"SLG\"},{\"id\":300,\"pic\":\"\",\"title\":\"航海\"},{\"id\":301,\"pic\":\"\",\"title\":\"烹饪\"},{\"id\":302,\"pic\":\"\",\"title\":\"漫威\"},{\"id\":303,\"pic\":\"\",\"title\":\"超级英雄\"},{\"id\":304,\"pic\":\"\",\"title\":\"美漫\"},{\"id\":305,\"pic\":\"\",\"title\":\"暗黑\"},{\"id\":306,\"pic\":\"\",\"title\":\"国创\"},{\"id\":307,\"pic\":\"\",\"title\":\"偶像\"},{\"id\":308,\"pic\":\"\",\"title\":\"手机\"},{\"id\":309,\"pic\":\"\",\"title\":\"克苏鲁\"},{\"id\":310,\"pic\":\"\",\"title\":\"侦探\"},{\"id\":311,\"pic\":\"\",\"title\":\"高达\"},{\"id\":312,\"pic\":\"\",\"title\":\"乐高\"},{\"id\":313,\"pic\":\"\",\"title\":\"数独\"},{\"id\":314,\"pic\":\"\",\"title\":\"钢琴\"},{\"id\":315,\"pic\":\"\",\"title\":\"数学\"},{\"id\":316,\"pic\":\"\",\"title\":\"脱出\"},{\"id\":317,\"pic\":\"\",\"title\":\"大富翁\"},{\"id\":318,\"pic\":\"\",\"title\":\"口袋妖怪\"},{\"id\":319,\"pic\":\"\",\"title\":\"拳皇\"},{\"id\":320,\"pic\":\"\",\"title\":\"奥特曼\"},{\"id\":321,\"pic\":\"\",\"title\":\"死神\"},{\"id\":322,\"pic\":\"\",\"title\":\"侠盗猎车手\"},{\"id\":323,\"pic\":\"\",\"title\":\"死神vs火影\"},{\"id\":324,\"pic\":\"\",\"title\":\"三国战纪\"},{\"id\":325,\"pic\":\"\",\"title\":\"蜘蛛侠\"},{\"id\":326,\"pic\":\"\",\"title\":\"游戏王\"},{\"id\":327,\"pic\":\"\",\"title\":\"刺客信条\"},{\"id\":328,\"pic\":\"\",\"title\":\"坦克大战\"},{\"id\":329,\"pic\":\"\",\"title\":\"“热血”系列游戏\"},{\"id\":330,\"pic\":\"\",\"title\":\"捕鱼\"},{\"id\":331,\"pic\":\"\",\"title\":\"梦幻模拟战\"},{\"id\":332,\"pic\":\"\",\"title\":\"三国无双\"},{\"id\":333,\"pic\":\"\",\"title\":\"植物大战僵尸\"},{\"id\":334,\"pic\":\"\",\"title\":\"龙珠\"},{\"id\":335,\"pic\":\"\",\"title\":\"饥荒\"},{\"id\":336,\"pic\":\"\",\"title\":\"模拟山羊\"},{\"id\":337,\"pic\":\"\",\"title\":\"英雄联盟\"},{\"id\":338,\"pic\":\"\",\"title\":\"仙剑奇侠传\"},{\"id\":339,\"pic\":\"\",\"title\":\"传奇\"},{\"id\":340,\"pic\":\"\",\"title\":\"水浒传\"},{\"id\":341,\"pic\":\"\",\"title\":\"奇迹MU\"},{\"id\":342,\"pic\":\"\",\"title\":\"实况足球\"},{\"id\":343,\"pic\":\"\",\"title\":\"最终幻想\"},{\"id\":344,\"pic\":\"\",\"title\":\"数码宝贝\"},{\"id\":345,\"pic\":\"\",\"title\":\"恐龙\"},{\"id\":346,\"pic\":\"\",\"title\":\"战国\"},{\"id\":347,\"pic\":\"\",\"title\":\"校园\"}]},{\"id\":5,\"title\":\"玩法\",\"type\":5,\"sub_game_type\":[{\"id\":385,\"pic\":\"\",\"title\":\"MOBA\"},{\"id\":386,\"pic\":\"\",\"title\":\"自走棋\"},{\"id\":387,\"pic\":\"\",\"title\":\"塔防\"},{\"id\":388,\"pic\":\"\",\"title\":\"养成\"},{\"id\":389,\"pic\":\"\",\"title\":\"策略\"},{\"id\":390,\"pic\":\"\",\"title\":\"射击\"},{\"id\":391,\"pic\":\"\",\"title\":\"卡牌\"},{\"id\":392,\"pic\":\"\",\"title\":\"回合制RPG\"},{\"id\":393,\"pic\":\"\",\"title\":\"动作\"},{\"id\":394,\"pic\":\"\",\"title\":\"挂机放置\"},{\"id\":395,\"pic\":\"\",\"title\":\"动作RPG\"},{\"id\":396,\"pic\":\"\",\"title\":\"格斗\"},{\"id\":397,\"pic\":\"\",\"title\":\"吃鸡\"},{\"id\":398,\"pic\":\"\",\"title\":\"策略RPG\"},{\"id\":399,\"pic\":\"\",\"title\":\"MMORPG\"},{\"id\":400,\"pic\":\"\",\"title\":\"建造\"},{\"id\":401,\"pic\":\"\",\"title\":\"模拟\"},{\"id\":402,\"pic\":\"\",\"title\":\"消除\"},{\"id\":403,\"pic\":\"\",\"title\":\"战棋\"},{\"id\":404,\"pic\":\"\",\"title\":\"竞速\"},{\"id\":405,\"pic\":\"\",\"title\":\"跑酷\"},{\"id\":406,\"pic\":\"\",\"title\":\"经营\"},{\"id\":407,\"pic\":\"\",\"title\":\"即时战略\"},{\"id\":408,\"pic\":\"\",\"title\":\"文字冒险\"},{\"id\":409,\"pic\":\"\",\"title\":\"音乐节奏\"},{\"id\":410,\"pic\":\"\",\"title\":\"棋牌\"},{\"id\":411,\"pic\":\"\",\"title\":\"桌游\"},{\"id\":412,\"pic\":\"\",\"title\":\"io\"},{\"id\":413,\"pic\":\"\",\"title\":\"换装\"},{\"id\":414,\"pic\":\"\",\"title\":\"闯关\"},{\"id\":415,\"pic\":\"\",\"title\":\"互动小说\"},{\"id\":416,\"pic\":\"\",\"title\":\"解谜\"},{\"id\":417,\"pic\":\"\",\"title\":\"点击\"},{\"id\":418,\"pic\":\"\",\"title\":\"益智\"},{\"id\":419,\"pic\":\"\",\"title\":\"弹射\"},{\"id\":420,\"pic\":\"\",\"title\":\"体育\"},{\"id\":421,\"pic\":\"\",\"title\":\"互动电影\"},{\"id\":422,\"pic\":\"\",\"title\":\"随行游戏\"},{\"id\":423,\"pic\":\"\",\"title\":\"视觉小说\"},{\"id\":424,\"pic\":\"\",\"title\":\"MUD\"},{\"id\":425,\"pic\":\"\",\"title\":\"飞行\"},{\"id\":426,\"pic\":\"\",\"title\":\"驾驶\"},{\"id\":427,\"pic\":\"\",\"title\":\"生存\"}]},{\"id\":6,\"title\":\"特色\",\"type\":6,\"sub_game_type\":[{\"id\":428,\"pic\":\"\",\"title\":\"联机\"},{\"id\":429,\"pic\":\"\",\"title\":\"5v5\"},{\"id\":430,\"pic\":\"\",\"title\":\"多人\"},{\"id\":431,\"pic\":\"\",\"title\":\"推塔\"},{\"id\":432,\"pic\":\"\",\"title\":\"美女\"},{\"id\":433,\"pic\":\"\",\"title\":\"硬核\"},{\"id\":434,\"pic\":\"\",\"title\":\"收集要素\"},{\"id\":435,\"pic\":\"\",\"title\":\"国产\"},{\"id\":436,\"pic\":\"\",\"title\":\"FPS\"},{\"id\":437,\"pic\":\"\",\"title\":\"PVP\"},{\"id\":438,\"pic\":\"\",\"title\":\"竞技\"},{\"id\":439,\"pic\":\"\",\"title\":\"TPS\"},{\"id\":440,\"pic\":\"\",\"title\":\"3D\"},{\"id\":441,\"pic\":\"\",\"title\":\"合作\"},{\"id\":442,\"pic\":\"\",\"title\":\"TPP\"},{\"id\":443,\"pic\":\"\",\"title\":\"剧情\"},{\"id\":444,\"pic\":\"\",\"title\":\"对战\"},{\"id\":445,\"pic\":\"\",\"title\":\"Roguelike\"},{\"id\":446,\"pic\":\"\",\"title\":\"Steam移植\"},{\"id\":447,\"pic\":\"\",\"title\":\"独立游戏\"},{\"id\":450,\"pic\":\"\",\"title\":\"休闲\"},{\"id\":451,\"pic\":\"\",\"title\":\"高画质\"},{\"id\":452,\"pic\":\"\",\"title\":\"高难度\"},{\"id\":453,\"pic\":\"\",\"title\":\"横版\"},{\"id\":454,\"pic\":\"\",\"title\":\"和风\"},{\"id\":455,\"pic\":\"\",\"title\":\"Live2D\"},{\"id\":456,\"pic\":\"\",\"title\":\"卡通\"},{\"id\":457,\"pic\":\"\",\"title\":\"组队\"},{\"id\":458,\"pic\":\"\",\"title\":\"CCG\"},{\"id\":459,\"pic\":\"\",\"title\":\"1v1\"},{\"id\":460,\"pic\":\"\",\"title\":\"可爱\"},{\"id\":461,\"pic\":\"\",\"title\":\"局域网联机\"},{\"id\":462,\"pic\":\"\",\"title\":\"像素\"},{\"id\":463,\"pic\":\"\",\"title\":\"弹幕\"},{\"id\":464,\"pic\":\"\",\"title\":\"中国风\"},{\"id\":465,\"pic\":\"\",\"title\":\"高自由度\"},{\"id\":466,\"pic\":\"\",\"title\":\"古风\"},{\"id\":467,\"pic\":\"\",\"title\":\"可捏脸\"},{\"id\":468,\"pic\":\"\",\"title\":\"开放世界\"},{\"id\":469,\"pic\":\"\",\"title\":\"社交\"},{\"id\":470,\"pic\":\"\",\"title\":\"DIY\"},{\"id\":471,\"pic\":\"\",\"title\":\"经典\"},{\"id\":472,\"pic\":\"\",\"title\":\"多结局\"},{\"id\":473,\"pic\":\"\",\"title\":\"手绘风格\"},{\"id\":474,\"pic\":\"\",\"title\":\"装修\"},{\"id\":475,\"pic\":\"\",\"title\":\"设计\"},{\"id\":476,\"pic\":\"\",\"title\":\"女性向\"},{\"id\":477,\"pic\":\"\",\"title\":\"声控\"},{\"id\":478,\"pic\":\"\",\"title\":\"漂移\"},{\"id\":479,\"pic\":\"\",\"title\":\"水墨风\"},{\"id\":480,\"pic\":\"\",\"title\":\"2D\"},{\"id\":481,\"pic\":\"\",\"title\":\"打击感\"},{\"id\":482,\"pic\":\"\",\"title\":\"手速\"},{\"id\":483,\"pic\":\"\",\"title\":\"声优配音\"},{\"id\":484,\"pic\":\"\",\"title\":\"致郁\"},{\"id\":485,\"pic\":\"\",\"title\":\"DBG\"},{\"id\":486,\"pic\":\"\",\"title\":\"逃生\"},{\"id\":487,\"pic\":\"\",\"title\":\"移植\"},{\"id\":488,\"pic\":\"\",\"title\":\"搞笑\"},{\"id\":489,\"pic\":\"\",\"title\":\"合成\"},{\"id\":490,\"pic\":\"\",\"title\":\"动人音乐\"},{\"id\":491,\"pic\":\"\",\"title\":\"电音\"},{\"id\":492,\"pic\":\"\",\"title\":\"竖版\"},{\"id\":493,\"pic\":\"\",\"title\":\"童年\"},{\"id\":494,\"pic\":\"\",\"title\":\"Q版\"},{\"id\":495,\"pic\":\"\",\"title\":\"有毒\"},{\"id\":496,\"pic\":\"\",\"title\":\"乙女\"},{\"id\":497,\"pic\":\"\",\"title\":\"TCG\"},{\"id\":498,\"pic\":\"\",\"title\":\"悬疑\"},{\"id\":499,\"pic\":\"\",\"title\":\"治愈\"},{\"id\":500,\"pic\":\"\",\"title\":\"组装\"},{\"id\":501,\"pic\":\"\",\"title\":\"推理\"},{\"id\":502,\"pic\":\"\",\"title\":\"解压\"},{\"id\":503,\"pic\":\"\",\"title\":\"meta\"},{\"id\":504,\"pic\":\"\",\"title\":\"汉化\"},{\"id\":505,\"pic\":\"\",\"title\":\"欧美画风\"},{\"id\":506,\"pic\":\"\",\"title\":\"3v3\"},{\"id\":507,\"pic\":\"\",\"title\":\"魔性\"},{\"id\":508,\"pic\":\"\",\"title\":\"平台跳跃\"},{\"id\":509,\"pic\":\"\",\"title\":\"自制关卡\"},{\"id\":510,\"pic\":\"\",\"title\":\"轻改\"},{\"id\":511,\"pic\":\"\",\"title\":\"简约画风\"},{\"id\":512,\"pic\":\"\",\"title\":\"街机风格\"},{\"id\":513,\"pic\":\"\",\"title\":\"AR\"},{\"id\":514,\"pic\":\"\",\"title\":\"户外\"},{\"id\":515,\"pic\":\"\",\"title\":\"日系风格\"},{\"id\":516,\"pic\":\"\",\"title\":\"VR\"},{\"id\":517,\"pic\":\"\",\"title\":\"佛系\"},{\"id\":518,\"pic\":\"\",\"title\":\"低模\"},{\"id\":519,\"pic\":\"\",\"title\":\"小清新\"},{\"id\":520,\"pic\":\"\",\"title\":\"俯视视角\"},{\"id\":521,\"pic\":\"\",\"title\":\"PC移植\"},{\"id\":522,\"pic\":\"\",\"title\":\"买断制\"},{\"id\":523,\"pic\":\"\",\"title\":\"进化\"},{\"id\":524,\"pic\":\"\",\"title\":\"剪纸风\"},{\"id\":525,\"pic\":\"\",\"title\":\"剪影风\"},{\"id\":526,\"pic\":\"\",\"title\":\"催泪\"},{\"id\":527,\"pic\":\"\",\"title\":\"下落式\"},{\"id\":528,\"pic\":\"\",\"title\":\"手残\"},{\"id\":529,\"pic\":\"\",\"title\":\"反应力\"}]}]";
        }
        Object readValue = new ObjectMapper().readValue(d5, JsonMapper.getInstance().createCollectionType(List.class, GameTypeData.class));
        Intrinsics.checkNotNullExpressionValue(readValue, "ObjectMapper().readValue…ameTypeData::class.java))");
        setGameTypeList((List) readValue);
        List<GameTypeData> gameTypeList = getGameTypeList();
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : gameTypeList) {
            if (((GameTypeData) obj3).getType() == 0) {
                arrayList.add(obj3);
            }
        }
        if (!arrayList.isEmpty()) {
            getGameTypeList().remove(arrayList.get(0));
        }
        List<GameTypeData> gameTypeList2 = getGameTypeList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj4 : gameTypeList2) {
            if (((GameTypeData) obj4).getType() == 2) {
                arrayList2.add(obj4);
            }
        }
        if (!arrayList2.isEmpty()) {
            getGameTypeList().remove(arrayList2.get(0));
            List<GameSubTypeData> sub_game_type = ((GameTypeData) arrayList2.get(0)).getSub_game_type();
            Intrinsics.checkNotNull(sub_game_type);
            reversed = CollectionsKt___CollectionsKt.reversed(sub_game_type);
            for (GameSubTypeData gameSubTypeData : reversed) {
                List<GameTypeData> gameTypeList3 = getGameTypeList();
                ArrayList arrayList3 = new ArrayList();
                for (Object obj5 : gameTypeList3) {
                    if (((GameTypeData) obj5).getType() == 1) {
                        arrayList3.add(obj5);
                    }
                }
                mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList3);
                List<GameSubTypeData> sub_game_type2 = ((GameTypeData) mutableList.get(0)).getSub_game_type();
                Intrinsics.checkNotNull(sub_game_type2);
                sub_game_type2.add(0, gameSubTypeData);
            }
        }
        d0.a().d(this);
        initView();
        getBasDownloadPresenter().initData(getAdapter());
        updateRequestArgs();
        return getBinding().getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        d0.a().e(this);
    }

    @Override // com.psk.kotlin.base.presenter.view.BaseView
    public void onError(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        List<CommonListMainData> showDatalist = getShowDatalist();
        if ((showDatalist == null || showDatalist.isEmpty()) || getShowDatalist().size() <= 0) {
            getBinding().f17682d.f23562d.setVisibility(8);
            getBinding().f17683e.f25502c.setVisibility(8);
            getBinding().f17681c.f19364e.setVisibility(0);
            getBinding().f17684f.setVisibility(8);
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull n downloadTaskEvent) {
        Intrinsics.checkNotNullParameter(downloadTaskEvent, "downloadTaskEvent");
        getBasDownloadPresenter().onEventMainThread(downloadTaskEvent);
    }

    @Override // com.join.kotlin.presenter.view.CategoryView
    public void onLoadDataSuccess(int i4, @NotNull CategoryListMain result) {
        Intrinsics.checkNotNullParameter(result, "result");
        if (i4 != this.page) {
            return;
        }
        if (i4 == 1) {
            this.page = 1;
            getBinding().f17683e.f25502c.setVisibility(8);
            getBinding().f17684f.setVisibility(0);
            if (getShowDatalist().size() > 0) {
                getBinding().f17684f.scrollToPosition(0);
            }
            getShowDatalist().clear();
        }
        if (result.getGame_list() != null && result.getGame_list().size() > 0) {
            this.page++;
            for (CollectionBeanSub collectionBeanSub : result.getGame_list()) {
                CollectionBeanSubBusiness collectionBeanSubBusiness = new CollectionBeanSubBusiness(collectionBeanSub);
                int i5 = this.from;
                if (i5 == 0) {
                    i5 = 118;
                }
                collectionBeanSubBusiness.set_from_type(i5);
                int i6 = this.from;
                if (i6 == 0) {
                    i6 = 108;
                }
                collectionBeanSubBusiness.set_from(i6);
                getBasDownloadPresenter().updateDowState(collectionBeanSubBusiness);
                getShowDatalist().add(new CommonListMainData(2, collectionBeanSubBusiness, null, null, 12, null));
            }
            getBinding().f17684f.loadMoreComplete();
        } else if (this.page == 1) {
            getBinding().f17683e.f25502c.setVisibility(0);
            getBinding().f17684f.setVisibility(8);
        } else {
            getBinding().f17684f.setNoMore();
        }
        getAdapter().notifyDataSetChanged();
        if (i4 == 1) {
            expDiscountGame();
        }
    }

    public final void setAdapter(@NotNull EverdayNewFragment.EverdayNewAdapter everdayNewAdapter) {
        Intrinsics.checkNotNullParameter(everdayNewAdapter, "<set-?>");
        this.adapter = everdayNewAdapter;
    }

    public final void setBasDownloadPresenter(@NotNull BasDownLoadActivityPresenter basDownLoadActivityPresenter) {
        Intrinsics.checkNotNullParameter(basDownLoadActivityPresenter, "<set-?>");
        this.basDownloadPresenter = basDownLoadActivityPresenter;
    }

    public final void setBinding(@NotNull CategroyDetialItemFragmentBinding categroyDetialItemFragmentBinding) {
        Intrinsics.checkNotNullParameter(categroyDetialItemFragmentBinding, "<set-?>");
        this.binding = categroyDetialItemFragmentBinding;
    }

    public final void setCategoryPrensenter(@NotNull CategoryPrensenter categoryPrensenter) {
        Intrinsics.checkNotNullParameter(categoryPrensenter, "<set-?>");
        this.categoryPrensenter = categoryPrensenter;
    }

    public final void setFeatureType(@NotNull GameSubTypeData gameSubTypeData) {
        Intrinsics.checkNotNullParameter(gameSubTypeData, "<set-?>");
        this.featureType = gameSubTypeData;
    }

    public final void setFrom(int i4) {
        this.from = i4;
    }

    public final void setGameSortType(@NotNull TagData tagData) {
        Intrinsics.checkNotNullParameter(tagData, "<set-?>");
        this.gameSortType = tagData;
    }

    public final void setGameType(@NotNull GameSubTypeData gameSubTypeData) {
        Intrinsics.checkNotNullParameter(gameSubTypeData, "<set-?>");
        this.gameType = gameSubTypeData;
    }

    public final void setGameTypeList(@NotNull List<GameTypeData> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.gameTypeList = list;
    }

    public final void setHandler(@NotNull Handler handler) {
        Intrinsics.checkNotNullParameter(handler, "<set-?>");
        this.handler = handler;
    }

    public final void setModelType(@NotNull GameSubTypeData gameSubTypeData) {
        Intrinsics.checkNotNullParameter(gameSubTypeData, "<set-?>");
        this.modelType = gameSubTypeData;
    }

    public final void setPage(int i4) {
        this.page = i4;
    }

    public final void setPlayType(@NotNull GameSubTypeData gameSubTypeData) {
        Intrinsics.checkNotNullParameter(gameSubTypeData, "<set-?>");
        this.playType = gameSubTypeData;
    }

    public final void setRequestArgs(@NotNull CategoryRequest categoryRequest) {
        Intrinsics.checkNotNullParameter(categoryRequest, "<set-?>");
        this.requestArgs = categoryRequest;
    }

    public final void setShowDatalist(@NotNull List<CommonListMainData> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.showDatalist = list;
    }

    public final void setThemeType(@NotNull GameSubTypeData gameSubTypeData) {
        Intrinsics.checkNotNullParameter(gameSubTypeData, "<set-?>");
        this.themeType = gameSubTypeData;
    }

    @Override // com.psk.kotlin.base.presenter.view.BaseView
    public void showLoding() {
        getBinding().f17682d.f23562d.setVisibility(0);
        getBinding().f17683e.f25502c.setVisibility(8);
        getBinding().f17681c.f19364e.setVisibility(8);
        getBinding().f17684f.setVisibility(8);
    }

    public final void updateDatas(@NotNull GameSubTypeData featureTypez, @NotNull GameSubTypeData gameTypez, @NotNull GameSubTypeData modelTypez, @NotNull GameSubTypeData playTypez, @NotNull GameSubTypeData themeTypez) {
        Intrinsics.checkNotNullParameter(featureTypez, "featureTypez");
        Intrinsics.checkNotNullParameter(gameTypez, "gameTypez");
        Intrinsics.checkNotNullParameter(modelTypez, "modelTypez");
        Intrinsics.checkNotNullParameter(playTypez, "playTypez");
        Intrinsics.checkNotNullParameter(themeTypez, "themeTypez");
        this.featureType = featureTypez;
        this.gameType = gameTypez;
        this.modelType = modelTypez;
        this.playType = playTypez;
        this.themeType = themeTypez;
        updateRequestArgs();
        lazyLoad();
    }
}
