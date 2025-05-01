.class Lcom/join/mgps/activity/CreateEndGameCommitActivity$a;
.super Ljava/lang/Object;
.source "CreateEndGameCommitActivity.java"

# interfaces
.implements Lcom/join/android/app/common/http/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/CreateEndGameCommitActivity;->A0(Ljava/lang/String;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:I

.field final synthetic c:Lcom/join/mgps/activity/CreateEndGameCommitActivity;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/CreateEndGameCommitActivity;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/CreateEndGameCommitActivity$a;->c:Lcom/join/mgps/activity/CreateEndGameCommitActivity;

    iput p2, p0, Lcom/join/mgps/activity/CreateEndGameCommitActivity$a;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onRequestProgress(JJZLjava/lang/String;)V
    .locals 2

    if-eqz p5, :cond_1

    .line 1
    iget p1, p0, Lcom/join/mgps/activity/CreateEndGameCommitActivity$a;->b:I

    const/4 p2, 0x1

    if-ne p1, p2, :cond_0

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/CreateEndGameCommitActivity$a;->c:Lcom/join/mgps/activity/CreateEndGameCommitActivity;

    invoke-static {p1, p2}, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->f0(Lcom/join/mgps/activity/CreateEndGameCommitActivity;Z)Z

    goto :goto_0

    :cond_0
    const/4 p3, 0x2

    if-ne p1, p3, :cond_2

    .line 3
    iget-object p1, p0, Lcom/join/mgps/activity/CreateEndGameCommitActivity$a;->c:Lcom/join/mgps/activity/CreateEndGameCommitActivity;

    invoke-static {p1, p2}, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->g0(Lcom/join/mgps/activity/CreateEndGameCommitActivity;Z)Z

    goto :goto_0

    .line 4
    :cond_1
    iget-object p5, p0, Lcom/join/mgps/activity/CreateEndGameCommitActivity$a;->c:Lcom/join/mgps/activity/CreateEndGameCommitActivity;

    const-wide/16 v0, 0x64

    mul-long p1, p1, v0

    div-long/2addr p1, p3

    long-to-int p2, p1

    invoke-virtual {p5, p2}, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->w0(I)V

    :cond_2
    :goto_0
    return-void
.end method

.method public onUploadFailed(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/CreateEndGameCommitActivity$a;->c:Lcom/join/mgps/activity/CreateEndGameCommitActivity;

    invoke-virtual {v0, p1}, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->showToast(Ljava/lang/String;)V

    return-void
.end method
