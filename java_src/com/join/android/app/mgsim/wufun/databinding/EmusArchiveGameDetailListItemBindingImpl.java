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
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
import com.join.android.app.mgsim.wufun.generated.callback.a;
import com.join.kotlin.ui.cloudarchive.adapter.OnEmusClickArchiveListener;
import com.join.mgps.dto.CloudListDataBean;
/* loaded from: classes3.dex */
public class EmusArchiveGameDetailListItemBindingImpl extends EmusArchiveGameDetailListItemBinding implements a.InterfaceC0321a {
    @Nullable

    /* renamed from: r  reason: collision with root package name */
    private static final ViewDataBinding.IncludedLayouts f19315r = null;
    @Nullable

    /* renamed from: s  reason: collision with root package name */
    private static final SparseIntArray f19316s;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    private final LinearLayout f19317l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    private final SimpleDraweeView f19318m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    private final ConstraintLayout f19319n;
    @Nullable

    /* renamed from: o  reason: collision with root package name */
    private final View.OnClickListener f19320o;
    @Nullable

    /* renamed from: p  reason: collision with root package name */
    private final View.OnClickListener f19321p;

    /* renamed from: q  reason: collision with root package name */
    private long f19322q;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f19316s = sparseIntArray;
        sparseIntArray.put(R.id.tvHotTag, 7);
        sparseIntArray.put(R.id.messageLayout, 8);
        sparseIntArray.put(R.id.more, 9);
        sparseIntArray.put(R.id.parise, 10);
    }

    public EmusArchiveGameDetailListItemBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 11, f19315r, f19316s));
    }

    @Override // com.join.android.app.mgsim.wufun.generated.callback.a.InterfaceC0321a
    public final void a(int i4, View view) {
        if (i4 != 1) {
            if (i4 != 2) {
                return;
            }
            CloudListDataBean cloudListDataBean = this.f19313j;
            OnEmusClickArchiveListener onEmusClickArchiveListener = this.f19314k;
            if (onEmusClickArchiveListener != null) {
                onEmusClickArchiveListener.onClickRun(cloudListDataBean);
                return;
            }
            return;
        }
        CloudListDataBean cloudListDataBean2 = this.f19313j;
        OnEmusClickArchiveListener onEmusClickArchiveListener2 = this.f19314k;
        if (onEmusClickArchiveListener2 != null) {
            if (cloudListDataBean2 != null) {
                onEmusClickArchiveListener2.onClickImage(cloudListDataBean2.getArchiveCover());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void executeBindings() {
        /*
            r18 = this;
            r1 = r18
            monitor-enter(r18)
            long r2 = r1.f19322q     // Catch: java.lang.Throwable -> L8d
            r4 = 0
            r1.f19322q = r4     // Catch: java.lang.Throwable -> L8d
            monitor-exit(r18)     // Catch: java.lang.Throwable -> L8d
            com.join.mgps.dto.CloudListDataBean r0 = r1.f19313j
            r6 = 5
            long r8 = r2 & r6
            r10 = 0
            r11 = 0
            int r12 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r12 == 0) goto L4e
            if (r0 == 0) goto L2d
            java.lang.String r12 = r0.getArchiveCover()
            java.lang.String r13 = r0.getNickname()
            java.lang.String r14 = r0.getArchiveDesc()
            int r15 = r0.getHighComment()
            java.lang.String r0 = r0.getAvatar()
            goto L32
        L2d:
            r0 = r11
            r12 = r0
            r13 = r12
            r14 = r13
            r15 = 0
        L32:
            if (r12 != 0) goto L37
            r16 = 1
            goto L39
        L37:
            r16 = 0
        L39:
            java.lang.String r15 = java.lang.String.valueOf(r15)
            int r17 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r17 == 0) goto L49
            if (r16 == 0) goto L46
            r8 = 16
            goto L48
        L46:
            r8 = 8
        L48:
            long r2 = r2 | r8
        L49:
            if (r16 == 0) goto L53
            r8 = 8
            goto L54
        L4e:
            r0 = r11
            r12 = r0
            r13 = r12
            r14 = r13
            r15 = r14
        L53:
            r8 = 0
        L54:
            long r6 = r6 & r2
            int r9 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r9 == 0) goto L77
            android.widget.TextView r6 = r1.f19305b
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r6, r14)
            com.facebook.drawee.view.SimpleDraweeView r6 = r1.f19318m
            r6.setVisibility(r8)
            com.facebook.drawee.view.SimpleDraweeView r6 = r1.f19318m
            com.join.kotlin.bindingadapter.SimpleDrawableViewKt.loadUrl(r6, r12, r11, r10)
            android.widget.TextView r6 = r1.f19309f
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r6, r15)
            com.facebook.drawee.view.SimpleDraweeView r6 = r1.f19311h
            com.join.kotlin.bindingadapter.SimpleDrawableViewKt.loadUrl(r6, r0, r11, r10)
            android.widget.TextView r0 = r1.f19312i
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r0, r13)
        L77:
            r6 = 4
            long r2 = r2 & r6
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L8c
            com.facebook.drawee.view.SimpleDraweeView r0 = r1.f19318m
            android.view.View$OnClickListener r2 = r1.f19321p
            r0.setOnClickListener(r2)
            androidx.constraintlayout.widget.ConstraintLayout r0 = r1.f19319n
            android.view.View$OnClickListener r2 = r1.f19320o
            r0.setOnClickListener(r2)
        L8c:
            return
        L8d:
            r0 = move-exception
            monitor-exit(r18)     // Catch: java.lang.Throwable -> L8d
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.android.app.mgsim.wufun.databinding.EmusArchiveGameDetailListItemBindingImpl.executeBindings():void");
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.EmusArchiveGameDetailListItemBinding
    public void g(@Nullable OnEmusClickArchiveListener onEmusClickArchiveListener) {
        this.f19314k = onEmusClickArchiveListener;
        synchronized (this) {
            this.f19322q |= 2;
        }
        notifyPropertyChanged(10);
        super.requestRebind();
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.EmusArchiveGameDetailListItemBinding
    public void h(@Nullable CloudListDataBean cloudListDataBean) {
        this.f19313j = cloudListDataBean;
        synchronized (this) {
            this.f19322q |= 1;
        }
        notifyPropertyChanged(18);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f19322q != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f19322q = 4L;
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
            h((CloudListDataBean) obj);
        } else if (10 != i4) {
            return false;
        } else {
            g((OnEmusClickArchiveListener) obj);
        }
        return true;
    }

    private EmusArchiveGameDetailListItemBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (TextView) objArr[3], (RelativeLayout) objArr[8], (TextView) objArr[9], (ImageView) objArr[10], (TextView) objArr[6], (TextView) objArr[7], (SimpleDraweeView) objArr[4], (TextView) objArr[5]);
        this.f19322q = -1L;
        this.f19305b.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f19317l = linearLayout;
        linearLayout.setTag(null);
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) objArr[1];
        this.f19318m = simpleDraweeView;
        simpleDraweeView.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[2];
        this.f19319n = constraintLayout;
        constraintLayout.setTag(null);
        this.f19309f.setTag(null);
        this.f19311h.setTag(null);
        this.f19312i.setTag(null);
        setRootTag(view);
        this.f19320o = new a(this, 2);
        this.f19321p = new a(this, 1);
        invalidateAll();
    }
}
