package com.vincent.videocompressor;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaExtractor;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import tv.danmaku.ijk.media.player.misc.IMediaFormat;
@SuppressLint({"NewApi"})
/* loaded from: classes6.dex */
public class VideoController {

    /* renamed from: c  reason: collision with root package name */
    static final int f64736c = 1;

    /* renamed from: d  reason: collision with root package name */
    static final int f64737d = 2;

    /* renamed from: e  reason: collision with root package name */
    static final int f64738e = 3;

    /* renamed from: f  reason: collision with root package name */
    public static File f64739f = null;

    /* renamed from: g  reason: collision with root package name */
    public static final String f64740g = "video/avc";

    /* renamed from: h  reason: collision with root package name */
    private static final int f64741h = 0;

    /* renamed from: i  reason: collision with root package name */
    private static final int f64742i = 1;

    /* renamed from: j  reason: collision with root package name */
    private static final int f64743j = 2;

    /* renamed from: k  reason: collision with root package name */
    private static final int f64744k = 3;

    /* renamed from: l  reason: collision with root package name */
    private static final int f64745l = 4;

    /* renamed from: m  reason: collision with root package name */
    private static final int f64746m = 5;

    /* renamed from: n  reason: collision with root package name */
    private static volatile VideoController f64747n;

    /* renamed from: a  reason: collision with root package name */
    public String f64748a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f64749b = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public interface b {
        void onProgress(float f5);
    }

    /* loaded from: classes6.dex */
    public static class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        private String f64750b;

        /* renamed from: c  reason: collision with root package name */
        private String f64751c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes6.dex */
        public class a implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f64752b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ String f64753c;

