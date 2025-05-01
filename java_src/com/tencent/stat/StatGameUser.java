package com.tencent.stat;
/* loaded from: classes6.dex */
public class StatGameUser implements Cloneable {

    /* renamed from: a  reason: collision with root package name */
    private String f62851a = "";

    /* renamed from: b  reason: collision with root package name */
    private String f62852b = "";

    /* renamed from: c  reason: collision with root package name */
    private String f62853c = "";

    /* renamed from: clone */
    public StatGameUser m28clone() {
        try {
            return (StatGameUser) super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public String getAccount() {
        return this.f62852b;
    }

    public String getLevel() {
        return this.f62853c;
    }

    public String getWorldName() {
        return this.f62851a;
    }

    public void setAccount(String str) {
        this.f62852b = str;
    }

    public void setLevel(String str) {
        this.f62853c = str;
    }

    public void setWorldName(String str) {
        this.f62851a = str;
    }
}
