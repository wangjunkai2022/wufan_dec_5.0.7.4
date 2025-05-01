package com.join.kotlin.ui.findgame;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.BaseAppCompatActivity;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.join.android.app.common.utils.JsonMapper;
import com.join.android.app.mgsim.wufun.R;
import com.join.android.app.mgsim.wufun.databinding.CategroyGamelistActivityBinding;
import com.join.kotlin.ui.findgame.CategoryDetailItemFragment;
import com.join.kotlin.ui.findgame.FindGameClassfyFragment;
import com.join.kotlin.ui.findgame.adapter.FindTypeListAdapter;
import com.join.kotlin.ui.findgame.data.CategoryRequest;
import com.join.kotlin.ui.findgame.data.CategroyIntentItemData;
import com.join.kotlin.ui.findgame.data.GameSubTypeData;
import com.join.kotlin.ui.findgame.data.GameTypeData;
import com.join.kotlin.ui.findgame.data.TagData;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.customview.NavigationAdapter;
import com.join.mgps.pref.PrefDef_;
import com.psk.kotlin.ext.CommonExtKt;
import com.psk.kotlin.util.CommonListMainData;
import com.psk.kotlin.util.GridSpacingItemDecoration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: CategoryDetailListActivity.kt */
@SourceDebugExtension({"SMAP\nCategoryDetailListActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CategoryDetailListActivity.kt\ncom/join/kotlin/ui/findgame/CategoryDetailListActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,454:1\n766#2:455\n857#2,2:456\n766#2:458\n857#2,2:459\n1855#2:461\n766#2:462\n857#2,2:463\n1856#2:465\n1549#2:467\n1620#2,3:468\n766#2:471\n857#2,2:472\n1360#2:474\n1446#2,5:475\n1855#2,2:480\n766#2:482\n857#2,2:483\n1360#2:485\n1446#2,5:486\n1855#2,2:491\n766#2:493\n857#2,2:494\n1360#2:496\n1446#2,5:497\n1855#2,2:502\n1549#2:504\n1620#2,2:505\n766#2:507\n857#2,2:508\n1622#2:510\n1360#2:511\n1446#2,2:512\n1549#2:514\n1620#2,3:515\n1448#2,3:518\n1855#2,2:521\n1855#2,2:523\n1#3:466\n*S KotlinDebug\n*F\n+ 1 CategoryDetailListActivity.kt\ncom/join/kotlin/ui/findgame/CategoryDetailListActivity\n*L\n76#1:455\n76#1:456,2\n80#1:458\n80#1:459,2\n83#1:461\n84#1:462\n84#1:463,2\n83#1:465\n181#1:467\n181#1:468,3\n248#1:471\n248#1:472,2\n248#1:474\n248#1:475,5\n249#1:480,2\n263#1:482\n263#1:483,2\n263#1:485\n263#1:486,5\n264#1:491,2\n278#1:493\n278#1:494,2\n278#1:496\n278#1:497,5\n279#1:502,2\n352#1:504\n352#1:505,2\n353#1:507\n353#1:508,2\n352#1:510\n354#1:511\n354#1:512,2\n355#1:514\n355#1:515,3\n354#1:518,3\n360#1:521,2\n443#1:523,2\n*E\n"})
/* loaded from: classes3.dex */
public final class CategoryDetailListActivity extends BaseAppCompatActivity implements View.OnClickListener {
    public CategroyGamelistActivityBinding binding;
    public Context context;
    public FindTypeListAdapter findTypeAdapter;
    public List<GameTypeData> gameTypeList;
    public FindGameClassfyFragment.TabRecycleAdapter leftTypeAdapter;
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
    private GameTypeData tabType = new GameTypeData();
    @NotNull
    private ArrayList<Fragment> fragments = new ArrayList<>();
    @NotNull
    private List<CommonListMainData> datas = new ArrayList();

