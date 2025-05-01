.class Lcom/ss/android/socialbase/appdownloader/i$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/socialbase/appdownloader/i;->x()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic vv:Lcom/ss/android/socialbase/appdownloader/i;


# direct methods
.method constructor <init>(Lcom/ss/android/socialbase/appdownloader/i;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ss/android/socialbase/appdownloader/i$1;->vv:Lcom/ss/android/socialbase/appdownloader/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/i;->g()Ljava/lang/String;

    move-result-object v0

    const-string v1, "registerDownloadReceiver tryUnRegisterTempAppInstallDownloadReceiver run inner"

    invoke-static {v0, v1}, Lcom/ss/android/socialbase/downloader/p/vv;->m(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/i$1;->vv:Lcom/ss/android/socialbase/appdownloader/i;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/appdownloader/i;->jh()V

    .line 3
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/i$1;->vv:Lcom/ss/android/socialbase/appdownloader/i;

    invoke-static {v0}, Lcom/ss/android/socialbase/appdownloader/i;->vv(Lcom/ss/android/socialbase/appdownloader/i;)V

    return-void
.end method
