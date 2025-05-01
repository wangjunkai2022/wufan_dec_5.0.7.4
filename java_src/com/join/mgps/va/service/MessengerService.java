package com.join.mgps.va.service;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import androidx.annotation.Nullable;
import com.MApplication;
import com.join.android.app.common.utils.JsonMapper;
import com.join.android.app.common.utils.e;
import com.join.mgps.Util.AESUtils;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.Util.w0;
import com.join.mgps.dto.AccountBean;
import com.join.mgps.dto.DomainInfoBean;
import com.join.mgps.dto.SpValue;
import com.join.mgps.service.CommonService_;
import com.papa.sim.statistic.Data;
import com.papa.sim.statistic.Event;
import com.papa.sim.statistic.Ext;
import com.papa.sim.statistic.p;
import com.papa91.arc.ext.ToastManager;
import com.papa91.arc.util.StringUtils;
import o1.a;
/* loaded from: classes5.dex */
public class MessengerService extends Service {
    public static final int A = 30;
    public static final int B = 31;
    public static final int C = 32;
    public static final int D = 33;
    public static final String E = "com.upload.wufun.screenshot";

    /* renamed from: b  reason: collision with root package name */
    private static final int f54958b = 1;

    /* renamed from: c  reason: collision with root package name */
    private static final int f54959c = 2;

    /* renamed from: d  reason: collision with root package name */
    private static final int f54960d = 3;

    /* renamed from: e  reason: collision with root package name */
    private static final int f54961e = 4;

    /* renamed from: f  reason: collision with root package name */
    private static final int f54962f = 5;

    /* renamed from: g  reason: collision with root package name */
    private static final int f54963g = 6;

    /* renamed from: h  reason: collision with root package name */
    private static final int f54964h = 7;

    /* renamed from: i  reason: collision with root package name */
    private static final int f54965i = 8;

    /* renamed from: j  reason: collision with root package name */
    private static final int f54966j = 9;

    /* renamed from: k  reason: collision with root package name */
    private static final int f54967k = 10;

    /* renamed from: l  reason: collision with root package name */
    private static final int f54968l = 11;

    /* renamed from: m  reason: collision with root package name */
    private static final int f54969m = 12;

    /* renamed from: n  reason: collision with root package name */
    private static final int f54970n = 13;

    /* renamed from: o  reason: collision with root package name */
    private static final int f54971o = 14;

    /* renamed from: p  reason: collision with root package name */
    public static final int f54972p = 15;

    /* renamed from: q  reason: collision with root package name */
    public static final int f54973q = 16;

    /* renamed from: r  reason: collision with root package name */
    public static final int f54974r = 17;

    /* renamed from: s  reason: collision with root package name */
    public static final int f54975s = 18;

    /* renamed from: t  reason: collision with root package name */
    public static final int f54976t = 19;

    /* renamed from: u  reason: collision with root package name */
    public static final int f54977u = 20;

    /* renamed from: v  reason: collision with root package name */
    public static final int f54978v = 21;

    /* renamed from: w  reason: collision with root package name */
    public static final int f54979w = 26;

    /* renamed from: x  reason: collision with root package name */
    public static final int f54980x = 27;

    /* renamed from: y  reason: collision with root package name */
    public static final int f54981y = 28;

    /* renamed from: z  reason: collision with root package name */
    public static final int f54982z = 29;

    /* loaded from: classes5.dex */
    class IncomingHandler extends Handler {

        /* renamed from: a  reason: collision with root package name */
        private Context f54983a;

