.class Lcom/join/mgps/fragment/LabelFragment$a;
.super Ljava/lang/Object;
.source "LabelFragment.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/LabelFragment;->E0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/fragment/LabelFragment;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/LabelFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/LabelFragment$a;->b:Lcom/join/mgps/fragment/LabelFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/LabelFragment$a;->b:Lcom/join/mgps/fragment/LabelFragment;

    iget-object v0, v0, Lcom/join/mgps/fragment/LabelFragment;->j:Lcom/join/mgps/customview/XListView2;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-virtual {v0}, Lcom/join/mgps/customview/XListView2;->v()V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/fragment/LabelFragment$a;->b:Lcom/join/mgps/fragment/LabelFragment;

    iget-object v0, v0, Lcom/join/mgps/fragment/LabelFragment;->j:Lcom/join/mgps/customview/XListView2;

    invoke-virtual {v0}, Lcom/join/mgps/customview/XListView2;->u()V

    .line 4
    iget-object v0, p0, Lcom/join/mgps/fragment/LabelFragment$a;->b:Lcom/join/mgps/fragment/LabelFragment;

    iget v1, v0, Lcom/join/mgps/fragment/LabelFragment;->p:I

    const/4 v2, -0x1

    if-ne v1, v2, :cond_1

    .line 5
    iget-object v0, v0, Lcom/join/mgps/fragment/LabelFragment;->j:Lcom/join/mgps/customview/XListView2;

    invoke-virtual {v0}, Lcom/join/mgps/customview/XListView2;->setNoMore()V

    .line 6
    iget-object v0, p0, Lcom/join/mgps/fragment/LabelFragment$a;->b:Lcom/join/mgps/fragment/LabelFragment;

    iget v1, v0, Lcom/join/mgps/fragment/LabelFragment;->o:I

    if-nez v1, :cond_1

    .line 7
    invoke-virtual {v0}, Lcom/join/mgps/fragment/LabelFragment;->B0()V

    :cond_1
    return-void
.end method
