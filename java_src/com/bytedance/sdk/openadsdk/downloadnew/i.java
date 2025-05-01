package com.bytedance.sdk.openadsdk.downloadnew;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.EventListener;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bykv.vv.vv.vv.vv.a;
import com.bytedance.sdk.openadsdk.api.vv.n;
import com.bytedance.sdk.openadsdk.api.vv.o;
import com.bytedance.sdk.openadsdk.api.vv.u;
import com.bytedance.sdk.openadsdk.downloadnew.core.ExitInstallListener;
import com.bytedance.sdk.openadsdk.downloadnew.core.ITTDownloadAdapter;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.ss.android.download.api.config.IDownloadButtonClickListener;
import com.ss.android.download.api.config.OnItemClickListener;
import com.ss.android.download.api.download.DownloadController;
import com.ss.android.download.api.download.DownloadEventConfig;
import com.ss.android.download.api.download.DownloadModel;
import com.ss.android.download.api.download.DownloadStatusChangeListener;
import com.ss.android.download.api.model.DeepLink;
import com.ss.android.download.api.model.i;
import com.ss.android.downloadad.api.download.AdDownloadController;
import com.ss.android.downloadad.api.download.AdDownloadEventConfig;
import com.ss.android.downloadad.api.download.AdDownloadModel;
import com.ss.android.socialbase.downloader.depend.IDownloadFileUriProvider;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public final class i implements Bridge {
    private static volatile i vv;

    /* renamed from: i  reason: collision with root package name */
    private AdDownloadModel f8773i;

    /* renamed from: m  reason: collision with root package name */
    private final Context f8774m;

    /* renamed from: n  reason: collision with root package name */
    private AdDownloadEventConfig.Builder f8775n;

    /* renamed from: o  reason: collision with root package name */
    private AdDownloadController.Builder f8776o;

    /* renamed from: p  reason: collision with root package name */
    private AdDownloadModel.Builder f8777p;
    private AdDownloadEventConfig qv;

    /* renamed from: u  reason: collision with root package name */
    private AdDownloadController f8778u;

    private i(Context context) {
        this.f8774m = context;
    }

    private int eu() {
        AdDownloadController adDownloadController = this.f8778u;
        if (adDownloadController == null) {
            return 0;
        }
        return adDownloadController.getDownloadMode();
    }

    private Activity getActivity(Object obj) {
        if (obj instanceof Activity) {
            return (Activity) obj;
        }
        return null;
    }

    private DownloadModel i(Object obj) {
        if (obj instanceof DownloadModel) {
            return (DownloadModel) obj;
        }
        return null;
    }

    private void m(Map<String, Object> map) {
        if (map == null || map.size() <= 0) {
            return;
        }
        AdDownloadModel.Builder vv2 = vv(((Long) map.get("id")).longValue(), (String) map.get(TTDownloadField.TT_APP_ICON), ((Boolean) map.get(TTDownloadField.TT_IS_SHOW_NOTIFICATION)).booleanValue(), ((Boolean) map.get(TTDownloadField.TT_IS_AUTO_INSTALL_WITHOUT_NOTIFICATION)).booleanValue(), (String) map.get(TTDownloadField.TT_LOG_EXTRA), (JSONObject) map.get(TTDownloadField.TT_EXTRA_JSON), (JSONObject) map.get(TTDownloadField.TT_DOWNLOAD_SETTINGS), (String) map.get(TTDownloadField.TT_FILE_PATH), (String) map.get(TTDownloadField.TT_DOWNLOAD_URL), (String) map.get(TTDownloadField.TT_APP_NAME), (String) map.get("packageName"), ((Boolean) map.get(TTDownloadField.TT_IS_NEED_INDEPENDENT_PROCESS)).booleanValue(), (String) map.get(TTDownloadField.TT_OPEN_URL), (String) map.get(TTDownloadField.TT_WEB_TITLE), (String) map.get(TTDownloadField.TT_WEB_URL));
        this.f8777p = vv2;
        this.f8773i = vv2.build();
    }

    private ExitInstallListener n(Object obj) {
        if (obj instanceof ExitInstallListener) {
            return (ExitInstallListener) obj;
        }
        return null;
    }

    private DownloadEventConfig o(Object obj) {
        if (obj instanceof DownloadEventConfig) {
            return (DownloadEventConfig) obj;
        }
        return null;
    }

    private DownloadStatusChangeListener p(Object obj) {
        if (obj instanceof DownloadStatusChangeListener) {
            return (DownloadStatusChangeListener) obj;
        }
        if (obj instanceof EventListener) {
            return new o((EventListener) obj);
        }
        return null;
    }

    private OnItemClickListener qv(Object obj) {
        if (obj instanceof OnItemClickListener) {
            return (OnItemClickListener) obj;
        }
        if (obj instanceof EventListener) {
            return new n((EventListener) obj);
        }
        return null;
    }

    private DownloadController u(Object obj) {
        if (obj instanceof DownloadController) {
            return (DownloadController) obj;
        }
        return null;
    }

    public static i vv(Context context) {
        if (vv == null) {
            synchronized (i.class) {
                if (vv == null) {
                    vv = new i(context);
                }
            }
        }
        return vv;
    }

    private static boolean vv(IDownloadButtonClickListener iDownloadButtonClickListener) {
        return iDownloadButtonClickListener != null;
    }

    private IDownloadButtonClickListener wv(Object obj) {
        if (obj instanceof IDownloadButtonClickListener) {
            return (IDownloadButtonClickListener) obj;
        }
        if (obj instanceof EventListener) {
            return new u((EventListener) obj);
        }
        return null;
    }

    public JSONObject a() {
        AdDownloadEventConfig adDownloadEventConfig = this.qv;
        if (adDownloadEventConfig == null) {
            return null;
        }
        return adDownloadEventConfig.getParamsJson();
    }

    public boolean ah() {
        AdDownloadModel adDownloadModel = this.f8773i;
        if (adDownloadModel == null) {
            return false;
        }
        return adDownloadModel.needIndependentProcess();
    }

    public boolean b() {
        AdDownloadController adDownloadController = this.f8778u;
        if (adDownloadController == null) {
            return false;
        }
        return adDownloadController.enableShowComplianceDialog();
    }

    public long c() {
        AdDownloadModel adDownloadModel = this.f8773i;
        if (adDownloadModel == null) {
            return 0L;
        }
        return adDownloadModel.getId();
    }

    @Override // com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i4, ValueSet valueSet, Class<T> cls) {
        Map<String, Object> hashMap;
        if (i4 == 20) {
            vv((Bundle) valueSet.objectValue(0, Bundle.class));
            return null;
        }
        if (valueSet != null && valueSet.objectValue(0, Map.class) != null) {
            hashMap = (Map) valueSet.objectValue(0, Map.class);
        } else {
            hashMap = new HashMap<>();
        }
        return (T) vv(cls, i4, hashMap);
    }

    public void cl() {
        AdDownloadModel adDownloadModel = this.f8773i;
        if (adDownloadModel == null) {
            return;
        }
        adDownloadModel.forceHideNotification();
    }

    public List<String> cq() {
        AdDownloadModel adDownloadModel = this.f8773i;
        if (adDownloadModel == null) {
            return null;
        }
        return adDownloadModel.getBackupUrls();
    }

    public String d() {
        AdDownloadEventConfig adDownloadEventConfig = this.qv;
        return adDownloadEventConfig == null ? "" : adDownloadEventConfig.getRefer();
    }

    public DeepLink di() {
        AdDownloadModel adDownloadModel = this.f8773i;
        if (adDownloadModel == null) {
            return null;
        }
        return adDownloadModel.getDeepLink();
    }

    public JSONObject dj() {
        AdDownloadModel adDownloadModel = this.f8773i;
        if (adDownloadModel == null) {
            return null;
        }
        return adDownloadModel.getExtra();
    }

    public boolean dl() {
        AdDownloadModel adDownloadModel = this.f8773i;
        if (adDownloadModel == null) {
            return false;
        }
        return adDownloadModel.distinctDir();
    }

    public boolean ds() {
        AdDownloadModel adDownloadModel = this.f8773i;
        if (adDownloadModel == null) {
            return true;
        }
        return adDownloadModel.isShowNotification();
    }

    public boolean e() {
        AdDownloadModel adDownloadModel = this.f8773i;
        if (adDownloadModel == null) {
            return false;
        }
        return adDownloadModel.isInExternalPublicDir();
    }

    public int em() {
        AdDownloadModel adDownloadModel = this.f8773i;
        if (adDownloadModel == null) {
            return 1;
        }
        return adDownloadModel.getFunnelType();
    }

    public boolean ev() {
        AdDownloadModel adDownloadModel = this.f8773i;
        if (adDownloadModel == null) {
            return false;
        }
        return adDownloadModel.isInExternalPublicDir();
    }

    public long f() {
        AdDownloadModel adDownloadModel = this.f8773i;
        if (adDownloadModel == null) {
            return 0L;
        }
        return adDownloadModel.getExtraValue();
    }

    public int ff() {
        AdDownloadEventConfig adDownloadEventConfig = this.qv;
        if (adDownloadEventConfig == null) {
            return 0;
        }
        return adDownloadEventConfig.getDownloadScene();
    }

    public String fn() {
        AdDownloadModel adDownloadModel = this.f8773i;
        return adDownloadModel == null ? "" : adDownloadModel.getPackageName();
    }

    public boolean fo() {
        AdDownloadModel adDownloadModel = this.f8773i;
        if (adDownloadModel == null) {
            return false;
        }
        return adDownloadModel.isNeedWifi();
    }

    public String g() {
        AdDownloadEventConfig adDownloadEventConfig = this.qv;
        return adDownloadEventConfig == null ? "" : adDownloadEventConfig.getClickButtonTag();
    }

    public boolean h() {
        AdDownloadModel adDownloadModel = this.f8773i;
        if (adDownloadModel == null) {
            return false;
        }
        return adDownloadModel.autoInstallWithoutNotification();
    }

    public int hz() {
        AdDownloadModel adDownloadModel = this.f8773i;
        if (adDownloadModel == null) {
            return 0;
        }
        return adDownloadModel.getModelType();
    }

    public boolean j() {
        AdDownloadController adDownloadController = this.f8778u;
        if (adDownloadController == null) {
            return false;
        }
        return adDownloadController.enableOppoAutoDownload();
    }

    public String jb() {
        AdDownloadModel adDownloadModel = this.f8773i;
        return adDownloadModel == null ? "" : adDownloadModel.getName();
    }

    public boolean jh() {
        AdDownloadController adDownloadController = this.f8778u;
        if (adDownloadController == null) {
            return false;
        }
        return adDownloadController.isAutoDownloadOnCardShow();
    }

    public String ju() {
        AdDownloadModel adDownloadModel = this.f8773i;
        return adDownloadModel == null ? "" : adDownloadModel.getFilePath();
    }

    public String jz() {
        AdDownloadModel adDownloadModel = this.f8773i;
        return adDownloadModel == null ? "" : adDownloadModel.getStartToast();
    }

    public Object k() {
        AdDownloadController adDownloadController = this.f8778u;
        if (adDownloadController == null) {
            return null;
        }
        return adDownloadController.getExtraObject();
    }

    public boolean kx() {
        AdDownloadModel adDownloadModel = this.f8773i;
        if (adDownloadModel == null) {
            return true;
        }
        return adDownloadModel.isAutoInstall();
    }

    public Map<String, String> ky() {
        AdDownloadModel adDownloadModel = this.f8773i;
        if (adDownloadModel == null) {
            return null;
        }
        return adDownloadModel.getHeaders();
    }

    public String l() {
        AdDownloadEventConfig adDownloadEventConfig = this.qv;
        return adDownloadEventConfig == null ? "" : adDownloadEventConfig.getClickInstallLabel();
    }

    public String la() {
        AdDownloadEventConfig adDownloadEventConfig = this.qv;
        return adDownloadEventConfig == null ? "" : adDownloadEventConfig.getClickItemTag();
    }

    public String lb() {
        AdDownloadModel adDownloadModel = this.f8773i;
        return adDownloadModel == null ? "" : adDownloadModel.getMimeType();
    }

    public List<String> mm() {
        AdDownloadModel adDownloadModel = this.f8773i;
        if (adDownloadModel == null) {
            return null;
        }
        return adDownloadModel.getClickTrackUrl();
    }

    public String nn() {
        AdDownloadModel adDownloadModel = this.f8773i;
        return adDownloadModel == null ? "" : adDownloadModel.getFileName();
    }

    public String ns() {
        AdDownloadEventConfig adDownloadEventConfig = this.qv;
        return adDownloadEventConfig == null ? "" : adDownloadEventConfig.getStorageDenyLabel();
    }

    public String ot() {
        AdDownloadModel adDownloadModel = this.f8773i;
        return adDownloadModel == null ? "" : adDownloadModel.getDownloadUrl();
    }

    public boolean pd() {
        AdDownloadEventConfig adDownloadEventConfig = this.qv;
        if (adDownloadEventConfig == null) {
            return false;
        }
        return adDownloadEventConfig.isEnableV3Event();
    }

    public boolean pf() {
        AdDownloadModel adDownloadModel = this.f8773i;
        if (adDownloadModel == null) {
            return com.ss.android.download.api.p.m.vv(com.ss.android.socialbase.downloader.n.vv.vv(to()), lb());
        }
        return adDownloadModel.shouldDownloadWithPatchApply();
    }

    public long pj() {
        AdDownloadModel adDownloadModel = this.f8773i;
        if (adDownloadModel == null) {
            return 0L;
        }
        return adDownloadModel.getExpectFileLength();
    }

    public String pl() {
        AdDownloadModel adDownloadModel = this.f8773i;
        return adDownloadModel == null ? "" : adDownloadModel.getLogExtra();
    }

    public boolean q() {
        AdDownloadController adDownloadController = this.f8778u;
        if (adDownloadController == null) {
            return false;
        }
        return adDownloadController.enableAM();
    }

    public void qb() {
        AdDownloadModel adDownloadModel = this.f8773i;
        if (adDownloadModel == null) {
            return;
        }
        adDownloadModel.forceWifi();
    }

    public String qd() {
        AdDownloadModel adDownloadModel = this.f8773i;
        return adDownloadModel == null ? "" : adDownloadModel.getVersionName();
    }

    public boolean r() {
        AdDownloadController adDownloadController = this.f8778u;
        if (adDownloadController == null) {
            return false;
        }
        return adDownloadController.enableNewActivity();
    }

    public com.ss.android.download.api.model.i rk() {
        AdDownloadModel adDownloadModel = this.f8773i;
        if (adDownloadModel == null) {
            return null;
        }
        return adDownloadModel.getQuickAppModel();
    }

    public boolean rm() {
        AdDownloadModel adDownloadModel = this.f8773i;
        if (adDownloadModel == null) {
            return true;
        }
        return adDownloadModel.isAd();
    }

    public String rn() {
        AdDownloadModel adDownloadModel = this.f8773i;
        return adDownloadModel == null ? "" : adDownloadModel.getStartToast();
    }

    public int rx() {
        AdDownloadModel adDownloadModel = this.f8773i;
        if (adDownloadModel == null) {
            return 2;
        }
        return adDownloadModel.getExecutorGroup();
    }

    public boolean s() {
        AdDownloadModel adDownloadModel = this.f8773i;
        if (adDownloadModel == null) {
            return true;
        }
        return adDownloadModel.isShowToast();
    }

    public int sr() {
        AdDownloadModel adDownloadModel = this.f8773i;
        if (adDownloadModel == null) {
            return 0;
        }
        return adDownloadModel.getVersionCode();
    }

    public boolean t() {
        AdDownloadController adDownloadController = this.f8778u;
        if (adDownloadController == null) {
            return false;
        }
        return adDownloadController.enableAH();
    }

    public boolean td() {
        AdDownloadEventConfig adDownloadEventConfig = this.qv;
        if (adDownloadEventConfig == null) {
            return true;
        }
        return adDownloadEventConfig.isEnableClickEvent();
    }

    public String tf() {
        AdDownloadModel adDownloadModel = this.f8773i;
        return adDownloadModel == null ? "" : adDownloadModel.getNotificationJumpUrl();
    }

    public JSONObject to() {
        AdDownloadModel adDownloadModel = this.f8773i;
        if (adDownloadModel == null) {
            return null;
        }
        return adDownloadModel.getDownloadSettings();
    }

    public String uw() {
        AdDownloadModel adDownloadModel = this.f8773i;
        return adDownloadModel == null ? "" : adDownloadModel.getAppIcon();
    }

    public String v() {
        AdDownloadEventConfig adDownloadEventConfig = this.qv;
        return adDownloadEventConfig == null ? "" : adDownloadEventConfig.getClickPauseLabel();
    }

    @Override // com.bykv.vk.openvk.api.proto.Bridge
    public ValueSet values() {
        return a.b().i(0, p.vv).h(1, Boolean.valueOf(p.f8783m)).f(10000, 3).a();
    }

    public boolean vp() {
        AdDownloadModel adDownloadModel = this.f8773i;
        if (adDownloadModel == null) {
            return true;
        }
        return adDownloadModel.enablePause();
    }

    public Object vu() {
        AdDownloadEventConfig adDownloadEventConfig = this.qv;
        if (adDownloadEventConfig == null) {
            return null;
        }
        return adDownloadEventConfig.getExtraEventObject();
    }

    public JSONObject w() {
        AdDownloadEventConfig adDownloadEventConfig = this.qv;
        if (adDownloadEventConfig == null) {
            return null;
        }
        return adDownloadEventConfig.getExtraJson();
    }

    public String x() {
        AdDownloadEventConfig adDownloadEventConfig = this.qv;
        return adDownloadEventConfig == null ? "" : adDownloadEventConfig.getClickLabel();
    }

    public String y() {
        AdDownloadEventConfig adDownloadEventConfig = this.qv;
        return adDownloadEventConfig == null ? "" : adDownloadEventConfig.getClickStartLabel();
    }

    public String ya() {
        AdDownloadEventConfig adDownloadEventConfig = this.qv;
        return adDownloadEventConfig == null ? "" : adDownloadEventConfig.getClickPauseLabel();
    }

    public void yj() {
        AdDownloadModel adDownloadModel = this.f8773i;
        if (adDownloadModel == null) {
            return;
        }
        adDownloadModel.forceHideToast();
    }

    public String zn() {
        AdDownloadModel adDownloadModel = this.f8773i;
        return adDownloadModel == null ? "" : adDownloadModel.getMd5();
    }

    private void i(Map<String, Object> map) {
        if (map == null || map.size() <= 0) {
            return;
        }
        boolean booleanValue = ((Boolean) map.get(TTDownloadField.TT_IS_ENABLE_CLICK_EVENT)).booleanValue();
        boolean booleanValue2 = ((Boolean) map.get(TTDownloadField.TT_IS_ENABLE_V3_EVENT)).booleanValue();
        JSONObject jSONObject = (JSONObject) map.get(TTDownloadField.TT_EXTRA_EVENT_OBJECT);
        AdDownloadEventConfig.Builder isEnableV3Event = new AdDownloadEventConfig.Builder().setClickButtonTag((String) map.get(TTDownloadField.TT_CLICK_BUTTON_TAG)).setClickItemTag((String) map.get(TTDownloadField.TT_CLICK_ITEM_TAG)).setClickStartLabel((String) map.get(TTDownloadField.TT_LABEL_CLICK_START)).setClickContinueLabel((String) map.get(TTDownloadField.TT_LABEL_CLICK_CONTINUE)).setClickPauseLabel((String) map.get(TTDownloadField.TT_LABEL_CLICK_PAUSE)).setStorageDenyLabel((String) map.get(TTDownloadField.TT_LABEL_STORAGE_DENY)).setClickInstallLabel((String) map.get(TTDownloadField.TT_LABEL_CLICK_INSTALL)).setIsEnableClickEvent(booleanValue).setIsEnableV3Event(booleanValue2);
        this.f8775n = isEnableV3Event;
        if (jSONObject != null) {
            isEnableV3Event.setExtraEventObject(jSONObject);
        }
        this.qv = this.f8775n.build();
    }

    private void k(boolean z4) {
        AdDownloadController adDownloadController = this.f8778u;
        if (adDownloadController == null) {
            return;
        }
        try {
            adDownloadController.setEnableOppoAutoDownload(z4);
        } catch (Throwable unused) {
        }
    }

    private void o(Map<String, Object> map) {
        if (map == null || map.size() <= 0) {
            return;
        }
        int intValue = ((Integer) map.get(TTDownloadField.TT_DOWNLOAD_SCENE)).intValue();
        boolean booleanValue = ((Boolean) map.get(TTDownloadField.TT_IS_ENABLE_CLICK_EVENT)).booleanValue();
        boolean booleanValue2 = ((Boolean) map.get(TTDownloadField.TT_IS_ENABLE_V3_EVENT)).booleanValue();
        JSONObject jSONObject = (JSONObject) map.get(TTDownloadField.TT_EXTRA_EVENT_OBJECT);
        AdDownloadEventConfig.Builder paramsJson = new AdDownloadEventConfig.Builder().setClickButtonTag((String) map.get(TTDownloadField.TT_CLICK_BUTTON_TAG)).setClickItemTag((String) map.get(TTDownloadField.TT_CLICK_ITEM_TAG)).setClickLabel((String) map.get(TTDownloadField.TT_CLICK_LABEL)).setClickStartLabel((String) map.get(TTDownloadField.TT_LABEL_CLICK_START)).setClickContinueLabel((String) map.get(TTDownloadField.TT_LABEL_CLICK_CONTINUE)).setClickPauseLabel((String) map.get(TTDownloadField.TT_LABEL_CLICK_PAUSE)).setStorageDenyLabel((String) map.get(TTDownloadField.TT_LABEL_STORAGE_DENY)).setClickInstallLabel((String) map.get(TTDownloadField.TT_LABEL_CLICK_INSTALL)).setIsEnableClickEvent(booleanValue).setDownloadScene(intValue).setIsEnableV3Event(booleanValue2).setRefer((String) map.get(TTDownloadField.TT_REFER)).setExtraJson((JSONObject) map.get(TTDownloadField.TT_EXTRA_JSON)).setParamsJson((JSONObject) map.get(TTDownloadField.TT_PARAMS_JSON));
        this.f8775n = paramsJson;
        if (jSONObject != null) {
            paramsJson.setExtraEventObject(jSONObject);
        }
        this.qv = this.f8775n.build();
    }

    private void u(int i4) {
        AdDownloadController adDownloadController = this.f8778u;
        if (adDownloadController == null) {
            return;
        }
        adDownloadController.setDownloadMode(i4);
    }

    public AdDownloadModel b(String str) {
        AdDownloadModel adDownloadModel = this.f8773i;
        if (adDownloadModel == null) {
            return null;
        }
        return adDownloadModel.setAppIcon(str);
    }

    public AdDownloadModel d(String str) {
        AdDownloadModel adDownloadModel = this.f8773i;
        if (adDownloadModel == null) {
            return null;
        }
        return adDownloadModel.setVersionName(str);
    }

    public AdDownloadModel j(String str) {
        AdDownloadModel adDownloadModel = this.f8773i;
        if (adDownloadModel == null) {
            return null;
        }
        return adDownloadModel.setFileName(str);
    }

    public AdDownloadModel jh(String str) {
        AdDownloadModel adDownloadModel = this.f8773i;
        if (adDownloadModel == null) {
            return null;
        }
        return adDownloadModel.setDownloadUrl(str);
    }

    public boolean n() {
        AdDownloadController adDownloadController = this.f8778u;
        if (adDownloadController == null) {
            return false;
        }
        return adDownloadController.shouldUseNewWebView();
    }

    public AdDownloadModel q(String str) {
        AdDownloadModel adDownloadModel = this.f8773i;
        if (adDownloadModel == null) {
            return null;
        }
        return adDownloadModel.setFilePath(str);
    }

    public AdDownloadModel r(String str) {
        AdDownloadModel adDownloadModel = this.f8773i;
        if (adDownloadModel == null) {
            return null;
        }
        return adDownloadModel.setNotificationJumpUrl(str);
    }

    public AdDownloadModel t(String str) {
        AdDownloadModel adDownloadModel = this.f8773i;
        if (adDownloadModel == null) {
            return null;
        }
        return adDownloadModel.setMimeType(str);
    }

    private void p(Map<String, Object> map) {
        if (map == null || map.size() <= 0) {
            return;
        }
        int intValue = ((Integer) map.get(TTDownloadField.TT_LINK_MODE)).intValue();
        int intValue2 = ((Integer) map.get(TTDownloadField.TT_DOWNLOAD_MODE)).intValue();
        boolean booleanValue = ((Boolean) map.get(TTDownloadField.TT_IS_ENABLE_BACK_DIALOG)).booleanValue();
        boolean booleanValue2 = ((Boolean) map.get(TTDownloadField.TT_IS_ADD_TO_DOWNLOAD_MANAGE)).booleanValue();
        Object obj = map.get(TTDownloadField.TT_EXTRA_OPERATION);
        boolean booleanValue3 = ((Boolean) map.get(TTDownloadField.TT_SHOULD_USE_NEW_WEB_VIEW)).booleanValue();
        int intValue3 = ((Integer) map.get(TTDownloadField.TT_INTERCEPT_FLAG)).intValue();
        Object obj2 = map.get(TTDownloadField.TT_EXTRA_OBJECT);
        boolean booleanValue4 = ((Boolean) map.get(TTDownloadField.TT_ENABLE_SHOW_COMPLIANCE_DIALOG)).booleanValue();
        boolean booleanValue5 = ((Boolean) map.get(TTDownloadField.TT_IS_AUTO_DOWNLOAD_ON_CARD_SHOW)).booleanValue();
        boolean booleanValue6 = ((Boolean) map.get(TTDownloadField.TT_ENABLE_NEW_ACTIVITY)).booleanValue();
        boolean booleanValue7 = ((Boolean) map.get(TTDownloadField.TT_IS_ENABLE_AH)).booleanValue();
        boolean booleanValue8 = ((Boolean) map.get(TTDownloadField.TT_IS_ENABLE_AM)).booleanValue();
        AdDownloadController.Builder enableOppoAutoDownload = new AdDownloadController.Builder().setLinkMode(intValue).setDownloadMode(intValue2).setIsEnableBackDialog(booleanValue).setIsAddToDownloadManage(booleanValue2).setExtraOperation(obj).setShouldUseNewWebView(booleanValue3).setInterceptFlag(intValue3).setExtraJson((JSONObject) map.get(TTDownloadField.TT_EXTRA_JSON)).setExtraObject(obj2).setEnableShowComplianceDialog(booleanValue4).setIsAutoDownloadOnCardShow(booleanValue5).setEnableNewActivity(booleanValue6).setEnableAH(booleanValue7).setEnableAM(booleanValue8).setEnableOppoAutoDownload(((Boolean) map.get(TTDownloadField.TT_IS_ENABLE_OPPO_AUTO_DOWNLOAD)).booleanValue());
        this.f8776o = enableOppoAutoDownload;
        this.f8778u = enableOppoAutoDownload.build();
    }

    public AdDownloadModel k(String str) {
        AdDownloadModel adDownloadModel = this.f8773i;
        if (adDownloadModel == null) {
            return null;
        }
        return adDownloadModel.setPackageName(str);
    }

    public void n(String str) {
        AdDownloadModel adDownloadModel = this.f8773i;
        if (adDownloadModel == null) {
            return;
        }
        adDownloadModel.setStartToast(str);
    }

    public int qv() {
        AdDownloadController adDownloadController = this.f8778u;
        if (adDownloadController == null) {
            return 0;
        }
        return adDownloadController.getInterceptFlag();
    }

    public int u() {
        AdDownloadController adDownloadController = this.f8778u;
        if (adDownloadController == null) {
            return 1;
        }
        return adDownloadController.getDowloadChunkCount();
    }

    public JSONObject wv() {
        AdDownloadController adDownloadController = this.f8778u;
        if (adDownloadController == null) {
            return null;
        }
        return adDownloadController.getExtraJson();
    }

    private void u(Map<String, Object> map) {
        if (map == null || map.size() <= 0) {
            return;
        }
        long longValue = ((Long) map.get(TTDownloadField.TT_EXPECT_FILE_LENGTH)).longValue();
        long longValue2 = ((Long) map.get(TTDownloadField.TT_EXTRA_VALUE)).longValue();
        boolean booleanValue = ((Boolean) map.get(TTDownloadField.TT_IS_AD)).booleanValue();
        int intValue = ((Integer) map.get("modelType")).intValue();
        String str = (String) map.get(TTDownloadField.TT_MIME_TYPE);
        Map<String, String> map2 = (Map) map.get(TTDownloadField.TT_HEADERS);
        boolean booleanValue2 = ((Boolean) map.get(TTDownloadField.TT_IS_SHOW_TOAST)).booleanValue();
        boolean booleanValue3 = ((Boolean) map.get(TTDownloadField.TT_NEED_WIFI)).booleanValue();
        String str2 = (String) map.get(TTDownloadField.TT_FILE_NAME);
        int intValue2 = ((Integer) map.get(TTDownloadField.TT_VERSION_CODE)).intValue();
        String str3 = (String) map.get(TTDownloadField.TT_VERSION_NAME);
        com.ss.android.download.api.model.i vv2 = new i.vv().vv((String) map.get(TTDownloadField.TT_QUICK_APP_MODEL_OPEN_URL)).m((String) map.get(TTDownloadField.TT_QUICK_APP_MODEL_EXTRA_DATA)).vv();
        int intValue3 = ((Integer) map.get(TTDownloadField.TT_EXECUTOR_GROUP)).intValue();
        String str4 = (String) map.get(TTDownloadField.TT_START_TOAST);
        String str5 = (String) map.get(TTDownloadField.TT_SDK_MONITOR_SCENE);
        boolean booleanValue4 = ((Boolean) map.get(TTDownloadField.TT_AUTO_INSTALL)).booleanValue();
        boolean booleanValue5 = ((Boolean) map.get(TTDownloadField.TT_DISTINCT_DIR)).booleanValue();
        boolean booleanValue6 = ((Boolean) map.get(TTDownloadField.TT_ENABLE_PAUSE)).booleanValue();
        long longValue3 = ((Long) map.get("id")).longValue();
        boolean booleanValue7 = ((Boolean) map.get(TTDownloadField.TT_IS_SHOW_NOTIFICATION)).booleanValue();
        boolean booleanValue8 = ((Boolean) map.get(TTDownloadField.TT_IS_AUTO_INSTALL_WITHOUT_NOTIFICATION)).booleanValue();
        JSONObject jSONObject = (JSONObject) map.get(TTDownloadField.TT_EXTRA_JSON);
        JSONObject jSONObject2 = (JSONObject) map.get(TTDownloadField.TT_DOWNLOAD_SETTINGS);
        String str6 = (String) map.get(TTDownloadField.TT_FILE_PATH);
        String str7 = (String) map.get(TTDownloadField.TT_DOWNLOAD_URL);
        String str8 = (String) map.get(TTDownloadField.TT_APP_NAME);
        String str9 = (String) map.get("packageName");
        boolean booleanValue9 = ((Boolean) map.get(TTDownloadField.TT_IS_NEED_INDEPENDENT_PROCESS)).booleanValue();
        String str10 = (String) map.get(TTDownloadField.TT_OPEN_URL);
        String str11 = (String) map.get(TTDownloadField.TT_WEB_TITLE);
        String str12 = (String) map.get(TTDownloadField.TT_WEB_URL);
        AdDownloadModel.Builder fileUriProvider = new AdDownloadModel.Builder().setExpectFileLength(longValue).setMd5((String) map.get("md5")).setId(longValue3).setExtraValue(longValue2).setIsAd(booleanValue).setModelType(intValue).setLogExtra((String) map.get(TTDownloadField.TT_LOG_EXTRA)).setAppIcon((String) map.get(TTDownloadField.TT_APP_ICON)).setBackupUrls((List) map.get(TTDownloadField.TT_BACK_UP_URLS)).setNotificationJumpUrl((String) map.get(TTDownloadField.TT_NOTIFICATION_JUMP_URL)).setClickTrackUrl((List) map.get(TTDownloadField.TT_CLICK_TRACK_URL)).setMimeType(str).setHeaders(map2).setIsShowToast(booleanValue2).setIsShowNotification(booleanValue7).setNeedWifi(booleanValue3).setFileName(str2).setVersionCode(intValue2).setVersionName(str3).setQuickAppModel(vv2).setAutoInstallWithoutNotification(booleanValue8).setExecutorGroup(intValue3).setStartToast(str4).setSdkMonitorScene(str5).setAutoInstall(booleanValue4).setDistinctDir(booleanValue5).setEnablePause(booleanValue6).setExtra(jSONObject).setFileUriProvider(new IDownloadFileUriProvider() { // from class: com.bytedance.sdk.openadsdk.downloadnew.i.2
            @Override // com.ss.android.socialbase.downloader.depend.IDownloadFileUriProvider
            public Uri getUriForFile(String str13, String str14) {
                return null;
            }
        });
        if (jSONObject2 != null) {
            fileUriProvider.setDownloadSettings(jSONObject2);
        }
        if (!TextUtils.isEmpty(str6)) {
            fileUriProvider.setFilePath(str6);
        }
        if (!TextUtils.isEmpty(str7)) {
            fileUriProvider.setDownloadUrl(str7);
        }
        if (!TextUtils.isEmpty(str8)) {
            fileUriProvider.setAppName(str8);
        }
        if (!TextUtils.isEmpty(str9)) {
            fileUriProvider.setPackageName(str9);
        }
        fileUriProvider.setNeedIndependentProcess(booleanValue9);
        fileUriProvider.setDeepLink(vv(longValue3, str10, str11, str12));
        this.f8773i = this.f8777p.build();
    }

    public AdDownloadModel n(boolean z4) {
        AdDownloadModel adDownloadModel = this.f8773i;
        if (adDownloadModel == null) {
            return null;
        }
        return adDownloadModel.setIsShowNotification(z4);
    }

    public void qv(String str) {
        AdDownloadModel adDownloadModel = this.f8773i;
        if (adDownloadModel == null) {
            return;
        }
        adDownloadModel.setSdkMonitorScene(str);
    }

    public <T> T vv(Class<T> cls, int i4, Map<String, Object> map) {
        DownloadModel i5;
        DownloadModel i6;
        DownloadEventConfig o4;
        DownloadController u4;
        DownloadModel i7;
        DownloadEventConfig o5;
        DownloadController u5;
        DownloadEventConfig o6;
        DownloadController u6;
        DownloadEventConfig o7;
        DownloadController u7;
        switch (i4) {
            case 0:
                return (T) Boolean.valueOf(p.vv(getActivity(map.get(TTDownloadField.TT_ACTIVITY)), n(map.get(TTDownloadField.TT_EXIT_INSTALL_LISTENER))));
            case 1:
                return (T) p.vv().u();
            case 2:
                try {
                    return (T) Boolean.valueOf(p.vv((String) map.get(TTDownloadField.TT_TAG_INTERCEPT), (String) map.get("label"), new JSONObject((String) map.get("meta")), new HashMap()));
                } catch (JSONException unused) {
                    return (T) Boolean.FALSE;
                }
            case 3:
                p.vv(((Integer) map.get(TTDownloadField.TT_HID)).intValue());
                return null;
            case 4:
                AdDownloadModel adDownloadModel = this.f8773i;
                p.vv().vv(adDownloadModel == null ? (String) map.get(TTDownloadField.TT_DOWNLOAD_URL) : adDownloadModel.getDownloadUrl(), ((Integer) map.get(TTDownloadField.TT_HASHCODE)).intValue());
                return null;
            case 5:
                int intValue = ((Integer) map.get(TTDownloadField.TT_HASHCODE)).intValue();
                AdDownloadModel adDownloadModel2 = this.f8773i;
                if (adDownloadModel2 == null) {
                    i5 = i(map.get(TTDownloadField.TT_DOWNLOAD_MODEL));
                } else {
                    i5 = i(adDownloadModel2);
                }
                p.vv().vv(this.f8774m, intValue, p(map.get(TTDownloadField.TT_DOWNLOAD_STATUSCHANGE_LISTENER)), i5);
                return null;
            case 6:
                AdDownloadModel adDownloadModel3 = this.f8773i;
                return (T) Boolean.valueOf(p.vv(this.f8774m, adDownloadModel3 == null ? (String) map.get(TTDownloadField.TT_DOWNLOAD_URL) : adDownloadModel3.getDownloadUrl()));
            case 7:
                p.m();
                return null;
            case 8:
                AdDownloadModel adDownloadModel4 = this.f8773i;
                p.vv().vv(adDownloadModel4 == null ? (String) map.get(TTDownloadField.TT_DOWNLOAD_URL) : adDownloadModel4.getDownloadUrl(), ((Boolean) map.get(TTDownloadField.TT_FORCE)).booleanValue());
                return null;
            case 9:
                p.vv(((Integer) map.get("id")).intValue(), (ITTDownloadAdapter.OnEventLogHandler) map.get(TTDownloadField.TT_ONEVENT_LOG_HANDLER));
                return null;
            case 10:
                p.vv((String) map.get(TTDownloadField.TT_DOWNLOAD_PATH));
                return null;
            case 11:
            case 20:
            case 21:
            case 22:
            case 43:
            case 77:
            case 126:
            case 138:
            default:
                return null;
            case 12:
                Uri uri = (Uri) map.get("uri");
                AdDownloadModel adDownloadModel5 = this.f8773i;
                if (adDownloadModel5 == null) {
                    i6 = i(map.get(TTDownloadField.TT_DOWNLOAD_MODEL));
                } else {
                    i6 = i(adDownloadModel5);
                }
                AdDownloadEventConfig adDownloadEventConfig = this.qv;
                if (adDownloadEventConfig == null) {
                    o4 = o(map.get(TTDownloadField.TT_DOWNLOAD_EVENT_CONFIG));
                } else {
                    o4 = o(adDownloadEventConfig);
                }
                AdDownloadController adDownloadController = this.f8778u;
                if (adDownloadController == null) {
                    u4 = u(map.get(TTDownloadField.TT_DOWNLOAD_CONTROLLER));
                } else {
                    u4 = u(adDownloadController);
                }
                IDownloadButtonClickListener wv = wv(map.get(TTDownloadField.TT_DOWNLOAD_BUTTON_CLICK_LISTENER));
                if (vv(wv)) {
                    return (T) Boolean.valueOf(p.vv(this.f8774m, uri, i6, o4, u4, wv));
                }
                return (T) Boolean.valueOf(p.vv(this.f8774m, uri, i6, o4, u4));
            case 13:
                int intValue2 = ((Integer) map.get(TTDownloadField.TT_HASHCODE)).intValue();
                boolean booleanValue = ((Boolean) map.get(TTDownloadField.TT_IS_DISABLE_DIALOG)).booleanValue();
                String str = (String) map.get(TTDownloadField.TT_USERAGENT);
                AdDownloadModel adDownloadModel6 = this.f8773i;
                if (adDownloadModel6 == null) {
                    i7 = i(map.get(TTDownloadField.TT_DOWNLOAD_MODEL));
                } else {
                    i7 = i(adDownloadModel6);
                }
                DownloadModel downloadModel = i7;
                AdDownloadEventConfig adDownloadEventConfig2 = this.qv;
                if (adDownloadEventConfig2 == null) {
                    o5 = o(map.get(TTDownloadField.TT_DOWNLOAD_EVENT_CONFIG));
                } else {
                    o5 = o(adDownloadEventConfig2);
                }
                DownloadEventConfig downloadEventConfig = o5;
                AdDownloadController adDownloadController2 = this.f8778u;
                if (adDownloadController2 == null) {
                    u5 = u(map.get(TTDownloadField.TT_DOWNLOAD_CONTROLLER));
                } else {
                    u5 = u(adDownloadController2);
                }
                DownloadController downloadController = u5;
                DownloadStatusChangeListener p4 = p(map.get(TTDownloadField.TT_DOWNLOAD_STATUSCHANGE_LISTENER));
                IDownloadButtonClickListener wv2 = wv(map.get(TTDownloadField.TT_DOWNLOAD_BUTTON_CLICK_LISTENER));
                if (vv(wv2)) {
                    p.vv().o().vv(this.f8774m, str, booleanValue, downloadModel, downloadEventConfig, downloadController, p4, intValue2, wv2);
                    return null;
                }
                p.vv().o().vv(this.f8774m, str, booleanValue, downloadModel, downloadEventConfig, downloadController, p4, intValue2);
                return null;
            case 14:
                AdDownloadModel adDownloadModel7 = this.f8773i;
                long longValue = adDownloadModel7 == null ? ((Long) map.get("id")).longValue() : adDownloadModel7.getId();
                AdDownloadModel adDownloadModel8 = this.f8773i;
                return (T) Boolean.valueOf(p.vv().o().vv(this.f8774m, longValue, adDownloadModel8 == null ? (String) map.get(TTDownloadField.TT_LOG_EXTRA) : adDownloadModel8.getLogExtra(), (DownloadStatusChangeListener) null, ((Integer) map.get(TTDownloadField.TT_HASHCODE)).intValue()));
            case 15:
                return (T) Boolean.valueOf(p.vv((Uri) map.get("uri")));
            case 16:
                AdDownloadModel adDownloadModel9 = this.f8773i;
                String downloadUrl = adDownloadModel9 == null ? (String) map.get(TTDownloadField.TT_DOWNLOAD_URL) : adDownloadModel9.getDownloadUrl();
                AdDownloadModel adDownloadModel10 = this.f8773i;
                long longValue2 = adDownloadModel10 == null ? ((Long) map.get("id")).longValue() : adDownloadModel10.getId();
                int intValue3 = ((Integer) map.get(TTDownloadField.TT_ACTION_TYPE_BUTTON)).intValue();
                AdDownloadEventConfig adDownloadEventConfig3 = this.qv;
                if (adDownloadEventConfig3 == null) {
                    o6 = o(map.get(TTDownloadField.TT_DOWNLOAD_EVENT_CONFIG));
                } else {
                    o6 = o(adDownloadEventConfig3);
                }
                DownloadEventConfig downloadEventConfig2 = o6;
                AdDownloadController adDownloadController3 = this.f8778u;
                if (adDownloadController3 == null) {
                    u6 = u(map.get(TTDownloadField.TT_DOWNLOAD_CONTROLLER));
                } else {
                    u6 = u(adDownloadController3);
                }
                p.vv().vv(downloadUrl, longValue2, intValue3, downloadEventConfig2, u6);
                return null;
            case 17:
                AdDownloadModel adDownloadModel11 = this.f8773i;
                String downloadUrl2 = adDownloadModel11 == null ? (String) map.get(TTDownloadField.TT_DOWNLOAD_URL) : adDownloadModel11.getDownloadUrl();
                long longValue3 = ((Long) map.get("id")).longValue();
                int intValue4 = ((Integer) map.get(TTDownloadField.TT_ACTION_TYPE_BUTTON)).intValue();
                AdDownloadEventConfig adDownloadEventConfig4 = this.qv;
                if (adDownloadEventConfig4 == null) {
                    o7 = o(map.get(TTDownloadField.TT_DOWNLOAD_EVENT_CONFIG));
                } else {
                    o7 = o(adDownloadEventConfig4);
                }
                DownloadEventConfig downloadEventConfig3 = o7;
                AdDownloadController adDownloadController4 = this.f8778u;
                if (adDownloadController4 == null) {
                    u7 = u(map.get(TTDownloadField.TT_DOWNLOAD_CONTROLLER));
                } else {
                    u7 = u(adDownloadController4);
                }
                p.vv().vv(downloadUrl2, longValue3, intValue4, downloadEventConfig3, u7, qv(map.get(TTDownloadField.TT_ITEM_CLICK_LISTENER)), wv(map.get(TTDownloadField.TT_DOWNLOAD_BUTTON_CLICK_LISTENER)));
                return null;
            case 18:
                AdDownloadModel adDownloadModel12 = this.f8773i;
                return (T) Boolean.valueOf(p.vv().o().vv(adDownloadModel12 == null ? ((Long) map.get("id")).longValue() : adDownloadModel12.getId(), ((Integer) map.get(TTDownloadField.TT_HASHCODE)).intValue()));
            case 19:
                AdDownloadModel adDownloadModel13 = this.f8773i;
                return (T) Boolean.valueOf(p.vv().o().vv(adDownloadModel13 == null ? ((Long) map.get("id")).longValue() : adDownloadModel13.getId()));
            case 23:
                if (((Boolean) map.get(TTDownloadField.TT_MATE_IS_EMPTY)).booleanValue()) {
                    AdDownloadModel.Builder builder = new AdDownloadModel.Builder();
                    this.f8777p = builder;
                    this.f8773i = builder.build();
                    return null;
                }
                m(map);
                return null;
            case 24:
                vv((String) map.get(TTDownloadField.TT_APP_ICON), (String) map.get(TTDownloadField.TT_APP_NAME), (String) map.get("packageName"));
                return null;
            case 25:
                vv(((Integer) map.get(TTDownloadField.TT_AUTO_OPEN)).intValue(), ((Integer) map.get(TTDownloadField.TT_DOWNLOAD_MODE)).intValue(), ((Boolean) map.get(TTDownloadField.TT_IS_HAVE_DOWNLOAD_SDK_CONFIG)).booleanValue(), ((Boolean) map.get(TTDownloadField.TT_IS_ENABLE_AH)).booleanValue(), ((Boolean) map.get(TTDownloadField.TT_IS_ENABLE_AM)).booleanValue());
                return null;
            case 26:
                u(((Integer) map.get(TTDownloadField.TT_DOWNLOAD_MODE)).intValue());
                return null;
            case 27:
                return (T) Integer.valueOf(eu());
            case 28:
                k(((Boolean) map.get(TTDownloadField.TT_IS_ENABLE_OPPO_AUTO_DOWNLOAD)).booleanValue());
                return null;
            case 29:
                i(map);
                return null;
            case 30:
                m(((Integer) map.get(TTDownloadField.TT_DOWNLOAD_SCENE)).intValue());
                return null;
            case 31:
                o(((Boolean) map.get(TTDownloadField.TT_IS_SHOW_TOAST)).booleanValue());
                return null;
            case 32:
                p(map);
                return null;
            case 33:
                return (T) Integer.valueOf(vv());
            case 34:
                return (T) Boolean.valueOf(m());
            case 35:
                return (T) Boolean.valueOf(p());
            case 36:
                return (T) i();
            case 37:
                return (T) Boolean.valueOf(o());
            case 38:
                return (T) Integer.valueOf(u());
            case 39:
                return (T) Boolean.valueOf(n());
            case 40:
                return (T) Integer.valueOf(qv());
            case 41:
                return (T) wv();
            case 42:
                return (T) k();
            case 44:
                vv(((Integer) map.get(TTDownloadField.TT_LINK_MODE)).intValue());
                return null;
            case 45:
                return (T) Boolean.valueOf(b());
            case 46:
                vv(((Boolean) map.get(TTDownloadField.TT_ENABLE_SHOW_COMPLIANCE_DIALOG)).booleanValue());
                return null;
            case 47:
                return (T) Boolean.valueOf(jh());
            case 48:
                return (T) Boolean.valueOf(r());
            case 49:
                m(((Boolean) map.get(TTDownloadField.TT_IS_AUTO_DOWNLOAD_ON_CARD_SHOW)).booleanValue());
                return null;
            case 50:
                p(((Boolean) map.get(TTDownloadField.TT_ENABLE_NEW_ACTIVITY)).booleanValue());
                return null;
            case 51:
                return (T) Boolean.valueOf(t());
            case 52:
                return (T) Boolean.valueOf(q());
            case 53:
                vv(map.get(TTDownloadField.TT_EXTRA_OBJECT));
                return null;
            case 54:
                vv((JSONObject) map.get(TTDownloadField.TT_EXTRA_JSON));
                return null;
            case 55:
                return (T) Boolean.valueOf(j());
            case 56:
                o(map);
                return null;
            case 57:
                return (T) String.valueOf(d());
            case 58:
                return (T) String.valueOf(g());
            case 59:
                return (T) String.valueOf(la());
            case 60:
                return (T) String.valueOf(x());
            case 61:
                return (T) String.valueOf(y());
            case 62:
                return (T) String.valueOf(v());
            case 63:
                return (T) String.valueOf(ya());
            case 64:
                return (T) String.valueOf(l());
            case 65:
                return (T) String.valueOf(ns());
            case 66:
                return (T) vu();
            case 67:
                return (T) Integer.valueOf(ff());
            case 68:
                return (T) Boolean.valueOf(td());
            case 69:
                return (T) Boolean.valueOf(pd());
            case 70:
                return (T) w();
            case 71:
                return (T) a();
            case 72:
                m(map.get(TTDownloadField.TT_EXTRA_EVENT_OBJECT));
                return null;
            case 73:
                vv((String) map.get(TTDownloadField.TT_CLICK_BUTTON_TAG));
                return null;
            case 74:
                m((JSONObject) map.get(TTDownloadField.TT_EVENT_CONFIG_EXTRA_JSON));
                return null;
            case 75:
                p((JSONObject) map.get(TTDownloadField.TT_PARAMS_JSON));
                return null;
            case 76:
                m((String) map.get(TTDownloadField.TT_CLICK_ITEM_TAG));
                return null;
            case 78:
                p((String) map.get(TTDownloadField.TT_REFER));
                return null;
            case 79:
                i((String) map.get(TTDownloadField.TT_QUICK_APP_EVENT_TAG));
                return null;
            case 80:
                u(map);
                return null;
            case 81:
                return (T) Long.valueOf(c());
            case 82:
                return (T) String.valueOf(zn());
            case 83:
                return (T) Long.valueOf(pj());
            case 84:
                return (T) Long.valueOf(f());
            case 85:
                return (T) String.valueOf(ot());
            case 86:
                return (T) cq();
            case 87:
                return (T) String.valueOf(tf());
            case 88:
                return (T) String.valueOf(jb());
            case 89:
                return (T) String.valueOf(lb());
            case 90:
                return (T) ky();
            case 91:
                return (T) Boolean.valueOf(s());
            case 92:
                return (T) Boolean.valueOf(ds());
            case 93:
                return (T) Boolean.valueOf(fo());
            case 94:
                return (T) Boolean.valueOf(ev());
            case 95:
                return (T) Boolean.valueOf(e());
            case 96:
                return (T) String.valueOf(ju());
            case 97:
                return (T) String.valueOf(nn());
            case 98:
                qb();
                return null;
            case 99:
                return (T) to();
            case 100:
                yj();
                return null;
            case 101:
                cl();
                return null;
            case 102:
                return (T) Boolean.valueOf(ah());
            case 103:
                return (T) Integer.valueOf(sr());
            case 104:
                return (T) String.valueOf(qd());
            case 105:
                return (T) Boolean.valueOf(rm());
            case 106:
                return (T) String.valueOf(pl());
            case 107:
                return (T) String.valueOf(fn());
            case 108:
                return (T) String.valueOf(uw());
            case 109:
                return (T) di();
            case 110:
                return (T) mm();
            case 111:
                return (T) dj();
            case 112:
                return (T) Integer.valueOf(hz());
            case 113:
                return (T) rk();
            case 114:
                return (T) Boolean.valueOf(h());
            case 115:
                return (T) Boolean.valueOf(pf());
            case 116:
                return (T) Integer.valueOf(rx());
            case 117:
                return (T) Integer.valueOf(em());
            case 118:
                return (T) String.valueOf(jz());
            case 119:
                return (T) String.valueOf(rn());
            case 120:
                return (T) Boolean.valueOf(kx());
            case 121:
                return (T) Boolean.valueOf(dl());
            case 122:
                return (T) Boolean.valueOf(vp());
            case 123:
                o((String) map.get("md5"));
                return null;
            case 124:
                vv(((Long) map.get(TTDownloadField.TT_EXPECT_FILE_LENGTH)).longValue());
                return null;
            case 125:
                i(((Boolean) map.get(TTDownloadField.TT_NEED_WIFI)).booleanValue());
                return null;
            case 127:
                m(((Long) map.get(TTDownloadField.TT_EXTRA_VALUE)).longValue());
                return null;
            case 128:
                u((String) map.get(TTDownloadField.TT_APP_NAME));
                return null;
            case 129:
                i((JSONObject) map.get(TTDownloadField.TT_EXTRA_JSON));
                return null;
            case 130:
                n((String) map.get(TTDownloadField.TT_START_TOAST));
                return null;
            case 131:
                qv((String) map.get(TTDownloadField.TT_SDK_MONITOR_SCENE));
                return null;
            case 132:
                p(((Long) map.get("id")).longValue());
                return null;
            case 133:
                u(((Boolean) map.get(TTDownloadField.TT_IS_AD)).booleanValue());
                return null;
            case 134:
                p(((Integer) map.get("modelType")).intValue());
                return null;
            case 135:
                wv((String) map.get(TTDownloadField.TT_LOG_EXTRA));
                return null;
            case 136:
                k((String) map.get("packageName"));
                return null;
            case 137:
                b((String) map.get(TTDownloadField.TT_APP_ICON));
                return null;
            case 139:
                vv((List) map.get(TTDownloadField.TT_CLICK_TRACK_URL));
                return null;
            case 140:
                jh((String) map.get(TTDownloadField.TT_DOWNLOAD_URL));
                return null;
            case 141:
                m((List) map.get(TTDownloadField.TT_BACK_UP_URLS));
                return null;
            case 142:
                r((String) map.get(TTDownloadField.TT_NOTIFICATION_JUMP_URL));
                return null;
            case 143:
                t((String) map.get(TTDownloadField.TT_MIME_TYPE));
                return null;
            case 144:
                vv((Map) map.get(TTDownloadField.TT_HEADERS));
                return null;
            case 145:
                n(((Boolean) map.get(TTDownloadField.TT_IS_SHOW_NOTIFICATION)).booleanValue());
                return null;
            case 146:
                q((String) map.get(TTDownloadField.TT_FILE_PATH));
                return null;
            case 147:
                j((String) map.get(TTDownloadField.TT_FILE_NAME));
                return null;
            case 148:
                qv(((Boolean) map.get(TTDownloadField.TT_IS_NEED_INDEPENDENT_PROCESS)).booleanValue());
                return null;
            case 149:
                i(((Integer) map.get(TTDownloadField.TT_VERSION_CODE)).intValue());
                return null;
            case 150:
                d((String) map.get(TTDownloadField.TT_VERSION_NAME));
                return null;
            case 151:
                vv(new i.vv().vv((String) map.get(TTDownloadField.TT_QUICK_APP_MODEL_OPEN_URL)).m((String) map.get(TTDownloadField.TT_QUICK_APP_MODEL_EXTRA_DATA)).vv());
                return null;
            case 152:
                wv(((Boolean) map.get(TTDownloadField.TT_IS_AUTO_INSTALL_WITHOUT_NOTIFICATION)).booleanValue());
                return null;
            case 153:
                o(((Integer) map.get(TTDownloadField.TT_FUNNEL_TYPE)).intValue());
                return null;
        }
    }

    public AdDownloadModel wv(String str) {
        AdDownloadModel adDownloadModel = this.f8773i;
        if (adDownloadModel == null) {
            return null;
        }
        return adDownloadModel.setLogExtra(str);
    }

    public AdDownloadModel qv(boolean z4) {
        AdDownloadModel adDownloadModel = this.f8773i;
        if (adDownloadModel == null) {
            return null;
        }
        return adDownloadModel.setNeedIndependentProcess(z4);
    }

    public AdDownloadModel wv(boolean z4) {
        AdDownloadModel adDownloadModel = this.f8773i;
        if (adDownloadModel == null) {
            return null;
        }
        return adDownloadModel.setAutoInstallWithoutNotification(z4);
    }

    public boolean m() {
        AdDownloadController adDownloadController = this.f8778u;
        if (adDownloadController == null) {
            return false;
        }
        return adDownloadController.isEnableBackDialog();
    }

    public void m(boolean z4) {
        AdDownloadController adDownloadController = this.f8778u;
        if (adDownloadController == null) {
            return;
        }
        adDownloadController.setIsAutoDownloadOnCardShow(z4);
    }

    public void m(Object obj) {
        AdDownloadEventConfig adDownloadEventConfig = this.qv;
        if (adDownloadEventConfig == null) {
            return;
        }
        adDownloadEventConfig.setExtraEventObject(obj);
    }

    public void m(JSONObject jSONObject) {
        AdDownloadEventConfig adDownloadEventConfig = this.qv;
        if (adDownloadEventConfig == null) {
            return;
        }
        adDownloadEventConfig.setExtraJson(jSONObject);
    }

    public Object i() {
        AdDownloadController adDownloadController = this.f8778u;
        if (adDownloadController == null) {
            return null;
        }
        return adDownloadController.getExtraClickOperation();
    }

    public void m(String str) {
        AdDownloadEventConfig adDownloadEventConfig = this.qv;
        if (adDownloadEventConfig == null) {
            return;
        }
        adDownloadEventConfig.setClickItemTag(str);
    }

    public void i(String str) {
        AdDownloadEventConfig adDownloadEventConfig = this.qv;
        if (adDownloadEventConfig == null) {
            return;
        }
        adDownloadEventConfig.setQuickAppEventTag(str);
    }

    public void m(int i4) {
        AdDownloadEventConfig adDownloadEventConfig = this.qv;
        if (adDownloadEventConfig == null) {
            return;
        }
        adDownloadEventConfig.setDownloadScene(i4);
    }

    public void i(boolean z4) {
        AdDownloadModel adDownloadModel = this.f8773i;
        if (adDownloadModel == null) {
            return;
        }
        adDownloadModel.setNeedWifi(z4);
    }

    public void m(long j4) {
        AdDownloadModel adDownloadModel = this.f8773i;
        if (adDownloadModel == null) {
            return;
        }
        adDownloadModel.setExtraValue(j4);
    }

    public void i(JSONObject jSONObject) {
        AdDownloadModel adDownloadModel = this.f8773i;
        if (adDownloadModel == null) {
            return;
        }
        adDownloadModel.setExtra(jSONObject);
    }

    public AdDownloadModel m(List<String> list) {
        AdDownloadModel adDownloadModel = this.f8773i;
        if (adDownloadModel == null) {
            return null;
        }
        return adDownloadModel.setBackupUrls(list);
    }

    public AdDownloadModel i(int i4) {
        AdDownloadModel adDownloadModel = this.f8773i;
        if (adDownloadModel == null) {
            return null;
        }
        return adDownloadModel.setVersionCode(i4);
    }

    public boolean o() {
        AdDownloadController adDownloadController = this.f8778u;
        if (adDownloadController == null) {
            return false;
        }
        return adDownloadController.isEnableMultipleDownload();
    }

    public void o(String str) {
        AdDownloadModel adDownloadModel = this.f8773i;
        if (adDownloadModel == null) {
            return;
        }
        adDownloadModel.setMd5(str);
    }

    public boolean p() {
        AdDownloadController adDownloadController = this.f8778u;
        if (adDownloadController == null) {
            return false;
        }
        return adDownloadController.isAddToDownloadManage();
    }

    public void o(boolean z4) {
        AdDownloadModel adDownloadModel = this.f8773i;
        if (adDownloadModel == null) {
            return;
        }
        adDownloadModel.setIsShowToast(z4);
    }

    public void p(boolean z4) {
        AdDownloadController adDownloadController = this.f8778u;
        if (adDownloadController == null) {
            return;
        }
        adDownloadController.setEnableNewActivity(z4);
    }

    public AdDownloadModel o(int i4) {
        AdDownloadModel adDownloadModel = this.f8773i;
        if (adDownloadModel == null) {
            return null;
        }
        return adDownloadModel.setFunnelType(i4);
    }

    public void p(JSONObject jSONObject) {
        AdDownloadEventConfig adDownloadEventConfig = this.qv;
        if (adDownloadEventConfig == null) {
            return;
        }
        adDownloadEventConfig.setParamsJson(jSONObject);
    }

    public void p(String str) {
        AdDownloadEventConfig adDownloadEventConfig = this.qv;
        if (adDownloadEventConfig == null) {
            return;
        }
        adDownloadEventConfig.setRefer(str);
    }

    public AdDownloadModel p(long j4) {
        AdDownloadModel adDownloadModel = this.f8773i;
        if (adDownloadModel == null) {
            return null;
        }
        return adDownloadModel.setId(j4);
    }

    public AdDownloadModel p(int i4) {
        AdDownloadModel adDownloadModel = this.f8773i;
        if (adDownloadModel == null) {
            return null;
        }
        return adDownloadModel.setModelType(i4);
    }

    public void u(String str) {
        AdDownloadModel adDownloadModel = this.f8773i;
        if (adDownloadModel == null) {
            return;
        }
        adDownloadModel.setAppName(str);
    }

    public AdDownloadModel u(boolean z4) {
        AdDownloadModel adDownloadModel = this.f8773i;
        if (adDownloadModel == null) {
            return null;
        }
        return adDownloadModel.setIsAd(z4);
    }

    public void vv(Bundle bundle) {
        p.vv(this.f8774m);
    }

    private AdDownloadModel.Builder vv(long j4, String str, boolean z4, boolean z5, String str2, JSONObject jSONObject, JSONObject jSONObject2, String str3, String str4, String str5, String str6, boolean z6, String str7, String str8, String str9) {
        AdDownloadModel.Builder fileUriProvider = new AdDownloadModel.Builder().setAdId(j4).setAppIcon(str).setIsShowNotification(z4).setAutoInstallWithoutNotification(z5).setLogExtra(str2).setExtra(jSONObject).setDistinctDir(true).setIsAd(true).setFileUriProvider(new IDownloadFileUriProvider() { // from class: com.bytedance.sdk.openadsdk.downloadnew.i.1
            @Override // com.ss.android.socialbase.downloader.depend.IDownloadFileUriProvider
            public Uri getUriForFile(String str10, String str11) {
                return null;
            }
        });
        if (jSONObject2 != null) {
            fileUriProvider.setDownloadSettings(jSONObject2);
        }
        if (!TextUtils.isEmpty(str3)) {
            fileUriProvider.setFilePath(str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            fileUriProvider.setDownloadUrl(str4);
        }
        if (!TextUtils.isEmpty(str5)) {
            fileUriProvider.setAppName(str5);
        }
        if (!TextUtils.isEmpty(str6)) {
            fileUriProvider.setPackageName(str6);
        }
        fileUriProvider.setNeedIndependentProcess(z6);
        fileUriProvider.setDeepLink(vv(j4, str7, str8, str9));
        return fileUriProvider;
    }

    private DeepLink vv(long j4, String str, String str2, String str3) {
        DeepLink deepLink = new DeepLink();
        deepLink.setId(j4);
        deepLink.setOpenUrl(str);
        deepLink.setWebTitle(str2);
        deepLink.setWebUrl(str3);
        return deepLink;
    }

    private void vv(String str, String str2, String str3) {
        AdDownloadModel.Builder builder = this.f8777p;
        if (builder == null) {
            return;
        }
        this.f8773i = builder.setAppIcon(str).setAppName(str2).setPackageName(str3).build();
    }

    private void vv(int i4, int i5, boolean z4, boolean z5, boolean z6) {
        AdDownloadController.Builder isAddToDownloadManage = new AdDownloadController.Builder().setLinkMode(i4).setDownloadMode(i5).setIsEnableBackDialog(true).setIsAddToDownloadManage(false);
        this.f8776o = isAddToDownloadManage;
        if (z4) {
            isAddToDownloadManage.setEnableAH(z5);
            this.f8776o.setEnableAM(z6);
        }
        this.f8778u = this.f8776o.build();
    }

    public int vv() {
        AdDownloadController adDownloadController = this.f8778u;
        if (adDownloadController == null) {
            return 0;
        }
        return adDownloadController.getLinkMode();
    }

    public void vv(int i4) {
        AdDownloadController adDownloadController = this.f8778u;
        if (adDownloadController == null) {
            return;
        }
        adDownloadController.setLinkMode(i4);
    }

    public void vv(boolean z4) {
        AdDownloadController adDownloadController = this.f8778u;
        if (adDownloadController == null) {
            return;
        }
        adDownloadController.setEnableShowComplianceDialog(z4);
    }

    public void vv(Object obj) {
        AdDownloadController adDownloadController = this.f8778u;
        if (adDownloadController == null) {
            return;
        }
        adDownloadController.setExtraObject(obj);
    }

    public void vv(JSONObject jSONObject) {
        AdDownloadController adDownloadController = this.f8778u;
        if (adDownloadController == null) {
            return;
        }
        adDownloadController.setExtraJson(jSONObject);
    }

    public void vv(String str) {
        AdDownloadEventConfig adDownloadEventConfig = this.qv;
        if (adDownloadEventConfig == null) {
            return;
        }
        adDownloadEventConfig.setClickButtonTag(str);
    }

    public void vv(long j4) {
        AdDownloadModel adDownloadModel = this.f8773i;
        if (adDownloadModel == null) {
            return;
        }
        adDownloadModel.setExpectFileLength(j4);
    }

    public AdDownloadModel vv(List<String> list) {
        AdDownloadModel adDownloadModel = this.f8773i;
        if (adDownloadModel == null) {
            return null;
        }
        return adDownloadModel.setClickTrackUrl(list);
    }

    public AdDownloadModel vv(Map<String, String> map) {
        AdDownloadModel adDownloadModel = this.f8773i;
        if (adDownloadModel == null) {
            return null;
        }
        return adDownloadModel.setHeaders(map);
    }

    public AdDownloadModel vv(com.ss.android.download.api.model.i iVar) {
        AdDownloadModel adDownloadModel = this.f8773i;
        if (adDownloadModel == null) {
            return null;
        }
        return adDownloadModel.setQuickAppModel(iVar);
    }
}
