package com.papa.sim.statistic;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.papa.sim.statistic.db.EMUApkTable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes5.dex */
public class StatService extends Service {

    /* renamed from: n  reason: collision with root package name */
    private static final String f58673n = "StatService";

    /* renamed from: b  reason: collision with root package name */
    com.papa.sim.statistic.db.b f58674b;

    /* renamed from: d  reason: collision with root package name */
    List<com.papa.sim.statistic.db.a> f58676d;

    /* renamed from: e  reason: collision with root package name */
    com.papa.sim.statistic.pref.b f58677e;

    /* renamed from: f  reason: collision with root package name */
    o f58678f;

    /* renamed from: i  reason: collision with root package name */
    boolean f58681i;

    /* renamed from: j  reason: collision with root package name */
    private String f58682j;

    /* renamed from: k  reason: collision with root package name */
    private List<EMUApkTable> f58683k;

    /* renamed from: c  reason: collision with root package name */
    List<com.papa.sim.statistic.db.d> f58675c = new ArrayList(0);

    /* renamed from: g  reason: collision with root package name */
    Object f58679g = new Object();

    /* renamed from: h  reason: collision with root package name */
    final AtomicBoolean f58680h = new AtomicBoolean(false);

    /* renamed from: l  reason: collision with root package name */
    private List<EMUApkTable> f58684l = null;

    /* renamed from: m  reason: collision with root package name */
    private b f58685m = new b();

