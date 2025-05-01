.class Lcom/ss/android/downloadlib/vv$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/ss/android/downloadlib/m/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/downloadlib/vv;->vv(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic m:Ljava/lang/String;

.field final synthetic p:Lcom/ss/android/downloadlib/vv;

.field final synthetic vv:Lcom/ss/android/downloadad/api/vv/m;


# direct methods
.method constructor <init>(Lcom/ss/android/downloadlib/vv;Lcom/ss/android/downloadad/api/vv/m;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ss/android/downloadlib/vv$1;->p:Lcom/ss/android/downloadlib/vv;

    iput-object p2, p0, Lcom/ss/android/downloadlib/vv$1;->vv:Lcom/ss/android/downloadad/api/vv/m;

    iput-object p3, p0, Lcom/ss/android/downloadlib/vv$1;->m:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public vv(Z)V
    .locals 3

    .line 1
    invoke-static {}, Lcom/ss/android/downloadlib/vv;->o()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v1

    const-string v2, "appBackForeground->"

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/ss/android/socialbase/downloader/p/vv;->m(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x4

    if-eqz p1, :cond_2

    const/4 p1, 0x0

    .line 2
    iget-object v1, p0, Lcom/ss/android/downloadlib/vv$1;->vv:Lcom/ss/android/downloadad/api/vv/m;

    invoke-static {v1}, Lcom/ss/android/downloadlib/m/u;->p(Lcom/ss/android/downloadad/api/vv/m;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 3
    iget-object p1, p0, Lcom/ss/android/downloadlib/vv$1;->m:Ljava/lang/String;

    iget-object v1, p0, Lcom/ss/android/downloadlib/vv$1;->vv:Lcom/ss/android/downloadad/api/vv/m;

    invoke-static {p1, v1}, Lcom/ss/android/downloadlib/m/vv;->vv(Ljava/lang/String;Lcom/ss/android/downloadad/api/vv/m;)Z

    move-result p1

    :cond_0
    if-nez p1, :cond_1

    .line 4
    iget-object p1, p0, Lcom/ss/android/downloadlib/vv$1;->vv:Lcom/ss/android/downloadad/api/vv/m;

    invoke-static {p1}, Lcom/ss/android/downloadlib/m/u;->i(Lcom/ss/android/downloadad/api/vv/m;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 5
    iget-object p1, p0, Lcom/ss/android/downloadlib/vv$1;->vv:Lcom/ss/android/downloadad/api/vv/m;

    invoke-virtual {p1}, Lcom/ss/android/downloadad/api/vv/m;->cq()I

    move-result p1

    if-ne p1, v0, :cond_1

    .line 6
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/vv/vv;->vv()Lcom/ss/android/downloadlib/addownload/vv/vv;

    move-result-object p1

    iget-object v0, p0, Lcom/ss/android/downloadlib/vv$1;->vv:Lcom/ss/android/downloadad/api/vv/m;

    invoke-virtual {p1, v0}, Lcom/ss/android/downloadlib/addownload/vv/vv;->vv(Lcom/ss/android/downloadad/api/vv/m;)V

    :cond_1
    return-void

    .line 7
    :cond_2
    iget-object p1, p0, Lcom/ss/android/downloadlib/vv$1;->m:Ljava/lang/String;

    iget-object v1, p0, Lcom/ss/android/downloadlib/vv$1;->vv:Lcom/ss/android/downloadad/api/vv/m;

    invoke-static {p1, v1}, Lcom/ss/android/downloadlib/m/vv;->vv(Ljava/lang/String;Lcom/ss/android/downloadad/api/vv/m;)Z

    move-result p1

    if-nez p1, :cond_3

    .line 8
    iget-object p1, p0, Lcom/ss/android/downloadlib/vv$1;->vv:Lcom/ss/android/downloadad/api/vv/m;

    invoke-virtual {p1}, Lcom/ss/android/downloadad/api/vv/m;->cq()I

    move-result p1

    if-ne p1, v0, :cond_3

    .line 9
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/vv/vv;->vv()Lcom/ss/android/downloadlib/addownload/vv/vv;

    move-result-object p1

    iget-object v0, p0, Lcom/ss/android/downloadlib/vv$1;->vv:Lcom/ss/android/downloadad/api/vv/m;

    invoke-virtual {p1, v0}, Lcom/ss/android/downloadlib/addownload/vv/vv;->vv(Lcom/ss/android/downloadad/api/vv/m;)V

    :cond_3
    return-void
.end method
