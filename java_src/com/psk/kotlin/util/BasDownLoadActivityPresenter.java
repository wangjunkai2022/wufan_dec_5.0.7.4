package com.psk.kotlin.util;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.kotlin.ui.findgame.data.FindChoiceBannerData;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.business.CollectionBeanSubBusiness;
import com.join.mgps.dto.ModInfoBean;
import com.join.mgps.event.n;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p1.f;
/* compiled from: BasDownLoadActivityPresenter.kt */
@SourceDebugExtension({"SMAP\nBasDownLoadActivityPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasDownLoadActivityPresenter.kt\ncom/psk/kotlin/util/BasDownLoadActivityPresenter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,256:1\n1#2:257\n*E\n"})
/* loaded from: classes5.dex */
public final class BasDownLoadActivityPresenter {
    public RecyclerView.Adapter<RecyclerView.ViewHolder> adapter;
    public List<DownloadTask> downloadTasks;
    @NotNull
    private Map<String, DownloadTask> downloadTasksMap;
    @NotNull
    private LinearLayoutManager manager;
    @NotNull
    private RecyclerView recycleView;
    @NotNull
    private List<CommonListMainData> showDataList;

    public BasDownLoadActivityPresenter(@NotNull LinearLayoutManager manager, @NotNull RecyclerView recycleView, @NotNull List<CommonListMainData> showDataList) {
        Intrinsics.checkNotNullParameter(manager, "manager");
        Intrinsics.checkNotNullParameter(recycleView, "recycleView");
        Intrinsics.checkNotNullParameter(showDataList, "showDataList");
        this.manager = manager;
        this.recycleView = recycleView;
        this.showDataList = showDataList;
        this.downloadTasksMap = new LinkedHashMap();
    }

