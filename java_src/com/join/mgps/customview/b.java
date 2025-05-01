package com.join.mgps.customview;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.g2;
import com.join.mgps.Util.l2;
import com.join.mgps.dialog.v0;
import com.join.mgps.dto.ForumBean;
import com.join.mgps.dto.ForumData;
import com.join.mgps.dto.ForumRequestBean;
import com.join.mgps.dto.ForumResponse;
import com.wufan.user.service.protobuf.n0;
import java.util.Arrays;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.EBean;
import org.androidannotations.annotations.UiThread;
/* compiled from: ForumExtFuncPopWindow.java */
@EBean
/* loaded from: classes4.dex */
public class b extends PopupWindow implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    private Context f48354b;

    /* renamed from: c  reason: collision with root package name */
    private View f48355c;

    /* renamed from: d  reason: collision with root package name */
    private View f48356d;

    /* renamed from: e  reason: collision with root package name */
    private View f48357e;

    /* renamed from: f  reason: collision with root package name */
    private View f48358f;

    /* renamed from: g  reason: collision with root package name */
    private View f48359g;

    /* renamed from: h  reason: collision with root package name */
    private View f48360h;

    /* renamed from: i  reason: collision with root package name */
    private View f48361i;

    /* renamed from: j  reason: collision with root package name */
    private View f48362j;

    /* renamed from: k  reason: collision with root package name */
    private final int f48363k;

    /* renamed from: l  reason: collision with root package name */
    private final int f48364l;

    /* renamed from: m  reason: collision with root package name */
    private final int f48365m;

    /* renamed from: n  reason: collision with root package name */
    private final int f48366n;

    /* renamed from: o  reason: collision with root package name */
    private final int f48367o;

    /* renamed from: p  reason: collision with root package name */
    private int f48368p;

    /* renamed from: q  reason: collision with root package name */
    com.join.mgps.rpc.i f48369q;

    /* renamed from: r  reason: collision with root package name */
    private Object[] f48370r;

    /* renamed from: s  reason: collision with root package name */
    private ForumBean.ForumPostsBean f48371s;

    /* renamed from: t  reason: collision with root package name */
    d f48372t;

    /* renamed from: u  reason: collision with root package name */
    private v0 f48373u;

    /* renamed from: v  reason: collision with root package name */
    private int f48374v;

    /* renamed from: w  reason: collision with root package name */
    boolean f48375w;

    /* renamed from: x  reason: collision with root package name */
    boolean f48376x;

    /* renamed from: y  reason: collision with root package name */
    boolean f48377y;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ForumExtFuncPopWindow.java */
    /* loaded from: classes4.dex */
    public class a implements View.OnTouchListener {
        a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 4) {
                b.this.dismiss();
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ForumExtFuncPopWindow.java */
    /* renamed from: com.join.mgps.customview.b$b  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public class View$OnClickListenerC0356b implements View.OnClickListener {
        View$OnClickListenerC0356b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            b.this.f48373u.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ForumExtFuncPopWindow.java */
    /* loaded from: classes4.dex */
    public class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            b.this.g();
            b.this.f48373u.dismiss();
        }
    }

    /* compiled from: ForumExtFuncPopWindow.java */
    /* loaded from: classes4.dex */
    public interface d {
        void a(int i4);

        void b(ForumBean.ForumPostsBean forumPostsBean);

        void c(int i4, boolean z4);

        void d(ForumBean.ForumPostsBean forumPostsBean);

        void e(ForumBean.ForumPostsBean forumPostsBean);

        void onCancel();
    }

    public b(Context context) {
        super(context);
        this.f48363k = 0;
        this.f48364l = 1;
        this.f48365m = 2;
        this.f48366n = 3;
        this.f48367o = 99;
        this.f48368p = 0;
        this.f48375w = false;
        this.f48376x = false;
        this.f48377y = false;
        this.f48354b = context;
        this.f48369q = com.join.mgps.rpc.impl.g.A0();
        View inflate = LayoutInflater.from(context).inflate(R.layout.mg_forum_ext_func_popwindow, (ViewGroup) null);
        this.f48356d = inflate;
        setContentView(inflate);
        setWidth(this.f48354b.getResources().getDimensionPixelSize(R.dimen.mg_forum_ext_func_width));
        setHeight(-2);
        o();
        h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (this.f48370r == null) {
            return;
        }
        switch (this.f48374v) {
            case R.id.extFuncBest /* 2131297576 */:
                d();
                return;
            case R.id.extFuncBestTv /* 2131297577 */:
            case R.id.extFuncFavoriteTv /* 2131297581 */:
            default:
                return;
            case R.id.extFuncCancel /* 2131297578 */:
                dismiss();
                return;
            case R.id.extFuncDelete /* 2131297579 */:
                c();
                return;
            case R.id.extFuncFavorite /* 2131297580 */:
                e();
                return;
            case R.id.extFuncReply /* 2131297582 */:
                k();
                return;
            case R.id.extFuncReport /* 2131297583 */:
                f();
                return;
        }
    }

    private void h() {
        this.f48355c = this.f48356d.findViewById(R.id.extFuncShare);
        this.f48357e = this.f48356d.findViewById(R.id.extFuncFavorite);
        this.f48358f = this.f48356d.findViewById(R.id.extFuncBest);
        this.f48359g = this.f48356d.findViewById(R.id.extFuncReply);
        this.f48360h = this.f48356d.findViewById(R.id.extFuncReport);
        this.f48361i = this.f48356d.findViewById(R.id.extFuncDelete);
        this.f48362j = this.f48356d.findViewById(R.id.extFuncCancel);
        this.f48355c.setOnClickListener(this);
        this.f48357e.setOnClickListener(this);
        this.f48358f.setOnClickListener(this);
        this.f48359g.setOnClickListener(this);
        this.f48360h.setOnClickListener(this);
        this.f48361i.setOnClickListener(this);
        this.f48362j.setOnClickListener(this);
    }

    private void o() {
        setBackgroundDrawable(new BitmapDrawable());
        setFocusable(true);
        setTouchable(true);
        setOutsideTouchable(true);
        setTouchInterceptor(new a());
    }

    private void q() {
        String str;
        dismiss();
        switch (this.f48374v) {
            case R.id.extFuncBest /* 2131297576 */:
                if (this.f48371s.getBest() != 1) {
                    str = "确定要设为精华吗？";
                    break;
                } else {
                    str = "确定要取消精华吗？";
                    break;
                }
            case R.id.extFuncBestTv /* 2131297577 */:
            case R.id.extFuncCancel /* 2131297578 */:
            case R.id.extFuncFavoriteTv /* 2131297581 */:
            default:
                return;
            case R.id.extFuncDelete /* 2131297579 */:
                str = "确定要删除吗？";
                break;
            case R.id.extFuncFavorite /* 2131297580 */:
                e();
                return;
            case R.id.extFuncReply /* 2131297582 */:
                str = "确定要回复吗？";
                break;
            case R.id.extFuncReport /* 2131297583 */:
                str = "确定要设为举报吗？";
                break;
            case R.id.extFuncShare /* 2131297584 */:
                com.join.mgps.Util.j0.H1(this.f48354b, this.f48371s);
                return;
        }
        if (this.f48354b == null) {
            return;
        }
        if (this.f48373u == null) {
            this.f48373u = new v0(this.f48354b);
        }
        this.f48373u.f("确定");
        this.f48373u.d("取消");
        this.f48373u.b(8);
        this.f48373u.g(str).c(new View$OnClickListenerC0356b());
        this.f48373u.e(new c());
        if (this.f48373u.isShowing()) {
            return;
        }
        this.f48373u.show();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void c() {
        ForumData.ForumPostsDeleteData data;
        Context context = this.f48354b;
        int pid = this.f48371s.getPid();
        try {
            if (com.join.mgps.Util.j0.c0(context, pid) != null) {
                ForumResponse<ForumData.ForumPostsDeleteData> q02 = this.f48369q.q0(com.join.mgps.Util.j0.c0(context, pid).getParams());
                i(pid, q02 != null && q02.getError() == 0 && (data = q02.getData()) != null && data.isResult());
            }
        } catch (Exception unused) {
            i(pid, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void d() {
        if (this.f48376x) {
            return;
        }
        int i4 = 1;
        this.f48376x = true;
        Context context = this.f48354b;
        ForumBean.ForumPostsBean forumPostsBean = new ForumBean.ForumPostsBean();
        try {
            ForumBean.ForumPostsBean forumPostsBean2 = this.f48371s;
            if (forumPostsBean2 != null) {
                forumPostsBean = (ForumBean.ForumPostsBean) forumPostsBean2.clone();
            }
        } catch (CloneNotSupportedException e5) {
            e5.printStackTrace();
        }
        if (com.join.android.app.common.utils.j.j(context)) {
            try {
                try {
                } catch (Exception e6) {
                    d dVar = this.f48372t;
                    if (dVar != null) {
                        dVar.e(forumPostsBean);
                    }
                    r(context.getString(R.string.forum_post_best_fail));
                    e6.printStackTrace();
                }
                if (!com.join.mgps.Util.j0.Y0(context)) {
                    com.join.mgps.Util.j0.L0(context);
                    r(context.getString(R.string.forum_user_not_login));
                    this.f48376x = false;
                    return;
                }
                n0 T = com.join.mgps.Util.j0.T(context);
                ForumResponse<ForumData.ForumPostsBestData> r02 = this.f48369q.r0(new ForumRequestBean.ForumPostsFavoritesRequestBean(T.getUid(), T.getToken(), forumPostsBean.getPid(), "").getParams());
                if (r02 != null) {
                    int error = r02.getError();
                    if (error == 0) {
                        ForumData.ForumPostsBestData data = r02.getData();
                        if (data != null) {
                            if (data.isResult()) {
                                boolean z4 = data.getBest() == 1;
                                if (z4) {
                                    r(context.getString(R.string.forum_post_best_success));
                                } else {
                                    r(context.getString(R.string.forum_post_debest_success));
                                }
                                if (!z4) {
                                    i4 = 0;
                                }
                                forumPostsBean.setBest(i4);
                            } else if (g2.i(data.getMessage())) {
                                r(data.getMessage());
                            }
                        } else {
                            r(context.getString(R.string.forum_post_best_fail));
                        }
                    } else if (error == 701) {
                        r(context.getString(R.string.forum_user_login_invalid));
                    }
                } else {
                    r(context.getString(R.string.forum_post_best_fail));
                }
                d dVar2 = this.f48372t;
                if (dVar2 != null) {
                    dVar2.e(forumPostsBean);
                }
                return;
            } finally {
                this.f48376x = false;
            }
        }
        r(context.getString(R.string.net_connect_failed));
    }

    @Override // android.widget.PopupWindow
    public void dismiss() {
        d dVar = this.f48372t;
        if (dVar != null) {
            dVar.onCancel();
        }
        Activity activity = (Activity) this.f48354b;
        WindowManager.LayoutParams attributes = activity.getWindow().getAttributes();
        attributes.alpha = 1.0f;
        activity.getWindow().setAttributes(attributes);
        super.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void e() {
        ForumBean.ForumPostsBean forumPostsBean;
        Context context = this.f48354b;
        ForumBean.ForumPostsBean forumPostsBean2 = new ForumBean.ForumPostsBean();
        try {
            forumPostsBean = this.f48371s;
        } catch (CloneNotSupportedException e5) {
            e5.printStackTrace();
        }
        if (forumPostsBean != null) {
            forumPostsBean2 = (ForumBean.ForumPostsBean) forumPostsBean.clone();
            if (com.join.android.app.common.utils.j.j(context)) {
                AccountUtil_.getInstance_(context).getAccountData();
                if (IntentUtil.getInstance().goLoginInteractive(context)) {
                    return;
                }
                this.f48375w = true;
                try {
                    try {
                    } catch (Exception e6) {
                        d dVar = this.f48372t;
                        if (dVar != null) {
                            dVar.d(forumPostsBean2);
                        }
                        r(context.getString(R.string.forum_post_favorite_fail));
                        e6.printStackTrace();
                    }
                    if (!com.join.mgps.Util.j0.Y0(context)) {
                        com.join.mgps.Util.j0.L0(context);
                        r(context.getString(R.string.forum_user_not_login));
                        this.f48375w = false;
                        return;
                    }
                    n0 T = com.join.mgps.Util.j0.T(context);
                    ForumRequestBean.ForumPostsFavoritesRequestBean forumPostsFavoritesRequestBean = new ForumRequestBean.ForumPostsFavoritesRequestBean(T.getUid(), T.getToken(), forumPostsBean2.getPid(), "");
                    int y2 = com.join.android.app.common.utils.n.n(context).y();
                    String z4 = com.join.android.app.common.utils.n.n(context).z();
                    forumPostsFavoritesRequestBean.setApp_ver(y2 + "_" + z4);
                    ForumResponse<ForumData.ForumPostsFavoritesData> k02 = this.f48369q.k0(forumPostsFavoritesRequestBean.getParams());
                    if (k02 != null) {
                        int error = k02.getError();
                        if (error == 0) {
                            ForumData.ForumPostsFavoritesData data = k02.getData();
                            if (data != null) {
                                forumPostsBean2.setIs_favorite(data.isFavorites());
                                if (data.isFavorites()) {
                                    r(context.getString(R.string.forum_post_favorite_success));
                                } else {
                                    r(context.getString(R.string.forum_post_defavorite_success));
                                }
                                com.join.mgps.Util.j0.f1(forumPostsBean2.getPid(), data.isFavorites());
                            } else {
                                r(context.getString(R.string.forum_post_favorite_fail));
                            }
                        } else if (error == 701) {
                            r(context.getString(R.string.forum_user_login_invalid));
                        }
                    } else {
                        r(context.getString(R.string.forum_post_favorite_fail));
                    }
                    d dVar2 = this.f48372t;
                    if (dVar2 != null) {
                        dVar2.d(forumPostsBean2);
                    }
                    return;
                } finally {
                    this.f48375w = false;
                }
            }
            r(context.getString(R.string.net_connect_failed));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void f() {
        if (this.f48377y) {
            return;
        }
        this.f48377y = true;
        Context context = this.f48354b;
        ForumBean.ForumPostsBean forumPostsBean = new ForumBean.ForumPostsBean();
        try {
            ForumBean.ForumPostsBean forumPostsBean2 = this.f48371s;
            if (forumPostsBean2 != null) {
                forumPostsBean = (ForumBean.ForumPostsBean) forumPostsBean2.clone();
            }
        } catch (CloneNotSupportedException e5) {
            e5.printStackTrace();
        }
        if (com.join.android.app.common.utils.j.j(context)) {
            try {
                try {
                } finally {
                    this.f48377y = false;
                }
            } catch (Exception e6) {
                d dVar = this.f48372t;
                if (dVar != null) {
                    dVar.b(forumPostsBean);
                }
                r(context.getString(R.string.forum_post_report_fail));
                e6.printStackTrace();
            }
            if (!com.join.mgps.Util.j0.Y0(context)) {
                com.join.mgps.Util.j0.L0(context);
                r(context.getString(R.string.forum_user_not_login));
                this.f48377y = false;
                return;
            }
            n0 T = com.join.mgps.Util.j0.T(context);
            ForumResponse<ForumData.ForumPostsReportData> c5 = this.f48369q.c(new ForumRequestBean.ForumPostsFavoritesRequestBean(T.getUid(), T.getToken(), forumPostsBean.getPid(), "").getParams());
            if (c5 != null) {
                int error = c5.getError();
                if (error == 0) {
                    ForumData.ForumPostsReportData data = c5.getData();
                    if (data != null) {
                        if (data.isResult()) {
                            r(context.getString(R.string.forum_post_report_success));
                        } else {
                            r(context.getString(R.string.forum_post_report_fail));
                        }
                    } else {
                        r(context.getString(R.string.forum_post_report_fail));
                    }
                } else if (error == 701) {
                    r(context.getString(R.string.forum_user_login_invalid));
                }
            } else {
                r(context.getString(R.string.forum_post_report_fail));
            }
            d dVar2 = this.f48372t;
            if (dVar2 != null) {
                dVar2.b(forumPostsBean);
            }
            return;
        }
        r(context.getString(R.string.net_connect_failed));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void i(int i4, boolean z4) {
        if (z4) {
            l2.a(this.f48354b).b("删除成功");
        } else {
            l2.a(this.f48354b).b("删除失败");
        }
        d dVar = this.f48372t;
        if (dVar != null) {
            dVar.c(i4, z4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void j(ForumBean.ForumPostsBean forumPostsBean) {
        TextView textView = (TextView) this.f48357e.findViewById(R.id.extFuncFavoriteTv);
        if (forumPostsBean.is_favorite()) {
            textView.setText("取消收藏");
        } else {
            textView.setText("收藏");
        }
        TextView textView2 = (TextView) this.f48358f.findViewById(R.id.extFuncBestTv);
        if (forumPostsBean.getBest() == 1) {
            textView2.setText("取消精华");
        } else {
            textView2.setText("精华");
        }
    }

    void k() {
        ForumBean.ForumPostsBean forumPostsBean = this.f48371s;
        if (forumPostsBean == null) {
            return;
        }
        Context context = this.f48354b;
        if (context != null) {
            com.join.mgps.Util.j0.v0(context, forumPostsBean);
        }
        d dVar = this.f48372t;
        if (dVar != null) {
            dVar.a(this.f48371s.getPid());
        }
    }

    public int l(Object[] objArr) {
        try {
            this.f48370r = objArr;
            if (objArr != null && objArr.length != 0) {
                ForumBean.ForumPostsBean forumPostsBean = (ForumBean.ForumPostsBean) objArr[0];
                this.f48371s = forumPostsBean;
                j(forumPostsBean);
            }
            ForumBean.ForumPostsBean forumPostsBean2 = this.f48371s;
            if (forumPostsBean2 == null) {
                return 7;
            }
            int auth = forumPostsBean2.getAuth();
            if (auth == 0) {
                this.f48368p = 0;
            } else if (auth == 1) {
                this.f48368p = 1;
            } else if (auth == 2) {
                this.f48368p = 2;
            } else if (auth == 3) {
                this.f48368p = 3;
            } else if (auth != 99) {
                this.f48368p = 0;
            } else {
                this.f48368p = 99;
            }
            return n(this.f48368p);
        } catch (Exception e5) {
            e5.printStackTrace();
            return 7;
        }
    }

    public void m(d dVar) {
        this.f48372t = dVar;
    }

    public int n(int i4) {
        this.f48368p = i4;
        boolean z4 = false;
        if (!Arrays.asList(0, 2, 1, 3, 99).contains(Integer.valueOf(this.f48368p))) {
            this.f48368p = 0;
        }
        this.f48355c.setVisibility(0);
        this.f48357e.setVisibility(0);
        this.f48358f.setVisibility(0);
        this.f48359g.setVisibility(0);
        this.f48360h.setVisibility(0);
        this.f48361i.setVisibility(0);
        this.f48362j.setVisibility(0);
        this.f48359g.setVisibility(8);
        int i5 = this.f48368p;
        if (i5 == 0) {
            this.f48358f.setVisibility(8);
            this.f48361i.setVisibility(8);
        } else if (i5 == 1) {
            this.f48358f.setVisibility(8);
            this.f48361i.setVisibility(8);
        } else if (i5 != 2) {
            if (i5 == 3) {
                n0 accountData = AccountUtil_.getInstance_(this.f48354b).getAccountData();
                if (accountData != null && accountData.getUid() == this.f48371s.getUid()) {
                    z4 = true;
                }
                if (z4) {
                    this.f48360h.setVisibility(8);
                    return 5;
                }
            }
            return 6;
        } else {
            this.f48358f.setVisibility(8);
            this.f48360h.setVisibility(8);
        }
        return 4;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.extFuncCancel) {
            dismiss();
        }
        this.f48374v = view.getId();
        q();
    }

    public void p(View view, Object... objArr) {
        if (view == null) {
            return;
        }
        Activity activity = (Activity) view.getContext();
        l(objArr);
        setAnimationStyle(R.style.animation_image_pager_popup);
        activity.getResources().getDimension(R.dimen.mg_forum_ext_func_item_height);
        showAtLocation(((Activity) this.f48354b).findViewById(16908290), 17, 0, 0);
        WindowManager.LayoutParams attributes = activity.getWindow().getAttributes();
        attributes.alpha = 0.3f;
        activity.getWindow().setAttributes(attributes);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void r(String str) {
        l2.a(this.f48354b).b(str);
    }
}