            a(String str, String str2) {
                this.f64752b = str;
                this.f64753c = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    Thread thread = new Thread(new c(this.f64752b, this.f64753c), "VideoConvertRunnable");
                    thread.start();
                    thread.join();
                } catch (Exception e5) {
                    e5.getMessage();
                }
            }
        }

        public static void a(String str, String str2) {
            new Thread(new a(str, str2)).start();
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoController.d().a(this.f64750b, this.f64751c, 0, null);
        }

        private c(String str, String str2) {
            this.f64750b = str;
            this.f64751c = str2;
        }
    }

    public static void b(File file, File file2) throws IOException {
        FileChannel channel = new FileInputStream(file).getChannel();
        FileChannel channel2 = new FileOutputStream(file2).getChannel();
        try {
            channel.transferTo(1L, channel.size(), channel2);
            channel.close();
            if (channel2 != null) {
                channel2.close();
            }
        } catch (Throwable th) {
            if (channel != null) {
                channel.close();
            }
            if (channel2 != null) {
                channel2.close();
            }
            throw th;
        }
    }

    private void c(boolean z4, boolean z5) {
        if (this.f64749b) {
            this.f64749b = false;
        }
    }

    public static native int convertVideoFrame(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i4, int i5, int i6, int i7, int i8);

    public static VideoController d() {
        VideoController videoController = f64747n;
        if (videoController == null) {
            synchronized (VideoController.class) {
                videoController = f64747n;
                if (videoController == null) {
                    videoController = new VideoController();
                    f64747n = videoController;
                }
            }
        }
        return videoController;
    }

    private static boolean e(int i4) {
        if (i4 == 39 || i4 == 2130706688) {
            return true;
        }
        switch (i4) {
            case 19:
            case 20:
            case 21:
                return true;
            default:
                return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x007f, code lost:
        if (r8 == (-1)) goto L13;
     */
    @android.annotation.TargetApi(16)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private long f(android.media.MediaExtractor r21, com.vincent.videocompressor.b r22, android.media.MediaCodec.BufferInfo r23, long r24, long r26, java.io.File r28, boolean r29) throws java.lang.Exception {
        /*
            r20 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = r24
            r5 = r20
            r6 = r29
            int r7 = r5.j(r0, r6)
            if (r7 < 0) goto L8d
            r0.selectTrack(r7)
            android.media.MediaFormat r10 = r0.getTrackFormat(r7)
            int r11 = r1.a(r10, r6)
            java.lang.String r12 = "max-input-size"
            int r10 = r10.getInteger(r12)
            r12 = 0
            r14 = 0
            int r15 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r15 <= 0) goto L2e
            r0.seekTo(r3, r14)
            goto L31
        L2e:
            r0.seekTo(r12, r14)
        L31:
            java.nio.ByteBuffer r10 = java.nio.ByteBuffer.allocateDirect(r10)
            r15 = 0
            r16 = -1
        L38:
            if (r15 != 0) goto L89
            int r8 = r21.getSampleTrackIndex()
            if (r8 != r7) goto L7d
            int r8 = r0.readSampleData(r10, r14)
            r2.size = r8
            if (r8 >= 0) goto L4c
            r2.size = r14
            r9 = r10
            goto L81
        L4c:
            r28 = r10
            long r9 = r21.getSampleTime()
            r2.presentationTimeUs = r9
            int r8 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r8 <= 0) goto L60
            r18 = -1
            int r8 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r8 != 0) goto L60
            r16 = r9
        L60:
            int r8 = (r26 > r12 ? 1 : (r26 == r12 ? 0 : -1))
            if (r8 < 0) goto L6c
            int r8 = (r9 > r26 ? 1 : (r9 == r26 ? 0 : -1))
            if (r8 >= 0) goto L69
            goto L6c
        L69:
            r9 = r28
            goto L81
        L6c:
            r2.offset = r14
            int r8 = r21.getSampleFlags()
            r2.flags = r8
            r9 = r28
            r1.q(r11, r9, r2, r6)
            r21.advance()
            goto L83
        L7d:
            r9 = r10
            r10 = -1
            if (r8 != r10) goto L83
        L81:
            r8 = 1
            goto L84
        L83:
            r8 = 0
        L84:
            if (r8 == 0) goto L87
            r15 = 1
        L87:
            r10 = r9
            goto L38
        L89:
            r0.unselectTrack(r7)
            return r16
        L8d:
            r0 = -1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vincent.videocompressor.VideoController.f(android.media.MediaExtractor, com.vincent.videocompressor.b, android.media.MediaCodec$BufferInfo, long, long, java.io.File, boolean):long");
    }

    public static MediaCodecInfo h(String str) {
        int codecCount = MediaCodecList.getCodecCount();
        MediaCodecInfo mediaCodecInfo = null;
        for (int i4 = 0; i4 < codecCount; i4++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i4);
            if (codecInfoAt.isEncoder()) {
                for (String str2 : codecInfoAt.getSupportedTypes()) {
                    if (str2.equalsIgnoreCase(str)) {
                        if (!codecInfoAt.getName().equals("OMX.SEC.avc.enc") || codecInfoAt.getName().equals("OMX.SEC.AVC.Encoder")) {
                            return codecInfoAt;
                        }
                        mediaCodecInfo = codecInfoAt;
                    }
                }
                continue;
            }
        }
        return mediaCodecInfo;
    }

    @SuppressLint({"NewApi"})
    public static int i(MediaCodecInfo mediaCodecInfo, String str) {
        int i4;
        MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
        int i5 = 0;
        int i6 = 0;
        while (true) {
            int[] iArr = capabilitiesForType.colorFormats;
            if (i5 >= iArr.length) {
                return i6;
            }
            i4 = iArr[i5];
            if (e(i4)) {
                if (!mediaCodecInfo.getName().equals("OMX.SEC.AVC.Encoder") || i4 != 19) {
                    break;
                }
                i6 = i4;
            }
            i5++;
        }
        return i4;
    }

    @TargetApi(16)
    private int j(MediaExtractor mediaExtractor, boolean z4) {
        int trackCount = mediaExtractor.getTrackCount();
        for (int i4 = 0; i4 < trackCount; i4++) {
            String string = mediaExtractor.getTrackFormat(i4).getString(IMediaFormat.KEY_MIME);
            if (z4) {
                if (string.startsWith("audio/")) {
                    return i4;
                }
            } else if (string.startsWith("video/")) {
                return i4;
            }
        }
        return -5;
    }

    private void k(String str, String str2) {
        c.a(str, str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:195:0x03d0, code lost:
        r42 = r13;
        r7 = r43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x0663, code lost:
        r10 = r44;
        r44 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x067e, code lost:
        throw new java.lang.RuntimeException("unexpected result from decoder.dequeueOutputBuffer: " + r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:166:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x04fc  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x0765 A[Catch: all -> 0x077e, Exception -> 0x0780, TryCatch #46 {Exception -> 0x0780, all -> 0x077e, blocks: (B:417:0x0760, B:419:0x0765, B:421:0x076a, B:423:0x076f, B:425:0x0777), top: B:572:0x0760 }] */
    /* JADX WARN: Removed duplicated region for block: B:421:0x076a A[Catch: all -> 0x077e, Exception -> 0x0780, TryCatch #46 {Exception -> 0x0780, all -> 0x077e, blocks: (B:417:0x0760, B:419:0x0765, B:421:0x076a, B:423:0x076f, B:425:0x0777), top: B:572:0x0760 }] */
    /* JADX WARN: Removed duplicated region for block: B:423:0x076f A[Catch: all -> 0x077e, Exception -> 0x0780, TryCatch #46 {Exception -> 0x0780, all -> 0x077e, blocks: (B:417:0x0760, B:419:0x0765, B:421:0x076a, B:423:0x076f, B:425:0x0777), top: B:572:0x0760 }] */
    /* JADX WARN: Removed duplicated region for block: B:425:0x0777 A[Catch: all -> 0x077e, Exception -> 0x0780, TRY_LEAVE, TryCatch #46 {Exception -> 0x0780, all -> 0x077e, blocks: (B:417:0x0760, B:419:0x0765, B:421:0x076a, B:423:0x076f, B:425:0x0777), top: B:572:0x0760 }] */
    /* JADX WARN: Removed duplicated region for block: B:441:0x079e  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x07c4  */
    /* JADX WARN: Removed duplicated region for block: B:477:0x0832  */
    /* JADX WARN: Removed duplicated region for block: B:489:0x088b  */
    /* JADX WARN: Removed duplicated region for block: B:523:0x0890 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:525:0x062d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:537:0x07cc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:548:0x0837 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r31v0 */
    /* JADX WARN: Type inference failed for: r31v1 */
    /* JADX WARN: Type inference failed for: r31v10, types: [int] */
    /* JADX WARN: Type inference failed for: r31v13 */
    /* JADX WARN: Type inference failed for: r31v16 */
    /* JADX WARN: Type inference failed for: r31v17 */
    /* JADX WARN: Type inference failed for: r31v18 */
    /* JADX WARN: Type inference failed for: r31v19 */
    /* JADX WARN: Type inference failed for: r31v2 */
    /* JADX WARN: Type inference failed for: r31v20 */
    /* JADX WARN: Type inference failed for: r31v21 */
    /* JADX WARN: Type inference failed for: r31v5 */
    /* JADX WARN: Type inference failed for: r31v7 */
    /* JADX WARN: Type inference failed for: r31v8 */
    /* JADX WARN: Type inference failed for: r31v9 */
    @android.annotation.TargetApi(16)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(java.lang.String r50, java.lang.String r51, int r52, com.vincent.videocompressor.VideoController.b r53) {
        /*
            Method dump skipped, instructions count: 2226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vincent.videocompressor.VideoController.a(java.lang.String, java.lang.String, int, com.vincent.videocompressor.VideoController$b):boolean");
    }

    public void g(String str, String str2) {
        k(str, str2);
    }
}
