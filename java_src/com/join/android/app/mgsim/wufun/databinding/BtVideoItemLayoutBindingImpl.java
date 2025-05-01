package com.join.android.app.mgsim.wufun.databinding;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.databinding.adapters.ViewBindingAdapter;
import androidx.lifecycle.LifecycleOwner;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.component.video.c;
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.bindingadapter.SimpleDrawableViewKt;
import com.join.kotlin.bindingadapter.ViewBindingDownloadViewKt;
import com.join.kotlin.domain.widget.CornersLinearLayout;
import com.join.kotlin.ui.modleregin.modle.MustplayItemBean;
import com.join.kotlin.ui.modleregin.modle.VideoModle;
import com.join.mgps.business.CollectionBeanSubBusiness;
import com.join.mgps.customview.DownloadViewStroke;
/* loaded from: classes3.dex */
public class BtVideoItemLayoutBindingImpl extends BtVideoItemLayoutBinding {
    @Nullable

    /* renamed from: p  reason: collision with root package name */
    private static final ViewDataBinding.IncludedLayouts f17649p;
    @Nullable

    /* renamed from: q  reason: collision with root package name */
    private static final SparseIntArray f17650q;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    private final LinearLayout f17651l;
    @Nullable

    /* renamed from: m  reason: collision with root package name */
    private final VideoDbsLayoutBinding f17652m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    private final TextView f17653n;

    /* renamed from: o  reason: collision with root package name */
    private long f17654o;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(9);
        f17649p = includedLayouts;
        includedLayouts.setIncludes(1, new String[]{"video_dbs_layout"}, new int[]{7}, new int[]{R.layout.video_dbs_layout});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f17650q = sparseIntArray;
        sparseIntArray.put(R.id.tag, 8);
    }

    public BtVideoItemLayoutBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 9, f17649p, f17650q));
    }

    @Override // androidx.databinding.ViewDataBinding
    protected void executeBindings() {
        long j4;
        Drawable drawable;
        String str;
        String str2;
        String str3;
        CollectionBeanSubBusiness collectionBeanSubBusiness;
        int i4;
        String str4;
        String str5;
        String str6;
        String str7;
        CollectionBeanSubBusiness collectionBeanSubBusiness2;
        String str8;
        Context context;
        int i5;
        synchronized (this) {
            j4 = this.f17654o;
            this.f17654o = 0L;
        }
        VideoModle videoModle = this.f17648k;
        Boolean bool = this.f17645h;
        MustplayItemBean mustplayItemBean = this.f17647j;
        c cVar = this.f17646i;
        long j5 = j4 & 18;
        if (j5 != 0) {
            boolean safeUnbox = ViewDataBinding.safeUnbox(bool);
            if (j5 != 0) {
                j4 |= safeUnbox ? 64L : 32L;
            }
            if (safeUnbox) {
                context = this.f17651l.getContext();
                i5 = R.drawable.white;
            } else {
                context = this.f17651l.getContext();
                i5 = R.drawable.alph;
            }
            drawable = AppCompatResources.getDrawable(context, i5);
        } else {
            drawable = null;
        }
        long j6 = j4 & 20;
        if (j6 != 0) {
            if (mustplayItemBean != null) {
                String tip = mustplayItemBean.getTip();
                String gameName = mustplayItemBean.getGameName();
                collectionBeanSubBusiness2 = mustplayItemBean.getGameinfo();
                str6 = mustplayItemBean.getInfo();
                str7 = tip;
                str3 = gameName;
            } else {
                str6 = null;
                str7 = null;
                str3 = null;
                collectionBeanSubBusiness2 = null;
            }
            boolean z4 = str7 == "";
            if (j6 != 0) {
                j4 |= z4 ? 256L : 128L;
            }
            if (collectionBeanSubBusiness2 != null) {
                String gif_ico_remote = collectionBeanSubBusiness2.getGif_ico_remote();
                str4 = collectionBeanSubBusiness2.getIco_remote();
                str8 = gif_ico_remote;
            } else {
                str4 = null;
                str8 = null;
            }
            str5 = str7;
            i4 = z4 ? 8 : 0;
            collectionBeanSubBusiness = collectionBeanSubBusiness2;
            str2 = str6;
            str = str8;
        } else {
            str = null;
            str2 = null;
            str3 = null;
            collectionBeanSubBusiness = null;
            i4 = 0;
            str4 = null;
            str5 = null;
        }
        long j7 = j4 & 24;
        if ((20 & j4) != 0) {
            ViewBindingDownloadViewKt.downloadVIewBinding(this.f17639b, collectionBeanSubBusiness, 0);
            TextViewBindingAdapter.setText(this.f17640c, str3);
            SimpleDrawableViewKt.loadUrl(this.f17641d, str4, str, 0);
            TextViewBindingAdapter.setText(this.f17653n, str2);
            this.f17653n.setVisibility(i4);
            TextViewBindingAdapter.setText(this.f17642e, str5);
        }
        if ((18 & j4) != 0) {
            ViewBindingAdapter.setBackground(this.f17651l, drawable);
        }
        if (j7 != 0) {
            this.f17652m.h(cVar);
        }
        if ((j4 & 17) != 0) {
            this.f17652m.g(videoModle);
        }
        ViewDataBinding.executeBindingsOn(this.f17652m);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.f17654o != 0) {
                return true;
            }
            return this.f17652m.hasPendingBindings();
        }
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.BtVideoItemLayoutBinding
    public void i(@Nullable MustplayItemBean mustplayItemBean) {
        this.f17647j = mustplayItemBean;
        synchronized (this) {
            this.f17654o |= 4;
        }
        notifyPropertyChanged(9);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f17654o = 16L;
        }
        this.f17652m.invalidateAll();
        requestRebind();
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.BtVideoItemLayoutBinding
    public void j(@Nullable Boolean bool) {
        this.f17645h = bool;
        synchronized (this) {
            this.f17654o |= 2;
        }
        notifyPropertyChanged(17);
        super.requestRebind();
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.BtVideoItemLayoutBinding
    public void k(@Nullable VideoModle videoModle) {
        this.f17648k = videoModle;
        synchronized (this) {
            this.f17654o |= 1;
        }
        notifyPropertyChanged(32);
        super.requestRebind();
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.BtVideoItemLayoutBinding
    public void l(@Nullable c cVar) {
        this.f17646i = cVar;
        synchronized (this) {
            this.f17654o |= 8;
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
        this.f17652m.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i4, @Nullable Object obj) {
        if (32 == i4) {
            k((VideoModle) obj);
        } else if (17 == i4) {
            j((Boolean) obj);
        } else if (9 == i4) {
            i((MustplayItemBean) obj);
        } else if (33 != i4) {
            return false;
        } else {
            l((c) obj);
        }
        return true;
    }

    private BtVideoItemLayoutBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (DownloadViewStroke) objArr[6], (TextView) objArr[4], (SimpleDraweeView) objArr[3], (TextView) objArr[5], (LinearLayout) objArr[8], (CornersLinearLayout) objArr[1]);
        this.f17654o = -1L;
        this.f17639b.setTag(null);
        this.f17640c.setTag(null);
        this.f17641d.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f17651l = linearLayout;
        linearLayout.setTag(null);
        VideoDbsLayoutBinding videoDbsLayoutBinding = (VideoDbsLayoutBinding) objArr[7];
        this.f17652m = videoDbsLayoutBinding;
        setContainedBinding(videoDbsLayoutBinding);
        TextView textView = (TextView) objArr[2];
        this.f17653n = textView;
        textView.setTag(null);
        this.f17642e.setTag(null);
        this.f17644g.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
