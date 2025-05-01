package com.join.android.app.mgsim.wufun.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.InverseBindingListener;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.lifecycle.MutableLiveData;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.tabs.TabLayout;
import com.join.android.app.mgsim.wufun.R;
import com.join.android.app.mgsim.wufun.generated.callback.a;
import com.join.kotlin.quark.proxy.SourceShareClickProxy;
import com.join.kotlin.quark.viewmodel.SourceShareViewModel;
import com.youth.banner.Banner;
/* loaded from: classes3.dex */
public class ActivitySourceShareBindingImpl extends ActivitySourceShareBinding implements a.InterfaceC0321a {
    @Nullable

    /* renamed from: y  reason: collision with root package name */
    private static final ViewDataBinding.IncludedLayouts f17052y = null;
    @Nullable

    /* renamed from: z  reason: collision with root package name */
    private static final SparseIntArray f17053z;
    @NonNull

    /* renamed from: s  reason: collision with root package name */
    private final LinearLayout f17054s;
    @Nullable

    /* renamed from: t  reason: collision with root package name */
    private final View.OnClickListener f17055t;
    @Nullable

    /* renamed from: u  reason: collision with root package name */
    private final View.OnClickListener f17056u;
    @Nullable

    /* renamed from: v  reason: collision with root package name */
    private final View.OnClickListener f17057v;

    /* renamed from: w  reason: collision with root package name */
    private InverseBindingListener f17058w;

    /* renamed from: x  reason: collision with root package name */
    private long f17059x;

    /* loaded from: classes3.dex */
    class a implements InverseBindingListener {
        a() {
        }

        @Override // androidx.databinding.InverseBindingListener
        public void onChange() {
            String textString = TextViewBindingAdapter.getTextString(ActivitySourceShareBindingImpl.this.f17045l);
            SourceShareViewModel sourceShareViewModel = ActivitySourceShareBindingImpl.this.f17050q;
            if (sourceShareViewModel != null) {
                MutableLiveData<String> searchKeyword = sourceShareViewModel.getSearchKeyword();
                if (searchKeyword != null) {
                    searchKeyword.setValue(textString);
                }
            }
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f17053z = sparseIntArray;
        sparseIntArray.put(R.id.main_content, 7);
        sparseIntArray.put(R.id.appBarLayout, 8);
        sparseIntArray.put(R.id.banner_view, 9);
        sparseIntArray.put(R.id.lLayout_search, 10);
        sparseIntArray.put(R.id.iv_search, 11);
        sparseIntArray.put(R.id.divider, 12);
        sparseIntArray.put(R.id.searchClear, 13);
        sparseIntArray.put(R.id.tabLayout, 14);
        sparseIntArray.put(R.id.viewPager, 15);
    }

    public ActivitySourceShareBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 16, f17052y, f17053z));
    }

    private boolean i(MutableLiveData<String> mutableLiveData, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f17059x |= 4;
            }
            return true;
        }
        return false;
    }

    private boolean j(MutableLiveData<Boolean> mutableLiveData, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f17059x |= 2;
            }
            return true;
        }
        return false;
    }

    private boolean k(MutableLiveData<String> mutableLiveData, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f17059x |= 1;
            }
            return true;
        }
        return false;
    }

    @Override // com.join.android.app.mgsim.wufun.generated.callback.a.InterfaceC0321a
    public final void a(int i4, View view) {
        if (i4 == 1) {
            SourceShareClickProxy sourceShareClickProxy = this.f17051r;
            if (sourceShareClickProxy != null) {
                sourceShareClickProxy.onBackClick();
            }
        } else if (i4 == 2) {
            SourceShareClickProxy sourceShareClickProxy2 = this.f17051r;
            if (sourceShareClickProxy2 != null) {
                sourceShareClickProxy2.onShareClick();
            }
        } else if (i4 != 3) {
        } else {
            SourceShareClickProxy sourceShareClickProxy3 = this.f17051r;
            if (sourceShareClickProxy3 != null) {
                sourceShareClickProxy3.onSearchClick();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0070  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void executeBindings() {
        /*
            Method dump skipped, instructions count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.android.app.mgsim.wufun.databinding.ActivitySourceShareBindingImpl.executeBindings():void");
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ActivitySourceShareBinding
    public void g(@Nullable SourceShareClickProxy sourceShareClickProxy) {
        this.f17051r = sourceShareClickProxy;
        synchronized (this) {
            this.f17059x |= 16;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ActivitySourceShareBinding
    public void h(@Nullable SourceShareViewModel sourceShareViewModel) {
        this.f17050q = sourceShareViewModel;
        synchronized (this) {
            this.f17059x |= 8;
        }
        notifyPropertyChanged(36);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f17059x != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f17059x = 32L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int i4, Object obj, int i5) {
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    return false;
                }
                return i((MutableLiveData) obj, i5);
            }
            return j((MutableLiveData) obj, i5);
        }
        return k((MutableLiveData) obj, i5);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i4, @Nullable Object obj) {
        if (36 == i4) {
            h((SourceShareViewModel) obj);
        } else if (7 != i4) {
            return false;
        } else {
            g((SourceShareClickProxy) obj);
        }
        return true;
    }

    private ActivitySourceShareBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 3, (AppBarLayout) objArr[8], (ImageView) objArr[1], (Banner) objArr[9], (CollapsingToolbarLayout) objArr[4], (View) objArr[12], (ImageView) objArr[11], (ImageView) objArr[3], (RelativeLayout) objArr[10], (CoordinatorLayout) objArr[7], (ImageView) objArr[13], (EditText) objArr[5], (TabLayout) objArr[14], (TextView) objArr[2], (TextView) objArr[6], (ViewPager) objArr[15]);
        this.f17058w = new a();
        this.f17059x = -1L;
        this.f17036c.setTag(null);
        this.f17038e.setTag(null);
        this.f17041h.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f17054s = linearLayout;
        linearLayout.setTag(null);
        this.f17045l.setTag(null);
        this.f17047n.setTag(null);
        this.f17048o.setTag(null);
        setRootTag(view);
        this.f17055t = new com.join.android.app.mgsim.wufun.generated.callback.a(this, 3);
        this.f17056u = new com.join.android.app.mgsim.wufun.generated.callback.a(this, 1);
        this.f17057v = new com.join.android.app.mgsim.wufun.generated.callback.a(this, 2);
        invalidateAll();
    }
}
