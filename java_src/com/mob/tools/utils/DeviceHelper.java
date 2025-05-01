package com.mob.tools.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ResolveInfo;
import android.location.Location;
import android.view.View;
import com.mob.commons.v;
import com.mob.tools.proguard.PublicMemberKeeper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* loaded from: classes5.dex */
public class DeviceHelper implements PublicMemberKeeper {

    /* renamed from: a  reason: collision with root package name */
    private static DeviceHelper f56903a = new DeviceHelper();

    /* renamed from: b  reason: collision with root package name */
    private Context f56904b;

    public static Object currentActivityThread() {
        return v.b();
    }

    public static synchronized DeviceHelper getInstance(Context context) {
        DeviceHelper deviceHelper;
        synchronized (DeviceHelper.class) {
            DeviceHelper deviceHelper2 = f56903a;
            if (deviceHelper2.f56904b == null && context != null) {
                deviceHelper2.f56904b = context.getApplicationContext();
            }
            deviceHelper = f56903a;
        }
        return deviceHelper;
    }

    public String Base64AES(String str, String str2) {
        return Data.Base64AES(str, str2);
    }

    public boolean checkNetworkAvailable() {
        return com.mob.tools.b.c.a(this.f56904b).d().G();
    }

    public boolean checkPad() {
        return com.mob.tools.b.c.a(this.f56904b).d().c();
    }

    public boolean checkPermission(String str) {
        return com.mob.tools.b.c.a(this.f56904b).d().e(str);
    }

    public boolean checkUA() {
        return com.mob.tools.b.c.a(this.f56904b).d().f();
    }

    public boolean cx() {
        return com.mob.tools.b.c.a(this.f56904b).d().b();
    }

    public boolean debugable() {
        return com.mob.tools.b.c.a(this.f56904b).d().d();
    }

    public boolean devEnable() {
        return com.mob.tools.b.c.a(this.f56904b).d().g();
    }

    public ApplicationInfo getAInfo() {
        return com.mob.tools.b.c.a(this.f56904b).d().ak();
    }

    public HashMap<String, Object> getALLD() {
        return com.mob.tools.b.c.a(this.f56904b).d().aj();
    }

    public String getAdvertisingID() throws Throwable {
        return com.mob.tools.b.c.a(this.f56904b).d().j();
    }

    public String getAppLanguage() {
        return com.mob.tools.b.c.a(this.f56904b).d().B();
    }

    public long getAppLastUpdateTime() {
        return com.mob.tools.b.c.a(this.f56904b).d().ad();
    }

    public String getAppName() {
        return com.mob.tools.b.c.a(this.f56904b).d().U();
    }

    public int getAppVersion() {
        return com.mob.tools.b.c.a(this.f56904b).d().V();
    }

    public String getAppVersionName() {
        return com.mob.tools.b.c.a(this.f56904b).d().W();
    }

    public Context getApplication() {
        return com.mob.tools.b.c.a(this.f56904b).d().aa();
    }

    public ArrayList<HashMap<String, Object>> getAvailableWifiListOneKey() {
        return com.mob.tools.b.c.a(this.f56904b).d().al();
    }

    public String getBaseband() {
        return com.mob.tools.b.c.a(this.f56904b).d().K();
    }

    public String getBoardFromSysProperty() {
        return com.mob.tools.b.c.a(this.f56904b).d().L();
    }

    public String getBoardPlatform() {
        return com.mob.tools.b.c.a(this.f56904b).d().M();
    }

    public String getBrand() {
        return com.mob.tools.b.c.a(this.f56904b).d().n();
    }

    public String getBssid() {
        return com.mob.tools.b.c.a(this.f56904b).d().b(false);
    }

    public String getCInfo() {
        return com.mob.tools.b.c.a(this.f56904b).d().ag();
    }

    public HashMap<String, Object> getCPUInfo() {
        return com.mob.tools.b.c.a(this.f56904b).d().w();
    }

    public String getCarrier() {
        return getCarrier(false);
    }

    public String getCarrierName() {
        return getCarrierName(false);
    }

    public String getCgroup() {
        return com.mob.tools.b.c.a(this.f56904b).d().af();
    }

