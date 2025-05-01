.class public final synthetic Lcom/join/android/app/common/servcie/o;
.super Ljava/lang/Object;

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic b:Lcom/join/android/app/common/servcie/DownloadService;

.field public final synthetic c:Lcom/github/snowdream/android/app/downloader/DownloadTask;


# direct methods
.method public synthetic constructor <init>(Lcom/join/android/app/common/servcie/DownloadService;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/join/android/app/common/servcie/o;->b:Lcom/join/android/app/common/servcie/DownloadService;

    iput-object p2, p0, Lcom/join/android/app/common/servcie/o;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/join/android/app/common/servcie/o;->b:Lcom/join/android/app/common/servcie/DownloadService;

    iget-object v1, p0, Lcom/join/android/app/common/servcie/o;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, v1, p1}, Lcom/join/android/app/common/servcie/DownloadService;->f(Lcom/join/android/app/common/servcie/DownloadService;Lcom/github/snowdream/android/app/downloader/DownloadTask;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
