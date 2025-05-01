package com.cmic.sso.sdk.view;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import java.util.regex.Pattern;
/* loaded from: classes2.dex */
public class AuthThemeConfig {
    public static final String PLACEHOLDER = "$$运营商条款$$";
    private int A;
    private int B;
    private int C;
    private int D;
    private int E;
    private String F;
    private boolean G;
    private BackPressedListener H;
    private LoginClickListener I;
    private CheckBoxListener J;
    private String K;
    private String L;
    private int M;
    private int N;
    private boolean O;
    private String P;
    private String Q;
    private String R;
    private String S;
    private String T;
    private String U;
    private String V;
    private String W;
    private String X;
    private int Y;
    private boolean Z;

    /* renamed from: a  reason: collision with root package name */
    private int f9353a;
    private int aa;
    private int ab;
    private boolean ac;
    private int ad;
    private int ae;
    private int af;
    private int ag;
    private int ah;
    private boolean ai;
    private String aj;
    private String ak;
    private String al;
    private String am;
    private int an;
    private int ao;
    private int ap;
    private int aq;
    private int ar;
    private int as;
    private int at;
    private boolean au;
    private boolean av;
    private String aw;

    /* renamed from: b  reason: collision with root package name */
    private boolean f9354b;

    /* renamed from: c  reason: collision with root package name */
    private View f9355c;

    /* renamed from: d  reason: collision with root package name */
    private int f9356d;

    /* renamed from: e  reason: collision with root package name */
    private int f9357e;

    /* renamed from: f  reason: collision with root package name */
    private String f9358f;

    /* renamed from: g  reason: collision with root package name */
    private int f9359g;

    /* renamed from: h  reason: collision with root package name */
    private int f9360h;

    /* renamed from: i  reason: collision with root package name */
    private int f9361i;

    /* renamed from: j  reason: collision with root package name */
    private String f9362j;

    /* renamed from: k  reason: collision with root package name */
    private int f9363k;

    /* renamed from: l  reason: collision with root package name */
    private int f9364l;

    /* renamed from: m  reason: collision with root package name */
    private ImageView.ScaleType f9365m;

    /* renamed from: n  reason: collision with root package name */
    private int f9366n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f9367o;

    /* renamed from: p  reason: collision with root package name */
    private int f9368p;

    /* renamed from: q  reason: collision with root package name */
    private int f9369q;

    /* renamed from: r  reason: collision with root package name */
    private int f9370r;

    /* renamed from: s  reason: collision with root package name */
    private int f9371s;

    /* renamed from: t  reason: collision with root package name */
    private String f9372t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f9373u;

    /* renamed from: v  reason: collision with root package name */
    private int f9374v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f9375w;

    /* renamed from: x  reason: collision with root package name */
    private int f9376x;

    /* renamed from: y  reason: collision with root package name */
    private String f9377y;

    /* renamed from: z  reason: collision with root package name */
    private int f9378z;

    public String getActivityIn() {
        return this.am;
    }

    public String getActivityOut() {
        return this.ak;
    }

    public int getAppLanguageType() {
        return this.at;
    }

    public String getAuthPageActIn() {
        return this.aj;
    }

    public String getAuthPageActOut() {
        return this.al;
    }

    public BackPressedListener getBackPressedListener() {
        return this.H;
    }

    public CheckBoxListener getCheckBoxListener() {
        return this.J;
    }

    public int getCheckBoxLocation() {
        return this.ad;
    }

    public String getCheckTipText() {
        if (this.G) {
            int i4 = this.at;
            this.F = i4 == 1 ? "請勾選同意服務條款" : i4 == 2 ? "Please check to agree to the terms of service" : "请勾选同意服务条款";
        }
        return this.F;
    }

    public int getCheckedImgHeight() {
        return this.N;
    }

    public String getCheckedImgPath() {
        return this.K;
    }

    public int getCheckedImgWidth() {
        return this.M;
    }

    public int getClauseBaseColor() {
        return this.aa;
    }

    public int getClauseColor() {
        return this.ab;
    }

    public int getClauseLayoutResID() {
        return this.f9357e;
    }

    public String getClauseLayoutReturnID() {
        return this.f9358f;
    }

