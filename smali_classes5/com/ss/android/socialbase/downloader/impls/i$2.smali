.class Lcom/ss/android/socialbase/downloader/impls/i$2;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/ss/android/socialbase/downloader/downloader/p$vv$vv;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/socialbase/downloader/impls/i;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic vv:Lcom/ss/android/socialbase/downloader/impls/i;


# direct methods
.method constructor <init>(Lcom/ss/android/socialbase/downloader/impls/i;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/impls/i$2;->vv:Lcom/ss/android/socialbase/downloader/impls/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public vv()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/i$2;->vv:Lcom/ss/android/socialbase/downloader/impls/i;

    new-instance v1, Lcom/ss/android/socialbase/downloader/m/o;

    invoke-direct {v1}, Lcom/ss/android/socialbase/downloader/m/o;-><init>()V

    invoke-static {v0, v1}, Lcom/ss/android/socialbase/downloader/impls/i;->vv(Lcom/ss/android/socialbase/downloader/impls/i;Lcom/ss/android/socialbase/downloader/downloader/x;)Lcom/ss/android/socialbase/downloader/downloader/x;

    return-void
.end method
