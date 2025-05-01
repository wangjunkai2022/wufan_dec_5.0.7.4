package com.kwad.sdk.core.report;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import androidx.annotation.Nullable;
/* loaded from: classes5.dex */
public class c extends SQLiteOpenHelper {
    private String ayJ;

    public c(@Nullable Context context, @Nullable String str, int i4, String str2) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i4);
        this.ayJ = str2;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(this.ayJ);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        super.onOpen(sQLiteDatabase);
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 16) {
            setWriteAheadLoggingEnabled(true);
        } else if (i4 >= 11) {
            sQLiteDatabase.enableWriteAheadLogging();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i4, int i5) {
    }
}
