.class Lcom/join/mgps/fragment/LabelFragment$b;
.super Ljava/lang/Object;
.source "LabelFragment.java"

# interfaces
.implements Lcom/join/mgps/customview/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/LabelFragment;->u0()V
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
    iput-object p1, p0, Lcom/join/mgps/fragment/LabelFragment$b;->b:Lcom/join/mgps/fragment/LabelFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLoadMore()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/LabelFragment$b;->b:Lcom/join/mgps/fragment/LabelFragment;

    iget-object v0, v0, Lcom/join/mgps/fragment/LabelFragment;->l:Landroid/app/Activity;

    invoke-static {v0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/fragment/LabelFragment$b;->b:Lcom/join/mgps/fragment/LabelFragment;

    invoke-virtual {v0}, Lcom/join/mgps/fragment/LabelFragment;->E0()V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/fragment/LabelFragment$b;->b:Lcom/join/mgps/fragment/LabelFragment;

    invoke-virtual {v0}, Lcom/join/mgps/fragment/LabelFragment;->C0()V

    return-void

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/fragment/LabelFragment$b;->b:Lcom/join/mgps/fragment/LabelFragment;

    invoke-virtual {v0}, Lcom/join/mgps/fragment/LabelFragment;->d0()V

    return-void
.end method
