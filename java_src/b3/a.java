package b3;

import com.join.mgps.Util.g2;
import com.join.mgps.dto.AccountBean;
import com.umeng.analytics.pro.bm;
import com.wufan.user.service.protobuf.h;
import com.wufan.user.service.protobuf.n0;
import org.json.JSONObject;
/* compiled from: BeanUtil.java */
/* loaded from: classes6.dex */
public class a {
    public static n0 a(AccountBean accountBean) {
        n0.b f5 = n0.f5();
        f5.p4(accountBean.getUid());
        f5.F3(accountBean.getAccount());
        f5.e4(f5.O1());
        f5.i4(accountBean.getRegisterTime());
        f5.K3(accountBean.getAvatarSrc());
        if (g2.i(accountBean.getExp())) {
            f5.M3(Integer.parseInt(accountBean.getExp()));
        }
        f5.V3(accountBean.getLevel());
        if (g2.i(accountBean.getSurplusExp())) {
            f5.m4(Integer.parseInt(accountBean.getSurplusExp()));
        }
        f5.c4(accountBean.getNickname());
        f5.a4(accountBean.getMobile());
        f5.f4(accountBean.getPay_top_tip());
        f5.P3(accountBean.getGender());
        f5.n4(accountBean.getToken());
        f5.h4(accountBean.getPwd_set_up());
        f5.H3(accountBean.getAccount_type());
        f5.s4(accountBean.getVip_level());
        f5.s4(accountBean.getSvip_level());
        f5.q4(accountBean.getVip_exp_time());
        f5.W3(accountBean.getLive_total_charm());
        f5.Q3(accountBean.getIs_anchor());
        if (accountBean.getMember_title() != null) {
            h.b g32 = h.g3();
            g32.X2(accountBean.getMember_title().getBattleTitle());
            g32.b3(accountBean.getLevel());
            g32.Z2(accountBean.getMember_title().getBattleTitleColor());
            f5.Y3(g32);
        }
        f5.U3(accountBean.getIs_real_name());
        if (g2.i(accountBean.getSecretKey())) {
            f5.k4(accountBean.getSecretKey());
        } else {
            f5.k4(b(accountBean.getUid(), accountBean.getToken(), accountBean.getVip_level()));
        }
        f5.X3(accountBean.getMember_time());
        return f5.build();
    }

    private static String b(int i4, String str, int i5) {
        try {
            JSONObject jSONObject = new JSONObject();
            String e5 = com.join.mgps.Util.a.e(System.currentTimeMillis() + "|" + i5);
            jSONObject.put("uid", i4);
            jSONObject.put("token", str);
            jSONObject.put(bm.aM, e5);
            return com.join.mgps.Util.a.e(jSONObject.toString());
        } catch (Exception e6) {
            e6.printStackTrace();
            return "";
        }
    }
}
