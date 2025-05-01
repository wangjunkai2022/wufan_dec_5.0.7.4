package com.kwad.components.core.webview.tachikoma.d;

import android.text.TextUtils;
import com.kwad.sdk.utils.az;
import com.kwad.sdk.utils.bo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public final class a {
    private List<Integer> abC;
    private final List<Integer> abD;

    /* renamed from: com.kwad.components.core.webview.tachikoma.d.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    static class C0485a {
        private static final a abH = new a((byte) 0);
    }

    /* synthetic */ a(byte b5) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aV(int i4) {
        if (this.abD.contains(Integer.valueOf(i4))) {
            this.abC.add(Integer.valueOf(i4));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aY(String str) {
        int i4;
        try {
            i4 = new JSONObject(str).optInt("elementType");
        } catch (Exception unused) {
            i4 = Integer.MAX_VALUE;
        }
        if (this.abD.contains(Integer.valueOf(i4))) {
            this.abC.add(Integer.valueOf(i4));
        }
    }

    public static a tC() {
        return C0485a.abH;
    }

    public final void aW(final int i4) {
        bo.runOnUiThread(new az() { // from class: com.kwad.components.core.webview.tachikoma.d.a.1
            @Override // com.kwad.sdk.utils.az
            public final void doTask() {
                a.this.aV(i4);
            }
        });
    }

    public final void aZ(final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        bo.runOnUiThread(new az() { // from class: com.kwad.components.core.webview.tachikoma.d.a.2
            @Override // com.kwad.sdk.utils.az
            public final void doTask() {
                a.this.aY(str);
            }
        });
    }

    public final List<Integer> tD() {
        return this.abC;
    }

    public final void tE() {
        this.abC.clear();
    }

    private a() {
        this.abC = new ArrayList();
        this.abD = Arrays.asList(123, 184, 185, 190, 199, 200);
    }
}
