package kotlinx.coroutines.flow;
/* compiled from: StateFlow.kt */
/* loaded from: classes6.dex */
public interface j<T> extends u<T>, i<T> {
    boolean compareAndSet(T t4, T t5);

    @Override // kotlinx.coroutines.flow.u
    T getValue();

    void setValue(T t4);
}
