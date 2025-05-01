package androidx.constraintlayout.core.parser;

import java.util.Iterator;
/* loaded from: classes.dex */
public class CLArray extends CLContainer {
    public CLArray(char[] cArr) {
        super(cArr);
    }

    public static CLElement allocate(char[] cArr) {
        return new CLArray(cArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.core.parser.CLElement
    public String toFormattedJSON(int i4, int i5) {
        StringBuilder sb = new StringBuilder();
        String json = toJSON();
        if (i5 <= 0 && json.length() + i4 < CLElement.MAX_LINE) {
            sb.append(json);
        } else {
            sb.append("[\n");
            Iterator<CLElement> it2 = this.mElements.iterator();
            boolean z4 = true;
            while (it2.hasNext()) {
                CLElement next = it2.next();
                if (z4) {
                    z4 = false;
                } else {
                    sb.append(",\n");
                }
                addIndent(sb, CLElement.BASE_INDENT + i4);
                sb.append(next.toFormattedJSON(CLElement.BASE_INDENT + i4, i5 - 1));
            }
            sb.append("\n");
            addIndent(sb, i4);
            sb.append("]");
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.core.parser.CLElement
    public String toJSON() {
        StringBuilder sb = new StringBuilder(getDebugName() + "[");
        boolean z4 = true;
        for (int i4 = 0; i4 < this.mElements.size(); i4++) {
            if (z4) {
                z4 = false;
            } else {
                sb.append(", ");
            }
            sb.append(this.mElements.get(i4).toJSON());
        }
        return ((Object) sb) + "]";
    }
}
