package com.join.mgps.fragment;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.l2;
import com.join.mgps.adapter.GameTopicAdapter;
import com.join.mgps.basefragment.BaseLoadingFragment;
import com.join.mgps.customview.XListView2;
import com.join.mgps.dto.GameTopicBean;
import java.util.ArrayList;
import java.util.List;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
@EFragment(R.layout.fragment_game_topic)
/* loaded from: classes3.dex */
public class GameTopicFragment extends BaseLoadingFragment implements AbsListView.OnScrollListener {

    /* renamed from: c  reason: collision with root package name */
    com.join.mgps.rpc.e f52023c;

    /* renamed from: d  reason: collision with root package name */
    private Context f52024d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    XListView2 f52025e;

    /* renamed from: f  reason: collision with root package name */
    GameTopicAdapter f52026f;

    /* renamed from: g  reason: collision with root package name */
    public int f52027g;

    /* renamed from: h  reason: collision with root package name */
    public int f52028h;

    /* renamed from: i  reason: collision with root package name */
    volatile List<GameTopicAdapter.g> f52029i;

    /* renamed from: j  reason: collision with root package name */
    volatile List<GameTopicBean> f52030j;

    /* renamed from: k  reason: collision with root package name */
    Handler f52031k = new a();

    /* loaded from: classes3.dex */
    class a extends Handler {
        a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            XListView2 xListView2;
            super.handleMessage(message);
            if (message.what == 0 && (xListView2 = GameTopicFragment.this.f52025e) != null) {
                xListView2.v();
                GameTopicFragment.this.f52025e.u();
                GameTopicFragment gameTopicFragment = GameTopicFragment.this;
                if (gameTopicFragment.f52028h == -1) {
                    gameTopicFragment.f52025e.setNoMore();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b implements com.join.mgps.customview.f {
        b() {
        }

        @Override // com.join.mgps.customview.f
        public void onLoadMore() {
            if (GameTopicFragment.this.h0()) {
                GameTopicFragment.this.l0();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class c implements com.join.mgps.customview.g {
        c() {
        }

        @Override // com.join.mgps.customview.g
        public void onRefresh() {
            if (GameTopicFragment.this.h0()) {
                GameTopicFragment.this.m0();
            }
        }
    }

    private void g0() {
        this.f52025e.setPreLoadCount(com.join.mgps.Util.j0.f27865e);
        this.f52025e.setPullLoadEnable(new b());
        this.f52025e.setPullRefreshEnable(new c());
        this.f52029i = new ArrayList();
        GameTopicAdapter gameTopicAdapter = new GameTopicAdapter(this.f52024d);
        this.f52026f = gameTopicAdapter;
        this.f52025e.setAdapter((ListAdapter) gameTopicAdapter);
        this.f52025e.setOnScrollListener(this);
        f0();
    }

    private void k0(int i4, List<GameTopicBean> list) {
        if (this.f52030j == null) {
            this.f52030j = new ArrayList();
        }
        if (list != null && list.size() != 0) {
            if (i4 == 1) {
                this.f52030j.clear();
                this.f52027g = 1;
            }
            this.f52027g = i4;
            this.f52030j.addAll(list);
            a0();
        }
        p0();
        j0();
        i0();
    }

    private void n0(List<GameTopicBean> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            o0(list.get(i4));
        }
    }

    private void o0(GameTopicBean gameTopicBean) {
        this.f52029i.add(new GameTopicAdapter.g(GameTopicAdapter.ViewType.POST_HEADER, new GameTopicAdapter.g.b(gameTopicBean.getId(), gameTopicBean.getCollection_id(), gameTopicBean.getNick_name(), gameTopicBean.getHead_portrait(), gameTopicBean.getUid())));
        this.f52029i.add(new GameTopicAdapter.g(GameTopicAdapter.ViewType.POST_VIDEO_THUMBNAIL, new GameTopicAdapter.g.f(gameTopicBean.getId(), gameTopicBean.getCollection_id(), gameTopicBean.getPic_cover())));
        this.f52029i.add(new GameTopicAdapter.g(GameTopicAdapter.ViewType.POST_SUBJECT, new GameTopicAdapter.g.e(gameTopicBean.getId(), gameTopicBean.getCollection_id(), gameTopicBean.getTitle())));
        this.f52029i.add(new GameTopicAdapter.g(GameTopicAdapter.ViewType.POST_FOOTER, new GameTopicAdapter.g.a(gameTopicBean.getId(), gameTopicBean.getCollection_id(), gameTopicBean.getDescribe(), gameTopicBean.getView(), gameTopicBean.getComment_count())));
    }

    @Override // com.join.mgps.basefragment.BaseLoadingFragment
    protected int W() {
        return R.layout.fragment_game_topic;
    }

    @Override // com.join.mgps.basefragment.BaseLoadingFragment
    protected int X() {
        return R.id.fragment_game_topic;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        this.f52023c = com.join.mgps.rpc.impl.d.P1();
        this.f52024d = getContext();
        g0();
        loadData();
    }

    void f0() {
        View view = new View(this.f52024d);
        view.setLayoutParams(new AbsListView.LayoutParams(2, com.join.mgps.Util.c0.a(this.f52024d, 14.0f)));
        this.f52025e.addFooterView(view);
    }

    boolean h0() {
        if (com.join.android.app.common.utils.j.j(this.f52024d)) {
            return true;
        }
        showToast(getString(R.string.net_connect_failed));
        p0();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void i0() {
        GameTopicAdapter gameTopicAdapter = this.f52026f;
        if (gameTopicAdapter == null) {
            return;
        }
        gameTopicAdapter.l(this.f52029i);
        this.f52026f.notifyDataSetChanged();
    }

    synchronized void j0() {
        if (this.f52029i == null) {
            this.f52029i = new ArrayList();
        }
        this.f52029i.clear();
        n0(this.f52030j);
    }

    void l0() {
        if (this.f52028h == -1) {
            p0();
        } else {
            loadData(this.f52027g + 1);
        }
    }

    @Override // com.join.mgps.basefragment.BaseLoadingFragment
    protected void loadData() {
        loadData(1);
    }

    void m0() {
        loadData();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i4, int i5, int i6) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i4) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void p0() {
        this.f52031k.sendEmptyMessageDelayed(0, 1500L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showToast(String str) {
        l2.a(this.f52024d).b(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0063, code lost:
        if (r5.f52028h != (-1)) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0071, code lost:
        if (r5.f52028h == (-1)) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0073, code lost:
        r5.f52028h = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0075, code lost:
        p0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:?, code lost:
        return;
     */
    @org.androidannotations.annotations.Background
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void loadData(int r6) {
        /*
            r5 = this;
            android.content.Context r0 = r5.f52024d
            android.content.Context r0 = r0.getApplicationContext()
            boolean r0 = com.join.android.app.common.utils.j.j(r0)
            r1 = 1
            if (r0 == 0) goto L83
            r0 = 0
            r2 = -1
            int r3 = r5.f52028h     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
            if (r3 != r6) goto L1b
            if (r3 == r2) goto L17
            r5.f52028h = r0
        L17:
            r5.p0()
            return
        L1b:
            r5.f52028h = r6     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
            com.join.mgps.rpc.e r3 = r5.f52023c     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
            android.content.Context r4 = r5.f52024d     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
            com.join.mgps.Util.RequestBeanUtil r4 = com.join.mgps.Util.RequestBeanUtil.getInstance(r4)     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
            com.join.mgps.dto.CommonRequestBean r4 = r4.getGameTopicRequestBean(r6)     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
            com.join.mgps.dto.ResultMainBean r3 = r3.y(r4)     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
            if (r3 == 0) goto L59
            int r4 = r3.getFlag()     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
            if (r4 != r1) goto L59
            com.join.mgps.dto.ResultMessageBean r4 = r3.getMessages()     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
            if (r4 == 0) goto L59
            com.join.mgps.dto.ResultMessageBean r3 = r3.getMessages()     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
            java.lang.Object r3 = r3.getData()     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
            java.util.List r3 = (java.util.List) r3     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
            if (r3 == 0) goto L51
            int r4 = r3.size()     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
            if (r4 <= 0) goto L51
            r5.k0(r6, r3)     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
            goto L61
        L51:
            if (r6 != r1) goto L56
            r5.e0()     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
        L56:
            r5.f52028h = r2     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
            goto L61
        L59:
            if (r6 != r1) goto L5f
            r5.c0()     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
            goto L61
        L5f:
            r5.f52028h = r2     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
        L61:
            int r6 = r5.f52028h
            if (r6 == r2) goto L75
            goto L73
        L66:
            r6 = move-exception
            goto L79
        L68:
            r6 = move-exception
            r5.c0()     // Catch: java.lang.Throwable -> L66
            r6.printStackTrace()     // Catch: java.lang.Throwable -> L66
            int r6 = r5.f52028h
            if (r6 == r2) goto L75
        L73:
            r5.f52028h = r0
        L75:
            r5.p0()
            goto L8d
        L79:
            int r1 = r5.f52028h
            if (r1 == r2) goto L7f
            r5.f52028h = r0
        L7f:
            r5.p0()
            throw r6
        L83:
            int r6 = r5.f52027g
            if (r6 >= r1) goto L8a
            r5.c0()
        L8a:
            r5.p0()
        L8d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.fragment.GameTopicFragment.loadData(int):void");
    }
}
