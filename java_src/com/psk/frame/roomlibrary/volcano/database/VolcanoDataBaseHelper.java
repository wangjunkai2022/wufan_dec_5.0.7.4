package com.psk.frame.roomlibrary.volcano.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;
import com.psk.frame.roomlibrary.volcano.entity.VolcanoEventTab;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: VolcanoDataBase.kt */
/* loaded from: classes5.dex */
public final class VolcanoDataBaseHelper extends OrmLiteSqliteOpenHelper {
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    private final Context f59649b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VolcanoDataBaseHelper(@NotNull Context context) {
        super(context, "volcano.db", null, 2);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f59649b = context;
    }

    @NotNull
    public final Context getContext() {
        return this.f59649b;
    }

    @Override // com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper
    public void onCreate(@Nullable SQLiteDatabase sQLiteDatabase, @Nullable ConnectionSource connectionSource) {
        TableUtils.createTable(connectionSource, VolcanoEventTab.class);
    }

    @Override // com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper
    public void onUpgrade(@Nullable SQLiteDatabase sQLiteDatabase, @Nullable ConnectionSource connectionSource, int i4, int i5) {
    }
}
