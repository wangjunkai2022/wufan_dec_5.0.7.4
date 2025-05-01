.class public final synthetic Lcom/join/mgps/fragment/m;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:Lcom/join/mgps/fragment/DiscoveryFragmentV4$e;

.field public final synthetic c:Lcom/join/mgps/dto/DiscoveryMainDataBean$BattleGameBean;


# direct methods
.method public synthetic constructor <init>(Lcom/join/mgps/fragment/DiscoveryFragmentV4$e;Lcom/join/mgps/dto/DiscoveryMainDataBean$BattleGameBean;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/join/mgps/fragment/m;->b:Lcom/join/mgps/fragment/DiscoveryFragmentV4$e;

    iput-object p2, p0, Lcom/join/mgps/fragment/m;->c:Lcom/join/mgps/dto/DiscoveryMainDataBean$BattleGameBean;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lcom/join/mgps/fragment/m;->b:Lcom/join/mgps/fragment/DiscoveryFragmentV4$e;

    iget-object v1, p0, Lcom/join/mgps/fragment/m;->c:Lcom/join/mgps/dto/DiscoveryMainDataBean$BattleGameBean;

    invoke-static {v0, v1, p1}, Lcom/join/mgps/fragment/DiscoveryFragmentV4$e;->a(Lcom/join/mgps/fragment/DiscoveryFragmentV4$e;Lcom/join/mgps/dto/DiscoveryMainDataBean$BattleGameBean;Landroid/view/View;)V

    return-void
.end method
