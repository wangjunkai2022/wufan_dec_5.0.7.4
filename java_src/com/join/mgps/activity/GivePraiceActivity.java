package com.join.mgps.activity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.BaseFragmentActivity;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.RequestBeanUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.activity.CommentDetailActivity_;
import com.join.mgps.customview.XListView2;
import com.join.mgps.dto.ForumBean;
import com.join.mgps.dto.ForumProfileMessageBean;
import com.join.mgps.dto.ForumProfileMessageData;
import com.join.mgps.dto.ForumResponse;
import com.join.mgps.dto.GivePriaceBean;
import com.join.mgps.ptr.PtrClassicFrameLayout;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
@EActivity(R.layout.activity_give_price)
/* loaded from: classes4.dex */
public class GivePraiceActivity extends BaseFragmentActivity {
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    LinearLayout f33392b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    PtrClassicFrameLayout f33393c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    XListView2 f33394d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    LinearLayout f33395e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    LinearLayout f33396f;

    /* renamed from: g  reason: collision with root package name */
    com.join.mgps.rpc.i f33397g;

    /* renamed from: h  reason: collision with root package name */
    Context f33398h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    LinearLayout f33399i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    LinearLayout f33400j;

    /* renamed from: k  reason: collision with root package name */
    int f33401k = 1;

    /* renamed from: l  reason: collision with root package name */
    private com.wufan.user.service.protobuf.n0 f33402l;

    /* renamed from: m  reason: collision with root package name */
    d f33403m;

    /* renamed from: n  reason: collision with root package name */
    String f33404n;

    /* renamed from: o  reason: collision with root package name */
    ForumResponse<ForumProfileMessageData> f33405o;

    /* renamed from: p  reason: collision with root package name */
    List<ForumProfileMessageBean> f33406p;

    /* renamed from: q  reason: collision with root package name */
    List<GivePriaceBean.MessagesBean.DataBean> f33407q;

    /* renamed from: r  reason: collision with root package name */
    int f33408r;
    @ViewById

