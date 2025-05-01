package com.join.mgps.db.tables;

import android.text.TextUtils;
import com.j256.ormlite.field.DatabaseField;
import com.join.mgps.dto.ShowViewDataBean;
import com.join.mgps.dto.SplashIntentBean;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class ShowViewDataBeanTable {
    @DatabaseField
    private String begin_times;
    @DatabaseField
    private String end_times;
    @DatabaseField(generatedId = true)
    private int id;
    @DatabaseField
    private String imagePath;
    private boolean isNeedDelt;
    @DatabaseField
    private String is_default;
    @DatabaseField
    private String jump_info;
    @DatabaseField
    private String pic_addr;
    @DatabaseField
    private long show_time;
    @DatabaseField
    private String strategy_id;
    @DatabaseField
    private String strategy_name;
    @DatabaseField
    private int tag_show;
    @DatabaseField
    private String up_times;

    public ShowViewDataBeanTable() {
        this.isNeedDelt = true;
    }

    public String getBegin_times() {
        return this.begin_times;
    }

    public String getEnd_times() {
        return this.end_times;
    }

    public int getId() {
        return this.id;
    }

    public String getImagePath() {
        return this.imagePath;
    }

    public String getIs_default() {
        return this.is_default;
    }

    public String getJump_info() {
        return this.jump_info;
    }

    public String getPic_addr() {
        return this.pic_addr;
    }

    public ShowViewDataBean getShowVieDatabean() {
        String[] strArr = new String[0];
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(this.jump_info)) {
            try {
                JSONArray jSONArray = new JSONArray(this.jump_info);
                for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i4);
                    if (jSONObject != null) {
                        arrayList.add(SplashIntentBean.from(jSONObject));
                    }
                }
            } catch (JSONException e5) {
                e5.printStackTrace();
            }
        }
        return new ShowViewDataBean(this.id, this.strategy_id, this.strategy_name, this.up_times, strArr, this.begin_times, this.end_times, this.is_default, this.imagePath, this.tag_show, this.isNeedDelt, arrayList, this.show_time);
    }

    public long getShow_time() {
        return this.show_time;
    }

    public String getStrategy_id() {
        return this.strategy_id;
    }

    public String getStrategy_name() {
        return this.strategy_name;
    }

    public int getTag_show() {
        return this.tag_show;
    }

    public String getUp_times() {
        return this.up_times;
    }

    public boolean isNeedDelt() {
        return this.isNeedDelt;
    }

    public int isTag_show() {
        return this.tag_show;
    }

    public void setBegin_times(String str) {
        this.begin_times = str;
    }

    public void setEnd_times(String str) {
        this.end_times = str;
    }

    public void setId(int i4) {
        this.id = i4;
    }

    public void setImagePath(String str) {
        this.imagePath = str;
    }

    public void setIs_default(String str) {
        this.is_default = str;
    }

    public void setJump_info(String str) {
        this.jump_info = str;
    }

    public void setNeedDelt(boolean z4) {
        this.isNeedDelt = z4;
    }

    public void setPic_addr(String str) {
        this.pic_addr = str;
    }

    public void setShow_time(long j4) {
        this.show_time = j4;
    }

    public void setStrategy_id(String str) {
        this.strategy_id = str;
    }

    public void setStrategy_name(String str) {
        this.strategy_name = str;
    }

    public void setTag_show(int i4) {
        this.tag_show = i4;
    }

    public void setUp_times(String str) {
        this.up_times = str;
    }

    public ShowViewDataBeanTable(int i4, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i5, boolean z4, String str9, long j4) {
        this.isNeedDelt = true;
        this.id = i4;
        this.strategy_id = str;
        this.strategy_name = str2;
        this.up_times = str3;
        this.pic_addr = str4;
        this.begin_times = str5;
        this.end_times = str6;
        this.is_default = str7;
        this.imagePath = str8;
        this.tag_show = i5;
        this.isNeedDelt = z4;
        this.jump_info = str9;
        this.show_time = j4;
    }
}