        public IncomingHandler(Context context) {
            this.f54983a = context;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Context context = this.f54983a;
            if (context == null) {
                return;
            }
            Context applicationContext = context.getApplicationContext();
            Bundle data = message.getData();
            if (data == null) {
                return;
            }
            String string = data.getString("gameId");
            Ext ext = new Ext();
            ext.setGameId(string);
            String str = "";
            ext.setFrom(data.getString("from", ""));
            ext.setPosition(data.getString("position", ""));
            String string2 = data.getString(CommonService_.c0.f54306b, "");
            ext.setUid(MessengerService.this.c());
            ext.setFromTabId(data.getString("fromTabId", ""));
            ext.setArticleId(data.getString("articleId", ""));
            String string3 = data.getString("where", "");
            ext.setLiveTime(data.getLong(CommonService_.e0.f54339c, 0L));
            switch (message.what) {
                case 1:
                    p.l(applicationContext).O1(Event.showMod, ext);
                    break;
                case 2:
                    p.l(applicationContext).O1(Event.onclickMod, ext);
                    break;
                case 3:
                    p.l(applicationContext).O1(Event.openMod, ext);
                    break;
                case 4:
                    p.l(applicationContext).O1(Event.showVippopupMod, ext);
                    break;
                case 5:
                    p.l(applicationContext).O1(Event.onclickVippopupMod, ext);
                    break;
                case 6:
                    p.l(applicationContext).O1(Event.exitMod, ext);
                    p.l(applicationContext).O1(Event.exitVirtualGame, ext);
                    Intent intent = new Intent();
                    intent.setAction(a.G0);
                    this.f54983a.sendBroadcast(intent);
                    break;
                case 7:
                    p.l(applicationContext).O1(Event.modgamestart, ext);
                    break;
                case 8:
                    p.l(applicationContext).O1(Event.assistShow, ext);
                    break;
                case 9:
                    p.l(applicationContext).O1(Event.clickAssist, ext);
                    break;
                case 10:
                    Intent intent2 = new Intent(MessengerService.E);
                    intent2.putExtra(CommonService_.c0.f54306b, string2);
                    MessengerService.this.sendBroadcast(intent2);
                    break;
                case 11:
                    Object obj = message.obj;
                    if (obj != null) {
                        if (obj instanceof Bundle) {
                            Bundle bundle = (Bundle) obj;
                            str = bundle.getString("action");
                            bundle.getString("fromCls");
                        }
                        Intent intent3 = new Intent(str);
                        intent3.putExtras(data);
                        MessengerService.this.sendBroadcast(intent3);
                        break;
                    }
                    break;
                case 13:
                    p.l(applicationContext).O1(Event.clickPiix, ext);
                    break;
                case 14:
                    p.l(applicationContext).O1(Event.clickNav, ext);
                    break;
                case 15:
                    p.l(applicationContext).O1(Event.realNameUpWindows, ext);
                    break;
                case 16:
                    p.l(applicationContext).O1(Event.clickKnowGoRealPage, ext);
                    break;
                case 17:
                    p.l(applicationContext).O1(Event.antiAddtionWindowUp, ext);
                    break;
                case 18:
                    p.l(applicationContext).O1(Event.realNameDisplayWindow, ext);
                    break;
                case 19:
                    p.l(applicationContext).O1(Event.clickClosedRealNameWindow, ext);
                    break;
                case 20:
                    p.l(applicationContext).O1(Event.nonageAstrictHint, ext);
                    break;
                case 21:
                    p.l(applicationContext).O1(Event.realNameClickSubmit, ext);
                    break;
                case 26:
                    p.l(applicationContext).O1(Event.closedRealNameWindow, ext);
                    break;
                case 27:
                    long j4 = data.getLong(CommonService_.e0.f54339c);
                    w0.e("liveTime:" + j4 + " receive");
                    if (j4 != 0) {
                        ext.setLiveTime(j4 / 1000);
                        w0.e("liveTime:" + j4 + " send");
                        p.l(applicationContext).O1(Event.gamePlayTimes, ext);
                        break;
                    } else {
                        return;
                    }
                case 28:
                    Data data2 = new Data();
                    if (StringUtils.isNotEmpty(string)) {
                        data2.setGameId(Long.parseLong(string));
                    }
                    p.l(MessengerService.this.getApplicationContext()).q1(Event.singleStartGamePageList, Event.valueOf(string3), String.valueOf(MessengerService.this.c()), ext, data2);
                    break;
                case 29:
                    Data data3 = new Data();
                    if (StringUtils.isNotEmpty(string)) {
                        data3.setGameId(Long.parseLong(string));
                    }
                    p.l(MessengerService.this.getApplicationContext()).q1(Event.singleStartGamePageDetail, Event.valueOf(string3), String.valueOf(MessengerService.this.c()), ext, data3);
                    break;
                case 30:
                    MessengerService.this.d(data.getBoolean("expand", false));
                    break;
                case 31:
                    MessengerService.this.e("first_show_mod", Boolean.valueOf(data.getBoolean("first_show_mod")));
                    break;
                case 32:
                    String string4 = data.getString("ext");
                    if (StringUtils.isNotEmpty(string4)) {
                        DomainInfoBean domainInfoBean = (DomainInfoBean) JsonMapper.getInstance().fromJson(string4, DomainInfoBean.class);
                        if (domainInfoBean != null) {
                            p.l(MessengerService.this.getApplicationContext()).O1(Event.pdModGameFeedbackClick, ext.setGameId(string).setIsJoin(domainInfoBean.getIs_join()).setTestAbNumber(domainInfoBean.getAb_test_number()));
                            if (e.l0(this.f54983a).d(this.f54983a, "com.tencent.mm")) {
                                UtilsMy.h4(MApplication.f1497x, domainInfoBean.getInfo(), "mod_game_feedback");
                                break;
                            }
                        } else {
                            ToastManager.show("无法调起微信小程序");
                            break;
                        }
                    }
                    break;
                case 33:
                    ext.setActType(data.getString("sceneType", ""));
                    p.l(MessengerService.this.getApplicationContext()).O1(Event.pdReserveCode, ext);
                    break;
            }
            super.handleMessage(message);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int c() {
        try {
            AccountBean b5 = b();
            if (b5 != null) {
                return b5.getUid();
            }
            return 0;
        } catch (Exception unused) {
            return 0;
        }
    }

    public AccountBean b() {
        try {
            SharedPreferences sharedPreferences = getSharedPreferences("PrefDef", 4);
            String string = sharedPreferences.getString("accountDataV2", "");
            StringBuilder sb = new StringBuilder();
            sb.append("getAccountData: ");
            sb.append(string);
            if (StringUtils.isNotEmpty(string)) {
                return (AccountBean) JsonMapper.getInstance().fromJson(AESUtils.decrypt(string), AccountBean.class);
            }
            String string2 = sharedPreferences.getString("accountData", "");
            if (StringUtils.isNotEmpty(string2)) {
                AccountBean accountBean = (AccountBean) JsonMapper.getInstance().fromJson(string2, AccountBean.class);
                SharedPreferences.Editor edit = sharedPreferences.edit();
                if (accountBean != null) {
                    edit.putString("accountDataV2", AESUtils.encrypt(string2));
                    return accountBean;
                }
            }
            return new AccountBean();
        } catch (Exception e5) {
            e5.printStackTrace();
            return new AccountBean();
        }
    }

    public void d(boolean z4) {
        Intent intent = new Intent(a.J0);
        intent.putExtra(CommonService_.i0.f54386b, "expandIntroductionView_" + c());
        intent.putExtra(CommonService_.i0.f54387c, z4);
        sendBroadcast(intent);
    }

    public void e(String str, Object obj) {
        Intent intent = new Intent(a.K0);
        intent.putExtra(CommonService_.k0.f54401b, str);
        if (obj instanceof Boolean) {
            intent.putExtra(CommonService_.k0.f54402c, new SpValue((Boolean) obj));
        } else if (obj instanceof Integer) {
            intent.putExtra(CommonService_.k0.f54402c, new SpValue((Integer) obj));
        } else if (obj instanceof String) {
            intent.putExtra(CommonService_.k0.f54402c, new SpValue((String) obj));
        } else if (obj instanceof Float) {
            intent.putExtra(CommonService_.k0.f54402c, new SpValue((Float) obj));
        } else if (obj instanceof Long) {
            intent.putExtra(CommonService_.k0.f54402c, new SpValue((Long) obj));
        }
        sendBroadcast(intent);
    }

    @Override // android.app.Service
    @Nullable
    public IBinder onBind(Intent intent) {
        return new Messenger(new IncomingHandler(this)).getBinder();
    }
}
