package com.join.kotlin.ui.cloudarchive;

import android.content.Context;
import android.os.Environment;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.join.android.app.common.utils.JsonMapper;
import com.join.kotlin.domain.common.LoadBindindData;
import com.join.kotlin.ui.cloudarchive.adapter.ModArchiveAdapter;
import com.join.kotlin.ui.cloudarchive.data.ArchiveArgs;
import com.join.kotlin.ui.cloudarchive.data.ArchiveData;
import com.join.kotlin.ui.cloudarchive.data.ArchiveDownEvent;
import com.join.kotlin.ui.cloudarchive.data.ModDataRequest;
import com.join.kotlin.ui.cloudarchive.data.ModGameArchivePathData;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.Util.d0;
import com.join.mgps.Util.l2;
import com.join.mgps.Util.u;
import com.join.mgps.db.tables.CloudArchiveTable;
import com.join.mgps.dto.RequestModel;
import com.join.mgps.dto.ResponseModel;
import com.join.mgps.mod.utils.PluginConfig;
import com.papa.sim.statistic.Event;
import com.papa.sim.statistic.Ext;
import com.psk.kotlin.util.CommonListMainData;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.d1;
import kotlinx.coroutines.s1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
/* compiled from: ModGameCloudViewModle.kt */
@SourceDebugExtension({"SMAP\nModGameCloudViewModle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModGameCloudViewModle.kt\ncom/join/kotlin/ui/cloudarchive/ModGameCloudViewModle\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,724:1\n766#2:725\n857#2,2:726\n1011#2,2:728\n*S KotlinDebug\n*F\n+ 1 ModGameCloudViewModle.kt\ncom/join/kotlin/ui/cloudarchive/ModGameCloudViewModle\n*L\n370#1:725\n370#1:726,2\n108#1:728,2\n*E\n"})
/* loaded from: classes3.dex */
public final class ModGameCloudViewModle extends ViewModel {
    private int changeNUmber;
    @NotNull
    private MutableLiveData<List<CommonListMainData>> listArchive = new MutableLiveData<>();
    @NotNull
    private MutableLiveData<ModGameArchivePathData> cloud_archive_local_path = new MutableLiveData<>();
    @NotNull
    private MutableLiveData<List<ArchiveData>> localAllArchive = new MutableLiveData<>();
    @NotNull
    private ModDataRequest request = new ModDataRequest();
    @NotNull
    private String packageName = "";
    @NotNull
    private MutableLiveData<Integer> showPosition = new MutableLiveData<>();
    @NotNull
    private MutableLiveData<LoadBindindData> loadBindData = new MutableLiveData<>();

    public ModGameCloudViewModle() {
        this.listArchive.setValue(new ArrayList());
        this.showPosition.setValue(1);
    }

