.class Lcom/join/mgps/Util/a0$d;
.super Ljava/lang/Object;
.source "DialogUtil.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/Util/a0;->K(Landroid/content/Context;Lcom/join/mgps/dto/CommonGameInfoBean;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Landroid/content/Context;

.field final synthetic c:Lcom/join/mgps/dto/CommonGameInfoBean;

.field final synthetic d:Lcom/join/mgps/customview/o;

.field final synthetic e:Lcom/join/mgps/Util/a0;


# direct methods
.method constructor <init>(Lcom/join/mgps/Util/a0;Landroid/content/Context;Lcom/join/mgps/dto/CommonGameInfoBean;Lcom/join/mgps/customview/o;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/Util/a0$d;->e:Lcom/join/mgps/Util/a0;

    iput-object p2, p0, Lcom/join/mgps/Util/a0$d;->b:Landroid/content/Context;

    iput-object p3, p0, Lcom/join/mgps/Util/a0$d;->c:Lcom/join/mgps/dto/CommonGameInfoBean;

    iput-object p4, p0, Lcom/join/mgps/Util/a0$d;->d:Lcom/join/mgps/customview/o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/join/mgps/Util/a0$d;->b:Landroid/content/Context;

    iget-object v0, p0, Lcom/join/mgps/Util/a0$d;->c:Lcom/join/mgps/dto/CommonGameInfoBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/CommonGameInfoBean;->getDownloadTask()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/join/mgps/Util/UtilsMy;->T3(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/Util/a0$d;->d:Lcom/join/mgps/customview/o;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/app/Dialog;->isShowing()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3
    iget-object p1, p0, Lcom/join/mgps/Util/a0$d;->d:Lcom/join/mgps/customview/o;

    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V

    :cond_0
    return-void
.end method
