package cn.sharesdk.tencent.qzone.utils;

import android.content.Intent;
import android.os.Bundle;
import cn.sharesdk.framework.authorize.SSOAuthorizeActivity;
import cn.sharesdk.framework.authorize.SSOListener;
import com.mob.MobSDK;
import com.mob.tools.utils.DH;
import org.json.JSONObject;
/* compiled from: QZoneSSOProcessor.java */
/* loaded from: classes2.dex */
public class c extends cn.sharesdk.framework.authorize.c {

    /* renamed from: d  reason: collision with root package name */
    private String f1276d;

    /* renamed from: e  reason: collision with root package name */
    private String f1277e;

    public c(SSOAuthorizeActivity sSOAuthorizeActivity) {
        super(sSOAuthorizeActivity);
    }

    static /* synthetic */ SSOAuthorizeActivity l(c cVar) {
        return cVar.f955a;
    }

    static /* synthetic */ SSOListener m(c cVar) {
        return cVar.f957c;
    }

    static /* synthetic */ SSOListener n(c cVar) {
        return cVar.f957c;
    }

    public void a(String str, String str2) {
        this.f1276d = str;
        this.f1277e = str2;
    }

    @Override // cn.sharesdk.framework.authorize.c
    public void a() {
        final Intent intent = new Intent();
        intent.setClassName("com.tencent.mobileqq", "com.tencent.open.agent.AgentActivity");
        DH.requester(MobSDK.getContext()).getPInfoForce(true, "com.tencent.mobileqq", 0).resolveActivity(intent, 0).request(new DH.DHResponder() { // from class: cn.sharesdk.tencent.qzone.utils.c.1
            @Override // com.mob.tools.utils.DH.DHResponder
            public void onResponse(DH.DHResponse dHResponse) {
                try {
                    if (dHResponse.getPInfoForce(new int[0]) == null) {
                        ((cn.sharesdk.framework.authorize.c) c.this).f955a.finish();
                        if (((cn.sharesdk.framework.authorize.c) c.this).f957c != null) {
                            ((cn.sharesdk.framework.authorize.c) c.this).f957c.onFailed(new TencentSSOClientNotInstalledException());
                        }
                    } else if (dHResponse.resolveActivity(new int[0]) == null) {
                        ((cn.sharesdk.framework.authorize.c) c.this).f955a.finish();
                        if (((cn.sharesdk.framework.authorize.c) c.this).f957c != null) {
                            ((cn.sharesdk.framework.authorize.c) c.this).f957c.onFailed(new TencentSSOClientNotInstalledException());
                        }
                    } else {
                        Bundle bundle = new Bundle();
                        bundle.putString("scope", c.this.f1277e);
                        bundle.putString("client_id", c.this.f1276d);
                        bundle.putString("pf", "openmobile_android");
                        bundle.putString("need_pay", "1");
                        intent.putExtra("key_params", bundle);
                        intent.putExtra("key_request_code", ((cn.sharesdk.framework.authorize.c) c.this).f956b);
                        intent.putExtra("key_action", "action_login");
                        ((cn.sharesdk.framework.authorize.c) c.this).f955a.startActivityForResult(intent, ((cn.sharesdk.framework.authorize.c) c.this).f956b);
                    }
                } catch (Throwable th) {
                    ((cn.sharesdk.framework.authorize.c) c.this).f955a.finish();
                    if (((cn.sharesdk.framework.authorize.c) c.this).f957c != null) {
                        ((cn.sharesdk.framework.authorize.c) c.this).f957c.onFailed(th);
                    }
                }
            }
        });
    }

    @Override // cn.sharesdk.framework.authorize.c
    public void a(int i4, int i5, Intent intent) {
        this.f955a.finish();
        if (i5 == 0) {
            SSOListener sSOListener = this.f957c;
            if (sSOListener != null) {
                sSOListener.onCancel();
            }
        } else if (intent == null) {
            SSOListener sSOListener2 = this.f957c;
            if (sSOListener2 != null) {
                sSOListener2.onFailed(new Throwable("response is empty"));
            }
        } else {
            Bundle extras = intent.getExtras();
            if (extras == null) {
                SSOListener sSOListener3 = this.f957c;
                if (sSOListener3 != null) {
                    sSOListener3.onFailed(new Throwable("response is empty"));
                }
            } else if (!extras.containsKey("key_response")) {
                SSOListener sSOListener4 = this.f957c;
                if (sSOListener4 != null) {
                    sSOListener4.onFailed(new Throwable("response is empty"));
                }
            } else {
                String string = extras.getString("key_response");
                if (string != null && string.length() > 0) {
                    try {
                        JSONObject jSONObject = new JSONObject(string);
                        Bundle bundle = new Bundle();
                        bundle.putInt("ret", jSONObject.optInt("ret"));
                        bundle.putString("pay_token", jSONObject.optString("pay_token"));
                        bundle.putString("pf", jSONObject.optString("pf"));
                        bundle.putString("open_id", jSONObject.optString("openid"));
                        bundle.putString("expires_in", jSONObject.optString("expires_in"));
                        bundle.putString("pfkey", jSONObject.optString("pfkey"));
                        bundle.putString("msg", jSONObject.optString("msg"));
                        bundle.putString("access_token", jSONObject.optString("access_token"));
                        SSOListener sSOListener5 = this.f957c;
                        if (sSOListener5 != null) {
                            sSOListener5.onComplete(bundle);
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        SSOListener sSOListener6 = this.f957c;
                        if (sSOListener6 != null) {
                            sSOListener6.onFailed(th);
                            return;
                        }
                        return;
                    }
                }
                SSOListener sSOListener7 = this.f957c;
                if (sSOListener7 != null) {
                    sSOListener7.onFailed(new Throwable("response is empty"));
                }
            }
        }
    }
}
