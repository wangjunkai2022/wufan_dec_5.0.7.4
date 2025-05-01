.class Lcom/join/mgps/fragment/GmaeFormPostFragment_$g;
.super Ljava/lang/Object;
.source "GmaeFormPostFragment_.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/GmaeFormPostFragment_;->v1(Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/github/snowdream/android/app/downloader/DownloadTask;

.field final synthetic c:I

.field final synthetic d:Lcom/join/mgps/fragment/GmaeFormPostFragment_;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/GmaeFormPostFragment_;Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/GmaeFormPostFragment_$g;->d:Lcom/join/mgps/fragment/GmaeFormPostFragment_;

    iput-object p2, p0, Lcom/join/mgps/fragment/GmaeFormPostFragment_$g;->b:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    iput p3, p0, Lcom/join/mgps/fragment/GmaeFormPostFragment_$g;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/GmaeFormPostFragment_$g;->d:Lcom/join/mgps/fragment/GmaeFormPostFragment_;

    iget-object v1, p0, Lcom/join/mgps/fragment/GmaeFormPostFragment_$g;->b:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    iget v2, p0, Lcom/join/mgps/fragment/GmaeFormPostFragment_$g;->c:I

    invoke-static {v0, v1, v2}, Lcom/join/mgps/fragment/GmaeFormPostFragment_;->G1(Lcom/join/mgps/fragment/GmaeFormPostFragment_;Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V

    return-void
.end method
