package com.join.android.app.mgsim.wufun.databinding;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.databinding.adapters.ViewBindingAdapter;
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.bindingadapter.ViewBindingTextviewKt;
import com.join.kotlin.quark.model.bean.SourceTabItemBean;
/* loaded from: classes3.dex */
public class ItemSourceHopeTagBindingImpl extends ItemSourceHopeTagBinding {
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    private static final ViewDataBinding.IncludedLayouts f22823f = null;
    @Nullable

    /* renamed from: g  reason: collision with root package name */
    private static final SparseIntArray f22824g = null;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    private final RelativeLayout f22825d;

    /* renamed from: e  reason: collision with root package name */
    private long f22826e;

    public ItemSourceHopeTagBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 2, f22823f, f22824g));
    }

    @Override // androidx.databinding.ViewDataBinding
    protected void executeBindings() {
        long j4;
        String str;
        Drawable drawable;
        long j5;
        long j6;
        synchronized (this) {
            j4 = this.f22826e;
            this.f22826e = 0L;
        }
        SourceTabItemBean sourceTabItemBean = this.f22822c;
        long j7 = j4 & 3;
        String str2 = null;
        Boolean bool = null;
        if (j7 != 0) {
            if (sourceTabItemBean != null) {
                bool = sourceTabItemBean.getActive();
                str = sourceTabItemBean.getName();
            } else {
                str = null;
            }
            boolean safeUnbox = ViewDataBinding.safeUnbox(bool);
            if (j7 != 0) {
                if (safeUnbox) {
                    j5 = j4 | 8;
                    j6 = 32;
                } else {
                    j5 = j4 | 4;
                    j6 = 16;
                }
                j4 = j5 | j6;
            }
            drawable = AppCompatResources.getDrawable(this.f22821b.getContext(), safeUnbox ? R.drawable.shape_1d80f5_r_8 : R.drawable.shape_ffffff_r_8);
            str2 = safeUnbox ? "#FFFFFF" : "#424242";
        } else {
            str = null;
            drawable = null;
        }
        if ((j4 & 3) != 0) {
            ViewBindingTextviewKt.textViewColorBinding(this.f22821b, str2);
            ViewBindingAdapter.setBackground(this.f22821b, drawable);
            TextViewBindingAdapter.setText(this.f22821b, str);
        }
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ItemSourceHopeTagBinding
    public void f(@Nullable SourceTabItemBean sourceTabItemBean) {
        this.f22822c = sourceTabItemBean;
        synchronized (this) {
            this.f22826e |= 1;
        }
        notifyPropertyChanged(18);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f22826e != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f22826e = 2L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int i4, Object obj, int i5) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i4, @Nullable Object obj) {
        if (18 == i4) {
            f((SourceTabItemBean) obj);
            return true;
        }
        return false;
    }

    private ItemSourceHopeTagBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (TextView) objArr[1]);
        this.f22826e = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.f22825d = relativeLayout;
        relativeLayout.setTag(null);
        this.f22821b.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
