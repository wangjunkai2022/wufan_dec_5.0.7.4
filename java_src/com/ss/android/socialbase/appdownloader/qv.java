package com.ss.android.socialbase.appdownloader;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.ss.android.socialbase.appdownloader.view.JumpUnknownSourceActivity;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.vv.vv;
import java.lang.ref.SoftReference;
import java.util.ArrayDeque;
import java.util.Queue;
/* loaded from: classes5.dex */
public class qv {

    /* renamed from: i  reason: collision with root package name */
    private long f60849i;

    /* renamed from: m  reason: collision with root package name */
    private boolean f60850m;

    /* renamed from: n  reason: collision with root package name */
    private Runnable f60851n;

    /* renamed from: o  reason: collision with root package name */
    private SoftReference<JumpUnknownSourceActivity> f60852o;

    /* renamed from: p  reason: collision with root package name */
    private long f60853p;

    /* renamed from: u  reason: collision with root package name */
    private Handler f60854u;
    private final Queue<Integer> vv;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class vv {
        private static final qv vv = new qv();
    }

    private qv() {
        this.vv = new ArrayDeque();
        this.f60850m = false;
        this.f60854u = new Handler(Looper.getMainLooper());
        this.f60851n = new Runnable() { // from class: com.ss.android.socialbase.appdownloader.qv.1
            @Override // java.lang.Runnable
            public void run() {
                qv.this.p();
            }
        };
        com.ss.android.socialbase.downloader.vv.vv.vv().vv(new vv.InterfaceC0653vv() { // from class: com.ss.android.socialbase.appdownloader.qv.2
            @Override // com.ss.android.socialbase.downloader.vv.vv.InterfaceC0653vv
            public void m() {
                if (qv.this.vv.isEmpty()) {
                    return;
                }
                long vv2 = com.ss.android.socialbase.downloader.n.vv.p().vv("install_on_resume_install_interval", 120000L);
                long currentTimeMillis = System.currentTimeMillis() - qv.this.f60849i;
                if (currentTimeMillis < vv2) {
                    if (qv.this.f60854u.hasCallbacks(qv.this.f60851n)) {
                        return;
                    }
                    qv.this.f60854u.postDelayed(qv.this.f60851n, vv2 - currentTimeMillis);
                    return;
                }
                qv.this.f60849i = System.currentTimeMillis();
                qv.this.p();
            }

            @Override // com.ss.android.socialbase.downloader.vv.vv.InterfaceC0653vv
            public void p() {
            }
        });
    }

    private boolean i() {
        return System.currentTimeMillis() - this.f60853p < 1000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int m(Context context, int i4, boolean z4) {
        int m4 = p.m(context, i4, z4);
        if (m4 == 1) {
            this.f60850m = true;
        }
        this.f60853p = System.currentTimeMillis();
        return m4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        final Integer poll;
        if (Build.VERSION.SDK_INT < 29 || com.ss.android.socialbase.downloader.vv.vv.vv().m()) {
            synchronized (this.vv) {
                poll = this.vv.poll();
            }
            this.f60854u.removeCallbacks(this.f60851n);
            if (poll != null) {
                final Context ky = com.ss.android.socialbase.downloader.downloader.p.ky();
                if (Looper.myLooper() != Looper.getMainLooper()) {
                    this.f60854u.post(new Runnable() { // from class: com.ss.android.socialbase.appdownloader.qv.3
                        @Override // java.lang.Runnable
                        public void run() {
                            qv.this.m(ky, poll.intValue(), false);
                        }
                    });
                } else {
                    m(ky, poll.intValue(), false);
                }
                this.f60854u.postDelayed(this.f60851n, 20000L);
                return;
            }
            this.f60850m = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void vv(DownloadInfo downloadInfo, String str) {
        if (downloadInfo == null || TextUtils.isEmpty(str)) {
            return;
        }
        p();
    }

    public JumpUnknownSourceActivity m() {
        SoftReference<JumpUnknownSourceActivity> softReference = this.f60852o;
        JumpUnknownSourceActivity jumpUnknownSourceActivity = softReference == null ? null : softReference.get();
        this.f60852o = null;
        return jumpUnknownSourceActivity;
    }

    public static qv vv() {
        return vv.vv;
    }

    public int vv(final Context context, final int i4, final boolean z4) {
        if (z4) {
            return m(context, i4, z4);
        }
        if (i()) {
            this.f60854u.postDelayed(new Runnable() { // from class: com.ss.android.socialbase.appdownloader.qv.4
                @Override // java.lang.Runnable
                public void run() {
                    qv.this.vv(context, i4, z4);
                }
            }, 1000L);
            return 1;
        } else if (com.ss.android.socialbase.downloader.vv.vv.vv().m()) {
            com.ss.android.socialbase.downloader.p.vv.p("leaves", "on Foreground");
            return m(context, i4, z4);
        } else if (m.vv()) {
            return 1;
        } else {
            boolean z5 = Build.VERSION.SDK_INT < 29;
            if (this.vv.isEmpty() && !this.f60850m && z5) {
                return m(context, i4, z4);
            }
            int vv2 = com.ss.android.socialbase.downloader.n.vv.p().vv("install_queue_size", 3);
            synchronized (this.vv) {
                while (this.vv.size() > vv2) {
                    this.vv.poll();
                }
            }
            if (z5) {
                this.f60854u.removeCallbacks(this.f60851n);
                this.f60854u.postDelayed(this.f60851n, com.ss.android.socialbase.downloader.n.vv.vv(i4).vv("install_queue_timeout", 20000L));
            }
            synchronized (this.vv) {
                if (!this.vv.contains(Integer.valueOf(i4))) {
                    this.vv.offer(Integer.valueOf(i4));
                }
            }
            return 1;
        }
    }

    public void vv(JumpUnknownSourceActivity jumpUnknownSourceActivity) {
        this.f60852o = new SoftReference<>(jumpUnknownSourceActivity);
    }
}
