package com.join.mgps.base.diff;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.DiffUtil;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes4.dex */
public abstract class BaseQuickDiffCallback<T> extends DiffUtil.Callback {

    /* renamed from: a  reason: collision with root package name */
    private List<T> f46242a;

    /* renamed from: b  reason: collision with root package name */
    private List<T> f46243b;

    public BaseQuickDiffCallback(@Nullable List<T> list) {
        this.f46242a = list == null ? new ArrayList<>() : list;
    }

    protected abstract boolean a(@NonNull T t4, @NonNull T t5);

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public boolean areContentsTheSame(int i4, int i5) {
        return a(this.f46243b.get(i4), this.f46242a.get(i5));
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public boolean areItemsTheSame(int i4, int i5) {
        return b(this.f46243b.get(i4), this.f46242a.get(i5));
    }

    protected abstract boolean b(@NonNull T t4, @NonNull T t5);

    @Nullable
    protected Object c(@NonNull T t4, @NonNull T t5) {
        return null;
    }

    public List<T> d() {
        return this.f46242a;
    }

    public List<T> e() {
        return this.f46243b;
    }

    public void f(@Nullable List<T> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        this.f46243b = list;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    @Nullable
    public Object getChangePayload(int i4, int i5) {
        return c(this.f46243b.get(i4), this.f46242a.get(i5));
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public int getNewListSize() {
        return this.f46242a.size();
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public int getOldListSize() {
        return this.f46243b.size();
    }
}
