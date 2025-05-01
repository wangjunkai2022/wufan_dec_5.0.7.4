package com.join.android.app.mgsim.wufun.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.join.android.app.component.xrecyclerview.XRecyclerView;
import com.join.android.app.mgsim.wufun.generated.callback.a;
import com.join.kotlin.domain.common.LoadBindClickProxy;
import com.join.kotlin.domain.common.LoadBindindData;
import com.join.kotlin.ui.endgame.EndGameSlotViewModel;
import com.join.kotlin.ui.endgame.ISlotListener;
import com.join.mgps.dto.ArchiveListBean;
import java.util.List;
/* loaded from: classes3.dex */
public class ActivityEndGameSlotListBindingImpl extends ActivityEndGameSlotListBinding implements a.InterfaceC0321a {
    @Nullable

    /* renamed from: o  reason: collision with root package name */
    private static final ViewDataBinding.IncludedLayouts f16084o = null;
    @Nullable

    /* renamed from: p  reason: collision with root package name */
    private static final SparseIntArray f16085p = null;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    private final LinearLayout f16086k;
    @Nullable

    /* renamed from: l  reason: collision with root package name */
    private final View.OnClickListener f16087l;
    @Nullable

    /* renamed from: m  reason: collision with root package name */
    private final View.OnClickListener f16088m;

    /* renamed from: n  reason: collision with root package name */
    private long f16089n;

    public ActivityEndGameSlotListBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 6, f16084o, f16085p));
    }

    private boolean m(MutableLiveData<Boolean> mutableLiveData, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f16089n |= 8;
            }
            return true;
        }
        return false;
    }

    private boolean n(MutableLiveData<String> mutableLiveData, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f16089n |= 4;
            }
            return true;
        }
        return false;
    }

    private boolean o(MutableLiveData<List<ArchiveListBean>> mutableLiveData, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f16089n |= 2;
            }
            return true;
        }
        return false;
    }

    private boolean p(MutableLiveData<LoadBindindData> mutableLiveData, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f16089n |= 1;
            }
            return true;
        }
        return false;
    }

    @Override // com.join.android.app.mgsim.wufun.generated.callback.a.InterfaceC0321a
    public final void a(int i4, View view) {
        if (i4 == 1) {
            ISlotListener iSlotListener = this.f16083j;
            if (iSlotListener != null) {
                iSlotListener.onBack();
            }
        } else if (i4 != 2) {
        } else {
            ISlotListener iSlotListener2 = this.f16083j;
            if (iSlotListener2 != null) {
                iSlotListener2.onCommit();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ef  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void executeBindings() {
        /*
            Method dump skipped, instructions count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.android.app.mgsim.wufun.databinding.ActivityEndGameSlotListBindingImpl.executeBindings():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f16089n != 0;
        }
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ActivityEndGameSlotListBinding
    public void i(@Nullable RecyclerView.Adapter adapter) {
        this.f16081h = adapter;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f16089n = 256L;
        }
        requestRebind();
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ActivityEndGameSlotListBinding
    public void j(@Nullable ISlotListener iSlotListener) {
        this.f16083j = iSlotListener;
        synchronized (this) {
            this.f16089n |= 32;
        }
        notifyPropertyChanged(20);
        super.requestRebind();
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ActivityEndGameSlotListBinding
    public void k(@Nullable LoadBindClickProxy loadBindClickProxy) {
        this.f16082i = loadBindClickProxy;
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ActivityEndGameSlotListBinding
    public void l(@Nullable EndGameSlotViewModel endGameSlotViewModel) {
        this.f16080g = endGameSlotViewModel;
        synchronized (this) {
            this.f16089n |= 64;
        }
        notifyPropertyChanged(34);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int i4, Object obj, int i5) {
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        return false;
                    }
                    return m((MutableLiveData) obj, i5);
                }
                return n((MutableLiveData) obj, i5);
            }
            return o((MutableLiveData) obj, i5);
        }
        return p((MutableLiveData) obj, i5);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i4, @Nullable Object obj) {
        if (21 == i4) {
            k((LoadBindClickProxy) obj);
            return true;
        } else if (20 == i4) {
            j((ISlotListener) obj);
            return true;
        } else if (34 == i4) {
            l((EndGameSlotViewModel) obj);
            return true;
        } else if (1 == i4) {
            i((RecyclerView.Adapter) obj);
            return true;
        } else {
            return false;
        }
    }

    private ActivityEndGameSlotListBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 4, (ImageView) objArr[1], (LinearLayout) objArr[4], (XRecyclerView) objArr[5], (TextView) objArr[3], (TextView) objArr[2]);
        this.f16089n = -1L;
        this.f16075b.setTag(null);
        this.f16076c.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f16086k = linearLayout;
        linearLayout.setTag(null);
        this.f16077d.setTag(null);
        this.f16078e.setTag(null);
        this.f16079f.setTag(null);
        setRootTag(view);
        this.f16087l = new a(this, 1);
        this.f16088m = new a(this, 2);
        invalidateAll();
    }
}
