package com.join.android.app.mgsim.wufun.databinding;

import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.join.android.app.mgsim.wufun.R;
import com.join.android.app.mgsim.wufun.generated.callback.a;
import com.join.kotlin.discount.model.bean.CouponItemBean;
import com.join.kotlin.discount.proxy.CouponListClickProxy;
/* loaded from: classes3.dex */
public class ItemCouponGameDetailBindingImpl extends ItemCouponGameDetailBinding implements a.InterfaceC0321a {
    @Nullable
    private static final ViewDataBinding.IncludedLayouts A = null;
    @Nullable
    private static final SparseIntArray B;
    @NonNull

    /* renamed from: q  reason: collision with root package name */
    private final ConstraintLayout f21859q;
    @NonNull

    /* renamed from: r  reason: collision with root package name */
    private final Group f21860r;
    @NonNull

    /* renamed from: s  reason: collision with root package name */
    private final LinearLayout f21861s;
    @NonNull

    /* renamed from: t  reason: collision with root package name */
    private final TextView f21862t;
    @NonNull

    /* renamed from: u  reason: collision with root package name */
    private final Group f21863u;
    @Nullable

    /* renamed from: v  reason: collision with root package name */
    private final View.OnClickListener f21864v;
    @Nullable

    /* renamed from: w  reason: collision with root package name */
    private final View.OnClickListener f21865w;
    @Nullable

    /* renamed from: x  reason: collision with root package name */
    private final View.OnClickListener f21866x;
    @Nullable

    /* renamed from: y  reason: collision with root package name */
    private final View.OnClickListener f21867y;

