package com.join.android.app.mgsim.wufun.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.join.android.app.mgsim.wufun.R;
import com.join.android.app.mgsim.wufun.generated.callback.a;
import com.join.kotlin.domain.common.LoadBindClickProxy;
import com.join.kotlin.domain.common.LoadBindindData;
import com.join.mgps.customview.LoadingImageView;
/* loaded from: classes3.dex */
public class BinddingLoadLayoutIncludeBindingImpl extends BinddingLoadLayoutIncludeBinding implements a.InterfaceC0321a {
    @Nullable

    /* renamed from: u  reason: collision with root package name */
    private static final ViewDataBinding.IncludedLayouts f17553u = null;
    @Nullable

    /* renamed from: v  reason: collision with root package name */
    private static final SparseIntArray f17554v;
    @NonNull

    /* renamed from: q  reason: collision with root package name */
    private final RelativeLayout f17555q;
    @Nullable

    /* renamed from: r  reason: collision with root package name */
    private final View.OnClickListener f17556r;
    @Nullable

    /* renamed from: s  reason: collision with root package name */
    private final View.OnClickListener f17557s;

    /* renamed from: t  reason: collision with root package name */
    private long f17558t;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f17554v = sparseIntArray;
        sparseIntArray.put(R.id.loading_view, 6);
        sparseIntArray.put(R.id.textView2, 7);
        sparseIntArray.put(R.id.failedMessage, 8);
        sparseIntArray.put(R.id.lodingBackImage, 9);
        sparseIntArray.put(R.id.setting, 10);
        sparseIntArray.put(R.id.noneReloadImage, 11);
        sparseIntArray.put(R.id.noneMessage, 12);
        sparseIntArray.put(R.id.setAll, 13);
    }

    public BinddingLoadLayoutIncludeBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 14, f17553u, f17554v));
    }

    @Override // com.join.android.app.mgsim.wufun.generated.callback.a.InterfaceC0321a
    public final void a(int i4, View view) {
        if (i4 == 1) {
            LoadBindClickProxy loadBindClickProxy = this.f17552p;
            if (loadBindClickProxy != null) {
                loadBindClickProxy.onClickReload();
            }
        } else if (i4 != 2) {
        } else {
            LoadBindClickProxy loadBindClickProxy2 = this.f17552p;
            if (loadBindClickProxy2 != null) {
                loadBindClickProxy2.onClickSetNetWork();
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    protected void executeBindings() {
        long j4;
        int i4;
        int i5;
        synchronized (this) {
            j4 = this.f17558t;
            this.f17558t = 0L;
        }
        LoadBindindData loadBindindData = this.f17551o;
        long j5 = j4 & 6;
        if (j5 != 0) {
            int showStatus = loadBindindData != null ? loadBindindData.getShowStatus() : 0;
            boolean z4 = showStatus == 4;
            boolean z5 = showStatus == 2;
            boolean z6 = showStatus == 3;
            if (j5 != 0) {
                j4 |= z4 ? 16L : 8L;
            }
            if ((j4 & 6) != 0) {
                j4 |= z5 ? 256L : 128L;
            }
            if ((j4 & 6) != 0) {
                j4 |= z6 ? 64L : 32L;
            }
            int i6 = z4 ? 0 : 8;
            i5 = z5 ? 0 : 8;
            i4 = z6 ? 0 : 8;
            r9 = i6;
        } else {
            i4 = 0;
            i5 = 0;
        }
        if ((6 & j4) != 0) {
            this.f17539c.setVisibility(r9);
            this.f17542f.setVisibility(i4);
            this.f17543g.setVisibility(i5);
        }
        if ((j4 & 4) != 0) {
            this.f17546j.setOnClickListener(this.f17557s);
            this.f17548l.setOnClickListener(this.f17556r);
        }
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.BinddingLoadLayoutIncludeBinding
    public void g(@Nullable LoadBindindData loadBindindData) {
        this.f17551o = loadBindindData;
        synchronized (this) {
            this.f17558t |= 2;
        }
        notifyPropertyChanged(6);
        super.requestRebind();
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.BinddingLoadLayoutIncludeBinding
    public void h(@Nullable LoadBindClickProxy loadBindClickProxy) {
        this.f17552p = loadBindClickProxy;
        synchronized (this) {
            this.f17558t |= 1;
        }
        notifyPropertyChanged(21);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f17558t != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f17558t = 4L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int i4, Object obj, int i5) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i4, @Nullable Object obj) {
        if (21 == i4) {
            h((LoadBindClickProxy) obj);
        } else if (6 != i4) {
            return false;
        } else {
            g((LoadBindindData) obj);
        }
        return true;
    }

    private BinddingLoadLayoutIncludeBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (TextView) objArr[8], (LinearLayout) objArr[5], (LoadingImageView) objArr[6], (ImageView) objArr[9], (LinearLayout) objArr[2], (LinearLayout) objArr[1], (TextView) objArr[12], (ImageView) objArr[11], (ImageView) objArr[3], (TextView) objArr[13], (Button) objArr[4], (TextView) objArr[10], (TextView) objArr[7]);
        this.f17558t = -1L;
        this.f17539c.setTag(null);
        this.f17542f.setTag(null);
        this.f17543g.setTag(null);
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.f17555q = relativeLayout;
        relativeLayout.setTag(null);
        this.f17546j.setTag(null);
        this.f17548l.setTag(null);
        setRootTag(view);
        this.f17556r = new a(this, 2);
        this.f17557s = new a(this, 1);
        invalidateAll();
    }
}
