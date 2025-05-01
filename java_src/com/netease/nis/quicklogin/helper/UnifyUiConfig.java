package com.netease.nis.quicklogin.helper;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.cmic.sso.sdk.auth.AuthnHelper;
import com.cmic.sso.sdk.view.AuthThemeConfig;
import com.cmic.sso.sdk.view.LoginClickListener;
import com.netease.nis.basesdk.Logger;
import com.netease.nis.quicklogin.R;
import com.netease.nis.quicklogin.listener.ActivityLifecycleCallbacks;
import com.netease.nis.quicklogin.listener.ActivityResultCallbacks;
import com.netease.nis.quicklogin.listener.ClickEventListener;
import com.netease.nis.quicklogin.listener.LoginListener;
import com.netease.nis.quicklogin.listener.MaskNumberListener;
import com.netease.nis.quicklogin.utils.LoginUiHelper;
import com.netease.nis.quicklogin.utils.h;
import com.netease.nis.quicklogin.utils.i;
import java.util.ArrayList;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class UnifyUiConfig {
    public static final int CHECKBOX_CHECKED = 1;
    public static final int CHECKBOX_UNCHECKED = 0;
    public static final int CLICK_CHECKBOX = 2;
    public static final int CLICK_LOGIN_BUTTON = 4;
    public static final int CLICK_PRIVACY = 1;
    public static final int CLICK_TOP_LEFT_BACK_BUTTON = 3;
    public static final int POSITION_IN_BODY = 0;
    public static final int POSITION_IN_ROOT = 2;
    public static final int POSITION_IN_TITLE_BAR = 1;
    private final String activityEnterAnimation;
    private final String activityExitAnimation;
    private final ActivityLifecycleCallbacks activityLifecycleCallbacks;
    private final ActivityResultCallbacks activityResultCallbacks;
    private final boolean backPressedAvailable;
    private final String backgroundGif;
    private final Drawable backgroundGifDrawable;
    private final String backgroundImage;
    private final Drawable backgroundImageDrawable;
    private final View backgroundShadow;
    private final String backgroundVideo;
    private final String backgroundVideoImage;
    private final Drawable backgroundVideoImageDrawable;
    private final int checkBoxGravity;
    private final Drawable checkedImageDrawable;
    private final String checkedImageName;
    private final ClickEventListener clickEventListener;
    private AuthThemeConfig cmAuthThemeConfig;
    private final String cmProtocolNavTitle;
    private final Context context;
    private final String ctProtocolNavTitle;
    private final String cuProtocolNavTitle;
    private final String customProtocol2NavTitle;
    private final String customProtocol3NavTitle;
    private final String customProtocolNavTitle;
    private final ArrayList<LoginUiHelper.g> customViewHolders;
    private final int dialogHeight;
    private final int dialogWidth;
    private final int dialogX;
    private final int dialogY;
    private final boolean isBottomDialog;
    private final boolean isDialogMode;
    private final boolean isHideBackIcon;
    private final boolean isHideLogo;
    private final boolean isHideNav;
    private final boolean isHidePrivacyCheckBox;
    private final boolean isHidePrivacySmh;
    private final boolean isLandscape;
    private final boolean isNavTitleBold;
    private final boolean isPrivacyTextGravityCenter;
    private final boolean isProtocolDialogMode;
    private final boolean isStatusBarDarkColor;
    private final ViewGroup loadingView;
    private final boolean loadingVisible;
    private final Drawable loginBtnBackgroundDrawable;
    private final String loginBtnBackgroundRes;
    private final int loginBtnBottomYOffset;
    private final int loginBtnHeight;
    private final String loginBtnText;
    private final int loginBtnTextColor;
    private final int loginBtnTextDpSize;
    private final int loginBtnTextSize;
    private final int loginBtnTopYOffset;
    private final int loginBtnWidth;
    private final int loginBtnXOffset;
    private final LoginListener loginListener;
    private final int logoBottomYOffset;
    private final int logoHeight;
    private final Drawable logoIconDrawable;
    private final String logoIconName;
    private final int logoTopYOffset;
    private final int logoWidth;
    private final int logoXOffset;
    private final String maskNumberBackgroundRes;
    private final int maskNumberBottomYOffset;
    private final int maskNumberColor;
    private final int maskNumberDpSize;
    private final MaskNumberListener maskNumberListener;
    private final int maskNumberSize;
    private final Typeface maskNumberTf;
    private final int maskNumberTopYOffset;
    private final int maskNumberXOffset;
    private final String navBackIcon;
    private final Drawable navBackIconDrawable;
    private final int navBackIconGravity;
    private final int navBackIconHeight;
    private final int navBackIconMargin;
    private final int navBackIconWidth;
    private final int navBackgroundColor;
    private final int navHeight;
    private final String navTitle;
    private final int navTitleColor;
    private final int navTitleDpSize;
    private final Drawable navTitleDrawable;
    private final int navTitleDrawablePadding;
    private final int navTitleSize;
    private final int privacyBottomYOffset;
    private final int privacyCheckBoxHeight;
    private final int privacyCheckBoxWidth;
    private final boolean privacyDialogAuto;
    private final String privacyDialogText;
    private final float privacyDialogTextSize;
    private final int privacyDpSize;
    private final float privacyLineSpacingAdd;
    private final float privacyLineSpacingMul;
    private final int privacyMarginLeft;
    private final int privacyMarginRight;
    private final int privacyProtocolColor;
    private final int privacySize;
    private final boolean privacyState;
    private final int privacyTextColor;
    private final String privacyTextEnd;
    private final int privacyTextLayoutGravity;
    private final int privacyTextMarginLeft;
    private final String privacyTextStart;
    private final float privacyTextStartSize;
    private final int privacyTopYOffset;
    private final String protocol2Link;
    private final String protocol2Text;
    private final String protocol3Link;
    private final String protocol3Text;
    private final String protocolBackgroundImage;
    private final String protocolConnect;
    private final String protocolLink;
    private final String protocolNavBackIcon;
    private final Drawable protocolNavBackIconDrawable;
    private final int protocolNavBackIconHeight;
    private final int protocolNavBackIconWidth;
    private final int protocolNavColor;
    private final int protocolNavHeight;
    private final String protocolNavTitle;
    private final int protocolNavTitleColor;
    private final int protocolNavTitleDpSize;
    private final int protocolNavTitleSize;
    private final String protocolText;
    private final int sloganBottomYOffset;
    private final int sloganColor;
    private final int sloganDpSize;
    private final int sloganSize;
    private final int sloganTopYOffset;
    private final int sloganXOffset;
    private final int statusBarColor;
    private final String unCheckedImageName;
    private final Drawable unCheckedImageNameDrawable;

    /* loaded from: classes5.dex */
    public static class Builder {
        private ViewGroup A1;
        private int B;
        private int C;
        private String C0;
        private int D;
        private String D0;
        private Typeface E;
        private int F;
        private String F0;
        private int G;
        private String G0;
        private int H;
        private String H0;
        private String I;
        private String I0;
        private int J;
        private int K;
        private String K0;
        private String L0;
        private int M;
        private String M0;
        private int N;
        private String N0;
        private int O;
        private String O0;
        private String P0;
        private int Q;
        private String Q0;
        private int R;
        private int R0;
        private int S0;
        private int T;
        private int T0;
        private int U;
        private int U0;
        private String V;
        private Drawable W;
        private int X;
        private String X0;
        private int Y;
        private Drawable Y0;
        private int Z;
        private int Z0;

        /* renamed from: a1  reason: collision with root package name */
        private boolean f57438a1;

        /* renamed from: b1  reason: collision with root package name */
        private int f57441b1;

        /* renamed from: c  reason: collision with root package name */
        private String f57442c;

        /* renamed from: c0  reason: collision with root package name */
        private int f57443c0;

        /* renamed from: c1  reason: collision with root package name */
        private int f57444c1;

        /* renamed from: d  reason: collision with root package name */
        private Drawable f57445d;

        /* renamed from: d0  reason: collision with root package name */
        private int f57446d0;

        /* renamed from: d1  reason: collision with root package name */
        private int f57447d1;

        /* renamed from: e  reason: collision with root package name */
        private boolean f57448e;

        /* renamed from: e0  reason: collision with root package name */
        private int f57449e0;

        /* renamed from: e1  reason: collision with root package name */
        private int f57450e1;

        /* renamed from: f0  reason: collision with root package name */
        private int f57452f0;

        /* renamed from: f1  reason: collision with root package name */
        private boolean f57453f1;

        /* renamed from: g0  reason: collision with root package name */
        private int f57455g0;

        /* renamed from: g1  reason: collision with root package name */
        private boolean f57456g1;

        /* renamed from: h  reason: collision with root package name */
        private int f57457h;

        /* renamed from: h0  reason: collision with root package name */
        private int f57458h0;

        /* renamed from: h1  reason: collision with root package name */
        private String f57459h1;

        /* renamed from: i  reason: collision with root package name */
        private int f57460i;

        /* renamed from: i1  reason: collision with root package name */
        private String f57462i1;
        public boolean isLandscape;

        /* renamed from: j  reason: collision with root package name */
        private int f57463j;

        /* renamed from: j1  reason: collision with root package name */
        private Drawable f57465j1;

        /* renamed from: k  reason: collision with root package name */
        private String f57466k;

        /* renamed from: k1  reason: collision with root package name */
        private String f57468k1;

        /* renamed from: l  reason: collision with root package name */
        private int f57469l;

        /* renamed from: l1  reason: collision with root package name */
        private Drawable f57471l1;

        /* renamed from: m  reason: collision with root package name */
        private int f57472m;

        /* renamed from: m0  reason: collision with root package name */
        private int f57473m0;

        /* renamed from: m1  reason: collision with root package name */
        private String f57474m1;

        /* renamed from: n  reason: collision with root package name */
        private int f57475n;

        /* renamed from: n0  reason: collision with root package name */
        private int f57476n0;

        /* renamed from: n1  reason: collision with root package name */
        private String f57477n1;

        /* renamed from: o  reason: collision with root package name */
        private int f57478o;

        /* renamed from: o0  reason: collision with root package name */
        private int f57479o0;

        /* renamed from: o1  reason: collision with root package name */
        private Drawable f57480o1;

        /* renamed from: p0  reason: collision with root package name */
        private int f57482p0;

        /* renamed from: p1  reason: collision with root package name */
        private String f57483p1;

        /* renamed from: q  reason: collision with root package name */
        private boolean f57484q;

        /* renamed from: q0  reason: collision with root package name */
        private int f57485q0;

        /* renamed from: q1  reason: collision with root package name */
        private String f57486q1;

        /* renamed from: r  reason: collision with root package name */
        private Drawable f57487r;

        /* renamed from: r1  reason: collision with root package name */
        private MaskNumberListener f57489r1;

        /* renamed from: s  reason: collision with root package name */
        private int f57490s;

        /* renamed from: s0  reason: collision with root package name */
        private Drawable f57491s0;

        /* renamed from: s1  reason: collision with root package name */
        private LoginListener f57492s1;

        /* renamed from: t  reason: collision with root package name */
        private String f57493t;

        /* renamed from: t1  reason: collision with root package name */
        private ClickEventListener f57495t1;

        /* renamed from: u  reason: collision with root package name */
        private Drawable f57496u;

        /* renamed from: u0  reason: collision with root package name */
        private Drawable f57497u0;

        /* renamed from: u1  reason: collision with root package name */
        private View f57498u1;

        /* renamed from: v  reason: collision with root package name */
        private int f57499v;

        /* renamed from: v0  reason: collision with root package name */
        private String f57500v0;

        /* renamed from: v1  reason: collision with root package name */
        private ArrayList<LoginUiHelper.g> f57501v1;

        /* renamed from: w  reason: collision with root package name */
        private int f57502w;

        /* renamed from: w0  reason: collision with root package name */
        private boolean f57503w0;

        /* renamed from: w1  reason: collision with root package name */
        private ActivityLifecycleCallbacks f57504w1;

        /* renamed from: x  reason: collision with root package name */
        private int f57505x;

        /* renamed from: x1  reason: collision with root package name */
        private ActivityResultCallbacks f57507x1;

        /* renamed from: y  reason: collision with root package name */
        private int f57508y;

        /* renamed from: z  reason: collision with root package name */
        private int f57511z;

        /* renamed from: a  reason: collision with root package name */
        private int f57436a = -1;

        /* renamed from: b  reason: collision with root package name */
        private boolean f57439b = false;

        /* renamed from: f  reason: collision with root package name */
        private int f57451f = 25;

        /* renamed from: g  reason: collision with root package name */
        private int f57454g = 25;

        /* renamed from: p  reason: collision with root package name */
        private boolean f57481p = false;
        private boolean A = false;
        private int L = -16776961;
        private String P = "本机号码一键登录";
        private int S = -1;

        /* renamed from: a0  reason: collision with root package name */
        private int f57437a0 = -16777216;

        /* renamed from: b0  reason: collision with root package name */
        private int f57440b0 = -7829368;

        /* renamed from: i0  reason: collision with root package name */
        private boolean f57461i0 = true;

        /* renamed from: j0  reason: collision with root package name */
        private boolean f57464j0 = false;

        /* renamed from: k0  reason: collision with root package name */
        private boolean f57467k0 = false;

        /* renamed from: l0  reason: collision with root package name */
        private boolean f57470l0 = false;

        /* renamed from: r0  reason: collision with root package name */
        private String f57488r0 = "yd_checkbox_checked";

        /* renamed from: t0  reason: collision with root package name */
        private String f57494t0 = "yd_checkbox_unchecked";

        /* renamed from: x0  reason: collision with root package name */
        private float f57506x0 = 0.0f;

        /* renamed from: y0  reason: collision with root package name */
        private String f57509y0 = "登录即同意";

        /* renamed from: z0  reason: collision with root package name */
        private float f57512z0 = 0.0f;
        private float A0 = 0.0f;
        private float B0 = 0.0f;
        private String E0 = "和";
        private String J0 = "且授权使用本机号码登录";
        private int V0 = 25;
        private int W0 = 25;

        /* renamed from: y1  reason: collision with root package name */
        private boolean f57510y1 = true;

        /* renamed from: z1  reason: collision with root package name */
        private boolean f57513z1 = true;

        public Builder addCustomView(View view, String str, int i4, LoginUiHelper.CustomViewListener customViewListener) {
            if (view == null) {
                return this;
            }
            if (this.f57501v1 == null) {
                this.f57501v1 = new ArrayList<>();
            }
            LoginUiHelper.g gVar = new LoginUiHelper.g();
            gVar.f57605a = view;
            gVar.f57606b = i4;
            gVar.f57607c = customViewListener;
            this.f57501v1.add(gVar);
            return this;
        }

        public UnifyUiConfig build(Context context) {
            return new UnifyUiConfig(this, context, null);
        }

        public Builder setActivityLifecycleCallbacks(ActivityLifecycleCallbacks activityLifecycleCallbacks) {
            this.f57504w1 = activityLifecycleCallbacks;
            return this;
        }

        public Builder setActivityResultCallbacks(ActivityResultCallbacks activityResultCallbacks) {
            this.f57507x1 = activityResultCallbacks;
            return this;
        }

        public Builder setActivityTranslateAnimation(String str, String str2) {
            this.f57483p1 = str;
            this.f57486q1 = str2;
            return this;
        }

        public Builder setBackPressedAvailable(boolean z4) {
            this.f57510y1 = z4;
            return this;
        }

        public Builder setBackgroundGif(String str) {
            this.f57468k1 = str;
            return this;
        }

        public Builder setBackgroundGifDrawable(Drawable drawable) {
            this.f57471l1 = drawable;
            return this;
        }

        public Builder setBackgroundImage(String str) {
            this.f57459h1 = str;
            return this;
        }

        public Builder setBackgroundImageDrawable(Drawable drawable) {
            this.f57465j1 = drawable;
            return this;
        }

        public Builder setBackgroundShadowView(View view) {
            this.f57498u1 = view;
            return this;
        }

        public Builder setBackgroundVideo(String str, String str2) {
            this.f57474m1 = str;
            this.f57477n1 = str2;
            return this;
        }

        public Builder setBottomDialog(boolean z4) {
            this.f57453f1 = z4;
            return this;
        }

        public Builder setCheckBoxGravity(int i4) {
            this.f57479o0 = i4;
            return this;
        }

        public Builder setCheckedImageDrawable(Drawable drawable) {
            this.f57491s0 = drawable;
            return this;
        }

        public Builder setCheckedImageName(String str) {
            this.f57488r0 = str;
            return this;
        }

        public Builder setClickEventListener(ClickEventListener clickEventListener) {
            this.f57495t1 = clickEventListener;
            return this;
        }

        public Builder setDialogHeight(int i4) {
            this.f57444c1 = i4;
            return this;
        }

        public Builder setDialogMode(boolean z4) {
            this.f57438a1 = z4;
            return this;
        }

        public Builder setDialogWidth(int i4) {
            this.f57441b1 = i4;
            return this;
        }

        public Builder setDialogX(int i4) {
            this.f57447d1 = i4;
            return this;
        }

        public Builder setDialogY(int i4) {
            this.f57450e1 = i4;
            return this;
        }

        public Builder setHideLogo(boolean z4) {
            this.A = z4;
            return this;
        }

        public Builder setHideNavigation(boolean z4) {
            this.f57481p = z4;
            return this;
        }

        public Builder setHideNavigationBackIcon(boolean z4) {
            this.f57448e = z4;
            return this;
        }

        public Builder setHidePrivacyCheckBox(boolean z4) {
            this.f57464j0 = z4;
            return this;
        }

        public Builder setHidePrivacySmh(boolean z4) {
            this.f57467k0 = z4;
            return this;
        }

        public Builder setLandscape(boolean z4) {
            this.isLandscape = z4;
            return this;
        }

        public Builder setLoadingView(ViewGroup viewGroup) {
            this.A1 = viewGroup;
            return this;
        }

        public Builder setLoadingVisible(boolean z4) {
            this.f57513z1 = z4;
            return this;
        }

        public Builder setLoginBtnBackgroundDrawable(Drawable drawable) {
            this.W = drawable;
            return this;
        }

        public Builder setLoginBtnBackgroundRes(String str) {
            this.V = str;
            return this;
        }

        public Builder setLoginBtnBottomYOffset(int i4) {
            this.Y = i4;
            return this;
        }

        public Builder setLoginBtnHeight(int i4) {
            this.U = i4;
            return this;
        }

        public Builder setLoginBtnText(String str) {
            this.P = str;
            return this;
        }

        public Builder setLoginBtnTextColor(int i4) {
            this.S = i4;
            return this;
        }

        public Builder setLoginBtnTextDpSize(int i4) {
            this.R = i4;
            return this;
        }

        public Builder setLoginBtnTextSize(int i4) {
            this.Q = i4;
            return this;
        }

        public Builder setLoginBtnTopYOffset(int i4) {
            this.X = i4;
            return this;
        }

        public Builder setLoginBtnWidth(int i4) {
            this.T = i4;
            return this;
        }

        public Builder setLoginBtnXOffset(int i4) {
            this.Z = i4;
            return this;
        }

        public Builder setLoginListener(LoginListener loginListener) {
            this.f57492s1 = loginListener;
            return this;
        }

        public Builder setLogoBottomYOffset(int i4) {
            this.f57508y = i4;
            return this;
        }

        public Builder setLogoHeight(int i4) {
            this.f57502w = i4;
            return this;
        }

        public Builder setLogoIconDrawable(Drawable drawable) {
            this.f57496u = drawable;
            return this;
        }

        public Builder setLogoIconName(String str) {
            this.f57493t = str;
            return this;
        }

        public Builder setLogoTopYOffset(int i4) {
            this.f57505x = i4;
            return this;
        }

        public Builder setLogoWidth(int i4) {
            this.f57499v = i4;
            return this;
        }

        public Builder setLogoXOffset(int i4) {
            this.f57511z = i4;
            return this;
        }

        public Builder setMaskNumberBackgroundRes(String str) {
            this.I = str;
            return this;
        }

        public Builder setMaskNumberBottomYOffset(int i4) {
            this.G = i4;
            return this;
        }

        public Builder setMaskNumberColor(int i4) {
            this.B = i4;
            return this;
        }

        public Builder setMaskNumberDpSize(int i4) {
            this.D = i4;
            return this;
        }

        public Builder setMaskNumberListener(MaskNumberListener maskNumberListener) {
            this.f57489r1 = maskNumberListener;
            return this;
        }

        public Builder setMaskNumberSize(int i4) {
            this.C = i4;
            return this;
        }

        public Builder setMaskNumberTopYOffset(int i4) {
            this.F = i4;
            return this;
        }

        public Builder setMaskNumberTypeface(Typeface typeface) {
            this.E = typeface;
            return this;
        }

        public Builder setMaskNumberXOffset(int i4) {
            this.H = i4;
            return this;
        }

        public Builder setNavTitleBold(boolean z4) {
            this.f57484q = z4;
            return this;
        }

        public Builder setNavTitleDpSize(int i4) {
            this.f57478o = i4;
            return this;
        }

        public Builder setNavTitleDrawable(Drawable drawable) {
            this.f57487r = drawable;
            return this;
        }

        public Builder setNavTitleDrawablePadding(int i4) {
            this.f57490s = i4;
            return this;
        }

        public Builder setNavTitleSize(int i4) {
            this.f57475n = i4;
            return this;
        }

        public Builder setNavigationBackIconHeight(int i4) {
            this.f57454g = i4;
            return this;
        }

        public Builder setNavigationBackIconWidth(int i4) {
            this.f57451f = i4;
            return this;
        }

        public Builder setNavigationBackgroundColor(int i4) {
            this.f57463j = i4;
            return this;
        }

        public Builder setNavigationHeight(int i4) {
            this.f57469l = i4;
            return this;
        }

        public Builder setNavigationIcon(String str) {
            this.f57442c = str;
            return this;
        }

        public Builder setNavigationIconDrawable(Drawable drawable) {
            this.f57445d = drawable;
            return this;
        }

        public Builder setNavigationIconGravity(int i4) {
            this.f57457h = i4;
            return this;
        }

        public Builder setNavigationIconMargin(int i4) {
            this.f57460i = i4;
            return this;
        }

        public Builder setNavigationTitle(String str) {
            this.f57466k = str;
            return this;
        }

        public Builder setNavigationTitleColor(int i4) {
            this.f57472m = i4;
            return this;
        }

        public Builder setPrivacyBottomYOffset(int i4) {
            this.f57452f0 = i4;
            return this;
        }

        public Builder setPrivacyCheckBoxHeight(int i4) {
            this.f57485q0 = i4;
            return this;
        }

        public Builder setPrivacyCheckBoxWidth(int i4) {
            this.f57482p0 = i4;
            return this;
        }

        public Builder setPrivacyDialogAuto(boolean z4) {
            this.f57503w0 = z4;
            return this;
        }

        public Builder setPrivacyDialogText(String str) {
            this.f57500v0 = str;
            return this;
        }

        public Builder setPrivacyDialogTextSize(float f5) {
            this.f57506x0 = f5;
            return this;
        }

        public Builder setPrivacyDpSize(int i4) {
            this.f57446d0 = i4;
            return this;
        }

        public Builder setPrivacyLineSpacing(float f5, float f6) {
            this.A0 = f5;
            this.B0 = f6;
            return this;
        }

        public Builder setPrivacyMarginLeft(int i4) {
            this.f57455g0 = i4;
            return this;
        }

        public Builder setPrivacyMarginRight(int i4) {
            this.f57458h0 = i4;
            return this;
        }

        public Builder setPrivacyProtocolColor(int i4) {
            this.f57440b0 = i4;
            return this;
        }

        public Builder setPrivacySize(int i4) {
            this.f57443c0 = i4;
            return this;
        }

        public Builder setPrivacyState(boolean z4) {
            this.f57461i0 = z4;
            return this;
        }

        public Builder setPrivacyTextColor(int i4) {
            this.f57437a0 = i4;
            return this;
        }

        public Builder setPrivacyTextEnd(String str) {
            this.J0 = str;
            return this;
        }

        public Builder setPrivacyTextGravityCenter(boolean z4) {
            this.f57470l0 = z4;
            return this;
        }

        public Builder setPrivacyTextLayoutGravity(int i4) {
            this.f57473m0 = i4;
            return this;
        }

        public Builder setPrivacyTextMarginLeft(int i4) {
            this.f57476n0 = i4;
            return this;
        }

        public Builder setPrivacyTextStart(String str) {
            this.f57509y0 = str;
            return this;
        }

        public Builder setPrivacyTextStartSize(float f5) {
            this.f57512z0 = f5;
            return this;
        }

        public Builder setPrivacyTopYOffset(int i4) {
            this.f57449e0 = i4;
            return this;
        }

        public Builder setProtocol2Link(String str) {
            this.G0 = str;
            return this;
        }

        public Builder setProtocol2Text(String str) {
            this.F0 = str;
            return this;
        }

        public Builder setProtocol3Link(String str) {
            this.I0 = str;
            return this;
        }

        public Builder setProtocol3Text(String str) {
            this.H0 = str;
            return this;
        }

        public Builder setProtocolBackgroundImage(String str) {
            this.f57462i1 = str;
            return this;
        }

        public Builder setProtocolConnect(String str) {
            this.E0 = str;
            return this;
        }

        public Builder setProtocolDialogMode(boolean z4) {
            this.f57456g1 = z4;
            return this;
        }

        public Builder setProtocolLink(String str) {
            this.D0 = str;
            return this;
        }

        public Builder setProtocolPageNavBackIcon(String str) {
            this.X0 = str;
            return this;
        }

        public Builder setProtocolPageNavBackIconDrawable(Drawable drawable) {
            this.Y0 = drawable;
            return this;
        }

        public Builder setProtocolPageNavBackIconHeight(int i4) {
            this.W0 = i4;
            return this;
        }

        public Builder setProtocolPageNavBackIconWidth(int i4) {
            this.V0 = i4;
            return this;
        }

        public Builder setProtocolPageNavColor(int i4) {
            this.Z0 = i4;
            return this;
        }

        public Builder setProtocolPageNavHeight(int i4) {
            this.R0 = i4;
            return this;
        }

        @Deprecated
        public Builder setProtocolPageNavTitle(String str) {
            this.K0 = str;
            return this;
        }

        public Builder setProtocolPageNavTitleColor(int i4) {
            this.S0 = i4;
            return this;
        }

        public Builder setProtocolPageNavTitleDpSize(int i4) {
            this.U0 = i4;
            return this;
        }

        public Builder setProtocolPageNavTitleSize(int i4) {
            this.T0 = i4;
            return this;
        }

        public Builder setProtocolText(String str) {
            this.C0 = str;
            return this;
        }

        public Builder setSloganBottomYOffset(int i4) {
            this.N = i4;
            return this;
        }

        public Builder setSloganColor(int i4) {
            this.L = i4;
            return this;
        }

        public Builder setSloganDpSize(int i4) {
            this.K = i4;
            return this;
        }

        public Builder setSloganSize(int i4) {
            this.J = i4;
            return this;
        }

        public Builder setSloganTopYOffset(int i4) {
            this.M = i4;
            return this;
        }

        public Builder setSloganXOffset(int i4) {
            this.O = i4;
            return this;
        }

        public Builder setStatusBarColor(int i4) {
            this.f57436a = i4;
            return this;
        }

        public Builder setStatusBarDarkColor(boolean z4) {
            this.f57439b = z4;
            return this;
        }

        public Builder setUnCheckedImageDrawable(Drawable drawable) {
            this.f57497u0 = drawable;
            return this;
        }

        public Builder setUnCheckedImageName(String str) {
            this.f57494t0 = str;
            return this;
        }

        public Builder setDialogMode(boolean z4, int i4, int i5, int i6, int i7, boolean z5) {
            this.f57438a1 = z4;
            this.f57441b1 = i4;
            this.f57444c1 = i5;
            this.f57447d1 = i6;
            this.f57450e1 = i7;
            this.f57453f1 = z5;
            return this;
        }

        public Builder setProtocolPageNavTitle(String str, String str2, String str3) {
            this.L0 = str;
            this.N0 = str2;
            this.M0 = str3;
            return this;
        }

        public Builder setBackgroundVideo(String str, Drawable drawable) {
            this.f57474m1 = str;
            this.f57480o1 = drawable;
            return this;
        }

        public Builder setProtocolPageNavTitle(String str, String str2, String str3, String str4, String str5, String str6) {
            this.L0 = str;
            this.N0 = str2;
            this.M0 = str3;
            this.O0 = str4;
            this.P0 = str5;
            this.Q0 = str6;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class a implements LoginClickListener {
        a(UnifyUiConfig unifyUiConfig) {
        }

        @Override // com.cmic.sso.sdk.view.LoginClickListener
        public void onLoginClickComplete(Context context, JSONObject jSONObject) {
        }

        @Override // com.cmic.sso.sdk.view.LoginClickListener
        public void onLoginClickStart(Context context, JSONObject jSONObject) {
        }
    }

    /* synthetic */ UnifyUiConfig(Builder builder, Context context, a aVar) {
        this(builder, context);
    }

    private void createCmAuthUiBuilder() {
        AuthThemeConfig.Builder builder = new AuthThemeConfig.Builder();
        int i4 = this.navHeight;
        if (i4 == 0) {
            i4 = i.b(this.context);
        }
        int i5 = this.maskNumberSize;
        if (i5 != 0) {
            builder.setNumberSize(i5, false);
        }
        int i6 = this.maskNumberColor;
        if (i6 != 0) {
            builder.setNumberColor(i6);
        }
        int i7 = this.maskNumberTopYOffset;
        if (i7 != 0) {
            builder.setNumFieldOffsetY(i7 + i4);
        }
        int i8 = this.maskNumberBottomYOffset;
        if (i8 != 0) {
            builder.setNumFieldOffsetY_B(i8);
        }
        builder.setLogBtn(this.loginBtnWidth, this.loginBtnHeight).setLogBtnMargin(0, 0).setLogBtnText(this.loginBtnText, this.loginBtnTextColor, this.loginBtnTextSize, false);
        int i9 = this.loginBtnTopYOffset;
        if (i9 != 0) {
            builder.setLogBtnOffsetY(i9 + i4);
        }
        int i10 = this.loginBtnBottomYOffset;
        if (i10 != 0) {
            builder.setLogBtnOffsetY_B(i10);
        }
        builder.setLogBtnClickListener(new a(this));
        String str = this.activityEnterAnimation;
        builder.setAuthPageActIn(str, str);
        String str2 = this.activityExitAnimation;
        builder.setAuthPageActOut(str2, str2);
        builder.setAuthLayoutResID(h.a(this.context).d("yd_activity_quick_login_cm") == 0 ? R.layout.yd_activity_quick_login_cm : h.a(this.context).d("yd_activity_quick_login_cm"));
        this.cmAuthThemeConfig = builder.build();
        AuthnHelper.getInstance(this.context).setAuthThemeConfig(this.cmAuthThemeConfig);
    }

    public String getActivityEnterAnimation() {
        return this.activityEnterAnimation;
    }

    public String getActivityExitAnimation() {
        return this.activityExitAnimation;
    }

    public ActivityLifecycleCallbacks getActivityLifecycleCallbacks() {
        return this.activityLifecycleCallbacks;
    }

    public ActivityResultCallbacks getActivityResultCallbacks() {
        return this.activityResultCallbacks;
    }

    public boolean getBackPressedAvailable() {
        return this.backPressedAvailable;
    }

    public String getBackgroundGif() {
        return this.backgroundGif;
    }

    public Drawable getBackgroundGifDrawable() {
        return this.backgroundGifDrawable;
    }

    public String getBackgroundImage() {
        return this.backgroundImage;
    }

    public Drawable getBackgroundImageDrawable() {
        return this.backgroundImageDrawable;
    }

    public View getBackgroundShadow() {
        return this.backgroundShadow;
    }

    public String getBackgroundVideo() {
        return this.backgroundVideo;
    }

    public String getBackgroundVideoImage() {
        return this.backgroundVideoImage;
    }

    public Drawable getBackgroundVideoImageDrawable() {
        return this.backgroundVideoImageDrawable;
    }

    public int getCheckBoxGravity() {
        return this.checkBoxGravity;
    }

    public Drawable getCheckedImageDrawable() {
        return this.checkedImageDrawable;
    }

    public String getCheckedImageName() {
        return this.checkedImageName;
    }

    public ClickEventListener getClickEventListener() {
        return this.clickEventListener;
    }

    public AuthThemeConfig getCmAuthThemeConfig() {
        AuthThemeConfig authThemeConfig = this.cmAuthThemeConfig;
        return authThemeConfig == null ? new AuthThemeConfig.Builder().build() : authThemeConfig;
    }

    public String getCmProtocolNavTitle() {
        return this.cmProtocolNavTitle;
    }

    public String getCtProtocolNavTitle() {
        return this.ctProtocolNavTitle;
    }

    public String getCuProtocolNavTitle() {
        return this.cuProtocolNavTitle;
    }

    public String getCustomProtocol2NavTitle() {
        return this.customProtocol2NavTitle;
    }

    public String getCustomProtocol3NavTitle() {
        return this.customProtocol3NavTitle;
    }

    public String getCustomProtocolNavTitle() {
        return this.customProtocolNavTitle;
    }

    public ArrayList<LoginUiHelper.g> getCustomViewHolders() {
        return this.customViewHolders;
    }

    public int getDialogHeight() {
        return this.dialogHeight;
    }

    public int getDialogWidth() {
        return this.dialogWidth;
    }

    public int getDialogX() {
        return this.dialogX;
    }

    public int getDialogY() {
        return this.dialogY;
    }

    public ViewGroup getLoadingView() {
        return this.loadingView;
    }

    public boolean getLoadingVisible() {
        return this.loadingVisible;
    }

    public Drawable getLoginBtnBackgroundDrawable() {
        return this.loginBtnBackgroundDrawable;
    }

    public String getLoginBtnBackgroundRes() {
        return this.loginBtnBackgroundRes;
    }

    public int getLoginBtnBottomYOffset() {
        return this.loginBtnBottomYOffset;
    }

    public int getLoginBtnHeight() {
        return this.loginBtnHeight;
    }

    public String getLoginBtnText() {
        return this.loginBtnText;
    }

    public int getLoginBtnTextColor() {
        return this.loginBtnTextColor;
    }

    public int getLoginBtnTextDpSize() {
        return this.loginBtnTextDpSize;
    }

    public int getLoginBtnTextSize() {
        return this.loginBtnTextSize;
    }

    public int getLoginBtnTopYOffset() {
        return this.loginBtnTopYOffset;
    }

    public int getLoginBtnWidth() {
        return this.loginBtnWidth;
    }

    public int getLoginBtnXOffset() {
        return this.loginBtnXOffset;
    }

    public LoginListener getLoginListener() {
        return this.loginListener;
    }

    public int getLogoBottomYOffset() {
        return this.logoBottomYOffset;
    }

    public int getLogoHeight() {
        return this.logoHeight;
    }

    public Drawable getLogoIconDrawable() {
        return this.logoIconDrawable;
    }

    public String getLogoIconName() {
        return this.logoIconName;
    }

    public int getLogoTopYOffset() {
        return this.logoTopYOffset;
    }

    public int getLogoWidth() {
        return this.logoWidth;
    }

    public int getLogoXOffset() {
        return this.logoXOffset;
    }

    public String getMaskNumberBackgroundRes() {
        return this.maskNumberBackgroundRes;
    }

    public int getMaskNumberBottomYOffset() {
        return this.maskNumberBottomYOffset;
    }

    public int getMaskNumberColor() {
        return this.maskNumberColor;
    }

    public int getMaskNumberDpSize() {
        return this.maskNumberDpSize;
    }

    public MaskNumberListener getMaskNumberListener() {
        return this.maskNumberListener;
    }

    public int getMaskNumberSize() {
        return this.maskNumberSize;
    }

    public int getMaskNumberTopYOffset() {
        return this.maskNumberTopYOffset;
    }

    public Typeface getMaskNumberTypeface() {
        return this.maskNumberTf;
    }

    public int getMaskNumberXOffset() {
        return this.maskNumberXOffset;
    }

    public String getNavBackIcon() {
        return this.navBackIcon;
    }

    public Drawable getNavBackIconDrawable() {
        return this.navBackIconDrawable;
    }

    public int getNavBackIconGravity() {
        return this.navBackIconGravity;
    }

    public int getNavBackIconHeight() {
        return this.navBackIconHeight;
    }

    public int getNavBackIconMargin() {
        return this.navBackIconMargin;
    }

    public int getNavBackIconWidth() {
        return this.navBackIconWidth;
    }

    public int getNavBackgroundColor() {
        return this.navBackgroundColor;
    }

    public int getNavHeight() {
        return this.navHeight;
    }

    public String getNavTitle() {
        return this.navTitle;
    }

    public int getNavTitleColor() {
        return this.navTitleColor;
    }

    public int getNavTitleDpSize() {
        return this.navTitleDpSize;
    }

    public Drawable getNavTitleDrawable() {
        return this.navTitleDrawable;
    }

    public int getNavTitleDrawablePadding() {
        return this.navTitleDrawablePadding;
    }

    public int getNavTitleSize() {
        return this.navTitleSize;
    }

    public int getPrivacyBottomYOffset() {
        return this.privacyBottomYOffset;
    }

    public int getPrivacyCheckBoxHeight() {
        return this.privacyCheckBoxHeight;
    }

    public int getPrivacyCheckBoxWidth() {
        return this.privacyCheckBoxWidth;
    }

    public boolean getPrivacyDialogAuto() {
        return this.privacyDialogAuto;
    }

    public String getPrivacyDialogText() {
        return this.privacyDialogText;
    }

    public float getPrivacyDialogTextSize() {
        return this.privacyDialogTextSize;
    }

    public int getPrivacyDpSize() {
        return this.privacyDpSize;
    }

    public float getPrivacyLineSpacingAdd() {
        return this.privacyLineSpacingAdd;
    }

    public float getPrivacyLineSpacingMul() {
        return this.privacyLineSpacingMul;
    }

    public int getPrivacyMarginLeft() {
        return this.privacyMarginLeft;
    }

    public int getPrivacyMarginRight() {
        return this.privacyMarginRight;
    }

    public int getPrivacyProtocolColor() {
        return this.privacyProtocolColor;
    }

    public int getPrivacySize() {
        return this.privacySize;
    }

    public int getPrivacyTextColor() {
        return this.privacyTextColor;
    }

    public String getPrivacyTextEnd() {
        return this.privacyTextEnd;
    }

    public int getPrivacyTextLayoutGravity() {
        return this.privacyTextLayoutGravity;
    }

    public int getPrivacyTextMarginLeft() {
        return this.privacyTextMarginLeft;
    }

    public String getPrivacyTextStart() {
        return this.privacyTextStart;
    }

    public float getPrivacyTextStartSize() {
        return this.privacyTextStartSize;
    }

    public int getPrivacyTopYOffset() {
        return this.privacyTopYOffset;
    }

    public String getProtocol2Link() {
        return this.protocol2Link;
    }

    public String getProtocol2Text() {
        return this.protocol2Text;
    }

    public String getProtocol3Link() {
        return this.protocol3Link;
    }

    public String getProtocol3Text() {
        return this.protocol3Text;
    }

    public String getProtocolBackgroundImage() {
        return this.protocolBackgroundImage;
    }

    public String getProtocolConnect() {
        return this.protocolConnect;
    }

    public String getProtocolLink() {
        return this.protocolLink;
    }

    public String getProtocolNavBackIcon() {
        return this.protocolNavBackIcon;
    }

    public Drawable getProtocolNavBackIconDrawable() {
        return this.protocolNavBackIconDrawable;
    }

    public int getProtocolNavBackIconHeight() {
        return this.protocolNavBackIconHeight;
    }

    public int getProtocolNavBackIconWidth() {
        return this.protocolNavBackIconWidth;
    }

    public int getProtocolNavColor() {
        return this.protocolNavColor;
    }

    public int getProtocolNavHeight() {
        return this.protocolNavHeight;
    }

    public String getProtocolNavTitle() {
        return this.protocolNavTitle;
    }

    public int getProtocolNavTitleColor() {
        return this.protocolNavTitleColor;
    }

    public int getProtocolNavTitleDpSize() {
        return this.protocolNavTitleDpSize;
    }

    public int getProtocolNavTitleSize() {
        return this.protocolNavTitleSize;
    }

    public String getProtocolText() {
        return this.protocolText;
    }

    public int getSloganBottomYOffset() {
        return this.sloganBottomYOffset;
    }

    public int getSloganColor() {
        return this.sloganColor;
    }

    public int getSloganDpSize() {
        return this.sloganDpSize;
    }

    public int getSloganSize() {
        return this.sloganSize;
    }

    public int getSloganTopYOffset() {
        return this.sloganTopYOffset;
    }

    public int getSloganXOffset() {
        return this.sloganXOffset;
    }

    public int getStatusBarColor() {
        return this.statusBarColor;
    }

    public String getUnCheckedImageName() {
        return this.unCheckedImageName;
    }

    public Drawable getUnCheckedImageNameDrawable() {
        return this.unCheckedImageNameDrawable;
    }

    public boolean isBottomDialog() {
        return this.isBottomDialog;
    }

    public boolean isDialogMode() {
        return this.isDialogMode;
    }

    public boolean isHideBackIcon() {
        return this.isHideBackIcon;
    }

    public boolean isHideLogo() {
        return this.isHideLogo;
    }

    public boolean isHideNav() {
        return this.isHideNav;
    }

    public boolean isHidePrivacyCheckBox() {
        return this.isHidePrivacyCheckBox;
    }

    public boolean isHidePrivacySmh() {
        return this.isHidePrivacySmh;
    }

    public boolean isLandscape() {
        return this.isLandscape;
    }

    public boolean isNavTitleBold() {
        return this.isNavTitleBold;
    }

    public boolean isPrivacyState() {
        return this.privacyState;
    }

    public boolean isPrivacyTextGravityCenter() {
        return this.isPrivacyTextGravityCenter;
    }

    public boolean isProtocolDialogMode() {
        return this.isProtocolDialogMode;
    }

    public boolean isStatusBarDarkColor() {
        return this.isStatusBarDarkColor;
    }

    private UnifyUiConfig(Builder builder, Context context) {
        this.statusBarColor = builder.f57436a;
        this.isStatusBarDarkColor = builder.f57439b;
        this.navBackIcon = builder.f57442c;
        this.navBackIconDrawable = builder.f57445d;
        this.navBackIconWidth = builder.f57451f;
        this.navBackIconHeight = builder.f57454g;
        this.navBackIconGravity = builder.f57457h;
        this.navBackIconMargin = builder.f57460i;
        this.isHideBackIcon = builder.f57448e;
        this.navBackgroundColor = builder.f57463j;
        this.navTitle = builder.f57466k;
        this.navHeight = builder.f57469l;
        this.navTitleColor = builder.f57472m;
        this.navTitleSize = builder.f57475n;
        this.navTitleDpSize = builder.f57478o;
        this.isHideNav = builder.f57481p;
        this.isNavTitleBold = builder.f57484q;
        this.navTitleDrawable = builder.f57487r;
        this.navTitleDrawablePadding = builder.f57490s;
        this.logoIconName = builder.f57493t;
        this.logoIconDrawable = builder.f57496u;
        this.logoWidth = builder.f57499v;
        this.logoHeight = builder.f57502w;
        this.logoTopYOffset = builder.f57505x;
        this.logoBottomYOffset = builder.f57508y;
        this.logoXOffset = builder.f57511z;
        this.isHideLogo = builder.A;
        this.maskNumberColor = builder.B;
        this.maskNumberSize = builder.C;
        this.maskNumberTf = builder.E;
        this.maskNumberDpSize = builder.D;
        this.maskNumberTopYOffset = builder.F;
        this.maskNumberBottomYOffset = builder.G;
        this.maskNumberXOffset = builder.H;
        this.maskNumberBackgroundRes = builder.I;
        this.sloganSize = builder.J;
        this.sloganDpSize = builder.K;
        this.sloganColor = builder.L;
        this.sloganTopYOffset = builder.M;
        this.sloganBottomYOffset = builder.N;
        this.sloganXOffset = builder.O;
        this.loginBtnText = builder.P;
        this.loginBtnTextSize = builder.Q;
        this.loginBtnTextDpSize = builder.R;
        this.loginBtnTextColor = builder.S;
        this.loginBtnWidth = builder.T;
        this.loginBtnHeight = builder.U;
        this.loginBtnBackgroundRes = builder.V;
        this.loginBtnBackgroundDrawable = builder.W;
        this.loginBtnTopYOffset = builder.X;
        this.loginBtnBottomYOffset = builder.Y;
        this.loginBtnXOffset = builder.Z;
        this.privacyTextColor = builder.f57437a0;
        this.privacyProtocolColor = builder.f57440b0;
        this.privacySize = builder.f57443c0;
        this.privacyDpSize = builder.f57446d0;
        this.privacyTopYOffset = builder.f57449e0;
        this.privacyBottomYOffset = builder.f57452f0;
        this.privacyTextMarginLeft = builder.f57476n0;
        this.privacyMarginLeft = builder.f57455g0;
        this.privacyMarginRight = builder.f57458h0;
        this.privacyState = builder.f57461i0;
        this.isHidePrivacySmh = builder.f57467k0;
        this.isHidePrivacyCheckBox = builder.f57464j0;
        this.isPrivacyTextGravityCenter = builder.f57470l0;
        this.privacyTextLayoutGravity = builder.f57473m0;
        this.checkBoxGravity = builder.f57479o0;
        this.privacyCheckBoxWidth = builder.f57482p0;
        this.privacyCheckBoxHeight = builder.f57485q0;
        this.checkedImageName = builder.f57488r0;
        this.checkedImageDrawable = builder.f57491s0;
        this.unCheckedImageName = builder.f57494t0;
        this.unCheckedImageNameDrawable = builder.f57497u0;
        this.privacyDialogText = builder.f57500v0;
        this.privacyDialogAuto = builder.f57503w0;
        this.privacyDialogTextSize = builder.f57506x0;
        this.privacyTextStart = builder.f57509y0;
        this.privacyLineSpacingAdd = builder.A0;
        this.privacyLineSpacingMul = builder.B0;
        this.privacyTextStartSize = builder.f57512z0;
        this.protocolText = builder.C0;
        this.protocolLink = builder.D0;
        this.protocolConnect = builder.E0;
        this.protocol2Text = builder.F0;
        this.protocol2Link = builder.G0;
        this.protocol3Text = builder.H0;
        this.protocol3Link = builder.I0;
        this.privacyTextEnd = builder.J0;
        this.customViewHolders = builder.f57501v1;
        this.backgroundImage = builder.f57459h1;
        this.protocolBackgroundImage = builder.f57462i1;
        this.backgroundImageDrawable = builder.f57465j1;
        this.backgroundGif = builder.f57468k1;
        this.backgroundGifDrawable = builder.f57471l1;
        this.backgroundVideo = builder.f57474m1;
        this.backgroundVideoImage = builder.f57477n1;
        this.backgroundVideoImageDrawable = builder.f57480o1;
        this.activityEnterAnimation = builder.f57483p1;
        this.activityExitAnimation = builder.f57486q1;
        this.protocolNavTitle = builder.K0;
        this.cmProtocolNavTitle = builder.L0;
        this.ctProtocolNavTitle = builder.M0;
        this.cuProtocolNavTitle = builder.N0;
        this.customProtocolNavTitle = builder.O0;
        this.customProtocol2NavTitle = builder.P0;
        this.customProtocol3NavTitle = builder.Q0;
        this.protocolNavBackIcon = builder.X0;
        this.protocolNavBackIconDrawable = builder.Y0;
        this.protocolNavColor = builder.Z0;
        this.protocolNavHeight = builder.R0;
        this.protocolNavTitleColor = builder.S0;
        this.protocolNavTitleSize = builder.T0;
        this.protocolNavTitleDpSize = builder.U0;
        this.protocolNavBackIconWidth = builder.V0;
        this.protocolNavBackIconHeight = builder.W0;
        this.isDialogMode = builder.f57438a1;
        this.dialogWidth = builder.f57441b1;
        this.dialogHeight = builder.f57444c1;
        this.dialogX = builder.f57447d1;
        this.dialogY = builder.f57450e1;
        this.isBottomDialog = builder.f57453f1;
        this.isProtocolDialogMode = builder.f57456g1;
        this.isLandscape = builder.isLandscape;
        this.context = context;
        this.maskNumberListener = builder.f57489r1;
        this.loginListener = builder.f57492s1;
        this.clickEventListener = builder.f57495t1;
        this.backgroundShadow = builder.f57498u1;
        this.activityLifecycleCallbacks = builder.f57504w1;
        this.activityResultCallbacks = builder.f57507x1;
        this.backPressedAvailable = builder.f57510y1;
        this.loadingVisible = builder.f57513z1;
        this.loadingView = builder.A1;
        try {
            createCmAuthUiBuilder();
        } catch (Exception e5) {
            Logger.e(e5.getMessage());
        }
    }
}
