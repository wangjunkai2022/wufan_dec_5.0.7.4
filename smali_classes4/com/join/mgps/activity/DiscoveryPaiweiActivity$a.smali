.class Lcom/join/mgps/activity/DiscoveryPaiweiActivity$a;
.super Lcom/join/android/app/common/http/d$p;
.source "DiscoveryPaiweiActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/DiscoveryPaiweiActivity;->l0()V
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
.field final synthetic b:Lcom/join/mgps/activity/DiscoveryPaiweiActivity;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/DiscoveryPaiweiActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity$a;->b:Lcom/join/mgps/activity/DiscoveryPaiweiActivity;

    invoke-direct {p0}, Lcom/join/android/app/common/http/d$p;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Lokhttp3/Request;Ljava/lang/Exception;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Exception;->printStackTrace()V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity$a;->b:Lcom/join/mgps/activity/DiscoveryPaiweiActivity;

    invoke-virtual {p1}, Lcom/join/mgps/activity/DiscoveryPaiweiActivity;->showLodingFailed()V

    .line 3
    iget-object p1, p0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity$a;->b:Lcom/join/mgps/activity/DiscoveryPaiweiActivity;

    const/4 p2, 0x0

    invoke-static {p1, p2}, Lcom/join/mgps/activity/DiscoveryPaiweiActivity;->g0(Lcom/join/mgps/activity/DiscoveryPaiweiActivity;Z)Z

    return-void
.end method

.method public bridge synthetic e(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/DiscoveryPaiweiActivity$a;->f(Ljava/lang/String;)V

    return-void
.end method

.method public f(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity$a;->b:Lcom/join/mgps/activity/DiscoveryPaiweiActivity;

    invoke-virtual {v0, p1}, Lcom/join/mgps/activity/DiscoveryPaiweiActivity;->o0(Ljava/lang/String;)V

    return-void
.end method
