package com.kwad.sdk.core.report;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes5.dex */
public abstract class d implements l<e> {
    private static boolean ayK;
    protected c ayL;

    public d(c cVar) {
        a(cVar);
    }

    private void a(c cVar) {
        this.ayL = cVar;
    }

    private synchronized void c(e eVar) {
        if (ayK) {
            getTag();
            new StringBuilder("deleteAction action = ").append(eVar);
        }
        try {
            this.ayL.getReadableDatabase().delete(Fq(), "actionId=?", new String[]{eVar.actionId});
        } catch (Exception e5) {
            com.kwad.sdk.core.e.c.printStackTrace(e5);
        }
    }

    protected abstract String Fq();

    protected abstract String Fr();

    @Override // com.kwad.sdk.core.report.l
    public final synchronized List<e> Fs() {
        try {
            String Fr = Fr();
            r0 = TextUtils.isEmpty(Fr) ? null : this.ayL.getReadableDatabase().rawQuery(Fr, null);
            if (r0 != null) {
                ArrayList<e> arrayList = new ArrayList();
                while (r0.moveToNext()) {
                    try {
                        arrayList.add(g(r0));
                    } catch (Exception e5) {
                        com.kwad.sdk.core.e.c.printStackTrace(e5);
                    }
                }
                if (ayK) {
                    getTag();
                    new StringBuilder("read size= ").append(arrayList.size());
                    for (e eVar : arrayList) {
                        getTag();
                        new StringBuilder("read action=").append(eVar);
                    }
                }
                com.kwad.sdk.crash.utils.b.closeQuietly(r0);
                return arrayList;
            }
        } catch (Exception e6) {
            com.kwad.sdk.core.e.c.printStackTrace(e6);
        }
        com.kwad.sdk.crash.utils.b.closeQuietly(r0);
        return new ArrayList();
    }

    @Override // com.kwad.sdk.core.report.l
    /* renamed from: b */
    public final synchronized void j(e eVar) {
        ContentValues contentValues;
        if (ayK) {
            getTag();
            new StringBuilder("write = ").append(eVar);
        }
        try {
            contentValues = new ContentValues();
            contentValues.put("actionId", eVar.actionId);
            contentValues.put("aLog", eVar.toJson().toString());
        } catch (Exception e5) {
            com.kwad.sdk.core.e.c.printStackTrace(e5);
        }
        try {
            this.ayL.getReadableDatabase().insert(Fq(), null, contentValues);
        } catch (Exception e6) {
            com.kwad.sdk.core.e.c.printStackTrace(e6);
        }
    }

    protected abstract e g(@NonNull Cursor cursor);

    protected abstract String getTag();

    @Override // com.kwad.sdk.core.report.l
    public final synchronized long size() {
        long j4;
        Cursor cursor = null;
        try {
            SQLiteDatabase readableDatabase = this.ayL.getReadableDatabase();
            cursor = readableDatabase.rawQuery("select count(*) from " + Fq(), null);
            cursor.moveToFirst();
            j4 = cursor.getLong(0);
            com.kwad.sdk.crash.utils.b.closeQuietly(cursor);
        } catch (Exception e5) {
            com.kwad.sdk.core.e.c.printStackTraceOnly(e5);
            com.kwad.sdk.crash.utils.b.closeQuietly(cursor);
            j4 = 0;
        }
        return j4;
    }

    @Override // com.kwad.sdk.core.report.l
    public final synchronized void x(List<e> list) {
        if (ayK) {
            getTag();
            new StringBuilder("delete size= ").append(list.size());
        }
        SQLiteDatabase sQLiteDatabase = null;
        try {
            sQLiteDatabase = this.ayL.getReadableDatabase();
            sQLiteDatabase.beginTransaction();
            for (e eVar : list) {
                c(eVar);
            }
            sQLiteDatabase.setTransactionSuccessful();
            try {
                sQLiteDatabase.endTransaction();
            } catch (Exception e5) {
                com.kwad.sdk.core.e.c.printStackTrace(e5);
            }
        } catch (Exception e6) {
            com.kwad.sdk.core.e.c.printStackTrace(e6);
            if (sQLiteDatabase != null) {
                try {
                    sQLiteDatabase.endTransaction();
                } catch (Exception e7) {
                    com.kwad.sdk.core.e.c.printStackTrace(e7);
                }
            }
        }
    }
}
