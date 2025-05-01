package m.framework.network;
/* loaded from: classes7.dex */
public class KVPair<T> {
    public final String name;
    public final T value;

    public KVPair(String str, T t4) {
        this.name = str;
        this.value = t4;
    }

    public String toString() {
        return String.valueOf(this.name) + " = " + this.value;
    }
}
