package external.org.apache.commons.lang3.builder;
/* compiled from: IDKey.java */
/* loaded from: classes6.dex */
final class e {

    /* renamed from: a  reason: collision with root package name */
    private final Object f68884a;

    /* renamed from: b  reason: collision with root package name */
    private final int f68885b;

    public e(Object obj) {
        this.f68885b = System.identityHashCode(obj);
        this.f68884a = obj;
    }

    public boolean equals(Object obj) {
        if (obj instanceof e) {
            e eVar = (e) obj;
            return this.f68885b == eVar.f68885b && this.f68884a == eVar.f68884a;
        }
        return false;
    }

    public int hashCode() {
        return this.f68885b;
    }
}
