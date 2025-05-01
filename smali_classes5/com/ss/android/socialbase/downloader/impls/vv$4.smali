.class Lcom/ss/android/socialbase/downloader/impls/vv$4;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/socialbase/downloader/impls/vv;->p(IZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic m:Lcom/ss/android/socialbase/downloader/impls/vv;

.field final synthetic vv:I


# direct methods
.method constructor <init>(Lcom/ss/android/socialbase/downloader/impls/vv;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/impls/vv$4;->m:Lcom/ss/android/socialbase/downloader/impls/vv;

    iput p2, p0, Lcom/ss/android/socialbase/downloader/impls/vv$4;->vv:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    invoke-static {}, Lcom/ss/android/socialbase/downloader/notification/m;->vv()Lcom/ss/android/socialbase/downloader/notification/m;

    move-result-object v0

    iget v1, p0, Lcom/ss/android/socialbase/downloader/impls/vv$4;->vv:I

    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/notification/m;->u(I)V

    return-void
.end method
