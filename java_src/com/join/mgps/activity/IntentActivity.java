package com.join.mgps.activity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import com.BaseActivity;
import com.join.android.app.common.utils.JsonMapper;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentDateBean;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.activity.MGMainActivity_;
import com.join.mgps.dto.IntentDataMain;
import com.join.mgps.dto.PapayOrder;
import java.net.URLDecoder;
/* loaded from: classes4.dex */
public class IntentActivity extends BaseActivity {
    public boolean isLogined(Context context) {
        com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(context).getAccountData();
        return accountData != null && com.join.mgps.Util.g2.i(accountData.getToken());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IntentDataMain intentDataMain;
        IntentDateBean intentDateBean;
        super.onCreate(bundle);
        Intent intent = getIntent();
        boolean z4 = true;
        if ("android.intent.action.VIEW".equals(intent.getAction())) {
            IntentDateBean intentDateBean2 = new IntentDateBean();
            intentDateBean2.setLink_type(3);
            intentDateBean2.setJump_type(1);
            try {
                Uri data = intent.getData();
                if (data != null) {
                    String queryParameter = data.getQueryParameter("link_type");
                    String queryParameter2 = data.getQueryParameter("jump_type");
                    String queryParameter3 = data.getQueryParameter("link_type_val");
                    String queryParameter4 = data.getQueryParameter("crc_link_type_val");
                    String queryParameter5 = data.getQueryParameter("tpl_type");
                    String queryParameter6 = data.getQueryParameter("object");
                    intentDateBean2.setLink_type(Integer.parseInt(queryParameter));
                    intentDateBean2.setJump_type(Integer.parseInt(queryParameter2));
                    intentDateBean2.setLink_type_val(queryParameter3);
                    intentDateBean2.setCrc_link_type_val(URLDecoder.decode(queryParameter4));
                    intentDateBean2.setTpl_type(queryParameter5);
                    intentDateBean2.setObject(queryParameter6);
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            IntentUtil.getInstance().checkAndStartMain(this, intentDateBean2, 335544320);
        } else if ("application/com.join.mgps.activity.mgmainactivity_".equals(intent.getAction())) {
            ((MGMainActivity_.q3) MGMainActivity_.A2(this).flags(536870912)).start();
        } else if ("com.papa.intent.activity.view.action.emuintent".equals(intent.getAction())) {
            IntentUtil.getInstance().intentActivity(this, (IntentDateBean) JsonMapper.getInstance().fromJson(getIntent().getStringExtra("intentDataJson"), IntentDateBean.class));
        } else {
            String stringExtra = getIntent().getStringExtra("intentDataJsonV3");
            if (com.join.mgps.Util.g2.h(stringExtra)) {
                intentDateBean = (IntentDateBean) JsonMapper.getInstance().fromJson(getIntent().getStringExtra("intentDataJson"), IntentDateBean.class);
                AccountUtil_.getInstance_(this).getAccountData();
                intentDataMain = null;
            } else {
                IntentDataMain intentDataMain2 = (IntentDataMain) JsonMapper.getInstance().fromJson(stringExtra, IntentDataMain.class);
                IntentDateBean intentDateBean3 = intentDataMain2.getIntentDateBean();
                b3.a.a(intentDataMain2.getAccountBean());
                z4 = false;
                intentDataMain = intentDataMain2;
                intentDateBean = intentDateBean3;
            }
            Object object = intentDateBean != null ? intentDateBean.getObject() : null;
            if (object instanceof String) {
                String str = (String) object;
                if (str.equals("payStart")) {
                    if (z4) {
                        if (IntentUtil.getInstance().goLoginInteractive(this)) {
                            return;
                        }
                        PayStartActivity_.z0(this).start();
                        finish();
                        return;
                    }
                    PayStartActivity_.z0(this).a(intentDataMain).start();
                    finish();
                    return;
                } else if (str.equals("payNow")) {
                    if (intentDataMain != null) {
                        PayNowActivity_.L0(this).c((PapayOrder) JsonMapper.getInstance().fromJson(intentDataMain.getData(), PapayOrder.class)).b(intentDataMain).start();
                        finish();
                        return;
                    }
                } else if (intentDataMain != null) {
                    IntentDateBean intentDateBean4 = intentDataMain.getIntentDateBean();
                    String data2 = intentDataMain.getData();
                    if (com.join.mgps.Util.g2.i(data2)) {
                        saveSdkIntentData(intentDataMain.getAppkey(), data2);
                    }
                    if (4 == intentDateBean4.getLink_type()) {
                        ShareWebActivity_.t2(this).b(intentDateBean4).a(intentDataMain).start();
                        finish();
                        return;
                    }
                }
            }
            IntentUtil.getInstance().intentActivity(this, intentDateBean);
        }
        finish();
    }

    public void saveSdkIntentData(String str, String str2) {
        SharedPreferences.Editor edit = getSharedPreferences("Papa_Stat_SharedPreferences", 0).edit();
        edit.putString("papasdk_" + str, str2);
        edit.commit();
    }
}
