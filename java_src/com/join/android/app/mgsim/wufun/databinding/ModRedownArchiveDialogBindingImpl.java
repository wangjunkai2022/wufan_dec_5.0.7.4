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
import androidx.lifecycle.MutableLiveData;
import com.join.android.app.mgsim.wufun.R;
import com.join.android.app.mgsim.wufun.generated.callback.a;
import com.join.kotlin.ui.cloudarchive.DelArchiveDialogViewModle;
import com.join.kotlin.ui.cloudarchive.data.ArchiveData;
import com.join.kotlin.ui.cloudarchive.dialog.DialogData;
/* loaded from: classes3.dex */
public class ModRedownArchiveDialogBindingImpl extends ModRedownArchiveDialogBinding implements a.InterfaceC0321a {
    @Nullable

    /* renamed from: r  reason: collision with root package name */
    private static final ViewDataBinding.IncludedLayouts f24955r = null;
    @Nullable

    /* renamed from: s  reason: collision with root package name */
    private static final SparseIntArray f24956s;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    private final ConstraintLayout f24957j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    private final TextView f24958k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    private final TextView f24959l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    private final TextView f24960m;
    @Nullable

    /* renamed from: n  reason: collision with root package name */
    private final View.OnClickListener f24961n;
    @Nullable

    /* renamed from: o  reason: collision with root package name */
    private final View.OnClickListener f24962o;
    @Nullable

    /* renamed from: p  reason: collision with root package name */
    private final View.OnClickListener f24963p;

    /* renamed from: q  reason: collision with root package name */
    private long f24964q;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f24956s = sparseIntArray;
        sparseIntArray.put(R.id.main, 8);
        sparseIntArray.put(R.id.radio, 9);
    }

    public ModRedownArchiveDialogBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 10, f24955r, f24956s));
    }

    private boolean i(MutableLiveData<ArchiveData> mutableLiveData, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f24964q |= 2;
            }
            return true;
        }
        return false;
    }

    private boolean j(MutableLiveData<DialogData> mutableLiveData, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f24964q |= 1;
            }
            return true;
        }
        return false;
    }

    @Override // com.join.android.app.mgsim.wufun.generated.callback.a.InterfaceC0321a
    public final void a(int i4, View view) {
        if (i4 == 1) {
            View.OnClickListener onClickListener = this.f24954i;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        } else if (i4 == 2) {
            View.OnClickListener onClickListener2 = this.f24954i;
            if (onClickListener2 != null) {
                onClickListener2.onClick(view);
            }
        } else if (i4 != 3) {
        } else {
            View.OnClickListener onClickListener3 = this.f24954i;
            if (onClickListener3 != null) {
                onClickListener3.onClick(view);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void executeBindings() {
        /*
            Method dump skipped, instructions count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.android.app.mgsim.wufun.databinding.ModRedownArchiveDialogBindingImpl.executeBindings():void");
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ModRedownArchiveDialogBinding
    public void g(@Nullable View.OnClickListener onClickListener) {
        this.f24954i = onClickListener;
        synchronized (this) {
            this.f24964q |= 8;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ModRedownArchiveDialogBinding
    public void h(@Nullable DelArchiveDialogViewModle delArchiveDialogViewModle) {
        this.f24953h = delArchiveDialogViewModle;
        synchronized (this) {
            this.f24964q |= 4;
        }
        notifyPropertyChanged(34);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f24964q != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f24964q = 16L;
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
        if (34 == i4) {
            h((DelArchiveDialogViewModle) obj);
        } else if (7 != i4) {
            return false;
        } else {
            g((View.OnClickListener) obj);
        }
        return true;
    }

    private ModRedownArchiveDialogBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 2, (TextView) objArr[5], (ImageView) objArr[7], (LinearLayout) objArr[8], (TextView) objArr[3], (TextView) objArr[6], (ImageView) objArr[9]);
        this.f24964q = -1L;
        this.f24947b.setTag(null);
        this.f24948c.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f24957j = constraintLayout;
        constraintLayout.setTag(null);
        TextView textView = (TextView) objArr[1];
        this.f24958k = textView;
        textView.setTag(null);
        TextView textView2 = (TextView) objArr[2];
        this.f24959l = textView2;
        textView2.setTag(null);
        TextView textView3 = (TextView) objArr[4];
        this.f24960m = textView3;
        textView3.setTag(null);
        this.f24950e.setTag(null);
        this.f24951f.setTag(null);
        setRootTag(view);
        this.f24961n = new a(this, 3);
        this.f24962o = new a(this, 1);
        this.f24963p = new a(this, 2);
        invalidateAll();
    }
}