    private final void initView() {
        Object obj;
        List<TagData> listOf;
        int collectionSizeOrDefault;
        boolean z4;
        Object obj2;
        Object obj3;
        List<GameSubTypeData> sub_game_type;
        Object obj4;
        boolean z5;
        boolean z6;
        List<GameSubTypeData> sub_game_type2;
        Object obj5;
        boolean z7;
        boolean z8;
        Object obj6;
        List<GameSubTypeData> sub_game_type3;
        Object obj7;
        boolean z9;
        boolean z10;
        Object obj8;
        List<GameSubTypeData> sub_game_type4;
        Object obj9;
        boolean z11;
        boolean z12;
        Object obj10;
        List<GameSubTypeData> sub_game_type5;
        Object obj11;
        boolean z13;
        boolean z14;
        Object obj12;
        List<GameSubTypeData> sub_game_type6;
        Object obj13;
        boolean z15;
        boolean z16;
        this.tabType.setSelected(true);
        this.tabType.setId(1);
        this.tabType.setType(1);
        LinearLayout linearLayout = getBinding().f17699p;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.typeMainLayout");
        CommonExtKt.onClick(linearLayout, new Function0<Unit>() { // from class: com.join.kotlin.ui.findgame.CategoryDetailListActivity$initView$1
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }
        });
        switch (getIntent().getIntExtra("typeId", 0)) {
            case 1:
            case 2:
                this.tabType.setId(1);
                this.tabType.setType(1);
                this.requestArgs.setModelType(getIntent().getIntExtra("tagId", 0));
                Iterator<T> it2 = getGameTypeList().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj2 = it2.next();
                        if (((GameTypeData) obj2).getType() == 1) {
                            z8 = true;
                            continue;
                        } else {
                            z8 = false;
                            continue;
                        }
                        if (z8) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                GameTypeData gameTypeData = (GameTypeData) obj2;
                if (gameTypeData != null && (sub_game_type2 = gameTypeData.getSub_game_type()) != null) {
                    Iterator<T> it3 = sub_game_type2.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            obj5 = it3.next();
                            if (((GameSubTypeData) obj5).getId() == this.requestArgs.getModelType()) {
                                z7 = true;
                                continue;
                            } else {
                                z7 = false;
                                continue;
                            }
                            if (z7) {
                            }
                        } else {
                            obj5 = null;
                        }
                    }
                    GameSubTypeData gameSubTypeData = (GameSubTypeData) obj5;
                    if (gameSubTypeData != null) {
                        gameSubTypeData.setSelected(true);
                        this.modelType = gameSubTypeData;
                    }
                }
                int intExtra = getIntent().getIntExtra("tagId2", 0);
                if (intExtra > 0) {
                    this.tabType.setId(3);
                    this.tabType.setType(3);
                    this.requestArgs.setGameType(intExtra);
                    Iterator<T> it4 = getGameTypeList().iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            obj3 = it4.next();
                            if (((GameTypeData) obj3).getType() == 3) {
                                z6 = true;
                                continue;
                            } else {
                                z6 = false;
                                continue;
                            }
                            if (z6) {
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                    GameTypeData gameTypeData2 = (GameTypeData) obj3;
                    if (gameTypeData2 != null && (sub_game_type = gameTypeData2.getSub_game_type()) != null) {
                        Iterator<T> it5 = sub_game_type.iterator();
                        while (true) {
                            if (it5.hasNext()) {
                                obj4 = it5.next();
                                if (((GameSubTypeData) obj4).getId() == this.requestArgs.getGameType()) {
                                    z5 = true;
                                    continue;
                                } else {
                                    z5 = false;
                                    continue;
                                }
                                if (z5) {
                                }
                            } else {
                                obj4 = null;
                            }
                        }
                        GameSubTypeData gameSubTypeData2 = (GameSubTypeData) obj4;
                        if (gameSubTypeData2 != null) {
                            gameSubTypeData2.setSelected(true);
                            this.gameType = gameSubTypeData2;
                            break;
                        }
                    }
                }
                break;
            case 3:
                this.tabType.setId(3);
                this.tabType.setType(3);
                this.requestArgs.setGameType(getIntent().getIntExtra("tagId", 0));
                Iterator<T> it6 = getGameTypeList().iterator();
                while (true) {
                    if (it6.hasNext()) {
                        obj6 = it6.next();
                        if (((GameTypeData) obj6).getType() == 3) {
                            z10 = true;
                            continue;
                        } else {
                            z10 = false;
                            continue;
                        }
                        if (z10) {
                        }
                    } else {
                        obj6 = null;
                    }
                }
                GameTypeData gameTypeData3 = (GameTypeData) obj6;
                if (gameTypeData3 != null && (sub_game_type3 = gameTypeData3.getSub_game_type()) != null) {
                    Iterator<T> it7 = sub_game_type3.iterator();
                    while (true) {
                        if (it7.hasNext()) {
                            obj7 = it7.next();
                            if (((GameSubTypeData) obj7).getId() == this.requestArgs.getGameType()) {
                                z9 = true;
                                continue;
                            } else {
                                z9 = false;
                                continue;
                            }
                            if (z9) {
                            }
                        } else {
                            obj7 = null;
                        }
                    }
                    GameSubTypeData gameSubTypeData3 = (GameSubTypeData) obj7;
                    if (gameSubTypeData3 != null) {
                        gameSubTypeData3.setSelected(true);
                        this.gameType = gameSubTypeData3;
                        break;
                    }
                }
                break;
            case 4:
                this.tabType.setId(4);
                this.tabType.setType(4);
                this.requestArgs.setThemeType(getIntent().getIntExtra("tagId", 0));
                Iterator<T> it8 = getGameTypeList().iterator();
                while (true) {
                    if (it8.hasNext()) {
                        obj8 = it8.next();
                        if (((GameTypeData) obj8).getType() == 4) {
                            z12 = true;
                            continue;
                        } else {
                            z12 = false;
                            continue;
                        }
                        if (z12) {
                        }
                    } else {
                        obj8 = null;
                    }
                }
                GameTypeData gameTypeData4 = (GameTypeData) obj8;
                if (gameTypeData4 != null && (sub_game_type4 = gameTypeData4.getSub_game_type()) != null) {
                    Iterator<T> it9 = sub_game_type4.iterator();
                    while (true) {
                        if (it9.hasNext()) {
                            obj9 = it9.next();
                            if (((GameSubTypeData) obj9).getId() == this.requestArgs.getThemeType()) {
                                z11 = true;
                                continue;
                            } else {
                                z11 = false;
                                continue;
                            }
                            if (z11) {
                            }
                        } else {
                            obj9 = null;
                        }
                    }
                    GameSubTypeData gameSubTypeData4 = (GameSubTypeData) obj9;
                    if (gameSubTypeData4 != null) {
                        gameSubTypeData4.setSelected(true);
                        this.themeType = gameSubTypeData4;
                        break;
                    }
                }
                break;
            case 5:
                this.tabType.setId(5);
                this.tabType.setType(5);
                this.requestArgs.setPlayType(getIntent().getIntExtra("tagId", 0));
                Iterator<T> it10 = getGameTypeList().iterator();
                while (true) {
                    if (it10.hasNext()) {
                        obj10 = it10.next();
                        if (((GameTypeData) obj10).getType() == 5) {
                            z14 = true;
                            continue;
                        } else {
                            z14 = false;
                            continue;
                        }
                        if (z14) {
                        }
                    } else {
                        obj10 = null;
                    }
                }
                GameTypeData gameTypeData5 = (GameTypeData) obj10;
                if (gameTypeData5 != null && (sub_game_type5 = gameTypeData5.getSub_game_type()) != null) {
                    Iterator<T> it11 = sub_game_type5.iterator();
                    while (true) {
                        if (it11.hasNext()) {
                            obj11 = it11.next();
                            if (((GameSubTypeData) obj11).getId() == this.requestArgs.getPlayType()) {
                                z13 = true;
                                continue;
                            } else {
                                z13 = false;
                                continue;
                            }
                            if (z13) {
                            }
                        } else {
                            obj11 = null;
                        }
                    }
                    GameSubTypeData gameSubTypeData5 = (GameSubTypeData) obj11;
                    if (gameSubTypeData5 != null) {
                        gameSubTypeData5.setSelected(true);
                        this.playType = gameSubTypeData5;
                        break;
                    }
                }
                break;
            case 6:
                this.tabType.setId(6);
                this.tabType.setType(6);
                this.requestArgs.setFeatureType(getIntent().getIntExtra("tagId", 0));
                Iterator<T> it12 = getGameTypeList().iterator();
                while (true) {
                    if (it12.hasNext()) {
                        obj12 = it12.next();
                        if (((GameTypeData) obj12).getType() == 6) {
                            z16 = true;
                            continue;
                        } else {
                            z16 = false;
                            continue;
                        }
                        if (z16) {
                        }
                    } else {
                        obj12 = null;
                    }
                }
                GameTypeData gameTypeData6 = (GameTypeData) obj12;
                if (gameTypeData6 != null && (sub_game_type6 = gameTypeData6.getSub_game_type()) != null) {
                    Iterator<T> it13 = sub_game_type6.iterator();
                    while (true) {
                        if (it13.hasNext()) {
                            obj13 = it13.next();
                            if (((GameSubTypeData) obj13).getId() == this.requestArgs.getFeatureType()) {
                                z15 = true;
                                continue;
                            } else {
                                z15 = false;
                                continue;
                            }
                            if (z15) {
                            }
                        } else {
                            obj13 = null;
                        }
                    }
                    GameSubTypeData gameSubTypeData6 = (GameSubTypeData) obj13;
                    if (gameSubTypeData6 != null) {
                        gameSubTypeData6.setSelected(true);
                        this.featureType = gameSubTypeData6;
                        break;
                    }
                }
                break;
        }
        updateSelectedTagList();
        Iterator<T> it14 = getGameTypeList().iterator();
        while (true) {
            if (it14.hasNext()) {
                Object next = it14.next();
                if (((GameTypeData) next).getId() == this.tabType.getId()) {
                    z4 = true;
                    continue;
                } else {
                    z4 = false;
                    continue;
                }
                obj = z4 ? next : null;
            }
        }
        GameTypeData gameTypeData7 = (GameTypeData) obj;
        if (gameTypeData7 != null) {
            gameTypeData7.setSelected(true);
        }
        ImageView imageView = getBinding().f17698o.f26783c;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.titleLayout.backImage");
        CommonExtKt.onClick(imageView, new Function0<Unit>() { // from class: com.join.kotlin.ui.findgame.CategoryDetailListActivity$initView$21
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
                CategoryDetailListActivity.this.finish();
            }
        });
        getBinding().f17698o.f26785e.setText(getIntent().getStringExtra("tagName"));
        this.requestArgs.setUid(AccountUtil_.getInstance_(getContext()).getAccountData().getUid());
        TextView textView = getBinding().f17688e;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.filter");
        CommonExtKt.onClick(textView, new Function0<Unit>() { // from class: com.join.kotlin.ui.findgame.CategoryDetailListActivity$initView$22
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
                CategoryDetailListActivity.this.showFilterLayout();
            }
        });
        getBinding().f17696m.setLayoutManager(new LinearLayoutManager(getContext()));
        getBinding().f17700q.setLayoutManager(new LinearLayoutManager(getContext()));
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new TagData[]{new TagData(1, "综合"), new TagData(2, "最新"), new TagData(3, "评分")});
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(listOf, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (TagData tagData : listOf) {
            arrayList.add(tagData.getTitle());
        }
        CategroyIntentItemData categroyIntentItemData = new CategroyIntentItemData(this.gameType, this.modelType, this.playType, this.themeType, this.featureType);
        int intExtra2 = getIntent().getIntExtra("from", 0);
        ArrayList<Fragment> arrayList2 = this.fragments;
        CategoryDetailItemFragment.Companion companion = CategoryDetailItemFragment.Companion;
        arrayList2.add(companion.newInstance(1, categroyIntentItemData, intExtra2));
        this.fragments.add(companion.newInstance(2, categroyIntentItemData, intExtra2));
        this.fragments.add(companion.newInstance(3, categroyIntentItemData, intExtra2));
        getBinding().f17701r.setAdapter(new NavigationAdapter(getSupportFragmentManager(), this.fragments, arrayList));
        getBinding().f17701r.setOffscreenPageLimit(3);
        getBinding().f17686c.setViewPager(getBinding().f17701r);
        Intrinsics.checkNotNull(this);
        setFindTypeAdapter(new FindTypeListAdapter(this, this.tabType.getId(), this.datas, new FindTypeListAdapter.OnItenSelected() { // from class: com.join.kotlin.ui.findgame.CategoryDetailListActivity$initView$23
            @Override // com.join.kotlin.ui.findgame.adapter.FindTypeListAdapter.OnItenSelected
            public void onItemselected(@NotNull GameSubTypeData type) {
                Intrinsics.checkNotNullParameter(type, "type");
                CategoryDetailListActivity categoryDetailListActivity = CategoryDetailListActivity.this;
                categoryDetailListActivity.onfindTypeSelected(categoryDetailListActivity.getDatas(), type);
            }
        }));
        getBinding().f17700q.setAdapter(getFindTypeAdapter());
        setLeftTypeAdapter(new FindGameClassfyFragment.TabRecycleAdapter(this, new FindGameClassfyFragment.OnSelectedTabListener() { // from class: com.join.kotlin.ui.findgame.CategoryDetailListActivity$initView$24
            @Override // com.join.kotlin.ui.findgame.FindGameClassfyFragment.OnSelectedTabListener
            public void onSelected(int i4) {
                CategoryDetailListActivity.this.getTabType().setId(i4);
                CategoryDetailListActivity.this.showTypeList(i4);
            }
        }, getGameTypeList()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onfindTypeSelected(List<CommonListMainData> list, GameSubTypeData gameSubTypeData) {
        for (CommonListMainData commonListMainData : list) {
            Object any = commonListMainData.getAny();
            Intrinsics.checkNotNull(any, "null cannot be cast to non-null type com.join.kotlin.ui.findgame.data.GameSubTypeData");
            GameSubTypeData gameSubTypeData2 = (GameSubTypeData) any;
            if (gameSubTypeData2.getId() != gameSubTypeData.getId()) {
                gameSubTypeData2.setSelected(gameSubTypeData2.getId() == gameSubTypeData.getId());
            } else {
                gameSubTypeData2.setSelected(!gameSubTypeData2.isSelected());
            }
        }
        getFindTypeAdapter().notifyDataSetChanged();
        switch (this.tabType.getId()) {
            case 1:
            case 2:
                if (!gameSubTypeData.isSelected()) {
                    gameSubTypeData = new GameSubTypeData();
                }
                this.modelType = gameSubTypeData;
                break;
            case 3:
                if (!gameSubTypeData.isSelected()) {
                    gameSubTypeData = new GameSubTypeData();
                }
                this.gameType = gameSubTypeData;
                break;
            case 4:
                if (!gameSubTypeData.isSelected()) {
                    gameSubTypeData = new GameSubTypeData();
                }
                this.themeType = gameSubTypeData;
                break;
            case 5:
                if (!gameSubTypeData.isSelected()) {
                    gameSubTypeData = new GameSubTypeData();
                }
                this.playType = gameSubTypeData;
                break;
            case 6:
                if (!gameSubTypeData.isSelected()) {
                    gameSubTypeData = new GameSubTypeData();
                }
                this.featureType = gameSubTypeData;
                break;
        }
        updateSelectedTagList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showFilterLayout() {
        if (getBinding().f17699p.getVisibility() == 0) {
            getBinding().f17699p.setVisibility(8);
            return;
        }
        getBinding().f17699p.setVisibility(0);
        getBinding().f17696m.setAdapter(getLeftTypeAdapter());
        showTypeList(this.tabType.getId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showTypeList(int i4) {
        this.datas.clear();
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.wdp16);
        switch (i4) {
            case 1:
                getBinding().f17700q.setLayoutManager(new GridLayoutManager(getContext(), 2));
                while (getBinding().f17700q.getItemDecorationCount() > 0) {
                    getBinding().f17700q.removeItemDecorationAt(0);
                }
                getBinding().f17700q.addItemDecoration(new GridSpacingItemDecoration(2, dimensionPixelOffset, false));
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
                getBinding().f17700q.setLayoutManager(new GridLayoutManager(getContext(), 1));
                while (getBinding().f17700q.getItemDecorationCount() > 0) {
                    getBinding().f17700q.removeItemDecorationAt(0);
                }
                getBinding().f17700q.addItemDecoration(new GridSpacingItemDecoration(1, dimensionPixelOffset, false));
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
                getBinding().f17700q.setLayoutManager(new GridLayoutManager(getContext(), 3));
                while (getBinding().f17700q.getItemDecorationCount() > 0) {
                    getBinding().f17700q.removeItemDecorationAt(0);
                }
                getBinding().f17700q.addItemDecoration(new GridSpacingItemDecoration(3, dimensionPixelOffset, false));
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

    private final void updateSelectedTagList() {
        TextView textView = getBinding().f17691h;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.modelTypeText");
        updateSelectedTagitem(textView, this.modelType);
        TextView textView2 = getBinding().f17689f;
        Intrinsics.checkNotNullExpressionValue(textView2, "binding.gameTypeText");
        updateSelectedTagitem(textView2, this.gameType);
        TextView textView3 = getBinding().f17697n;
        Intrinsics.checkNotNullExpressionValue(textView3, "binding.themeTypeText");
        updateSelectedTagitem(textView3, this.themeType);
        TextView textView4 = getBinding().f17694k;
        Intrinsics.checkNotNullExpressionValue(textView4, "binding.playTypeText");
        updateSelectedTagitem(textView4, this.playType);
        TextView textView5 = getBinding().f17687d;
        Intrinsics.checkNotNullExpressionValue(textView5, "binding.featureTypeText");
        updateSelectedTagitem(textView5, this.featureType);
    }

    private final void updateSelectedTagitem(TextView textView, GameSubTypeData gameSubTypeData) {
        textView.setText(gameSubTypeData.getTitle());
        if (gameSubTypeData.isSelected()) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
    }

    private final void updateTitle() {
        int collectionSizeOrDefault;
        int collectionSizeOrDefault2;
        StringBuffer stringBuffer = new StringBuffer();
        List<GameTypeData> gameTypeList = getGameTypeList();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(gameTypeList, 10);
        ArrayList<List> arrayList = new ArrayList(collectionSizeOrDefault);
        for (GameTypeData gameTypeData : gameTypeList) {
            List<GameSubTypeData> sub_game_type = gameTypeData.getSub_game_type();
            Intrinsics.checkNotNull(sub_game_type);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : sub_game_type) {
                if (((GameSubTypeData) obj).isSelected()) {
                    arrayList2.add(obj);
                }
            }
            arrayList.add(arrayList2);
        }
        ArrayList<String> arrayList3 = new ArrayList();
        for (List<GameSubTypeData> list : arrayList) {
            collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList4 = new ArrayList(collectionSizeOrDefault2);
            for (GameSubTypeData gameSubTypeData : list) {
                arrayList4.add(gameSubTypeData.getTitle());
            }
            CollectionsKt__MutableCollectionsKt.addAll(arrayList3, arrayList4);
        }
        if (!arrayList3.isEmpty()) {
            for (String str : arrayList3) {
                if (stringBuffer.length() < 16) {
                    stringBuffer.append(str);
                    stringBuffer.append("·");
                }
            }
            getBinding().f17698o.f26785e.setText(stringBuffer.substring(0, stringBuffer.length() - 1).toString());
            return;
        }
        getBinding().f17698o.f26785e.setText("全部游戏");
    }

    @NotNull
    public final CategroyGamelistActivityBinding getBinding() {
        CategroyGamelistActivityBinding categroyGamelistActivityBinding = this.binding;
        if (categroyGamelistActivityBinding != null) {
            return categroyGamelistActivityBinding;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    @NotNull
    public final Context getContext() {
        Context context = this.context;
        if (context != null) {
            return context;
        }
        Intrinsics.throwUninitializedPropertyAccessException("context");
        return null;
    }

    @NotNull
    public final List<CommonListMainData> getDatas() {
        return this.datas;
    }

    @NotNull
    public final GameSubTypeData getFeatureType() {
        return this.featureType;
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
    public final ArrayList<Fragment> getFragments() {
        return this.fragments;
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
    public final FindGameClassfyFragment.TabRecycleAdapter getLeftTypeAdapter() {
        FindGameClassfyFragment.TabRecycleAdapter tabRecycleAdapter = this.leftTypeAdapter;
        if (tabRecycleAdapter != null) {
            return tabRecycleAdapter;
        }
        Intrinsics.throwUninitializedPropertyAccessException("leftTypeAdapter");
        return null;
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
    public final GameTypeData getTabType() {
        return this.tabType;
    }

    @NotNull
    public final GameSubTypeData getThemeType() {
        return this.themeType;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@Nullable View view) {
        Intrinsics.checkNotNull(view);
        switch (view.getId()) {
            case R.id.featureTypeText /* 2131297633 */:
                this.featureType.setSelected(false);
                this.featureType = new GameSubTypeData();
                getBinding().f17687d.setVisibility(8);
                break;
            case R.id.gameTypeText /* 2131297905 */:
                this.gameType.setSelected(false);
                this.gameType = new GameSubTypeData();
                getBinding().f17689f.setVisibility(8);
                break;
            case R.id.modelTypeText /* 2131299896 */:
                this.modelType.setSelected(false);
                this.modelType = new GameSubTypeData();
                getBinding().f17691h.setVisibility(8);
                break;
            case R.id.okButn /* 2131300173 */:
                updateRequestArgs();
                getBinding().f17699p.setVisibility(8);
                for (Fragment fragment : this.fragments) {
                    Intrinsics.checkNotNull(fragment, "null cannot be cast to non-null type com.join.kotlin.ui.findgame.CategoryDetailItemFragment");
                    ((CategoryDetailItemFragment) fragment).updateDatas(this.featureType, this.gameType, this.modelType, this.playType, this.themeType);
                }
                updateTitle();
                break;
            case R.id.playTypeText /* 2131300368 */:
                this.playType.setSelected(false);
                this.playType = new GameSubTypeData();
                getBinding().f17694k.setVisibility(8);
                break;
            case R.id.resetButn /* 2131300637 */:
                this.modelType.setSelected(false);
                this.modelType = new GameSubTypeData();
                getBinding().f17691h.setVisibility(8);
                this.gameType.setSelected(false);
                this.gameType = new GameSubTypeData();
                getBinding().f17689f.setVisibility(8);
                this.themeType.setSelected(false);
                this.themeType = new GameSubTypeData();
                getBinding().f17697n.setVisibility(8);
                this.themeType.setSelected(false);
                this.themeType = new GameSubTypeData();
                getBinding().f17697n.setVisibility(8);
                this.playType.setSelected(false);
                this.playType = new GameSubTypeData();
                getBinding().f17694k.setVisibility(8);
                this.featureType.setSelected(false);
                this.featureType = new GameSubTypeData();
                getBinding().f17687d.setVisibility(8);
                break;
            case R.id.themeTypeText /* 2131301436 */:
                this.themeType.setSelected(false);
                this.themeType = new GameSubTypeData();
                getBinding().f17697n.setVisibility(8);
                break;
        }
        getFindTypeAdapter().notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        List<GameSubTypeData> reversed;
        List mutableList;
        super.onCreate(bundle);
        CategroyGamelistActivityBinding inflate = CategroyGamelistActivityBinding.inflate(LayoutInflater.from(this));
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(LayoutInflater.from(this))");
        setBinding(inflate);
        setContext(this);
        setContentView(getBinding().getRoot());
        getBinding().f17698o.f26784d.setVisibility(8);
        String d5 = new PrefDef_(getContext()).gameTypeList().d();
        if (d5 == null || d5.length() == 0) {
            d5 = "[{\"id\":1,\"title\":\"模拟器\",\"type\":1,\"sub_game_type\":[{\"id\":31,\"pic\":\"http://ctimg2018.myyx618.com/upload/images/game_tag_type_icon/fba_icon.png\",\"title\":\"街机\"},{\"id\":33,\"pic\":\"http://ctimg2018.myyx618.com/upload/images/game_tag_type_icon/gba_icon.png\",\"title\":\"GBA\"},{\"id\":34,\"pic\":\"http://ctimg2018.myyx618.com/upload/images/game_tag_type_icon/psp_icon.png\",\"title\":\"PSP\"},{\"id\":35,\"pic\":\"http://ctimg2018.myyx618.com/upload/images/game_tag_type_icon/fc_icon.png\",\"title\":\"FC\"},{\"id\":43,\"pic\":\"http://ctimg2018.myyx618.com/upload/images/game_tag_type_icon/sfc_icon.png\",\"title\":\"SFC\"},{\"id\":53,\"pic\":\"http://ctimg2018.myyx618.com/upload/images/game_tag_type_icon/ps_icon.png\",\"title\":\"PS\"},{\"id\":51,\"pic\":\"http://ctimg2018.myyx618.com/upload/images/game_tag_type_icon/md_icon.png\",\"title\":\"MD\"},{\"id\":54,\"pic\":\"http://ctimg2018.myyx618.com/upload/images/game_tag_type_icon/wsc_icon.png\",\"title\":\"WSC\"},{\"id\":57,\"pic\":\"http://ctimg2018.myyx618.com/upload/images/game_tag_type_icon/n64_icon.png\",\"title\":\"N64\"},{\"id\":58,\"pic\":\"http://ctimg2018.myyx618.com/upload/images/game_tag_type_icon/on_icon.png\",\"title\":\"ONS\"},{\"id\":32,\"pic\":\"http://ctimg2018.myyx618.com/upload/images/game_tag_type_icon/nd_icon.png\",\"title\":\"NDS\"},{\"id\":56,\"pic\":\"http://ctimg2018.myyx618.com/upload/images/game_tag_type_icon/gbc_icon.png\",\"title\":\"GBC\"},{\"id\":60,\"pic\":\"http://ctimg2018.myyx618.com/upload/images/game_tag_type_icon/dc_icon.png\",\"title\":\"DC\"},{\"id\":102,\"pic\":\"\",\"title\":\"H5\"}]},{\"id\":2,\"title\":\"安卓\",\"type\":2,\"sub_game_type\":[{\"id\":10001,\"pic\":\"http://ctimg2018.myyx618.com/upload/images/game_tag_type_icon/onlin_icon.png\",\"title\":\"网游\"},{\"id\":10002,\"pic\":\"http://ctimg2018.myyx618.com/upload/images/game_tag_type_icon/single_icon.png\",\"title\":\"单机\"},{\"id\":10003,\"pic\":\"http://ctimg2018.myyx618.com/upload/images/game_tag_type_icon/single_icon.png\",\"title\":\"mod\"}]},{\"id\":3,\"title\":\"分类\",\"type\":3,\"sub_game_type\":[{\"id\":24,\"pic\":\"http://ctimg2018.myyx618.com/upload/images/f3/ae/f3ae58e30ae7e432d7571a5ab08e31a2.png\",\"title\":\"动作冒险\"},{\"id\":23,\"pic\":\"http://ctimg2018.myyx618.com/upload/images/2d/31/2d31f269379aee69d2e283478a1b9aa5.png\",\"title\":\"休闲益智\"},{\"id\":20,\"pic\":\"http://ctimg2018.myyx618.com/upload/images/e3/62/e36255c965b63e80d901f7ea04ae5aa1.png\",\"title\":\"角色扮演\"},{\"id\":25,\"pic\":\"http://ctimg2018.myyx618.com/upload/images/f4/44/f4444b37064a2cb88401db74dc5e3f75.png\",\"title\":\"射击飞行\"},{\"id\":19,\"pic\":\"http://ctimg2018.myyx618.com/upload/images/e1/d1/e1d1edd8076f1d92425cef93feef1cf2.png\",\"title\":\"策略战棋\"},{\"id\":17,\"pic\":\"http://ctimg2018.myyx618.com/upload/images/3f/c8/3fc873bf10d151215d5b977178c4afe6.png\",\"title\":\"模拟游戏\"},{\"id\":22,\"pic\":\"http://ctimg2018.myyx618.com/upload/images/3c/05/3c054708b2a888461eb338d34412a3f0.png\",\"title\":\"体育游戏\"},{\"id\":39,\"pic\":\"http://ctimg2018.myyx618.com/upload/images/8e/de/8ede16897f71fdba1389d625b1c9ccfa.png\",\"title\":\"竞速游戏\"},{\"id\":18,\"pic\":\"http://ctimg2018.myyx618.com/upload/images/fc/9c/fc9c346e32b8f48fe6348b8b72e970ce.png\",\"title\":\"格斗竞技\"},{\"id\":38,\"pic\":\"http://ctimg2018.myyx618.com/upload/images/ef/8d/ef8d5060aa6c85a58bff921302bcc73a.png\",\"title\":\"经营游戏\"},{\"id\":13,\"pic\":\"http://ctimg2018.myyx618.com/upload/images/c9/49/c949ce67d0ccf31a5dbe6cde1d6c213e.png\",\"title\":\"AVG恋爱\"},{\"id\":15,\"pic\":\"http://ctimg2018.myyx618.com/upload/images/db/0f/db0f26037fee0b193fa9d77094238d9a.png\",\"title\":\"生存游戏\"},{\"id\":16,\"pic\":\"http://ctimg2018.myyx618.com/upload/images/88/ff/88ff59f4c24e0d14aed861500a9b85e9.png\",\"title\":\"恐怖游戏\"},{\"id\":12,\"pic\":\"http://ctimg2018.myyx618.com/upload/images/eb/be/ebbe18e8be70b2ff811e32f5bdd8eee3.png\",\"title\":\"塔防游戏\"},{\"id\":41,\"pic\":\"http://ctimg2018.myyx618.com/upload/images/fb/5f/fb5f0f3569e9d40babd7d8c10da7195e.png\",\"title\":\"音乐节奏\"},{\"id\":21,\"pic\":\"http://ctimg2018.myyx618.com/upload/images/a4/4c/a44c5c9440c9433dd8c90065790a72ab.png\",\"title\":\"放置挂机\"}]},{\"id\":4,\"title\":\"题材\",\"type\":4,\"sub_game_type\":[{\"id\":248,\"pic\":\"\",\"title\":\"二次元\"},{\"id\":249,\"pic\":\"\",\"title\":\"拟人\"},{\"id\":250,\"pic\":\"\",\"title\":\"枪战\"},{\"id\":251,\"pic\":\"\",\"title\":\"山海经\"},{\"id\":252,\"pic\":\"\",\"title\":\"动漫IP\"},{\"id\":253,\"pic\":\"\",\"title\":\"冒险\"},{\"id\":254,\"pic\":\"\",\"title\":\"地牢迷宫\"},{\"id\":255,\"pic\":\"\",\"title\":\"魔幻\"},{\"id\":256,\"pic\":\"\",\"title\":\"科幻\"},{\"id\":257,\"pic\":\"\",\"title\":\"末日\"},{\"id\":258,\"pic\":\"\",\"title\":\"火影忍者\"},{\"id\":259,\"pic\":\"\",\"title\":\"日漫\"},{\"id\":260,\"pic\":\"\",\"title\":\"海战\"},{\"id\":261,\"pic\":\"\",\"title\":\"武侠\"},{\"id\":262,\"pic\":\"\",\"title\":\"童话\"},{\"id\":263,\"pic\":\"\",\"title\":\"史莱姆\"},{\"id\":264,\"pic\":\"\",\"title\":\"美食\"},{\"id\":265,\"pic\":\"\",\"title\":\"忍者\"},{\"id\":266,\"pic\":\"\",\"title\":\"火柴人\"},{\"id\":267,\"pic\":\"\",\"title\":\"枪娘\"},{\"id\":268,\"pic\":\"\",\"title\":\"魔物娘\"},{\"id\":269,\"pic\":\"\",\"title\":\"机甲\"},{\"id\":270,\"pic\":\"\",\"title\":\"恋爱\"},{\"id\":271,\"pic\":\"\",\"title\":\"三国\"},{\"id\":272,\"pic\":\"\",\"title\":\"战争\"},{\"id\":273,\"pic\":\"\",\"title\":\"狩猎\"},{\"id\":274,\"pic\":\"\",\"title\":\"修仙\"},{\"id\":275,\"pic\":\"\",\"title\":\"初音未来\"},{\"id\":276,\"pic\":\"\",\"title\":\"人生\"},{\"id\":277,\"pic\":\"\",\"title\":\"坦克\"},{\"id\":278,\"pic\":\"\",\"title\":\"二战\"},{\"id\":279,\"pic\":\"\",\"title\":\"战舰\"},{\"id\":280,\"pic\":\"\",\"title\":\"神话\"},{\"id\":281,\"pic\":\"\",\"title\":\"僵尸\"},{\"id\":282,\"pic\":\"\",\"title\":\"植物\"},{\"id\":283,\"pic\":\"\",\"title\":\"恐怖\"},{\"id\":284,\"pic\":\"\",\"title\":\"动物\"},{\"id\":285,\"pic\":\"\",\"title\":\"盗墓\"},{\"id\":286,\"pic\":\"\",\"title\":\"舰娘\"},{\"id\":287,\"pic\":\"\",\"title\":\"狼人杀\"},{\"id\":288,\"pic\":\"\",\"title\":\"2048\"},{\"id\":289,\"pic\":\"\",\"title\":\"仙侠\"},{\"id\":290,\"pic\":\"\",\"title\":\"西游\"},{\"id\":291,\"pic\":\"\",\"title\":\"农场\"},{\"id\":292,\"pic\":\"\",\"title\":\"电竞\"},{\"id\":293,\"pic\":\"\",\"title\":\"赛车\"},{\"id\":294,\"pic\":\"\",\"title\":\"开罗\"},{\"id\":295,\"pic\":\"\",\"title\":\"足球\"},{\"id\":296,\"pic\":\"\",\"title\":\"篮球\"},{\"id\":297,\"pic\":\"\",\"title\":\"妖怪\"},{\"id\":298,\"pic\":\"\",\"title\":\"太空\"},{\"id\":299,\"pic\":\"\",\"title\":\"SLG\"},{\"id\":300,\"pic\":\"\",\"title\":\"航海\"},{\"id\":301,\"pic\":\"\",\"title\":\"烹饪\"},{\"id\":302,\"pic\":\"\",\"title\":\"漫威\"},{\"id\":303,\"pic\":\"\",\"title\":\"超级英雄\"},{\"id\":304,\"pic\":\"\",\"title\":\"美漫\"},{\"id\":305,\"pic\":\"\",\"title\":\"暗黑\"},{\"id\":306,\"pic\":\"\",\"title\":\"国创\"},{\"id\":307,\"pic\":\"\",\"title\":\"偶像\"},{\"id\":308,\"pic\":\"\",\"title\":\"手机\"},{\"id\":309,\"pic\":\"\",\"title\":\"克苏鲁\"},{\"id\":310,\"pic\":\"\",\"title\":\"侦探\"},{\"id\":311,\"pic\":\"\",\"title\":\"高达\"},{\"id\":312,\"pic\":\"\",\"title\":\"乐高\"},{\"id\":313,\"pic\":\"\",\"title\":\"数独\"},{\"id\":314,\"pic\":\"\",\"title\":\"钢琴\"},{\"id\":315,\"pic\":\"\",\"title\":\"数学\"},{\"id\":316,\"pic\":\"\",\"title\":\"脱出\"},{\"id\":317,\"pic\":\"\",\"title\":\"大富翁\"},{\"id\":318,\"pic\":\"\",\"title\":\"口袋妖怪\"},{\"id\":319,\"pic\":\"\",\"title\":\"拳皇\"},{\"id\":320,\"pic\":\"\",\"title\":\"奥特曼\"},{\"id\":321,\"pic\":\"\",\"title\":\"死神\"},{\"id\":322,\"pic\":\"\",\"title\":\"侠盗猎车手\"},{\"id\":323,\"pic\":\"\",\"title\":\"死神vs火影\"},{\"id\":324,\"pic\":\"\",\"title\":\"三国战纪\"},{\"id\":325,\"pic\":\"\",\"title\":\"蜘蛛侠\"},{\"id\":326,\"pic\":\"\",\"title\":\"游戏王\"},{\"id\":327,\"pic\":\"\",\"title\":\"刺客信条\"},{\"id\":328,\"pic\":\"\",\"title\":\"坦克大战\"},{\"id\":329,\"pic\":\"\",\"title\":\"“热血”系列游戏\"},{\"id\":330,\"pic\":\"\",\"title\":\"捕鱼\"},{\"id\":331,\"pic\":\"\",\"title\":\"梦幻模拟战\"},{\"id\":332,\"pic\":\"\",\"title\":\"三国无双\"},{\"id\":333,\"pic\":\"\",\"title\":\"植物大战僵尸\"},{\"id\":334,\"pic\":\"\",\"title\":\"龙珠\"},{\"id\":335,\"pic\":\"\",\"title\":\"饥荒\"},{\"id\":336,\"pic\":\"\",\"title\":\"模拟山羊\"},{\"id\":337,\"pic\":\"\",\"title\":\"英雄联盟\"},{\"id\":338,\"pic\":\"\",\"title\":\"仙剑奇侠传\"},{\"id\":339,\"pic\":\"\",\"title\":\"传奇\"},{\"id\":340,\"pic\":\"\",\"title\":\"水浒传\"},{\"id\":341,\"pic\":\"\",\"title\":\"奇迹MU\"},{\"id\":342,\"pic\":\"\",\"title\":\"实况足球\"},{\"id\":343,\"pic\":\"\",\"title\":\"最终幻想\"},{\"id\":344,\"pic\":\"\",\"title\":\"数码宝贝\"},{\"id\":345,\"pic\":\"\",\"title\":\"恐龙\"},{\"id\":346,\"pic\":\"\",\"title\":\"战国\"},{\"id\":347,\"pic\":\"\",\"title\":\"校园\"}]},{\"id\":5,\"title\":\"玩法\",\"type\":5,\"sub_game_type\":[{\"id\":385,\"pic\":\"\",\"title\":\"MOBA\"},{\"id\":386,\"pic\":\"\",\"title\":\"自走棋\"},{\"id\":387,\"pic\":\"\",\"title\":\"塔防\"},{\"id\":388,\"pic\":\"\",\"title\":\"养成\"},{\"id\":389,\"pic\":\"\",\"title\":\"策略\"},{\"id\":390,\"pic\":\"\",\"title\":\"射击\"},{\"id\":391,\"pic\":\"\",\"title\":\"卡牌\"},{\"id\":392,\"pic\":\"\",\"title\":\"回合制RPG\"},{\"id\":393,\"pic\":\"\",\"title\":\"动作\"},{\"id\":394,\"pic\":\"\",\"title\":\"挂机放置\"},{\"id\":395,\"pic\":\"\",\"title\":\"动作RPG\"},{\"id\":396,\"pic\":\"\",\"title\":\"格斗\"},{\"id\":397,\"pic\":\"\",\"title\":\"吃鸡\"},{\"id\":398,\"pic\":\"\",\"title\":\"策略RPG\"},{\"id\":399,\"pic\":\"\",\"title\":\"MMORPG\"},{\"id\":400,\"pic\":\"\",\"title\":\"建造\"},{\"id\":401,\"pic\":\"\",\"title\":\"模拟\"},{\"id\":402,\"pic\":\"\",\"title\":\"消除\"},{\"id\":403,\"pic\":\"\",\"title\":\"战棋\"},{\"id\":404,\"pic\":\"\",\"title\":\"竞速\"},{\"id\":405,\"pic\":\"\",\"title\":\"跑酷\"},{\"id\":406,\"pic\":\"\",\"title\":\"经营\"},{\"id\":407,\"pic\":\"\",\"title\":\"即时战略\"},{\"id\":408,\"pic\":\"\",\"title\":\"文字冒险\"},{\"id\":409,\"pic\":\"\",\"title\":\"音乐节奏\"},{\"id\":410,\"pic\":\"\",\"title\":\"棋牌\"},{\"id\":411,\"pic\":\"\",\"title\":\"桌游\"},{\"id\":412,\"pic\":\"\",\"title\":\"io\"},{\"id\":413,\"pic\":\"\",\"title\":\"换装\"},{\"id\":414,\"pic\":\"\",\"title\":\"闯关\"},{\"id\":415,\"pic\":\"\",\"title\":\"互动小说\"},{\"id\":416,\"pic\":\"\",\"title\":\"解谜\"},{\"id\":417,\"pic\":\"\",\"title\":\"点击\"},{\"id\":418,\"pic\":\"\",\"title\":\"益智\"},{\"id\":419,\"pic\":\"\",\"title\":\"弹射\"},{\"id\":420,\"pic\":\"\",\"title\":\"体育\"},{\"id\":421,\"pic\":\"\",\"title\":\"互动电影\"},{\"id\":422,\"pic\":\"\",\"title\":\"随行游戏\"},{\"id\":423,\"pic\":\"\",\"title\":\"视觉小说\"},{\"id\":424,\"pic\":\"\",\"title\":\"MUD\"},{\"id\":425,\"pic\":\"\",\"title\":\"飞行\"},{\"id\":426,\"pic\":\"\",\"title\":\"驾驶\"},{\"id\":427,\"pic\":\"\",\"title\":\"生存\"}]},{\"id\":6,\"title\":\"特色\",\"type\":6,\"sub_game_type\":[{\"id\":428,\"pic\":\"\",\"title\":\"联机\"},{\"id\":429,\"pic\":\"\",\"title\":\"5v5\"},{\"id\":430,\"pic\":\"\",\"title\":\"多人\"},{\"id\":431,\"pic\":\"\",\"title\":\"推塔\"},{\"id\":432,\"pic\":\"\",\"title\":\"美女\"},{\"id\":433,\"pic\":\"\",\"title\":\"硬核\"},{\"id\":434,\"pic\":\"\",\"title\":\"收集要素\"},{\"id\":435,\"pic\":\"\",\"title\":\"国产\"},{\"id\":436,\"pic\":\"\",\"title\":\"FPS\"},{\"id\":437,\"pic\":\"\",\"title\":\"PVP\"},{\"id\":438,\"pic\":\"\",\"title\":\"竞技\"},{\"id\":439,\"pic\":\"\",\"title\":\"TPS\"},{\"id\":440,\"pic\":\"\",\"title\":\"3D\"},{\"id\":441,\"pic\":\"\",\"title\":\"合作\"},{\"id\":442,\"pic\":\"\",\"title\":\"TPP\"},{\"id\":443,\"pic\":\"\",\"title\":\"剧情\"},{\"id\":444,\"pic\":\"\",\"title\":\"对战\"},{\"id\":445,\"pic\":\"\",\"title\":\"Roguelike\"},{\"id\":446,\"pic\":\"\",\"title\":\"Steam移植\"},{\"id\":447,\"pic\":\"\",\"title\":\"独立游戏\"},{\"id\":450,\"pic\":\"\",\"title\":\"休闲\"},{\"id\":451,\"pic\":\"\",\"title\":\"高画质\"},{\"id\":452,\"pic\":\"\",\"title\":\"高难度\"},{\"id\":453,\"pic\":\"\",\"title\":\"横版\"},{\"id\":454,\"pic\":\"\",\"title\":\"和风\"},{\"id\":455,\"pic\":\"\",\"title\":\"Live2D\"},{\"id\":456,\"pic\":\"\",\"title\":\"卡通\"},{\"id\":457,\"pic\":\"\",\"title\":\"组队\"},{\"id\":458,\"pic\":\"\",\"title\":\"CCG\"},{\"id\":459,\"pic\":\"\",\"title\":\"1v1\"},{\"id\":460,\"pic\":\"\",\"title\":\"可爱\"},{\"id\":461,\"pic\":\"\",\"title\":\"局域网联机\"},{\"id\":462,\"pic\":\"\",\"title\":\"像素\"},{\"id\":463,\"pic\":\"\",\"title\":\"弹幕\"},{\"id\":464,\"pic\":\"\",\"title\":\"中国风\"},{\"id\":465,\"pic\":\"\",\"title\":\"高自由度\"},{\"id\":466,\"pic\":\"\",\"title\":\"古风\"},{\"id\":467,\"pic\":\"\",\"title\":\"可捏脸\"},{\"id\":468,\"pic\":\"\",\"title\":\"开放世界\"},{\"id\":469,\"pic\":\"\",\"title\":\"社交\"},{\"id\":470,\"pic\":\"\",\"title\":\"DIY\"},{\"id\":471,\"pic\":\"\",\"title\":\"经典\"},{\"id\":472,\"pic\":\"\",\"title\":\"多结局\"},{\"id\":473,\"pic\":\"\",\"title\":\"手绘风格\"},{\"id\":474,\"pic\":\"\",\"title\":\"装修\"},{\"id\":475,\"pic\":\"\",\"title\":\"设计\"},{\"id\":476,\"pic\":\"\",\"title\":\"女性向\"},{\"id\":477,\"pic\":\"\",\"title\":\"声控\"},{\"id\":478,\"pic\":\"\",\"title\":\"漂移\"},{\"id\":479,\"pic\":\"\",\"title\":\"水墨风\"},{\"id\":480,\"pic\":\"\",\"title\":\"2D\"},{\"id\":481,\"pic\":\"\",\"title\":\"打击感\"},{\"id\":482,\"pic\":\"\",\"title\":\"手速\"},{\"id\":483,\"pic\":\"\",\"title\":\"声优配音\"},{\"id\":484,\"pic\":\"\",\"title\":\"致郁\"},{\"id\":485,\"pic\":\"\",\"title\":\"DBG\"},{\"id\":486,\"pic\":\"\",\"title\":\"逃生\"},{\"id\":487,\"pic\":\"\",\"title\":\"移植\"},{\"id\":488,\"pic\":\"\",\"title\":\"搞笑\"},{\"id\":489,\"pic\":\"\",\"title\":\"合成\"},{\"id\":490,\"pic\":\"\",\"title\":\"动人音乐\"},{\"id\":491,\"pic\":\"\",\"title\":\"电音\"},{\"id\":492,\"pic\":\"\",\"title\":\"竖版\"},{\"id\":493,\"pic\":\"\",\"title\":\"童年\"},{\"id\":494,\"pic\":\"\",\"title\":\"Q版\"},{\"id\":495,\"pic\":\"\",\"title\":\"有毒\"},{\"id\":496,\"pic\":\"\",\"title\":\"乙女\"},{\"id\":497,\"pic\":\"\",\"title\":\"TCG\"},{\"id\":498,\"pic\":\"\",\"title\":\"悬疑\"},{\"id\":499,\"pic\":\"\",\"title\":\"治愈\"},{\"id\":500,\"pic\":\"\",\"title\":\"组装\"},{\"id\":501,\"pic\":\"\",\"title\":\"推理\"},{\"id\":502,\"pic\":\"\",\"title\":\"解压\"},{\"id\":503,\"pic\":\"\",\"title\":\"meta\"},{\"id\":504,\"pic\":\"\",\"title\":\"汉化\"},{\"id\":505,\"pic\":\"\",\"title\":\"欧美画风\"},{\"id\":506,\"pic\":\"\",\"title\":\"3v3\"},{\"id\":507,\"pic\":\"\",\"title\":\"魔性\"},{\"id\":508,\"pic\":\"\",\"title\":\"平台跳跃\"},{\"id\":509,\"pic\":\"\",\"title\":\"自制关卡\"},{\"id\":510,\"pic\":\"\",\"title\":\"轻改\"},{\"id\":511,\"pic\":\"\",\"title\":\"简约画风\"},{\"id\":512,\"pic\":\"\",\"title\":\"街机风格\"},{\"id\":513,\"pic\":\"\",\"title\":\"AR\"},{\"id\":514,\"pic\":\"\",\"title\":\"户外\"},{\"id\":515,\"pic\":\"\",\"title\":\"日系风格\"},{\"id\":516,\"pic\":\"\",\"title\":\"VR\"},{\"id\":517,\"pic\":\"\",\"title\":\"佛系\"},{\"id\":518,\"pic\":\"\",\"title\":\"低模\"},{\"id\":519,\"pic\":\"\",\"title\":\"小清新\"},{\"id\":520,\"pic\":\"\",\"title\":\"俯视视角\"},{\"id\":521,\"pic\":\"\",\"title\":\"PC移植\"},{\"id\":522,\"pic\":\"\",\"title\":\"买断制\"},{\"id\":523,\"pic\":\"\",\"title\":\"进化\"},{\"id\":524,\"pic\":\"\",\"title\":\"剪纸风\"},{\"id\":525,\"pic\":\"\",\"title\":\"剪影风\"},{\"id\":526,\"pic\":\"\",\"title\":\"催泪\"},{\"id\":527,\"pic\":\"\",\"title\":\"下落式\"},{\"id\":528,\"pic\":\"\",\"title\":\"手残\"},{\"id\":529,\"pic\":\"\",\"title\":\"反应力\"}]}]";
        }
        Object readValue = new ObjectMapper().readValue(d5, JsonMapper.getInstance().createCollectionType(List.class, GameTypeData.class));
        Intrinsics.checkNotNullExpressionValue(readValue, "ObjectMapper().readValue…ta::class.java)\n        )");
        setGameTypeList((List) readValue);
        List<GameTypeData> gameTypeList = getGameTypeList();
        ArrayList arrayList = new ArrayList();
        for (Object obj : gameTypeList) {
            if (((GameTypeData) obj).getType() == 0) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            getGameTypeList().remove(arrayList.get(0));
        }
        List<GameTypeData> gameTypeList2 = getGameTypeList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : gameTypeList2) {
            if (((GameTypeData) obj2).getType() == 2) {
                arrayList2.add(obj2);
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
                for (Object obj3 : gameTypeList3) {
                    if (((GameTypeData) obj3).getType() == 1) {
                        arrayList3.add(obj3);
                    }
                }
                mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList3);
                List<GameSubTypeData> sub_game_type2 = ((GameTypeData) mutableList.get(0)).getSub_game_type();
                Intrinsics.checkNotNull(sub_game_type2);
                sub_game_type2.add(0, gameSubTypeData);
            }
        }
        setContext(this);
        initView();
    }

    public final void reLoadDatas() {
        onClick(getBinding().f17695l);
        onClick(getBinding().f17693j);
    }

    public final void setBinding(@NotNull CategroyGamelistActivityBinding categroyGamelistActivityBinding) {
        Intrinsics.checkNotNullParameter(categroyGamelistActivityBinding, "<set-?>");
        this.binding = categroyGamelistActivityBinding;
    }

    public final void setContext(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.context = context;
    }

    public final void setDatas(@NotNull List<CommonListMainData> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.datas = list;
    }

    public final void setFeatureType(@NotNull GameSubTypeData gameSubTypeData) {
        Intrinsics.checkNotNullParameter(gameSubTypeData, "<set-?>");
        this.featureType = gameSubTypeData;
    }

    public final void setFindTypeAdapter(@NotNull FindTypeListAdapter findTypeListAdapter) {
        Intrinsics.checkNotNullParameter(findTypeListAdapter, "<set-?>");
        this.findTypeAdapter = findTypeListAdapter;
    }

    public final void setFragments(@NotNull ArrayList<Fragment> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.fragments = arrayList;
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

    public final void setLeftTypeAdapter(@NotNull FindGameClassfyFragment.TabRecycleAdapter tabRecycleAdapter) {
        Intrinsics.checkNotNullParameter(tabRecycleAdapter, "<set-?>");
        this.leftTypeAdapter = tabRecycleAdapter;
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

    public final void setTabType(@NotNull GameTypeData gameTypeData) {
        Intrinsics.checkNotNullParameter(gameTypeData, "<set-?>");
        this.tabType = gameTypeData;
    }

    public final void setThemeType(@NotNull GameSubTypeData gameSubTypeData) {
        Intrinsics.checkNotNullParameter(gameSubTypeData, "<set-?>");
        this.themeType = gameSubTypeData;
    }
}
