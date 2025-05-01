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
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.join.android.app.component.xrecyclerview.XRecyclerView;
import com.join.android.app.mgsim.wufun.R;
import com.join.android.app.mgsim.wufun.generated.callback.a;
import com.join.kotlin.domain.adapter.BaseDataBindingAdapter;
import com.join.kotlin.domain.common.LoadBindClickProxy;
import com.join.kotlin.domain.common.LoadBindindData;
import com.join.kotlin.ui.modleregin.modle.MustplayItemBean;
import com.join.kotlin.ui.modleregin.viewModle.MustPlayViewModle;
import com.join.kotlin.ui.notice.ClickProxy;
import java.util.List;
/* loaded from: classes3.dex */
public class MustplayReginActivityBindingImpl extends MustplayReginActivityBinding implements a.InterfaceC0321a {
    @Nullable

    /* renamed from: n  reason: collision with root package name */
    private static final ViewDataBinding.IncludedLayouts f25205n;
    @Nullable

    /* renamed from: o  reason: collision with root package name */
    private static final SparseIntArray f25206o;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    private final LinearLayout f25207j;
    @Nullable

    /* renamed from: k  reason: collision with root package name */
    private final BinddingLoadLayoutIncludeBinding f25208k;
    @Nullable

    /* renamed from: l  reason: collision with root package name */
    private final View.OnClickListener f25209l;

    /* renamed from: m  reason: collision with root package name */
    private long f25210m;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(5);
        f25205n = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"bindding_load_layout_include"}, new int[]{4}, new int[]{R.layout.bindding_load_layout_include});
        f25206o = null;
    }

    public MustplayReginActivityBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 5, f25205n, f25206o));
    }

    private boolean o(MutableLiveData<LoadBindindData> mutableLiveData, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f25210m |= 2;
            }
            return true;
        }
        return false;
    }

    private boolean p(MutableLiveData<Integer> mutableLiveData, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f25210m |= 1;
            }
            return true;
        }
        return false;
    }

    private boolean q(MutableLiveData<List<MustplayItemBean>> mutableLiveData, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f25210m |= 4;
            }
            return true;
        }
        return false;
    }

    @Override // com.join.android.app.mgsim.wufun.generated.callback.a.InterfaceC0321a
    public final void a(int i4, View view) {
        ClickProxy clickProxy = this.f25202g;
        if (clickProxy != null) {
            clickProxy.onClickBack();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008f  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void executeBindings() {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.android.app.mgsim.wufun.databinding.MustplayReginActivityBindingImpl.executeBindings():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.f25210m != 0) {
                return true;
            }
            return this.f25208k.hasPendingBindings();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f25210m = 256L;
        }
        this.f25208k.invalidateAll();
        requestRebind();
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.MustplayReginActivityBinding
    public void j(@Nullable BaseDataBindingAdapter<Object, ViewDataBinding> baseDataBindingAdapter) {
        this.f25201f = baseDataBindingAdapter;
        synchronized (this) {
            this.f25210m |= 64;
        }
        notifyPropertyChanged(1);
        super.requestRebind();
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.MustplayReginActivityBinding
    public void k(@Nullable ClickProxy clickProxy) {
        this.f25202g = clickProxy;
        synchronized (this) {
            this.f25210m |= 128;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.MustplayReginActivityBinding
    public void l(@Nullable LoadBindClickProxy loadBindClickProxy) {
        this.f25203h = loadBindClickProxy;
        synchronized (this) {
            this.f25210m |= 8;
        }
        notifyPropertyChanged(21);
        super.requestRebind();
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.MustplayReginActivityBinding
    public void m(@Nullable XRecyclerView.f fVar) {
        this.f25204i = fVar;
        synchronized (this) {
            this.f25210m |= 32;
        }
        notifyPropertyChanged(29);
        super.requestRebind();
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.MustplayReginActivityBinding
    public void n(@Nullable MustPlayViewModle mustPlayViewModle) {
        this.f25200e = mustPlayViewModle;
        synchronized (this) {
            this.f25210m |= 16;
        }
        notifyPropertyChanged(34);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int i4, Object obj, int i5) {
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    return false;
                }
                return q((MutableLiveData) obj, i5);
            }
            return o((MutableLiveData) obj, i5);
        }
        return p((MutableLiveData) obj, i5);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.f25208k.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i4, @Nullable Object obj) {
        if (21 == i4) {
            l((LoadBindClickProxy) obj);
            return true;
        } else if (34 == i4) {
            n((MustPlayViewModle) obj);
            return true;
        } else if (29 == i4) {
            m((XRecyclerView.f) obj);
            return true;
        } else if (1 == i4) {
            j((BaseDataBindingAdapter) obj);
            return true;
        } else if (7 == i4) {
            k((ClickProxy) obj);
            return true;
        } else {
            return false;
        }
    }

    private MustplayReginActivityBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 3, (ImageView) objArr[1], (XRecyclerView) objArr[3], (TextView) objArr[2]);
        this.f25210m = -1L;
        this.f25197b.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f25207j = linearLayout;
        linearLayout.setTag(null);
        BinddingLoadLayoutIncludeBinding binddingLoadLayoutIncludeBinding = (BinddingLoadLayoutIncludeBinding) objArr[4];
        this.f25208k = binddingLoadLayoutIncludeBinding;
        setContainedBinding(binddingLoadLayoutIncludeBinding);
        this.f25198c.setTag(null);
        this.f25199d.setTag(null);
        setRootTag(view);
        this.f25209l = new a(this, 1);
        invalidateAll();
    }
}
