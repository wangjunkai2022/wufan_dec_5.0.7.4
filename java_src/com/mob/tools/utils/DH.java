package com.mob.tools.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.location.Location;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import com.mob.MobSDK;
import com.mob.commons.s;
import com.mob.commons.v;
import com.mob.commons.z;
import com.mob.tools.MobLog;
import com.mob.tools.log.NLog;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
/* loaded from: classes5.dex */
public class DH {
    public static final int GPI_STRATEGY_VALIDITY_3_MINUTE = 180000;
    public static final int GPI_STRATEGY_VALIDITY_ALL = 0;

    /* loaded from: classes5.dex */
    public interface DHResponder {
        void onResponse(DHResponse dHResponse) throws Throwable;
    }

    /* loaded from: classes5.dex */
    public static class DHResponse {
        private String A;
        private Object C;
        private ArrayList<HashMap<String, Object>> D;
        private String E;
        private HashMap<String, Object> F;
        private HashMap<String, Object> H;
        private ArrayList<ArrayList<String>> I;
        private String J;
        private HashMap<String, HashMap<String, Long>> K;
        private HashMap<String, Long> L;
        private String M;
        private boolean N;
        private boolean O;
        private boolean P;
        private boolean Q;
        private boolean R;
        private boolean S;
        private boolean T;
        private boolean U;
        private String V;
        private String W;
        private String X;
        private String Y;
        private int Z;

        /* renamed from: a  reason: collision with root package name */
        private boolean f56866a;
        private String aA;
        private int aB;
        private int aC;
        private String aD;
        private int aE;
        private HashMap<String, Object> aG;
        private ArrayList<HashMap<String, Object>> aI;
        private String aJ;
        private String aL;
        private boolean aN;
        private ArrayList<HashMap<String, Object>> aO;
        private boolean aS;
        private ArrayList<HashMap<String, Object>> aT;
        private String aU;
        private String af;
        private String ag;
        private String ah;
        private long ai;
        private String aj;
        private String ak;
        private String al;
        private String am;
        private String an;
        private HashMap<String, Object> ao;
        private ApplicationInfo ap;
        private String as;
        private String at;
        private String au;
        private long av;
        private double aw;
        private int ax;
        private boolean ay;
        private String az;

        /* renamed from: b  reason: collision with root package name */
        private String f56867b;

        /* renamed from: d  reason: collision with root package name */
        private String f56869d;

        /* renamed from: g  reason: collision with root package name */
        private String f56872g;

        /* renamed from: h  reason: collision with root package name */
        private String f56873h;

        /* renamed from: j  reason: collision with root package name */
        private String f56875j;

        /* renamed from: l  reason: collision with root package name */
        private String f56877l;

        /* renamed from: n  reason: collision with root package name */
        private String f56879n;

        /* renamed from: o  reason: collision with root package name */
        private String f56880o;

        /* renamed from: q  reason: collision with root package name */
        private boolean f56882q;

        /* renamed from: r  reason: collision with root package name */
        private String f56883r;

        /* renamed from: s  reason: collision with root package name */
        private String f56884s;

        /* renamed from: t  reason: collision with root package name */
        private String f56885t;

        /* renamed from: v  reason: collision with root package name */
        private String f56887v;

        /* renamed from: z  reason: collision with root package name */
        private ArrayList<HashMap<String, String>> f56891z;

        /* renamed from: c  reason: collision with root package name */
        private LinkedList<String> f56868c = new LinkedList<>();

        /* renamed from: e  reason: collision with root package name */
        private LinkedList<String> f56870e = new LinkedList<>();

        /* renamed from: f  reason: collision with root package name */
        private LinkedList<String> f56871f = new LinkedList<>();

        /* renamed from: i  reason: collision with root package name */
        private LinkedList<String> f56874i = new LinkedList<>();

        /* renamed from: k  reason: collision with root package name */
        private LinkedList<String> f56876k = new LinkedList<>();

        /* renamed from: m  reason: collision with root package name */
        private LinkedList<String> f56878m = new LinkedList<>();

        /* renamed from: p  reason: collision with root package name */
        private LinkedList<String> f56881p = new LinkedList<>();

        /* renamed from: u  reason: collision with root package name */
        private LinkedList<String> f56886u = new LinkedList<>();

        /* renamed from: w  reason: collision with root package name */
        private LinkedList<String> f56888w = new LinkedList<>();

        /* renamed from: x  reason: collision with root package name */
        private LinkedList<ArrayList<HashMap<String, String>>> f56889x = new LinkedList<>();

        /* renamed from: y  reason: collision with root package name */
        private LinkedList<ArrayList<HashMap<String, String>>> f56890y = new LinkedList<>();
        private LinkedList<Location> B = new LinkedList<>();
        private LinkedList<Boolean> G = new LinkedList<>();
        private LinkedList<List<ResolveInfo>> aa = new LinkedList<>();
        private LinkedList<ResolveInfo> ab = new LinkedList<>();
        private LinkedList<PackageInfo> ac = new LinkedList<>();
        private LinkedList<PackageInfo> ad = new LinkedList<>();
        private LinkedList<PackageInfo> ae = new LinkedList<>();
        private LinkedList<ApplicationInfo> aq = new LinkedList<>();
        private LinkedList<ApplicationInfo> ar = new LinkedList<>();
        private LinkedList<List> aF = new LinkedList<>();
        private LinkedList<HashMap<String, Object>> aH = new LinkedList<>();
        private LinkedList<String> aK = new LinkedList<>();
        private LinkedList<String> aM = new LinkedList<>();
        private LinkedList<Object> aP = new LinkedList<>();
        private LinkedList<Object> aQ = new LinkedList<>();
        private LinkedList<Object> aR = new LinkedList<>();
        private LinkedList<Long> aV = new LinkedList<>();

        void a(String str, Object obj) throws Throwable {
            a(str, obj, false);
        }

        public boolean checkDebbing() {
            return this.aS;
        }

        public boolean checkNetworkAvailable() {
            return this.f56882q;
        }

        public boolean checkPad() {
            return this.O;
        }

        public boolean checkUA() {
            return this.R;
        }

        public boolean cx() {
            return this.N;
        }

        public boolean debugable() {
            return this.T;
        }

        public boolean devEnable() {
            return this.Q;
        }

        public ArrayList<HashMap<String, Object>> getACIfo() {
            return this.aT;
        }

        public ApplicationInfo getAInfo() {
            return this.ap;
        }

        public ApplicationInfo getAInfoForPkg(int... iArr) {
            return (ApplicationInfo) a(this.aq, (Object) null, iArr);
        }

        public ApplicationInfo getAInfoForPkgForce(int... iArr) {
            return (ApplicationInfo) a(this.ar, (Object) null, iArr);
        }

        public HashMap<String, Object> getALLD() {
            return this.ao;
        }

        public String getAdvertisingID() {
            return this.A;
        }

        public long getAppLastUpdateTime() {
            return this.ai;
        }

        public String getAppName() {
            return this.f56887v;
        }

        public String getAppNameForPkg(int... iArr) {
            return (String) a(this.f56888w, (Object) null, iArr);
        }

        public String getBaseband() {
            return this.W;
        }

        public long getBdT() {
            return this.av;
        }

        public String getBoardFromSysProperty() {
            return this.X;
        }

        public String getBoardPlatform() {
            return this.Y;
        }

        public String getBssid() {
            return this.f56869d;
        }

        public String getBssidForce(int... iArr) {
            return (String) a(this.f56870e, (Object) null, iArr);
        }

        public String getBtM() {
            return this.at;
        }

        public String getCInfo() {
            return this.al;
        }

        public Object getCLoc() {
            return this.C;
        }

        public HashMap<String, Object> getCPUInfo() {
            return this.H;
        }

        public String getCarrier() {
            return this.f56873h;
        }

        public String getCarrierForce(int... iArr) {
            return (String) a(this.f56874i, "-1", iArr);
        }

        public String getCarrierName() {
            return this.f56875j;
        }

        public String getCarrierNameForce(int... iArr) {
            return (String) a(this.f56876k, (Object) null, iArr);
        }

        public String getCgroup() {
            return this.ak;
        }

        public HashMap<String, Object> getCurrentWifiInfo() {
            return this.F;
        }

        public String getDM() {
            return this.aU;
        }

        public int getDataNtType() {
            return this.Z;
        }

        public String getDetailNetworkTypeForStatic() {
            return this.f56884s;
        }

        public String getDeviceData() {
            return this.ag;
        }

        public String getDeviceDataNotAES() {
            return this.ah;
        }

        public String getDeviceId() {
            return null;
        }

        public String getDeviceKey() {
            return this.f56885t;
        }

        public String getDeviceKeyFromCache(int... iArr) {
            return (String) a(this.f56886u, (Object) null, iArr);
        }

