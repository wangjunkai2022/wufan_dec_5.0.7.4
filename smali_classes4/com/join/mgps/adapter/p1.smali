.class public final synthetic Lcom/join/mgps/adapter/p1;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:Lcom/join/mgps/adapter/GameRecommendAdapter1;


# direct methods
.method public synthetic constructor <init>(Lcom/join/mgps/adapter/GameRecommendAdapter1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/join/mgps/adapter/p1;->b:Lcom/join/mgps/adapter/GameRecommendAdapter1;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Lcom/join/mgps/adapter/p1;->b:Lcom/join/mgps/adapter/GameRecommendAdapter1;

    invoke-static {v0, p1}, Lcom/join/mgps/adapter/GameRecommendAdapter1;->l(Lcom/join/mgps/adapter/GameRecommendAdapter1;Landroid/view/View;)V

    return-void
.end method
