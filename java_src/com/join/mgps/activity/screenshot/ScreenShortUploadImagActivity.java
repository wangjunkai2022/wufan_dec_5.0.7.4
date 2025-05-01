package com.join.mgps.activity.screenshot;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.BaseActivity;
import com.facebook.drawee.drawable.r;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.Util.b0;
import com.join.mgps.Util.g2;
import com.join.mgps.Util.l2;
import com.join.mgps.Util.o0;
import com.join.mgps.Util.o1;
import com.join.mgps.Util.v;
import com.join.mgps.dialog.d1;
import com.kuaishou.weapon.p0.g;
import com.wufan.user.service.protobuf.n0;
import java.io.File;
import java.io.IOException;
import java.util.List;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.json.JSONException;
import org.json.JSONObject;
@EActivity(R.layout.screenshort_upload_activity)
/* loaded from: classes4.dex */
public class ScreenShortUploadImagActivity extends BaseActivity {
    Activity activity;
    @ViewById
    ImageView back;
    @ViewById
    EditText commitMessage;
    d1 dialog;
    File filePath;
    @ViewById
    TextView finishButn;
    @Extra
    String gameId;
    @Extra
    String imagepath;
    @ViewById
    SimpleDraweeView imgUpload;
    List<ScreenshortTabBean> listTables;
    Context mContext;
    private o1 mPhotoSelectUtils;
    private Dialog mPicChsDialog;
    @ViewById
    SlidingTabLayoutScreenShort selecter;
    @Extra
    int typeId;
    @ViewById
    ViewPager viewPager;

