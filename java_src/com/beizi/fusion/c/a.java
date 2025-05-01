package com.beizi.fusion.c;

import android.content.Context;
import android.text.TextUtils;
import com.beizi.fusion.model.AdSpacesBean;
import com.beizi.fusion.model.Manager;
import com.beizi.fusion.model.ResponseInfo;
import java.util.List;
/* compiled from: ChannelUtil.java */
/* loaded from: classes2.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static int f6594a;

    public static AdSpacesBean a(Context context, String str, String str2) {
        if (context != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            ResponseInfo responseInfo = ResponseInfo.getInstance(context);
            if (!responseInfo.isInit()) {
                responseInfo.init();
            }
            Manager manager = responseInfo.getManager();
            if (manager != null) {
                List<AdSpacesBean> adSpaces = manager.getAdSpaces();
                if (adSpaces != null && adSpaces.size() > 0) {
                    for (int i4 = 0; i4 < adSpaces.size(); i4++) {
                        AdSpacesBean adSpacesBean = adSpaces.get(i4);
                        if (str.equals(adSpacesBean.getSpaceId())) {
                            return adSpacesBean;
                        }
                    }
                }
                a(2);
                return null;
            }
            a(1);
        }
        return null;
    }

    public static int a() {
        int i4 = f6594a;
        a(0);
        return i4;
    }

    public static void a(int i4) {
        f6594a = i4;
    }
}
