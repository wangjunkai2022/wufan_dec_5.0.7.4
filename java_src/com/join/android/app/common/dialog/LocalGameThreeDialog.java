package com.join.android.app.common.dialog;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import androidx.viewpager.widget.ViewPager;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.dialog.LocalGameThreeDialog;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.Util.v;
import com.join.mgps.activity.CheckLocalGameFragment;
import com.join.mgps.activity.CheckLocalGameFragment_;
import com.join.mgps.activity.MGMainActivity;
import com.join.mgps.activity.MGMainActivity_;
import com.join.mgps.adapter.FragmentPagerAdapter;
import com.join.mgps.customview.NoScrollViewPager;
import com.join.mgps.dto.CollectionBeanSub;
import com.join.mgps.event.n;
import com.umeng.analytics.MobclickAgent;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* loaded from: classes.dex */
public class LocalGameThreeDialog extends DialogFragment implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    private Button f14530b;

    /* renamed from: c  reason: collision with root package name */
    private TextView f14531c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f14532d;

    /* renamed from: e  reason: collision with root package name */
    private NoScrollViewPager f14533e;

    /* renamed from: f  reason: collision with root package name */
    public Map<String, CollectionBeanSub> f14534f;

    /* renamed from: g  reason: collision with root package name */
    private FragmentPagerAdapter f14535g;

    /* renamed from: h  reason: collision with root package name */
    private List<DownloadTask> f14536h;

    /* renamed from: j  reason: collision with root package name */
    private String f14538j;

    /* renamed from: k  reason: collision with root package name */
    private String f14539k;

    /* renamed from: l  reason: collision with root package name */
    int f14540l;

    /* renamed from: m  reason: collision with root package name */
    long f14541m;

    /* renamed from: o  reason: collision with root package name */
    private DownloadTask f14543o;

    /* renamed from: i  reason: collision with root package name */
    private boolean f14537i = false;
    @SuppressLint({"HandlerLeak"})

    /* renamed from: n  reason: collision with root package name */
    private Handler f14542n = new c();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements ViewPager.OnPageChangeListener {

        /* renamed from: com.join.android.app.common.dialog.LocalGameThreeDialog$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        class RunnableC0308a implements Runnable {
            RunnableC0308a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                LocalGameThreeDialog.this.s0();
            }
        }

        a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i4) {
            LocalGameThreeDialog.this.f14540l = i4;
            if (i4 == 2) {
                new Handler().postDelayed(new RunnableC0308a(), 300L);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i4, float f5, int i5) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i4) {
        }
    }

    /* loaded from: classes3.dex */
    class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f14546b;

        b(int i4) {
            this.f14546b = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            LocalGameThreeDialog.this.f14533e.setCurrentItem(this.f14546b + 1);
            TextView textView = LocalGameThreeDialog.this.f14531c;
            textView.setText((this.f14546b + 2) + net.lingala.zip4j.util.e.F0 + LocalGameThreeDialog.this.f14534f.size());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class c extends Handler {
        c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b() {
            LocalGameThreeDialog.this.dismissAllowingStateLoss();
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int currentItem = LocalGameThreeDialog.this.f14533e.getCurrentItem();
            Context activity = LocalGameThreeDialog.this.getActivity();
            if (activity == null) {
                activity = LocalGameThreeDialog.this.getContext();
            }
            switch (message.what) {
                case 0:
                    LocalGameThreeDialog.this.f14530b.setText("确定");
                    LocalGameThreeDialog.this.f14530b.setEnabled(true);
                    LocalGameThreeDialog.this.f14532d.setEnabled(true);
                    if (activity != null) {
                        Toast.makeText(activity, "游戏检测完成！", 0).show();
                    }
                    new Handler().postDelayed(new Runnable() { // from class: com.join.android.app.common.dialog.j
                        @Override // java.lang.Runnable
                        public final void run() {
                            LocalGameThreeDialog.c.this.b();
                        }
                    }, 500L);
                    break;
                case 1:
                    LocalGameThreeDialog.this.r0();
                    break;
                case 2:
                    LocalGameThreeDialog.this.f14530b.setText("确定");
                    LocalGameThreeDialog.this.f14530b.setEnabled(true);
                    LocalGameThreeDialog.this.f14532d.setEnabled(true);
                    if (activity != null) {
                        Toast.makeText(activity, "游戏已存在！", 0).show();
                    }
                    if (currentItem + 1 < LocalGameThreeDialog.this.f14534f.size()) {
                        LocalGameThreeDialog.this.r0();
                        break;
                    } else {
                        Message message2 = new Message();
                        message2.what = 0;
                        LocalGameThreeDialog.this.f14542n.sendMessage(message2);
                        break;
                    }
                case 3:
                    LocalGameThreeDialog.this.f14530b.setText("确定");
                    LocalGameThreeDialog.this.f14530b.setEnabled(true);
                    LocalGameThreeDialog.this.f14532d.setEnabled(true);
                    if (activity != null) {
                        Toast.makeText(activity, "游戏已存在，但是未完成！", 0).show();
                    }
                    if (currentItem + 1 < LocalGameThreeDialog.this.f14534f.size()) {
                        LocalGameThreeDialog.this.r0();
                        break;
                    } else {
                        Message message3 = new Message();
                        message3.what = 0;
                        LocalGameThreeDialog.this.f14542n.sendMessage(message3);
                        break;
                    }
                case 4:
                    LocalGameThreeDialog.this.f14530b.setText("解压中");
                    break;
                case 5:
                    if (currentItem + 1 < LocalGameThreeDialog.this.f14534f.size()) {
                        if (activity != null) {
                            Toast.makeText(activity, "文件复制出错！", 0).show();
                        }
                        LocalGameThreeDialog.this.r0();
                        break;
                    }
                    break;
                case 6:
                    LocalGameThreeDialog.this.f14530b.setText("正在初始化");
                    LocalGameThreeDialog.this.f14530b.setEnabled(false);
                    LocalGameThreeDialog.this.f14532d.setEnabled(false);
                    break;
                case 7:
                    LocalGameThreeDialog.this.f14530b.setText("确定");
                    LocalGameThreeDialog.this.f14530b.setEnabled(true);
                    LocalGameThreeDialog.this.f14532d.setEnabled(true);
                    if (activity != null) {
                        Toast.makeText(activity, "文件初始化失败，请重试！", 0).show();
                        break;
                    }
                    break;
                case 8:
                    LocalGameThreeDialog.this.f14530b.setText("确定");
                    LocalGameThreeDialog.this.f14530b.setEnabled(true);
                    LocalGameThreeDialog.this.f14532d.setEnabled(true);
                    break;
                case 9:
                    LocalGameThreeDialog.this.f14530b.setText("确定");
                    LocalGameThreeDialog.this.f14530b.setEnabled(true);
                    LocalGameThreeDialog.this.f14532d.setEnabled(true);
                    if (activity != null) {
                        Toast.makeText(activity, "解压失败，请重试！", 0).show();
                        break;
                    }
                    break;
            }
            super.handleMessage(message);
        }
    }

    /* loaded from: classes3.dex */
    class d implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        Boolean f14549b;

        /* renamed from: c  reason: collision with root package name */
        Boolean f14550c;

        d() {
            Boolean bool = Boolean.FALSE;
            this.f14549b = bool;
            this.f14550c = bool;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:105:0x01f9 A[Catch: IOException -> 0x0257, TRY_ENTER, TryCatch #19 {IOException -> 0x0257, blocks: (B:105:0x01f9, B:107:0x01fe, B:109:0x0203, B:111:0x0208, B:116:0x0226, B:118:0x022b, B:120:0x0230, B:122:0x0235, B:127:0x0253, B:131:0x025b, B:133:0x0260, B:135:0x0265, B:92:0x01c4, B:94:0x01c9, B:96:0x01ce, B:98:0x01d3), top: B:163:0x000f }] */
        /* JADX WARN: Removed duplicated region for block: B:107:0x01fe A[Catch: IOException -> 0x0257, TryCatch #19 {IOException -> 0x0257, blocks: (B:105:0x01f9, B:107:0x01fe, B:109:0x0203, B:111:0x0208, B:116:0x0226, B:118:0x022b, B:120:0x0230, B:122:0x0235, B:127:0x0253, B:131:0x025b, B:133:0x0260, B:135:0x0265, B:92:0x01c4, B:94:0x01c9, B:96:0x01ce, B:98:0x01d3), top: B:163:0x000f }] */
        /* JADX WARN: Removed duplicated region for block: B:109:0x0203 A[Catch: IOException -> 0x0257, TryCatch #19 {IOException -> 0x0257, blocks: (B:105:0x01f9, B:107:0x01fe, B:109:0x0203, B:111:0x0208, B:116:0x0226, B:118:0x022b, B:120:0x0230, B:122:0x0235, B:127:0x0253, B:131:0x025b, B:133:0x0260, B:135:0x0265, B:92:0x01c4, B:94:0x01c9, B:96:0x01ce, B:98:0x01d3), top: B:163:0x000f }] */
        /* JADX WARN: Removed duplicated region for block: B:111:0x0208 A[Catch: IOException -> 0x0257, TRY_LEAVE, TryCatch #19 {IOException -> 0x0257, blocks: (B:105:0x01f9, B:107:0x01fe, B:109:0x0203, B:111:0x0208, B:116:0x0226, B:118:0x022b, B:120:0x0230, B:122:0x0235, B:127:0x0253, B:131:0x025b, B:133:0x0260, B:135:0x0265, B:92:0x01c4, B:94:0x01c9, B:96:0x01ce, B:98:0x01d3), top: B:163:0x000f }] */
        /* JADX WARN: Removed duplicated region for block: B:116:0x0226 A[Catch: IOException -> 0x0257, TRY_ENTER, TryCatch #19 {IOException -> 0x0257, blocks: (B:105:0x01f9, B:107:0x01fe, B:109:0x0203, B:111:0x0208, B:116:0x0226, B:118:0x022b, B:120:0x0230, B:122:0x0235, B:127:0x0253, B:131:0x025b, B:133:0x0260, B:135:0x0265, B:92:0x01c4, B:94:0x01c9, B:96:0x01ce, B:98:0x01d3), top: B:163:0x000f }] */
        /* JADX WARN: Removed duplicated region for block: B:118:0x022b A[Catch: IOException -> 0x0257, TryCatch #19 {IOException -> 0x0257, blocks: (B:105:0x01f9, B:107:0x01fe, B:109:0x0203, B:111:0x0208, B:116:0x0226, B:118:0x022b, B:120:0x0230, B:122:0x0235, B:127:0x0253, B:131:0x025b, B:133:0x0260, B:135:0x0265, B:92:0x01c4, B:94:0x01c9, B:96:0x01ce, B:98:0x01d3), top: B:163:0x000f }] */
        /* JADX WARN: Removed duplicated region for block: B:120:0x0230 A[Catch: IOException -> 0x0257, TryCatch #19 {IOException -> 0x0257, blocks: (B:105:0x01f9, B:107:0x01fe, B:109:0x0203, B:111:0x0208, B:116:0x0226, B:118:0x022b, B:120:0x0230, B:122:0x0235, B:127:0x0253, B:131:0x025b, B:133:0x0260, B:135:0x0265, B:92:0x01c4, B:94:0x01c9, B:96:0x01ce, B:98:0x01d3), top: B:163:0x000f }] */
        /* JADX WARN: Removed duplicated region for block: B:122:0x0235 A[Catch: IOException -> 0x0257, TRY_LEAVE, TryCatch #19 {IOException -> 0x0257, blocks: (B:105:0x01f9, B:107:0x01fe, B:109:0x0203, B:111:0x0208, B:116:0x0226, B:118:0x022b, B:120:0x0230, B:122:0x0235, B:127:0x0253, B:131:0x025b, B:133:0x0260, B:135:0x0265, B:92:0x01c4, B:94:0x01c9, B:96:0x01ce, B:98:0x01d3), top: B:163:0x000f }] */
        /* JADX WARN: Removed duplicated region for block: B:127:0x0253 A[Catch: IOException -> 0x0257, TRY_ENTER, TryCatch #19 {IOException -> 0x0257, blocks: (B:105:0x01f9, B:107:0x01fe, B:109:0x0203, B:111:0x0208, B:116:0x0226, B:118:0x022b, B:120:0x0230, B:122:0x0235, B:127:0x0253, B:131:0x025b, B:133:0x0260, B:135:0x0265, B:92:0x01c4, B:94:0x01c9, B:96:0x01ce, B:98:0x01d3), top: B:163:0x000f }] */
        /* JADX WARN: Removed duplicated region for block: B:131:0x025b A[Catch: IOException -> 0x0257, TryCatch #19 {IOException -> 0x0257, blocks: (B:105:0x01f9, B:107:0x01fe, B:109:0x0203, B:111:0x0208, B:116:0x0226, B:118:0x022b, B:120:0x0230, B:122:0x0235, B:127:0x0253, B:131:0x025b, B:133:0x0260, B:135:0x0265, B:92:0x01c4, B:94:0x01c9, B:96:0x01ce, B:98:0x01d3), top: B:163:0x000f }] */
        /* JADX WARN: Removed duplicated region for block: B:133:0x0260 A[Catch: IOException -> 0x0257, TryCatch #19 {IOException -> 0x0257, blocks: (B:105:0x01f9, B:107:0x01fe, B:109:0x0203, B:111:0x0208, B:116:0x0226, B:118:0x022b, B:120:0x0230, B:122:0x0235, B:127:0x0253, B:131:0x025b, B:133:0x0260, B:135:0x0265, B:92:0x01c4, B:94:0x01c9, B:96:0x01ce, B:98:0x01d3), top: B:163:0x000f }] */
        /* JADX WARN: Removed duplicated region for block: B:135:0x0265 A[Catch: IOException -> 0x0257, TRY_LEAVE, TryCatch #19 {IOException -> 0x0257, blocks: (B:105:0x01f9, B:107:0x01fe, B:109:0x0203, B:111:0x0208, B:116:0x0226, B:118:0x022b, B:120:0x0230, B:122:0x0235, B:127:0x0253, B:131:0x025b, B:133:0x0260, B:135:0x0265, B:92:0x01c4, B:94:0x01c9, B:96:0x01ce, B:98:0x01d3), top: B:163:0x000f }] */
        /* JADX WARN: Removed duplicated region for block: B:146:0x0279 A[Catch: IOException -> 0x0275, TryCatch #0 {IOException -> 0x0275, blocks: (B:142:0x0271, B:146:0x0279, B:148:0x027e, B:150:0x0283), top: B:156:0x0271 }] */
        /* JADX WARN: Removed duplicated region for block: B:148:0x027e A[Catch: IOException -> 0x0275, TryCatch #0 {IOException -> 0x0275, blocks: (B:142:0x0271, B:146:0x0279, B:148:0x027e, B:150:0x0283), top: B:156:0x0271 }] */
        /* JADX WARN: Removed duplicated region for block: B:150:0x0283 A[Catch: IOException -> 0x0275, TRY_LEAVE, TryCatch #0 {IOException -> 0x0275, blocks: (B:142:0x0271, B:146:0x0279, B:148:0x027e, B:150:0x0283), top: B:156:0x0271 }] */
        /* JADX WARN: Removed duplicated region for block: B:156:0x0271 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r12v17, types: [java.lang.StringBuilder] */
        /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r3v10 */
        /* JADX WARN: Type inference failed for: r3v11, types: [java.io.BufferedInputStream] */
        /* JADX WARN: Type inference failed for: r3v14 */
        /* JADX WARN: Type inference failed for: r3v33 */
        /* JADX WARN: Type inference failed for: r3v34 */
        /* JADX WARN: Type inference failed for: r3v35 */
        /* JADX WARN: Type inference failed for: r3v36 */
        /* JADX WARN: Type inference failed for: r3v4 */
        /* JADX WARN: Type inference failed for: r3v5 */
        /* JADX WARN: Type inference failed for: r3v52 */
        /* JADX WARN: Type inference failed for: r3v53 */
        /* JADX WARN: Type inference failed for: r3v54 */
        /* JADX WARN: Type inference failed for: r3v6 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void a(com.github.snowdream.android.app.downloader.DownloadTask r21, int r22, java.lang.String r23) {
            /*
                Method dump skipped, instructions count: 653
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.join.android.app.common.dialog.LocalGameThreeDialog.d.a(com.github.snowdream.android.app.downloader.DownloadTask, int, java.lang.String):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:123:0x0350 A[Catch: IOException -> 0x03b6, TRY_ENTER, TryCatch #5 {IOException -> 0x03b6, blocks: (B:136:0x0381, B:138:0x0386, B:140:0x038b, B:142:0x0390, B:149:0x03b2, B:153:0x03ba, B:155:0x03bf, B:157:0x03c4, B:123:0x0350, B:125:0x0355, B:127:0x035a, B:129:0x035f, B:106:0x0311, B:108:0x0316, B:110:0x031b, B:112:0x0320), top: B:181:0x0017 }] */
        /* JADX WARN: Removed duplicated region for block: B:125:0x0355 A[Catch: IOException -> 0x03b6, TryCatch #5 {IOException -> 0x03b6, blocks: (B:136:0x0381, B:138:0x0386, B:140:0x038b, B:142:0x0390, B:149:0x03b2, B:153:0x03ba, B:155:0x03bf, B:157:0x03c4, B:123:0x0350, B:125:0x0355, B:127:0x035a, B:129:0x035f, B:106:0x0311, B:108:0x0316, B:110:0x031b, B:112:0x0320), top: B:181:0x0017 }] */
        /* JADX WARN: Removed duplicated region for block: B:127:0x035a A[Catch: IOException -> 0x03b6, TryCatch #5 {IOException -> 0x03b6, blocks: (B:136:0x0381, B:138:0x0386, B:140:0x038b, B:142:0x0390, B:149:0x03b2, B:153:0x03ba, B:155:0x03bf, B:157:0x03c4, B:123:0x0350, B:125:0x0355, B:127:0x035a, B:129:0x035f, B:106:0x0311, B:108:0x0316, B:110:0x031b, B:112:0x0320), top: B:181:0x0017 }] */
        /* JADX WARN: Removed duplicated region for block: B:129:0x035f A[Catch: IOException -> 0x03b6, TRY_LEAVE, TryCatch #5 {IOException -> 0x03b6, blocks: (B:136:0x0381, B:138:0x0386, B:140:0x038b, B:142:0x0390, B:149:0x03b2, B:153:0x03ba, B:155:0x03bf, B:157:0x03c4, B:123:0x0350, B:125:0x0355, B:127:0x035a, B:129:0x035f, B:106:0x0311, B:108:0x0316, B:110:0x031b, B:112:0x0320), top: B:181:0x0017 }] */
        /* JADX WARN: Removed duplicated region for block: B:136:0x0381 A[Catch: IOException -> 0x03b6, TRY_ENTER, TryCatch #5 {IOException -> 0x03b6, blocks: (B:136:0x0381, B:138:0x0386, B:140:0x038b, B:142:0x0390, B:149:0x03b2, B:153:0x03ba, B:155:0x03bf, B:157:0x03c4, B:123:0x0350, B:125:0x0355, B:127:0x035a, B:129:0x035f, B:106:0x0311, B:108:0x0316, B:110:0x031b, B:112:0x0320), top: B:181:0x0017 }] */
        /* JADX WARN: Removed duplicated region for block: B:138:0x0386 A[Catch: IOException -> 0x03b6, TryCatch #5 {IOException -> 0x03b6, blocks: (B:136:0x0381, B:138:0x0386, B:140:0x038b, B:142:0x0390, B:149:0x03b2, B:153:0x03ba, B:155:0x03bf, B:157:0x03c4, B:123:0x0350, B:125:0x0355, B:127:0x035a, B:129:0x035f, B:106:0x0311, B:108:0x0316, B:110:0x031b, B:112:0x0320), top: B:181:0x0017 }] */
        /* JADX WARN: Removed duplicated region for block: B:140:0x038b A[Catch: IOException -> 0x03b6, TryCatch #5 {IOException -> 0x03b6, blocks: (B:136:0x0381, B:138:0x0386, B:140:0x038b, B:142:0x0390, B:149:0x03b2, B:153:0x03ba, B:155:0x03bf, B:157:0x03c4, B:123:0x0350, B:125:0x0355, B:127:0x035a, B:129:0x035f, B:106:0x0311, B:108:0x0316, B:110:0x031b, B:112:0x0320), top: B:181:0x0017 }] */
        /* JADX WARN: Removed duplicated region for block: B:142:0x0390 A[Catch: IOException -> 0x03b6, TRY_LEAVE, TryCatch #5 {IOException -> 0x03b6, blocks: (B:136:0x0381, B:138:0x0386, B:140:0x038b, B:142:0x0390, B:149:0x03b2, B:153:0x03ba, B:155:0x03bf, B:157:0x03c4, B:123:0x0350, B:125:0x0355, B:127:0x035a, B:129:0x035f, B:106:0x0311, B:108:0x0316, B:110:0x031b, B:112:0x0320), top: B:181:0x0017 }] */
        /* JADX WARN: Removed duplicated region for block: B:149:0x03b2 A[Catch: IOException -> 0x03b6, TRY_ENTER, TryCatch #5 {IOException -> 0x03b6, blocks: (B:136:0x0381, B:138:0x0386, B:140:0x038b, B:142:0x0390, B:149:0x03b2, B:153:0x03ba, B:155:0x03bf, B:157:0x03c4, B:123:0x0350, B:125:0x0355, B:127:0x035a, B:129:0x035f, B:106:0x0311, B:108:0x0316, B:110:0x031b, B:112:0x0320), top: B:181:0x0017 }] */
        /* JADX WARN: Removed duplicated region for block: B:153:0x03ba A[Catch: IOException -> 0x03b6, TryCatch #5 {IOException -> 0x03b6, blocks: (B:136:0x0381, B:138:0x0386, B:140:0x038b, B:142:0x0390, B:149:0x03b2, B:153:0x03ba, B:155:0x03bf, B:157:0x03c4, B:123:0x0350, B:125:0x0355, B:127:0x035a, B:129:0x035f, B:106:0x0311, B:108:0x0316, B:110:0x031b, B:112:0x0320), top: B:181:0x0017 }] */
        /* JADX WARN: Removed duplicated region for block: B:155:0x03bf A[Catch: IOException -> 0x03b6, TryCatch #5 {IOException -> 0x03b6, blocks: (B:136:0x0381, B:138:0x0386, B:140:0x038b, B:142:0x0390, B:149:0x03b2, B:153:0x03ba, B:155:0x03bf, B:157:0x03c4, B:123:0x0350, B:125:0x0355, B:127:0x035a, B:129:0x035f, B:106:0x0311, B:108:0x0316, B:110:0x031b, B:112:0x0320), top: B:181:0x0017 }] */
        /* JADX WARN: Removed duplicated region for block: B:157:0x03c4 A[Catch: IOException -> 0x03b6, TRY_LEAVE, TryCatch #5 {IOException -> 0x03b6, blocks: (B:136:0x0381, B:138:0x0386, B:140:0x038b, B:142:0x0390, B:149:0x03b2, B:153:0x03ba, B:155:0x03bf, B:157:0x03c4, B:123:0x0350, B:125:0x0355, B:127:0x035a, B:129:0x035f, B:106:0x0311, B:108:0x0316, B:110:0x031b, B:112:0x0320), top: B:181:0x0017 }] */
        /* JADX WARN: Removed duplicated region for block: B:168:0x03d8 A[Catch: IOException -> 0x03d4, TryCatch #23 {IOException -> 0x03d4, blocks: (B:164:0x03d0, B:168:0x03d8, B:170:0x03dd, B:172:0x03e2), top: B:186:0x03d0 }] */
        /* JADX WARN: Removed duplicated region for block: B:170:0x03dd A[Catch: IOException -> 0x03d4, TryCatch #23 {IOException -> 0x03d4, blocks: (B:164:0x03d0, B:168:0x03d8, B:170:0x03dd, B:172:0x03e2), top: B:186:0x03d0 }] */
        /* JADX WARN: Removed duplicated region for block: B:172:0x03e2 A[Catch: IOException -> 0x03d4, TRY_LEAVE, TryCatch #23 {IOException -> 0x03d4, blocks: (B:164:0x03d0, B:168:0x03d8, B:170:0x03dd, B:172:0x03e2), top: B:186:0x03d0 }] */
        /* JADX WARN: Removed duplicated region for block: B:186:0x03d0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void b(com.github.snowdream.android.app.downloader.DownloadTask r27, int r28, java.lang.String r29) {
            /*
                Method dump skipped, instructions count: 1004
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.join.android.app.common.dialog.LocalGameThreeDialog.d.b(com.github.snowdream.android.app.downloader.DownloadTask, int, java.lang.String):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:58:0x0275 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0276  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                Method dump skipped, instructions count: 1211
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.join.android.app.common.dialog.LocalGameThreeDialog.d.run():void");
        }
    }

    private void initViewPager() {
        if (this.f14534f != null) {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, CollectionBeanSub> entry : this.f14534f.entrySet()) {
                CheckLocalGameFragment_ checkLocalGameFragment_ = new CheckLocalGameFragment_();
                checkLocalGameFragment_.f28580e = entry.getKey();
                checkLocalGameFragment_.f28581f = entry.getValue();
                arrayList.add(new FragmentPagerAdapter.a(entry.getKey(), checkLocalGameFragment_));
            }
            TextView textView = this.f14531c;
            textView.setText("1/" + this.f14534f.size());
            FragmentPagerAdapter fragmentPagerAdapter = new FragmentPagerAdapter(getChildFragmentManager(), arrayList);
            this.f14535g = fragmentPagerAdapter;
            this.f14533e.setAdapter(fragmentPagerAdapter);
            this.f14533e.setOffscreenPageLimit(2);
            this.f14533e.setNoScroll(true);
            this.f14533e.addOnPageChangeListener(new a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n0(CheckLocalGameFragment checkLocalGameFragment, int i4) {
        if (checkLocalGameFragment.f28581f.getDownloadtaskDown() == null || !checkLocalGameFragment.f28581f.getDownloadtaskDown().getCrc_link_type_val().equals(this.f14543o.getCrc_link_type_val())) {
            return;
        }
        this.f14533e.setCurrentItem(i4 + 1);
        TextView textView = this.f14531c;
        textView.setText((i4 + 2) + net.lingala.zip4j.util.e.F0 + this.f14534f.size());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void o0(DownloadTask downloadTask) {
        p1.f.K().n(downloadTask.getCrc_link_type_val());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p0(DownloadTask downloadTask) {
        UtilsMy.U3(getActivity(), downloadTask, 0);
    }

    public static LocalGameThreeDialog q0(Map<String, CollectionBeanSub> map) {
        Bundle bundle = new Bundle();
        LocalGameThreeDialog localGameThreeDialog = new LocalGameThreeDialog();
        localGameThreeDialog.setArguments(bundle);
        localGameThreeDialog.f14534f = map;
        return localGameThreeDialog;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r0() {
        final int currentItem = this.f14533e.getCurrentItem();
        final CheckLocalGameFragment checkLocalGameFragment = (CheckLocalGameFragment) this.f14535g.getItem(currentItem);
        new Handler().postDelayed(new Runnable() { // from class: com.join.android.app.common.dialog.i
            @Override // java.lang.Runnable
            public final void run() {
                LocalGameThreeDialog.this.n0(checkLocalGameFragment, currentItem);
            }
        }, 300L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s0() {
        this.f14530b.setText("确定");
        this.f14530b.setEnabled(true);
        this.f14532d.setEnabled(true);
    }

    private void t0() {
        try {
            if (!(getActivity() instanceof MGMainActivity) && !(getActivity() instanceof MGMainActivity_)) {
                Intent intent = new Intent();
                intent.setClass(getActivity(), MGMainActivity_.class);
                intent.setFlags(603979776);
                Bundle bundle = new Bundle();
                bundle.putInt("MainPos", 2);
                bundle.putBoolean("ismygame", true);
                intent.putExtras(bundle);
                startActivity(intent);
            }
            ((MGMainActivity) getActivity()).setTabSelect(2);
        } catch (Exception e5) {
            e5.getMessage();
        }
    }

    public void m0(boolean z4) {
        if (z4) {
            WindowManager.LayoutParams attributes = getActivity().getWindow().getAttributes();
            attributes.flags |= 1024;
            getActivity().getWindow().setAttributes(attributes);
            getActivity().getWindow().addFlags(512);
            return;
        }
        WindowManager.LayoutParams attributes2 = getActivity().getWindow().getAttributes();
        attributes2.flags &= -1025;
        getActivity().getWindow().setAttributes(attributes2);
        getActivity().getWindow().clearFlags(512);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int currentItem = this.f14533e.getCurrentItem();
        int id = view.getId();
        if (id != R.id.localGameThreeBt) {
            if (id != R.id.localGameThreeNotTv) {
                return;
            }
            if (currentItem + 1 >= this.f14534f.size()) {
                Message message = new Message();
                message.what = 0;
                this.f14542n.sendMessage(message);
                return;
            }
            new Handler().postDelayed(new b(currentItem), 300L);
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.f14541m > 500 || this.f14540l != 1) {
            MobclickAgent.onEvent(getContext(), "onComfirmGame");
            this.f14541m = currentTimeMillis;
            this.f14530b.setText("复制中");
            this.f14530b.setEnabled(false);
            this.f14532d.setEnabled(false);
            new Thread(new d()).start();
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m0(getResources().getConfiguration().orientation == 2);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        v.e(getContext());
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        org.greenrobot.eventbus.c.f().t(this);
        this.f14536h = p1.f.K().d();
        this.f14538j = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getPath();
        this.f14539k = v.f28104d + "/wufan91/31/roms";
        File file = new File(this.f14539k);
        if (!file.exists()) {
            file.mkdirs();
        }
        getDialog().requestWindowFeature(1);
        View inflate = layoutInflater.inflate(R.layout.dialog_localgame_three_view, viewGroup);
        this.f14530b = (Button) inflate.findViewById(R.id.localGameThreeBt);
        this.f14531c = (TextView) inflate.findViewById(R.id.localGameThreeNumTv);
        this.f14532d = (TextView) inflate.findViewById(R.id.localGameThreeNotTv);
        this.f14533e = (NoScrollViewPager) inflate.findViewById(R.id.localGameThreeViewPager);
        this.f14530b.setOnClickListener(this);
        this.f14532d.setOnClickListener(this);
        setCancelable(false);
        initViewPager();
        return inflate;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        Intent intent = new Intent();
        intent.setAction(o1.a.I);
        getActivity().sendBroadcast(intent);
        super.onDestroyView();
        org.greenrobot.eventbus.c.f().y(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(n nVar) {
        if (nVar != null) {
            try {
                if (nVar.a() == null) {
                    return;
                }
                final DownloadTask a5 = nVar.a();
                int currentItem = this.f14533e.getCurrentItem();
                if (a5 != null) {
                    if ((a5.getStatus() == 13 || a5.getStatus() == 5) && this.f14543o != null && a5.getCrc_link_type_val().equals(this.f14543o.getCrc_link_type_val())) {
                        if (a5.getStatus() == 13) {
                            if (getContext() != null) {
                                Toast.makeText(getContext(), "游戏解压失败！", 0).show();
                            }
                            new Thread(new Runnable() { // from class: com.join.android.app.common.dialog.g
                                @Override // java.lang.Runnable
                                public final void run() {
                                    LocalGameThreeDialog.o0(DownloadTask.this);
                                }
                            }).start();
                        } else if (UtilsMy.T(getContext(), a5) == null) {
                            this.f14537i = true;
                        } else {
                            if (currentItem + 1 >= this.f14534f.size()) {
                                this.f14537i = false;
                            }
                            new Handler().postDelayed(new Runnable() { // from class: com.join.android.app.common.dialog.h
                                @Override // java.lang.Runnable
                                public final void run() {
                                    LocalGameThreeDialog.this.p0(a5);
                                }
                            }, 200L);
                        }
                        if (currentItem + 1 >= this.f14534f.size()) {
                            Message message = new Message();
                            message.what = 0;
                            this.f14542n.sendMessage(message);
                            return;
                        }
                        Message message2 = new Message();
                        message2.what = 1;
                        this.f14542n.sendMessage(message2);
                    }
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }
}
