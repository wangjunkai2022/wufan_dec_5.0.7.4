.class Lcom/join/mgps/adapter/MyGameAdapterV1$c;
.super Ljava/lang/Object;
.source "MyGameAdapterV1.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/adapter/MyGameAdapterV1;->P(Lcom/join/mgps/base/BaseViewHolder;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/github/snowdream/android/app/downloader/DownloadTask;

.field final synthetic c:Lcom/join/mgps/base/BaseViewHolder;

.field final synthetic d:Lcom/join/mgps/adapter/MyGameAdapterV1;


# direct methods
.method constructor <init>(Lcom/join/mgps/adapter/MyGameAdapterV1;Lcom/github/snowdream/android/app/downloader/DownloadTask;Lcom/join/mgps/base/BaseViewHolder;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/adapter/MyGameAdapterV1$c;->d:Lcom/join/mgps/adapter/MyGameAdapterV1;

    iput-object p2, p0, Lcom/join/mgps/adapter/MyGameAdapterV1$c;->b:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    iput-object p3, p0, Lcom/join/mgps/adapter/MyGameAdapterV1$c;->c:Lcom/join/mgps/base/BaseViewHolder;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/join/mgps/adapter/MyGameAdapterV1$c;->b:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getAd_info()Lcom/join/mgps/dto/CommonGameInfoBean;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 2
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/adapter/MyGameAdapterV1$c;->d:Lcom/join/mgps/adapter/MyGameAdapterV1;

    iget-object v1, v1, Lcom/join/mgps/adapter/MyGameAdapterV1;->d:Landroid/content/Context;

    invoke-virtual {p1}, Lcom/join/mgps/dto/CommonGameInfoBean;->getIntentDataBean()Lcom/join/mgps/Util/IntentDateBean;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lcom/join/mgps/Util/IntentUtil;->intentActivity(Landroid/content/Context;Lcom/join/mgps/Util/IntentDateBean;)V

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/adapter/MyGameAdapterV1$c;->d:Lcom/join/mgps/adapter/MyGameAdapterV1;

    iget-object v0, p0, Lcom/join/mgps/adapter/MyGameAdapterV1$c;->c:Lcom/join/mgps/base/BaseViewHolder;

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Lcom/join/mgps/adapter/MyGameAdapterV1;->o(Lcom/join/mgps/adapter/MyGameAdapterV1;Lcom/join/mgps/base/BaseViewHolder;Z)V

    .line 4
    iget-object p1, p0, Lcom/join/mgps/adapter/MyGameAdapterV1$c;->b:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {p1, v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setAd_info_switch(I)V

    .line 5
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object p1

    iget-object v0, p0, Lcom/join/mgps/adapter/MyGameAdapterV1$c;->b:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {p1, v0}, Lp1/b;->m(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
