.class Lcom/join/mgps/fragment/CommonWebviewFragment$m$u;
.super Ljava/lang/Object;
.source "CommonWebviewFragment.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/CommonWebviewFragment$m;->goMainLabel(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Ljava/lang/String;

.field final synthetic e:Lcom/join/mgps/fragment/CommonWebviewFragment$m;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/CommonWebviewFragment$m;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment$m$u;->e:Lcom/join/mgps/fragment/CommonWebviewFragment$m;

    iput-object p2, p0, Lcom/join/mgps/fragment/CommonWebviewFragment$m$u;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/join/mgps/fragment/CommonWebviewFragment$m$u;->c:Ljava/lang/String;

    iput-object p4, p0, Lcom/join/mgps/fragment/CommonWebviewFragment$m$u;->d:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment$m$u;->e:Lcom/join/mgps/fragment/CommonWebviewFragment$m;

    iget-object v0, v0, Lcom/join/mgps/fragment/CommonWebviewFragment$m;->a:Lcom/join/mgps/fragment/CommonWebviewFragment;

    iget-object v1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment$m$u;->b:Ljava/lang/String;

    iget-object v2, p0, Lcom/join/mgps/fragment/CommonWebviewFragment$m$u;->c:Ljava/lang/String;

    iget-object v3, p0, Lcom/join/mgps/fragment/CommonWebviewFragment$m$u;->d:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, v3}, Lcom/join/mgps/fragment/CommonWebviewFragment;->Q0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
