package com.join.kotlin.quark.model.bean;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: JumpModelEntityListItemBean.kt */
/* loaded from: classes3.dex */
public final class SpTagInfo {
    @Nullable
    private final BtGame bt_game;
    @Nullable
    private final MiniGame mini_game;
    @Nullable
    private final ModGameVm mod_game_vm;
    @Nullable
    private final Model model;
    @Nullable
    private final NetGameVm net_game_vm;
    @Nullable
    private final SelfSupport self_support;
    @Nullable
    private final SingleGameVm single_game_vm;

    public SpTagInfo(@Nullable BtGame btGame, @Nullable MiniGame miniGame, @Nullable ModGameVm modGameVm, @Nullable Model model, @Nullable NetGameVm netGameVm, @Nullable SelfSupport selfSupport, @Nullable SingleGameVm singleGameVm) {
        this.bt_game = btGame;
        this.mini_game = miniGame;
        this.mod_game_vm = modGameVm;
        this.model = model;
        this.net_game_vm = netGameVm;
        this.self_support = selfSupport;
        this.single_game_vm = singleGameVm;
    }

    public static /* synthetic */ SpTagInfo copy$default(SpTagInfo spTagInfo, BtGame btGame, MiniGame miniGame, ModGameVm modGameVm, Model model, NetGameVm netGameVm, SelfSupport selfSupport, SingleGameVm singleGameVm, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            btGame = spTagInfo.bt_game;
        }
        if ((i4 & 2) != 0) {
            miniGame = spTagInfo.mini_game;
        }
        MiniGame miniGame2 = miniGame;
        if ((i4 & 4) != 0) {
            modGameVm = spTagInfo.mod_game_vm;
        }
        ModGameVm modGameVm2 = modGameVm;
        if ((i4 & 8) != 0) {
            model = spTagInfo.model;
        }
        Model model2 = model;
        if ((i4 & 16) != 0) {
            netGameVm = spTagInfo.net_game_vm;
        }
        NetGameVm netGameVm2 = netGameVm;
        if ((i4 & 32) != 0) {
            selfSupport = spTagInfo.self_support;
        }
        SelfSupport selfSupport2 = selfSupport;
        if ((i4 & 64) != 0) {
            singleGameVm = spTagInfo.single_game_vm;
        }
        return spTagInfo.copy(btGame, miniGame2, modGameVm2, model2, netGameVm2, selfSupport2, singleGameVm);
    }

    @Nullable
    public final BtGame component1() {
        return this.bt_game;
    }

    @Nullable
    public final MiniGame component2() {
        return this.mini_game;
    }

    @Nullable
    public final ModGameVm component3() {
        return this.mod_game_vm;
    }

    @Nullable
    public final Model component4() {
        return this.model;
    }

    @Nullable
    public final NetGameVm component5() {
        return this.net_game_vm;
    }

    @Nullable
    public final SelfSupport component6() {
        return this.self_support;
    }

    @Nullable
    public final SingleGameVm component7() {
        return this.single_game_vm;
    }

    @NotNull
    public final SpTagInfo copy(@Nullable BtGame btGame, @Nullable MiniGame miniGame, @Nullable ModGameVm modGameVm, @Nullable Model model, @Nullable NetGameVm netGameVm, @Nullable SelfSupport selfSupport, @Nullable SingleGameVm singleGameVm) {
        return new SpTagInfo(btGame, miniGame, modGameVm, model, netGameVm, selfSupport, singleGameVm);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SpTagInfo) {
            SpTagInfo spTagInfo = (SpTagInfo) obj;
            return Intrinsics.areEqual(this.bt_game, spTagInfo.bt_game) && Intrinsics.areEqual(this.mini_game, spTagInfo.mini_game) && Intrinsics.areEqual(this.mod_game_vm, spTagInfo.mod_game_vm) && Intrinsics.areEqual(this.model, spTagInfo.model) && Intrinsics.areEqual(this.net_game_vm, spTagInfo.net_game_vm) && Intrinsics.areEqual(this.self_support, spTagInfo.self_support) && Intrinsics.areEqual(this.single_game_vm, spTagInfo.single_game_vm);
        }
        return false;
    }

    @Nullable
    public final BtGame getBt_game() {
        return this.bt_game;
    }

    @Nullable
    public final MiniGame getMini_game() {
        return this.mini_game;
    }

    @Nullable
    public final ModGameVm getMod_game_vm() {
        return this.mod_game_vm;
    }

    @Nullable
    public final Model getModel() {
        return this.model;
    }

    @Nullable
    public final NetGameVm getNet_game_vm() {
        return this.net_game_vm;
    }

    @Nullable
    public final SelfSupport getSelf_support() {
        return this.self_support;
    }

    @Nullable
    public final SingleGameVm getSingle_game_vm() {
        return this.single_game_vm;
    }

    public int hashCode() {
        BtGame btGame = this.bt_game;
        int hashCode = (btGame == null ? 0 : btGame.hashCode()) * 31;
        MiniGame miniGame = this.mini_game;
        int hashCode2 = (hashCode + (miniGame == null ? 0 : miniGame.hashCode())) * 31;
        ModGameVm modGameVm = this.mod_game_vm;
        int hashCode3 = (hashCode2 + (modGameVm == null ? 0 : modGameVm.hashCode())) * 31;
        Model model = this.model;
        int hashCode4 = (hashCode3 + (model == null ? 0 : model.hashCode())) * 31;
        NetGameVm netGameVm = this.net_game_vm;
        int hashCode5 = (hashCode4 + (netGameVm == null ? 0 : netGameVm.hashCode())) * 31;
        SelfSupport selfSupport = this.self_support;
        int hashCode6 = (hashCode5 + (selfSupport == null ? 0 : selfSupport.hashCode())) * 31;
        SingleGameVm singleGameVm = this.single_game_vm;
        return hashCode6 + (singleGameVm != null ? singleGameVm.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SpTagInfo(bt_game=" + this.bt_game + ", mini_game=" + this.mini_game + ", mod_game_vm=" + this.mod_game_vm + ", model=" + this.model + ", net_game_vm=" + this.net_game_vm + ", self_support=" + this.self_support + ", single_game_vm=" + this.single_game_vm + ')';
    }
}
