.class Lcom/join/mgps/fragment/UserCenterFragment$c;
.super Ljava/lang/Object;
.source "UserCenterFragment.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/UserCenterFragment;->refreshViews()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/fragment/UserCenterFragment;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/UserCenterFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/UserCenterFragment$c;->b:Lcom/join/mgps/fragment/UserCenterFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object p1

    iget-object v0, p0, Lcom/join/mgps/fragment/UserCenterFragment$c;->b:Lcom/join/mgps/fragment/UserCenterFragment;

    invoke-static {v0}, Lcom/join/mgps/fragment/UserCenterFragment;->W(Lcom/join/mgps/fragment/UserCenterFragment;)Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/join/mgps/Util/IntentUtil;->goSvip(Landroid/content/Context;)V

    return-void
.end method
