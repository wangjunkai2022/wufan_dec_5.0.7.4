package com.join.android.app.mgsim.wufun.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
import com.join.android.app.mgsim.wufun.generated.callback.a;
import com.join.kotlin.base.widget.recycleview.XQuickRecyclerView;
import com.join.kotlin.discount.model.bean.CommentStatisticDataBean;
import com.join.kotlin.discount.model.bean.GameDetailBean;
import com.join.kotlin.discount.proxy.GameDetailFragmentClickProxy;
import com.join.kotlin.discount.viewmodel.GameDetailFragmentViewModel;
import com.join.mgps.customview.MarqueeTextView;
import com.join.mgps.customview.NestedScrollableHost;
/* loaded from: classes3.dex */
public class FragmentDiscountGameDetailV2BindingImpl extends FragmentDiscountGameDetailV2Binding implements a.InterfaceC0321a {
    @Nullable
    private static final ViewDataBinding.IncludedLayouts S1 = null;
    @Nullable
    private static final SparseIntArray T1;
    @NonNull
    private final ProgressBar A1;
    @NonNull
    private final TextView B1;
    @NonNull
    private final TextView C1;
    @NonNull
    private final TextView D1;
    @NonNull
    private final ConstraintLayout E1;
    @Nullable
    private final View.OnClickListener F1;
    @Nullable
    private final View.OnClickListener G1;
    @Nullable
    private final View.OnClickListener H1;
    @Nullable
    private final View.OnClickListener I1;
    @Nullable
    private final View.OnClickListener J1;
    @Nullable
    private final View.OnClickListener K1;
    @Nullable
    private final View.OnClickListener L1;
    @Nullable
    private final View.OnClickListener M1;
    @Nullable
    private final View.OnClickListener N1;
    @NonNull
    private final ConstraintLayout O;
    @Nullable
    private final View.OnClickListener O1;
    @NonNull
    private final TextView P;
    @Nullable
    private final View.OnClickListener P1;
    @NonNull
    private final TextView Q;
    @Nullable
    private final View.OnClickListener Q1;
    @NonNull
    private final TextView R;
    private long R1;
    @NonNull
    private final LinearLayout S;
    @NonNull
    private final TextView T;
    @NonNull
    private final TextView U;
    @NonNull
    private final Group V;
    @NonNull
    private final LinearLayout W;
    @NonNull
    private final TextView X;
    @NonNull
    private final LinearLayout Y;
    @NonNull
    private final TextView Z;
    @NonNull

    /* renamed from: p0  reason: collision with root package name */
    private final LinearLayout f19719p0;
    @NonNull

    /* renamed from: p1  reason: collision with root package name */
    private final TextView f19720p1;
    @NonNull

