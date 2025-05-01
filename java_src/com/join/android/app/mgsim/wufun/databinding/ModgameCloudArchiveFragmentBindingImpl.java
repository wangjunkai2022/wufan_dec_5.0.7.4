package com.join.android.app.mgsim.wufun.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager.widget.ViewPager;
import com.flyco.tablayout.SlidingTabLayout;
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.ui.cloudarchive.ModGameCloudViewModle;
import com.join.kotlin.ui.cloudarchive.adapter.MyPagerAdapter;
/* loaded from: classes3.dex */
public class ModgameCloudArchiveFragmentBindingImpl extends ModgameCloudArchiveFragmentBinding {
    @Nullable

    /* renamed from: i  reason: collision with root package name */
    private static final ViewDataBinding.IncludedLayouts f25147i = null;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    private static final SparseIntArray f25148j;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    private final RelativeLayout f25149g;

    /* renamed from: h  reason: collision with root package name */
    private long f25150h;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f25148j = sparseIntArray;
        sparseIntArray.put(R.id.title, 1);
        sparseIntArray.put(R.id.tabLayout, 2);
        sparseIntArray.put(R.id.viewPager, 3);
    }

    public ModgameCloudArchiveFragmentBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 4, f25147i, f25148j));
    }

    @Override // androidx.databinding.ViewDataBinding
    protected void executeBindings() {
        synchronized (this) {
            this.f25150h = 0L;
        }
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ModgameCloudArchiveFragmentBinding
    public void g(@Nullable MyPagerAdapter myPagerAdapter) {
        this.f25146f = myPagerAdapter;
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ModgameCloudArchiveFragmentBinding
    public void h(@Nullable ModGameCloudViewModle modGameCloudViewModle) {
        this.f25145e = modGameCloudViewModle;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f25150h != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f25150h = 4L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int i4, Object obj, int i5) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i4, @Nullable Object obj) {
        if (1 == i4) {
            g((MyPagerAdapter) obj);
            return true;
        } else if (34 == i4) {
            h((ModGameCloudViewModle) obj);
            return true;
        } else {
            return false;
        }
    }

    private ModgameCloudArchiveFragmentBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (SlidingTabLayout) objArr[2], (RelativeLayout) objArr[1], (ViewPager) objArr[3]);
        this.f25150h = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.f25149g = relativeLayout;
        relativeLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
