package com.kwad.framework.filedownloader.b;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.kwad.framework.filedownloader.b.a;
import com.kwad.framework.filedownloader.f.f;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes5.dex */
public final class d implements com.kwad.framework.filedownloader.b.a {
    private static boolean agn;
    private final e ago = new e(com.kwad.framework.filedownloader.f.c.xp());
    private SQLiteDatabase agp;

    /* loaded from: classes5.dex */
    public class a implements a.InterfaceC0493a {
        private final SparseArray<com.kwad.framework.filedownloader.d.c> agd;
        private final SparseArray<List<com.kwad.framework.filedownloader.d.a>> age;
        private final SparseArray<com.kwad.framework.filedownloader.d.c> agq = new SparseArray<>();
        private b agr;

        a(SparseArray<com.kwad.framework.filedownloader.d.c> sparseArray, SparseArray<List<com.kwad.framework.filedownloader.d.a>> sparseArray2) {
            this.agd = sparseArray;
            this.age = sparseArray2;
        }

        @Override // com.kwad.framework.filedownloader.b.a.InterfaceC0493a
        public final void a(int i4, com.kwad.framework.filedownloader.d.c cVar) {
            this.agq.put(i4, cVar);
        }

        @Override // com.kwad.framework.filedownloader.b.a.InterfaceC0493a
        public final void c(com.kwad.framework.filedownloader.d.c cVar) {
            SparseArray<com.kwad.framework.filedownloader.d.c> sparseArray = this.agd;
            if (sparseArray != null) {
                synchronized (sparseArray) {
                    this.agd.put(cVar.getId(), cVar);
                }
            }
        }

        @Override // java.lang.Iterable
        public final Iterator<com.kwad.framework.filedownloader.d.c> iterator() {
            b bVar = new b();
            this.agr = bVar;
            return bVar;
        }

