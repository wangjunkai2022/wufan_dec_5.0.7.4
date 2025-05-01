package com.qq.e.ads.hybrid;
/* loaded from: classes5.dex */
public class HybridADSetting {
    public static final int TYPE_REWARD_VIDEO = 1;

    /* renamed from: f  reason: collision with root package name */
    private String f59720f;

    /* renamed from: g  reason: collision with root package name */
    private String f59721g;

    /* renamed from: h  reason: collision with root package name */
    private String f59722h;

    /* renamed from: a  reason: collision with root package name */
    private int f59715a = 1;

    /* renamed from: b  reason: collision with root package name */
    private int f59716b = 44;

    /* renamed from: c  reason: collision with root package name */
    private int f59717c = -1;

    /* renamed from: d  reason: collision with root package name */
    private int f59718d = -14013133;

    /* renamed from: e  reason: collision with root package name */
    private int f59719e = 16;

    /* renamed from: i  reason: collision with root package name */
    private int f59723i = -1776153;

    /* renamed from: j  reason: collision with root package name */
    private int f59724j = 16;

    public HybridADSetting backButtonImage(String str) {
        this.f59721g = str;
        return this;
    }

    public HybridADSetting backSeparatorLength(int i4) {
        this.f59724j = i4;
        return this;
    }

    public HybridADSetting closeButtonImage(String str) {
        this.f59722h = str;
        return this;
    }

    public String getBackButtonImage() {
        return this.f59721g;
    }

    public int getBackSeparatorLength() {
        return this.f59724j;
    }

    public String getCloseButtonImage() {
        return this.f59722h;
    }

    public int getSeparatorColor() {
        return this.f59723i;
    }

    public String getTitle() {
        return this.f59720f;
    }

    public int getTitleBarColor() {
        return this.f59717c;
    }

    public int getTitleBarHeight() {
        return this.f59716b;
    }

    public int getTitleColor() {
        return this.f59718d;
    }

    public int getTitleSize() {
        return this.f59719e;
    }

    public int getType() {
        return this.f59715a;
    }

    public HybridADSetting separatorColor(int i4) {
        this.f59723i = i4;
        return this;
    }

    public HybridADSetting title(String str) {
        this.f59720f = str;
        return this;
    }

    public HybridADSetting titleBarColor(int i4) {
        this.f59717c = i4;
        return this;
    }

    public HybridADSetting titleBarHeight(int i4) {
        this.f59716b = i4;
        return this;
    }

    public HybridADSetting titleColor(int i4) {
        this.f59718d = i4;
        return this;
    }

    public HybridADSetting titleSize(int i4) {
        this.f59719e = i4;
        return this;
    }

    public HybridADSetting type(int i4) {
        this.f59715a = i4;
        return this;
    }
}
