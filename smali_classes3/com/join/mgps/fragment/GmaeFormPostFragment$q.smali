.class Lcom/join/mgps/fragment/GmaeFormPostFragment$q;
.super Ljava/lang/Object;
.source "GmaeFormPostFragment.java"

# interfaces
.implements Lcom/join/mgps/customview/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/GmaeFormPostFragment;->w0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/fragment/GmaeFormPostFragment;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/GmaeFormPostFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/GmaeFormPostFragment$q;->b:Lcom/join/mgps/fragment/GmaeFormPostFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onRefresh()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/GmaeFormPostFragment$q;->b:Lcom/join/mgps/fragment/GmaeFormPostFragment;

    iget-object v0, v0, Lcom/join/mgps/fragment/GmaeFormPostFragment;->z:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/fragment/GmaeFormPostFragment$q;->b:Lcom/join/mgps/fragment/GmaeFormPostFragment;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/join/mgps/fragment/GmaeFormPostFragment;->X(Lcom/join/mgps/fragment/GmaeFormPostFragment;I)I

    .line 3
    iget-object v0, p0, Lcom/join/mgps/fragment/GmaeFormPostFragment$q;->b:Lcom/join/mgps/fragment/GmaeFormPostFragment;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/join/mgps/fragment/GmaeFormPostFragment;->A0(I)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/fragment/GmaeFormPostFragment$q;->b:Lcom/join/mgps/fragment/GmaeFormPostFragment;

    const v1, 0x7f100299

    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/fragment/GmaeFormPostFragment;->showToast(Ljava/lang/String;)V

    .line 5
    iget-object v0, p0, Lcom/join/mgps/fragment/GmaeFormPostFragment$q;->b:Lcom/join/mgps/fragment/GmaeFormPostFragment;

    const/16 v1, 0x11

    invoke-virtual {v0, v1}, Lcom/join/mgps/fragment/GmaeFormPostFragment;->j0(I)V

    .line 6
    iget-object v0, p0, Lcom/join/mgps/fragment/GmaeFormPostFragment$q;->b:Lcom/join/mgps/fragment/GmaeFormPostFragment;

    invoke-virtual {v0}, Lcom/join/mgps/fragment/GmaeFormPostFragment;->q1()V

    :goto_0
    return-void
.end method
