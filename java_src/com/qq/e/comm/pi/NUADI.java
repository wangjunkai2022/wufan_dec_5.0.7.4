package com.qq.e.comm.pi;

import com.qq.e.comm.constants.LoadAdParams;
import java.util.List;
/* loaded from: classes5.dex */
public interface NUADI {
    String getAdNetWorkName();

    void loadData(int i4);

    void loadData(int i4, LoadAdParams loadAdParams);

    void setCategories(List<String> list);

    void setMaxVideoDuration(int i4);

    void setMinVideoDuration(int i4);

    void setVastClassName(String str);
}
