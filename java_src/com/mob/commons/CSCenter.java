package com.mob.commons;

import android.content.pm.PackageInfo;
import android.location.Location;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.telephony.CellInfo;
import android.telephony.CellLocation;
import android.telephony.NeighboringCellInfo;
import android.telephony.ServiceState;
import android.telephony.SubscriptionInfo;
import com.mob.MobCustomController;
import com.mob.tools.MobLog;
import com.mob.tools.proguard.PublicMemberKeeper;
import java.util.List;
/* loaded from: classes5.dex */
public class CSCenter implements PublicMemberKeeper {

    /* renamed from: a  reason: collision with root package name */
    private static volatile CSCenter f56021a;

    /* renamed from: b  reason: collision with root package name */
    private volatile MobCustomController f56022b;

    /* renamed from: c  reason: collision with root package name */
    private a f56023c = new a();

    /* loaded from: classes5.dex */
    public class a {

        /* renamed from: b  reason: collision with root package name */
        private boolean f56025b = false;

        public a() {
        }

        public boolean a() {
            return this.f56025b;
        }
    }

    private CSCenter() {
    }

    public static CSCenter getInstance() {
        if (f56021a == null) {
            synchronized (CSCenter.class) {
                if (f56021a == null) {
                    f56021a = new CSCenter();
                }
            }
        }
        return f56021a;
    }

    public int getActiveSubscriptionInfoCount() {
        if (this.f56022b != null) {
            try {
                return this.f56022b.getActiveSubscriptionInfoCount();
            } catch (Throwable th) {
                MobLog.getInstance().d(th);
                return -1;
            }
        }
        return -1;
    }

    public List<SubscriptionInfo> getActiveSubscriptionInfoList() {
        if (this.f56022b != null) {
            try {
                return this.f56022b.getActiveSubscriptionInfoList();
            } catch (Throwable th) {
                MobLog.getInstance().d(th);
                return null;
            }
        }
        return null;
    }

    public String getAdvertisingId() {
        if (this.f56022b != null) {
            try {
                return this.f56022b.getAdvertisingId();
            } catch (Throwable th) {
                MobLog.getInstance().d(th);
                return null;
            }
        }
        return null;
    }

    public List<CellInfo> getAllCellInfo() {
        if (this.f56022b != null) {
            try {
                return this.f56022b.getAllCellInfo();
            } catch (Throwable th) {
                MobLog.getInstance().d(th);
                return null;
            }
        }
        return null;
    }

    public String getAndroidId() {
        if (this.f56022b != null) {
            try {
                return this.f56022b.getAndroidId();
            } catch (Throwable th) {
                MobLog.getInstance().d(th);
                return null;
            }
        }
        return null;
    }

    public String getCellIpv4() {
        if (this.f56022b != null) {
            try {
                return this.f56022b.getCellIpv4();
            } catch (Throwable th) {
                MobLog.getInstance().d(th);
                return null;
            }
        }
        return null;
    }

    public String getCellIpv6() {
        if (this.f56022b != null) {
            try {
                return this.f56022b.getCellIpv6();
            } catch (Throwable th) {
                MobLog.getInstance().d(th);
                return null;
            }
        }
        return null;
    }

    public CellLocation getCellLocation() {
        if (this.f56022b != null) {
            try {
                return this.f56022b.getCellLocation();
            } catch (Throwable th) {
                MobLog.getInstance().d(th);
                return null;
            }
        }
        return null;
    }

    public WifiInfo getConnectionInfo() {
        if (this.f56022b != null) {
            try {
                return this.f56022b.getConnectionInfo();
            } catch (Throwable th) {
                MobLog.getInstance().d(th);
                return null;
            }
        }
        return null;
    }

    public String getIpAddress() {
        if (this.f56022b != null) {
            try {
                return this.f56022b.getIpAddress();
            } catch (Throwable th) {
                MobLog.getInstance().d(th);
                return null;
            }
        }
        return null;
    }

    public Location getLocation() {
        if (this.f56022b != null) {
            try {
                return this.f56022b.getLocation();
            } catch (Throwable th) {
                MobLog.getInstance().d(th);
                return null;
            }
        }
        return null;
    }

    public List<NeighboringCellInfo> getNeighboringCellInfo() {
        if (this.f56022b != null) {
            try {
                return this.f56022b.getNeighboringCellInfo();
            } catch (Throwable th) {
                MobLog.getInstance().d(th);
                return null;
            }
        }
        return null;
    }

    public int getNetworkType() {
        if (this.f56022b != null) {
            try {
                return this.f56022b.getNetworkType();
            } catch (Throwable th) {
                MobLog.getInstance().d(th);
                return -1;
            }
        }
        return -1;
    }

