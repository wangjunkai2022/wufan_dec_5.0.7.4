package com.kwad.components.core.c;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.kwad.sdk.service.ServiceProvider;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes5.dex */
public class a {
    private static volatile a Jq;
    private final SQLiteDatabase Jp;

    /* renamed from: com.kwad.components.core.c.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    static class C0447a extends SQLiteOpenHelper {
        private static int Jr = 1;
        private String Js;
        private String Jt;

        public C0447a(@Nullable Context context) {
            super(context, "ksadcache.db", (SQLiteDatabase.CursorFactory) null, Jr);
            this.Js = "CREATE TABLE IF NOT EXISTS ksad_ad_cache (creativeId VARCHAR PRIMARY KEY NOT NULL, posId TEXT, adJson TEXT, ecpm INTEGER, playAgainJson TEXT, adSenseJson TEXT, createTime INTEGER, expireTime INTEGER)";
            this.Jt = "CREATE TABLE IF NOT EXISTS ksad_ad_cache_strategy(posId VARCHAR PRIMARY KEY NOT NULL, cacheSize INTEGER, cacheSecond INTEGER, strategyCode INTEGER, enable INTEGER)";
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onCreate(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL(this.Js);
            sQLiteDatabase.execSQL(this.Jt);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i4, int i5) {
        }
    }

    private a(Context context) {
        this.Jp = new C0447a(context).getWritableDatabase();
    }

    private <T extends i> void b(List<T> list, String str) {
        try {
            try {
                this.Jp.beginTransaction();
                for (T t4 : list) {
                    try {
                        long insertWithOnConflict = this.Jp.insertWithOnConflict(str, null, t4.nd(), 5);
                        com.kwad.sdk.core.e.c.d("AdCacheDBManager", "insertData: " + str + ", rowId: " + insertWithOnConflict);
                    } catch (Exception e5) {
                        com.kwad.sdk.core.e.c.printStackTrace(e5);
                    }
                }
                this.Jp.setTransactionSuccessful();
                SQLiteDatabase sQLiteDatabase = this.Jp;
                if (sQLiteDatabase != null) {
                    try {
                        sQLiteDatabase.endTransaction();
                    } catch (Exception e6) {
                        com.kwad.sdk.core.e.c.printStackTrace(e6);
                    }
                }
            } catch (Exception e7) {
                com.kwad.sdk.core.e.c.printStackTrace(e7);
                SQLiteDatabase sQLiteDatabase2 = this.Jp;
                if (sQLiteDatabase2 != null) {
                    try {
                        sQLiteDatabase2.endTransaction();
                    } catch (Exception e8) {
                        com.kwad.sdk.core.e.c.printStackTrace(e8);
                    }
                }
            }
        } catch (Throwable th) {
            SQLiteDatabase sQLiteDatabase3 = this.Jp;
            if (sQLiteDatabase3 != null) {
                try {
                    sQLiteDatabase3.endTransaction();
                } catch (Exception e9) {
                    com.kwad.sdk.core.e.c.printStackTrace(e9);
                }
            }
            throw th;
        }
    }

    @Nullable
    public static a mU() {
        if (Jq == null) {
            synchronized (a.class) {
                if (Jq == null) {
                    try {
                        Jq = new a(ServiceProvider.Lw());
                    } catch (SQLiteException e5) {
                        com.kwad.sdk.core.e.c.printStackTraceOnly(e5);
                        Jq = null;
                    }
                }
            }
        }
        return Jq;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.io.Closeable] */
    @WorkerThread
    public final e Y(String str) {
        Throwable th;
        Cursor cursor;
        try {
            try {
                cursor = this.Jp.rawQuery("select  * from ksad_ad_cache_strategy where posId=?", new String[]{str});
                try {
                    List<e> a5 = e.a(cursor);
                    if (a5 != null && a5.size() > 0) {
                        e eVar = a5.get(0);
                        com.kwad.sdk.crash.utils.b.closeQuietly(cursor);
                        return eVar;
                    }
                } catch (Exception e5) {
                    e = e5;
                    com.kwad.sdk.core.e.c.printStackTraceOnly(e);
                    com.kwad.sdk.crash.utils.b.closeQuietly(cursor);
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                com.kwad.sdk.crash.utils.b.closeQuietly((Closeable) str);
                throw th;
            }
        } catch (Exception e6) {
            e = e6;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            str = 0;
            com.kwad.sdk.crash.utils.b.closeQuietly((Closeable) str);
            throw th;
        }
        com.kwad.sdk.crash.utils.b.closeQuietly(cursor);
        return null;
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0096: MOVE  (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:34:0x0096 */
    @Nullable
    @WorkerThread
    public final List<h> a(String str, long j4, int i4) {
        Cursor cursor;
        Closeable closeable;
        Closeable closeable2 = null;
        try {
            try {
                cursor = this.Jp.rawQuery("select  * from ksad_ad_cache where posId=? order by createTime desc", new String[]{str});
                try {
                    List<h> a5 = h.a(cursor);
                    if (a5 == null) {
                        com.kwad.sdk.crash.utils.b.closeQuietly(cursor);
                        return null;
                    }
                    StringBuilder sb = new StringBuilder("(posId = " + str + ") AND (");
                    ArrayList arrayList = new ArrayList();
                    int i5 = 0;
                    for (h hVar : a5) {
                        i5++;
                        if (i5 <= i4) {
                            if (hVar.nk() >= j4) {
                                arrayList.add(hVar);
                            }
                        } else {
                            sb.append(" creativeId = ");
                            sb.append(hVar.nm());
                            if (i5 == a5.size()) {
                                sb.append(")");
                            } else {
                                sb.append(" OR");
                            }
                        }
                    }
                    if (i5 > i4) {
                        this.Jp.delete("ksad_ad_cache", sb.toString(), new String[0]);
                    }
                    com.kwad.sdk.crash.utils.b.closeQuietly(cursor);
                    return arrayList;
                } catch (Exception e5) {
                    e = e5;
                    com.kwad.sdk.core.e.c.printStackTraceOnly(e);
                    com.kwad.sdk.crash.utils.b.closeQuietly(cursor);
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                closeable2 = closeable;
                com.kwad.sdk.crash.utils.b.closeQuietly(closeable2);
                throw th;
            }
        } catch (Exception e6) {
            e = e6;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            com.kwad.sdk.crash.utils.b.closeQuietly(closeable2);
            throw th;
        }
    }

    @WorkerThread
    public final void i(List<h> list) {
        b(list, "ksad_ad_cache");
    }

    @WorkerThread
    public final void mV() {
        try {
            this.Jp.delete("ksad_ad_cache", "expireTime<?", new String[]{String.valueOf(System.currentTimeMillis() / 1000)});
        } catch (Exception e5) {
            com.kwad.sdk.core.e.c.printStackTrace(e5);
        }
    }

    @WorkerThread
    public final void r(long j4) {
        try {
            int delete = this.Jp.delete("ksad_ad_cache", "creativeId=?", new String[]{String.valueOf(j4)});
            com.kwad.sdk.core.e.c.d("AdCacheDBManager", "deleteCachedAdByCreativeId result: " + delete);
        } catch (Exception e5) {
            com.kwad.sdk.core.e.c.printStackTrace(e5);
        }
    }

    public final void a(e eVar) {
        b(Collections.singletonList(eVar), "ksad_ad_cache_strategy");
    }
}
