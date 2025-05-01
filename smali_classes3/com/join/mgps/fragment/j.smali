.class public final synthetic Lcom/join/mgps/fragment/j;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:Lcom/join/mgps/fragment/DiscoveryFragmentV3$h;

.field public final synthetic c:Lcom/join/mgps/dto/DiscoveryMainDataBean$BattleGameBean;


# direct methods
.method public synthetic constructor <init>(Lcom/join/mgps/fragment/DiscoveryFragmentV3$h;Lcom/join/mgps/dto/DiscoveryMainDataBean$BattleGameBean;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/join/mgps/fragment/j;->b:Lcom/join/mgps/fragment/DiscoveryFragmentV3$h;

    iput-object p2, p0, Lcom/join/mgps/fragment/j;->c:Lcom/join/mgps/dto/DiscoveryMainDataBean$BattleGameBean;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lcom/join/mgps/fragment/j;->b:Lcom/join/mgps/fragment/DiscoveryFragmentV3$h;

    iget-object v1, p0, Lcom/join/mgps/fragment/j;->c:Lcom/join/mgps/dto/DiscoveryMainDataBean$BattleGameBean;

    invoke-static {v0, v1, p1}, Lcom/join/mgps/fragment/DiscoveryFragmentV3$h;->a(Lcom/join/mgps/fragment/DiscoveryFragmentV3$h;Lcom/join/mgps/dto/DiscoveryMainDataBean$BattleGameBean;Landroid/view/View;)V

    return-void
.end method
