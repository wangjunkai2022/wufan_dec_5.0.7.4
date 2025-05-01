package l0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
/* compiled from: ForwardingImageOriginListener.java */
/* loaded from: classes2.dex */
public class a implements b {

    /* renamed from: b  reason: collision with root package name */
    private static final String f71469b = "ForwardingImageOriginListener";

    /* renamed from: a  reason: collision with root package name */
    private final List<b> f71470a;

    public a(Set<b> set) {
        this.f71470a = new ArrayList(set);
    }

    @Override // l0.b
    public synchronized void a(String str, int i4, boolean z4) {
        int size = this.f71470a.size();
        for (int i5 = 0; i5 < size; i5++) {
            b bVar = this.f71470a.get(i5);
            if (bVar != null) {
                try {
                    bVar.a(str, i4, z4);
                } catch (Exception e5) {
                    com.facebook.common.logging.a.v(f71469b, "InternalListener exception in onImageLoaded", e5);
                }
            }
        }
    }

    public synchronized void b(b bVar) {
        this.f71470a.add(bVar);
    }

    public synchronized void c(b bVar) {
        this.f71470a.remove(bVar);
    }

    public a(b... bVarArr) {
        ArrayList arrayList = new ArrayList(bVarArr.length);
        this.f71470a = arrayList;
        Collections.addAll(arrayList, bVarArr);
    }
}
