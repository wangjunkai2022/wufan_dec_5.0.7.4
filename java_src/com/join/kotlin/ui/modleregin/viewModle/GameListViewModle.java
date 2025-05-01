package com.join.kotlin.ui.modleregin.viewModle;

import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.kotlin.domain.common.AppListItemShowBean;
import com.join.kotlin.domain.common.LoadBindindData;
import com.join.kotlin.ui.base.BaseHasDownloadActivityViewModle;
import com.join.kotlin.ui.modleregin.modle.BtGameListItem;
import com.join.kotlin.ui.modleregin.modle.BtOnlineGame;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.business.CollectionBeanSubBusiness;
import com.join.mgps.dto.CollectionBeanSub;
import com.psk.kotlin.util.CommonListMainData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: GameListViewModle.kt */
@SourceDebugExtension({"SMAP\nGameListViewModle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameListViewModle.kt\ncom/join/kotlin/ui/modleregin/viewModle/GameListViewModle\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,110:1\n766#2:111\n857#2,2:112\n1855#2,2:114\n1855#2,2:116\n*S KotlinDebug\n*F\n+ 1 GameListViewModle.kt\ncom/join/kotlin/ui/modleregin/viewModle/GameListViewModle\n*L\n37#1:111\n37#1:112,2\n40#1:114,2\n99#1:116,2\n*E\n"})
/* loaded from: classes3.dex */
public final class GameListViewModle extends BaseHasDownloadActivityViewModle {
    @Nullable
    private RecyclerView.Adapter<RecyclerView.ViewHolder> adapter;
    @Nullable
    private LinearLayoutManager manager;
    @NotNull
    private MutableLiveData<List<CommonListMainData>> showDatas = new MutableLiveData<>();
    private int page = 1;
    @NotNull
    private MutableLiveData<LoadBindindData> loadBindData = new MutableLiveData<>();
    @NotNull
    private MutableLiveData<Integer> recycleViewStatus = new MutableLiveData<>();

    public GameListViewModle() {
        this.showDatas.setValue(new ArrayList());
        this.recycleViewStatus.setValue(0);
        this.loadBindData.setValue(new LoadBindindData(2));
    }

    @Nullable
    public final RecyclerView.Adapter<RecyclerView.ViewHolder> getAdapter() {
        return this.adapter;
    }

    @NotNull
    public final MutableLiveData<LoadBindindData> getLoadBindData() {
        return this.loadBindData;
    }

    @Nullable
    public final LinearLayoutManager getManager() {
        return this.manager;
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

    public final void setAdapter(@Nullable RecyclerView.Adapter<RecyclerView.ViewHolder> adapter) {
        this.adapter = adapter;
    }

    public final void setLoadBindData(@NotNull MutableLiveData<LoadBindindData> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.loadBindData = mutableLiveData;
    }

    public final void setManager(@Nullable LinearLayoutManager linearLayoutManager) {
        this.manager = linearLayoutManager;
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

    public final void showGameList(@NotNull List<BtOnlineGame> onlineGames, long j4) {
        Intrinsics.checkNotNullParameter(onlineGames, "onlineGames");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = onlineGames.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (((BtOnlineGame) next).getOnlineTime() == j4) {
                arrayList.add(next);
            }
        }
        if (!arrayList.isEmpty()) {
            List<CommonListMainData> value = this.showDatas.getValue();
            if (value != null) {
                value.clear();
            }
            for (CollectionBeanSub collectionBeanSub : ((BtOnlineGame) arrayList.get(0)).getGameEntityList()) {
                CollectionBeanSubBusiness collectionBeanSubBusiness = new CollectionBeanSubBusiness(collectionBeanSub);
                collectionBeanSubBusiness.set_from(0);
                collectionBeanSubBusiness.set_from_type(0);
                collectionBeanSubBusiness.setRecPosition(String.valueOf(collectionBeanSubBusiness.getIndex()));
                updateDowState(collectionBeanSubBusiness);
                try {
                    List<CommonListMainData> value2 = this.showDatas.getValue();
                    Intrinsics.checkNotNull(value2);
                    String ico_remote = collectionBeanSubBusiness.getIco_remote();
                    Intrinsics.checkNotNullExpressionValue(ico_remote, "be.ico_remote");
                    String gif_ico_remote = collectionBeanSubBusiness.getGif_ico_remote();
                    String game_name = collectionBeanSubBusiness.getGame_name();
                    Intrinsics.checkNotNullExpressionValue(game_name, "be.game_name");
                    String info = collectionBeanSubBusiness.getInfo();
                    Intrinsics.checkNotNullExpressionValue(info, "be.info");
                    value2.add(new CommonListMainData(2, new BtGameListItem(0, ico_remote, gif_ico_remote, game_name, collectionBeanSubBusiness.getGame_dimension() + ' ' + UtilsMy.J2(collectionBeanSubBusiness.getActual_size()), info, collectionBeanSubBusiness, new AppListItemShowBean(collectionBeanSubBusiness, false)), null, null, 12, null));
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
        }
        MutableLiveData<List<CommonListMainData>> mutableLiveData = this.showDatas;
        mutableLiveData.setValue(mutableLiveData.getValue());
    }

    @Override // com.join.kotlin.ui.base.BaseHasDownloadActivityViewModle
    public void updateDowStateList(@NotNull DownloadTask downloadTask, @NotNull Function1<? super CollectionBeanSubBusiness, Unit> func) {
        Intrinsics.checkNotNullParameter(downloadTask, "downloadTask");
        Intrinsics.checkNotNullParameter(func, "func");
        List<CommonListMainData> value = this.showDatas.getValue();
        if (value != null) {
            for (CommonListMainData commonListMainData : value) {
                if (commonListMainData.getType() == 2) {
                    Object any = commonListMainData.getAny();
                    Intrinsics.checkNotNull(any, "null cannot be cast to non-null type com.join.kotlin.ui.modleregin.modle.BtGameListItem");
                    func.invoke(((BtGameListItem) any).getGameInfo());
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
                    Intrinsics.checkNotNull(any, "null cannot be cast to non-null type com.join.mgps.business.CollectionBeanSubBusiness");
                    DownloadTask downloadTask = ((CollectionBeanSubBusiness) any).getDownloadTask();
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
}
