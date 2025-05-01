.class Lcom/ss/android/downloadlib/addownload/qv$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/ss/android/download/api/config/x;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/downloadlib/addownload/qv;->vv(Lcom/ss/android/download/api/config/x;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic m:Lcom/ss/android/downloadlib/addownload/qv;

.field final synthetic vv:Lcom/ss/android/download/api/config/x;


# direct methods
.method constructor <init>(Lcom/ss/android/downloadlib/addownload/qv;Lcom/ss/android/download/api/config/x;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ss/android/downloadlib/addownload/qv$1;->m:Lcom/ss/android/downloadlib/addownload/qv;

    iput-object p2, p0, Lcom/ss/android/downloadlib/addownload/qv$1;->vv:Lcom/ss/android/download/api/config/x;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public vv()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/qv$1;->vv:Lcom/ss/android/download/api/config/x;

    invoke-interface {v0}, Lcom/ss/android/download/api/config/x;->vv()V

    return-void
.end method

.method public vv(Ljava/lang/String;)V
    .locals 7

    .line 2
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b;->p()Lcom/ss/android/download/api/config/jh;

    move-result-object v0

    .line 3
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b;->getContext()Landroid/content/Context;

    move-result-object v2

    iget-object v1, p0, Lcom/ss/android/downloadlib/addownload/qv$1;->m:Lcom/ss/android/downloadlib/addownload/qv;

    iget-object v1, v1, Lcom/ss/android/downloadlib/addownload/qv;->vv:Lcom/ss/android/downloadlib/addownload/m/o;

    iget-object v3, v1, Lcom/ss/android/downloadlib/addownload/m/o;->m:Lcom/ss/android/download/api/download/DownloadModel;

    const/4 v1, 0x1

    const-string v4, "\u60a8\u5df2\u7981\u6b62\u4f7f\u7528\u5b58\u50a8\u6743\u9650\uff0c\u8bf7\u6388\u6743\u540e\u518d\u4e0b\u8f7d"

    const/4 v5, 0x0

    const/4 v6, 0x1

    .line 4
    invoke-interface/range {v0 .. v6}, Lcom/ss/android/download/api/config/jh;->vv(ILandroid/content/Context;Lcom/ss/android/download/api/download/DownloadModel;Ljava/lang/String;Landroid/graphics/drawable/Drawable;I)V

    .line 5
    invoke-static {}, Lcom/ss/android/downloadlib/i/vv;->vv()Lcom/ss/android/downloadlib/i/vv;

    move-result-object v0

    iget-object v1, p0, Lcom/ss/android/downloadlib/addownload/qv$1;->m:Lcom/ss/android/downloadlib/addownload/qv;

    invoke-static {v1}, Lcom/ss/android/downloadlib/addownload/qv;->vv(Lcom/ss/android/downloadlib/addownload/qv;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v2, v3}, Lcom/ss/android/downloadlib/i/vv;->m(JI)V

    .line 6
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/qv$1;->vv:Lcom/ss/android/download/api/config/x;

    invoke-interface {v0, p1}, Lcom/ss/android/download/api/config/x;->vv(Ljava/lang/String;)V

    return-void
.end method
