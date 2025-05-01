package a4;

import java.util.LinkedHashSet;
import java.util.Set;
/* compiled from: OnViewChangedNotifier.java */
/* loaded from: classes7.dex */
public class c {

    /* renamed from: b  reason: collision with root package name */
    private static c f31b;

    /* renamed from: a  reason: collision with root package name */
    private final Set<b> f32a = new LinkedHashSet();

    public static void b(b bVar) {
        c cVar = f31b;
        if (cVar != null) {
            cVar.f32a.add(bVar);
        }
    }

    public static c c(c cVar) {
        c cVar2 = f31b;
        f31b = cVar;
        return cVar2;
    }

    public void a(a aVar) {
        for (b bVar : this.f32a) {
            bVar.onViewChanged(aVar);
        }
    }
}