    /* renamed from: v1  reason: collision with root package name */
    private final TextView f19721v1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        T1 = sparseIntArray;
        sparseIntArray.put(R.id.topMask, 39);
        sparseIntArray.put(R.id.nes, 40);
        sparseIntArray.put(R.id.cl_container, 41);
        sparseIntArray.put(R.id.bannerView, 42);
        sparseIntArray.put(R.id.banner, 43);
        sparseIntArray.put(R.id.gradientTop, 44);
        sparseIntArray.put(R.id.gradientBottom, 45);
        sparseIntArray.put(R.id.bottomMask, 46);
        sparseIntArray.put(R.id.llIndicator, 47);
        sparseIntArray.put(R.id.flWelfare, 48);
        sparseIntArray.put(R.id.titleNotice, 49);
        sparseIntArray.put(R.id.dividerLine, 50);
        sparseIntArray.put(R.id.releaseTitle, 51);
        sparseIntArray.put(R.id.cardRelease, 52);
        sparseIntArray.put(R.id.rvReleaseWelfare, 53);
        sparseIntArray.put(R.id.llExpand, 54);
        sparseIntArray.put(R.id.commentTitle, 55);
        sparseIntArray.put(R.id.cardComment, 56);
    }

    public FragmentDiscountGameDetailV2BindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 57, S1, T1));
    }

    private boolean i(MutableLiveData<String> mutableLiveData, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.R1 |= 64;
            }
            return true;
        }
        return false;
    }

    private boolean j(MutableLiveData<CommentStatisticDataBean> mutableLiveData, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.R1 |= 8;
            }
            return true;
        }
        return false;
    }

    private boolean k(MutableLiveData<GameDetailBean> mutableLiveData, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.R1 |= 2;
            }
            return true;
        }
        return false;
    }

    private boolean l(MutableLiveData<String> mutableLiveData, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.R1 |= 1;
            }
            return true;
        }
        return false;
    }

    private boolean m(MutableLiveData<Integer> mutableLiveData, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.R1 |= 128;
            }
            return true;
        }
        return false;
    }

    private boolean n(MutableLiveData<Boolean> mutableLiveData, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.R1 |= 256;
            }
            return true;
        }
        return false;
    }

    private boolean o(MutableLiveData<Boolean> mutableLiveData, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.R1 |= 16;
            }
            return true;
        }
        return false;
    }

    private boolean p(MutableLiveData<Boolean> mutableLiveData, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.R1 |= 4;
            }
            return true;
        }
        return false;
    }

    private boolean q(MutableLiveData<Boolean> mutableLiveData, int i4) {
        if (i4 == 0) {
            synchronized (this) {
                this.R1 |= 32;
            }
            return true;
        }
        return false;
    }

    @Override // com.join.android.app.mgsim.wufun.generated.callback.a.InterfaceC0321a
    public final void a(int i4, View view) {
        switch (i4) {
            case 1:
                GameDetailFragmentClickProxy gameDetailFragmentClickProxy = this.N;
                if (gameDetailFragmentClickProxy != null) {
                    gameDetailFragmentClickProxy.goCoupon();
                    return;
                }
                return;
            case 2:
                GameDetailFragmentClickProxy gameDetailFragmentClickProxy2 = this.N;
                if (gameDetailFragmentClickProxy2 != null) {
                    gameDetailFragmentClickProxy2.goGift();
                    return;
                }
                return;
            case 3:
                GameDetailFragmentClickProxy gameDetailFragmentClickProxy3 = this.N;
                if (gameDetailFragmentClickProxy3 != null) {
                    gameDetailFragmentClickProxy3.goEvent();
                    return;
                }
                return;
            case 4:
                GameDetailFragmentClickProxy gameDetailFragmentClickProxy4 = this.N;
                if (gameDetailFragmentClickProxy4 != null) {
                    gameDetailFragmentClickProxy4.goServer();
                    return;
                }
                return;
            case 5:
                GameDetailFragmentClickProxy gameDetailFragmentClickProxy5 = this.N;
                if (gameDetailFragmentClickProxy5 != null) {
                    gameDetailFragmentClickProxy5.onAdClick();
                    return;
                }
                return;
            case 6:
                GameDetailFragmentClickProxy gameDetailFragmentClickProxy6 = this.N;
                if (gameDetailFragmentClickProxy6 != null) {
                    gameDetailFragmentClickProxy6.expandReleaseWelfare();
                    return;
                }
                return;
            case 7:
                GameDetailFragmentClickProxy gameDetailFragmentClickProxy7 = this.N;
                if (gameDetailFragmentClickProxy7 != null) {
                    gameDetailFragmentClickProxy7.clickGoodRate();
                    return;
                }
                return;
            case 8:
                GameDetailFragmentClickProxy gameDetailFragmentClickProxy8 = this.N;
                if (gameDetailFragmentClickProxy8 != null) {
                    gameDetailFragmentClickProxy8.showCommentStatistic(1);
                    return;
                }
                return;
            case 9:
                GameDetailFragmentClickProxy gameDetailFragmentClickProxy9 = this.N;
                if (gameDetailFragmentClickProxy9 != null) {
                    gameDetailFragmentClickProxy9.showCommentStatistic(0);
                    return;
                }
                return;
            case 10:
                GameDetailFragmentClickProxy gameDetailFragmentClickProxy10 = this.N;
                if (gameDetailFragmentClickProxy10 != null) {
                    gameDetailFragmentClickProxy10.goComment();
                    return;
                }
                return;
            case 11:
                GameDetailFragmentClickProxy gameDetailFragmentClickProxy11 = this.N;
                if (gameDetailFragmentClickProxy11 != null) {
                    gameDetailFragmentClickProxy11.clickGameInfoTitle();
                    return;
                }
                return;
            case 12:
                GameDetailFragmentClickProxy gameDetailFragmentClickProxy12 = this.N;
                if (gameDetailFragmentClickProxy12 != null) {
                    gameDetailFragmentClickProxy12.downBtnClick();
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:167:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x04d6  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void executeBindings() {
        /*
            Method dump skipped, instructions count: 1917
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.android.app.mgsim.wufun.databinding.FragmentDiscountGameDetailV2BindingImpl.executeBindings():void");
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.FragmentDiscountGameDetailV2Binding
    public void g(@Nullable GameDetailFragmentClickProxy gameDetailFragmentClickProxy) {
        this.N = gameDetailFragmentClickProxy;
        synchronized (this) {
            this.R1 |= 1024;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.FragmentDiscountGameDetailV2Binding
    public void h(@Nullable GameDetailFragmentViewModel gameDetailFragmentViewModel) {
        this.M = gameDetailFragmentViewModel;
        synchronized (this) {
            this.R1 |= 512;
        }
        notifyPropertyChanged(36);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.R1 != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.R1 = 2048L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int i4, Object obj, int i5) {
        switch (i4) {
            case 0:
                return l((MutableLiveData) obj, i5);
            case 1:
                return k((MutableLiveData) obj, i5);
            case 2:
                return p((MutableLiveData) obj, i5);
            case 3:
                return j((MutableLiveData) obj, i5);
            case 4:
                return o((MutableLiveData) obj, i5);
            case 5:
                return q((MutableLiveData) obj, i5);
            case 6:
                return i((MutableLiveData) obj, i5);
            case 7:
                return m((MutableLiveData) obj, i5);
            case 8:
                return n((MutableLiveData) obj, i5);
            default:
                return false;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i4, @Nullable Object obj) {
        if (36 == i4) {
            h((GameDetailFragmentViewModel) obj);
        } else if (7 != i4) {
            return false;
        } else {
            g((GameDetailFragmentClickProxy) obj);
        }
        return true;
    }

    private FragmentDiscountGameDetailV2BindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 9, (RecyclerView) objArr[43], (NestedScrollableHost) objArr[42], (ImageView) objArr[6], (View) objArr[46], (FrameLayout) objArr[56], (FrameLayout) objArr[52], (ConstraintLayout) objArr[41], (ConstraintLayout) objArr[9], (ConstraintLayout) objArr[13], (ConstraintLayout) objArr[16], (TextView) objArr[55], (View) objArr[50], (LinearLayout) objArr[36], (FrameLayout) objArr[48], (TextView) objArr[5], (SimpleDraweeView) objArr[1], (TextView) objArr[31], (MarqueeTextView) objArr[2], (TextView) objArr[3], (View) objArr[45], (View) objArr[44], (LinearLayout) objArr[54], (LinearLayout) objArr[47], (NestedScrollView) objArr[40], (TextView) objArr[51], (RecyclerView) objArr[29], (RecyclerView) objArr[33], (RecyclerView) objArr[53], (XQuickRecyclerView) objArr[35], (TextView) objArr[34], (ImageView) objArr[32], (TextView) objArr[12], (SimpleDraweeView) objArr[22], (TextView) objArr[10], (TextView) objArr[14], (TextView) objArr[49], (View) objArr[39]);
        this.R1 = -1L;
        this.f19696d.setTag(null);
        this.f19701i.setTag(null);
        this.f19702j.setTag(null);
        this.f19703k.setTag(null);
        this.f19706n.setTag(null);
        this.f19708p.setTag(null);
        this.f19709q.setTag(null);
        this.f19710r.setTag(null);
        this.f19711s.setTag(null);
        this.f19712t.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.O = constraintLayout;
        constraintLayout.setTag(null);
        TextView textView = (TextView) objArr[11];
        this.P = textView;
        textView.setTag(null);
        TextView textView2 = (TextView) objArr[15];
        this.Q = textView2;
        textView2.setTag(null);
        TextView textView3 = (TextView) objArr[17];
        this.R = textView3;
        textView3.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[18];
        this.S = linearLayout;
        linearLayout.setTag(null);
        TextView textView4 = (TextView) objArr[19];
        this.T = textView4;
        textView4.setTag(null);
        TextView textView5 = (TextView) objArr[20];
        this.U = textView5;
        textView5.setTag(null);
        Group group = (Group) objArr[21];
        this.V = group;
        group.setTag(null);
        LinearLayout linearLayout2 = (LinearLayout) objArr[23];
        this.W = linearLayout2;
        linearLayout2.setTag(null);
        TextView textView6 = (TextView) objArr[24];
        this.X = textView6;
        textView6.setTag(null);
        LinearLayout linearLayout3 = (LinearLayout) objArr[25];
        this.Y = linearLayout3;
        linearLayout3.setTag(null);
        TextView textView7 = (TextView) objArr[26];
        this.Z = textView7;
        textView7.setTag(null);
        LinearLayout linearLayout4 = (LinearLayout) objArr[27];
        this.f19719p0 = linearLayout4;
        linearLayout4.setTag(null);
        TextView textView8 = (TextView) objArr[28];
        this.f19720p1 = textView8;
        textView8.setTag(null);
        TextView textView9 = (TextView) objArr[30];
        this.f19721v1 = textView9;
        textView9.setTag(null);
        ProgressBar progressBar = (ProgressBar) objArr[37];
        this.A1 = progressBar;
        progressBar.setTag(null);
        TextView textView10 = (TextView) objArr[38];
        this.B1 = textView10;
        textView10.setTag(null);
        TextView textView11 = (TextView) objArr[4];
        this.C1 = textView11;
        textView11.setTag(null);
        TextView textView12 = (TextView) objArr[7];
        this.D1 = textView12;
        textView12.setTag(null);
        ConstraintLayout constraintLayout2 = (ConstraintLayout) objArr[8];
        this.E1 = constraintLayout2;
        constraintLayout2.setTag(null);
        this.A.setTag(null);
        this.B.setTag(null);
        this.D.setTag(null);
        this.E.setTag(null);
        this.F.setTag(null);
        this.G.setTag(null);
        this.H.setTag(null);
        this.I.setTag(null);
        this.J.setTag(null);
        setRootTag(view);
        this.F1 = new a(this, 12);
        this.G1 = new a(this, 1);
        this.H1 = new a(this, 10);
        this.I1 = new a(this, 9);
        this.J1 = new a(this, 11);
        this.K1 = new a(this, 4);
        this.L1 = new a(this, 7);
        this.M1 = new a(this, 8);
        this.N1 = new a(this, 2);
        this.O1 = new a(this, 5);
        this.P1 = new a(this, 3);
        this.Q1 = new a(this, 6);
        invalidateAll();
    }
}
