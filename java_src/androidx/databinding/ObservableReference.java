package androidx.databinding;

import androidx.annotation.RestrictTo;
import androidx.lifecycle.LifecycleOwner;
/* JADX INFO: Access modifiers changed from: package-private */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public interface ObservableReference<T> {
    void addListener(T t4);

    WeakListener<T> getListener();

    void removeListener(T t4);

    void setLifecycleOwner(LifecycleOwner lifecycleOwner);
}
