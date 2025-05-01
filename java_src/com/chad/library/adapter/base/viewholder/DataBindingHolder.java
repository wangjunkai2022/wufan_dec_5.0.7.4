package com.chad.library.adapter.base.viewholder;

import android.view.View;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: DataBindingHolder.kt */
/* loaded from: classes2.dex */
public final class DataBindingHolder<DB extends ViewDataBinding> extends RecyclerView.ViewHolder {
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    private final DB f9090a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataBindingHolder(@Nullable DB db) {
        super(db.getRoot());
        Intrinsics.checkNotNull(db);
        this.f9090a = db;
    }

    @Nullable
    public final DB a() {
        return this.f9090a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataBindingHolder(@NotNull View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        DB db = (DB) DataBindingUtil.bind(itemView);
        this.f9090a = db;
        Objects.requireNonNull(db, "DataBinding is Null. Please check Layout resource or ItemView");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public DataBindingHolder(@androidx.annotation.LayoutRes int r3, @org.jetbrains.annotations.NotNull android.view.ViewGroup r4) {
        /*
            r2 = this;
            java.lang.String r0 = "parent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            android.content.Context r0 = r4.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r1 = 0
            android.view.View r3 = r0.inflate(r3, r4, r1)
            java.lang.String r4 = "from(parent.context).inflate(resId, parent, false)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            r2.<init>(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chad.library.adapter.base.viewholder.DataBindingHolder.<init>(int, android.view.ViewGroup):void");
    }
}
