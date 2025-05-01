.class Lcom/join/mgps/fragment/DiscoveryFragmentV3_$f;
.super Ljava/lang/Object;
.source "DiscoveryFragmentV3_.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/DiscoveryFragmentV3_;->I0(Lcom/join/mgps/dto/DiscoveryMainDataBean;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/dto/DiscoveryMainDataBean;

.field final synthetic c:Lcom/join/mgps/fragment/DiscoveryFragmentV3_;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/DiscoveryFragmentV3_;Lcom/join/mgps/dto/DiscoveryMainDataBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV3_$f;->c:Lcom/join/mgps/fragment/DiscoveryFragmentV3_;

    iput-object p2, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV3_$f;->b:Lcom/join/mgps/dto/DiscoveryMainDataBean;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV3_$f;->c:Lcom/join/mgps/fragment/DiscoveryFragmentV3_;

    iget-object v1, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV3_$f;->b:Lcom/join/mgps/dto/DiscoveryMainDataBean;

    invoke-static {v0, v1}, Lcom/join/mgps/fragment/DiscoveryFragmentV3_;->e1(Lcom/join/mgps/fragment/DiscoveryFragmentV3_;Lcom/join/mgps/dto/DiscoveryMainDataBean;)V

    return-void
.end method
