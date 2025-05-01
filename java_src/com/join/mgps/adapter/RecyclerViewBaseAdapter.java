package com.join.mgps.adapter;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.androidannotations.annotations.EBean;
import org.androidannotations.annotations.UiThread;
@EBean
/* loaded from: classes4.dex */
public abstract class RecyclerViewBaseAdapter<T, V extends View> extends RecyclerView.Adapter<a<V>> {

    /* renamed from: c  reason: collision with root package name */
    private static final String f44017c = "RecyclerViewBaseAdapter";

    /* renamed from: a  reason: collision with root package name */
    public SparseArray<T> f44018a;

    /* renamed from: b  reason: collision with root package name */
    int f44019b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static class a<V extends View> extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        private V f44020a;

        public a(V v2) {
            super(v2);
            this.f44020a = v2;
        }

        public V a() {
            return this.f44020a;
        }
    }

    @UiThread(propagation = UiThread.Propagation.REUSE)
    public void a(SparseArray<T> sparseArray) {
        int size = this.f44018a.size();
        for (int i4 = 0; i4 < sparseArray.size(); i4++) {
            this.f44018a.put(size + i4, sparseArray.get(sparseArray.keyAt(i4)));
        }
        notifyItemRangeInserted(size, sparseArray.size());
    }

    @UiThread(propagation = UiThread.Propagation.REUSE)
    public void b(int i4, T t4) {
        this.f44018a.put(i4, t4);
        notifyItemInserted(i4);
    }

    public SparseArray<T> c() {
        return this.f44018a;
    }

    @UiThread(propagation = UiThread.Propagation.REUSE)
    public void clear() {
        int size = this.f44018a.size();
        this.f44018a.clear();
        notifyItemRangeRemoved(0, size);
    }

    protected abstract V d(ViewGroup viewGroup, int i4);

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: e */
    public a<V> onCreateViewHolder(ViewGroup viewGroup, int i4) {
        return new a<>(d(viewGroup, i4));
    }

    @UiThread(propagation = UiThread.Propagation.REUSE)
    public void f(int i4) {
        if (i4 > this.f44018a.size()) {
            return;
        }
        if (i4 == this.f44018a.size() - 1) {
            this.f44018a.remove(i4);
            notifyItemRemoved(i4);
            return;
        }
        SparseArray<T> sparseArray = this.f44018a;
        while (i4 < sparseArray.size() - 1) {
            int i5 = i4 + 1;
            this.f44018a.put(i4, sparseArray.get(i5));
            i4 = i5;
        }
        this.f44018a.remove(getItemCount() - 1);
        notifyDataSetChanged();
    }

    @UiThread(propagation = UiThread.Propagation.REUSE)
    public void g(int i4) {
        if (i4 > this.f44018a.size()) {
            return;
        }
        this.f44018a.remove(i4);
        notifyItemRemoved(i4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f44018a.size();
    }

    public void h(SparseArray<T> sparseArray) {
        this.f44018a = sparseArray;
    }

    public void i(int i4) {
        this.f44019b = i4;
    }
}
