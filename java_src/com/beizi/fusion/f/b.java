package com.beizi.fusion.f;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.beizi.fusion.b.d;
import com.beizi.fusion.g.af;
import com.beizi.fusion.g.au;
import com.beizi.fusion.g.y;
import com.beizi.fusion.model.AdSpacesBean;
import com.join.mgps.service.CommonService_;
import java.util.ArrayList;
import java.util.List;
/* compiled from: AdStrategy.java */
/* loaded from: classes2.dex */
public class b {
    public static List<AdSpacesBean.ForwardBean> a(AdSpacesBean.ComponentBean componentBean, List<AdSpacesBean.BuyerBean> list, String str) {
        String content;
        ArrayList arrayList = new ArrayList();
        if (componentBean == null || list == null || list.size() == 0 || (content = componentBean.getContent()) == null) {
            return arrayList;
        }
        char c5 = 65535;
        switch (content.hashCode()) {
            case -938285885:
                if (content.equals("random")) {
                    c5 = 0;
                    break;
                }
                break;
            case 3135262:
                if (content.equals("fail")) {
                    c5 = 1;
                    break;
                }
                break;
            case 3529469:
                if (content.equals(CommonService_.i0.f54387c)) {
                    c5 = 2;
                    break;
                }
                break;
            case 94750088:
                if (content.equals("click")) {
                    c5 = 3;
                    break;
                }
                break;
            case 1095692943:
                if (content.equals("request")) {
                    c5 = 4;
                    break;
                }
                break;
        }
        switch (c5) {
            case 0:
                a(componentBean, arrayList);
                break;
            case 1:
                a(componentBean, list, str, arrayList, "280.500");
                break;
            case 2:
                a(componentBean, list, str, arrayList, "280.300");
                break;
            case 3:
                a(componentBean, list, str, arrayList, "290.300");
                break;
            case 4:
                a(componentBean, list, str, arrayList, "200.000");
                break;
        }
        return arrayList;
    }

    private static boolean b(List<AdSpacesBean.RulesBean> list, int i4) {
        boolean z4;
        if (list == null) {
            return false;
        }
        if (list.size() == 0) {
            af.c("BeiZis", "enter rulesBeanList.size() == 0");
            z4 = true;
        } else {
            z4 = false;
        }
        for (int i5 = 0; i5 < list.size(); i5++) {
            if (a(list.get(i5), i4)) {
                return true;
            }
        }
        return z4;
    }

    private static String c(String str) {
        af.a("BeiZis", "enter convertSelfChannel buyerId = " + str);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return au.b().equals(str) ? "BEIZI" : str;
    }

    public static String b(String str) {
        if (str == null) {
            return null;
        }
        if (au.b().equalsIgnoreCase(str) || "BEIZI".equalsIgnoreCase(str)) {
            return "6666";
        }
        char c5 = 65535;
        switch (str.hashCode()) {
            case -2130632690:
                if (str.equals("INMOBI")) {
                    c5 = 0;
                    break;
                }
                break;
            case -2114267227:
                if (str.equals("JADYUN")) {
                    c5 = 1;
                    break;
                }
                break;
            case -1935975824:
                if (str.equals("FinalLink")) {
                    c5 = 2;
                    break;
                }
                break;
            case -416293903:
                if (str.equals("ADSCOPE")) {
                    c5 = 3;
                    break;
                }
                break;
            case 2278:
                if (str.equals("GM")) {
                    c5 = 4;
                    break;
                }
                break;
            case 67034:
                if (str.equals("CSJ")) {
                    c5 = 5;
                    break;
                }
                break;
            case 70423:
                if (str.equals("GDT")) {
                    c5 = 6;
                    break;
                }
                break;
            case 76672:
                if (str.equals("MTG")) {
                    c5 = 7;
                    break;
                }
                break;
            case 62961147:
                if (str.equals("BAIDU")) {
                    c5 = '\b';
                    break;
                }
                break;
            case 615517703:
                if (str.equals("GDT_NST")) {
                    c5 = '\t';
                    break;
                }
                break;
            case 1780672330:
                if (str.equals("CSJ_NST")) {
                    c5 = '\n';
                    break;
                }
                break;
            case 1921014029:
                if (str.equals("KUAISHOU")) {
                    c5 = 11;
                    break;
                }
                break;
            case 2141820391:
                if (str.equals("HUAWEI")) {
                    c5 = '\f';
                    break;
                }
                break;
        }
        switch (c5) {
            case 0:
                return "1011";
            case 1:
                return "1021";
            case 2:
                return "6668";
            case 3:
                return "8888";
            case 4:
                return "1022";
            case 5:
                return "1013";
            case 6:
                return "1012";
            case 7:
                return "1023";
            case '\b':
                return "1018";
            case '\t':
                return "1016";
            case '\n':
                return "1017";
            case 11:
                return "1019";
            case '\f':
                return "1020";
            default:
                return null;
        }
    }

