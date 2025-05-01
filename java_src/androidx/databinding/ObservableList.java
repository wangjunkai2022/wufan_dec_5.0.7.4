package androidx.databinding;

import java.util.List;
/* loaded from: classes2.dex */
public interface ObservableList<T> extends List<T> {

    /* loaded from: classes2.dex */
    public static abstract class OnListChangedCallback<T extends ObservableList> {
        public abstract void onChanged(T t4);

        public abstract void onItemRangeChanged(T t4, int i4, int i5);

        public abstract void onItemRangeInserted(T t4, int i4, int i5);

        public abstract void onItemRangeMoved(T t4, int i4, int i5, int i6);

        public abstract void onItemRangeRemoved(T t4, int i4, int i5);
    }

    void addOnListChangedCallback(OnListChangedCallback<? extends ObservableList<T>> onListChangedCallback);

    void removeOnListChangedCallback(OnListChangedCallback<? extends ObservableList<T>> onListChangedCallback);
}
