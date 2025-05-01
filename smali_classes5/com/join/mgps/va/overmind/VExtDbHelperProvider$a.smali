.class Lcom/join/mgps/va/overmind/VExtDbHelperProvider$a;
.super Ljava/lang/Object;
.source "VExtDbHelperProvider.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/va/overmind/VExtDbHelperProvider;->call(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/github/snowdream/android/app/downloader/DownloadTask;

.field final synthetic c:I

.field final synthetic d:Lcom/join/mgps/va/overmind/VExtDbHelperProvider;


# direct methods
.method constructor <init>(Lcom/join/mgps/va/overmind/VExtDbHelperProvider;Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/va/overmind/VExtDbHelperProvider$a;->d:Lcom/join/mgps/va/overmind/VExtDbHelperProvider;

    iput-object p2, p0, Lcom/join/mgps/va/overmind/VExtDbHelperProvider$a;->b:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    iput p3, p0, Lcom/join/mgps/va/overmind/VExtDbHelperProvider$a;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/join/mgps/va/overmind/VExtDbHelperProvider$a;->d:Lcom/join/mgps/va/overmind/VExtDbHelperProvider;

    invoke-virtual {v0}, Landroid/content/ContentProvider;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v1

    iget-object v0, p0, Lcom/join/mgps/va/overmind/VExtDbHelperProvider$a;->b:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v2

    iget-object v0, p0, Lcom/join/mgps/va/overmind/VExtDbHelperProvider$a;->d:Lcom/join/mgps/va/overmind/VExtDbHelperProvider;

    invoke-virtual {v0}, Landroid/content/ContentProvider;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object v3

    iget v4, p0, Lcom/join/mgps/va/overmind/VExtDbHelperProvider$a;->c:I

    iget-object v0, p0, Lcom/join/mgps/va/overmind/VExtDbHelperProvider$a;->b:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->get_from()I

    move-result v5

    iget-object v0, p0, Lcom/join/mgps/va/overmind/VExtDbHelperProvider$a;->b:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->get_from_type()I

    move-result v6

    iget-object v0, p0, Lcom/join/mgps/va/overmind/VExtDbHelperProvider$a;->b:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getExt()Ljava/lang/String;

    move-result-object v7

    invoke-virtual/range {v1 .. v7}, Lcom/papa/sim/statistic/p;->m2(Ljava/lang/String;Ljava/lang/String;IIILjava/lang/String;)V

    return-void
.end method
