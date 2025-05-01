package com.psk.eventmodule.net;

import android.content.Context;
import android.os.Build;
import com.psk.eventmodule.net.modle.VolcanoData;
import com.psk.frame.roomlibrary.volcano.a;
import com.psk.frame.roomlibrary.volcano.dao.VolcanoEventDao;
import com.psk.frame.roomlibrary.volcano.entity.VolcanoEventTab;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.d1;
import kotlinx.coroutines.i;
import kotlinx.coroutines.r0;
import kotlinx.coroutines.z1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: StatCore.kt */
/* loaded from: classes5.dex */
public final class StatCore {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @Nullable
    private static Context context;
    @Nullable
    private static StatCore instance;
    @Nullable
    private z1 jobInfo;

    /* compiled from: StatCore.kt */
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final StatCore getInstance(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (StatCore.instance == null) {
                a.f59646a.a(context);
                StatCore.instance = new StatCore();
            }
            if (StatCore.context == null) {
                StatCore.context = context;
            }
            StatCore statCore = StatCore.instance;
            Intrinsics.checkNotNull(statCore);
            return statCore;
        }
    }

    private final void insertDataToDB(VolcanoData volcanoData) {
        a aVar = a.f59646a;
        VolcanoEventDao b5 = aVar.b();
        VolcanoEventTab volcanoEventTab = new VolcanoEventTab(0, 0, System.currentTimeMillis(), volcanoData.getBhv_type(), volcanoData.getGoods_id(), volcanoData.getUser_id(), volcanoData.getUser_type(), volcanoData.getScm(), volcanoData.getSpm(), volcanoData.getTrans_data(), volcanoData.getReq_id(), volcanoData.getIp(), volcanoData.getClient_version(), Build.MODEL, volcanoData.getNetwork(), String.valueOf(Build.VERSION.SDK_INT), volcanoData.getDevice_id(), volcanoData.getNet_game(), 3, null);
        if (volcanoEventTab.getUser_id() != 0) {
            String device_id = volcanoEventTab.getDevice_id();
            if (!(device_id == null || device_id.length() == 0)) {
                for (VolcanoEventTab volcanoEventTab2 : aVar.b().queryForAll()) {
                    if (volcanoEventTab2.getUser_id() == 0) {
                        volcanoEventTab2.setUser_id(volcanoEventTab.getUser_id());
                        volcanoEventTab2.setUser_type(volcanoEventTab.getUser_type());
                        a.f59646a.b().update(volcanoEventTab2);
                    }
                    String device_id2 = volcanoEventTab2.getDevice_id();
                    if (device_id2 == null || device_id2.length() == 0) {
                        volcanoEventTab2.setDevice_id(volcanoEventTab.getDevice_id());
                        a.f59646a.b().update(volcanoEventTab2);
                    }
                }
            }
        }
        if (volcanoEventTab.getNet_game()) {
            String scm = volcanoEventTab.getScm();
            if (!(scm == null || scm.length() == 0)) {
                String req_id = volcanoEventTab.getReq_id();
                if (!(req_id == null || req_id.length() == 0)) {
                    for (VolcanoEventTab volcanoEventTab3 : a.f59646a.b().queryForAll()) {
                        String scm2 = volcanoEventTab3.getScm();
                        if (scm2 == null || scm2.length() == 0) {
                            String req_id2 = volcanoEventTab3.getReq_id();
                            if (!(req_id2 == null || req_id2.length() == 0)) {
                                volcanoEventTab3.setScm(volcanoEventTab.getScm());
                                a.f59646a.b().update(volcanoEventTab3);
                            }
                        }
                    }
                }
            }
        }
        b5.insertTab(volcanoEventTab);
        offlineAll();
    }

    private final void offlineAll() {
        z1 z1Var = this.jobInfo;
        if (z1Var != null) {
            z1.a.b(z1Var, null, 1, null);
        }
        this.jobInfo = i.e(r0.a(d1.c()), null, null, new StatCore$offlineAll$1(null), 3, null);
    }

    @Nullable
    public final z1 getJobInfo() {
        return this.jobInfo;
    }

    public final void send(@NotNull VolcanoData statRequest) {
        Intrinsics.checkNotNullParameter(statRequest, "statRequest");
        insertDataToDB(statRequest);
    }

    public final void setJobInfo(@Nullable z1 z1Var) {
        this.jobInfo = z1Var;
    }
}
