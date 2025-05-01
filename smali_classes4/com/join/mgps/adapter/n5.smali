.class public final synthetic Lcom/join/mgps/adapter/n5;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:Lcom/join/mgps/dto/RecommendAd;


# direct methods
.method public synthetic constructor <init>(Lcom/join/mgps/dto/RecommendAd;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/join/mgps/adapter/n5;->b:Lcom/join/mgps/dto/RecommendAd;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Lcom/join/mgps/adapter/n5;->b:Lcom/join/mgps/dto/RecommendAd;

    invoke-static {v0, p1}, Lcom/join/mgps/adapter/SimulatorAdsAdapter;->a(Lcom/join/mgps/dto/RecommendAd;Landroid/view/View;)V

    return-void
.end method
