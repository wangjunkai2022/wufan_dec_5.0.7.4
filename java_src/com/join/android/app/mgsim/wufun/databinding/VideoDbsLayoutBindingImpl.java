package com.join.android.app.mgsim.wufun.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.component.video.c;
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.bindingadapter.ViewBindingVideoFramlayoutKt;
import com.join.kotlin.ui.modleregin.modle.VideoModle;
import com.join.mgps.Util.IntentDateBean;
/* loaded from: classes3.dex */
public class VideoDbsLayoutBindingImpl extends VideoDbsLayoutBinding {
    @Nullable

    /* renamed from: i  reason: collision with root package name */
    private static final ViewDataBinding.IncludedLayouts f26901i = null;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    private static final SparseIntArray f26902j;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    private final RelativeLayout f26903g;

    /* renamed from: h  reason: collision with root package name */
    private long f26904h;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f26902j = sparseIntArray;
        sparseIntArray.put(R.id.loading, 3);
    }

    public VideoDbsLayoutBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 4, f26901i, f26902j));
    }

    @Override // androidx.databinding.ViewDataBinding
    protected void executeBindings() {
        long j4;
        String str;
        synchronized (this) {
            j4 = this.f26904h;
            this.f26904h = 0L;
        }
        int i4 = 0;
        VideoModle videoModle = this.f26900f;
        c cVar = this.f26899e;
        long j5 = j4 & 7;
        IntentDateBean intentDateBean = null;
        if (j5 == 0 || videoModle == null) {
            str = null;
        } else {
            i4 = videoModle.getPosition();
            str = videoModle.getVideoCover();
            intentDateBean = videoModle.getIntentData();
        }
        if (j5 != 0) {
            ViewBindingVideoFramlayoutKt.setvideoTag(this.f26896b, i4, cVar, intentDateBean, str);
            ViewBindingVideoFramlayoutKt.loadVideoUrl(this.f26898d, videoModle, cVar, intentDateBean);
        }
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.VideoDbsLayoutBinding
    public void g(@Nullable VideoModle videoModle) {
        this.f26900f = videoModle;
        synchronized (this) {
            this.f26904h |= 1;
        }
        notifyPropertyChanged(9);
        super.requestRebind();
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.VideoDbsLayoutBinding
    public void h(@Nullable c cVar) {
        this.f26899e = cVar;
        synchronized (this) {
            this.f26904h |= 2;
        }
        notifyPropertyChanged(33);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f26904h != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f26904h = 4L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int i4, Object obj, int i5) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i4, @Nullable Object obj) {
        if (9 == i4) {
            g((VideoModle) obj);
        } else if (33 != i4) {
            return false;
        } else {
            h((c) obj);
        }
        return true;
    }

    private VideoDbsLayoutBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (SimpleDraweeView) objArr[2], (SimpleDraweeView) objArr[3], (FrameLayout) objArr[1]);
        this.f26904h = -1L;
        this.f26896b.setTag(null);
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.f26903g = relativeLayout;
        relativeLayout.setTag(null);
        this.f26898d.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
