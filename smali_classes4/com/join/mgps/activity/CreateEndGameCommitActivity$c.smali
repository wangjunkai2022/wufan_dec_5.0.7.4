.class Lcom/join/mgps/activity/CreateEndGameCommitActivity$c;
.super Ljava/lang/Object;
.source "CreateEndGameCommitActivity.java"

# interfaces
.implements Lcom/vincent/videocompressor/h$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/CreateEndGameCommitActivity;->k0(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/activity/CreateEndGameCommitActivity;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/CreateEndGameCommitActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/CreateEndGameCommitActivity$c;->a:Lcom/join/mgps/activity/CreateEndGameCommitActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFail()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/CreateEndGameCommitActivity$c;->a:Lcom/join/mgps/activity/CreateEndGameCommitActivity;

    const-string v1, "\u538b\u7f29\u5931\u8d25\uff0c\u8bf7\u91cd\u8bd5"

    invoke-virtual {v0, v1}, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->showToast(Ljava/lang/String;)V

    return-void
.end method

.method public onProgress(F)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/CreateEndGameCommitActivity$c;->a:Lcom/join/mgps/activity/CreateEndGameCommitActivity;

    float-to-int p1, p1

    invoke-virtual {v0, p1}, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->v0(I)V

    return-void
.end method

.method public onStart()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/CreateEndGameCommitActivity$c;->a:Lcom/join/mgps/activity/CreateEndGameCommitActivity;

    invoke-virtual {v0}, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->o0()V

    return-void
.end method

.method public onSuccess()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/CreateEndGameCommitActivity$c;->a:Lcom/join/mgps/activity/CreateEndGameCommitActivity;

    invoke-virtual {v0}, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->p0()V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/CreateEndGameCommitActivity$c;->a:Lcom/join/mgps/activity/CreateEndGameCommitActivity;

    const-string v1, "\u538b\u7f29\u5b8c\u6210"

    invoke-virtual {v0, v1}, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->showToast(Ljava/lang/String;)V

    .line 3
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\u538b\u7f29\u5b8c\u6210:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/join/mgps/activity/CreateEndGameCommitActivity$c;->a:Lcom/join/mgps/activity/CreateEndGameCommitActivity;

    iget-object v2, v2, Lcom/join/mgps/activity/CreateEndGameCommitActivity;->m:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    return-void
.end method
