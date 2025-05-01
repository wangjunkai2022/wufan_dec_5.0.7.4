package j2;

import android.os.Looper;
import java.util.List;
/* compiled from: LoadSirUtil.java */
/* loaded from: classes5.dex */
public class b {
    public static k2.b a(Object obj, List<k2.b> list) {
        for (k2.b bVar : list) {
            if (bVar.equals(obj)) {
                return bVar;
            }
        }
        throw new IllegalArgumentException("No TargetContext fit it");
    }

    public static boolean b() {
        return Looper.myLooper() == Looper.getMainLooper();
    }
}
