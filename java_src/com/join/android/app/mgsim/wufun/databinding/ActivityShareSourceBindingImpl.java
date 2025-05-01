package com.join.android.app.mgsim.wufun.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.InverseBindingListener;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.lifecycle.MutableLiveData;
import com.join.android.app.mgsim.wufun.R;
import com.join.android.app.mgsim.wufun.generated.callback.a;
import com.join.kotlin.quark.proxy.ShareSourceClickProxy;
import com.join.kotlin.quark.viewmodel.ShareSourceViewModel;
/* loaded from: classes3.dex */
public class ActivityShareSourceBindingImpl extends ActivityShareSourceBinding implements a.InterfaceC0321a {
    @Nullable

    /* renamed from: q  reason: collision with root package name */
    private static final ViewDataBinding.IncludedLayouts f16983q = null;
    @Nullable

    /* renamed from: r  reason: collision with root package name */
    private static final SparseIntArray f16984r;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    private final LinearLayout f16985j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    private final TextView f16986k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    private final ImageView f16987l;
    @Nullable

    /* renamed from: m  reason: collision with root package name */
    private final View.OnClickListener f16988m;
    @Nullable

    /* renamed from: n  reason: collision with root package name */
    private final View.OnClickListener f16989n;

    /* renamed from: o  reason: collision with root package name */
    private InverseBindingListener f16990o;

    /* renamed from: p  reason: collision with root package name */
    private long f16991p;

    /* loaded from: classes3.dex */
    class a implements InverseBindingListener {
        a() {
        }

        @Override // androidx.databinding.InverseBindingListener
        public void onChange() {
            String textString = TextViewBindingAdapter.getTextString(ActivityShareSourceBindingImpl.this.f16975b);
            ShareSourceViewModel shareSourceViewModel = ActivityShareSourceBindingImpl.this.f16981h;
            if (shareSourceViewModel != null) {
                MutableLiveData<String> diskUrl = shareSourceViewModel.getDiskUrl();
                if (diskUrl != null) {
                    diskUrl.setValue(textString);
                }
            }
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f16984r = sparseIntArray;
        sparseIntArray.put(R.id.tv_title, 5);
        sparseIntArray.put(R.id.tv_hope, 6);
        sparseIntArray.put(R.id.v_tip_link, 7);
        sparseIntArray.put(R.id.iv_link, 8);
    }