        public String getDeviceName() {
            return this.aj;
        }

        public String getDeviceType() {
            return this.E;
        }

        public String getDrID() {
            return this.as;
        }

        public String getFlavor() {
            return this.V;
        }

        public int getGrammaticalGender() {
            return this.aE;
        }

        public int getHmEPMState() {
            return this.aC;
        }

        public String getHmOsDetailedVer() {
            return this.aA;
        }

        public String getHmOsVer() {
            return this.az;
        }

        public int getHmPMState() {
            return this.aB;
        }

        public ArrayList<HashMap<String, String>> getIA(int... iArr) {
            return (ArrayList) a(this.f56889x, new ArrayList(), iArr);
        }

        public ArrayList<HashMap<String, String>> getIAForce(int... iArr) {
            return (ArrayList) a(this.f56890y, new ArrayList(), iArr);
        }

        public String getIMEI() {
            return null;
        }

        public String getIMSI() {
            return null;
        }

        public String getIPAddress() {
            return this.af;
        }

        public String getInnerAppLanguage() {
            return this.aD;
        }

        public long getLATime(int... iArr) {
            return ((Long) a((LinkedList<long>) this.aV, -1L, iArr)).longValue();
        }

        public Location getLocation(int... iArr) {
            return (Location) a(this.B, (Object) null, iArr);
        }

        public String getMIUIVersion() {
            return this.M;
        }

        public String getMbcdi() {
            return this.aL;
        }

        public String getMbcdiForce(int... iArr) {
            return (String) a(this.aM, (Object) null, iArr);
        }

        public String getMcdi() {
            return this.aJ;
        }

        public String getMcdiForce(int... iArr) {
            return (String) a(this.aK, (Object) null, iArr);
        }

        public HashMap<String, Long> getMemoryInfo() {
            return this.L;
        }

        public ArrayList<HashMap<String, Object>> getMnbclfo() {
            return this.aO;
        }

        public Object getMpfo(int... iArr) {
            return a(this.aP, (Object) null, iArr);
        }

        public Object getMpfof(int... iArr) {
            return a(this.aQ, (Object) null, iArr);
        }

        public Object getMpfos(int... iArr) {
            return a(this.aR, (Object) null, iArr);
        }

        public HashMap<String, Object> getMwfo() {
            return this.aG;
        }

        public HashMap<String, Object> getMwfoForce(int... iArr) {
            return (HashMap) a(this.aH, (Object) null, iArr);
        }

        public ArrayList<HashMap<String, Object>> getMwlfo() {
            return this.aI;
        }

        public ArrayList<HashMap<String, Object>> getNeighboringCellInfo() {
            return this.D;
        }

        public String getNetworkType() {
            return this.f56879n;
        }

        public String getNetworkTypeForStatic() {
            return this.f56883r;
        }

        public String getNetworkTypeForce(int... iArr) {
            return (String) a(this.f56881p, s.a("004eAdk>ef"), iArr);
        }

        public String getNetworkTypeNew() {
            return this.f56880o;
        }

        public String getOD() {
            return this.am;
        }

        public String getODH() {
            return this.an;
        }

        public PackageInfo getPInfo(int... iArr) {
            return (PackageInfo) a(this.ac, (Object) null, iArr);
        }

        public PackageInfo getPInfoForce(int... iArr) {
            return (PackageInfo) a(this.ad, (Object) null, iArr);
        }

        public PackageInfo getPInfoStrategy(int... iArr) {
            return (PackageInfo) a(this.ae, (Object) null, iArr);
        }

        public List getPosCommForce(int... iArr) {
            return (List) a(this.aF, (Object) null, iArr);
        }

        public String getQemuKernel() {
            return this.J;
        }

        public ArrayList<HashMap<String, String>> getSA() {
            return this.f56891z;
        }

        public String getSSID() {
            return this.f56867b;
        }

        public String getSSIDForce(int... iArr) {
            return (String) a(this.f56868c, (Object) null, iArr);
        }

        public double getScreenInch() {
            return this.aw;
        }

        public int getScreenPpi() {
            return this.ax;
        }

        public String getScreenSize() {
            return this.f56872g;
        }

        public boolean getSdcardState() {
            return false;
        }

        public String getSerialno() {
            return null;
        }

        public String getSignMD5() {
            return this.f56877l;
        }

        public String getSignMD5ForPkg(int... iArr) {
            return (String) a(this.f56878m, (Object) null, iArr);
        }

        public String getSimSerialNumber() {
            return null;
        }

        public HashMap<String, HashMap<String, Long>> getSizeInfo() {
            return this.K;
        }

        public String getSystemProperties(int... iArr) {
            return (String) a(this.f56871f, (Object) null, iArr);
        }

        public ArrayList<ArrayList<String>> getTTYDriversInfo() {
            return this.I;
        }

        public Activity getTopActivity() {
            return null;
        }

        public String getUpM() {
            return this.au;
        }

        public boolean isHmOs() {
            return this.ay;
        }

        public boolean isMwpy() {
            return this.aN;
        }

        public boolean isPackageInstalled(int... iArr) {
            return ((Boolean) a(this.G, Boolean.FALSE, iArr)).booleanValue();
        }

        public boolean isRooted() {
            return this.f56866a;
        }

        public boolean isWifiProxy() {
            return this.U;
        }

        public String[] queryIMEI() {
            return null;
        }

        public String[] queryIMSI() {
            return null;
        }

        public List<ResolveInfo> queryIntentServices(int... iArr) {
            return (List) a(this.aa, (Object) null, iArr);
        }

        public ResolveInfo resolveActivity(int... iArr) {
            return (ResolveInfo) a(this.ab, (Object) null, iArr);
        }

        public boolean usbEnable() {
            return this.P;
        }

        public boolean vpn() {
            return this.S;
        }

