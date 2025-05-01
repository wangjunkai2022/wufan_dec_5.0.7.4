package com.papa91.activity;

import android.graphics.Rect;
import android.media.AudioTrack;
import android.view.SurfaceHolder;
import com.bytedance.sdk.openadsdk.TTAdConstant;
/* loaded from: classes5.dex */
public class EmuMedia {
    private static SurfaceHolder holder;
    private static AudioTrack track;
    private static Rect RectSrc = new Rect();
    private static Rect region = new Rect();
    private static float volume = AudioTrack.getMaxVolume();

    static boolean audioCreate(int i4, int i5, int i6) {
        int i7 = i5 == 16 ? 2 : 3;
        int i8 = i6 == 2 ? 3 : 2;
        AudioTrack audioTrack = track;
        if (audioTrack != null && audioTrack.getSampleRate() == i4 && track.getAudioFormat() == i7 && track.getChannelCount() == i6) {
            return true;
        }
        int minBufferSize = AudioTrack.getMinBufferSize(i4, i8, i7) * 2;
        try {
            AudioTrack audioTrack2 = new AudioTrack(3, i4, i8, i7, minBufferSize < 1500 ? TTAdConstant.STYLE_SIZE_RADIO_3_2 : minBufferSize, 1);
            track = audioTrack2;
            if (audioTrack2.getState() == 0) {
                track = null;
            }
        } catch (IllegalArgumentException unused) {
            track = null;
        }
        AudioTrack audioTrack3 = track;
        if (audioTrack3 == null) {
            return false;
        }
        float f5 = volume;
        audioTrack3.setStereoVolume(f5, f5);
        return true;
    }

    static void audioDestroy() {
        AudioTrack audioTrack = track;
        if (audioTrack != null) {
            audioTrack.stop();
            track = null;
        }
    }

    static void audioPause() {
        AudioTrack audioTrack = track;
        if (audioTrack != null) {
            audioTrack.pause();
        }
    }

    static void audioPlay(byte[] bArr, int i4) {
        try {
            AudioTrack audioTrack = track;
            if (audioTrack != null) {
                audioTrack.write(bArr, 0, i4);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    static void audioSetVolume(int i4) {
        float minVolume = AudioTrack.getMinVolume();
        float maxVolume = minVolume + (((AudioTrack.getMaxVolume() - minVolume) * i4) / 100.0f);
        volume = maxVolume;
        AudioTrack audioTrack = track;
        if (audioTrack != null) {
            audioTrack.setStereoVolume(maxVolume, maxVolume);
        }
    }

    static void audioStart() {
        AudioTrack audioTrack = track;
        if (audioTrack != null) {
            audioTrack.play();
        }
    }

    static void audioStop() {
        AudioTrack audioTrack = track;
        if (audioTrack != null) {
            audioTrack.stop();
            track.flush();
        }
    }

    static void destroy() {
        AudioTrack audioTrack = track;
        if (audioTrack != null) {
            audioTrack.stop();
            track = null;
        }
    }

    static void setSrcRegion(int i4, int i5, int i6, int i7) {
        RectSrc.set(i4, i5, i6 + i4, i7 + i5);
    }

    static void setSurface(SurfaceHolder surfaceHolder) {
        holder = surfaceHolder;
    }

    static void setSurfaceRegion(int i4, int i5, int i6, int i7) {
        region.set(i4, i5, i6 + i4, i7 + i5);
    }

    static void setSurfaceRegion(Rect rect) {
        region = rect;
    }
}
