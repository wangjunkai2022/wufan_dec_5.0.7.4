package com.psk.eventmodule;

import android.content.Context;
import android.provider.Settings;
import android.text.TextUtils;
import com.join.mgps.Util.h0;
import com.psk.eventmodule.net.StatCore;
import com.psk.eventmodule.net.util.AESUtilV2;
import com.psk.eventmodule.net.util.DeviceIdUtil;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: StatFactory.kt */
/* loaded from: classes5.dex */
public final class StatFactory {
    @Nullable
    private static StatFactory instance;
    @Nullable
    private static String oaid;
    @Nullable
    private static StatCore statCore;
    private static long user_id;
    private static int user_type;
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static String ip = "";
    @NotNull
    private static String client_version = "";
    @NotNull
    private static String network = "";
    @NotNull
    private static String device_id = "";
    @NotNull
    private static String scm = "";
    @NotNull
    private static String trans_data = "";
    @NotNull
    private static String request_id = "";

    /* compiled from: StatFactory.kt */
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final StatFactory getInstance(@NotNull Context context) {
            String replace$default;
            String replace$default2;
            Intrinsics.checkNotNullParameter(context, "context");
            if (StatFactory.instance == null) {
                StatFactory.instance = new StatFactory();
            }
            if (StatFactory.statCore == null) {
                StatFactory.statCore = StatCore.Companion.getInstance(context);
            }
            String android_id = Settings.System.getString(context.getContentResolver(), "android_id");
            String oaid = DeviceIdUtil.getInstance(context).getOaid();
            String imei = DeviceIdUtil.getInstance(context).getImei();
            String umKey = DeviceIdUtil.getInstance(context).getUmengKey();
            if (!TextUtils.equals(android_id, "0") && !TextUtils.isEmpty(android_id)) {
                Intrinsics.checkNotNullExpressionValue(android_id, "android_id");
                replace$default = StringsKt__StringsJVMKt.replace$default(android_id, "0", "", false, 4, (Object) null);
                replace$default2 = StringsKt__StringsJVMKt.replace$default(replace$default, "-", "", false, 4, (Object) null);
                if (!TextUtils.isEmpty(replace$default2)) {
                    Intrinsics.checkNotNullExpressionValue(android_id, "android_id");
                    StatFactory.device_id = android_id;
                    StatFactory statFactory = StatFactory.instance;
                    Intrinsics.checkNotNull(statFactory);
                    return statFactory;
                }
            }
            boolean z4 = false;
            if (!(oaid == null || oaid.length() == 0)) {
                Intrinsics.checkNotNullExpressionValue(oaid, "oaid");
                StatFactory.device_id = oaid;
            } else {
                if (!((imei == null || imei.length() == 0) ? true : true)) {
                    Intrinsics.checkNotNullExpressionValue(imei, "imei");
                    StatFactory.device_id = imei;
                } else {
                    Intrinsics.checkNotNullExpressionValue(umKey, "umKey");
                    StatFactory.device_id = umKey;
                }
            }
            StatFactory statFactory2 = StatFactory.instance;
            Intrinsics.checkNotNull(statFactory2);
            return statFactory2;
        }

        @Nullable
        public final String getOaid() {
            return StatFactory.oaid;
        }