    private final void changeLocalDataDel(ArchiveData archiveData) {
        ArrayList arrayList;
        List<ArchiveData> value;
        List<ArchiveData> value2 = this.localAllArchive.getValue();
        if (value2 != null) {
            arrayList = new ArrayList();
            for (Object obj : value2) {
                if (Intrinsics.areEqual(((ArchiveData) obj).getId(), archiveData.getId())) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList == null || !(!arrayList.isEmpty()) || (value = this.localAllArchive.getValue()) == null) {
            return;
        }
        value.remove(arrayList.get(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadAllArchives$lambda$1(ModGameArchivePathData modGameArchivePathData, List list, ModGameCloudViewModle this$0, final long j4) {
        Intrinsics.checkNotNullParameter(modGameArchivePathData, "$modGameArchivePathData");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        List<CloudArchiveTable> q4 = b2.g.t().q(modGameArchivePathData.getGameId());
        ArrayList arrayList = new ArrayList();
        if (list != null && (list.isEmpty() ^ true)) {
            arrayList.add(list.get(0));
        }
        if (q4 != null) {
            for (CloudArchiveTable cloudArchiveTable : q4) {
                ArchiveData archiveData = (ArchiveData) JsonMapper.getInstance().fromJson(cloudArchiveTable.getArchiveDataJson(), ArchiveData.class);
                archiveData.setUserId(cloudArchiveTable.getUserId());
                archiveData.setArchiveLocalZipPath(cloudArchiveTable.getArchiveZipPath());
                archiveData.setArchiveLocalPath(cloudArchiveTable.getArchiveFiles());
                archiveData.setMainArchiveLocalPath(cloudArchiveTable.getArchiveFolder());
                archiveData.setMainArchiveLocalPath2(cloudArchiveTable.getMainArchiveLocalPath2());
                archiveData.setId(cloudArchiveTable.getArchiveId());
                archiveData.setIsFirstRun(cloudArchiveTable.getIsFirstRun());
                Intrinsics.checkNotNullExpressionValue(archiveData, "archiveData");
                arrayList.add(archiveData);
            }
        }
        if (arrayList.size() > 1) {
            CollectionsKt__MutableCollectionsJVMKt.sortWith(arrayList, new Comparator() { // from class: com.join.kotlin.ui.cloudarchive.ModGameCloudViewModle$loadAllArchives$lambda$1$$inlined$sortByDescending$1
                @Override // java.util.Comparator
                public final int compare(T t4, T t5) {
                    long addTime;
                    int compareValues;
                    ArchiveData archiveData2 = (ArchiveData) t5;
                    long j5 = 2147483646;
                    if (Intrinsics.areEqual(archiveData2.getId(), "0")) {
                        addTime = 2147483647L;
                    } else {
                        addTime = Intrinsics.areEqual(archiveData2.getId(), String.valueOf(j4)) ? 2147483646L : archiveData2.getAddTime();
                    }
                    Long valueOf = Long.valueOf(addTime);
                    ArchiveData archiveData3 = (ArchiveData) t4;
                    if (Intrinsics.areEqual(archiveData3.getId(), "0")) {
                        j5 = 2147483647L;
                    } else if (!Intrinsics.areEqual(archiveData3.getId(), String.valueOf(j4))) {
                        j5 = archiveData3.getAddTime();
                    }
                    compareValues = ComparisonsKt__ComparisonsKt.compareValues(valueOf, Long.valueOf(j5));
                    return compareValues;
                }
            });
        }
        this$0.localAllArchive.postValue(arrayList);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x01af, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual(((com.join.kotlin.ui.cloudarchive.data.ArchiveData) r15).getId(), "0") != false) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void locallAddArchive(com.join.kotlin.ui.cloudarchive.data.ArchiveData r15) {
        /*
            Method dump skipped, instructions count: 473
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.kotlin.ui.cloudarchive.ModGameCloudViewModle.locallAddArchive(com.join.kotlin.ui.cloudarchive.data.ArchiveData):void");
    }

    public final void commentArchive(@NotNull final Context context, @NotNull final ArchiveData archiveData, @NotNull String type, final int i4) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(archiveData, "archiveData");
        Intrinsics.checkNotNullParameter(type, "type");
        if (archiveData.getIsFirstRun() <= 1) {
            l2.a(context).b("请先启动此存档后再点评");
            return;
        }
        RequestModel requestModel = new RequestModel();
        requestModel.setDefault(context);
        ArchiveArgs archiveArgs = new ArchiveArgs();
        archiveArgs.setArchiveId(archiveData.getId());
        archiveArgs.setGameId(archiveData.getGame_id());
        archiveArgs.setCommentType(type);
        archiveArgs.setUid(AccountUtil_.getInstance_(context).getAccountData().getUid());
        requestModel.setArgs(archiveArgs);
        if (Intrinsics.areEqual(type, "NEGATIVE")) {
            com.join.mgps.rpc.impl.i.D0().B0().B0(requestModel.makeSign()).enqueue(new Callback<ResponseModel<?>>() { // from class: com.join.kotlin.ui.cloudarchive.ModGameCloudViewModle$commentArchive$1
                @Override // retrofit2.Callback
                public void onFailure(@NotNull Call<ResponseModel<?>> call, @NotNull Throwable t4) {
                    Intrinsics.checkNotNullParameter(call, "call");
                    Intrinsics.checkNotNullParameter(t4, "t");
                }

                @Override // retrofit2.Callback
                public void onResponse(@NotNull Call<ResponseModel<?>> call, @NotNull Response<ResponseModel<?>> response) {
                    Intrinsics.checkNotNullParameter(call, "call");
                    Intrinsics.checkNotNullParameter(response, "response");
                    ResponseModel<?> body = response.body();
                    boolean z4 = false;
                    if (body != null && body.getCode() == 200) {
                        z4 = true;
                    }
                    if (z4) {
                        ArchiveData.this.setIsUnLike(1);
                        ArchiveData archiveData2 = ArchiveData.this;
                        archiveData2.setNegativeCount(archiveData2.getNegativeCount() + 1);
                        archiveData2.setNegativeCount(archiveData2.getNegativeCount());
                        d0.a().c(new ArchiveDownEvent(10, ArchiveData.this));
                        this.getListArchive().setValue(this.getListArchive().getValue());
                        if (i4 == 1) {
                            com.papa.sim.statistic.p l4 = com.papa.sim.statistic.p.l(context);
                            Event event = Event.giveCloudDisLike;
                            Ext from = new Ext().setFrom("1");
                            ArchiveData archiveData3 = ArchiveData.this;
                            l4.O1(event, from.setGameId(archiveData3 != null ? archiveData3.getGame_id() : null));
                            return;
                        }
                        com.papa.sim.statistic.p l5 = com.papa.sim.statistic.p.l(context);
                        Event event2 = Event.giveCloudDisLike;
                        Ext from2 = new Ext().setFrom("2");
                        ArchiveData archiveData4 = ArchiveData.this;
                        l5.O1(event2, from2.setGameId(archiveData4 != null ? archiveData4.getGame_id() : null));
                        return;
                    }
                    l2 a5 = l2.a(context);
                    ResponseModel<?> body2 = response.body();
                    a5.b(body2 != null ? body2.getMessage() : null);
                }
            });
        } else if (archiveData.getIsLike() == 0) {
            com.join.mgps.rpc.impl.i.D0().B0().B0(requestModel.makeSign()).enqueue(new Callback<ResponseModel<?>>() { // from class: com.join.kotlin.ui.cloudarchive.ModGameCloudViewModle$commentArchive$2
                @Override // retrofit2.Callback
                public void onFailure(@NotNull Call<ResponseModel<?>> call, @NotNull Throwable t4) {
                    Intrinsics.checkNotNullParameter(call, "call");
                    Intrinsics.checkNotNullParameter(t4, "t");
                }

                @Override // retrofit2.Callback
                public void onResponse(@NotNull Call<ResponseModel<?>> call, @NotNull Response<ResponseModel<?>> response) {
                    Intrinsics.checkNotNullParameter(call, "call");
                    Intrinsics.checkNotNullParameter(response, "response");
                    ResponseModel<?> body = response.body();
                    boolean z4 = false;
                    if (body != null && body.getCode() == 200) {
                        z4 = true;
                    }
                    if (z4) {
                        ArchiveData.this.setIsLike(1);
                        ArchiveData archiveData2 = ArchiveData.this;
                        archiveData2.setLikeCount(archiveData2.getLikeCount() + 1);
                        archiveData2.setLikeCount(archiveData2.getLikeCount());
                        d0.a().c(new ArchiveDownEvent(10, ArchiveData.this));
                        this.getListArchive().setValue(this.getListArchive().getValue());
                        if (i4 == 1) {
                            com.papa.sim.statistic.p l4 = com.papa.sim.statistic.p.l(context);
                            Event event = Event.giveCloudLike;
                            Ext from = new Ext().setFrom("1");
                            ArchiveData archiveData3 = ArchiveData.this;
                            l4.O1(event, from.setGameId(archiveData3 != null ? archiveData3.getGame_id() : null));
                            return;
                        }
                        com.papa.sim.statistic.p l5 = com.papa.sim.statistic.p.l(context);
                        Event event2 = Event.giveCloudLike;
                        Ext from2 = new Ext().setFrom("2");
                        ArchiveData archiveData4 = ArchiveData.this;
                        l5.O1(event2, from2.setGameId(archiveData4 != null ? archiveData4.getGame_id() : null));
                        return;
                    }
                    l2 a5 = l2.a(context);
                    ResponseModel<?> body2 = response.body();
                    a5.b(body2 != null ? body2.getMessage() : null);
                }
            });
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.String] */
    public final void copyArchive(@NotNull Function1<? super Boolean, Unit> func) {
        String replace$default;
        Intrinsics.checkNotNullParameter(func, "func");
        String b02 = com.join.mgps.va.overmind.f.f54952a.b0();
        ModGameArchivePathData value = this.cloud_archive_local_path.getValue();
        Intrinsics.checkNotNull(value);
        String mainArchiveLocalPath = value.getMainArchiveLocalPath();
        Intrinsics.checkNotNullExpressionValue(mainArchiveLocalPath, "cloud_archive_local_path…ue!!.mainArchiveLocalPath");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = b02 + mainArchiveLocalPath;
        StringBuilder sb = new StringBuilder();
        sb.append(Environment.getExternalStorageDirectory().getAbsolutePath());
        ModGameArchivePathData value2 = this.cloud_archive_local_path.getValue();
        Intrinsics.checkNotNull(value2);
        String modPackageName = value2.getModPackageName();
        Intrinsics.checkNotNullExpressionValue(modPackageName, "cloud_archive_local_path.value!!.modPackageName");
        ModGameArchivePathData value3 = this.cloud_archive_local_path.getValue();
        Intrinsics.checkNotNull(value3);
        String mainGamePackageName = value3.getMainGamePackageName();
        Intrinsics.checkNotNullExpressionValue(mainGamePackageName, "cloud_archive_local_path…lue!!.mainGamePackageName");
        replace$default = StringsKt__StringsJVMKt.replace$default(mainArchiveLocalPath, modPackageName, mainGamePackageName, false, 4, (Object) null);
        sb.append(replace$default);
        String sb2 = sb.toString();
        File file = new File(sb2);
        if (file.exists()) {
            File[] listFiles = file.listFiles();
            Intrinsics.checkNotNullExpressionValue(listFiles, "file.listFiles()");
            if (!(listFiles.length == 0)) {
                kotlinx.coroutines.k.f(s1.f71252b, d1.e(), null, new ModGameCloudViewModle$copyArchive$1(func, sb2, objectRef, null), 2, null);
                return;
            }
        }
        func.invoke(Boolean.FALSE);
    }

    public final void delMyArchiveFromCloud(@NotNull final Context context, @NotNull final ArchiveData archiveData) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(archiveData, "archiveData");
        RequestModel requestModel = new RequestModel();
        requestModel.setDefault(context);
        ArchiveArgs archiveArgs = new ArchiveArgs();
        archiveArgs.setArchiveId(archiveData.getId());
        archiveArgs.setGameId(archiveData.getGame_id());
        archiveArgs.setUid(AccountUtil_.getInstance_(context).getAccountData().getUid());
        requestModel.setArgs(archiveArgs);
        com.join.mgps.rpc.impl.i.D0().B0().J0(requestModel.makeSign()).enqueue(new Callback<ResponseModel<?>>() { // from class: com.join.kotlin.ui.cloudarchive.ModGameCloudViewModle$delMyArchiveFromCloud$1
            @Override // retrofit2.Callback
            public void onFailure(@NotNull Call<ResponseModel<?>> call, @NotNull Throwable t4) {
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(t4, "t");
            }

            @Override // retrofit2.Callback
            public void onResponse(@NotNull Call<ResponseModel<?>> call, @NotNull Response<ResponseModel<?>> response) {
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(response, "response");
                ResponseModel<?> body = response.body();
                boolean z4 = false;
                if (body != null && body.getCode() == 200) {
                    z4 = true;
                }
                if (z4) {
                    List<CommonListMainData> value = ModGameCloudViewModle.this.getListArchive().getValue();
                    Intrinsics.checkNotNull(value);
                    for (int size = value.size() - 1; -1 < size; size--) {
                        List<CommonListMainData> value2 = ModGameCloudViewModle.this.getListArchive().getValue();
                        Intrinsics.checkNotNull(value2);
                        if (value2.get(size).getAny() instanceof ArchiveData) {
                            List<CommonListMainData> value3 = ModGameCloudViewModle.this.getListArchive().getValue();
                            Intrinsics.checkNotNull(value3);
                            Object any = value3.get(size).getAny();
                            Intrinsics.checkNotNull(any, "null cannot be cast to non-null type com.join.kotlin.ui.cloudarchive.data.ArchiveData");
                            if (Intrinsics.areEqual(((ArchiveData) any).getId(), archiveData.getId())) {
                                List<CommonListMainData> value4 = ModGameCloudViewModle.this.getListArchive().getValue();
                                Intrinsics.checkNotNull(value4);
                                value4.remove(size);
                                ModGameCloudViewModle.this.getListArchive().setValue(ModGameCloudViewModle.this.getListArchive().getValue());
                                return;
                            }
                        }
                    }
                    return;
                }
                l2.a(context).b(response.message());
            }
        });
    }

    public final void delMyDownloadArchive(@NotNull final Context context, @NotNull ArchiveData archiveData) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(archiveData, "archiveData");
        boolean z4 = false;
        if (!Intrinsics.areEqual(archiveData.getId(), "0")) {
            b2.g.t().o(archiveData.getPackageName(), archiveData.getId());
            List<CommonListMainData> value = this.listArchive.getValue();
            Intrinsics.checkNotNull(value);
            int size = value.size() - 1;
            while (true) {
                if (-1 >= size) {
                    break;
                }
                List<CommonListMainData> value2 = this.listArchive.getValue();
                Intrinsics.checkNotNull(value2);
                if (value2.get(size).getAny() instanceof ArchiveData) {
                    List<CommonListMainData> value3 = this.listArchive.getValue();
                    Intrinsics.checkNotNull(value3);
                    Object any = value3.get(size).getAny();
                    Intrinsics.checkNotNull(any, "null cannot be cast to non-null type com.join.kotlin.ui.cloudarchive.data.ArchiveData");
                    if (Intrinsics.areEqual(((ArchiveData) any).getId(), archiveData.getId())) {
                        List<CommonListMainData> value4 = this.listArchive.getValue();
                        Intrinsics.checkNotNull(value4);
                        value4.remove(size);
                        MutableLiveData<List<CommonListMainData>> mutableLiveData = this.listArchive;
                        mutableLiveData.setValue(mutableLiveData.getValue());
                        break;
                    }
                }
                size--;
            }
            List<ArchiveData> value5 = this.localAllArchive.getValue();
            Intrinsics.checkNotNull(value5);
            int size2 = value5.size() - 1;
            while (true) {
                if (-1 >= size2) {
                    break;
                }
                List<ArchiveData> value6 = this.localAllArchive.getValue();
                Intrinsics.checkNotNull(value6);
                ArchiveData archiveData2 = value6.get(size2);
                Intrinsics.checkNotNull(archiveData2, "null cannot be cast to non-null type com.join.kotlin.ui.cloudarchive.data.ArchiveData");
                if (Intrinsics.areEqual(archiveData2.getId(), archiveData.getId())) {
                    List<ArchiveData> value7 = this.localAllArchive.getValue();
                    Intrinsics.checkNotNull(value7);
                    value7.remove(size2);
                    break;
                }
                size2--;
            }
        } else {
            archiveData.setArchiveDesc("我的默认存档(暂无)");
            archiveData.setAddTime(0L);
            archiveData.setShowText("启动");
            archiveData.setStatus(8);
            archiveData.setId("0");
            archiveData.setUserId(0);
            CloudArchiveTable s4 = b2.g.t().s(archiveData.getGame_id(), 0);
            if (s4 != null) {
                ArchiveData archiveData3 = (ArchiveData) JsonMapper.getInstance().fromJson(s4.getArchiveDataJson(), ArchiveData.class);
                archiveData3.setUserId(s4.getUserId());
                archiveData3.setId(s4.getArchiveId());
                Intrinsics.checkNotNullExpressionValue(archiveData3, "archiveData");
                delMyDownloadArchive(context, archiveData3);
            }
            List<CommonListMainData> value8 = this.listArchive.getValue();
            Intrinsics.checkNotNull(value8);
            int size3 = value8.size() - 1;
            while (true) {
                if (-1 >= size3) {
                    break;
                }
                List<CommonListMainData> value9 = this.listArchive.getValue();
                Intrinsics.checkNotNull(value9);
                if (value9.get(size3).getAny() instanceof ArchiveData) {
                    List<CommonListMainData> value10 = this.listArchive.getValue();
                    Intrinsics.checkNotNull(value10);
                    Object any2 = value10.get(size3).getAny();
                    Intrinsics.checkNotNull(any2, "null cannot be cast to non-null type com.join.kotlin.ui.cloudarchive.data.ArchiveData");
                    if (Intrinsics.areEqual(((ArchiveData) any2).getId(), archiveData.getId())) {
                        List<CommonListMainData> value11 = this.listArchive.getValue();
                        Intrinsics.checkNotNull(value11);
                        value11.remove(size3);
                        MutableLiveData<List<CommonListMainData>> mutableLiveData2 = this.listArchive;
                        mutableLiveData2.setValue(mutableLiveData2.getValue());
                        break;
                    }
                }
                size3--;
            }
            List<ArchiveData> value12 = this.localAllArchive.getValue();
            Intrinsics.checkNotNull(value12);
            int size4 = value12.size() - 1;
            while (true) {
                if (-1 >= size4) {
                    break;
                }
                List<ArchiveData> value13 = this.localAllArchive.getValue();
                Intrinsics.checkNotNull(value13);
                ArchiveData archiveData4 = value13.get(size4);
                Intrinsics.checkNotNull(archiveData4, "null cannot be cast to non-null type com.join.kotlin.ui.cloudarchive.data.ArchiveData");
                if (Intrinsics.areEqual(archiveData4.getId(), archiveData.getId())) {
                    List<ArchiveData> value14 = this.localAllArchive.getValue();
                    Intrinsics.checkNotNull(value14);
                    value14.remove(size4);
                    break;
                }
                size4--;
            }
        }
        String id = archiveData.getId();
        if (!((id == null || id.length() == 0) ? true : true)) {
            if (Intrinsics.areEqual(archiveData.getId(), "0")) {
                String archiveLocalPath = archiveData.getArchiveLocalPath();
                if (archiveLocalPath != null) {
                    UtilsMy.delete(new File(archiveLocalPath));
                }
            } else {
                d0.a().c(new ArchiveDownEvent(9, archiveData));
                if (archiveData.getArchiveLocalZipPath() != null) {
                    UtilsMy.delete(new File(archiveData.getArchiveLocalZipPath()));
                }
                if (archiveData.getUserId() != 0) {
                    com.join.mgps.va.overmind.d.f54937g.d().m0(archiveData.getPackageName(), archiveData.getUserId());
                }
            }
        }
        updateItemData(archiveData);
        if (Intrinsics.areEqual(archiveData.getId(), "0")) {
            return;
        }
        RequestModel requestModel = new RequestModel();
        requestModel.setDefault(context);
        ArchiveArgs archiveArgs = new ArchiveArgs();
        archiveArgs.setArchiveId(archiveData.getId());
        archiveArgs.setGameId(archiveData.getGame_id());
        archiveArgs.setUid(AccountUtil_.getInstance_(context).getAccountData().getUid());
        requestModel.setArgs(archiveArgs);
        com.join.mgps.rpc.impl.i.D0().B0().V0(requestModel.makeSign()).enqueue(new Callback<ResponseModel<?>>() { // from class: com.join.kotlin.ui.cloudarchive.ModGameCloudViewModle$delMyDownloadArchive$1
            @Override // retrofit2.Callback
            public void onFailure(@NotNull Call<ResponseModel<?>> call, @NotNull Throwable t4) {
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(t4, "t");
            }

            @Override // retrofit2.Callback
            public void onResponse(@NotNull Call<ResponseModel<?>> call, @NotNull Response<ResponseModel<?>> response) {
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(response, "response");
                ResponseModel<?> body = response.body();
                boolean z5 = false;
                if (body != null && body.getCode() == 200) {
                    z5 = true;
                }
                if (z5) {
                    return;
                }
                l2 a5 = l2.a(context);
                ResponseModel<?> body2 = response.body();
                a5.b(body2 != null ? body2.getMessage() : null);
            }
        });
    }

    @NotNull
    public final MutableLiveData<ModGameArchivePathData> getCloud_archive_local_path() {
        return this.cloud_archive_local_path;
    }

    @NotNull
    public final MutableLiveData<List<CommonListMainData>> getListArchive() {
        return this.listArchive;
    }

    @NotNull
    public final MutableLiveData<LoadBindindData> getLoadBindData() {
        return this.loadBindData;
    }

    @NotNull
    public final MutableLiveData<List<ArchiveData>> getLocalAllArchive() {
        return this.localAllArchive;
    }

    @NotNull
    public final String getPackageName() {
        return this.packageName;
    }

    @NotNull
    public final ModDataRequest getRequest() {
        return this.request;
    }

    @NotNull
    public final String getRuningArchive() {
        u.c archiveSection = PluginConfig.getArchiveSection(com.join.mgps.va.overmind.f.r(com.join.mgps.va.overmind.f.f54952a, this.packageName, 0, 2, null));
        if (archiveSection != null) {
            String c5 = archiveSection.c("archiveId");
            Intrinsics.checkNotNullExpressionValue(c5, "section[\"archiveId\"]");
            return c5;
        }
        return "0";
    }

    @NotNull
    public final MutableLiveData<Integer> getShowPosition() {
        return this.showPosition;
    }

    public final void loadAllArchives(@NotNull String packagename, @NotNull final ModGameArchivePathData modGameArchivePathData, final long j4, @Nullable final List<ArchiveData> list) {
        Intrinsics.checkNotNullParameter(packagename, "packagename");
        Intrinsics.checkNotNullParameter(modGameArchivePathData, "modGameArchivePathData");
        new Thread(new Runnable() { // from class: com.join.kotlin.ui.cloudarchive.h
            @Override // java.lang.Runnable
            public final void run() {
                ModGameCloudViewModle.loadAllArchives$lambda$1(ModGameArchivePathData.this, list, this, j4);
            }
        }).start();
    }

    public final void onRecivedDownLoadEVent(@NotNull ArchiveDownEvent archiveDownEvent) {
        boolean z4;
        Intrinsics.checkNotNullParameter(archiveDownEvent, "archiveDownEvent");
        if (archiveDownEvent.getStatus() == 3) {
            return;
        }
        if (archiveDownEvent.getStatus() == 10) {
            ArchiveData archiveData = archiveDownEvent.getArchiveData();
            Intrinsics.checkNotNullExpressionValue(archiveData, "archiveDownEvent.archiveData");
            updateItemData(archiveData);
            return;
        }
        if (archiveDownEvent.getStatus() == 8) {
            ArchiveData archiveData2 = archiveDownEvent.getArchiveData();
            Intrinsics.checkNotNullExpressionValue(archiveData2, "archiveDownEvent.archiveData");
            locallAddArchive(archiveData2);
        }
        List<CommonListMainData> value = this.listArchive.getValue();
        Intrinsics.checkNotNull(value);
        Iterator<CommonListMainData> it2 = value.iterator();
        while (true) {
            z4 = true;
            if (!it2.hasNext()) {
                z4 = false;
                break;
            }
            CommonListMainData next = it2.next();
            if (next.getAny() instanceof ArchiveData) {
                Object any = next.getAny();
                Intrinsics.checkNotNull(any, "null cannot be cast to non-null type com.join.kotlin.ui.cloudarchive.data.ArchiveData");
                ArchiveData archiveData3 = (ArchiveData) any;
                if (Intrinsics.areEqual(archiveData3.getId(), archiveDownEvent.getArchiveData().getId())) {
                    archiveData3.setStatus(archiveDownEvent.getStatus());
                    int status = archiveDownEvent.getStatus();
                    if (status != 0) {
                        if (status == 1) {
                            archiveData3.setShowText("下载中");
                        } else if (status == 4) {
                            archiveData3.setShowText("下载中");
                        } else if (status != 5 && status != 6) {
                            if (status == 8) {
                                archiveData3.setShowText("启动");
                            } else if (status == 9) {
                                archiveData3.setShowText("下载");
                                archiveData3.setStatus(0);
                                archiveData3.setIsFirstRun(0);
                                archiveData3.setArchiveLocalZipPath("");
                                changeLocalDataDel(archiveData3);
                            }
                        }
                    }
                    archiveData3.setStatus(0);
                    archiveData3.setShowText("下载");
                }
            }
        }
        if (z4) {
            MutableLiveData<List<CommonListMainData>> mutableLiveData = this.listArchive;
            mutableLiveData.setValue(mutableLiveData.getValue());
        }
    }

    public final void onitemChanged(@NotNull ArchiveData archiveData, @NotNull ModArchiveAdapter adapter) {
        Intrinsics.checkNotNullParameter(archiveData, "archiveData");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        List<CommonListMainData> value = this.listArchive.getValue();
        Intrinsics.checkNotNull(value);
        int size = value.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            }
            List<CommonListMainData> value2 = this.listArchive.getValue();
            Intrinsics.checkNotNull(value2);
            if (Intrinsics.areEqual(value2.get(size).getId(), archiveData.getId())) {
                adapter.notifyItemChanged(size, archiveData);
                return;
            }
        }
    }

    public final void setCloud_archive_local_path(@NotNull MutableLiveData<ModGameArchivePathData> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.cloud_archive_local_path = mutableLiveData;
    }

    public final void setListArchive(@NotNull MutableLiveData<List<CommonListMainData>> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.listArchive = mutableLiveData;
    }

    public final void setLoadBindData(@NotNull MutableLiveData<LoadBindindData> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.loadBindData = mutableLiveData;
    }

    public final void setLocalAllArchive(@NotNull MutableLiveData<List<ArchiveData>> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.localAllArchive = mutableLiveData;
    }

    public final void setPackageName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.packageName = str;
    }

