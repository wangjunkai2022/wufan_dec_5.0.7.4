package com.join.kotlin.ui.base;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.business.CollectionBeanSubBusiness;
import com.join.mgps.dto.ModInfoBean;
import com.join.mgps.event.n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p1.f;
/* compiled from: BaseHasDownloadActivityViewModle.kt */
@SourceDebugExtension({"SMAP\nBaseHasDownloadActivityViewModle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseHasDownloadActivityViewModle.kt\ncom/join/kotlin/ui/base/BaseHasDownloadActivityViewModle\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,230:1\n1#2:231\n*E\n"})
/* loaded from: classes3.dex */
public abstract class BaseHasDownloadActivityViewModle extends ViewModel {
    @NotNull
    private MutableLiveData<HashMap<String, DownloadTask>> downloadTasksMap = new MutableLiveData<>();
    @NotNull
    private MutableLiveData<ArrayList<DownloadTask>> downloadTasks = new MutableLiveData<>();

    public BaseHasDownloadActivityViewModle() {
        List<DownloadTask> d5 = f.K().d();
        this.downloadTasks.setValue(new ArrayList<>());
        this.downloadTasksMap.setValue(new HashMap<>());
        MutableLiveData<ArrayList<DownloadTask>> mutableLiveData = this.downloadTasks;
        Intrinsics.checkNotNull(d5, "null cannot be cast to non-null type java.util.ArrayList<com.github.snowdream.android.app.downloader.DownloadTask>{ kotlin.collections.TypeAliasesKt.ArrayList<com.github.snowdream.android.app.downloader.DownloadTask> }");
        mutableLiveData.setValue((ArrayList) d5);
        if (d5.size() > 0) {
            for (DownloadTask downloadTask : d5) {
                HashMap<String, DownloadTask> value = this.downloadTasksMap.getValue();
                if (value != null) {
                    value.put(downloadTask.getCrc_link_type_val(), downloadTask);
                }
            }
        }
    }

