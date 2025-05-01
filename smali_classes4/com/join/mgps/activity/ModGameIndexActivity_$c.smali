.class Lcom/join/mgps/activity/ModGameIndexActivity_$c;
.super Ljava/lang/Object;
.source "ModGameIndexActivity_.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/ModGameIndexActivity_;->Z0(ZLcom/github/snowdream/android/app/downloader/DownloadTask;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Z

.field final synthetic c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

.field final synthetic d:Lcom/join/mgps/activity/ModGameIndexActivity_;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/ModGameIndexActivity_;ZLcom/github/snowdream/android/app/downloader/DownloadTask;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity_$c;->d:Lcom/join/mgps/activity/ModGameIndexActivity_;

    iput-boolean p2, p0, Lcom/join/mgps/activity/ModGameIndexActivity_$c;->b:Z

    iput-object p3, p0, Lcom/join/mgps/activity/ModGameIndexActivity_$c;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity_$c;->d:Lcom/join/mgps/activity/ModGameIndexActivity_;

    iget-boolean v1, p0, Lcom/join/mgps/activity/ModGameIndexActivity_$c;->b:Z

    iget-object v2, p0, Lcom/join/mgps/activity/ModGameIndexActivity_$c;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-static {v0, v1, v2}, Lcom/join/mgps/activity/ModGameIndexActivity_;->W1(Lcom/join/mgps/activity/ModGameIndexActivity_;ZLcom/github/snowdream/android/app/downloader/DownloadTask;)V

    return-void
.end method
