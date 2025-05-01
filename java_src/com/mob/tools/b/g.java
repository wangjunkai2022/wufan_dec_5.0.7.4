package com.mob.tools.b;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ResolveInfo;
import android.location.Location;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
/* loaded from: classes5.dex */
public class g implements a {

    /* renamed from: a  reason: collision with root package name */
    private Context f56680a;

    public g(Context context) {
        this.f56680a = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0075, code lost:
        if (r3 != java.lang.Boolean.TYPE) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x007c, code lost:
        if (r3 != java.lang.Integer.TYPE) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0087, code lost:
        if (r3 != java.lang.Byte.TYPE) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0090, code lost:
        if (r3 != java.lang.Character.TYPE) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0099, code lost:
        if (r3 != java.lang.Short.TYPE) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00a2, code lost:
        if (r3 != java.lang.Long.TYPE) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00ad, code lost:
        if (r3 != java.lang.Float.TYPE) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00b7, code lost:
        if (r3 != java.lang.Double.TYPE) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00bf, code lost:
        return (T) java.lang.Double.valueOf(0.0d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:?, code lost:
        return (T) java.lang.Boolean.FALSE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:?, code lost:
        return (T) (-1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:?, code lost:
        return (T) (byte) 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:?, code lost:
        return (T) 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:?, code lost:
        return (T) 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:?, code lost:
        return (T) 0L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:?, code lost:
        return (T) java.lang.Float.valueOf(0.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:?, code lost:
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private <T> T a(java.lang.Class<T> r3, java.lang.Object r4) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L71
            if (r4 == 0) goto L71
            java.lang.Class<java.lang.Void> r1 = java.lang.Void.class
            if (r3 != r1) goto Lb
            goto L71
        Lb:
            java.lang.Class r1 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L69
            if (r3 != r1) goto L17
            java.lang.Class<java.lang.Boolean> r1 = java.lang.Boolean.class
            java.lang.Object r4 = r1.cast(r4)     // Catch: java.lang.Throwable -> L69
        L15:
            r0 = r4
            goto L71
        L17:
            java.lang.Class r1 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L69
            if (r3 != r1) goto L22
            java.lang.Class<java.lang.Integer> r1 = java.lang.Integer.class
            java.lang.Object r4 = r1.cast(r4)     // Catch: java.lang.Throwable -> L69
            goto L15
        L22:
            java.lang.Class r1 = java.lang.Byte.TYPE     // Catch: java.lang.Throwable -> L69
            if (r3 != r1) goto L2d
            java.lang.Class<java.lang.Byte> r1 = java.lang.Byte.class
            java.lang.Object r4 = r1.cast(r4)     // Catch: java.lang.Throwable -> L69
            goto L15
        L2d:
            java.lang.Class r1 = java.lang.Character.TYPE     // Catch: java.lang.Throwable -> L69
            if (r3 != r1) goto L38
            java.lang.Class<java.lang.Character> r1 = java.lang.Character.class
            java.lang.Object r4 = r1.cast(r4)     // Catch: java.lang.Throwable -> L69
            goto L15
        L38:
            java.lang.Class r1 = java.lang.Short.TYPE     // Catch: java.lang.Throwable -> L69
            if (r3 != r1) goto L43
            java.lang.Class<java.lang.Short> r1 = java.lang.Short.class
            java.lang.Object r4 = r1.cast(r4)     // Catch: java.lang.Throwable -> L69
            goto L15
        L43:
            java.lang.Class r1 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> L69
            if (r3 != r1) goto L4e
            java.lang.Class<java.lang.Long> r1 = java.lang.Long.class
            java.lang.Object r4 = r1.cast(r4)     // Catch: java.lang.Throwable -> L69
            goto L15
        L4e:
            java.lang.Class r1 = java.lang.Float.TYPE     // Catch: java.lang.Throwable -> L69
            if (r3 != r1) goto L59
            java.lang.Class<java.lang.Float> r1 = java.lang.Float.class
            java.lang.Object r4 = r1.cast(r4)     // Catch: java.lang.Throwable -> L69
            goto L15
        L59:
            java.lang.Class r1 = java.lang.Double.TYPE     // Catch: java.lang.Throwable -> L69
            if (r3 != r1) goto L64
            java.lang.Class<java.lang.Double> r1 = java.lang.Double.class
            java.lang.Object r4 = r1.cast(r4)     // Catch: java.lang.Throwable -> L69
            goto L15
        L64:
            java.lang.Object r4 = r3.cast(r4)     // Catch: java.lang.Throwable -> L69
            goto L15
        L69:
            r4 = move-exception
            com.mob.tools.log.NLog r1 = com.mob.tools.MobLog.getInstance()
            r1.d(r4)
        L71:
            if (r0 != 0) goto Lbf
            java.lang.Class r4 = java.lang.Boolean.TYPE
            if (r3 != r4) goto L7a
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            goto Lbf
        L7a:
            java.lang.Class r4 = java.lang.Integer.TYPE
            if (r3 != r4) goto L84
            r3 = -1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            goto Lbf
        L84:
            java.lang.Class r4 = java.lang.Byte.TYPE
            r1 = 0
            if (r3 != r4) goto L8e
            java.lang.Byte r0 = java.lang.Byte.valueOf(r1)
            goto Lbf
        L8e:
            java.lang.Class r4 = java.lang.Character.TYPE
            if (r3 != r4) goto L97
            java.lang.Character r0 = java.lang.Character.valueOf(r1)
            goto Lbf
        L97:
            java.lang.Class r4 = java.lang.Short.TYPE
            if (r3 != r4) goto La0
            java.lang.Short r0 = java.lang.Short.valueOf(r1)
            goto Lbf
        La0:
            java.lang.Class r4 = java.lang.Long.TYPE
            if (r3 != r4) goto Lab
            r3 = 0
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            goto Lbf
        Lab:
            java.lang.Class r4 = java.lang.Float.TYPE
            if (r3 != r4) goto Lb5
            r3 = 0
            java.lang.Float r0 = java.lang.Float.valueOf(r3)
            goto Lbf
        Lb5:
            java.lang.Class r4 = java.lang.Double.TYPE
            if (r3 != r4) goto Lbf
            r3 = 0
            java.lang.Double r0 = java.lang.Double.valueOf(r3)
        Lbf:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mob.tools.b.g.a(java.lang.Class, java.lang.Object):java.lang.Object");
    }

    @Override // com.mob.tools.b.a
    public HashMap<String, Long> A() {
        return (HashMap) a(HashMap.class, com.mob.tools.c.a.a("gmrin", null));
    }

    @Override // com.mob.tools.b.a
    public String B() {
        return (String) a(String.class, com.mob.tools.c.a.a("galgu", null));
    }

    @Override // com.mob.tools.b.a
    public String C() {
        return (String) a(String.class, com.mob.tools.c.a.a("gscsz", null));
    }

    @Override // com.mob.tools.b.a
    public String D() {
        return (String) a(String.class, com.mob.tools.c.a.a("gneypnw", null));
    }

    @Override // com.mob.tools.b.a
    public String E() {
        return (String) a(String.class, com.mob.tools.c.a.a("gnktpfs", null));
    }

    @Override // com.mob.tools.b.a
    public String F() {
        return (String) a(String.class, com.mob.tools.c.a.a("gdtlnktpfs", null));
    }

    @Override // com.mob.tools.b.a
    public boolean G() {
        return ((Boolean) a(Boolean.TYPE, com.mob.tools.c.a.a("cknavbl", null))).booleanValue();
    }

    @Override // com.mob.tools.b.a
    public int H() {
        return ((Integer) a(Integer.TYPE, com.mob.tools.c.a.a("gdntp", null))).intValue();
    }

    @Override // com.mob.tools.b.a
    public String I() {
        return (String) a(String.class, com.mob.tools.c.a.a("gtmne", null));
    }

    @Override // com.mob.tools.b.a
    public String J() {
        return (String) a(String.class, com.mob.tools.c.a.a("gflv", null));
    }

    @Override // com.mob.tools.b.a
    public String K() {
        return (String) a(String.class, com.mob.tools.c.a.a("gbsbd", null));
    }

    @Override // com.mob.tools.b.a
    public String L() {
        return (String) a(String.class, com.mob.tools.c.a.a("gbfspy", null));
    }

    @Override // com.mob.tools.b.a
    public String M() {
        return (String) a(String.class, com.mob.tools.c.a.a("gbplfo", null));
    }

    @Override // com.mob.tools.b.a
    public String N() {
        return (String) a(String.class, com.mob.tools.c.a.a("giads", null));
    }

    @Override // com.mob.tools.b.a
    public ArrayList<HashMap<String, String>> O() {
        return (ArrayList) a(ArrayList.class, com.mob.tools.c.a.a("gal", null));
    }

    @Override // com.mob.tools.b.a
    public ArrayList<HashMap<String, String>> P() {
        return (ArrayList) a(ArrayList.class, com.mob.tools.c.a.a("gsl", null));
    }

    @Override // com.mob.tools.b.a
    public String Q() {
        return (String) a(String.class, com.mob.tools.c.a.a("gdvk", null));
    }

    @Override // com.mob.tools.b.a
    public String R() {
        return (String) a(String.class, com.mob.tools.c.a.a("gscpt", null));
    }

    @Override // com.mob.tools.b.a
    public String S() {
        return (String) a(String.class, com.mob.tools.c.a.a("gsnmd", null));
    }

    @Override // com.mob.tools.b.a
    public String T() {
        return (String) a(String.class, com.mob.tools.c.a.a("gpgnm", null));
    }

    @Override // com.mob.tools.b.a
    public String U() {
        return (String) a(String.class, com.mob.tools.c.a.a("gpnmmt", null));
    }

    @Override // com.mob.tools.b.a
    public int V() {
        return ((Integer) a(Integer.TYPE, com.mob.tools.c.a.a("gpvsnm", null))).intValue();
    }

    @Override // com.mob.tools.b.a
    public String W() {
        return (String) a(String.class, com.mob.tools.c.a.a("gpvsme", null));
    }

    @Override // com.mob.tools.b.a
    public boolean X() {
        return ((Boolean) a(Boolean.TYPE, com.mob.tools.c.a.a("cinmnps", null))).booleanValue();
    }

    @Override // com.mob.tools.b.a
    public String Y() {
        return (String) a(String.class, com.mob.tools.c.a.a("gcrtpcnm", null));
    }

    @Override // com.mob.tools.b.a
    public boolean Z() {
        return ((Boolean) a(Boolean.TYPE, com.mob.tools.c.a.a("ciafgd", null))).booleanValue();
    }

    @Override // com.mob.tools.b.a
    public Context aa() {
        return (Context) a(Context.class, com.mob.tools.c.a.a("gaplcn", null));
    }

    @Override // com.mob.tools.b.a
    public String ab() {
        return (String) a(String.class, com.mob.tools.c.a.a("gdvda", null));
    }

    @Override // com.mob.tools.b.a
    public String ac() {
        return (String) a(String.class, com.mob.tools.c.a.a("gdvdtnas", null));
    }

    @Override // com.mob.tools.b.a
    public long ad() {
        return ((Long) a(Long.TYPE, com.mob.tools.c.a.a("galtut", null))).longValue();
    }

    @Override // com.mob.tools.b.a
    public String ae() {
        return (String) a(String.class, com.mob.tools.c.a.a("gdvme", null));
    }

    @Override // com.mob.tools.b.a
    public String af() {
        return (String) a(String.class, com.mob.tools.c.a.a("gcrup", null));
    }

    @Override // com.mob.tools.b.a
    public String ag() {
        return (String) a(String.class, com.mob.tools.c.a.a("gcifm", null));
    }

    @Override // com.mob.tools.b.a
    public String ah() {
        return (String) a(String.class, com.mob.tools.c.a.a("godm", null));
    }

    @Override // com.mob.tools.b.a
    public String ai() {
        return (String) a(String.class, com.mob.tools.c.a.a("godhm", null));
    }

    @Override // com.mob.tools.b.a
    public HashMap<String, Object> aj() {
        return (HashMap) a(HashMap.class, com.mob.tools.c.a.a("galdm", null));
    }

    @Override // com.mob.tools.b.a
    public ApplicationInfo ak() {
        return (ApplicationInfo) a(ApplicationInfo.class, com.mob.tools.c.a.a("gtaif", null));
    }

    @Override // com.mob.tools.b.a
    public ArrayList<HashMap<String, Object>> al() {
        return (ArrayList) a(ArrayList.class, com.mob.tools.c.a.a("gtaifok", null));
    }

    @Override // com.mob.tools.b.a
    public long am() {
        return ((Long) a(Long.TYPE, com.mob.tools.c.a.a("gtbdt", null))).longValue();
    }

    @Override // com.mob.tools.b.a
    public double an() {
        return ((Double) a(Double.TYPE, com.mob.tools.c.a.a("gtscnin", null))).doubleValue();
    }

    @Override // com.mob.tools.b.a
    public int ao() {
        return ((Integer) a(Integer.TYPE, com.mob.tools.c.a.a("gtscnppi", null))).intValue();
    }

    @Override // com.mob.tools.b.a
    public boolean ap() {
        return ((Boolean) a(Boolean.TYPE, com.mob.tools.c.a.a("ishmos", null))).booleanValue();
    }

    @Override // com.mob.tools.b.a
    public String aq() {
        return (String) a(String.class, com.mob.tools.c.a.a("gthmosv", null));
    }

    @Override // com.mob.tools.b.a
    public String ar() {
        return (String) a(String.class, com.mob.tools.c.a.a("gthmosdtlv", null));
    }

    @Override // com.mob.tools.b.a
    public int as() {
        return ((Integer) a(Integer.TYPE, com.mob.tools.c.a.a("gthmpmst", null))).intValue();
    }

    @Override // com.mob.tools.b.a
    public int at() {
        return ((Integer) a(Integer.TYPE, com.mob.tools.c.a.a("gthmepmst", null))).intValue();
    }

    @Override // com.mob.tools.b.a
    public String au() {
        return (String) a(String.class, com.mob.tools.c.a.a("gtinnerlangmt", null));
    }

    @Override // com.mob.tools.b.a
    public int av() {
        return ((Integer) a(Integer.TYPE, com.mob.tools.c.a.a("gtgramgendt", null))).intValue();
    }

    @Override // com.mob.tools.b.a
    public boolean aw() {
        return ((Boolean) a(Boolean.TYPE, com.mob.tools.c.a.a("ctedebbing", null))).booleanValue();
    }

    @Override // com.mob.tools.b.a
    public ArrayList<HashMap<String, Object>> ax() {
        return (ArrayList) a(ArrayList.class, com.mob.tools.c.a.a("gteacifo", null));
    }

    @Override // com.mob.tools.b.a
    public boolean b() {
        return ((Boolean) a(Boolean.TYPE, com.mob.tools.c.a.a("cx", null))).booleanValue();
    }

    @Override // com.mob.tools.b.a
    public boolean c() {
        return ((Boolean) a(Boolean.TYPE, com.mob.tools.c.a.a("ckpd", null))).booleanValue();
    }

    @Override // com.mob.tools.b.a
    public boolean d() {
        return ((Boolean) a(Boolean.TYPE, com.mob.tools.c.a.a("degb", null))).booleanValue();
    }

    @Override // com.mob.tools.b.a
    public boolean e() {
        return ((Boolean) a(Boolean.TYPE, com.mob.tools.c.a.a("vnmt", null))).booleanValue();
    }

    @Override // com.mob.tools.b.a
    public boolean f() {
        return ((Boolean) a(Boolean.TYPE, com.mob.tools.c.a.a("ckua", null))).booleanValue();
    }

    @Override // com.mob.tools.b.a
    public boolean g() {
        return ((Boolean) a(Boolean.TYPE, com.mob.tools.c.a.a("dvenbl", null))).booleanValue();
    }

    @Override // com.mob.tools.b.a
    public boolean h() {
        return ((Boolean) a(Boolean.TYPE, com.mob.tools.c.a.a("ubenbl", null))).booleanValue();
    }

    @Override // com.mob.tools.b.a
    public boolean i() {
        return ((Boolean) a(Boolean.TYPE, com.mob.tools.c.a.a("iwpxy", null))).booleanValue();
    }

    @Override // com.mob.tools.b.a
    public String j() {
        return (String) a(String.class, com.mob.tools.c.a.a("gavti", null));
    }

    @Override // com.mob.tools.b.a
    public String k() {
        return (String) a(String.class, com.mob.tools.c.a.a("gmivsn", null));
    }

    @Override // com.mob.tools.b.a
    public String l() {
        return (String) a(String.class, com.mob.tools.c.a.a("bgmdl", null));
    }

    @Override // com.mob.tools.b.a
    public String m() {
        return (String) a(String.class, com.mob.tools.c.a.a("gmnft", null));
    }

    @Override // com.mob.tools.b.a
    public String n() {
        return (String) a(String.class, com.mob.tools.c.a.a("gbrd", null));
    }

    @Override // com.mob.tools.b.a
    public String o() {
        return (String) a(String.class, com.mob.tools.c.a.a("gdvtp", null));
    }

    @Override // com.mob.tools.b.a
    public Object p() {
        return a(Object.class, com.mob.tools.c.a.a("gtecloc", null));
    }

    @Override // com.mob.tools.b.a
    public ArrayList<HashMap<String, Object>> q() {
        return (ArrayList) a(ArrayList.class, com.mob.tools.c.a.a("gnbclin", null));
    }

    @Override // com.mob.tools.b.a
    public HashMap<String, Object> r() {
        return e(false);
    }

    @Override // com.mob.tools.b.a
    public int s() {
        return ((Integer) a(Integer.TYPE, com.mob.tools.c.a.a("govsit", null))).intValue();
    }

    @Override // com.mob.tools.b.a
    public String t() {
        return (String) a(String.class, com.mob.tools.c.a.a("govsnm", null));
    }

    @Override // com.mob.tools.b.a
    public String u() {
        return (String) a(String.class, com.mob.tools.c.a.a("golgu", null));
    }

    @Override // com.mob.tools.b.a
    public String v() {
        return (String) a(String.class, com.mob.tools.c.a.a("gocnty", null));
    }

    @Override // com.mob.tools.b.a
    public HashMap<String, Object> w() {
        return (HashMap) a(HashMap.class, com.mob.tools.c.a.a("gcuin", null));
    }

    @Override // com.mob.tools.b.a
    public ArrayList<ArrayList<String>> x() {
        return (ArrayList) a(ArrayList.class, com.mob.tools.c.a.a("gtydvin", null));
    }

    @Override // com.mob.tools.b.a
    public String y() {
        return (String) a(String.class, com.mob.tools.c.a.a("gqmkn", null));
    }

    @Override // com.mob.tools.b.a
    public HashMap<String, HashMap<String, Long>> z() {
        return (HashMap) a(HashMap.class, com.mob.tools.c.a.a("gszin", null));
    }

    @Override // com.mob.tools.b.a
    public String b(boolean z4) {
        return (String) a(String.class, com.mob.tools.c.a.a("gbsifce", new ArrayList(Arrays.asList(Boolean.valueOf(z4)))));
    }

    @Override // com.mob.tools.b.a
    public String c(boolean z4) {
        return (String) a(String.class, com.mob.tools.c.a.a("gcriefce", new ArrayList(Arrays.asList(Boolean.valueOf(z4)))));
    }

    @Override // com.mob.tools.b.a
    public String d(boolean z4) {
        return (String) a(String.class, com.mob.tools.c.a.a("gcrnmfce", new ArrayList(Arrays.asList(Boolean.valueOf(z4)))));
    }

    @Override // com.mob.tools.b.a
    public HashMap<String, Object> e(boolean z4) {
        return (HashMap) a(HashMap.class, com.mob.tools.c.a.a("wmcwifce", new ArrayList(Arrays.asList(Boolean.valueOf(z4)))));
    }

    @Override // com.mob.tools.b.a
    public String f(boolean z4) {
        return (String) a(String.class, com.mob.tools.c.a.a("gneypfce", new ArrayList(Arrays.asList(Boolean.valueOf(z4)))));
    }

    @Override // com.mob.tools.b.a
    public String g(boolean z4) {
        return (String) a(String.class, com.mob.tools.c.a.a("gdvkfc", new ArrayList(Arrays.asList(Boolean.valueOf(z4)))));
    }

    @Override // com.mob.tools.b.a
    public String h(boolean z4) {
        return (String) a(String.class, com.mob.tools.c.a.a("gtdm", new ArrayList(Arrays.asList(Boolean.valueOf(z4)))));
    }

    @Override // com.mob.tools.b.a
    public boolean b(String str) {
        return ((Boolean) a(Boolean.TYPE, com.mob.tools.c.a.a("ipgist", new ArrayList(Arrays.asList(str))))).booleanValue();
    }

    @Override // com.mob.tools.b.a
    public String c(String str) {
        return (String) a(String.class, com.mob.tools.c.a.a("gsnmdfp", new ArrayList(Arrays.asList(str))));
    }

    @Override // com.mob.tools.b.a
    public String d(String str) {
        return (String) a(String.class, com.mob.tools.c.a.a("gpnmfp", new ArrayList(Arrays.asList(str))));
    }

    @Override // com.mob.tools.b.a
    public boolean e(String str) {
        return ((Boolean) a(Boolean.TYPE, com.mob.tools.c.a.a("ckpmsi", new ArrayList(Arrays.asList(str))))).booleanValue();
    }

    @Override // com.mob.tools.b.a
    public long f(String str) {
        return ((Long) a(Long.TYPE, com.mob.tools.c.a.a("gtlstactme", new ArrayList(Arrays.asList(str))))).longValue();
    }

    @Override // com.mob.tools.b.a
    public ResolveInfo b(Intent intent, int i4) {
        return (ResolveInfo) a(ResolveInfo.class, com.mob.tools.c.a.a("rsaciy", new ArrayList(Arrays.asList(intent, Integer.valueOf(i4)))));
    }

    @Override // com.mob.tools.b.a
    public Object b(boolean z4, int i4, String str, int i5) {
        return a(PackageInfo.class, com.mob.tools.c.a.a("gmpfis", new ArrayList(Arrays.asList(Boolean.valueOf(z4), Integer.valueOf(i4), str, Integer.valueOf(i5)))));
    }

    @Override // com.mob.tools.b.a
    public boolean a() {
        return ((Boolean) a(Boolean.TYPE, com.mob.tools.c.a.a("cird", null))).booleanValue();
    }

    @Override // com.mob.tools.b.a
    public String a(boolean z4) {
        return (String) a(String.class, com.mob.tools.c.a.a("gsimtfce", new ArrayList(Arrays.asList(Boolean.valueOf(z4)))));
    }

    @Override // com.mob.tools.b.a
    public ArrayList<HashMap<String, String>> a(boolean z4, boolean z5) {
        return (ArrayList) a(ArrayList.class, com.mob.tools.c.a.a("giafce", new ArrayList(Arrays.asList(Boolean.valueOf(z4), Boolean.valueOf(z5)))));
    }

    @Override // com.mob.tools.b.a
    public Location a(int i4, int i5, boolean z4) {
        return (Location) a(Location.class, com.mob.tools.c.a.a("glctn", new ArrayList(Arrays.asList(Integer.valueOf(i4), Integer.valueOf(i5), Boolean.valueOf(z4)))));
    }

    @Override // com.mob.tools.b.a
    public String a(String str) {
        return (String) a(String.class, com.mob.tools.c.a.a("gstmpts", new ArrayList(Arrays.asList(str))));
    }

    @Override // com.mob.tools.b.a
    public List<ResolveInfo> a(Intent intent, int i4) {
        return (List) a(List.class, com.mob.tools.c.a.a("qritsvc", new ArrayList(Arrays.asList(intent, Integer.valueOf(i4)))));
    }

    @Override // com.mob.tools.b.a
    public PackageInfo a(boolean z4, int i4, String str, int i5) {
        return (PackageInfo) a(PackageInfo.class, com.mob.tools.c.a.a("gpgiffist", new ArrayList(Arrays.asList(Boolean.valueOf(z4), Integer.valueOf(i4), str, Integer.valueOf(i5)))));
    }

    @Override // com.mob.tools.b.a
    public ApplicationInfo a(String str, int i4) {
        return (ApplicationInfo) a(ApplicationInfo.class, com.mob.tools.c.a.a("gtaifprm", new ArrayList(Arrays.asList(str, Integer.valueOf(i4)))));
    }

    @Override // com.mob.tools.b.a
    public ApplicationInfo a(boolean z4, String str, int i4) {
        return (ApplicationInfo) a(ApplicationInfo.class, com.mob.tools.c.a.a("gtaifprmfce", new ArrayList(Arrays.asList(Boolean.valueOf(z4), str, Integer.valueOf(i4)))));
    }

    @Override // com.mob.tools.b.a
    public List a(int i4, int i5, boolean z4, boolean z5) {
        return (List) a(List.class, com.mob.tools.c.a.a("gtelcmefce", new ArrayList(Arrays.asList(Integer.valueOf(i4), Integer.valueOf(i5), Boolean.valueOf(z4), Boolean.valueOf(z5)))));
    }
}
