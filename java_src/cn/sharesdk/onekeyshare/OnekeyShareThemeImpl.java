package cn.sharesdk.onekeyshare;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.widget.Toast;
import cn.sharesdk.framework.CustomPlatform;
import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.PlatformActionListener;
import cn.sharesdk.framework.ShareSDK;
import cn.sharesdk.framework.ShareSDKCallback;
import cn.sharesdk.sina.weibo.SinaWeibo;
import cn.sharesdk.tencent.qq.QQ;
import cn.sharesdk.tencent.qzone.QZone;
import cn.sharesdk.wechat.friends.Wechat;
import cn.sharesdk.wechat.moments.WechatMoments;
import com.join.mgps.service.CommonService_;
import com.mob.MobSDK;
import com.mob.tools.utils.ResHelper;
import com.mob.tools.utils.UIHandler;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
/* loaded from: classes2.dex */
public abstract class OnekeyShareThemeImpl implements PlatformActionListener, Handler.Callback {
    public PlatformActionListener callback = this;
    protected Context context;
    protected ArrayList<CustomerLogo> customerLogos;
    protected ShareContentCustomizeCallback customizeCallback;
    protected boolean dialogMode;
    protected boolean disableSSO;
    protected HashMap<String, String> hiddenPlatforms;
    protected HashMap<String, Object> shareParamsMap;
    protected boolean silent;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0065, code lost:
        if (r13 != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0099, code lost:
        if (r13 != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009b, code lost:
        r0 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0100, code lost:
        if (r13 != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0151, code lost:
        if (r13 != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x019b, code lost:
        if (r13 != false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void dealShareParamsMap(boolean r13) {
        /*
            Method dump skipped, instructions count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.sharesdk.onekeyshare.OnekeyShareThemeImpl.dealShareParamsMap(boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void prepareForEditPage(final Platform platform) {
        formateShareData(platform, new ShareSDKCallback<Boolean>() { // from class: cn.sharesdk.onekeyshare.OnekeyShareThemeImpl.5
            @Override // cn.sharesdk.framework.ShareSDKCallback
            public void onCallback(Boolean bool) {
                Platform.ShareParams shareDataToShareParams;
                if (!bool.booleanValue() || (shareDataToShareParams = OnekeyShareThemeImpl.this.shareDataToShareParams(platform)) == null) {
                    return;
                }
                ShareSDK.logDemoEvent(3, platform);
                shareDataToShareParams.setOpenCustomEven(true);
                ShareContentCustomizeCallback shareContentCustomizeCallback = OnekeyShareThemeImpl.this.customizeCallback;
                if (shareContentCustomizeCallback != null) {
                    shareContentCustomizeCallback.onShare(platform, shareDataToShareParams);
                }
                OnekeyShareThemeImpl onekeyShareThemeImpl = OnekeyShareThemeImpl.this;
                onekeyShareThemeImpl.showEditPage(onekeyShareThemeImpl.context, platform, shareDataToShareParams);
                OnekeyShareThemeImpl.this.customizeCallback = null;
            }
        });
    }

    private void realCallback(Platform platform, final ShareSDKCallback<Boolean> shareSDKCallback, final boolean z4, final String str) {
        platform.isClientValid(new ShareSDKCallback<Boolean>() { // from class: cn.sharesdk.onekeyshare.OnekeyShareThemeImpl.6
            @Override // cn.sharesdk.framework.ShareSDKCallback
            public void onCallback(Boolean bool) {
                if (bool.booleanValue()) {
                    OnekeyShareThemeImpl.this.dealShareParamsMap(z4);
                    ShareSDKCallback shareSDKCallback2 = shareSDKCallback;
                    if (shareSDKCallback2 != null) {
                        shareSDKCallback2.onCallback(Boolean.TRUE);
                        return;
                    }
                    return;
                }
                OnekeyShareThemeImpl.this.toast(str);
                ShareSDKCallback shareSDKCallback3 = shareSDKCallback;
                if (shareSDKCallback3 != null) {
                    shareSDKCallback3.onCallback(Boolean.FALSE);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void toast(final String str) {
        UIHandler.sendEmptyMessage(0, new Handler.Callback() { // from class: cn.sharesdk.onekeyshare.OnekeyShareThemeImpl.7
            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                int stringRes = ResHelper.getStringRes(OnekeyShareThemeImpl.this.context, str);
                if (stringRes > 0) {
                    Toast.makeText(OnekeyShareThemeImpl.this.context, stringRes, 0).show();
                } else {
                    Toast.makeText(OnekeyShareThemeImpl.this.context, str, 0).show();
                }
                return false;
            }
        });
    }

    public final void disableSSO() {
        this.disableSSO = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void formateShareData(Platform platform, ShareSDKCallback<Boolean> shareSDKCallback) {
        String name = platform.getName();
        if (!"Alipay".equals(name) && !"AlipayMoments".equals(name)) {
            if ("KakaoTalk".equals(name)) {
                realCallback(platform, shareSDKCallback, false, "ssdk_kakaotalk_client_inavailable");
                return;
            } else if ("KakaoStory".equals(name)) {
                realCallback(platform, shareSDKCallback, false, "ssdk_kakaostory_client_inavailable");
                return;
            } else if ("Line".equals(name)) {
                realCallback(platform, shareSDKCallback, false, "ssdk_line_client_inavailable");
                return;
            } else if ("WhatsApp".equals(name)) {
                realCallback(platform, shareSDKCallback, false, "ssdk_whatsapp_client_inavailable");
                return;
            } else if ("Pinterest".equals(name)) {
                realCallback(platform, shareSDKCallback, false, "ssdk_pinterest_client_inavailable");
                return;
            } else if ("Instagram".equals(name)) {
                realCallback(platform, shareSDKCallback, false, "ssdk_instagram_client_inavailable");
                return;
            } else if (QZone.NAME.equals(name)) {
                realCallback(platform, shareSDKCallback, false, "ssdk_qq_client_inavailable");
                return;
            } else if (!"Laiwang".equals(name) && !"LaiwangMoments".equals(name)) {
                if (!"YixinMoments".equals(name) && !"Yixin".equals(name)) {
                    if (!"WechatFavorite".equals(name) && !Wechat.NAME.equals(name) && !WechatMoments.NAME.equals(name)) {
                        if ("FacebookMessenger".equals(name)) {
                            realCallback(platform, shareSDKCallback, true, "ssdk_facebookmessenger_client_inavailable");
                            return;
                        } else if ("Telegram".equals(name)) {
                            realCallback(platform, shareSDKCallback, true, "ssdk_telegram_client_inavailable");
                            return;
                        } else {
                            dealShareParamsMap(false);
                            if (shareSDKCallback != null) {
                                shareSDKCallback.onCallback(Boolean.TRUE);
                                return;
                            }
                            return;
                        }
                    }
                    realCallback(platform, shareSDKCallback, true, "ssdk_wechat_client_inavailable");
                    return;
                }
                realCallback(platform, shareSDKCallback, false, "ssdk_yixin_client_inavailable");
                return;
            } else {
                realCallback(platform, shareSDKCallback, false, "ssdk_laiwang_client_inavailable");
                return;
            }
        }
        realCallback(platform, shareSDKCallback, false, "ssdk_alipay_client_inavailable");
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i4 = message.arg1;
        if (i4 == 1) {
            int stringRes = ResHelper.getStringRes(this.context, "ssdk_oks_share_completed");
            if (stringRes > 0) {
                toast(this.context.getString(stringRes));
                return false;
            }
            return false;
        } else if (i4 != 2) {
            if (i4 != 3) {
                return false;
            }
            toast("ssdk_oks_share_canceled");
            return false;
        } else {
            String simpleName = message.obj.getClass().getSimpleName();
            if (!"WechatClientNotExistException".equals(simpleName) && !"WechatTimelineNotSupportedException".equals(simpleName) && !"WechatFavoriteNotSupportedException".equals(simpleName)) {
                if ("GooglePlusClientNotExistException".equals(simpleName)) {
                    toast("ssdk_google_plus_client_inavailable");
                    return false;
                } else if ("QQClientNotExistException".equals(simpleName)) {
                    toast("ssdk_qq_client_inavailable");
                    return false;
                } else if (!"YixinClientNotExistException".equals(simpleName) && !"YixinTimelineNotSupportedException".equals(simpleName)) {
                    if ("KakaoTalkClientNotExistException".equals(simpleName)) {
                        toast("ssdk_kakaotalk_client_inavailable");
                        return false;
                    } else if ("KakaoStoryClientNotExistException".equals(simpleName)) {
                        toast("ssdk_kakaostory_client_inavailable");
                        return false;
                    } else if ("WhatsAppClientNotExistException".equals(simpleName)) {
                        toast("ssdk_whatsapp_client_inavailable");
                        return false;
                    } else if ("FacebookMessengerClientNotExistException".equals(simpleName)) {
                        toast("ssdk_facebookmessenger_client_inavailable");
                        return false;
                    } else {
                        toast("ssdk_oks_share_failed");
                        return false;
                    }
                } else {
                    toast("ssdk_yixin_client_inavailable");
                    return false;
                }
            }
            toast("ssdk_wechat_client_inavailable");
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void isUseClientToShare(Platform platform, final ShareSDKCallback<Boolean> shareSDKCallback) {
        if (platform == null) {
            if (shareSDKCallback != null) {
                shareSDKCallback.onCallback(Boolean.FALSE);
                return;
            }
            return;
        }
        String name = platform.getName();
        if (SinaWeibo.NAME.equals(name) || Wechat.NAME.equals(name) || WechatMoments.NAME.equals(name) || "WechatFavorite".equals(name) || "ShortMessage".equals(name) || "Email".equals(name) || "Qzone".equals(name) || QQ.NAME.equals(name) || "Pinterest".equals(name) || "Instagram".equals(name) || "Yixin".equals(name) || "YixinMoments".equals(name) || QZone.NAME.equals(name) || "Mingdao".equals(name) || "Line".equals(name) || "KakaoStory".equals(name) || "KakaoTalk".equals(name) || "Bluetooth".equals(name) || "WhatsApp".equals(name) || "BaiduTieba".equals(name) || "Laiwang".equals(name) || "LaiwangMoments".equals(name) || "Alipay".equals(name) || "AlipayMoments".equals(name) || "FacebookMessenger".equals(name) || "GooglePlus".equals(name) || "Dingding".equals(name) || "Youtube".equals(name) || "Meipai".equals(name) || "Telegram".equals(name) || "Douyin".equals(name) || "Oasis".equals(name) || "Tiktok".equals(name) || "Pocket".equals(name)) {
            if (shareSDKCallback != null) {
                shareSDKCallback.onCallback(Boolean.TRUE);
            }
        } else if ("Evernote".equals(name)) {
            if ("true".equals(platform.getDevinfo("ShareByAppClient"))) {
                if (shareSDKCallback != null) {
                    shareSDKCallback.onCallback(Boolean.TRUE);
                }
            } else if (shareSDKCallback != null) {
                shareSDKCallback.onCallback(Boolean.FALSE);
            }
        } else if ("Facebook".equals(name)) {
            final boolean equals = "true".equals(platform.getDevinfo("ShareByAppClient"));
            platform.isClientValid(new ShareSDKCallback<Boolean>() { // from class: cn.sharesdk.onekeyshare.OnekeyShareThemeImpl.2
                @Override // cn.sharesdk.framework.ShareSDKCallback
                public void onCallback(Boolean bool) {
                    if (equals && bool.booleanValue()) {
                        ShareSDKCallback shareSDKCallback2 = shareSDKCallback;
                        if (shareSDKCallback2 != null) {
                            shareSDKCallback2.onCallback(Boolean.TRUE);
                        }
                    } else if (OnekeyShareThemeImpl.this.shareParamsMap.containsKey("url") && !TextUtils.isEmpty((String) OnekeyShareThemeImpl.this.shareParamsMap.get("url"))) {
                        ShareSDKCallback shareSDKCallback3 = shareSDKCallback;
                        if (shareSDKCallback3 != null) {
                            shareSDKCallback3.onCallback(Boolean.TRUE);
                        }
                    } else {
                        ShareSDKCallback shareSDKCallback4 = shareSDKCallback;
                        if (shareSDKCallback4 != null) {
                            shareSDKCallback4.onCallback(Boolean.FALSE);
                        }
                    }
                }
            });
        } else if ("LinkedIn".equals(name)) {
            final boolean equals2 = "true".equals(platform.getDevinfo("ShareByAppClient"));
            platform.isClientValid(new ShareSDKCallback<Boolean>() { // from class: cn.sharesdk.onekeyshare.OnekeyShareThemeImpl.3
                @Override // cn.sharesdk.framework.ShareSDKCallback
                public void onCallback(Boolean bool) {
                    if (equals2 && bool.booleanValue()) {
                        ShareSDKCallback shareSDKCallback2 = shareSDKCallback;
                        if (shareSDKCallback2 != null) {
                            shareSDKCallback2.onCallback(Boolean.TRUE);
                            return;
                        }
                        return;
                    }
                    ShareSDKCallback shareSDKCallback3 = shareSDKCallback;
                    if (shareSDKCallback3 != null) {
                        shareSDKCallback3.onCallback(Boolean.FALSE);
                    }
                }
            });
        } else if (shareSDKCallback != null) {
            shareSDKCallback.onCallback(Boolean.FALSE);
        }
    }

    @Override // cn.sharesdk.framework.PlatformActionListener
    public final void onCancel(Platform platform, int i4) {
        Message message = new Message();
        message.arg1 = 3;
        message.arg2 = i4;
        message.obj = platform;
        UIHandler.sendMessage(message, this);
        ShareSDK.logDemoEvent(5, platform);
    }

    @Override // cn.sharesdk.framework.PlatformActionListener
    public final void onComplete(Platform platform, int i4, HashMap<String, Object> hashMap) {
        Message message = new Message();
        message.arg1 = 1;
        message.arg2 = i4;
        message.obj = platform;
        UIHandler.sendMessage(message, this);
    }

    @Override // cn.sharesdk.framework.PlatformActionListener
    public final void onError(Platform platform, int i4, Throwable th) {
        th.printStackTrace();
        Message message = new Message();
        message.arg1 = 2;
        message.arg2 = i4;
        message.obj = th;
        UIHandler.sendMessage(message, this);
        ShareSDK.logDemoEvent(4, platform);
    }

    public final void setCustomerLogos(ArrayList<CustomerLogo> arrayList) {
        this.customerLogos = arrayList;
    }

    public final void setDialogMode(boolean z4) {
        this.dialogMode = z4;
    }

    public final void setHiddenPlatforms(HashMap<String, String> hashMap) {
        this.hiddenPlatforms = hashMap;
    }

    public final void setPlatformActionListener(PlatformActionListener platformActionListener) {
        if (platformActionListener == null) {
            platformActionListener = this;
        }
        this.callback = platformActionListener;
    }

    public final void setShareContentCustomizeCallback(ShareContentCustomizeCallback shareContentCustomizeCallback) {
        this.customizeCallback = shareContentCustomizeCallback;
    }

    public final void setShareParamsMap(HashMap<String, Object> hashMap) {
        this.shareParamsMap = hashMap;
    }

    public final void setSilent(boolean z4) {
        this.silent = z4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Platform.ShareParams shareDataToShareParams(Platform platform) {
        HashMap<String, Object> hashMap;
        if (platform != null && (hashMap = this.shareParamsMap) != null) {
            try {
                Bitmap bitmap = (Bitmap) ResHelper.forceCast(this.shareParamsMap.get("viewToShare"));
                if (TextUtils.isEmpty((String) ResHelper.forceCast(hashMap.get(CommonService_.c0.f54306b))) && bitmap != null && !bitmap.isRecycled()) {
                    String cachePath = ResHelper.getCachePath(MobSDK.getContext(), "screenshot");
                    File file = new File(cachePath, String.valueOf(System.currentTimeMillis()) + ".jpg");
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    this.shareParamsMap.put(CommonService_.c0.f54306b, file.getAbsolutePath());
                }
                return new Platform.ShareParams(this.shareParamsMap);
            } catch (Throwable th) {
                th.printStackTrace();
                toast("ssdk_oks_share_failed");
                return null;
            }
        }
        toast("ssdk_oks_share_failed");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void shareSilently(final Platform platform) {
        formateShareData(platform, new ShareSDKCallback<Boolean>() { // from class: cn.sharesdk.onekeyshare.OnekeyShareThemeImpl.4
            @Override // cn.sharesdk.framework.ShareSDKCallback
            public void onCallback(Boolean bool) {
                Platform.ShareParams shareDataToShareParams;
                if (!bool.booleanValue() || (shareDataToShareParams = OnekeyShareThemeImpl.this.shareDataToShareParams(platform)) == null) {
                    return;
                }
                HashMap<String, Object> hashMap = OnekeyShareThemeImpl.this.shareParamsMap;
                if (hashMap != null) {
                    if (!Boolean.valueOf(hashMap.containsKey("disappearsharetoast") ? ((Boolean) OnekeyShareThemeImpl.this.shareParamsMap.get("disappearsharetoast")).booleanValue() : false).booleanValue()) {
                        OnekeyShareThemeImpl.this.toast("ssdk_oks_sharing");
                    }
                }
                ShareContentCustomizeCallback shareContentCustomizeCallback = OnekeyShareThemeImpl.this.customizeCallback;
                if (shareContentCustomizeCallback != null) {
                    shareContentCustomizeCallback.onShare(platform, shareDataToShareParams);
                }
                boolean z4 = OnekeyShareThemeImpl.this.disableSSO;
                if (z4) {
                    platform.SSOSetting(z4);
                }
                platform.setPlatformActionListener(OnekeyShareThemeImpl.this.callback);
                platform.share(shareDataToShareParams);
                OnekeyShareThemeImpl onekeyShareThemeImpl = OnekeyShareThemeImpl.this;
                onekeyShareThemeImpl.callback = null;
                onekeyShareThemeImpl.customizeCallback = null;
            }
        });
    }

    public final void show(Context context) {
        this.context = context;
        if (this.shareParamsMap.containsKey("platform")) {
            final Platform platform = null;
            try {
                platform = ShareSDK.getPlatform(String.valueOf(this.shareParamsMap.get("platform")));
            } catch (Throwable unused) {
            }
            final boolean z4 = platform instanceof CustomPlatform;
            isUseClientToShare(platform, new ShareSDKCallback<Boolean>() { // from class: cn.sharesdk.onekeyshare.OnekeyShareThemeImpl.1
                @Override // cn.sharesdk.framework.ShareSDKCallback
                public void onCallback(Boolean bool) {
                    if (!OnekeyShareThemeImpl.this.silent && !z4 && !bool.booleanValue()) {
                        OnekeyShareThemeImpl.this.prepareForEditPage(platform);
                    } else {
                        OnekeyShareThemeImpl.this.shareSilently(platform);
                    }
                }
            });
            return;
        }
        showPlatformPage(context);
    }

    protected abstract void showEditPage(Context context, Platform platform, Platform.ShareParams shareParams);

    protected abstract void showPlatformPage(Context context);
}
