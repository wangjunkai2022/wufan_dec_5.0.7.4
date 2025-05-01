package com.airsaid.pickerviewlibrary;

import android.content.Context;
import com.airsaid.pickerviewlibrary.c;
import java.io.InputStream;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: CityPickerView.java */
/* loaded from: classes2.dex */
public class b extends c {
    public f.a A;

    /* renamed from: v  reason: collision with root package name */
    private final Context f4410v;

    /* renamed from: w  reason: collision with root package name */
    private ArrayList<String> f4411w;

    /* renamed from: x  reason: collision with root package name */
    private ArrayList<ArrayList<String>> f4412x;

    /* renamed from: y  reason: collision with root package name */
    private ArrayList<ArrayList<ArrayList<String>>> f4413y;

    /* renamed from: z  reason: collision with root package name */
    private JSONObject f4414z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CityPickerView.java */
    /* loaded from: classes2.dex */
    public class a implements c.a {
        a() {
        }

        @Override // com.airsaid.pickerviewlibrary.c.a
        public void a(int i4, int i5, int i6) {
            b bVar = b.this;
            if (bVar.A == null || bVar.f4412x.size() <= i4 || ((ArrayList) b.this.f4412x.get(i4)).size() <= i5 || b.this.f4413y.size() <= i4 || ((ArrayList) b.this.f4413y.get(i4)).size() <= i5 || ((ArrayList) ((ArrayList) b.this.f4413y.get(i4)).get(i5)).size() <= i6) {
                return;
            }
            String str = (String) b.this.f4411w.get(i4);
            String str2 = (String) ((ArrayList) b.this.f4412x.get(i4)).get(i5);
            String str3 = (String) ((ArrayList) ((ArrayList) b.this.f4413y.get(i4)).get(i5)).get(i6);
            b.this.A.onCitySelect(str.concat(str2).concat(str3));
            b.this.A.onCitySelect(str, str2, str3);
        }
    }

    public b(Context context) {
        super(context);
        this.f4411w = new ArrayList<>();
        this.f4412x = new ArrayList<>();
        this.f4413y = new ArrayList<>();
        this.f4410v = context;
        Q();
        R();
        P();
    }

    private void P() {
        J("选择城市");
        A(this.f4411w, this.f4412x, this.f4413y, true);
        t(false, false, false);
        E(0, 0, 0);
        y(new a());
    }

    private void Q() {
        try {
            InputStream open = this.f4410v.getAssets().open("city.json");
            byte[] bArr = new byte[open.available()];
            open.read(bArr);
            this.f4414z = new JSONObject(new String(bArr, "UTF-8"));
            open.close();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void R() {
        try {
            JSONArray jSONArray = this.f4414z.getJSONArray("citylist");
            for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i4);
                String string = jSONObject.getString("name");
                ArrayList<String> arrayList = new ArrayList<>();
                ArrayList<ArrayList<String>> arrayList2 = new ArrayList<>();
                JSONArray jSONArray2 = jSONObject.getJSONArray("city");
                for (int i5 = 0; i5 < jSONArray2.length(); i5++) {
                    JSONObject jSONObject2 = jSONArray2.getJSONObject(i5);
                    arrayList.add(jSONObject2.getString("name"));
                    ArrayList<String> arrayList3 = new ArrayList<>();
                    JSONArray jSONArray3 = jSONObject2.getJSONArray("area");
                    for (int i6 = 0; i6 < jSONArray3.length(); i6++) {
                        arrayList3.add(jSONArray3.getString(i6));
                    }
                    arrayList2.add(arrayList3);
                }
                this.f4411w.add(string);
                this.f4412x.add(arrayList);
                this.f4413y.add(arrayList2);
            }
        } catch (JSONException e5) {
            e5.printStackTrace();
        }
        this.f4414z = null;
    }

    public void S(f.a aVar) {
        this.A = aVar;
    }
}
