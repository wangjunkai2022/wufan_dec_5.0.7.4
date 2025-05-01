package com.join.android.app.mgsim.wufun.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.lifecycle.MutableLiveData;
import com.facebook.drawee.view.SimpleDraweeView;
import com.google.android.material.textfield.TextInputEditText;
import com.join.android.app.mgsim.wufun.generated.callback.a;
import com.join.kotlin.ui.cloudarchive.ModUploadArchiveViewModle;
import com.join.kotlin.ui.cloudarchive.data.ArchiveData;
import java.util.List;
/* loaded from: classes3.dex */
public class ModUploadArchiveActivityBindingImpl extends ModUploadArchiveActivityBinding implements a.InterfaceC0321a {
    @Nullable

    /* renamed from: y  reason: collision with root package name */
    private static final ViewDataBinding.IncludedLayouts f24983y = null;
    @Nullable

    /* renamed from: z  reason: collision with root package name */
    private static final SparseIntArray f24984z = null;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    private final LinearLayout f24985m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    private final TextView f24986n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    private final TextView f24987o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    private final TextView f24988p;
    @NonNull

    /* renamed from: q  reason: collision with root package name */
    private final ImageView f24989q;
    @NonNull

    /* renamed from: r  reason: collision with root package name */
    private final RelativeLayout f24990r;
    @Nullable

    /* renamed from: s  reason: collision with root package name */
    private final View.OnClickListener f24991s;
    @Nullable

    /* renamed from: t  reason: collision with root package name */
    private final View.OnClickListener f24992t;
    @Nullable

    /* renamed from: u  reason: collision with root package name */
    private final View.OnClickListener f24993u;
    @Nullable

    /* renamed from: v  reason: collision with root package name */
    private final View.OnClickListener f24994v;
    @Nullable

    /* renamed from: w  reason: collision with root package name */
    private final View.OnClickListener f24995w;

    /* renamed from: x  reason: collision with root package name */
    private long f24996x;

    public ModUploadArchiveActivityBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 13, f24983y, f24984z));
    }

    private boolean m(MutableLiveData<ArchiveData> mutableLiveData, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f24996x |= 8;
            }
            return true;
        }
        return false;
    }

    private boolean n(MutableLiveData<List<ArchiveData>> mutableLiveData, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f24996x |= 2;
            }
            return true;
        }
        return false;
    }

    private boolean o(MutableLiveData<String> mutableLiveData, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f24996x |= 1;
            }
            return true;
        }
        return false;
    }

    private boolean p(MutableLiveData<String> mutableLiveData, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f24996x |= 4;
            }
            return true;
        }
        return false;
    }

    @Override // com.join.android.app.mgsim.wufun.generated.callback.a.InterfaceC0321a
    public final void a(int i4, View view) {
        if (i4 == 1) {
            View.OnClickListener onClickListener = this.f24980j;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        } else if (i4 == 2) {
            View.OnClickListener onClickListener2 = this.f24980j;
            if (onClickListener2 != null) {
                onClickListener2.onClick(view);
            }
        } else if (i4 == 3) {
            View.OnClickListener onClickListener3 = this.f24980j;
            if (onClickListener3 != null) {
                onClickListener3.onClick(view);
            }
        } else if (i4 == 4) {
            View.OnClickListener onClickListener4 = this.f24980j;
            if (onClickListener4 != null) {
                onClickListener4.onClick(view);
            }
        } else if (i4 != 5) {
        } else {
            View.OnClickListener onClickListener5 = this.f24980j;
            if (onClickListener5 != null) {
                onClickListener5.onClick(view);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00a6, code lost:
        if (r11 != false) goto L98;
     */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d0  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void executeBindings() {
        /*
            Method dump skipped, instructions count: 381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.android.app.mgsim.wufun.databinding.ModUploadArchiveActivityBindingImpl.executeBindings():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f24996x != 0;
        }
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ModUploadArchiveActivityBinding
    public void i(@Nullable TextViewBindingAdapter.OnTextChanged onTextChanged) {
        this.f24981k = onTextChanged;
        synchronized (this) {
            this.f24996x |= 32;
        }
        notifyPropertyChanged(2);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f24996x = 256L;
        }
        requestRebind();
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ModUploadArchiveActivityBinding
    public void j(@Nullable TextViewBindingAdapter.BeforeTextChanged beforeTextChanged) {
        this.f24982l = beforeTextChanged;
        synchronized (this) {
            this.f24996x |= 16;
        }
        notifyPropertyChanged(5);
        super.requestRebind();
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ModUploadArchiveActivityBinding
    public void k(@Nullable View.OnClickListener onClickListener) {
        this.f24980j = onClickListener;
        synchronized (this) {
            this.f24996x |= 64;
        }
        notifyPropertyChanged(23);
        super.requestRebind();
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ModUploadArchiveActivityBinding
    public void l(@Nullable ModUploadArchiveViewModle modUploadArchiveViewModle) {
        this.f24979i = modUploadArchiveViewModle;
        synchronized (this) {
            this.f24996x |= 128;
        }
        notifyPropertyChanged(34);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int i4, Object obj, int i5) {
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        return false;
                    }
                    return m((MutableLiveData) obj, i5);
                }
                return p((MutableLiveData) obj, i5);
            }
            return n((MutableLiveData) obj, i5);
        }
        return o((MutableLiveData) obj, i5);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i4, @Nullable Object obj) {
        if (5 == i4) {
            j((TextViewBindingAdapter.BeforeTextChanged) obj);
        } else if (2 == i4) {
            i((TextViewBindingAdapter.OnTextChanged) obj);
        } else if (23 == i4) {
            k((View.OnClickListener) obj);
        } else if (34 != i4) {
            return false;
        } else {
            l((ModUploadArchiveViewModle) obj);
        }
        return true;
    }

    private ModUploadArchiveActivityBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 4, (LinearLayout) objArr[4], (ImageView) objArr[1], (ImageView) objArr[12], (ImageView) objArr[11], (TextInputEditText) objArr[8], (TextView) objArr[3], (SimpleDraweeView) objArr[10]);
        this.f24996x = -1L;
        this.f24972b.setTag(null);
        this.f24973c.setTag(null);
        this.f24974d.setTag(null);
        this.f24975e.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f24985m = linearLayout;
        linearLayout.setTag(null);
        TextView textView = (TextView) objArr[2];
        this.f24986n = textView;
        textView.setTag(null);
        TextView textView2 = (TextView) objArr[5];
        this.f24987o = textView2;
        textView2.setTag(null);
        TextView textView3 = (TextView) objArr[6];
        this.f24988p = textView3;
        textView3.setTag(null);
        ImageView imageView = (ImageView) objArr[7];
        this.f24989q = imageView;
        imageView.setTag(null);
        RelativeLayout relativeLayout = (RelativeLayout) objArr[9];
        this.f24990r = relativeLayout;
        relativeLayout.setTag(null);
        this.f24976f.setTag(null);
        this.f24977g.setTag(null);
        this.f24978h.setTag(null);
        setRootTag(view);
        this.f24991s = new a(this, 4);
        this.f24992t = new a(this, 2);
        this.f24993u = new a(this, 1);
        this.f24994v = new a(this, 5);
        this.f24995w = new a(this, 3);
        invalidateAll();
    }
}
