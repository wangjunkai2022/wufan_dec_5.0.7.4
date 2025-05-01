package cn.aigestudio.downloader.bizs;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
/* compiled from: TaskDAO.java */
/* loaded from: classes2.dex */
class o implements m {

    /* renamed from: a  reason: collision with root package name */
    private final b f480a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(Context context) {
        this.f480a = new b(context);
    }

    @Override // cn.aigestudio.downloader.bizs.m
    public f b(String str) {
        f fVar;
        SQLiteDatabase writableDatabase = this.f480a.getWritableDatabase();
        Cursor rawQuery = writableDatabase.rawQuery("SELECT base_url, real_url, file_path, file_name, mime_type, e_tag, disposition, location, currentBytes, totalBytes FROM task_info WHERE base_url=?", new String[]{str});
        if (rawQuery.moveToFirst()) {
            fVar = new f();
            fVar.f426e = rawQuery.getString(0);
            fVar.f427f = rawQuery.getString(1);
            fVar.f425d = rawQuery.getString(2);
            fVar.f424c = rawQuery.getString(3);
            fVar.f432k = rawQuery.getString(4);
            fVar.f433l = rawQuery.getString(5);
            fVar.f434m = rawQuery.getString(6);
            fVar.f435n = rawQuery.getString(7);
            fVar.f423b.set(rawQuery.getInt(8));
            fVar.f422a.set(rawQuery.getInt(9));
        } else {
            fVar = null;
        }
        rawQuery.close();
        writableDatabase.close();
        return fVar;
    }

    @Override // cn.aigestudio.downloader.bizs.m
    public void d(f fVar) {
        SQLiteDatabase writableDatabase = this.f480a.getWritableDatabase();
        writableDatabase.execSQL("UPDATE task_info SET disposition=?,location=?,mime_type=?,totalBytes=?,file_name=?,currentBytes=? WHERE base_url=?", new Object[]{fVar.f434m, fVar.f435n, fVar.f432k, Long.valueOf(fVar.f422a.get()), fVar.f424c, Long.valueOf(fVar.f423b.get()), fVar.f426e});
        writableDatabase.close();
    }

    @Override // cn.aigestudio.downloader.bizs.m
    public void e(f fVar) {
        SQLiteDatabase writableDatabase = this.f480a.getWritableDatabase();
        writableDatabase.execSQL("INSERT INTO task_info(base_url, real_url, file_path, file_name, mime_type, e_tag, disposition, location, currentBytes, totalBytes) values (?,?,?,?,?,?,?,?,?,?)", new Object[]{fVar.f426e, fVar.f427f, fVar.f425d, fVar.f424c, fVar.f432k, fVar.f433l, fVar.f434m, fVar.f435n, Long.valueOf(fVar.f423b.get()), Long.valueOf(fVar.f422a.get())});
        writableDatabase.close();
    }

    @Override // cn.aigestudio.downloader.bizs.m
    public void h(String str) {
        SQLiteDatabase writableDatabase = this.f480a.getWritableDatabase();
        writableDatabase.execSQL("DELETE FROM task_info WHERE base_url=?", new String[]{str});
        writableDatabase.close();
    }
}
