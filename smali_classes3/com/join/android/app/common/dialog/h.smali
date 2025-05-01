.class public final synthetic Lcom/join/android/app/common/dialog/h;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lcom/join/android/app/common/dialog/LocalGameThreeDialog;

.field public final synthetic c:Lcom/github/snowdream/android/app/downloader/DownloadTask;


# direct methods
.method public synthetic constructor <init>(Lcom/join/android/app/common/dialog/LocalGameThreeDialog;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/join/android/app/common/dialog/h;->b:Lcom/join/android/app/common/dialog/LocalGameThreeDialog;

    iput-object p2, p0, Lcom/join/android/app/common/dialog/h;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/join/android/app/common/dialog/h;->b:Lcom/join/android/app/common/dialog/LocalGameThreeDialog;

    iget-object v1, p0, Lcom/join/android/app/common/dialog/h;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-static {v0, v1}, Lcom/join/android/app/common/dialog/LocalGameThreeDialog;->V(Lcom/join/android/app/common/dialog/LocalGameThreeDialog;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    return-void
.end method
