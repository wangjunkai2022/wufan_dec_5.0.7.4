package b2;

import com.j256.ormlite.dao.RuntimeExceptionDao;
import com.j256.ormlite.stmt.DeleteBuilder;
import com.j256.ormlite.stmt.Where;
import com.join.mgps.db.tables.AppBeanMainTable;
import com.join.mgps.db.tables.AppBeanTable;
import com.join.mgps.db.tables.DownloadUrlTable;
import com.join.mgps.db.tables.ModleBeanTable;
import com.join.mgps.db.tables.RecomDatabeanTable;
import com.join.mgps.db.tables.TipBeanTable;
import java.util.HashMap;
import java.util.List;
/* compiled from: RecomDatabeanTableManager.java */
/* loaded from: classes4.dex */
public class f0 extends p1.b<RecomDatabeanTable> {

    /* renamed from: b  reason: collision with root package name */
    private static f0 f189b;

    /* renamed from: c  reason: collision with root package name */
    private static RuntimeExceptionDao<RecomDatabeanTable, Integer> f190c;

    private f0() {
        super(f190c);
    }

    private int o(int i4) {
        DeleteBuilder<RecomDatabeanTable, Integer> deleteBuilder = f190c.deleteBuilder();
        Where<RecomDatabeanTable, Integer> where = deleteBuilder.where();
        try {
            where.eq("dataFrom", Integer.valueOf(i4));
            deleteBuilder.setWhere(where);
            return f190c.delete(deleteBuilder.prepare());
        } catch (Exception e5) {
            e5.printStackTrace();
            return 0;
        }
    }

    public static f0 p() {
        if (f189b == null) {
            f190c = p1.e.d(null).c().j0();
            f189b = new f0();
        }
        return f189b;
    }

    public void n(int i4) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("dataFrom", Integer.valueOf(i4));
            List<RecomDatabeanTable> h4 = f189b.h(hashMap);
            o(i4);
            for (int i5 = 0; i5 < h4.size(); i5++) {
                RecomDatabeanTable recomDatabeanTable = h4.get(i5);
                ModleBeanTable main = recomDatabeanTable.getMain();
                if (main != null) {
                    c0.n().delete((c0) main);
                }
                for (AppBeanMainTable appBeanMainTable : recomDatabeanTable.getSub().getWrappedIterable()) {
                    a.n().delete((a) appBeanMainTable);
                    AppBeanTable game_info = appBeanMainTable.getGame_info();
                    if (game_info != null) {
                        b.n().delete((b) game_info);
                        if (game_info.getTag_info() != null) {
                            for (TipBeanTable tipBeanTable : game_info.getTag_info().getWrappedIterable()) {
                                k0.n().delete((k0) tipBeanTable);
                            }
                        }
                        if (game_info.getTp_down_url() != null) {
                            for (DownloadUrlTable downloadUrlTable : game_info.getTp_down_url().getWrappedIterable()) {
                                l.n().delete((l) downloadUrlTable);
                            }
                        }
                    }
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }
}