    public String getClauseName() {
        return this.Q;
    }

    public String getClauseName2() {
        return this.S;
    }

    public String getClauseName3() {
        return this.U;
    }

    public String getClauseName4() {
        return this.W;
    }

    public String getClauseUrl() {
        return this.R;
    }

    public String getClauseUrl2() {
        return this.T;
    }

    public String getClauseUrl3() {
        return this.V;
    }

    public String getClauseUrl4() {
        return this.X;
    }

    public View getContentView() {
        return this.f9355c;
    }

    public int getLayoutResID() {
        return this.f9356d;
    }

    public String getLogBtnBackgroundPath() {
        return this.f9377y;
    }

    public int getLogBtnHeight() {
        return this.A;
    }

    public int getLogBtnMarginLeft() {
        return this.B;
    }

    public int getLogBtnMarginRight() {
        return this.C;
    }

    public int getLogBtnOffsetY() {
        return this.D;
    }

    public int getLogBtnOffsetY_B() {
        return this.E;
    }

    public String getLogBtnText() {
        if (this.f9373u) {
            int i4 = this.at;
            this.f9372t = i4 == 1 ? "本機號碼登錄" : i4 == 2 ? "Login" : this.f9372t;
        }
        return this.f9372t;
    }

    public int getLogBtnTextColor() {
        return this.f9376x;
    }

    public int getLogBtnTextSize() {
        return this.f9374v;
    }

    public int getLogBtnWidth() {
        return this.f9378z;
    }

    public LoginClickListener getLoginClickListener() {
        return this.I;
    }

    public int getNavColor() {
        return this.f9361i;
    }

    public int getNavReturnImgHeight() {
        return this.f9364l;
    }

    public String getNavReturnImgPath() {
        return this.f9362j;
    }

    public ImageView.ScaleType getNavReturnImgScaleType() {
        return this.f9365m;
    }

    public int getNavReturnImgWidth() {
        return this.f9363k;
    }

    public int getNavTextColor() {
        return this.f9360h;
    }

    public int getNavTextSize() {
        return this.f9359g;
    }

    public int getNumFieldOffsetY() {
        return this.f9370r;
    }

    public int getNumFieldOffsetY_B() {
        return this.f9371s;
    }

    public int getNumberColor() {
        return this.f9368p;
    }

    public int getNumberOffsetX() {
        return this.f9369q;
    }

    public int getNumberSize() {
        return this.f9366n;
    }

    public String getPrivacy() {
        return this.P;
    }

    public String getPrivacyAnimation() {
        return this.aw;
    }

    public int getPrivacyMarginLeft() {
        return this.ae;
    }

    public int getPrivacyMarginRight() {
        return this.af;
    }

    public int getPrivacyOffsetY() {
        return this.ag;
    }

    public int getPrivacyOffsetY_B() {
        return this.ah;
    }

    public int getPrivacyTextSize() {
        return this.Y;
    }

    public int getStatusBarColor() {
        return this.f9353a;
    }

    public int getThemeId() {
        return this.as;
    }

    public String getUncheckedImgPath() {
        return this.L;
    }

    public int getWindowBottom() {
        return this.ar;
    }

    public int getWindowHeight() {
        return this.ao;
    }

    public int getWindowWidth() {
        return this.an;
    }

    public int getWindowX() {
        return this.ap;
    }

    public int getWindowY() {
        return this.aq;
    }

    public boolean isBackButton() {
        return this.av;
    }

    public boolean isFitsSystemWindows() {
        return this.au;
    }

    public boolean isLightColor() {
        return this.f9354b;
    }

    public boolean isLogBtnTextBold() {
        return this.f9375w;
    }

    public boolean isNumberBold() {
        return this.f9367o;
    }

    public boolean isPrivacyBookSymbol() {
        return this.ai;
    }

    public boolean isPrivacyState() {
        return this.O;
    }

    public boolean isPrivacyTextBold() {
        return this.Z;
    }

    public boolean isPrivacyTextGravityCenter() {
        return this.ac;
    }

