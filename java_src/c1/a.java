package c1;

import com.j256.ormlite.android.apptools.OrmLiteConfigUtil;
import java.io.IOException;
import java.sql.SQLException;
/* compiled from: DatabaseConfigUtil.java */
/* loaded from: classes3.dex */
public class a extends OrmLiteConfigUtil {
    public static void main(String[] strArr) throws SQLException, IOException {
        OrmLiteConfigUtil.writeConfigFile("ormlite_config.txt");
    }
}
