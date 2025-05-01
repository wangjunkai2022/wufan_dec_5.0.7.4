package com.join.kotlin.discount.model.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: GameServerInfoBean.kt */
/* loaded from: classes3.dex */
public final class GameServerInfoBean {
    @Nullable
    private Boolean expire;
    @Nullable
    private String id;
    @Nullable
    private String serverName;
    @Nullable
    private String server_name;
    private boolean subscribe;
    @Nullable
    private String times;
    @Nullable
    private String times_suffix;

    public GameServerInfoBean() {
        this(null, null, null, null, null, false, null, 127, null);
    }

    public GameServerInfoBean(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, boolean z4, @Nullable Boolean bool) {
        this.id = str;
        this.serverName = str2;
        this.server_name = str3;
        this.times = str4;
        this.times_suffix = str5;
        this.subscribe = z4;
        this.expire = bool;
    }

    public static /* synthetic */ GameServerInfoBean copy$default(GameServerInfoBean gameServerInfoBean, String str, String str2, String str3, String str4, String str5, boolean z4, Boolean bool, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = gameServerInfoBean.id;
        }
        if ((i4 & 2) != 0) {
            str2 = gameServerInfoBean.serverName;
        }
        String str6 = str2;
        if ((i4 & 4) != 0) {
            str3 = gameServerInfoBean.server_name;
        }
        String str7 = str3;
        if ((i4 & 8) != 0) {
            str4 = gameServerInfoBean.times;
        }
        String str8 = str4;
        if ((i4 & 16) != 0) {
            str5 = gameServerInfoBean.times_suffix;
        }
        String str9 = str5;
        if ((i4 & 32) != 0) {
            z4 = gameServerInfoBean.subscribe;
        }
        boolean z5 = z4;
        if ((i4 & 64) != 0) {
            bool = gameServerInfoBean.expire;
        }
        return gameServerInfoBean.copy(str, str6, str7, str8, str9, z5, bool);
    }

    @Nullable
    public final String component1() {
        return this.id;
    }

    @Nullable
    public final String component2() {
        return this.serverName;
    }

    @Nullable
    public final String component3() {
        return this.server_name;
    }

    @Nullable
    public final String component4() {
        return this.times;
    }

    @Nullable
    public final String component5() {
        return this.times_suffix;
    }

    public final boolean component6() {
        return this.subscribe;
    }

    @Nullable
    public final Boolean component7() {
        return this.expire;
    }

    @NotNull
    public final GameServerInfoBean copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, boolean z4, @Nullable Boolean bool) {
        return new GameServerInfoBean(str, str2, str3, str4, str5, z4, bool);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GameServerInfoBean) {
            GameServerInfoBean gameServerInfoBean = (GameServerInfoBean) obj;
            return Intrinsics.areEqual(this.id, gameServerInfoBean.id) && Intrinsics.areEqual(this.serverName, gameServerInfoBean.serverName) && Intrinsics.areEqual(this.server_name, gameServerInfoBean.server_name) && Intrinsics.areEqual(this.times, gameServerInfoBean.times) && Intrinsics.areEqual(this.times_suffix, gameServerInfoBean.times_suffix) && this.subscribe == gameServerInfoBean.subscribe && Intrinsics.areEqual(this.expire, gameServerInfoBean.expire);
        }
        return false;
    }

    @Nullable
    public final Boolean getExpire() {
        return this.expire;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getServerName() {
        return this.serverName;
    }

    @Nullable
    public final String getServer_name() {
        return this.server_name;
    }

    public final boolean getSubscribe() {
        return this.subscribe;
    }

    @Nullable
    public final String getTimes() {
        return this.times;
    }

    @Nullable
    public final String getTimes_suffix() {
        return this.times_suffix;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.serverName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.server_name;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.times;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.times_suffix;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        boolean z4 = this.subscribe;
        int i4 = z4;
        if (z4 != 0) {
            i4 = 1;
        }
        int i5 = (hashCode5 + i4) * 31;
        Boolean bool = this.expire;
        return i5 + (bool != null ? bool.hashCode() : 0);
    }

    public final void setExpire(@Nullable Boolean bool) {
        this.expire = bool;
    }

    public final void setId(@Nullable String str) {
        this.id = str;
    }

    public final void setServerName(@Nullable String str) {
        this.serverName = str;
    }

    public final void setServer_name(@Nullable String str) {
        this.server_name = str;
    }

    public final void setSubscribe(boolean z4) {
        this.subscribe = z4;
    }

    public final void setTimes(@Nullable String str) {
        this.times = str;
    }

    public final void setTimes_suffix(@Nullable String str) {
        this.times_suffix = str;
    }

    @NotNull
    public String toString() {
        return "GameServerInfoBean(id=" + this.id + ", serverName=" + this.serverName + ", server_name=" + this.server_name + ", times=" + this.times + ", times_suffix=" + this.times_suffix + ", subscribe=" + this.subscribe + ", expire=" + this.expire + ')';
    }

    public /* synthetic */ GameServerInfoBean(String str, String str2, String str3, String str4, String str5, boolean z4, Boolean bool, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? "" : str2, (i4 & 4) != 0 ? "" : str3, (i4 & 8) != 0 ? "" : str4, (i4 & 16) == 0 ? str5 : "", (i4 & 32) != 0 ? false : z4, (i4 & 64) != 0 ? Boolean.FALSE : bool);
    }
}
