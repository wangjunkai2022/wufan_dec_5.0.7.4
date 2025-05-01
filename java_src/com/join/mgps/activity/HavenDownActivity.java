package com.join.mgps.activity;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.BaseAppCompatActivity;
import com.MApplication;
import com.facebook.drawee.view.SimpleDraweeView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.RequestBeanUtil;
import com.join.mgps.activity.HavenDownActivity;
import com.join.mgps.dto.HavenForumListGameItem;
import com.join.mgps.dto.HavenForumListbean;
import com.join.mgps.dto.HomeViewSwich;
import com.join.mgps.pref.PrefDef_;
import com.umeng.analytics.MobclickAgent;
import java.util.ArrayList;
import java.util.List;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.sharedpreferences.Pref;
@EActivity(R.layout.activity_haven_down)
/* loaded from: classes4.dex */
public class HavenDownActivity extends BaseAppCompatActivity {
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    View f33886b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    View f33887c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    View f33888d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    View f33889e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    View f33890f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    View f33891g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    TextView f33892h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    TextView f33893i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    RecyclerView f33894j;
    @Extra

    /* renamed from: k  reason: collision with root package name */
    DownloadTask f33895k;
    @Pref

    /* renamed from: l  reason: collision with root package name */
    PrefDef_ f33896l;

    /* renamed from: n  reason: collision with root package name */
    com.join.mgps.dialog.d1 f33898n;

    /* renamed from: o  reason: collision with root package name */
    com.join.mgps.rpc.i f33899o;

    /* renamed from: p  reason: collision with root package name */
    Context f33900p;

    /* renamed from: q  reason: collision with root package name */
    a f33901q;

    /* renamed from: r  reason: collision with root package name */
    com.join.mgps.rpc.e f33902r;

    /* renamed from: s  reason: collision with root package name */
    String f33903s;

    /* renamed from: m  reason: collision with root package name */
    int f33897m = 1;

    /* renamed from: t  reason: collision with root package name */
    List<HavenForumListbean> f33904t = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a extends RecyclerView.Adapter<b> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.join.mgps.activity.HavenDownActivity$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public class View$OnClickListenerC0330a implements View.OnClickListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ HavenForumListbean f33906b;

