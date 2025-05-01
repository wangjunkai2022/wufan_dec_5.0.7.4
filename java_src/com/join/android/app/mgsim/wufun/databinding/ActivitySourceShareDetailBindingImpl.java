package com.join.android.app.mgsim.wufun.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.MutableLiveData;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
import com.join.android.app.mgsim.wufun.generated.callback.a;
import com.join.kotlin.quark.model.bean.SourceListItemBean;
import com.join.kotlin.quark.proxy.SourceShareClickProxy;
import com.join.kotlin.quark.viewmodel.SourceShareDetailViewModel;
/* loaded from: classes3.dex */
public class ActivitySourceShareDetailBindingImpl extends ActivitySourceShareDetailBinding implements a.InterfaceC0321a {
    @Nullable

    /* renamed from: t  reason: collision with root package name */
    private static final ViewDataBinding.IncludedLayouts f17074t = null;
    @Nullable

    /* renamed from: u  reason: collision with root package name */
    private static final SparseIntArray f17075u;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    private final LinearLayout f17076o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    private final TextView f17077p;
    @Nullable

    /* renamed from: q  reason: collision with root package name */
    private final View.OnClickListener f17078q;
    @Nullable

    /* renamed from: r  reason: collision with root package name */
    private final View.OnClickListener f17079r;