    public String getCurrentProcessName() {
        return com.mob.tools.b.c.a(this.f56904b).d().Y();
    }

    public HashMap<String, Object> getCurrentWifiInfo() {
        return com.mob.tools.b.c.a(this.f56904b).d().r();
    }

    public int getDataNtType() {
        return com.mob.tools.b.c.a(this.f56904b).d().H();
    }

    public String getDefaultIMPkg() {
        return null;
    }

    public String getDetailNetworkTypeForStatic() {
        return com.mob.tools.b.c.a(this.f56904b).d().F();
    }

    public String getDeviceData() {
        return com.mob.tools.b.c.a(this.f56904b).d().ab();
    }

    public String getDeviceDataNotAES() {
        return com.mob.tools.b.c.a(this.f56904b).d().ac();
    }

    public String getDeviceId() {
        return null;
    }

    public String getDeviceKey() {
        return com.mob.tools.b.c.a(this.f56904b).d().Q();
    }

    public String getDeviceName() {
        return com.mob.tools.b.c.a(this.f56904b).d().ae();
    }

    public String getDeviceType() {
        return com.mob.tools.b.c.a(this.f56904b).d().o();
    }

    public String getFlavor() {
        return com.mob.tools.b.c.a(this.f56904b).d().J();
    }

    public ArrayList<HashMap<String, String>> getIA(boolean z4) {
        return com.mob.tools.b.c.a(this.f56904b).d().a(z4, false);
    }

    public String getIMEI() {
        return null;
    }

    public String getIMSI() {
        return null;
    }

    public String getIPAddress() {
        return com.mob.tools.b.c.a(this.f56904b).d().N();
    }

    public Location getLocation(int i4, int i5, boolean z4) {
        return com.mob.tools.b.c.a(this.f56904b).d().a(i4, i5, z4);
    }

    public String getMIUIVersion() {
        return com.mob.tools.b.c.a(this.f56904b).d().k();
    }

    public String getManufacturer() {
        return com.mob.tools.b.c.a(this.f56904b).d().m();
    }

    public HashMap<String, Long> getMemoryInfo() {
        return com.mob.tools.b.c.a(this.f56904b).d().A();
    }

    public String getModel() {
        return com.mob.tools.b.c.a(this.f56904b).d().l();
    }

    public ArrayList<HashMap<String, Object>> getNeighboringCellInfo() {
        return com.mob.tools.b.c.a(this.f56904b).d().q();
    }

    public String getNetworkType() {
        return getNetworkType(false);
    }

    public String getNetworkTypeForStatic() {
        return com.mob.tools.b.c.a(this.f56904b).d().E();
    }

    public String getOD() {
        return com.mob.tools.b.c.a(this.f56904b).d().ah();
    }

    public String getODH() {
        return com.mob.tools.b.c.a(this.f56904b).d().ai();
    }

    public String getOSCountry() {
        return com.mob.tools.b.c.a(this.f56904b).d().v();
    }

    public String getOSLanguage() {
        return com.mob.tools.b.c.a(this.f56904b).d().u();
    }

    public int getOSVersionInt() {
        return com.mob.tools.b.c.a(this.f56904b).d().s();
    }

    public String getOSVersionName() {
        return com.mob.tools.b.c.a(this.f56904b).d().t();
    }

    public PackageInfo getPInfo(String str, int i4) {
        return com.mob.tools.b.c.a(this.f56904b).d().a(false, 0, str, i4);
    }

    public String getPackageName() {
        return com.mob.tools.b.c.a(this.f56904b).d().T();
    }

    public int getPlatformCode() {
        return 1;
    }

    public String getQemuKernel() {
        return com.mob.tools.b.c.a(this.f56904b).d().y();
    }

    public ArrayList<HashMap<String, String>> getSA() {
        return com.mob.tools.b.c.a(this.f56904b).d().P();
    }

    public String getSSID() {
        return com.mob.tools.b.c.a(this.f56904b).d().a(false);
    }

    public String getScreenSize() {
        return com.mob.tools.b.c.a(this.f56904b).d().C();
    }