    private final void receiveDelete(final DownloadTask downloadTask) {
        ArrayList<DownloadTask> value = this.downloadTasks.getValue();
        Intrinsics.checkNotNull(value);
        Iterator<DownloadTask> it2 = value.iterator();
        Intrinsics.checkNotNullExpressionValue(it2, "downloadTasks.value!!.iterator()");
        while (it2.hasNext()) {
            DownloadTask next = it2.next();
            Intrinsics.checkNotNullExpressionValue(next, "iterator.next()");
            DownloadTask downloadTask2 = next;
            String crc_link_type_val = downloadTask2.getCrc_link_type_val();
            Intrinsics.checkNotNull(downloadTask);
            if (Intrinsics.areEqual(crc_link_type_val, downloadTask.getCrc_link_type_val())) {
                HashMap<String, DownloadTask> value2 = this.downloadTasksMap.getValue();
                Intrinsics.checkNotNull(value2);
                value2.remove(downloadTask2.getCrc_link_type_val());
                it2.remove();
                updateDowStateList(downloadTask, new Function1<CollectionBeanSubBusiness, Unit>() { // from class: com.join.kotlin.ui.base.BaseHasDownloadActivityViewModle$receiveDelete$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(CollectionBeanSubBusiness collectionBeanSubBusiness) {
                        invoke2(collectionBeanSubBusiness);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull CollectionBeanSubBusiness it3) {
                        Intrinsics.checkNotNullParameter(it3, "it");
                        BaseHasDownloadActivityViewModle.this.recivedDeleteFinal(it3, downloadTask);
                    }
                });
                return;
            }
        }
    }

    private final void receiveError(DownloadTask downloadTask) {
        MutableLiveData<HashMap<String, DownloadTask>> mutableLiveData = this.downloadTasksMap;
        if (mutableLiveData == null || downloadTask == null) {
            return;
        }
        try {
            HashMap<String, DownloadTask> value = mutableLiveData.getValue();
            Intrinsics.checkNotNull(value);
            UtilsMy.x4(value.get(downloadTask.getCrc_link_type_val()));
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private final void receiveStart(final DownloadTask downloadTask) {
        UtilsMy.x4(downloadTask);
        HashMap<String, DownloadTask> value = this.downloadTasksMap.getValue();
        Intrinsics.checkNotNull(value);
        Intrinsics.checkNotNull(downloadTask);
        if (!value.containsKey(downloadTask.getCrc_link_type_val())) {
            ArrayList<DownloadTask> value2 = this.downloadTasks.getValue();
            Intrinsics.checkNotNull(value2);
            value2.add(downloadTask);
            HashMap<String, DownloadTask> value3 = this.downloadTasksMap.getValue();
            Intrinsics.checkNotNull(value3);
            String crc_link_type_val = downloadTask.getCrc_link_type_val();
            Intrinsics.checkNotNullExpressionValue(crc_link_type_val, "downloadTask.crc_link_type_val");
            value3.put(crc_link_type_val, downloadTask);
        }
        updateDowStateList(downloadTask, new Function1<CollectionBeanSubBusiness, Unit>() { // from class: com.join.kotlin.ui.base.BaseHasDownloadActivityViewModle$receiveStart$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(CollectionBeanSubBusiness collectionBeanSubBusiness) {
                invoke2(collectionBeanSubBusiness);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull CollectionBeanSubBusiness it2) {
                Intrinsics.checkNotNullParameter(it2, "it");
                BaseHasDownloadActivityViewModle.this.updateDowStateListFinal(it2, downloadTask);
            }
        });
    }

    private final void receiveSuccess(final DownloadTask downloadTask) {
        MutableLiveData<HashMap<String, DownloadTask>> mutableLiveData = this.downloadTasksMap;
        if (mutableLiveData == null || downloadTask == null) {
            return;
        }
        HashMap<String, DownloadTask> value = mutableLiveData.getValue();
        Intrinsics.checkNotNull(value);
        if (!value.containsKey(downloadTask.getCrc_link_type_val())) {
            ArrayList<DownloadTask> value2 = this.downloadTasks.getValue();
            Intrinsics.checkNotNull(value2);
            value2.add(downloadTask);
            HashMap<String, DownloadTask> value3 = this.downloadTasksMap.getValue();
            Intrinsics.checkNotNull(value3);
            String crc_link_type_val = downloadTask.getCrc_link_type_val();
            Intrinsics.checkNotNullExpressionValue(crc_link_type_val, "downloadTask.crc_link_type_val");
            value3.put(crc_link_type_val, downloadTask);
        }
        updateDowStateList(downloadTask, new Function1<CollectionBeanSubBusiness, Unit>() { // from class: com.join.kotlin.ui.base.BaseHasDownloadActivityViewModle$receiveSuccess$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(CollectionBeanSubBusiness collectionBeanSubBusiness) {
                invoke2(collectionBeanSubBusiness);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull CollectionBeanSubBusiness it2) {
                Intrinsics.checkNotNullParameter(it2, "it");
                BaseHasDownloadActivityViewModle.this.updateDowStateListFinal(it2, downloadTask);
            }
        });
        HashMap<String, DownloadTask> value4 = this.downloadTasksMap.getValue();
        Intrinsics.checkNotNull(value4);
        DownloadTask downloadTask2 = value4.get(downloadTask.getCrc_link_type_val());
        if (downloadTask2 == null) {
            return;
        }
        downloadTask2.setStatus(downloadTask.getStatus());
        downloadTask2.setVer(downloadTask.getVer());
        downloadTask2.setCfg_ver(downloadTask.getCfg_ver());
        downloadTask2.setSource_ver(downloadTask.getSource_ver());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateDowStateListFinal(CollectionBeanSubBusiness collectionBeanSubBusiness, DownloadTask downloadTask) {
        if (collectionBeanSubBusiness.getMod_info() != null) {
            ModInfoBean mod_info = collectionBeanSubBusiness.getMod_info();
            HashMap<String, DownloadTask> value = this.downloadTasksMap.getValue();
            Intrinsics.checkNotNull(value);
            DownloadTask downloadTask2 = value.get(mod_info.getMain_game_id());
            boolean z4 = true;
            boolean z5 = downloadTask2 != null && downloadTask2.getStatus() == 5;
            HashMap<String, DownloadTask> value2 = this.downloadTasksMap.getValue();
            Intrinsics.checkNotNull(value2);
            DownloadTask downloadTask3 = value2.get(mod_info.getMod_game_id());
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

    @NotNull
    public final MutableLiveData<ArrayList<DownloadTask>> getDownloadTasks() {
        return this.downloadTasks;
    }

    @NotNull
    public final MutableLiveData<HashMap<String, DownloadTask>> getDownloadTasksMap() {
        return this.downloadTasksMap;
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
                    HashMap<String, DownloadTask> value = this.downloadTasksMap.getValue();
                    Intrinsics.checkNotNull(value);
                    if (!value.isEmpty()) {
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

    /* JADX INFO: Access modifiers changed from: protected */
    public final void recivedDeleteFinal(@NotNull CollectionBeanSubBusiness item, @NotNull DownloadTask downloadTask) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(downloadTask, "downloadTask");
        if (item.getMod_info() != null) {
            HashMap<String, DownloadTask> value = this.downloadTasksMap.getValue();
            Intrinsics.checkNotNull(value);
            DownloadTask downloadTask2 = value.get(item.getMod_info().getMod_game_id());
            HashMap<String, DownloadTask> value2 = this.downloadTasksMap.getValue();
            Intrinsics.checkNotNull(value2);
            DownloadTask downloadTask3 = value2.get(item.getGame_id());
            if (downloadTask2 == null && downloadTask3 == null) {
                item.setDownloadTask(null);
            } else if (downloadTask2 != null) {
                item.setDownloadTask(downloadTask2);
            } else if (downloadTask3 != null) {
                item.setDownloadTask(downloadTask3);
            } else if (Intrinsics.areEqual(item.getGame_id(), downloadTask.getCrc_link_type_val())) {
                item.setDownloadTask(null);
            }
        } else if (Intrinsics.areEqual(item.getGame_id(), downloadTask.getCrc_link_type_val())) {
            item.setDownloadTask(null);
        }
    }

    public final void setDownloadTasks(@NotNull MutableLiveData<ArrayList<DownloadTask>> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.downloadTasks = mutableLiveData;
    }

    public final void setDownloadTasksMap(@NotNull MutableLiveData<HashMap<String, DownloadTask>> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.downloadTasksMap = mutableLiveData;
    }

    public final void updateDowState(@NotNull CollectionBeanSubBusiness sub) {
        Intrinsics.checkNotNullParameter(sub, "sub");
        if (sub.getMod_info() != null) {
            ModInfoBean mod_info = sub.getMod_info();
            HashMap<String, DownloadTask> value = this.downloadTasksMap.getValue();
            Intrinsics.checkNotNull(value);
            DownloadTask downloadTask = value.get(mod_info.getMain_game_id());
            boolean z4 = true;
            boolean z5 = downloadTask != null && downloadTask.getStatus() == 5;
            HashMap<String, DownloadTask> value2 = this.downloadTasksMap.getValue();
            Intrinsics.checkNotNull(value2);
            DownloadTask downloadTask2 = value2.get(mod_info.getMod_game_id());
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
        HashMap<String, DownloadTask> value3 = this.downloadTasksMap.getValue();
        Intrinsics.checkNotNull(value3);
        DownloadTask downloadTask3 = value3.get(sub.getGame_id());
        if (downloadTask3 != null) {
            sub.setDownloadTask(downloadTask3);
        }
    }

    public abstract void updateDowStateList(@NotNull DownloadTask downloadTask, @NotNull Function1<? super CollectionBeanSubBusiness, Unit> function1);

    public abstract void updateProgressPartly();
}
