package com.psk.kotlin.util;

import androidx.recyclerview.widget.RecyclerView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.kotlin.ui.findgame.data.FindChoiceBannerData;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.business.CollectionBeanSubBusiness;
import com.join.mgps.dto.ModInfoBean;
import com.join.mgps.event.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p1.f;
/* compiled from: DownloadViewPresenter.kt */
/* loaded from: classes5.dex */
public final class DownloadViewPresenter {
    public RecyclerView.Adapter<RecyclerView.ViewHolder> adapter;
    @NotNull
    private List<DownloadTask> downloadTasks;
    @NotNull
    private Map<String, DownloadTask> downloadTasksMap;
    @NotNull
    private List<CommonListMainData> showDataList;

    public DownloadViewPresenter(@NotNull List<CommonListMainData> showDataList) {
        Intrinsics.checkNotNullParameter(showDataList, "showDataList");
        this.showDataList = showDataList;
        this.downloadTasksMap = new LinkedHashMap();
        this.downloadTasks = new ArrayList();
    }

    private final void receiveDelete(DownloadTask downloadTask) {
        Iterator<DownloadTask> it2 = this.downloadTasks.iterator();
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
                        CollectionBeanSubBusiness collectionBeanSubBusiness = (CollectionBeanSubBusiness) any;
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
            this.downloadTasks.add(downloadTask);
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
            this.downloadTasks.add(downloadTask);
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

    private final void updateDowStateList(DownloadTask downloadTask) {
        try {
            for (CommonListMainData commonListMainData : this.showDataList) {
                if (commonListMainData.getType() == 3) {
                    Object any = commonListMainData.getAny();
                    Intrinsics.checkNotNull(any, "null cannot be cast to non-null type com.join.kotlin.ui.findgame.data.FindChoiceBannerData");
                    CollectionBeanSubBusiness game_info = ((FindChoiceBannerData) any).getGame_info();
                    Intrinsics.checkNotNullExpressionValue(game_info, "subp.game_info");
                    if (game_info.getMod_info() != null) {
                        ModInfoBean mod_info = game_info.getMod_info();
                        DownloadTask downloadTask2 = this.downloadTasksMap.get(mod_info.getMain_game_id());
                        boolean z4 = true;
                        boolean z5 = downloadTask2 != null && downloadTask2.getStatus() == 5;
                        DownloadTask downloadTask3 = this.downloadTasksMap.get(mod_info.getMod_game_id());
                        if (downloadTask3 == null || downloadTask3.getStatus() != 5) {
                            z4 = false;
                        }
                        if (z4 && z5) {
                            if (Intrinsics.areEqual(downloadTask.getCrc_link_type_val(), game_info.getCrc_sign_id())) {
                                game_info.setDownloadTask(downloadTask);
                                return;
                            }
                        } else if (z4) {
                            if (game_info.getMod_info() != null && Intrinsics.areEqual(downloadTask.getCrc_link_type_val(), game_info.getMod_info().getMod_game_id())) {
                                game_info.setDownloadTask(downloadTask);
                                return;
                            }
                        } else if (z5) {
                            if (Intrinsics.areEqual(downloadTask.getCrc_link_type_val(), game_info.getCrc_sign_id())) {
                                game_info.setDownloadTask(downloadTask);
                                return;
                            }
                        } else {
                            DownloadTask F = game_info.getMod_info() != null ? f.K().F(game_info.getMod_info().getMod_game_id()) : null;
                            if (F == null) {
                                F = f.K().F(game_info.getCrc_sign_id());
                            }
                            if (F != null && Intrinsics.areEqual(downloadTask.getCrc_link_type_val(), F.getCrc_link_type_val())) {
                                game_info.setDownloadTask(downloadTask);
                                return;
                            }
                        }
                    } else if (Intrinsics.areEqual(game_info.getGame_id(), downloadTask.getCrc_link_type_val())) {
                        game_info.setDownloadTask(downloadTask);
                        return;
                    }
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
        return this.downloadTasks;
    }

    @NotNull
    public final Map<String, DownloadTask> getDownloadTasksMap() {
        return this.downloadTasksMap;
    }

    public final void initData(@NotNull RecyclerView.Adapter<RecyclerView.ViewHolder> adapterx) {
        Intrinsics.checkNotNullParameter(adapterx, "adapterx");
        List<DownloadTask> d5 = f.K().d();
        Intrinsics.checkNotNullExpressionValue(d5, "getInstance().findAll()");
        this.downloadTasks = d5;
        if (d5.size() > 0) {
            for (DownloadTask downloadTask : this.downloadTasks) {
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

    public final void updateDowState(@NotNull CollectionBeanSubBusiness collectionBeanSubBusiness) {
        Intrinsics.checkNotNullParameter(collectionBeanSubBusiness, "collectionBeanSubBusiness");
        if (this.downloadTasksMap.get(collectionBeanSubBusiness.getGame_id()) != null) {
            collectionBeanSubBusiness.setDownloadTask(this.downloadTasksMap.get(collectionBeanSubBusiness.getGame_id()));
        }
    }
}
