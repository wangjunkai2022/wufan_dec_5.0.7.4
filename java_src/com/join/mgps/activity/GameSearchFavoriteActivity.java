package com.join.mgps.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.RequestBeanUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.customview.XListView2;
import com.join.mgps.dto.CollectionBeanSub;
import com.join.mgps.dto.CommonRequestBean;
import com.join.mgps.dto.ResultResMainBean;
import com.join.mgps.dto.SearchAppBean;
import java.util.ArrayList;
import java.util.List;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
@EActivity(R.layout.activity_game_search_favorite)
/* loaded from: classes4.dex */
public class GameSearchFavoriteActivity extends Activity {

    /* renamed from: t  reason: collision with root package name */
    public static final int f32756t = 1;

    /* renamed from: u  reason: collision with root package name */
    public static final int f32757u = 2;

    /* renamed from: v  reason: collision with root package name */
    private static final int f32758v = 10;
    @Extra

    /* renamed from: b  reason: collision with root package name */
    int f32759b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    EditText f32760c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    RelativeLayout f32761d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    RelativeLayout f32762e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    ImageView f32763f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    TextView f32764g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    LinearLayout f32765h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    LinearLayout f32766i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    XListView2 f32767j;

    /* renamed from: k  reason: collision with root package name */
    com.join.mgps.adapter.a3 f32768k;
    @Bean

    /* renamed from: m  reason: collision with root package name */
    com.join.mgps.Util.b f32770m;

    /* renamed from: n  reason: collision with root package name */
    com.join.mgps.rpc.i f32771n;

    /* renamed from: o  reason: collision with root package name */
    com.join.mgps.rpc.e f32772o;

    /* renamed from: p  reason: collision with root package name */
    String f32773p;

    /* renamed from: l  reason: collision with root package name */
    List<Object> f32769l = new ArrayList();

    /* renamed from: q  reason: collision with root package name */
    private boolean f32774q = false;

    /* renamed from: r  reason: collision with root package name */
    private int f32775r = 1;

