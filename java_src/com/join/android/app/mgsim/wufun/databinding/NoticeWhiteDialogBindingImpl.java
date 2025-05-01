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
public class NoticeWhiteDialogBindingImpl extends NoticeWhiteDialogBinding implements a.InterfaceC0321a {
    @Nullable

    /* renamed from: m  reason: collision with root package name */
    private static final ViewDataBinding.IncludedLayouts f25543m = null;
    @Nullable

    /* renamed from: n  reason: collision with root package name */
    private static final SparseIntArray f25544n;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    private final ConstraintLayout f25545g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    private final TextView f25546h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    private final TextView f25547i;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    private final View.OnClickListener f25548j;
    @Nullable

    /* renamed from: k  reason: collision with root package name */
    private final View.OnClickListener f25549k;

    /* renamed from: l  reason: collision with root package name */
    private long f25550l;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f25544n = sparseIntArray;
        sparseIntArray.put(R.id.main, 5);
    }

    public NoticeWhiteDialogBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 6, f25543m, f25544n));
    }

    private boolean i(MutableLiveData<DialogData> mutableLiveData, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f25550l |= 1;
            }
            return true;
        }
        return false;
    }

    @Override // com.join.android.app.mgsim.wufun.generated.callback.a.InterfaceC0321a
    public final void a(int i4, View view) {
        if (i4 == 1) {
            View.OnClickListener onClickListener = this.f25542f;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        } else if (i4 != 2) {
        } else {
            View.OnClickListener onClickListener2 = this.f25542f;
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
            j4 = this.f25550l;
            this.f25550l = 0L;
        }
        DelArchiveDialogViewModle delArchiveDialogViewModle = this.f25541e;
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
            this.f25538b.setOnClickListener(this.f25548j);
            this.f25540d.setOnClickListener(this.f25549k);
        }
        if ((j4 & 11) != 0) {
            this.f25538b.setVisibility(r9);
            TextViewBindingAdapter.setText(this.f25546h, str4);
            TextViewBindingAdapter.setText(this.f25547i, str);
            TextViewBindingAdapter.setText(this.f25540d, str2);
        }
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.NoticeWhiteDialogBinding
    public void g(@Nullable View.OnClickListener onClickListener) {
        this.f25542f = onClickListener;
        synchronized (this) {
            this.f25550l |= 4;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.NoticeWhiteDialogBinding
    public void h(@Nullable DelArchiveDialogViewModle delArchiveDialogViewModle) {
        this.f25541e = delArchiveDialogViewModle;
        synchronized (this) {
            this.f25550l |= 2;
        }
        notifyPropertyChanged(34);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f25550l != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f25550l = 8L;
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

    private NoticeWhiteDialogBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 1, (ImageView) objArr[4], (LinearLayout) objArr[5], (TextView) objArr[3]);
        this.f25550l = -1L;
        this.f25538b.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f25545g = constraintLayout;
        constraintLayout.setTag(null);
        TextView textView = (TextView) objArr[1];
        this.f25546h = textView;
        textView.setTag(null);
        TextView textView2 = (TextView) objArr[2];
        this.f25547i = textView2;
        textView2.setTag(null);
        this.f25540d.setTag(null);
        setRootTag(view);
        this.f25548j = new a(this, 2);
        this.f25549k = new a(this, 1);
        invalidateAll();
    }
}
