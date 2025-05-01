package p1;

import com.j256.ormlite.dao.RuntimeExceptionDao;
import com.join.android.app.common.db.tables.LocalCourse;
import java.util.HashMap;
import java.util.List;
/* compiled from: LocalCourseManager.java */
/* loaded from: classes3.dex */
public class h extends b<LocalCourse> {

    /* renamed from: b  reason: collision with root package name */
    private static h f73110b;

    /* renamed from: c  reason: collision with root package name */
    private static RuntimeExceptionDao<LocalCourse, Integer> f73111c;

    private h() {
        super(f73111c);
    }

    public static h o() {
        if (f73110b == null) {
            f73111c = e.d(null).c().c0();
            f73110b = new h();
        }
        return f73110b;
    }

    public List<LocalCourse> n(String str) {
        HashMap hashMap = new HashMap(0);
        hashMap.put("courseId", str);
        return h(hashMap);
    }
}
