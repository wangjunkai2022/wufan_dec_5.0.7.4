.class public final synthetic Lcom/join/mgps/adapter/s2;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:Lcom/join/mgps/adapter/MyGameAdapterV1;

.field public final synthetic c:Lcom/join/mgps/base/BaseViewHolder;

.field public final synthetic d:Lcom/github/snowdream/android/app/downloader/DownloadTask;


# direct methods
.method public synthetic constructor <init>(Lcom/join/mgps/adapter/MyGameAdapterV1;Lcom/join/mgps/base/BaseViewHolder;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/join/mgps/adapter/s2;->b:Lcom/join/mgps/adapter/MyGameAdapterV1;

    iput-object p2, p0, Lcom/join/mgps/adapter/s2;->c:Lcom/join/mgps/base/BaseViewHolder;

    iput-object p3, p0, Lcom/join/mgps/adapter/s2;->d:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    iget-object v0, p0, Lcom/join/mgps/adapter/s2;->b:Lcom/join/mgps/adapter/MyGameAdapterV1;

    iget-object v1, p0, Lcom/join/mgps/adapter/s2;->c:Lcom/join/mgps/base/BaseViewHolder;

    iget-object v2, p0, Lcom/join/mgps/adapter/s2;->d:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-static {v0, v1, v2, p1}, Lcom/join/mgps/adapter/MyGameAdapterV1;->m(Lcom/join/mgps/adapter/MyGameAdapterV1;Lcom/join/mgps/base/BaseViewHolder;Lcom/github/snowdream/android/app/downloader/DownloadTask;Landroid/view/View;)V

    return-void
.end method
