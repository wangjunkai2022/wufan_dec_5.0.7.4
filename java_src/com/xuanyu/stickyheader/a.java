package com.xuanyu.stickyheader;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: BaseStickyHeaderModel.java */
/* loaded from: classes6.dex */
public abstract class a<T> {
    private T mRecyclerViewItemModel;
    private View mRecyclerViewItemView;
    private View mStickyView;

    /* JADX INFO: Access modifiers changed from: package-private */
    public View createIfAbsent(RecyclerView recyclerView, Context context) {
        Class<?> cls = this.mRecyclerViewItemModel.getClass();
        View b5 = i.b(recyclerView, cls);
        if (b5 == null) {
            b5 = getStickyView(context);
            i.e(recyclerView, cls, b5);
        }
        this.mStickyView = b5;
        return b5;
    }

    public T getRecyclerViewItemModel() {
        return this.mRecyclerViewItemModel;
    }

    public View getRecyclerViewItemView() {
        return this.mRecyclerViewItemView;
    }

    public abstract View getStickyView(Context context);

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onBindView() {
        View view = this.mStickyView;
        if (view instanceof b) {
            ((b) view).a(getRecyclerViewItemModel());
        } else {
            onBindView(view, getRecyclerViewItemModel());
        }
    }

    public abstract void onBindView(View view, T t4);

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setRecyclerViewItemModel(T t4) {
        this.mRecyclerViewItemModel = t4;
    }

    public void setRecyclerViewItemView(View view) {
        this.mRecyclerViewItemView = view;
    }
}
