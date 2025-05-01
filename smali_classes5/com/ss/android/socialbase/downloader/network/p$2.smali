.class Lcom/ss/android/socialbase/downloader/network/p$2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/socialbase/downloader/network/p;->m(Ljava/lang/String;Lcom/ss/android/socialbase/downloader/network/p$vv;J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic i:Lcom/ss/android/socialbase/downloader/network/p;

.field final synthetic m:Ljava/lang/String;

.field final synthetic p:Lcom/ss/android/socialbase/downloader/network/p$m;

.field final synthetic vv:Lcom/ss/android/socialbase/downloader/network/p$vv;


# direct methods
.method constructor <init>(Lcom/ss/android/socialbase/downloader/network/p;Lcom/ss/android/socialbase/downloader/network/p$vv;Ljava/lang/String;Lcom/ss/android/socialbase/downloader/network/p$m;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/network/p$2;->i:Lcom/ss/android/socialbase/downloader/network/p;

    iput-object p2, p0, Lcom/ss/android/socialbase/downloader/network/p$2;->vv:Lcom/ss/android/socialbase/downloader/network/p$vv;

    iput-object p3, p0, Lcom/ss/android/socialbase/downloader/network/p$2;->m:Ljava/lang/String;

    iput-object p4, p0, Lcom/ss/android/socialbase/downloader/network/p$2;->p:Lcom/ss/android/socialbase/downloader/network/p$m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/network/p$2;->vv:Lcom/ss/android/socialbase/downloader/network/p$vv;

    if-eqz v0, :cond_1

    .line 2
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/network/p$2;->m:Ljava/lang/String;

    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/network/p$2;->p:Lcom/ss/android/socialbase/downloader/network/p$m;

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    iget-object v2, v2, Lcom/ss/android/socialbase/downloader/network/p$m;->vv:Ljava/util/List;

    :goto_0
    invoke-interface {v0, v1, v2}, Lcom/ss/android/socialbase/downloader/network/p$vv;->vv(Ljava/lang/String;Ljava/util/List;)V

    :cond_1
    return-void
.end method