        @Override // com.kwad.framework.filedownloader.b.a.InterfaceC0493a
        public final void vK() {
            b bVar = this.agr;
            if (bVar != null) {
                bVar.vK();
            }
            try {
                SQLiteDatabase vL = d.this.vL();
                if (vL == null) {
                    return;
                }
                int size = this.agq.size();
                try {
                    if (size < 0) {
                        return;
                    }
                    try {
                        vL.beginTransaction();
                        for (int i4 = 0; i4 < size; i4++) {
                            int keyAt = this.agq.keyAt(i4);
                            com.kwad.framework.filedownloader.d.c cVar = this.agq.get(keyAt);
                            vL.delete("ksad_file_download", "_id = ?", new String[]{String.valueOf(keyAt)});
                            vL.insert("ksad_file_download", null, cVar.wN());
                            if (cVar.wS() > 1) {
                                List<com.kwad.framework.filedownloader.d.a> bl = d.this.bl(keyAt);
                                if (bl.size() > 0) {
                                    vL.delete("ksad_file_download_connection", "id = ?", new String[]{String.valueOf(keyAt)});
                                    for (com.kwad.framework.filedownloader.d.a aVar : bl) {
                                        aVar.setId(cVar.getId());
                                        vL.insert("ksad_file_download_connection", null, aVar.wN());
                                    }
                                }
                            }
                        }
                        SparseArray<com.kwad.framework.filedownloader.d.c> sparseArray = this.agd;
                        if (sparseArray != null && this.age != null) {
                            synchronized (sparseArray) {
                                int size2 = this.agd.size();
                                for (int i5 = 0; i5 < size2; i5++) {
                                    int id = this.agd.valueAt(i5).getId();
                                    List<com.kwad.framework.filedownloader.d.a> bl2 = d.this.bl(id);
                                    if (bl2 != null && bl2.size() > 0) {
                                        synchronized (this.age) {
                                            this.age.put(id, bl2);
                                        }
                                    }
                                }
                            }
                        }
                        vL.setTransactionSuccessful();
                        try {
                            vL.endTransaction();
                        } catch (Exception e5) {
                            d.printStackTrace(e5);
                        }
                    } catch (SQLiteException e6) {
                        d.this.a(e6);
                        try {
                            vL.endTransaction();
                        } catch (Exception e7) {
                            d.printStackTrace(e7);
                        }
                    } catch (Exception e8) {
                        d.printStackTrace(e8);
                        try {
                            vL.endTransaction();
                        } catch (Exception e9) {
                            d.printStackTrace(e9);
                        }
                    }
                } catch (Throwable th) {
                    try {
                        vL.endTransaction();
                    } catch (Exception e10) {
                        d.printStackTrace(e10);
                    }
                    throw th;
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* loaded from: classes5.dex */
    class b implements Iterator<com.kwad.framework.filedownloader.d.c> {
        private Cursor agt;
        private final List<Integer> agu = new ArrayList();
        private int agv;

        b() {
            try {
                this.agt = d.this.vL().rawQuery("SELECT * FROM ksad_file_download", null);
            } catch (SQLiteException e5) {
                d.this.a(e5);
            } catch (Exception e6) {
                d.printStackTrace(e6);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.util.Iterator
        /* renamed from: vM */
        public com.kwad.framework.filedownloader.d.c next() {
            com.kwad.framework.filedownloader.d.c d5 = d.d(this.agt);
            this.agv = d5.getId();
            return d5;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            try {
                Cursor cursor = this.agt;
                if (cursor != null) {
                    return cursor.moveToNext();
                }
                return false;
            } catch (Throwable th) {
                d.printStackTrace(th);
                return false;
            }
        }

        @Override // java.util.Iterator
        public final void remove() {
            this.agu.add(Integer.valueOf(this.agv));
        }

        final void vK() {
            Cursor cursor = this.agt;
            if (cursor == null) {
                return;
            }
            cursor.close();
            if (this.agu.isEmpty()) {
                return;
            }
            String join = TextUtils.join(", ", this.agu);
            if (com.kwad.framework.filedownloader.f.d.ajb) {
                com.kwad.framework.filedownloader.f.d.c(this, "delete %s", join);
            }
            try {
                SQLiteDatabase vL = d.this.vL();
                vL.execSQL(f.b("DELETE FROM %s WHERE %s IN (%s);", "ksad_file_download", "_id", join));
                vL.execSQL(f.b("DELETE FROM %s WHERE %s IN (%s);", "ksad_file_download_connection", "id", join));
            } catch (SQLiteException e5) {
                d.this.a(e5);
            } catch (Exception e6) {
                d.printStackTrace(e6);
            }
        }
    }

    private void d(com.kwad.framework.filedownloader.d.c cVar) {
        try {
            vL().insert("ksad_file_download", null, cVar.wN());
        } catch (SQLiteException e5) {
            cVar.br(e5.toString());
            cVar.d((byte) -1);
            a(cVar.getId(), e5);
        } catch (Exception e6) {
            printStackTrace(e6);
        }
    }

    private static void h(Throwable th) {
        if (th != null) {
            th.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void printStackTrace(Throwable th) {
        h(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public SQLiteDatabase vL() {
        if (this.agp == null) {
            this.agp = this.ago.getWritableDatabase();
        }
        return this.agp;
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void b(com.kwad.framework.filedownloader.d.c cVar) {
        if (cVar == null) {
            com.kwad.framework.filedownloader.f.d.d(this, "update but model == null!", new Object[0]);
        } else if (bk(cVar.getId()) != null) {
            try {
                vL().update("ksad_file_download", cVar.wN(), "_id = ? ", new String[]{String.valueOf(cVar.getId())});
            } catch (SQLiteException e5) {
                cVar.br(e5.toString());
                cVar.d((byte) -1);
                a(cVar.getId(), e5);
            } catch (Exception e6) {
                printStackTrace(e6);
            }
        } else {
            d(cVar);
        }
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void bj(int i4) {
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0048: MOVE  (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:24:0x0048 */
    @Override // com.kwad.framework.filedownloader.b.a
    public final com.kwad.framework.filedownloader.d.c bk(int i4) {
        Cursor cursor;
        Closeable closeable;
        Closeable closeable2 = null;
        try {
            try {
                cursor = vL().rawQuery(f.b("SELECT * FROM %s WHERE %s = ?", "ksad_file_download", "_id"), new String[]{Integer.toString(i4)});
                try {
                    if (cursor.moveToNext()) {
                        com.kwad.framework.filedownloader.d.c d5 = d(cursor);
                        com.kwad.sdk.crash.utils.b.closeQuietly(cursor);
                        return d5;
                    }
                } catch (SQLiteException e5) {
                    e = e5;
                    a(i4, e);
                    com.kwad.sdk.crash.utils.b.closeQuietly(cursor);
                    return null;
                } catch (Exception e6) {
                    e = e6;
                    printStackTrace(e);
                    com.kwad.sdk.crash.utils.b.closeQuietly(cursor);
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                closeable2 = closeable;
                com.kwad.sdk.crash.utils.b.closeQuietly(closeable2);
                throw th;
            }
        } catch (SQLiteException e7) {
            e = e7;
            cursor = null;
        } catch (Exception e8) {
            e = e8;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            com.kwad.sdk.crash.utils.b.closeQuietly(closeable2);
            throw th;
        }
        com.kwad.sdk.crash.utils.b.closeQuietly(cursor);
        return null;
    }

    @Override // com.kwad.framework.filedownloader.b.a
    @SuppressLint({"Range"})
    public final List<com.kwad.framework.filedownloader.d.a> bl(int i4) {
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                cursor = vL().rawQuery(f.b("SELECT * FROM %s WHERE %s = ?", "ksad_file_download_connection", "id"), new String[]{Integer.toString(i4)});
                while (cursor.moveToNext()) {
                    com.kwad.framework.filedownloader.d.a aVar = new com.kwad.framework.filedownloader.d.a();
                    aVar.setId(i4);
                    aVar.setIndex(cursor.getInt(cursor.getColumnIndex("connectionIndex")));
                    aVar.setStartOffset(cursor.getLong(cursor.getColumnIndex("startOffset")));
                    aVar.Q(cursor.getLong(cursor.getColumnIndex("currentOffset")));
                    aVar.R(cursor.getLong(cursor.getColumnIndex("endOffset")));
                    arrayList.add(aVar);
                }
            } catch (SQLiteException e5) {
                a(i4, e5);
            } catch (Exception e6) {
                printStackTrace(e6);
            }
            return arrayList;
        } finally {
            com.kwad.sdk.crash.utils.b.closeQuietly(cursor);
        }
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void bm(int i4) {
        try {
            SQLiteDatabase vL = vL();
            vL.execSQL("DELETE FROM ksad_file_download_connection WHERE id = " + i4);
        } catch (SQLiteException e5) {
            printStackTrace(e5);
        } catch (Exception e6) {
            printStackTrace(e6);
        }
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final boolean bn(int i4) {
        try {
            return vL().delete("ksad_file_download", "_id = ?", new String[]{String.valueOf(i4)}) != 0;
        } catch (SQLiteException e5) {
            printStackTrace(e5);
            return false;
        } catch (Exception e6) {
            printStackTrace(e6);
            return false;
        }
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void bo(int i4) {
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void c(int i4, long j4) {
        bn(i4);
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void clear() {
        try {
            vL().delete("ksad_file_download", null, null);
        } catch (SQLiteException e5) {
            a(e5);
        }
        try {
            vL().delete("ksad_file_download_connection", null, null);
        } catch (SQLiteException e6) {
            a(e6);
        }
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void s(int i4, int i5) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("connectionCount", Integer.valueOf(i5));
        try {
            vL().update("ksad_file_download", contentValues, "_id = ? ", new String[]{Integer.toString(i4)});
        } catch (SQLiteException e5) {
            a(i4, e5);
        } catch (Exception e6) {
            printStackTrace(e6);
        }
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final a.InterfaceC0493a vJ() {
        return new a(null, null);
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void a(com.kwad.framework.filedownloader.d.a aVar) {
        if (aVar != null) {
            try {
                vL().insert("ksad_file_download_connection", null, aVar.wN());
            } catch (SQLiteException e5) {
                a(aVar.getId(), e5);
            } catch (Exception e6) {
                printStackTrace(e6);
            }
        }
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void a(int i4, int i5, long j4) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("currentOffset", Long.valueOf(j4));
        try {
            vL().update("ksad_file_download_connection", contentValues, "id = ? AND connectionIndex = ?", new String[]{Integer.toString(i4), Integer.toString(i5)});
        } catch (SQLiteException e5) {
            a(i4, e5);
        } catch (Exception e6) {
            printStackTrace(e6);
        }
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void d(int i4, long j4) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", (Byte) (byte) -2);
        contentValues.put("sofar", Long.valueOf(j4));
        a(i4, contentValues);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"Range"})
    public static com.kwad.framework.filedownloader.d.c d(Cursor cursor) {
        com.kwad.framework.filedownloader.d.c cVar = new com.kwad.framework.filedownloader.d.c();
        if (cursor == null) {
            return cVar;
        }
        cVar.setId(cursor.getInt(cursor.getColumnIndex("_id")));
        cVar.setUrl(cursor.getString(cursor.getColumnIndex("url")));
        cVar.d(cursor.getString(cursor.getColumnIndex("path")), cursor.getShort(cursor.getColumnIndex("pathAsDirectory")) == 1);
        cVar.d((byte) cursor.getShort(cursor.getColumnIndex("status")));
        cVar.S(cursor.getLong(cursor.getColumnIndex("sofar")));
        cVar.U(cursor.getLong(cursor.getColumnIndex("total")));
        cVar.br(cursor.getString(cursor.getColumnIndex("errMsg")));
        cVar.bq(cursor.getString(cursor.getColumnIndex("etag")));
        cVar.bs(cursor.getString(cursor.getColumnIndex("filename")));
        cVar.bD(cursor.getInt(cursor.getColumnIndex("connectionCount")));
        return cVar;
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void b(int i4, long j4) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", (Byte) (byte) 3);
        contentValues.put("sofar", Long.valueOf(j4));
        a(i4, contentValues);
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void a(int i4, String str, long j4, long j5, int i5) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("sofar", Long.valueOf(j4));
        contentValues.put("total", Long.valueOf(j5));
        contentValues.put("etag", str);
        contentValues.put("connectionCount", Integer.valueOf(i5));
        a(i4, contentValues);
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void a(int i4, long j4, String str, String str2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", (Byte) (byte) 2);
        contentValues.put("total", Long.valueOf(j4));
        contentValues.put("etag", str);
        contentValues.put("filename", str2);
        a(i4, contentValues);
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void a(int i4, Throwable th, long j4) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("errMsg", th.toString());
        contentValues.put("status", (Byte) (byte) -1);
        contentValues.put("sofar", Long.valueOf(j4));
        a(i4, contentValues);
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void a(int i4, Throwable th) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("errMsg", th.toString());
        contentValues.put("status", (Byte) (byte) 5);
        a(i4, contentValues);
    }

    public final a.InterfaceC0493a a(SparseArray<com.kwad.framework.filedownloader.d.c> sparseArray, SparseArray<List<com.kwad.framework.filedownloader.d.a>> sparseArray2) {
        return new a(sparseArray, sparseArray2);
    }

    private void a(int i4, ContentValues contentValues) {
        try {
            vL().update("ksad_file_download", contentValues, "_id = ? ", new String[]{String.valueOf(i4)});
        } catch (SQLiteException e5) {
            a(i4, e5);
        } catch (Exception e6) {
            printStackTrace(e6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(SQLiteException sQLiteException) {
        a(-1, sQLiteException);
    }

    private void a(int i4, @Nullable SQLiteException sQLiteException) {
        if (sQLiteException instanceof SQLiteFullException) {
            if (i4 != -1) {
                bn(i4);
                bm(i4);
            }
            h(sQLiteException);
            agn = true;
            return;
        }
        printStackTrace(sQLiteException);
    }
}
