package com.join.kotlin.quark.model.bean;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: JumpModelEntityListItemBean.kt */
/* loaded from: classes3.dex */
public final class MiniGame {
    @Nullable
    private final String color;
    @Nullable
    private final String id;
    @Nullable
    private final String name;

    public MiniGame(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.color = str;
        this.id = str2;
        this.name = str3;
    }

    public static /* synthetic */ MiniGame copy$default(MiniGame miniGame, String str, String str2, String str3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = miniGame.color;
        }
        if ((i4 & 2) != 0) {
            str2 = miniGame.id;
        }
        if ((i4 & 4) != 0) {
            str3 = miniGame.name;
        }
        return miniGame.copy(str, str2, str3);
    }

    @Nullable
    public final String component1() {
        return this.color;
    }

    @Nullable
    public final String component2() {
        return this.id;
    }

    @Nullable
    public final String component3() {
        return this.name;
    }

    @NotNull
    public final MiniGame copy(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        return new MiniGame(str, str2, str3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MiniGame) {
            MiniGame miniGame = (MiniGame) obj;
            return Intrinsics.areEqual(this.color, miniGame.color) && Intrinsics.areEqual(this.id, miniGame.id) && Intrinsics.areEqual(this.name, miniGame.name);
        }
        return false;
    }

    @Nullable
    public final String getColor() {
        return this.color;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        String str = this.color;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.id;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.name;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "MiniGame(color=" + this.color + ", id=" + this.id + ", name=" + this.name + ')';
    }
}
