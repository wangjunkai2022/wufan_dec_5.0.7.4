package b2;

import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.utils.JsonMapper;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.db.tables.DownloadFileTable;
import com.join.mgps.dto.TipBean;
import com.php25.PDownload.DownloadFile;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* compiled from: DownloadUtilsManager.java */
/* loaded from: classes.dex */
public class m {
    public static DownloadFile a(DownloadFileTable downloadFileTable) {
        DownloadFile downloadFile = new DownloadFile();
        downloadFile.Y(Long.valueOf(downloadFileTable.getId()));
        downloadFile.l0(downloadFileTable.getTag());
        downloadFile.p0(downloadFileTable.getUrl());
        downloadFile.L(downloadFileTable.getBasePath());
        downloadFile.b0(downloadFileTable.getName());
        downloadFile.i0(downloadFileTable.getShowName());
        downloadFile.J(downloadFileTable.getAbsolutePath());
        downloadFile.W(downloadFileTable.getGameZipPath());
        downloadFile.n0(Integer.valueOf(downloadFileTable.getTotalSize()));
        downloadFile.Q(downloadFileTable.getDownloading() == 1);
        downloadFile.V(downloadFileTable.getFinished() == 1);
        downloadFile.O(downloadFileTable.getCreateTime());
        downloadFile.d0(downloadFileTable.getPackageName());
        downloadFile.e0(downloadFileTable.getPercentage());
        downloadFile.K(downloadFileTable.getIsAutoPause() == 1);
        downloadFile.U(downloadFileTable.getFinishTime());
        downloadFile.M(downloadFileTable.getCompleteSize());
        downloadFile.S(downloadFileTable.getDtype());
        downloadFile.T(downloadFileTable.getFileType());
        downloadFile.f0(downloadFileTable.getPortraitURL());
        downloadFile.N(downloadFileTable.getCrc_link_type_val());
        downloadFile.q0(downloadFileTable.getVer());
        downloadFile.r0(downloadFileTable.getVer_name());
        downloadFile.X(downloadFileTable.getGid());
        downloadFile.k0(downloadFileTable.getStarNumber());
        downloadFile.h0(downloadFileTable.getRomType());
        downloadFile.c0(downloadFileTable.getIsOpen() == 1);
        downloadFile.P(downloadFileTable.getDescribe());
        downloadFile.j0(downloadFileTable.getShowType());
        downloadFile.m0((List) JsonMapper.getInstance().fromJson(downloadFileTable.getTips(), JsonMapper.getInstance().createCollectionType(ArrayList.class, TipBean.class)));
        return downloadFile;
    }

    public static DownloadFileTable b(DownloadFile downloadFile) {
        DownloadFileTable downloadFileTable = new DownloadFileTable();
        downloadFileTable.setTag(downloadFile.x());
        downloadFileTable.setUrl(downloadFile.B());
        downloadFileTable.setBasePath(downloadFile.b());
        downloadFileTable.setName(downloadFile.getName());
        downloadFileTable.setShowName(downloadFile.u());
        downloadFileTable.setAbsolutePath(downloadFile.a());
        downloadFileTable.setGameZipPath(downloadFile.k());
        downloadFileTable.setTotalSize(downloadFile.z().intValue());
        downloadFileTable.setDownloading(downloadFile.F() ? (short) 1 : (short) 0);
        downloadFileTable.setFinished(downloadFile.H() ? (short) 1 : (short) 0);
        downloadFileTable.setCreateTime(downloadFile.e());
        downloadFileTable.setPackageName(downloadFile.p());
        downloadFileTable.setPercentage(downloadFile.q());
        downloadFileTable.setIsAutoPause(downloadFile.E() ? (short) 1 : (short) 0);
        downloadFileTable.setFinishTime(downloadFile.i());
        downloadFileTable.setCompleteSize((int) downloadFile.c());
        downloadFileTable.setDtype(downloadFile.g());
        downloadFileTable.setFileType(downloadFile.h());
        downloadFileTable.setPortraitURL(downloadFile.r());
        downloadFileTable.setCrc_link_type_val(downloadFile.d());
        downloadFileTable.setVer(downloadFile.C());
        downloadFileTable.setVer_name(downloadFile.D());
        downloadFileTable.setGid(downloadFile.l());
        downloadFileTable.setStarNumber(downloadFile.w());
        downloadFileTable.setRomType(downloadFile.t());
        downloadFileTable.setIsOpen(downloadFile.I() ? (short) 1 : (short) 0);
        downloadFileTable.setDescribe(downloadFile.f());
        downloadFileTable.setShowType(downloadFile.v());
        downloadFileTable.setTips(JsonMapper.getInstance().toJson(downloadFile.y()));
        return downloadFileTable;
    }

