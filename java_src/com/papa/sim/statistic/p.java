package com.papa.sim.statistic;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.papa.sim.statistic.db.EMUApkTable;
import io.netty.handler.codec.http.websocketx.WebSocketServerHandshaker;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
/* compiled from: StatFactory.java */
/* loaded from: classes5.dex */
public class p {

    /* renamed from: i  reason: collision with root package name */
    public static String f58883i;

    /* renamed from: j  reason: collision with root package name */
    public static p f58884j;

    /* renamed from: b  reason: collision with root package name */
    private Context f58887b;

    /* renamed from: c  reason: collision with root package name */
    private com.papa.sim.statistic.o f58888c;

    /* renamed from: d  reason: collision with root package name */
    private com.papa.sim.statistic.db.b f58889d;

    /* renamed from: e  reason: collision with root package name */
    com.papa.sim.statistic.h f58890e;

    /* renamed from: g  reason: collision with root package name */
    private static ThreadPoolExecutor f58881g = new ThreadPoolExecutor(1, 1, 500, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* renamed from: h  reason: collision with root package name */
    public static String f58882h = "";

    /* renamed from: k  reason: collision with root package name */
    private static String f58885k = "1280*720";

    /* renamed from: a  reason: collision with root package name */
    private final String f58886a = p.class.getSimpleName();

    /* renamed from: f  reason: collision with root package name */
    private int f58891f = 1;

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f58892b;

        a(String str) {
            this.f58892b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                StatRequest statRequest = new StatRequest();
                Event event = Event.clickVsQuickJoin;
                statRequest.setEvent(event.name());
                statRequest.setTime(System.currentTimeMillis());
                statRequest.setUid(Integer.parseInt(this.f58892b));
                statRequest.getExt().setUid(statRequest.getUid());
                p.this.f58888c.B(event, statRequest);
            } catch (Exception unused) {
            }
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class a0 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f58894b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f58895c;

        a0(String str, String str2) {
            this.f58894b = str;
            this.f58895c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                p.this.f58888c.X(Event.findButtonEvent.name(), this.f58894b, this.f58895c);
            } catch (Exception unused) {
            }
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class a1 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f58897b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f58898c;

        a1(String str, String str2) {
            this.f58897b = str;
            this.f58898c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            StatRequest statRequest = new StatRequest();
            statRequest.setEvent(Event.clickGameDetailModel.name());
            try {
                statRequest.setUid(Integer.parseInt(this.f58897b));
            } catch (Exception unused) {
            }
            statRequest.getExt().setUid(statRequest.getUid());
            statRequest.getExt().setPosition(this.f58898c);
            statRequest.getData().setUid(this.f58897b);
            p.this.f58888c.B(Event.clickGameDetailModel, statRequest);
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class a2 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f58900b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f58901c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f58902d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f58903e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f58904f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ String f58905g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ String f58906h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ String f58907i;

        a2(String str, String str2, int i4, String str3, int i5, String str4, String str5, String str6) {
            this.f58900b = str;
            this.f58901c = str2;
            this.f58902d = i4;
            this.f58903e = str3;
            this.f58904f = i5;
            this.f58905g = str4;
            this.f58906h = str5;
            this.f58907i = str6;
        }

        @Override // java.lang.Runnable
        public void run() {
            StatRequest statRequest = new StatRequest();
            try {
                statRequest.setUid(Integer.parseInt(this.f58900b));
            } catch (Exception unused) {
            }
            statRequest.getExt().setUid(statRequest.getUid());
            statRequest.getExt().setKeyWord(this.f58901c);
            Ext ext = statRequest.getExt();
            ext.setFrom(this.f58902d + "");
            statRequest.getExt().setPosition(this.f58903e);
            statRequest.getExt().setGameFlag(this.f58904f);
            statRequest.getData().setUid(this.f58900b);
            statRequest.getData().setWhere(this.f58905g);
            statRequest.getExt().setDataFlag(this.f58906h);
            try {
                statRequest.getData().setGameId(Long.parseLong(this.f58907i));
            } catch (Exception unused2) {
            }
            if (this.f58902d == 103) {
                statRequest.getData().setWhere(Where.search.name());
            }
            statRequest.setTime(System.currentTimeMillis());
            Event event = Event.gameRequest;
            statRequest.setEvent(event.name());
            p.this.f58888c.B(event, statRequest);
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class a3 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f58909b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f58910c;

        a3(String str, int i4) {
            this.f58909b = str;
            this.f58910c = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                p.this.f58888c.y(Event.clickFunGameMainBtn, Event.matchBattle, this.f58909b, this.f58910c);
            } catch (Exception unused) {
            }
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class a4 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f58912b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f58913c;

        a4(String str, int i4) {
            this.f58912b = str;
            this.f58913c = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                StatRequest statRequest = new StatRequest();
                Event event = Event.startShare;
                statRequest.setEvent(event.name());
                statRequest.setTime(System.currentTimeMillis());
                statRequest.setUid(Integer.parseInt(this.f58912b));
                statRequest.getExt().setUid(statRequest.getUid());
                statRequest.getExt().setShareType(this.f58913c);
                p.this.f58888c.B(event, statRequest);
            } catch (Exception unused) {
            }
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f58915b;

        b(String str) {
            this.f58915b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                StatRequest statRequest = new StatRequest();
                Event event = Event.VsCreateWaitOver;
                statRequest.setEvent(event.name());
                statRequest.setTime(System.currentTimeMillis());
                statRequest.setUid(Integer.parseInt(this.f58915b));
                statRequest.getExt().setUid(statRequest.getUid());
                p.this.f58888c.B(event, statRequest);
            } catch (Exception unused) {
            }
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class b0 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f58917b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f58918c;

        b0(String str, String str2) {
            this.f58917b = str;
            this.f58918c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                StatRequest statRequest = new StatRequest();
                Event event = Event.arenaGameListBanner;
                statRequest.setEvent(event.name());
                statRequest.setTime(System.currentTimeMillis());
                statRequest.setUid(Integer.parseInt(this.f58917b));
                statRequest.getExt().setUid(statRequest.getUid());
                statRequest.getExt().setPosition(this.f58918c);
                p.this.f58888c.B(event, statRequest);
            } catch (Exception unused) {
            }
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class b1 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f58920b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f58921c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f58922d;

        b1(String str, String str2, String str3) {
            this.f58920b = str;
            this.f58921c = str2;
            this.f58922d = str3;
        }

        @Override // java.lang.Runnable
        public void run() {
            StatRequest statRequest = new StatRequest();
            statRequest.setEvent(Event.enterUserGameList.name());
            try {
                statRequest.setUid(Integer.parseInt(this.f58920b));
            } catch (Exception unused) {
            }
            statRequest.getExt().setArticleId(this.f58921c);
            statRequest.getExt().setUid(statRequest.getUid());
            statRequest.getExt().setPosition(this.f58922d);
            statRequest.getData().setUid(this.f58920b);
            p.this.f58888c.B(Event.enterUserGameList, statRequest);
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class b2 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f58924b;

        b2(String str) {
            this.f58924b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            p.this.f58888c.E(Event.submitPost, this.f58924b);
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class b3 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f58926b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f58927c;

        b3(String str, int i4) {
            this.f58926b = str;
            this.f58927c = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                p.this.f58888c.y(Event.clickGameMainBtn, Event.inviteBattle, this.f58926b, this.f58927c);
            } catch (Exception unused) {
            }
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class b4 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f58929b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f58930c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f58931d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f58932e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f58933f;

        b4(String str, String str2, String str3, int i4, int i5) {
            this.f58929b = str;
            this.f58930c = str2;
            this.f58931d = str3;
            this.f58932e = i4;
            this.f58933f = i5;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                StatRequest statRequest = new StatRequest();
                statRequest.setEvent(Event.shareChannel.name());
                statRequest.setTime(System.currentTimeMillis());
                statRequest.setUid(Integer.parseInt(this.f58929b));
                try {
                    statRequest.getData().setGameId(Long.parseLong(this.f58930c));
                } catch (Exception unused) {
                }
                statRequest.getExt().setGameId(this.f58930c);
                statRequest.getExt().setArticleId(this.f58931d);
                statRequest.getExt().setUid(statRequest.getUid());
                statRequest.getExt().setShareMfr(this.f58932e);
                statRequest.getExt().setShareType(this.f58933f);
                p.this.f58888c.B(Event.shareChannel, statRequest);
            } catch (Exception unused2) {
            }
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f58935b;

        c(String str) {
            this.f58935b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                StatRequest statRequest = new StatRequest();
                Event event = Event.VsGameOverSuccess;
                statRequest.setEvent(event.name());
                statRequest.setTime(System.currentTimeMillis());
                statRequest.setUid(Integer.parseInt(this.f58935b));
                statRequest.getExt().setUid(statRequest.getUid());
                p.this.f58888c.B(event, statRequest);
            } catch (Exception unused) {
            }
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class c0 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f58937b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f58938c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f58939d;

        c0(String str, String str2, String str3) {
            this.f58937b = str;
            this.f58938c = str2;
            this.f58939d = str3;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                StatRequest statRequest = new StatRequest();
                statRequest.setEvent(Event.arenaGameListItem.name());
                statRequest.setTime(System.currentTimeMillis());
                statRequest.setUid(Integer.parseInt(this.f58937b));
                statRequest.getExt().setUid(statRequest.getUid());
                statRequest.getExt().setGameId(this.f58938c);
                statRequest.getExt().setPosition(this.f58939d);
                try {
                    statRequest.getData().setGameId(Long.parseLong(this.f58938c));
                } catch (Exception unused) {
                }
                p.this.f58888c.B(Event.arenaGameListItem, statRequest);
            } catch (Exception unused2) {
            }
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class c1 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f58941b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f58942c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f58943d;

        c1(String str, String str2, String str3) {
            this.f58941b = str;
            this.f58942c = str2;
            this.f58943d = str3;
        }

        @Override // java.lang.Runnable
        public void run() {
            StatRequest statRequest = new StatRequest();
            statRequest.setEvent(Event.clickSearchAdPosition.name());
            try {
                statRequest.setUid(Integer.parseInt(this.f58941b));
            } catch (Exception unused) {
            }
            statRequest.getExt().setUid(statRequest.getUid());
            statRequest.getExt().setPosition(this.f58942c);
            statRequest.getExt().setGameId(this.f58943d);
            statRequest.getData().setUid(this.f58941b);
            p.this.f58888c.B(Event.clickSearchAdPosition, statRequest);
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class c2 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f58945b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f58946c;

        c2(String str, String str2) {
            this.f58945b = str;
            this.f58946c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            p.this.f58888c.J(Event.downloadStop, this.f58945b, this.f58946c);
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class c3 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f58948b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f58949c;

        c3(String str, int i4) {
            this.f58948b = str;
            this.f58949c = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                p.this.f58888c.y(Event.clickGameMainBtn, Event.login, this.f58948b, this.f58949c);
            } catch (Exception unused) {
            }
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class c4 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f58951b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f58952c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f58953d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f58954e;

        c4(String str, int i4, int i5, int i6) {
            this.f58951b = str;
            this.f58952c = i4;
            this.f58953d = i5;
            this.f58954e = i6;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                StatRequest statRequest = new StatRequest();
                Event event = Event.shareResult;
                statRequest.setEvent(event.name());
                statRequest.setTime(System.currentTimeMillis());
                statRequest.setUid(Integer.parseInt(this.f58951b));
                statRequest.getExt().setUid(statRequest.getUid());
                statRequest.getExt().setShareMfr(this.f58952c);
                statRequest.getExt().setShareType(this.f58953d);
                statRequest.getExt().setShareResult(this.f58954e);
                p.this.f58888c.B(event, statRequest);
            } catch (Exception unused) {
            }
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class d implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f58956b;

        d(String str) {
            this.f58956b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                StatRequest statRequest = new StatRequest();
                Event event = Event.VsSelectSilentBtn;
                statRequest.setEvent(event.name());
                statRequest.setTime(System.currentTimeMillis());
                statRequest.setUid(Integer.parseInt(this.f58956b));
                statRequest.getExt().setUid(statRequest.getUid());
                p.this.f58888c.B(event, statRequest);
            } catch (Exception unused) {
            }
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class d0 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f58958b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f58959c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f58960d;

        d0(String str, int i4, String str2) {
            this.f58958b = str;
            this.f58959c = i4;
            this.f58960d = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                StatRequest statRequest = new StatRequest();
                Event event = Event.areaRoomFromInvite;
                statRequest.setEvent(event.name());
                statRequest.setTime(System.currentTimeMillis());
                statRequest.setUid(Integer.parseInt(this.f58958b));
                statRequest.getExt().setUid(statRequest.getUid());
                Ext ext = statRequest.getExt();
                ext.setRoomID(this.f58959c + "");
                statRequest.getExt().setFightId(this.f58960d);
                p.this.f58888c.B(event, statRequest);
            } catch (Exception unused) {
            }
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class d1 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f58962b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f58963c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f58964d;

        d1(String str, String str2, String str3) {
            this.f58962b = str;
            this.f58963c = str2;
            this.f58964d = str3;
        }

        @Override // java.lang.Runnable
        public void run() {
            StatRequest statRequest = new StatRequest();
            statRequest.setEvent(Event.downloadFromSearchResult.name());
            try {
                statRequest.setUid(Integer.parseInt(this.f58962b));
            } catch (Exception unused) {
            }
            statRequest.getExt().setGameId(this.f58963c);
            statRequest.getExt().setUid(statRequest.getUid());
            statRequest.getExt().setPosition(this.f58964d);
            statRequest.getData().setUid(this.f58962b);
            p.this.f58888c.B(Event.downloadFromSearchResult, statRequest);
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class d2 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f58966b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f58967c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f58968d;

        d2(String str, String str2, String str3) {
            this.f58966b = str;
            this.f58967c = str2;
            this.f58968d = str3;
        }

        @Override // java.lang.Runnable
        public void run() {
            StatRequest statRequest = new StatRequest();
            statRequest.setEvent(Event.netBattleMatchStart.name());
            try {
                statRequest.setUid(Integer.parseInt(this.f58966b));
                statRequest.getData().setGameId(Long.parseLong(this.f58967c));
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            statRequest.getExt().setUid(statRequest.getUid());
            statRequest.getExt().setPlugVersion(this.f58968d);
            statRequest.getData().setUid(this.f58966b);
            p.this.f58888c.B(Event.netBattleMatchStart, statRequest);
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class d3 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f58970b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f58971c;

        d3(String str, int i4) {
            this.f58970b = str;
            this.f58971c = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                p.this.f58888c.y(Event.clickGameMainBtn, Event.logout, this.f58970b, this.f58971c);
            } catch (Exception unused) {
            }
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class d4 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f58973b;

        d4(String str) {
            this.f58973b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                StatRequest statRequest = new StatRequest();
                Event event = Event.f2fRequestCreateQrcode;
                statRequest.setEvent(event.name());
                statRequest.setTime(System.currentTimeMillis());
                statRequest.setUid(Integer.parseInt(this.f58973b));
                statRequest.getExt().setUid(statRequest.getUid());
                p.this.f58888c.B(event, statRequest);
            } catch (Exception unused) {
            }
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class e implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f58975b;

        e(String str) {
            this.f58975b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                StatRequest statRequest = new StatRequest();
                Event event = Event.VsCreateSilentRoom;
                statRequest.setEvent(event.name());
                statRequest.setTime(System.currentTimeMillis());
                statRequest.setUid(Integer.parseInt(this.f58975b));
                statRequest.getExt().setUid(statRequest.getUid());
                p.this.f58888c.B(event, statRequest);
            } catch (Exception unused) {
            }
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class e0 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f58977b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f58978c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f58979d;

        e0(String str, String str2, String str3) {
            this.f58977b = str;
            this.f58978c = str2;
            this.f58979d = str3;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                StatRequest statRequest = new StatRequest();
                statRequest.setEvent(Event.sharePasteClick.name());
                try {
                    statRequest.getData().setGameId(Long.parseLong(this.f58977b));
                } catch (Exception unused) {
                }
                statRequest.setTime(System.currentTimeMillis());
                statRequest.setUid(Integer.parseInt(this.f58978c));
                statRequest.getExt().setUid(statRequest.getUid());
                statRequest.getExt().setGameId(this.f58977b);
                statRequest.getExt().setFightId(this.f58979d);
                p.this.f58888c.B(Event.sharePasteClick, statRequest);
            } catch (Exception unused2) {
            }
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class e1 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f58981b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f58982c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f58983d;

        e1(String str, String str2, String str3) {
            this.f58981b = str;
            this.f58982c = str2;
            this.f58983d = str3;
        }

        @Override // java.lang.Runnable
        public void run() {
            StatRequest statRequest = new StatRequest();
            statRequest.setEvent(Event.clickDetailFromSearchResult.name());
            try {
                statRequest.setUid(Integer.parseInt(this.f58981b));
            } catch (Exception unused) {
            }
            statRequest.getExt().setGameId(this.f58982c);
            statRequest.getExt().setUid(statRequest.getUid());
            statRequest.getExt().setPosition(this.f58983d);
            statRequest.getData().setUid(this.f58981b);
            p.this.f58888c.B(Event.clickDetailFromSearchResult, statRequest);
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class e2 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f58985b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f58986c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f58987d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f58988e;

        e2(String str, String str2, long j4, String str3) {
            this.f58985b = str;
            this.f58986c = str2;
            this.f58987d = j4;
            this.f58988e = str3;
        }

        @Override // java.lang.Runnable
        public void run() {
            StatRequest statRequest = new StatRequest();
            statRequest.setEvent(Event.netBattleMatchFinish.name());
            try {
                statRequest.setUid(Integer.parseInt(this.f58985b));
                statRequest.getData().setGameId(Long.parseLong(this.f58986c));
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            statRequest.getExt().setDuration(this.f58987d);
            statRequest.getExt().setUid(statRequest.getUid());
            statRequest.getExt().setPlugVersion(this.f58988e);
            statRequest.getData().setUid(this.f58985b);
            p.this.f58888c.B(Event.netBattleMatchFinish, statRequest);
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class e3 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f58990b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f58991c;

        e3(String str, int i4) {
            this.f58990b = str;
            this.f58991c = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                p.this.f58888c.y(Event.clickFunGameMainBtn, Event.logout, this.f58990b, this.f58991c);
            } catch (Exception unused) {
            }
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class e4 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f58993b;

        e4(String str) {
            this.f58993b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                StatRequest statRequest = new StatRequest();
                Event event = Event.f2fCreateQrcodeSuccess;
                statRequest.setEvent(event.name());
                statRequest.setTime(System.currentTimeMillis());
                statRequest.setUid(Integer.parseInt(this.f58993b));
                statRequest.getExt().setUid(statRequest.getUid());
                p.this.f58888c.B(event, statRequest);
            } catch (Exception unused) {
            }
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class f implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f58995b;

        f(String str) {
            this.f58995b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                StatRequest statRequest = new StatRequest();
                Event event = Event.VsSilentTransform;
                statRequest.setEvent(event.name());
                statRequest.setTime(System.currentTimeMillis());
                statRequest.setUid(Integer.parseInt(this.f58995b));
                statRequest.getExt().setUid(statRequest.getUid());
                p.this.f58888c.B(event, statRequest);
            } catch (Exception unused) {
            }
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class f0 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Event f58997b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f58998c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f58999d;

        f0(Event event, String str, String str2) {
            this.f58997b = event;
            this.f58998c = str;
            this.f58999d = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                StatRequest statRequest = new StatRequest();
                statRequest.setEvent(this.f58997b.name());
                try {
                    statRequest.getData().setGameId(Long.parseLong(this.f58998c));
                } catch (Exception unused) {
                }
                statRequest.setTime(System.currentTimeMillis());
                statRequest.setUid(Integer.parseInt(this.f58999d));
                statRequest.getExt().setUid(statRequest.getUid());
                statRequest.getExt().setGameId(this.f58998c);
                p.this.f58888c.B(this.f58997b, statRequest);
            } catch (Exception unused2) {
            }
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class f1 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f59001b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f59002c;

        f1(String str, String str2) {
            this.f59001b = str;
            this.f59002c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            p.this.f58888c.J(Event.clickCreateLocalNetBattleRoomBtn, this.f59001b, this.f59002c);
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class f2 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f59004b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f59005c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f59006d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f59007e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f59008f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f59009g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f59010h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ int f59011i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ String f59012j;

        f2(String str, String str2, long j4, int i4, String str3, int i5, int i6, int i7, String str4) {
            this.f59004b = str;
            this.f59005c = str2;
            this.f59006d = j4;
            this.f59007e = i4;
            this.f59008f = str3;
            this.f59009g = i5;
            this.f59010h = i6;
            this.f59011i = i7;
            this.f59012j = str4;
        }

        @Override // java.lang.Runnable
        public void run() {
            p.this.f58888c.M(Event.gameDownloadCompleted, this.f59004b, this.f59005c, this.f59006d, this.f59007e, this.f59008f, -1L, this.f59009g, this.f59010h, this.f59011i, this.f59012j);
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class f3 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f59014b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f59015c;

        f3(String str, int i4) {
            this.f59014b = str;
            this.f59015c = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                p.this.f58888c.y(Event.clickGameMainBtn, Event.forum, this.f59014b, this.f59015c);
            } catch (Exception unused) {
            }
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class f4 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Where f59017b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f59018c;

        f4(Where where, String str) {
            this.f59017b = where;
            this.f59018c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            p.this.f58888c.D(Event.visitSearchPage, this.f59017b, this.f59018c);
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class g implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f59020b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f59021c;

        g(String str, String str2) {
            this.f59020b = str;
            this.f59021c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                StatRequest statRequest = new StatRequest();
                Event event = Event.clickVsLocalBat;
                statRequest.setEvent(event.name());
                statRequest.setTime(System.currentTimeMillis());
                statRequest.setUid(Integer.parseInt(this.f59020b));
                statRequest.getExt().setUid(statRequest.getUid());
                statRequest.getExt().setGameId(this.f59021c);
                p.this.f58888c.B(event, statRequest);
            } catch (Exception unused) {
            }
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class g0 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f59023b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f59024c;

        g0(String str, String str2) {
            this.f59023b = str;
            this.f59024c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            p.this.f58888c.J(Event.clickLocalNetBattleStartBtn, this.f59023b, this.f59024c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    public class g1 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f59026b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f59027c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f59028d;

        g1(String str, String str2, String str3) {
            this.f59026b = str;
            this.f59027c = str2;
            this.f59028d = str3;
        }

        @Override // java.lang.Runnable
        public void run() {
            p.this.f58888c.e0(Event.gameStart, this.f59026b, this.f59027c, this.f59028d);
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class g2 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f59030b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f59031c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f59032d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f59033e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f59034f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ String f59035g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f59036h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ int f59037i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ int f59038j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ String f59039k;

        g2(String str, String str2, long j4, int i4, String str3, String str4, int i5, int i6, int i7, String str5) {
            this.f59030b = str;
            this.f59031c = str2;
            this.f59032d = j4;
            this.f59033e = i4;
            this.f59034f = str3;
            this.f59035g = str4;
            this.f59036h = i5;
            this.f59037i = i6;
            this.f59038j = i7;
            this.f59039k = str5;
        }

        @Override // java.lang.Runnable
        public void run() {
            p.this.f58888c.N(Event.gameDownloadCompleted, this.f59030b, this.f59031c, this.f59032d, this.f59033e, this.f59034f, this.f59035g, -1L, this.f59036h, this.f59037i, this.f59038j, this.f59039k);
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class g3 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f59041b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f59042c;

        g3(String str, int i4) {
            this.f59041b = str;
            this.f59042c = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                p.this.f58888c.y(Event.clickFunGameMainBtn, Event.forum, this.f59041b, this.f59042c);
            } catch (Exception unused) {
            }
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class g4 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f59044b;

        g4(String str) {
            this.f59044b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                StatRequest statRequest = new StatRequest();
                Event event = Event.liveResDownloaded;
                statRequest.setEvent(event.name());
                statRequest.setTime(System.currentTimeMillis());
                statRequest.setUid(Integer.parseInt(this.f59044b));
                statRequest.getExt().setUid(statRequest.getUid());
                p.this.f58888c.B(event, statRequest);
            } catch (Exception unused) {
            }
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class h implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f59046b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f59047c;

        h(String str, String str2) {
            this.f59046b = str;
            this.f59047c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                StatRequest statRequest = new StatRequest();
                Event event = Event.clickVsNetBattleMatch;
                statRequest.setEvent(event.name());
                statRequest.setTime(System.currentTimeMillis());
                statRequest.setUid(Integer.parseInt(this.f59046b));
                statRequest.getExt().setUid(statRequest.getUid());
                statRequest.getExt().setGameId(this.f59047c);
                p.this.f58888c.B(event, statRequest);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    public class h0 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Event f59049b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f59050c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f59051d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f59052e;

        h0(Event event, String str, String str2, String str3) {
            this.f59049b = event;
            this.f59050c = str;
            this.f59051d = str2;
            this.f59052e = str3;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                StatRequest statRequest = new StatRequest();
                statRequest.setEvent(this.f59049b.name());
                try {
                    statRequest.getData().setGameId(Long.parseLong(this.f59050c));
                } catch (Exception unused) {
                }
                statRequest.setTime(System.currentTimeMillis());
                statRequest.setUid(Integer.parseInt(this.f59051d));
                statRequest.getExt().setUid(statRequest.getUid());
                statRequest.getExt().setGameId(this.f59050c);
                statRequest.getExt().setNodeId(this.f59052e);
                p.this.f58888c.B(this.f59049b, statRequest);
            } catch (Exception unused2) {
            }
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class h1 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f59054b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f59055c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f59056d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f59057e;

        h1(String str, String str2, int i4, String str3) {
            this.f59054b = str;
            this.f59055c = str2;
            this.f59056d = i4;
            this.f59057e = str3;
        }

        @Override // java.lang.Runnable
        public void run() {
            p.this.f58888c.L(Event.inviteBattleShareSuccess, this.f59054b, this.f59055c, this.f59056d, this.f59057e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    public class h2 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f59059b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f59060c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f59061d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f59062e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f59063f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ long f59064g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f59065h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ long f59066i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ String f59067j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ int f59068k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ int f59069l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ int f59070m;

        h2(String str, String str2, String str3, String str4, String str5, long j4, int i4, long j5, String str6, int i5, int i6, int i7) {
            this.f59059b = str;
            this.f59060c = str2;
            this.f59061d = str3;
            this.f59062e = str4;
            this.f59063f = str5;
            this.f59064g = j4;
            this.f59065h = i4;
            this.f59066i = j5;
            this.f59067j = str6;
            this.f59068k = i5;
            this.f59069l = i6;
            this.f59070m = i7;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            String sb;
            String string;
            StatRequest statRequest = new StatRequest();
            if (!TextUtils.isEmpty(this.f59059b)) {
                statRequest.getExt().setPage(this.f59059b);
            }
            statRequest.getExt().setQkPosition(this.f59060c);
            if (!TextUtils.isEmpty(this.f59061d)) {
                statRequest.setEvent(Event.gameDownload.name());
                statRequest.setTime(System.currentTimeMillis());
                statRequest.getData().setGameId(Long.parseLong(this.f59062e));
                statRequest.setUid(Integer.parseInt(this.f59063f));
                statRequest.getExt().setUid(statRequest.getUid());
                statRequest.getExt().setDuration(this.f59064g);
                statRequest.getExt().setInterrupt(this.f59065h);
                statRequest.getExt().setZipCost(this.f59066i);
                statRequest.getExt().setKeyWord(this.f59067j);
                statRequest.getExt().setGameFlag(this.f59068k);
                if (this.f59069l == 1) {
                    statRequest.getData().setWhere(Where.search.name());
                    statRequest.getExt().setFrom("103");
                } else {
                    try {
                        if (!TextUtils.isEmpty(this.f59061d)) {
                            JSONObject jSONObject = new JSONObject(this.f59061d);
                            if (jSONObject.has("from") && !TextUtils.isEmpty(jSONObject.getString("from")) && !TextUtils.equals("0", jSONObject.getString("from"))) {
                                sb = jSONObject.getString("from");
                                str = "";
                            } else {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(this.f59069l);
                                str = "";
                                sb2.append(str);
                                sb = sb2.toString();
                            }
                            statRequest.getExt().setFrom(sb);
                            statRequest.getExt().setPosition(jSONObject.has("position") ? jSONObject.getString("position") : str);
                            statRequest.getExt().setReMarks(jSONObject.has("location") ? jSONObject.getString("location") : str);
                            if (jSONObject.has("_from_type") && (string = jSONObject.getString("_from_type")) != null) {
                                statRequest.getExt().setFrom(sb);
                                statRequest.getExt().setPosition(string);
                                if (jSONObject.has("recPosition")) {
                                    statRequest.getExt().setRecPosition(jSONObject.getString("recPosition"));
                                }
                                if (jSONObject.has("reMarks")) {
                                    statRequest.getExt().setReMarks(jSONObject.getString("reMarks"));
                                }
                                if (jSONObject.has("nodeId")) {
                                    statRequest.getExt().setNodeId(jSONObject.getString("nodeId"));
                                }
                            }
                            if (jSONObject.has("dataFlag")) {
                                statRequest.getExt().setDataFlag(jSONObject.getString("dataFlag"));
                            }
                            if (jSONObject.has("where")) {
                                statRequest.getData().setWhere(jSONObject.getString("where"));
                            }
                        }
                    } catch (Exception e5) {
                        e5.printStackTrace();
                    }
                }
                p.this.f58888c.B(Event.gameDownload, statRequest);
            } else if (this.f59069l == 1) {
                Event event = Event.gameDownload;
                statRequest.setEvent(event.name());
                statRequest.setTime(System.currentTimeMillis());
                statRequest.getData().setGameId(Long.parseLong(this.f59062e));
                statRequest.getData().setWhere(Where.search.name());
                statRequest.setUid(Integer.parseInt(this.f59063f));
                statRequest.getExt().setUid(statRequest.getUid());
                statRequest.getExt().setKeyWord(this.f59067j);
                statRequest.getExt().setDuration(this.f59064g);
                statRequest.getExt().setInterrupt(this.f59065h);
                statRequest.getExt().setZipCost(this.f59066i);
                statRequest.getExt().setFrom("103");
                Ext ext = statRequest.getExt();
                ext.setPosition(this.f59070m + "");
                statRequest.getExt().setGameFlag(this.f59068k);
                p.this.f58888c.B(event, statRequest);
            } else {
                Ext ext2 = new Ext();
                Data data = new Data();
                try {
                    data.setGameId(Long.parseLong(this.f59062e));
                    ext2.setUid(Integer.parseInt(this.f59063f));
                } catch (Exception unused) {
                }
                data.setWhere(this.f59067j);
                ext2.setZipCost(this.f59066i);
                ext2.setDuration(this.f59064g);
                ext2.setInterrupt(this.f59065h);
                ext2.setFrom(this.f59069l + "");
                if (this.f59069l == 101) {
                    ext2.setPosition(this.f59070m + "");
                }
                ext2.setGameFlag(this.f59068k);
                p.this.f58888c.O(Event.gameDownload, this.f59062e, this.f59063f, ext2);
            }
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class h3 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f59072b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f59073c;

        h3(String str, int i4) {
            this.f59072b = str;
            this.f59073c = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                p.this.f58888c.y(Event.clickGameMainBtn, Event.practice, this.f59072b, this.f59073c);
            } catch (Exception unused) {
            }
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class h4 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f59075b;

        h4(String str) {
            this.f59075b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                StatRequest statRequest = new StatRequest();
                Event event = Event.clickVsBtn;
                statRequest.setEvent(event.name());
                statRequest.setTime(System.currentTimeMillis());
                statRequest.setUid(Integer.parseInt(this.f59075b));
                statRequest.getExt().setUid(statRequest.getUid());
                p.this.f58888c.B(event, statRequest);
            } catch (Exception unused) {
            }
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class i implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f59077b;

        i(String str) {
            this.f59077b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                StatRequest statRequest = new StatRequest();
                Event event = Event.clickVslLocalCreateRoom;
                statRequest.setEvent(event.name());
                statRequest.setTime(System.currentTimeMillis());
                statRequest.setUid(Integer.parseInt(this.f59077b));
                statRequest.getExt().setUid(statRequest.getUid());
                p.this.f58888c.B(event, statRequest);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    public class i0 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Event f59079b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f59080c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f59081d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f59082e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f59083f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ String f59084g;

        i0(Event event, String str, String str2, String str3, int i4, String str4) {
            this.f59079b = event;
            this.f59080c = str;
            this.f59081d = str2;
            this.f59082e = str3;
            this.f59083f = i4;
            this.f59084g = str4;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                StatRequest statRequest = new StatRequest();
                statRequest.setEvent(this.f59079b.name());
                try {
                    statRequest.getData().setGameId(Long.parseLong(this.f59080c));
                } catch (Exception unused) {
                }
                statRequest.setTime(System.currentTimeMillis());
                statRequest.setUid(Integer.parseInt(this.f59081d));
                statRequest.getExt().setUid(statRequest.getUid());
                statRequest.getExt().setGameId(this.f59080c);
                statRequest.getExt().setPosition(this.f59082e);
                statRequest.getExt().setGameFlag(this.f59083f);
                statRequest.getExt().setFrom(this.f59084g);
                p.this.f58888c.B(this.f59079b, statRequest);
            } catch (Exception unused2) {
            }
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class i1 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f59086b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f59087c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f59088d;

        i1(String str, int i4, int i5) {
            this.f59086b = str;
            this.f59087c = i4;
            this.f59088d = i5;
        }

        @Override // java.lang.Runnable
        public void run() {
            p.this.f58888c.F(Event.gameRecovery, this.f59086b, this.f59087c, this.f59088d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    public class i2 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f59090b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f59091c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f59092d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f59093e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f59094f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ String f59095g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ long f59096h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ int f59097i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ long f59098j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ String f59099k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ int f59100l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ int f59101m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ int f59102n;

        i2(String str, String str2, String str3, String str4, String str5, String str6, long j4, int i4, long j5, String str7, int i5, int i6, int i7) {
            this.f59090b = str;
            this.f59091c = str2;
            this.f59092d = str3;
            this.f59093e = str4;
            this.f59094f = str5;
            this.f59095g = str6;
            this.f59096h = j4;
            this.f59097i = i4;
            this.f59098j = j5;
            this.f59099k = str7;
            this.f59100l = i5;
            this.f59101m = i6;
            this.f59102n = i7;
        }

        @Override // java.lang.Runnable
        public void run() {
            String string;
            StatRequest statRequest = new StatRequest();
            if (!TextUtils.isEmpty(this.f59090b)) {
                statRequest.getExt().setPage(this.f59090b);
            }
            statRequest.getExt().setQkPosition(this.f59091c);
            if (TextUtils.isEmpty(this.f59092d)) {
                p.this.f58888c.N(Event.gameDownload, this.f59093e, this.f59095g, this.f59096h, this.f59097i, this.f59094f, this.f59099k, this.f59098j, this.f59101m, this.f59102n, this.f59100l, "");
                return;
            }
            statRequest.setEvent(Event.gameDownload.name());
            statRequest.setTime(System.currentTimeMillis());
            statRequest.getData().setGameId(Long.parseLong(this.f59093e));
            statRequest.setUid(Integer.parseInt(this.f59094f));
            statRequest.getExt().setUid(statRequest.getUid());
            statRequest.getExt().setKeyWord(this.f59095g);
            statRequest.getExt().setDuration(this.f59096h);
            statRequest.getExt().setInterrupt(this.f59097i);
            statRequest.getExt().setZipCost(this.f59098j);
            statRequest.getExt().setArticleId(this.f59099k);
            statRequest.getExt().setGameFlag(this.f59100l);
            try {
                if (!TextUtils.isEmpty(this.f59092d)) {
                    JSONObject jSONObject = new JSONObject(this.f59092d);
                    String string2 = jSONObject.getString("from");
                    String string3 = jSONObject.getString("position");
                    jSONObject.getString("location");
                    statRequest.getExt().setFrom(string2);
                    statRequest.getExt().setPosition(string3);
                    if (jSONObject.has("_from_type") && (string = jSONObject.getString("_from_type")) != null) {
                        statRequest.getExt().setFrom(string2);
                        statRequest.getExt().setPosition(string);
                        if (jSONObject.has("recPosition")) {
                            statRequest.getExt().setRecPosition(jSONObject.getString("recPosition"));
                        }
                        if (jSONObject.has("reMarks")) {
                            statRequest.getExt().setReMarks(jSONObject.getString("reMarks"));
                        }
                        if (jSONObject.has("nodeId")) {
                            statRequest.getExt().setNodeId(jSONObject.getString("nodeId"));
                        }
                    }
                    if (jSONObject.has("dataFlag")) {
                        statRequest.getExt().setDataFlag(jSONObject.getString("dataFlag"));
                    }
                    if (jSONObject.has("where")) {
                        statRequest.getData().setWhere(jSONObject.getString("where"));
                    }
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            p.this.f58888c.B(Event.gameDownload, statRequest);
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class i3 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f59104b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f59105c;

        i3(String str, int i4) {
            this.f59104b = str;
            this.f59105c = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                p.this.f58888c.y(Event.clickFunGameMainBtn, Event.practice, this.f59104b, this.f59105c);
            } catch (Exception unused) {
            }
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class i4 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f59107b;

        i4(String str) {
            this.f59107b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                StatRequest statRequest = new StatRequest();
                Event event = Event.clickVsHallBtn;
                statRequest.setEvent(event.name());
                statRequest.setTime(System.currentTimeMillis());
                statRequest.setUid(Integer.parseInt(this.f59107b));
                statRequest.getExt().setUid(statRequest.getUid());
                p.this.f58888c.B(event, statRequest);
            } catch (Exception unused) {
            }
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class j implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f59109b;

        j(String str) {
            this.f59109b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                StatRequest statRequest = new StatRequest();
                Event event = Event.clickVsJoinRoom;
                statRequest.setEvent(event.name());
                statRequest.setTime(System.currentTimeMillis());
                statRequest.setUid(Integer.parseInt(this.f59109b));
                statRequest.getExt().setUid(statRequest.getUid());
                p.this.f58888c.B(event, statRequest);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    public class j0 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Event f59111b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f59112c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f59113d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f59114e;

        j0(Event event, String str, String str2, String str3) {
            this.f59111b = event;
            this.f59112c = str;
            this.f59113d = str2;
            this.f59114e = str3;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                StatRequest statRequest = new StatRequest();
                statRequest.setEvent(this.f59111b.name());
                statRequest.getExt().setReMarks(this.f59112c);
                statRequest.getExt().setPlugId(this.f59113d);
                statRequest.getExt().setPlugVersion(this.f59114e);
                p.this.f58888c.B(this.f59111b, statRequest);
            } catch (Exception unused) {
            }
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class j1 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f59116b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f59117c;

        j1(String str, String str2) {
            this.f59116b = str;
            this.f59117c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            p.this.f58888c.J(Event.inviteBattleAutoJoinSuccess, this.f59116b, this.f59117c);
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class j2 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f59119b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f59120c;

        j2(String str, String str2) {
            this.f59119b = str;
            this.f59120c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            p.this.f58888c.J(Event.gameList, this.f59119b, this.f59120c);
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class j3 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f59122b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f59123c;

        j3(String str, String str2) {
            this.f59122b = str;
            this.f59123c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Ext ext = new Ext();
            ext.setArticleId(this.f59122b);
            p.this.f58888c.A(Event.articleClickDownload, ext, this.f59123c);
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class j4 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f59125b;

        j4(String str) {
            this.f59125b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                StatRequest statRequest = new StatRequest();
                Event event = Event.visitVsRoomPage;
                statRequest.setEvent(event.name());
                statRequest.setTime(System.currentTimeMillis());
                statRequest.setUid(Integer.parseInt(this.f59125b));
                statRequest.getExt().setUid(statRequest.getUid());
                p.this.f58888c.B(event, statRequest);
            } catch (Exception unused) {
            }
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class k implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f59127b;

        k(String str) {
            this.f59127b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            p.this.f58888c.J(Event.startApp, "", this.f59127b);
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class k0 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f59129b;

        k0(String str) {
            this.f59129b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                StatRequest statRequest = new StatRequest();
                Event event = Event.onMainPageShow;
                statRequest.setEvent(event.name());
                statRequest.setTime(System.currentTimeMillis());
                statRequest.setUid(Integer.parseInt(this.f59129b));
                statRequest.getExt().setUid(statRequest.getUid());
                p.this.f58888c.B(event, statRequest);
            } catch (Exception unused) {
            }
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class k1 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f59131b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f59132c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f59133d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f59134e;

        k1(String str, String str2, int i4, String str3) {
            this.f59131b = str;
            this.f59132c = str2;
            this.f59133d = i4;
            this.f59134e = str3;
        }

        @Override // java.lang.Runnable
        public void run() {
            p.this.f58888c.L(Event.joinLocalNetBattleRoomSuccess, this.f59131b, this.f59132c, this.f59133d, this.f59134e);
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class k2 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f59136b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f59137c;

        k2(String str, String str2) {
            this.f59136b = str;
            this.f59137c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            p.this.f58888c.J(Event.appPageVisit, this.f59136b, this.f59137c);
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class k3 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f59139b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f59140c;

        k3(String str, int i4) {
            this.f59139b = str;
            this.f59140c = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                p.this.f58888c.y(Event.clickGameMainBtn, Event.welcomeGameMain, this.f59139b, this.f59140c);
            } catch (Exception unused) {
            }
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class k4 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f59142b;

        k4(String str) {
            this.f59142b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                StatRequest statRequest = new StatRequest();
                Event event = Event.visitVsMainPage;
                statRequest.setEvent(event.name());
                statRequest.setTime(System.currentTimeMillis());
                statRequest.setUid(Integer.parseInt(this.f59142b));
                statRequest.getExt().setUid(statRequest.getUid());
                p.this.f58888c.B(event, statRequest);
            } catch (Exception unused) {
            }
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class l implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f59144b;

        l(String str) {
            this.f59144b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                StatRequest statRequest = new StatRequest();
                Event event = Event.f2fRequestScanQrcode;
                statRequest.setEvent(event.name());
                statRequest.setTime(System.currentTimeMillis());
                statRequest.setUid(Integer.parseInt(this.f59144b));
                statRequest.getExt().setUid(statRequest.getUid());
                p.this.f58888c.B(event, statRequest);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    public class l0 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Event f59146b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Ext f59147c;

        l0(Event event, Ext ext) {
            this.f59146b = event;
            this.f59147c = ext;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                p.this.f58888c.S(this.f59146b.name(), this.f59147c);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class l1 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f59149b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f59150c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f59151d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f59152e;

        l1(String str, String str2, int i4, String str3) {
            this.f59149b = str;
            this.f59150c = str2;
            this.f59151d = i4;
            this.f59152e = str3;
        }

        @Override // java.lang.Runnable
        public void run() {
            p.this.f58888c.L(Event.clickLocalNetBattleJoinRoomBtn, this.f59149b, this.f59150c, this.f59151d, this.f59152e);
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class l2 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ StatJsonRawData f59154b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f59155c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f59156d;

        l2(StatJsonRawData statJsonRawData, String str, String str2) {
            this.f59154b = statJsonRawData;
            this.f59155c = str;
            this.f59156d = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f59154b.setGameId(Long.parseLong(this.f59155c));
                this.f59154b.setUid(Integer.parseInt(this.f59156d));
                p.this.f58888c.J(Event.netBattleMatchEfficiency, JsonMapper.e().toJson(this.f59154b), this.f59156d);
            } catch (Exception unused) {
            }
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class l3 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f59158b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f59159c;

        l3(String str, int i4) {
            this.f59158b = str;
            this.f59159c = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                p.this.f58888c.y(Event.clickFunGameMainBtn, Event.welcomeGameMain, this.f59158b, this.f59159c);
            } catch (Exception unused) {
            }
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class l4 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Event f59161b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f59162c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f59163d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f59164e;

        l4(Event event, String str, String str2, String str3) {
            this.f59161b = event;
            this.f59162c = str;
            this.f59163d = str2;
            this.f59164e = str3;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                StatRequest statRequest = new StatRequest();
                statRequest.setEvent(this.f59161b.name());
                if (!TextUtils.isEmpty(this.f59162c)) {
                    statRequest.getData().setGameId(Long.parseLong(this.f59162c));
                }
                statRequest.setTime(System.currentTimeMillis());
                statRequest.setUid(Integer.parseInt(this.f59163d));
                statRequest.getExt().setChannel_id(Integer.parseInt(this.f59164e));
                statRequest.getExt().setUid(statRequest.getUid());
                p.this.f58888c.B(this.f59161b, statRequest);
            } catch (Exception unused) {
            }
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class m implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f59166b;

        m(String str) {
            this.f59166b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                StatRequest statRequest = new StatRequest();
                Event event = Event.f2fConnectQrcodeSuccess;
                statRequest.setEvent(event.name());
                statRequest.setTime(System.currentTimeMillis());
                statRequest.setUid(Integer.parseInt(this.f59166b));
                statRequest.getExt().setUid(statRequest.getUid());
                p.this.f58888c.B(event, statRequest);
            } catch (Exception unused) {
            }
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class m0 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Event f59168b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f59169c;

        m0(Event event, int i4) {
            this.f59168b = event;
            this.f59169c = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                StatRequest statRequest = new StatRequest();
                statRequest.setEvent(this.f59168b.name());
                statRequest.setTime(System.currentTimeMillis());
                statRequest.setUid(this.f59169c);
                statRequest.getExt().setUid(statRequest.getUid());
                p.this.f58888c.B(this.f59168b, statRequest);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class m1 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f59171b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f59172c;

        m1(String str, String str2) {
            this.f59171b = str;
            this.f59172c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            p.this.f58888c.J(Event.clickLocalNetBattleRoomStartBtn, this.f59171b, this.f59172c);
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class m2 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f59174b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f59175c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f59176d;

        m2(String str, String str2, String str3) {
            this.f59174b = str;
            this.f59175c = str2;
            this.f59176d = str3;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                p.this.f58888c.P(Event.plugEfficiency, this.f59174b, this.f59175c, this.f59176d);
            } catch (Exception unused) {
            }
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class m3 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f59178b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f59179c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f59180d;

        m3(int i4, String str, int i5) {
            this.f59178b = i4;
            this.f59179c = str;
            this.f59180d = i5;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                p.this.f58888c.x(Event.clickGameMainBtn, Event.ad, this.f59178b, this.f59179c, this.f59180d);
            } catch (Exception unused) {
            }
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class m4 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f59182b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f59183c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f59184d;

        m4(int i4, String str, int i5) {
            this.f59182b = i4;
            this.f59183c = str;
            this.f59184d = i5;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                int i4 = this.f59182b;
                if (i4 == 0) {
                    p.this.f58888c.y(Event.VsGameStart, Event.VsSingle, this.f59183c, this.f59184d);
                } else if (i4 == 1) {
                    p.this.f58888c.y(Event.VsGameStart, Event.VsHall, this.f59183c, this.f59184d);
                } else if (i4 == 2) {
                    p.this.f58888c.y(Event.VsGameStart, Event.VsLocal, this.f59183c, this.f59184d);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class n implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f59186b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f59187c;

        n(String str, String str2) {
            this.f59186b = str;
            this.f59187c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                StatRequest statRequest = new StatRequest();
                Event event = Event.f2fRequestTransferGame;
                statRequest.setEvent(event.name());
                statRequest.setTime(System.currentTimeMillis());
                statRequest.setUid(Integer.parseInt(this.f59186b));
                statRequest.getExt().setUid(statRequest.getUid());
                statRequest.getExt().setGameId(this.f59187c);
                p.this.f58888c.B(event, statRequest);
            } catch (Exception unused) {
            }
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class n0 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Event f59189b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Ext f59190c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f59191d;

        n0(Event event, Ext ext, String str) {
            this.f59189b = event;
            this.f59190c = ext;
            this.f59191d = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                p.this.f58888c.f0(this.f59189b.name(), this.f59190c, this.f59191d);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    public class n1 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f59193b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f59194c;

        n1(String str, String str2) {
            this.f59193b = str;
            this.f59194c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            p.this.f58888c.J(Event.joyStickConfigPost, JsonMapper.f().toJson(this.f59193b), this.f59194c);
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class n2 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f59196b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f59197c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f59198d;

        n2(String str, String str2, int i4) {
            this.f59196b = str;
            this.f59197c = str2;
            this.f59198d = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            p.this.f58888c.k0(Event.unzipFailed, this.f59196b, this.f59197c, this.f59198d);
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class n3 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f59200b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f59201c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f59202d;

        n3(int i4, String str, int i5) {
            this.f59200b = i4;
            this.f59201c = str;
            this.f59202d = i5;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                switch (this.f59200b) {
                    case 1:
                        p.this.f58888c.y(Event.pspMemberADDialog, Event.pspADOneKey, this.f59201c, this.f59202d);
                        break;
                    case 2:
                        p.this.f58888c.y(Event.pspMemberADDialog, Event.pspADCheat, this.f59201c, this.f59202d);
                        break;
                    case 3:
                        p.this.f58888c.y(Event.pspMemberADDialog, Event.pspADGArchiving, this.f59201c, this.f59202d);
                        break;
                    case 4:
                        p.this.f58888c.y(Event.pspMemberADDialog, Event.pspADSelLevel, this.f59201c, this.f59202d);
                        break;
                    case 5:
                        p.this.f58888c.y(Event.pspMemberADDialog, Event.pspADBattle, this.f59201c, this.f59202d);
                        break;
                    case 6:
                        p.this.f58888c.y(Event.pspMemberADDialog, Event.pspADOpenInstant, this.f59201c, this.f59202d);
                        break;
                }
            } catch (Exception unused) {
            }
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class n4 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f59204b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f59205c;

        n4(String str, String str2) {
            this.f59204b = str;
            this.f59205c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                StatRequest statRequest = new StatRequest();
                Event event = Event.clickVsForumBtn;
                statRequest.setEvent(event.name());
                statRequest.setTime(System.currentTimeMillis());
                statRequest.setUid(Integer.parseInt(this.f59204b));
                statRequest.getExt().setUid(statRequest.getUid());
                statRequest.getExt().setGameId(this.f59205c);
                p.this.f58888c.B(event, statRequest);
            } catch (Exception unused) {
            }
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class o implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f59207b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f59208c;

        o(String str, String str2) {
            this.f59207b = str;
            this.f59208c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                StatRequest statRequest = new StatRequest();
                Event event = Event.f2fTransferGameDone;
                statRequest.setEvent(event.name());
                statRequest.setTime(System.currentTimeMillis());
                statRequest.setUid(Integer.parseInt(this.f59207b));
                statRequest.getExt().setUid(statRequest.getUid());
                statRequest.getExt().setGameId(this.f59208c);
                p.this.f58888c.B(event, statRequest);
            } catch (Exception unused) {
            }
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class o0 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Event f59210b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f59211c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f59212d;

        o0(Event event, String str, String str2) {
            this.f59210b = event;
            this.f59211c = str;
            this.f59212d = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                p.this.f58888c.g0(this.f59210b.name(), this.f59211c, this.f59212d);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    public class o1 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f59214b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f59215c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f59216d;

        o1(String str, String str2, String str3) {
            this.f59214b = str;
            this.f59215c = str2;
            this.f59216d = str3;
        }

        @Override // java.lang.Runnable
        public void run() {
            StatRequest statRequest = new StatRequest();
            statRequest.setEvent(Event.startDownloadPlug.name());
            try {
                statRequest.setUid(Integer.parseInt(this.f59214b));
            } catch (Exception unused) {
            }
            statRequest.getExt().setUid(statRequest.getUid());
            statRequest.getData().setPlugId(Integer.parseInt(this.f59215c));
            Ext ext = statRequest.getExt();
            ext.setPlugVersion(this.f59216d + "_" + this.f59215c);
            statRequest.getData().setUid(this.f59214b);
            p.this.f58888c.B(Event.startDownloadPlug, statRequest);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    public class o2 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f59218b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f59219c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f59220d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f59221e;

        o2(String str, String str2, String str3, String str4) {
            this.f59218b = str;
            this.f59219c = str2;
            this.f59220d = str3;
            this.f59221e = str4;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                p.this.f58888c.I(Event.pluginPlayTime, this.f59218b, Long.parseLong(this.f59219c), this.f59220d, this.f59221e);
            } catch (Exception unused) {
            }
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class o3 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f59223b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f59224c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f59225d;

        o3(int i4, String str, int i5) {
            this.f59223b = i4;
            this.f59224c = str;
            this.f59225d = i5;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                p.this.f58888c.x(Event.clickFunGameMainBtn, Event.ad, this.f59223b, this.f59224c, this.f59225d);
            } catch (Exception unused) {
            }
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class o4 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f59227b;

        o4(String str) {
            this.f59227b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                StatRequest statRequest = new StatRequest();
                Event event = Event.clickVsAdvBtn;
                statRequest.setEvent(event.name());
                statRequest.setTime(System.currentTimeMillis());
                statRequest.setUid(Integer.parseInt(this.f59227b));
                statRequest.getExt().setUid(statRequest.getUid());
                p.this.f58888c.B(event, statRequest);
            } catch (Exception unused) {
            }
        }
    }

    /* compiled from: StatFactory.java */
    /* renamed from: com.papa.sim.statistic.p$p  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    class RunnableC0594p implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f59229b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f59230c;

        RunnableC0594p(String str, String str2) {
            this.f59229b = str;
            this.f59230c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                StatRequest statRequest = new StatRequest();
                Event event = Event.f2fInterruptTransferGame;
                statRequest.setEvent(event.name());
                statRequest.setTime(System.currentTimeMillis());
                statRequest.setUid(Integer.parseInt(this.f59229b));
                statRequest.getExt().setUid(statRequest.getUid());
                statRequest.getExt().setGameId(this.f59230c);
                p.this.f58888c.B(event, statRequest);
            } catch (Exception unused) {
            }
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class p0 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Event f59232b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Ext f59233c;

        p0(Event event, Ext ext) {
            this.f59232b = event;
            this.f59233c = ext;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                p.this.f58888c.h0(this.f59232b.name(), this.f59233c);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    public class p1 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f59235b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f59236c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f59237d;

        p1(String str, String str2, String str3) {
            this.f59235b = str;
            this.f59236c = str2;
            this.f59237d = str3;
        }

        @Override // java.lang.Runnable
        public void run() {
            StatRequest statRequest = new StatRequest();
            statRequest.setEvent(Event.downloadPlugCompleted.name());
            try {
                statRequest.setUid(Integer.parseInt(this.f59235b));
            } catch (Exception unused) {
            }
            statRequest.getExt().setUid(statRequest.getUid());
            statRequest.getData().setPlugId(Integer.parseInt(this.f59236c));
            Ext ext = statRequest.getExt();
            ext.setPlugVersion(this.f59237d + "_" + this.f59236c);
            statRequest.getData().setUid(this.f59235b);
            p.this.f58888c.B(Event.downloadPlugCompleted, statRequest);
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class p2 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f59239b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f59240c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f59241d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f59242e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f59243f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ String f59244g;

        p2(String str, String str2, String str3, String str4, String str5, String str6) {
            this.f59239b = str;
            this.f59240c = str2;
            this.f59241d = str3;
            this.f59242e = str4;
            this.f59243f = str5;
            this.f59244g = str6;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Ext ext = new Ext();
                ext.setPage(this.f59239b);
                ext.setPosition(this.f59240c);
                ext.setReMarks(this.f59241d);
                ext.setUid(Integer.parseInt(this.f59242e));
                ext.setIsJoin(this.f59243f);
                Data data = new Data();
                data.setWhere(this.f59244g);
                p.this.f58888c.T(Event.clickH5AndCollGamePicPage.name(), ext, data);
            } catch (Exception unused) {
            }
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class p3 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f59246b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f59247c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f59248d;

        p3(int i4, String str, int i5) {
            this.f59246b = i4;
            this.f59247c = str;
            this.f59248d = i5;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                p.this.f58888c.x(Event.clickGameMainBtn, Event.post, this.f59246b, this.f59247c, this.f59248d);
            } catch (Exception unused) {
            }
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class p4 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f59250b;

        p4(String str) {
            this.f59250b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                StatRequest statRequest = new StatRequest();
                Event event = Event.clickVsCreateRoom;
                statRequest.setEvent(event.name());
                statRequest.setTime(System.currentTimeMillis());
                statRequest.setUid(Integer.parseInt(this.f59250b));
                statRequest.getExt().setUid(statRequest.getUid());
                p.this.f58888c.B(event, statRequest);
            } catch (Exception unused) {
            }
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class q implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f59252b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f59253c;

        q(String str, String str2) {
            this.f59252b = str;
            this.f59253c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                StatRequest statRequest = new StatRequest();
                Event event = Event.visitAppInternalPage;
                statRequest.setEvent(event.name());
                statRequest.setTime(System.currentTimeMillis());
                statRequest.setUid(Integer.parseInt(this.f59252b));
                statRequest.getExt().setModule("forum");
                statRequest.getExt().setPage("index");
                statRequest.getExt().setUid(statRequest.getUid());
                statRequest.getExt().setPosition(this.f59253c);
                p.this.f58888c.B(event, statRequest);
            } catch (Exception unused) {
            }
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class q0 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Ext f59255b;

        q0(Ext ext) {
            this.f59255b = ext;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                p.this.f58888c.i0(Event.opHomePageButton.name(), this.f59255b);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class q1 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f59257b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f59258c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f59259d;

        q1(String str, String str2, String str3) {
            this.f59257b = str;
            this.f59258c = str2;
            this.f59259d = str3;
        }

        @Override // java.lang.Runnable
        public void run() {
            StatRequest statRequest = new StatRequest();
            statRequest.setEvent(Event.installPlugCompleted.name());
            try {
                statRequest.setUid(Integer.parseInt(this.f59257b));
            } catch (Exception unused) {
            }
            statRequest.getExt().setUid(statRequest.getUid());
            statRequest.getData().setPlugId(Integer.parseInt(this.f59258c));
            Ext ext = statRequest.getExt();
            ext.setPlugVersion(this.f59259d + "_" + this.f59258c);
            statRequest.getData().setUid(this.f59257b);
            p.this.f58888c.B(Event.installPlugCompleted, statRequest);
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class q2 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f59261b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f59262c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f59263d;

        q2(String str, String str2, String str3) {
            this.f59261b = str;
            this.f59262c = str2;
            this.f59263d = str3;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                p.this.f58888c.P(Event.appPageClick, this.f59261b, this.f59262c, this.f59263d);
            } catch (Exception unused) {
            }
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class q3 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f59265b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f59266c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f59267d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f59268e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f59269f;

        q3(String str, String str2, String str3, String str4, String str5) {
            this.f59265b = str;
            this.f59266c = str2;
            this.f59267d = str3;
            this.f59268e = str4;
            this.f59269f = str5;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                p.this.f58888c.R(Event.visitAppInternalPage, this.f59265b, this.f59266c, this.f59267d, this.f59268e, this.f59269f);
            } catch (Exception unused) {
            }
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class q4 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f59271b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f59272c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f59273d;

        q4(String str, String str2, String str3) {
            this.f59271b = str;
            this.f59272c = str2;
            this.f59273d = str3;
        }

        @Override // java.lang.Runnable
        public void run() {
            p.this.f58888c.V(this.f59271b, this.f59272c, this.f59273d);
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class r implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f59275b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f59276c;

        r(String str, String str2) {
            this.f59275b = str;
            this.f59276c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                StatRequest statRequest = new StatRequest();
                Event event = Event.visitAppInternalPage;
                statRequest.setEvent(event.name());
                statRequest.setTime(System.currentTimeMillis());
                statRequest.setUid(Integer.parseInt(this.f59275b));
                statRequest.getExt().setUid(statRequest.getUid());
                statRequest.getExt().setModule("forum");
                Ext ext = statRequest.getExt();
                ext.setPage("fid" + this.f59276c);
                statRequest.getExt().setPosition("banner1");
                p.this.f58888c.B(event, statRequest);
            } catch (Exception unused) {
            }
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class r0 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f59278b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f59279c;

        r0(String str, String str2) {
            this.f59278b = str;
            this.f59279c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            p.this.f58888c.J(Event.createLocalNetBattleRoomSuccess, this.f59278b, this.f59279c);
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class r1 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f59281b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f59282c;

        r1(String str, String str2) {
            this.f59281b = str;
            this.f59282c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            p.this.f58888c.J(Event.gameRemove, this.f59281b, this.f59282c);
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class r2 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.papa.sim.statistic.e f59284b;

        r2(com.papa.sim.statistic.e eVar) {
            this.f59284b = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                com.papa.sim.statistic.o oVar = p.this.f58888c;
                String name = Event.clickShopHomeEvent.name();
                oVar.Y(name, this.f59284b.e() + "", this.f59284b.b(), this.f59284b.a(), this.f59284b.d(), this.f59284b.c());
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    public class r3 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.papa.sim.statistic.pref.a f59286b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f59287c;

        r3(com.papa.sim.statistic.pref.a aVar, String str) {
            this.f59286b = aVar;
            this.f59287c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                p.this.f58888c.J(Event.appUseTime, JsonMapper.e().toJson(this.f59286b), this.f59287c);
                com.papa.sim.statistic.pref.b.k(p.this.f58887b).G(null);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    public class s implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f59289b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f59290c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f59291d;

        s(String str, String str2, String str3) {
            this.f59289b = str;
            this.f59290c = str2;
            this.f59291d = str3;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                StatRequest statRequest = new StatRequest();
                statRequest.setEvent(Event.visitAppInternalPage.name());
                statRequest.setTime(System.currentTimeMillis());
                statRequest.setUid(Integer.parseInt(this.f59289b));
                statRequest.getExt().setUid(statRequest.getUid());
                statRequest.getExt().setModule("forum");
                Ext ext = statRequest.getExt();
                ext.setPage("game" + this.f59290c);
                statRequest.getExt().setGameId(this.f59291d);
                Ext ext2 = statRequest.getExt();
                ext2.setPosition("gamelist" + this.f59291d);
                try {
                    statRequest.getData().setGameId(Long.parseLong(this.f59291d));
                } catch (Exception unused) {
                }
                p.this.f58888c.B(Event.visitAppInternalPage, statRequest);
            } catch (Exception unused2) {
            }
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class s0 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Event f59293b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Ext f59294c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f59295d;

        s0(Event event, Ext ext, String str) {
            this.f59293b = event;
            this.f59294c = ext;
            this.f59295d = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                p.this.f58888c.U(this.f59293b.name(), this.f59294c, this.f59295d);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class s1 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f59297b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f59298c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f59299d;

        s1(String str, String str2, int i4) {
            this.f59297b = str;
            this.f59298c = str2;
            this.f59299d = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            p.this.f58888c.K(Event.visitGamePage, this.f59297b, this.f59298c, this.f59299d);
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class s2 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f59301b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.papa.sim.statistic.e f59302c;

        s2(boolean z4, com.papa.sim.statistic.e eVar) {
            this.f59301b = z4;
            this.f59302c = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (this.f59301b) {
                    com.papa.sim.statistic.o oVar = p.this.f58888c;
                    String name = Event.clickButtonEvent.name();
                    oVar.Y(name, this.f59302c.e() + "", this.f59302c.b(), this.f59302c.a(), this.f59302c.d(), this.f59302c.c());
                } else {
                    com.papa.sim.statistic.o oVar2 = p.this.f58888c;
                    String name2 = Event.requestEvent.name();
                    oVar2.Y(name2, this.f59302c.e() + "", this.f59302c.b(), this.f59302c.a(), this.f59302c.d(), this.f59302c.c());
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    public class s3 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f59304b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f59305c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f59306d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f59307e;

        s3(String str, String str2, int i4, String str3) {
            this.f59304b = str;
            this.f59305c = str2;
            this.f59306d = i4;
            this.f59307e = str3;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                p.this.f58888c.L(Event.gameStart, this.f59304b, this.f59305c, this.f59306d, this.f59307e);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    public class t implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f59309b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f59310c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f59311d;

        t(String str, String str2, String str3) {
            this.f59309b = str;
            this.f59310c = str2;
            this.f59311d = str3;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                StatRequest statRequest = new StatRequest();
                statRequest.setEvent(Event.visitAppInternalPage.name());
                statRequest.setTime(System.currentTimeMillis());
                statRequest.setUid(Integer.parseInt(this.f59309b));
                statRequest.getExt().setUid(statRequest.getUid());
                statRequest.getExt().setModule("forum");
                Ext ext = statRequest.getExt();
                ext.setPage("game" + this.f59310c);
                statRequest.getExt().setGameId(this.f59311d);
                Ext ext2 = statRequest.getExt();
                ext2.setPosition("gamebtn" + this.f59311d);
                try {
                    statRequest.getData().setGameId(Long.parseLong(this.f59311d));
                } catch (Exception unused) {
                }
                p.this.f58888c.B(Event.visitAppInternalPage, statRequest);
            } catch (Exception unused2) {
            }
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class t0 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Event f59313b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f59314c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f59315d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f59316e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f59317f;

        t0(Event event, int i4, int i5, String str, int i6) {
            this.f59313b = event;
            this.f59314c = i4;
            this.f59315d = i5;
            this.f59316e = str;
            this.f59317f = i6;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                StatRequest statRequest = new StatRequest();
                statRequest.setEvent(this.f59313b.name());
                statRequest.setTime(System.currentTimeMillis());
                statRequest.setUid(this.f59314c);
                if (this.f59315d != 0) {
                    statRequest.getData().setPageVersion(this.f59315d);
                }
                statRequest.getData().setUid(String.valueOf(this.f59314c));
                try {
                    if (!TextUtils.isEmpty(this.f59316e)) {
                        statRequest.getData().setGameId(Long.parseLong(this.f59316e));
                    }
                } catch (Exception unused) {
                    statRequest.getData().setGameId(0L);
                }
                statRequest.getExt().setUid(statRequest.getUid());
                statRequest.getExt().setGameId(this.f59316e);
                if (this.f59317f >= 0) {
                    statRequest.getExt().setFrom(String.valueOf(this.f59317f));
                }
                p.this.f58888c.B(this.f59313b, statRequest);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    public class t1 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f59319b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f59320c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f59321d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f59322e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f59323f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ String f59324g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ String f59325h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ String f59326i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ String f59327j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ String f59328k;

        t1(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
            this.f59319b = str;
            this.f59320c = str2;
            this.f59321d = str3;
            this.f59322e = str4;
            this.f59323f = str5;
            this.f59324g = str6;
            this.f59325h = str7;
            this.f59326i = str8;
            this.f59327j = str9;
            this.f59328k = str10;
        }

        @Override // java.lang.Runnable
        public void run() {
            StatRequest statRequest = new StatRequest();
            Ext ext = new Ext();
            statRequest.setExt(ext);
            statRequest.setEvent(Event.visitGamePage.name());
            statRequest.setTime(System.currentTimeMillis());
            String str = this.f59319b;
            if (str != null && !str.equals("")) {
                try {
                    statRequest.setUid(Integer.parseInt(this.f59319b));
                    statRequest.getExt().setUid(Integer.parseInt(this.f59319b));
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
            if (String.valueOf(this.f59320c).startsWith("20")) {
                ext.setPage(ExtFrom.home.name());
            }
            ext.setGameId(this.f59321d);
            ext.setFrom(this.f59320c);
            ext.setPosition(this.f59322e);
            ext.setReMarks(this.f59323f);
            ext.setRecPosition(this.f59323f);
            ext.setNodeId(this.f59324g);
            ext.setReMarks1(this.f59325h);
            ext.setKeyWord(this.f59326i);
            ext.setDataFlag(this.f59327j);
            Data data = new Data();
            data.setLocation(this.f59323f);
            data.setWhere(this.f59328k);
            statRequest.setData(data);
            try {
                if (!TextUtils.isEmpty(this.f59321d)) {
                    statRequest.getData().setGameId(Long.parseLong(this.f59321d));
                }
            } catch (Exception e6) {
                e6.printStackTrace();
            }
            p.this.f58888c.B(Event.visitGamePage, statRequest);
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class t2 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f59330b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f59331c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f59332d;

        t2(String str, String str2, String str3) {
            this.f59330b = str;
            this.f59331c = str2;
            this.f59332d = str3;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                p.this.f58888c.P(Event.appPageDownload, this.f59330b, this.f59331c, this.f59332d);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    public class t3 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f59334b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f59335c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f59336d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f59337e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f59338f;

        t3(String str, boolean z4, String str2, String str3, int i4) {
            this.f59334b = str;
            this.f59335c = z4;
            this.f59336d = str2;
            this.f59337e = str3;
            this.f59338f = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                StatDataCenterReq m4 = p.this.m(Event.joystickSetting);
                m4.setUid(this.f59334b);
                m4.setIs_visitors(this.f59335c ? 1 : 0);
                m4.setJoystick_name(this.f59336d);
                m4.setJoystick_mac(this.f59337e);
                m4.setPapa_joy_type(this.f59338f);
                p.this.f58888c.b0(m4);
            } catch (Exception unused) {
            }
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class u implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f59340b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f59341c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f59342d;

        u(String str, String str2, String str3) {
            this.f59340b = str;
            this.f59341c = str2;
            this.f59342d = str3;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                StatRequest statRequest = new StatRequest();
                statRequest.setEvent(Event.arenaGameList.name());
                statRequest.setTime(System.currentTimeMillis());
                statRequest.setUid(Integer.parseInt(this.f59340b));
                statRequest.getExt().setUid(statRequest.getUid());
                statRequest.getExt().setFrom(this.f59341c);
                statRequest.getExt().setGameId(this.f59342d);
                try {
                    statRequest.getData().setGameId(Long.parseLong(this.f59342d));
                } catch (Exception unused) {
                }
                p.this.f58888c.B(Event.arenaGameList, statRequest);
            } catch (Exception unused2) {
            }
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class u0 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Event f59344b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f59345c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f59346d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f59347e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f59348f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f59349g;

        u0(Event event, int i4, int i5, String str, String str2, int i6) {
            this.f59344b = event;
            this.f59345c = i4;
            this.f59346d = i5;
            this.f59347e = str;
            this.f59348f = str2;
            this.f59349g = i6;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                StatRequest statRequest = new StatRequest();
                statRequest.setEvent(this.f59344b.name());
                statRequest.setTime(System.currentTimeMillis());
                statRequest.setUid(this.f59345c);
                if (this.f59346d != 0) {
                    statRequest.getData().setPageVersion(this.f59346d);
                }
                statRequest.getData().setUid(String.valueOf(this.f59345c));
                try {
                    statRequest.getData().setGameId(Long.parseLong(this.f59347e));
                } catch (Exception unused) {
                    statRequest.getData().setGameId(0L);
                }
                statRequest.getExt().setUid(statRequest.getUid());
                statRequest.getExt().setGameId(this.f59348f);
                statRequest.getExt().setFrom(String.valueOf(this.f59349g));
                p.this.f58888c.B(this.f59344b, statRequest);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    public class u1 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f59351b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f59352c;

        u1(String str, String str2) {
            this.f59351b = str;
            this.f59352c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            p.this.f58888c.J(Event.startLocalNetBattleSuccess, this.f59351b, this.f59352c);
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class u2 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f59354b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f59355c;

        u2(String str, int i4) {
            this.f59354b = str;
            this.f59355c = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                p.this.f58888c.y(Event.clickGameMainBtn, Event.standalone, this.f59354b, this.f59355c);
            } catch (Exception unused) {
            }
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class u3 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f59357b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f59358c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f59359d;

        u3(String str, String str2, int i4) {
            this.f59357b = str;
            this.f59358c = str2;
            this.f59359d = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            p.this.f58888c.k0(Event.gameUnzip, this.f59357b, this.f59358c, this.f59359d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    public class v implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f59361b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f59362c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f59363d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Event f59364e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f59365f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ String f59366g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f59367h;

        v(int i4, int i5, String str, Event event, String str2, String str3, int i6) {
            this.f59361b = i4;
            this.f59362c = i5;
            this.f59363d = str;
            this.f59364e = event;
            this.f59365f = str2;
            this.f59366g = str3;
            this.f59367h = i6;
        }

        @Override // java.lang.Runnable
        public void run() {
            String optString;
            StatRequest statRequest = new StatRequest();
            statRequest.getExt().setFrom(String.valueOf(this.f59361b));
            statRequest.getExt().setPosition(String.valueOf(this.f59362c));
            if (!TextUtils.isEmpty(this.f59363d)) {
                try {
                    if (!TextUtils.isEmpty(this.f59363d)) {
                        JSONObject jSONObject = new JSONObject(this.f59363d);
                        String optString2 = jSONObject.optString("from");
                        String optString3 = jSONObject.optString("position");
                        jSONObject.optString("location");
                        statRequest.getExt().setFrom(optString2);
                        statRequest.getExt().setPosition(optString3);
                        if (jSONObject.has("_from_type") && (optString = jSONObject.optString("_from_type")) != null) {
                            statRequest.getExt().setFrom(optString2);
                            statRequest.getExt().setPosition(optString);
                            if (jSONObject.has("recPosition")) {
                                statRequest.getExt().setRecPosition(jSONObject.optString("recPosition"));
                            }
                        }
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
            p.this.f58888c.l0(this.f59364e, this.f59365f, this.f59366g, this.f59367h, statRequest);
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class v0 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Data f59369b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Event f59370c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f59371d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Ext f59372e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Event f59373f;

        v0(Data data, Event event, String str, Ext ext, Event event2) {
            this.f59369b = data;
            this.f59370c = event;
            this.f59371d = str;
            this.f59372e = ext;
            this.f59373f = event2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                StatRequest statRequest = new StatRequest();
                if (this.f59369b != null) {
                    statRequest.getData().setGameId(this.f59369b.getGameId());
                    statRequest.getData().setWhere(this.f59370c.name());
                }
                if (!"".equals(this.f59371d)) {
                    statRequest.setUid(Integer.parseInt(this.f59371d));
                }
                if (this.f59372e != null) {
                    statRequest.getExt().setFromTabId(this.f59372e.getFromTabId());
                    statRequest.getExt().setArticleId(this.f59372e.getArticleId());
                    statRequest.getExt().setFrom(this.f59372e.getFrom());
                    statRequest.getExt().setLiveTime(this.f59372e.getLiveTime());
                }
                statRequest.getExt().setUid(statRequest.getUid());
                statRequest.setTime(System.currentTimeMillis());
                statRequest.setRequest(true);
                statRequest.setEvent(this.f59373f.name());
                p.this.f58888c.j0(statRequest);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class v1 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f59375b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f59376c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f59377d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ long f59378e;

        v1(String str, String str2, String str3, long j4) {
            this.f59375b = str;
            this.f59376c = str2;
            this.f59377d = str3;
            this.f59378e = j4;
        }

        @Override // java.lang.Runnable
        public void run() {
            StatRequest statRequest = new StatRequest();
            statRequest.setEvent(Event.startLocalNetBattleSuccessEmu.name());
            try {
                statRequest.setUid(Integer.parseInt(this.f59375b));
                statRequest.getData().setGameId(Long.parseLong(this.f59376c));
            } catch (Exception unused) {
            }
            statRequest.getExt().setUid2(this.f59377d);
            statRequest.getExt().setUid(statRequest.getUid());
            statRequest.getExt().setPlugVersion(p.f58882h);
            statRequest.getExt().setDuration(this.f59378e);
            statRequest.getData().setUid(this.f59375b);
            p.this.f58888c.B(Event.startLocalNetBattleSuccessEmu, statRequest);
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class v2 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f59380b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f59381c;

        v2(String str, int i4) {
            this.f59380b = str;
            this.f59381c = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                p.this.f58888c.y(Event.clickFunGameMainBtn, Event.standalone, this.f59380b, this.f59381c);
            } catch (Exception unused) {
            }
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class v3 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f59383b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f59384c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f59385d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f59386e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f59387f;

        v3(String str, boolean z4, String str2, String str3, int i4) {
            this.f59383b = str;
            this.f59384c = z4;
            this.f59385d = str2;
            this.f59386e = str3;
            this.f59387f = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                StatDataCenterReq m4 = p.this.m(Event.joystickJoin);
                m4.setUid(this.f59383b);
                m4.setIs_visitors(this.f59384c ? 1 : 0);
                m4.setJoystick_name(this.f59385d);
                m4.setJoystick_mac(this.f59386e);
                m4.setPapa_joy_type(this.f59387f);
                p.this.f58888c.b0(m4);
            } catch (Exception unused) {
            }
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class w implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f59389b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f59390c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f59391d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f59392e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f59393f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ String f59394g;

        w(String str, String str2, String str3, String str4, String str5, String str6) {
            this.f59389b = str;
            this.f59390c = str2;
            this.f59391d = str3;
            this.f59392e = str4;
            this.f59393f = str5;
            this.f59394g = str6;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                p.this.f58888c.Y(this.f59389b, this.f59390c, this.f59391d, this.f59392e, this.f59393f, this.f59394g);
            } catch (Exception unused) {
            }
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class w0 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Event f59396b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f59397c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f59398d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f59399e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f59400f;

        w0(Event event, int i4, int i5, String str, String str2) {
            this.f59396b = event;
            this.f59397c = i4;
            this.f59398d = i5;
            this.f59399e = str;
            this.f59400f = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                StatRequest statRequest = new StatRequest();
                statRequest.setEvent(this.f59396b.name());
                statRequest.setTime(System.currentTimeMillis());
                statRequest.setUid(this.f59397c);
                statRequest.getData().setPageVersion(this.f59398d);
                statRequest.getData().setUid(String.valueOf(this.f59397c));
                statRequest.getData().setGameId(Long.parseLong(this.f59399e));
                statRequest.getExt().setUid(statRequest.getUid());
                statRequest.getExt().setGameId(this.f59399e);
                statRequest.getExt().setQkPosition(this.f59400f);
                p.this.f58888c.B(this.f59396b, statRequest);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class w1 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f59402b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f59403c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f59404d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ long f59405e;

        w1(String str, String str2, String str3, long j4) {
            this.f59402b = str;
            this.f59403c = str2;
            this.f59404d = str3;
            this.f59405e = j4;
        }

        @Override // java.lang.Runnable
        public void run() {
            StatRequest statRequest = new StatRequest();
            statRequest.setEvent(Event.endLocalNetBattleSuccessEmu.name());
            try {
                statRequest.setUid(Integer.parseInt(this.f59402b));
                statRequest.getData().setGameId(Long.parseLong(this.f59403c));
            } catch (Exception unused) {
            }
            statRequest.getExt().setUid2(this.f59404d);
            statRequest.getExt().setUid(statRequest.getUid());
            statRequest.getExt().setPlugVersion(p.f58882h);
            statRequest.getExt().setDuration(this.f59405e);
            statRequest.getData().setUid(this.f59402b);
            p.this.f58888c.B(Event.endLocalNetBattleSuccessEmu, statRequest);
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class w2 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f59407b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f59408c;

        w2(String str, int i4) {
            this.f59407b = str;
            this.f59408c = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                p.this.f58888c.y(Event.clickGameMainBtn, Event.localBattle, this.f59407b, this.f59408c);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    public class w3 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f59410b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f59411c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f59412d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f59413e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f59414f;

        w3(String str, boolean z4, String str2, String str3, int i4) {
            this.f59410b = str;
            this.f59411c = z4;
            this.f59412d = str2;
            this.f59413e = str3;
            this.f59414f = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                StatDataCenterReq m4 = p.this.m(Event.joystickConfigChanged);
                m4.setUid(this.f59410b);
                m4.setIs_visitors(this.f59411c ? 1 : 0);
                m4.setJoystick_name(this.f59412d);
                m4.setJoystick_mac(this.f59413e);
                m4.setPapa_joy_type(this.f59414f);
                p.this.f58888c.b0(m4);
            } catch (Exception unused) {
            }
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class x implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f59416b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f59417c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f59418d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f59419e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f59420f;

        x(String str, String str2, String str3, String str4, String str5) {
            this.f59416b = str;
            this.f59417c = str2;
            this.f59418d = str3;
            this.f59419e = str4;
            this.f59420f = str5;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                p.this.f58888c.Y(Event.requestEvent.name(), this.f59416b, this.f59417c, this.f59418d, this.f59419e, this.f59420f);
            } catch (Exception unused) {
            }
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class x0 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Event f59422b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Ext f59423c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Data f59424d;

        x0(Event event, Ext ext, Data data) {
            this.f59422b = event;
            this.f59423c = ext;
            this.f59424d = data;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                p.this.f58888c.T(this.f59422b.name(), this.f59423c, this.f59424d);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class x1 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f59426b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f59427c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f59428d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f59429e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f59430f;

        x1(String str, String str2, int i4, String str3, String str4) {
            this.f59426b = str;
            this.f59427c = str2;
            this.f59428d = i4;
            this.f59429e = str3;
            this.f59430f = str4;
        }

        @Override // java.lang.Runnable
        public void run() {
            p.this.f58888c.n0(Event.installAndroidCompleted, this.f59426b, this.f59427c, this.f59428d, this.f59429e, this.f59430f);
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class x2 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f59432b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f59433c;

        x2(String str, int i4) {
            this.f59432b = str;
            this.f59433c = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                p.this.f58888c.y(Event.clickFunGameMainBtn, Event.localBattle, this.f59432b, this.f59433c);
            } catch (Exception unused) {
            }
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class x3 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f59435b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f59436c;

        x3(String str, boolean z4) {
            this.f59435b = str;
            this.f59436c = z4;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                StatDataCenterReq m4 = p.this.m(Event.click_vs_hall);
                m4.setUid(this.f59435b);
                m4.setIs_visitors(this.f59436c ? 1 : 0);
                p.this.f58888c.b0(m4);
            } catch (Exception unused) {
            }
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class y implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f59438b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f59439c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f59440d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f59441e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f59442f;

        y(String str, String str2, String str3, String str4, String str5) {
            this.f59438b = str;
            this.f59439c = str2;
            this.f59440d = str3;
            this.f59441e = str4;
            this.f59442f = str5;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                p.this.f58888c.Y(Event.clickButtonEvent.name(), this.f59438b, this.f59439c, this.f59440d, this.f59441e, this.f59442f);
            } catch (Exception unused) {
            }
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class y0 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Data f59444b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Ext f59445c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Event f59446d;

        y0(Data data, Ext ext, Event event) {
            this.f59444b = data;
            this.f59445c = ext;
            this.f59446d = event;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                StatRequest statRequest = new StatRequest();
                if (this.f59444b != null) {
                    statRequest.getData().setGameId(this.f59444b.getGameId());
                }
                if (this.f59445c != null) {
                    statRequest.getExt().setFromTabId(this.f59445c.getFromTabId());
                    statRequest.getExt().setArticleId(this.f59445c.getArticleId());
                    statRequest.getExt().setFrom(this.f59445c.getFrom());
                    statRequest.getExt().setLiveTime(this.f59445c.getLiveTime());
                    statRequest.getExt().setEndId(this.f59445c.getEndId());
                    statRequest.getExt().setPosition(this.f59445c.getPosition());
                }
                statRequest.getExt().setUid(statRequest.getUid());
                statRequest.setTime(System.currentTimeMillis());
                statRequest.setRequest(true);
                statRequest.setEvent(this.f59446d.name());
                p.this.f58888c.j0(statRequest);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class y1 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f59448b;

        y1(String str) {
            this.f59448b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            p.this.f58888c.J(Event.setpapaerror, this.f59448b, null);
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class y2 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f59450b;

        y2(String str) {
            this.f59450b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            p.this.f58888c.J(Event.visitBattlePage, "", this.f59450b);
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class y3 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f59452b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f59453c;

        y3(String str, boolean z4) {
            this.f59452b = str;
            this.f59453c = z4;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                StatDataCenterReq m4 = p.this.m(Event.click_vs_create_room);
                m4.setUid(this.f59452b);
                m4.setIs_visitors(this.f59453c ? 1 : 0);
                p.this.f58888c.b0(m4);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    public class z implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f59455b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f59456c;

        z(String str, String str2) {
            this.f59455b = str;
            this.f59456c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                p.this.f58888c.W(this.f59455b, this.f59456c);
            } catch (Exception unused) {
            }
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class z0 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Data f59458b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Ext f59459c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Event f59460d;

        z0(Data data, Ext ext, Event event) {
            this.f59458b = data;
            this.f59459c = ext;
            this.f59460d = event;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                StatRequest statRequest = new StatRequest();
                Data data = this.f59458b;
                if (data != null) {
                    statRequest.setData(data);
                }
                Ext ext = this.f59459c;
                if (ext != null) {
                    statRequest.setExt(ext);
                }
                statRequest.getExt().setUid(statRequest.getUid());
                statRequest.setTime(System.currentTimeMillis());
                statRequest.setRequest(true);
                statRequest.setEvent(this.f59460d.name());
                p.this.f58888c.j0(statRequest);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    public class z1 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f59462b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f59463c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f59464d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ long f59465e;

        z1(String str, String str2, String str3, long j4) {
            this.f59462b = str;
            this.f59463c = str2;
            this.f59464d = str3;
            this.f59465e = j4;
        }

        @Override // java.lang.Runnable
        public void run() {
            StatRequest statRequest = new StatRequest();
            statRequest.setEvent(Event.gameOut.name());
            try {
                statRequest.setUid(Integer.parseInt(this.f59462b));
                statRequest.getData().setGameId(Long.parseLong(this.f59463c));
            } catch (Exception unused) {
            }
            statRequest.getExt().setUid(statRequest.getUid());
            statRequest.getExt().setPlugVersion(this.f59464d);
            statRequest.getExt().setDuration(this.f59465e);
            statRequest.getData().setUid(this.f59462b);
            p.this.f58888c.B(Event.gameOut, statRequest);
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class z2 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f59467b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f59468c;

        z2(String str, int i4) {
            this.f59467b = str;
            this.f59468c = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                p.this.f58888c.y(Event.clickGameMainBtn, Event.matchBattle, this.f59467b, this.f59468c);
            } catch (Exception unused) {
            }
        }
    }

    /* compiled from: StatFactory.java */
    /* loaded from: classes5.dex */
    class z3 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f59470b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f59471c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f59472d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f59473e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f59474f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ byte f59475g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ byte f59476h;

        z3(int i4, String str, String str2, String str3, boolean z4, byte b5, byte b6) {
            this.f59470b = i4;
            this.f59471c = str;
            this.f59472d = str2;
            this.f59473e = str3;
            this.f59474f = z4;
            this.f59475g = b5;
            this.f59476h = b6;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                StatDataCenterReq m4 = p.this.m(Event.user_filters_refresh);
                m4.setPlug_id(this.f59470b);
                m4.setGame_type(this.f59471c);
                m4.setZone(this.f59472d);
                m4.setUid(this.f59473e);
                m4.setIs_visitors(this.f59474f ? 1 : 0);
                m4.setPapa_allow_spectators(this.f59475g);
                m4.setPapa_has_slot(this.f59476h);
                p.this.f58888c.b0(m4);
            } catch (Exception unused) {
            }
        }
    }

    private p(Context context) {
        this.f58887b = context;
        this.f58889d = com.papa.sim.statistic.db.b.o(context);
        this.f58888c = com.papa.sim.statistic.o.m(context);
    }

    private void I2(com.papa.sim.statistic.pref.a aVar, String str) {
        f58881g.execute(new r3(aVar, str));
    }

    public static p l(Context context) {
        if (f58884j == null) {
            f58884j = new p(context);
            DisplayMetrics displayMetrics = new DisplayMetrics();
            try {
                ((Activity) context).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                f58885k = displayMetrics.heightPixels + WebSocketServerHandshaker.SUB_PROTOCOL_WILDCARD + displayMetrics.widthPixels;
            } catch (Exception unused) {
            }
        }
        return f58884j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public StatDataCenterReq m(Event event) {
        StatDataCenterReq statDataCenterReq = new StatDataCenterReq();
        statDataCenterReq.setEvent(event.name());
        statDataCenterReq.setGame_time(System.currentTimeMillis() / 1000);
        statDataCenterReq.setDid(com.papa.sim.statistic.s.f(this.f58887b).b());
        statDataCenterReq.setAdv_id(com.papa.sim.statistic.k.a(this.f58887b));
        String str = Build.VERSION.RELEASE;
        statDataCenterReq.setOs(str);
        statDataCenterReq.setPhone(str);
        statDataCenterReq.setModel(Build.MODEL);
        statDataCenterReq.setMfr(Build.MANUFACTURER);
        statDataCenterReq.setRes(f58885k);
        statDataCenterReq.setIs_test(this.f58891f);
        statDataCenterReq.setApp_version(com.papa.sim.statistic.s.f(this.f58887b).q());
        return statDataCenterReq;
    }

    public void A(String str, String str2, String str3) {
        f58881g.execute(new c0(str, str2, str3));
    }

    public void A0(String str, int i5) {
        f58881g.execute(new i3(str, i5));
    }

    public void A1(String str, String str2, String str3) {
        f58881g.execute(new l2((StatJsonRawData) JsonMapper.e().fromJson(str2.toLowerCase(), StatJsonRawData.class), str, str3));
    }

    public void A2(int i5, String str, int i6) {
        f58881g.execute(new m4(i6, str, i5));
    }

    public void B(String str, String str2) {
        f58881g.execute(new j3(str, str2));
    }

    public void B0(String str, int i5) {
        f58881g.execute(new l3(str, i5));
    }

    public void B1(String str, long j5, String str2) {
        this.f58888c.H(Event.netBattleMatchFinish, str, j5, str2);
    }

    public void B2(String str) {
        f58881g.execute(new d(str));
    }

    public void C(String str, String str2) {
        Ext ext = new Ext();
        ext.setArticleId(str);
        this.f58888c.A(Event.articleClickPraise, ext, str2);
    }

    public void C0(String str, String str2, long j5, int i5, String str3, long j6, int i6, int i7, String str4, int i8, String str5) {
        D0(str, str2, j5, i5, str3, j6, i6, i7, str4, i8, null, str5);
    }

    public void C1(String str, long j5, String str2, String str3) {
        f58881g.execute(new e2(str2, str, j5, str3));
    }

    public void C2(String str) {
        f58881g.execute(new f(str));
    }

    public void D(String str, String str2) {
        f58881g.execute(new f1(str, str2));
    }

    public void D0(String str, String str2, long j5, int i5, String str3, long j6, int i6, int i7, String str4, int i8, String str5, String str6) {
        f58881g.execute(new h2(str5, str6, str4, str, str3, j5, i5, j6, str2, i8, i6, i7));
    }

    public void D1(String str, String str2) {
        this.f58888c.J(Event.netBattleMatchStart, str, str2);
    }

    public void D2(String str, int i5) {
        f58881g.execute(new k3(str, i5));
    }

    public void E(String str, String str2, String str3) {
        f58881g.execute(new e1(str3, str2, str));
    }

    public void E0(String str, String str2, long j5, int i5, String str3, String str4, long j6, int i6, int i7, String str5, int i8, String str6) {
        F0(str, str2, j5, i5, str3, str4, j6, i6, i7, str5, i8, null, str6);
    }

    public void E1(String str, String str2, String str3) {
        f58881g.execute(new d2(str2, str, str3));
    }

    public void E2(boolean z4, String str) {
        this.f58888c.q0(z4);
        if (!z4 || str == null || str.equals("")) {
            return;
        }
        this.f58889d.a();
        List<EMUApkTable> list = (List) JsonMapper.e().fromJson(str, JsonMapper.e().createCollectionType(ArrayList.class, EMUApkTable.class));
        if (list == null) {
            return;
        }
        this.f58889d.u(list);
    }

    public void F(String str, String str2) {
        f58881g.execute(new a1(str2, str));
    }

    public void F0(String str, String str2, long j5, int i5, String str3, String str4, long j6, int i6, int i7, String str5, int i8, String str6, String str7) {
        f58881g.execute(new i2(str6, str7, str5, str, str3, str2, j5, i5, j6, str4, i8, i6, i7));
    }

    public void F1(String str, String str2) {
        this.f58888c.J(Event.netMatchBtnClick, str, str2);
    }

    public void F2(boolean z4) {
        this.f58888c.r0(z4);
    }

    public void G(String str, String str2) {
        this.f58888c.J(Event.clickLocalNetBattleJoinRoomBtn, str, str2);
    }

    public void G0(String str, String str2, long j5, int i5, String str3, int i6, int i7, int i8, String str4) {
        f58881g.execute(new f2(str, str2, j5, i5, str3, i6, i7, i8, str4));
    }

    public void G1(Ext ext) {
        f58881g.execute(new q0(ext));
    }

    public void G2(boolean z4) {
        this.f58888c.s0(z4);
    }

    public void H(String str, String str2, int i5, String str3) {
        f58881g.execute(new l1(str, str2, i5, str3));
    }

    public void H0(String str, String str2, long j5, int i5, String str3, String str4, int i6, int i7, int i8, String str5) {
        f58881g.execute(new g2(str, str2, j5, i5, str3, str4, i6, i7, i8, str5));
    }

    public void H1(String str) {
        this.f58888c.J(Event.newbieGuideLoad, "", str);
    }

    public void H2(com.papa.sim.statistic.h hVar) {
        this.f58890e = hVar;
    }

    public void I(String str, String str2) {
        f58881g.execute(new m1(str, str2));
    }

    public void I0(String str, int i5) {
        f58881g.execute(new v2(str, i5));
    }

    public void I1(String str) {
        this.f58888c.J(Event.newbieGuidePlay, "", str);
    }

    public void J(String str, String str2) {
        f58881g.execute(new g0(str, str2));
    }

    public void J0(String str, String str2) {
        f58881g.execute(new j2(str, str2));
    }

    public void J1(String str) {
        this.f58888c.J(Event.newbieGuidePlayGame, "", str);
    }

    public void J2(String str, String str2, String str3, long j5) {
        f58881g.execute(new v1(str2, str, str3, j5));
    }

    public void K(String str, String str2, String str3) {
        f58881g.execute(new c1(str2, str, str3));
    }

    public void K0(String str, int i5, int i6) {
        f58881g.execute(new m3(i6, str, i5));
    }

    public void K1(String str) {
        f58881g.execute(new k0(str));
    }

    public void K2(int i5, String str) {
        com.papa.sim.statistic.pref.a m5;
        StringBuilder sb = new StringBuilder();
        sb.append("method updateLiveStat() called.step=");
        sb.append(i5);
        if (i5 == 0) {
            com.papa.sim.statistic.pref.a m6 = com.papa.sim.statistic.pref.b.k(this.f58887b).m();
            if (m6 != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("liveStat=");
                sb2.append(m6.toString());
                if (m6.a() == 0) {
                    return;
                }
                I2(m6, str);
            } else {
                m6 = new com.papa.sim.statistic.pref.a();
            }
            m6.f((byte) 0);
            m6.g(System.currentTimeMillis());
            m6.e(0L);
            com.papa.sim.statistic.pref.b.k(this.f58887b).G(m6);
        } else if (i5 == 1) {
            com.papa.sim.statistic.pref.a m7 = com.papa.sim.statistic.pref.b.k(this.f58887b).m();
            if (m7 != null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("step=");
                sb3.append(i5);
                sb3.append(";liveStat=");
                sb3.append(m7.toString());
                m7.e(System.currentTimeMillis());
                com.papa.sim.statistic.pref.b.k(this.f58887b).G(m7);
                I2(m7, str);
            }
        } else if (i5 != 2 || (m5 = com.papa.sim.statistic.pref.b.k(this.f58887b).m()) == null) {
        } else {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("step=");
            sb4.append(i5);
            sb4.append(";liveStat=");
            sb4.append(m5.toString());
            if (System.currentTimeMillis() - m5.a() <= q.a.f73127b || m5.a() <= 0) {
                return;
            }
            I2(m5, str);
            com.papa.sim.statistic.pref.a aVar = new com.papa.sim.statistic.pref.a();
            aVar.g(System.currentTimeMillis());
            aVar.f((byte) 0);
            com.papa.sim.statistic.pref.b.k(this.f58887b).G(aVar);
        }
    }

    public void L(String str) {
        f58881g.execute(new o4(str));
    }

    public void L0(String str, int i5) {
        f58881g.execute(new a3(str, i5));
    }

    public void L1(String str) {
        f58881g.execute(new y1(str));
    }

    public void L2(String str, String str2, String str3, String str4, String str5) {
        f58881g.execute(new q3(str, str2, str3, str4, str5));
    }

    public void M(String str) {
        f58881g.execute(new h4(str));
    }

    public void M0(String str, int i5) {
        f58881g.execute(new f3(str, i5));
    }

    public void M1(String str, String str2, String str3) {
        f58881g.execute(new m2(str, str2, str3));
    }

    public void N(String str) {
        f58881g.execute(new p4(str));
    }

    public void N0(String str, int i5) {
        f58881g.execute(new b3(str, i5));
    }

    public void N1(String str, String str2, String str3, String str4) {
        f58881g.execute(new o2(str, str2, str3, str4));
    }

    public void O(String str, boolean z4) {
        f58881g.execute(new y3(str, z4));
    }

    public void O0(String str, int i5) {
        f58881g.execute(new w2(str, i5));
    }

    public void O1(Event event, Ext ext) {
        f58881g.execute(new l0(event, ext));
    }

    public void P(String str, String str2) {
        f58881g.execute(new n4(str, str2));
    }

    public void P0(String str, int i5) {
        f58881g.execute(new c3(str, i5));
    }

    public void P1(Event event, int i5, String str, int i6, int i7) {
        f58881g.execute(new t0(event, i5, i7, str, i6));
    }

    public void Q(String str, boolean z4) {
        f58881g.execute(new x3(str, z4));
    }

    public void Q0(String str, int i5) {
        f58881g.execute(new d3(str, i5));
    }

    public void Q1(Event event, int i5) {
        f58881g.execute(new m0(event, i5));
    }

    public void R(String str) {
        f58881g.execute(new i4(str));
    }

    public void R0(String str, int i5) {
        f58881g.execute(new z2(str, i5));
    }

    public void R1(String str, int i5, int i6) {
        f58881g.execute(new n3(i5, str, i6));
    }

    public void S(String str) {
        f58881g.execute(new j(str));
    }

    public void S0(String str, int i5, int i6) {
        f58881g.execute(new p3(i6, str, i5));
    }

    public void S1(Event event, String str, int i5, String str2, int i6) {
        f58881g.execute(new w0(event, i5, i6, str, str2));
    }

    public void T(String str, String str2) {
        f58881g.execute(new g(str, str2));
    }

    public void T0(String str, int i5) {
        f58881g.execute(new h3(str, i5));
    }

    public void T1(Event event, Ext ext, Data data) {
        f58881g.execute(new x0(event, ext, data));
    }

    public void U(String str, String str2) {
        f58881g.execute(new h(str, str2));
    }

    public void U0(String str, int i5) {
        f58881g.execute(new u2(str, i5));
    }

    public void U1(String str, int i5, int i6, String str2, String str3) {
        f58881g.execute(new b4(str, str2, str3, i6, i5));
    }

    public void V(String str) {
        f58881g.execute(new a(str));
    }

    public void V0(String str, long j5, String str2) {
        this.f58888c.H(Event.gameOut, str, j5, str2);
    }

    public void V1(String str, int i5, int i6, int i7) {
        f58881g.execute(new c4(str, i6, i5, i7));
    }

    public void W(String str) {
        f58881g.execute(new i(str));
    }

    public void W0(String str, long j5, String str2, String str3) {
        f58881g.execute(new z1(str2, str, str3, j5));
    }

    public void W1(Event event, String str, String str2, String str3) {
        f58881g.execute(new j0(event, str3, str2, str));
    }

    public void X(Event event, Ext ext, String str) {
        f58881g.execute(new s0(event, ext, str));
    }

    public void X0(Event event, String str, String str2, String str3) {
        f58881g.execute(new h0(event, str2, str, str3));
    }

    public void X1(String str) {
        f58881g.execute(new k(str));
    }

    public void Y(Event event, Ext ext, Data data) {
        f58881g.execute(new z0(data, ext, event));
    }

    public void Y0(Event event, String str, String str2) {
        f58881g.execute(new f0(event, str2, str));
    }

    public void Y1(String str) {
        this.f58888c.J(Event.startApp2, "", str);
    }

    public void Z(String str, String str2) {
        f58881g.execute(new r0(str, str2));
    }

    public void Z0(Event event, String str, String str2, String str3, int i5) {
        a1(event, str, str2, str3, i5, "");
    }

    public void Z1(String str, String str2) {
        this.f58888c.J(Event.startDownloadPlug, str, str2);
    }

    public void a0(String str, boolean z4, String str2, String str3, int i5) {
        f58881g.execute(new w3(str, z4, str2, str3, i5));
    }

    public void a1(Event event, String str, String str2, String str3, int i5, String str4) {
        f58881g.execute(new i0(event, str2, str, str3, i5, str4));
    }

    public void a2(String str, String str2, String str3) {
        f58881g.execute(new o1(str3, str, str2));
    }

    public void b0(String str, boolean z4, String str2, String str3, int i5) {
        f58881g.execute(new v3(str, z4, str2, str3, i5));
    }

    public void b1(String str, int i5, int i6) {
        f58881g.execute(new i1(str, i5, i6));
    }

    public void b2(String str, String str2) {
        f58881g.execute(new u1(str, str2));
    }

    public void c0(String str, boolean z4, String str2, String str3, int i5) {
        f58881g.execute(new t3(str, z4, str2, str3, i5));
    }

    public void c1(String str, String str2) {
        f58881g.execute(new r1(str, str2));
    }

    public void c2(String str, int i5) {
        f58881g.execute(new a4(str, i5));
    }

    public void d(String str, int i5) {
        File[] listFiles;
        File file = new File(Environment.getExternalStorageDirectory().getAbsolutePath() + (i5 == 0 ? "/mgpapa/aidlservice" : "/wufan91/aidlservice"));
        if (file.exists() && file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                String name = file2.getName();
                if (name.toLowerCase().startsWith("game_start15")) {
                    try {
                        j(name.split("_")[2], name.split("_")[3], str);
                        file2.delete();
                    } catch (Exception unused) {
                    }
                } else if (name.toLowerCase().startsWith("game_startbattle15")) {
                    b2(name.split("_")[2], name.split("_")[3]);
                    file2.delete();
                } else if (name.toLowerCase().startsWith("game_start160")) {
                    i(name.split("_")[2], name.split("_")[3], Integer.parseInt(name.split("_")[4]), str);
                    file2.delete();
                } else if (name.toLowerCase().startsWith("play_time_")) {
                    N1(name.split("_")[2], name.split("_")[4] + "", name.split("_")[3], UUID.randomUUID().toString());
                    file2.delete();
                } else if (name.toLowerCase().startsWith("game_out_")) {
                    W0(name.split("_")[2], Long.parseLong(name.split("_")[3]), name.split("_")[4], str);
                    file2.delete();
                }
            }
        }
    }

    public void d0(String str, String str2, String str3) {
        f58881g.execute(new d1(str3, str2, str));
    }

    public void d1(String str, String str2) {
        this.f58888c.J(Event.gameRemove1, str, str2);
    }

    public void d2(String str) {
        f58881g.execute(new b2(str));
    }

    public void e() {
        this.f58889d.b();
    }

    public void e0(String str, String str2) {
        this.f58888c.J(Event.downloadPlugCompleted, str, str2);
    }

    public void e1(String str, String str2) {
        this.f58888c.J(Event.gameRemove2, str, str2);
    }

    public void e2(String str, String str2, int i5) {
        f58881g.execute(new n2(str, str2, i5));
    }

    public void f(String str) {
        this.f58888c.J(Event.joystickConfigChanged, "", str);
    }

    public void f0(String str, String str2, String str3) {
        f58881g.execute(new p1(str3, str, str2));
    }

    public void f1(String str, int i5, String str2, String str3, String str4, int i6, String str5, String str6) {
        f58881g.execute(new a2(str3, str2, i5, str4, i6, str6, str5, str));
    }

    public void f2(String str, String str2) {
        this.f58888c.J(Event.unzipIOFailed, str, str2);
    }

    public void g(String str, int i5, String str2) {
        JoyStickConfig joyStickConfig = new JoyStickConfig();
        joyStickConfig.setUid(Integer.parseInt(str));
        joyStickConfig.setType(i5);
        joyStickConfig.setFile(str2);
        com.papa.sim.statistic.o.m(this.f58887b).E(Event.joyStickConfigPost, JsonMapper.f().toJson(joyStickConfig));
    }

    public void g0(String str, String str2) {
        f58881g.execute(new c2(str, str2));
    }

    public void g1(Event event, String str, String str2, int i5, int i6, int i7, String str3) {
        f58881g.execute(new v(i6, i7, str3, event, str, str2, i5));
    }

    public void g2(String str, String str2) {
        this.f58888c.J(Event.unzipIndexFailed, str, str2);
    }

    public void h(String str, String str2, String str3, long j5) {
        f58881g.execute(new w1(str2, str, str3, j5));
    }

    public void h0(String str) {
        this.f58888c.J(Event.setemuerror, str, null);
    }

    public void h1(String str, String str2, int i5, int i6, int i7, String str3) {
        g1(Event.gameStart, str, str2, i5, i6, i7, str3);
    }

    public void h2(String str, boolean z4, String str2, int i5, String str3, byte b5, byte b6) {
        f58881g.execute(new z3(i5, str3, str2, str, z4, b5, b6));
    }

    public void i(String str, String str2, int i5, String str3) {
        f58881g.execute(new s3(str, str2, i5, str3));
    }

    public void i0(Event event, Ext ext, Data data) {
        f58881g.execute(new y0(data, ext, event));
    }

    public void i1(String str) {
        this.f58888c.E(Event.gameUnlockSp, str);
    }

    public void i2(String str, String str2, String str3, String str4, String str5) {
        f58881g.execute(new y(str, str2, str3, str4, str5));
    }

    public void j(String str, String str2, String str3) {
        f58881g.execute(new g1(str, str2, str3));
    }

    public void j0(String str, String str2, String str3) {
        f58881g.execute(new b1(str3, str2, str));
    }

    public void j1(String str, String str2, int i5) {
        f58881g.execute(new u3(str, str2, i5));
    }

    public void j2(String str) {
        p2(Event.clickHomePageEvent.name(), str);
    }

    public void k(String str, String str2) {
        this.f58888c.J(Event.startLocalNetBattleSuccess, str, str2);
    }

    public void k0(Event event, Ext ext, String str) {
        f58881g.execute(new n0(event, ext, str));
    }

    public void k1(String str, String str2, String str3) {
        f58881g.execute(new e0(str2, str, str3));
    }

    public void k2(String str, String str2, String str3, String str4, String str5) {
        f58881g.execute(new x(str, str2, str3, str4, str5));
    }

    public void l0(String str) {
        f58881g.execute(new m(str));
    }

    public void l1(Event event, String str, String str2) {
        f58881g.execute(new o0(event, str, str2));
    }

    public void l2(String str, String str2, int i5, int i6, int i7, String str3) {
        g1(Event.VMGameStart, str, str2, i5, i6, i7, str3);
    }

    public void m0(String str) {
        f58881g.execute(new e4(str));
    }

    public void m1(Event event, Ext ext) {
        f58881g.execute(new p0(event, ext));
    }

    public void m2(String str, String str2, int i5, int i6, int i7, String str3) {
        g1(Event.VMGameStartAfterStatus, str, str2, i5, i6, i7, str3);
    }

    public com.papa.sim.statistic.h n() {
        return this.f58890e;
    }

    public void n0(String str, String str2) {
        f58881g.execute(new RunnableC0594p(str2, str));
    }

    public void n1(String str, String str2, int i5, String str3, String str4) {
        f58881g.execute(new x1(str, str2, i5, str3, str4));
    }

    public void n2(String str, String str2) {
        f58881g.execute(new a0(str, str2));
    }

    public void o() {
    }

    public void o0(String str) {
        f58881g.execute(new d4(str));
    }

    public void o1(String str, String str2, String str3) {
        f58881g.execute(new q1(str3, str, str2));
    }

    public void o2(String str, String str2, String str3, String str4, String str5, String str6) {
        f58881g.execute(new w(str, str2, str3, str4, str5, str6));
    }

    public void p(String str, String str2, String str3) {
        f58881g.execute(new q4(str, str2, str3));
    }

    public void p0(String str) {
        f58881g.execute(new l(str));
    }

    public void p1(String str, String str2) {
        this.f58888c.J(Event.insufficientStorage, str, str2);
    }

    public void p2(String str, String str2) {
        f58881g.execute(new z(str, str2));
    }

    public void q(Event event, String str, String str2, String str3) {
        f58881g.execute(new l4(event, str, str3, str2));
    }

    public void q0(String str, String str2) {
        f58881g.execute(new n(str2, str));
    }

    public void q1(Event event, Event event2, String str, Ext ext, Data data) {
        f58881g.execute(new v0(data, event2, str, ext, event));
    }

    public void q2(String str) {
        f58881g.execute(new y2(str));
    }

    public void r(String str, String str2, String str3, String str4, String str5, String str6) {
        f58881g.execute(new p2(str, str2, str4, str3, str5, str6));
    }

    public void r0(String str, String str2) {
        f58881g.execute(new o(str2, str));
    }

    public void r1(String str, String str2) {
        f58881g.execute(new j1(str, str2));
    }

    public void r2(String str, String str2, int i5) {
        f58881g.execute(new s1(str, str2, i5));
    }

    public void s(com.papa.sim.statistic.e eVar) {
        f58881g.execute(new r2(eVar));
    }

    public void s0(String str, String str2, String str3) {
        f58881g.execute(new t(str3, str, str2));
    }

    public void s1(String str, String str2, int i5, String str3) {
        f58881g.execute(new h1(str, str2, i5, str3));
    }

    public void s2(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        t2(str, str2, str3, str4, str5, str6, "", "", str7, str8);
    }

    public void t(String str, String str2, String str3) {
        f58881g.execute(new q2(str, str2, str3));
    }

    public void t0(String str, String str2, String str3) {
        f58881g.execute(new s(str3, str, str2));
    }

    public void t1(String str, String str2) {
        this.f58888c.J(Event.joinLocalNetBattleRoomSuccess, str, str2);
    }

    public void t2(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        f58881g.execute(new t1(str2, str3, str, str4, str5, str6, str7, str9, str8, str10));
    }

    public void u(String str, String str2, String str3) {
        f58881g.execute(new t2(str, str2, str3));
    }

    public void u0(String str, String str2) {
        f58881g.execute(new q(str2, str));
    }

    public void u1(String str, String str2, int i5, String str3) {
        f58881g.execute(new k1(str, str2, i5, str3));
    }

    public void u2(Where where, String str) {
        f58881g.execute(new f4(where, str));
    }

    public void v(String str, String str2) {
        f58881g.execute(new k2(str, str2));
    }

    public void v0(String str, String str2) {
        f58881g.execute(new r(str2, str));
    }

    public void v1(String str, String str2) {
        f58881g.execute(new n1(str, str2));
    }

    public void v2(String str) {
        f58881g.execute(new k4(str));
    }

    public void w(com.papa.sim.statistic.e eVar, boolean z4) {
        f58881g.execute(new s2(z4, eVar));
    }

    public void w0(String str, int i5, int i6) {
        f58881g.execute(new o3(i6, str, i5));
    }

    public void w1(Ext ext, String str) {
        this.f58888c.A(Event.joystickJoinApp, ext, str);
    }

    public void w2(String str) {
        f58881g.execute(new j4(str));
    }

    public void x(String str, int i5, String str2) {
        f58881g.execute(new d0(str, i5, str2));
    }

    public void x0(String str, int i5) {
        f58881g.execute(new g3(str, i5));
    }

    public void x1(String str) {
        f58881g.execute(new g4(str));
    }

    public void x2(String str) {
        f58881g.execute(new e(str));
    }

    public void y(String str, String str2, String str3) {
        f58881g.execute(new u(str, str3, str2));
    }

    public void y0(String str, int i5) {
        f58881g.execute(new x2(str, i5));
    }

    public void y1(Ext ext, String str) {
        this.f58888c.A(Event.memberClickRegister, ext, str);
    }

    public void y2(String str) {
        f58881g.execute(new b(str));
    }

    public void z(String str, String str2) {
        f58881g.execute(new b0(str, str2));
    }

    public void z0(String str, int i5) {
        f58881g.execute(new e3(str, i5));
    }

    public void z1(Event event, int i5, String str, String str2, int i6, int i7) {
        f58881g.execute(new u0(event, i5, i7, str2, str, i6));
    }

    public void z2(String str) {
        f58881g.execute(new c(str));
    }
}
