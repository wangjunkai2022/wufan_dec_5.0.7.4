.class Lcom/join/mgps/fragment/CommonWebviewFragment$m$v;
.super Ljava/lang/Object;
.source "CommonWebviewFragment.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/CommonWebviewFragment$m;->openAction(Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Lcom/join/mgps/fragment/CommonWebviewFragment$m;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/CommonWebviewFragment$m;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment$m$v;->d:Lcom/join/mgps/fragment/CommonWebviewFragment$m;

    iput-object p2, p0, Lcom/join/mgps/fragment/CommonWebviewFragment$m$v;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/join/mgps/fragment/CommonWebviewFragment$m$v;->c:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment$m$v;->d:Lcom/join/mgps/fragment/CommonWebviewFragment$m;

    iget-object v0, v0, Lcom/join/mgps/fragment/CommonWebviewFragment$m;->a:Lcom/join/mgps/fragment/CommonWebviewFragment;

    invoke-static {v0}, Lcom/join/mgps/fragment/CommonWebviewFragment;->q0(Lcom/join/mgps/fragment/CommonWebviewFragment;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment$m$v;->b:Ljava/lang/String;

    iget-object v2, p0, Lcom/join/mgps/fragment/CommonWebviewFragment$m$v;->c:Ljava/lang/String;

    iget-object v3, p0, Lcom/join/mgps/fragment/CommonWebviewFragment$m$v;->d:Lcom/join/mgps/fragment/CommonWebviewFragment$m;

    iget-object v3, v3, Lcom/join/mgps/fragment/CommonWebviewFragment$m;->a:Lcom/join/mgps/fragment/CommonWebviewFragment;

    invoke-static {v3}, Lcom/join/mgps/fragment/CommonWebviewFragment;->q0(Lcom/join/mgps/fragment/CommonWebviewFragment;)Landroid/content/Context;

    move-result-object v3

    invoke-static {v3}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v3

    invoke-virtual {v3}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Lcom/papa/sim/statistic/p;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
