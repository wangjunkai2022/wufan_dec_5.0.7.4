package org.ppsspp.ppsspp;

import android.media.AudioManager;
/* compiled from: AudioFocusChangeListener.java */
/* loaded from: classes7.dex */
public class a implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: a  reason: collision with root package name */
    private boolean f72928a = false;

    public boolean a() {
        return this.f72928a;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public void onAudioFocusChange(int i4) {
        if (i4 == -1) {
            this.f72928a = false;
        } else if (i4 != 1) {
        } else {
            this.f72928a = true;
        }
    }
}
