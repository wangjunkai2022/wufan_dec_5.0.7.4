package com.join.mgps.dialog;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.BaseActivity;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.dto.DownloadUrlBean;
import java.util.ArrayList;
import java.util.Iterator;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
@EActivity(R.layout.download_choice_url_layout)
/* loaded from: classes4.dex */
public class DownloadChoiceUrlDialog extends BaseActivity {

    /* renamed from: b  reason: collision with root package name */
    private Context f49048b;
    @Extra

    /* renamed from: c  reason: collision with root package name */
    ArrayList<DownloadUrlBean> f49049c;
    @Extra

    /* renamed from: d  reason: collision with root package name */
    DownloadTask f49050d;
    @Extra

    /* renamed from: e  reason: collision with root package name */
    boolean f49051e;

    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DownloadChoiceUrlDialog.this.finish();
        }
    }

    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ArrayList<DownloadUrlBean> arrayList = DownloadChoiceUrlDialog.this.f49049c;
            if (arrayList != null && arrayList.size() > 0) {
                Iterator<DownloadUrlBean> it2 = DownloadChoiceUrlDialog.this.f49049c.iterator();
                while (it2.hasNext()) {
                    DownloadUrlBean next = it2.next();
                    if (next.getIs_confirm() == 1) {
                        DownloadChoiceUrlDialog.this.f49050d.setUrl(next.getDown_source_url());
                        DownloadChoiceUrlDialog downloadChoiceUrlDialog = DownloadChoiceUrlDialog.this;
                        com.php25.PDownload.d.c(downloadChoiceUrlDialog.f49050d, downloadChoiceUrlDialog.f49048b);
                    }
                }
            }
            DownloadChoiceUrlDialog.this.finish();
        }
    }

    /* loaded from: classes4.dex */
    class c implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DownloadUrlBean f49054b;

        c(DownloadUrlBean downloadUrlBean) {
            this.f49054b = downloadUrlBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DownloadChoiceUrlDialog.this.f49050d.setUrl(this.f49054b.getDown_source_url());
            DownloadChoiceUrlDialog downloadChoiceUrlDialog = DownloadChoiceUrlDialog.this;
            com.php25.PDownload.d.c(downloadChoiceUrlDialog.f49050d, downloadChoiceUrlDialog.f49048b);
            DownloadChoiceUrlDialog.this.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterview() {
        this.f49048b = this;
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.allpath);
        ((TextView) findViewById(R.id.titleText)).setText("选择下载源");
        ((TextView) findViewById(R.id.cancletext)).setOnClickListener(new a());
        ((TextView) findViewById(R.id.ok)).setOnClickListener(new b());
        if (this.f49049c != null) {
            LayoutInflater from = LayoutInflater.from(this);
            Iterator<DownloadUrlBean> it2 = this.f49049c.iterator();
            while (it2.hasNext()) {
                DownloadUrlBean next = it2.next();
                if (next.getDown_url_type() != 1 || this.f49051e) {
                    View inflate = from.inflate(R.layout.download_choice_item, (ViewGroup) null);
                    ((TextView) inflate.findViewById(R.id.downUrlName)).setText(next.getDown_source_name());
                    ((RelativeLayout) inflate.findViewById(R.id.localPathLayout)).setOnClickListener(new c(next));
                    linearLayout.addView(inflate);
                }
            }
        }
    }
}
