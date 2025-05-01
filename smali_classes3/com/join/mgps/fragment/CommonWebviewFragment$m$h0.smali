.class Lcom/join/mgps/fragment/CommonWebviewFragment$m$h0;
.super Ljava/lang/Object;
.source "CommonWebviewFragment.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/CommonWebviewFragment$m;->goBackUrl(Ljava/lang/String;)V
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
    iput-object p1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment$m$h0;->c:Lcom/join/mgps/fragment/CommonWebviewFragment$m;

    iput-object p2, p0, Lcom/join/mgps/fragment/CommonWebviewFragment$m$h0;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment$m$h0;->b:Ljava/lang/String;

    const-string v1, ""

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment$m$h0;->c:Lcom/join/mgps/fragment/CommonWebviewFragment$m;

    iget-object v0, v0, Lcom/join/mgps/fragment/CommonWebviewFragment$m;->a:Lcom/join/mgps/fragment/CommonWebviewFragment;

    iget-object v0, v0, Lcom/join/mgps/fragment/CommonWebviewFragment;->i:Lcom/join/mgps/customview/LJNestScrollWebView;

    iget-object v1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment$m$h0;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/join/mgps/customview/LJNestScrollWebView;->w(Ljava/lang/String;)V

    :goto_0
    return-void
.end method
