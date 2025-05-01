package com.join.kotlin.ui.modleregin.viewModle;

import android.content.Context;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.kotlin.domain.common.AppListItemShowBean;
import com.join.kotlin.domain.common.LoadBindindData;
import com.join.kotlin.ui.base.BaseHasDownloadActivityViewModle;
import com.join.kotlin.ui.modleregin.modle.BTDynamicMain;
import com.join.kotlin.ui.modleregin.modle.BTDynamicModle;
import com.join.kotlin.ui.modleregin.modle.BtGameListItem;
import com.join.kotlin.ui.modleregin.modle.BtOnlineGame;
import com.join.kotlin.ui.modleregin.modle.BtReginResultMain;
import com.join.kotlin.ui.modleregin.modle.BtTagSelecterBean;
import com.join.kotlin.ui.modleregin.modle.BtVideodata;
import com.join.kotlin.ui.modleregin.modle.MustplayItemBean;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.business.CollectionBeanSubBusiness;
import com.join.mgps.dto.BannerBean;
import com.join.mgps.dto.CollectionBeanSub;
import com.join.mgps.dto.RequestGameIdArgs;
import com.join.mgps.dto.RequestModel;
import com.join.mgps.dto.ResponseModel;
import com.join.mgps.dto.TipBean;
import com.psk.kotlin.util.CommonListMainData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.random.Random;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import kotlinx.coroutines.d1;
import kotlinx.coroutines.k;
import kotlinx.coroutines.s1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import test.b;
/* compiled from: BtReginModle.kt */
@SourceDebugExtension({"SMAP\nBtReginModle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BtReginModle.kt\ncom/join/kotlin/ui/modleregin/viewModle/BtReginModle\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,610:1\n1855#2,2:611\n766#2:613\n857#2,2:614\n1855#2:616\n1855#2,2:617\n1856#2:619\n1855#2:620\n1855#2,2:621\n1856#2:623\n*S KotlinDebug\n*F\n+ 1 BtReginModle.kt\ncom/join/kotlin/ui/modleregin/viewModle/BtReginModle\n*L\n425#1:611,2\n430#1:613\n430#1:614,2\n434#1:616\n435#1:617,2\n434#1:619\n506#1:620\n523#1:621,2\n506#1:623\n*E\n"})
/* loaded from: classes3.dex */
public final class BtReginModle extends BaseHasDownloadActivityViewModle {
    @Nullable
    private RecyclerView.Adapter<RecyclerView.ViewHolder> adapter;
    @Nullable
    private LinearLayoutManager manager;
    @NotNull
    private List<CommonListMainData> tagList;
    private int tagListPosition;
    @NotNull
    private MutableLiveData<List<CommonListMainData>> showDatas = new MutableLiveData<>();
    @NotNull
    private List<BtOnlineGame> listBtOnlineGame = new ArrayList();
    @NotNull
    private List<BtTagSelecterBean> onlineGameTitles = new ArrayList();
    private int page = 1;
    @NotNull
    private String title = "BT手游";
    @NotNull
    private MutableLiveData<LoadBindindData> loadBindData = new MutableLiveData<>();
    @NotNull
    private MutableLiveData<Integer> recycleViewStatus = new MutableLiveData<>();

    public BtReginModle() {
        this.showDatas.setValue(new ArrayList());
        this.recycleViewStatus.setValue(0);
        this.loadBindData.setValue(new LoadBindindData(2));
        this.tagList = new ArrayList();
    }

