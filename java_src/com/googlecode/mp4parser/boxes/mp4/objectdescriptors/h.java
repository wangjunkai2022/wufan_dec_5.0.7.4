package com.googlecode.mp4parser.boxes.mp4.objectdescriptors;

import com.android.dx.io.Opcodes;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.logging.Logger;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
/* compiled from: ExtensionDescriptor.java */
@Descriptor(tags = {19, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123, 124, 125, 126, 127, 128, 129, 130, 131, 132, 133, 134, 135, 136, 137, 138, 139, 140, 141, 142, 143, 144, 145, 146, 147, 148, 149, 150, 151, 152, 153, 154, 155, 156, 157, 158, 159, 160, 161, 162, 163, 164, 165, 166, 167, 168, 169, 170, 171, 172, 173, 174, 175, 176, 177, 178, 179, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, Opcodes.OR_INT_LIT16, 215, 216, 217, 218, Opcodes.DIV_INT_LIT8, 220, Opcodes.AND_INT_LIT8, Opcodes.OR_INT_LIT8, Opcodes.XOR_INT_LIT8, Opcodes.SHL_INT_LIT8, 225, Opcodes.USHR_INT_LIT8, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, IjkMediaMeta.FF_PROFILE_H264_HIGH_444_PREDICTIVE, 245, com.papa.controller.core.hardware.a.f58131m, 247, 248, 249, 250, Opcodes.INVOKE_POLYMORPHIC_RANGE, Opcodes.INVOKE_CUSTOM, Opcodes.INVOKE_CUSTOM_RANGE})
/* loaded from: classes3.dex */
public class h extends b {

    /* renamed from: f  reason: collision with root package name */
    private static Logger f13962f = Logger.getLogger(h.class.getName());

    /* renamed from: e  reason: collision with root package name */
    byte[] f13963e;

    static int[] g() {
        int[] iArr = new int[148];
        for (int i4 = 106; i4 < 254; i4++) {
            int i5 = i4 - 106;
            f13962f.finest("pos:" + i5);
            iArr[i5] = i4;
        }
        return iArr;
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.objectdescriptors.b
    public void f(ByteBuffer byteBuffer) throws IOException {
        if (a() > 0) {
            byte[] bArr = new byte[this.f13927b];
            this.f13963e = bArr;
            byteBuffer.get(bArr);
        }
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.objectdescriptors.b
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ExtensionDescriptor");
        sb.append("{bytes=");
        byte[] bArr = this.f13963e;
        sb.append(bArr == null ? "null" : com.coremedia.iso.e.b(bArr));
        sb.append('}');
        return sb.toString();
    }
}
