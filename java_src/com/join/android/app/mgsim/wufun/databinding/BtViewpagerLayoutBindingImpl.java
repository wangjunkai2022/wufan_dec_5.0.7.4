package com.join.android.app.mgsim.wufun.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.bindingadapter.ViewBindingSlidingTablayoutKt;
import com.join.mgps.customview.BtReginSlidinTablayout;
import java.util.List;
/* loaded from: classes3.dex */
public class BtViewpagerLayoutBindingImpl extends BtViewpagerLayoutBinding {
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    private static final ViewDataBinding.IncludedLayouts f17661j = null;
    @Nullable

    /* renamed from: k  reason: collision with root package name */
    private static final SparseIntArray f17662k;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    private final LinearLayout f17663h;

    /* renamed from: i  reason: collision with root package name */
    private long f17664i;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f17662k = sparseIntArray;
        sparseIntArray.put(R.id.viewPager, 2);
    }

    public BtViewpagerLayoutBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 3, f17661j, f17662k));
    }

    @Override // androidx.databinding.ViewDataBinding
    protected void executeBindings() {
        long j4;
        synchronized (this) {
            j4 = this.f17664i;
            this.f17664i = 0L;
        }
        List<Fragment> list = this.f17659f;
        FragmentManager fragmentManager = this.f17657d;
        List<String> list2 = this.f17658e;
        ViewPager viewPager = this.f17660g;
        if ((j4 & 31) != 0) {
            ViewBindingSlidingTablayoutKt.viewpagertabLayout(this.f17655b, viewPager, list, list2, fragmentManager);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f17664i != 0;
        }
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.BtViewpagerLayoutBinding
    public void i(@Nullable FragmentManager fragmentManager) {
        this.f17657d = fragmentManager;
        synchronized (this) {
            this.f17664i |= 2;
        }
        notifyPropertyChanged(11);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f17664i = 16L;
        }
        requestRebind();
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.BtViewpagerLayoutBinding
    public void j(@Nullable List<Fragment> list) {
        this.f17659f = list;
        synchronized (this) {
            this.f17664i |= 1;
        }
        notifyPropertyChanged(12);
        super.requestRebind();
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.BtViewpagerLayoutBinding
    public void k(@Nullable List<String> list) {
        this.f17658e = list;
        synchronized (this) {
            this.f17664i |= 4;
        }
        notifyPropertyChanged(31);
        super.requestRebind();
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.BtViewpagerLayoutBinding
    public void l(@Nullable ViewPager viewPager) {
        this.f17660g = viewPager;
        synchronized (this) {
            this.f17664i |= 8;
        }
        notifyPropertyChanged(35);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int i4, Object obj, int i5) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i4, @Nullable Object obj) {
        if (12 == i4) {
            j((List) obj);
        } else if (11 == i4) {
            i((FragmentManager) obj);
        } else if (31 == i4) {
            k((List) obj);
        } else if (35 != i4) {
            return false;
        } else {
            l((ViewPager) obj);
        }
        return true;
    }

    private BtViewpagerLayoutBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (BtReginSlidinTablayout) objArr[1], (ViewPager) objArr[2]);
        this.f17664i = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f17663h = linearLayout;
        linearLayout.setTag(null);
        this.f17655b.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
