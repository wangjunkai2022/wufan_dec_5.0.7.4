package com.join.android.app.mgsim.wufun.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.join.android.app.mgsim.wufun.R;
import com.join.android.app.mgsim.wufun.generated.callback.a;
import com.join.kotlin.discount.model.bean.CouponItemBean;
import com.join.kotlin.discount.proxy.CouponListClickProxy;
/* loaded from: classes3.dex */
public class ItemCouponBindingImpl extends ItemCouponBinding implements a.InterfaceC0321a {
    @Nullable
    private static final ViewDataBinding.IncludedLayouts C = null;
    @Nullable
    private static final SparseIntArray D;
    @Nullable
    private final View.OnClickListener A;
    private long B;
    @NonNull

    /* renamed from: t  reason: collision with root package name */
    private final ConstraintLayout f21837t;
    @NonNull

    /* renamed from: u  reason: collision with root package name */
    private final Group f21838u;
    @NonNull

    /* renamed from: v  reason: collision with root package name */
    private final ImageView f21839v;
    @NonNull

    /* renamed from: w  reason: collision with root package name */
    private final Group f21840w;
    @NonNull

    /* renamed from: x  reason: collision with root package name */
    private final Group f21841x;
    @Nullable

    /* renamed from: y  reason: collision with root package name */
    private final View.OnClickListener f21842y;
    @Nullable

    /* renamed from: z  reason: collision with root package name */
    private final View.OnClickListener f21843z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        D = sparseIntArray;
        sparseIntArray.put(R.id.v_left, 15);
        sparseIntArray.put(R.id.tv_label_y, 16);
        sparseIntArray.put(R.id.tv_label_ye, 17);
        sparseIntArray.put(R.id.tv_label_discount, 18);
        sparseIntArray.put(R.id.v_right, 19);
        sparseIntArray.put(R.id.v_line_h, 20);
    }

    public ItemCouponBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 21, C, D));
    }

    @Override // com.join.android.app.mgsim.wufun.generated.callback.a.InterfaceC0321a
    public final void a(int i4, View view) {
        if (i4 == 1) {
            CouponItemBean couponItemBean = this.f21835r;
            CouponListClickProxy couponListClickProxy = this.f21836s;
            if (couponListClickProxy != null) {
                couponListClickProxy.onUnSupportClick(couponItemBean);
            }
        } else if (i4 == 2) {
            CouponItemBean couponItemBean2 = this.f21835r;
            CouponListClickProxy couponListClickProxy2 = this.f21836s;
            if (couponListClickProxy2 != null) {
                couponListClickProxy2.onDetailClick(couponItemBean2);
            }
        } else if (i4 != 3) {
        } else {
            CouponItemBean couponItemBean3 = this.f21835r;
            CouponListClickProxy couponListClickProxy3 = this.f21836s;
            if (couponListClickProxy3 != null) {
                if (couponItemBean3 != null) {
                    couponListClickProxy3.showUseTip(couponItemBean3.getUse_tip());
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:138:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0185  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void executeBindings() {
        /*
            Method dump skipped, instructions count: 604
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.android.app.mgsim.wufun.databinding.ItemCouponBindingImpl.executeBindings():void");
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ItemCouponBinding
    public void g(@Nullable CouponListClickProxy couponListClickProxy) {
        this.f21836s = couponListClickProxy;
        synchronized (this) {
            this.B |= 2;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ItemCouponBinding
    public void h(@Nullable CouponItemBean couponItemBean) {
        this.f21835r = couponItemBean;
        synchronized (this) {
            this.B |= 1;
        }
        notifyPropertyChanged(18);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.B != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.B = 4L;
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
            h((CouponItemBean) obj);
        } else if (7 != i4) {
            return false;
        } else {
            g((CouponListClickProxy) obj);
        }
        return true;
    }

    private ItemCouponBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (TextView) objArr[14], (TextView) objArr[7], (TextView) objArr[9], (TextView) objArr[10], (TextView) objArr[18], (TextView) objArr[16], (TextView) objArr[17], (TextView) objArr[3], (TextView) objArr[11], (TextView) objArr[6], (TextView) objArr[13], (TextView) objArr[2], (TextView) objArr[5], (View) objArr[15], (View) objArr[20], (View) objArr[19]);
        this.B = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f21837t = constraintLayout;
        constraintLayout.setTag(null);
        Group group = (Group) objArr[1];
        this.f21838u = group;
        group.setTag(null);
        ImageView imageView = (ImageView) objArr[12];
        this.f21839v = imageView;
        imageView.setTag(null);
        Group group2 = (Group) objArr[4];
        this.f21840w = group2;
        group2.setTag(null);
        Group group3 = (Group) objArr[8];
        this.f21841x = group3;
        group3.setTag(null);
        this.f21819b.setTag(null);
        this.f21820c.setTag(null);
        this.f21821d.setTag(null);
        this.f21822e.setTag(null);
        this.f21826i.setTag(null);
        this.f21827j.setTag(null);
        this.f21828k.setTag(null);
        this.f21829l.setTag(null);
        this.f21830m.setTag(null);
        this.f21831n.setTag(null);
        setRootTag(view);
        this.f21842y = new a(this, 1);
        this.f21843z = new a(this, 2);
        this.A = new a(this, 3);
        invalidateAll();
    }
}
