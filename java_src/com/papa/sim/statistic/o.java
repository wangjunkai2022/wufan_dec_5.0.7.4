package com.papa.sim.statistic;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.efs.sdk.base.core.util.NetworkUtil;
import com.join.mgps.Util.h0;
import io.netty.handler.codec.http.HttpHeaders;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
/* compiled from: StatCore.java */
/* loaded from: classes.dex */
public class o {

    /* renamed from: p  reason: collision with root package name */
    private static o f58853p;

    /* renamed from: c  reason: collision with root package name */
    private com.papa.sim.statistic.db.b f58859c;

    /* renamed from: d  reason: collision with root package name */
    private Context f58860d;

    /* renamed from: f  reason: collision with root package name */
    private boolean f58862f;

    /* renamed from: k  reason: collision with root package name */
    private static Map<String, String> f58848k = new HashMap();

    /* renamed from: l  reason: collision with root package name */
    public static String f58849l = "http://datainterface.wufan88.com";

    /* renamed from: m  reason: collision with root package name */
    public static String f58850m = "http://cjapi.wufan88.com";

    /* renamed from: n  reason: collision with root package name */
    public static String f58851n = "http://anv9.ctapi.wufan88.com";

    /* renamed from: o  reason: collision with root package name */
    public static String f58852o = "http://anv9.ctapi.wufan88.com";

    /* renamed from: q  reason: collision with root package name */
    public static String f58854q = "";

    /* renamed from: r  reason: collision with root package name */
    public static String f58855r = "";

    /* renamed from: s  reason: collision with root package name */
    public static String f58856s = "";

    /* renamed from: a  reason: collision with root package name */
    private String f58857a = "StatCore";

    /* renamed from: b  reason: collision with root package name */
    private boolean f58858b = false;

    /* renamed from: e  reason: collision with root package name */
    private g f58861e = null;

    /* renamed from: g  reason: collision with root package name */
    private boolean f58863g = false;

    /* renamed from: h  reason: collision with root package name */
    boolean f58864h = false;

    /* renamed from: i  reason: collision with root package name */
    boolean f58865i = false;

    /* renamed from: j  reason: collision with root package name */
    boolean f58866j = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: StatCore.java */
    /* loaded from: classes5.dex */
    public class a implements com.papa.sim.statistic.http.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f58867a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.papa.sim.statistic.db.d f58868b;

        a(Context context, com.papa.sim.statistic.db.d dVar) {
            this.f58867a = context;
            this.f58868b = dVar;
        }

        @Override // com.papa.sim.statistic.http.a
        public void a(Exception exc) {
            exc.printStackTrace();
            if (this.f58868b.f() == 0) {
                String unused = o.this.f58857a;
                StringBuilder sb = new StringBuilder();
                sb.append("method [onFailure]:send failed. statisticTable.id= ");
                sb.append(this.f58868b.e());
                sb.append(";time=");
                sb.append(this.f58868b.i());
                o.this.f58859c.v(this.f58868b.getType(), this.f58868b.i());
                return;
            }
            String unused2 = o.this.f58857a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("method [onFailure]:send failed. statisticTable.id= ");
            sb2.append(this.f58868b.e());
            sb2.append(";time=");
            sb2.append(this.f58868b.i());
            o.this.f58859c.r(this.f58868b);
        }