    private static void a(AdSpacesBean.ComponentBean componentBean, List<AdSpacesBean.BuyerBean> list, String str, List<AdSpacesBean.ForwardBean> list2, String str2) {
        af.c("BeiZis", "enter handleSpaceStrategyByEvent eventCode = " + str2);
        List<AdSpacesBean.ForwardBean> forward = componentBean.getForward();
        if (forward == null || forward.size() <= 0) {
            return;
        }
        int a5 = y.a(str, str2);
        if (!str2.equalsIgnoreCase("200.000")) {
            a5++;
        }
        for (int i4 = 0; i4 < forward.size(); i4++) {
            AdSpacesBean.ForwardBean forwardBean = forward.get(i4);
            for (int i5 = 0; i5 < list.size(); i5++) {
                AdSpacesBean.BuyerBean buyerBean = list.get(i5);
                if (buyerBean.getId() != null && buyerBean.getId().equalsIgnoreCase(forwardBean.getBuyerId()) && buyerBean.getBuyerSpaceUuId() != null && buyerBean.getBuyerSpaceUuId().equalsIgnoreCase(forwardBean.getBuyerSpaceUuId())) {
                    af.c("BeiZis", forwardBean.getBuyerId() + " handleSpaceRequestStrategy buyerBean match");
                    if (b(forwardBean.getRules(), a5)) {
                        af.c("BeiZis", forwardBean.getBuyerId() + " enter rulesMatch");
                        list2.add(forwardBean);
                    }
                }
            }
        }
    }

