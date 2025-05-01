.class Lcom/ss/android/downloadlib/addownload/vv/vv$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/ss/android/download/api/model/m$m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/downloadlib/addownload/vv/vv;->vv(Landroid/content/Context;Lcom/ss/android/downloadlib/addownload/m/vv;Lcom/ss/android/downloadlib/addownload/vv/vv$vv;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic i:Lcom/ss/android/downloadlib/addownload/vv/vv$vv;

.field final synthetic m:Landroid/content/Context;

.field final synthetic o:Lcom/ss/android/downloadlib/addownload/vv/vv;

.field final synthetic p:Lcom/ss/android/downloadlib/addownload/m/vv;

.field final synthetic vv:Lcom/ss/android/downloadad/api/vv/m;


# direct methods
.method constructor <init>(Lcom/ss/android/downloadlib/addownload/vv/vv;Lcom/ss/android/downloadad/api/vv/m;Landroid/content/Context;Lcom/ss/android/downloadlib/addownload/m/vv;Lcom/ss/android/downloadlib/addownload/vv/vv$vv;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ss/android/downloadlib/addownload/vv/vv$1;->o:Lcom/ss/android/downloadlib/addownload/vv/vv;

    iput-object p2, p0, Lcom/ss/android/downloadlib/addownload/vv/vv$1;->vv:Lcom/ss/android/downloadad/api/vv/m;

    iput-object p3, p0, Lcom/ss/android/downloadlib/addownload/vv/vv$1;->m:Landroid/content/Context;

    iput-object p4, p0, Lcom/ss/android/downloadlib/addownload/vv/vv$1;->p:Lcom/ss/android/downloadlib/addownload/m/vv;

    iput-object p5, p0, Lcom/ss/android/downloadlib/addownload/vv/vv$1;->i:Lcom/ss/android/downloadlib/addownload/vv/vv$vv;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public m(Landroid/content/DialogInterface;)V
    .locals 3

    .line 1
    invoke-static {}, Lcom/ss/android/downloadlib/i/vv;->vv()Lcom/ss/android/downloadlib/i/vv;

    move-result-object v0

    iget-object v1, p0, Lcom/ss/android/downloadlib/addownload/vv/vv$1;->vv:Lcom/ss/android/downloadad/api/vv/m;

    const-string v2, "backdialog_exit"

    invoke-virtual {v0, v2, v1}, Lcom/ss/android/downloadlib/i/vv;->m(Ljava/lang/String;Lcom/ss/android/downloadad/api/vv/vv;)V

    .line 2
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/vv/vv$1;->i:Lcom/ss/android/downloadlib/addownload/vv/vv$vv;

    if-eqz v0, :cond_0

    .line 3
    invoke-interface {v0}, Lcom/ss/android/downloadlib/addownload/vv/vv$vv;->vv()V

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/vv/vv$1;->o:Lcom/ss/android/downloadlib/addownload/vv/vv;

    const-string v1, ""

    invoke-virtual {v0, v1}, Lcom/ss/android/downloadlib/addownload/vv/vv;->m(Ljava/lang/String;)V

    .line 5
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    return-void
.end method

.method public p(Landroid/content/DialogInterface;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/ss/android/downloadlib/addownload/vv/vv$1;->o:Lcom/ss/android/downloadlib/addownload/vv/vv;

    const-string v0, ""

    invoke-virtual {p1, v0}, Lcom/ss/android/downloadlib/addownload/vv/vv;->m(Ljava/lang/String;)V

    return-void
.end method

.method public vv(Landroid/content/DialogInterface;)V
    .locals 3

    .line 1
    invoke-static {}, Lcom/ss/android/downloadlib/i/vv;->vv()Lcom/ss/android/downloadlib/i/vv;

    move-result-object v0

    iget-object v1, p0, Lcom/ss/android/downloadlib/addownload/vv/vv$1;->vv:Lcom/ss/android/downloadad/api/vv/m;

    const-string v2, "backdialog_install"

    invoke-virtual {v0, v2, v1}, Lcom/ss/android/downloadlib/i/vv;->m(Ljava/lang/String;Lcom/ss/android/downloadad/api/vv/vv;)V

    .line 2
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/vv/vv$1;->m:Landroid/content/Context;

    iget-object v1, p0, Lcom/ss/android/downloadlib/addownload/vv/vv$1;->p:Lcom/ss/android/downloadlib/addownload/m/vv;

    iget-wide v1, v1, Lcom/ss/android/downloadlib/addownload/m/vv;->vv:J

    long-to-int v2, v1

    invoke-static {v0, v2}, Lcom/ss/android/socialbase/appdownloader/i;->vv(Landroid/content/Context;I)Z

    .line 3
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    return-void
.end method
