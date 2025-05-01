package com.j256.ormlite.stmt.query;
/* loaded from: classes3.dex */
public class OrderBy {
    private final boolean ascending;
    private final String columnName;

    public OrderBy(String str, boolean z4) {
        this.columnName = str;
        this.ascending = z4;
    }

    public String getColumnName() {
        return this.columnName;
    }

    public boolean isAscending() {
        return this.ascending;
    }
}
