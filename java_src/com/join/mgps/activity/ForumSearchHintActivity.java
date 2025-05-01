package com.join.mgps.activity;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.BaseFragmentActivity;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.adapter.ForumSearchHintAdapter;
import com.join.mgps.adapter.m5;
import com.join.mgps.customview.LoadingImageView;
import com.join.mgps.customview.MarqueeTextView;
import com.join.mgps.customview.NoScrollListView;
import com.join.mgps.customview.WrapContentGridView;
import com.join.mgps.customview.XListView2;
import com.join.mgps.db.tables.ForumSearchRecordTable;
import com.join.mgps.dto.ForumBean;
import com.join.mgps.dto.ForumData;
import com.join.mgps.dto.ForumResponse;
import com.join.mgps.dto.SearchAutoDataBean;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.EditorAction;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.ItemClick;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.res.StringRes;
@EActivity(R.layout.forum_search_hint_activity)
/* loaded from: classes4.dex */
public class ForumSearchHintActivity extends BaseFragmentActivity implements AbsListView.OnScrollListener {
    @ViewById
    MarqueeTextView A;
    private ForumSearchHintAdapter A1;
    @ViewById
    NoScrollListView B;
    @ViewById
    XListView2 C;
    private int C1;
    @ViewById
    TextView D;
    @ViewById
    LinearLayout E;
    @ViewById
    LinearLayout F;
    @ViewById
    ImageView G;
    @ViewById
    LoadingImageView H;
    @ViewById
    TextView I;
    @ViewById
    Button J;
    @ViewById
    TextView K;
    @ViewById
    TextView L;
    @ViewById
    ImageView M;
    @ViewById
    WrapContentGridView N;
    private i O;
    @Extra
    String P;
    com.join.mgps.rpc.i Q;
    @StringRes(resName = "net_excption")
    String R;
    @StringRes(resName = "connect_server_excption")
    String S;
    @Extra
    int T;
    com.join.mgps.customview.g U;
    private List<SearchAutoDataBean> X;
    private ArrayList<String> Y;
    private m5 Z;

    /* renamed from: b  reason: collision with root package name */
    public Context f31234b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    EditText f31235c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    ImageView f31236d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    ImageView f31237e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    LinearLayout f31238f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    LinearLayout f31239g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    GridView f31240h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    LinearLayout f31241i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    RelativeLayout f31242j;
    @ViewById

    /* renamed from: k  reason: collision with root package name */
    RelativeLayout f31243k;
    @ViewById

    /* renamed from: l  reason: collision with root package name */
    RelativeLayout f31244l;
    @ViewById

    /* renamed from: m  reason: collision with root package name */
    RelativeLayout f31245m;
    @ViewById

    /* renamed from: n  reason: collision with root package name */
    RelativeLayout f31246n;
    @ViewById

    /* renamed from: o  reason: collision with root package name */
    RelativeLayout f31247o;
    @ViewById

    /* renamed from: p  reason: collision with root package name */
    TextView f31248p;

    /* renamed from: p0  reason: collision with root package name */
    List<ForumBean.ForumSearchIndexBean> f31249p0;

    /* renamed from: p1  reason: collision with root package name */
    List<ForumBean.ForumSearchQueryBean> f31250p1;
    @ViewById

    /* renamed from: q  reason: collision with root package name */
    TextView f31251q;
    @ViewById

    /* renamed from: r  reason: collision with root package name */
    TextView f31252r;
    @ViewById

    /* renamed from: s  reason: collision with root package name */
    TextView f31253s;
    @ViewById

    /* renamed from: t  reason: collision with root package name */
    TextView f31254t;
    @ViewById

    /* renamed from: u  reason: collision with root package name */
    TextView f31255u;
    @ViewById

    /* renamed from: v  reason: collision with root package name */
    MarqueeTextView f31256v;

