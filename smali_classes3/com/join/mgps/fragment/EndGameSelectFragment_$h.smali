.class public Lcom/join/mgps/fragment/EndGameSelectFragment_$h;
.super Lorg/androidannotations/api/builder/d;
.source "EndGameSelectFragment_.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/fragment/EndGameSelectFragment_;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "h"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lorg/androidannotations/api/builder/d<",
        "Lcom/join/mgps/fragment/EndGameSelectFragment_$h;",
        "Lcom/join/mgps/fragment/EndGameSelectFragment;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/androidannotations/api/builder/d;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/join/mgps/fragment/EndGameSelectFragment;
    .locals 2

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/EndGameSelectFragment_;

    invoke-direct {v0}, Lcom/join/mgps/fragment/EndGameSelectFragment_;-><init>()V

    .line 2
    iget-object v1, p0, Lorg/androidannotations/api/builder/d;->args:Landroid/os/Bundle;

    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    return-object v0
.end method

.method public b(I)Lcom/join/mgps/fragment/EndGameSelectFragment_$h;
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/androidannotations/api/builder/d;->args:Landroid/os/Bundle;

    const-string v1, "modelType"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    return-object p0
.end method

.method public bridge synthetic build()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/fragment/EndGameSelectFragment_$h;->a()Lcom/join/mgps/fragment/EndGameSelectFragment;

    move-result-object v0

    return-object v0
.end method