    public final void setRequest(@NotNull ModDataRequest modDataRequest) {
        Intrinsics.checkNotNullParameter(modDataRequest, "<set-?>");
        this.request = modDataRequest;
    }

    public final void setShowPosition(@NotNull MutableLiveData<Integer> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.showPosition = mutableLiveData;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0141  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void startGameADCheck(@org.jetbrains.annotations.Nullable android.content.Context r14, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function0<kotlin.Unit> r15) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.kotlin.ui.cloudarchive.ModGameCloudViewModle.startGameADCheck(android.content.Context, kotlin.jvm.functions.Function0):void");
    }

    public final void updateItemData(@NotNull ArchiveData archiveData) {
        Intrinsics.checkNotNullParameter(archiveData, "archiveData");
        CloudArchiveTable p4 = b2.g.t().p(archiveData.getId());
        if (this.listArchive.getValue() != null) {
            List<CommonListMainData> value = this.listArchive.getValue();
            Intrinsics.checkNotNull(value);
            boolean z4 = false;
            for (CommonListMainData commonListMainData : value) {
                if (commonListMainData.getAny() instanceof ArchiveData) {
                    Object any = commonListMainData.getAny();
                    Intrinsics.checkNotNull(any, "null cannot be cast to non-null type com.join.kotlin.ui.cloudarchive.data.ArchiveData");
                    if (Intrinsics.areEqual(((ArchiveData) any).getId(), archiveData.getId())) {
                        z4 = true;
                        if (p4 != null) {
                            ((ArchiveData) commonListMainData.getAny()).setIsFirstRun(p4.getIsFirstRun());
                        } else {
                            ((ArchiveData) commonListMainData.getAny()).setIsFirstRun(0);
                        }
                        ((ArchiveData) commonListMainData.getAny()).setLikeCount(archiveData.getLikeCount());
                        ((ArchiveData) commonListMainData.getAny()).setIsLike(archiveData.getIsLike());
                        ((ArchiveData) commonListMainData.getAny()).setArchiveDesc(archiveData.getArchiveDesc());
                        ((ArchiveData) commonListMainData.getAny()).setIsUnLike(archiveData.getIsUnLike());
                        ((ArchiveData) commonListMainData.getAny()).setNegativeCount(archiveData.getNegativeCount());
                        ((ArchiveData) commonListMainData.getAny()).setStatus(archiveData.getStatus());
                    }
                }
            }
            if (z4) {
                MutableLiveData<List<CommonListMainData>> mutableLiveData = this.listArchive;
                mutableLiveData.setValue(mutableLiveData.getValue());
            }
        }
    }
}
