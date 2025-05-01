package com.join.mgps.Util;

import android.content.Context;
import android.content.Intent;
import android.os.Environment;
import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.ShareSDK;
import cn.sharesdk.sina.weibo.SinaWeibo;
import cn.sharesdk.tencent.qq.QQ;
import cn.sharesdk.wechat.friends.Wechat;
import com.join.android.app.common.utils.JsonMapper;
import com.join.mgps.db.tables.TokenTable;
import com.join.mgps.dto.AccountBean;
import com.join.mgps.pref.PrefDef_;
import external.org.apache.commons.lang3.ObjectUtils;
import org.androidannotations.annotations.EBean;
import org.androidannotations.annotations.sharedpreferences.Pref;
/* compiled from: AccountUtil.java */
@EBean(scope = EBean.Scope.Singleton)
/* loaded from: classes3.dex */
public class b {
    private static final String TAG = "b";
    @Pref
    PrefDef_ prefDef;

    /*  JADX ERROR: NullPointerException in pass: RegionMakerVisitor
        java.lang.NullPointerException
        	at java.base/java.util.BitSet.or(BitSet.java:941)
        	at jadx.core.utils.BlockUtils.getPathCross(BlockUtils.java:732)
        	at jadx.core.utils.BlockUtils.getPathCross(BlockUtils.java:811)
        	at jadx.core.dex.visitors.regions.IfMakerHelper.restructureIf(IfMakerHelper.java:88)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:706)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:155)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:730)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:155)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    public static boolean piv(com.wufan.user.service.protobuf.n0 r6) {
        /*
            r0 = 0
            if (r6 == 0) goto L6c
            java.lang.String r1 = r6.G()
            boolean r1 = com.join.mgps.Util.g2.h(r1)
            if (r1 == 0) goto Le
            goto L6c
        Le:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> L6c
            java.lang.String r2 = r6.G()     // Catch: java.lang.Exception -> L6c
            java.lang.String r2 = com.join.mgps.Util.a.b(r2)     // Catch: java.lang.Exception -> L6c
            r1.<init>(r2)     // Catch: java.lang.Exception -> L6c
            java.lang.String r2 = "uid"
            int r2 = r1.optInt(r2)     // Catch: java.lang.Exception -> L6c
            java.lang.String r3 = "token"
            java.lang.String r3 = r1.optString(r3)     // Catch: java.lang.Exception -> L6c
            java.lang.String r4 = "t"
            java.lang.String r1 = r1.optString(r4)     // Catch: java.lang.Exception -> L6c
            java.lang.String r1 = com.join.mgps.Util.a.b(r1)     // Catch: java.lang.Exception -> L6c
            r4 = 2
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch: java.lang.Exception -> L6c
            boolean r5 = com.join.mgps.Util.g2.i(r1)     // Catch: java.lang.Exception -> L6c
            if (r5 == 0) goto L43
            java.lang.String r4 = "\\|"
            java.lang.String[] r4 = r1.split(r4)     // Catch: java.lang.Exception -> L6c
        L43:
            int r1 = r6.getUid()     // Catch: java.lang.Exception -> L6c
            r5 = 1
            if (r2 != r1) goto L6c
            java.lang.String r6 = r6.getToken()     // Catch: java.lang.Exception -> L6c
            boolean r6 = r3.equals(r6)     // Catch: java.lang.Exception -> L6c
            if (r6 == 0) goto L6c
            int r6 = r4.length     // Catch: java.lang.Exception -> L6c
            if (r6 <= r5) goto L6c
            r6 = r4[r5]     // Catch: java.lang.Exception -> L6c
            boolean r6 = com.join.mgps.Util.g2.i(r6)     // Catch: java.lang.Exception -> L6c
            if (r6 == 0) goto L6c
            r6 = r4[r5]     // Catch: java.lang.Exception -> L6c
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Exception -> L6c
            int r6 = r6.intValue()     // Catch: java.lang.Exception -> L6c
            if (r6 <= 0) goto L6c
            r0 = 1
        L6c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.Util.b.piv(com.wufan.user.service.protobuf.n0):boolean");
    }

    public static String vl(String str) {
        if (g2.h(str)) {
            return "0";
        }
        String[] strArr = new String[2];
        if (g2.i(str)) {
            strArr = str.split("\\|");
        }
        return (strArr == null || strArr.length <= 1) ? "0" : strArr[1];
    }

    public void accountLoginOut(Context context) {
        com.join.mgps.rpc.h.N = null;
        this.prefDef.accountDataV3().g("");
        Platform platform = ShareSDK.getPlatform(Wechat.NAME);
        if (platform.isAuthValid()) {
            platform.removeAccount(true);
        }
        Platform platform2 = ShareSDK.getPlatform(QQ.NAME);
        if (platform2.isAuthValid()) {
            platform2.removeAccount(true);
        }
        Platform platform3 = ShareSDK.getPlatform(SinaWeibo.NAME);
        if (platform3.isAuthValid()) {
            platform3.removeAccount(true);
        }
        Intent intent = new Intent();
        intent.setAction(o1.a.f72022r);
        context.sendBroadcast(intent);
        j0.N();
        j0.g1();
        com.wufan.friend.chat.c.u().M();
        q0.e(context);
    }

    public com.wufan.user.service.protobuf.n0 getAccountData() {
        try {
            com.wufan.user.service.protobuf.n0 n0Var = com.join.mgps.rpc.h.N;
            if (n0Var != null) {
                return (com.wufan.user.service.protobuf.n0) ObjectUtils.b(n0Var);
            }
            String d5 = this.prefDef.accountDataV3().d();
            if (g2.i(d5)) {
                com.wufan.user.service.protobuf.n0 p5 = com.wufan.user.service.protobuf.n0.p5(AESUtils.decryptBuf(d5));
                com.join.mgps.rpc.h.N = p5;
                return p5;
            }
            String d6 = this.prefDef.accountDataV2().d();
            if (g2.i(d6)) {
                AccountBean accountBean = (AccountBean) JsonMapper.getInstance().fromJson(AESUtils.decrypt(d6), AccountBean.class);
                this.prefDef.accountDataV2().g("");
                com.wufan.user.service.protobuf.n0 n0Var2 = null;
                if (accountBean != null) {
                    n0Var2 = b3.a.a(accountBean);
                    com.join.mgps.rpc.h.N = n0Var2;
                }
                if (n0Var2 != null) {
                    this.prefDef.accountDataV3().g(AESUtils.e(n0Var2.toByteArray()));
                }
                return n0Var2;
            }
            String d7 = this.prefDef.accountData().d();
            if (g2.i(d7)) {
                AccountBean accountBean2 = (AccountBean) JsonMapper.getInstance().fromJson(AESUtils.decrypt(d7), AccountBean.class);
                this.prefDef.accountData().g("");
                if (accountBean2 != null) {
                    com.wufan.user.service.protobuf.n0 a5 = b3.a.a(accountBean2);
                    com.join.mgps.rpc.h.N = a5;
                    if (a5 != null) {
                        this.prefDef.accountDataV3().g(AESUtils.e(a5.toByteArray()));
                    }
                    return a5;
                }
            }
            return com.wufan.user.service.protobuf.n0.f5().build();
        } catch (Exception e5) {
            e5.printStackTrace();
            return com.wufan.user.service.protobuf.n0.f5().build();
        }
    }

    public AccountBean getAccountFromeSdcard() {
        try {
            return (AccountBean) JsonMapper.getInstance().fromJson(AESUtils.decrypt(g0.y(Environment.getExternalStorageDirectory() + "/wufan91/paysdk/.accountV2")), AccountBean.class);
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    public String getAccountStr() {
        return this.prefDef.accountDataV3().d();
    }

    public String getLocalUserIcon() {
        return this.prefDef.localUserIcon().d();
    }

    public String getToken() {
        com.wufan.user.service.protobuf.n0 accountData = getAccountData();
        return accountData == null ? "0" : accountData.getToken();
    }

    public String getUid() {
        com.wufan.user.service.protobuf.n0 accountData = getAccountData();
        if (accountData == null) {
            return "0";
        }
        return accountData.getUid() + "";
    }

    public boolean isTourist() {
        com.wufan.user.service.protobuf.n0 accountData = getAccountData();
        return accountData != null && accountData.n2() == 2;
    }

    public void saveAccountData(com.wufan.user.service.protobuf.n0 n0Var, Context context) {
        if (n0Var == null) {
            return;
        }
        com.wufan.user.service.protobuf.n0 accountData = getAccountData();
        TokenTable o4 = b2.l0.p().o(n0Var.getUid());
        if (o4 == null) {
            o4 = new TokenTable();
            o4.setUid(n0Var.getUid());
        }
        o4.setToken(n0Var.getToken());
        b2.l0.p().m(o4);
        byte[] byteArray = n0Var.toByteArray();
        if (byteArray == null) {
            return;
        }
        com.join.mgps.rpc.h.N = n0Var;
        UtilsMy.R(context);
        if (n0Var.n2() == 2) {
            this.prefDef.touriseTUID().g(Long.valueOf(n0Var.getUid()));
        }
        String e5 = AESUtils.e(byteArray);
        this.prefDef.accountDataV3().g(e5);
        com.join.mgps.broadcast.a.b(context, e5);
        com.join.mgps.broadcast.a.a(context);
        if (accountData == null || accountData.getUid() != n0Var.getUid()) {
            com.join.mgps.broadcast.a.c(context);
        }
        if (isTourist()) {
            return;
        }
        q0.d(context);
    }

    public void setLocalUserIcon(String str) {
        this.prefDef.localUserIcon().g(str);
    }
}
