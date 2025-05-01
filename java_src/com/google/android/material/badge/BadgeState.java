package com.google.android.material.badge;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.PluralsRes;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.annotation.StyleableRes;
import androidx.annotation.XmlRes;
import com.google.android.material.R;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.resources.TextAppearance;
import java.util.Locale;
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class BadgeState {
    private static final String BADGE_RESOURCE_TAG = "badge";
    private static final int DEFAULT_MAX_BADGE_CHARACTER_COUNT = 4;
    final float badgeRadius;
    final float badgeWidePadding;
    final float badgeWithTextRadius;
    private final State currentState;
    private final State overridingState;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BadgeState(Context context, @XmlRes int i4, @AttrRes int i5, @StyleRes int i6, @Nullable State state) {
        CharSequence charSequence;
        int i7;
        int i8;
        int i9;
        int intValue;
        int intValue2;
        int intValue3;
        int intValue4;
        int intValue5;
        int intValue6;
        Locale locale;
        State state2 = new State();
        this.currentState = state2;
        state = state == null ? new State() : state;
        if (i4 != 0) {
            state.badgeResId = i4;
        }
        TypedArray generateTypedArray = generateTypedArray(context, state.badgeResId, i5, i6);
        Resources resources = context.getResources();
        this.badgeRadius = generateTypedArray.getDimensionPixelSize(R.styleable.Badge_badgeRadius, resources.getDimensionPixelSize(R.dimen.mtrl_badge_radius));
        this.badgeWidePadding = generateTypedArray.getDimensionPixelSize(R.styleable.Badge_badgeWidePadding, resources.getDimensionPixelSize(R.dimen.mtrl_badge_long_text_horizontal_padding));
        this.badgeWithTextRadius = generateTypedArray.getDimensionPixelSize(R.styleable.Badge_badgeWithTextRadius, resources.getDimensionPixelSize(R.dimen.mtrl_badge_with_text_radius));
        state2.alpha = state.alpha == -2 ? 255 : state.alpha;
        if (state.contentDescriptionNumberless != null) {
            charSequence = state.contentDescriptionNumberless;
        } else {
            charSequence = context.getString(R.string.mtrl_badge_numberless_content_description);
        }
        state2.contentDescriptionNumberless = charSequence;
        if (state.contentDescriptionQuantityStrings != 0) {
            i7 = state.contentDescriptionQuantityStrings;
        } else {
            i7 = R.plurals.mtrl_badge_content_description;
        }
        state2.contentDescriptionQuantityStrings = i7;
        if (state.contentDescriptionExceedsMaxBadgeNumberRes != 0) {
            i8 = state.contentDescriptionExceedsMaxBadgeNumberRes;
        } else {
            i8 = R.string.mtrl_exceed_max_badge_number_content_description;
        }
        state2.contentDescriptionExceedsMaxBadgeNumberRes = i8;
        state2.isVisible = Boolean.valueOf(state.isVisible == null || state.isVisible.booleanValue());
        if (state.maxCharacterCount != -2) {
            i9 = state.maxCharacterCount;
        } else {
            i9 = generateTypedArray.getInt(R.styleable.Badge_maxCharacterCount, 4);
        }
        state2.maxCharacterCount = i9;
        if (state.number != -2) {
            state2.number = state.number;
        } else {
            int i10 = R.styleable.Badge_number;
            if (generateTypedArray.hasValue(i10)) {
                state2.number = generateTypedArray.getInt(i10, 0);
            } else {
                state2.number = -1;
            }
        }
        if (state.backgroundColor != null) {
            intValue = state.backgroundColor.intValue();
        } else {
            intValue = readColorFromAttributes(context, generateTypedArray, R.styleable.Badge_backgroundColor);
        }
        state2.backgroundColor = Integer.valueOf(intValue);
        if (state.badgeTextColor != null) {
            state2.badgeTextColor = state.badgeTextColor;
        } else {
            int i11 = R.styleable.Badge_badgeTextColor;
            if (generateTypedArray.hasValue(i11)) {
                state2.badgeTextColor = Integer.valueOf(readColorFromAttributes(context, generateTypedArray, i11));
            } else {
                state2.badgeTextColor = Integer.valueOf(new TextAppearance(context, R.style.TextAppearance_MaterialComponents_Badge).getTextColor().getDefaultColor());
            }
        }
        if (state.badgeGravity != null) {
            intValue2 = state.badgeGravity.intValue();
        } else {
            intValue2 = generateTypedArray.getInt(R.styleable.Badge_badgeGravity, 8388661);
        }
        state2.badgeGravity = Integer.valueOf(intValue2);
        if (state.horizontalOffsetWithoutText != null) {
            intValue3 = state.horizontalOffsetWithoutText.intValue();
        } else {
            intValue3 = generateTypedArray.getDimensionPixelOffset(R.styleable.Badge_horizontalOffset, 0);
        }
        state2.horizontalOffsetWithoutText = Integer.valueOf(intValue3);
        if (state.horizontalOffsetWithoutText != null) {
            intValue4 = state.verticalOffsetWithoutText.intValue();
        } else {
            intValue4 = generateTypedArray.getDimensionPixelOffset(R.styleable.Badge_verticalOffset, 0);
        }
        state2.verticalOffsetWithoutText = Integer.valueOf(intValue4);
        if (state.horizontalOffsetWithText != null) {
            intValue5 = state.horizontalOffsetWithText.intValue();
        } else {
            intValue5 = generateTypedArray.getDimensionPixelOffset(R.styleable.Badge_horizontalOffsetWithText, state2.horizontalOffsetWithoutText.intValue());
        }
        state2.horizontalOffsetWithText = Integer.valueOf(intValue5);
        if (state.verticalOffsetWithText != null) {
            intValue6 = state.verticalOffsetWithText.intValue();
        } else {
            intValue6 = generateTypedArray.getDimensionPixelOffset(R.styleable.Badge_verticalOffsetWithText, state2.verticalOffsetWithoutText.intValue());
        }
        state2.verticalOffsetWithText = Integer.valueOf(intValue6);
        state2.additionalHorizontalOffset = Integer.valueOf(state.additionalHorizontalOffset == null ? 0 : state.additionalHorizontalOffset.intValue());
        state2.additionalVerticalOffset = Integer.valueOf(state.additionalVerticalOffset != null ? state.additionalVerticalOffset.intValue() : 0);
        generateTypedArray.recycle();
        if (state.numberLocale != null) {
            state2.numberLocale = state.numberLocale;
        } else {
            if (Build.VERSION.SDK_INT >= 24) {
                locale = Locale.getDefault(Locale.Category.FORMAT);
            } else {
                locale = Locale.getDefault();
            }
            state2.numberLocale = locale;
        }
        this.overridingState = state;
    }

    private TypedArray generateTypedArray(Context context, @XmlRes int i4, @AttrRes int i5, @StyleRes int i6) {
        AttributeSet attributeSet;
        int i7;
        if (i4 != 0) {
            AttributeSet parseDrawableXml = DrawableUtils.parseDrawableXml(context, i4, BADGE_RESOURCE_TAG);
            i7 = parseDrawableXml.getStyleAttribute();
            attributeSet = parseDrawableXml;
        } else {
            attributeSet = null;
            i7 = 0;
        }
        return ThemeEnforcement.obtainStyledAttributes(context, attributeSet, R.styleable.Badge, i5, i7 == 0 ? i6 : i7, new int[0]);
    }

    private static int readColorFromAttributes(Context context, @NonNull TypedArray typedArray, @StyleableRes int i4) {
        return MaterialResources.getColorStateList(context, typedArray, i4).getDefaultColor();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void clearNumber() {
        setNumber(-1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Dimension(unit = 1)
    public int getAdditionalHorizontalOffset() {
        return this.currentState.additionalHorizontalOffset.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Dimension(unit = 1)
    public int getAdditionalVerticalOffset() {
        return this.currentState.additionalVerticalOffset.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getAlpha() {
        return this.currentState.alpha;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ColorInt
    public int getBackgroundColor() {
        return this.currentState.backgroundColor.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getBadgeGravity() {
        return this.currentState.badgeGravity.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ColorInt
    public int getBadgeTextColor() {
        return this.currentState.badgeTextColor.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @StringRes
    public int getContentDescriptionExceedsMaxBadgeNumberStringResource() {
        return this.currentState.contentDescriptionExceedsMaxBadgeNumberRes;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CharSequence getContentDescriptionNumberless() {
        return this.currentState.contentDescriptionNumberless;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @PluralsRes
    public int getContentDescriptionQuantityStrings() {
        return this.currentState.contentDescriptionQuantityStrings;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Dimension(unit = 1)
    public int getHorizontalOffsetWithText() {
        return this.currentState.horizontalOffsetWithText.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Dimension(unit = 1)
    public int getHorizontalOffsetWithoutText() {
        return this.currentState.horizontalOffsetWithoutText.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getMaxCharacterCount() {
        return this.currentState.maxCharacterCount;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getNumber() {
        return this.currentState.number;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Locale getNumberLocale() {
        return this.currentState.numberLocale;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public State getOverridingState() {
        return this.overridingState;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Dimension(unit = 1)
    public int getVerticalOffsetWithText() {
        return this.currentState.verticalOffsetWithText.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Dimension(unit = 1)
    public int getVerticalOffsetWithoutText() {
        return this.currentState.verticalOffsetWithoutText.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean hasNumber() {
        return this.currentState.number != -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isVisible() {
        return this.currentState.isVisible.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setAdditionalHorizontalOffset(@Dimension(unit = 1) int i4) {
        this.overridingState.additionalHorizontalOffset = Integer.valueOf(i4);
        this.currentState.additionalHorizontalOffset = Integer.valueOf(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setAdditionalVerticalOffset(@Dimension(unit = 1) int i4) {
        this.overridingState.additionalVerticalOffset = Integer.valueOf(i4);
        this.currentState.additionalVerticalOffset = Integer.valueOf(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setAlpha(int i4) {
        this.overridingState.alpha = i4;
        this.currentState.alpha = i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setBackgroundColor(@ColorInt int i4) {
        this.overridingState.backgroundColor = Integer.valueOf(i4);
        this.currentState.backgroundColor = Integer.valueOf(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setBadgeGravity(int i4) {
        this.overridingState.badgeGravity = Integer.valueOf(i4);
        this.currentState.badgeGravity = Integer.valueOf(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setBadgeTextColor(@ColorInt int i4) {
        this.overridingState.badgeTextColor = Integer.valueOf(i4);
        this.currentState.badgeTextColor = Integer.valueOf(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setContentDescriptionExceedsMaxBadgeNumberStringResource(@StringRes int i4) {
        this.overridingState.contentDescriptionExceedsMaxBadgeNumberRes = i4;
        this.currentState.contentDescriptionExceedsMaxBadgeNumberRes = i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setContentDescriptionNumberless(CharSequence charSequence) {
        this.overridingState.contentDescriptionNumberless = charSequence;
        this.currentState.contentDescriptionNumberless = charSequence;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setContentDescriptionQuantityStringsResource(@PluralsRes int i4) {
        this.overridingState.contentDescriptionQuantityStrings = i4;
        this.currentState.contentDescriptionQuantityStrings = i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setHorizontalOffsetWithText(@Dimension(unit = 1) int i4) {
        this.overridingState.horizontalOffsetWithText = Integer.valueOf(i4);
        this.currentState.horizontalOffsetWithText = Integer.valueOf(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setHorizontalOffsetWithoutText(@Dimension(unit = 1) int i4) {
        this.overridingState.horizontalOffsetWithoutText = Integer.valueOf(i4);
        this.currentState.horizontalOffsetWithoutText = Integer.valueOf(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setMaxCharacterCount(int i4) {
        this.overridingState.maxCharacterCount = i4;
        this.currentState.maxCharacterCount = i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setNumber(int i4) {
        this.overridingState.number = i4;
        this.currentState.number = i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setNumberLocale(Locale locale) {
        this.overridingState.numberLocale = locale;
        this.currentState.numberLocale = locale;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setVerticalOffsetWithText(@Dimension(unit = 1) int i4) {
        this.overridingState.verticalOffsetWithText = Integer.valueOf(i4);
        this.currentState.verticalOffsetWithText = Integer.valueOf(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setVerticalOffsetWithoutText(@Dimension(unit = 1) int i4) {
        this.overridingState.verticalOffsetWithoutText = Integer.valueOf(i4);
        this.currentState.verticalOffsetWithoutText = Integer.valueOf(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setVisible(boolean z4) {
        this.overridingState.isVisible = Boolean.valueOf(z4);
        this.currentState.isVisible = Boolean.valueOf(z4);
    }

    /* loaded from: classes3.dex */
    public static final class State implements Parcelable {
        private static final int BADGE_NUMBER_NONE = -1;
        public static final Parcelable.Creator<State> CREATOR = new Parcelable.Creator<State>() { // from class: com.google.android.material.badge.BadgeState.State.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NonNull
            public State createFromParcel(@NonNull Parcel parcel) {
                return new State(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NonNull
            public State[] newArray(int i4) {
                return new State[i4];
            }
        };
        private static final int NOT_SET = -2;
        @Dimension(unit = 1)
        private Integer additionalHorizontalOffset;
        @Dimension(unit = 1)
        private Integer additionalVerticalOffset;
        private int alpha;
        @ColorInt
        private Integer backgroundColor;
        private Integer badgeGravity;
        @XmlRes
        private int badgeResId;
        @ColorInt
        private Integer badgeTextColor;
        @StringRes
        private int contentDescriptionExceedsMaxBadgeNumberRes;
        @Nullable
        private CharSequence contentDescriptionNumberless;
        @PluralsRes
        private int contentDescriptionQuantityStrings;
        @Dimension(unit = 1)
        private Integer horizontalOffsetWithText;
        @Dimension(unit = 1)
        private Integer horizontalOffsetWithoutText;
        private Boolean isVisible;
        private int maxCharacterCount;
        private int number;
        private Locale numberLocale;
        @Dimension(unit = 1)
        private Integer verticalOffsetWithText;
        @Dimension(unit = 1)
        private Integer verticalOffsetWithoutText;

        public State() {
            this.alpha = 255;
            this.number = -2;
            this.maxCharacterCount = -2;
            this.isVisible = Boolean.TRUE;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i4) {
            parcel.writeInt(this.badgeResId);
            parcel.writeSerializable(this.backgroundColor);
            parcel.writeSerializable(this.badgeTextColor);
            parcel.writeInt(this.alpha);
            parcel.writeInt(this.number);
            parcel.writeInt(this.maxCharacterCount);
            CharSequence charSequence = this.contentDescriptionNumberless;
            parcel.writeString(charSequence == null ? null : charSequence.toString());
            parcel.writeInt(this.contentDescriptionQuantityStrings);
            parcel.writeSerializable(this.badgeGravity);
            parcel.writeSerializable(this.horizontalOffsetWithoutText);
            parcel.writeSerializable(this.verticalOffsetWithoutText);
            parcel.writeSerializable(this.horizontalOffsetWithText);
            parcel.writeSerializable(this.verticalOffsetWithText);
            parcel.writeSerializable(this.additionalHorizontalOffset);
            parcel.writeSerializable(this.additionalVerticalOffset);
            parcel.writeSerializable(this.isVisible);
            parcel.writeSerializable(this.numberLocale);
        }

        State(@NonNull Parcel parcel) {
            this.alpha = 255;
            this.number = -2;
            this.maxCharacterCount = -2;
            this.isVisible = Boolean.TRUE;
            this.badgeResId = parcel.readInt();
            this.backgroundColor = (Integer) parcel.readSerializable();
            this.badgeTextColor = (Integer) parcel.readSerializable();
            this.alpha = parcel.readInt();
            this.number = parcel.readInt();
            this.maxCharacterCount = parcel.readInt();
            this.contentDescriptionNumberless = parcel.readString();
            this.contentDescriptionQuantityStrings = parcel.readInt();
            this.badgeGravity = (Integer) parcel.readSerializable();
            this.horizontalOffsetWithoutText = (Integer) parcel.readSerializable();
            this.verticalOffsetWithoutText = (Integer) parcel.readSerializable();
            this.horizontalOffsetWithText = (Integer) parcel.readSerializable();
            this.verticalOffsetWithText = (Integer) parcel.readSerializable();
            this.additionalHorizontalOffset = (Integer) parcel.readSerializable();
            this.additionalVerticalOffset = (Integer) parcel.readSerializable();
            this.isVisible = (Boolean) parcel.readSerializable();
            this.numberLocale = (Locale) parcel.readSerializable();
        }
    }
}
