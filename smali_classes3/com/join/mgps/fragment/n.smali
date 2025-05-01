.class public final synthetic Lcom/join/mgps/fragment/n;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:Lcom/join/mgps/fragment/DiscoveryFragmentV4$f;

.field public final synthetic c:Lcom/join/mgps/dto/DiscoveryMainDataBean$ForumListBean;


# direct methods
.method public synthetic constructor <init>(Lcom/join/mgps/fragment/DiscoveryFragmentV4$f;Lcom/join/mgps/dto/DiscoveryMainDataBean$ForumListBean;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/join/mgps/fragment/n;->b:Lcom/join/mgps/fragment/DiscoveryFragmentV4$f;

    iput-object p2, p0, Lcom/join/mgps/fragment/n;->c:Lcom/join/mgps/dto/DiscoveryMainDataBean$ForumListBean;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lcom/join/mgps/fragment/n;->b:Lcom/join/mgps/fragment/DiscoveryFragmentV4$f;

    iget-object v1, p0, Lcom/join/mgps/fragment/n;->c:Lcom/join/mgps/dto/DiscoveryMainDataBean$ForumListBean;

    invoke-static {v0, v1, p1}, Lcom/join/mgps/fragment/DiscoveryFragmentV4$f;->a(Lcom/join/mgps/fragment/DiscoveryFragmentV4$f;Lcom/join/mgps/dto/DiscoveryMainDataBean$ForumListBean;Landroid/view/View;)V

    return-void
.end method
