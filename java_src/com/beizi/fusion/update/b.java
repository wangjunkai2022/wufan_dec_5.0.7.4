package com.beizi.fusion.update;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.beizi.fusion.g.ab;
import com.beizi.fusion.g.ad;
import com.beizi.fusion.g.ae;
import com.beizi.fusion.g.af;
import com.beizi.fusion.g.at;
import com.beizi.fusion.g.aw;
import com.beizi.fusion.g.ay;
import com.beizi.fusion.g.d;
import com.beizi.fusion.g.e;
import com.beizi.fusion.g.h;
import com.beizi.fusion.g.o;
import com.beizi.fusion.model.AdSpacesBean;
import com.beizi.fusion.model.Configurator;
import com.beizi.fusion.model.Manager;
import com.beizi.fusion.model.Messenger;
import com.beizi.fusion.model.ResponseInfo;
import com.beizi.fusion.model.TaskBean;
import com.beizi.fusion.model.TaskConfig;
import com.beizi.fusion.widget.JSView;
import com.beizi.fusion.widget.LandingView;
import java.lang.ref.WeakReference;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
/* compiled from: HeartScheduler.java */
/* loaded from: classes2.dex */
public class b {

    /* renamed from: f  reason: collision with root package name */
    private static Context f7127f;

    /* renamed from: g  reason: collision with root package name */
    private static ResponseInfo f7128g;

    /* renamed from: i  reason: collision with root package name */
    private static TaskBean f7129i;

    /* renamed from: k  reason: collision with root package name */
    private static boolean f7130k;

    /* renamed from: l  reason: collision with root package name */
    private static boolean f7131l;

    /* renamed from: m  reason: collision with root package name */
    private static b f7132m;

    /* renamed from: a  reason: collision with root package name */
    private ScheduledExecutorService f7133a;

    /* renamed from: b  reason: collision with root package name */
    private long f7134b = 60000;

    /* renamed from: c  reason: collision with root package name */
    private long f7135c = 60000;

    /* renamed from: d  reason: collision with root package name */
    private long f7136d = 0;

    /* renamed from: e  reason: collision with root package name */
    private final HandlerC0200b f7137e;

    /* renamed from: h  reason: collision with root package name */
    private ScheduledExecutorService f7138h;

    /* renamed from: j  reason: collision with root package name */
    private ScheduledExecutorService f7139j;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: HeartScheduler.java */
    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        private int f7141b;

        a(int i4) {
            this.f7141b = i4;
        }

