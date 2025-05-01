.class Lcom/join/mgps/activity/MyGamePapaLocalFragment_$f;
.super Ljava/lang/Object;
.source "MyGamePapaLocalFragment_.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/MyGamePapaLocalFragment_;->e1(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/github/snowdream/android/app/downloader/DownloadTask;

.field final synthetic c:Lcom/join/mgps/activity/MyGamePapaLocalFragment_;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/MyGamePapaLocalFragment_;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/MyGamePapaLocalFragment_$f;->c:Lcom/join/mgps/activity/MyGamePapaLocalFragment_;

    iput-object p2, p0, Lcom/join/mgps/activity/MyGamePapaLocalFragment_$f;->b:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/MyGamePapaLocalFragment_$f;->c:Lcom/join/mgps/activity/MyGamePapaLocalFragment_;

    iget-object v1, p0, Lcom/join/mgps/activity/MyGamePapaLocalFragment_$f;->b:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-static {v0, v1}, Lcom/join/mgps/activity/MyGamePapaLocalFragment_;->t1(Lcom/join/mgps/activity/MyGamePapaLocalFragment_;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    return-void
.end method
