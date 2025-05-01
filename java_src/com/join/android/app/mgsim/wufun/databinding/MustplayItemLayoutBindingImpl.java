package com.join.android.app.mgsim.wufun.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.lifecycle.LifecycleOwner;
import com.join.android.app.component.video.c;
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.bindingadapter.ViewBindingDownloadViewKt;
import com.join.kotlin.domain.widget.CornersLinearLayout;
import com.join.kotlin.ui.modleregin.modle.MustplayItemBean;
import com.join.kotlin.ui.modleregin.modle.VideoModle;
import com.join.mgps.business.CollectionBeanSubBusiness;
import com.join.mgps.customview.DownloadViewStroke;
import java.util.List;
/* loaded from: classes3.dex */
public class MustplayItemLayoutBindingImpl extends MustplayItemLayoutBinding {
    @Nullable

    /* renamed from: o  reason: collision with root package name */
    private static final ViewDataBinding.IncludedLayouts f25192o;
    @Nullable

    /* renamed from: p  reason: collision with root package name */
    private static final SparseIntArray f25193p;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    private final LinearLayout f25194l;
    @Nullable

    /* renamed from: m  reason: collision with root package name */
    private final VideoDbsLayoutBinding f25195m;

    /* renamed from: n  reason: collision with root package name */
    private long f25196n;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(9);
        f25192o = includedLayouts;
        includedLayouts.setIncludes(1, new String[]{"video_dbs_layout"}, new int[]{7}, new int[]{R.layout.video_dbs_layout});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f25193p = sparseIntArray;
        sparseIntArray.put(R.id.tag, 8);
    }

    public MustplayItemLayoutBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 9, f25192o, f25193p));
    }

    @Override // androidx.databinding.ViewDataBinding
    protected void executeBindings() {
        long j4;
        String str;
        List<String> list;
        String str2;
        int i4;
        int i5;
        boolean z4;
        boolean z5;
        CollectionBeanSubBusiness collectionBeanSubBusiness;
        String str3;
        List<String> list2;
        String str4;
        CollectionBeanSubBusiness collectionBeanSubBusiness2;
        long j5;
        long j6;
        long j7;
        long j8;
        synchronized (this) {
            j4 = this.f25196n;
            this.f25196n = 0L;
        }
        VideoModle videoModle = this.f25191k;
        MustplayItemBean mustplayItemBean = this.f25190j;
        c cVar = this.f25189i;
        long j9 = j4 & 10;
        if (j9 != 0) {
            if (mustplayItemBean != null) {
                list2 = mustplayItemBean.getTags();
                str4 = mustplayItemBean.getGameName();
                collectionBeanSubBusiness2 = mustplayItemBean.getGameinfo();
                str = mustplayItemBean.getInfo();
            } else {
                str = null;
                list2 = null;
                str4 = null;
                collectionBeanSubBusiness2 = null;
            }
            int size = list2 != null ? list2.size() : 0;
            z5 = size > 1;
            z4 = size > 0;
            if (j9 != 0) {
                if (z5) {
                    j7 = j4 | 128;
                    j8 = 512;
                } else {
                    j7 = j4 | 64;
                    j8 = 256;
                }
                j4 = j7 | j8;
            }
            if ((j4 & 10) != 0) {
                if (z4) {
                    j5 = j4 | 32;
                    j6 = 2048;
                } else {
                    j5 = j4 | 16;
                    j6 = 1024;
                }
                j4 = j5 | j6;
            }
            i5 = z5 ? 0 : 8;
            i4 = z4 ? 0 : 8;
            list = list2;
            str2 = str4;
            collectionBeanSubBusiness = collectionBeanSubBusiness2;
        } else {
            str = null;
            list = null;
            str2 = null;
            i4 = 0;
            i5 = 0;
            z4 = false;
            z5 = false;
            collectionBeanSubBusiness = null;
        }
        long j10 = j4 & 12;
        String str5 = ((128 & j4) == 0 || list == null) ? null : (String) ViewDataBinding.getFromList(list, 1);
        String str6 = ((2048 & j4) == 0 || list == null) ? null : (String) ViewDataBinding.getFromList(list, 0);
        long j11 = 10 & j4;
        if (j11 != 0) {
            if (!z5) {
                str5 = "";
            }
            if (!z4) {
                str6 = "";
            }
            str3 = str6;
        } else {
            str5 = null;
            str3 = null;
        }
        if (j11 != 0) {
            TextViewBindingAdapter.setText(this.f25182b, str3);
            this.f25182b.setVisibility(i4);
            TextViewBindingAdapter.setText(this.f25183c, str5);
            this.f25183c.setVisibility(i5);
            ViewBindingDownloadViewKt.downloadVIewBinding(this.f25184d, collectionBeanSubBusiness, 0);
            TextViewBindingAdapter.setText(this.f25185e, str2);
            TextViewBindingAdapter.setText(this.f25186f, str);
        }
        if (j10 != 0) {
            this.f25195m.h(cVar);
        }
        if ((j4 & 9) != 0) {
            this.f25195m.g(videoModle);
        }
        ViewDataBinding.executeBindingsOn(this.f25195m);
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.MustplayItemLayoutBinding
    public void h(@Nullable MustplayItemBean mustplayItemBean) {
        this.f25190j = mustplayItemBean;
        synchronized (this) {
            this.f25196n |= 2;
        }
        notifyPropertyChanged(9);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.f25196n != 0) {
                return true;
            }
            return this.f25195m.hasPendingBindings();
        }
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.MustplayItemLayoutBinding
    public void i(@Nullable VideoModle videoModle) {
        this.f25191k = videoModle;
        synchronized (this) {
            this.f25196n |= 1;
        }
        notifyPropertyChanged(32);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f25196n = 8L;
        }
        this.f25195m.invalidateAll();
        requestRebind();
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.MustplayItemLayoutBinding
    public void j(@Nullable c cVar) {
        this.f25189i = cVar;
        synchronized (this) {
            this.f25196n |= 4;
        }
        notifyPropertyChanged(33);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int i4, Object obj, int i5) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.f25195m.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i4, @Nullable Object obj) {
        if (32 == i4) {
            i((VideoModle) obj);
        } else if (9 == i4) {
            h((MustplayItemBean) obj);
        } else if (33 != i4) {
            return false;
        } else {
            j((c) obj);
        }
        return true;
    }

    private MustplayItemLayoutBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (TextView) objArr[2], (TextView) objArr[3], (DownloadViewStroke) objArr[6], (TextView) objArr[4], (TextView) objArr[5], (LinearLayout) objArr[8], (CornersLinearLayout) objArr[1]);
        this.f25196n = -1L;
        this.f25182b.setTag(null);
        this.f25183c.setTag(null);
        this.f25184d.setTag(null);
        this.f25185e.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f25194l = linearLayout;
        linearLayout.setTag(null);
        VideoDbsLayoutBinding videoDbsLayoutBinding = (VideoDbsLayoutBinding) objArr[7];
        this.f25195m = videoDbsLayoutBinding;
        setContainedBinding(videoDbsLayoutBinding);
        this.f25186f.setTag(null);
        this.f25188h.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
