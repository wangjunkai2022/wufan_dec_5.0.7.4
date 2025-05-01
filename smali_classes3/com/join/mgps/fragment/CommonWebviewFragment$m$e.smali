.class Lcom/join/mgps/fragment/CommonWebviewFragment$m$e;
.super Ljava/lang/Object;
.source "CommonWebviewFragment.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/CommonWebviewFragment$m;->shareToOneImageOrText(ILjava/lang/String;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:I

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:I

.field final synthetic e:Lcom/join/mgps/fragment/CommonWebviewFragment$m;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/CommonWebviewFragment$m;ILjava/lang/String;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment$m$e;->e:Lcom/join/mgps/fragment/CommonWebviewFragment$m;

    iput p2, p0, Lcom/join/mgps/fragment/CommonWebviewFragment$m$e;->b:I

    iput-object p3, p0, Lcom/join/mgps/fragment/CommonWebviewFragment$m$e;->c:Ljava/lang/String;

    iput p4, p0, Lcom/join/mgps/fragment/CommonWebviewFragment$m$e;->d:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment$m$e;->e:Lcom/join/mgps/fragment/CommonWebviewFragment$m;

    iget-object v0, v0, Lcom/join/mgps/fragment/CommonWebviewFragment$m;->a:Lcom/join/mgps/fragment/CommonWebviewFragment;

    invoke-static {v0}, Lcom/join/mgps/fragment/CommonWebviewFragment;->q0(Lcom/join/mgps/fragment/CommonWebviewFragment;)Landroid/content/Context;

    move-result-object v0

    iget v1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment$m$e;->b:I

    iget-object v2, p0, Lcom/join/mgps/fragment/CommonWebviewFragment$m$e;->c:Ljava/lang/String;

    iget v3, p0, Lcom/join/mgps/fragment/CommonWebviewFragment$m$e;->d:I

    const/4 v4, 0x5

    invoke-static {v0, v1, v2, v3, v4}, Lcom/join/mgps/Util/s;->q(Landroid/content/Context;ILjava/lang/String;II)V

    return-void
.end method