        @Override // com.papa.sim.statistic.http.a
        public void onSuccess(Object obj) {
            File file = new File(o.this.h(this.f58867a, this.f58868b).getExt().getLogFile());
            if (file.exists()) {
                file.delete();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: StatCore.java */
    /* loaded from: classes5.dex */
    public class b implements com.papa.sim.statistic.http.a<String> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.papa.sim.statistic.db.d f58870a;

        b(com.papa.sim.statistic.db.d dVar) {
            this.f58870a = dVar;
        }

        @Override // com.papa.sim.statistic.http.a
        public void a(Exception exc) {
            exc.printStackTrace();
            if (this.f58870a.f() == 0) {
                String unused = o.this.f58857a;
                StringBuilder sb = new StringBuilder();
                sb.append("method [onFailure]:send failed. statisticTable.id= ");
                sb.append(this.f58870a.e());
                sb.append(";time=");
                sb.append(this.f58870a.i());
                o.this.f58859c.v(this.f58870a.getType(), this.f58870a.i());
                return;
            }
            String unused2 = o.this.f58857a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("method [onFailure]:send failed. statisticTable.id= ");
            sb2.append(this.f58870a.e());
            sb2.append(";time=");
            sb2.append(this.f58870a.i());
            o.this.f58859c.r(this.f58870a);
        }

        @Override // com.papa.sim.statistic.http.a
        /* renamed from: b */
        public void onSuccess(String str) {
            if (this.f58870a.f() == 0) {
                String unused = o.this.f58857a;
                o.this.f58859c.delete(this.f58870a);
                return;
            }
            String unused2 = o.this.f58857a;
            o.this.f58859c.e(this.f58870a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: StatCore.java */
    /* loaded from: classes5.dex */
    public class c implements com.papa.sim.statistic.http.a<String> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.papa.sim.statistic.db.d f58872a;

        c(com.papa.sim.statistic.db.d dVar) {
            this.f58872a = dVar;
        }

        @Override // com.papa.sim.statistic.http.a
        public void a(Exception exc) {
            if (this.f58872a.f() == 0) {
                String unused = o.this.f58857a;
                StringBuilder sb = new StringBuilder();
                sb.append("method [onFailure]:send failed. statisticTable.id= ");
                sb.append(this.f58872a.e());
                sb.append(";time=");
                sb.append(this.f58872a.i());
                o.this.f58859c.v(this.f58872a.getType(), this.f58872a.i());
                return;
            }
            String unused2 = o.this.f58857a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("method [onFailure]:send failed. statisticTable.id= ");
            sb2.append(this.f58872a.e());
            sb2.append(";time=");
            sb2.append(this.f58872a.i());
            o.this.f58859c.r(this.f58872a);
        }

        @Override // com.papa.sim.statistic.http.a
        /* renamed from: b */
        public void onSuccess(String str) {
            if (this.f58872a.f() == 0) {
                String unused = o.this.f58857a;
                o.this.f58859c.delete(this.f58872a);
                return;
            }
            String unused2 = o.this.f58857a;
            o.this.f58859c.e(this.f58872a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: StatCore.java */
    /* loaded from: classes5.dex */
    public class d implements com.papa.sim.statistic.http.a<StatResult> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.papa.sim.statistic.db.d f58874a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f58875b;

        d(com.papa.sim.statistic.db.d dVar, Context context) {
            this.f58874a = dVar;
            this.f58875b = context;
        }

        @Override // com.papa.sim.statistic.http.a
        public void a(Exception exc) {
            exc.printStackTrace();
            if (this.f58874a.getType().equals(Event.appPageVisit) || this.f58874a.getType().equals(Event.appPageClick) || this.f58874a.getType().equals(Event.appPageDownload)) {
                return;
            }
            try {
                if (this.f58874a.f() == 0) {
                    String unused = o.this.f58857a;
                    StringBuilder sb = new StringBuilder();
                    sb.append("method [onFailure]:send failed. statisticTable.id= ");
                    sb.append(this.f58874a.e());
                    sb.append(";time=");
                    sb.append(this.f58874a.i());
                    o.this.f58859c.v(this.f58874a.getType(), this.f58874a.i());
                } else {
                    String unused2 = o.this.f58857a;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("method [onFailure]:send failed. statisticTable.id= ");
                    sb2.append(this.f58874a.e());
                    sb2.append(";time=");
                    sb2.append(this.f58874a.i());
                    o.this.f58859c.r(this.f58874a);
                }
            } catch (Exception unused3) {
            }
        }

        @Override // com.papa.sim.statistic.http.a
        /* renamed from: b */
        public void onSuccess(StatResult statResult) {
            if (statResult == null) {
                return;
            }
            String unused = o.this.f58857a;
            StringBuilder sb = new StringBuilder();
            sb.append("statResult=");
            sb.append(JsonMapper.e().toJson(statResult));
            if ("ok".equals(statResult.getStatus())) {
                if (this.f58874a.getType().equals(Event.startApp.name())) {
                    com.papa.sim.statistic.pref.b.k(this.f58875b).K(this.f58874a.i());
                } else if (this.f58874a.getType().equals(Event.gameList.name())) {
                    com.papa.sim.statistic.pref.b.k(this.f58875b).C(this.f58874a.i());
                }
                if (this.f58874a.f() == 0) {
                    String unused2 = o.this.f58857a;
                    o.this.f58859c.delete(this.f58874a);
                    return;
                }
                String unused3 = o.this.f58857a;
                o.this.f58859c.e(this.f58874a);
            } else if (this.f58874a.getType().equals(Event.appPageVisit) || this.f58874a.getType().equals(Event.appPageClick) || this.f58874a.getType().equals(Event.appPageDownload)) {
            } else {
                if (this.f58874a.f() == 0) {
                    String unused4 = o.this.f58857a;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("method [onSuccess]:send failed. send to 1.statisticTable.id= ");
                    sb2.append(this.f58874a.e());
                    sb2.append(";time=");
                    sb2.append(this.f58874a.i());
                    o.this.f58859c.v(this.f58874a.getType(), this.f58874a.i());
                    return;
                }
                String unused5 = o.this.f58857a;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("method [onSuccess]:send failed.save it to db .statisticTable.id= ");
                sb3.append(this.f58874a.e());
                sb3.append(";time=");
                sb3.append(this.f58874a.i());
                o.this.f58859c.r(this.f58874a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: StatCore.java */
    /* loaded from: classes5.dex */
    public class e implements com.papa.sim.statistic.http.a<StatResult> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f58877a;

        e(List list) {
            this.f58877a = list;
        }

        @Override // com.papa.sim.statistic.http.a
        public void a(Exception exc) {
            exc.printStackTrace();
            String unused = o.this.f58857a;
            try {
                ArrayList arrayList = new ArrayList();
                for (com.papa.sim.statistic.db.d dVar : this.f58877a) {
                    if (!dVar.getType().equals(Event.appPageVisit) && !dVar.getType().equals(Event.appPageClick) && !dVar.getType().equals(Event.appPageDownload)) {
                        if (dVar.f() == 0) {
                            String unused2 = o.this.f58857a;
                            StringBuilder sb = new StringBuilder();
                            sb.append("method [onFailure]:send failed. statisticTable.id= ");
                            sb.append(dVar.e());
                            sb.append(";time=");
                            sb.append(dVar.i());
                            try {
                                o.this.f58859c.v(dVar.getType(), dVar.i());
                            } catch (Exception unused3) {
                            }
                        } else {
                            String unused4 = o.this.f58857a;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("method [onFailure]:send failed. statisticTable.id= ");
                            sb2.append(dVar.e());
                            sb2.append(";time=");
                            sb2.append(dVar.i());
                            arrayList.add(dVar);
                        }
                    }
                    return;
                }
                o.this.f58859c.s(arrayList);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            o.this.f58863g = false;
        }

        @Override // com.papa.sim.statistic.http.a
        /* renamed from: b */
        public void onSuccess(StatResult statResult) {
            if (statResult != null) {
                try {
                    String unused = o.this.f58857a;
                    StringBuilder sb = new StringBuilder();
                    sb.append("statResult=");
                    sb.append(JsonMapper.e().toJson(statResult));
                    if (o.this.f58858b) {
                        StringBuffer stringBuffer = new StringBuffer();
                        Iterator it2 = this.f58877a.iterator();
                        while (it2.hasNext()) {
                            stringBuffer.append(((com.papa.sim.statistic.db.d) it2.next()).getType() + "; ");
                        }
                        i.c(o.this.f58857a, stringBuffer.toString(), "send success");
                    }
                    ArrayList arrayList = new ArrayList();
                    for (com.papa.sim.statistic.db.d dVar : this.f58877a) {
                        if ("ok".equals(statResult.getStatus())) {
                            if (dVar.getType().equals(Event.startApp.name())) {
                                com.papa.sim.statistic.pref.b.k(o.this.f58860d).K(dVar.i());
                            } else if (dVar.getType().equals(Event.gameList.name())) {
                                com.papa.sim.statistic.pref.b.k(o.this.f58860d).C(dVar.i());
                            }
                            if (dVar.f() == 0) {
                                String unused2 = o.this.f58857a;
                                o.this.f58859c.delete(dVar);
                            } else {
                                String unused3 = o.this.f58857a;
                                o.this.f58859c.e(dVar);
                            }
                        } else {
                            if (!dVar.getType().equals(Event.appPageVisit) && !dVar.getType().equals(Event.appPageClick) && !dVar.getType().equals(Event.appPageDownload)) {
                                if (dVar.f() == 0) {
                                    String unused4 = o.this.f58857a;
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append("method [onSuccess]:send failed. send to 1.statisticTable.id= ");
                                    sb2.append(dVar.e());
                                    sb2.append(";time=");
                                    sb2.append(dVar.i());
                                    o.this.f58859c.v(dVar.getType(), dVar.i());
                                } else {
                                    String unused5 = o.this.f58857a;
                                    StringBuilder sb3 = new StringBuilder();
                                    sb3.append("method [onSuccess]:send failed.save it to db .statisticTable.id= ");
                                    sb3.append(dVar.e());
                                    sb3.append(";time=");
                                    sb3.append(dVar.i());
                                    arrayList.add(dVar);
                                }
                            }
                            return;
                        }
                    }
                    List<com.papa.sim.statistic.db.d> k4 = o.this.f58859c.k();
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(k4.size());
                    sb4.append("");
                    o.this.f58859c.s(arrayList);
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
            o.this.f58863g = false;
            String unused6 = o.this.f58857a;
        }
    }

    /* compiled from: StatCore.java */
    /* loaded from: classes5.dex */
    class f implements com.papa.sim.statistic.http.a<String> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f58879a;

        f(List list) {
            this.f58879a = list;
        }

        @Override // com.papa.sim.statistic.http.a
        public void a(Exception exc) {
            ArrayList arrayList = new ArrayList();
            for (com.papa.sim.statistic.db.d dVar : this.f58879a) {
                if (dVar.f() == 0) {
                    String unused = o.this.f58857a;
                    StringBuilder sb = new StringBuilder();
                    sb.append("method [onFailure]:send failed. statisticTable.id= ");
                    sb.append(dVar.e());
                    sb.append(";time=");
                    sb.append(dVar.i());
                    o.this.f58859c.v(dVar.getType(), dVar.i());
                } else {
                    String unused2 = o.this.f58857a;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("method [onFailure]:send failed. statisticTable.id= ");
                    sb2.append(dVar.e());
                    sb2.append(";time=");
                    sb2.append(dVar.i());
                    arrayList.add(dVar);
                }
            }
            if (arrayList.size() > 0) {
                o.this.f58859c.s(arrayList);
            }
            if (exc != null) {
                exc.printStackTrace();
            }
        }

        @Override // com.papa.sim.statistic.http.a
        /* renamed from: b */
        public void onSuccess(String str) {
            for (com.papa.sim.statistic.db.d dVar : this.f58879a) {
                if (dVar.f() == 0) {
                    String unused = o.this.f58857a;
                    o.this.f58859c.delete(dVar);
                } else {
                    String unused2 = o.this.f58857a;
                    o.this.f58859c.e(dVar);
                }
            }
        }
    }

    /* compiled from: StatCore.java */
    /* loaded from: classes.dex */
    public interface g {
        int a();

        int b();
    }

    private o(Context context) {
        this.f58860d = context;
        this.f58859c = com.papa.sim.statistic.db.b.o(context);
    }

    private void Z(List<com.papa.sim.statistic.db.d> list) {
        if (com.papa.sim.statistic.pref.b.k(this.f58860d).s()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (com.papa.sim.statistic.db.d dVar : list) {
            if (Event.pluginPlayTime.name().equals(dVar.getType())) {
                StringBuilder sb = new StringBuilder();
                sb.append("sendAllData: ");
                sb.append(JsonMapper.toJsonString(dVar));
                list.remove(dVar);
            } else {
                StatRequest h4 = h(this.f58860d, dVar);
                if (this.f58861e != null) {
                    h4.getData().setPageVersion(this.f58861e.b());
                }
                if (h4.getUid() == 0 || h4.getExt().getUid() == 0) {
                    try {
                        h4.setUid(Integer.parseInt(p.l(this.f58860d).n().a(this.f58860d)));
                        h4.getExt().setUid(Integer.parseInt(p.l(this.f58860d).n().a(this.f58860d)));
                    } catch (Exception unused) {
                    }
                }
                if (this.f58858b) {
                    i.c(this.f58857a, JsonMapper.toJsonString(h4.getExt()), h4.getEvent());
                }
                arrayList.add(h4);
            }
        }
        String json = JsonMapper.e().toJson(arrayList);
        if (this.f58858b) {
            i.c(this.f58857a, json, "all-10");
        }
        try {
            json = com.papa.sim.statistic.a.b(json, "");
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        com.papa.sim.statistic.http.c c5 = com.papa.sim.statistic.http.c.c();
        c5.g(f58849l + "/data/batch/v3", json, new e(list));
    }

    private void g() {
        if (this.f58862f) {
            return;
        }
        this.f58862f = com.papa.sim.statistic.http.c.c().f(this.f58860d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(33:1|(3:2|3|4)|(19:284|285|(2:307|(1:435))|438|439|(5:454|455|457|458|459)|441|442|(1:444)|445|446|447|448|42|43|44|(2:49|50)|46|47)|6|8|9|(1:280)(2:13|14)|15|(1:17)|18|19|20|22|23|(16:28|29|30|(1:265)|34|35|(1:37)|38|(1:40)(2:55|(2:57|(4:61|(1:63)|64|(1:66)))(2:67|(1:69)(4:70|(2:75|(1:77)(2:78|(6:81|(3:86|(2:93|(3:95|(1:97)|98)(6:99|(9:104|105|(3:116|(1:118)(2:121|(3:123|124|125)(2:130|(1:132)(3:133|(2:138|(2:140|141)(2:142|(1:144)(2:145|(1:147)(5:148|(2:153|(1:155)(3:156|(3:169|(2:174|(1:176)(3:177|(3:202|(2:221|(1:223)(3:224|(1:226)|227))|228)|229))|230)|231))|232|233|234))))|237)))|119)|238|239|240|(1:242)|244|119)|247|248|249|250))|253)|254|255|(1:257)(1:260)|258)(1:80)))|262|263)))|41|42|43|44|(0)|46|47)|269|29|30|(1:32)|265|34|35|(0)|38|(0)(0)|41|42|43|44|(0)|46|47|(1:(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(35:1|2|3|4|(19:284|285|(2:307|(1:435))|438|439|(5:454|455|457|458|459)|441|442|(1:444)|445|446|447|448|42|43|44|(2:49|50)|46|47)|6|8|9|(1:280)(2:13|14)|15|(1:17)|18|19|20|22|23|(16:28|29|30|(1:265)|34|35|(1:37)|38|(1:40)(2:55|(2:57|(4:61|(1:63)|64|(1:66)))(2:67|(1:69)(4:70|(2:75|(1:77)(2:78|(6:81|(3:86|(2:93|(3:95|(1:97)|98)(6:99|(9:104|105|(3:116|(1:118)(2:121|(3:123|124|125)(2:130|(1:132)(3:133|(2:138|(2:140|141)(2:142|(1:144)(2:145|(1:147)(5:148|(2:153|(1:155)(3:156|(3:169|(2:174|(1:176)(3:177|(3:202|(2:221|(1:223)(3:224|(1:226)|227))|228)|229))|230)|231))|232|233|234))))|237)))|119)|238|239|240|(1:242)|244|119)|247|248|249|250))|253)|254|255|(1:257)(1:260)|258)(1:80)))|262|263)))|41|42|43|44|(0)|46|47)|269|29|30|(1:32)|265|34|35|(0)|38|(0)(0)|41|42|43|44|(0)|46|47|(1:(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(9:104|105|(3:116|(1:118)(2:121|(3:123|124|125)(2:130|(1:132)(3:133|(2:138|(2:140|141)(2:142|(1:144)(2:145|(1:147)(5:148|(2:153|(1:155)(3:156|(3:169|(2:174|(1:176)(3:177|(3:202|(2:221|(1:223)(3:224|(1:226)|227))|228)|229))|230)|231))|232|233|234))))|237)))|119)|238|239|240|(1:242)|244|119) */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x04d4, code lost:
        if (r18.getType().equals(com.papa.sim.statistic.Event.gameDownload.name()) != false) goto L438;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x0654, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x0656, code lost:
        r0.printStackTrace();
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x0672, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x0674, code lost:
        r0.getMessage();
        r0.printStackTrace();
        r8.setAd(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x0694, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0696, code lost:
        r0.getMessage();
        r8.setCountType(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:430:0x0f33, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:431:0x0f34, code lost:
        r3 = r0;
        r7 = r8;
     */
    /* JADX WARN: Removed duplicated region for block: B:171:0x057a A[Catch: Exception -> 0x05e1, TryCatch #20 {Exception -> 0x05e1, blocks: (B:169:0x0516, B:171:0x057a, B:172:0x0581, B:174:0x059f, B:166:0x0501), top: B:491:0x0501 }] */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0701 A[Catch: Exception -> 0x0f33, TryCatch #8 {Exception -> 0x0f33, blocks: (B:181:0x05ee, B:183:0x05f4, B:192:0x060f, B:194:0x062a, B:195:0x062f, B:222:0x069c, B:224:0x0701, B:225:0x0708, B:227:0x072f, B:425:0x0f13, B:228:0x0747, B:230:0x074e, B:232:0x0758, B:234:0x0768, B:236:0x076e, B:237:0x0791, B:239:0x0797, B:240:0x0802, B:242:0x0812, B:243:0x0838, B:245:0x0848, B:248:0x085a, B:250:0x086a, B:251:0x0873, B:254:0x0885, B:256:0x0895, B:259:0x08a7, B:261:0x08b7, B:263:0x08c7, B:266:0x08d9, B:268:0x08e9, B:271:0x08f0, B:272:0x0904, B:274:0x0914, B:277:0x0926, B:279:0x0936, B:281:0x0946, B:283:0x0956, B:285:0x0966, B:288:0x0978, B:292:0x09b9, B:294:0x09c9, B:299:0x09d9, B:300:0x09e1, B:302:0x09f1, B:303:0x0a09, B:305:0x0a19, B:308:0x0a2b, B:310:0x0a3b, B:313:0x0a65, B:315:0x0a75, B:316:0x0ac1, B:318:0x0ad1, B:319:0x0ae2, B:321:0x0af2, B:324:0x0b04, B:328:0x0b3e, B:330:0x0b4e, B:332:0x0b5e, B:334:0x0b6e, B:336:0x0b7e, B:338:0x0b8e, B:341:0x0ba0, B:343:0x0bb0, B:346:0x0bc2, B:348:0x0bd2, B:349:0x0bea, B:351:0x0bfa, B:353:0x0c0a, B:355:0x0c1a, B:357:0x0c2a, B:359:0x0c3a, B:361:0x0c4a, B:363:0x0c5a, B:365:0x0c6a, B:367:0x0c7a, B:369:0x0c8a, B:371:0x0c9a, B:374:0x0cac, B:376:0x0cbc, B:378:0x0ccc, B:380:0x0cdc, B:382:0x0cec, B:384:0x0cfc, B:386:0x0d0c, B:388:0x0d1c, B:390:0x0d2c, B:393:0x0d3d, B:395:0x0d4d, B:396:0x0d5d, B:398:0x0d6b, B:399:0x0d76, B:400:0x0d92, B:401:0x0dae, B:407:0x0e38, B:408:0x0e3f, B:415:0x0e7f, B:417:0x0e8f, B:418:0x0e98, B:428:0x0f24, B:221:0x0696, B:211:0x0674, B:200:0x0656, B:190:0x0605, B:191:0x060c, B:295:0x09ce, B:212:0x067d, B:214:0x0683, B:217:0x068c, B:216:0x0689, B:196:0x0648, B:201:0x0659, B:203:0x065f, B:206:0x0666, B:207:0x066e, B:186:0x05fb), top: B:469:0x05ee, inners: #3, #5, #6, #9, #18 }] */
    /* JADX WARN: Removed duplicated region for block: B:227:0x072f A[Catch: Exception -> 0x0f33, TryCatch #8 {Exception -> 0x0f33, blocks: (B:181:0x05ee, B:183:0x05f4, B:192:0x060f, B:194:0x062a, B:195:0x062f, B:222:0x069c, B:224:0x0701, B:225:0x0708, B:227:0x072f, B:425:0x0f13, B:228:0x0747, B:230:0x074e, B:232:0x0758, B:234:0x0768, B:236:0x076e, B:237:0x0791, B:239:0x0797, B:240:0x0802, B:242:0x0812, B:243:0x0838, B:245:0x0848, B:248:0x085a, B:250:0x086a, B:251:0x0873, B:254:0x0885, B:256:0x0895, B:259:0x08a7, B:261:0x08b7, B:263:0x08c7, B:266:0x08d9, B:268:0x08e9, B:271:0x08f0, B:272:0x0904, B:274:0x0914, B:277:0x0926, B:279:0x0936, B:281:0x0946, B:283:0x0956, B:285:0x0966, B:288:0x0978, B:292:0x09b9, B:294:0x09c9, B:299:0x09d9, B:300:0x09e1, B:302:0x09f1, B:303:0x0a09, B:305:0x0a19, B:308:0x0a2b, B:310:0x0a3b, B:313:0x0a65, B:315:0x0a75, B:316:0x0ac1, B:318:0x0ad1, B:319:0x0ae2, B:321:0x0af2, B:324:0x0b04, B:328:0x0b3e, B:330:0x0b4e, B:332:0x0b5e, B:334:0x0b6e, B:336:0x0b7e, B:338:0x0b8e, B:341:0x0ba0, B:343:0x0bb0, B:346:0x0bc2, B:348:0x0bd2, B:349:0x0bea, B:351:0x0bfa, B:353:0x0c0a, B:355:0x0c1a, B:357:0x0c2a, B:359:0x0c3a, B:361:0x0c4a, B:363:0x0c5a, B:365:0x0c6a, B:367:0x0c7a, B:369:0x0c8a, B:371:0x0c9a, B:374:0x0cac, B:376:0x0cbc, B:378:0x0ccc, B:380:0x0cdc, B:382:0x0cec, B:384:0x0cfc, B:386:0x0d0c, B:388:0x0d1c, B:390:0x0d2c, B:393:0x0d3d, B:395:0x0d4d, B:396:0x0d5d, B:398:0x0d6b, B:399:0x0d76, B:400:0x0d92, B:401:0x0dae, B:407:0x0e38, B:408:0x0e3f, B:415:0x0e7f, B:417:0x0e8f, B:418:0x0e98, B:428:0x0f24, B:221:0x0696, B:211:0x0674, B:200:0x0656, B:190:0x0605, B:191:0x060c, B:295:0x09ce, B:212:0x067d, B:214:0x0683, B:217:0x068c, B:216:0x0689, B:196:0x0648, B:201:0x0659, B:203:0x065f, B:206:0x0666, B:207:0x066e, B:186:0x05fb), top: B:469:0x05ee, inners: #3, #5, #6, #9, #18 }] */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0747 A[Catch: Exception -> 0x0f33, TryCatch #8 {Exception -> 0x0f33, blocks: (B:181:0x05ee, B:183:0x05f4, B:192:0x060f, B:194:0x062a, B:195:0x062f, B:222:0x069c, B:224:0x0701, B:225:0x0708, B:227:0x072f, B:425:0x0f13, B:228:0x0747, B:230:0x074e, B:232:0x0758, B:234:0x0768, B:236:0x076e, B:237:0x0791, B:239:0x0797, B:240:0x0802, B:242:0x0812, B:243:0x0838, B:245:0x0848, B:248:0x085a, B:250:0x086a, B:251:0x0873, B:254:0x0885, B:256:0x0895, B:259:0x08a7, B:261:0x08b7, B:263:0x08c7, B:266:0x08d9, B:268:0x08e9, B:271:0x08f0, B:272:0x0904, B:274:0x0914, B:277:0x0926, B:279:0x0936, B:281:0x0946, B:283:0x0956, B:285:0x0966, B:288:0x0978, B:292:0x09b9, B:294:0x09c9, B:299:0x09d9, B:300:0x09e1, B:302:0x09f1, B:303:0x0a09, B:305:0x0a19, B:308:0x0a2b, B:310:0x0a3b, B:313:0x0a65, B:315:0x0a75, B:316:0x0ac1, B:318:0x0ad1, B:319:0x0ae2, B:321:0x0af2, B:324:0x0b04, B:328:0x0b3e, B:330:0x0b4e, B:332:0x0b5e, B:334:0x0b6e, B:336:0x0b7e, B:338:0x0b8e, B:341:0x0ba0, B:343:0x0bb0, B:346:0x0bc2, B:348:0x0bd2, B:349:0x0bea, B:351:0x0bfa, B:353:0x0c0a, B:355:0x0c1a, B:357:0x0c2a, B:359:0x0c3a, B:361:0x0c4a, B:363:0x0c5a, B:365:0x0c6a, B:367:0x0c7a, B:369:0x0c8a, B:371:0x0c9a, B:374:0x0cac, B:376:0x0cbc, B:378:0x0ccc, B:380:0x0cdc, B:382:0x0cec, B:384:0x0cfc, B:386:0x0d0c, B:388:0x0d1c, B:390:0x0d2c, B:393:0x0d3d, B:395:0x0d4d, B:396:0x0d5d, B:398:0x0d6b, B:399:0x0d76, B:400:0x0d92, B:401:0x0dae, B:407:0x0e38, B:408:0x0e3f, B:415:0x0e7f, B:417:0x0e8f, B:418:0x0e98, B:428:0x0f24, B:221:0x0696, B:211:0x0674, B:200:0x0656, B:190:0x0605, B:191:0x060c, B:295:0x09ce, B:212:0x067d, B:214:0x0683, B:217:0x068c, B:216:0x0689, B:196:0x0648, B:201:0x0659, B:203:0x065f, B:206:0x0666, B:207:0x066e, B:186:0x05fb), top: B:469:0x05ee, inners: #3, #5, #6, #9, #18 }] */
    /* JADX WARN: Removed duplicated region for block: B:481:0x0f5b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.papa.sim.statistic.StatRequest h(android.content.Context r17, com.papa.sim.statistic.db.d r18) {
        /*
            Method dump skipped, instructions count: 4011
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.papa.sim.statistic.o.h(android.content.Context, com.papa.sim.statistic.db.d):com.papa.sim.statistic.StatRequest");
    }

    public static String j(String str, String str2) {
        for (int i4 = 0; i4 < 2; i4++) {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("http://service.kingnetdc.com/mqs").openConnection();
                httpURLConnection.setConnectTimeout(5000);
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setInstanceFollowRedirects(true);
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setRequestProperty("Accept", HttpHeaders.Values.APPLICATION_JSON);
                httpURLConnection.setRequestProperty("Content-Type", HttpHeaders.Values.APPLICATION_JSON);
                httpURLConnection.setRequestProperty(com.alipay.sdk.packet.d.f4898g, "1");
                httpURLConnection.setRequestProperty("Topic", "papa_plat");
                String str3 = "[{\"key\":\"" + str2 + "\",\"message\":" + str + "}]";
                httpURLConnection.setRequestProperty("Authorization", j.a("9c708c7fce87abaa544b221898769baapapa_plat19c708c7fce87abaa544b221898769baa" + str3));
                httpURLConnection.connect();
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(httpURLConnection.getOutputStream(), "UTF-8");
                outputStreamWriter.append((CharSequence) str3);
                outputStreamWriter.flush();
                outputStreamWriter.close();
                int contentLength = httpURLConnection.getContentLength();
                InputStream inputStream = httpURLConnection.getInputStream();
                if (contentLength == -1) {
                    return "-1";
                }
                byte[] bArr = new byte[contentLength];
                byte[] bArr2 = new byte[512];
                int i5 = 0;
                while (true) {
                    int read = inputStream.read(bArr2);
                    if (read > 0) {
                        System.arraycopy(bArr2, 0, bArr, i5, read);
                        i5 += read;
                    } else {
                        String str4 = new String(bArr, "UTF-8");
                        System.out.println(str4);
                        return str4;
                    }
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
        return "-1";
    }

    public static String l(String str) {
        return f58848k.get(str);
    }

    public static o m(Context context) {
        if (f58853p == null) {
            f58853p = new o(context);
        }
        return f58853p;
    }

    private String p(int i4) {
        return (i4 & 255) + h0.f27805a + ((i4 >> 8) & 255) + h0.f27805a + ((i4 >> 16) & 255) + h0.f27805a + ((i4 >> 24) & 255);
    }

    public static void p0(String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        f58848k.put(str, str2);
    }

    private void u0(StatRequest statRequest) {
        statRequest.setTime(System.currentTimeMillis());
        try {
            this.f58860d.startService(new Intent(this.f58860d, StatService.class));
        } catch (Exception unused) {
        }
        if (statRequest.getEvent() == null || statRequest.getEvent().equals("")) {
            return;
        }
        String event = statRequest.getEvent();
        Event event2 = Event.joyStickConfigPost;
        if (!event.equals(event2.name()) && !statRequest.getEvent().equals(Event.joyStickInfoPost.name())) {
            if (!statRequest.getEvent().equals(Event.setpapaerror.name()) && !statRequest.getEvent().equals(Event.setemuerror.name())) {
                if (statRequest.getEvent().equals(Event.gameWorldData.name())) {
                    new com.papa.sim.statistic.db.d().t(statRequest.getEvent().toString());
                }
                com.papa.sim.statistic.db.d dVar = new com.papa.sim.statistic.db.d();
                dVar.t(statRequest.getEvent().toString());
                String type = dVar.getType();
                if (statRequest.isRequest()) {
                    dVar.q(2);
                    dVar.l(JsonMapper.toJsonString(statRequest));
                } else if (statRequest.isNew()) {
                    dVar.q(1);
                    dVar.l(JsonMapper.toJsonString(statRequest.getExt()));
                } else if (type.equals(Event.visitSearchPage.name())) {
                    dVar.l(statRequest.getData().getWhere().toString());
                } else if (statRequest.getEvent().equals(Event.gameList.name())) {
                    dVar.l(JsonMapper.f().toJson(statRequest));
                } else if (!statRequest.getEvent().equals(Event.plugEfficiency.name()) && !statRequest.getEvent().equals(Event.pluginPlayTime.name())) {
                    if (statRequest.getEvent().equals(Event.onMainPageShow.name())) {
                        dVar.l(JsonMapper.e().toJson(statRequest));
                    } else {
                        if (!statRequest.getEvent().equals(Event.visitIndexAdEvent.name()) && !statRequest.getEvent().equals(Event.clickIndexAdEvent.name()) && !statRequest.getEvent().equals(Event.gameRequest.name())) {
                            String event3 = statRequest.getEvent();
                            Event event4 = Event.gameDownload;
                            if (!event3.equals(event4.name()) && !statRequest.getEvent().equals(Event.startDownloadPlug.name()) && !statRequest.getEvent().equals(Event.downloadPlugCompleted.name()) && !statRequest.getEvent().equals(Event.installPlugCompleted.name()) && !statRequest.getEvent().equals(Event.gameOut.name()) && !statRequest.getEvent().equals(Event.netBattleMatchFinish.name()) && !statRequest.getEvent().equals(Event.netBattleMatchStart.name()) && !statRequest.getEvent().equals(Event.startShare.name()) && !statRequest.getEvent().equals(Event.shareChannel.name()) && !statRequest.getEvent().equals(Event.shareResult.name()) && !statRequest.getEvent().equals(Event.f2fRequestCreateQrcode.name()) && !statRequest.getEvent().equals(Event.f2fCreateQrcodeSuccess.name()) && !statRequest.getEvent().equals(Event.liveResDownloaded.name()) && !statRequest.getEvent().equals(Event.clickVsBtn.name()) && !statRequest.getEvent().equals(Event.clickVsHallBtn.name()) && !statRequest.getEvent().equals(Event.visitVsRoomPage.name()) && !statRequest.getEvent().equals(Event.visitVsMainPage.name()) && !statRequest.getEvent().equals(Event.clickVsForumBtn.name()) && !statRequest.getEvent().equals(Event.clickVsAdvBtn.name()) && !statRequest.getEvent().equals(Event.clickVsCreateRoom.name()) && !statRequest.getEvent().equals(Event.clickVsQuickJoin.name()) && !statRequest.getEvent().equals(Event.VsCreateWaitOver.name()) && !statRequest.getEvent().equals(Event.VsGameOverSuccess.name()) && !statRequest.getEvent().equals(Event.VsSelectSilentBtn.name()) && !statRequest.getEvent().equals(Event.VsCreateSilentRoom.name()) && !statRequest.getEvent().equals(Event.VsSilentTransform.name()) && !statRequest.getEvent().equals(Event.clickVsLocalBat.name()) && !statRequest.getEvent().equals(Event.clickVsNetBattleMatch.name()) && !statRequest.getEvent().equals(Event.f2fRequestScanQrcode.name()) && !statRequest.getEvent().equals(Event.f2fConnectQrcodeSuccess.name()) && !statRequest.getEvent().equals(Event.sharePasteClick.name()) && !statRequest.getEvent().equals(Event.f2fTransferGameDone.name()) && !statRequest.getEvent().equals(Event.f2fInterruptTransferGame.name()) && !statRequest.getEvent().equals(Event.visitAppInternalPage.name()) && !statRequest.getEvent().equals(Event.arenaGameList.name()) && !statRequest.getEvent().equals(Event.arenaGameListBanner.name()) && !statRequest.getEvent().equals(Event.arenaGameListItem.name()) && !statRequest.getEvent().equals(Event.areaRoomFromInvite.name()) && !dVar.getType().equals(Event.requestEvent.name()) && !dVar.getType().equals(Event.clickButtonEvent.name()) && !dVar.getType().equals(Event.clickHomePageEvent.name()) && !dVar.getType().equals(Event.clickShopHomeEvent.name()) && !dVar.getType().equals(Event.findButtonEvent.name()) && !dVar.getType().equals(Event.pspMemberADDialog.name()) && !dVar.getType().equals(Event.clickGameDetailModel.name()) && !dVar.getType().equals(Event.enterUserGameList.name()) && !dVar.getType().equals(Event.clickSearchAdPosition.name()) && !dVar.getType().equals(Event.downloadFromSearchResult.name()) && !dVar.getType().equals(event4.name()) && !dVar.getType().equals(Event.indexGameStart.name())) {
                                String type2 = dVar.getType();
                                Event event5 = Event.visitGamePage;
                                if (!type2.equals(event5.name()) && !dVar.getType().equals(Event.clickDetailFromSearchResult.name()) && !dVar.getType().equals(Event.gameStart.name()) && !dVar.getType().equals(Event.gameUnzip.name()) && !dVar.getType().equals(Event.VMGameStart.name()) && !dVar.getType().equals(Event.VMGameStartAfterStatus.name()) && !dVar.getType().equals(Event.speedDownQkExp.name()) && !dVar.getType().equals(Event.clickSpeedDownQkButton.name()) && !dVar.getType().equals(Event.installTipsQkExp.name()) && !dVar.getType().equals(Event.clickInstallQkButton.name()) && !dVar.getType().equals(Event.installSuccessQk.name()) && !dVar.getType().equals(Event.clickSpeedDownUpQk.name())) {
                                    String type3 = dVar.getType();
                                    Event event6 = Event.installAndroidCompleted;
                                    if (!type3.equals(event6.name())) {
                                        String type4 = dVar.getType();
                                        Event event7 = Event.gameDownload;
                                        if (!type4.equals(event7.name())) {
                                            if (!type.equals(event7.name()) && !type.equals(Event.gameDownloadCompleted.name())) {
                                                if (type.equals(Event.gameWorldData.name())) {
                                                    dVar.l(statRequest.getData().getModel());
                                                } else if (!type.equals(Event.memberClickRegister.name()) && !type.equals(Event.joystickJoinApp.name()) && !type.equals(Event.joystickJoin.name())) {
                                                    if (!type.equals(Event.md5error.name()) && !type.equals(Event.filenumerror.name())) {
                                                        if (!type.equals(Event.articleClickPraise.name()) && !type.equals(Event.articleClickDownload.name())) {
                                                            if (!type.equals(Event.startDownloadPlug.name()) && !type.equals(Event.downloadPlugCompleted.name()) && !type.equals(Event.installPlugCompleted.name())) {
                                                                if (!statRequest.getEvent().equals(Event.gameOut.name()) && !statRequest.getEvent().equals(Event.startLocalNetBattleSuccessEmu.name()) && !statRequest.getEvent().equals(Event.endLocalNetBattleSuccessEmu.name()) && !statRequest.getEvent().equals(Event.netBattleMatchFinish.name()) && !statRequest.getEvent().equals(Event.netBattleMatchStart.name())) {
                                                                    if (statRequest.getEvent().equals(Event.appUseTime.name())) {
                                                                        dVar.l(statRequest.getData().getLocation());
                                                                        dVar.u(statRequest.getExt().getUid() + "");
                                                                        dVar.m(statRequest.getUid() + "");
                                                                    } else if (statRequest.getEvent().equals(Event.appPageVisit.name())) {
                                                                        dVar.l(JsonMapper.e().toJson(statRequest.getExt()));
                                                                        dVar.u(statRequest.getExt().getUid() + "");
                                                                    } else if (!statRequest.getEvent().equals(Event.appPageClick.name()) && !statRequest.getEvent().equals(Event.appPageDownload.name())) {
                                                                        if (statRequest.getEvent().equals(Event.netBattleMatchEfficiency.name())) {
                                                                            dVar.l(statRequest.getData().getLocation());
                                                                            dVar.m(statRequest.getUid() + "");
                                                                            dVar.u(statRequest.getExt().getUid() + "");
                                                                        } else if (statRequest.getEvent().equals(Event.submitPost.name())) {
                                                                            dVar.l(statRequest.getExt().getUid() + "");
                                                                            dVar.u(statRequest.getExt().getUid() + "");
                                                                        } else if (statRequest.getEvent().equals(event6.name())) {
                                                                            dVar.u(statRequest.getUid() + "");
                                                                            dVar.l(statRequest.getData().getGameId() + "");
                                                                            dVar.m(statRequest.getExt().getGameFlag() + "");
                                                                        } else if (statRequest.getEvent().equals(Event.startArchiveManagement.name())) {
                                                                            dVar.u(statRequest.getUid() + "");
                                                                            dVar.l(statRequest.getData().getGameId() + "");
                                                                            dVar.m(statRequest.getExt().getNodeId());
                                                                        } else if (statRequest.getEvent().equals(event5.name())) {
                                                                            dVar.l(statRequest.getData().getGameId() + "");
                                                                            dVar.m(statRequest.getExt().getFrom());
                                                                        } else if (!statRequest.getEvent().equals(Event.expGameAdPage.name()) && !statRequest.getEvent().equals(Event.pullDownModelExp.name()) && !statRequest.getEvent().equals(Event.expSmallGameAdPage.name()) && !statRequest.getEvent().equals(Event.smallGameStartSDK.name()) && !statRequest.getEvent().equals(Event.smallRequestAdSDK.name()) && !statRequest.getEvent().equals(Event.smallExpAdSDK.name()) && !statRequest.getEvent().equals(Event.smallVideoDoneAdSDK.name()) && !statRequest.getEvent().equals(Event.expH5GameAdPicPage.name()) && !statRequest.getEvent().equals(Event.clickH5AndCollGamePicPage.name())) {
                                                                            if (type.equals(Event.clickSearchButton.name())) {
                                                                                dVar.l(statRequest.getData().getWhere().toString());
                                                                                dVar.m(statRequest.getExt().getPage());
                                                                            } else if (!statRequest.getEvent().equals(Event.listShowBigPicUPPage.name()) && !statRequest.getEvent().equals(Event.listShowIconHotList.name()) && !statRequest.getEvent().equals(Event.listClickBigPicStaus.name()) && !statRequest.getEvent().equals(Event.listClickIconStatus.name()) && !statRequest.getEvent().equals(Event.listClickBigPicSlideUPDown.name()) && !statRequest.getEvent().equals(Event.listClickIconSlideUPDown.name()) && !statRequest.getEvent().equals(Event.gameClickBigModelGet.name()) && !statRequest.getEvent().equals(Event.gameClickBigPicGoDetail.name()) && !statRequest.getEvent().equals(Event.gameClickIconModelClick.name()) && !statRequest.getEvent().equals(Event.game_strategy_panel.name()) && !statRequest.getEvent().equals(Event.gameClickBigPicGoWYDetail.name()) && !statRequest.getEvent().equals(Event.gameClickIconModelWYClick.name())) {
                                                                                if (statRequest.getEvent().equals(Event.unzipFailed.name())) {
                                                                                    dVar.m(statRequest.getExt().getGameFlag() + "");
                                                                                }
                                                                                dVar.l(statRequest.getData().getGameId() + "");
                                                                            } else {
                                                                                dVar.l(JsonMapper.toJsonString(statRequest.getExt()));
                                                                                dVar.m(String.valueOf(statRequest.getData().getGameId()));
                                                                            }
                                                                        } else {
                                                                            dVar.l(JsonMapper.toJsonString(statRequest.getExt()));
                                                                            dVar.m(String.valueOf(statRequest.getData().getGameId()));
                                                                        }
                                                                    } else {
                                                                        dVar.l(JsonMapper.e().toJson(statRequest.getExt()));
                                                                        dVar.u(statRequest.getExt().getUid() + "");
                                                                    }
                                                                } else {
                                                                    dVar.u(statRequest.getExt().getUid() + "");
                                                                    dVar.l(statRequest.getData().getGameId() + "");
                                                                    try {
                                                                        dVar.m(JsonMapper.e().toJson(statRequest.getExt()));
                                                                    } catch (Exception unused2) {
                                                                    }
                                                                }
                                                            } else {
                                                                dVar.u(statRequest.getExt().getUid() + "");
                                                                dVar.l(statRequest.getData().getPlugId() + "");
                                                            }
                                                        } else {
                                                            dVar.u(statRequest.getExt().getUid() + "");
                                                            dVar.l(statRequest.getExt().getArticleId() + "");
                                                        }
                                                    } else {
                                                        Ext ext = statRequest.getExt();
                                                        String json = JsonMapper.f().toJson(ext);
                                                        dVar.u(ext.getUid() + "");
                                                        dVar.l(json);
                                                    }
                                                } else {
                                                    Ext ext2 = statRequest.getExt();
                                                    String json2 = JsonMapper.f().toJson(ext2);
                                                    dVar.u(ext2.getUid() + "");
                                                    dVar.l(json2);
                                                }
                                            } else {
                                                StatJsonRawData statJsonRawData = new StatJsonRawData();
                                                statJsonRawData.setGameId(statRequest.getData().getGameId());
                                                statJsonRawData.setInterrupt(statRequest.getExt().getInterrupt());
                                                statJsonRawData.setDuration(statRequest.getExt().getDuration());
                                                statJsonRawData.setZipCost(statRequest.getExt().getZipCost());
                                                statJsonRawData.setUid(statRequest.getExt().getUid());
                                                statJsonRawData.setWhere(statRequest.getData().getWhere());
                                                statJsonRawData.setArticleId(statRequest.getExt().getArticleId());
                                                statJsonRawData.setFrom(statRequest.getExt().getFrom());
                                                statJsonRawData.setPosition(statRequest.getExt().getPosition());
                                                statJsonRawData.setGameFlag(statRequest.getExt().getGameFlag());
                                                statJsonRawData.setDataFlag(statRequest.getExt().getDataFlag());
                                                dVar.u(statRequest.getExt().getUid() + "");
                                                dVar.l(JsonMapper.e().toJson(statJsonRawData));
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        dVar.l(JsonMapper.e().toJson(statRequest));
                    }
                } else {
                    dVar.l(JsonMapper.f().toJson(statRequest));
                }
                dVar.s(statRequest.getTime() + "");
                dVar.k(k.a(this.f58860d));
                dVar.n(k.c(this.f58860d));
                dVar.u(statRequest.getUid() + "");
                if (dVar.j() == null || dVar.j().equals("") || dVar.j().equals("0")) {
                    dVar.u(statRequest.getExt().getUid() + "");
                }
                this.f58859c.r(dVar);
                try {
                    t(this.f58860d, this.f58859c.n(type, dVar.i()));
                    return;
                } catch (Exception e5) {
                    e5.printStackTrace();
                    return;
                }
            }
            com.papa.sim.statistic.db.a aVar = new com.papa.sim.statistic.db.a();
            aVar.n(statRequest.getEvent());
            aVar.i(statRequest.getData().getWhere());
            aVar.j(statRequest.getData().getLocation());
            aVar.m(statRequest.getTime() + "");
            aVar.h(k.a(this.f58860d));
            aVar.k(k.c(this.f58860d));
            this.f58859c.t(aVar);
            return;
        }
        com.papa.sim.statistic.db.a aVar2 = new com.papa.sim.statistic.db.a();
        aVar2.n(statRequest.getEvent());
        if (aVar2.getType().equals(event2.name())) {
            this.f58859c.c(event2);
        }
        aVar2.i(statRequest.getData().getLocation() + "");
        aVar2.m(statRequest.getTime() + "");
        aVar2.h(k.a(this.f58860d));
        aVar2.k(k.c(this.f58860d));
        this.f58859c.t(aVar2);
    }

    public static void v(String str) {
        if (str != null) {
            f58848k.remove(str);
        }
    }

    public void A(Event event, Ext ext, String str) {
        StatRequest statRequest = new StatRequest();
        statRequest.setEvent(event.name());
        statRequest.setTime(System.currentTimeMillis());
        if (str != null || !str.equals("")) {
            try {
                statRequest.setUid(Integer.parseInt(str));
                ext.setUid(Integer.parseInt(str));
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
        statRequest.setExt(ext);
        u0(statRequest);
    }

    public void B(Event event, StatRequest statRequest) {
        if (!event.name().equals(Event.indexGameStart.name()) && !event.name().equals(Event.clickIndexAdEvent.name()) && !event.name().equals(Event.visitIndexAdEvent.name()) && !event.name().equals(Event.gameRequest.name()) && !event.name().equals(Event.gameDownload.name()) && !event.name().equals(Event.startDownloadPlug.name()) && !event.name().equals(Event.downloadPlugCompleted.name()) && !event.name().equals(Event.installPlugCompleted.name()) && !event.name().equals(Event.gameOut.name()) && !event.name().equals(Event.startLocalNetBattleSuccessEmu.name()) && !event.name().equals(Event.endLocalNetBattleSuccessEmu.name()) && !event.name().equals(Event.netBattleMatchFinish.name()) && !event.name().equals(Event.netBattleMatchStart.name()) && !event.name().equals(Event.startShare.name()) && !event.name().equals(Event.shareChannel.name()) && !event.name().equals(Event.shareResult.name()) && !event.name().equals(Event.f2fRequestCreateQrcode.name()) && !event.name().equals(Event.f2fCreateQrcodeSuccess.name()) && !event.name().equals(Event.liveResDownloaded.name()) && !event.name().equals(Event.clickVsBtn.name()) && !event.name().equals(Event.clickVsHallBtn.name()) && !event.name().equals(Event.visitVsRoomPage.name()) && !event.name().equals(Event.visitVsMainPage.name()) && !event.name().equals(Event.clickVsForumBtn.name()) && !event.name().equals(Event.clickVsAdvBtn.name()) && !event.name().equals(Event.clickVsCreateRoom.name()) && !event.name().equals(Event.clickVsQuickJoin.name()) && !event.name().equals(Event.VsCreateWaitOver.name()) && !event.name().equals(Event.VsGameOverSuccess.name()) && !event.name().equals(Event.VsSelectSilentBtn.name()) && !event.name().equals(Event.VsCreateSilentRoom.name()) && !event.name().equals(Event.VsSilentTransform.name()) && !event.name().equals(Event.clickVsLocalBat.name()) && !event.name().equals(Event.clickVsNetBattleMatch.name()) && !event.name().equals(Event.f2fRequestScanQrcode.name()) && !event.name().equals(Event.f2fConnectQrcodeSuccess.name()) && !event.name().equals(Event.sharePasteClick.name()) && !event.name().equals(Event.f2fRequestTransferGame.name()) && !event.name().equals(Event.f2fTransferGameDone.name()) && !event.name().equals(Event.f2fInterruptTransferGame.name()) && !event.name().equals(Event.visitAppInternalPage.name()) && !event.name().equals(Event.arenaGameList.name()) && !event.name().equals(Event.arenaGameListBanner.name()) && !event.name().equals(Event.arenaGameListItem.name()) && !event.name().equals(Event.areaRoomFromInvite.name()) && !event.name().equals(Event.onMainPageShow.name()) && !event.name().equals(Event.requestEvent.name()) && !event.name().equals(Event.clickButtonEvent.name()) && !event.name().equals(Event.clickHomePageEvent.name()) && !event.name().equals(Event.clickShopHomeEvent.name()) && !event.name().equals(Event.findButtonEvent.name()) && !event.name().equals(Event.startStoreArchive.name()) && !event.name().equals(Event.startMeArchive.name()) && !event.name().equals(Event.makeStoreArchive.name()) && !event.name().equals(Event.downloadCloudArchive.name()) && !event.name().equals(Event.backupLocalArchive.name()) && !event.name().equals(Event.shareArchive.name()) && !event.name().equals(Event.startArchiveManagement.name()) && !event.name().equals(Event.md5error.name()) && !event.name().equals(Event.filenumerror.name()) && !event.name().equals(Event.visitGamePage.name()) && !event.name().equals(Event.clickGameDetailModel.name()) && !event.name().equals(Event.enterUserGameList.name()) && !event.name().equals(Event.clickSearchAdPosition.name()) && !event.name().equals(Event.downloadFromSearchResult.name()) && !event.name().equals(Event.clickDetailFromSearchResult.name()) && !event.name().equals(Event.showCopyright.name()) && !event.name().equals(Event.closeCopyright.name()) && !event.name().equals(Event.downloadCopyright.name()) && !event.name().equals(Event.openSourceUrl.name()) && !event.name().equals(Event.smallGameStartSDK.name()) && !event.name().equals(Event.smallRequestAdSDK.name()) && !event.name().equals(Event.smallExpAdSDK.name()) && !event.name().equals(Event.smallVideoDoneAdSDK.name())) {
            String name = event.name();
            Event event2 = Event.homeSuccessUpRedBag;
            if (!name.equals(event2.name())) {
                String name2 = event.name();
                Event event3 = Event.tabStartSuccessUpRedBag;
                if (!name2.equals(event3.name())) {
                    String name3 = event.name();
                    Event event4 = Event.quitSingleSuccessUpRedBag;
                    if (!name3.equals(event4.name())) {
                        String name4 = event.name();
                        Event event5 = Event.tabStartViewSuccessTips;
                        if (!name4.equals(event5.name())) {
                            String name5 = event.name();
                            Event event6 = Event.clickTabGameTipsUpRedBag;
                            if (!name5.equals(event6.name())) {
                                String name6 = event.name();
                                Event event7 = Event.clickOpenPopUpRedBag;
                                if (!name6.equals(event7.name()) && !event.name().equals(Event.listShowBigPicUPPage.name()) && !event.name().equals(Event.listShowIconHotList.name()) && !event.name().equals(Event.listClickBigPicStaus.name()) && !event.name().equals(Event.listClickIconStatus.name()) && !event.name().equals(Event.listClickBigPicSlideUPDown.name()) && !event.name().equals(Event.listClickIconSlideUPDown.name()) && !event.name().equals(Event.gameClickBigModelGet.name()) && !event.name().equals(Event.gameClickBigPicGoDetail.name()) && !event.name().equals(Event.gameClickIconModelClick.name()) && !event.name().equals(Event.game_strategy_panel.name()) && !event.name().equals(Event.gameClickBigPicGoWYDetail.name()) && !event.name().equals(Event.gameClickIconModelWYClick.name()) && !event.name().equals(event2.name()) && !event.name().equals(event3.name()) && !event.name().equals(event4.name()) && !event.name().equals(event5.name()) && !event.name().equals(event6.name()) && !event.name().equals(event7.name()) && !event.name().equals(Event.speedDownQkExp.name()) && !event.name().equals(Event.clickSpeedDownQkButton.name()) && !event.name().equals(Event.installTipsQkExp.name()) && !event.name().equals(Event.clickInstallQkButton.name()) && !event.name().equals(Event.installSuccessQk.name()) && !event.name().equals(Event.clickSpeedDownUpQk.name()) && !event.name().equals(Event.installAndroidCompleted.name()) && !event.name().equals(Event.gameDownload.name())) {
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        u0(statRequest);
    }

    void C(Event event, Where where) {
        StatRequest statRequest = new StatRequest();
        statRequest.setEvent(event.name());
        statRequest.setTime(System.currentTimeMillis());
        Data data = new Data();
        data.setWhere(where.name());
        statRequest.setData(data);
        u0(statRequest);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void D(Event event, Where where, String str) {
        StatRequest statRequest = new StatRequest();
        statRequest.setEvent(event.name());
        statRequest.setTime(System.currentTimeMillis());
        Data data = new Data();
        data.setWhere(where.name());
        if (str != null && !str.equals("")) {
            try {
                statRequest.setUid(Integer.parseInt(str));
                statRequest.getExt().setUid(Integer.parseInt(str));
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
        statRequest.setData(data);
        u0(statRequest);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void E(Event event, String str) {
        StatRequest statRequest = new StatRequest();
        statRequest.setEvent(event.name());
        statRequest.setTime(System.currentTimeMillis());
        Data data = new Data();
        String name = event.name();
        Event event2 = Event.gameWorldData;
        if (name.equals(event2.name())) {
            statRequest.setData(data);
            u0(statRequest);
            return;
        }
        str = (str == null || str.equals("")) ? "0" : "0";
        try {
            if (event.name().equals(Event.installPlugCompleted.name())) {
                data.setPlugId(Integer.parseInt(str));
            }
            if (event.name().equals(Event.startApp.name())) {
                data.setLocation(str);
            } else if (event.name().equals(event2.name())) {
                data.setModel(str);
            } else {
                if (!event.name().equals(Event.joyStickConfigPost.name()) && !event.name().equals(Event.joyStickInfoPost.name())) {
                    if (event.name().equals(Event.submitPost.name())) {
                        statRequest.getExt().setUid(Integer.parseInt(str));
                    } else if (!str.equals("")) {
                        data.setGameId(Long.parseLong(str));
                    }
                }
                data.setLocation(str);
            }
        } catch (Exception unused) {
            data.setGameId(0L);
        }
        statRequest.setData(data);
        try {
            u0(statRequest);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void F(Event event, String str, int i4, int i5) {
        StatRequest statRequest = new StatRequest();
        statRequest.setUid(Integer.parseInt(str));
        statRequest.getExt().setUid(Integer.parseInt(str));
        Ext ext = statRequest.getExt();
        ext.setEmuCount(i4 + "");
        statRequest.getExt().setApkCount(i5);
        statRequest.setTime(System.currentTimeMillis());
        com.papa.sim.statistic.db.d dVar = new com.papa.sim.statistic.db.d();
        dVar.t(event.name());
        dVar.s(System.currentTimeMillis() + "");
        dVar.k(k.a(this.f58860d));
        dVar.n(k.c(this.f58860d));
        dVar.u(statRequest.getUid() + "");
        dVar.l(JsonMapper.e().toJson(statRequest));
        this.f58859c.r(dVar);
        try {
            t(this.f58860d, this.f58859c.n(event.name(), dVar.i()));
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void G(Event event, String str, long j4, int i4, String str2) {
        StatRequest statRequest = new StatRequest();
        statRequest.setEvent(event.name());
        statRequest.setTime(System.currentTimeMillis());
        if (str2 != null || !str2.equals("")) {
            try {
                statRequest.setUid(Integer.parseInt(str2));
                statRequest.getExt().setUid(Integer.parseInt(str2));
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
        Ext ext = statRequest.getExt();
        Data data = new Data();
        try {
            data.setGameId(Long.parseLong(str));
            ext.setUid(Integer.parseInt(str2));
        } catch (Exception unused) {
        }
        ext.setDuration(j4);
        ext.setInterrupt(i4);
        statRequest.setExt(ext);
        statRequest.setData(data);
        u0(statRequest);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void H(Event event, String str, long j4, String str2) {
        StatRequest statRequest = new StatRequest();
        statRequest.setEvent(event.name());
        statRequest.setTime(System.currentTimeMillis());
        Data data = new Data();
        try {
            data.setGameId(Long.parseLong(str));
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        try {
            statRequest.getExt().setUid(Integer.parseInt(str2));
        } catch (Exception unused) {
        }
        statRequest.getExt().setDuration(j4);
        data.setUid(str2);
        statRequest.setData(data);
        u0(statRequest);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void I(Event event, String str, long j4, String str2, String str3) {
        StatRequest statRequest = new StatRequest();
        statRequest.setEvent(event.name());
        statRequest.getExt().setArticleId(str3);
        statRequest.setTime(System.currentTimeMillis());
        Data data = new Data();
        try {
            data.setGameId(Long.parseLong(str));
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        try {
            statRequest.getExt().setUid(Integer.parseInt(str2));
        } catch (Exception unused) {
        }
        statRequest.getExt().setDuration(j4);
        data.setUid(str2);
        statRequest.setData(data);
        u0(statRequest);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void J(Event event, String str, String str2) {
        m0(event, str, str2, 0, "");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void K(Event event, String str, String str2, int i4) {
        StatRequest statRequest = new StatRequest();
        statRequest.setEvent(event.name());
        statRequest.setTime(System.currentTimeMillis());
        Data data = new Data();
        if (str2 != null && !str2.equals("")) {
            try {
                statRequest.setUid(Integer.parseInt(str2));
                statRequest.getExt().setUid(Integer.parseInt(str2));
                Ext ext = statRequest.getExt();
                ext.setFrom(i4 + "");
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
        try {
            data.setGameId(Long.parseLong(str));
        } catch (Exception unused) {
            data.setGameId(0L);
        }
        statRequest.setData(data);
        u0(statRequest);
    }

    public void L(Event event, String str, String str2, int i4, String str3) {
        StatRequest statRequest = new StatRequest();
        statRequest.setUid(Integer.parseInt(str2));
        try {
            statRequest.getData().setGameId(Long.parseLong(str));
            statRequest.getExt().setPlugVersion(str3);
            statRequest.getExt().setUid(Integer.parseInt(str2));
        } catch (Exception unused) {
        }
        String str4 = "local";
        if (event.name().equals("clickLocalNetBattleJoinRoomBtn") || event.name().equals("joinLocalNetBattleRoomSuccess")) {
            str4 = i4 == 2 ? "qrcode" : "default";
        } else if (event.name().equals("inviteBattleShareSuccess")) {
            str4 = i4 == 1 ? "weixin" : "qq";
        } else if (i4 == 7) {
            str4 = "netMatch";
        } else if (i4 == 2) {
            str4 = "inviteMatch";
        } else if (i4 != 3) {
            if (i4 == 9) {
                str4 = "multiBattle";
            } else if (i4 == 10) {
                str4 = "fastStart";
            }
        }
        statRequest.getExt().setMode(str4);
        statRequest.getExt().setUid(statRequest.getUid());
        com.papa.sim.statistic.db.d dVar = new com.papa.sim.statistic.db.d();
        dVar.t(event.name());
        dVar.s(System.currentTimeMillis() + "");
        dVar.k(k.a(this.f58860d));
        dVar.n(k.c(this.f58860d));
        dVar.u(statRequest.getUid() + "");
        dVar.l(JsonMapper.e().toJson(statRequest));
        this.f58859c.r(dVar);
        try {
            t(this.f58860d, this.f58859c.n(event.name(), dVar.i()));
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void M(Event event, String str, String str2, long j4, int i4, String str3, long j5, int i5, int i6, int i7, String str4) {
        StatRequest statRequest = new StatRequest();
        statRequest.setEvent(event.name());
        statRequest.setTime(System.currentTimeMillis());
        if (str3 != null || !str3.equals("")) {
            try {
                statRequest.setUid(Integer.parseInt(str3));
                statRequest.getExt().setUid(Integer.parseInt(str3));
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
        Ext ext = statRequest.getExt();
        Data data = new Data();
        try {
            data.setGameId(Long.parseLong(str));
            ext.setUid(Integer.parseInt(str3));
        } catch (Exception unused) {
        }
        ext.setZipCost(j5);
        ext.setDuration(j4);
        ext.setInterrupt(i4);
        ext.setFrom(i5 + "");
        ext.setKeyWord(str2 + "");
        if (i5 == 101) {
            ext.setPosition(i6 + "");
        }
        ext.setGameFlag(i7);
        ext.setDataFlag(str4);
        statRequest.setExt(ext);
        statRequest.setData(data);
        u0(statRequest);
    }

    public void N(Event event, String str, String str2, long j4, int i4, String str3, String str4, long j5, int i5, int i6, int i7, String str5) {
        StatRequest statRequest = new StatRequest();
        statRequest.setEvent(event.name());
        statRequest.setTime(System.currentTimeMillis());
        if (str3 != null || !str3.equals("")) {
            try {
                statRequest.setUid(Integer.parseInt(str3));
                statRequest.getExt().setUid(Integer.parseInt(str3));
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
        Ext ext = statRequest.getExt();
        Data data = new Data();
        try {
            data.setGameId(Long.parseLong(str));
            ext.setUid(Integer.parseInt(str3));
        } catch (Exception unused) {
        }
        ext.setZipCost(j5);
        ext.setArticleId(str4);
        data.setWhere(str2);
        ext.setDuration(j4);
        ext.setInterrupt(i4);
        ext.setFrom(i5 + "");
        if (i5 == 101) {
            ext.setPosition(i6 + "");
        }
        ext.setGameFlag(i7);
        ext.setDataFlag(str5);
        statRequest.setExt(ext);
        statRequest.setData(data);
        u0(statRequest);
    }

    public void O(Event event, String str, String str2, Ext ext) {
        StatRequest statRequest = new StatRequest();
        statRequest.setEvent(event.name());
        statRequest.setTime(System.currentTimeMillis());
        statRequest.setExt(ext);
        if (str2 != null || !str2.equals("")) {
            try {
                statRequest.setUid(Integer.parseInt(str2));
                statRequest.getExt().setUid(Integer.parseInt(str2));
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
        Data data = new Data();
        try {
            data.setGameId(Long.parseLong(str));
            ext.setUid(Integer.parseInt(str2));
        } catch (Exception unused) {
        }
        data.setWhere(ext.getKeyWord());
        statRequest.setData(data);
        u0(statRequest);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void P(Event event, String str, String str2, String str3) {
        StatRequest statRequest = new StatRequest();
        statRequest.setEvent(event.name());
        statRequest.setTime(System.currentTimeMillis());
        try {
            statRequest.setUid(Integer.parseInt(str3));
        } catch (Exception unused) {
        }
        if (!event.name().equals(Event.appPageClick.name()) && !event.name().equals(Event.appPageDownload.name())) {
            if (!event.name().equals(Event.plugEfficiency.name()) && !event.name().equals(Event.pluginPlayTime.name())) {
                Data data = new Data();
                try {
                    data.setGameId(Long.parseLong((str2 == null || str2.isEmpty()) ? "0" : "0"));
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
                if (str3 != null && !str3.equals("")) {
                    try {
                        statRequest.setUid(Integer.parseInt(str3));
                        statRequest.getExt().setUid(Integer.parseInt(str3));
                    } catch (Exception e6) {
                        e6.printStackTrace();
                    }
                }
                data.setWhere(str);
                statRequest.setData(data);
            } else {
                try {
                    Data data2 = new Data();
                    try {
                        data2.setGameId(Long.parseLong(str));
                        data2.setWhere(str2);
                    } catch (Exception e7) {
                        e7.printStackTrace();
                    }
                    statRequest.setUid(Integer.parseInt(str3));
                    statRequest.setData(data2);
                } catch (Exception e8) {
                    e8.printStackTrace();
                }
            }
        } else {
            statRequest.getExt().setPage(str);
            statRequest.getExt().setUid(Integer.parseInt(str3));
            statRequest.getExt().setPosition(str2);
        }
        u0(statRequest);
    }

    public void Q(Event event, String str, String str2, String str3, long j4, int i4, String str4, long j5, int i5) {
        StatRequest statRequest = new StatRequest();
        statRequest.setEvent(event.name());
        statRequest.setTime(System.currentTimeMillis());
        if (str4 != null || !str4.equals("")) {
            try {
                statRequest.setUid(Integer.parseInt(str4));
                statRequest.getExt().setUid(Integer.parseInt(str4));
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
        Ext ext = statRequest.getExt();
        Data data = new Data();
        try {
            data.setGameId(Long.parseLong(str));
            ext.setUid(Integer.parseInt(str4));
        } catch (Exception unused) {
        }
        ext.setZipCost(j5);
        ext.setArticleId(str2);
        data.setWhere(str3);
        ext.setDuration(j4);
        ext.setInterrupt(i4);
        ext.setGameFlag(i5);
        statRequest.setExt(ext);
        statRequest.setData(data);
        u0(statRequest);
    }

    public void R(Event event, String str, String str2, String str3, String str4, String str5) {
        StatRequest statRequest = new StatRequest();
        try {
            statRequest.setUid(Integer.parseInt(str5));
        } catch (Exception unused) {
        }
        statRequest.getExt().setFrom(str);
        statRequest.getExt().setPosition(str2);
        statRequest.getExt().setPage(str3);
        statRequest.getExt().setModule(str4);
        com.papa.sim.statistic.db.d dVar = new com.papa.sim.statistic.db.d();
        dVar.t(event.name());
        dVar.s(System.currentTimeMillis() + "");
        dVar.k(k.a(this.f58860d));
        dVar.n(k.c(this.f58860d));
        dVar.u(statRequest.getUid() + "");
        dVar.l(JsonMapper.e().toJson(statRequest));
        this.f58859c.r(dVar);
        try {
            t(this.f58860d, this.f58859c.n(event.name(), dVar.i()));
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void S(String str, Ext ext) {
        StatRequest statRequest = new StatRequest();
        statRequest.setEvent(str);
        statRequest.setTime(System.currentTimeMillis());
        statRequest.setNew(true);
        Data data = new Data();
        statRequest.setExt(ext);
        statRequest.setData(data);
        try {
            u0(statRequest);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void T(String str, Ext ext, Data data) {
        StatRequest statRequest = new StatRequest();
        statRequest.setEvent(str);
        statRequest.setTime(System.currentTimeMillis());
        statRequest.setRequest(true);
        statRequest.setExt(ext);
        statRequest.setData(data);
        try {
            u0(statRequest);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void U(String str, Ext ext, String str2) {
        StatRequest statRequest = new StatRequest();
        statRequest.setEvent(str);
        statRequest.setTime(System.currentTimeMillis());
        statRequest.setNew(true);
        Data data = new Data();
        data.setWhere(str2);
        statRequest.setExt(ext);
        statRequest.setData(data);
        try {
            u0(statRequest);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void V(String str, String str2, String str3) {
        StatRequest statRequest = new StatRequest();
        statRequest.setEvent(str);
        statRequest.setTime(System.currentTimeMillis());
        if (str3 != null || !str3.equals("")) {
            try {
                statRequest.setUid(Integer.parseInt(str3));
                statRequest.getExt().setUid(Integer.parseInt(str3));
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
        Data data = new Data();
        try {
            data.setGameId(Long.parseLong((str2 == null || str2.equals("")) ? "0" : "0"));
        } catch (Exception unused) {
            data.setGameId(0L);
        }
        statRequest.setData(data);
        try {
            u0(statRequest);
        } catch (Exception e6) {
            e6.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void W(String str, String str2) {
        StatRequest statRequest = new StatRequest();
        statRequest.setEvent(str);
        statRequest.setTime(System.currentTimeMillis());
        if (str2 != null || !str2.equals("")) {
            try {
                statRequest.setUid(Integer.parseInt(str2));
                statRequest.getExt().setUid(Integer.parseInt(str2));
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
        Data data = new Data();
        Ext ext = statRequest.getExt();
        ext.setUid(Integer.parseInt(str2));
        statRequest.setExt(ext);
        statRequest.setData(data);
        try {
            u0(statRequest);
        } catch (Exception e6) {
            e6.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void X(String str, String str2, String str3) {
        StatRequest statRequest = new StatRequest();
        statRequest.setEvent(str);
        statRequest.setTime(System.currentTimeMillis());
        if (str2 != null || !str2.equals("")) {
            try {
                statRequest.setUid(Integer.parseInt(str2));
                statRequest.getExt().setUid(Integer.parseInt(str2));
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
        Data data = new Data();
        Ext ext = statRequest.getExt();
        ext.setUid(Integer.parseInt(str2));
        ext.setBtn(str3);
        statRequest.setExt(ext);
        statRequest.setData(data);
        try {
            u0(statRequest);
        } catch (Exception e6) {
            e6.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Y(String str, String str2, String str3, String str4, String str5, String str6) {
        StatRequest statRequest = new StatRequest();
        statRequest.setEvent(str);
        statRequest.setTime(System.currentTimeMillis());
        if (str2 != null || !str2.equals("")) {
            try {
                statRequest.setUid(Integer.parseInt(str2));
                statRequest.getExt().setUid(Integer.parseInt(str2));
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
        Data data = new Data();
        Ext ext = statRequest.getExt();
        str3 = (str3 == null || str3.equals("")) ? "0" : "0";
        ext.setUid(Integer.parseInt(str2));
        ext.setGameId(str3);
        ext.setBtn(str4);
        ext.setPosition(str5);
        ext.setPicName(str6);
        statRequest.setExt(ext);
        statRequest.setData(data);
        try {
            u0(statRequest);
        } catch (Exception e6) {
            e6.printStackTrace();
        }
    }

    public void a0(Context context, List<com.papa.sim.statistic.db.d> list) {
        ArrayList arrayList = new ArrayList();
        for (com.papa.sim.statistic.db.d dVar : list) {
            StringBuilder sb = new StringBuilder();
            sb.append("sendAllPlugPlayData: ");
            sb.append(JsonMapper.toJsonString(dVar));
            StatRequest h4 = h(context, dVar);
            if (h4.getUid() == 0 || h4.getExt().getUid() == 0) {
                try {
                    h4.setUid(Integer.parseInt(p.l(context).n().a(context)));
                    h4.getExt().setUid(Integer.parseInt(p.l(context).n().a(context)));
                } catch (Exception unused) {
                }
            }
            arrayList.add(h4);
        }
        if (arrayList.size() > 0) {
            com.papa.sim.statistic.http.c c5 = com.papa.sim.statistic.http.c.c();
            c5.h(context, f58852o + "/simulator/simulator_play_game_log", ((StatRequest) arrayList.get(0)).getExt().getArticleId(), new f(list), arrayList);
        }
    }

    public void b0(StatDataCenterReq statDataCenterReq) {
        try {
            statDataCenterReq.setNettype(n(this.f58860d));
            statDataCenterReq.setCarrier(k(this.f58860d) + "");
            String jsonString = JsonMapper.toJsonString(statDataCenterReq);
            if (j(jsonString, statDataCenterReq.getDid()).equals("-1")) {
                com.papa.sim.statistic.db.d dVar = new com.papa.sim.statistic.db.d();
                dVar.t(statDataCenterReq.getEvent());
                dVar.l(jsonString);
                dVar.s(statDataCenterReq.getGame_time() + "");
                dVar.p(1);
                if (this.f58859c.n(statDataCenterReq.getEvent(), dVar.i()) == null) {
                    this.f58859c.r(dVar);
                }
            }
        } catch (Exception unused) {
        }
    }

    public boolean c0(com.papa.sim.statistic.db.a aVar) {
        try {
            if (aVar.getType().equals(Event.setemuerror.name())) {
                EmuErrorDto emuErrorDto = (EmuErrorDto) JsonMapper.e().fromJson(aVar.b(), EmuErrorDto.class);
                if (emuErrorDto == null) {
                    return false;
                }
                DefaultHttpClient defaultHttpClient = new DefaultHttpClient();
                HttpPost httpPost = new HttpPost(f58849l + "/add/commitpluginerrorinfo");
                httpPost.addHeader("Content-Type", HttpHeaders.Values.APPLICATION_JSON);
                s.f(this.f58860d);
                String b5 = s.f(this.f58860d).b();
                String g4 = s.f(this.f58860d).g();
                WifiInfo connectionInfo = ((WifiManager) this.f58860d.getApplicationContext().getSystemService(NetworkUtil.NETWORK_TYPE_WIFI)).getConnectionInfo();
                if (b5 == null || b5.equals("")) {
                    b5 = j.a(g4);
                }
                String str = b5;
                String a5 = j.a(str + "gzRN53VWRF9BYUXomg2014");
                String[] r4 = s.f(this.f58860d).r();
                emuErrorDto.setModel(Build.MODEL);
                emuErrorDto.setMac(g4.replaceAll(":", "_"));
                emuErrorDto.setIp(p(connectionInfo.getIpAddress()));
                emuErrorDto.setTimes((Long.parseLong(aVar.f()) / 1000) + "");
                String json = JsonMapper.e().toJson(new ErrorRequestBean(r4[0] + "_" + r4[1], str, "add", a5, new ErrorRequestMessage("commitPluginErrorInfo", emuErrorDto)));
                StringBuilder sb = new StringBuilder();
                sb.append("paramsJson=");
                sb.append(json);
                httpPost.setEntity(new StringEntity(json));
                HttpResponse execute = defaultHttpClient.execute(httpPost);
                if (execute.getStatusLine().getStatusCode() == 200) {
                    ResultMainBean resultMainBean = (ResultMainBean) JsonMapper.e().fromJson(EntityUtils.toString(execute.getEntity()), ResultMainBean.class);
                    if (resultMainBean != null) {
                        resultMainBean.getFlag();
                    }
                }
            }
            return true;
        } catch (UnknownHostException e5) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(e5.getClass().getName());
            sb2.append(":");
            sb2.append(e5.getMessage());
            return false;
        } catch (Exception e6) {
            e6.printStackTrace();
            return false;
        }
    }

    public void d0(Event event, String str, String str2) {
        StatRequest statRequest = new StatRequest();
        try {
            statRequest.setUid(Integer.parseInt(str2));
            statRequest.getData().setGameId(Long.parseLong(str));
            statRequest.getExt().setUid(Integer.parseInt(str2));
        } catch (Exception unused) {
        }
        statRequest.getExt().setPlugVersion(p.f58882h);
        com.papa.sim.statistic.db.d dVar = new com.papa.sim.statistic.db.d();
        dVar.t(event.name());
        dVar.s(System.currentTimeMillis() + "");
        dVar.k(k.a(this.f58860d));
        dVar.n(k.c(this.f58860d));
        dVar.u(statRequest.getUid() + "");
        dVar.l(JsonMapper.e().toJson(statRequest));
        this.f58859c.r(dVar);
        try {
            t(this.f58860d, this.f58859c.n(event.name(), dVar.i()));
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void e0(Event event, String str, String str2, String str3) {
        StatRequest statRequest = new StatRequest();
        statRequest.setUid(Integer.parseInt(str2));
        statRequest.setTime(System.currentTimeMillis());
        try {
            statRequest.getData().setGameId(Long.parseLong(str));
        } catch (Exception unused) {
        }
        statRequest.getExt().setUid(Integer.parseInt(str2));
        statRequest.getExt().setPlugVersion(str3);
        com.papa.sim.statistic.db.d dVar = new com.papa.sim.statistic.db.d();
        dVar.t(event.name());
        dVar.s(System.currentTimeMillis() + "");
        dVar.k(k.a(this.f58860d));
        dVar.n(k.c(this.f58860d));
        dVar.u(statRequest.getUid() + "");
        dVar.l(JsonMapper.e().toJson(statRequest));
        this.f58859c.r(dVar);
        try {
            t(this.f58860d, this.f58859c.n(event.name(), dVar.i()));
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f0(String str, Ext ext, String str2) {
        StatRequest statRequest = new StatRequest();
        statRequest.setEvent(str);
        statRequest.setTime(System.currentTimeMillis());
        Data data = new Data();
        if (!TextUtils.isEmpty(str2)) {
            data.setGameId(Long.parseLong(str2));
        }
        statRequest.setExt(ext);
        if (ext != null && !TextUtils.isEmpty(ext.getWhere())) {
            statRequest.getData().setWhere(ext.getWhere());
        }
        statRequest.setData(data);
        try {
            u0(statRequest);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g0(String str, String str2, String str3) {
        StatRequest statRequest = new StatRequest();
        statRequest.setEvent(str);
        statRequest.setTime(System.currentTimeMillis());
        Ext ext = new Ext();
        ext.setPage(str3);
        statRequest.setExt(ext);
        Data data = new Data();
        data.setWhere(str2);
        statRequest.setData(data);
        try {
            u0(statRequest);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h0(String str, Ext ext) {
        StatRequest statRequest = new StatRequest();
        statRequest.setEvent(str);
        statRequest.setTime(System.currentTimeMillis());
        statRequest.setExt(ext);
        statRequest.setData(new Data());
        try {
            u0(statRequest);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void i(StatRequest statRequest) {
        this.f58859c.delete(statRequest.getId());
        StringBuilder sb = new StringBuilder();
        sb.append("发送成功之后删除数据 deleStat ");
        sb.append(statRequest.getEvent());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i0(String str, Ext ext) {
        StatRequest statRequest = new StatRequest();
        statRequest.setEvent(str);
        statRequest.setTime(System.currentTimeMillis());
        statRequest.setNew(true);
        statRequest.setExt(ext);
        statRequest.setData(new Data());
        try {
            u0(statRequest);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j0(StatRequest statRequest) {
        try {
            u0(statRequest);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public int k(Context context) {
        String simOperator = ((TelephonyManager) context.getSystemService("phone")).getSimOperator();
        if (simOperator == null) {
            return 0;
        }
        if (simOperator.equals("46000") || simOperator.equals("46002")) {
            return 2;
        }
        if (simOperator.equals("46001")) {
            return 3;
        }
        return simOperator.equals("46003") ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k0(Event event, String str, String str2, int i4) {
        m0(event, str, str2, i4, "");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l0(Event event, String str, String str2, int i4, StatRequest statRequest) {
        statRequest.setEvent(event.name());
        statRequest.setTime(System.currentTimeMillis());
        statRequest.getExt().setGameFlag(i4);
        if (event.name().equals(Event.gameList.name())) {
            statRequest.setUid(Integer.parseInt(str2));
            statRequest.getExt().setUid(statRequest.getUid());
            statRequest.getExt().setGameList(str);
            u0(statRequest);
            return;
        }
        Data data = new Data();
        if (!event.name().equals(Event.setpapaerror.name()) && !event.name().equals(Event.setemuerror.name())) {
            if (str2 != null && !str2.equals("")) {
                try {
                    statRequest.setUid(Integer.parseInt(str2));
                    statRequest.getExt().setUid(Integer.parseInt(str2));
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
            if (!event.name().equals(Event.gameStart.name())) {
                String name = event.name();
                Event event2 = Event.startLocalNetBattleSuccess;
                if (!name.equals(event2.name()) && !event.name().equals(Event.gameDownload.name()) && !event.name().equals(Event.clickLocalNetBattleStartBtn.name()) && !event.name().equals(Event.createLocalNetBattleRoomSuccess.name()) && !event.name().equals(Event.joinLocalNetBattleRoomSuccess.name()) && !event.name().equals(Event.clickCreateLocalNetBattleRoomBtn.name()) && !event.name().equals(Event.clickLocalNetBattleJoinRoomBtn.name()) && !event.name().equals(Event.clickLocalNetBattleRoomStartBtn.name()) && !event.name().equals(Event.visitGamePage.name()) && !event.name().equals(event2.name()) && !event.name().equals(Event.netBattleMatchStart.name()) && !event.name().equals(Event.netBattleMatchFinish.name()) && !event.name().equals(Event.gameRequest.name()) && !event.name().equals(Event.gameRemove.name()) && !event.name().equals(Event.downloadStop.name()) && !event.name().equals(Event.gameRemove1.name()) && !event.name().equals(Event.gameRemove2.name()) && !event.name().equals(Event.unzipFailed.name()) && !event.name().equals(Event.unzipIndexFailed.name()) && !event.name().equals(Event.unzipIOFailed.name()) && !event.name().equals(Event.gameUnzip.name()) && !event.name().equals(Event.installAndroidCompleted.name()) && !event.name().equals(Event.netMatchBtnClick.name()) && !event.name().equals(Event.inviteBattleAutoJoinSuccess.name()) && !event.name().equals(Event.VMGameStart.name()) && !event.name().equals(Event.VMGameStartAfterStatus.name())) {
                    if (event.name().equals(Event.appUseTime.name())) {
                        data.setLocation(str);
                    } else if (event.name().equals(Event.netBattleMatchEfficiency.name())) {
                        data.setLocation(str);
                    } else if (!event.name().equals(Event.joyStickInfoPost.name()) && !event.name().equals(Event.joyStickConfigPost.name())) {
                        if (!event.name().equals(Event.startDownloadPlug.name()) && !event.name().equals(Event.downloadPlugCompleted.name())) {
                            if (event.name().equals(Event.appPageVisit.name())) {
                                statRequest.getExt().setPage(str);
                            }
                        } else {
                            try {
                                data.setPlugId(Integer.parseInt(str));
                            } catch (Exception unused) {
                            }
                        }
                    } else {
                        data.setLocation(str);
                    }
                }
            }
            try {
                data.setGameId(Long.parseLong(str));
            } catch (Exception unused2) {
                data.setGameId(0L);
            }
        } else {
            data.setWhere(str);
            data.setLocation(str2);
        }
        statRequest.setData(data);
        u0(statRequest);
    }

    void m0(Event event, String str, String str2, int i4, String str3) {
        n0(event, str, str2, i4, "", "");
    }

    public String n(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.getType() != 1 && activeNetworkInfo.getType() == 0) {
            int subtype = activeNetworkInfo.getSubtype();
            if (subtype == 4 || subtype == 1 || subtype == 2) {
                return NetworkUtil.NETWORK_CLASS_2G;
            }
            if (subtype == 3 || subtype == 8 || subtype == 6 || subtype == 5 || subtype == 12) {
                return NetworkUtil.NETWORK_CLASS_3G;
            }
            if (subtype == 13) {
                return NetworkUtil.NETWORK_CLASS_4G;
            }
        }
        return NetworkUtil.NETWORK_TYPE_WIFI;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void n0(Event event, String str, String str2, int i4, String str3, String str4) {
        StatRequest statRequest = new StatRequest();
        statRequest.setEvent(event.name());
        statRequest.setTime(System.currentTimeMillis());
        statRequest.getExt().setQkPosition(str4);
        statRequest.getExt().setGameFlag(i4);
        statRequest.getExt().setDataFlag(str3);
        if (event.name().equals(Event.gameList.name())) {
            statRequest.setUid(Integer.parseInt(str2));
            statRequest.getExt().setUid(statRequest.getUid());
            statRequest.getExt().setGameList(str);
            u0(statRequest);
            return;
        }
        Data data = new Data();
        if (!event.name().equals(Event.setpapaerror.name()) && !event.name().equals(Event.setemuerror.name())) {
            if (str2 != null && !str2.equals("")) {
                try {
                    statRequest.setUid(Integer.parseInt(str2));
                    statRequest.getExt().setUid(Integer.parseInt(str2));
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
            if (!event.name().equals(Event.gameStart.name())) {
                String name = event.name();
                Event event2 = Event.startLocalNetBattleSuccess;
                if (!name.equals(event2.name()) && !event.name().equals(Event.gameDownload.name()) && !event.name().equals(Event.clickLocalNetBattleStartBtn.name()) && !event.name().equals(Event.createLocalNetBattleRoomSuccess.name()) && !event.name().equals(Event.joinLocalNetBattleRoomSuccess.name()) && !event.name().equals(Event.clickCreateLocalNetBattleRoomBtn.name()) && !event.name().equals(Event.clickLocalNetBattleJoinRoomBtn.name()) && !event.name().equals(Event.clickLocalNetBattleRoomStartBtn.name()) && !event.name().equals(Event.visitGamePage.name()) && !event.name().equals(event2.name()) && !event.name().equals(Event.netBattleMatchStart.name()) && !event.name().equals(Event.netBattleMatchFinish.name()) && !event.name().equals(Event.gameRequest.name()) && !event.name().equals(Event.gameRemove.name()) && !event.name().equals(Event.downloadStop.name()) && !event.name().equals(Event.gameRemove1.name()) && !event.name().equals(Event.gameRemove2.name()) && !event.name().equals(Event.unzipFailed.name()) && !event.name().equals(Event.unzipIndexFailed.name()) && !event.name().equals(Event.unzipIOFailed.name()) && !event.name().equals(Event.gameUnzip.name()) && !event.name().equals(Event.installAndroidCompleted.name()) && !event.name().equals(Event.netMatchBtnClick.name()) && !event.name().equals(Event.inviteBattleAutoJoinSuccess.name()) && !event.name().equals(Event.VMGameStart.name()) && !event.name().equals(Event.VMGameStartAfterStatus.name())) {
                    if (event.name().equals(Event.appUseTime.name())) {
                        data.setLocation(str);
                    } else if (event.name().equals(Event.netBattleMatchEfficiency.name())) {
                        data.setLocation(str);
                    } else if (!event.name().equals(Event.joyStickInfoPost.name()) && !event.name().equals(Event.joyStickConfigPost.name())) {
                        if (!event.name().equals(Event.startDownloadPlug.name()) && !event.name().equals(Event.downloadPlugCompleted.name())) {
                            if (event.name().equals(Event.appPageVisit.name())) {
                                statRequest.getExt().setPage(str);
                            }
                        } else {
                            try {
                                data.setPlugId(Integer.parseInt(str));
                            } catch (Exception unused) {
                            }
                        }
                    } else {
                        data.setLocation(str);
                    }
                }
            }
            try {
                data.setGameId(Long.parseLong(str));
            } catch (Exception unused2) {
                data.setGameId(0L);
            }
        } else {
            data.setWhere(str);
            data.setLocation(str2);
        }
        statRequest.setData(data);
        u0(statRequest);
    }

    public int o(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null) {
            if (activeNetworkInfo.getType() == 1) {
                return 3;
            }
            if (activeNetworkInfo.getType() == 0) {
                return 2;
            }
        }
        return 1;
    }

    public void o0(g gVar) {
        this.f58861e = gVar;
    }

    public boolean q() {
        return this.f58864h;
    }

    public void q0(boolean z4) {
        this.f58864h = z4;
    }

    public boolean r() {
        return this.f58865i;
    }

    public void r0(boolean z4) {
        this.f58865i = z4;
    }

    public boolean s() {
        return this.f58866j;
    }

    public void s0(boolean z4) {
        this.f58866j = z4;
    }

    public void t(Context context, com.papa.sim.statistic.db.d dVar) {
        StatRequest h4;
        String b5;
        g();
        if (com.papa.sim.statistic.pref.b.k(context).s() || dVar == null || (h4 = h(context, dVar)) == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("thread[");
        sb.append(Thread.currentThread().getId());
        sb.append("] method offline() statRequest .id=");
        sb.append(h4.getId());
        sb.append(";event=");
        sb.append(h4.getEvent());
        sb.append(";isdirect=");
        sb.append(dVar.f());
        h4.setDebug(this.f58858b);
        if (h4.getExt() == null) {
            h4.setExt(new Ext());
        }
        if (this.f58861e != null) {
            h4.getData().setPageVersion(this.f58861e.b());
        }
        try {
            if (dVar.getType().equals(Event.netBattleMatchEfficiency.name())) {
                String str = f58849l + "/netbattle/performance";
                File file = new File(h4.getExt().getLogFile());
                if (file.exists()) {
                    com.papa.sim.statistic.http.c.c().d(str, file, new a(context, dVar));
                }
            } else if (dVar.getType().equals(Event.plugEfficiency.name())) {
                com.papa.sim.statistic.http.c.c().e(context, f58849l + "/plug_data", h4.getData().getGameId(), h4.getData().getWhere(), h4.getUid(), new b(dVar));
            } else if (dVar.getType().equals(Event.pluginPlayTime.name())) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(h4);
                com.papa.sim.statistic.http.c.c().h(context, f58852o + "/simulator/simulator_play_game_log", h4.getExt().getArticleId(), new c(dVar), arrayList);
            } else {
                if (h4.getUid() == 0 || h4.getExt().getUid() == 0) {
                    try {
                        h4.setUid(Integer.parseInt(p.l(context).n().a(context)));
                        h4.getExt().setUid(Integer.parseInt(p.l(context).n().a(context)));
                    } catch (Exception unused) {
                    }
                }
                if (!this.f58858b && !h4.getEvent().equals(Event.startApp.name()) && !h4.getEvent().equals(Event.gameDownload.name()) && !h4.getEvent().equals(Event.gameRequest.name()) && !h4.getEvent().equals(Event.gameStart.name()) && !h4.getEvent().equals(Event.gameDownloadCompleted.name()) && !h4.getEvent().equals(Event.installAndroidCompleted.name()) && !h4.getEvent().equals(Event.gameUnzip.name()) && !h4.getEvent().equals(Event.gameOut.name()) && !h4.getEvent().equals(Event.visitGamePage.name()) && !h4.getEvent().equals(Event.gameList.name()) && !h4.getEvent().equals(Event.userLogin.name()) && !h4.getEvent().equals(Event.welcomePageShow.name()) && !h4.getEvent().equals(Event.clickFastLoginButton.name()) && !h4.getEvent().equals(Event.quickLoginResult.name()) && !h4.getEvent().equals(Event.clickOtherLogin.name()) && !h4.getEvent().equals(Event.otherLoginPageShow.name()) && !h4.getEvent().equals(Event.tokenLoginResult.name()) && !h4.getEvent().equals(Event.clickThirdpartyLogin.name()) && !h4.getEvent().equals(Event.thirdPartyLoginSuccess.name()) && !h4.getEvent().equals(Event.loginAuthPageShow.name()) && !h4.getEvent().equals(Event.accountLoginSubmit.name()) && !h4.getEvent().equals(Event.accountLoginSuccess.name()) && !h4.getEvent().equals(Event.accountRegisterShow.name()) && !h4.getEvent().equals(Event.accountRegisterSubmit.name()) && !h4.getEvent().equals(Event.accountRegistertSuccess.name()) && !h4.getEvent().equals(Event.VMGameStart.name()) && !h4.getEvent().equals(Event.VMGameStartAfterStatus.name()) && !h4.getEvent().equals(Event.gamePlayTimes.name())) {
                    this.f58859c.g();
                    List<com.papa.sim.statistic.db.d> k4 = this.f58859c.k();
                    if (k4 == null || k4.size() < 10 || this.f58863g) {
                        return;
                    }
                    this.f58863g = true;
                    Z(k4);
                    return;
                }
                try {
                    if (h4.getEvent().equals(Event.gameRequest.name())) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("From=");
                        sb2.append(h4.getExt().getFrom());
                        sb2.append("  Position= ");
                        sb2.append(h4.getExt().getPosition());
                    }
                    if (h4.getEvent().equals(Event.gameStart.name()) && this.f58861e != null) {
                        h4.getExt().setClearStatus(this.f58861e.a());
                    }
                    if (h4.getEvent().equals(Event.gameDownload.name()) && h4.getExt().getFrom().startsWith("20")) {
                        h4.getExt().setPage(ExtFrom.home.name());
                    }
                    if (TextUtils.isEmpty(h4.getExt().getEmuCount())) {
                        h4.getExt().setEmuCount(s.m());
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
                if (this.f58861e != null) {
                    h4.getData().setPageVersion(this.f58861e.b());
                }
                try {
                    b5 = com.papa.sim.statistic.a.b(JsonMapper.e().toJson(h4), "");
                } catch (Exception e6) {
                    e6.printStackTrace();
                }
                com.papa.sim.statistic.http.c.c().g(f58849l + "/data/v3", b5, new d(dVar, context));
            }
        } catch (Exception e7) {
            e7.printStackTrace();
        }
    }

    public void t0(Context context, JoyStickConfig joyStickConfig) {
        l.a(context, joyStickConfig);
    }

    public void u(Context context, List<com.papa.sim.statistic.db.d> list) {
        Z(list);
    }

    void w(Event event, int i4) {
        StatRequest statRequest = new StatRequest();
        statRequest.setEvent(event.name());
        statRequest.setTime(System.currentTimeMillis());
        Data data = new Data();
        try {
            data.setPlugId(i4);
        } catch (Exception unused) {
            data.setGameId(0L);
        }
        statRequest.setData(data);
        u0(statRequest);
    }

    public void x(Event event, Event event2, int i4, String str, int i5) {
        StatRequest statRequest = new StatRequest();
        try {
            statRequest.getData().setGameId(Long.parseLong(str));
        } catch (Exception unused) {
        }
        Ext ext = statRequest.getExt();
        ext.setUid(i5);
        ext.setNetType(o(this.f58860d));
        ext.setBtn(event2.name() + i4);
        ext.setGameId(str);
        com.papa.sim.statistic.db.d dVar = new com.papa.sim.statistic.db.d();
        dVar.t(event.name());
        dVar.s(System.currentTimeMillis() + "");
        dVar.k(k.a(this.f58860d));
        dVar.n(k.c(this.f58860d));
        dVar.u(statRequest.getUid() + "");
        dVar.l(JsonMapper.e().toJson(statRequest));
        this.f58859c.r(dVar);
        try {
            t(this.f58860d, this.f58859c.n(event.name(), dVar.i()));
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void y(Event event, Event event2, String str, int i4) {
        StatRequest statRequest = new StatRequest();
        try {
            statRequest.getData().setGameId(Long.parseLong(str));
        } catch (Exception unused) {
        }
        Ext ext = statRequest.getExt();
        ext.setUid(i4);
        ext.setNetType(o(this.f58860d));
        ext.setBtn(event2.name());
        ext.setMode(event2.name());
        statRequest.setUid(ext.getUid());
        com.papa.sim.statistic.db.d dVar = new com.papa.sim.statistic.db.d();
        dVar.t(event.name());
        dVar.s(System.currentTimeMillis() + "");
        dVar.k(k.a(this.f58860d));
        dVar.n(k.c(this.f58860d));
        dVar.u(statRequest.getUid() + "");
        dVar.l(JsonMapper.e().toJson(statRequest));
        this.f58859c.r(dVar);
        try {
            t(this.f58860d, this.f58859c.n(event.name(), dVar.i()));
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    void z(Event event, Ext ext) {
        StatRequest statRequest = new StatRequest();
        statRequest.setEvent(event.name());
        statRequest.setTime(System.currentTimeMillis());
        statRequest.setExt(ext);
        u0(statRequest);
    }
}
