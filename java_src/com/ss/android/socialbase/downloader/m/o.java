package com.ss.android.socialbase.downloader.m;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.text.TextUtils;
import android.util.SparseArray;
import com.android.dex.DexFormat;
import com.join.mgps.activity.PapayPayDetialActivity_;
import com.ss.android.socialbase.downloader.downloader.x;
import com.ss.android.socialbase.downloader.m.p;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.u.wv;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.json.JSONArray;
/* loaded from: classes5.dex */
public class o extends p.vv implements x {

    /* renamed from: m  reason: collision with root package name */
    private static volatile SQLiteDatabase f61141m;

    /* renamed from: i  reason: collision with root package name */
    private n f61142i;

    /* renamed from: o  reason: collision with root package name */
    private n f61143o;

    /* renamed from: p  reason: collision with root package name */
    private n f61144p;

    /* renamed from: u  reason: collision with root package name */
    private volatile boolean f61145u;
    m vv;

    public o() {
        this(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void b() {
        wv();
        f61141m.delete("downloader", null, null);
        f61141m.delete("downloadChunk", null, null);
        f61141m.setTransactionSuccessful();
        k();
    }

    private void k() {
        try {
            if (f61141m == null || !f61141m.inTransaction()) {
                return;
            }
            f61141m.endTransaction();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qv() {
        if (f61141m == null) {
            synchronized (o.class) {
                if (f61141m == null) {
                    f61141m = vv.vv().getWritableDatabase();
                    this.f61144p = new n(f61141m, "downloader", com.ss.android.socialbase.downloader.constants.p.vv, com.ss.android.socialbase.downloader.constants.p.f60952m);
                    this.f61142i = new n(f61141m, "downloadChunk", com.ss.android.socialbase.downloader.constants.p.f60954p, com.ss.android.socialbase.downloader.constants.p.f60951i);
                    this.f61143o = new n(f61141m, "segments", com.ss.android.socialbase.downloader.constants.p.f60953o, com.ss.android.socialbase.downloader.constants.p.f60955u);
                }
            }
        }
    }

    private void update(final int i4, final ContentValues contentValues) {
        qv();
        if (f61141m == null) {
            return;
        }
        com.ss.android.socialbase.downloader.downloader.p.p(new Runnable() { // from class: com.ss.android.socialbase.downloader.m.o.3
            @Override // java.lang.Runnable
            public void run() {
                o.this.vv(i4, contentValues);
            }
        });
    }

    private void wv() {
        f61141m.beginTransaction();
    }

    @Override // com.ss.android.socialbase.downloader.m.p, com.ss.android.socialbase.downloader.downloader.k
    public List<DownloadInfo> i(String str) {
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public Map<Long, wv> jh(int i4) {
        Cursor cursor;
        qv();
        if (f61141m != null) {
            try {
                cursor = f61141m.rawQuery(String.format("SELECT * FROM %s WHERE %s = ?", "segments", "_id"), new String[]{Integer.toString(i4)});
                try {
                    if (cursor.moveToNext()) {
                        int columnIndex = cursor.getColumnIndex(PapayPayDetialActivity_.f36841l);
                        String string = columnIndex >= 0 ? cursor.getString(columnIndex) : null;
                        HashMap hashMap = new HashMap();
                        JSONArray jSONArray = new JSONArray(string);
                        for (int i5 = 0; i5 < jSONArray.length(); i5++) {
                            wv wvVar = new wv(jSONArray.getJSONObject(i5));
                            hashMap.put(Long.valueOf(wvVar.p()), wvVar);
                        }
                        com.ss.android.socialbase.downloader.wv.u.vv(cursor);
                        return hashMap;
                    }
                    com.ss.android.socialbase.downloader.wv.u.vv(cursor);
                } catch (Throwable th) {
                    th = th;
                    try {
                        th.printStackTrace();
                        com.ss.android.socialbase.downloader.wv.u.vv(cursor);
                        return null;
                    } catch (Throwable th2) {
                        com.ss.android.socialbase.downloader.wv.u.vv(cursor);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                cursor = null;
            }
        }
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.m.p, com.ss.android.socialbase.downloader.downloader.k
    public List<DownloadInfo> m() {
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.m.p, com.ss.android.socialbase.downloader.downloader.k
    public List<DownloadInfo> m(String str) {
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.m.p, com.ss.android.socialbase.downloader.downloader.k
    public void m(DownloadInfo downloadInfo) {
    }

    @Override // com.ss.android.socialbase.downloader.m.p, com.ss.android.socialbase.downloader.downloader.k
    public DownloadInfo n(int i4) {
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.m.p, com.ss.android.socialbase.downloader.downloader.k
    public boolean o() {
        return false;
    }

    @Override // com.ss.android.socialbase.downloader.m.p, com.ss.android.socialbase.downloader.downloader.k
    public boolean o(int i4) {
        n nVar;
        qv();
        if (f61141m != null && (nVar = this.f61144p) != null) {
            try {
                vv(i4, nVar.m());
                return true;
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return false;
    }

    @Override // com.ss.android.socialbase.downloader.m.p, com.ss.android.socialbase.downloader.downloader.k
    public List<DownloadInfo> p(String str) {
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public void r(int i4) {
        qv();
        if (f61141m == null) {
            return;
        }
        try {
            vv(i4, this.f61143o.m());
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.m.p, com.ss.android.socialbase.downloader.downloader.k
    public boolean u(final int i4) {
        com.ss.android.socialbase.downloader.downloader.p.p(new Runnable() { // from class: com.ss.android.socialbase.downloader.m.o.11
            @Override // java.lang.Runnable
            public void run() {
                o.this.o(i4);
                o.this.i(i4);
                o.this.r(i4);
            }
        });
        return true;
    }

    @Override // com.ss.android.socialbase.downloader.m.p, com.ss.android.socialbase.downloader.downloader.k
    public void vv(int i4, List<com.ss.android.socialbase.downloader.model.m> list) {
    }

    public o(boolean z4) {
        this.vv = null;
        if (z4) {
            this.f61145u = false;
            vv();
        }
    }

    @Override // com.ss.android.socialbase.downloader.m.p, com.ss.android.socialbase.downloader.downloader.k
    public void i(final int i4) {
        qv();
        if (f61141m == null || this.f61142i == null) {
            return;
        }
        com.ss.android.socialbase.downloader.downloader.p.p(new Runnable() { // from class: com.ss.android.socialbase.downloader.m.o.4
            @Override // java.lang.Runnable
            public void run() {
                try {
                    o.this.vv(i4, o.this.f61142i.m());
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        });
    }

    @Override // com.ss.android.socialbase.downloader.m.p, com.ss.android.socialbase.downloader.downloader.k
    public DownloadInfo m(int i4) {
        Cursor cursor;
        qv();
        if (f61141m != null) {
            try {
                cursor = f61141m.rawQuery(String.format("SELECT * FROM %s WHERE %s = ?", "downloader", "_id"), new String[]{Integer.toString(i4)});
                try {
                    if (cursor.moveToNext()) {
                        DownloadInfo downloadInfo = new DownloadInfo(cursor);
                        com.ss.android.socialbase.downloader.wv.u.vv(cursor);
                        return downloadInfo;
                    }
                    com.ss.android.socialbase.downloader.wv.u.vv(cursor);
                } catch (Throwable th) {
                    th = th;
                    try {
                        th.printStackTrace();
                        com.ss.android.socialbase.downloader.wv.u.vv(cursor);
                        return null;
                    } catch (Throwable th2) {
                        com.ss.android.socialbase.downloader.wv.u.vv(cursor);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                cursor = null;
            }
        }
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.m.p, com.ss.android.socialbase.downloader.downloader.k
    public List<com.ss.android.socialbase.downloader.model.m> p(int i4) {
        ArrayList arrayList = new ArrayList();
        qv();
        if (f61141m != null) {
            Cursor cursor = null;
            try {
                cursor = f61141m.rawQuery(String.format("SELECT * FROM %s WHERE %s = ?", "downloadChunk", "_id"), new String[]{Integer.toString(i4)});
                while (cursor.moveToNext()) {
                    arrayList.add(new com.ss.android.socialbase.downloader.model.m(cursor));
                }
                com.ss.android.socialbase.downloader.wv.u.vv(cursor);
            } catch (Throwable th) {
                try {
                    th.printStackTrace();
                    com.ss.android.socialbase.downloader.wv.u.vv(cursor);
                } catch (Throwable th2) {
                    com.ss.android.socialbase.downloader.wv.u.vv(cursor);
                    throw th2;
                }
            }
        }
        return arrayList;
    }

    @Override // com.ss.android.socialbase.downloader.m.p, com.ss.android.socialbase.downloader.downloader.k
    public DownloadInfo wv(int i4) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", (Integer) 1);
        update(i4, contentValues);
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.m.p, com.ss.android.socialbase.downloader.downloader.k
    public DownloadInfo k(int i4) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", (Integer) (-7));
        update(i4, contentValues);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void i(DownloadInfo downloadInfo) {
        if (downloadInfo == null) {
            return;
        }
        try {
            if (!vv(downloadInfo.getId())) {
                p(downloadInfo);
                return;
            }
            n nVar = this.f61144p;
            if (nVar == null) {
                return;
            }
            m(downloadInfo, nVar.p());
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.m.p
    public DownloadInfo o(int i4, long j4) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", (Integer) (-4));
        contentValues.put("curBytes", Long.valueOf(j4));
        update(i4, contentValues);
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.m.p, com.ss.android.socialbase.downloader.downloader.k
    public DownloadInfo qv(int i4) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", (Integer) 5);
        contentValues.put("isFirstDownload", (Integer) 0);
        update(i4, contentValues);
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    /* renamed from: b */
    public ArrayList<wv> t(int i4) {
        Map<Long, wv> jh = jh(i4);
        if (jh == null || jh.isEmpty()) {
            return null;
        }
        return new ArrayList<>(jh.values());
    }

    @Override // com.ss.android.socialbase.downloader.m.p, com.ss.android.socialbase.downloader.downloader.k
    public void m(com.ss.android.socialbase.downloader.model.m mVar) {
        vv(mVar);
    }

    private void m(DownloadInfo downloadInfo, SQLiteStatement sQLiteStatement) {
        if (downloadInfo == null || sQLiteStatement == null) {
            return;
        }
        try {
            synchronized (sQLiteStatement) {
                downloadInfo.bindValue(sQLiteStatement);
                sQLiteStatement.bindLong(downloadInfo.getBindValueCount() + 1, downloadInfo.getId());
                sQLiteStatement.execute();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.m.p
    public void vv() {
        vv(new SparseArray<>(), new SparseArray<>(), (i) null);
    }

    private void p(final DownloadInfo downloadInfo) {
        qv();
        if (f61141m == null || this.f61144p == null) {
            return;
        }
        com.ss.android.socialbase.downloader.downloader.p.p(new Runnable() { // from class: com.ss.android.socialbase.downloader.m.o.9
            @Override // java.lang.Runnable
            public void run() {
                try {
                    o oVar = o.this;
                    oVar.vv(downloadInfo, oVar.f61144p.vv());
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        });
    }

    @Override // com.ss.android.socialbase.downloader.downloader.x
    public void vv(final SparseArray<DownloadInfo> sparseArray, final SparseArray<List<com.ss.android.socialbase.downloader.model.m>> sparseArray2, final i iVar) {
        try {
            Runnable runnable = new Runnable() { // from class: com.ss.android.socialbase.downloader.m.o.1
                /* JADX WARN: Code restructure failed: missing block: B:124:0x027a, code lost:
                    if (r0 == null) goto L92;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:129:0x0284, code lost:
                    if (r0 == null) goto L92;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:164:0x033e, code lost:
                    if (r0 == null) goto L184;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:169:0x0347, code lost:
                    if (r0 == null) goto L184;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:170:0x0349, code lost:
                    r0.vv();
                    r18.f61146i.f61145u = true;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:171:0x0351, code lost:
                    r18.f61146i.vv(r2, r3);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:172:0x035a, code lost:
                    throw r0;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:81:0x01a5, code lost:
                    if (r0 != null) goto L91;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:82:0x01a7, code lost:
                    r0.vv();
                    r18.f61146i.f61145u = true;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:83:0x01af, code lost:
                    r18.f61146i.vv(r2, r3);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:84:0x01b8, code lost:
                    return;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:88:0x01bf, code lost:
                    if (r0 == null) goto L92;
                 */
                /* JADX WARN: Removed duplicated region for block: B:196:0x00da A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:198:0x00ca A[SYNTHETIC] */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public void run() {
                    /*
                        Method dump skipped, instructions count: 887
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.m.o.AnonymousClass1.run():void");
                }
            };
            ExecutorService g4 = com.ss.android.socialbase.downloader.downloader.p.g();
            if (g4 != null) {
                g4.execute(runnable);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.m.p, com.ss.android.socialbase.downloader.downloader.k
    public DownloadInfo i(int i4, long j4) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", (Integer) (-2));
        contentValues.put("curBytes", Long.valueOf(j4));
        update(i4, contentValues);
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.m.p, com.ss.android.socialbase.downloader.downloader.k
    public void p() {
        qv();
        if (f61141m == null) {
            return;
        }
        com.ss.android.socialbase.downloader.downloader.p.p(new Runnable() { // from class: com.ss.android.socialbase.downloader.m.o.2
            @Override // java.lang.Runnable
            public void run() {
                o.this.b();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vv(List<DownloadInfo> list) {
        if (list == null) {
            return;
        }
        try {
            for (DownloadInfo downloadInfo : list) {
                if (downloadInfo != null && downloadInfo.isSavePathRedirected()) {
                    com.ss.android.socialbase.downloader.wv.u.m(downloadInfo);
                }
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.ss.android.socialbase.downloader.m.p, com.ss.android.socialbase.downloader.downloader.k
    public boolean i() {
        return this.f61145u;
    }

    @Override // com.ss.android.socialbase.downloader.m.p, com.ss.android.socialbase.downloader.downloader.k
    public DownloadInfo m(int i4, long j4) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", (Integer) (-1));
        contentValues.put("curBytes", Long.valueOf(j4));
        if (j4 > 0) {
            contentValues.put("isFirstDownload", (Integer) 0);
        }
        update(i4, contentValues);
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.m.p, com.ss.android.socialbase.downloader.downloader.k
    public DownloadInfo p(int i4, long j4) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", (Integer) (-3));
        contentValues.put("curBytes", Long.valueOf(j4));
        contentValues.put("isFirstDownload", (Integer) 0);
        contentValues.put("isFirstSuccess", (Integer) 0);
        update(i4, contentValues);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vv(List<DownloadInfo> list, List<Integer> list2, SparseArray<DownloadInfo> sparseArray, SparseArray<DownloadInfo> sparseArray2, SparseArray<List<com.ss.android.socialbase.downloader.model.m>> sparseArray3) {
        int size = sparseArray.size();
        if (size < 0 || f61141m == null) {
            return;
        }
        synchronized (f61141m) {
            try {
                wv();
                if (!list.isEmpty()) {
                    if (com.ss.android.socialbase.downloader.n.vv.p().vv("clear_invalid_task_error")) {
                        String[] strArr = new String[list.size()];
                        for (int i4 = 0; i4 < list.size(); i4++) {
                            strArr[i4] = String.valueOf(list.get(i4));
                        }
                        String str = "CAST(_id AS TEXT) IN (" + new String(new char[list.size() - 1]).replace(DexFormat.MAGIC_SUFFIX, "?,") + "?)";
                        f61141m.delete("downloader", str, strArr);
                        f61141m.delete("downloadChunk", str, strArr);
                    } else {
                        String join = TextUtils.join(", ", list2);
                        f61141m.delete("downloader", "_id IN (?)", new String[]{join});
                        f61141m.delete("downloadChunk", "_id IN (?)", new String[]{join});
                    }
                }
                for (int i5 = 0; i5 < size; i5++) {
                    int keyAt = sparseArray.keyAt(i5);
                    DownloadInfo downloadInfo = sparseArray.get(keyAt);
                    f61141m.delete("downloader", "_id = ?", new String[]{String.valueOf(keyAt)});
                    f61141m.insert("downloader", null, downloadInfo.toContentValues());
                    if (downloadInfo.getChunkCount() > 1) {
                        List<com.ss.android.socialbase.downloader.model.m> p4 = p(keyAt);
                        if (p4.size() > 0) {
                            f61141m.delete("downloadChunk", "_id = ?", new String[]{String.valueOf(keyAt)});
                            for (com.ss.android.socialbase.downloader.model.m mVar : p4) {
                                mVar.m(downloadInfo.getId());
                                f61141m.insert("downloadChunk", null, mVar.vv());
                            }
                        }
                    }
                }
                if (sparseArray2 != null && sparseArray3 != null) {
                    int size2 = sparseArray2.size();
                    for (int i6 = 0; i6 < size2; i6++) {
                        int id = sparseArray2.valueAt(i6).getId();
                        List<com.ss.android.socialbase.downloader.model.m> vv = com.ss.android.socialbase.downloader.wv.u.vv(p(id));
                        if (vv != null && vv.size() > 0) {
                            sparseArray3.put(id, vv);
                        }
                    }
                }
                f61141m.setTransactionSuccessful();
                k();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.m.p, com.ss.android.socialbase.downloader.downloader.k
    public void m(int i4, List<com.ss.android.socialbase.downloader.model.m> list) {
        try {
            i(i4);
            if (list != null) {
                for (com.ss.android.socialbase.downloader.model.m mVar : list) {
                    if (mVar != null) {
                        vv(mVar);
                        if (mVar.u()) {
                            for (com.ss.android.socialbase.downloader.model.m mVar2 : mVar.n()) {
                                vv(mVar2);
                            }
                        }
                    }
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.m.p
    public boolean vv(int i4) {
        try {
            return m(i4) != null;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    @Override // com.ss.android.socialbase.downloader.m.p, com.ss.android.socialbase.downloader.downloader.k
    public List<DownloadInfo> vv(String str) {
        qv();
        ArrayList arrayList = new ArrayList();
        if (f61141m != null) {
            Cursor cursor = null;
            try {
                cursor = f61141m.rawQuery(String.format("SELECT * FROM %s WHERE %s = ?", "downloader", "url"), new String[]{str});
                if (cursor.moveToNext()) {
                    arrayList.add(new DownloadInfo(cursor));
                }
                com.ss.android.socialbase.downloader.wv.u.vv(cursor);
            } catch (Throwable th) {
                try {
                    th.printStackTrace();
                    com.ss.android.socialbase.downloader.wv.u.vv(cursor);
                } catch (Throwable th2) {
                    com.ss.android.socialbase.downloader.wv.u.vv(cursor);
                    throw th2;
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vv(int i4, SQLiteStatement sQLiteStatement) {
        if (sQLiteStatement == null) {
            return;
        }
        try {
            synchronized (sQLiteStatement) {
                sQLiteStatement.bindLong(1, i4);
                sQLiteStatement.execute();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.m.p, com.ss.android.socialbase.downloader.downloader.k
    public void vv(final com.ss.android.socialbase.downloader.model.m mVar) {
        qv();
        if (f61141m == null || this.f61142i == null) {
            return;
        }
        com.ss.android.socialbase.downloader.downloader.p.p(new Runnable() { // from class: com.ss.android.socialbase.downloader.m.o.5
            @Override // java.lang.Runnable
            public void run() {
                try {
                    o.this.vv(mVar, o.this.f61142i.vv());
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vv(DownloadInfo downloadInfo, SQLiteStatement sQLiteStatement) {
        if (downloadInfo == null || sQLiteStatement == null) {
            return;
        }
        try {
            synchronized (sQLiteStatement) {
                downloadInfo.bindValue(sQLiteStatement);
                sQLiteStatement.executeInsert();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vv(com.ss.android.socialbase.downloader.model.m mVar, SQLiteStatement sQLiteStatement) {
        if (mVar == null || sQLiteStatement == null) {
            return;
        }
        try {
            synchronized (sQLiteStatement) {
                mVar.vv(sQLiteStatement);
                sQLiteStatement.executeInsert();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.m.p, com.ss.android.socialbase.downloader.downloader.k
    public void vv(final int i4, final int i5, final long j4) {
        qv();
        if (i4 == 0 || i5 < 0 || j4 < 0 || f61141m == null || this.f61142i == null) {
            return;
        }
        com.ss.android.socialbase.downloader.downloader.p.p(new Runnable() { // from class: com.ss.android.socialbase.downloader.m.o.6
            @Override // java.lang.Runnable
            public void run() {
                try {
                    o.this.vv(i4, i5, j4, o.this.f61142i.p());
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        });
    }

    @Override // com.ss.android.socialbase.downloader.m.p, com.ss.android.socialbase.downloader.downloader.k
    public void vv(final int i4, final int i5, final int i6, final long j4) {
        qv();
        if (i4 == 0 || i5 < 0 || i6 < 0 || j4 < 0 || f61141m == null || this.f61142i == null) {
            return;
        }
        com.ss.android.socialbase.downloader.downloader.p.p(new Runnable() { // from class: com.ss.android.socialbase.downloader.m.o.7
            @Override // java.lang.Runnable
            public void run() {
                try {
                    o.this.vv(i4, i5, i6, j4, o.this.f61142i.p());
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        });
    }

    @Override // com.ss.android.socialbase.downloader.m.p, com.ss.android.socialbase.downloader.downloader.k
    public void vv(final int i4, final int i5, final int i6, final int i7) {
        qv();
        if (i4 == 0 || i6 < 0 || i7 == i5 || i7 < 0 || f61141m == null || this.f61142i == null) {
            return;
        }
        com.ss.android.socialbase.downloader.downloader.p.p(new Runnable() { // from class: com.ss.android.socialbase.downloader.m.o.8
            @Override // java.lang.Runnable
            public void run() {
                try {
                    o.this.vv(i4, i5, i6, i7, o.this.f61142i.p());
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vv(int i4, int i5, int i6, int i7, SQLiteStatement sQLiteStatement) {
        try {
            synchronized (sQLiteStatement) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("chunkIndex", Integer.valueOf(i7));
                f61141m.update("downloadChunk", contentValues, "_id = ? AND chunkIndex = ? AND hostChunkIndex = ?", new String[]{Integer.toString(i4), Integer.toString(i5), Integer.toString(i6)});
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vv(int i4, int i5, long j4, SQLiteStatement sQLiteStatement) {
        try {
            synchronized (sQLiteStatement) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("curOffset", Long.valueOf(j4));
                f61141m.update("downloadChunk", contentValues, "_id = ? AND chunkIndex = ?", new String[]{Integer.toString(i4), Integer.toString(i5)});
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vv(int i4, int i5, int i6, long j4, SQLiteStatement sQLiteStatement) {
        try {
            synchronized (sQLiteStatement) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("curOffset", Long.valueOf(j4));
                f61141m.update("downloadChunk", contentValues, "_id = ? AND chunkIndex = ? AND hostChunkIndex = ?", new String[]{Integer.toString(i4), Integer.toString(i5), Integer.toString(i6)});
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.m.p, com.ss.android.socialbase.downloader.downloader.k
    public DownloadInfo vv(int i4, int i5) {
        qv();
        if (f61141m == null) {
            return null;
        }
        int i6 = 10;
        while (f61141m.isDbLockedByCurrentThread() && i6 - 1 >= 0) {
            try {
                Thread.sleep(5L);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("chunkCount", Integer.valueOf(i5));
        f61141m.update("downloader", contentValues, "_id = ? ", new String[]{Integer.toString(i4)});
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.m.p, com.ss.android.socialbase.downloader.downloader.k
    public boolean vv(final DownloadInfo downloadInfo) {
        qv();
        if (downloadInfo == null || f61141m == null) {
            return false;
        }
        com.ss.android.socialbase.downloader.downloader.p.p(new Runnable() { // from class: com.ss.android.socialbase.downloader.m.o.10
            @Override // java.lang.Runnable
            public void run() {
                o.this.i(downloadInfo);
            }
        });
        return true;
    }

    @Override // com.ss.android.socialbase.downloader.m.p, com.ss.android.socialbase.downloader.downloader.k
    public DownloadInfo vv(int i4, long j4, String str, String str2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", (Integer) 3);
        contentValues.put("totalBytes", Long.valueOf(j4));
        contentValues.put("eTag", str);
        if (!TextUtils.isEmpty(str2)) {
            contentValues.put("name", str2);
        }
        update(i4, contentValues);
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.m.p, com.ss.android.socialbase.downloader.downloader.k
    public DownloadInfo vv(int i4, long j4) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", (Integer) 4);
        contentValues.put("curBytes", Long.valueOf(j4));
        update(i4, contentValues);
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public boolean vv(int i4, Map<Long, wv> map) {
        long currentTimeMillis = System.currentTimeMillis();
        qv();
        if (f61141m == null) {
            return false;
        }
        JSONArray jSONArray = new JSONArray();
        try {
            for (Long l4 : map.keySet()) {
                jSONArray.put(map.get(Long.valueOf(l4.longValue())).b());
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        SQLiteStatement i5 = this.f61143o.i();
        synchronized (i5) {
            i5.clearBindings();
            i5.bindLong(1, i4);
            i5.bindString(2, jSONArray.toString());
            i5.execute();
        }
        com.ss.android.socialbase.downloader.p.vv.m("SqlDownloadCache", "updateSegments cost=" + com.ss.android.socialbase.downloader.wv.u.p(currentTimeMillis));
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vv(int i4, ContentValues contentValues) {
        int i5 = 10;
        while (f61141m.isDbLockedByCurrentThread() && i5 - 1 >= 0) {
            try {
                Thread.sleep(5L);
            } catch (Throwable th) {
                th.printStackTrace();
                return;
            }
        }
        f61141m.update("downloader", contentValues, "_id = ? ", new String[]{String.valueOf(i4)});
    }

    @Override // com.ss.android.socialbase.downloader.m.p
    public void vv(m mVar) {
        this.vv = mVar;
    }

    public void vv(SparseArray<DownloadInfo> sparseArray, SparseArray<List<com.ss.android.socialbase.downloader.model.m>> sparseArray2) {
        try {
            HashMap vv = com.ss.android.socialbase.downloader.wv.u.vv(sparseArray);
            HashMap vv2 = com.ss.android.socialbase.downloader.wv.u.vv(sparseArray2);
            m mVar = this.vv;
            if (mVar != null) {
                mVar.vv(vv, vv2);
            }
        } catch (Throwable unused) {
        }
    }
}
