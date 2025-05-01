.class Lcom/join/mgps/fragment/CodesBoxFragment$c;
.super Ljava/lang/Object;
.source "CodesBoxFragment.java"

# interfaces
.implements Lcom/join/mgps/customview/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/CodesBoxFragment;->afterViews()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/fragment/CodesBoxFragment;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/CodesBoxFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/CodesBoxFragment$c;->b:Lcom/join/mgps/fragment/CodesBoxFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onRefresh()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/CodesBoxFragment$c;->b:Lcom/join/mgps/fragment/CodesBoxFragment;

    invoke-static {v0}, Lcom/join/mgps/fragment/CodesBoxFragment;->W(Lcom/join/mgps/fragment/CodesBoxFragment;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/fragment/CodesBoxFragment$c;->b:Lcom/join/mgps/fragment/CodesBoxFragment;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/join/mgps/fragment/CodesBoxFragment;->X(Lcom/join/mgps/fragment/CodesBoxFragment;I)I

    .line 3
    iget-object v0, p0, Lcom/join/mgps/fragment/CodesBoxFragment$c;->b:Lcom/join/mgps/fragment/CodesBoxFragment;

    invoke-virtual {v0}, Lcom/join/mgps/fragment/CodesBoxFragment;->c0()V

    return-void
.end method
