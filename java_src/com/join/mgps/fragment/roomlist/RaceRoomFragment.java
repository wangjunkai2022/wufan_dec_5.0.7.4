package com.join.mgps.fragment.roomlist;

import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.fragment.app.Fragment;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.UtilsMy;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.ViewById;
@EFragment(R.layout.fragment_raceroom)
/* loaded from: classes3.dex */
public class RaceRoomFragment extends Fragment {
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    WebView f53306b;

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        WebSettings settings = this.f53306b.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDisplayZoomControls(false);
        settings.setBuiltInZoomControls(false);
        settings.setCacheMode(2);
        UtilsMy.C3(this.f53306b);
    }
}
