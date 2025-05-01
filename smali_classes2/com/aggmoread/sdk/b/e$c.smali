.class Lcom/aggmoread/sdk/b/e$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/aggmoread/sdk/z/c/a/a/c/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aggmoread/sdk/b/e;->a(Lcom/aggmoread/sdk/client/AMRewardAdConfig;)Lcom/aggmoread/sdk/z/c/a/a/c/r/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/aggmoread/sdk/client/AMRewardAdConfig;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/b/e;Lcom/aggmoread/sdk/client/AMRewardAdConfig;)V
    .locals 0

    iput-object p2, p0, Lcom/aggmoread/sdk/b/e$c;->a:Lcom/aggmoread/sdk/client/AMRewardAdConfig;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onReward(Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/aggmoread/sdk/b/e$c;->a:Lcom/aggmoread/sdk/client/AMRewardAdConfig;

    invoke-virtual {v0}, Lcom/aggmoread/sdk/client/AMRewardAdConfig;->getRewardAdListener()Lcom/aggmoread/sdk/client/AMRewardAdConfig$RewardListener;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/aggmoread/sdk/b/e$c;->a:Lcom/aggmoread/sdk/client/AMRewardAdConfig;

    invoke-virtual {v0}, Lcom/aggmoread/sdk/client/AMRewardAdConfig;->getRewardAdListener()Lcom/aggmoread/sdk/client/AMRewardAdConfig$RewardListener;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/aggmoread/sdk/client/AMRewardAdConfig$RewardListener;->onReward(Ljava/util/Map;)V

    :cond_0
    return-void
.end method
