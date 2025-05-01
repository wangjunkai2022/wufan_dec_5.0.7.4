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
import androidx.recyclerview.widget.RecyclerView;
import com.join.android.app.component.xrecyclerview.XRecyclerView;
import com.join.android.app.mgsim.wufun.R;
import com.join.android.app.mgsim.wufun.generated.callback.a;
import com.join.kotlin.domain.common.LoadBindClickProxy;
import com.join.kotlin.domain.common.LoadBindindData;
import com.join.kotlin.ui.notice.ClickProxy;
import com.join.kotlin.ui.notice.NoticeViewModle;
import com.join.mgps.dto.BTActivityBean;
import java.util.ArrayList;
/* loaded from: classes3.dex */
public class ActivityNoticelistActivityBindingImpl extends ActivityNoticelistActivityBinding implements a.InterfaceC0321a {
    @Nullable

    /* renamed from: m  reason: collision with root package name */
    private static final ViewDataBinding.IncludedLayouts f16679m;
    @Nullable

    /* renamed from: n  reason: collision with root package name */
    private static final SparseIntArray f16680n;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    private final LinearLayout f16681i;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    private final BinddingLoadLayoutIncludeBinding f16682j;
    @Nullable

    /* renamed from: k  reason: collision with root package name */
    private final View.OnClickListener f16683k;

    /* renamed from: l  reason: collision with root package name */
    private long f16684l;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(5);
        f16679m = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"bindding_load_layout_include"}, new int[]{4}, new int[]{R.layout.bindding_load_layout_include});
        f16680n = null;
    }

    public ActivityNoticelistActivityBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 5, f16679m, f16680n));
    }

    private boolean m(MutableLiveData<LoadBindindData> mutableLiveData, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f16684l |= 1;
            }
            return true;
        }
        return false;
    }

    private boolean n(MutableLiveData<ArrayList<BTActivityBean>> mutableLiveData, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f16684l |= 2;
            }
            return true;
        }
        return false;
    }

    @Override // com.join.android.app.mgsim.wufun.generated.callback.a.InterfaceC0321a
    public final void a(int i4, View view) {
        ClickProxy clickProxy = this.f16677g;
        if (clickProxy != null) {
            clickProxy.onClickBack();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x006f  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void executeBindings() {
        /*
            Method dump skipped, instructions count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.android.app.mgsim.wufun.databinding.ActivityNoticelistActivityBindingImpl.executeBindings():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.f16684l != 0) {
                return true;
            }
            return this.f16682j.hasPendingBindings();
        }
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ActivityNoticelistActivityBinding
    public void i(@Nullable RecyclerView.Adapter adapter) {
        this.f16676f = adapter;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f16684l = 64L;
        }
        this.f16682j.invalidateAll();
        requestRebind();
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ActivityNoticelistActivityBinding
    public void j(@Nullable ClickProxy clickProxy) {
        this.f16677g = clickProxy;
        synchronized (this) {
            this.f16684l |= 32;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ActivityNoticelistActivityBinding
    public void k(@Nullable LoadBindClickProxy loadBindClickProxy) {
        this.f16678h = loadBindClickProxy;
        synchronized (this) {
            this.f16684l |= 4;
        }
        notifyPropertyChanged(21);
        super.requestRebind();
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ActivityNoticelistActivityBinding
    public void l(@Nullable NoticeViewModle noticeViewModle) {
        this.f16675e = noticeViewModle;
        synchronized (this) {
            this.f16684l |= 8;
        }
        notifyPropertyChanged(36);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int i4, Object obj, int i5) {
        if (i4 != 0) {
            if (i4 != 1) {
                return false;
            }
            return n((MutableLiveData) obj, i5);
        }
        return m((MutableLiveData) obj, i5);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.f16682j.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i4, @Nullable Object obj) {
        if (21 == i4) {
            k((LoadBindClickProxy) obj);
            return true;
        } else if (36 == i4) {
            l((NoticeViewModle) obj);
            return true;
        } else if (1 == i4) {
            i((RecyclerView.Adapter) obj);
            return true;
        } else if (7 == i4) {
            j((ClickProxy) obj);
            return true;
        } else {
            return false;
        }
    }

    private ActivityNoticelistActivityBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 2, (ImageView) objArr[1], (XRecyclerView) objArr[3], (TextView) objArr[2]);
        this.f16684l = -1L;
        this.f16672b.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f16681i = linearLayout;
        linearLayout.setTag(null);
        BinddingLoadLayoutIncludeBinding binddingLoadLayoutIncludeBinding = (BinddingLoadLayoutIncludeBinding) objArr[4];
        this.f16682j = binddingLoadLayoutIncludeBinding;
        setContainedBinding(binddingLoadLayoutIncludeBinding);
        this.f16673c.setTag(null);
        this.f16674d.setTag(null);
        setRootTag(view);
        this.f16683k = new a(this, 1);
        invalidateAll();
    }
}
