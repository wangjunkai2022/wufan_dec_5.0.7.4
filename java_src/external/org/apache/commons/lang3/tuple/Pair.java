package external.org.apache.commons.lang3.tuple;

import external.org.apache.commons.lang3.ObjectUtils;
import external.org.apache.commons.lang3.builder.b;
import io.netty.util.internal.StringUtil;
import java.io.Serializable;
import java.util.Map;
/* loaded from: classes6.dex */
public abstract class Pair<L, R> implements Map.Entry<L, R>, Comparable<Pair<L, R>>, Serializable {
    private static final long serialVersionUID = 4954918890077093841L;

    public static <L, R> Pair<L, R> m(L l4, R r4) {
        return new ImmutablePair(l4, r4);
    }

    @Override // java.lang.Comparable
    /* renamed from: d */
    public int compareTo(Pair<L, R> pair) {
        return new b().g(e(), pair.e()).g(f(), pair.f()).C();
    }

    public abstract L e();

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            return ObjectUtils.f(getKey(), entry.getKey()) && ObjectUtils.f(getValue(), entry.getValue());
        }
        return false;
    }

    public abstract R f();

    @Override // java.util.Map.Entry
    public final L getKey() {
        return e();
    }

    @Override // java.util.Map.Entry
    public R getValue() {
        return f();
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        return (getKey() == null ? 0 : getKey().hashCode()) ^ (getValue() != null ? getValue().hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('(');
        sb.append(e());
        sb.append(StringUtil.COMMA);
        sb.append(f());
        sb.append(')');
        return sb.toString();
    }

    public String y0(String str) {
        return String.format(str, e(), f());
    }
}
