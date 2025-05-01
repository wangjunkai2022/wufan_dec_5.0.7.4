package com.join.android.app.mgsim.wufun.wxapi;

import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import cn.sharesdk.wechat.utils.WXAppExtendObject;
import cn.sharesdk.wechat.utils.WXMediaMessage;
import cn.sharesdk.wechat.utils.WechatHandlerActivity;
import com.join.mgps.Util.IntentDateBean;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.g2;
import com.switfpass.pay.utils.e;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgram;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.IWXAPIEventHandler;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;
import java.net.URLDecoder;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class WXEntryActivity extends WechatHandlerActivity implements IWXAPIEventHandler {

    /* renamed from: b  reason: collision with root package name */
    private IWXAPI f27237b;

    /* loaded from: classes3.dex */
    class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ IntentDateBean f27238b;

        a(IntentDateBean intentDateBean) {
            this.f27238b = intentDateBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            IntentUtil.getInstance().checkAndStartMain(WXEntryActivity.this, this.f27238b, 603979776);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cn.sharesdk.wechat.utils.WechatHandlerActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        IWXAPI createWXAPI = WXAPIFactory.createWXAPI(this, e.f61860a, false);
        this.f27237b = createWXAPI;
        try {
            createWXAPI.handleIntent(getIntent(), this);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    @Override // cn.sharesdk.wechat.utils.WechatHandlerActivity
    public void onGetMessageFromWXReq(WXMediaMessage wXMediaMessage) {
        if (wXMediaMessage != null) {
            startActivity(getPackageManager().getLaunchIntentForPackage(getPackageName()));
        }
    }

    @Override // com.tencent.mm.opensdk.openapi.IWXAPIEventHandler
    public void onReq(BaseReq baseReq) {
    }

    @Override // com.tencent.mm.opensdk.openapi.IWXAPIEventHandler
    public void onResp(BaseResp baseResp) {
        if (baseResp.getType() == 19) {
            String str = ((WXLaunchMiniProgram.Resp) baseResp).extMsg;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("  xxxxxxxxxxxxxx");
        }
    }

    @Override // cn.sharesdk.wechat.utils.WechatHandlerActivity
    public void onShowMessageFromWXReq(WXMediaMessage wXMediaMessage) {
        WXMediaMessage.IMediaObject iMediaObject;
        WXAppExtendObject wXAppExtendObject;
        if (wXMediaMessage == null || (iMediaObject = wXMediaMessage.mediaObject) == null || !(iMediaObject instanceof WXAppExtendObject) || (wXAppExtendObject = (WXAppExtendObject) iMediaObject) == null) {
            return;
        }
        String str = wXAppExtendObject.extInfo;
        if (g2.i(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("type") && jSONObject.optInt("type") == 1 && jSONObject.has("data")) {
                    String string = jSONObject.getString("data");
                    if (g2.i(string)) {
                        Uri parse = Uri.parse(string);
                        IntentDateBean intentDateBean = new IntentDateBean();
                        intentDateBean.setLink_type(3);
                        intentDateBean.setJump_type(1);
                        if (parse != null) {
                            try {
                                String queryParameter = parse.getQueryParameter("link_type");
                                String queryParameter2 = parse.getQueryParameter("jump_type");
                                String queryParameter3 = parse.getQueryParameter("link_type_val");
                                String queryParameter4 = parse.getQueryParameter("crc_link_type_val");
                                String queryParameter5 = parse.getQueryParameter("tpl_type");
                                String queryParameter6 = parse.getQueryParameter("object");
                                intentDateBean.setLink_type(Integer.parseInt(queryParameter));
                                intentDateBean.setJump_type(Integer.parseInt(queryParameter2));
                                intentDateBean.setLink_type_val(queryParameter3);
                                intentDateBean.setCrc_link_type_val(URLDecoder.decode(queryParameter4));
                                intentDateBean.setTpl_type(queryParameter5);
                                intentDateBean.setObject(queryParameter6);
                            } catch (Exception e5) {
                                e5.printStackTrace();
                            }
                        }
                        new Handler().postDelayed(new a(intentDateBean), 500L);
                    }
                }
            } catch (Exception e6) {
                e6.printStackTrace();
            }
        }
    }
}