    private AuthThemeConfig(Builder builder) {
        this.f9373u = true;
        this.U = null;
        this.V = null;
        this.W = null;
        this.X = null;
        this.f9353a = builder.f9379a;
        this.f9354b = builder.f9380b;
        this.f9355c = builder.f9381c;
        this.f9356d = builder.f9382d;
        this.f9357e = builder.f9383e;
        this.f9358f = builder.f9384f;
        this.f9359g = builder.f9385g;
        this.f9360h = builder.f9386h;
        this.f9361i = builder.f9387i;
        this.f9362j = builder.f9388j;
        this.f9363k = builder.f9389k;
        this.f9364l = builder.f9390l;
        this.f9365m = builder.f9391m;
        this.f9366n = builder.f9392n;
        this.f9367o = builder.f9393o;
        this.f9368p = builder.f9394p;
        this.f9369q = builder.f9395q;
        this.f9370r = builder.f9396r;
        this.f9371s = builder.f9397s;
        this.f9372t = builder.f9398t;
        this.f9373u = builder.f9399u;
        this.f9374v = builder.f9400v;
        this.f9375w = builder.f9401w;
        this.f9376x = builder.f9402x;
        this.f9377y = builder.f9403y;
        this.f9378z = builder.f9404z;
        this.A = builder.A;
        this.B = builder.B;
        this.C = builder.C;
        this.D = builder.D;
        this.E = builder.E;
        this.F = builder.F;
        this.G = builder.G;
        this.H = builder.H;
        this.I = builder.I;
        this.J = builder.J;
        this.K = builder.K;
        this.L = builder.L;
        this.M = builder.M;
        this.N = builder.N;
        this.O = builder.O;
        this.P = builder.P;
        this.Q = builder.Q;
        this.R = builder.R;
        this.S = builder.S;
        this.T = builder.T;
        this.U = builder.U;
        this.V = builder.V;
        this.W = builder.W;
        this.X = builder.X;
        this.Y = builder.Y;
        this.Z = builder.Z;
        this.aa = builder.aa;
        this.ab = builder.ab;
        this.ac = builder.ac;
        this.ae = builder.ad;
        this.af = builder.ae;
        this.ag = builder.af;
        this.ah = builder.ag;
        this.ai = builder.ah;
        this.ad = builder.ai;
        this.aj = builder.aj;
        this.ak = builder.ak;
        this.al = builder.al;
        this.am = builder.am;
        this.an = builder.an;
        this.ao = builder.ao;
        this.ap = builder.ap;
        this.aq = builder.aq;
        this.ar = builder.ar;
        this.as = builder.as;
        this.at = builder.at;
        this.au = builder.au;
        this.av = builder.av;
        this.aw = builder.aw;
    }

    /* loaded from: classes2.dex */
    public static class Builder {
        private String F;
        private boolean G;
        private BackPressedListener H;
        private LoginClickListener I;
        private CheckBoxListener J;
        private int ai;
        private String aj;
        private String ak;
        private String al;
        private String am;
        private int an;
        private int ao;
        private int ap;
        private int aq;
        private String aw;

        /* renamed from: f  reason: collision with root package name */
        private String f9384f;

        /* renamed from: a  reason: collision with root package name */
        private int f9379a = 0;

        /* renamed from: b  reason: collision with root package name */
        private boolean f9380b = false;

        /* renamed from: c  reason: collision with root package name */
        private View f9381c = null;

        /* renamed from: d  reason: collision with root package name */
        private int f9382d = -1;

        /* renamed from: e  reason: collision with root package name */
        private int f9383e = -1;

        /* renamed from: g  reason: collision with root package name */
        private int f9385g = 17;

        /* renamed from: h  reason: collision with root package name */
        private int f9386h = -1;

        /* renamed from: i  reason: collision with root package name */
        private int f9387i = -16742704;

        /* renamed from: j  reason: collision with root package name */
        private String f9388j = "return_bg";

        /* renamed from: k  reason: collision with root package name */
        private int f9389k = -2;

        /* renamed from: l  reason: collision with root package name */
        private int f9390l = -2;

        /* renamed from: m  reason: collision with root package name */
        private ImageView.ScaleType f9391m = ImageView.ScaleType.CENTER;

        /* renamed from: n  reason: collision with root package name */
        private int f9392n = 18;

        /* renamed from: o  reason: collision with root package name */
        private boolean f9393o = false;

