.class Lcom/join/mgps/activity/MyGamePapaFragmentV2_$l;
.super Ljava/lang/Object;
.source "MyGamePapaFragmentV2_.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/MyGamePapaFragmentV2_;->J1(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/github/snowdream/android/app/downloader/DownloadTask;

.field final synthetic c:Lcom/join/mgps/activity/MyGamePapaFragmentV2_;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/MyGamePapaFragmentV2_;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/MyGamePapaFragmentV2_$l;->c:Lcom/join/mgps/activity/MyGamePapaFragmentV2_;

    iput-object p2, p0, Lcom/join/mgps/activity/MyGamePapaFragmentV2_$l;->b:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragmentV2_$l;->c:Lcom/join/mgps/activity/MyGamePapaFragmentV2_;

    iget-object v1, p0, Lcom/join/mgps/activity/MyGamePapaFragmentV2_$l;->b:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-static {v0, v1}, Lcom/join/mgps/activity/MyGamePapaFragmentV2_;->Z1(Lcom/join/mgps/activity/MyGamePapaFragmentV2_;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    return-void
.end method
