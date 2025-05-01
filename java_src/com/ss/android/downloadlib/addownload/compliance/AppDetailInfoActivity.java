package com.ss.android.downloadlib.addownload.compliance;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.sdk.openadsdk.R;
import java.util.List;
/* loaded from: classes5.dex */
public class AppDetailInfoActivity extends Activity {

    /* renamed from: i  reason: collision with root package name */
    private RecyclerView f60397i;

    /* renamed from: m  reason: collision with root package name */
    private TextView f60398m;

    /* renamed from: n  reason: collision with root package name */
    private List<Pair<String, String>> f60399n;

    /* renamed from: o  reason: collision with root package name */
    private long f60400o;

    /* renamed from: p  reason: collision with root package name */
    private LinearLayout f60401p;

    /* renamed from: u  reason: collision with root package name */
    private long f60402u;
    private ImageView vv;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public class vv extends RecyclerView.Adapter<Object> {
        private vv() {
        }
    }

    private void m() {
        this.vv = (ImageView) findViewById(R.id.iv_detail_back);
        this.f60398m = (TextView) findViewById(R.id.tv_empty);
        this.f60397i = (RecyclerView) findViewById(R.id.permission_list);
        this.f60401p = (LinearLayout) findViewById(R.id.ll_download);
        if (this.f60399n.isEmpty()) {
            this.f60397i.setVisibility(8);
            this.f60398m.setVisibility(0);
        } else {
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
            linearLayoutManager.setOrientation(1);
            this.f60397i.setLayoutManager(linearLayoutManager);
            this.f60397i.setAdapter(new vv());
        }
        this.vv.setOnClickListener(new View.OnClickListener() { // from class: com.ss.android.downloadlib.addownload.compliance.AppDetailInfoActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                n.vv("lp_app_detail_click_close", AppDetailInfoActivity.this.f60402u);
                AppDetailInfoActivity.this.finish();
            }
        });
        this.f60401p.setOnClickListener(new View.OnClickListener() { // from class: com.ss.android.downloadlib.addownload.compliance.AppDetailInfoActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                n.vv("lp_app_detail_click_download", AppDetailInfoActivity.this.f60402u);
                m.vv().m(AppDetailInfoActivity.this.f60402u);
                com.ss.android.socialbase.appdownloader.p.vv((Activity) AppDetailInfoActivity.this);
                com.ss.android.socialbase.appdownloader.p.vv(m.vv().m());
            }
        });
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        n.vv("lp_app_detail_click_close", this.f60402u);
        super.onBackPressed();
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.ttdownloader_activity_app_detail_info);
        if (vv()) {
            m();
        } else {
            com.ss.android.socialbase.appdownloader.p.vv((Activity) this);
        }
    }

    public static void vv(Activity activity, long j4) {
        Intent intent = new Intent(activity, AppDetailInfoActivity.class);
        intent.putExtra("app_info_id", j4);
        activity.startActivity(intent);
    }

    private boolean vv() {
        this.f60400o = getIntent().getLongExtra("app_info_id", 0L);
        com.ss.android.downloadlib.addownload.m.m vv2 = p.vv().vv(this.f60400o);
        if (vv2 == null) {
            return false;
        }
        this.f60402u = vv2.f60502m;
        this.f60399n = vv2.qv;
        return true;
    }
}
