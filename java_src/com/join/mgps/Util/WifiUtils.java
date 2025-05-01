package com.join.mgps.Util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.DhcpInfo;
import android.net.NetworkInfo;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import com.efs.sdk.base.core.util.NetworkUtil;
import com.swift.sandhook.annotation.MethodReflectParams;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
/* loaded from: classes3.dex */
public class WifiUtils {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static Context mContext;
    private static WifiUtils mWifiUtils;
    private DhcpInfo dhcpInfo;
    public boolean isConnectToHotSpotRunning = false;
    private DhcpInfo mDhcpInfo;
    private NetworkInfo mNetworkInfo;
    private List<WifiConfiguration> mWifiConfiguration;
    private WifiInfo mWifiInfo;
    private List<ScanResult> mWifiList;
    private WifiManager.WifiLock mWifiLock;
    public WifiManager mWifiManager;

    private WifiUtils(Context context) {
        WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService(NetworkUtil.NETWORK_TYPE_WIFI);
        this.mWifiManager = wifiManager;
        this.mDhcpInfo = wifiManager.getDhcpInfo();
        this.mWifiInfo = this.mWifiManager.getConnectionInfo();
        this.mNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getNetworkInfo(1);
        mContext = context;
    }

    private Method connectWifiByReflectMethod(int i4) {
        Method[] declaredMethods;
        Method method;
        Class<?>[] parameterTypes;
        Method[] declaredMethods2;
        Class<?>[] parameterTypes2;
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 17) {
            method = null;
            for (Method method2 : this.mWifiManager.getClass().getDeclaredMethods()) {
                if ("connect".equalsIgnoreCase(method2.getName()) && (parameterTypes2 = method2.getParameterTypes()) != null && parameterTypes2.length > 0 && MethodReflectParams.INT.equalsIgnoreCase(parameterTypes2[0].getName())) {
                    method = method2;
                }
            }
            if (method != null) {
                try {
                    method.invoke(this.mWifiManager, Integer.valueOf(i4), null);
                } catch (Exception e5) {
                    e5.printStackTrace();
                    return null;
                }
            }
        } else if (i5 == 16 || i5 < 14 || i5 >= 16) {
            return null;
        } else {
            method = null;
            for (Method method3 : this.mWifiManager.getClass().getDeclaredMethods()) {
                if ("connectNetwork".equalsIgnoreCase(method3.getName()) && (parameterTypes = method3.getParameterTypes()) != null && parameterTypes.length > 0 && MethodReflectParams.INT.equalsIgnoreCase(parameterTypes[0].getName())) {
                    method = method3;
                }
            }
            if (method != null) {
                try {
                    method.invoke(this.mWifiManager, Integer.valueOf(i4));
                } catch (Exception e6) {
                    e6.printStackTrace();
                    return null;
                }
            }
        }
        return method;
    }

    public static WifiUtils getInstance(Context context) {
        if (mWifiUtils == null) {
            mWifiUtils = new WifiUtils(context);
        }
        return mWifiUtils;
    }

    private WifiConfiguration isExsits(String str) {
        WifiManager wifiManager = this.mWifiManager;
        if (wifiManager == null || wifiManager.getConfiguredNetworks() == null) {
            return null;
        }
        for (WifiConfiguration wifiConfiguration : this.mWifiManager.getConfiguredNetworks()) {
            StringBuilder sb = new StringBuilder();
            sb.append("isExsits: ");
            sb.append(wifiConfiguration.SSID);
            String str2 = wifiConfiguration.SSID;
            if (str2.equals(m.a.f71493g + str + m.a.f71493g)) {
                return wifiConfiguration;
            }
        }
        return null;
    }

    public void AcquireWifiLock() {
        this.mWifiLock.acquire();
    }

    public void CreatWifiLock() {
        this.mWifiLock = this.mWifiManager.createWifiLock("Test");
    }

    public void OpenWifi() {
        try {
            WifiManager wifiManager = (WifiManager) mContext.getApplicationContext().getSystemService(NetworkUtil.NETWORK_TYPE_WIFI);
            this.mWifiManager = wifiManager;
            if (wifiManager.isWifiEnabled()) {
                return;
            }
            this.mWifiManager.setWifiEnabled(true);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void ReleaseWifiLock() {
        if (this.mWifiLock.isHeld()) {
            this.mWifiLock.release();
        }
    }

    public void addNetwork(Context context, WifiConfiguration wifiConfiguration) {
        WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService(NetworkUtil.NETWORK_TYPE_WIFI);
        this.mWifiManager = wifiManager;
        this.mWifiManager.enableNetwork(wifiManager.addNetwork(wifiConfiguration), true);
    }

    public void closeWifi() {
        if (this.mWifiManager.isWifiEnabled()) {
            this.mWifiManager.setWifiEnabled(false);
        }
    }

    public void connectConfiguration(int i4) {
        if (i4 > this.mWifiConfiguration.size()) {
            return;
        }
        this.mWifiManager.enableNetwork(this.mWifiConfiguration.get(i4).networkId, true);
    }

    public boolean connectToHotspot(String str, String str2) {
        this.isConnectToHotSpotRunning = true;
        WifiConfiguration wifiConfiguration = new WifiConfiguration();
        List<ScanResult> scanResults = this.mWifiManager.getScanResults();
        if (this.mWifiManager.isWifiEnabled()) {
            for (ScanResult scanResult : scanResults) {
                if (scanResult.SSID.equals(str)) {
                    removeWifiNetwork(scanResult.SSID);
                    String securityMode = getSecurityMode(scanResult);
                    if (securityMode.equalsIgnoreCase("OPEN")) {
                        wifiConfiguration.SSID = m.a.f71493g + str + m.a.f71493g;
                        wifiConfiguration.allowedKeyManagement.set(0);
                        int addNetwork = this.mWifiManager.addNetwork(wifiConfiguration);
                        this.mWifiManager.disconnect();
                        this.mWifiManager.enableNetwork(addNetwork, true);
                        this.mWifiManager.reconnect();
                        this.mWifiManager.setWifiEnabled(true);
                        this.isConnectToHotSpotRunning = false;
                        return true;
                    } else if (securityMode.equalsIgnoreCase("WEP")) {
                        wifiConfiguration.SSID = m.a.f71493g + str + m.a.f71493g;
                        String[] strArr = wifiConfiguration.wepKeys;
                        strArr[0] = m.a.f71493g + str2 + m.a.f71493g;
                        wifiConfiguration.wepTxKeyIndex = 0;
                        wifiConfiguration.allowedKeyManagement.set(0);
                        wifiConfiguration.allowedGroupCiphers.set(0);
                        int addNetwork2 = this.mWifiManager.addNetwork(wifiConfiguration);
                        this.mWifiManager.disconnect();
                        this.mWifiManager.enableNetwork(addNetwork2, true);
                        this.mWifiManager.reconnect();
                        this.mWifiManager.setWifiEnabled(true);
                        this.isConnectToHotSpotRunning = false;
                        return true;
                    } else {
                        wifiConfiguration.SSID = m.a.f71493g + str + m.a.f71493g;
                        wifiConfiguration.preSharedKey = m.a.f71493g + str2 + m.a.f71493g;
                        wifiConfiguration.hiddenSSID = false;
                        wifiConfiguration.status = 2;
                        wifiConfiguration.allowedGroupCiphers.set(2);
                        wifiConfiguration.allowedGroupCiphers.set(3);
                        wifiConfiguration.allowedKeyManagement.set(1);
                        wifiConfiguration.allowedPairwiseCiphers.set(1);
                        wifiConfiguration.allowedPairwiseCiphers.set(2);
                        wifiConfiguration.allowedProtocols.set(1);
                        wifiConfiguration.allowedProtocols.set(0);
                        int addNetwork3 = this.mWifiManager.addNetwork(wifiConfiguration);
                        this.mWifiManager.disconnect();
                        if (connectWifiByReflectMethod(addNetwork3) == null) {
                            this.mWifiManager.enableNetwork(addNetwork3, true);
                        }
                        this.mWifiManager.saveConfiguration();
                        this.mWifiManager.reconnect();
                        this.isConnectToHotSpotRunning = false;
                        return true;
                    }
                }
            }
        }
        this.isConnectToHotSpotRunning = false;
        return false;
    }

    public WifiConfiguration createAPInfo(String str, String str2) {
        WifiConfiguration wifiConfiguration = new WifiConfiguration();
        wifiConfiguration.SSID = str;
        wifiConfiguration.allowedAuthAlgorithms.set(0);
        wifiConfiguration.allowedProtocols.set(1);
        wifiConfiguration.allowedProtocols.set(0);
        wifiConfiguration.allowedPairwiseCiphers.set(2);
        wifiConfiguration.allowedPairwiseCiphers.set(1);
        wifiConfiguration.allowedGroupCiphers.set(3);
        wifiConfiguration.allowedGroupCiphers.set(2);
        if (str2 != null) {
            wifiConfiguration.allowedKeyManagement.set(1);
            wifiConfiguration.preSharedKey = str2;
        }
        return wifiConfiguration;
    }

    public void createWiFiAP(WifiConfiguration wifiConfiguration, boolean z4) {
        try {
            this.mWifiManager.getClass().getMethod("setWifiApEnabled", WifiConfiguration.class, Boolean.TYPE).invoke(this.mWifiManager, wifiConfiguration, Boolean.valueOf(z4));
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public WifiConfiguration createWifiInfo(String str, String str2, int i4, String str3) {
        WifiConfiguration wifiConfiguration = new WifiConfiguration();
        wifiConfiguration.allowedAuthAlgorithms.clear();
        wifiConfiguration.allowedGroupCiphers.clear();
        wifiConfiguration.allowedKeyManagement.clear();
        wifiConfiguration.allowedPairwiseCiphers.clear();
        wifiConfiguration.allowedProtocols.clear();
        if ("wt".equals(str3)) {
            wifiConfiguration.SSID = m.a.f71493g + str + m.a.f71493g;
            WifiConfiguration isExsits = isExsits(str);
            if (isExsits != null) {
                removeNetwork(mContext, isExsits.networkId);
            }
            if (i4 == 1) {
                wifiConfiguration.wepKeys[0] = "";
                wifiConfiguration.allowedKeyManagement.set(0);
                wifiConfiguration.wepTxKeyIndex = 0;
            } else if (i4 == 2) {
                wifiConfiguration.hiddenSSID = false;
                String[] strArr = wifiConfiguration.wepKeys;
                strArr[0] = m.a.f71493g + str2 + m.a.f71493g;
            } else {
                wifiConfiguration.preSharedKey = m.a.f71493g + str2 + m.a.f71493g;
                wifiConfiguration.hiddenSSID = false;
                wifiConfiguration.allowedAuthAlgorithms.set(0);
                wifiConfiguration.allowedGroupCiphers.set(2);
                wifiConfiguration.allowedKeyManagement.set(1);
                wifiConfiguration.allowedPairwiseCiphers.set(1);
                wifiConfiguration.allowedGroupCiphers.set(3);
                wifiConfiguration.allowedPairwiseCiphers.set(2);
                wifiConfiguration.status = 2;
            }
        } else {
            wifiConfiguration.SSID = str;
            wifiConfiguration.allowedAuthAlgorithms.set(1);
            wifiConfiguration.allowedGroupCiphers.set(3);
            wifiConfiguration.allowedGroupCiphers.set(2);
            wifiConfiguration.allowedGroupCiphers.set(0);
            wifiConfiguration.allowedGroupCiphers.set(1);
            wifiConfiguration.allowedKeyManagement.set(0);
            wifiConfiguration.wepTxKeyIndex = 0;
            if (i4 == 1) {
                wifiConfiguration.wepKeys[0] = "";
                wifiConfiguration.allowedKeyManagement.set(0);
                wifiConfiguration.wepTxKeyIndex = 0;
            } else if (i4 == 2) {
                wifiConfiguration.hiddenSSID = false;
                wifiConfiguration.wepKeys[0] = str2;
            } else if (i4 == 3) {
                wifiConfiguration.preSharedKey = str2;
                wifiConfiguration.allowedAuthAlgorithms.set(0);
                wifiConfiguration.allowedProtocols.set(1);
                wifiConfiguration.allowedProtocols.set(0);
                wifiConfiguration.allowedKeyManagement.set(1);
                wifiConfiguration.allowedPairwiseCiphers.set(2);
                wifiConfiguration.allowedPairwiseCiphers.set(1);
            }
        }
        return wifiConfiguration;
    }

    public void disableNetwork(Context context, int i4) {
        WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService(NetworkUtil.NETWORK_TYPE_WIFI);
        this.mWifiManager = wifiManager;
        wifiManager.disableNetwork(i4);
        this.mWifiManager.saveConfiguration();
    }

    public void disconnectWifi(int i4) {
        this.mWifiManager.disableNetwork(i4);
    }

    public String getApSSID() {
        Object invoke;
        try {
            Method declaredMethod = this.mWifiManager.getClass().getDeclaredMethod("getWifiApConfiguration", new Class[0]);
            if (declaredMethod == null || (invoke = declaredMethod.invoke(this.mWifiManager, new Object[0])) == null) {
                return null;
            }
            WifiConfiguration wifiConfiguration = (WifiConfiguration) invoke;
            String str = wifiConfiguration.SSID;
            if (str != null) {
                return str;
            }
            Field declaredField = WifiConfiguration.class.getDeclaredField("mWifiApProfile");
            if (declaredField == null) {
                return null;
            }
            declaredField.setAccessible(true);
            Object obj = declaredField.get(wifiConfiguration);
            declaredField.setAccessible(false);
            if (obj == null) {
                return null;
            }
            Field declaredField2 = obj.getClass().getDeclaredField("SSID");
            declaredField2.setAccessible(true);
            Object obj2 = declaredField2.get(obj);
            if (obj2 == null) {
                return null;
            }
            declaredField2.setAccessible(false);
            return (String) obj2;
        } catch (Exception unused) {
            return null;
        }
    }

    public String getApSSIDAll(Context context) {
        int i4;
        try {
            i4 = Build.VERSION.SDK_INT;
        } catch (Exception e5) {
            StringBuilder sb = new StringBuilder();
            sb.append("e:");
            sb.append(e5.getMessage());
        }
        if (i4 <= 26 || i4 >= 28) {
            WifiInfo connectionInfo = ((WifiManager) context.getApplicationContext().getSystemService(NetworkUtil.NETWORK_TYPE_WIFI)).getConnectionInfo();
            if (i4 < 19) {
                return connectionInfo.getSSID();
            }
            return connectionInfo.getSSID().replace(m.a.f71493g, "");
        }
        if (i4 == 27) {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                if (activeNetworkInfo.getExtraInfo() != null) {
                    return activeNetworkInfo.getExtraInfo().replace(m.a.f71493g, "");
                }
            } else {
                return v2.h(context).l().getSSID();
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ssid:");
        sb2.append("unknown id");
        return "unknown id";
    }

    public String getBSSID() {
        WifiInfo wifiInfo = this.mWifiInfo;
        return wifiInfo == null ? "NULL" : wifiInfo.getBSSID();
    }

    public List<WifiConfiguration> getConfiguration() {
        return this.mWifiConfiguration;
    }

    public int getDhcpInfo() {
        return this.mWifiManager.getDhcpInfo().gateway;
    }

    public String getLocalIPAddress() {
        WifiInfo wifiInfo = this.mWifiInfo;
        return wifiInfo == null ? "NULL" : intToIp(wifiInfo.getIpAddress());
    }

    public String getMacAddress() {
        WifiInfo wifiInfo = this.mWifiInfo;
        return wifiInfo == null ? "NULL" : wifiInfo.getMacAddress();
    }

    public int getNetworkId() {
        WifiInfo wifiInfo = this.mWifiInfo;
        if (wifiInfo == null) {
            return 0;
        }
        return wifiInfo.getNetworkId();
    }

    public String getSSID() {
        WifiInfo wifiInfo = this.mWifiInfo;
        if (wifiInfo == null) {
            return "NULL";
        }
        String ssid = wifiInfo.getSSID();
        return (ssid == null || ssid.trim().equals("")) ? "" : ssid.replaceAll(m.a.f71493g, "");
    }

    public String getSecurityMode(ScanResult scanResult) {
        String str = scanResult.capabilities;
        String[] strArr = {"WPA", "EAP", "WEP"};
        for (int i4 = 2; i4 >= 0; i4--) {
            if (str.contains(strArr[i4])) {
                return strArr[i4];
            }
        }
        return "OPEN";
    }

    public String getServerIPAddress() {
        DhcpInfo dhcpInfo = this.mDhcpInfo;
        return dhcpInfo == null ? "NULL" : intToIp(dhcpInfo.serverAddress);
    }

    public int getSignalStrength() {
        if (this.mWifiManager != null) {
            return WifiManager.calculateSignalLevel(this.mWifiInfo.getRssi(), 100);
        }
        return 0;
    }

    public boolean getWifiApState() {
        try {
            int intValue = ((Integer) this.mWifiManager.getClass().getMethod("getWifiApState", new Class[0]).invoke(this.mWifiManager, new Object[0])).intValue();
            return 3 == intValue || 13 == intValue;
        } catch (Exception unused) {
            return false;
        }
    }

    public int getWifiApStateInt() {
        try {
            return ((Integer) this.mWifiManager.getClass().getMethod("getWifiApState", new Class[0]).invoke(this.mWifiManager, new Object[0])).intValue();
        } catch (Exception e5) {
            e5.printStackTrace();
            return 4;
        }
    }

    public WifiInfo getWifiInfo() {
        return this.mWifiManager.getConnectionInfo();
    }

    public List<ScanResult> getWifiList() {
        return this.mWifiList;
    }

    public WifiInfo getmWifiInfo() {
        return this.mWifiInfo;
    }

    public String intToIp(int i4) {
        return (i4 & 255) + h0.f27805a + ((i4 >> 8) & 255) + h0.f27805a + ((i4 >> 16) & 255) + h0.f27805a + ((i4 >> 24) & 255);
    }

    public boolean isWifiConnect() {
        return this.mNetworkInfo.isConnected();
    }

    public boolean isWifiEnable() {
        return this.mWifiManager.isWifiEnabled();
    }

    public StringBuilder lookUpScan() {
        StringBuilder sb = new StringBuilder();
        int i4 = 0;
        while (i4 < 2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Index_");
            int i5 = i4 + 1;
            sb2.append(Integer.valueOf(i5).toString());
            sb2.append(":");
            sb.append(sb2.toString());
            sb.append(this.mWifiList.get(i4).toString());
            sb.append("/n");
            i4 = i5;
        }
        return sb;
    }

    public void openWifi(Context context) {
        this.mWifiManager = (WifiManager) context.getApplicationContext().getSystemService(NetworkUtil.NETWORK_TYPE_WIFI);
        if (isWifiEnable()) {
            return;
        }
        this.mWifiManager.setWifiEnabled(true);
    }

    public boolean pingCmd(String str) {
        try {
            Process exec = Runtime.getRuntime().exec("ping  -c 1 -W 3 " + str);
            try {
                exec.waitFor();
            } catch (InterruptedException e5) {
                e5.printStackTrace();
            }
            return exec.exitValue() == 0;
        } catch (IOException unused) {
            return false;
        }
    }

    public void removeNetwork(Context context, int i4) {
        WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService(NetworkUtil.NETWORK_TYPE_WIFI);
        this.mWifiManager = wifiManager;
        wifiManager.removeNetwork(i4);
        this.mWifiManager.saveConfiguration();
    }

    public void removeWifiNetwork(String str) {
        List<WifiConfiguration> configuredNetworks = this.mWifiManager.getConfiguredNetworks();
        if (configuredNetworks != null) {
            for (WifiConfiguration wifiConfiguration : configuredNetworks) {
                if (wifiConfiguration.SSID.contains(str)) {
                    this.mWifiManager.disableNetwork(wifiConfiguration.networkId);
                    this.mWifiManager.removeNetwork(wifiConfiguration.networkId);
                }
            }
        }
        this.mWifiManager.saveConfiguration();
    }

    public boolean setHotSpot(String str, String str2, boolean z4) {
        Method[] declaredMethods;
        for (Method method : this.mWifiManager.getClass().getDeclaredMethods()) {
            if (method.getName().equals("setWifiApEnabled")) {
                WifiConfiguration wifiConfiguration = new WifiConfiguration();
                if (str2 == "") {
                    wifiConfiguration.SSID = str;
                    wifiConfiguration.allowedAuthAlgorithms.set(0);
                    wifiConfiguration.allowedProtocols.set(1);
                    wifiConfiguration.allowedProtocols.set(0);
                    wifiConfiguration.allowedKeyManagement.set(0);
                } else {
                    wifiConfiguration.SSID = str;
                    wifiConfiguration.preSharedKey = str2;
                    wifiConfiguration.hiddenSSID = false;
                    wifiConfiguration.status = 2;
                    wifiConfiguration.allowedGroupCiphers.set(2);
                    wifiConfiguration.allowedGroupCiphers.set(3);
                    wifiConfiguration.allowedKeyManagement.set(1);
                    wifiConfiguration.allowedPairwiseCiphers.set(1);
                    wifiConfiguration.allowedPairwiseCiphers.set(2);
                    wifiConfiguration.allowedProtocols.set(1);
                    wifiConfiguration.allowedProtocols.set(0);
                }
                try {
                    method.invoke(this.mWifiManager, wifiConfiguration, Boolean.valueOf(z4));
                    this.mWifiManager.saveConfiguration();
                    return true;
                } catch (Exception unused) {
                    continue;
                }
            }
        }
        return false;
    }

    public void setNewWifiManagerInfo() {
        this.mWifiInfo = this.mWifiManager.getConnectionInfo();
        this.mDhcpInfo = this.mWifiManager.getDhcpInfo();
    }

    public void setWifiList() {
        this.mWifiList = this.mWifiManager.getScanResults();
    }

    public void startScan(Context context) {
        WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService(NetworkUtil.NETWORK_TYPE_WIFI);
        this.mWifiManager = wifiManager;
        wifiManager.startScan();
        this.mWifiConfiguration = this.mWifiManager.getConfiguredNetworks();
    }

    public boolean isWifiConnect(Context context) {
        NetworkInfo networkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getNetworkInfo(1);
        this.mNetworkInfo = networkInfo;
        boolean isConnected = networkInfo.isConnected();
        return isConnected ? isConnected : this.mNetworkInfo.isAvailable();
    }

    public void closeWifi(Context context) {
        WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService(NetworkUtil.NETWORK_TYPE_WIFI);
        this.mWifiManager = wifiManager;
        wifiManager.setWifiEnabled(false);
    }

    public String getSSID(Context context) {
        WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService(NetworkUtil.NETWORK_TYPE_WIFI);
        this.mWifiManager = wifiManager;
        WifiInfo connectionInfo = wifiManager.getConnectionInfo();
        this.mWifiInfo = connectionInfo;
        String ssid = connectionInfo.getSSID();
        if (ssid == null) {
            return "";
        }
        if (Build.VERSION.SDK_INT >= 26) {
            ssid = getApSSID(context);
        }
        return ssid.replaceAll(m.a.f71493g, "");
    }

    public String getApSSID(Context context) {
        return getApSSIDAll(context);
    }
}
