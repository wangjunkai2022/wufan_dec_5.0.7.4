.class Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment$a;
.super Lcom/join/android/app/common/http/d$p;
.source "DiscoveryPaiweiDetailFragment.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->Z()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/join/android/app/common/http/d$p<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment$a;->b:Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;

    invoke-direct {p0}, Lcom/join/android/app/common/http/d$p;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Lokhttp3/Request;Ljava/lang/Exception;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Exception;->printStackTrace()V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment$a;->b:Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;

    invoke-virtual {p1}, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->showLodingFailed()V

    return-void
.end method

.method public bridge synthetic e(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment$a;->f(Ljava/lang/String;)V

    return-void
.end method

.method public f(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment$a;->b:Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;

    invoke-virtual {v0, p1}, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->b0(Ljava/lang/String;)V

    return-void
.end method
