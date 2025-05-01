package com.join.mgps.activity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.utils.JsonMapper;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.pref.PrefDef_;
import java.io.File;
import java.io.IOException;
/* loaded from: classes4.dex */
public class CopyDialogActivity extends Activity {

    /* renamed from: b  reason: collision with root package name */
    String f29655b;

    /* renamed from: c  reason: collision with root package name */
    DownloadTask f29656c;

    /* renamed from: d  reason: collision with root package name */
    Context f29657d;

    /* renamed from: e  reason: collision with root package name */
    Handler f29658e = new Handler(new a());

    /* loaded from: classes4.dex */
    class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(@NonNull Message message) {
            CopyDialogActivity copyDialogActivity = CopyDialogActivity.this;
            UtilsMy.T3(copyDialogActivity, copyDialogActivity.f29656c);
            CopyDialogActivity.this.finish();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b extends Thread {
        b() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            File file = new File(CopyDialogActivity.this.f29656c.getGameZipPath());
            String h4 = com.join.mgps.pref.h.n(CopyDialogActivity.this.f29657d).h();
            if (com.join.mgps.Util.g2.h(h4)) {
                UtilsMy.U2(new PrefDef_(CopyDialogActivity.this.f29657d), CopyDialogActivity.this.f29657d);
                h4 = com.join.mgps.pref.h.n(CopyDialogActivity.this.f29657d).h();
            }
            String str = h4 + CopyDialogActivity.this.f29656c.getPlugin_num() + File.separator + file.getParentFile().getName();
            if (str.contains(file.getAbsolutePath())) {
                CopyDialogActivity.this.f29658e.sendEmptyMessage(1);
                return;
            }
            try {
                File file2 = new File(str);
                if (!file2.exists()) {
                    file2.mkdirs();
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            try {
                com.join.mgps.Util.g0.a(file.getParent(), str);
            } catch (IOException e6) {
                e6.printStackTrace();
            }
            CopyDialogActivity.this.f29656c.setGameZipPath(str + File.separator + file.getName());
            p1.f.K().update(CopyDialogActivity.this.f29656c);
            try {
                com.join.mgps.Util.g0.A(".downloadTask", str, JsonMapper.getInstance().toJson(CopyDialogActivity.this.f29656c));
            } catch (IOException e7) {
                e7.printStackTrace();
            }
            CopyDialogActivity.this.f29658e.sendEmptyMessage(1);
        }
    }

    private void a() {
        new b().start();
    }

    @Override // android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.loding_layout);
        this.f29655b = getIntent().getStringExtra("gameid");
        this.f29657d = this;
        ((TextView) findViewById(R.id.textView)).setText("正在拷贝中请稍后");
        DownloadTask F = p1.f.K().F(this.f29655b);
        this.f29656c = F;
        if (F == null) {
            finish();
        } else {
            a();
        }
    }
}
