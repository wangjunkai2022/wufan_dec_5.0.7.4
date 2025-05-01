package com.xinzhu.overmind.server.accounts;

import android.accounts.AuthenticatorDescription;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.xinzhu.haunted.com.android.internal.a;
import com.xinzhu.overmind.server.pm.m;
/* compiled from: AccountAuthenticatorCache.java */
/* loaded from: classes.dex */
class a extends m<AuthenticatorDescription> implements d {

    /* renamed from: o  reason: collision with root package name */
    private static final String f67866o = "Account";

    public a(Context context) {
        super(context, "android.accounts.AccountAuthenticator", "android.accounts.AccountAuthenticator", "account-authenticator");
    }

    @Override // com.xinzhu.overmind.server.accounts.d
    public /* bridge */ /* synthetic */ m.d d(AuthenticatorDescription authenticatorDescription, int i4) {
        return super.p(authenticatorDescription, i4);
    }

    @Override // com.xinzhu.overmind.server.pm.m
    /* renamed from: y */
    public AuthenticatorDescription v(Resources resources, String str, AttributeSet attributeSet) {
        TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, a.e.A());
        try {
            String string = obtainAttributes.getString(a.e.C());
            int resourceId = obtainAttributes.getResourceId(a.e.F(), 0);
            int resourceId2 = obtainAttributes.getResourceId(a.e.E(), 0);
            int resourceId3 = obtainAttributes.getResourceId(a.e.G(), 0);
            int resourceId4 = obtainAttributes.getResourceId(a.e.B(), 0);
            boolean z4 = obtainAttributes.getBoolean(a.e.D(), false);
            if (TextUtils.isEmpty(string)) {
                return null;
            }
            return new AuthenticatorDescription(string, str, resourceId, resourceId2, resourceId3, resourceId4, z4);
        } finally {
            obtainAttributes.recycle();
        }
    }
}
