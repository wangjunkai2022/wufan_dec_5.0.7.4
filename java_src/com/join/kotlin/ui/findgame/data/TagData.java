package com.join.kotlin.ui.findgame.data;

import org.jetbrains.annotations.NotNull;
/* loaded from: classes3.dex */
public class TagData {
    private int id;
    @NotNull
    private String title;
    private int type;

    public TagData(int i4, int i5, @NotNull String str) {
        this.id = i4;
        this.type = i5;
        this.title = str;
    }

    public int getId() {
        return this.id;
    }

    @NotNull
    public String getTitle() {
        return this.title;
    }

    public int getType() {
        return this.type;
    }

    public void setId(int i4) {
        this.id = i4;
    }

    public void setTitle(@NotNull String str) {
        this.title = str;
    }

    public void setType(int i4) {
        this.type = i4;
    }

    public TagData(int i4, @NotNull String str) {
        this.id = i4;
        this.title = str;
    }

    public TagData() {
    }
}
