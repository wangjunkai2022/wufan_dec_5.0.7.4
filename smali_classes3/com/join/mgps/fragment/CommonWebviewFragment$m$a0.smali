.class Lcom/join/mgps/fragment/CommonWebviewFragment$m$a0;
.super Ljava/lang/Object;
.source "CommonWebviewFragment.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/CommonWebviewFragment$m;->goQQGroup(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lcom/join/mgps/fragment/CommonWebviewFragment$m;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/CommonWebviewFragment$m;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment$m$a0;->c:Lcom/join/mgps/fragment/CommonWebviewFragment$m;

    iput-object p2, p0, Lcom/join/mgps/fragment/CommonWebviewFragment$m$a0;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    :try_start_0
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment$m$a0;->c:Lcom/join/mgps/fragment/CommonWebviewFragment$m;

    iget-object v1, v1, Lcom/join/mgps/fragment/CommonWebviewFragment$m;->a:Lcom/join/mgps/fragment/CommonWebviewFragment;

    invoke-static {v1}, Lcom/join/mgps/fragment/CommonWebviewFragment;->q0(Lcom/join/mgps/fragment/CommonWebviewFragment;)Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/join/mgps/fragment/CommonWebviewFragment$m$a0;->b:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/join/mgps/Util/IntentUtil;->goQQGroup(Landroid/content/Context;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 2
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method
