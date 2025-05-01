package p1;

import com.j256.ormlite.dao.RuntimeExceptionDao;
import com.join.android.app.common.db.tables.Course;
import java.util.HashMap;
import java.util.List;
/* compiled from: CourseManager.java */
/* loaded from: classes3.dex */
public class d extends b<Course> {

    /* renamed from: b  reason: collision with root package name */
    private static d f73101b;

    /* renamed from: c  reason: collision with root package name */
    private static RuntimeExceptionDao<Course, Integer> f73102c;

    private d() {
        super(f73102c);
    }

    public static d o() {
        if (f73101b == null) {
            f73102c = e.d(null).c().y();
            f73101b = new d();
        }
        return f73101b;
    }

    public Course n(long j4) {
        HashMap hashMap = new HashMap(0);
        hashMap.put("courseId", Long.valueOf(j4));
        List<Course> h4 = h(hashMap);
        if (h4 == null || h4.size() <= 0) {
            return null;
        }
        return h4.get(0);
    }
}
