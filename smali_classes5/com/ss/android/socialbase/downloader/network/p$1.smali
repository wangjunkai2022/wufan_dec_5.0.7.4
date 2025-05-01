.class Lcom/ss/android/socialbase/downloader/network/p$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/socialbase/downloader/network/p;->vv(Ljava/lang/String;Lcom/ss/android/socialbase/downloader/network/p$vv;J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic i:Lcom/ss/android/socialbase/downloader/network/p;

.field final synthetic m:Lcom/ss/android/socialbase/downloader/network/p$vv;

.field final synthetic p:J

.field final synthetic vv:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/ss/android/socialbase/downloader/network/p;Ljava/lang/String;Lcom/ss/android/socialbase/downloader/network/p$vv;J)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/network/p$1;->i:Lcom/ss/android/socialbase/downloader/network/p;

    iput-object p2, p0, Lcom/ss/android/socialbase/downloader/network/p$1;->vv:Ljava/lang/String;

    iput-object p3, p0, Lcom/ss/android/socialbase/downloader/network/p$1;->m:Lcom/ss/android/socialbase/downloader/network/p$vv;

    iput-wide p4, p0, Lcom/ss/android/socialbase/downloader/network/p$1;->p:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/network/p$1;->i:Lcom/ss/android/socialbase/downloader/network/p;

    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/network/p$1;->vv:Ljava/lang/String;

    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/network/p$1;->m:Lcom/ss/android/socialbase/downloader/network/p$vv;

    iget-wide v3, p0, Lcom/ss/android/socialbase/downloader/network/p$1;->p:J

    invoke-static {v0, v1, v2, v3, v4}, Lcom/ss/android/socialbase/downloader/network/p;->vv(Lcom/ss/android/socialbase/downloader/network/p;Ljava/lang/String;Lcom/ss/android/socialbase/downloader/network/p$vv;J)V

    return-void
.end method