    private final void receiveDelete(DownloadTask downloadTask) {
        Iterator<DownloadTask> it2 = getDownloadTasks().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            DownloadTask next = it2.next();
            String crc_link_type_val = next.getCrc_link_type_val();
            Intrinsics.checkNotNull(downloadTask);
            if (Intrinsics.areEqual(crc_link_type_val, downloadTask.getCrc_link_type_val())) {
                this.downloadTasksMap.remove(next.getCrc_link_type_val());
                it2.remove();
                for (CommonListMainData commonListMainData : this.showDataList) {
                    if (commonListMainData.getType() == 2) {
                        Object any = commonListMainData.getAny();
                        Intrinsics.checkNotNull(any, "null cannot be cast to non-null type com.join.mgps.business.CollectionBeanSubBusiness");
                        recivedDeleteFinal((CollectionBeanSubBusiness) any, downloadTask);
                    } else if (commonListMainData.getType() == 3) {
                        Object any2 = commonListMainData.getAny();
                        Intrinsics.checkNotNull(any2, "null cannot be cast to non-null type com.join.kotlin.ui.findgame.data.FindChoiceBannerData");
                        CollectionBeanSubBusiness game_info = ((FindChoiceBannerData) any2).getGame_info();
                        Intrinsics.checkNotNullExpressionValue(game_info, "subp.game_info");
                        recivedDeleteFinal(game_info, downloadTask);
                    }
                }
            }
        }
        getAdapter().notifyDataSetChanged();
    }

    private final void receiveError(DownloadTask downloadTask) {
        Map<String, DownloadTask> map = this.downloadTasksMap;
        if (map == null || downloadTask == null) {
            return;
        }
        try {
            UtilsMy.x4(map.get(downloadTask.getCrc_link_type_val()));
            getAdapter().notifyDataSetChanged();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private final void receiveStart(DownloadTask downloadTask) {
        UtilsMy.x4(downloadTask);
        Map<String, DownloadTask> map = this.downloadTasksMap;
        Intrinsics.checkNotNull(downloadTask);
        if (!map.containsKey(downloadTask.getCrc_link_type_val())) {
            getDownloadTasks().add(downloadTask);
            Map<String, DownloadTask> map2 = this.downloadTasksMap;
            String crc_link_type_val = downloadTask.getCrc_link_type_val();
            Intrinsics.checkNotNullExpressionValue(crc_link_type_val, "downloadTask.crc_link_type_val");
            map2.put(crc_link_type_val, downloadTask);
        }
        updateDowStateList(downloadTask);
        getAdapter().notifyDataSetChanged();
    }

    private final void receiveSuccess(DownloadTask downloadTask) {
        Map<String, DownloadTask> map = this.downloadTasksMap;
        if (map == null || downloadTask == null) {
            return;
        }
        if (!map.containsKey(downloadTask.getCrc_link_type_val())) {
            getDownloadTasks().add(downloadTask);
            Map<String, DownloadTask> map2 = this.downloadTasksMap;
            String crc_link_type_val = downloadTask.getCrc_link_type_val();
            Intrinsics.checkNotNullExpressionValue(crc_link_type_val, "downloadTask.crc_link_type_val");
            map2.put(crc_link_type_val, downloadTask);
        }
        updateDowStateList(downloadTask);
        DownloadTask downloadTask2 = this.downloadTasksMap.get(downloadTask.getCrc_link_type_val());
        if (downloadTask2 == null) {
            return;
        }
        downloadTask2.setStatus(downloadTask.getStatus());
        downloadTask2.setVer(downloadTask.getVer());
        downloadTask2.setCfg_ver(downloadTask.getCfg_ver());
        downloadTask2.setSource_ver(downloadTask.getSource_ver());
        getAdapter().notifyDataSetChanged();
    }

    private final void recivedDeleteFinal(CollectionBeanSubBusiness collectionBeanSubBusiness, DownloadTask downloadTask) {
        if (collectionBeanSubBusiness.getMod_info() != null) {
            DownloadTask downloadTask2 = this.downloadTasksMap.get(collectionBeanSubBusiness.getMod_info().getMod_game_id());
            DownloadTask downloadTask3 = this.downloadTasksMap.get(collectionBeanSubBusiness.getGame_id());
            if (downloadTask2 == null && downloadTask3 == null) {
                collectionBeanSubBusiness.setDownloadTask(null);
            } else if (downloadTask2 != null) {
                collectionBeanSubBusiness.setDownloadTask(downloadTask2);
            } else if (downloadTask3 != null) {
                collectionBeanSubBusiness.setDownloadTask(downloadTask3);
            } else if (Intrinsics.areEqual(collectionBeanSubBusiness.getGame_id(), downloadTask.getCrc_link_type_val())) {
                collectionBeanSubBusiness.setDownloadTask(null);
            }
        } else if (Intrinsics.areEqual(collectionBeanSubBusiness.getGame_id(), downloadTask.getCrc_link_type_val())) {
            collectionBeanSubBusiness.setDownloadTask(null);
        }
    }

    private final void updateDowStateList(DownloadTask downloadTask) {
        try {
            for (CommonListMainData commonListMainData : this.showDataList) {
                if (commonListMainData.getType() == 2) {
                    Object any = commonListMainData.getAny();
                    Intrinsics.checkNotNull(any, "null cannot be cast to non-null type com.join.mgps.business.CollectionBeanSubBusiness");
                    updateDowStateListFinal((CollectionBeanSubBusiness) any, downloadTask);
                } else if (commonListMainData.getType() == 3) {
                    Object any2 = commonListMainData.getAny();
                    Intrinsics.checkNotNull(any2, "null cannot be cast to non-null type com.join.kotlin.ui.findgame.data.FindChoiceBannerData");
                    CollectionBeanSubBusiness game_info = ((FindChoiceBannerData) any2).getGame_info();
                    Intrinsics.checkNotNullExpressionValue(game_info, "subp.game_info");
                    updateDowStateListFinal(game_info, downloadTask);
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private final void updateDowStateListFinal(CollectionBeanSubBusiness collectionBeanSubBusiness, DownloadTask downloadTask) {
        if (collectionBeanSubBusiness.getMod_info() != null) {
            ModInfoBean mod_info = collectionBeanSubBusiness.getMod_info();
            DownloadTask downloadTask2 = this.downloadTasksMap.get(mod_info.getMain_game_id());
            boolean z4 = true;
            boolean z5 = downloadTask2 != null && downloadTask2.getStatus() == 5;
            DownloadTask downloadTask3 = this.downloadTasksMap.get(mod_info.getMod_game_id());
            z4 = (downloadTask3 == null || downloadTask3.getStatus() != 5) ? false : false;
            if (z4 && z5) {
                if (Intrinsics.areEqual(downloadTask.getCrc_link_type_val(), collectionBeanSubBusiness.getCrc_sign_id())) {
                    collectionBeanSubBusiness.setDownloadTask(downloadTask);
                }
            } else if (z4) {
                if (collectionBeanSubBusiness.getMod_info() == null || !Intrinsics.areEqual(downloadTask.getCrc_link_type_val(), collectionBeanSubBusiness.getMod_info().getMod_game_id())) {
                    return;
                }
                collectionBeanSubBusiness.setDownloadTask(downloadTask);
            } else if (z5) {
                if (Intrinsics.areEqual(downloadTask.getCrc_link_type_val(), collectionBeanSubBusiness.getCrc_sign_id())) {
                    collectionBeanSubBusiness.setDownloadTask(downloadTask);
                }
            } else {
                DownloadTask F = collectionBeanSubBusiness.getMod_info() != null ? f.K().F(collectionBeanSubBusiness.getMod_info().getMod_game_id()) : null;
                if (F == null) {
                    F = f.K().F(collectionBeanSubBusiness.getCrc_sign_id());
                }
                if (F == null || !Intrinsics.areEqual(downloadTask.getCrc_link_type_val(), F.getCrc_link_type_val())) {
                    return;
                }
                collectionBeanSubBusiness.setDownloadTask(downloadTask);
            }
        } else if (Intrinsics.areEqual(collectionBeanSubBusiness.getGame_id(), downloadTask.getCrc_link_type_val())) {
            collectionBeanSubBusiness.setDownloadTask(downloadTask);
        }
    }

    private final void updateProgressPartly() {
        List<CommonListMainData> list = this.showDataList;
        if (list == null || list.isEmpty()) {
            return;
        }
        try {
            int findFirstVisibleItemPosition = this.manager.findFirstVisibleItemPosition();
            int findLastVisibleItemPosition = this.manager.findLastVisibleItemPosition();
            if (findFirstVisibleItemPosition <= findLastVisibleItemPosition) {
                while (findFirstVisibleItemPosition < this.showDataList.size()) {
                    if (findFirstVisibleItemPosition >= 0) {
                        CommonListMainData commonListMainData = this.showDataList.get(findFirstVisibleItemPosition);
                        if (commonListMainData.getType() == 2) {
                            Object any = commonListMainData.getAny();
                            Intrinsics.checkNotNull(any, "null cannot be cast to non-null type com.join.mgps.business.CollectionBeanSubBusiness");
                            DownloadTask downloadTask = ((CollectionBeanSubBusiness) any).getDownloadTask();
                            if (downloadTask != null && (downloadTask.getStatus() == 2 || downloadTask.getStatus() == 12)) {
                                getAdapter().notifyItemChanged(findFirstVisibleItemPosition, "progress");
                            }
                        }
                    }
                    if (findFirstVisibleItemPosition == findLastVisibleItemPosition) {
                        return;
                    }
                    findFirstVisibleItemPosition++;
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    @NotNull
    public final RecyclerView.Adapter<RecyclerView.ViewHolder> getAdapter() {
        RecyclerView.Adapter<RecyclerView.ViewHolder> adapter = this.adapter;
        if (adapter != null) {
            return adapter;
        }
        Intrinsics.throwUninitializedPropertyAccessException("adapter");
        return null;
    }

    @NotNull
    public final List<DownloadTask> getDownloadTasks() {
        List<DownloadTask> list = this.downloadTasks;
        if (list != null) {
            return list;
        }
        Intrinsics.throwUninitializedPropertyAccessException("downloadTasks");
        return null;
    }

    @NotNull
    public final Map<String, DownloadTask> getDownloadTasksMap() {
        return this.downloadTasksMap;
    }

    @NotNull
    public final LinearLayoutManager getManager() {
        return this.manager;
    }

    @NotNull
    public final RecyclerView getRecycleView() {
        return this.recycleView;
    }

    public final void initData(@NotNull RecyclerView.Adapter<RecyclerView.ViewHolder> adapterx) {
        Intrinsics.checkNotNullParameter(adapterx, "adapterx");
        List<DownloadTask> d5 = f.K().d();
        Intrinsics.checkNotNullExpressionValue(d5, "getInstance().findAll()");
        setDownloadTasks(d5);
        if (getDownloadTasks().size() > 0) {
            for (DownloadTask downloadTask : getDownloadTasks()) {
                Map<String, DownloadTask> map = this.downloadTasksMap;
                String crc_link_type_val = downloadTask.getCrc_link_type_val();
                Intrinsics.checkNotNullExpressionValue(crc_link_type_val, "task.crc_link_type_val");
                map.put(crc_link_type_val, downloadTask);
            }
        }
        setAdapter(adapterx);
    }

    public final void onEventMainThread(@NotNull n downloadTaskEvent) {
        Intrinsics.checkNotNullParameter(downloadTaskEvent, "downloadTaskEvent");
        DownloadTask a5 = downloadTaskEvent.a();
        int c5 = downloadTaskEvent.c();
        if (c5 != 2 && c5 != 3) {
            if (c5 != 5) {
                if (c5 == 6) {
                    receiveError(a5);
                    return;
                } else if (c5 == 7) {
                    receiveDelete(a5);
                    return;
                } else if (c5 == 8) {
                    if (!this.downloadTasksMap.isEmpty()) {
                        updateProgressPartly();
                        return;
                    }
                    return;
                } else if (c5 != 48) {
                    switch (c5) {
                        case 10:
                        case 12:
                        case 13:
                            break;
                        case 11:
                            break;
                        default:
                            return;
                    }
                }
            }
            receiveSuccess(a5);
            return;
        }
        receiveStart(a5);
    }

    public final void setAdapter(@NotNull RecyclerView.Adapter<RecyclerView.ViewHolder> adapter) {
        Intrinsics.checkNotNullParameter(adapter, "<set-?>");
        this.adapter = adapter;
    }

    public final void setDownloadTasks(@NotNull List<DownloadTask> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.downloadTasks = list;
    }

    public final void setDownloadTasksMap(@NotNull Map<String, DownloadTask> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.downloadTasksMap = map;
    }

    public final void setManager(@NotNull LinearLayoutManager linearLayoutManager) {
        Intrinsics.checkNotNullParameter(linearLayoutManager, "<set-?>");
        this.manager = linearLayoutManager;
    }

    public final void setRecycleView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "<set-?>");
        this.recycleView = recyclerView;
    }

    public final void updateDowState(@NotNull CollectionBeanSubBusiness sub) {
        Intrinsics.checkNotNullParameter(sub, "sub");
        if (sub.getMod_info() != null) {
            ModInfoBean mod_info = sub.getMod_info();
            DownloadTask downloadTask = this.downloadTasksMap.get(mod_info.getMain_game_id());
            boolean z4 = true;
            boolean z5 = downloadTask != null && downloadTask.getStatus() == 5;
            DownloadTask downloadTask2 = this.downloadTasksMap.get(mod_info.getMod_game_id());
            z4 = (downloadTask2 == null || downloadTask2.getStatus() != 5) ? false : false;
            if (z4 && z5) {
                if (Intrinsics.areEqual(downloadTask != null ? downloadTask.getCrc_link_type_val() : null, sub.getCrc_sign_id())) {
                    sub.setDownloadTask(downloadTask);
                    return;
                }
                return;
            } else if (z4) {
                if (sub.getMod_info() != null) {
                    if (Intrinsics.areEqual(downloadTask2 != null ? downloadTask2.getCrc_link_type_val() : null, sub.getMod_info().getMod_game_id())) {
                        sub.setDownloadTask(downloadTask2);
                        return;
                    }
                    return;
                }
                return;
            } else if (z5) {
                if (Intrinsics.areEqual(downloadTask != null ? downloadTask.getCrc_link_type_val() : null, sub.getCrc_sign_id())) {
                    sub.setDownloadTask(downloadTask);
                    return;
                }
                return;
            } else {
                DownloadTask F = sub.getMod_info() != null ? f.K().F(sub.getMod_info().getMod_game_id()) : null;
                if (F == null) {
                    F = f.K().F(sub.getCrc_sign_id());
                }
                sub.setDownloadTask(F);
                return;
            }
        }
        DownloadTask downloadTask3 = this.downloadTasksMap.get(sub.getGame_id());
        if (downloadTask3 != null) {
            sub.setDownloadTask(downloadTask3);
        }
    }
}