    public String getSdcardPath() {
        return com.mob.tools.b.c.a(this.f56904b).d().R();
    }

    public boolean getSdcardState() {
        return false;
    }

    public String getSerialno() {
        return null;
    }

    public String getSignMD5() {
        return com.mob.tools.b.c.a(this.f56904b).d().S();
    }

    public String getSimSerialNumber() {
        return null;
    }

    public HashMap<String, HashMap<String, Long>> getSizeInfo() {
        return com.mob.tools.b.c.a(this.f56904b).d().z();
    }

    public String getSystemProperties(String str) {
        return com.mob.tools.b.c.a(this.f56904b).d().a(str);
    }

    public Object getSystemServiceSafe(String str) {
        return v.d(str);
    }

    public ArrayList<ArrayList<String>> getTTYDriversInfo() {
        return com.mob.tools.b.c.a(this.f56904b).d().x();
    }

    public String getTimezone() {
        return com.mob.tools.b.c.a(this.f56904b).d().I();
    }

    public Activity getTopActivity() {
        return null;
    }

    public void hideSoftInput(View view) {
        v.a(view);
    }

    public <T> T invokeInstanceMethod(Object obj, String str, Object... objArr) {
        return (T) ReflectHelper.invokeInstanceMethodNoThrow(obj, str, null, objArr);
    }

    public boolean isInMainProcess() {
        return com.mob.tools.b.c.a(this.f56904b).d().X();
    }

    public boolean isPackageInstalled(String str) {
        return com.mob.tools.b.c.a(this.f56904b).d().b(str);
    }

    public boolean isRooted() {
        return com.mob.tools.b.c.a(this.f56904b).d().a();
    }

    public boolean isWifiProxy() {
        return com.mob.tools.b.c.a(this.f56904b).d().i();
    }

    public String[] queryIMEI() {
        return null;
    }

    public String[] queryIMSI() {
        return null;
    }

    public List<ResolveInfo> queryIntentServices(Intent intent, int i4) {
        return com.mob.tools.b.c.a(this.f56904b).d().a(intent, i4);
    }

    public ResolveInfo resolveActivity(Intent intent, int i4) {
        return com.mob.tools.b.c.a(this.f56904b).d().b(intent, i4);
    }

    public void showSoftInput(View view) {
        v.b(view);
    }

    public boolean usbEnable() {
        return com.mob.tools.b.c.a(this.f56904b).d().h();
    }

    public boolean vpn() {
        return com.mob.tools.b.c.a(this.f56904b).d().e();
    }

    public ApplicationInfo getAInfo(String str, int i4) {
        return com.mob.tools.b.c.a(this.f56904b).d().a(str, i4);
    }

    public String getAppName(String str) {
        return com.mob.tools.b.c.a(this.f56904b).d().d(str);
    }

    public String getCarrier(boolean z4) {
        return com.mob.tools.b.c.a(this.f56904b).d().c(z4);
    }

    public String getCarrierName(boolean z4) {
        return com.mob.tools.b.c.a(this.f56904b).d().d(z4);
    }

    public String getDeviceKey(boolean z4) {
        return com.mob.tools.b.c.a(this.f56904b).d().g(z4);
    }

    public String getNetworkType(boolean z4) {
        return com.mob.tools.b.c.a(this.f56904b).d().f(z4);
    }

    public PackageInfo getPInfo(boolean z4, String str, int i4) {
        return com.mob.tools.b.c.a(this.f56904b).d().a(z4, 0, str, i4);
    }

    public String getSignMD5(String str) {
        return com.mob.tools.b.c.a(this.f56904b).d().c(str);
    }

    public <T> T invokeInstanceMethod(Object obj, String str, Object[] objArr, Class<?>[] clsArr) {
        return (T) ReflectHelper.invokeInstanceMethod(obj, str, objArr, clsArr, null);
    }

    public ApplicationInfo getAInfo(boolean z4, String str, int i4) {
        return com.mob.tools.b.c.a(this.f56904b).d().a(z4, str, i4);
    }

    public PackageInfo getPInfo(int i4, String str, int i5) {
        return com.mob.tools.b.c.a(this.f56904b).d().a(false, i4, str, i5);
    }
}