        /* renamed from: p  reason: collision with root package name */
        private int f9394p = -16742704;

        /* renamed from: q  reason: collision with root package name */
        private int f9395q = 0;

        /* renamed from: r  reason: collision with root package name */
        private int f9396r = 184;

        /* renamed from: s  reason: collision with root package name */
        private int f9397s = 0;

        /* renamed from: t  reason: collision with root package name */
        private String f9398t = "本机号码一键登录";

        /* renamed from: u  reason: collision with root package name */
        private boolean f9399u = true;

        /* renamed from: v  reason: collision with root package name */
        private int f9400v = 15;

        /* renamed from: w  reason: collision with root package name */
        private boolean f9401w = false;

        /* renamed from: x  reason: collision with root package name */
        private int f9402x = -1;

        /* renamed from: y  reason: collision with root package name */
        private String f9403y = "umcsdk_login_btn_bg";

        /* renamed from: z  reason: collision with root package name */
        private int f9404z = -1;
        private int A = 36;
        private int B = 46;
        private int C = 46;
        private int D = 254;
        private int E = 0;
        private String K = "umcsdk_check_image";
        private String L = "umcsdk_uncheck_image";
        private int M = 9;
        private int N = 9;
        private boolean O = false;
        private String P = "登录即同意$$运营商条款$$并使用本机号码登录";
        private String Q = null;
        private String R = null;
        private String S = null;
        private String T = null;
        private String U = null;
        private String V = null;
        private String W = null;
        private String X = null;
        private int Y = 10;
        private boolean Z = false;
        private int aa = -10066330;
        private int ab = -16007674;
        private boolean ac = false;
        private int ad = 52;
        private int ae = 52;
        private int af = 0;
        private int ag = 30;
        private boolean ah = true;
        private int ar = 0;
        private int as = -1;
        private int at = 0;
        private boolean au = true;
        private boolean av = true;

        public AuthThemeConfig build() {
            return new AuthThemeConfig(this);
        }

        public Builder setAppLanguageType(int i4) {
            this.at = i4;
            return this;
        }

        public Builder setAuthContentView(View view) {
            this.f9381c = view;
            this.f9382d = -1;
            return this;
        }

        public Builder setAuthLayoutResID(int i4) {
            this.f9382d = i4;
            this.f9381c = null;
            return this;
        }

        public Builder setAuthPageActIn(String str, String str2) {
            this.aj = str;
            this.ak = str2;
            return this;
        }

        public Builder setAuthPageActOut(String str, String str2) {
            this.al = str2;
            this.am = str;
            return this;
        }

        public Builder setAuthPageWindowMode(int i4, int i5) {
            this.an = i4;
            this.ao = i5;
            return this;
        }

        public Builder setAuthPageWindowOffset(int i4, int i5) {
            this.ap = i4;
            this.aq = i5;
            return this;
        }

        public Builder setBackButton(boolean z4) {
            this.av = z4;
            return this;
        }

        public Builder setBackPressedListener(BackPressedListener backPressedListener) {
            this.H = backPressedListener;
            return this;
        }

        public Builder setCheckBoxImgPath(String str, String str2, int i4, int i5) {
            this.K = str;
            this.L = str2;
            this.M = i4;
            this.N = i5;
            return this;
        }

        public Builder setCheckBoxListener(CheckBoxListener checkBoxListener) {
            this.J = checkBoxListener;
            return this;
        }

        public Builder setCheckBoxLocation(int i4) {
            this.ai = i4;
            return this;
        }

        public Builder setCheckTipText(String str) {
            boolean z4 = TextUtils.isEmpty(str) || str.length() > 100;
            this.G = z4;
            if (z4) {
                str = "请勾选同意服务条款";
            }
            this.F = str;
            return this;
        }

        public Builder setCheckedImgPath(String str) {
            this.K = str;
            return this;
        }

        public Builder setClauseColor(int i4, int i5) {
            this.aa = i4;
            this.ab = i5;
            return this;
        }

        public Builder setClauseLayoutResID(int i4, String str) {
            this.f9383e = i4;
            this.f9384f = str;
            return this;
        }

        public Builder setFitsSystemWindows(boolean z4) {
            this.au = z4;
            return this;
        }