            View$OnClickListenerC0330a(HavenForumListbean havenForumListbean) {
                this.f33906b = havenForumListbean;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MobclickAgent.onEvent(HavenDownActivity.this.f33900p, "onSourceH5");
                IntentUtil.getInstance().goShareWebActivity(HavenDownActivity.this.f33900p, this.f33906b.getResourceUrl());
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public class b implements View.OnClickListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ HavenForumListbean f33908b;

            b(HavenForumListbean havenForumListbean) {
                this.f33908b = havenForumListbean;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IntentUtil intentUtil = IntentUtil.getInstance();
                Context context = HavenDownActivity.this.f33900p;
                intentUtil.goFormDetial(context, this.f33908b.getPid() + "");
            }
        }

        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(HavenForumListbean havenForumListbean, View view) {
            IntentUtil intentUtil = IntentUtil.getInstance();
            Context context = HavenDownActivity.this.f33900p;
            intentUtil.goFormDetial(context, havenForumListbean.getPid() + "");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* renamed from: c */
        public void onBindViewHolder(@NonNull b bVar, int i4) {
            final HavenForumListbean havenForumListbean = HavenDownActivity.this.f33904t.get(i4);
            bVar.f33910a.setText(havenForumListbean.getSubject());
            bVar.f33911b.setText(HavenDownActivity.this.f33903s);
            if (havenForumListbean.getGameSimple() != null) {
                HavenForumListGameItem gameSimple = havenForumListbean.getGameSimple();
                if (gameSimple != null) {
                    bVar.f33911b.setText(gameSimple.getName());
                    SimpleDraweeView simpleDraweeView = bVar.f33913d;
                    if (simpleDraweeView != null) {
                        MyImageLoader.h(simpleDraweeView, gameSimple.getIcon());
                    }
                }
                View view = bVar.f33914e;
                if (view != null) {
                    view.setVisibility(0);
                    bVar.f33914e.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.activity.u0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            HavenDownActivity.a.this.b(havenForumListbean, view2);
                        }
                    });
                }
                bVar.f33912c.setVisibility(0);
                bVar.f33912c.setOnClickListener(new View$OnClickListenerC0330a(havenForumListbean));
            } else {
                View view2 = bVar.f33914e;
                if (view2 != null) {
                    view2.setVisibility(8);
                }
                bVar.f33912c.setVisibility(8);
            }
            bVar.f33915f.setOnClickListener(new b(havenForumListbean));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NonNull
        /* renamed from: d */
        public b onCreateViewHolder(@NonNull ViewGroup viewGroup, int i4) {
            return new b(LayoutInflater.from(HavenDownActivity.this.f33900p).inflate(R.layout.haven_forum_list_item, viewGroup, false));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return HavenDownActivity.this.f33904t.size();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        TextView f33910a;

        /* renamed from: b  reason: collision with root package name */
        TextView f33911b;

        /* renamed from: c  reason: collision with root package name */
        View f33912c;

        /* renamed from: d  reason: collision with root package name */
        SimpleDraweeView f33913d;

        /* renamed from: e  reason: collision with root package name */
        View f33914e;

        /* renamed from: f  reason: collision with root package name */
        View f33915f;

        public b(@NonNull View view) {
            super(view);
            this.f33910a = (TextView) view.findViewById(R.id.content);
            this.f33911b = (TextView) view.findViewById(R.id.appName);
            this.f33912c = view.findViewById(R.id.detail);
            this.f33913d = (SimpleDraweeView) view.findViewById(R.id.icon);
            this.f33914e = view.findViewById(R.id.gameLayout);
            this.f33915f = view.findViewById(R.id.main);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterviews() {
        this.f33891g.setVisibility(8);
        this.f33900p = this;
        MobclickAgent.onEvent(this, "onFindSourceStart");
        this.f33899o = com.join.mgps.rpc.impl.g.A0();
        this.f33902r = com.join.mgps.rpc.impl.d.P1();
        this.f33898n = com.join.mgps.Util.b0.f0(this).x(this);
        this.f33894j.setLayoutManager(new LinearLayoutManager(this));
        a aVar = new a();
        this.f33901q = aVar;
        this.f33894j.setAdapter(aVar);
        HomeViewSwich homeViewSwich = MApplication.R;
        if (homeViewSwich != null) {
            try {
                this.f33892h.setText(homeViewSwich.getCommunity_entrance_title().getCfg_values());
            } catch (Exception unused) {
            }
        } else {
            this.f33892h.setText(this.f33896l.community_entrance_title().d());
        }
        if (com.join.mgps.Util.g2.h(this.f33903s)) {
            this.f33903s = this.f33895k.getShowName();
        }
        this.f33893i.setText(this.f33903s);
        g0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void f0() {
        if (this.f33897m != 0) {
            if (com.join.android.app.common.utils.j.j(this.f33900p)) {
                loadData();
                return;
            } else {
                com.join.mgps.Util.l2.a(this.f33900p).b("请检查网络");
                return;
            }
        }
        IntentUtil.getInstance().goMainLabelActivity(this, 0, this.f33903s, 1);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void g0() {
        showLoding();
        try {
            try {
                String data = this.f33902r.Q0(RequestBeanUtil.getInstance(this.f33900p).getDetialmoreServer(this.f33895k.getCrc_link_type_val())).getMessages().getData();
                if (com.join.mgps.Util.g2.i(data)) {
                    this.f33903s = data;
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        } finally {
            j0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void h0() {
        if (AccountUtil_.getInstance_(this.f33900p).isTourist()) {
            IntentUtil.getInstance().goLogin(this.f33900p);
            return;
        }
        HavenWishActivity_.m0(this).a(this.f33895k).start();
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void i0() {
        IntentUtil.getInstance().goMainLabelActivity(this, 0, this.f33903s, 1);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void j0() {
        this.f33898n.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void loadData() {
        showLoding();
        try {
            try {
                List<HavenForumListbean> posts = this.f33899o.R(com.join.mgps.rpc.h.D + "/posts/tags", this.f33903s).getData().getPosts();
                if (posts != null && posts.size() > 0) {
                    updateUi(posts);
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        } finally {
            j0();
        }
    }

    @Override // android.app.Activity
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Rect rect = new Rect();
        View view = this.f33887c;
        if (view != null) {
            view.getGlobalVisibleRect(rect);
            if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return true;
            }
            finish();
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLoding() {
        this.f33898n.show();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void updateUi(List<HavenForumListbean> list) {
        this.f33904t.clear();
        this.f33904t.addAll(list);
        this.f33901q.notifyDataSetChanged();
        this.f33890f.setVisibility(8);
        this.f33889e.setVisibility(0);
        MobclickAgent.onEvent(this.f33900p, "onSourceList");
    }
}
