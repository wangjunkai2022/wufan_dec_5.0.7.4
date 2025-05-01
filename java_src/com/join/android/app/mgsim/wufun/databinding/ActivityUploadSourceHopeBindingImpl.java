package com.join.android.app.mgsim.wufun.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.InverseBindingListener;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.join.android.app.mgsim.wufun.R;
import com.join.android.app.mgsim.wufun.generated.callback.a;
import com.join.kotlin.quark.proxy.UploadSourceHopeClickProxy;
import com.join.kotlin.quark.viewmodel.UploadSourceHopeViewModel;
/* loaded from: classes3.dex */
public class ActivityUploadSourceHopeBindingImpl extends ActivityUploadSourceHopeBinding implements a.InterfaceC0321a {
    @Nullable

    /* renamed from: s  reason: collision with root package name */
    private static final ViewDataBinding.IncludedLayouts f17207s = null;
    @Nullable

    /* renamed from: t  reason: collision with root package name */
    private static final SparseIntArray f17208t;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    private final LinearLayout f17209m;
    @Nullable

    /* renamed from: n  reason: collision with root package name */
    private final View.OnClickListener f17210n;
    @Nullable

    /* renamed from: o  reason: collision with root package name */
    private final View.OnClickListener f17211o;

    /* renamed from: p  reason: collision with root package name */
    private InverseBindingListener f17212p;

    /* renamed from: q  reason: collision with root package name */
    private InverseBindingListener f17213q;

    /* renamed from: r  reason: collision with root package name */
    private long f17214r;

    /* loaded from: classes3.dex */
    class a implements InverseBindingListener {
        a() {
        }

        @Override // androidx.databinding.InverseBindingListener
        public void onChange() {
            String textString = TextViewBindingAdapter.getTextString(ActivityUploadSourceHopeBindingImpl.this.f17197c);
            UploadSourceHopeViewModel uploadSourceHopeViewModel = ActivityUploadSourceHopeBindingImpl.this.f17205k;
            if (uploadSourceHopeViewModel != null) {
                MutableLiveData<String> descData = uploadSourceHopeViewModel.getDescData();
                if (descData != null) {
                    descData.setValue(textString);
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    class b implements InverseBindingListener {
        b() {
        }

        @Override // androidx.databinding.InverseBindingListener
        public void onChange() {
            String textString = TextViewBindingAdapter.getTextString(ActivityUploadSourceHopeBindingImpl.this.f17198d);
            UploadSourceHopeViewModel uploadSourceHopeViewModel = ActivityUploadSourceHopeBindingImpl.this.f17205k;
            if (uploadSourceHopeViewModel != null) {
                MutableLiveData<String> linkData = uploadSourceHopeViewModel.getLinkData();
                if (linkData != null) {
                    linkData.setValue(textString);
                }
            }
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f17208t = sparseIntArray;
        sparseIntArray.put(R.id.main_content, 6);
        sparseIntArray.put(R.id.rv_tags, 7);
        sparseIntArray.put(R.id.v_tip_link, 8);
        sparseIntArray.put(R.id.iv_link, 9);
    }

    public ActivityUploadSourceHopeBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 10, f17207s, f17208t));
    }

    private boolean i(MutableLiveData<String> mutableLiveData, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f17214r |= 2;
            }
            return true;
        }
        return false;
    }

