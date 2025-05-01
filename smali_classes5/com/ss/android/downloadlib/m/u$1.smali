.class final Lcom/ss/android/downloadlib/m/u$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/ss/android/socialbase/downloader/vv/vv$vv;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/downloadlib/m/u;->vv(Lcom/ss/android/downloadad/api/vv/m;Lcom/ss/android/downloadlib/m/qv;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic m:J

.field final synthetic p:Lcom/ss/android/downloadlib/m/qv;

.field final synthetic vv:Lcom/ss/android/downloadad/api/vv/m;


# direct methods
.method constructor <init>(Lcom/ss/android/downloadad/api/vv/m;JLcom/ss/android/downloadlib/m/qv;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ss/android/downloadlib/m/u$1;->vv:Lcom/ss/android/downloadad/api/vv/m;

    iput-wide p2, p0, Lcom/ss/android/downloadlib/m/u$1;->m:J

    iput-object p4, p0, Lcom/ss/android/downloadlib/m/u$1;->p:Lcom/ss/android/downloadlib/m/qv;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public m()V
    .locals 2

    .line 1
    invoke-static {}, Lcom/ss/android/socialbase/downloader/vv/vv;->vv()Lcom/ss/android/socialbase/downloader/vv/vv;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/ss/android/socialbase/downloader/vv/vv;->m(Lcom/ss/android/socialbase/downloader/vv/vv$vv;)V

    .line 2
    invoke-static {}, Lcom/ss/android/downloadlib/i;->vv()Lcom/ss/android/downloadlib/i;

    move-result-object v0

    new-instance v1, Lcom/ss/android/downloadlib/m/u$1$1;

    invoke-direct {v1, p0}, Lcom/ss/android/downloadlib/m/u$1$1;-><init>(Lcom/ss/android/downloadlib/m/u$1;)V

    invoke-virtual {v0, v1}, Lcom/ss/android/downloadlib/i;->vv(Ljava/lang/Runnable;)V

    return-void
.end method

.method public p()V
    .locals 0

    return-void
.end method