    /* renamed from: s  reason: collision with root package name */
    Button f33409s;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements com.join.mgps.customview.g {
        a() {
        }

        @Override // com.join.mgps.customview.g
        public void onRefresh() {
            GivePraiceActivity.this.g0();
            GivePraiceActivity givePraiceActivity = GivePraiceActivity.this;
            int i4 = givePraiceActivity.f33408r;
            if (i4 == 1) {
                givePraiceActivity.f33401k = 1;
                givePraiceActivity.m0();
            } else if (i4 == 2) {
                givePraiceActivity.f33401k = 1;
                givePraiceActivity.n0();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements com.join.mgps.customview.f {
        b() {
        }

        @Override // com.join.mgps.customview.f
        public void onLoadMore() {
            GivePraiceActivity.this.g0();
            GivePraiceActivity givePraiceActivity = GivePraiceActivity.this;
            int i4 = givePraiceActivity.f33408r;
            if (i4 == 1) {
                givePraiceActivity.m0();
            } else if (i4 == 2) {
                givePraiceActivity.n0();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GivePraiceActivity.this.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d extends BaseAdapter {

        /* renamed from: b  reason: collision with root package name */
        ForumProfileMessageBean f33413b;

        /* loaded from: classes4.dex */
        class a implements View.OnClickListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f33415b;

            a(int i4) {
                this.f33415b = i4;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                GivePraiceActivity givePraiceActivity = GivePraiceActivity.this;
                if (givePraiceActivity.f33408r == 1) {
                    ForumBean.ForumPostsBean forumPostsBean = new ForumBean.ForumPostsBean();
                    forumPostsBean.setPid(GivePraiceActivity.this.f33406p.get(this.f33415b).getPid());
                    com.join.mgps.Util.j0.w0(GivePraiceActivity.this.f33398h, forumPostsBean, null);
                } else if (givePraiceActivity.f33407q == null) {
                    givePraiceActivity.r0();
                } else {
                    CommentDetailActivity_.z d5 = CommentDetailActivity_.M1(givePraiceActivity.f33398h).d(GivePraiceActivity.this.f33407q.get(this.f33415b).getGame_id());
                    d5.b(GivePraiceActivity.this.f33407q.get(this.f33415b).getOriginal_text_id() + "").f("").a(1).e(0).h(1).g("").c(GivePraiceActivity.this.f33407q.get(this.f33415b).getComment_score_switch()).start();
                }
            }
        }

        /* loaded from: classes4.dex */
        class b {

            /* renamed from: a  reason: collision with root package name */
            TextView f33417a;

            /* renamed from: b  reason: collision with root package name */
            TextView f33418b;

            /* renamed from: c  reason: collision with root package name */
            TextView f33419c;

            /* renamed from: d  reason: collision with root package name */
            LinearLayout f33420d;

            /* renamed from: e  reason: collision with root package name */
            SimpleDraweeView f33421e;

            b() {
            }
        }

        d() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            GivePraiceActivity givePraiceActivity = GivePraiceActivity.this;
            if (givePraiceActivity.f33408r == 1) {
                return givePraiceActivity.f33406p.size();
            }
            return givePraiceActivity.f33407q.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i4) {
            GivePraiceActivity givePraiceActivity = GivePraiceActivity.this;
            if (givePraiceActivity.f33408r == 1) {
                return givePraiceActivity.f33406p.get(i4);
            }
            return givePraiceActivity.f33407q.get(i4);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i4) {
            return i4;
        }

        @Override // android.widget.Adapter
        public View getView(int i4, View view, ViewGroup viewGroup) {
            b bVar;
            long praise_time;
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            if (view == null) {
                view = LayoutInflater.from(GivePraiceActivity.this.f33398h).inflate(R.layout.givepraice_item, (ViewGroup) null);
                bVar = new b();
                bVar.f33421e = (SimpleDraweeView) view.findViewById(R.id.simv);
                bVar.f33420d = (LinearLayout) view.findViewById(R.id.ll_post);
                bVar.f33418b = (TextView) view.findViewById(R.id.tv_name);
                bVar.f33419c = (TextView) view.findViewById(R.id.tv_time);
                bVar.f33417a = (TextView) view.findViewById(R.id.tv_post);
                view.setTag(bVar);
            } else {
                bVar = (b) view.getTag();
            }
            GivePraiceActivity givePraiceActivity = GivePraiceActivity.this;
            if (givePraiceActivity.f33408r == 1) {
                if (givePraiceActivity.f33406p.get(i4).getPosts() != null) {
                    this.f33413b = GivePraiceActivity.this.f33406p.get(i4);
                }
                TextView textView = bVar.f33417a;
                textView.setText(GivePraiceActivity.this.f33404n + this.f33413b.getPosts().getMessage());
                bVar.f33421e.setImageURI(GivePraiceActivity.this.f33406p.get(i4).getFrom_avatar_src());
                bVar.f33418b.setText(GivePraiceActivity.this.f33406p.get(i4).getFrom_nickname());
            } else {
                TextView textView2 = bVar.f33417a;
                textView2.setText(GivePraiceActivity.this.f33404n + GivePraiceActivity.this.f33407q.get(i4).getOriginal_text());
                bVar.f33421e.setImageURI(GivePraiceActivity.this.f33407q.get(i4).getPraise_user_ico());
                bVar.f33418b.setText(GivePraiceActivity.this.f33407q.get(i4).getPraise_title());
            }
            bVar.f33420d.setOnClickListener(new a(i4));
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
            Date date = new Date(System.currentTimeMillis());
            GivePraiceActivity givePraiceActivity2 = GivePraiceActivity.this;
            if (givePraiceActivity2.f33408r == 1) {
                praise_time = this.f33413b.getAdd_time();
            } else {
                praise_time = givePraiceActivity2.f33407q.get(i4).getPraise_time();
            }
            Date date2 = new Date(praise_time * 1000);
            String format = simpleDateFormat.format(date);
            String format2 = simpleDateFormat.format(date2);
            String str6 = "";
            if (format2 == null || format2.equals("")) {
                str = "";
                str2 = str;
                str3 = str2;
                str4 = str3;
                str5 = str4;
            } else {
                str6 = format2.substring(0, format2.indexOf("年"));
                str3 = format2.substring(format2.indexOf("年") + 1, format2.indexOf("月"));
                str4 = format2.substring(format2.indexOf("月") + 1, format2.indexOf("日"));
                str2 = format.substring(0, format.indexOf("年"));
                str5 = format.substring(format.indexOf("年") + 1, format.indexOf("月"));
                str = format.substring(format.indexOf("月") + 1, format.indexOf("日"));
            }
            if (str6.equals(str2)) {
                if (str3.equals(str5)) {
                    if (str4.equals(str)) {
                        bVar.f33419c.setText(format2.substring(format2.indexOf(" ") + 1, format2.lastIndexOf(":")));
                    } else {
                        TextView textView3 = bVar.f33419c;
                        textView3.setText(str3 + "月" + str4 + "日");
                    }
                } else {
                    TextView textView4 = bVar.f33419c;
                    textView4.setText(str3 + "月" + str4 + "日");
                }
            } else {
                TextView textView5 = bVar.f33419c;
                textView5.setText(str6 + "年" + str3 + "月" + str4 + "日");
            }
            return view;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void f0() {
        this.f33398h = this;
        this.f33397g = com.join.mgps.rpc.impl.g.A0();
        this.f33402l = AccountUtil_.getInstance_(this).getAccountData();
        this.f33403m = new d();
        this.f33406p = new ArrayList();
        this.f33407q = new ArrayList();
        this.f33394d.setAdapter((ListAdapter) this.f33403m);
        this.f33408r = getIntent().getIntExtra("praice", 1);
        showLoding();
        if (this.f33408r == 1) {
            this.f33404n = "帖子:";
            m0();
        } else {
            this.f33404n = "点评:";
            n0();
        }
        this.f33394d.setPullRefreshEnable(new a());
        this.f33394d.setPullLoadEnable(new b());
        this.f33394d.l();
        this.f33392b.setOnClickListener(new c());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void g0() {
        try {
            XListView2 xListView2 = this.f33394d;
            if (xListView2 != null) {
                xListView2.l();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void h0() {
        this.f33400j.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void i0(List<ForumProfileMessageBean> list) {
        this.f33406p.addAll(list);
        this.f33403m.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void j0(List<GivePriaceBean.MessagesBean.DataBean> list) {
        this.f33407q.addAll(list);
        this.f33403m.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void k0(List<ForumProfileMessageBean> list) {
        list.clear();
        this.f33403m.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void l0(List<GivePriaceBean.MessagesBean.DataBean> list) {
        list.clear();
        this.f33403m.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void m0() {
        if (com.join.android.app.common.utils.j.j(this.f33398h)) {
            ArrayList arrayList = new ArrayList();
            try {
                com.join.mgps.rpc.i iVar = this.f33397g;
                int uid = this.f33402l.getUid();
                String token = this.f33402l.getToken();
                int i4 = this.f33401k;
                this.f33401k = i4 + 1;
                ForumResponse<ForumProfileMessageData> m02 = iVar.m0(uid, token, i4, 10);
                s0();
                if (m02 != null) {
                    if (m02.getData() != null) {
                        if (m02.getData().getMessage_list() != null && m02.getData().getMessage_list().size() > 0) {
                            if (this.f33401k == 2) {
                                k0(this.f33406p);
                            }
                            if (m02.getData().getMessage_list().size() < 10) {
                                p0();
                            }
                            for (ForumProfileMessageBean forumProfileMessageBean : m02.getData().getMessage_list()) {
                                arrayList.add(forumProfileMessageBean);
                            }
                            i0(arrayList);
                            o0();
                            return;
                        } else if (this.f33401k == 2) {
                            o0();
                            p0();
                            q0(1);
                            return;
                        } else {
                            p0();
                            return;
                        }
                    }
                    return;
                }
                o0();
                q0(1);
                return;
            } catch (Exception e5) {
                e5.printStackTrace();
                o0();
                showLodingFailed();
                return;
            }
        }
        q0(2);
        o0();
        showLodingFailed();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void n0() {
        if (com.join.android.app.common.utils.j.j(this.f33398h)) {
            ArrayList arrayList = new ArrayList();
            try {
                RequestBeanUtil requestBeanUtil = RequestBeanUtil.getInstance(this.f33398h);
                int i4 = this.f33401k;
                this.f33401k = i4 + 1;
                GivePriaceBean m4 = this.f33397g.m(com.join.mgps.rpc.h.f54053i + "/android/v2/message/praisenoticemessagelist", requestBeanUtil.getPraiceMessPra(i4, this.f33402l.getUid(), this.f33402l.getToken()));
                s0();
                if (m4 != null) {
                    if (m4.getMessages() != null) {
                        if (m4.getMessages().getData() != null && m4.getMessages().getData().size() > 0) {
                            if (this.f33401k == 2) {
                                l0(this.f33407q);
                            }
                            for (int i5 = 0; i5 < m4.getMessages().getData().size(); i5++) {
                                arrayList.add(m4.getMessages().getData().get(i5));
                            }
                            if (arrayList.size() < 10) {
                                p0();
                            }
                            j0(arrayList);
                            o0();
                            return;
                        } else if (this.f33401k == 2) {
                            o0();
                            p0();
                            q0(1);
                            return;
                        } else {
                            p0();
                            return;
                        }
                    } else if (this.f33401k == 2) {
                        o0();
                        p0();
                        q0(1);
                        return;
                    } else {
                        p0();
                        return;
                    }
                } else if (this.f33401k == 2) {
                    o0();
                    p0();
                    q0(1);
                    return;
                } else {
                    p0();
                    return;
                }
            } catch (Exception e5) {
                e5.printStackTrace();
                return;
            }
        }
        q0(2);
        o0();
        showLodingFailed();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void o0() {
        try {
            this.f33395e.setVisibility(8);
            this.f33396f.setVisibility(8);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void p0() {
        XListView2 xListView2 = this.f33394d;
        if (xListView2 != null) {
            xListView2.setNoMore();
            this.f33394d.u();
            this.f33394d.v();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void q0(int i4) {
        if (i4 == 1) {
            this.f33393c.setVisibility(8);
            this.f33394d.setVisibility(8);
            this.f33399i.setVisibility(0);
            return;
        }
        this.f33393c.setVisibility(8);
        this.f33394d.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void r0() {
        com.join.mgps.Util.l2.a(this.f33398h).b("帖子已删除");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void s0() {
        try {
            this.f33394d.u();
            this.f33394d.v();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void setNetwork() {
        UtilsMy.w3(this.f33398h);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLoding() {
        try {
            LinearLayout linearLayout = this.f33395e;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
            LinearLayout linearLayout2 = this.f33396f;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(8);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLodingFailed() {
        LinearLayout linearLayout = this.f33396f;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        LinearLayout linearLayout2 = this.f33395e;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
    }
}