        void a(String str, Object obj, boolean z4) throws Throwable {
            if ("gmpfo".equals(str)) {
                LinkedList<Object> linkedList = this.aP;
                if (z4) {
                    obj = null;
                }
                linkedList.add(obj);
            } else if ("gmpfofce".equals(str)) {
                LinkedList<Object> linkedList2 = this.aQ;
                if (z4) {
                    obj = null;
                }
                linkedList2.add(obj);
            } else if ("getMpfos".equals(str)) {
                LinkedList<Object> linkedList3 = this.aR;
                if (z4) {
                    obj = null;
                }
                linkedList3.add(obj);
            } else {
                boolean z5 = false;
                z5 = false;
                if ("cird".equals(str)) {
                    this.f56866a = z4 ? false : ((Boolean) obj).booleanValue();
                } else if ("gsimt".equals(str)) {
                    this.f56867b = z4 ? null : (String) obj;
                } else if ("gsimtfce".equals(str)) {
                    this.f56868c.add(z4 ? null : (String) obj);
                } else if ("gbsi".equals(str)) {
                    this.f56869d = z4 ? null : (String) obj;
                } else if ("gbsifce".equals(str)) {
                    this.f56870e.add(z4 ? null : (String) obj);
                } else if ("gstmpts".equals(str)) {
                    this.f56871f.add(z4 ? null : (String) obj);
                } else if ("gscsz".equals(str)) {
                    this.f56872g = z4 ? null : (String) obj;
                } else if ("gcrie".equals(str)) {
                    this.f56873h = z4 ? null : (String) obj;
                } else if ("gcriefce".equals(str)) {
                    this.f56874i.add(z4 ? null : (String) obj);
                } else if ("gcrnm".equals(str)) {
                    this.f56875j = z4 ? null : (String) obj;
                } else if ("gcrnmfce".equals(str)) {
                    this.f56876k.add(z4 ? null : (String) obj);
                } else if ("gsnmd".equals(str)) {
                    this.f56877l = z4 ? null : (String) obj;
                } else if ("gsnmdfp".equals(str)) {
                    this.f56878m.add(z4 ? null : (String) obj);
                } else if ("gneyp".equals(str)) {
                    this.f56879n = z4 ? null : (String) obj;
                } else if ("gneypnw".equals(str)) {
                    this.f56880o = z4 ? null : (String) obj;
                } else if ("gneypfce".equals(str)) {
                    this.f56881p.add(z4 ? null : (String) obj);
                } else if ("cknavbl".equals(str)) {
                    this.f56882q = z4 ? false : ((Boolean) obj).booleanValue();
                } else if ("gnktpfs".equals(str)) {
                    this.f56883r = z4 ? null : (String) obj;
                } else if ("gdtlnktpfs".equals(str)) {
                    this.f56884s = z4 ? null : (String) obj;
                } else if ("gdvk".equals(str)) {
                    this.f56885t = z4 ? null : (String) obj;
                } else if ("gdvkfc".equals(str)) {
                    this.f56886u.add(z4 ? null : (String) obj);
                } else if ("gpnmmt".equals(str)) {
                    this.f56887v = z4 ? null : (String) obj;
                } else if ("gpnmfp".equals(str)) {
                    this.f56888w.add(z4 ? null : (String) obj);
                } else if ("gia".equals(str)) {
                    this.f56889x.add(z4 ? null : (ArrayList) obj);
                } else if ("giafce".equals(str)) {
                    this.f56890y.add(z4 ? null : (ArrayList) obj);
                } else if ("gsl".equals(str)) {
                    this.f56891z = z4 ? null : (ArrayList) obj;
                } else if ("gavti".equals(str)) {
                    this.A = z4 ? null : (String) obj;
                } else if ("glctn".equals(str)) {
                    this.B.add(z4 ? null : (Location) obj);
                } else if ("gtecloc".equals(str)) {
                    if (z4) {
                        obj = null;
                    }
                    this.C = obj;
                } else if ("gnbclin".equals(str)) {
                    this.D = z4 ? null : (ArrayList) obj;
                } else if ("gdvtp".equals(str)) {
                    this.E = z4 ? null : (String) obj;
                } else if ("wmcwi".equals(str)) {
                    this.F = z4 ? null : (HashMap) obj;
                } else if ("ipgist".equals(str)) {
                    this.G.add(Boolean.valueOf(z4 ? false : ((Boolean) obj).booleanValue()));
                } else if ("gcuin".equals(str)) {
                    this.H = z4 ? null : (HashMap) obj;
                } else if ("gtydvin".equals(str)) {
                    this.I = z4 ? null : (ArrayList) obj;
                } else if ("gqmkn".equals(str)) {
                    this.J = z4 ? null : (String) obj;
                } else if ("gszin".equals(str)) {
                    this.K = z4 ? null : (HashMap) obj;
                } else if ("gmrin".equals(str)) {
                    this.L = z4 ? null : (HashMap) obj;
                } else if ("gmivsn".equals(str)) {
                    this.M = z4 ? null : (String) obj;
                } else if ("cx".equals(str)) {
                    this.N = z4 ? false : ((Boolean) obj).booleanValue();
                } else if ("ckpd".equals(str)) {
                    this.O = z4 ? false : ((Boolean) obj).booleanValue();
                } else if ("ubenbl".equals(str)) {
                    this.P = z4 ? false : ((Boolean) obj).booleanValue();
                } else if ("dvenbl".equals(str)) {
                    this.Q = z4 ? false : ((Boolean) obj).booleanValue();
                } else if ("ckua".equals(str)) {
                    this.R = z4 ? false : ((Boolean) obj).booleanValue();
                } else if ("vnmt".equals(str)) {
                    this.S = z4 ? false : ((Boolean) obj).booleanValue();
                } else if ("degb".equals(str)) {
                    this.T = z4 ? false : ((Boolean) obj).booleanValue();
                } else if ("iwpxy".equals(str)) {
                    this.U = z4 ? false : ((Boolean) obj).booleanValue();
                } else if ("gflv".equals(str)) {
                    this.V = z4 ? null : (String) obj;
                } else if ("gbsbd".equals(str)) {
                    this.W = z4 ? null : (String) obj;
                } else if ("gbfspy".equals(str)) {
                    this.X = z4 ? null : (String) obj;
                } else if ("gbplfo".equals(str)) {
                    this.Y = z4 ? null : (String) obj;
                } else if ("gdntp".equals(str)) {
                    this.Z = z4 ? 0 : ((Integer) obj).intValue();
                } else if ("qritsvc".equals(str)) {
                    this.aa.add(z4 ? null : (List) obj);
                } else if ("rsaciy".equals(str)) {
                    this.ab.add(z4 ? null : (ResolveInfo) obj);
                } else if ("gpgif".equals(str)) {
                    this.ac.add(z4 ? null : (PackageInfo) obj);
                } else if ("gpgiffcin".equals(str)) {
                    this.ad.add(z4 ? null : (PackageInfo) obj);
                } else if ("gpgifstrg".equals(str)) {
                    this.ae.add(z4 ? null : (PackageInfo) obj);
                } else if ("giads".equals(str)) {
                    this.af = z4 ? null : (String) obj;
                } else if ("gdvda".equals(str)) {
                    this.ag = z4 ? null : (String) obj;
                } else if ("gdvdtnas".equals(str)) {
                    this.ah = z4 ? null : (String) obj;
                } else {
                    if ("galtut".equals(str)) {
                        this.ai = z4 ? 0L : ((Long) obj).longValue();
                    } else if ("gdvme".equals(str)) {
                        this.aj = z4 ? null : (String) obj;
                    } else if ("gcrup".equals(str)) {
                        this.ak = z4 ? null : (String) obj;
                    } else if ("gcifm".equals(str)) {
                        this.al = z4 ? null : (String) obj;
                    } else if ("godm".equals(str)) {
                        this.am = z4 ? null : (String) obj;
                    } else if ("godhm".equals(str)) {
                        this.an = z4 ? null : (String) obj;
                    } else if ("galdm".equals(str)) {
                        this.ao = z4 ? null : (HashMap) obj;
                    } else if ("gtaif".equals(str)) {
                        this.ap = z4 ? null : (ApplicationInfo) obj;
                    } else if ("gtaifprm".equals(str)) {
                        this.aq.add(z4 ? null : (ApplicationInfo) obj);
                    } else if ("gtaifprmfce".equals(str)) {
                        this.ar.add(z4 ? null : (ApplicationInfo) obj);
                    } else if ("gtbdt".equals(str)) {
                        this.av = z4 ? 0L : ((Long) obj).longValue();
                    } else if ("gtscnin".equals(str)) {
                        this.aw = z4 ? 0.0d : ((Double) obj).doubleValue();
                    } else if ("gtscnppi".equals(str)) {
                        this.ax = z4 ? 0 : ((Integer) obj).intValue();
                    } else if ("ishmos".equals(str)) {
                        this.ay = z4 ? false : ((Boolean) obj).booleanValue();
                    } else if ("gthmosv".equals(str)) {
                        this.az = z4 ? null : (String) obj;
                    } else if ("gthmosdtlv".equals(str)) {
                        this.aA = z4 ? null : (String) obj;
                    } else {
                        if ("gthmpmst".equals(str)) {
                            this.aB = z4 ? -1 : ((Integer) obj).intValue();
                        } else if ("gthmepmst".equals(str)) {
                            this.aC = z4 ? -1 : ((Integer) obj).intValue();
                        } else if ("gtinnerlangmt".equals(str)) {
                            this.aD = z4 ? null : (String) obj;
                        } else if ("gtgramgendt".equals(str)) {
                            this.aE = z4 ? 0 : ((Integer) obj).intValue();
                        } else if ("gtelcmefce".equals(str)) {
                            this.aF.add(z4 ? null : (List) obj);
                        } else if ("gtmwfo".equals(str)) {
                            this.aG = z4 ? null : (HashMap) obj;
                        } else if ("wmcwifce".equals(str)) {
                            this.aH.add(z4 ? null : (HashMap) obj);
                        } else if ("gtaifok".equals(str)) {
                            this.aI = z4 ? null : (ArrayList) obj;
                        } else if ("gtmcdi".equals(str)) {
                            this.aJ = z4 ? null : (String) obj;
                        } else if ("gtmcdifce".equals(str)) {
                            this.aK.add(z4 ? null : (String) obj);
                        } else if ("gtmbcdi".equals(str)) {
                            this.aL = z4 ? null : (String) obj;
                        } else if ("gtmbcdifce".equals(str)) {
                            this.aM.add(z4 ? null : (String) obj);
                        } else if ("miwpy".equals(str)) {
                            this.aN = z4 ? false : ((Boolean) obj).booleanValue();
                        } else if ("gtmnbclfo".equals(str)) {
                            this.aO = z4 ? null : (ArrayList) obj;
                        } else if ("ctedebbing".equals(str)) {
                            if (!z4 && ((Boolean) obj).booleanValue()) {
                                z5 = true;
                            }
                            this.aS = z5;
                        } else if ("gteacifo".equals(str)) {
                            this.aT = z4 ? null : (ArrayList) obj;
                        } else if ("gtdm".equals(str)) {
                            this.aU = z4 ? null : (String) obj;
                        } else if ("gtlstactme".equals(str)) {
                            this.aV.add(Long.valueOf(z4 ? -1L : ((Long) obj).longValue()));
                        } else {
                            throw new Throwable("Unknown name to set: " + str + ", value: " + obj);
                        }
                    }
                }
            }
        }

