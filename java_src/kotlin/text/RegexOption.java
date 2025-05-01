package kotlin.text;

import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: Regex.kt */
/* loaded from: classes6.dex */
public enum RegexOption implements FlagEnum {
    IGNORE_CASE(2, 0, 2, null),
    MULTILINE(8, 0, 2, null),
    LITERAL(16, 0, 2, null),
    UNIX_LINES(1, 0, 2, null),
    COMMENTS(4, 0, 2, null),
    DOT_MATCHES_ALL(32, 0, 2, null),
    CANON_EQ(128, 0, 2, null);
    
    private final int mask;
    private final int value;

    RegexOption(int i4, int i5) {
        this.value = i4;
        this.mask = i5;
    }

    @Override // kotlin.text.FlagEnum
    public int getMask() {
        return this.mask;
    }

    @Override // kotlin.text.FlagEnum
    public int getValue() {
        return this.value;
    }

    /* synthetic */ RegexOption(int i4, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(i4, (i6 & 2) != 0 ? i4 : i5);
    }
}
