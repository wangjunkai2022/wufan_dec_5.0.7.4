.class Lcom/join/mgps/fragment/DiscoveryFragmentV3_$c;
.super Ljava/lang/Object;
.source "DiscoveryFragmentV3_.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/DiscoveryFragmentV3_;->K0(Lcom/join/mgps/dto/EndGameNameBean;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/dto/EndGameNameBean;

.field final synthetic c:I

.field final synthetic d:Lcom/join/mgps/fragment/DiscoveryFragmentV3_;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/DiscoveryFragmentV3_;Lcom/join/mgps/dto/EndGameNameBean;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV3_$c;->d:Lcom/join/mgps/fragment/DiscoveryFragmentV3_;

    iput-object p2, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV3_$c;->b:Lcom/join/mgps/dto/EndGameNameBean;

    iput p3, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV3_$c;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV3_$c;->d:Lcom/join/mgps/fragment/DiscoveryFragmentV3_;

    iget-object v1, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV3_$c;->b:Lcom/join/mgps/dto/EndGameNameBean;

    iget v2, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV3_$c;->c:I

    invoke-static {v0, v1, v2}, Lcom/join/mgps/fragment/DiscoveryFragmentV3_;->b1(Lcom/join/mgps/fragment/DiscoveryFragmentV3_;Lcom/join/mgps/dto/EndGameNameBean;I)V

    return-void
.end method
