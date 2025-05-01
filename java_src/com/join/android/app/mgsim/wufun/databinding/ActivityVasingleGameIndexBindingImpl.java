package com.join.android.app.mgsim.wufun.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.viewpager.widget.ViewPager;
import com.facebook.drawee.view.SimpleDraweeView;
import com.google.android.material.tabs.TabLayout;
import com.join.android.app.mgsim.wufun.R;
import com.join.android.app.mgsim.wufun.generated.callback.a;
import com.join.kotlin.domain.common.LoadBindClickProxy;
import com.join.kotlin.domain.common.LoadBindindData;
import com.join.kotlin.ui.cloudarchive.VASingleGameViewModle;
/* loaded from: classes3.dex */
public class ActivityVasingleGameIndexBindingImpl extends ActivityVasingleGameIndexBinding implements a.InterfaceC0321a {
    @Nullable
    private static final ViewDataBinding.IncludedLayouts F;
    @Nullable
    private static final SparseIntArray G;
    @Nullable
    private final BinddingLoadLayoutIncludeBinding A;
    @NonNull
    private final LinearLayout B;
    @Nullable
    private final LayoutModVipTipBinding C;
    @Nullable
    private final View.OnClickListener D;
    private long E;
    @NonNull

    /* renamed from: y  reason: collision with root package name */
    private final RelativeLayout f17253y;
    @NonNull

    /* renamed from: z  reason: collision with root package name */
    private final LinearLayout f17254z;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(26);
        F = includedLayouts;
        includedLayouts.setIncludes(4, new String[]{"bindding_load_layout_include"}, new int[]{8}, new int[]{R.layout.bindding_load_layout_include});
        SparseIntArray sparseIntArray = new SparseIntArray();
        G = sparseIntArray;
        sparseIntArray.put(R.id.ll_title, 9);
        sparseIntArray.put(R.id.ll_mod_start, 10);
        sparseIntArray.put(R.id.cl_mod, 11);
        sparseIntArray.put(R.id.iv_mod_play, 12);
        sparseIntArray.put(R.id.tv_mod_start, 13);
        sparseIntArray.put(R.id.tv_mod_type, 14);
        sparseIntArray.put(R.id.tv_mod_status, 15);
        sparseIntArray.put(R.id.tv_new_version, 16);
        sparseIntArray.put(R.id.sdv_mod_dot, 17);
        sparseIntArray.put(R.id.tv_mod_install_status, 18);
        sparseIntArray.put(R.id.ll_stand_start, 19);
        sparseIntArray.put(R.id.tv_stand_type, 20);
        sparseIntArray.put(R.id.iv_stand_font, 21);
        sparseIntArray.put(R.id.tv_stand_status, 22);
        sparseIntArray.put(R.id.tv_stand_new_version, 23);
        sparseIntArray.put(R.id.tabLayout, 24);
        sparseIntArray.put(R.id.viewPager, 25);
    }

    public ActivityVasingleGameIndexBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 26, F, G));
    }

    private boolean i(MutableLiveData<String> mutableLiveData, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.E |= 1;
            }
            return true;
        }
        return false;
    }

    private boolean j(MutableLiveData<String> mutableLiveData, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.E |= 4;
            }
            return true;
        }
        return false;
    }

    private boolean k(MutableLiveData<LoadBindindData> mutableLiveData, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.E |= 2;
            }
            return true;
        }
        return false;
    }

    private boolean l(MutableLiveData<Integer> mutableLiveData, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.E |= 8;
            }
            return true;
        }
        return false;
    }

    @Override // com.join.android.app.mgsim.wufun.generated.callback.a.InterfaceC0321a
    public final void a(int i4, View view) {
        VASingleGameViewModle vASingleGameViewModle = this.f17252x;
        if (vASingleGameViewModle != null) {
            vASingleGameViewModle.onClickView(view);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f5  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void executeBindings() {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.android.app.mgsim.wufun.databinding.ActivityVasingleGameIndexBindingImpl.executeBindings():void");
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ActivityVasingleGameIndexBinding
    public void g(@Nullable LoadBindClickProxy loadBindClickProxy) {
        this.f17251w = loadBindClickProxy;
        synchronized (this) {
            this.E |= 16;
        }
        notifyPropertyChanged(21);
        super.requestRebind();
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ActivityVasingleGameIndexBinding
    public void h(@Nullable VASingleGameViewModle vASingleGameViewModle) {
        this.f17252x = vASingleGameViewModle;
        synchronized (this) {
            this.E |= 32;
        }
        notifyPropertyChanged(34);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.E != 0) {
                return true;
            }
            return this.A.hasPendingBindings();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.E = 64L;
        }
        this.A.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int i4, Object obj, int i5) {
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        return false;
                    }
                    return l((MutableLiveData) obj, i5);
                }
                return j((MutableLiveData) obj, i5);
            }
            return k((MutableLiveData) obj, i5);
        }
        return i((MutableLiveData) obj, i5);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.A.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i4, @Nullable Object obj) {
        if (21 == i4) {
            g((LoadBindClickProxy) obj);
        } else if (34 != i4) {
            return false;
        } else {
            h((VASingleGameViewModle) obj);
        }
        return true;
    }

    private ActivityVasingleGameIndexBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 4, (ConstraintLayout) objArr[11], (ImageView) objArr[2], (ImageView) objArr[12], (ImageView) objArr[21], (LinearLayout) objArr[10], (LinearLayout) objArr[19], (LinearLayout) objArr[9], (LinearLayout) objArr[6], (SimpleDraweeView) objArr[1], (SimpleDraweeView) objArr[17], (TabLayout) objArr[24], (TextView) objArr[3], (TextView) objArr[18], (TextView) objArr[13], (TextView) objArr[15], (TextView) objArr[14], (TextView) objArr[16], (TextView) objArr[23], (TextView) objArr[22], (TextView) objArr[20], (ViewPager) objArr[25]);
        this.E = -1L;
        this.f17231c.setTag(null);
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.f17253y = relativeLayout;
        relativeLayout.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[4];
        this.f17254z = linearLayout;
        linearLayout.setTag(null);
        BinddingLoadLayoutIncludeBinding binddingLoadLayoutIncludeBinding = (BinddingLoadLayoutIncludeBinding) objArr[8];
        this.A = binddingLoadLayoutIncludeBinding;
        setContainedBinding(binddingLoadLayoutIncludeBinding);
        LinearLayout linearLayout2 = (LinearLayout) objArr[5];
        this.B = linearLayout2;
        linearLayout2.setTag(null);
        this.C = objArr[7] != null ? LayoutModVipTipBinding.bind((View) objArr[7]) : null;
        this.f17237i.setTag(null);
        this.f17238j.setTag(null);
        this.f17241m.setTag(null);
        setRootTag(view);
        this.D = new a(this, 1);
        invalidateAll();
    }
}
