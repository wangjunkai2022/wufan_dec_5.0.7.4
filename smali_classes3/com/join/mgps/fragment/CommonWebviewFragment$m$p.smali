.class Lcom/join/mgps/fragment/CommonWebviewFragment$m$p;
.super Ljava/lang/Object;
.source "CommonWebviewFragment.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/CommonWebviewFragment$m;->papaLiveCropImage()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/fragment/CommonWebviewFragment$m;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/CommonWebviewFragment$m;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment$m$p;->b:Lcom/join/mgps/fragment/CommonWebviewFragment$m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment$m$p;->b:Lcom/join/mgps/fragment/CommonWebviewFragment$m;

    iget-object v0, v0, Lcom/join/mgps/fragment/CommonWebviewFragment$m;->a:Lcom/join/mgps/fragment/CommonWebviewFragment;

    invoke-static {v0}, Lcom/join/mgps/fragment/CommonWebviewFragment;->X(Lcom/join/mgps/fragment/CommonWebviewFragment;)V

    return-void
.end method
