package com.join.android.app.mgsim.wufun.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.CompoundButtonBindingAdapter;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.join.android.app.mgsim.wufun.generated.callback.a;
import com.join.kotlin.bindingadapter.ImageViewExtKt;
import com.join.kotlin.ui.endgame.adapter.ISlotAdapterListener;
import com.join.mgps.dto.ArchiveListBean;
/* loaded from: classes3.dex */
public class ItemEndGameSlotListBindingImpl extends ItemEndGameSlotListBinding implements a.InterfaceC0321a {
    @Nullable

    /* renamed from: n  reason: collision with root package name */
    private static final ViewDataBinding.IncludedLayouts f22087n = null;
    @Nullable

    /* renamed from: o  reason: collision with root package name */
    private static final SparseIntArray f22088o = null;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    private final LinearLayout f22089e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    private final ImageView f22090f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    private final ConstraintLayout f22091g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    private final TextView f22092h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    private final CheckBox f22093i;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    private final View.OnClickListener f22094j;
    @Nullable

    /* renamed from: k  reason: collision with root package name */
    private final View.OnClickListener f22095k;
    @Nullable

    /* renamed from: l  reason: collision with root package name */
    private final View.OnClickListener f22096l;

    /* renamed from: m  reason: collision with root package name */
    private long f22097m;

    public ItemEndGameSlotListBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 6, f22087n, f22088o));
    }

    @Override // com.join.android.app.mgsim.wufun.generated.callback.a.InterfaceC0321a
    public final void a(int i4, View view) {
        if (i4 == 1) {
            ArchiveListBean archiveListBean = this.f22085c;
            ISlotAdapterListener iSlotAdapterListener = this.f22086d;
            if (iSlotAdapterListener != null) {
                iSlotAdapterListener.onItemCheckedChanged(archiveListBean);
            }
        } else if (i4 == 2) {
            ArchiveListBean archiveListBean2 = this.f22085c;
            ISlotAdapterListener iSlotAdapterListener2 = this.f22086d;
            if (iSlotAdapterListener2 != null) {
                iSlotAdapterListener2.onItemCheckedChanged(archiveListBean2);
            }
        } else if (i4 != 3) {
        } else {
            ArchiveListBean archiveListBean3 = this.f22085c;
            ISlotAdapterListener iSlotAdapterListener3 = this.f22086d;
            if (iSlotAdapterListener3 != null) {
                iSlotAdapterListener3.onItemCheckedChanged(archiveListBean3);
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    protected void executeBindings() {
        long j4;
        String str;
        String str2;
        String str3;
        int i4;
        synchronized (this) {
            j4 = this.f22097m;
            this.f22097m = 0L;
        }
        ArchiveListBean archiveListBean = this.f22085c;
        long j5 = 5 & j4;
        String str4 = null;
        if (j5 != 0) {
            if (archiveListBean != null) {
                i4 = archiveListBean.getIsCheck();
                str = archiveListBean.getAddTime();
                str2 = archiveListBean.getArchiveName();
                str3 = archiveListBean.getArchiveCover();
            } else {
                str3 = null;
                str = null;
                str2 = null;
                i4 = 0;
            }
            r8 = i4 == 1;
            str4 = str3;
        } else {
            str = null;
            str2 = null;
        }
        if (j5 != 0) {
            ImageViewExtKt.loadUri(this.f22090f, str4);
            TextViewBindingAdapter.setText(this.f22092h, str2);
            CompoundButtonBindingAdapter.setChecked(this.f22093i, r8);
            TextViewBindingAdapter.setText(this.f22084b, str);
        }
        if ((j4 & 4) != 0) {
            this.f22090f.setOnClickListener(this.f22095k);
            this.f22091g.setOnClickListener(this.f22096l);
            this.f22093i.setOnClickListener(this.f22094j);
        }
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ItemEndGameSlotListBinding
    public void g(@Nullable ArchiveListBean archiveListBean) {
        this.f22085c = archiveListBean;
        synchronized (this) {
            this.f22097m |= 1;
        }
        notifyPropertyChanged(18);
        super.requestRebind();
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ItemEndGameSlotListBinding
    public void h(@Nullable ISlotAdapterListener iSlotAdapterListener) {
        this.f22086d = iSlotAdapterListener;
        synchronized (this) {
            this.f22097m |= 2;
        }
        notifyPropertyChanged(20);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f22097m != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f22097m = 4L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int i4, Object obj, int i5) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i4, @Nullable Object obj) {
        if (18 == i4) {
            g((ArchiveListBean) obj);
        } else if (20 != i4) {
            return false;
        } else {
            h((ISlotAdapterListener) obj);
        }
        return true;
    }

    private ItemEndGameSlotListBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (TextView) objArr[4]);
        this.f22097m = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f22089e = linearLayout;
        linearLayout.setTag(null);
        ImageView imageView = (ImageView) objArr[1];
        this.f22090f = imageView;
        imageView.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[2];
        this.f22091g = constraintLayout;
        constraintLayout.setTag(null);
        TextView textView = (TextView) objArr[3];
        this.f22092h = textView;
        textView.setTag(null);
        CheckBox checkBox = (CheckBox) objArr[5];
        this.f22093i = checkBox;
        checkBox.setTag(null);
        this.f22084b.setTag(null);
        setRootTag(view);
        this.f22094j = new a(this, 3);
        this.f22095k = new a(this, 1);
        this.f22096l = new a(this, 2);
        invalidateAll();
    }
}
