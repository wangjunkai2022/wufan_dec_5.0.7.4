.class Lcom/join/mgps/customview/widget/detail/PcGameInfoCardView$a;
.super Ljava/lang/Object;
.source "PcGameInfoCardView.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/customview/widget/detail/PcGameInfoCardView;->a(Lcom/join/mgps/dto/GamedetialModleFourBean;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/dto/ExtInfoBean;

.field final synthetic c:Lcom/join/mgps/customview/widget/detail/PcGameInfoCardView;


# direct methods
.method constructor <init>(Lcom/join/mgps/customview/widget/detail/PcGameInfoCardView;Lcom/join/mgps/dto/ExtInfoBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/customview/widget/detail/PcGameInfoCardView$a;->c:Lcom/join/mgps/customview/widget/detail/PcGameInfoCardView;

    iput-object p2, p0, Lcom/join/mgps/customview/widget/detail/PcGameInfoCardView$a;->b:Lcom/join/mgps/dto/ExtInfoBean;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/join/mgps/customview/widget/detail/PcGameInfoCardView$a;->c:Lcom/join/mgps/customview/widget/detail/PcGameInfoCardView;

    invoke-static {p1}, Lcom/join/mgps/customview/widget/detail/PcGameInfoCardView;->c(Lcom/join/mgps/customview/widget/detail/PcGameInfoCardView;)Lcom/facebook/drawee/view/SimpleDraweeView;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/customview/widget/detail/PcGameInfoCardView$a;->b:Lcom/join/mgps/dto/ExtInfoBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/ExtInfoBean;->getShare_info()Lcom/join/mgps/dto/ShareInfoBean;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/dto/ShareInfoBean;->getDescription()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/join/mgps/customview/widget/detail/PcGameInfoCardView;->g(Landroid/view/View;Ljava/lang/String;)V

    return-void
.end method
