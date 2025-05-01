.class public final synthetic Lcom/join/mgps/fragment/k1;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:Lcom/join/mgps/fragment/SimulatorRecommendFragment$a;

.field public final synthetic c:Lcom/join/mgps/dto/CommonGameInfoBean;

.field public final synthetic d:Lcom/join/mgps/base/BaseViewHolder;


# direct methods
.method public synthetic constructor <init>(Lcom/join/mgps/fragment/SimulatorRecommendFragment$a;Lcom/join/mgps/dto/CommonGameInfoBean;Lcom/join/mgps/base/BaseViewHolder;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/join/mgps/fragment/k1;->b:Lcom/join/mgps/fragment/SimulatorRecommendFragment$a;

    iput-object p2, p0, Lcom/join/mgps/fragment/k1;->c:Lcom/join/mgps/dto/CommonGameInfoBean;

    iput-object p3, p0, Lcom/join/mgps/fragment/k1;->d:Lcom/join/mgps/base/BaseViewHolder;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    iget-object v0, p0, Lcom/join/mgps/fragment/k1;->b:Lcom/join/mgps/fragment/SimulatorRecommendFragment$a;

    iget-object v1, p0, Lcom/join/mgps/fragment/k1;->c:Lcom/join/mgps/dto/CommonGameInfoBean;

    iget-object v2, p0, Lcom/join/mgps/fragment/k1;->d:Lcom/join/mgps/base/BaseViewHolder;

    invoke-static {v0, v1, v2, p1}, Lcom/join/mgps/fragment/SimulatorRecommendFragment$a;->a(Lcom/join/mgps/fragment/SimulatorRecommendFragment$a;Lcom/join/mgps/dto/CommonGameInfoBean;Lcom/join/mgps/base/BaseViewHolder;Landroid/view/View;)V

    return-void
.end method