        private static <T> T a(LinkedList<T> linkedList, T t4, int... iArr) {
            if (linkedList != null) {
                try {
                    if (iArr.length == 0) {
                        return linkedList.get(0);
                    }
                    if (iArr[0] < linkedList.size()) {
                        return linkedList.get(iArr[0]);
                    }
                    NLog mobLog = MobLog.getInstance();
                    mobLog.w("WARNING: " + iArr[0] + " out of bound, size: " + linkedList.size());
                } catch (Throwable th) {
                    MobLog.getInstance().d(th);
                }
            }
            return t4;
        }
    }

    /* loaded from: classes5.dex */
    public static class RequestBuilder {

        /* renamed from: a  reason: collision with root package name */
        private final Context f56892a;

        /* renamed from: b  reason: collision with root package name */
        private final LinkedList<a> f56893b;

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes5.dex */
        public static class a {

            /* renamed from: a  reason: collision with root package name */
            public final String f56901a;

            /* renamed from: b  reason: collision with root package name */
            public final Object[] f56902b;

            private a(String str, Object... objArr) {
                this.f56901a = str;
                this.f56902b = objArr;
            }
        }

        public RequestBuilder checkDebbing() {
            this.f56893b.add(new a("ctedebbing", new Object[0]));
            return this;
        }

        public RequestBuilder checkNetworkAvailable() {
            this.f56893b.add(new a("cknavbl", new Object[0]));
            return this;
        }

        public RequestBuilder checkPad() {
            this.f56893b.add(new a("ckpd", new Object[0]));
            return this;
        }

        public RequestBuilder checkUA() {
            this.f56893b.add(new a("ckua", new Object[0]));
            return this;
        }

        public RequestBuilder cx() {
            this.f56893b.add(new a("cx", new Object[0]));
            return this;
        }

        public RequestBuilder debugable() {
            this.f56893b.add(new a("degb", new Object[0]));
            return this;
        }

        public RequestBuilder devEnable() {
            this.f56893b.add(new a("dvenbl", new Object[0]));
            return this;
        }

        public RequestBuilder getACIfo() {
            this.f56893b.add(new a("gteacifo", new Object[0]));
            return this;
        }

        public RequestBuilder getAInfo() {
            this.f56893b.add(new a("gtaif", new Object[0]));
            return this;
        }

        public RequestBuilder getAInfoForPkg(String str, int i4) {
            this.f56893b.add(new a("gtaifprm", new Object[]{str, Integer.valueOf(i4)}));
            return this;
        }

        public RequestBuilder getAInfoForPkgForce(boolean z4, String str, int i4) {
            this.f56893b.add(new a("gtaifprmfce", new Object[]{Boolean.valueOf(z4), str, Integer.valueOf(i4)}));
            return this;
        }

        public RequestBuilder getALLD() {
            this.f56893b.add(new a("galdm", new Object[0]));
            return this;
        }

        public RequestBuilder getAdvertisingID() {
            this.f56893b.add(new a("gavti", new Object[0]));
            return this;
        }

        public RequestBuilder getAppLastUpdateTime() {
            this.f56893b.add(new a("galtut", new Object[0]));
            return this;
        }

        public RequestBuilder getAppName() {
            this.f56893b.add(new a("gpnmmt", new Object[0]));
            return this;
        }

        public RequestBuilder getAppNameForPkg(String str) {
            this.f56893b.add(new a("gpnmfp", new Object[]{str}));
            return this;
        }

        public RequestBuilder getBaseband() {
            this.f56893b.add(new a("gbsbd", new Object[0]));
            return this;
        }

        public RequestBuilder getBdT() {
            this.f56893b.add(new a("gtbdt", new Object[0]));
            return this;
        }

        public RequestBuilder getBoardFromSysProperty() {
            this.f56893b.add(new a("gbfspy", new Object[0]));
            return this;
        }

        public RequestBuilder getBoardPlatform() {
            this.f56893b.add(new a("gbplfo", new Object[0]));
            return this;
        }

        public RequestBuilder getBssid() {
            this.f56893b.add(new a("gbsi", new Object[0]));
            return this;
        }

        public RequestBuilder getBssidForce(boolean z4) {
            this.f56893b.add(new a("gbsifce", new Object[]{Boolean.valueOf(z4)}));
            return this;
        }

        public RequestBuilder getBtM() {
            return this;
        }

        public RequestBuilder getCInfo() {
            this.f56893b.add(new a("gcifm", new Object[0]));
            return this;
        }

        public RequestBuilder getCLoc() {
            this.f56893b.add(new a("gtecloc", new Object[0]));
            return this;
        }

        public RequestBuilder getCPUInfo() {
            this.f56893b.add(new a("gcuin", new Object[0]));
            return this;
        }

        public RequestBuilder getCarrier() {
            this.f56893b.add(new a("gcrie", new Object[0]));
            return this;
        }

        public RequestBuilder getCarrierForce(boolean z4) {
            this.f56893b.add(new a("gcriefce", new Object[]{Boolean.valueOf(z4)}));
            return this;
        }

        public RequestBuilder getCarrierName() {
            this.f56893b.add(new a("gcrnm", new Object[0]));
            return this;
        }

        public RequestBuilder getCarrierNameForce(boolean z4) {
            this.f56893b.add(new a("gcrnmfce", new Object[]{Boolean.valueOf(z4)}));
            return this;
        }

        public RequestBuilder getCgroup() {
            this.f56893b.add(new a("gcrup", new Object[0]));
            return this;
        }

        public RequestBuilder getCurrentWifiInfo() {
            this.f56893b.add(new a("wmcwi", new Object[0]));
            return this;
        }

        public RequestBuilder getDM(boolean z4) {
            this.f56893b.add(new a("gtdm", new Object[]{Boolean.valueOf(z4)}));
            return this;
        }

        public RequestBuilder getDataNtType() {
            this.f56893b.add(new a("gdntp", new Object[0]));
            return this;
        }

        public RequestBuilder getDetailNetworkTypeForStatic() {
            this.f56893b.add(new a("gdtlnktpfs", new Object[0]));
            return this;
        }

        public RequestBuilder getDeviceData() {
            this.f56893b.add(new a("gdvda", new Object[0]));
            return this;
        }

        public RequestBuilder getDeviceDataNotAES() {
            this.f56893b.add(new a("gdvdtnas", new Object[0]));
            return this;
        }

        public RequestBuilder getDeviceId() {
            return this;
        }

        public RequestBuilder getDeviceKey() {
            this.f56893b.add(new a("gdvk", new Object[0]));
            return this;
        }

        public RequestBuilder getDeviceKeyFromCache(boolean z4) {
            this.f56893b.add(new a("gdvkfc", new Object[]{Boolean.valueOf(z4)}));
            return this;
        }

        public RequestBuilder getDeviceName() {
            this.f56893b.add(new a("gdvme", new Object[0]));
            return this;
        }

        public RequestBuilder getDeviceType() {
            this.f56893b.add(new a("gdvtp", new Object[0]));
            return this;
        }

        public RequestBuilder getDrID() {
            return this;
        }

        public RequestBuilder getFlavor() {
            this.f56893b.add(new a("gflv", new Object[0]));
            return this;
        }

        public RequestBuilder getGrammaticalGender() {
            this.f56893b.add(new a("gtgramgendt", new Object[0]));
            return this;
        }

        public RequestBuilder getHmEPMState() {
            this.f56893b.add(new a("gthmepmst", new Object[0]));
            return this;
        }

        public RequestBuilder getHmOsDetailedVer() {
            this.f56893b.add(new a("gthmosdtlv", new Object[0]));
            return this;
        }

        public RequestBuilder getHmOsVer() {
            this.f56893b.add(new a("gthmosv", new Object[0]));
            return this;
        }

        public RequestBuilder getHmPMState() {
            this.f56893b.add(new a("gthmpmst", new Object[0]));
            return this;
        }

        public RequestBuilder getIA(boolean z4) {
            this.f56893b.add(new a("gia", new Object[]{Boolean.valueOf(z4)}));
            return this;
        }

        public RequestBuilder getIAForce(boolean z4, boolean z5) {
            this.f56893b.add(new a("giafce", new Object[]{Boolean.valueOf(z4), Boolean.valueOf(z5)}));
            return this;
        }

        public RequestBuilder getIMEI() {
            return this;
        }

        public RequestBuilder getIMSI() {
            return this;
        }

        public RequestBuilder getIPAddress() {
            this.f56893b.add(new a("giads", new Object[0]));
            return this;
        }

        public RequestBuilder getInnerAppLanguage() {
            this.f56893b.add(new a("gtinnerlangmt", new Object[0]));
            return this;
        }

        public RequestBuilder getLATime(String str) {
            this.f56893b.add(new a("gtlstactme", new Object[]{str}));
            return this;
        }

