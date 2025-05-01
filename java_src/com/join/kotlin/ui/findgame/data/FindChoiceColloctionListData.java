package com.join.kotlin.ui.findgame.data;

import com.join.mgps.dto.CollectionBeanSub;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes3.dex */
public class FindChoiceColloctionListData {
    @NotNull
    private String component_id;
    @NotNull
    private List<CollectionBeanSub> game_list;
    @NotNull
    private String title;
    private String tpl_type;
    private int view_type = 2;

    public FindChoiceColloctionListData(@NotNull String str, @NotNull List<CollectionBeanSub> list, @NotNull String str2) {
        this.component_id = str;
        this.game_list = list;
        this.title = str2;
    }

    @NotNull
    public String getComponent_id() {
        return this.component_id;
    }

    @NotNull
    public List<CollectionBeanSub> getGame_list() {
        return this.game_list;
    }

    @NotNull
    public String getTitle() {
        return this.title;
    }

    public String getTpl_type() {
        return this.tpl_type;
    }

    public int getView_type() {
        return this.view_type;
    }

    public void setComponent_id(@NotNull String str) {
        this.component_id = str;
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.component_id = str;
    }

    public void setGame_list(@NotNull List<CollectionBeanSub> list) {
        this.game_list = list;
    }

    public void setTitle(@NotNull String str) {
        this.title = str;
    }

    public void setTpl_type(String str) {
        this.tpl_type = str;
    }

    public void setView_type(int i4) {
        this.view_type = i4;
    }

    public FindChoiceColloctionListData() {
    }
}
