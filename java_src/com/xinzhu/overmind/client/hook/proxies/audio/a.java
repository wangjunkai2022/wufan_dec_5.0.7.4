package com.xinzhu.overmind.client.hook.proxies.audio;

import com.xinzhu.haunted.android.media.a;
import com.xinzhu.haunted.android.os.s;
import com.xinzhu.overmind.client.hook.BinderInvocationStub;
import com.xinzhu.overmind.client.hook.common.d;
import com.xinzhu.overmind.client.hook.common.e;
/* compiled from: AudioManagerStub.java */
/* loaded from: classes.dex */
public class a extends BinderInvocationStub {
    public a() {
        super(s.i("audio"));
    }

    @Override // com.xinzhu.overmind.client.hook.d
    public boolean a() {
        return false;
    }

    @Override // com.xinzhu.overmind.client.hook.b
    protected Object getWho() {
        return a.C0698a.a(s.i("audio"));
    }

    @Override // com.xinzhu.overmind.client.hook.b
    protected void inject(Object obj, Object obj2) {
        replaceSystemService("audio");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xinzhu.overmind.client.hook.BinderInvocationStub, com.xinzhu.overmind.client.hook.b
    public void onBindMethod() {
        super.onBindMethod();
        addMethodHook(new d("adjustSuggestedStreamVolume", d.f67577f, d.f67576e));
        addMethodHook(new d("adjustStreamVolume", d.f67577f, d.f67576e));
        addMethodHook(new d("setStreamVolume", d.f67577f, d.f67576e));
        addMethodHook(new d("handleVolumeKey", d.f67577f, d.f67576e));
        addMethodHook(new d("setMasterMute", d.f67577f, d.f67578g));
        addMethodHook(new d("setVolumeIndexForAttributes", d.f67577f, d.f67576e));
        addMethodHook(new d("setMicrophoneMute", d.f67577f, d.f67578g));
        addMethodHook(new d("setMode", d.f67577f, d.f67576e));
        addMethodHook(new d("requestAudioFocus", d.f67577f, d.f67576e));
        addMethodHook(new d("abandonAudioFocus", d.f67577f, d.f67576e));
        addMethodHook(new d("disableSafeMediaVolume", d.f67577f, d.f67576e));
        addMethodHook(new e("setUidDeviceAffinity", 1));
        addMethodHook(new e("removeUidDeviceAffinity", 1));
        addMethodHook(new d("setUserIdDeviceAffinity", d.f67576e, 1));
        addMethodHook(new d("removeUserIdDeviceAffinity", d.f67576e, 1));
    }
}