    /* loaded from: classes5.dex */
    class a extends Thread {
        a() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (true) {
                try {
                    try {
                        Thread.sleep(30000L);
                        StringBuilder sb = new StringBuilder();
                        sb.append("[");
                        sb.append(Thread.currentThread().getId());
                        sb.append("]method statService is running...");
                        StatService.this.f58674b.g();
                        StatService statService = StatService.this;
                        statService.f58675c = statService.f58674b.k();
                        StatService.this.i();
                        StatService.this.j();
                        StatService.this.k();
                        try {
                            StatService.this.o();
                        } catch (Exception e5) {
                            e5.printStackTrace();
                        }
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        List<com.papa.sim.statistic.db.d> list = StatService.this.f58675c;
                        if (list != null && list.size() >= 11) {
                            for (com.papa.sim.statistic.db.d dVar : StatService.this.f58675c) {
                                if (StatService.this.delete(dVar)) {
                                    if (dVar.f() != 1) {
                                        dVar.p(2);
                                    }
                                    if (StatService.this.f58678f.r() && dVar.getType().equals(Event.joyStickConfigPost.name())) {
                                        try {
                                            StatService.this.p(dVar);
                                        } catch (Exception e6) {
                                            e6.printStackTrace();
                                            StatService.this.n("", e6);
                                        }
                                    } else if (StatService.this.f58678f.s() && dVar.getType().equals(Event.joyStickInfoPost.name())) {
                                        try {
                                            StatService.this.q(dVar);
                                        } catch (Exception e7) {
                                            e7.printStackTrace();
                                            StatService.this.n("", e7);
                                        }
                                    } else if (dVar.getType().equals(Event.pluginPlayTime.name())) {
                                        arrayList2.add(dVar);
                                    } else {
                                        Thread.sleep(500L);
                                        if (dVar.getType() != null && (dVar.getType().equals(Event.click_vs_hall.name()) || dVar.getType().equals(Event.click_vs_create_room.name()) || dVar.getType().equals(Event.user_filters_refresh.name()) || dVar.getType().equals(Event.joystickSetting.name()) || dVar.getType().equals(Event.joystickJoin.name()) || dVar.getType().equals(Event.joystickConfigChanged.name()) || dVar.getType().equals(Event.clickVsBtn.name()) || dVar.getType().equals(Event.clickVsHallBtn.name()) || dVar.getType().equals(Event.visitVsRoomPage.name()) || dVar.getType().equals(Event.visitVsMainPage.name()) || dVar.getType().equals(Event.VsGameStart.name()) || dVar.getType().equals(Event.clickVsForumBtn.name()) || dVar.getType().equals(Event.clickVsAdvBtn.name()) || dVar.getType().equals(Event.clickVsCreateRoom.name()) || dVar.getType().equals(Event.clickVsQuickJoin.name()) || dVar.getType().equals(Event.VsCreateWaitOver.name()) || dVar.getType().equals(Event.VsGameOverSuccess.name()) || dVar.getType().equals(Event.VsSelectSilentBtn.name()) || dVar.getType().equals(Event.VsCreateSilentRoom.name()) || dVar.getType().equals(Event.VsSilentTransform.name()) || dVar.getType().equals(Event.clickVsLocalBat.name()) || dVar.getType().equals(Event.clickVslLocalCreateRoom.name()) || dVar.getType().equals(Event.clickVsJoinRoom.name()) || dVar.getType().equals(Event.clickVsNetBattleMatch.name()))) {
                                            try {
                                                StatService.this.f58678f.b0((StatDataCenterReq) JsonMapper.e().fromJson(dVar.b(), StatDataCenterReq.class));
                                            } catch (Exception e8) {
                                                e8.printStackTrace();
                                            }
                                        }
                                        arrayList.add(dVar);
                                    }
                                }
                            }
                            if (arrayList2.size() > 0) {
                                StatService statService2 = StatService.this;
                                statService2.f58678f.a0(statService2.getApplicationContext(), arrayList2);
                            }
                            StatService statService3 = StatService.this;
                            statService3.f58678f.u(statService3.getApplicationContext(), arrayList);
                            StatService.this.f58675c.clear();
                        }
                    } catch (Throwable th) {
                        StatService.this.f58680h.set(false);
                        throw th;
                    }
                } catch (Exception e9) {
                    e9.printStackTrace();
                    StatService.this.n("", e9);
                    StatService.this.f58680h.set(false);
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean delete(com.papa.sim.statistic.db.d dVar) {
        try {
            this.f58674b.delete(dVar);
            StringBuilder sb = new StringBuilder();
            sb.append("Statservice deleStat ");
            sb.append(dVar.e());
            sb.append(dVar.b());
            return true;
        } catch (Exception e5) {
            e5.printStackTrace();
            n(dVar.e() + "", e5);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        boolean m4 = m(Long.parseLong(this.f58677e.q()));
        boolean s4 = s.s(getApplicationContext());
        boolean t4 = s.t(getApplicationContext());
        StringBuilder sb = new StringBuilder();
        sb.append("isBackground=");
        sb.append(s4);
        if (m4 || s4 || !t4) {
            return;
        }
        boolean z4 = false;
        Iterator<com.papa.sim.statistic.db.d> it2 = this.f58675c.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            com.papa.sim.statistic.db.d next = it2.next();
            if (next.getType().equals(Event.startApp.name()) && m(Long.parseLong(next.i()))) {
                z4 = true;
                break;
            }
        }
        if (z4) {
            return;
        }
        p.l(getApplicationContext()).X1("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        h n4;
        boolean m4 = m(Long.parseLong(this.f58677e.h()));
        boolean s4 = s.s(getApplicationContext());
        boolean t4 = s.t(getApplicationContext());
        StringBuilder sb = new StringBuilder();
        sb.append("isBackground=");
        sb.append(s4);
        if (m4 || s4 || !t4) {
            return;
        }
        boolean z4 = false;
        Iterator<com.papa.sim.statistic.db.d> it2 = this.f58675c.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            com.papa.sim.statistic.db.d next = it2.next();
            if (next.getType().equals(Event.gameList.name()) && m(Long.parseLong(next.i()))) {
                z4 = true;
                break;
            }
        }
        if (z4 || (n4 = p.l(getApplicationContext()).n()) == null) {
            return;
        }
        String c5 = n4.c();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("gameList is =");
        sb2.append(c5);
        p.l(getApplicationContext()).J0(c5, n4.a(getApplicationContext()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
    }

    private void l() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(String str, Throwable th) {
        StringBuffer stringBuffer = new StringBuffer(s.f(getApplicationContext()).e() + ";error::");
        stringBuffer.append(th.getMessage());
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            try {
                stringBuffer.append(stackTraceElement.toString());
            } catch (Exception unused) {
            }
        }
        if (str == null || str.equals("") || !this.f58674b.i(Event.setpapaerror, str)) {
            this.f58678f.J(Event.setpapaerror, stringBuffer.toString(), str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        List<com.papa.sim.statistic.db.a> l4 = this.f58674b.l();
        this.f58676d = l4;
        if (l4 == null || l4.size() == 0) {
            return;
        }
        for (com.papa.sim.statistic.db.a aVar : this.f58676d) {
            if (delete(aVar) && !this.f58678f.c0(aVar)) {
                this.f58674b.t(aVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(com.papa.sim.statistic.db.d dVar) {
        String b5 = dVar.b();
        if (b5 == null || b5.equals("")) {
            return;
        }
        JoyStickConfig joyStickConfig = (JoyStickConfig) JsonMapper.f().fromJson(b5, JoyStickConfig.class);
        joyStickConfig.setId(dVar.e());
        this.f58678f.t0(getApplicationContext(), joyStickConfig);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q(com.papa.sim.statistic.db.d dVar) {
        String b5 = dVar.b();
        if (b5 == null || b5.equals("")) {
            return;
        }
        try {
            JoyStickConfig joyStickConfig = (JoyStickConfig) JsonMapper.e().fromJson(b5, JoyStickConfig.class);
            joyStickConfig.setId(dVar.e());
            l.b(getApplicationContext(), joyStickConfig);
        } catch (Exception e5) {
            e5.printStackTrace();
            this.f58674b.r(dVar);
        }
    }

    public boolean m(long j4) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j4);
        int i4 = calendar.get(1);
        int i5 = calendar.get(2);
        int i6 = calendar.get(5);
        calendar.setTimeInMillis(System.currentTimeMillis());
        return i4 == calendar.get(1) && i5 == calendar.get(2) && i6 == calendar.get(5);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        p.l(getApplicationContext()).o();
    }

    @Override // android.app.Service
    public void onDestroy() {
        com.papa.sim.statistic.db.b bVar = this.f58674b;
        if (bVar != null) {
            bVar.b();
        }
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i4, int i5) {
        this.f58681i = s.s(getApplicationContext());
        this.f58674b = com.papa.sim.statistic.db.b.o(getApplicationContext());
        synchronized (this.f58679g) {
            if (this.f58680h.compareAndSet(false, true)) {
                if (this.f58678f == null) {
                    this.f58678f = o.m(getApplicationContext());
                }
                if (this.f58677e == null) {
                    this.f58677e = com.papa.sim.statistic.pref.b.k(getApplicationContext());
                }
                if (this.f58674b == null) {
                    this.f58674b = com.papa.sim.statistic.db.b.o(getApplicationContext());
                }
                if (com.papa.sim.statistic.pref.b.k(this).s()) {
                    return super.onStartCommand(intent, i4, i5);
                }
                new a().start();
            }
            return super.onStartCommand(intent, i4, i5);
        }
    }

    private boolean delete(com.papa.sim.statistic.db.a aVar) {
        try {
            this.f58674b.d(aVar);
            return true;
        } catch (Exception e5) {
            e5.printStackTrace();
            n(aVar.e() + "", e5);
            return false;
        }
    }
}
