package com.join.android.app.mgsim.wufun.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.InverseBindingListener;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.lifecycle.MutableLiveData;
import com.join.android.app.mgsim.wufun.generated.callback.a;
import com.join.kotlin.ui.account.viewmodle.UnbindViewModle;
import com.join.kotlin.ui.notice.ClickProxy;
/* loaded from: classes3.dex */
public class UnbindThridpartActivityBindingImpl extends UnbindThridpartActivityBinding implements a.InterfaceC0321a {
    @Nullable

    /* renamed from: q  reason: collision with root package name */
    private static final ViewDataBinding.IncludedLayouts f26802q = null;
    @Nullable

    /* renamed from: r  reason: collision with root package name */
    private static final SparseIntArray f26803r = null;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    private final LinearLayout f26804g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    private final TextView f26805h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    private final TextView f26806i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    private final EditText f26807j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    private final TextView f26808k;
    @Nullable

    /* renamed from: l  reason: collision with root package name */
    private final View.OnClickListener f26809l;
    @Nullable

    /* renamed from: m  reason: collision with root package name */
    private final View.OnClickListener f26810m;
    @Nullable

    /* renamed from: n  reason: collision with root package name */
    private final View.OnClickListener f26811n;

    /* renamed from: o  reason: collision with root package name */
    private InverseBindingListener f26812o;

    /* renamed from: p  reason: collision with root package name */
    private long f26813p;

    /* loaded from: classes3.dex */
    class a implements InverseBindingListener {
        a() {
        }

        @Override // androidx.databinding.InverseBindingListener
        public void onChange() {
            String textString = TextViewBindingAdapter.getTextString(UnbindThridpartActivityBindingImpl.this.f26807j);
            UnbindViewModle unbindViewModle = UnbindThridpartActivityBindingImpl.this.f26801f;
            if (unbindViewModle != null) {
                MutableLiveData<String> codeText = unbindViewModle.getCodeText();
                if (codeText != null) {
                    codeText.setValue(textString);
                }
            }
        }
    }

    public UnbindThridpartActivityBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 8, f26802q, f26803r));
    }

    private boolean j(MutableLiveData<String> mutableLiveData, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f26813p |= 16;
            }
            return true;
        }
        return false;
    }

    private boolean k(MutableLiveData<String> mutableLiveData, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f26813p |= 4;
            }
            return true;
        }
        return false;
    }

    private boolean l(MutableLiveData<String> mutableLiveData, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f26813p |= 32;
            }
            return true;
        }
        return false;
    }

    private boolean m(MutableLiveData<Integer> mutableLiveData, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f26813p |= 2;
            }
            return true;
        }
        return false;
    }

    private boolean n(MutableLiveData<String> mutableLiveData, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f26813p |= 1;
            }
            return true;
        }
        return false;
    }

    private boolean o(MutableLiveData<String> mutableLiveData, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f26813p |= 8;
            }
            return true;
        }
        return false;
    }

    @Override // com.join.android.app.mgsim.wufun.generated.callback.a.InterfaceC0321a
    public final void a(int i4, View view) {
        if (i4 == 1) {
            ClickProxy clickProxy = this.f26800e;
            if (clickProxy != null) {
                clickProxy.onClickBack();
            }
        } else if (i4 == 2) {
            UnbindViewModle unbindViewModle = this.f26801f;
            if (!(unbindViewModle != null) || view == null) {
                return;
            }
            view.getContext();
            unbindViewModle.sendsmsCode(view.getContext());
        } else if (i4 != 3) {
        } else {
            UnbindViewModle unbindViewModle2 = this.f26801f;
            if (!(unbindViewModle2 != null) || view == null) {
                return;
            }
            view.getContext();
            unbindViewModle2.sendUnbindThridPart(view.getContext());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00cd  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void executeBindings() {
        /*
            Method dump skipped, instructions count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.android.app.mgsim.wufun.databinding.UnbindThridpartActivityBindingImpl.executeBindings():void");
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.UnbindThridpartActivityBinding
    public void g(@Nullable ClickProxy clickProxy) {
        this.f26800e = clickProxy;
        synchronized (this) {
            this.f26813p |= 128;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.UnbindThridpartActivityBinding
    public void h(@Nullable UnbindViewModle unbindViewModle) {
        this.f26801f = unbindViewModle;
        synchronized (this) {
            this.f26813p |= 64;
        }
        notifyPropertyChanged(34);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f26813p != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f26813p = 256L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int i4, Object obj, int i5) {
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        if (i4 != 4) {
                            if (i4 != 5) {
                                return false;
                            }
                            return l((MutableLiveData) obj, i5);
                        }
                        return j((MutableLiveData) obj, i5);
                    }
                    return o((MutableLiveData) obj, i5);
                }
                return k((MutableLiveData) obj, i5);
            }
            return m((MutableLiveData) obj, i5);
        }
        return n((MutableLiveData) obj, i5);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i4, @Nullable Object obj) {
        if (34 == i4) {
            h((UnbindViewModle) obj);
        } else if (7 != i4) {
            return false;
        } else {
            g((ClickProxy) obj);
        }
        return true;
    }

    private UnbindThridpartActivityBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 6, (ImageView) objArr[1], (TextView) objArr[7], (TextView) objArr[2]);
        this.f26812o = new a();
        this.f26813p = -1L;
        this.f26797b.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f26804g = linearLayout;
        linearLayout.setTag(null);
        TextView textView = (TextView) objArr[3];
        this.f26805h = textView;
        textView.setTag(null);
        TextView textView2 = (TextView) objArr[4];
        this.f26806i = textView2;
        textView2.setTag(null);
        EditText editText = (EditText) objArr[5];
        this.f26807j = editText;
        editText.setTag(null);
        TextView textView3 = (TextView) objArr[6];
        this.f26808k = textView3;
        textView3.setTag(null);
        this.f26798c.setTag(null);
        this.f26799d.setTag(null);
        setRootTag(view);
        this.f26809l = new com.join.android.app.mgsim.wufun.generated.callback.a(this, 2);
        this.f26810m = new com.join.android.app.mgsim.wufun.generated.callback.a(this, 3);
        this.f26811n = new com.join.android.app.mgsim.wufun.generated.callback.a(this, 1);
        invalidateAll();
    }
}