    private final ResponseModel<BtReginResultMain> madeTestData() {
        int i4;
        int random;
        int random2;
        int random3;
        int i5;
        int i6;
        ArrayList arrayList;
        int i7;
        int random4;
        ResponseModel<BtReginResultMain> responseModel = new ResponseModel<>();
        responseModel.setCode(200);
        ArrayList arrayList2 = new ArrayList();
        int i8 = 0;
        int i9 = 0;
        while (true) {
            if (i9 >= 11) {
                break;
            }
            BannerBean a5 = b.a();
            Intrinsics.checkNotNullExpressionValue(a5, "getBannerBean()");
            arrayList2.add(a5);
            i9++;
        }
        ArrayList arrayList3 = new ArrayList();
        for (int i10 = 0; i10 < 11; i10++) {
            ArrayList arrayList4 = new ArrayList();
            for (int i11 = 0; i11 < 4; i11++) {
                CollectionBeanSub b5 = b.b();
                Intrinsics.checkNotNullExpressionValue(b5, "getgameinfo()");
                arrayList4.add(b5);
            }
            arrayList3.add(new BtOnlineGame(System.currentTimeMillis() / 1000, arrayList4));
        }
        ArrayList arrayList5 = new ArrayList();
        int i12 = 1;
        int i13 = 1;
        for (i4 = 11; i13 < i4; i4 = 11) {
            ArrayList arrayList6 = new ArrayList();
            IntRange intRange = new IntRange(i8, 10);
            Random.Default r5 = Random.Default;
            random = RangesKt___RangesKt.random(intRange, r5);
            random2 = RangesKt___RangesKt.random(new IntRange(i8, 10), r5);
            random3 = RangesKt___RangesKt.random(new IntRange(i8, 10), r5);
            if (random <= 5 && random2 <= 5 && random3 <= 5) {
                random2 = 10;
            }
            if (random > 5) {
                ArrayList arrayList7 = new ArrayList();
                for (int i14 = 1; i14 < i4; i14++) {
                    CollectionBeanSub b6 = b.b();
                    Intrinsics.checkNotNullExpressionValue(b6, "getgameinfo()");
                    arrayList7.add(b6);
                }
                Integer valueOf = Integer.valueOf(i12);
                i5 = random2;
                i6 = random3;
                arrayList = arrayList6;
                i7 = i13;
                arrayList.add(new BTDynamicModle(valueOf, 0, "3118765087", "2", arrayList7, null));
            } else {
                i5 = random2;
                i6 = random3;
                arrayList = arrayList6;
                i7 = i13;
            }
            if (i5 > 5) {
                arrayList.add(new BTDynamicModle(3, 0, "", "", null, b.b()));
            }
            if (i6 > 5) {
                ArrayList arrayList8 = new ArrayList();
                random4 = RangesKt___RangesKt.random(new IntRange(3, 5), Random.Default);
                i12 = 1;
                if (1 <= random4) {
                    int i15 = 1;
                    while (true) {
                        CollectionBeanSub b7 = b.b();
                        Intrinsics.checkNotNullExpressionValue(b7, "getgameinfo()");
                        arrayList8.add(b7);
                        if (i15 == random4) {
                            break;
                        }
                        i15++;
                    }
                }
                arrayList.add(new BTDynamicModle(2, 0, "", "", arrayList8, null));
            } else {
                i12 = 1;
            }
            arrayList5.add(new BTDynamicMain(arrayList, "标题", "副标题"));
            i13 = i7 + 1;
            i8 = 0;
        }
        CollectionBeanSub b8 = b.b();
        Intrinsics.checkNotNullExpressionValue(b8, "getgameinfo()");
        responseModel.setData(new BtReginResultMain(arrayList2, new BtVideodata(0L, "https://static-v.myyx618.com/android2019/xjjy~1.mp4", "https://t7.baidu.com/it/u=1819248061,230866778&fm=193&f=GIF", b8), arrayList3, arrayList5));
        return responseModel;
    }

    @Nullable
    public final RecyclerView.Adapter<RecyclerView.ViewHolder> getAdapter() {
        return this.adapter;
    }

    @NotNull
    public final List<BtOnlineGame> getListBtOnlineGame() {
        return this.listBtOnlineGame;
    }

    @NotNull
    public final MutableLiveData<LoadBindindData> getLoadBindData() {
        return this.loadBindData;
    }

    @Nullable
    public final LinearLayoutManager getManager() {
        return this.manager;
    }

    @NotNull
    public final List<BtTagSelecterBean> getOnlineGameTitles() {
        return this.onlineGameTitles;
    }

    public final int getPage() {
        return this.page;
    }

    @NotNull
    public final MutableLiveData<Integer> getRecycleViewStatus() {
        return this.recycleViewStatus;
    }

    @NotNull
    public final MutableLiveData<List<CommonListMainData>> getShowDatas() {
        return this.showDatas;
    }

    @NotNull
    public final List<CommonListMainData> getTagList() {
        return this.tagList;
    }

    public final int getTagListPosition() {
        return this.tagListPosition;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final void loadDatas(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        loadDatas(context, this.page);
    }

    public final void setAdapter(@Nullable RecyclerView.Adapter<RecyclerView.ViewHolder> adapter) {
        this.adapter = adapter;
    }

    public final void setListBtOnlineGame(@NotNull List<BtOnlineGame> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.listBtOnlineGame = list;
    }

    public final void setLoadBindData(@NotNull MutableLiveData<LoadBindindData> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.loadBindData = mutableLiveData;
    }

    public final void setManager(@Nullable LinearLayoutManager linearLayoutManager) {
        this.manager = linearLayoutManager;
    }

    public final void setOnlineGameTitles(@NotNull List<BtTagSelecterBean> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.onlineGameTitles = list;
    }

    public final void setPage(int i4) {
        this.page = i4;
    }

    public final void setRecycleViewStatus(@NotNull MutableLiveData<Integer> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.recycleViewStatus = mutableLiveData;
    }

    public final void setShowDatas(@NotNull MutableLiveData<List<CommonListMainData>> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.showDatas = mutableLiveData;
    }

    public final void setTagList(@NotNull List<CommonListMainData> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.tagList = list;
    }

    public final void setTagListPosition(int i4) {
        this.tagListPosition = i4;
    }

    public final void setTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.title = str;
    }

