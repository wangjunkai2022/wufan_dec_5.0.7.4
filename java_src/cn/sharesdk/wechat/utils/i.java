package cn.sharesdk.wechat.utils;

import android.os.Bundle;
import cn.sharesdk.framework.utils.SSDKLog;
/* compiled from: WXLaunchMiniProgram.java */
/* loaded from: classes2.dex */
public class i {

    /* compiled from: WXLaunchMiniProgram.java */
    /* loaded from: classes2.dex */
    public static final class b extends WechatResp {

        /* renamed from: a  reason: collision with root package name */
        public String f1339a;

        public b(Bundle bundle) {
            a(bundle);
        }

        @Override // cn.sharesdk.wechat.utils.WechatResp
        public final int a() {
            return 19;
        }

        @Override // cn.sharesdk.wechat.utils.WechatResp
        public final void a(Bundle bundle) {
            super.a(bundle);
            this.f1339a = bundle.getString("_launch_wxminiprogram_ext_msg");
        }

        @Override // cn.sharesdk.wechat.utils.WechatResp
        public final void b(Bundle bundle) {
            super.b(bundle);
            bundle.putString("_launch_wxminiprogram_ext_msg", this.f1339a);
        }
    }

    /* compiled from: WXLaunchMiniProgram.java */
    /* loaded from: classes2.dex */
    public static final class a extends m {

        /* renamed from: a  reason: collision with root package name */
        public String f1335a;

        /* renamed from: b  reason: collision with root package name */
        public String f1336b = "";

        /* renamed from: c  reason: collision with root package name */
        public int f1337c = 0;

        /* renamed from: d  reason: collision with root package name */
        public String f1338d = "";

        @Override // cn.sharesdk.wechat.utils.m
        public final int a() {
            return 19;
        }

        @Override // cn.sharesdk.wechat.utils.m
        public final boolean b() {
            String str = this.f1335a;
            if (str != null && str.length() != 0 && this.f1335a.length() <= 10240) {
                int i4 = this.f1337c;
                if (i4 < 0 || i4 > 2) {
                    SSDKLog.b().a("checkArgs fail", "miniprogram type should between MINIPTOGRAM_TYPE_RELEASE and MINIPROGRAM_TYPE_PREVIEW");
                    return false;
                }
                return true;
            }
            SSDKLog.b().a("checkArgs fail, userName is invalid", new Object[0]);
            return false;
        }

        @Override // cn.sharesdk.wechat.utils.m
        public final void b(Bundle bundle) {
            super.b(bundle);
            bundle.putString("_launch_wxminiprogram_username", this.f1335a);
            bundle.putString("_launch_wxminiprogram_path", this.f1336b);
            bundle.putInt("_launch_wxminiprogram_type", this.f1337c);
            bundle.putString("_launch_wxminiprogram_extData", this.f1338d);
        }
    }
}
