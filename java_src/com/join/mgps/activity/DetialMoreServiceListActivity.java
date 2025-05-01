package com.join.mgps.activity;

import android.content.Context;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.BaseActivity;
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.ui.coupon.ServerListData;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.customview.CustomerDownloadView;
import com.join.mgps.customview.XListView;
import com.join.mgps.dto.RequestGameIdArgs;
import com.join.mgps.dto.RequestModel;
import com.join.mgps.dto.ResponseModel;
import com.join.mgps.dto.ServiceState;
import java.util.ArrayList;
import java.util.List;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.res.StringRes;
@EActivity(R.layout.gamedetial_more_service_layout)
/* loaded from: classes4.dex */
public class DetialMoreServiceListActivity extends BaseActivity {
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    TextView f29786b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    XListView f29787c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    LinearLayout f29788d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    LinearLayout f29789e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    ImageView f29790f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    ImageView f29791g;
    @ViewById(R.id.title_normal_search_img)

    /* renamed from: h  reason: collision with root package name */
    ImageView f29792h;
    @ViewById(R.id.title_normal_download_cdv)

    /* renamed from: i  reason: collision with root package name */
    CustomerDownloadView f29793i;

    /* renamed from: j  reason: collision with root package name */
    com.join.mgps.rpc.e f29794j;
    @StringRes(resName = "net_excption")

    /* renamed from: k  reason: collision with root package name */
    String f29795k;
    @StringRes(resName = "connect_server_excption")

    /* renamed from: l  reason: collision with root package name */
    String f29796l;
    @Extra

    /* renamed from: m  reason: collision with root package name */
    String f29797m;

    /* renamed from: o  reason: collision with root package name */
    private Context f29799o;

    /* renamed from: q  reason: collision with root package name */
    List<ServiceState> f29801q;

    /* renamed from: r  reason: collision with root package name */
    com.join.mgps.adapter.j f29802r;

    /* renamed from: n  reason: collision with root package name */
    private int f29798n = 1;

    /* renamed from: p  reason: collision with root package name */
    private boolean f29800p = false;

    /* loaded from: classes4.dex */
    class a implements AdapterView.OnItemClickListener {
        a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i4, long j4) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        this.f29794j = com.join.mgps.rpc.impl.d.P1();
        this.f29799o = this;
        com.join.mgps.adapter.j jVar = new com.join.mgps.adapter.j(this.f29799o);
        this.f29802r = jVar;
        this.f29801q = jVar.a();
        showLoding();
        g0();
        this.f29787c.setPreLoadCount(10);
        this.f29787c.b();
        this.f29787c.c();
        this.f29787c.setOnItemClickListener(new a());
        this.f29787c.setAdapter((ListAdapter) this.f29802r);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void back_image() {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void g0() {
        new ArrayList();
        if (com.join.android.app.common.utils.j.j(this.f29799o)) {
            this.f29800p = true;
            try {
                try {
                    RequestModel requestModel = new RequestModel();
                    requestModel.setDefault(this.f29799o);
                    RequestGameIdArgs requestGameIdArgs = new RequestGameIdArgs();
                    requestGameIdArgs.setGameId(this.f29797m);
                    requestGameIdArgs.setPage(1);
                    requestGameIdArgs.setUid(AccountUtil_.getInstance_(this.f29799o).getAccountData().getUid());
                    requestModel.setArgs(requestGameIdArgs);
                    ResponseModel<ServerListData> body = com.join.mgps.rpc.impl.i.D0().B0().K0(requestModel.makeSign()).execute().body();
                    if (body != null && body.getData() != null) {
                        List<ServiceState> game_open_server_list = body.getData().getGame_open_server_list();
                        if (game_open_server_list != null && game_open_server_list.size() > 0) {
                            if (game_open_server_list.size() == 0) {
                                i0();
                            } else {
                                this.f29798n++;
                            }
                            j0(game_open_server_list);
                            k0();
                        } else {
                            i0();
                        }
                    } else {
                        k0();
                        showLodingFailed();
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                    k0();
                    showLodingFailed();
                }
                return;
            } finally {
                this.f29800p = false;
            }
        }
        k0();
        showLodingFailed();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void h0() {
        this.f29798n = 1;
        g0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void i0() {
        this.f29787c.setNoMore();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void j0(List<ServiceState> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        this.f29789e.setVisibility(8);
        this.f29788d.setVisibility(8);
        this.f29787c.setVisibility(0);
        if (this.f29798n <= 2) {
            this.f29801q.clear();
        }
        this.f29801q.addAll(list);
        if (this.f29798n == 2) {
            this.f29786b.setText("开合服表");
            this.f29801q.size();
            this.f29802r.notifyDataSetChanged();
            return;
        }
        this.f29802r.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void k0() {
        this.f29787c.r();
        this.f29787c.q();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void relodingimag() {
        this.f29798n = 1;
        showLoding();
        g0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLoding() {
        this.f29788d.setVisibility(0);
        this.f29789e.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLodingFailed() {
        List<ServiceState> list = this.f29801q;
        if (list == null || list.size() == 0) {
            this.f29789e.setVisibility(0);
            this.f29788d.setVisibility(8);
            this.f29787c.setVisibility(8);
        }
    }
}