        public Builder setLogBtn(int i4, int i5) {
            this.f9404z = i4;
            this.A = i5;
            return this;
        }

        public Builder setLogBtnClickListener(LoginClickListener loginClickListener) {
            this.I = loginClickListener;
            return this;
        }

        public Builder setLogBtnImgPath(String str) {
            this.f9403y = str;
            return this;
        }

        public Builder setLogBtnMargin(int i4, int i5) {
            this.B = i4;
            this.C = i5;
            return this;
        }

        public Builder setLogBtnOffsetY(int i4) {
            this.D = i4;
            this.E = 0;
            return this;
        }

        public Builder setLogBtnOffsetY_B(int i4) {
            this.E = i4;
            this.D = 0;
            return this;
        }

        public Builder setLogBtnText(String str) {
            if (!TextUtils.isEmpty(str) && !Pattern.compile("^\\s*\\n*$").matcher(str).matches()) {
                this.f9398t = str;
                this.f9399u = false;
            }
            return this;
        }

        public Builder setLogBtnTextColor(int i4) {
            this.f9402x = i4;
            return this;
        }

        public Builder setNavColor(int i4) {
            this.f9387i = i4;
            return this;
        }

        public Builder setNavTextColor(int i4) {
            this.f9386h = i4;
            return this;
        }

        public Builder setNavTextSize(int i4) {
            this.f9385g = i4;
            return this;
        }

        public Builder setNumFieldOffsetY(int i4) {
            this.f9396r = i4;
            this.f9397s = 0;
            return this;
        }

        public Builder setNumFieldOffsetY_B(int i4) {
            this.f9397s = i4;
            this.f9396r = 0;
            return this;
        }

        public Builder setNumberColor(int i4) {
            this.f9394p = i4;
            return this;
        }

        public Builder setNumberOffsetX(int i4) {
            this.f9395q = i4;
            return this;
        }

        public Builder setNumberSize(int i4, boolean z4) {
            if (i4 > 8) {
                this.f9392n = i4;
                this.f9393o = z4;
            }
            return this;
        }

        public Builder setPrivacyAlignment(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
            if (str.contains(AuthThemeConfig.PLACEHOLDER)) {
                this.P = str;
                this.Q = str2;
                this.R = str3;
                this.S = str4;
                this.T = str5;
                this.U = str6;
                this.V = str7;
                this.W = str8;
                this.X = str9;
            }
            return this;
        }

        public Builder setPrivacyAnimation(String str) {
            this.aw = str;
            return this;
        }

        public Builder setPrivacyBookSymbol(boolean z4) {
            this.ah = z4;
            return this;
        }

        public Builder setPrivacyMargin(int i4, int i5) {
            this.ad = i4;
            this.ae = i5;
            return this;
        }

        public Builder setPrivacyOffsetY(int i4) {
            this.af = i4;
            this.ag = 0;
            return this;
        }

        public Builder setPrivacyOffsetY_B(int i4) {
            this.ag = i4;
            this.af = 0;
            return this;
        }

        public Builder setPrivacyState(boolean z4) {
            this.O = z4;
            return this;
        }

        public Builder setPrivacyText(int i4, int i5, int i6, boolean z4, boolean z5) {
            this.Y = i4;
            this.aa = i5;
            this.ab = i6;
            this.ac = z4;
            this.Z = z5;
            return this;
        }

        public Builder setStatusBar(int i4, boolean z4) {
            this.f9379a = i4;
            this.f9380b = z4;
            return this;
        }

        public Builder setThemeId(int i4) {
            this.as = i4;
            return this;
        }

        public Builder setUncheckedImgPath(String str) {
            this.L = str;
            return this;
        }

        public Builder setWindowBottom(int i4) {
            this.ar = i4;
            return this;
        }

        public Builder setLogBtnText(String str, int i4, int i5, boolean z4) {
            if (!TextUtils.isEmpty(str) && !Pattern.compile("^\\s*\\n*$").matcher(str).matches()) {
                this.f9398t = str;
                this.f9399u = false;
            }
            this.f9402x = i4;
            this.f9400v = i5;
            this.f9401w = z4;
            return this;
        }
    }
}
