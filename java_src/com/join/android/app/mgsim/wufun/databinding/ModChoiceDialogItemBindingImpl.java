package com.join.android.app.mgsim.wufun.databinding;

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
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.ui.cloudarchive.data.ArchiveData;
/* loaded from: classes3.dex */
public class ModChoiceDialogItemBindingImpl extends ModChoiceDialogItemBinding {
    @Nullable

    /* renamed from: g  reason: collision with root package name */
    private static final ViewDataBinding.IncludedLayouts f24893g = null;
    @Nullable

    /* renamed from: h  reason: collision with root package name */
    private static final SparseIntArray f24894h = null;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    private final TextView f24895d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    private final TextView f24896e;

    /* renamed from: f  reason: collision with root package name */
    private long f24897f;

    public ModChoiceDialogItemBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 3, f24893g, f24894h));
    }

    @Override // androidx.databinding.ViewDataBinding
    protected void executeBindings() {
        long j4;
        String str;
        String str2;
        int i4;
        synchronized (this) {
            j4 = this.f24897f;
            this.f24897f = 0L;
        }
        ArchiveData archiveData = this.f24892c;
        long j5 = j4 & 3;
        Drawable drawable = null;
        if (j5 != 0) {
            if (archiveData != null) {
                i4 = archiveData.getCheckStatus();
                str2 = archiveData.getArchiveDesc();
                str = archiveData.getPlayTime();
            } else {
                str = null;
                str2 = null;
                i4 = 0;
            }
            boolean z4 = i4 == 1;
            if (j5 != 0) {
                j4 |= z4 ? 8L : 4L;
            }
            drawable = AppCompatResources.getDrawable(this.f24891b.getContext(), z4 ? R.drawable.app_blue_pressed : R.drawable.stroke_blue_radio10_butn);
        } else {
            str = null;
            str2 = null;
        }
        if ((j4 & 3) != 0) {
            ViewBindingAdapter.setBackground(this.f24891b, drawable);
            TextViewBindingAdapter.setText(this.f24895d, str2);
            TextViewBindingAdapter.setText(this.f24896e, str);
        }
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ModChoiceDialogItemBinding
    public void f(@Nullable ArchiveData archiveData) {
        this.f24892c = archiveData;
        synchronized (this) {
            this.f24897f |= 1;
        }
        notifyPropertyChanged(4);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f24897f != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f24897f = 2L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int i4, Object obj, int i5) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i4, @Nullable Object obj) {
        if (4 == i4) {
            f((ArchiveData) obj);
            return true;
        }
        return false;
    }

    private ModChoiceDialogItemBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (LinearLayout) objArr[0]);
        this.f24897f = -1L;
        this.f24891b.setTag(null);
        TextView textView = (TextView) objArr[1];
        this.f24895d = textView;
        textView.setTag(null);
        TextView textView2 = (TextView) objArr[2];
        this.f24896e = textView2;
        textView2.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
