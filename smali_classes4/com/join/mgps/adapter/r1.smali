.class public final synthetic Lcom/join/mgps/adapter/r1;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:Lcom/join/mgps/adapter/GameRecommendAdapter1;

.field public final synthetic c:Lcom/join/mgps/dto/GameMainV4DataBean$MemberInfoBean;


# direct methods
.method public synthetic constructor <init>(Lcom/join/mgps/adapter/GameRecommendAdapter1;Lcom/join/mgps/dto/GameMainV4DataBean$MemberInfoBean;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/join/mgps/adapter/r1;->b:Lcom/join/mgps/adapter/GameRecommendAdapter1;

    iput-object p2, p0, Lcom/join/mgps/adapter/r1;->c:Lcom/join/mgps/dto/GameMainV4DataBean$MemberInfoBean;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lcom/join/mgps/adapter/r1;->b:Lcom/join/mgps/adapter/GameRecommendAdapter1;

    iget-object v1, p0, Lcom/join/mgps/adapter/r1;->c:Lcom/join/mgps/dto/GameMainV4DataBean$MemberInfoBean;

    invoke-static {v0, v1, p1}, Lcom/join/mgps/adapter/GameRecommendAdapter1;->i(Lcom/join/mgps/adapter/GameRecommendAdapter1;Lcom/join/mgps/dto/GameMainV4DataBean$MemberInfoBean;Landroid/view/View;)V

    return-void
.end method
