package external.org.apache.commons.lang3.tuple;
/* loaded from: classes6.dex */
public final class ImmutablePair<L, R> extends Pair<L, R> {
    private static final long serialVersionUID = 4954918890077093841L;

    /* renamed from: b  reason: collision with root package name */
    public final L f68989b;

    /* renamed from: c  reason: collision with root package name */
    public final R f68990c;

    public ImmutablePair(L l4, R r4) {
        this.f68989b = l4;
        this.f68990c = r4;
    }

    public static <L, R> ImmutablePair<L, R> u(L l4, R r4) {
        return new ImmutablePair<>(l4, r4);
    }

    @Override // external.org.apache.commons.lang3.tuple.Pair
    public L e() {
        return this.f68989b;
    }

    @Override // external.org.apache.commons.lang3.tuple.Pair
    public R f() {
        return this.f68990c;
    }

    @Override // java.util.Map.Entry
    public R setValue(R r4) {
        throw new UnsupportedOperationException();
    }
}