        public RequestBuilder getLocation(int i4, int i5, boolean z4) {
            this.f56893b.add(new a("glctn", new Object[]{Integer.valueOf(i4), Integer.valueOf(i5), Boolean.valueOf(z4)}));
            return this;
        }

        public RequestBuilder getMIUIVersion() {
            this.f56893b.add(new a("gmivsn", new Object[0]));
            return this;
        }

        public RequestBuilder getMbcdi() {
            this.f56893b.add(new a("gtmbcdi", new Object[0]));
            return this;
        }

        public RequestBuilder getMbcdiForce(boolean z4) {
            this.f56893b.add(new a("gtmbcdifce", new Object[]{Boolean.valueOf(z4)}));
            return this;
        }

        public RequestBuilder getMcdi() {
            this.f56893b.add(new a("gtmcdi", new Object[0]));
            return this;
        }

        public RequestBuilder getMcdiForce(boolean z4) {
            this.f56893b.add(new a("gtmcdifce", new Object[]{Boolean.valueOf(z4)}));
            return this;
        }

        public RequestBuilder getMemoryInfo() {
            this.f56893b.add(new a("gmrin", new Object[0]));
            return this;
        }

        public RequestBuilder getMnbclfo() {
            this.f56893b.add(new a("gtmnbclfo", new Object[0]));
            return this;
        }

        public RequestBuilder getMpfo(String str, int i4) {
            this.f56893b.add(new a("gmpfo", new Object[]{str, Integer.valueOf(i4)}));
            return this;
        }

        public RequestBuilder getMpfof(boolean z4, String str, int i4) {
            this.f56893b.add(new a("gmpfofce", new Object[]{Boolean.valueOf(z4), str, Integer.valueOf(i4)}));
            return this;
        }

        public RequestBuilder getMpfos(int i4, String str, int i5) {
            this.f56893b.add(new a("getMpfos", new Object[]{Integer.valueOf(i4), str, Integer.valueOf(i5)}));
            return this;
        }

        public RequestBuilder getMwfo() {
            this.f56893b.add(new a("gtmwfo", new Object[0]));
            return this;
        }

        public RequestBuilder getMwfoForce(boolean z4) {
            this.f56893b.add(new a("wmcwifce", new Object[]{Boolean.valueOf(z4)}));
            return this;
        }

        public RequestBuilder getMwlfo() {
            this.f56893b.add(new a("gtaifok", new Object[0]));
            return this;
        }

        public RequestBuilder getNeighboringCellInfo() {
            this.f56893b.add(new a("gnbclin", new Object[0]));
            return this;
        }

        @Deprecated
        public RequestBuilder getNetworkType() {
            this.f56893b.add(new a("gneyp", new Object[0]));
            return this;
        }

        public RequestBuilder getNetworkTypeForStatic() {
            this.f56893b.add(new a("gnktpfs", new Object[0]));
            return this;
        }

        public RequestBuilder getNetworkTypeForce(boolean z4) {
            this.f56893b.add(new a("gneypfce", new Object[]{Boolean.valueOf(z4)}));
            return this;
        }

        public RequestBuilder getNetworkTypeNew() {
            this.f56893b.add(new a("gneypnw", new Object[0]));
            return this;
        }

        public RequestBuilder getOD() {
            this.f56893b.add(new a("godm", new Object[0]));
            return this;
        }

        public RequestBuilder getODH() {
            this.f56893b.add(new a("godhm", new Object[0]));
            return this;
        }

        public RequestBuilder getPInfo(String str, int i4) {
            this.f56893b.add(new a("gpgif", new Object[]{str, Integer.valueOf(i4)}));
            return this;
        }

        public RequestBuilder getPInfoForce(boolean z4, String str, int i4) {
            this.f56893b.add(new a("gpgiffcin", new Object[]{Boolean.valueOf(z4), str, Integer.valueOf(i4)}));
            return this;
        }

        public RequestBuilder getPInfoStrategy(int i4, String str, int i5) {
            this.f56893b.add(new a("gpgifstrg", new Object[]{Integer.valueOf(i4), str, Integer.valueOf(i5)}));
            return this;
        }

        public RequestBuilder getPosCommForce(int i4, int i5, boolean z4, boolean z5) {
            this.f56893b.add(new a("gtelcmefce", new Object[]{Integer.valueOf(i4), Integer.valueOf(i5), Boolean.valueOf(z4), Boolean.valueOf(z5)}));
            return this;
        }

        public RequestBuilder getQemuKernel() {
            this.f56893b.add(new a("gqmkn", new Object[0]));
            return this;
        }

        public RequestBuilder getSA() {
            this.f56893b.add(new a("gsl", new Object[0]));
            return this;
        }

        public RequestBuilder getSSID() {
            this.f56893b.add(new a("gsimt", new Object[0]));
            return this;
        }

        public RequestBuilder getSSIDForce(boolean z4) {
            this.f56893b.add(new a("gsimtfce", new Object[]{Boolean.valueOf(z4)}));
            return this;
        }

        public RequestBuilder getScreenInch() {
            this.f56893b.add(new a("gtscnin", new Object[0]));
            return this;
        }

        public RequestBuilder getScreenPpi() {
            this.f56893b.add(new a("gtscnppi", new Object[0]));
            return this;
        }

        public RequestBuilder getScreenSize() {
            this.f56893b.add(new a("gscsz", new Object[0]));
            return this;
        }

        public RequestBuilder getSdcardState() {
            return this;
        }

        public RequestBuilder getSerialno() {
            return this;
        }

        public RequestBuilder getSignMD5() {
            this.f56893b.add(new a("gsnmd", new Object[0]));
            return this;
        }

        public RequestBuilder getSignMD5ForPkg(String str) {
            this.f56893b.add(new a("gsnmdfp", new Object[]{str}));
            return this;
        }

        public RequestBuilder getSimSerialNumber() {
            return this;
        }

        public RequestBuilder getSizeInfo() {
            this.f56893b.add(new a("gszin", new Object[0]));
            return this;
        }

        public RequestBuilder getSystemProperties(String str) {
            this.f56893b.add(new a("gstmpts", new Object[]{str}));
            return this;
        }

        public RequestBuilder getTTYDriversInfo() {
            this.f56893b.add(new a("gtydvin", new Object[0]));
            return this;
        }

        public RequestBuilder getTopActivity() {
            return this;
        }

        public RequestBuilder getUpM() {
            return this;
        }

        public RequestBuilder isHmOs() {
            this.f56893b.add(new a("ishmos", new Object[0]));
            return this;
        }

        public RequestBuilder isMwpy() {
            this.f56893b.add(new a("miwpy", new Object[0]));
            return this;
        }

        public RequestBuilder isPackageInstalled(String str) {
            this.f56893b.add(new a("ipgist", new Object[]{str}));
            return this;
        }

        public RequestBuilder isRooted() {
            this.f56893b.add(new a("cird", new Object[0]));
            return this;
        }

        public RequestBuilder isWifiProxy() {
            this.f56893b.add(new a("iwpxy", new Object[0]));
            return this;
        }

        public RequestBuilder queryIMEI() {
            return this;
        }

        public RequestBuilder queryIMSI() {
            return this;
        }

        public RequestBuilder queryIntentServices(Intent intent, int i4) {
            this.f56893b.add(new a("qritsvc", new Object[]{intent, Integer.valueOf(i4)}));
            return this;
        }