    private boolean j(MutableLiveData<String> mutableLiveData, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f17214r |= 4;
            }
            return true;
        }
        return false;
    }

    private boolean k(MutableLiveData<String> mutableLiveData, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f17214r |= 1;
            }
            return true;
        }
        return false;
    }

    @Override // com.join.android.app.mgsim.wufun.generated.callback.a.InterfaceC0321a
    public final void a(int i4, View view) {
        if (i4 == 1) {
            UploadSourceHopeClickProxy uploadSourceHopeClickProxy = this.f17206l;
            if (uploadSourceHopeClickProxy != null) {
                uploadSourceHopeClickProxy.onBackClick();
            }
        } else if (i4 != 2) {
        } else {
            UploadSourceHopeClickProxy uploadSourceHopeClickProxy2 = this.f17206l;
            if (uploadSourceHopeClickProxy2 != null) {
                uploadSourceHopeClickProxy2.onUploadSourceClick();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0058  */
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
            long r2 = r1.f17214r     // Catch: java.lang.Throwable -> Lb6
            r4 = 0
            r1.f17214r = r4     // Catch: java.lang.Throwable -> Lb6
            monitor-exit(r18)     // Catch: java.lang.Throwable -> Lb6
            com.join.kotlin.quark.viewmodel.UploadSourceHopeViewModel r0 = r1.f17205k
            r6 = 47
            long r6 = r6 & r2
            r8 = 44
            r10 = 42
            r12 = 41
            r14 = 0
            int r15 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r15 == 0) goto L6f
            long r6 = r2 & r12
            int r15 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r15 == 0) goto L35
            if (r0 == 0) goto L27
            androidx.lifecycle.MutableLiveData r6 = r0.getTitle()
            goto L28
        L27:
            r6 = r14
        L28:
            r7 = 0
            r1.updateLiveDataRegistration(r7, r6)
            if (r6 == 0) goto L35
            java.lang.Object r6 = r6.getValue()
            java.lang.String r6 = (java.lang.String) r6
            goto L36
        L35:
            r6 = r14
        L36:
            long r15 = r2 & r10
            int r7 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            if (r7 == 0) goto L51
            if (r0 == 0) goto L43
            androidx.lifecycle.MutableLiveData r7 = r0.getDescData()
            goto L44
        L43:
            r7 = r14
        L44:
            r15 = 1
            r1.updateLiveDataRegistration(r15, r7)
            if (r7 == 0) goto L51
            java.lang.Object r7 = r7.getValue()
            java.lang.String r7 = (java.lang.String) r7
            goto L52
        L51:
            r7 = r14
        L52:
            long r15 = r2 & r8
            int r17 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            if (r17 == 0) goto L6d
            if (r0 == 0) goto L5f
            androidx.lifecycle.MutableLiveData r0 = r0.getLinkData()
            goto L60
        L5f:
            r0 = r14
        L60:
            r15 = 2
            r1.updateLiveDataRegistration(r15, r0)
            if (r0 == 0) goto L6d
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            goto L72
        L6d:
            r0 = r14
            goto L72
        L6f:
            r0 = r14
            r6 = r0
            r7 = r6
        L72:
            r15 = 32
            long r15 = r15 & r2
            int r17 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            if (r17 == 0) goto L95
            android.widget.ImageView r15 = r1.f17196b
            android.view.View$OnClickListener r12 = r1.f17211o
            r15.setOnClickListener(r12)
            android.widget.EditText r12 = r1.f17197c
            androidx.databinding.InverseBindingListener r13 = r1.f17212p
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r12, r14, r14, r14, r13)
            android.widget.EditText r12 = r1.f17198d
            androidx.databinding.InverseBindingListener r13 = r1.f17213q
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r12, r14, r14, r14, r13)
            android.widget.TextView r12 = r1.f17203i
            android.view.View$OnClickListener r13 = r1.f17210n
            r12.setOnClickListener(r13)
        L95:
            long r10 = r10 & r2
            int r12 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r12 == 0) goto L9f
            android.widget.EditText r10 = r1.f17197c
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r10, r7)
        L9f:
            long r8 = r8 & r2
            int r7 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r7 == 0) goto La9
            android.widget.EditText r7 = r1.f17198d
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r7, r0)
        La9:
            r7 = 41
            long r2 = r2 & r7
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto Lb5
            android.widget.TextView r0 = r1.f17202h
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r0, r6)
        Lb5:
            return
        Lb6:
            r0 = move-exception
            monitor-exit(r18)     // Catch: java.lang.Throwable -> Lb6
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.android.app.mgsim.wufun.databinding.ActivityUploadSourceHopeBindingImpl.executeBindings():void");
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ActivityUploadSourceHopeBinding
    public void g(@Nullable UploadSourceHopeClickProxy uploadSourceHopeClickProxy) {
        this.f17206l = uploadSourceHopeClickProxy;
        synchronized (this) {
            this.f17214r |= 16;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ActivityUploadSourceHopeBinding
    public void h(@Nullable UploadSourceHopeViewModel uploadSourceHopeViewModel) {
        this.f17205k = uploadSourceHopeViewModel;
        synchronized (this) {
            this.f17214r |= 8;
        }
        notifyPropertyChanged(36);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f17214r != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f17214r = 32L;
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
                return j((MutableLiveData) obj, i5);
            }
            return i((MutableLiveData) obj, i5);
        }
        return k((MutableLiveData) obj, i5);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i4, @Nullable Object obj) {
        if (36 == i4) {
            h((UploadSourceHopeViewModel) obj);
        } else if (7 != i4) {
            return false;
        } else {
            g((UploadSourceHopeClickProxy) obj);
        }
        return true;
    }

    private ActivityUploadSourceHopeBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 3, (ImageView) objArr[1], (EditText) objArr[3], (EditText) objArr[4], (ImageView) objArr[9], (NestedScrollView) objArr[6], (RecyclerView) objArr[7], (TextView) objArr[2], (TextView) objArr[5], (LinearLayout) objArr[8]);
        this.f17212p = new a();
        this.f17213q = new b();
        this.f17214r = -1L;
        this.f17196b.setTag(null);
        this.f17197c.setTag(null);
        this.f17198d.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f17209m = linearLayout;
        linearLayout.setTag(null);
        this.f17202h.setTag(null);
        this.f17203i.setTag(null);
        setRootTag(view);
        this.f17210n = new com.join.android.app.mgsim.wufun.generated.callback.a(this, 2);
        this.f17211o = new com.join.android.app.mgsim.wufun.generated.callback.a(this, 1);
        invalidateAll();
    }
}
