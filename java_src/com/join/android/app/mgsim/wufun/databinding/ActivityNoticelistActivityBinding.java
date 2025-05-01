package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.join.android.app.component.xrecyclerview.XRecyclerView;
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.domain.common.LoadBindClickProxy;
import com.join.kotlin.ui.notice.ClickProxy;
import com.join.kotlin.ui.notice.NoticeViewModle;
/* loaded from: classes3.dex */
public abstract class ActivityNoticelistActivityBinding extends ViewDataBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    public final ImageView f16672b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final XRecyclerView f16673c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f16674d;
    @Bindable

    /* renamed from: e  reason: collision with root package name */
    protected NoticeViewModle f16675e;
    @Bindable

    /* renamed from: f  reason: collision with root package name */
    protected RecyclerView.Adapter f16676f;
    @Bindable

    /* renamed from: g  reason: collision with root package name */
    protected ClickProxy f16677g;
    @Bindable

    /* renamed from: h  reason: collision with root package name */
    protected LoadBindClickProxy f16678h;

    /* JADX INFO: Access modifiers changed from: protected */
    public ActivityNoticelistActivityBinding(Object obj, View view, int i4, ImageView imageView, XRecyclerView xRecyclerView, TextView textView) {
        super(obj, view, i4);
        this.f16672b = imageView;
        this.f16673c = xRecyclerView;
        this.f16674d = textView;
    }

    @Deprecated
    public static ActivityNoticelistActivityBinding b(@NonNull View view, @Nullable Object obj) {
        return (ActivityNoticelistActivityBinding) ViewDataBinding.bind(obj, view, R.layout.activity_noticelist_activity);
    }

    public static ActivityNoticelistActivityBinding bind(@NonNull View view) {
        return b(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ActivityNoticelistActivityBinding g(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4, @Nullable Object obj) {
        return (ActivityNoticelistActivityBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_noticelist_activity, viewGroup, z4, obj);
    }

    @NonNull
    @Deprecated
    public static ActivityNoticelistActivityBinding h(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ActivityNoticelistActivityBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_noticelist_activity, null, false, obj);
    }

    @NonNull
    public static ActivityNoticelistActivityBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        return g(layoutInflater, viewGroup, z4, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public RecyclerView.Adapter c() {
        return this.f16676f;
    }

    @Nullable
    public ClickProxy d() {
        return this.f16677g;
    }

    @Nullable
    public LoadBindClickProxy e() {
        return this.f16678h;
    }

    @Nullable
    public NoticeViewModle f() {
        return this.f16675e;
    }

    public abstract void i(@Nullable RecyclerView.Adapter adapter);

    public abstract void j(@Nullable ClickProxy clickProxy);

    public abstract void k(@Nullable LoadBindClickProxy loadBindClickProxy);

    public abstract void l(@Nullable NoticeViewModle noticeViewModle);

    @NonNull
    public static ActivityNoticelistActivityBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return h(layoutInflater, DataBindingUtil.getDefaultComponent());
    }
}
