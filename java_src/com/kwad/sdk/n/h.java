package com.kwad.sdk.n;

import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Movie;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.io.InputStream;
/* loaded from: classes5.dex */
public final class h extends Resources {
    private final Resources aUk;

    public h(Resources resources, Resources resources2) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.aUk = resources2;
    }

    private static boolean az(String str, String str2) {
        return TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || !str.startsWith("ksad_") || !"com.kwad.dy.sdk".equals(str2);
    }

    private static boolean eu(int i4) {
        StringBuilder sb = new StringBuilder("0x");
        sb.append(Integer.toHexString(i4));
        return !sb.toString().startsWith("0x60");
    }

    @Override // android.content.res.Resources
    @NonNull
    public final XmlResourceParser getAnimation(int i4) {
        com.kwad.sdk.core.e.c.d("KSDY/KSResource", "getAnimation id: 0x#" + Integer.toHexString(i4));
        if (eu(i4)) {
            return this.aUk.getAnimation(i4);
        }
        return super.getAnimation(i4);
    }

    @Override // android.content.res.Resources
    public final boolean getBoolean(int i4) {
        com.kwad.sdk.core.e.c.d("KSDY/KSResource", "getBoolean id: #0x" + Integer.toHexString(i4));
        if (eu(i4)) {
            return this.aUk.getBoolean(i4);
        }
        return super.getBoolean(i4);
    }

    @Override // android.content.res.Resources
    @Deprecated
    public final int getColor(int i4) {
        com.kwad.sdk.core.e.c.d("KSDY/KSResource", "getColor id: #0x" + Integer.toHexString(i4));
        if (eu(i4)) {
            return this.aUk.getColor(i4);
        }
        return super.getColor(i4);
    }

    @Override // android.content.res.Resources
    @NonNull
    @RequiresApi(api = 23)
    public final ColorStateList getColorStateList(int i4, @Nullable Resources.Theme theme) {
        try {
            com.kwad.sdk.core.e.c.d("KSDY/KSResource", "getColorStateList: 0x#" + Integer.toHexString(i4));
        } catch (Exception e5) {
            com.kwad.sdk.core.e.c.e("KSDY/KSResource", Log.getStackTraceString(e5));
        }
        if (eu(i4)) {
            return this.aUk.getColorStateList(i4, theme);
        }
        return super.getColorStateList(i4, theme);
    }

    @Override // android.content.res.Resources
    public final float getDimension(int i4) {
        com.kwad.sdk.core.e.c.d("KSDY/KSResource", "getDimension id: #0x" + Integer.toHexString(i4));
        if (eu(i4)) {
            return this.aUk.getDimension(i4);
        }
        return super.getDimension(i4);
    }

    @Override // android.content.res.Resources
    public final int getDimensionPixelOffset(int i4) {
        com.kwad.sdk.core.e.c.d("KSDY/KSResource", "getDimensionPixelOffset id: #0x" + Integer.toHexString(i4));
        if (eu(i4)) {
            return this.aUk.getDimensionPixelOffset(i4);
        }
        return super.getDimensionPixelOffset(i4);
    }

    @Override // android.content.res.Resources
    public final int getDimensionPixelSize(int i4) {
        com.kwad.sdk.core.e.c.d("KSDY/KSResource", "getDimensionPixelSize id: #0x" + Integer.toHexString(i4));
        if (eu(i4)) {
            return this.aUk.getDimensionPixelSize(i4);
        }
        return super.getDimensionPixelSize(i4);
    }

    @Override // android.content.res.Resources
    public final DisplayMetrics getDisplayMetrics() {
        return super.getDisplayMetrics();
    }

    @Override // android.content.res.Resources
    @Deprecated
    public final Drawable getDrawable(int i4) {
        com.kwad.sdk.core.e.c.d("KSDY/KSResource", "getDrawable id: #0x" + Integer.toHexString(i4));
        if (eu(i4)) {
            return this.aUk.getDrawable(i4);
        }
        return super.getDrawable(i4);
    }

    @Override // android.content.res.Resources
    @Nullable
    @Deprecated
    public final Drawable getDrawableForDensity(int i4, int i5) {
        com.kwad.sdk.core.e.c.d("KSDY/KSResource", "getDrawableForDensity id: #0x" + Integer.toHexString(i4));
        if (eu(i4)) {
            return this.aUk.getDrawableForDensity(i4, i5);
        }
        return super.getDrawableForDensity(i4, i5);
    }

    @Override // android.content.res.Resources
    @RequiresApi(api = 29)
    public final float getFloat(int i4) {
        com.kwad.sdk.core.e.c.d("KSDY/KSResource", "getFloat id: #0x" + Integer.toHexString(i4));
        if (eu(i4)) {
            return this.aUk.getFloat(i4);
        }
        return super.getFloat(i4);
    }

    @Override // android.content.res.Resources
    @NonNull
    @RequiresApi(api = 26)
    public final Typeface getFont(int i4) {
        com.kwad.sdk.core.e.c.d("KSDY/KSResource", "getFont id: #0x" + Integer.toHexString(i4));
        if (eu(i4)) {
            return this.aUk.getFont(i4);
        }
        return super.getFont(i4);
    }

    @Override // android.content.res.Resources
    public final float getFraction(int i4, int i5, int i6) {
        com.kwad.sdk.core.e.c.d("KSDY/KSResource", "getFraction id: #0x" + Integer.toHexString(i4));
        if (eu(i4)) {
            return this.aUk.getFraction(i4, i5, i6);
        }
        return super.getFraction(i4, i5, i6);
    }

    @Override // android.content.res.Resources
    public final int getIdentifier(String str, String str2, String str3) {
        com.kwad.sdk.core.e.c.d("KSDY/KSResource", "getIdentifier id: 0x# name:" + str + " :defPackage" + str3);
        if (az(str, str3)) {
            return this.aUk.getIdentifier(str, str2, str3);
        }
        return super.getIdentifier(str, str2, str3);
    }

    @Override // android.content.res.Resources
    @NonNull
    public final int[] getIntArray(int i4) {
        com.kwad.sdk.core.e.c.d("KSDY/KSResource", "getIntArray id: #0x" + Integer.toHexString(i4));
        if (eu(i4)) {
            return this.aUk.getIntArray(i4);
        }
        return super.getIntArray(i4);
    }

    @Override // android.content.res.Resources
    public final int getInteger(int i4) {
        com.kwad.sdk.core.e.c.d("KSDY/KSResource", "getInteger id: #0x" + Integer.toHexString(i4));
        if (eu(i4)) {
            return this.aUk.getInteger(i4);
        }
        return super.getInteger(i4);
    }

    @Override // android.content.res.Resources
    @NonNull
    public final XmlResourceParser getLayout(int i4) {
        com.kwad.sdk.core.e.c.d("KSDY/KSResource", "getLayout id: 0x#" + Integer.toHexString(i4));
        if (eu(i4)) {
            return this.aUk.getLayout(i4);
        }
        return super.getLayout(i4);
    }

    @Override // android.content.res.Resources
    @Deprecated
    public final Movie getMovie(int i4) {
        com.kwad.sdk.core.e.c.d("KSDY/KSResource", "getMovie id: #0x" + Integer.toHexString(i4));
        if (eu(i4)) {
            return this.aUk.getMovie(i4);
        }
        return super.getMovie(i4);
    }

    @Override // android.content.res.Resources
    @NonNull
    public final String getQuantityString(int i4, int i5) {
        com.kwad.sdk.core.e.c.d("KSDY/KSResource", "getQuantityString id: #0x" + Integer.toHexString(i4));
        if (eu(i4)) {
            return this.aUk.getQuantityString(i4, i5);
        }
        return super.getQuantityString(i4, i5);
    }

    @Override // android.content.res.Resources
    @NonNull
    public final CharSequence getQuantityText(int i4, int i5) {
        com.kwad.sdk.core.e.c.d("KSDY/KSResource", "getQuantityText id: #0x" + Integer.toHexString(i4));
        if (eu(i4)) {
            return this.aUk.getQuantityText(i4, i5);
        }
        return super.getQuantityText(i4, i5);
    }

    @Override // android.content.res.Resources
    public final String getResourceEntryName(int i4) {
        com.kwad.sdk.core.e.c.d("KSDY/KSResource", "getResourceEntryName id: 0x#" + Integer.toHexString(i4));
        if (eu(i4)) {
            return this.aUk.getResourceEntryName(i4);
        }
        return super.getResourceEntryName(i4);
    }

    @Override // android.content.res.Resources
    public final String getResourceName(int i4) {
        com.kwad.sdk.core.e.c.d("KSDY/KSResource", "getResourceName id: 0x#" + Integer.toHexString(i4));
        if (eu(i4)) {
            return this.aUk.getResourceName(i4);
        }
        return super.getResourceName(i4);
    }

    @Override // android.content.res.Resources
    public final String getResourcePackageName(int i4) {
        com.kwad.sdk.core.e.c.d("KSDY/KSResource", "getResourcePackageName id: 0x#" + Integer.toHexString(i4));
        if (eu(i4)) {
            return this.aUk.getResourcePackageName(i4);
        }
        return super.getResourcePackageName(i4);
    }

    @Override // android.content.res.Resources
    public final String getResourceTypeName(int i4) {
        com.kwad.sdk.core.e.c.d("KSDY/KSResource", "getResourceTypeName id: 0x#" + Integer.toHexString(i4));
        if (eu(i4)) {
            return this.aUk.getResourceTypeName(i4);
        }
        return super.getResourceTypeName(i4);
    }

    @Override // android.content.res.Resources
    @NonNull
    public final String getString(int i4) {
        com.kwad.sdk.core.e.c.d("KSDY/KSResource", "getString id: #0x" + Integer.toHexString(i4));
        if (eu(i4)) {
            return this.aUk.getString(i4);
        }
        return super.getString(i4);
    }

    @Override // android.content.res.Resources
    @NonNull
    public final String[] getStringArray(int i4) {
        com.kwad.sdk.core.e.c.d("KSDY/KSResource", "getStringArray id: #0x" + Integer.toHexString(i4));
        if (eu(i4)) {
            return this.aUk.getStringArray(i4);
        }
        return super.getStringArray(i4);
    }

    @Override // android.content.res.Resources
    @NonNull
    public final CharSequence getText(int i4) {
        com.kwad.sdk.core.e.c.d("KSDY/KSResource", "getText id: #0x" + Integer.toHexString(i4));
        if (eu(i4)) {
            return this.aUk.getText(i4);
        }
        return super.getText(i4);
    }

    @Override // android.content.res.Resources
    @NonNull
    public final CharSequence[] getTextArray(int i4) {
        com.kwad.sdk.core.e.c.d("KSDY/KSResource", "getTextArray id: #0x" + Integer.toHexString(i4));
        if (eu(i4)) {
            return this.aUk.getTextArray(i4);
        }
        return super.getTextArray(i4);
    }

    @Override // android.content.res.Resources
    public final void getValue(int i4, TypedValue typedValue, boolean z4) {
        com.kwad.sdk.core.e.c.d("KSDY/KSResource", "getValue id: 0x#" + Integer.toHexString(i4));
        if (eu(i4)) {
            this.aUk.getValue(i4, typedValue, z4);
        } else {
            super.getValue(i4, typedValue, z4);
        }
    }

    @Override // android.content.res.Resources
    public final void getValueForDensity(int i4, int i5, TypedValue typedValue, boolean z4) {
        com.kwad.sdk.core.e.c.d("KSDY/KSResource", "getValueForDensity id: 0x#" + Integer.toHexString(i4));
        if (eu(i4)) {
            this.aUk.getValueForDensity(i4, i5, typedValue, z4);
        } else {
            super.getValueForDensity(i4, i5, typedValue, z4);
        }
    }

    @Override // android.content.res.Resources
    @NonNull
    public final XmlResourceParser getXml(int i4) {
        com.kwad.sdk.core.e.c.d("KSDY/KSResource", "getXml id: 0x#" + Integer.toHexString(i4));
        if (eu(i4)) {
            return this.aUk.getXml(i4);
        }
        return super.getXml(i4);
    }

    @Override // android.content.res.Resources
    public final TypedArray obtainAttributes(AttributeSet attributeSet, int[] iArr) {
        return super.obtainAttributes(attributeSet, iArr);
    }

    @Override // android.content.res.Resources
    @NonNull
    public final TypedArray obtainTypedArray(int i4) {
        com.kwad.sdk.core.e.c.d("KSDY/KSResource", "obtainTypedArray id: #0x" + Integer.toHexString(i4));
        if (eu(i4)) {
            return this.aUk.obtainTypedArray(i4);
        }
        return super.obtainTypedArray(i4);
    }

    @Override // android.content.res.Resources
    @NonNull
    public final InputStream openRawResource(int i4) {
        com.kwad.sdk.core.e.c.d("KSDY/KSResource", "openRawResource id: 0x#" + Integer.toHexString(i4));
        if (eu(i4)) {
            return this.aUk.openRawResource(i4);
        }
        return super.openRawResource(i4);
    }

    @Override // android.content.res.Resources
    public final AssetFileDescriptor openRawResourceFd(int i4) {
        com.kwad.sdk.core.e.c.d("KSDY/KSResource", "openRawResourceFd id: 0x#" + Integer.toHexString(i4));
        if (eu(i4)) {
            return this.aUk.openRawResourceFd(i4);
        }
        return super.openRawResourceFd(i4);
    }

    @Override // android.content.res.Resources
    public final void parseBundleExtra(String str, AttributeSet attributeSet, Bundle bundle) {
        super.parseBundleExtra(str, attributeSet, bundle);
    }

    @Override // android.content.res.Resources
    public final void parseBundleExtras(XmlResourceParser xmlResourceParser, Bundle bundle) {
        super.parseBundleExtras(xmlResourceParser, bundle);
    }

    @Override // android.content.res.Resources
    public final void updateConfiguration(Configuration configuration, DisplayMetrics displayMetrics) {
        super.updateConfiguration(configuration, displayMetrics);
    }

    @Override // android.content.res.Resources
    @RequiresApi(api = 23)
    public final int getColor(int i4, @Nullable Resources.Theme theme) {
        com.kwad.sdk.core.e.c.d("KSDY/KSResource", "getMovie id: #0x" + Integer.toHexString(i4));
        if (eu(i4)) {
            return this.aUk.getColor(i4, theme);
        }
        return super.getColor(i4, theme);
    }

    @Override // android.content.res.Resources
    public final Drawable getDrawable(int i4, @Nullable Resources.Theme theme) {
        com.kwad.sdk.core.e.c.d("KSDY/KSResource", "getDrawable id: #0x" + Integer.toHexString(i4));
        if (eu(i4)) {
            return this.aUk.getDrawable(i4);
        }
        return super.getDrawable(i4, theme);
    }

    @Override // android.content.res.Resources
    @Nullable
    @RequiresApi(api = 21)
    public final Drawable getDrawableForDensity(int i4, int i5, @Nullable Resources.Theme theme) {
        com.kwad.sdk.core.e.c.d("KSDY/KSResource", "getDrawable id: #0x" + Integer.toHexString(i4));
        if (eu(i4)) {
            return this.aUk.getDrawableForDensity(i4, i5, theme);
        }
        return super.getDrawableForDensity(i4, i5, theme);
    }

    @Override // android.content.res.Resources
    @NonNull
    public final String getQuantityString(int i4, int i5, Object... objArr) {
        com.kwad.sdk.core.e.c.d("KSDY/KSResource", "getQuantityString id: #0x" + Integer.toHexString(i4));
        if (eu(i4)) {
            return this.aUk.getQuantityString(i4, i5, objArr);
        }
        return super.getQuantityString(i4, i5, objArr);
    }

    @Override // android.content.res.Resources
    @NonNull
    public final String getString(int i4, Object... objArr) {
        com.kwad.sdk.core.e.c.d("KSDY/KSResource", "getString id: #0x" + Integer.toHexString(i4));
        if (eu(i4)) {
            return this.aUk.getString(i4, objArr);
        }
        return super.getString(i4, objArr);
    }

    @Override // android.content.res.Resources
    public final CharSequence getText(int i4, CharSequence charSequence) {
        com.kwad.sdk.core.e.c.d("KSDY/KSResource", "getText id: #0x" + Integer.toHexString(i4));
        if (eu(i4)) {
            return this.aUk.getText(i4, charSequence);
        }
        return super.getText(i4, charSequence);
    }

    @Override // android.content.res.Resources
    public final void getValue(String str, TypedValue typedValue, boolean z4) {
        int identifier = getIdentifier(str, TypedValues.Custom.S_STRING, null);
        com.kwad.sdk.core.e.c.d("KSDY/KSResource", "getValue id: 0x#" + Integer.toHexString(identifier));
        if (eu(identifier)) {
            this.aUk.getValue(str, typedValue, z4);
        } else {
            super.getValue(str, typedValue, z4);
        }
    }

    @Override // android.content.res.Resources
    @NonNull
    public final InputStream openRawResource(int i4, TypedValue typedValue) {
        com.kwad.sdk.core.e.c.d("KSDY/KSResource", "openRawResource id: 0x#" + Integer.toHexString(i4));
        if (eu(i4)) {
            return this.aUk.openRawResource(i4, typedValue);
        }
        return super.openRawResource(i4, typedValue);
    }

    @Override // android.content.res.Resources
    @NonNull
    public final ColorStateList getColorStateList(int i4) {
        try {
            com.kwad.sdk.core.e.c.d("KSDY/KSResource", "getColorStateList: 0x#" + Integer.toHexString(i4));
        } catch (Exception e5) {
            com.kwad.sdk.core.e.c.e("KSDY/KSResource", Log.getStackTraceString(e5));
        }
        if (eu(i4)) {
            return this.aUk.getColorStateList(i4);
        }
        return super.getColorStateList(i4);
    }
}