    public static DownloadTask c(DownloadFile downloadFile) {
        DownloadTask downloadTask = new DownloadTask();
        downloadTask.setUrl(downloadFile.B());
        downloadTask.setName(downloadFile.getName());
        downloadTask.setShowName(downloadFile.u());
        downloadTask.setPath(downloadFile.a());
        downloadTask.setGameZipPath(downloadFile.k());
        downloadTask.setSize(downloadFile.z().intValue());
        downloadTask.setShowSize(UtilsMy.a(downloadFile.z().intValue()));
        downloadTask.setStatus(downloadFile.H() ? 5 : 3);
        downloadTask.setShowSize(UtilsMy.a(downloadFile.z().intValue()));
        String e5 = downloadFile.e();
        if (e5 != null && !e5.equals("")) {
            if (e5.contains("-")) {
                downloadTask.setStartTime(com.join.mgps.Util.y.G(e5).getTime());
            } else {
                downloadTask.setStartTime(Long.parseLong(e5));
            }
        } else {
            downloadTask.setStartTime(System.currentTimeMillis());
        }
        downloadTask.setPackageName(downloadFile.p());
        downloadTask.setFinishTime(System.currentTimeMillis());
        downloadTask.setLastCompleteSize((int) downloadFile.c());
        downloadTask.setFileType(downloadFile.h());
        downloadTask.setPortraitURL(downloadFile.r());
        String d5 = downloadFile.d();
        if (d5 != null && d5.equals("1024")) {
            d5 = "31";
        }
        downloadTask.setCrc_link_type_val(d5);
        downloadTask.setVer(downloadFile.C());
        downloadTask.setVer_name(downloadFile.D());
        downloadTask.setRomType(downloadFile.t());
        downloadTask.setOpen(downloadFile.I());
        downloadTask.setDescribe(downloadFile.f());
        downloadTask.setShowType(downloadFile.v());
        downloadTask.setCfg_ver_name("1");
        downloadTask.setCfg_ver("1");
        downloadTask.setCfg_down_url("1");
        downloadTask.setScreenshot_pic("");
        downloadTask.setDownloadType(1);
        downloadTask.setOpenTime(0L);
        downloadTask.setScreenshot_pic("");
        downloadTask.setTips(JsonMapper.getInstance().toJson(downloadFile.y()));
        return downloadTask;
    }

    public static DownloadTask d(String str) {
        HashMap hashMap = new HashMap(1);
        hashMap.put("packageName", str);
        List<DownloadTask> h4 = p1.f.K().h(hashMap);
        if (h4 == null || h4.size() <= 0) {
            return null;
        }
        return h4.get(0);
    }

    public static void delete(DownloadFile downloadFile) {
        if (downloadFile != null) {
            j.n().b(downloadFile.m());
        }
    }

    public static long insert(DownloadFile downloadFile) {
        DownloadFileTable b5 = b(downloadFile);
        j.n().k(b5);
        return b5.getId();
    }

    public static void update(DownloadFile downloadFile) {
        DownloadFileTable g4 = j.n().g(downloadFile.m());
        g4.setFinished(downloadFile.j() ? (short) 1 : (short) 0);
        g4.setDownloading(downloadFile.F() ? (short) 1 : (short) 0);
        g4.setFinishTime(downloadFile.i());
        g4.setTotalSize(downloadFile.z().intValue());
        g4.setPercentage(downloadFile.q());
        g4.setCompleteSize((int) downloadFile.c());
        g4.setGameZipPath(downloadFile.k());
        g4.setVer_name(downloadFile.D());
        g4.setId(downloadFile.m().intValue());
        j.n().update(g4);
    }
}