        public void request(final DHResponder dHResponder) {
            try {
                boolean z4 = Looper.getMainLooper() == Looper.myLooper();
                final Boolean bool = com.mob.tools.c.a.f56783b.get();
                final Boolean bool2 = com.mob.tools.c.a.f56784c.get();
                final boolean z5 = z4;
                Runnable runnable = new Runnable() { // from class: com.mob.tools.utils.DH.RequestBuilder.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            com.mob.tools.c.a.f56782a.set(Boolean.TRUE);
                            com.mob.tools.c.a.f56783b.set(bool);
                            com.mob.tools.c.a.f56784c.set(bool2);
                            final DHResponse a5 = RequestBuilder.this.a();
                            DHResponder dHResponder2 = dHResponder;
                            if (dHResponder2 != null) {
                                if (z5) {
                                    UIHandler.sendEmptyMessage(0, new Handler.Callback() { // from class: com.mob.tools.utils.DH.RequestBuilder.1.1
                                        @Override // android.os.Handler.Callback
                                        public boolean handleMessage(Message message) {
                                            try {
                                                dHResponder.onResponse(a5);
                                            } catch (Throwable th) {
                                                MobLog.getInstance().d(th, "Error from caller", new Object[0]);
                                            }
                                            return false;
                                        }
                                    });
                                } else {
                                    dHResponder2.onResponse(a5);
                                }
                            }
                            ThreadLocal<Boolean> threadLocal = com.mob.tools.c.a.f56782a;
                            Boolean bool3 = Boolean.FALSE;
                            threadLocal.set(bool3);
                            com.mob.tools.c.a.f56783b.set(bool3);
                            com.mob.tools.c.a.f56784c.set(bool3);
                        } catch (Throwable th) {
                            MobLog.getInstance().d(th);
                            RequestBuilder.this.a(dHResponder);
                        }
                    }
                };
                if (z4) {
                    z.f56523g.execute(runnable);
                } else {
                    runnable.run();
                }
            } catch (Throwable th) {
                MobLog.getInstance().d(th);
                if (dHResponder != null) {
                    a(dHResponder);
                }
            }
        }

        public RequestBuilder resolveActivity(Intent intent, int i4) {
            this.f56893b.add(new a("rsaciy", new Object[]{intent, Integer.valueOf(i4)}));
            return this;
        }

        public RequestBuilder usbEnable() {
            this.f56893b.add(new a("ubenbl", new Object[0]));
            return this;
        }

        public RequestBuilder vpn() {
            this.f56893b.add(new a("vnmt", new Object[0]));
            return this;
        }

        private RequestBuilder(Context context) {
            this.f56893b = new LinkedList<>();
            this.f56892a = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(DHResponder dHResponder) {
            if (dHResponder != null) {
                try {
                    dHResponder.onResponse(new DHResponse());
                } catch (Throwable th) {
                    MobLog.getInstance().d(th, "Error from caller", new Object[0]);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public DHResponse a() {
            DHResponse dHResponse = new DHResponse();
            for (int i4 = 0; i4 < this.f56893b.size(); i4++) {
                a aVar = this.f56893b.get(i4);
                try {
                    String str = aVar.f56901a;
                    dHResponse.a(str, a(str, aVar.f56902b));
                } catch (Throwable th) {
                    try {
                        MobLog.getInstance().d(th);
                        dHResponse.a(aVar.f56901a, (Object) null, true);
                    } catch (Throwable th2) {
                        MobLog.getInstance().d(th2);
                    }
                }
            }
            return dHResponse;
        }

        private Object a(String str, Object[] objArr) throws Throwable {
            if ("gmpfo".equals(str)) {
                if (objArr != null && objArr.length == 2) {
                    int intValue = ((Integer) objArr[1]).intValue();
                    return com.mob.tools.b.c.a(this.f56892a).d().b(false, 0, (String) objArr[0], intValue);
                }
                throw new Throwable("params illegal: " + objArr);
            } else if ("gmpfofce".equals(str)) {
                if (objArr != null && objArr.length == 3) {
                    int intValue2 = ((Integer) objArr[2]).intValue();
                    return com.mob.tools.b.c.a(this.f56892a).d().b(((Boolean) objArr[0]).booleanValue(), 0, (String) objArr[1], intValue2);
                }
                throw new Throwable("params illegal: " + objArr);
            } else if ("getMpfos".equals(str)) {
                if (objArr != null && objArr.length == 3) {
                    int intValue3 = ((Integer) objArr[2]).intValue();
                    return com.mob.tools.b.c.a(this.f56892a).d().b(false, ((Integer) objArr[0]).intValue(), (String) objArr[1], intValue3);
                }
                throw new Throwable("params illegal: " + objArr);
            } else if ("cird".equals(str)) {
                return Boolean.valueOf(com.mob.tools.b.c.a(this.f56892a).d().a());
            } else {
                if ("gsimt".equals(str)) {
                    return com.mob.tools.b.c.a(this.f56892a).d().a(false);
                }
                if ("gsimtfce".equals(str)) {
                    if (objArr != null && objArr.length == 1) {
                        return com.mob.tools.b.c.a(this.f56892a).d().a(((Boolean) objArr[0]).booleanValue());
                    }
                    throw new Throwable("params illegal: " + objArr);
                } else if ("gbsi".equals(str)) {
                    return com.mob.tools.b.c.a(this.f56892a).d().b(false);
                } else {
                    if ("gbsifce".equals(str)) {
                        if (objArr != null && objArr.length == 1) {
                            return com.mob.tools.b.c.a(this.f56892a).d().b(((Boolean) objArr[0]).booleanValue());
                        }
                        throw new Throwable("params illegal: " + objArr);
                    } else if ("gstmpts".equals(str)) {
                        if (objArr != null && objArr.length == 1) {
                            return com.mob.tools.b.c.a(this.f56892a).d().a((String) objArr[0]);
                        }
                        throw new Throwable("params illegal: " + objArr);
                    } else if ("gscsz".equals(str)) {
                        return com.mob.tools.b.c.a(this.f56892a).d().C();
                    } else {
                        if ("gcrie".equals(str)) {
                            return com.mob.tools.b.c.a(this.f56892a).d().c(false);
                        }
                        if ("gcriefce".equals(str)) {
                            if (objArr != null && objArr.length == 1) {
                                return com.mob.tools.b.c.a(this.f56892a).d().c(((Boolean) objArr[0]).booleanValue());
                            }
                            throw new Throwable("params illegal: " + objArr);
                        } else if ("gcrnm".equals(str)) {
                            return com.mob.tools.b.c.a(this.f56892a).d().d(false);
                        } else {
                            if ("gcrnmfce".equals(str)) {
                                if (objArr != null && objArr.length == 1) {
                                    return com.mob.tools.b.c.a(this.f56892a).d().d(((Boolean) objArr[0]).booleanValue());
                                }
                                throw new Throwable("params illegal: " + objArr);
                            } else if ("gsnmd".equals(str)) {
                                return com.mob.tools.b.c.a(this.f56892a).d().S();
                            } else {
                                if ("gsnmdfp".equals(str)) {
                                    if (objArr != null && objArr.length == 1) {
                                        return com.mob.tools.b.c.a(this.f56892a).d().c((String) objArr[0]);
                                    }
                                    throw new Throwable("params illegal: " + objArr);
                                } else if ("gneyp".equals(str)) {
                                    return com.mob.tools.b.c.a(this.f56892a).d().f(false);
                                } else {
                                    if ("gneypnw".equals(str)) {
                                        return com.mob.tools.b.c.a(this.f56892a).d().D();
                                    }
                                    if ("gneypfce".equals(str)) {
                                        if (objArr != null && objArr.length == 1) {
                                            return com.mob.tools.b.c.a(this.f56892a).d().f(((Boolean) objArr[0]).booleanValue());
                                        }
                                        throw new Throwable("params illegal: " + objArr);
                                    } else if ("cknavbl".equals(str)) {
                                        return Boolean.valueOf(com.mob.tools.b.c.a(this.f56892a).d().G());
                                    } else {
                                        if ("gnktpfs".equals(str)) {
                                            return com.mob.tools.b.c.a(this.f56892a).d().E();
                                        }
                                        if ("gdtlnktpfs".equals(str)) {
                                            return com.mob.tools.b.c.a(this.f56892a).d().F();
                                        }
                                        if ("gdvk".equals(str)) {
                                            return com.mob.tools.b.c.a(this.f56892a).d().Q();
                                        }
                                        if ("gdvkfc".equals(str)) {
                                            if (objArr != null && objArr.length == 1) {
                                                return com.mob.tools.b.c.a(this.f56892a).d().g(((Boolean) objArr[0]).booleanValue());
                                            }
                                            throw new Throwable("params illegal: " + objArr);
                                        } else if ("gpnmmt".equals(str)) {
                                            return com.mob.tools.b.c.a(this.f56892a).d().U();
                                        } else {
                                            if ("gpnmfp".equals(str)) {
                                                if (objArr != null && objArr.length == 1) {
                                                    return com.mob.tools.b.c.a(this.f56892a).d().d((String) objArr[0]);
                                                }
                                                throw new Throwable("params illegal: " + objArr);
                                            } else if ("gia".equals(str)) {
                                                if (objArr != null && objArr.length == 1) {
                                                    return com.mob.tools.b.c.a(this.f56892a).d().a(((Boolean) objArr[0]).booleanValue(), false);
                                                }
                                                throw new Throwable("params illegal: " + objArr);
                                            } else if ("giafce".equals(str)) {
                                                if (objArr != null && objArr.length == 2) {
                                                    return com.mob.tools.b.c.a(this.f56892a).d().a(((Boolean) objArr[0]).booleanValue(), ((Boolean) objArr[1]).booleanValue());
                                                }
                                                throw new Throwable("params illegal: " + objArr);
                                            } else if ("gsl".equals(str)) {
                                                return com.mob.tools.b.c.a(this.f56892a).d().P();
                                            } else {
                                                if ("gscpt".equals(str)) {
                                                    return com.mob.tools.b.c.a(this.f56892a).d().R();
                                                }
                                                if ("gavti".equals(str)) {
                                                    return com.mob.tools.b.c.a(this.f56892a).d().j();
                                                }
                                                if ("glctn".equals(str)) {
                                                    if (objArr != null && objArr.length == 3) {
                                                        return com.mob.tools.b.c.a(this.f56892a).d().a(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Boolean) objArr[2]).booleanValue());
                                                    }
                                                    throw new Throwable("params illegal: " + objArr);
                                                } else if ("gtecloc".equals(str)) {
                                                    return com.mob.tools.b.c.a(this.f56892a).d().p();
                                                } else {
                                                    if ("gnbclin".equals(str)) {
                                                        return com.mob.tools.b.c.a(this.f56892a).d().q();
                                                    }
                                                    if ("gdvtp".equals(str)) {
                                                        return com.mob.tools.b.c.a(this.f56892a).d().o();
                                                    }
                                                    if ("wmcwi".equals(str)) {
                                                        return com.mob.tools.b.c.a(this.f56892a).d().r();
                                                    }
                                                    if ("ipgist".equals(str)) {
                                                        if (objArr != null && objArr.length == 1) {
                                                            return Boolean.valueOf(com.mob.tools.b.c.a(this.f56892a).d().b((String) objArr[0]));
                                                        }
                                                        throw new Throwable("params illegal: " + objArr);
                                                    } else if ("gcuin".equals(str)) {
                                                        return com.mob.tools.b.c.a(this.f56892a).d().w();
                                                    } else {
                                                        if ("gtydvin".equals(str)) {
                                                            return com.mob.tools.b.c.a(this.f56892a).d().x();
                                                        }
                                                        if ("gqmkn".equals(str)) {
                                                            return com.mob.tools.b.c.a(this.f56892a).d().y();
                                                        }
                                                        if ("gszin".equals(str)) {
                                                            return com.mob.tools.b.c.a(this.f56892a).d().z();
                                                        }
                                                        if ("gmrin".equals(str)) {
                                                            return com.mob.tools.b.c.a(this.f56892a).d().A();
                                                        }
                                                        if ("gmivsn".equals(str)) {
                                                            return com.mob.tools.b.c.a(this.f56892a).d().k();
                                                        }
                                                        if ("cx".equals(str)) {
                                                            return Boolean.valueOf(com.mob.tools.b.c.a(this.f56892a).d().b());
                                                        }
                                                        if ("ckpd".equals(str)) {
                                                            return Boolean.valueOf(com.mob.tools.b.c.a(this.f56892a).d().c());
                                                        }
                                                        if ("ubenbl".equals(str)) {
                                                            return Boolean.valueOf(com.mob.tools.b.c.a(this.f56892a).d().h());
                                                        }
                                                        if ("dvenbl".equals(str)) {
                                                            return Boolean.valueOf(com.mob.tools.b.c.a(this.f56892a).d().g());
                                                        }
                                                        if ("ckua".equals(str)) {
                                                            return Boolean.valueOf(com.mob.tools.b.c.a(this.f56892a).d().f());
                                                        }
                                                        if ("vnmt".equals(str)) {
                                                            return Boolean.valueOf(com.mob.tools.b.c.a(this.f56892a).d().e());
                                                        }
                                                        if ("degb".equals(str)) {
                                                            return Boolean.valueOf(com.mob.tools.b.c.a(this.f56892a).d().d());
                                                        }
                                                        if ("iwpxy".equals(str)) {
                                                            return Boolean.valueOf(com.mob.tools.b.c.a(this.f56892a).d().i());
                                                        }
                                                        if ("gflv".equals(str)) {
                                                            return com.mob.tools.b.c.a(this.f56892a).d().J();
                                                        }
                                                        if ("gbsbd".equals(str)) {
                                                            return com.mob.tools.b.c.a(this.f56892a).d().K();
                                                        }
                                                        if ("gbfspy".equals(str)) {
                                                            return com.mob.tools.b.c.a(this.f56892a).d().L();
                                                        }
                                                        if ("gbplfo".equals(str)) {
                                                            return com.mob.tools.b.c.a(this.f56892a).d().M();
                                                        }
                                                        if ("gdntp".equals(str)) {
                                                            return Integer.valueOf(com.mob.tools.b.c.a(this.f56892a).d().H());
                                                        }
                                                        if ("qritsvc".equals(str)) {
                                                            if (objArr != null && objArr.length == 2) {
                                                                int intValue4 = ((Integer) objArr[1]).intValue();
                                                                return com.mob.tools.b.c.a(this.f56892a).d().a((Intent) objArr[0], intValue4);
                                                            }
                                                            throw new Throwable("params illegal: " + objArr);
                                                        } else if ("rsaciy".equals(str)) {
                                                            if (objArr != null && objArr.length == 2) {
                                                                int intValue5 = ((Integer) objArr[1]).intValue();
                                                                return com.mob.tools.b.c.a(this.f56892a).d().b((Intent) objArr[0], intValue5);
                                                            }
                                                            throw new Throwable("params illegal: " + objArr);
                                                        } else if ("gpgif".equals(str)) {
                                                            if (objArr != null && objArr.length == 2) {
                                                                int intValue6 = ((Integer) objArr[1]).intValue();
                                                                return com.mob.tools.b.c.a(this.f56892a).d().a(false, 0, (String) objArr[0], intValue6);
                                                            }
                                                            throw new Throwable("params illegal: " + objArr);
                                                        } else if ("gpgiffcin".equals(str)) {
                                                            if (objArr != null && objArr.length == 3) {
                                                                int intValue7 = ((Integer) objArr[2]).intValue();
                                                                return com.mob.tools.b.c.a(this.f56892a).d().a(((Boolean) objArr[0]).booleanValue(), 0, (String) objArr[1], intValue7);
                                                            }
                                                            throw new Throwable("params illegal: " + objArr);
                                                        } else if ("gpgifstrg".equals(str)) {
                                                            if (objArr != null && objArr.length == 3) {
                                                                int intValue8 = ((Integer) objArr[2]).intValue();
                                                                return com.mob.tools.b.c.a(this.f56892a).d().a(false, ((Integer) objArr[0]).intValue(), (String) objArr[1], intValue8);
                                                            }
                                                            throw new Throwable("params illegal: " + objArr);
                                                        } else if ("giads".equals(str)) {
                                                            return com.mob.tools.b.c.a(this.f56892a).d().N();
                                                        } else {
                                                            if ("gdvda".equals(str)) {
                                                                return com.mob.tools.b.c.a(this.f56892a).d().ab();
                                                            }
                                                            if ("gdvdtnas".equals(str)) {
                                                                return com.mob.tools.b.c.a(this.f56892a).d().ac();
                                                            }
                                                            if ("galtut".equals(str)) {
                                                                return Long.valueOf(com.mob.tools.b.c.a(this.f56892a).d().ad());
                                                            }
                                                            if ("gdvme".equals(str)) {
                                                                return com.mob.tools.b.c.a(this.f56892a).d().ae();
                                                            }
                                                            if ("gcrup".equals(str)) {
                                                                return com.mob.tools.b.c.a(this.f56892a).d().af();
                                                            }
                                                            if ("gcifm".equals(str)) {
                                                                return com.mob.tools.b.c.a(this.f56892a).d().ag();
                                                            }
                                                            if ("godm".equals(str)) {
                                                                return com.mob.tools.b.c.a(this.f56892a).d().ah();
                                                            }
                                                            if ("godhm".equals(str)) {
                                                                return com.mob.tools.b.c.a(this.f56892a).d().ai();
                                                            }
                                                            if ("galdm".equals(str)) {
                                                                return com.mob.tools.b.c.a(this.f56892a).d().aj();
                                                            }
                                                            if ("gtaif".equals(str)) {
                                                                return com.mob.tools.b.c.a(this.f56892a).d().ak();
                                                            }
                                                            if ("gtaifprm".equals(str)) {
                                                                if (objArr != null && objArr.length == 2) {
                                                                    int intValue9 = ((Integer) objArr[1]).intValue();
                                                                    return com.mob.tools.b.c.a(this.f56892a).d().a((String) objArr[0], intValue9);
                                                                }
                                                                throw new Throwable("params illegal: " + objArr);
                                                            } else if ("gtaifprmfce".equals(str)) {
                                                                if (objArr != null && objArr.length == 3) {
                                                                    int intValue10 = ((Integer) objArr[2]).intValue();
                                                                    return com.mob.tools.b.c.a(this.f56892a).d().a(((Boolean) objArr[0]).booleanValue(), (String) objArr[1], intValue10);
                                                                }
                                                                throw new Throwable("params illegal: " + objArr);
                                                            } else if ("gtbdt".equals(str)) {
                                                                return Long.valueOf(com.mob.tools.b.c.a(this.f56892a).d().am());
                                                            } else {
                                                                if ("gtscnin".equals(str)) {
                                                                    return Double.valueOf(com.mob.tools.b.c.a(this.f56892a).d().an());
                                                                }
                                                                if ("gtscnppi".equals(str)) {
                                                                    return Integer.valueOf(com.mob.tools.b.c.a(this.f56892a).d().ao());
                                                                }
                                                                if ("ishmos".equals(str)) {
                                                                    return Boolean.valueOf(com.mob.tools.b.c.a(this.f56892a).d().ap());
                                                                }
                                                                if ("gthmosv".equals(str)) {
                                                                    return com.mob.tools.b.c.a(this.f56892a).d().aq();
                                                                }
                                                                if ("gthmosdtlv".equals(str)) {
                                                                    return com.mob.tools.b.c.a(this.f56892a).d().ar();
                                                                }
                                                                if ("gthmpmst".equals(str)) {
                                                                    return Integer.valueOf(com.mob.tools.b.c.a(this.f56892a).d().as());
                                                                }
                                                                if ("gthmepmst".equals(str)) {
                                                                    return Integer.valueOf(com.mob.tools.b.c.a(this.f56892a).d().at());
                                                                }
                                                                if ("gtinnerlangmt".equals(str)) {
                                                                    return com.mob.tools.b.c.a(this.f56892a).d().au();
                                                                }
                                                                if ("gtgramgendt".equals(str)) {
                                                                    return Integer.valueOf(com.mob.tools.b.c.a(this.f56892a).d().av());
                                                                }
                                                                if ("gtelcmefce".equals(str)) {
                                                                    return com.mob.tools.b.c.a(this.f56892a).d().a(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Boolean) objArr[2]).booleanValue(), ((Boolean) objArr[3]).booleanValue());
                                                                } else if ("gtmwfo".equals(str)) {
                                                                    return com.mob.tools.b.c.a(this.f56892a).d().e(false);
                                                                } else {
                                                                    if ("wmcwifce".equals(str)) {
                                                                        if (objArr != null && objArr.length == 1) {
                                                                            return com.mob.tools.b.c.a(this.f56892a).d().e(((Boolean) objArr[0]).booleanValue());
                                                                        }
                                                                        throw new Throwable("params illegal: " + objArr);
                                                                    } else if ("gtaifok".equals(str)) {
                                                                        return com.mob.tools.b.c.a(this.f56892a).d().al();
                                                                    } else {
                                                                        if ("gtmcdi".equals(str)) {
                                                                            return com.mob.tools.b.c.a(this.f56892a).d().a(false);
                                                                        }
                                                                        if ("gtmcdifce".equals(str)) {
                                                                            if (objArr != null && objArr.length == 1) {
                                                                                return com.mob.tools.b.c.a(this.f56892a).d().a(((Boolean) objArr[0]).booleanValue());
                                                                            }
                                                                            throw new Throwable("params illegal: " + objArr);
                                                                        } else if ("gtmbcdi".equals(str)) {
                                                                            return com.mob.tools.b.c.a(this.f56892a).d().b(false);
                                                                        } else {
                                                                            if ("gtmbcdifce".equals(str)) {
                                                                                if (objArr != null && objArr.length == 1) {
                                                                                    return com.mob.tools.b.c.a(this.f56892a).d().b(((Boolean) objArr[0]).booleanValue());
                                                                                }
                                                                                throw new Throwable("params illegal: " + objArr);
                                                                            } else if ("miwpy".equals(str)) {
                                                                                return Boolean.valueOf(com.mob.tools.b.c.a(this.f56892a).d().i());
                                                                            } else {
                                                                                if ("gtmnbclfo".equals(str)) {
                                                                                    return com.mob.tools.b.c.a(this.f56892a).d().q();
                                                                                }
                                                                                if ("ctedebbing".equals(str)) {
                                                                                    return Boolean.valueOf(com.mob.tools.b.c.a(this.f56892a).d().aw());
                                                                                }
                                                                                if ("gteacifo".equals(str)) {
                                                                                    return com.mob.tools.b.c.a(this.f56892a).d().ax();
                                                                                }
                                                                                if ("gtdm".equals(str)) {
                                                                                    if (objArr != null && objArr.length == 1) {
                                                                                        return com.mob.tools.b.c.a(this.f56892a).d().h(((Boolean) objArr[0]).booleanValue());
                                                                                    }
                                                                                    throw new Throwable("params illegal: " + objArr);
                                                                                } else if ("gtlstactme".equals(str)) {
                                                                                    if (objArr != null && objArr.length == 1) {
                                                                                        return Long.valueOf(com.mob.tools.b.c.a(this.f56892a).d().f((String) objArr[0]));
                                                                                    }
                                                                                    throw new Throwable("params illegal: " + objArr);
                                                                                } else {
                                                                                    return null;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* loaded from: classes5.dex */
    public static final class SyncMtd {
        public static String Base64AES(String str, String str2) {
            return Data.Base64AES(str, str2);
        }

        public static boolean checkPermission(String str) {
            return com.mob.tools.b.c.a(MobSDK.getContext()).d().e(str);
        }

        public static Object currentActivityThread() {
            return v.b();
        }

        public static String getAppLanguage() {
            return com.mob.tools.b.c.a(MobSDK.getContext()).d().B();
        }

        public static int getAppVersion() {
            return com.mob.tools.b.c.a(MobSDK.getContext()).d().V();
        }

        public static String getAppVersionName() {
            return com.mob.tools.b.c.a(MobSDK.getContext()).d().W();
        }

        public static Context getApplication() {
            return com.mob.tools.b.c.a(MobSDK.getContext()).d().aa();
        }

        public static String getBrand() {
            return com.mob.tools.b.c.a(MobSDK.getContext()).d().n();
        }

        public static String getCurrentProcessName() {
            return com.mob.tools.b.c.a(MobSDK.getContext()).d().Y();
        }

        public static String getManufacturer() {
            return com.mob.tools.b.c.a(MobSDK.getContext()).d().m();
        }

        public static String getModel() {
            return com.mob.tools.b.c.a(MobSDK.getContext()).d().l();
        }

        public static String getOSCountry() {
            return com.mob.tools.b.c.a(MobSDK.getContext()).d().v();
        }

        public static String getOSLanguage() {
            return com.mob.tools.b.c.a(MobSDK.getContext()).d().u();
        }

        public static int getOSVersionInt() {
            return com.mob.tools.b.c.a(MobSDK.getContext()).d().s();
        }

        public static String getOSVersionName() {
            return com.mob.tools.b.c.a(MobSDK.getContext()).d().t();
        }

        public static String getPackageName() {
            return com.mob.tools.b.c.a(MobSDK.getContext()).d().T();
        }

        public static int getPlatformCode() {
            return 1;
        }

        public static String getSandboxPath() {
            return com.mob.tools.b.c.a(MobSDK.getContext()).d().R();
        }

        public static String getSystemProperties(String str) {
            return com.mob.tools.b.c.a(MobSDK.getContext()).d().a(str);
        }

        public static Object getSystemServiceSafe(String str) {
            return v.d(str);
        }

        public static String getTimezone() {
            return com.mob.tools.b.c.a(MobSDK.getContext()).d().I();
        }

        public static void hideSoftInput(View view) {
            v.a(view);
        }

        public static <T> T invokeInstanceMethod(Object obj, String str, Object... objArr) {
            return (T) ReflectHelper.invokeInstanceMethodNoThrow(obj, str, null, objArr);
        }

        public static boolean isInMainProcess() {
            return com.mob.tools.b.c.a(MobSDK.getContext()).d().X();
        }

        public static void showSoftInput(View view) {
            v.b(view);
        }

        public static <T> T invokeInstanceMethod(Object obj, String str, Object[] objArr, Class<?>[] clsArr) {
            try {
                return (T) ReflectHelper.invokeInstanceMethod(obj, str, objArr, clsArr);
            } catch (Throwable th) {
                if (th instanceof InvocationTargetException) {
                    String name = th.getClass().getName();
                    String message = th.getMessage();
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        name = cause.getClass().getName();
                        message = cause.getMessage();
                    }
                    NLog mobLog = MobLog.getInstance();
                    mobLog.d("Exception: " + name + ": " + message, new Object[0]);
                    return null;
                } else if (th instanceof PackageManager.NameNotFoundException) {
                    NLog mobLog2 = MobLog.getInstance();
                    mobLog2.d("Exception: " + th.getClass().getName() + ": " + th.getMessage(), new Object[0]);
                    return null;
                } else {
                    MobLog.getInstance().d(th);
                    return null;
                }
            }
        }
    }

    public static RequestBuilder requester(Context context) {
        return new RequestBuilder(context);
    }
}
