package b2;

import com.j256.ormlite.dao.RuntimeExceptionDao;
import com.j256.ormlite.stmt.QueryBuilder;
import com.j256.ormlite.stmt.Where;
import com.join.mgps.db.tables.ShowViewDataBeanTable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ShowViewDataBeanTableManager.java */
/* loaded from: classes4.dex */
public class i0 extends p1.b<ShowViewDataBeanTable> {

    /* renamed from: b  reason: collision with root package name */
    private static i0 f201b;

    /* renamed from: c  reason: collision with root package name */
    private static RuntimeExceptionDao<ShowViewDataBeanTable, Integer> f202c;

    private i0() {
        super(f202c);
    }

    public static i0 o() {
        if (f201b == null) {
            f202c = p1.e.d(null).c().o0();
            f201b = new i0();
        }
        return f201b;
    }

    public List<ShowViewDataBeanTable> n() {
        QueryBuilder<ShowViewDataBeanTable, Integer> queryBuilder = f202c.queryBuilder();
        try {
            Where<ShowViewDataBeanTable, Integer> where = queryBuilder.where();
            where.ne("tag_show", 2);
            queryBuilder.setWhere(where);
            return queryBuilder.query();
        } catch (SQLException e5) {
            e5.printStackTrace();
            return new ArrayList();
        }
    }
}