    public ActivityShareSourceBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 9, f16983q, f16984r));
    }

    private boolean i(MutableLiveData<String> mutableLiveData, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f16991p |= 1;
            }
            return true;
        }
        return false;
    }

    private boolean j(MutableLiveData<Boolean> mutableLiveData, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f16991p |= 2;
            }
            return true;
        }
        return false;
    }

    @Override // com.join.android.app.mgsim.wufun.generated.callback.a.InterfaceC0321a
    public final void a(int i4, View view) {
        if (i4 == 1) {
            ShareSourceClickProxy shareSourceClickProxy = this.f16982i;
            if (shareSourceClickProxy != null) {
                shareSourceClickProxy.onShareClick();
            }
        } else if (i4 != 2) {
        } else {
            ShareSourceClickProxy shareSourceClickProxy2 = this.f16982i;
            if (shareSourceClickProxy2 != null) {
                shareSourceClickProxy2.onBackClick();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
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
            long r2 = r1.f16991p     // Catch: java.lang.Throwable -> Laa
            r4 = 0
            r1.f16991p = r4     // Catch: java.lang.Throwable -> Laa
            monitor-exit(r19)     // Catch: java.lang.Throwable -> Laa
            com.join.kotlin.quark.viewmodel.ShareSourceViewModel r0 = r1.f16981h
            r6 = 23
            long r6 = r6 & r2
            r8 = 22
            r10 = 20
            r12 = 21
            r14 = 0
            r15 = 0
            int r16 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r16 == 0) goto L6d
            long r6 = r2 & r10
            int r16 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r16 == 0) goto L30
            if (r0 == 0) goto L28
            com.join.kotlin.quark.model.bean.SourceListItemBean r6 = r0.getWishPoolItem()
            goto L29
        L28:
            r6 = r15
        L29:
            if (r6 == 0) goto L30
            java.lang.String r6 = r6.getTitle()
            goto L31
        L30:
            r6 = r15
        L31:
            long r16 = r2 & r12
            int r7 = (r16 > r4 ? 1 : (r16 == r4 ? 0 : -1))
            if (r7 == 0) goto L4b
            if (r0 == 0) goto L3e
            androidx.lifecycle.MutableLiveData r7 = r0.getDiskUrl()
            goto L3f
        L3e:
            r7 = r15
        L3f:
            r1.updateLiveDataRegistration(r14, r7)
            if (r7 == 0) goto L4b
            java.lang.Object r7 = r7.getValue()
            java.lang.String r7 = (java.lang.String) r7
            goto L4c
        L4b:
            r7 = r15
        L4c:
            long r16 = r2 & r8
            int r18 = (r16 > r4 ? 1 : (r16 == r4 ? 0 : -1))
            if (r18 == 0) goto L6f
            if (r0 == 0) goto L59
            androidx.lifecycle.MutableLiveData r0 = r0.getSubmitEnable()
            goto L5a
        L59:
            r0 = r15
        L5a:
            r14 = 1
            r1.updateLiveDataRegistration(r14, r0)
            if (r0 == 0) goto L67
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            goto L68
        L67:
            r0 = r15
        L68:
            boolean r14 = androidx.databinding.ViewDataBinding.safeUnbox(r0)
            goto L6f
        L6d:
            r6 = r15
            r7 = r6
        L6f:
            long r12 = r12 & r2
            int r0 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r0 == 0) goto L79
            android.widget.EditText r0 = r1.f16975b
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r0, r7)
        L79:
            r12 = 16
            long r12 = r12 & r2
            int r0 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r0 == 0) goto L95
            android.widget.EditText r0 = r1.f16975b
            androidx.databinding.InverseBindingListener r7 = r1.f16990o
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r0, r15, r15, r15, r7)
            android.widget.ImageView r0 = r1.f16987l
            android.view.View$OnClickListener r7 = r1.f16988m
            r0.setOnClickListener(r7)
            android.widget.TextView r0 = r1.f16978e
            android.view.View$OnClickListener r7 = r1.f16989n
            r0.setOnClickListener(r7)
        L95:
            long r10 = r10 & r2
            int r0 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r0 == 0) goto L9f
            android.widget.TextView r0 = r1.f16986k
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r0, r6)
        L9f:
            long r2 = r2 & r8
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto La9
            android.widget.TextView r0 = r1.f16978e
            r0.setEnabled(r14)
        La9:
            return
        Laa:
            r0 = move-exception
            monitor-exit(r19)     // Catch: java.lang.Throwable -> Laa
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.android.app.mgsim.wufun.databinding.ActivityShareSourceBindingImpl.executeBindings():void");
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ActivityShareSourceBinding
    public void g(@Nullable ShareSourceClickProxy shareSourceClickProxy) {
        this.f16982i = shareSourceClickProxy;
        synchronized (this) {
            this.f16991p |= 8;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ActivityShareSourceBinding
    public void h(@Nullable ShareSourceViewModel shareSourceViewModel) {
        this.f16981h = shareSourceViewModel;
        synchronized (this) {
            this.f16991p |= 4;
        }
        notifyPropertyChanged(36);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f16991p != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f16991p = 16L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int i4, Object obj, int i5) {
        if (i4 != 0) {
            if (i4 != 1) {
                return false;
            }
            return j((MutableLiveData) obj, i5);
        }
        return i((MutableLiveData) obj, i5);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i4, @Nullable Object obj) {
        if (36 == i4) {
            h((ShareSourceViewModel) obj);
        } else if (7 != i4) {
            return false;
        } else {
            g((ShareSourceClickProxy) obj);
        }
        return true;
    }

    private ActivityShareSourceBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 2, (EditText) objArr[2], (ImageView) objArr[8], (TextView) objArr[6], (TextView) objArr[3], (TextView) objArr[5], (View) objArr[7]);
        this.f16990o = new a();
        this.f16991p = -1L;
        this.f16975b.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f16985j = linearLayout;
        linearLayout.setTag(null);
        TextView textView = (TextView) objArr[1];
        this.f16986k = textView;
        textView.setTag(null);
        ImageView imageView = (ImageView) objArr[4];
        this.f16987l = imageView;
        imageView.setTag(null);
        this.f16978e.setTag(null);
        setRootTag(view);
        this.f16988m = new com.join.android.app.mgsim.wufun.generated.callback.a(this, 2);
        this.f16989n = new com.join.android.app.mgsim.wufun.generated.callback.a(this, 1);
        invalidateAll();
    }
}