    @Override // com.join.kotlin.ui.base.BaseHasDownloadActivityViewModle
    public void updateDowStateList(@NotNull DownloadTask downloadTask, @NotNull Function1<? super CollectionBeanSubBusiness, Unit> func) {
        AppListItemShowBean appitemShow;
        Intrinsics.checkNotNullParameter(downloadTask, "downloadTask");
        Intrinsics.checkNotNullParameter(func, "func");
        List<CommonListMainData> value = this.showDatas.getValue();
        if (value != null) {
            for (CommonListMainData commonListMainData : value) {
                int type = commonListMainData.getType();
                if (type == 2) {
                    Object any = commonListMainData.getAny();
                    Intrinsics.checkNotNull(any, "null cannot be cast to non-null type com.join.kotlin.ui.modleregin.modle.BtGameListItem");
                    BtGameListItem btGameListItem = (BtGameListItem) any;
                    CollectionBeanSubBusiness gameInfo = btGameListItem.getGameInfo();
                    func.invoke(gameInfo);
                    if (gameInfo.getDownloadTask() != null && (appitemShow = btGameListItem.getAppitemShow()) != null) {
                        appitemShow.setDownloadStatus(gameInfo.getDownloadTask().getStatus());
                    }
                } else if (type == 4) {
                    Object any2 = commonListMainData.getAny();
                    Intrinsics.checkNotNull(any2, "null cannot be cast to non-null type com.join.kotlin.ui.modleregin.modle.MustplayItemBean");
                    func.invoke(((MustplayItemBean) any2).getGameinfo());
                } else if (type == 7) {
                    Object any3 = commonListMainData.getAny();
                    Intrinsics.checkNotNull(any3, "null cannot be cast to non-null type kotlin.collections.List<com.join.mgps.business.CollectionBeanSubBusiness>");
                    for (CollectionBeanSubBusiness collectionBeanSubBusiness : (List) any3) {
                        func.invoke(collectionBeanSubBusiness);
                    }
                }
            }
        }
        MutableLiveData<List<CommonListMainData>> mutableLiveData = this.showDatas;
        mutableLiveData.setValue(mutableLiveData.getValue());
    }

