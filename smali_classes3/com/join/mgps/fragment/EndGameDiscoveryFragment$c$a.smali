.class Lcom/join/mgps/fragment/EndGameDiscoveryFragment$c$a;
.super Ljava/lang/Object;
.source "EndGameDiscoveryFragment.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/EndGameDiscoveryFragment$c;->b(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/dto/EndGameBean;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/base/BaseViewHolder;

.field final synthetic c:Lcom/join/mgps/dto/EndGameBean;

.field final synthetic d:Lcom/join/mgps/fragment/EndGameDiscoveryFragment$c;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/EndGameDiscoveryFragment$c;Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/dto/EndGameBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/EndGameDiscoveryFragment$c$a;->d:Lcom/join/mgps/fragment/EndGameDiscoveryFragment$c;

    iput-object p2, p0, Lcom/join/mgps/fragment/EndGameDiscoveryFragment$c$a;->b:Lcom/join/mgps/base/BaseViewHolder;

    iput-object p3, p0, Lcom/join/mgps/fragment/EndGameDiscoveryFragment$c$a;->c:Lcom/join/mgps/dto/EndGameBean;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/join/mgps/fragment/EndGameDiscoveryFragment$c$a;->d:Lcom/join/mgps/fragment/EndGameDiscoveryFragment$c;

    iget-object p1, p1, Lcom/join/mgps/fragment/EndGameDiscoveryFragment$c;->a:Lcom/join/mgps/fragment/EndGameDiscoveryFragment;

    invoke-static {p1}, Lcom/join/mgps/fragment/EndGameDiscoveryFragment;->W(Lcom/join/mgps/fragment/EndGameDiscoveryFragment;)Lcom/join/android/app/component/video/c;

    move-result-object p1

    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameDiscoveryFragment$c$a;->b:Lcom/join/mgps/base/BaseViewHolder;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getLayoutPosition()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/join/android/app/component/video/c;->F(I)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/fragment/EndGameDiscoveryFragment$c$a;->d:Lcom/join/mgps/fragment/EndGameDiscoveryFragment$c;

    iget-object p1, p1, Lcom/join/mgps/fragment/EndGameDiscoveryFragment$c;->a:Lcom/join/mgps/fragment/EndGameDiscoveryFragment;

    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameDiscoveryFragment$c$a;->c:Lcom/join/mgps/dto/EndGameBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/EndGameBean;->getEndgameId()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/join/mgps/fragment/EndGameDiscoveryFragment;->V(Lcom/join/mgps/fragment/EndGameDiscoveryFragment;Ljava/lang/String;)V

    return-void
.end method
