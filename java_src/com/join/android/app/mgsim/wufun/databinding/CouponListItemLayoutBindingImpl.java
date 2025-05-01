package com.join.android.app.mgsim.wufun.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.join.android.app.mgsim.wufun.R;
import com.join.android.app.mgsim.wufun.generated.callback.a;
import com.join.kotlin.ui.coupon.ClickProxy;
import com.join.mgps.dto.BTGameCouponBean;
/* loaded from: classes3.dex */
public class CouponListItemLayoutBindingImpl extends CouponListItemLayoutBinding implements a.InterfaceC0321a {
    @Nullable

    /* renamed from: w  reason: collision with root package name */
    private static final ViewDataBinding.IncludedLayouts f18268w = null;
    @Nullable

    /* renamed from: x  reason: collision with root package name */
    private static final SparseIntArray f18269x;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    private final LinearLayout f18270m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    private final TextView f18271n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    private final LinearLayout f18272o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    private final TextView f18273p;
    @NonNull

    /* renamed from: q  reason: collision with root package name */
    private final TextView f18274q;
    @NonNull

    /* renamed from: r  reason: collision with root package name */
    private final TextView f18275r;
    @NonNull

    /* renamed from: s  reason: collision with root package name */
    private final ImageView f18276s;
    @Nullable

    /* renamed from: t  reason: collision with root package name */
    private final View.OnClickListener f18277t;
    @Nullable

    /* renamed from: u  reason: collision with root package name */
    private final View.OnClickListener f18278u;

    /* renamed from: v  reason: collision with root package name */
    private long f18279v;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f18269x = sparseIntArray;
        sparseIntArray.put(R.id.money, 13);
        sparseIntArray.put(R.id.line, 14);
    }

    public CouponListItemLayoutBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 15, f18268w, f18269x));
    }

    @Override // com.join.android.app.mgsim.wufun.generated.callback.a.InterfaceC0321a
    public final void a(int i4, View view) {
        if (i4 == 1) {
            BTGameCouponBean bTGameCouponBean = this.f18265j;
            ClickProxy clickProxy = this.f18267l;
            if (clickProxy != null) {
                clickProxy.onClickGet(bTGameCouponBean);
            }
        } else if (i4 != 2) {
        } else {
            BTGameCouponBean bTGameCouponBean2 = this.f18265j;
            ClickProxy clickProxy2 = this.f18267l;
            if (clickProxy2 != null) {
                clickProxy2.onClickMore(bTGameCouponBean2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01ef  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void executeBindings() {
        /*
            Method dump skipped, instructions count: 504
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.android.app.mgsim.wufun.databinding.CouponListItemLayoutBindingImpl.executeBindings():void");
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.CouponListItemLayoutBinding
    public void h(@Nullable BTGameCouponBean bTGameCouponBean) {
        this.f18265j = bTGameCouponBean;
        synchronized (this) {
            this.f18279v |= 1;
        }
        notifyPropertyChanged(3);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f18279v != 0;
        }
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.CouponListItemLayoutBinding
    public void i(@Nullable ClickProxy clickProxy) {
        this.f18267l = clickProxy;
        synchronized (this) {
            this.f18279v |= 4;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f18279v = 8L;
        }
        requestRebind();
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.CouponListItemLayoutBinding
    public void j(@Nullable Boolean bool) {
        this.f18266k = bool;
        synchronized (this) {
            this.f18279v |= 2;
        }
        notifyPropertyChanged(16);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int i4, Object obj, int i5) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i4, @Nullable Object obj) {
        if (3 == i4) {
            h((BTGameCouponBean) obj);
        } else if (16 == i4) {
            j((Boolean) obj);
        } else if (7 != i4) {
            return false;
        } else {
            i((ClickProxy) obj);
        }
        return true;
    }

    private CouponListItemLayoutBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (TextView) objArr[5], (TextView) objArr[7], (View) objArr[14], (ConstraintLayout) objArr[13], (TextView) objArr[4], (TextView) objArr[2], (TextView) objArr[8], (TextView) objArr[6]);
        this.f18279v = -1L;
        this.f18257b.setTag(null);
        this.f18258c.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f18270m = linearLayout;
        linearLayout.setTag(null);
        TextView textView = (TextView) objArr[1];
        this.f18271n = textView;
        textView.setTag(null);
        LinearLayout linearLayout2 = (LinearLayout) objArr[10];
        this.f18272o = linearLayout2;
        linearLayout2.setTag(null);
        TextView textView2 = (TextView) objArr[11];
        this.f18273p = textView2;
        textView2.setTag(null);
        TextView textView3 = (TextView) objArr[12];
        this.f18274q = textView3;
        textView3.setTag(null);
        TextView textView4 = (TextView) objArr[3];
        this.f18275r = textView4;
        textView4.setTag(null);
        ImageView imageView = (ImageView) objArr[9];
        this.f18276s = imageView;
        imageView.setTag(null);
        this.f18261f.setTag(null);
        this.f18262g.setTag(null);
        this.f18263h.setTag(null);
        this.f18264i.setTag(null);
        setRootTag(view);
        this.f18277t = new a(this, 1);
        this.f18278u = new a(this, 2);
        invalidateAll();
    }
}
