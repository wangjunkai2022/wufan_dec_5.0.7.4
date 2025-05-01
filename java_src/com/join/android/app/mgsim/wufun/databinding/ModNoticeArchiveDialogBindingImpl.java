package com.join.android.app.mgsim.wufun.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.lifecycle.MutableLiveData;
import com.join.android.app.mgsim.wufun.R;
import com.join.android.app.mgsim.wufun.generated.callback.a;
import com.join.kotlin.ui.cloudarchive.DelArchiveDialogViewModle;
import com.join.kotlin.ui.cloudarchive.dialog.DialogData;
/* loaded from: classes3.dex */
public class ModNoticeArchiveDialogBindingImpl extends ModNoticeArchiveDialogBinding implements a.InterfaceC0321a {
    @Nullable

    /* renamed from: m  reason: collision with root package name */
    private static final ViewDataBinding.IncludedLayouts f24938m = null;
    @Nullable

    /* renamed from: n  reason: collision with root package name */
    private static final SparseIntArray f24939n;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    private final ConstraintLayout f24940g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    private final TextView f24941h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    private final TextView f24942i;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    private final View.OnClickListener f24943j;
    @Nullable

    /* renamed from: k  reason: collision with root package name */
    private final View.OnClickListener f24944k;

    /* renamed from: l  reason: collision with root package name */
    private long f24945l;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f24939n = sparseIntArray;
        sparseIntArray.put(R.id.main, 5);
    }

    public ModNoticeArchiveDialogBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 6, f24938m, f24939n));
    }

    private boolean i(MutableLiveData<DialogData> mutableLiveData, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f24945l |= 1;
            }
            return true;
        }
        return false;
    }

    @Override // com.join.android.app.mgsim.wufun.generated.callback.a.InterfaceC0321a
    public final void a(int i4, View view) {
        if (i4 == 1) {
            View.OnClickListener onClickListener = this.f24937f;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        } else if (i4 != 2) {
        } else {
            View.OnClickListener onClickListener2 = this.f24937f;
            if (onClickListener2 != null) {
                onClickListener2.onClick(view);
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    protected void executeBindings() {
        long j4;
        String str;
        String str2;
        String str3;
        boolean z4;
        synchronized (this) {
            j4 = this.f24945l;
            this.f24945l = 0L;
        }
        DelArchiveDialogViewModle delArchiveDialogViewModle = this.f24936e;
        long j5 = j4 & 11;
        String str4 = null;
        if (j5 != 0) {
            MutableLiveData<DialogData> dialogData = delArchiveDialogViewModle != null ? delArchiveDialogViewModle.getDialogData() : null;
            updateLiveDataRegistration(0, dialogData);
            DialogData value = dialogData != null ? dialogData.getValue() : null;
            if (value != null) {
                str4 = value.getContent();
                z4 = value.getShowClose();
                str2 = value.getOkButn();
                str3 = value.getTitle();
            } else {
                str3 = null;
                str2 = null;
                z4 = false;
            }
            if (j5 != 0) {
                j4 |= z4 ? 32L : 16L;
            }
            r9 = z4 ? 0 : 8;
            String str5 = str4;
            str4 = str3;
            str = str5;
        } else {
            str = null;
            str2 = null;
        }
        if ((8 & j4) != 0) {
            this.f24933b.setOnClickListener(this.f24943j);
            this.f24935d.setOnClickListener(this.f24944k);
        }
        if ((j4 & 11) != 0) {
            this.f24933b.setVisibility(r9);
            TextViewBindingAdapter.setText(this.f24941h, str4);
            TextViewBindingAdapter.setText(this.f24942i, str);
            TextViewBindingAdapter.setText(this.f24935d, str2);
        }
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ModNoticeArchiveDialogBinding
    public void g(@Nullable View.OnClickListener onClickListener) {
        this.f24937f = onClickListener;
        synchronized (this) {
            this.f24945l |= 4;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ModNoticeArchiveDialogBinding
    public void h(@Nullable DelArchiveDialogViewModle delArchiveDialogViewModle) {
        this.f24936e = delArchiveDialogViewModle;
        synchronized (this) {
            this.f24945l |= 2;
        }
        notifyPropertyChanged(34);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f24945l != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f24945l = 8L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int i4, Object obj, int i5) {
        if (i4 != 0) {
            return false;
        }
        return i((MutableLiveData) obj, i5);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i4, @Nullable Object obj) {
        if (34 == i4) {
            h((DelArchiveDialogViewModle) obj);
        } else if (7 != i4) {
            return false;
        } else {
            g((View.OnClickListener) obj);
        }
        return true;
    }

    private ModNoticeArchiveDialogBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 1, (ImageView) objArr[4], (LinearLayout) objArr[5], (TextView) objArr[3]);
        this.f24945l = -1L;
        this.f24933b.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f24940g = constraintLayout;
        constraintLayout.setTag(null);
        TextView textView = (TextView) objArr[1];
        this.f24941h = textView;
        textView.setTag(null);
        TextView textView2 = (TextView) objArr[2];
        this.f24942i = textView2;
        textView2.setTag(null);
        this.f24935d.setTag(null);
        setRootTag(view);
        this.f24943j = new a(this, 2);
        this.f24944k = new a(this, 1);
        invalidateAll();
    }
}
