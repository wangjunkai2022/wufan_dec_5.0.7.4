package com.join.mgps.activity;

import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.BaseActivity;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.adapter.x4;
import com.join.mgps.dto.CollectionBeanSub;
import com.join.mgps.dto.RecomeWifiDatabean;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;
@EActivity(R.layout.recom_wifi_activity_layout)
/* loaded from: classes4.dex */
public class RecomWifiActivity extends BaseActivity implements c2.e {
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    ImageView f37097b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    LinearLayout f37098c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    GridView f37099d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    Button f37100e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    TextView f37101f;

    /* renamed from: g  reason: collision with root package name */
    List<CollectionBeanSub> f37102g;

    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            RecomWifiActivity.this.finish();
        }
    }

    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ x4 f37104b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f37105c;

        b(x4 x4Var, List list) {
            this.f37104b = x4Var;
            this.f37105c = list;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            RecomWifiActivity.this.finish();
            for (CollectionBeanSub collectionBeanSub : this.f37104b.b()) {
                boolean z4 = true;
                List list = this.f37105c;
                if (list != null) {
                    Iterator it2 = list.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (((DownloadTask) it2.next()).getCrc_link_type_val().equals(collectionBeanSub.getGame_id())) {
                                z4 = false;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                if (z4) {
                    com.php25.PDownload.d.c(collectionBeanSub.getDownloadtaskDown(), RecomWifiActivity.this);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterview() {
        RecomeWifiDatabean recomeWifiDatabean = (RecomeWifiDatabean) getIntent().getSerializableExtra("data");
        this.f37102g = recomeWifiDatabean.getGame_list();
        String title = recomeWifiDatabean.getTitle();
        if (com.join.mgps.Util.g2.i(title)) {
            this.f37101f.setText(title);
        }
        this.f37098c.setVisibility(0);
        List<DownloadTask> d5 = p1.f.K().d();
        this.f37097b.setOnClickListener(new a());
        x4 x4Var = new x4(this, this.f37102g);
        float f5 = 0.0f;
        for (CollectionBeanSub collectionBeanSub : this.f37102g) {
            f5 += Float.parseFloat(collectionBeanSub.getSize());
        }
        String format = new DecimalFormat(".00").format(f5);
        Button button = this.f37100e;
        button.setText("下载（" + this.f37102g.size() + "个，共" + format + "MB)");
        this.f37099d.setAdapter((ListAdapter) x4Var);
        this.f37100e.setOnClickListener(new b(x4Var, d5));
    }

    public c2.e g0() {
        return this;
    }

    @Override // c2.e
    public void o(List<CollectionBeanSub> list) {
        float f5 = 0.0f;
        for (CollectionBeanSub collectionBeanSub : list) {
            f5 += Float.parseFloat(collectionBeanSub.getSize());
        }
        String format = new DecimalFormat(".00").format(f5);
        Button button = this.f37100e;
        button.setText("下载（" + list.size() + "个，共" + format + "MB)");
    }
}
