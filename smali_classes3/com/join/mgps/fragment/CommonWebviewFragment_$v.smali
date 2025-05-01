.class Lcom/join/mgps/fragment/CommonWebviewFragment_$v;
.super Ljava/lang/Object;
.source "CommonWebviewFragment_.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/CommonWebviewFragment_;->showLoding()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/fragment/CommonWebviewFragment_;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/CommonWebviewFragment_;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment_$v;->b:Lcom/join/mgps/fragment/CommonWebviewFragment_;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment_$v;->b:Lcom/join/mgps/fragment/CommonWebviewFragment_;

    invoke-static {v0}, Lcom/join/mgps/fragment/CommonWebviewFragment_;->p1(Lcom/join/mgps/fragment/CommonWebviewFragment_;)V

    return-void
.end method
