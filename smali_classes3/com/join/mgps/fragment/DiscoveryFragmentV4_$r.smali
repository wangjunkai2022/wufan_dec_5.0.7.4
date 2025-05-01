.class Lcom/join/mgps/fragment/DiscoveryFragmentV4_$r;
.super Ljava/lang/Object;
.source "DiscoveryFragmentV4_.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/DiscoveryFragmentV4_;->showMessage(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lcom/join/mgps/fragment/DiscoveryFragmentV4_;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/DiscoveryFragmentV4_;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV4_$r;->c:Lcom/join/mgps/fragment/DiscoveryFragmentV4_;

    iput-object p2, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV4_$r;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV4_$r;->c:Lcom/join/mgps/fragment/DiscoveryFragmentV4_;

    iget-object v1, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV4_$r;->b:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/join/mgps/fragment/DiscoveryFragmentV4_;->B0(Lcom/join/mgps/fragment/DiscoveryFragmentV4_;Ljava/lang/String;)V

    return-void
.end method