    /* renamed from: s  reason: collision with root package name */
    int f32776s = 20;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameSearchFavoriteActivity.this.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements com.join.mgps.customview.f {
        b() {
        }

        @Override // com.join.mgps.customview.f
        public void onLoadMore() {
            if (GameSearchFavoriteActivity.this.f32774q) {
                if (!com.join.android.app.common.utils.j.j(GameSearchFavoriteActivity.this)) {
                    GameSearchFavoriteActivity.this.f32767j.u();
                    GameSearchFavoriteActivity.this.n("网络连接异常，请检查网络连接");
                    return;
                }
                GameSearchFavoriteActivity.this.e();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c implements TextWatcher {
        c() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (TextUtils.isEmpty(editable)) {
                return;
            }
            if (com.join.android.app.common.utils.j.j(GameSearchFavoriteActivity.this)) {
                GameSearchFavoriteActivity.this.f32775r = 1;
                GameSearchFavoriteActivity.this.f32773p = editable.toString();
                GameSearchFavoriteActivity.this.e();
                return;
            }
            GameSearchFavoriteActivity.this.n("当前网络不可用");
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d implements com.join.mgps.customview.f {
        d() {
        }

        @Override // com.join.mgps.customview.f
        public void onLoadMore() {
            if (GameSearchFavoriteActivity.this.f32774q) {
                if (!com.join.android.app.common.utils.j.j(GameSearchFavoriteActivity.this)) {
                    GameSearchFavoriteActivity.this.f32767j.u();
                    GameSearchFavoriteActivity.this.n("网络连接异常，请检查网络连接");
                    return;
                }
                GameSearchFavoriteActivity.this.e();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class e implements AdapterView.OnItemClickListener {
        e() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i4, long j4) {
            Intent intent = new Intent();
            intent.putExtra("gameInfo", (CollectionBeanSub) GameSearchFavoriteActivity.this.f32769l.get(i4));
            GameSearchFavoriteActivity.this.setResult(-1, intent);
            GameSearchFavoriteActivity.this.finish();
        }
    }

    private void f() {
        if (com.join.android.app.common.utils.j.j(this)) {
            m();
            e();
            return;
        }
        l();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void c() {
        this.f32771n = com.join.mgps.rpc.impl.g.A0();
        this.f32772o = com.join.mgps.rpc.impl.d.P1();
        if (this.f32759b == 2) {
            this.f32764g.setText("我的收藏");
            this.f32761d.setVisibility(0);
            this.f32762e.setVisibility(8);
            this.f32761d.findViewById(R.id.back_image).setOnClickListener(new a());
            this.f32767j.setPullLoadEnable(new b());
        } else {
            this.f32761d.setVisibility(8);
            this.f32762e.setVisibility(0);
            this.f32760c.addTextChangedListener(new c());
            this.f32767j.setPullLoadEnable(new d());
        }
        com.join.mgps.adapter.a3 a3Var = new com.join.mgps.adapter.a3(this.f32769l);
        this.f32768k = a3Var;
        this.f32767j.setAdapter((ListAdapter) a3Var);
        this.f32767j.setOnItemClickListener(new e());
        this.f32767j.setVisibility(8);
        if (this.f32759b == 2) {
            f();
            return;
        }
        this.f32765h.setVisibility(8);
        this.f32766i.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void d() {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void e() {
        if (this.f32759b == 1) {
            try {
                SearchAppBean l02 = this.f32772o.l0(g(this.f32773p, this.f32775r));
                if (i()) {
                    return;
                }
                List<CollectionBeanSub> list = l02.getMessages().getData().getList();
                if (list != null && list.size() > 0) {
                    this.f32774q = list.size() >= this.f32776s;
                } else if (this.f32775r > 1) {
                    this.f32774q = false;
                }
                o(list);
                return;
            } catch (Exception unused) {
                if (this.f32775r <= 1) {
                    n("网络异常，请重试");
                    return;
                }
                return;
            }
        }
        try {
            ResultResMainBean<List<CollectionBeanSub>> o02 = this.f32771n.o0(this.f32770m.getUid(), this.f32775r);
            if (i()) {
                return;
            }
            if (o02 != null && o02.getData() != null) {
                List<CollectionBeanSub> data = o02.getData();
                if (data != null && data.size() > 0) {
                    this.f32774q = data.size() >= 10;
                } else {
                    this.f32774q = false;
                }
                if (this.f32775r <= 1) {
                    h();
                }
                o(data);
                return;
            }
            if (this.f32775r <= 1) {
                l();
            }
        } catch (Exception unused2) {
            if (this.f32775r <= 1) {
                l();
            }
        }
    }

    CommonRequestBean g(String str, int i4) {
        return RequestBeanUtil.getInstance(this).getSearchAutoRequestBean("searchInfo", str, i4, this.f32776s, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void h() {
        this.f32765h.setVisibility(8);
        this.f32766i.setVisibility(8);
    }

    boolean i() {
        if (isFinishing()) {
            return true;
        }
        return Build.VERSION.SDK_INT >= 17 && isDestroyed();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void j() {
        f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void k() {
        UtilsMy.w3(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void l() {
        this.f32765h.setVisibility(8);
        this.f32766i.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void m() {
        this.f32765h.setVisibility(0);
        this.f32766i.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void n(String str) {
        if (i()) {
            return;
        }
        com.join.mgps.Util.l2.a(this).b(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void o(List<CollectionBeanSub> list) {
        if (this.f32767j.getVisibility() == 8) {
            this.f32767j.setVisibility(0);
        }
        if (this.f32775r <= 1) {
            this.f32769l.clear();
        }
        if (list != null && list.size() > 0) {
            this.f32769l.addAll(list);
        }
        this.f32767j.v();
        if (!this.f32774q) {
            this.f32767j.setNoMore();
        } else {
            this.f32775r++;
            this.f32767j.u();
        }
        this.f32768k.notifyDataSetChanged();
    }
}
