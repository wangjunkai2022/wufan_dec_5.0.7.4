package com.mob.commons;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import com.mob.MobSDK;
import com.mob.tools.MobHandlerThread;
import com.mob.tools.MobLog;
import com.mob.tools.utils.ActivityTracker;
import java.util.HashSet;
import java.util.Iterator;
/* loaded from: classes5.dex */
public class l {

    /* renamed from: a  reason: collision with root package name */
    private static l f56404a;

    /* renamed from: c  reason: collision with root package name */
    private volatile Handler f56406c;

    /* renamed from: f  reason: collision with root package name */
    private volatile long f56409f;

    /* renamed from: b  reason: collision with root package name */
    private final HashSet<k> f56405b = new HashSet<>();

    /* renamed from: d  reason: collision with root package name */
    private String f56407d = null;

    /* renamed from: e  reason: collision with root package name */
    private volatile long f56408e = -1;

    private l() {
        String str = null;
        this.f56409f = 0L;
        this.f56409f = SystemClock.elapsedRealtime();
        if (!TextUtils.isEmpty("M-")) {
            str = z.f56517a + a("004+iehljmjh");
        }
        this.f56406c = MobHandlerThread.newHandler(str, new Handler.Callback() { // from class: com.mob.commons.l.1
            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                int i4 = message.what;
                if (i4 == 0) {
                    l.this.f56408e = SystemClock.elapsedRealtime();
                    l.this.a(false);
                    l.this.d();
                } else if (i4 == 1) {
                    l.this.a(true);
                } else if (i4 == 2) {
                    l.this.a(((Long) message.obj).longValue(), true);
                } else if (i4 == 3) {
                    try {
                        k kVar = (k) message.obj;
                        if (kVar != null) {
                            l.this.f56405b.add(kVar);
                            kVar.a(l.this.f56408e > 0, true, 0L);
                        }
                    } catch (Throwable th) {
                        MobLog.getInstance().d(th);
                    }
                }
                return false;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        ActivityTracker.getInstance(MobSDK.getContext()).addTracker(new ActivityTracker.Tracker() { // from class: com.mob.commons.FBManager$2
            @Override // com.mob.tools.utils.ActivityTracker.Tracker
            public void onCreated(Activity activity, Bundle bundle) {
            }

            @Override // com.mob.tools.utils.ActivityTracker.Tracker
            public void onDestroyed(Activity activity) {
                if (l.this.f56408e > 0) {
                    onStopped(activity);
                }
            }

            @Override // com.mob.tools.utils.ActivityTracker.Tracker
            public void onPaused(Activity activity) {
            }

            @Override // com.mob.tools.utils.ActivityTracker.Tracker
            public void onResumed(Activity activity) {
                Handler handler;
                Handler handler2;
                try {
                    l.this.f56409f = SystemClock.elapsedRealtime();
                    if (l.this.f56408e == 0) {
                        l.this.f56408e = SystemClock.elapsedRealtime();
                        handler = l.this.f56406c;
                        if (handler != null) {
                            handler2 = l.this.f56406c;
                            handler2.sendEmptyMessage(1);
                        }
                    }
                    l.this.f56407d = activity == null ? null : activity.toString();
                } catch (Throwable unused) {
                }
            }

            @Override // com.mob.tools.utils.ActivityTracker.Tracker
            public void onSaveInstanceState(Activity activity, Bundle bundle) {
            }

            @Override // com.mob.tools.utils.ActivityTracker.Tracker
            public void onStarted(Activity activity) {
            }

            @Override // com.mob.tools.utils.ActivityTracker.Tracker
            public void onStopped(Activity activity) {
                String str;
                Handler handler;
                Handler handler2;
                String str2;
                try {
                    str = l.this.f56407d;
                    if (str != null) {
                        str2 = l.this.f56407d;
                        if (!str2.equals(activity == null ? null : activity.toString())) {
                            return;
                        }
                    }
                    handler = l.this.f56406c;
                    if (handler != null) {
                        long elapsedRealtime = l.this.f56408e > 0 ? SystemClock.elapsedRealtime() - l.this.f56408e : 0L;
                        Message message = new Message();
                        message.what = 2;
                        message.obj = Long.valueOf(elapsedRealtime);
                        handler2 = l.this.f56406c;
                        handler2.sendMessage(message);
                    }
                    l.this.f56408e = 0L;
                    l.this.f56407d = null;
                } catch (Throwable unused) {
                }
            }
        });
    }

    public long c() {
        return this.f56409f;
    }

    public boolean b() {
        return this.f56408e == 0;
    }

    public static synchronized l a() {
        l lVar;
        synchronized (l.class) {
            if (f56404a == null) {
                l lVar2 = new l();
                f56404a = lVar2;
                if (lVar2.f56406c != null) {
                    f56404a.f56406c.sendEmptyMessage(0);
                }
            }
            lVar = f56404a;
        }
        return lVar;
    }

    public void a(k kVar) {
        if (kVar == null) {
            return;
        }
        synchronized (this.f56405b) {
            if (this.f56405b.contains(kVar)) {
                return;
            }
            if (this.f56406c != null) {
                Message message = new Message();
                message.what = 3;
                message.obj = kVar;
                this.f56406c.sendMessage(message);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z4) {
        if (z4) {
            a(true, false, 0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(long j4, boolean z4) {
        if (z4) {
            a(false, false, j4);
        }
    }

    private void a(boolean z4, boolean z5, long j4) {
        synchronized (this.f56405b) {
            Iterator<k> it2 = this.f56405b.iterator();
            while (it2.hasNext()) {
                it2.next().a(z4, z5, j4);
            }
        }
    }

    public static String a(String str) {
        return v.a(str, 101);
    }
}
