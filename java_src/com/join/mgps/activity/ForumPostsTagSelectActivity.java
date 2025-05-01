package com.join.mgps.activity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.BaseAppCompatActivity;
import com.join.android.app.common.utils.JsonMapper;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.adapter.ForumBaseAdapter;
import com.join.mgps.customview.ForumLoadingView;
import com.join.mgps.customview.XListView2;
import com.join.mgps.db.tables.PurchasedListTable;
import com.join.mgps.dto.CollectionBeanSub;
import com.join.mgps.dto.ForumResponse;
import com.join.mgps.dto.RecommendLabelTag;
import java.util.ArrayList;
import java.util.List;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.Receiver;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
@EActivity(R.layout.activity_forum_posts_tag_select)
/* loaded from: classes4.dex */
public class ForumPostsTagSelectActivity extends BaseAppCompatActivity {
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    RelativeLayout f30871b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    ImageView f30872c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    TextView f30873d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    XListView2 f30874e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    ForumLoadingView f30875f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    Button f30876g;

    /* renamed from: h  reason: collision with root package name */
    com.join.mgps.rpc.i f30877h;
    @Extra

    /* renamed from: m  reason: collision with root package name */
    int f30882m;
    @Extra

    /* renamed from: n  reason: collision with root package name */
    int f30883n;
    @Extra

    /* renamed from: o  reason: collision with root package name */
    int f30884o;

    /* renamed from: p  reason: collision with root package name */
    private ForumBaseAdapter f30885p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f30886q;

    /* renamed from: s  reason: collision with root package name */
    com.join.android.app.component.video.c f30888s;

    /* renamed from: i  reason: collision with root package name */
    List<RecommendLabelTag> f30878i = new ArrayList();

    /* renamed from: j  reason: collision with root package name */
    List<RecommendLabelTag> f30879j = new ArrayList();

    /* renamed from: k  reason: collision with root package name */
    List<RecommendLabelTag> f30880k = new ArrayList();

    /* renamed from: l  reason: collision with root package name */
    List<Integer> f30881l = new ArrayList();

