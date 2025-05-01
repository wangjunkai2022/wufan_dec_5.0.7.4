package com.psk.frame.roomlibrary.volcano.dao;

import com.j256.ormlite.dao.Dao;
import com.psk.frame.roomlibrary.volcano.database.VolcanoDataBaseHelper;
import com.psk.frame.roomlibrary.volcano.entity.VolcanoEventTab;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* compiled from: VolcanoEventDao.kt */
/* loaded from: classes5.dex */
public final class VolcanoEventDao {
    @NotNull
    private Dao<VolcanoEventTab, Integer> dao;
    @NotNull
    private final VolcanoDataBaseHelper databaseHelper;

    public VolcanoEventDao(@NotNull VolcanoDataBaseHelper databaseHelper) {
        Intrinsics.checkNotNullParameter(databaseHelper, "databaseHelper");
        this.databaseHelper = databaseHelper;
        Dao<VolcanoEventTab, Integer> dao = databaseHelper.getDao(VolcanoEventTab.class);
        Intrinsics.checkNotNullExpressionValue(dao, "databaseHelper.getDao(VolcanoEventTab::class.java)");
        this.dao = dao;
    }

    private static /* synthetic */ void getDao$annotations() {
    }

    public final void deletById(int i4) {
        this.dao.deleteById(Integer.valueOf(i4));
    }

    public final void delete(@NotNull VolcanoEventTab tab) {
        Intrinsics.checkNotNullParameter(tab, "tab");
        this.dao.deleteById(Integer.valueOf(tab.getId()));
    }

    public final void insertTab(@NotNull VolcanoEventTab tab) {
        Intrinsics.checkNotNullParameter(tab, "tab");
        this.dao.createIfNotExists(tab);
    }

    @NotNull
    public final List<VolcanoEventTab> queryForAll() {
        List<VolcanoEventTab> queryForAll = this.dao.queryForAll();
        Intrinsics.checkNotNullExpressionValue(queryForAll, "dao.queryForAll()");
        return queryForAll;
    }

    public final void update(@NotNull VolcanoEventTab tab) {
        Intrinsics.checkNotNullParameter(tab, "tab");
        this.dao.update((Dao<VolcanoEventTab, Integer>) tab);
    }
}