        public final void setOaid(@Nullable String str) {
            StatFactory.oaid = str;
        }
    }

    /* compiled from: StatFactory.kt */
    /* loaded from: classes5.dex */
    public static final class VolcanoEvent implements Serializable {
        @NotNull
        private final Event event;
        @NotNull
        private final String goods_id;
        private final boolean net_game;
        @Nullable
        private final VolcanoOther other;
        @NotNull
        private final SpmData spm;

        public VolcanoEvent(@NotNull Event event, @NotNull String goods_id, @NotNull SpmData spm, @Nullable VolcanoOther volcanoOther, boolean z4) {
            Intrinsics.checkNotNullParameter(event, "event");
            Intrinsics.checkNotNullParameter(goods_id, "goods_id");
            Intrinsics.checkNotNullParameter(spm, "spm");
            this.event = event;
            this.goods_id = goods_id;
            this.spm = spm;
            this.other = volcanoOther;
            this.net_game = z4;
        }

        public static /* synthetic */ VolcanoEvent copy$default(VolcanoEvent volcanoEvent, Event event, String str, SpmData spmData, VolcanoOther volcanoOther, boolean z4, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                event = volcanoEvent.event;
            }
            if ((i4 & 2) != 0) {
                str = volcanoEvent.goods_id;
            }
            String str2 = str;
            if ((i4 & 4) != 0) {
                spmData = volcanoEvent.spm;
            }
            SpmData spmData2 = spmData;
            if ((i4 & 8) != 0) {
                volcanoOther = volcanoEvent.other;
            }
            VolcanoOther volcanoOther2 = volcanoOther;
            if ((i4 & 16) != 0) {
                z4 = volcanoEvent.net_game;
            }
            return volcanoEvent.copy(event, str2, spmData2, volcanoOther2, z4);
        }

        @NotNull
        public final Event component1() {
            return this.event;
        }

        @NotNull
        public final String component2() {
            return this.goods_id;
        }

        @NotNull
        public final SpmData component3() {
            return this.spm;
        }

        @Nullable
        public final VolcanoOther component4() {
            return this.other;
        }

        public final boolean component5() {
            return this.net_game;
        }

        @NotNull
        public final VolcanoEvent copy(@NotNull Event event, @NotNull String goods_id, @NotNull SpmData spm, @Nullable VolcanoOther volcanoOther, boolean z4) {
            Intrinsics.checkNotNullParameter(event, "event");
            Intrinsics.checkNotNullParameter(goods_id, "goods_id");
            Intrinsics.checkNotNullParameter(spm, "spm");
            return new VolcanoEvent(event, goods_id, spm, volcanoOther, z4);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof VolcanoEvent) {
                VolcanoEvent volcanoEvent = (VolcanoEvent) obj;
                return this.event == volcanoEvent.event && Intrinsics.areEqual(this.goods_id, volcanoEvent.goods_id) && Intrinsics.areEqual(this.spm, volcanoEvent.spm) && Intrinsics.areEqual(this.other, volcanoEvent.other) && this.net_game == volcanoEvent.net_game;
            }
            return false;
        }

        @NotNull
        public final Event getEvent() {
            return this.event;
        }

        @NotNull
        public final String getGoods_id() {
            return this.goods_id;
        }

        public final boolean getNet_game() {
            return this.net_game;
        }

        @Nullable
        public final VolcanoOther getOther() {
            return this.other;
        }

        @NotNull
        public final SpmData getSpm() {
            return this.spm;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = ((((this.event.hashCode() * 31) + this.goods_id.hashCode()) * 31) + this.spm.hashCode()) * 31;
            VolcanoOther volcanoOther = this.other;
            int hashCode2 = (hashCode + (volcanoOther == null ? 0 : volcanoOther.hashCode())) * 31;
            boolean z4 = this.net_game;
            int i4 = z4;
            if (z4 != 0) {
                i4 = 1;
            }
            return hashCode2 + i4;
        }

        @NotNull
        public String toString() {
            return "VolcanoEvent(event=" + this.event + ", goods_id=" + this.goods_id + ", spm=" + this.spm + ", other=" + this.other + ", net_game=" + this.net_game + ')';
        }
    }

    public static /* synthetic */ void initDatas$default(StatFactory statFactory, String str, long j4, int i4, String str2, String str3, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = "";
        }
        statFactory.initDatas(str, j4, i4, str2, str3);
    }

    public final void initDatas(@Nullable String str, long j4, int i4, @NotNull String client_versionInit, @NotNull String networkInit) {
        boolean contains$default;
        Intrinsics.checkNotNullParameter(client_versionInit, "client_versionInit");
        Intrinsics.checkNotNullParameter(networkInit, "networkInit");
        if (TextUtils.isEmpty(str)) {
            str = "";
        } else {
            Intrinsics.checkNotNull(str);
            contains$default = StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) h0.f27805a, false, 2, (Object) null);
            if (!contains$default) {
                str = AESUtilV2.decrypt(str, "");
                Intrinsics.checkNotNullExpressionValue(str, "decrypt(ipInit, \"\")");
            }
        }
        ip = str;
        user_id = j4;
        user_type = i4;
        client_version = client_versionInit;
        network = networkInit;
    }

    public final void sendEvent(@NotNull VolcanoEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
    }

    public final void updateNewNewDatas(@NotNull String scmUpdate, @NotNull String trans_dataUpdate, @NotNull String request_idUpdate) {
        Intrinsics.checkNotNullParameter(scmUpdate, "scmUpdate");
        Intrinsics.checkNotNullParameter(trans_dataUpdate, "trans_dataUpdate");
        Intrinsics.checkNotNullParameter(request_idUpdate, "request_idUpdate");
        scm = scmUpdate;
        trans_data = trans_dataUpdate;
        request_id = request_idUpdate;
    }

    /* compiled from: StatFactory.kt */
    /* loaded from: classes5.dex */
    public static final class VolcanoOther implements Serializable {
        @NotNull
        private final String req_id;
        @NotNull
        private final String scm;
        @NotNull
        private final String trans_data;

        public VolcanoOther() {
            this(null, null, null, 7, null);
        }

        public VolcanoOther(@NotNull String scm, @NotNull String req_id, @NotNull String trans_data) {
            Intrinsics.checkNotNullParameter(scm, "scm");
            Intrinsics.checkNotNullParameter(req_id, "req_id");
            Intrinsics.checkNotNullParameter(trans_data, "trans_data");
            this.scm = scm;
            this.req_id = req_id;
            this.trans_data = trans_data;
        }

        public static /* synthetic */ VolcanoOther copy$default(VolcanoOther volcanoOther, String str, String str2, String str3, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                str = volcanoOther.scm;
            }
            if ((i4 & 2) != 0) {
                str2 = volcanoOther.req_id;
            }
            if ((i4 & 4) != 0) {
                str3 = volcanoOther.trans_data;
            }
            return volcanoOther.copy(str, str2, str3);
        }

        @NotNull
        public final String component1() {
            return this.scm;
        }

        @NotNull
        public final String component2() {
            return this.req_id;
        }

        @NotNull
        public final String component3() {
            return this.trans_data;
        }

        @NotNull
        public final VolcanoOther copy(@NotNull String scm, @NotNull String req_id, @NotNull String trans_data) {
            Intrinsics.checkNotNullParameter(scm, "scm");
            Intrinsics.checkNotNullParameter(req_id, "req_id");
            Intrinsics.checkNotNullParameter(trans_data, "trans_data");
            return new VolcanoOther(scm, req_id, trans_data);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof VolcanoOther) {
                VolcanoOther volcanoOther = (VolcanoOther) obj;
                return Intrinsics.areEqual(this.scm, volcanoOther.scm) && Intrinsics.areEqual(this.req_id, volcanoOther.req_id) && Intrinsics.areEqual(this.trans_data, volcanoOther.trans_data);
            }
            return false;
        }

        @NotNull
        public final String getReq_id() {
            return this.req_id;
        }

        @NotNull
        public final String getScm() {
            return this.scm;
        }

        @NotNull
        public final String getTrans_data() {
            return this.trans_data;
        }

        public int hashCode() {
            return (((this.scm.hashCode() * 31) + this.req_id.hashCode()) * 31) + this.trans_data.hashCode();
        }

        @NotNull
        public String toString() {
            return "VolcanoOther(scm=" + this.scm + ", req_id=" + this.req_id + ", trans_data=" + this.trans_data + ')';
        }

        public /* synthetic */ VolcanoOther(String str, String str2, String str3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? "" : str2, (i4 & 4) != 0 ? "" : str3);
        }
    }

    /* compiled from: StatFactory.kt */
    /* loaded from: classes5.dex */
    public static final class SpmData implements Serializable {
        @NotNull
        private final String arena;
        @NotNull
        private final String bussnes;
        private final boolean detail;
        @NotNull
        private final String page;
        @NotNull
        private final String position;

        public SpmData() {
            this(null, null, null, null, false, 31, null);
        }

        public SpmData(@NotNull String bussnes, @NotNull String page, @NotNull String arena, @NotNull String position, boolean z4) {
            Intrinsics.checkNotNullParameter(bussnes, "bussnes");
            Intrinsics.checkNotNullParameter(page, "page");
            Intrinsics.checkNotNullParameter(arena, "arena");
            Intrinsics.checkNotNullParameter(position, "position");
            this.bussnes = bussnes;
            this.page = page;
            this.arena = arena;
            this.position = position;
            this.detail = z4;
        }

        public static /* synthetic */ SpmData copy$default(SpmData spmData, String str, String str2, String str3, String str4, boolean z4, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                str = spmData.bussnes;
            }
            if ((i4 & 2) != 0) {
                str2 = spmData.page;
            }
            String str5 = str2;
            if ((i4 & 4) != 0) {
                str3 = spmData.arena;
            }
            String str6 = str3;
            if ((i4 & 8) != 0) {
                str4 = spmData.position;
            }
            String str7 = str4;
            if ((i4 & 16) != 0) {
                z4 = spmData.detail;
            }
            return spmData.copy(str, str5, str6, str7, z4);
        }

        @NotNull
        public final String component1() {
            return this.bussnes;
        }

        @NotNull
        public final String component2() {
            return this.page;
        }

        @NotNull
        public final String component3() {
            return this.arena;
        }

        @NotNull
        public final String component4() {
            return this.position;
        }

        public final boolean component5() {
            return this.detail;
        }

        @NotNull
        public final SpmData copy(@NotNull String bussnes, @NotNull String page, @NotNull String arena, @NotNull String position, boolean z4) {
            Intrinsics.checkNotNullParameter(bussnes, "bussnes");
            Intrinsics.checkNotNullParameter(page, "page");
            Intrinsics.checkNotNullParameter(arena, "arena");
            Intrinsics.checkNotNullParameter(position, "position");
            return new SpmData(bussnes, page, arena, position, z4);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof SpmData) {
                SpmData spmData = (SpmData) obj;
                return Intrinsics.areEqual(this.bussnes, spmData.bussnes) && Intrinsics.areEqual(this.page, spmData.page) && Intrinsics.areEqual(this.arena, spmData.arena) && Intrinsics.areEqual(this.position, spmData.position) && this.detail == spmData.detail;
            }
            return false;
        }

        @NotNull
        public final String getArena() {
            return this.arena;
        }

        @NotNull
        public final String getBussnes() {
            return this.bussnes;
        }

        public final boolean getDetail() {
            return this.detail;
        }

        @NotNull
        public final String getPage() {
            return this.page;
        }

        @NotNull
        public final String getPosition() {
            return this.position;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = ((((((this.bussnes.hashCode() * 31) + this.page.hashCode()) * 31) + this.arena.hashCode()) * 31) + this.position.hashCode()) * 31;
            boolean z4 = this.detail;
            int i4 = z4;
            if (z4 != 0) {
                i4 = 1;
            }
            return hashCode + i4;
        }

        @NotNull
        public String toString() {
            return "SpmData(bussnes=" + this.bussnes + ", page=" + this.page + ", arena=" + this.arena + ", position=" + this.position + ", detail=" + this.detail + ')';
        }

        public /* synthetic */ SpmData(String str, String str2, String str3, String str4, boolean z4, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this((i4 & 1) != 0 ? "wufan" : str, (i4 & 2) != 0 ? "home" : str2, (i4 & 4) != 0 ? "" : str3, (i4 & 8) == 0 ? str4 : "", (i4 & 16) != 0 ? false : z4);
        }
    }
}
