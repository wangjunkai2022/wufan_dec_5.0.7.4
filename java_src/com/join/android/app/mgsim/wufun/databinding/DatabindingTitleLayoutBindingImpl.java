package com.join.android.app.mgsim.wufun.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.join.android.app.mgsim.wufun.generated.callback.a;
import com.join.kotlin.ui.modleregin.modle.TitleModle;
/* loaded from: classes3.dex */
public class DatabindingTitleLayoutBindingImpl extends DatabindingTitleLayoutBinding implements a.InterfaceC0321a {
    @Nullable

    /* renamed from: k  reason: collision with root package name */
    private static final ViewDataBinding.IncludedLayouts f18346k = null;
    @Nullable

    /* renamed from: l  reason: collision with root package name */
    private static final SparseIntArray f18347l = null;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    private final ConstraintLayout f18348h;
    @Nullable

    /* renamed from: i  reason: collision with root package name */
    private final View.OnClickListener f18349i;

    /* renamed from: j  reason: collision with root package name */
    private long f18350j;

    public DatabindingTitleLayoutBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 4, f18346k, f18347l));
    }

    @Override // com.join.android.app.mgsim.wufun.generated.callback.a.InterfaceC0321a
    public final void a(int i4, View view) {
        View.OnClickListener onClickListener = this.f18344f;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00bf, code lost:
        if (r17 != false) goto L55;
     */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void executeBindings() {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.android.app.mgsim.wufun.databinding.DatabindingTitleLayoutBindingImpl.executeBindings():void");
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.DatabindingTitleLayoutBinding
    public void h(@Nullable View.OnClickListener onClickListener) {
        this.f18344f = onClickListener;
        synchronized (this) {
            this.f18350j |= 4;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f18350j != 0;
        }
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.DatabindingTitleLayoutBinding
    public void i(@Nullable TitleModle titleModle) {
        this.f18345g = titleModle;
        synchronized (this) {
            this.f18350j |= 2;
        }
        notifyPropertyChanged(9);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f18350j = 8L;
        }
        requestRebind();
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.DatabindingTitleLayoutBinding
    public void j(@Nullable Boolean bool) {
        this.f18343e = bool;
        synchronized (this) {
            this.f18350j |= 1;
        }
        notifyPropertyChanged(17);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int i4, Object obj, int i5) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i4, @Nullable Object obj) {
        if (17 == i4) {
            j((Boolean) obj);
        } else if (9 == i4) {
            i((TitleModle) obj);
        } else if (7 != i4) {
            return false;
        } else {
            h((View.OnClickListener) obj);
        }
        return true;
    }

    private DatabindingTitleLayoutBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (TextView) objArr[3], (TextView) objArr[2], (TextView) objArr[1]);
        this.f18350j = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f18348h = constraintLayout;
        constraintLayout.setTag(null);
        this.f18340b.setTag(null);
        this.f18341c.setTag(null);
        this.f18342d.setTag(null);
        setRootTag(view);
        this.f18349i = new a(this, 1);
        invalidateAll();
    }
}
