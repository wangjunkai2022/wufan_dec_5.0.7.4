package cn.sharesdk.sina.weibo.sdk;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.StateSet;
import cn.sharesdk.framework.ShareSDKCallback;
import com.mob.tools.utils.DH;
import com.mob.tools.utils.Data;
/* compiled from: Utils.java */
/* loaded from: classes2.dex */
public class a {
    public static ColorStateList a(int i4, int i5) {
        return new ColorStateList(new int[][]{new int[]{16842919}, new int[]{16842913}, new int[]{16842908}, StateSet.WILD_CARD}, new int[]{i5, i5, i5, i4});
    }

    public static void a(Context context, String str, final ShareSDKCallback<String> shareSDKCallback) {
        DH.requester(context).getPInfoForce(true, str, 64).request(new DH.DHResponder() { // from class: cn.sharesdk.sina.weibo.sdk.a.1
            @Override // com.mob.tools.utils.DH.DHResponder
            public void onResponse(DH.DHResponse dHResponse) {
                for (int i4 = 0; i4 < dHResponse.getPInfoForce(new int[0]).signatures.length; i4++) {
                    try {
                        byte[] byteArray = dHResponse.getPInfoForce(new int[0]).signatures[i4].toByteArray();
                        if (byteArray != null) {
                            String MD5 = Data.MD5(byteArray);
                            ShareSDKCallback shareSDKCallback2 = ShareSDKCallback.this;
                            if (shareSDKCallback2 != null) {
                                shareSDKCallback2.onCallback(MD5);
                            }
                        } else {
                            ShareSDKCallback shareSDKCallback3 = ShareSDKCallback.this;
                            if (shareSDKCallback3 != null) {
                                shareSDKCallback3.onCallback(null);
                            }
                        }
                    } catch (Throwable unused) {
                        ShareSDKCallback shareSDKCallback4 = ShareSDKCallback.this;
                        if (shareSDKCallback4 != null) {
                            shareSDKCallback4.onCallback(null);
                            return;
                        }
                        return;
                    }
                }
            }
        });
    }

    public static byte[] a(byte[] bArr) {
        boolean z4;
        char[] charArray = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/=".toCharArray();
        byte[] bArr2 = new byte[((bArr.length + 2) / 3) * 4];
        int i4 = 0;
        int i5 = 0;
        while (i4 < bArr.length) {
            int i6 = (bArr[i4] & 255) << 8;
            int i7 = i4 + 1;
            boolean z5 = true;
            if (i7 < bArr.length) {
                i6 |= bArr[i7] & 255;
                z4 = true;
            } else {
                z4 = false;
            }
            int i8 = i6 << 8;
            int i9 = i4 + 2;
            if (i9 < bArr.length) {
                i8 |= bArr[i9] & 255;
            } else {
                z5 = false;
            }
            int i10 = 64;
            bArr2[i5 + 3] = (byte) charArray[z5 ? i8 & 63 : 64];
            int i11 = i8 >> 6;
            int i12 = i5 + 2;
            if (z4) {
                i10 = i11 & 63;
            }
            bArr2[i12] = (byte) charArray[i10];
            int i13 = i11 >> 6;
            bArr2[i5 + 1] = (byte) charArray[i13 & 63];
            bArr2[i5 + 0] = (byte) charArray[(i13 >> 6) & 63];
            i4 += 3;
            i5 += 4;
        }
        return bArr2;
    }
}