    public String getOaid() {
        if (this.f56022b != null) {
            try {
                this.f56023c.f56025b = true;
                return this.f56022b.getOaid();
            } catch (Throwable th) {
                MobLog.getInstance().d(th);
                return null;
            }
        }
        return null;
    }

    public List<PackageInfo> getPackageInfos() {
        if (this.f56022b != null) {
            try {
                return this.f56022b.getPackageInfos();
            } catch (Throwable th) {
                MobLog.getInstance().d(th);
                return null;
            }
        }
        return null;
    }

    public ServiceState getServiceState() {
        if (this.f56022b != null) {
            try {
                return this.f56022b.getServiceState();
            } catch (Throwable th) {
                MobLog.getInstance().d(th);
                return null;
            }
        }
        return null;
    }

    public String getSimOperator() {
        if (this.f56022b != null) {
            try {
                return this.f56022b.getSimOperator();
            } catch (Throwable th) {
                MobLog.getInstance().d(th);
                return null;
            }
        }
        return null;
    }

    public String getSimOperatorName() {
        if (this.f56022b != null) {
            try {
                return this.f56022b.getSimOperatorName();
            } catch (Throwable th) {
                MobLog.getInstance().d(th);
                return null;
            }
        }
        return null;
    }

    public List<ScanResult> getWifiScanResults() {
        if (this.f56022b != null) {
            try {
                return this.f56022b.getWifiScanResults();
            } catch (Throwable th) {
                MobLog.getInstance().d(th);
                return null;
            }
        }
        return null;
    }

    public a invocationRecord() {
        return this.f56023c;
    }

    public boolean isAdvertisingIdEnable() {
        if (this.f56022b != null) {
            try {
                return this.f56022b.isAdvertisingIdEnable();
            } catch (Throwable th) {
                MobLog.getInstance().d(th);
                return true;
            }
        }
        return true;
    }

    public boolean isAndroidIdEnable() {
        if (this.f56022b != null) {
            try {
                return this.f56022b.isAndroidIdEnable();
            } catch (Throwable th) {
                MobLog.getInstance().d(th);
                return true;
            }
        }
        return true;
    }

    public boolean isAppListDataEnable() {
        if (this.f56022b != null) {
            try {
                return this.f56022b.isAppListDataEnable();
            } catch (Throwable th) {
                MobLog.getInstance().d(th);
                return true;
            }
        }
        return true;
    }

    public boolean isCellLocationDataEnable() {
        if (this.f56022b != null) {
            try {
                return this.f56022b.isCellLocationDataEnable();
            } catch (Throwable th) {
                MobLog.getInstance().d(th);
                return true;
            }
        }
        return true;
    }

    public boolean isConfigEnable() {
        if (this.f56022b != null) {
            try {
                return this.f56022b.isConfigEnable();
            } catch (Throwable th) {
                MobLog.getInstance().d(th);
                return true;
            }
        }
        return true;
    }

    public boolean isCusControllerNotNull() {
        return this.f56022b != null;
    }

    public boolean isDREnable() {
        if (this.f56022b != null) {
            try {
                return this.f56022b.isDREnable();
            } catch (Throwable th) {
                MobLog.getInstance().d(th);
                return true;
            }
        }
        return true;
    }

    public boolean isIpAddressEnable() {
        if (this.f56022b != null) {
            try {
                return this.f56022b.isIpAddressEnable();
            } catch (Throwable th) {
                MobLog.getInstance().d(th);
                return true;
            }
        }
        return true;
    }

    public boolean isLocationDataEnable() {
        if (this.f56022b != null) {
            try {
                return this.f56022b.isLocationDataEnable();
            } catch (Throwable th) {
                MobLog.getInstance().d(th);
                return true;
            }
        }
        return true;
    }

    public boolean isOaidEnable() {
        if (this.f56022b != null) {
            try {
                return this.f56022b.isOaidEnable();
            } catch (Throwable th) {
                MobLog.getInstance().d(th);
                return true;
            }
        }
        return true;
    }

    public boolean isPhoneStateDataEnable() {
        if (this.f56022b != null) {
            try {
                return this.f56022b.isPhoneStateDataEnable();
            } catch (Throwable th) {
                MobLog.getInstance().d(th);
                return true;
            }
        }
        return true;
    }

    public boolean isSocietyPlatformDataEnable() {
        if (this.f56022b != null) {
            try {
                return this.f56022b.isSocietyPlatformDataEnable();
            } catch (Throwable th) {
                MobLog.getInstance().d(th);
                return true;
            }
        }
        return true;
    }

    public boolean isWifiDataEnable() {
        if (this.f56022b != null) {
            try {
                return this.f56022b.isWifiDataEnable();
            } catch (Throwable th) {
                MobLog.getInstance().d(th);
                return true;
            }
        }
        return true;
    }

    public void updateCustomController(MobCustomController mobCustomController) {
        this.f56022b = mobCustomController;
    }
}