    @Override // com.join.kotlin.ui.base.BaseHasDownloadActivityViewModle
    public void updateProgressPartly() {
        LinearLayoutManager linearLayoutManager;
        RecyclerView.Adapter<RecyclerView.ViewHolder> adapter;
        try {
            if (this.adapter == null || (linearLayoutManager = this.manager) == null) {
                return;
            }
            Intrinsics.checkNotNull(linearLayoutManager);
            int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
            LinearLayoutManager linearLayoutManager2 = this.manager;
            Intrinsics.checkNotNull(linearLayoutManager2);
            int findLastVisibleItemPosition = linearLayoutManager2.findLastVisibleItemPosition();
            if (findFirstVisibleItemPosition > findLastVisibleItemPosition) {
                return;
            }
            while (true) {
                List<CommonListMainData> value = this.showDatas.getValue();
                Intrinsics.checkNotNull(value);
                if (findFirstVisibleItemPosition >= value.size()) {
                    return;
                }
                List<CommonListMainData> value2 = this.showDatas.getValue();
                Intrinsics.checkNotNull(value2);
                CommonListMainData commonListMainData = value2.get(findFirstVisibleItemPosition);
                if (commonListMainData.getType() == 2) {
                    Object any = commonListMainData.getAny();
                    Intrinsics.checkNotNull(any, "null cannot be cast to non-null type com.join.kotlin.ui.modleregin.modle.BtGameListItem");
                    DownloadTask downloadTask = ((BtGameListItem) any).getGameInfo().getDownloadTask();
                    if (downloadTask != null && ((downloadTask.getStatus() == 2 || downloadTask.getStatus() == 12) && (adapter = this.adapter) != null)) {
                        adapter.notifyItemChanged(findFirstVisibleItemPosition, "progress");
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

    public final void updateTitles(@NotNull BtTagSelecterBean titleInfo) {
        String str;
        List<TipBean> emptyList;
        Intrinsics.checkNotNullParameter(titleInfo, "titleInfo");
        Iterator<T> it2 = this.onlineGameTitles.iterator();
        while (true) {
            boolean z4 = true;
            if (!it2.hasNext()) {
                break;
            }
            BtTagSelecterBean btTagSelecterBean = (BtTagSelecterBean) it2.next();
            if (btTagSelecterBean.getTime() != titleInfo.getTime()) {
                z4 = false;
            }
            btTagSelecterBean.setStatus(z4);
        }
        List<CommonListMainData> value = this.showDatas.getValue();
        if (value != null) {
            value.removeAll(this.tagList);
        }
        this.tagList.clear();
        List<BtOnlineGame> list = this.listBtOnlineGame;
        ArrayList<BtOnlineGame> arrayList = new ArrayList();
        for (Object obj : list) {
            if (((BtOnlineGame) obj).getOnlineTime() == titleInfo.getTime()) {
                arrayList.add(obj);
            }
        }
        for (BtOnlineGame btOnlineGame : arrayList) {
            for (CollectionBeanSub collectionBeanSub : btOnlineGame.getGameEntityList()) {
                CollectionBeanSubBusiness collectionBeanSubBusiness = new CollectionBeanSubBusiness(collectionBeanSub);
                collectionBeanSubBusiness.set_from(146);
                collectionBeanSubBusiness.set_from_type(146);
                collectionBeanSubBusiness.setRecPosition(String.valueOf(collectionBeanSubBusiness.getIndex()));
                updateDowState(collectionBeanSubBusiness);
                String str2 = "";
                if (collectionBeanSubBusiness.getTag_info() != null) {
                    ArrayList<TipBean> tag_info = collectionBeanSubBusiness.getTag_info();
                    if (tag_info == null || (emptyList = tag_info.subList(0, Math.min(3, collectionBeanSubBusiness.getTag_info().size()))) == null) {
                        emptyList = CollectionsKt__CollectionsKt.emptyList();
                    }
                    String str3 = "";
                    for (TipBean tipBean : emptyList) {
                        if (tipBean.getId() != null && !Intrinsics.areEqual(tipBean.getId(), "") && !Intrinsics.areEqual(tipBean.getId(), "44") && !Intrinsics.areEqual(tipBean.getId(), "45") && !Intrinsics.areEqual(tipBean.getId(), "47") && !Intrinsics.areEqual(tipBean.getId(), "48") && !Intrinsics.areEqual(tipBean.getId(), "25") && !Intrinsics.areEqual(tipBean.getId(), "154") && !Intrinsics.areEqual(tipBean.getId(), "7")) {
                            str3 = str3 + tipBean.getName() + " · ";
                        }
                    }
                    str2 = str3;
                }
                List<CommonListMainData> list2 = this.tagList;
                String ico_remote = collectionBeanSubBusiness.getIco_remote();
                Intrinsics.checkNotNullExpressionValue(ico_remote, "be.ico_remote");
                String gif_ico_remote = collectionBeanSubBusiness.getGif_ico_remote();
                String game_name = collectionBeanSubBusiness.getGame_name();
                Intrinsics.checkNotNullExpressionValue(game_name, "be.game_name");
                StringBuilder sb = new StringBuilder();
                if (str2 != null) {
                    str = str2.substring(0, Math.max(0, str2.length() - 2));
                    Intrinsics.checkNotNullExpressionValue(str, "this as java.lang.String…ing(startIndex, endIndex)");
                } else {
                    str = null;
                }
                sb.append(str);
                sb.append("| ");
                sb.append(UtilsMy.J2(collectionBeanSubBusiness.getActual_size()));
                String sb2 = sb.toString();
                String info = collectionBeanSubBusiness.getInfo();
                Intrinsics.checkNotNullExpressionValue(info, "be.info");
                list2.add(new CommonListMainData(2, new BtGameListItem(999, ico_remote, gif_ico_remote, game_name, sb2, info, collectionBeanSubBusiness, new AppListItemShowBean(collectionBeanSubBusiness, false)), null, null, 12, null));
            }
        }
        List<CommonListMainData> value2 = this.showDatas.getValue();
        if (value2 != null) {
            value2.addAll(this.tagListPosition, this.tagList);
        }
        MutableLiveData<List<CommonListMainData>> mutableLiveData = this.showDatas;
        mutableLiveData.setValue(mutableLiveData.getValue());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.join.mgps.dto.RequestModel, T] */
    public final void loadDatas(@NotNull Context context, int i4) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.page = i4;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ?? requestModel = new RequestModel();
        objectRef.element = requestModel;
        ((RequestModel) requestModel).setDefault(context);
        ((RequestModel) objectRef.element).setArgs(new RequestGameIdArgs());
        ((RequestGameIdArgs) ((RequestModel) objectRef.element).getArgs()).setPage(this.page);
        ((RequestGameIdArgs) ((RequestModel) objectRef.element).getArgs()).setUid(AccountUtil_.getInstance_(context).getAccountData().getUid());
        if (this.page == 1) {
            this.loadBindData.setValue(new LoadBindindData(2));
        }
        k.f(s1.f71252b, d1.c(), null, new BtReginModle$loadDatas$job$1(objectRef, this, context, null), 2, null);
    }
}
