.class Lcom/join/mgps/Util/a0$e;
.super Ljava/lang/Object;
.source "DialogUtil.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/Util/a0;->d0(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Landroid/content/Context;

.field final synthetic c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

.field final synthetic d:Lcom/join/mgps/customview/o;

.field final synthetic e:Lcom/join/mgps/Util/a0;


# direct methods
.method constructor <init>(Lcom/join/mgps/Util/a0;Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;Lcom/join/mgps/customview/o;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/Util/a0$e;->e:Lcom/join/mgps/Util/a0;

    iput-object p2, p0, Lcom/join/mgps/Util/a0$e;->b:Landroid/content/Context;

    iput-object p3, p0, Lcom/join/mgps/Util/a0$e;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    iput-object p4, p0, Lcom/join/mgps/Util/a0$e;->d:Lcom/join/mgps/customview/o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/join/mgps/Util/a0$e;->b:Landroid/content/Context;

    invoke-static {p1}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 2
    iget-object p1, p0, Lcom/join/mgps/Util/a0$e;->b:Landroid/content/Context;

    invoke-static {p1}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object p1

    const-string/jumbo v0, "\u65e0\u7f51\u7edc\u8fde\u63a5"

    invoke-virtual {p1, v0}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    return-void

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/Util/a0$e;->b:Landroid/content/Context;

    iget-object v0, p0, Lcom/join/mgps/Util/a0$e;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-static {p1, v0}, Lcom/join/mgps/Util/UtilsMy;->E2(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    .line 4
    iget-object p1, p0, Lcom/join/mgps/Util/a0$e;->d:Lcom/join/mgps/customview/o;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/app/Dialog;->isShowing()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 5
    iget-object p1, p0, Lcom/join/mgps/Util/a0$e;->d:Lcom/join/mgps/customview/o;

    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V

    :cond_1
    return-void
.end method
