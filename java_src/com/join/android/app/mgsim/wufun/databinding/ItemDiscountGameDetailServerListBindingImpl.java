package com.join.android.app.mgsim.wufun.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.discount.model.bean.GameServerInfoBean;
import com.join.kotlin.discount.proxy.GameDetailServerBookDialogClickProxy;
/* loaded from: classes3.dex */
public class ItemDiscountGameDetailServerListBindingImpl extends ItemDiscountGameDetailServerListBinding {
    @Nullable

    /* renamed from: i  reason: collision with root package name */
    private static final ViewDataBinding.IncludedLayouts f21960i = null;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    private static final SparseIntArray f21961j;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    private final ConstraintLayout f21962e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    private final TextView f21963f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    private final TextView f21964g;

    /* renamed from: h  reason: collision with root package name */
    private long f21965h;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f21961j = sparseIntArray;
        sparseIntArray.put(R.id.redPoint, 3);
    }

    public ItemDiscountGameDetailServerListBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 4, f21960i, f21961j));
    }

    @Override // androidx.databinding.ViewDataBinding
    protected void executeBindings() {
        long j4;
        String str;
        int i4;
        String str2;
        String str3;
        String str4;
        String str5;
        long j5;
        long j6;
        synchronized (this) {
            j4 = this.f21965h;
            this.f21965h = 0L;
        }
        GameServerInfoBean gameServerInfoBean = this.f21958c;
        long j7 = j4 & 5;
        int i5 = 0;
        String str6 = null;
        Boolean bool = null;
        if (j7 != 0) {
            if (gameServerInfoBean != null) {
                String times = gameServerInfoBean.getTimes();
                Boolean expire = gameServerInfoBean.getExpire();
                str4 = gameServerInfoBean.getTimes_suffix();
                str5 = gameServerInfoBean.getServer_name();
                str3 = gameServerInfoBean.getServerName();
                str2 = times;
                bool = expire;
            } else {
                str2 = null;
                str3 = null;
                str4 = null;
                str5 = null;
            }
            String str7 = str2 + str4;
            boolean z4 = !ViewDataBinding.safeUnbox(bool);
            String str8 = (str3 + " ") + str5;
            if (j7 != 0) {
                if (z4) {
                    j5 = j4 | 16;
                    j6 = 64;
                } else {
                    j5 = j4 | 8;
                    j6 = 32;
                }
                j4 = j5 | j6;
            }
            TextView textView = this.f21963f;
            int colorFromResource = z4 ? ViewDataBinding.getColorFromResource(textView, R.color.textBlack) : ViewDataBinding.getColorFromResource(textView, R.color.textGrey);
            i4 = z4 ? ViewDataBinding.getColorFromResource(this.f21964g, R.color.textA3Black) : ViewDataBinding.getColorFromResource(this.f21964g, R.color.textGrey);
            str6 = str7;
            str = str8;
            i5 = colorFromResource;
        } else {
            str = null;
            i4 = 0;
        }
        if ((j4 & 5) != 0) {
            TextViewBindingAdapter.setText(this.f21963f, str6);
            this.f21963f.setTextColor(i5);
            TextViewBindingAdapter.setText(this.f21964g, str);
            this.f21964g.setTextColor(i4);
        }
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ItemDiscountGameDetailServerListBinding
    public void g(@Nullable GameDetailServerBookDialogClickProxy gameDetailServerBookDialogClickProxy) {
        this.f21959d = gameDetailServerBookDialogClickProxy;
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ItemDiscountGameDetailServerListBinding
    public void h(@Nullable GameServerInfoBean gameServerInfoBean) {
        this.f21958c = gameServerInfoBean;
        synchronized (this) {
            this.f21965h |= 1;
        }
        notifyPropertyChanged(18);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f21965h != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f21965h = 4L;
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
            h((GameServerInfoBean) obj);
        } else if (7 != i4) {
            return false;
        } else {
            g((GameDetailServerBookDialogClickProxy) obj);
        }
        return true;
    }

    private ItemDiscountGameDetailServerListBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (View) objArr[3]);
        this.f21965h = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f21962e = constraintLayout;
        constraintLayout.setTag(null);
        TextView textView = (TextView) objArr[1];
        this.f21963f = textView;
        textView.setTag(null);
        TextView textView2 = (TextView) objArr[2];
        this.f21964g = textView2;
        textView2.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
