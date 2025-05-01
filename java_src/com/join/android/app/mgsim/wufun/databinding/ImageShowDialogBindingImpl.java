package com.join.android.app.mgsim.wufun.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.MutableLiveData;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.generated.callback.a;
import com.join.kotlin.ui.cloudarchive.dialog.ImageDialogViewmodle;
/* loaded from: classes3.dex */
public class ImageShowDialogBindingImpl extends ImageShowDialogBinding implements a.InterfaceC0321a {
    @Nullable

    /* renamed from: n  reason: collision with root package name */
    private static final ViewDataBinding.IncludedLayouts f21505n = null;
    @Nullable

    /* renamed from: o  reason: collision with root package name */
    private static final SparseIntArray f21506o = null;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    private final ConstraintLayout f21507j;
    @Nullable

    /* renamed from: k  reason: collision with root package name */
    private final View.OnClickListener f21508k;
    @Nullable

    /* renamed from: l  reason: collision with root package name */
    private final View.OnClickListener f21509l;

    /* renamed from: m  reason: collision with root package name */
    private long f21510m;

    public ImageShowDialogBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 7, f21505n, f21506o));
    }

    private boolean i(MutableLiveData<String> mutableLiveData, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f21510m |= 1;
            }
            return true;
        }
        return false;
    }

    private boolean j(MutableLiveData<Integer> mutableLiveData, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f21510m |= 2;
            }
            return true;
        }
        return false;
    }

    @Override // com.join.android.app.mgsim.wufun.generated.callback.a.InterfaceC0321a
    public final void a(int i4, View view) {
        if (i4 == 1) {
            View.OnClickListener onClickListener = this.f21504i;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        } else if (i4 != 2) {
        } else {
            View.OnClickListener onClickListener2 = this.f21504i;
            if (onClickListener2 != null) {
                onClickListener2.onClick(view);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void executeBindings() {
        /*
            Method dump skipped, instructions count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.android.app.mgsim.wufun.databinding.ImageShowDialogBindingImpl.executeBindings():void");
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ImageShowDialogBinding
    public void g(@Nullable View.OnClickListener onClickListener) {
        this.f21504i = onClickListener;
        synchronized (this) {
            this.f21510m |= 8;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ImageShowDialogBinding
    public void h(@Nullable ImageDialogViewmodle imageDialogViewmodle) {
        this.f21503h = imageDialogViewmodle;
        synchronized (this) {
            this.f21510m |= 4;
        }
        notifyPropertyChanged(34);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f21510m != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f21510m = 16L;
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
        if (34 == i4) {
            h((ImageDialogViewmodle) obj);
        } else if (7 != i4) {
            return false;
        } else {
            g((View.OnClickListener) obj);
        }
        return true;
    }

    private ImageShowDialogBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 2, (ImageView) objArr[5], (ImageView) objArr[6], (SimpleDraweeView) objArr[2], (SimpleDraweeView) objArr[4], (LinearLayout) objArr[1], (FrameLayout) objArr[3]);
        this.f21510m = -1L;
        this.f21497b.setTag(null);
        this.f21498c.setTag(null);
        this.f21499d.setTag(null);
        this.f21500e.setTag(null);
        this.f21501f.setTag(null);
        this.f21502g.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f21507j = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        this.f21508k = new a(this, 2);
        this.f21509l = new a(this, 1);
        invalidateAll();
    }
}