    protected static void a(AdSpacesBean.ComponentBean componentBean, List<AdSpacesBean.ForwardBean> list) {
        List<AdSpacesBean.ForwardBean> forward = componentBean.getForward();
        int random = (int) ((Math.random() * 100.0d) + 1.0d);
        af.a("BeiZis", "AdForward random:" + random);
        if (forward == null || forward.size() <= 0) {
            return;
        }
        int size = forward.size();
        for (int i4 = 0; i4 < size; i4++) {
            AdSpacesBean.ForwardBean forwardBean = forward.get(i4);
            List<AdSpacesBean.RulesBean> rules = forwardBean.getRules();
            if (rules != null && rules.size() > 0) {
                int size2 = rules.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    Integer[] results = rules.get(i5).getResults();
                    if (results != null && results.length >= 2) {
                        int intValue = results[0].intValue();
                        int intValue2 = results[1].intValue();
                        if (intValue <= random && random <= intValue2) {
                            list.add(forwardBean);
                        }
                    }
                }
            }
        }
    }

    private static boolean a(AdSpacesBean.RulesBean rulesBean, int i4) {
        boolean z4 = false;
        if (rulesBean == null) {
            return false;
        }
        try {
            String formula = rulesBean.getFormula();
            String replace = formula.replace("x", i4 + "");
            int a5 = c.a(replace);
            Integer[] results = rulesBean.getResults();
            af.c("BeiZis", "formulaOrig = " + replace + ",isOneRuleMatch holderNum = " + i4);
            if (results != null && results.length >= 2) {
                af.c("BeiZis", "formulaResult = " + a5 + ",results[0] = " + results[0] + ",results[1] = " + results[1]);
                if (a5 >= results[0].intValue() && a5 <= results[1].intValue()) {
                    z4 = true;
                }
            }
            return rulesBean.getRules() != null ? z4 & b(rulesBean.getRules(), i4) : z4;
        } catch (Exception unused) {
            af.c("BeiZis", "execute formula error!");
            return z4;
        }
    }

    public static void a(Context context, long j4, AdSpacesBean.FilterBean filterBean, d dVar, String str, String str2, String str3, com.beizi.fusion.d.a aVar) {
        boolean z4;
        boolean z5;
        if (dVar != null) {
            af.a("BeiZis", "channel = " + str2 + ",observer.mPlatformFilterStatus.getStatus() = " + dVar.f6577c.a() + ",observer.mChannelFilterStatus.getStatus(channelId) = " + dVar.f6579e.a(str2));
        }
        boolean z6 = true;
        boolean z7 = !TextUtils.isEmpty(str2);
        if (dVar == null || !(dVar.f6577c.a() == 1 || dVar.f6579e.a(str2) == 2)) {
            if (dVar != null) {
                if (z7) {
                    dVar.f6579e.a(str2, -2);
                    return;
                } else {
                    dVar.f6577c.a(-2);
                    return;
                }
            } else if (aVar == null || z7) {
                return;
            } else {
                aVar.a("status not PlatformFilterStatus.kPlatformFilterStatusBegin");
                return;
            }
        }
        boolean z8 = false;
        if (filterBean != null) {
            List<String> privilege = filterBean.getPrivilege();
            boolean a5 = (privilege == null || privilege.size() <= 0) ? true : a(context, privilege);
            z5 = j4 > ((long) filterBean.getMinAdLoadTime());
            try {
                z6 = y.a(filterBean.getFrequency(), str, c(str2), str3);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            z4 = z6;
            z6 = a5;
        } else {
            if (z7) {
                dVar.f6579e.a(str2, 3);
            } else {
                dVar.f6577c.a(2);
            }
            z4 = true;
            z8 = true;
            z5 = true;
        }
        if (!z6) {
            if (z7) {
                dVar.f6579e.a(str2, 5);
            } else {
                dVar.f6577c.a(4);
            }
        }
        if (!z5) {
            if (z7) {
                dVar.f6579e.a(str2, 6);
            } else {
                dVar.f6577c.a(5);
            }
        }
        if (!z4) {
            if (z7) {
                dVar.f6579e.a(str2, 7);
            } else {
                dVar.f6577c.a(6);
            }
        }
        if (!z8 && z6 && z5 && z4) {
            if (z7) {
                dVar.f6579e.a(str2, 3);
            } else {
                dVar.f6577c.a(2);
            }
        }
    }

    public static int a(String str) {
        String b5;
        if (str == null || (b5 = b(str)) == null) {
            return -1;
        }
        return Integer.parseInt(b5);
    }

    private static boolean a(Context context, List<String> list) {
        PackageManager packageManager = context.getPackageManager();
        String packageName = context.getPackageName();
        for (String str : list) {
            if (-1 == packageManager.checkPermission(str, packageName)) {
                StringBuilder sb = new StringBuilder();
                sb.append("required permission not granted . permission = ");
                sb.append(str);
                return false;
            }
        }
        return true;
    }

    public static AdSpacesBean.BuyerBean a(String str, List<AdSpacesBean.BuyerBean> list, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append("buyerBeans != null ? ");
        sb.append(list != null);
        af.c("BeiZis", sb.toString());
        if (list != null) {
            af.c("BeiZis", "buyerBeans.size() = " + list.size());
        }
        if (list == null || list.size() <= 0) {
            return null;
        }
        for (int i4 = 0; i4 < list.size(); i4++) {
            AdSpacesBean.BuyerBean buyerBean = list.get(i4);
            af.c("BeiZis", "AdBuyer buyerBean.getUuid() = " + buyerBean.getBuyerSpaceUuId());
            if (buyerBean.getId() != null && buyerBean.getId().equals(str) && str2 != null && str2.equalsIgnoreCase(buyerBean.getBuyerSpaceUuId())) {
                return buyerBean;
            }
        }
        return null;
    }

    public static String a(List<AdSpacesBean.BuyerBean.RenderRulesBean> list, int i4) {
        Integer[] results;
        if (list == null) {
            return null;
        }
        try {
            if (list.size() == 0) {
                return null;
            }
            for (int i5 = 0; i5 < list.size(); i5++) {
                AdSpacesBean.BuyerBean.RenderRulesBean renderRulesBean = list.get(i5);
                if (renderRulesBean != null && (results = renderRulesBean.getResults()) != null && results.length >= 2 && i4 >= results[0].intValue() && i4 <= results[1].intValue()) {
                    String type = renderRulesBean.getType();
                    af.c("BeiZis", "type = " + type + ";holderNum:" + i4);
                    return type;
                }
            }
            return null;
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }
}
