package com.join.mgps.activity;

import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.dto.CollectionBeanSub;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.ViewById;
@EFragment(R.layout.fragment_check_local_game)
/* loaded from: classes4.dex */
public class CheckLocalGameFragment extends Fragment {
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    TextView f28577b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    TextView f28578c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    SimpleDraweeView f28579d;

    /* renamed from: e  reason: collision with root package name */
    public String f28580e;

    /* renamed from: f  reason: collision with root package name */
    public CollectionBeanSub f28581f;

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        this.f28577b.setText(this.f28580e);
        this.f28578c.setText(this.f28581f.getGame_name());
        String ico_remote = this.f28581f.getIco_remote();
        if (com.join.mgps.Util.g2.h(ico_remote)) {
            return;
        }
        this.f28579d.setImageURI(ico_remote);
    }
}
