package com.join.android.app.mgsim.wufun.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.kotlin.bindingadapter.SimpleDrawableViewKt;
import com.join.kotlin.bindingadapter.ViewBindingDownloadViewKt;
import com.join.mgps.business.CollectionBeanSubBusiness;
import com.join.mgps.customview.DownloadViewStroke;
/* loaded from: classes3.dex */
public class DatabindingHgamelistItemBindingImpl extends DatabindingHgamelistItemBinding {
    @Nullable

    /* renamed from: h  reason: collision with root package name */
    private static final ViewDataBinding.IncludedLayouts f18326h = null;
    @Nullable

    /* renamed from: i  reason: collision with root package name */
    private static final SparseIntArray f18327i = null;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    private final DownloadViewStroke f18328f;

    /* renamed from: g  reason: collision with root package name */
    private long f18329g;

    public DatabindingHgamelistItemBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 4, f18326h, f18327i));
    }

    @Override // androidx.databinding.ViewDataBinding
    protected void executeBindings() {
        long j4;
        String str;
        String str2;
        synchronized (this) {
            j4 = this.f18329g;
            this.f18329g = 0L;
        }
        CollectionBeanSubBusiness collectionBeanSubBusiness = this.f18325e;
        long j5 = j4 & 3;
        String str3 = null;
        if (j5 == 0 || collectionBeanSubBusiness == null) {
            str = null;
            str2 = null;
        } else {
            String ico_remote = collectionBeanSubBusiness.getIco_remote();
            String game_name = collectionBeanSubBusiness.getGame_name();
            str2 = collectionBeanSubBusiness.getGif_ico_remote();
            str = ico_remote;
            str3 = game_name;
        }
        if (j5 != 0) {
            TextViewBindingAdapter.setText(this.f18322b, str3);
            SimpleDrawableViewKt.loadUrl(this.f18323c, str, str2, 0);
            ViewBindingDownloadViewKt.downloadVIewBinding(this.f18328f, collectionBeanSubBusiness, 0);
        }
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.DatabindingHgamelistItemBinding
    public void f(@Nullable CollectionBeanSubBusiness collectionBeanSubBusiness) {
        this.f18325e = collectionBeanSubBusiness;
        synchronized (this) {
            this.f18329g |= 1;
        }
        notifyPropertyChanged(9);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f18329g != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f18329g = 2L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int i4, Object obj, int i5) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i4, @Nullable Object obj) {
        if (9 == i4) {
            f((CollectionBeanSubBusiness) obj);
            return true;
        }
        return false;
    }

    private DatabindingHgamelistItemBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (TextView) objArr[2], (SimpleDraweeView) objArr[1], (LinearLayout) objArr[0]);
        this.f18329g = -1L;
        this.f18322b.setTag(null);
        this.f18323c.setTag(null);
        DownloadViewStroke downloadViewStroke = (DownloadViewStroke) objArr[3];
        this.f18328f = downloadViewStroke;
        downloadViewStroke.setTag(null);
        this.f18324d.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
