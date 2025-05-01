.class Lcom/join/mgps/activity/EndGameLaunchActivity$f;
.super Ljava/lang/Object;
.source "EndGameLaunchActivity.java"

# interfaces
.implements Lcom/github/snowdream/android/app/downloader/b$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/EndGameLaunchActivity;->u0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/activity/EndGameLaunchActivity;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/EndGameLaunchActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/EndGameLaunchActivity$f;->a:Lcom/join/mgps/activity/EndGameLaunchActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/join/mgps/activity/EndGameLaunchActivity$f;->a:Lcom/join/mgps/activity/EndGameLaunchActivity;

    const-string v0, "\u4e0b\u8f7d\u5b58\u6863\u5931\u8d25"

    invoke-virtual {p1, v0}, Lcom/join/mgps/activity/EndGameLaunchActivity;->showTost(Ljava/lang/String;)V

    return-void
.end method

.method public onFinish(Ljava/lang/String;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/join/mgps/activity/EndGameLaunchActivity$f;->a:Lcom/join/mgps/activity/EndGameLaunchActivity;

    invoke-virtual {p1}, Lcom/join/mgps/activity/EndGameLaunchActivity;->y0()V

    return-void
.end method

.method public onProgress(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/join/mgps/activity/EndGameLaunchActivity$f;->a:Lcom/join/mgps/activity/EndGameLaunchActivity;

    mul-int/lit8 p2, p2, 0x14

    div-int/lit8 p2, p2, 0x64

    add-int/lit8 p2, p2, 0x50

    invoke-virtual {p1, p2}, Lcom/join/mgps/activity/EndGameLaunchActivity;->w0(I)V

    return-void
.end method

.method public onStart(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public onStop(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public onWait(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public updateSize(Ljava/lang/String;J)V
    .locals 0

    return-void
.end method
