package cn.sharesdk.framework.a.a;

import android.text.TextUtils;
import com.mob.MobSDK;
import com.mob.tools.utils.SharePrefrenceHelper;
import com.tencent.bugly.Bugly;
/* compiled from: SharePrefrenceUtil.java */
/* loaded from: classes2.dex */
public class e {

    /* renamed from: b  reason: collision with root package name */
    private static e f862b;

    /* renamed from: a  reason: collision with root package name */
    private SharePrefrenceHelper f863a;

    private e() {
        SharePrefrenceHelper sharePrefrenceHelper = new SharePrefrenceHelper(MobSDK.getContext());
        this.f863a = sharePrefrenceHelper;
        sharePrefrenceHelper.open("share_sdk", 1);
    }

    public static e a() {
        if (f862b == null) {
            f862b = new e();
        }
        return f862b;
    }

    public long b() {
        return this.f863a.getLong("service_time");
    }

    public boolean c() {
        String string = this.f863a.getString("upload_device_info");
        if (TextUtils.isEmpty(string)) {
            return true;
        }
        return Boolean.parseBoolean(string);
    }

    public boolean d() {
        String string = this.f863a.getString("upload_user_info");
        if (TextUtils.isEmpty(string)) {
            return true;
        }
        return Boolean.parseBoolean(string);
    }

    public boolean e() {
        String string = this.f863a.getString("trans_short_link");
        if (TextUtils.isEmpty(string)) {
            return false;
        }
        return Boolean.parseBoolean(string);
    }

    public int f() {
        String string = this.f863a.getString("upload_share_content");
        if ("true".equals(string)) {
            return 1;
        }
        return Bugly.SDK_IS_DEV.equals(string) ? -1 : 0;
    }

    public void g(String str) {
        SharePrefrenceHelper sharePrefrenceHelper = this.f863a;
        sharePrefrenceHelper.putString("buffered_snsconf_" + MobSDK.getAppkey(), str);
    }

    public Long h() {
        return Long.valueOf(this.f863a.getLong("device_time"));
    }

    public boolean i() {
        return this.f863a.getBoolean("connect_server");
    }

    public Long j() {
        return Long.valueOf(this.f863a.getLong("connect_server_time"));
    }

    public boolean k() {
        return this.f863a.getBoolean("sns_info_buffered");
    }

    public Object l(String str) {
        return this.f863a.get(str);
    }

    public void b(String str) {
        this.f863a.putString("upload_device_info", str);
    }

    public String g() {
        SharePrefrenceHelper sharePrefrenceHelper = this.f863a;
        return sharePrefrenceHelper.getString("buffered_snsconf_" + MobSDK.getAppkey());
    }

    public String h(String str) {
        return this.f863a.getString(str);
    }

    public boolean i(String str) {
        return this.f863a.getBoolean(str);
    }

    public long j(String str) {
        return this.f863a.getLong(str);
    }

    public int k(String str) {
        return this.f863a.getInt(str);
    }

    public void b(boolean z4) {
        this.f863a.putBoolean("no_use_gpp", Boolean.valueOf(z4));
    }

    public void a(String str) {
        this.f863a.putString("trans_short_link", str);
    }

    public void b(long j4) {
        this.f863a.putLong("connect_server_time", Long.valueOf(j4));
    }

    public void c(String str) {
        this.f863a.putString("upload_user_info", str);
    }

    public void d(String str) {
        this.f863a.putString("upload_share_content", str);
    }

    public void e(String str) {
        this.f863a.putString("open_login_plus", str);
    }

    public void f(String str) {
        this.f863a.putString("open_sina_link_card", str);
    }

    public void a(boolean z4) {
        this.f863a.putBoolean("gpp_ver_sent", Boolean.valueOf(z4));
    }

    public void c(boolean z4) {
        this.f863a.putBoolean("connect_server", Boolean.valueOf(z4));
    }

    public void d(boolean z4) {
        this.f863a.putBoolean("sns_info_buffered", Boolean.valueOf(z4));
    }

    public void a(long j4) {
        this.f863a.putLong("device_time", Long.valueOf(j4));
    }

    public void a(String str, String str2) {
        this.f863a.putString(str, str2);
    }

    public void a(String str, Long l4) {
        this.f863a.putLong(str, l4);
    }

    public void a(String str, int i4) {
        this.f863a.putInt(str, Integer.valueOf(i4));
    }

    public void a(String str, Object obj) {
        this.f863a.put(str, obj);
    }
}
