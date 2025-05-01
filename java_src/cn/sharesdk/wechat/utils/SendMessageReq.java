package cn.sharesdk.wechat.utils;

import android.os.Bundle;
import cn.sharesdk.framework.utils.SSDKLog;
import cn.sharesdk.wechat.utils.WXMediaMessage;
/* loaded from: classes2.dex */
public class SendMessageReq extends m {

    /* renamed from: a  reason: collision with root package name */
    public WXMediaMessage f1298a;

    /* renamed from: b  reason: collision with root package name */
    public int f1299b;

    /* renamed from: c  reason: collision with root package name */
    public String f1300c;

    /* renamed from: d  reason: collision with root package name */
    public IWXSceneDataObject f1301d;

    /* loaded from: classes2.dex */
    public interface IWXSceneDataObject {
        boolean checkArgs();

        int getJumpType();

        void serialize(Bundle bundle);

        void unserialize(Bundle bundle);
    }

    @Override // cn.sharesdk.wechat.utils.m
    public int a() {
        return 2;
    }

    @Override // cn.sharesdk.wechat.utils.m
    public void a(Bundle bundle) {
        super.a(bundle);
        this.f1298a = WXMediaMessage.a.a(bundle);
        this.f1299b = bundle.getInt("_wxapi_sendmessagetowx_req_scene");
        this.f1300c = bundle.getString("_wxapi_sendmessagetowx_req_use_open_id");
        if (bundle.getString("_scene_data_object_identifie") != null) {
            try {
                IWXSceneDataObject iWXSceneDataObject = (IWXSceneDataObject) Class.forName(bundle.getString("_scene_data_object_identifie")).newInstance();
                this.f1301d = iWXSceneDataObject;
                iWXSceneDataObject.unserialize(bundle);
            } catch (ClassNotFoundException e5) {
                e5.printStackTrace();
            } catch (IllegalAccessException e6) {
                e6.printStackTrace();
            } catch (InstantiationException e7) {
                e7.printStackTrace();
            }
        }
    }

    @Override // cn.sharesdk.wechat.utils.m
    public void b(Bundle bundle) {
        super.b(bundle);
        bundle.putAll(WXMediaMessage.a.a(this.f1298a));
        bundle.putInt("_wxapi_sendmessagetowx_req_scene", this.f1299b);
        bundle.putInt("_wxapi_sendmessagetowx_req_media_type", this.f1298a.getType());
        bundle.putString("_wxapi_sendmessagetowx_req_use_open_id", this.f1300c);
        IWXSceneDataObject iWXSceneDataObject = this.f1301d;
        if (iWXSceneDataObject != null) {
            bundle.putString("_scene_data_object_identifier", iWXSceneDataObject.getClass().getName());
            this.f1301d.serialize(bundle);
        }
    }

    @Override // cn.sharesdk.wechat.utils.m
    public boolean b() {
        int type = this.f1298a.getType();
        WXMediaMessage wXMediaMessage = this.f1298a;
        if (wXMediaMessage == null) {
            SSDKLog.b().a("MicroMsg.SDK.SendMessageToWX.Req", "checkArgs fail ,message is null");
            return false;
        }
        if (type == 6 && this.f1299b == 2) {
            ((WXFileObject) wXMediaMessage.mediaObject).setContentLengthLimit(26214400);
        }
        int i4 = this.f1299b;
        if (i4 == 3 && this.f1300c == null) {
            SSDKLog.b().a("MicroMsg.SDK.SendMessageToWX.Req", "Send specifiedContact userOpenId can not be null.");
            return false;
        } else if (i4 == 3 && this.f1415f == null) {
            SSDKLog.b().a("MicroMsg.SDK.SendMessageToWX.Req", "Send specifiedContact openid can not be null.");
            return false;
        } else if (i4 != 4) {
            return this.f1298a.a();
        } else {
            if (this.f1301d == null) {
                SSDKLog.b().a("MicroMsg.SDK.SendMessageToWX.Req", "checkArgs fail, sceneDataObject is null");
                return false;
            } else if (this.f1298a.getType() == 1) {
                return this.f1301d.checkArgs();
            } else {
                return this.f1298a.a() && this.f1301d.checkArgs();
            }
        }
    }
}