    /* renamed from: r  reason: collision with root package name */
    String f30887r = "ForumPostsTagSelectActivity";

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements com.join.mgps.customview.g {
        a() {
        }

        @Override // com.join.mgps.customview.g
        public void onRefresh() {
            ForumPostsTagSelectActivity.this.j0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b extends ForumBaseAdapter.b1 {
        b() {
        }

        @Override // com.join.mgps.adapter.ForumBaseAdapter.b1, com.join.mgps.adapter.ForumBaseAdapter.t0
        public void i(RecommendLabelTag recommendLabelTag) {
            super.i(recommendLabelTag);
            if (ForumPostsTagSelectActivity.this.f30878i.contains(recommendLabelTag)) {
                ForumPostsTagSelectActivity.this.f30878i.remove(recommendLabelTag);
            } else {
                ForumPostsTagSelectActivity.this.f30878i.add(recommendLabelTag);
            }
            ForumPostsTagSelectActivity.this.k0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c extends ForumLoadingView.e {
        c(ForumLoadingView forumLoadingView) {
            super(forumLoadingView);
        }

        @Override // com.join.mgps.customview.ForumLoadingView.e
        public void a(View view) {
            super.a(view);
        }

        @Override // com.join.mgps.customview.ForumLoadingView.e
        public void b() {
            ForumPostsTagSelectActivity.this.j0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d extends ForumLoadingView.e {
        d(ForumLoadingView forumLoadingView) {
            super(forumLoadingView);
        }

        @Override // com.join.mgps.customview.ForumLoadingView.e
        public void a(View view) {
        }

        @Override // com.join.mgps.customview.ForumLoadingView.e
        public void b() {
            super.b();
            ForumPostsTagSelectActivity.this.j0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class e extends ForumLoadingView.e {
        e(ForumLoadingView forumLoadingView) {
            super(forumLoadingView);
        }

        @Override // com.join.mgps.customview.ForumLoadingView.e
        public void b() {
            ForumPostsTagSelectActivity.this.j0();
        }
    }

    private void i0() {
        this.f30874e.setPreLoadCount(com.join.mgps.Util.j0.f27865e);
        this.f30874e.setPullRefreshEnable(new a());
        ForumBaseAdapter forumBaseAdapter = new ForumBaseAdapter(this, this.f30888s);
        this.f30885p = forumBaseAdapter;
        forumBaseAdapter.C0(this.f30887r);
        this.f30885p.I0(new b());
        this.f30874e.setAdapter((ListAdapter) this.f30885p);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        this.f30877h = com.join.mgps.rpc.impl.g.A0();
        TextView textView = this.f30873d;
        StringBuilder sb = new StringBuilder();
        sb.append("选择");
        sb.append(this.f30882m == 1 ? "收录" : "删除");
        sb.append("话题");
        textView.setText(sb.toString());
        this.f30876g.setVisibility(0);
        this.f30876g.setText("完成");
        this.f30888s = new com.join.android.app.component.video.c(this, this.f30887r);
        String stringExtra = getIntent().getStringExtra("selectedTags");
        if (!TextUtils.isEmpty(stringExtra)) {
            this.f30880k.addAll((List) JsonMapper.getInstance().fromJson(stringExtra, JsonMapper.getInstance().createCollectionType(ArrayList.class, RecommendLabelTag.class)));
            for (int i4 = 0; i4 < this.f30880k.size(); i4++) {
                this.f30881l.add(Integer.valueOf(this.f30880k.get(i4).getTag_id()));
            }
        }
        i0();
        g0(1);
        j0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void back_image() {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void f0(String str) {
        com.join.mgps.Util.l2.a(this).b(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void g0(int i4) {
        ForumLoadingView forumLoadingView = this.f30875f;
        if (forumLoadingView == null) {
            return;
        }
        if (i4 == 1) {
            forumLoadingView.j(1);
        } else if (i4 == 2) {
            forumLoadingView.j(2);
        } else if (i4 == 4) {
            forumLoadingView.j(4);
        } else if (i4 == 16) {
            forumLoadingView.setFailedMsg("加载失败，再试试吧~");
            ForumLoadingView forumLoadingView2 = this.f30875f;
            forumLoadingView2.setListener(new e(forumLoadingView2));
            this.f30875f.j(16);
        } else if (i4 == 9) {
            forumLoadingView.setListener(new c(forumLoadingView));
            this.f30875f.j(9);
        } else if (i4 != 10) {
        } else {
            forumLoadingView.setFailedMsg("没有更多话题哦~");
            ForumLoadingView forumLoadingView3 = this.f30875f;
            forumLoadingView3.setListener(new d(forumLoadingView3));
            this.f30875f.setReloadingVisibility(0);
            this.f30875f.j(10);
        }
    }

    String h0() {
        String str = "";
        if (this.f30878i == null) {
            return "";
        }
        for (int i4 = 0; i4 < this.f30878i.size(); i4++) {
            str = str + this.f30878i.get(i4).getTag_id();
            if (i4 != this.f30878i.size() - 1 && i4 > 0) {
                str = str + ",";
            }
        }
        return str;
    }

    void j0() {
        if (this.f30882m == 1) {
            o0();
        } else {
            p0();
        }
    }

    synchronized void k0() {
        ForumBaseAdapter forumBaseAdapter = this.f30885p;
        if (forumBaseAdapter == null) {
            return;
        }
        forumBaseAdapter.x().clear();
        if (this.f30879j == null) {
            return;
        }
        for (int i4 = 0; i4 < this.f30879j.size(); i4++) {
            n0(this.f30879j.get(i4));
        }
        this.f30885p.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {o1.a.G, o1.a.I})
    public void l0(@Receiver.Extra("gameData") CollectionBeanSub collectionBeanSub) {
        if (collectionBeanSub != null) {
            PurchasedListTable n4 = b2.e0.o().n(collectionBeanSub.getGame_id());
            if (n4 == null) {
                n4 = new PurchasedListTable();
            }
            n4.setGame_id(collectionBeanSub.getGame_id());
            b2.e0.o().m(n4);
        }
        ForumBaseAdapter forumBaseAdapter = this.f30885p;
        if (forumBaseAdapter != null) {
            forumBaseAdapter.notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void m0() {
        if (TextUtils.isEmpty(h0())) {
            f0("未勾选任何标签哟~");
            return;
        }
        this.f30886q = true;
        onBackPressed();
    }

    void n0(RecommendLabelTag recommendLabelTag) {
        if (recommendLabelTag == null) {
            return;
        }
        this.f30885p.f(new ForumBaseAdapter.r1(ForumBaseAdapter.ViewType.TAG_ITEM, new ForumBaseAdapter.r1.g0(recommendLabelTag, this.f30878i.contains(recommendLabelTag))));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void o0() {
        if (com.join.android.app.common.utils.j.j(this)) {
            try {
                ForumResponse<List<RecommendLabelTag>> u4 = this.f30877h.u(AccountUtil_.getInstance_(this).getUid(), AccountUtil_.getInstance_(this).getToken(), this.f30883n);
                if (u4 != null && u4.getError() == 0) {
                    if (u4.getData() == null) {
                        g0(4);
                        return;
                    } else {
                        q0(u4.getData());
                        return;
                    }
                }
                g0(4);
                return;
            } catch (Exception e5) {
                e5.printStackTrace();
                g0(4);
                return;
            }
        }
        f0(getString(R.string.net_connect_failed));
        g0(9);
    }

    @Override // com.BaseAppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.f30886q) {
            String json = JsonMapper.getInstance().toJson(this.f30878i);
            if (!TextUtils.isEmpty(json)) {
                Intent intent = new Intent();
                Bundle bundle = new Bundle();
                bundle.putInt("action", this.f30882m);
                bundle.putString("ids", json);
                intent.putExtras(bundle);
                setResult(-1, intent);
            }
        }
        super.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.join.android.app.component.video.c cVar = this.f30888s;
        if (cVar != null) {
            cVar.G();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        com.join.android.app.component.video.c cVar = this.f30888s;
        if (cVar != null) {
            cVar.H();
        }
        super.onPause();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.join.android.app.component.video.c cVar = this.f30888s;
        if (cVar != null) {
            cVar.I();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void p0() {
        if (com.join.android.app.common.utils.j.j(this)) {
            try {
                ForumResponse<List<RecommendLabelTag>> w4 = this.f30877h.w(this.f30884o, AccountUtil_.getInstance_(this).getUid(), AccountUtil_.getInstance_(this).getToken(), this.f30883n);
                if (w4 != null && w4.getError() == 0) {
                    if (w4.getData() == null) {
                        g0(4);
                        return;
                    } else {
                        q0(w4.getData());
                        return;
                    }
                }
                g0(4);
                return;
            } catch (Exception e5) {
                e5.printStackTrace();
                g0(4);
                return;
            }
        }
        f0(getString(R.string.net_connect_failed));
        g0(9);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void q0(List<RecommendLabelTag> list) {
        if (list != null && list.size() != 0) {
            g0(2);
            this.f30879j.clear();
            this.f30879j.addAll(list);
            for (int i4 = 0; i4 < this.f30879j.size(); i4++) {
                RecommendLabelTag recommendLabelTag = this.f30879j.get(i4);
                if (this.f30881l.contains(Integer.valueOf(recommendLabelTag.getTag_id()))) {
                    this.f30878i.add(recommendLabelTag);
                }
            }
            k0();
            return;
        }
        g0(10);
    }
}