    /* renamed from: s  reason: collision with root package name */
    private long f17080s;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f17075u = sparseIntArray;
        sparseIntArray.put(R.id.rl_content, 9);
        sparseIntArray.put(R.id.web_view, 10);
        sparseIntArray.put(R.id.cl_content, 11);
        sparseIntArray.put(R.id.tv_label1, 12);
    }

    public ActivitySourceShareDetailBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 13, f17074t, f17075u));
    }

    private boolean i(MutableLiveData<SourceListItemBean> mutableLiveData, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f17080s |= 2;
            }
            return true;
        }
        return false;
    }

    private boolean j(MutableLiveData<String> mutableLiveData, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f17080s |= 1;
            }
            return true;
        }
        return false;
    }

    @Override // com.join.android.app.mgsim.wufun.generated.callback.a.InterfaceC0321a
    public final void a(int i4, View view) {
        if (i4 == 1) {
            SourceShareClickProxy sourceShareClickProxy = this.f17073n;
            if (sourceShareClickProxy != null) {
                sourceShareClickProxy.onBackClick();
            }
        } else if (i4 != 2) {
        } else {
            SourceShareClickProxy sourceShareClickProxy2 = this.f17073n;
            if (sourceShareClickProxy2 != null) {
                sourceShareClickProxy2.onSaveClick();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void executeBindings() {
        /*
            r19 = this;
            r1 = r19
            monitor-enter(r19)
            long r2 = r1.f17080s     // Catch: java.lang.Throwable -> Lb4
            r4 = 0
            r1.f17080s = r4     // Catch: java.lang.Throwable -> Lb4
            monitor-exit(r19)     // Catch: java.lang.Throwable -> Lb4
            com.join.kotlin.quark.viewmodel.SourceShareDetailViewModel r0 = r1.f17072m
            r6 = 23
            long r6 = r6 & r2
            r8 = 22
            r10 = 21
            r12 = 0
            r13 = 0
            int r14 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r14 == 0) goto L6c
            long r6 = r2 & r10
            int r14 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r14 == 0) goto L33
            if (r0 == 0) goto L26
            androidx.lifecycle.MutableLiveData r6 = r0.getTitle()
            goto L27
        L26:
            r6 = r13
        L27:
            r1.updateLiveDataRegistration(r12, r6)
            if (r6 == 0) goto L33
            java.lang.Object r6 = r6.getValue()
            java.lang.String r6 = (java.lang.String) r6
            goto L34
        L33:
            r6 = r13
        L34:
            long r14 = r2 & r8
            int r7 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r7 == 0) goto L69
            if (r0 == 0) goto L41
            androidx.lifecycle.MutableLiveData r0 = r0.getItemBean()
            goto L42
        L41:
            r0 = r13
        L42:
            r7 = 1
            r1.updateLiveDataRegistration(r7, r0)
            if (r0 == 0) goto L4f
            java.lang.Object r0 = r0.getValue()
            com.join.kotlin.quark.model.bean.SourceListItemBean r0 = (com.join.kotlin.quark.model.bean.SourceListItemBean) r0
            goto L50
        L4f:
            r0 = r13
        L50:
            if (r0 == 0) goto L69
            java.lang.String r7 = r0.getTitle()
            java.lang.String r14 = r0.getNickname()
            java.lang.String r15 = r0.iconUrl()
            java.lang.String r16 = r0.introText()
            java.lang.String r0 = r0.getAvatar()
            r10 = r16
            goto L72
        L69:
            r0 = r13
            r7 = r0
            goto L6f
        L6c:
            r0 = r13
            r6 = r0
            r7 = r6
        L6f:
            r10 = r7
            r14 = r10
            r15 = r14
        L72:
            r17 = 16
            long r17 = r2 & r17
            int r11 = (r17 > r4 ? 1 : (r17 == r4 ? 0 : -1))
            if (r11 == 0) goto L88
            android.widget.ImageView r11 = r1.f17061b
            android.view.View$OnClickListener r12 = r1.f17078q
            r11.setOnClickListener(r12)
            android.widget.TextView r11 = r1.f17069j
            android.view.View$OnClickListener r12 = r1.f17079r
            r11.setOnClickListener(r12)
        L88:
            long r8 = r8 & r2
            int r11 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r11 == 0) goto La7
            android.widget.TextView r8 = r1.f17077p
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r8, r10)
            com.facebook.drawee.view.SimpleDraweeView r8 = r1.f17064e
            r9 = 0
            com.join.kotlin.bindingadapter.SimpleDrawableViewKt.loadUrl(r8, r0, r13, r9)
            com.facebook.drawee.view.SimpleDraweeView r0 = r1.f17065f
            com.join.kotlin.bindingadapter.SimpleDrawableViewKt.loadUrl(r0, r15, r13, r9)
            android.widget.TextView r0 = r1.f17067h
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r0, r14)
            android.widget.TextView r0 = r1.f17070k
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r0, r7)
        La7:
            r7 = 21
            long r2 = r2 & r7
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto Lb3
            android.widget.TextView r0 = r1.f17066g
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r0, r6)
        Lb3:
            return
        Lb4:
            r0 = move-exception
            monitor-exit(r19)     // Catch: java.lang.Throwable -> Lb4
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.android.app.mgsim.wufun.databinding.ActivitySourceShareDetailBindingImpl.executeBindings():void");
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ActivitySourceShareDetailBinding
    public void g(@Nullable SourceShareClickProxy sourceShareClickProxy) {
        this.f17073n = sourceShareClickProxy;
        synchronized (this) {
            this.f17080s |= 8;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ActivitySourceShareDetailBinding
    public void h(@Nullable SourceShareDetailViewModel sourceShareDetailViewModel) {
        this.f17072m = sourceShareDetailViewModel;
        synchronized (this) {
            this.f17080s |= 4;
        }
        notifyPropertyChanged(36);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f17080s != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f17080s = 16L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int i4, Object obj, int i5) {
        if (i4 != 0) {
            if (i4 != 1) {
                return false;
            }
            return i((MutableLiveData) obj, i5);
        }
        return j((MutableLiveData) obj, i5);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i4, @Nullable Object obj) {
        if (36 == i4) {
            h((SourceShareDetailViewModel) obj);
        } else if (7 != i4) {
            return false;
        } else {
            g((SourceShareClickProxy) obj);
        }
        return true;
    }

    private ActivitySourceShareDetailBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 2, (ImageView) objArr[1], (ConstraintLayout) objArr[11], (RelativeLayout) objArr[9], (SimpleDraweeView) objArr[7], (SimpleDraweeView) objArr[3], (TextView) objArr[2], (TextView) objArr[8], (TextView) objArr[12], (TextView) objArr[6], (TextView) objArr[4], (WebView) objArr[10]);
        this.f17080s = -1L;
        this.f17061b.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f17076o = linearLayout;
        linearLayout.setTag(null);
        TextView textView = (TextView) objArr[5];
        this.f17077p = textView;
        textView.setTag(null);
        this.f17064e.setTag(null);
        this.f17065f.setTag(null);
        this.f17066g.setTag(null);
        this.f17067h.setTag(null);
        this.f17069j.setTag(null);
        this.f17070k.setTag(null);
        setRootTag(view);
        this.f17078q = new a(this, 1);
        this.f17079r = new a(this, 2);
        invalidateAll();
    }
}
