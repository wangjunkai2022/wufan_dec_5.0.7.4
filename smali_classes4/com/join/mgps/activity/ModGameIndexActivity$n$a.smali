.class Lcom/join/mgps/activity/ModGameIndexActivity$n$a;
.super Ljava/lang/Object;
.source "ModGameIndexActivity.java"

# interfaces
.implements Lcom/join/mgps/activity/arena/GameRoomActivity$x;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/ModGameIndexActivity$n;->a(Lcom/join/mgps/dialog/f1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/dialog/f1;

.field final synthetic b:Lcom/join/mgps/activity/ModGameIndexActivity$n;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/ModGameIndexActivity$n;Lcom/join/mgps/dialog/f1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity$n$a;->b:Lcom/join/mgps/activity/ModGameIndexActivity$n;

    iput-object p2, p0, Lcom/join/mgps/activity/ModGameIndexActivity$n$a;->a:Lcom/join/mgps/dialog/f1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFail(I)V
    .locals 0

    return-void
.end method

.method public onSuccess(II)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity$n$a;->b:Lcom/join/mgps/activity/ModGameIndexActivity$n;

    iget-object p1, p1, Lcom/join/mgps/activity/ModGameIndexActivity$n;->a:Lcom/join/mgps/activity/ModGameIndexActivity;

    invoke-static {p1}, Lcom/join/mgps/activity/ModGameIndexActivity;->p0(Lcom/join/mgps/activity/ModGameIndexActivity;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object p2

    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity$n$a;->b:Lcom/join/mgps/activity/ModGameIndexActivity$n;

    iget-object v0, v0, Lcom/join/mgps/activity/ModGameIndexActivity$n;->a:Lcom/join/mgps/activity/ModGameIndexActivity;

    iget-object v0, v0, Lcom/join/mgps/activity/ModGameIndexActivity;->P:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {p1, p2, v0}, Lcom/join/mgps/activity/ModGameIndexActivity;->J1(Lcom/github/snowdream/android/app/downloader/DownloadTask;Lcom/join/mgps/dto/GamedetialModleFourBean;)V

    return-void
.end method

.method public onSuccess(IILcom/papa91/arc/bean/ButtonBean;)V
    .locals 0

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity$n$a;->a:Lcom/join/mgps/dialog/f1;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/app/Dialog;->isShowing()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3
    iget-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity$n$a;->a:Lcom/join/mgps/dialog/f1;

    invoke-virtual {p1}, Lcom/join/mgps/dialog/p;->dismiss()V

    :cond_0
    return-void
.end method
