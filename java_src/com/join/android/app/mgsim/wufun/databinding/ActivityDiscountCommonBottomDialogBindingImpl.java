package com.join.android.app.mgsim.wufun.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.MutableLiveData;
import com.join.android.app.mgsim.wufun.R;
import com.join.android.app.mgsim.wufun.generated.callback.a;
import com.join.kotlin.discount.proxy.CommonBottomDialogClickProxy;
import com.join.kotlin.discount.viewmodel.CommonBottomDialogViewModel;
/* loaded from: classes3.dex */
public class ActivityDiscountCommonBottomDialogBindingImpl extends ActivityDiscountCommonBottomDialogBinding implements a.InterfaceC0321a {
    @Nullable

    /* renamed from: m  reason: collision with root package name */
    private static final ViewDataBinding.IncludedLayouts f15920m = null;
    @Nullable

    /* renamed from: n  reason: collision with root package name */
    private static final SparseIntArray f15921n;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    private final TextView f15922i;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    private final View.OnClickListener f15923j;
    @Nullable

    /* renamed from: k  reason: collision with root package name */
    private final View.OnClickListener f15924k;

    /* renamed from: l  reason: collision with root package name */
    private long f15925l;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f15921n = sparseIntArray;
        sparseIntArray.put(R.id.cl_container, 5);
    }

    public ActivityDiscountCommonBottomDialogBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 6, f15920m, f15921n));
    }

    private boolean i(MutableLiveData<String> mutableLiveData, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f15925l |= 4;
            }
            return true;
        }
        return false;
    }

    private boolean j(MutableLiveData<String> mutableLiveData, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f15925l |= 8;
            }
            return true;
        }
        return false;
    }

    private boolean k(MutableLiveData<String> mutableLiveData, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f15925l |= 2;
            }
            return true;
        }
        return false;
    }

    private boolean l(MutableLiveData<String> mutableLiveData, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f15925l |= 1;
            }
            return true;
        }
        return false;
    }

    @Override // com.join.android.app.mgsim.wufun.generated.callback.a.InterfaceC0321a
    public final void a(int i4, View view) {
        if (i4 == 1) {
            CommonBottomDialogClickProxy commonBottomDialogClickProxy = this.f15919h;
            if (commonBottomDialogClickProxy != null) {
                commonBottomDialogClickProxy.onConfirmClick();
            }
        } else if (i4 != 2) {
        } else {
            CommonBottomDialogClickProxy commonBottomDialogClickProxy2 = this.f15919h;
            if (commonBottomDialogClickProxy2 != null) {
                commonBottomDialogClickProxy2.onCancelClick();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x013c  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void executeBindings() {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.android.app.mgsim.wufun.databinding.ActivityDiscountCommonBottomDialogBindingImpl.executeBindings():void");
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ActivityDiscountCommonBottomDialogBinding
    public void g(@Nullable CommonBottomDialogClickProxy commonBottomDialogClickProxy) {
        this.f15919h = commonBottomDialogClickProxy;
        synchronized (this) {
            this.f15925l |= 32;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ActivityDiscountCommonBottomDialogBinding
    public void h(@Nullable CommonBottomDialogViewModel commonBottomDialogViewModel) {
        this.f15918g = commonBottomDialogViewModel;
        synchronized (this) {
            this.f15925l |= 16;
        }
        notifyPropertyChanged(36);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f15925l != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f15925l = 64L;
        }
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
                    return j((MutableLiveData) obj, i5);
                }
                return i((MutableLiveData) obj, i5);
            }
            return k((MutableLiveData) obj, i5);
        }
        return l((MutableLiveData) obj, i5);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i4, @Nullable Object obj) {
        if (36 == i4) {
            h((CommonBottomDialogViewModel) obj);
        } else if (7 != i4) {
            return false;
        } else {
            g((CommonBottomDialogClickProxy) obj);
        }
        return true;
    }

    private ActivityDiscountCommonBottomDialogBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 4, (TextView) objArr[3], (LinearLayout) objArr[5], (ConstraintLayout) objArr[0], (TextView) objArr[2], (TextView) objArr[1]);
        this.f15925l = -1L;
        this.f15913b.setTag(null);
        this.f15915d.setTag(null);
        TextView textView = (TextView) objArr[4];
        this.f15922i = textView;
        textView.setTag(null);
        this.f15916e.setTag(null);
        this.f15917f.setTag(null);
        setRootTag(view);
        this.f15923j = new a(this, 2);
        this.f15924k = new a(this, 1);
        invalidateAll();
    }
}
