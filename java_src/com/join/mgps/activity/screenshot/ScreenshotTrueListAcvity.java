package com.join.mgps.activity.screenshot;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.viewpager.widget.ViewPager;
import com.BaseFragmentActivity;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.RequestBeanUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.Util.o1;
import com.join.mgps.activity.screenshot.ScreenShortUploadImagActivity_;
import com.join.mgps.adapter.FragmentPagerAdapter;
import com.join.mgps.dto.ResultMainBean;
import com.join.mgps.dto.ResultMessageBean;
import com.join.mgps.rpc.e;
import com.join.mgps.rpc.impl.d;
import com.kuaishou.weapon.p0.g;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
@EActivity(R.layout.screenshort_activity_layout)
/* loaded from: classes4.dex */
public class ScreenshotTrueListAcvity extends BaseFragmentActivity {
    Activity activity;
    @ViewById
    ImageView back;
    e client;
    Context context;
    @Extra
    ScreenshotGamedetialBean fromData;
    @Extra
    String gameId;
    List<ScreenshortTabBean> listTables;
    private o1 mPhotoSelectUtils;
    private Dialog mPicChsDialog;
    @ViewById
    SlidingTabLayoutScreenShort tableLayout;
    @ViewById
    TextView upload;
    @ViewById
    ViewPager viewpager;

    private void ChangIcon() {
        Dialog dialog = new Dialog(this.context, R.style.floate_dialog);
        this.mPicChsDialog = dialog;
        dialog.setContentView(R.layout.dialog_pic_choose);
        Display defaultDisplay = getWindowManager().getDefaultDisplay();
        Window window = this.mPicChsDialog.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        window.setGravity(80);
        attributes.width = defaultDisplay.getWidth();
        this.mPicChsDialog.getWindow().setAttributes(attributes);
        TextView textView = (TextView) this.mPicChsDialog.findViewById(R.id.chos_camera);
        textView.setVisibility(8);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.activity.screenshot.ScreenshotTrueListAcvity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ScreenshotTrueListAcvity.this.mPicChsDialog.dismiss();
                boolean z4 = false;
                if (ContextCompat.checkSelfPermission(ScreenshotTrueListAcvity.this, g.f55590j) != 0) {
                    UtilsMy.O2(ScreenshotTrueListAcvity.this.context, g.f55590j);
                } else if (ContextCompat.checkSelfPermission(ScreenshotTrueListAcvity.this, g.f55589i) != 0) {
                    UtilsMy.O2(ScreenshotTrueListAcvity.this.context, g.f55589i);
                } else if (ContextCompat.checkSelfPermission(ScreenshotTrueListAcvity.this, "android.permission.CAMERA") != 0) {
                    UtilsMy.O2(ScreenshotTrueListAcvity.this.context, "android.permission.CAMERA");
                } else {
                    z4 = true;
                }
                if (z4) {
                    ScreenshotTrueListAcvity.this.mPhotoSelectUtils.h();
                }
            }
        });
        ((TextView) this.mPicChsDialog.findViewById(R.id.pic_lib)).setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.activity.screenshot.ScreenshotTrueListAcvity.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ScreenshotTrueListAcvity.this.mPicChsDialog.dismiss();
                boolean z4 = false;
                if (ContextCompat.checkSelfPermission(ScreenshotTrueListAcvity.this, g.f55590j) != 0) {
                    UtilsMy.O2(ScreenshotTrueListAcvity.this.context, g.f55590j);
                } else if (ContextCompat.checkSelfPermission(ScreenshotTrueListAcvity.this, g.f55589i) != 0) {
                    UtilsMy.O2(ScreenshotTrueListAcvity.this.context, g.f55589i);
                } else {
                    z4 = true;
                }
                if (z4) {
                    ScreenshotTrueListAcvity.this.mPhotoSelectUtils.e();
                }
            }
        });
        ((TextView) this.mPicChsDialog.findViewById(R.id.btn_cancel)).setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.activity.screenshot.ScreenshotTrueListAcvity.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ScreenshotTrueListAcvity.this.mPicChsDialog.dismiss();
            }
        });
        this.mPicChsDialog.show();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterView() {
        this.client = d.P1();
        this.context = this;
        this.activity = this;
        getTabdata();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void back() {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void getTabdata() {
        ResultMessageBean<List<ScreenshortTabBean>> messages;
        try {
            ResultMainBean<List<ScreenshortTabBean>> h02 = this.client.h0(RequestBeanUtil.getInstance(this.context).getScreenShortListRequest(this.gameId, 1, 1));
            if (h02 == null || h02.getFlag() != 1 || (messages = h02.getMessages()) == null || messages.getData() == null) {
                return;
            }
            List<ScreenshortTabBean> data = messages.getData();
            this.listTables = data;
            updateTable(data);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i4, int i5, Intent intent) {
        super.onActivityResult(i4, i5, intent);
        o1 o1Var = this.mPhotoSelectUtils;
        if (o1Var != null) {
            o1Var.a(i4, i5, intent);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i4, @NonNull String[] strArr, @NonNull int[] iArr) {
        super.onRequestPermissionsResult(i4, strArr, iArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void updateTable(List<ScreenshortTabBean> list) {
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            ScreenshortTabBean screenshortTabBean = list.get(i5);
            ScreenShortListFragment_ screenShortListFragment_ = new ScreenShortListFragment_();
            Bundle bundle = new Bundle();
            bundle.putString("gameId", this.gameId);
            bundle.putInt("typeId", screenshortTabBean.getId());
            screenShortListFragment_.setArguments(bundle);
            arrayList.add(new FragmentPagerAdapter.a(screenshortTabBean.getTitle() + "", screenShortListFragment_));
            if (this.fromData.getId() == screenshortTabBean.getId()) {
                i4 = i5;
            }
        }
        FragmentPagerAdapter fragmentPagerAdapter = new FragmentPagerAdapter(getSupportFragmentManager(), arrayList);
        fragmentPagerAdapter.e(arrayList);
        this.viewpager.setAdapter(fragmentPagerAdapter);
        this.tableLayout.setViewPager(this.viewpager);
        this.viewpager.setCurrentItem(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void upload() {
        this.mPhotoSelectUtils = new o1(this, new o1.a() { // from class: com.join.mgps.activity.screenshot.ScreenshotTrueListAcvity.1
            @Override // com.join.mgps.Util.o1.a
            public void onFinish(File file, Uri uri) {
                Bundle bundle = new Bundle();
                bundle.putSerializable("datas", (Serializable) ScreenshotTrueListAcvity.this.listTables);
                ScreenShortUploadImagActivity_.IntentBuilder_ imagepath = ScreenShortUploadImagActivity_.intent(ScreenshotTrueListAcvity.this.context).gameId(ScreenshotTrueListAcvity.this.gameId).imagepath(file.getAbsolutePath());
                ScreenshotTrueListAcvity screenshotTrueListAcvity = ScreenshotTrueListAcvity.this;
                ((ScreenShortUploadImagActivity_.IntentBuilder_) imagepath.typeId(screenshotTrueListAcvity.listTables.get(screenshotTrueListAcvity.viewpager.getCurrentItem()).getId()).extra("datas", bundle)).start();
            }
        }, false);
        ChangIcon();
    }
}