    private void ChangIcon() {
        Dialog dialog = new Dialog(this.mContext, R.style.floate_dialog);
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
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.activity.screenshot.ScreenShortUploadImagActivity.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ScreenShortUploadImagActivity.this.mPicChsDialog.dismiss();
                boolean z4 = false;
                if (ContextCompat.checkSelfPermission(ScreenShortUploadImagActivity.this.activity, g.f55590j) != 0) {
                    UtilsMy.O2(ScreenShortUploadImagActivity.this.activity, g.f55590j);
                } else if (ContextCompat.checkSelfPermission(ScreenShortUploadImagActivity.this.activity, g.f55589i) != 0) {
                    UtilsMy.O2(ScreenShortUploadImagActivity.this.activity, g.f55589i);
                } else if (ContextCompat.checkSelfPermission(ScreenShortUploadImagActivity.this.activity, "android.permission.CAMERA") != 0) {
                    UtilsMy.O2(ScreenShortUploadImagActivity.this.activity, "android.permission.CAMERA");
                } else {
                    z4 = true;
                }
                if (z4) {
                    ScreenShortUploadImagActivity.this.mPhotoSelectUtils.h();
                }
            }
        });
        ((TextView) this.mPicChsDialog.findViewById(R.id.pic_lib)).setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.activity.screenshot.ScreenShortUploadImagActivity.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ScreenShortUploadImagActivity.this.mPicChsDialog.dismiss();
                boolean z4 = false;
                if (ContextCompat.checkSelfPermission(ScreenShortUploadImagActivity.this.activity, g.f55590j) != 0) {
                    UtilsMy.O2(ScreenShortUploadImagActivity.this.activity, g.f55590j);
                } else if (ContextCompat.checkSelfPermission(ScreenShortUploadImagActivity.this.activity, g.f55589i) != 0) {
                    UtilsMy.O2(ScreenShortUploadImagActivity.this.activity, g.f55589i);
                } else {
                    z4 = true;
                }
                if (z4) {
                    ScreenShortUploadImagActivity.this.mPhotoSelectUtils.e();
                }
            }
        });
        ((TextView) this.mPicChsDialog.findViewById(R.id.btn_cancel)).setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.activity.screenshot.ScreenShortUploadImagActivity.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ScreenShortUploadImagActivity.this.mPicChsDialog.dismiss();
            }
        });
        this.mPicChsDialog.show();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterview() {
        this.activity = this;
        this.mContext = this;
        this.dialog = b0.f0(this).x(this.mContext);
        if (g2.i(this.imagepath)) {
            File file = new File(this.imagepath);
            if (file.exists()) {
                this.filePath = file;
                SimpleDraweeView simpleDraweeView = this.imgUpload;
                MyImageLoader.i(simpleDraweeView, "file://" + this.imagepath, r.c.f11300g);
            }
        }
        this.mPhotoSelectUtils = new o1(this, new o1.a() { // from class: com.join.mgps.activity.screenshot.ScreenShortUploadImagActivity.1
            @Override // com.join.mgps.Util.o1.a
            public void onFinish(File file2, Uri uri) {
                SimpleDraweeView simpleDraweeView2 = ScreenShortUploadImagActivity.this.imgUpload;
                MyImageLoader.i(simpleDraweeView2, "file://" + file2.getAbsolutePath(), r.c.f11300g);
                ScreenShortUploadImagActivity.this.filePath = file2;
            }
        }, false);
        this.listTables = (List) getIntent().getBundleExtra("datas").getSerializable("datas");
        this.viewPager.setAdapter(new PagerAdapter() { // from class: com.join.mgps.activity.screenshot.ScreenShortUploadImagActivity.2
            @Override // androidx.viewpager.widget.PagerAdapter
            public int getCount() {
                return ScreenShortUploadImagActivity.this.listTables.size();
            }

            @Override // androidx.viewpager.widget.PagerAdapter
            @Nullable
            public CharSequence getPageTitle(int i4) {
                return ScreenShortUploadImagActivity.this.listTables.get(i4).getTitle();
            }

            @Override // androidx.viewpager.widget.PagerAdapter
            public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
                return false;
            }
        });
        this.selecter.setViewPager(this.viewPager);
        for (int i4 = 0; i4 < this.listTables.size(); i4++) {
            if (this.listTables.get(i4).getId() == this.typeId) {
                this.selecter.setCurrentTab(i4);
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void back() {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void finishButn() {
        String obj = this.commitMessage.getText().toString();
        if (g2.h(obj)) {
            l2.a(this.mContext).b("点评内容不能为空");
            return;
        }
        File file = this.filePath;
        if (file != null && file.exists()) {
            this.dialog.show();
            uploadImagData(obj);
            return;
        }
        l2.a(this.mContext).b("请选择截图");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void imgUpload() {
        ChangIcon();
    }

    @Override // com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i4, int i5, Intent intent) {
        super.onActivityResult(i4, i5, intent);
        this.mPhotoSelectUtils.a(i4, i5, intent);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i4, @NonNull String[] strArr, @NonNull int[] iArr) {
        super.onRequestPermissionsResult(i4, strArr, iArr);
        if (i4 == 1001) {
            this.mPhotoSelectUtils.h();
        } else if (i4 == 1002) {
            this.mPhotoSelectUtils.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void uploadFailed(String str) {
        this.dialog.dismiss();
        if (g2.i(str)) {
            l2.a(this.mContext).b(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00ed -> B:33:0x00f5). Please submit an issue!!! */
    @Background
    public void uploadImagData(String str) {
        String f5;
        try {
            int i4 = this.typeId;
            n0 accountData = AccountUtil_.getInstance_(this.mContext).getAccountData();
            int i5 = 0;
            while (true) {
                if (i5 >= this.listTables.size()) {
                    break;
                } else if (i5 == this.viewPager.getCurrentItem()) {
                    i4 = this.listTables.get(i5).getId();
                    break;
                } else {
                    i5++;
                }
            }
            String str2 = v.f28111k + "uploadFile" + System.currentTimeMillis();
            try {
                new ImageFactory().compressAndGenImage(this.filePath.getAbsolutePath(), str2, 500, false);
            } catch (IOException e5) {
                e5.printStackTrace();
            }
            File file = new File(str2);
            if (file.exists()) {
                f5 = o0.f(file, accountData.getUid() + "", accountData.getToken(), this.gameId, i4 + "", str);
            } else {
                f5 = o0.f(this.filePath, accountData.getUid() + "", accountData.getToken(), this.gameId, i4 + "", str);
            }
            try {
                JSONObject jSONObject = new JSONObject(f5);
                int i6 = jSONObject.getInt("flag");
                int i7 = jSONObject.getInt("code");
                if (i6 == 1 && i7 == 600) {
                    uploadSuccess();
                } else {
                    uploadFailed(jSONObject.getString("error_info"));
                }
            } catch (JSONException unused) {
                uploadFailed("");
            }
        } catch (Exception e6) {
            e6.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void uploadSuccess() {
        this.dialog.dismiss();
        l2.a(this.mContext).b("图片审核后显示");
        finish();
    }
}
