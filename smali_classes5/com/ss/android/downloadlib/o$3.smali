.class Lcom/ss/android/downloadlib/o$3;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/downloadlib/o;->vv()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic vv:Lcom/ss/android/downloadlib/o;


# direct methods
.method constructor <init>(Lcom/ss/android/downloadlib/o;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ss/android/downloadlib/o$3;->vv:Lcom/ss/android/downloadlib/o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    const-string v0, ""

    .line 1
    invoke-static {v0}, Lcom/ss/android/socialbase/appdownloader/u/o;->vv(Ljava/lang/String;)Z

    .line 2
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/u/o;->q()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    .line 3
    invoke-static {v1}, Lcom/ss/android/socialbase/downloader/downloader/p;->vv(Z)V

    .line 4
    :cond_0
    invoke-static {}, Lcom/ss/android/socialbase/downloader/n/vv;->p()Lcom/ss/android/socialbase/downloader/n/vv;

    move-result-object v0

    const-string v2, "disable_security_init"

    invoke-virtual {v0, v2, v1}, Lcom/ss/android/socialbase/downloader/n/vv;->vv(Ljava/lang/String;I)I

    move-result v0

    if-ne v0, v1, :cond_1

    .line 5
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/ss/android/socialbase/appdownloader/u/u;->vv(Landroid/content/Context;)V

    :cond_1
    return-void
.end method