    /* renamed from: z  reason: collision with root package name */
    private long f21868z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        B = sparseIntArray;
        sparseIntArray.put(R.id.v_left, 13);
        sparseIntArray.put(R.id.tv_label_y, 14);
        sparseIntArray.put(R.id.tv_label_ye, 15);
        sparseIntArray.put(R.id.v_right, 16);
        sparseIntArray.put(R.id.vLine, 17);
    }

    public ItemCouponGameDetailBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 18, A, B));
    }

    @Override // com.join.android.app.mgsim.wufun.generated.callback.a.InterfaceC0321a
    public final void a(int i4, View view) {
        if (i4 == 1) {
            CouponItemBean couponItemBean = this.f21857o;
            CouponListClickProxy couponListClickProxy = this.f21858p;
            if (couponListClickProxy != null) {
                couponListClickProxy.onUnSupportClick(couponItemBean);
            }
        } else if (i4 == 2) {
            CouponItemBean couponItemBean2 = this.f21857o;
            CouponListClickProxy couponListClickProxy2 = this.f21858p;
            if (couponListClickProxy2 != null) {
                couponListClickProxy2.onDetailClick(couponItemBean2);
            }
        } else if (i4 == 3) {
            CouponItemBean couponItemBean3 = this.f21857o;
            CouponListClickProxy couponListClickProxy3 = this.f21858p;
            if (couponListClickProxy3 != null) {
                couponListClickProxy3.onUseClick(couponItemBean3);
            }
        } else if (i4 != 4) {
        } else {
            CouponItemBean couponItemBean4 = this.f21857o;
            CouponListClickProxy couponListClickProxy4 = this.f21858p;
            if (couponListClickProxy4 != null) {
                couponListClickProxy4.onReceiveClick(couponItemBean4);
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    protected void executeBindings() {
        long j4;
        String str;
        String str2;
        int i4;
        boolean z4;
        String str3;
        int i5;
        int i6;
        String str4;
        int i7;
        int i8;
        int i9;
        String str5;
        boolean z5;
        long j5;
        String str6;
        SpannableStringBuilder spannableStringBuilder;
        String str7;
        long j6;
        boolean z6;
        Integer num;
        String str8;
        String str9;
        Integer num2;
        String str10;
        String str11;
        String str12;
        Boolean bool;
        String str13;
        SpannableStringBuilder spannableStringBuilder2;
        String str14;
        long j7;
        long j8;
        synchronized (this) {
            j4 = this.f21868z;
            this.f21868z = 0L;
        }
        CouponItemBean couponItemBean = this.f21857o;
        long j9 = j4 & 5;
        if (j9 != 0) {
            if (couponItemBean != null) {
                num2 = couponItemBean.getRange_op();
                str10 = couponItemBean.getCoupon_name();
                String threshold_text = couponItemBean.getThreshold_text();
                str11 = couponItemBean.receiveBtnText();
                str12 = couponItemBean.receiveBtnTextColor();
                bool = couponItemBean.getRepeatable();
                str13 = couponItemBean.getAmount_text();
                spannableStringBuilder2 = couponItemBean.formatBalance();
                String receive_time_text = couponItemBean.getReceive_time_text();
                str14 = couponItemBean.getUse_range_text();
                num = couponItemBean.getState();
                str8 = threshold_text;
                str9 = receive_time_text;
            } else {
                num = null;
                str8 = null;
                str9 = null;
                num2 = null;
                str10 = null;
                str11 = null;
                str12 = null;
                bool = null;
                str13 = null;
                spannableStringBuilder2 = null;
                str14 = null;
            }
            i9 = ViewDataBinding.safeUnbox(num2);
            String str15 = "满" + str8;
            i6 = Color.parseColor(str12);
            boolean safeUnbox = ViewDataBinding.safeUnbox(bool);
            String str16 = "领取时间:" + str9;
            int safeUnbox2 = ViewDataBinding.safeUnbox(num);
            if (j9 != 0) {
                if (safeUnbox) {
                    j7 = j4 | 256;
                    j8 = 1024;
                } else {
                    j7 = j4 | 128;
                    j8 = 512;
                }
                j4 = j7 | j8;
            }
            boolean z7 = i9 != 0;
            z4 = i9 == 0;
            str3 = str15 + "可用";
            i8 = safeUnbox ? 0 : 8;
            i5 = safeUnbox ? 8 : 0;
            boolean z8 = safeUnbox2 != 1;
            boolean z9 = safeUnbox2 == 1;
            if ((j4 & 5) != 0) {
                j4 = z4 ? j4 | 16 : j4 | 8;
            }
            if ((j4 & 5) != 0) {
                j4 |= z8 ? 16384L : 8192L;
            }
            if ((j4 & 5) != 0) {
                j4 |= z9 ? 4096L : 2048L;
            }
            i7 = z8 ? 0 : 4;
            int i10 = z9 ? 0 : 4;
            str = str10;
            str4 = str11;
            str6 = str13;
            spannableStringBuilder = spannableStringBuilder2;
            str5 = str16;
            z5 = z7;
            str2 = str14;
            i4 = i10;
            j5 = 8;
        } else {
            str = null;
            str2 = null;
            i4 = 0;
            z4 = false;
            str3 = null;
            i5 = 0;
            i6 = 0;
            str4 = null;
            i7 = 0;
            i8 = 0;
            i9 = 0;
            str5 = null;
            z5 = false;
            j5 = 8;
            str6 = null;
            spannableStringBuilder = null;
        }
        long j10 = j4 & j5;
        if (j10 != 0) {
            if (i9 == -1) {
                j6 = 0;
                z6 = true;
            } else {
                j6 = 0;
                z6 = false;
            }
            if (j10 != j6) {
                j4 |= z6 ? 64L : 32L;
            }
            str7 = z6 ? "不适用范围" : "适用范围";
        } else {
            str7 = null;
        }
        long j11 = 5 & j4;
        if (j11 == 0) {
            str7 = null;
        } else if (z4) {
            str7 = "全部适用";
        }
        if (j11 != 0) {
            this.f21860r.setVisibility(i5);
            this.f21861s.setVisibility(i4);
            TextViewBindingAdapter.setText(this.f21862t, str4);
            this.f21862t.setTextColor(i6);
            this.f21863u.setVisibility(i8);
            TextViewBindingAdapter.setText(this.f21844b, str2);
            this.f21844b.setVisibility(i7);
            TextViewBindingAdapter.setText(this.f21848f, str3);
            TextViewBindingAdapter.setText(this.f21849g, str);
            this.f21850h.setEnabled(z5);
            TextViewBindingAdapter.setText(this.f21850h, str7);
            TextViewBindingAdapter.setText(this.f21851i, str5);
            TextViewBindingAdapter.setText(this.f21852j, str6);
            TextViewBindingAdapter.setText(this.f21853k, spannableStringBuilder);
        }
        if ((j4 & 4) != 0) {
            this.f21861s.setOnClickListener(this.f21867y);
            this.f21862t.setOnClickListener(this.f21864v);
            this.f21845c.setOnClickListener(this.f21865w);
            this.f21850h.setOnClickListener(this.f21866x);
        }
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ItemCouponGameDetailBinding
    public void g(@Nullable CouponListClickProxy couponListClickProxy) {
        this.f21858p = couponListClickProxy;
        synchronized (this) {
            this.f21868z |= 2;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ItemCouponGameDetailBinding
    public void h(@Nullable CouponItemBean couponItemBean) {
        this.f21857o = couponItemBean;
        synchronized (this) {
            this.f21868z |= 1;
        }
        notifyPropertyChanged(18);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f21868z != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f21868z = 4L;
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

    private ItemCouponGameDetailBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (TextView) objArr[10], (TextView) objArr[7], (TextView) objArr[14], (TextView) objArr[15], (TextView) objArr[3], (TextView) objArr[8], (TextView) objArr[6], (TextView) objArr[9], (TextView) objArr[2], (TextView) objArr[5], (View) objArr[13], (View) objArr[17], (View) objArr[16]);
        this.f21868z = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f21859q = constraintLayout;
        constraintLayout.setTag(null);
        Group group = (Group) objArr[1];
        this.f21860r = group;
        group.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[11];
        this.f21861s = linearLayout;
        linearLayout.setTag(null);
        TextView textView = (TextView) objArr[12];
        this.f21862t = textView;
        textView.setTag(null);
        Group group2 = (Group) objArr[4];
        this.f21863u = group2;
        group2.setTag(null);
        this.f21844b.setTag(null);
        this.f21845c.setTag(null);
        this.f21848f.setTag(null);
        this.f21849g.setTag(null);
        this.f21850h.setTag(null);
        this.f21851i.setTag(null);
        this.f21852j.setTag(null);
        this.f21853k.setTag(null);
        setRootTag(view);
        this.f21864v = new a(this, 4);
        this.f21865w = new a(this, 2);
        this.f21866x = new a(this, 1);
        this.f21867y = new a(this, 3);
        invalidateAll();
    }
}