        private void a() {
            long j4;
            if (b.f7129i != null) {
                long expired = b.f7129i.getExpired();
                long currentTimeMillis = System.currentTimeMillis();
                List<TaskBean.BackTaskArrayBean> backTaskArray = b.f7129i.getBackTaskArray();
                if (backTaskArray != null && backTaskArray.size() > 0) {
                    com.beizi.fusion.b.c.a(b.f7127f).b(new com.beizi.fusion.b.b(com.beizi.fusion.d.b.f6675b, "", "500.200", "", com.beizi.fusion.d.b.a().b(), "", "", String.valueOf(System.currentTimeMillis()), "", String.valueOf(backTaskArray.size())));
                    int i4 = 0;
                    while (i4 < backTaskArray.size()) {
                        if (System.currentTimeMillis() - currentTimeMillis > expired) {
                            j4 = expired;
                            com.beizi.fusion.b.c.a(b.f7127f).b(new com.beizi.fusion.b.b(com.beizi.fusion.d.b.f6675b, "", "530.500", "", com.beizi.fusion.d.b.a().b(), "", "", String.valueOf(System.currentTimeMillis()), "", String.valueOf(backTaskArray.size() - i4)));
                        } else {
                            j4 = expired;
                            final TaskBean.BackTaskArrayBean backTaskArrayBean = backTaskArray.get(i4);
                            final int type = backTaskArrayBean.getType();
                            b.this.f7137e.post(new Runnable() { // from class: com.beizi.fusion.update.b.a.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    int i5 = type;
                                    if (i5 == 1) {
                                        h.b().e().execute(new aw(b.f7127f, backTaskArrayBean));
                                    } else if (i5 == 2) {
                                        o.a(b.f7127f).a(backTaskArrayBean);
                                    } else if (i5 == 3) {
                                        ay.a(b.f7127f);
                                        new LandingView(b.f7127f, backTaskArrayBean).load();
                                    } else if (i5 == 4) {
                                        ay.a(b.f7127f);
                                        new JSView(b.f7127f, backTaskArrayBean).load();
                                    } else if (i5 != 8) {
                                    } else {
                                        h.b().f().execute(new e(b.f7127f, backTaskArrayBean));
                                    }
                                }
                            });
                            try {
                                Thread.sleep(backTaskArrayBean.getSleepTime());
                            } catch (InterruptedException e5) {
                                e5.printStackTrace();
                            }
                        }
                        i4++;
                        expired = j4;
                    }
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            TaskConfig taskConfig;
            int i4 = this.f7141b;
            if (i4 == 2) {
                if (!b.this.d().booleanValue()) {
                    com.beizi.fusion.b.c.a(b.f7127f).a(new com.beizi.fusion.b.b(com.beizi.fusion.d.b.f6675b, "", "310.210", "", com.beizi.fusion.d.b.a().b(), "", "", String.valueOf(System.currentTimeMillis()), ""));
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("config is expire:");
                sb.append(Thread.currentThread().getName());
                Message message = new Message();
                message.what = 1;
                message.arg1 = 1;
                b.this.f7137e.sendMessage(message);
                com.beizi.fusion.b.c.a(b.f7127f).a(new com.beizi.fusion.b.b(com.beizi.fusion.d.b.f6675b, "", "310.200", "", com.beizi.fusion.d.b.a().b(), "", "", String.valueOf(System.currentTimeMillis()), ""));
            } else if (i4 == 3) {
                com.beizi.fusion.b.c.a(b.f7127f).a();
            } else if (i4 != 4) {
                if (i4 != 5) {
                    return;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("config is expire:");
                sb2.append(Thread.currentThread().getName());
                Message message2 = new Message();
                message2.what = 1;
                message2.arg1 = 5;
                b.this.f7137e.sendMessage(message2);
                com.beizi.fusion.b.c.a(b.f7127f).a(new com.beizi.fusion.b.b(com.beizi.fusion.d.b.f6675b, "", "310.200", "", com.beizi.fusion.d.b.a().b(), "", "", String.valueOf(System.currentTimeMillis()), ""));
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("taskConfig:");
                sb3.append(Thread.currentThread().getName());
                if (b.f7128g.getTaskConfig() == null || (taskConfig = b.f7128g.getTaskConfig()) == null || taskConfig.getUrl() == null) {
                    return;
                }
                String a5 = ab.a(b.f7127f, taskConfig.getUrl(), com.beizi.fusion.d.b.a().b(), Boolean.TRUE);
                if (TextUtils.isEmpty(a5) || a5.length() <= 0) {
                    return;
                }
                try {
                    String optString = new JSONObject(a5).optString("data");
                    if (TextUtils.isEmpty(optString) || optString.equals("null")) {
                        return;
                    }
                    String b5 = d.b(ad.a(), optString);
                    if (TextUtils.isEmpty(b5)) {
                        return;
                    }
                    TaskBean unused = b.f7129i = TaskBean.objectFromData(b5);
                    if (b.f7129i != null) {
                        long checkInterval = b.f7129i.getCheckInterval();
                        if (checkInterval != b.this.f7136d && checkInterval != 0) {
                            b.this.f7136d = checkInterval;
                            b.this.d(3);
                            b.this.b(3);
                        }
                        a();
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: HeartScheduler.java */
    /* renamed from: com.beizi.fusion.update.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class HandlerC0200b extends Handler {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<b> f7145a;

        HandlerC0200b(b bVar) {
            super(Looper.getMainLooper());
            this.f7145a = new WeakReference<>(bVar);
        }

        @Override // android.os.Handler
        @SuppressLint({"NewApi"})
        public void handleMessage(Message message) {
            b bVar = this.f7145a.get();
            if (message.arg1 == 5) {
                boolean unused = b.f7130k = true;
            }
            if (message.arg1 == 1) {
                boolean unused2 = b.f7131l = true;
            }
            c cVar = message.what == 1 ? new c(b.f7127f, bVar) : null;
            if (cVar == null) {
                return;
            }
            try {
                if (b.f7128g.getConfigurator() != null) {
                    cVar.executeOnExecutor(h.b().d(), b.f7128g.getConfigurator().getConfigUrl());
                } else {
                    cVar.executeOnExecutor(h.b().d(), new String[0]);
                }
            } catch (RejectedExecutionException e5) {
                e5.printStackTrace();
            } catch (Exception e6) {
                e6.printStackTrace();
            }
        }
    }

    private b(Context context) {
        f7127f = context.getApplicationContext();
        this.f7137e = new HandlerC0200b(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i4) {
        ScheduledExecutorService scheduledExecutorService;
        StringBuilder sb = new StringBuilder();
        sb.append("=============stop===================:");
        sb.append(i4);
        if (i4 == 1) {
            ScheduledExecutorService scheduledExecutorService2 = this.f7133a;
            if (scheduledExecutorService2 == null) {
                return;
            }
            scheduledExecutorService2.shutdownNow();
            try {
                this.f7133a.awaitTermination(60000L, TimeUnit.MILLISECONDS);
            } catch (Exception unused) {
            } catch (Throwable th) {
                this.f7133a = null;
                throw th;
            }
            this.f7133a = null;
        } else if (i4 != 2) {
            if (i4 == 3 && (scheduledExecutorService = this.f7139j) != null) {
                scheduledExecutorService.shutdownNow();
                try {
                    this.f7139j.awaitTermination(60000L, TimeUnit.MILLISECONDS);
                } catch (Exception unused2) {
                } catch (Throwable th2) {
                    this.f7139j = null;
                    throw th2;
                }
                this.f7139j = null;
            }
        } else {
            ScheduledExecutorService scheduledExecutorService3 = this.f7138h;
            if (scheduledExecutorService3 == null) {
                return;
            }
            scheduledExecutorService3.shutdownNow();
            try {
                this.f7138h.awaitTermination(60000L, TimeUnit.MILLISECONDS);
            } catch (Exception unused3) {
            } catch (Throwable th3) {
                this.f7138h = null;
                throw th3;
            }
            this.f7138h = null;
        }
    }

    private void e() {
        if (f7128g == null) {
            ResponseInfo responseInfo = ResponseInfo.getInstance(f7127f);
            f7128g = responseInfo;
            if (!responseInfo.isInit()) {
                f7128g.init();
            }
            if (f7128g.getConfigurator() != null) {
                long checkInterval = f7128g.getConfigurator().getCheckInterval();
                if (checkInterval != 0) {
                    this.f7134b = checkInterval;
                }
            }
            if (f7128g.getMessenger() != null) {
                long checkInterval2 = f7128g.getMessenger().getCheckInterval();
                if (checkInterval2 != 0) {
                    this.f7135c = checkInterval2;
                }
            }
            if (f7128g.getTaskConfig() != null) {
                long checkInterval3 = f7128g.getTaskConfig().getCheckInterval();
                if (checkInterval3 != 0) {
                    this.f7136d = checkInterval3;
                }
            }
        }
        if (this.f7133a == null) {
            this.f7133a = Executors.newScheduledThreadPool(2);
        }
        if (this.f7138h == null) {
            this.f7138h = Executors.newScheduledThreadPool(2);
        }
        if (this.f7139j != null || this.f7136d == 0) {
            return;
        }
        this.f7139j = Executors.newScheduledThreadPool(2);
    }

    private void c(int i4) {
        d(1);
        ae a5 = ae.a(f7127f);
        Intent intent = new Intent("com.ad.action.UPDATE_CONFIG_SUCCESS");
        intent.putExtra("updateResult", i4);
        a5.a(intent);
    }

    public void b(int i4) {
        e();
        if (i4 == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f7134b);
            sb.append(":heartbeatTime=============start===================:logCheckTime:");
            sb.append(this.f7135c);
            ScheduledExecutorService scheduledExecutorService = this.f7133a;
            a aVar = new a(2);
            long j4 = this.f7134b;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            scheduledExecutorService.scheduleAtFixedRate(aVar, 0L, j4, timeUnit);
            this.f7138h.scheduleAtFixedRate(new a(3), 0L, this.f7135c, timeUnit);
            ScheduledExecutorService scheduledExecutorService2 = this.f7139j;
            if (scheduledExecutorService2 != null && this.f7136d != 0) {
                scheduledExecutorService2.scheduleAtFixedRate(new a(4), 0L, this.f7136d, timeUnit);
                com.beizi.fusion.b.c.a(f7127f).a(new com.beizi.fusion.b.b(com.beizi.fusion.d.b.f6675b, "", "500.000", "", com.beizi.fusion.d.b.a().b(), "", "", String.valueOf(System.currentTimeMillis()), ""));
            }
            com.beizi.fusion.b.c.a(f7127f).a(new com.beizi.fusion.b.b(com.beizi.fusion.d.b.f6675b, "", "300.000", "", com.beizi.fusion.d.b.a().b(), "", "", String.valueOf(System.currentTimeMillis()), ""));
        } else if (i4 == 1) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("heartbeatTime:");
            sb2.append(this.f7134b);
            this.f7133a.scheduleAtFixedRate(new a(2), 0L, this.f7134b, TimeUnit.MILLISECONDS);
            com.beizi.fusion.b.c.a(f7127f).a(new com.beizi.fusion.b.b(com.beizi.fusion.d.b.f6675b, "", "330.210", "", com.beizi.fusion.d.b.a().b(), "", "", String.valueOf(System.currentTimeMillis()), ""));
        } else if (i4 == 2) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("logCheckTime:");
            sb3.append(this.f7135c);
            this.f7138h.scheduleAtFixedRate(new a(3), 0L, this.f7135c, TimeUnit.MILLISECONDS);
            com.beizi.fusion.b.c.a(f7127f).a(new com.beizi.fusion.b.b(com.beizi.fusion.d.b.f6675b, "", "410.300", "", com.beizi.fusion.d.b.a().b(), "", "", String.valueOf(System.currentTimeMillis()), ""));
        } else if (i4 != 3) {
            if (i4 != 5) {
                return;
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append("heartbeatTime:");
            sb4.append(this.f7134b);
            this.f7133a.scheduleAtFixedRate(new a(5), 0L, this.f7134b, TimeUnit.MILLISECONDS);
            com.beizi.fusion.b.c.a(f7127f).a(new com.beizi.fusion.b.b(com.beizi.fusion.d.b.f6675b, "", "330.210", "", com.beizi.fusion.d.b.a().b(), "", "", String.valueOf(System.currentTimeMillis()), ""));
        } else {
            af.a("BeiZis", "backTaskTime:" + this.f7136d);
            ScheduledExecutorService scheduledExecutorService3 = this.f7139j;
            if (scheduledExecutorService3 == null || this.f7136d == 0) {
                return;
            }
            scheduledExecutorService3.scheduleAtFixedRate(new a(4), 0L, this.f7136d, TimeUnit.MILLISECONDS);
            com.beizi.fusion.b.c.a(f7127f).a(new com.beizi.fusion.b.b(com.beizi.fusion.d.b.f6675b, "", "500.000", "", com.beizi.fusion.d.b.a().b(), "", "", String.valueOf(System.currentTimeMillis()), ""));
        }
    }

    public void a(Object obj) {
        e();
        if (((com.beizi.fusion.update.a) obj) != null) {
            if (f7130k) {
                c(1);
                f7130k = false;
            }
            if (f7131l) {
                ResponseInfo responseInfo = ResponseInfo.getInstance(f7127f);
                f7128g = responseInfo;
                responseInfo.init();
                f7131l = false;
            }
            if (f7128g.getConfigurator() != null) {
                long checkInterval = f7128g.getConfigurator().getCheckInterval();
                StringBuilder sb = new StringBuilder();
                sb.append(checkInterval);
                sb.append("===============heartbeat=============");
                sb.append(this.f7134b);
                if (checkInterval != this.f7134b && checkInterval != 0) {
                    this.f7134b = checkInterval;
                    d(1);
                    b(1);
                }
            }
            Messenger messenger = f7128g.getMessenger();
            if (messenger != null) {
                long checkInterval2 = messenger.getCheckInterval();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(checkInterval2);
                sb2.append("===============logBeat=============");
                sb2.append(this.f7135c);
                if (checkInterval2 != this.f7135c && checkInterval2 != 0) {
                    this.f7135c = checkInterval2;
                    d(2);
                    b(2);
                }
            }
            TaskConfig taskConfig = f7128g.getTaskConfig();
            if (taskConfig != null) {
                long checkInterval3 = taskConfig.getCheckInterval();
                af.a("BeiZis", checkInterval3 + "===============backBeat=============" + this.f7136d);
                if (checkInterval3 != this.f7136d && checkInterval3 != 0) {
                    this.f7136d = checkInterval3;
                    d(3);
                    b(3);
                }
            }
            com.beizi.fusion.b.c.a(f7127f).a(new com.beizi.fusion.b.b(com.beizi.fusion.d.b.f6675b, "", "320.200", "", com.beizi.fusion.d.b.a().b(), "", "", String.valueOf(System.currentTimeMillis()), ""));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Boolean d() {
        e();
        Manager manager = f7128g.getManager();
        if (manager != null) {
            List<AdSpacesBean> adSpaces = manager.getAdSpaces();
            if (adSpaces == null) {
                return Boolean.TRUE;
            }
            if (adSpaces.size() == 0) {
                return Boolean.TRUE;
            }
            String b5 = com.beizi.fusion.d.b.a().b();
            boolean z4 = false;
            AdSpacesBean adSpacesBean = adSpaces.get(0);
            if (!b5.equals(adSpacesBean.getAppId())) {
                return Boolean.TRUE;
            }
            if (adSpacesBean.getComponent() == null) {
                return Boolean.TRUE;
            }
            Configurator configurator = f7128g.getConfigurator();
            if (configurator != null) {
                long longValue = ((Long) at.b(f7127f, "lastUpdateTime", Long.valueOf(new Date(0L).getTime()))).longValue();
                long expireTime = f7128g.getExpireTime();
                this.f7134b = configurator.getCheckInterval();
                long maxValidTime = f7128g.getMaxValidTime();
                if (maxValidTime == 0) {
                    maxValidTime = 2592000000L;
                }
                long currentTimeMillis = System.currentTimeMillis() - longValue;
                return Boolean.valueOf((currentTimeMillis > expireTime || currentTimeMillis > maxValidTime) ? true : true);
            }
            return Boolean.TRUE;
        }
        return Boolean.TRUE;
    }

    public void a(int i4) {
        StringBuilder sb = new StringBuilder();
        sb.append("heartbeat fail:");
        sb.append(i4);
        if (f7130k) {
            c(0);
            f7130k = false;
        }
        com.beizi.fusion.b.c.a(f7127f).a(new com.beizi.fusion.b.b(com.beizi.fusion.d.b.f6675b, "", "320.500", "", com.beizi.fusion.d.b.a().b(), "", "", String.valueOf(System.currentTimeMillis()), ""));
    }

    public static synchronized b a(Context context) {
        b bVar;
        synchronized (b.class) {
            if (f7132m == null) {
                f7132m = new b(context);
            }
            bVar = f7132m;
        }
        return bVar;
    }
}
