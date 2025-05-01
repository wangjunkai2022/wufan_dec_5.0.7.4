package com.join.android.app.mgsim.wufun.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.join.android.app.component.xrecyclerview.XRecyclerView;
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.bindingadapter.ViewbindingRecycleviewAdapterKt;
import com.join.kotlin.domain.common.LoadBindClickProxy;
import com.join.kotlin.domain.common.LoadBindindData;
import com.join.kotlin.ui.cloudarchive.ModGameCloudViewModle;
import com.psk.kotlin.util.CommonListMainData;
import java.util.List;
/* loaded from: classes3.dex */
public class GameDetailModCloudListLayoutDatabindingBindingImpl extends GameDetailModCloudListLayoutDatabindingBinding {
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    private static final ViewDataBinding.IncludedLayouts f20289j;
    @Nullable

    /* renamed from: k  reason: collision with root package name */
    private static final SparseIntArray f20290k;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    private final RelativeLayout f20291g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    private final NestedScrollView f20292h;

    /* renamed from: i  reason: collision with root package name */
    private long f20293i;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(4);
        f20289j = includedLayouts;
        includedLayouts.setIncludes(1, new String[]{"bindding_load_layout_include"}, new int[]{3}, new int[]{R.layout.bindding_load_layout_include});
        f20290k = null;
    }

    public GameDetailModCloudListLayoutDatabindingBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 4, f20289j, f20290k));
    }

    private boolean k(BinddingLoadLayoutIncludeBinding binddingLoadLayoutIncludeBinding, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f20293i |= 1;
            }
            return true;
        }
        return false;
    }

    private boolean l(MutableLiveData<List<CommonListMainData>> mutableLiveData, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f20293i |= 4;
            }
            return true;
        }
        return false;
    }

    private boolean m(MutableLiveData<LoadBindindData> mutableLiveData, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f20293i |= 2;
            }
            return true;
        }
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    protected void executeBindings() {
        long j4;
        List<CommonListMainData> list;
        LoadBindindData loadBindindData;
        int i4;
        LoadBindindData loadBindindData2;
        synchronized (this) {
            j4 = this.f20293i;
            this.f20293i = 0L;
        }
        ModGameCloudViewModle modGameCloudViewModle = this.f20286d;
        LoadBindClickProxy loadBindClickProxy = this.f20288f;
        if ((78 & j4) != 0) {
            long j5 = j4 & 74;
            if (j5 != 0) {
                MutableLiveData<LoadBindindData> loadBindData = modGameCloudViewModle != null ? modGameCloudViewModle.getLoadBindData() : null;
                updateLiveDataRegistration(1, loadBindData);
                loadBindindData2 = loadBindData != null ? loadBindData.getValue() : null;
                boolean z4 = (loadBindindData2 != null ? loadBindindData2.getShowStatus() : 0) == 1;
                if (j5 != 0) {
                    j4 |= z4 ? 256L : 128L;
                }
                i4 = z4 ? 0 : 8;
            } else {
                i4 = 0;
                loadBindindData2 = null;
            }
            if ((j4 & 76) != 0) {
                MutableLiveData<List<CommonListMainData>> listArchive = modGameCloudViewModle != null ? modGameCloudViewModle.getListArchive() : null;
                updateLiveDataRegistration(2, listArchive);
                if (listArchive != null) {
                    list = listArchive.getValue();
                    loadBindindData = loadBindindData2;
                }
            }
            loadBindindData = loadBindindData2;
            list = null;
        } else {
            list = null;
            loadBindindData = null;
            i4 = 0;
        }
        long j6 = 80 & j4;
        if ((74 & j4) != 0) {
            this.f20284b.g(loadBindindData);
            this.f20285c.setVisibility(i4);
        }
        if (j6 != 0) {
            this.f20284b.h(loadBindClickProxy);
        }
        if ((j4 & 76) != 0) {
            ViewbindingRecycleviewAdapterKt.recycleviewdataBinding(this.f20285c, list);
        }
        ViewDataBinding.executeBindingsOn(this.f20284b);
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.GameDetailModCloudListLayoutDatabindingBinding
    public void h(@Nullable RecyclerView.Adapter adapter) {
        this.f20287e = adapter;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.f20293i != 0) {
                return true;
            }
            return this.f20284b.hasPendingBindings();
        }
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.GameDetailModCloudListLayoutDatabindingBinding
    public void i(@Nullable LoadBindClickProxy loadBindClickProxy) {
        this.f20288f = loadBindClickProxy;
        synchronized (this) {
            this.f20293i |= 16;
        }
        notifyPropertyChanged(21);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f20293i = 64L;
        }
        this.f20284b.invalidateAll();
        requestRebind();
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.GameDetailModCloudListLayoutDatabindingBinding
    public void j(@Nullable ModGameCloudViewModle modGameCloudViewModle) {
        this.f20286d = modGameCloudViewModle;
        synchronized (this) {
            this.f20293i |= 8;
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
                return l((MutableLiveData) obj, i5);
            }
            return m((MutableLiveData) obj, i5);
        }
        return k((BinddingLoadLayoutIncludeBinding) obj, i5);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.f20284b.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i4, @Nullable Object obj) {
        if (34 == i4) {
            j((ModGameCloudViewModle) obj);
            return true;
        } else if (21 == i4) {
            i((LoadBindClickProxy) obj);
            return true;
        } else if (1 == i4) {
            h((RecyclerView.Adapter) obj);
            return true;
        } else {
            return false;
        }
    }

    private GameDetailModCloudListLayoutDatabindingBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 3, (BinddingLoadLayoutIncludeBinding) objArr[3], (XRecyclerView) objArr[2]);
        this.f20293i = -1L;
        setContainedBinding(this.f20284b);
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.f20291g = relativeLayout;
        relativeLayout.setTag(null);
        NestedScrollView nestedScrollView = (NestedScrollView) objArr[1];
        this.f20292h = nestedScrollView;
        nestedScrollView.setTag(null);
        this.f20285c.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
