package com.join.android.app.mgsim.wufun.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.MutableLiveData;
import com.join.android.app.mgsim.wufun.R;
import com.join.android.app.mgsim.wufun.generated.callback.a;
import com.join.kotlin.base.widget.recycleview.XQuickRecyclerView;
import com.join.kotlin.discount.proxy.GameDetailCommentListClickProxy;
import com.join.kotlin.discount.viewmodel.GameDetailCommentListViewModel;
/* loaded from: classes3.dex */
public class FragmentGameDetailCommentListBindingImpl extends FragmentGameDetailCommentListBinding implements a.InterfaceC0321a {
    @Nullable

    /* renamed from: m  reason: collision with root package name */
    private static final ViewDataBinding.IncludedLayouts f19846m = null;
    @Nullable

    /* renamed from: n  reason: collision with root package name */
    private static final SparseIntArray f19847n;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    private final ConstraintLayout f19848h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    private final TextView f19849i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    private final TextView f19850j;
    @Nullable

    /* renamed from: k  reason: collision with root package name */
    private final View.OnClickListener f19851k;

    /* renamed from: l  reason: collision with root package name */
    private long f19852l;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f19847n = sparseIntArray;
        sparseIntArray.put(R.id.cl_container, 5);
        sparseIntArray.put(R.id.rvList, 6);
    }

    public FragmentGameDetailCommentListBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 7, f19846m, f19847n));
    }

    private boolean i(MutableLiveData<String> mutableLiveData, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f19852l |= 1;
            }
            return true;
        }
        return false;
    }

    private boolean j(MutableLiveData<Boolean> mutableLiveData, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f19852l |= 4;
            }
            return true;
        }
        return false;
    }

    private boolean k(MutableLiveData<String> mutableLiveData, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.f19852l |= 2;
            }
            return true;
        }
        return false;
    }

    @Override // com.join.android.app.mgsim.wufun.generated.callback.a.InterfaceC0321a
    public final void a(int i4, View view) {
        GameDetailCommentListClickProxy gameDetailCommentListClickProxy = this.f19845g;
        if (gameDetailCommentListClickProxy != null) {
            gameDetailCommentListClickProxy.clickSpinner();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void executeBindings() {
        /*
            Method dump skipped, instructions count: 191
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.android.app.mgsim.wufun.databinding.FragmentGameDetailCommentListBindingImpl.executeBindings():void");
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.FragmentGameDetailCommentListBinding
    public void g(@Nullable GameDetailCommentListClickProxy gameDetailCommentListClickProxy) {
        this.f19845g = gameDetailCommentListClickProxy;
        synchronized (this) {
            this.f19852l |= 16;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.FragmentGameDetailCommentListBinding
    public void h(@Nullable GameDetailCommentListViewModel gameDetailCommentListViewModel) {
        this.f19844f = gameDetailCommentListViewModel;
        synchronized (this) {
            this.f19852l |= 8;
        }
        notifyPropertyChanged(36);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f19852l != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f19852l = 32L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int i4, Object obj, int i5) {
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    return false;
                }
                return j((MutableLiveData) obj, i5);
            }
            return k((MutableLiveData) obj, i5);
        }
        return i((MutableLiveData) obj, i5);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i4, @Nullable Object obj) {
        if (36 == i4) {
            h((GameDetailCommentListViewModel) obj);
        } else if (7 != i4) {
            return false;
        } else {
            g((GameDetailCommentListClickProxy) obj);
        }
        return true;
    }

    private FragmentGameDetailCommentListBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 3, (ConstraintLayout) objArr[5], (LinearLayout) objArr[3], (TextView) objArr[1], (XQuickRecyclerView) objArr[6]);
        this.f19852l = -1L;
        this.f19841c.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f19848h = constraintLayout;
        constraintLayout.setTag(null);
        TextView textView = (TextView) objArr[2];
        this.f19849i = textView;
        textView.setTag(null);
        TextView textView2 = (TextView) objArr[4];
        this.f19850j = textView2;
        textView2.setTag(null);
        this.f19842d.setTag(null);
        setRootTag(view);
        this.f19851k = new a(this, 1);
        invalidateAll();
    }
}