    /* renamed from: v1  reason: collision with root package name */
    private List<ForumSearchHintAdapter.f> f31257v1;
    @ViewById

    /* renamed from: w  reason: collision with root package name */
    MarqueeTextView f31258w;
    @ViewById

    /* renamed from: x  reason: collision with root package name */
    MarqueeTextView f31259x;
    @ViewById

    /* renamed from: y  reason: collision with root package name */
    MarqueeTextView f31260y;
    @ViewById

    /* renamed from: z  reason: collision with root package name */
    MarqueeTextView f31261z;
    private int V = 0;
    private int W = 0;
    private ForumSearchHintAdapter.b B1 = new a();
    Handler D1 = new f();

    /* loaded from: classes4.dex */
    class a implements ForumSearchHintAdapter.b {
        a() {
        }

        @Override // com.join.mgps.adapter.ForumSearchHintAdapter.b
        public void f(String str) {
            ForumBean.ForumPostsBean forumPostsBean = new ForumBean.ForumPostsBean();
            forumPostsBean.setPid(Integer.parseInt(str));
            com.join.mgps.Util.j0.v0(ForumSearchHintActivity.this.f31234b, forumPostsBean);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements View.OnKeyListener {
        b() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i4, KeyEvent keyEvent) {
            Activity activity = (Activity) view.getContext();
            if (i4 == 66) {
                ((InputMethodManager) ForumSearchHintActivity.this.getSystemService("input_method")).hideSoftInputFromWindow(activity.getCurrentFocus().getWindowToken(), 2);
                ForumSearchHintActivity.this.u0();
                return false;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c implements TextWatcher {
        c() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
            String obj = ForumSearchHintActivity.this.f31235c.getText().toString();
            if (charSequence.length() > 0) {
                ForumSearchHintActivity.this.H0(true);
                ForumSearchHintActivity.this.V = 0;
                ForumSearchHintActivity.this.W = 0;
                ForumSearchHintActivity.this.A0(obj, 1);
                return;
            }
            ForumSearchHintActivity.this.H0(false);
            ForumSearchHintActivity.this.f31235c.setHint("");
            ForumSearchHintActivity.this.y0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d implements com.join.mgps.customview.f {
        d() {
        }

        @Override // com.join.mgps.customview.f
        public void onLoadMore() {
            if (!com.join.android.app.common.utils.j.j(ForumSearchHintActivity.this.f31234b)) {
                ForumSearchHintActivity forumSearchHintActivity = ForumSearchHintActivity.this;
                forumSearchHintActivity.showToast(forumSearchHintActivity.getString(R.string.net_connect_failed));
                ForumSearchHintActivity.this.R0();
                return;
            }
            if (ForumSearchHintActivity.this.w0()) {
                ForumSearchHintActivity forumSearchHintActivity2 = ForumSearchHintActivity.this;
                forumSearchHintActivity2.A0(forumSearchHintActivity2.f31235c.getText().toString(), ForumSearchHintActivity.this.V + 1);
            }
            if (ForumSearchHintActivity.this.W == -1) {
                ForumSearchHintActivity.this.R0();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class e implements com.join.mgps.customview.g {
        e() {
        }

        @Override // com.join.mgps.customview.g
        public void onRefresh() {
            if (com.join.android.app.common.utils.j.j(ForumSearchHintActivity.this.f31234b)) {
                ForumSearchHintActivity.this.W = 0;
                ForumSearchHintActivity.this.x0();
                return;
            }
            ForumSearchHintActivity forumSearchHintActivity = ForumSearchHintActivity.this;
            forumSearchHintActivity.showToast(forumSearchHintActivity.getString(R.string.net_connect_failed));
            ForumSearchHintActivity.this.R0();
        }
    }

    /* loaded from: classes4.dex */
    class f extends Handler {
        f() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            ForumSearchHintActivity.this.C.v();
            ForumSearchHintActivity.this.C.u();
            if (ForumSearchHintActivity.this.W == -1) {
                ForumSearchHintActivity.this.C.setNoMore();
            }
            if (ForumSearchHintActivity.this.C.getFirstVisiblePosition() == 0 && ForumSearchHintActivity.this.C.getLastVisiblePosition() + 1 == ForumSearchHintActivity.this.C1) {
                ForumSearchHintActivity.this.C.k();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class g implements View.OnClickListener {
        g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntentUtil.getInstance().goWirelessSettings(view.getContext());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class h implements View.OnClickListener {
        h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ForumSearchHintActivity.this.u0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class i extends BaseAdapter {

        /* renamed from: b  reason: collision with root package name */
        List<ForumBean.ForumSearchIndexBean> f31270b = new ArrayList();

        /* loaded from: classes4.dex */
        class a {

            /* renamed from: a  reason: collision with root package name */
            public TextView f31272a;

            /* renamed from: b  reason: collision with root package name */
            public TextView f31273b;

            /* renamed from: c  reason: collision with root package name */
            public TextView f31274c;

            a() {
            }
        }

        public i() {
        }

        public List<ForumBean.ForumSearchIndexBean> a(ForumBean.ForumSearchIndexBean forumSearchIndexBean) {
            if (forumSearchIndexBean == null) {
                return this.f31270b;
            }
            if (this.f31270b == null) {
                this.f31270b = new ArrayList();
            }
            this.f31270b.add(forumSearchIndexBean);
            return this.f31270b;
        }

        public List<ForumBean.ForumSearchIndexBean> b(List<ForumBean.ForumSearchIndexBean> list) {
            if (list == null) {
                return this.f31270b;
            }
            if (this.f31270b == null) {
                this.f31270b = new ArrayList();
            }
            this.f31270b.addAll(list);
            return this.f31270b;
        }

        public List<ForumBean.ForumSearchIndexBean> c() {
            return this.f31270b;
        }

        public void d(List<ForumBean.ForumSearchIndexBean> list) {
            this.f31270b = list;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            List<ForumBean.ForumSearchIndexBean> list = this.f31270b;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        @Override // android.widget.Adapter
        public Object getItem(int i4) {
            List<ForumBean.ForumSearchIndexBean> list = this.f31270b;
            if (list != null) {
                return list.get(i4);
            }
            return null;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i4) {
            return i4;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getItemViewType(int i4) {
            return super.getItemViewType(i4);
        }

        @Override // android.widget.Adapter
        public View getView(int i4, View view, ViewGroup viewGroup) {
            a aVar;
            if (view != null) {
                aVar = (a) view.getTag();
            } else {
                aVar = new a();
                view = LayoutInflater.from(ForumSearchHintActivity.this).inflate(R.layout.search_hint_hot_item, (ViewGroup) null);
                aVar.f31272a = (TextView) view.findViewById(R.id.icon);
                aVar.f31273b = (TextView) view.findViewById(R.id.rank);
                aVar.f31274c = (TextView) view.findViewById(R.id.name);
                view.setTag(aVar);
            }
            ForumBean.ForumSearchIndexBean forumSearchIndexBean = (ForumBean.ForumSearchIndexBean) getItem(i4);
            int[] iArr = {R.drawable.search_rank_1, R.drawable.search_rank_2, R.drawable.search_rank_3};
            if (i4 < 3) {
                aVar.f31272a.setVisibility(0);
                aVar.f31273b.setVisibility(8);
                aVar.f31272a.setBackgroundResource(iArr[i4]);
            } else {
                aVar.f31272a.setVisibility(8);
                aVar.f31273b.setVisibility(0);
                TextView textView = aVar.f31273b;
                textView.setText("" + (i4 + 1));
            }
            aVar.f31274c.setText(forumSearchIndexBean.getKeyword());
            aVar.f31274c.setTextColor(com.join.mgps.Util.h.d(com.join.mgps.Util.g2.g(forumSearchIndexBean.getColor())));
            view.setOnClickListener(new j(forumSearchIndexBean.getKeyword()));
            return view;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getViewTypeCount() {
            return super.getViewTypeCount();
        }
    }

    /* loaded from: classes4.dex */
    class j implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        String f31276b;

        public j(String str) {
            this.f31276b = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ForumSearchHintActivity.this.E0(this.f31276b);
            ForumSearchHintActivity.this.f31235c.setText(this.f31276b);
            if (TextUtils.isEmpty(this.f31276b)) {
                return;
            }
            ForumSearchHintActivity.this.f31235c.setSelection(this.f31276b.length());
            ForumSearchHintActivity.this.q0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E0(String str) {
        List<ForumSearchRecordTable> d5 = b2.s.n().d();
        if (d5 == null && d5.size() == 0) {
            ForumSearchRecordTable forumSearchRecordTable = new ForumSearchRecordTable();
            forumSearchRecordTable.setName(str);
            forumSearchRecordTable.setCreate_time(System.currentTimeMillis());
            b2.s.n().m(forumSearchRecordTable);
        } else if (d5.size() > 100) {
            b2.s.n().delete((Collection) b2.s.n().i(10L, d5.size(), "create_time", false));
        } else {
            for (ForumSearchRecordTable forumSearchRecordTable2 : d5) {
                if (forumSearchRecordTable2.getName().equals(str)) {
                    b2.s.n().delete((b2.s) forumSearchRecordTable2);
                }
            }
            ForumSearchRecordTable forumSearchRecordTable3 = new ForumSearchRecordTable();
            forumSearchRecordTable3.setName(str);
            forumSearchRecordTable3.setCreate_time(System.currentTimeMillis());
            b2.s.n().m(forumSearchRecordTable3);
        }
    }

    private void G0(ForumBean.ForumSearchQueryBean forumSearchQueryBean) {
        boolean z4;
        String o02 = o0();
        if (forumSearchQueryBean.getSubject() == null || com.join.mgps.Util.g2.h(forumSearchQueryBean.getSubject().trim())) {
            z4 = true;
        } else {
            this.f31257v1.add(new ForumSearchHintAdapter.f(ForumSearchHintAdapter.ViewType.POST_SUBJECT, new ForumSearchHintAdapter.f.c(o02, forumSearchQueryBean.getPid(), forumSearchQueryBean.getSubject())));
            z4 = false;
        }
        if (!com.join.mgps.Util.g2.h(forumSearchQueryBean.getMessage()) && !com.join.mgps.Util.g2.h(forumSearchQueryBean.getMessage().trim())) {
            this.f31257v1.add(new ForumSearchHintAdapter.f(ForumSearchHintAdapter.ViewType.POST_MESSAGE, new ForumSearchHintAdapter.f.b(o02, forumSearchQueryBean.getPid(), forumSearchQueryBean.getMessage(), z4)));
        }
        this.f31257v1.add(new ForumSearchHintAdapter.f(ForumSearchHintAdapter.ViewType.POST_FOOTER, new ForumSearchHintAdapter.f.a(o02, forumSearchQueryBean.getPid(), forumSearchQueryBean.getView(), forumSearchQueryBean.getComment(), forumSearchQueryBean.getPraise())));
    }

    private void S0(List<ForumBean.ForumSearchQueryBean> list, int i4) {
        if (this.f31250p1 == null) {
            this.f31250p1 = new ArrayList();
        }
        if (list != null && list.size() != 0) {
            if (i4 == 1) {
                this.f31250p1.clear();
                this.V = 1;
                R0();
            }
            this.f31250p1.addAll(list);
        }
        notifyUi();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0063, code lost:
        if (r11 == 1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0072, code lost:
        if (r11 == 1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0074, code lost:
        O0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0077, code lost:
        R0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:?, code lost:
        return;
     */
    @org.androidannotations.annotations.Background
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A0(java.lang.String r10, int r11) {
        /*
            r9 = this;
            android.content.Context r0 = r9.f31234b
            boolean r0 = com.join.android.app.common.utils.j.j(r0)
            if (r0 == 0) goto L8a
            int r0 = r9.W
            if (r11 != r0) goto Ld
            return
        Ld:
            r1 = -1
            if (r0 != r1) goto L11
            return
        L11:
            r9.W = r11
            r0 = 0
            r2 = 1
            if (r11 != r2) goto L1e
            java.util.List<com.join.mgps.dto.ForumBean$ForumSearchQueryBean> r3 = r9.f31250p1     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
            if (r3 == 0) goto L1e
            r3.clear()     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
        L1e:
            java.lang.String r7 = ""
            int r8 = r9.T     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
            if (r8 <= 0) goto L2f
            com.join.mgps.rpc.i r3 = r9.Q     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
            int r5 = com.join.mgps.Util.j0.f27864d     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
            r4 = r11
            r6 = r10
            com.join.mgps.dto.ForumResponse r10 = r3.N(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
            goto L37
        L2f:
            com.join.mgps.rpc.i r3 = r9.Q     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
            int r4 = com.join.mgps.Util.j0.f27864d     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
            com.join.mgps.dto.ForumResponse r10 = r3.l(r11, r4, r10, r7)     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
        L37:
            r3 = 0
            if (r10 == 0) goto L41
            java.lang.Object r10 = r10.getData()     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
            com.join.mgps.dto.ForumData$ForumSearchQueryData r10 = (com.join.mgps.dto.ForumData.ForumSearchQueryData) r10     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
            goto L44
        L41:
            r9.W = r0     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
            r10 = r3
        L44:
            if (r10 == 0) goto L4a
            java.util.List r3 = r10.getRes()     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
        L4a:
            if (r3 == 0) goto L55
            int r10 = r3.size()     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
            if (r10 == 0) goto L55
            r9.V = r11     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
            goto L5a
        L55:
            r9.W = r1     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
            r9.J0()     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
        L5a:
            r9.S0(r3, r11)     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
            int r10 = r9.W
            if (r10 == r1) goto L63
            r9.W = r0
        L63:
            if (r11 != r2) goto L77
            goto L74
        L66:
            r10 = move-exception
            goto L7b
        L68:
            r10 = move-exception
            r10.printStackTrace()     // Catch: java.lang.Throwable -> L66
            int r10 = r9.W
            if (r10 == r1) goto L72
            r9.W = r0
        L72:
            if (r11 != r2) goto L77
        L74:
            r9.O0()
        L77:
            r9.R0()
            goto L97
        L7b:
            int r3 = r9.W
            if (r3 == r1) goto L81
            r9.W = r0
        L81:
            if (r11 != r2) goto L86
            r9.O0()
        L86:
            r9.R0()
            throw r10
        L8a:
            r10 = 2131755673(0x7f100299, float:1.9142232E38)
            java.lang.String r10 = r9.getString(r10)
            r9.showToast(r10)
            r9.R0()
        L97:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.activity.ForumSearchHintActivity.A0(java.lang.String, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void B0() {
        com.join.android.app.common.manager.a.h().j(this.f31234b, this.R, 1);
    }

    void C0() {
        p0();
        T0(this.f31249p0, Boolean.TRUE);
        this.f31239g.setVisibility(0);
        List<SearchAutoDataBean> list = this.X;
        if (list != null && list.size() > 0) {
            this.D.setVisibility(8);
            this.B.setAdapter((ListAdapter) this.Z);
        } else {
            this.D.setVisibility(0);
        }
        this.Z.notifyDataSetChanged();
    }

    void D0() {
        if (this.f31250p1 == null) {
            this.f31250p1 = new ArrayList();
        }
        if (this.f31257v1 == null) {
            this.f31257v1 = new ArrayList();
        }
        this.f31257v1.clear();
        for (ForumBean.ForumSearchQueryBean forumSearchQueryBean : this.f31250p1) {
            G0(forumSearchQueryBean);
        }
        this.A1.h(this.f31257v1);
        this.A1.notifyDataSetChanged();
        this.C.requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @EditorAction
    public boolean F0(TextView textView, int i4, KeyEvent keyEvent) {
        if (i4 == 6) {
            ((InputMethodManager) textView.getContext().getSystemService("input_method")).toggleSoftInput(1, 2);
            u0();
            return true;
        }
        return false;
    }

    void H0(boolean z4) {
        List<ForumBean.ForumSearchQueryBean> list;
        p0();
        if (z4) {
            if (this.V == 0 && !com.join.android.app.common.utils.j.j(this)) {
                M0();
                return;
            } else if (this.W == -1 && this.V == 0 && ((list = this.f31250p1) == null || list.size() == 0)) {
                N0();
                return;
            } else {
                P0();
                return;
            }
        }
        K0();
    }

    void I0(View view, int i4) {
        if (view == null || i4 == view.getVisibility()) {
            return;
        }
        view.setVisibility(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void J0() {
        this.C.setNoMore();
    }

    void K0() {
        p0();
        I0(this.f31241i, 0);
        I0(this.f31239g, 0);
    }

    void L0() {
        p0();
        I0(this.E, 0);
    }

    void M0() {
        p0();
        I0(this.F, 0);
        this.G.setImageResource(R.drawable.reload_butn_selector);
        this.K.setText("网络连接失败，再试试吧~");
        this.L.setVisibility(8);
        this.J.setVisibility(0);
        this.M.setVisibility(0);
        this.J.setOnClickListener(new g());
        this.G.setOnClickListener(new h());
    }

    void N0() {
        p0();
        I0(this.F, 0);
        this.G.setImageResource(R.drawable.papa_loading_null);
        this.K.setText("未搜索到相应帖子");
        this.L.setVisibility(8);
        this.J.setVisibility(8);
        this.M.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void O0() {
        this.C.q();
    }

    void P0() {
        p0();
        I0(this.C, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void Q0() {
        this.C.u();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void R0() {
        if (this.C.j()) {
            this.D1.sendEmptyMessageDelayed(0, 2000L);
        } else {
            this.D1.sendEmptyMessage(0);
        }
    }

    void T0(List<ForumBean.ForumSearchIndexBean> list, Boolean bool) {
        if (bool.booleanValue()) {
            if (list != null && list.size() != 0) {
                this.f31241i.setVisibility(0);
                i iVar = this.O;
                if (iVar != null) {
                    if (iVar.c() != null) {
                        this.O.c().clear();
                    }
                    this.O.b(list);
                    this.O.notifyDataSetChanged();
                    return;
                }
                return;
            }
            this.f31241i.setVisibility(8);
            return;
        }
        this.f31241i.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void U0() {
        this.f31239g.setVisibility(0);
        this.D.setVisibility(0);
        this.B.setAdapter((ListAdapter) this.Z);
        this.Z.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        this.Q = com.join.mgps.rpc.impl.g.A0();
        this.f31234b = this;
        v0();
        x0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void l0() {
        z0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void m0() {
        b2.s.n().a();
        this.X.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void n0() {
        m0();
        this.X.clear();
        notifyUi();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void notifyUi() {
        boolean w02 = w0();
        try {
            if (w02) {
                H0(w02);
                D0();
            } else {
                C0();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    String o0() {
        return this.f31235c.getText().toString();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i4, int i5, int i6) {
        this.C1 = i6;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i4) {
    }

    void p0() {
        I0(this.C, 8);
        I0(this.f31241i, 8);
        I0(this.f31239g, 8);
        I0(this.E, 8);
        I0(this.F, 8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void q0() {
        ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void r0() {
        XListView2 xListView2 = this.C;
        if (xListView2 != null) {
            xListView2.g();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ItemClick
    public void s0(int i4) {
        if (i4 >= this.X.size() || i4 < 0) {
            return;
        }
        String str = this.X.get(i4).getGame_name().toString();
        E0(str);
        this.f31235c.setText(str);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f31235c.setSelection(str.length());
        q0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void serverConnectionException() {
        com.join.android.app.common.manager.a.h().j(this.f31234b, this.S, 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showToast(String str) {
        com.join.mgps.Util.l2.a(this).b(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void t0() {
        ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 2);
        if (w0()) {
            this.f31235c.setText("");
            notifyUi();
            return;
        }
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void u0() {
        String g4 = com.join.mgps.Util.g2.g(this.f31235c.getText().toString());
        if (g4.length() > 0) {
            q0();
            E0(g4);
            A0(g4, 1);
        }
    }

    void v0() {
        this.f31235c.setOnKeyListener(new b());
        this.f31235c.addTextChangedListener(new c());
        if (com.join.mgps.Util.g2.i(this.P)) {
            this.f31235c.setText(this.P);
            this.f31235c.setSelection(this.P.length());
        }
        this.Y = new ArrayList<>();
        this.X = new ArrayList();
        this.Z = new m5(this.f31234b, this.X);
        this.f31257v1 = new ArrayList();
        ForumSearchHintAdapter forumSearchHintAdapter = new ForumSearchHintAdapter(this.f31234b);
        this.A1 = forumSearchHintAdapter;
        forumSearchHintAdapter.f(this.B1);
        this.C.setPreLoadCount(com.join.mgps.Util.j0.f27865e);
        this.C.setAdapter((ListAdapter) this.A1);
        this.C.setPullLoadEnable(new d());
        e eVar = new e();
        this.U = eVar;
        this.C.setPullRefreshEnable(eVar);
        this.C.f();
        this.C.setOnScrollListener(this);
        r0();
        I0(this.E, 8);
        if (this.O == null) {
            this.O = new i();
        }
        this.N.setAdapter((ListAdapter) this.O);
    }

    boolean w0() {
        return com.join.mgps.Util.g2.i(this.f31235c.getText().toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void x0() {
        try {
            y0();
            if (com.join.android.app.common.utils.j.j(this.f31234b)) {
                z0();
            } else {
                showToast(getString(R.string.net_connect_failed));
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void y0() {
        ArrayList arrayList = new ArrayList();
        List<ForumSearchRecordTable> i4 = b2.s.n().i(0L, 10L, "create_time", false);
        this.Y.clear();
        if (i4 != null) {
            for (ForumSearchRecordTable forumSearchRecordTable : i4) {
                this.Y.add(forumSearchRecordTable.getName());
            }
        }
        ArrayList<String> arrayList2 = this.Y;
        if (arrayList2 != null && arrayList2.size() > 0) {
            for (int i5 = 0; i5 < this.Y.size(); i5++) {
                SearchAutoDataBean searchAutoDataBean = new SearchAutoDataBean();
                searchAutoDataBean.setCrc_sign_id("");
                searchAutoDataBean.setGame_name(this.Y.get(i5));
                arrayList.add(searchAutoDataBean);
            }
        }
        this.X.clear();
        this.X.addAll(arrayList);
        notifyUi();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void z0() {
        if (com.join.android.app.common.utils.j.j(this.f31234b)) {
            try {
                ForumResponse<ForumData.ForumSearchIndexData> e5 = this.Q.e("");
                if (e5 != null && e5.getError() == 0 && e5.getData() != null) {
                    this.f31249p0 = e5.getData().getRecommend();
                } else {
                    this.f31249p0 = null;
                }
                notifyUi();
                return;
            } catch (Exception e6) {
                e6.printStackTrace();
                serverConnectionException();
                notifyUi();
                return;
            }
        }
        notifyUi();
    }
}
