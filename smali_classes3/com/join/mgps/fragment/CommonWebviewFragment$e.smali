.class Lcom/join/mgps/fragment/CommonWebviewFragment$e;
.super Ljava/lang/Object;
.source "CommonWebviewFragment.java"

# interfaces
.implements Lcom/join/mgps/activity/posting/PostingActivity$m;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/fragment/CommonWebviewFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic f:Lcom/join/mgps/fragment/CommonWebviewFragment;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/CommonWebviewFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment$e;->f:Lcom/join/mgps/fragment/CommonWebviewFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 0

    return-void
.end method

.method public b(I)V
    .locals 0

    return-void
.end method

.method public c(Lcom/join/mgps/dto/GroupInfoBean;)V
    .locals 0

    return-void
.end method

.method public d(I)V
    .locals 0

    return-void
.end method

.method public e(I)V
    .locals 1

    const/16 v0, 0x1103

    if-eq p1, v0, :cond_0

    goto :goto_0

    .line 1
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment$e;->f:Lcom/join/mgps/fragment/CommonWebviewFragment;

    invoke-static {p1}, Lcom/join/mgps/fragment/CommonWebviewFragment;->W(Lcom/join/mgps/fragment/CommonWebviewFragment;)Lcom/join/mgps/dialog/y1;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 2
    iget-object p1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment$e;->f:Lcom/join/mgps/fragment/CommonWebviewFragment;

    invoke-static {p1}, Lcom/join/mgps/fragment/CommonWebviewFragment;->W(Lcom/join/mgps/fragment/CommonWebviewFragment;)Lcom/join/mgps/dialog/y1;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/mgps/dialog/y1;->c()V

    :cond_1
    :goto_0
    return-void
.end method
