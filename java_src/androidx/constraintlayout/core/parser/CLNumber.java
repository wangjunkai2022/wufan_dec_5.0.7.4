package androidx.constraintlayout.core.parser;
/* loaded from: classes.dex */
public class CLNumber extends CLElement {
    float value;

    public CLNumber(char[] cArr) {
        super(cArr);
        this.value = Float.NaN;
    }

    public static CLElement allocate(char[] cArr) {
        return new CLNumber(cArr);
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public float getFloat() {
        if (Float.isNaN(this.value)) {
            this.value = Float.parseFloat(content());
        }
        return this.value;
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public int getInt() {
        if (Float.isNaN(this.value)) {
            this.value = Integer.parseInt(content());
        }
        return (int) this.value;
    }

    public boolean isInt() {
        float f5 = getFloat();
        return ((float) ((int) f5)) == f5;
    }

    public void putValue(float f5) {
        this.value = f5;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.core.parser.CLElement
    public String toFormattedJSON(int i4, int i5) {
        StringBuilder sb = new StringBuilder();
        addIndent(sb, i4);
        float f5 = getFloat();
        int i6 = (int) f5;
        if (i6 == f5) {
            sb.append(i6);
        } else {
            sb.append(f5);
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.core.parser.CLElement
    public String toJSON() {
        float f5 = getFloat();
        int i4 = (int) f5;
        if (i4 == f5) {
            return "" + i4;
        }
        return "" + f5;
    }

    public CLNumber(float f5) {
        super(null);
        this.value = Float.NaN;
        this.value = f5;
    }
}
