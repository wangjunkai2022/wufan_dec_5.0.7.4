.class Lcom/ss/android/socialbase/downloader/qv/n$m;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ss/android/socialbase/downloader/qv/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "m"
.end annotation


# instance fields
.field public m:J

.field final synthetic p:Lcom/ss/android/socialbase/downloader/qv/n;

.field public vv:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Lcom/ss/android/socialbase/downloader/qv/n;Ljava/lang/Runnable;J)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/qv/n$m;->p:Lcom/ss/android/socialbase/downloader/qv/n;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p2, p0, Lcom/ss/android/socialbase/downloader/qv/n$m;->vv:Ljava/lang/Runnable;

    .line 3
    iput-wide p3, p0, Lcom/ss/android/socialbase/downloader/qv/n$m;->m:J

    return-void
.end method
