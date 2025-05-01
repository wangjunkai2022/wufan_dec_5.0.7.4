package com.kwad.sdk.utils;

import android.location.Location;
import com.kwad.sdk.api.KsCustomController;
import com.kwad.sdk.api.SdkConfig;
import com.kwad.sdk.components.DevelopMangerComponents;
import com.kwad.sdk.service.ServiceProvider;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes5.dex */
public final class av {
    private static boolean MS() {
        if (com.kwad.framework.a.a.md.booleanValue()) {
            com.kwad.sdk.components.c.f(DevelopMangerComponents.class);
            return false;
        }
        return false;
    }

    public static boolean MT() {
        KsCustomController ksCustomController;
        if (MS()) {
            return true;
        }
        try {
            SdkConfig Lx = ServiceProvider.Lx();
            if (Lx != null && (ksCustomController = Lx.ksCustomController) != null) {
                if (!ksCustomController.canReadLocation()) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static Location MU() {
        KsCustomController ksCustomController;
        try {
            SdkConfig Lx = ServiceProvider.Lx();
            if (Lx == null || (ksCustomController = Lx.ksCustomController) == null) {
                return null;
            }
            return ksCustomController.getLocation();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String MV() {
        KsCustomController ksCustomController;
        try {
            SdkConfig Lx = ServiceProvider.Lx();
            return (Lx == null || (ksCustomController = Lx.ksCustomController) == null) ? "" : ksCustomController.getImei();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String[] MW() {
        KsCustomController ksCustomController;
        try {
            SdkConfig Lx = ServiceProvider.Lx();
            if (Lx != null && (ksCustomController = Lx.ksCustomController) != null) {
                return ksCustomController.getImeis();
            }
        } catch (Throwable unused) {
        }
        return new String[]{"", ""};
    }

    public static String MX() {
        KsCustomController ksCustomController;
        try {
            SdkConfig Lx = ServiceProvider.Lx();
            return (Lx == null || (ksCustomController = Lx.ksCustomController) == null) ? "" : ksCustomController.getAndroidId();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static boolean MY() {
        KsCustomController ksCustomController;
        if (MS()) {
            return true;
        }
        try {
            SdkConfig Lx = ServiceProvider.Lx();
            if (Lx != null && (ksCustomController = Lx.ksCustomController) != null) {
                if (!ksCustomController.canUseMacAddress()) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static String MZ() {
        KsCustomController ksCustomController;
        try {
            SdkConfig Lx = ServiceProvider.Lx();
            return (Lx == null || (ksCustomController = Lx.ksCustomController) == null) ? "" : ksCustomController.getMacAddress();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static boolean Na() {
        KsCustomController ksCustomController;
        if (MS()) {
            return true;
        }
        try {
            SdkConfig Lx = ServiceProvider.Lx();
            if (Lx != null && (ksCustomController = Lx.ksCustomController) != null) {
                if (!ksCustomController.canUseOaid()) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static String Nb() {
        KsCustomController ksCustomController;
        try {
            SdkConfig Lx = ServiceProvider.Lx();
            return (Lx == null || (ksCustomController = Lx.ksCustomController) == null) ? "" : ksCustomController.getOaid();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static boolean Nc() {
        KsCustomController ksCustomController;
        if (MS()) {
            return true;
        }
        try {
            SdkConfig Lx = ServiceProvider.Lx();
            if (Lx != null && (ksCustomController = Lx.ksCustomController) != null) {
                if (!ksCustomController.canUseNetworkState()) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static boolean Nd() {
        KsCustomController ksCustomController;
        if (MS()) {
            return true;
        }
        try {
            SdkConfig Lx = ServiceProvider.Lx();
            if (Lx != null && (ksCustomController = Lx.ksCustomController) != null) {
                if (!ksCustomController.canUseStoragePermission()) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static boolean Ne() {
        KsCustomController ksCustomController;
        if (MS()) {
            return true;
        }
        try {
            SdkConfig Lx = ServiceProvider.Lx();
            if (Lx != null && (ksCustomController = Lx.ksCustomController) != null) {
                if (!ksCustomController.canReadInstalledPackages()) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static List<String> Nf() {
        KsCustomController ksCustomController;
        try {
            SdkConfig Lx = ServiceProvider.Lx();
            if (Lx != null && (ksCustomController = Lx.ksCustomController) != null) {
                return ksCustomController.getInstalledPackages();
            }
        } catch (Throwable unused) {
        }
        return new ArrayList();
    }

    public static boolean usePhoneStateDisable() {
        KsCustomController ksCustomController;
        if (MS()) {
            return true;
        }
        try {
            SdkConfig Lx = ServiceProvider.Lx();
            if (Lx != null && (ksCustomController = Lx.ksCustomController) != null) {
                if (!ksCustomController.canUsePhoneState()) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }
}
