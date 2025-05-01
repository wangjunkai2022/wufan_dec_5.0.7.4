package b2;

import com.j256.ormlite.dao.RuntimeExceptionDao;
import com.join.mgps.db.tables.ForumTable;
import com.join.mgps.dto.ForumBean;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ForumTableManager.java */
/* loaded from: classes4.dex */
public class t extends p1.b<ForumTable> {

    /* renamed from: b  reason: collision with root package name */
    private static t f233b;

    /* renamed from: c  reason: collision with root package name */
    private static RuntimeExceptionDao<ForumTable, Integer> f234c;

    public t() {
        super(f234c);
    }

    public static t p() {
        if (f233b == null) {
            f234c = p1.e.d(null).c().P();
            f233b = new t();
        }
        return f233b;
    }

    public void n(ForumTable forumTable) {
        try {
            List<ForumTable> query = f234c.queryBuilder().orderBy("time", false).where().eq("type", forumTable.getType()).eq("arg1", forumTable.getArgs1()).query();
            new ForumTable();
            if (query != null && query.size() > 0) {
                ForumTable forumTable2 = query.get(0);
                forumTable2.setTime(forumTable.getTime());
                forumTable2.setArgs1(forumTable.getArgs1());
                forumTable2.setArgs2(forumTable.getArgs2());
                forumTable2.setType(forumTable.getType());
                forumTable = forumTable2;
            }
            f234c.delete((RuntimeExceptionDao<ForumTable, Integer>) forumTable);
        } catch (Exception unused) {
        }
    }

    public ForumTable o(ForumBean.ForumEvent forumEvent) {
        ForumTable forumTable = new ForumTable();
        try {
            List<ForumTable> r4 = r(forumEvent);
            return (r4 == null || r4.size() <= 0) ? forumTable : r4.get(0);
        } catch (Exception unused) {
            return forumTable;
        }
    }

    public ForumTable q(ForumTable forumTable) {
        try {
            new ArrayList();
            List<ForumTable> query = f234c.queryBuilder().orderBy("time", false).where().eq("type", forumTable.getType()).and().eq("args1", forumTable.getArgs1()).query();
            if (query == null || query.size() == 0) {
                return null;
            }
            return query.get(0);
        } catch (Exception unused) {
            return null;
        }
    }

    public List<ForumTable> r(ForumBean.ForumEvent forumEvent) {
        ArrayList arrayList = new ArrayList();
        new ForumTable();
        try {
            return f234c.queryBuilder().orderBy("time", false).where().eq("type", forumEvent.name()).query();
        } catch (Exception unused) {
            return arrayList;
        }
    }

    public boolean s(ForumBean.ForumEvent forumEvent) {
        try {
            List<ForumTable> query = f234c.queryBuilder().orderBy("time", false).where().eq("type", forumEvent.name()).query();
            if (query != null) {
                return query.size() > 0;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public void t(ForumTable forumTable) {
        try {
            List<ForumTable> query = f234c.queryBuilder().orderBy("time", false).where().eq("type", forumTable.getType()).and().eq("args1", forumTable.getArgs1()).query();
            new ForumTable();
            if (query != null && query.size() > 0) {
                ForumTable forumTable2 = query.get(0);
                forumTable2.setTime(forumTable.getTime());
                forumTable2.setArgs1(forumTable.getArgs1());
                forumTable2.setArgs2(forumTable.getArgs2());
                forumTable2.setType(forumTable.getType());
                forumTable = forumTable2;
            }
            f234c.createOrUpdate(forumTable);
        } catch (Exception unused) {
        }
    }

    public void u(ForumTable forumTable) {
        try {
            List<ForumTable> query = f234c.queryBuilder().orderBy("time", false).where().eq("type", forumTable.getType()).query();
            new ForumTable();
            if (query != null && query.size() > 0) {
                ForumTable forumTable2 = query.get(0);
                forumTable2.setTime(forumTable.getTime());
                forumTable2.setArgs1(forumTable.getArgs1());
                forumTable2.setArgs2(forumTable.getArgs2());
                forumTable2.setType(forumTable.getType());
                forumTable = forumTable2;
            }
            f234c.createOrUpdate(forumTable);
        } catch (Exception unused) {
        }
    }
}
